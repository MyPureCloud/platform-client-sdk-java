package com.mypurecloud.sdk.v2.extensions.notifications;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.api.NotificationsApi;
import com.mypurecloud.sdk.v2.model.Channel;
import com.mypurecloud.sdk.v2.model.ChannelTopic;
import com.mypurecloud.sdk.v2.model.ChannelTopicEntityListing;
import com.mypurecloud.sdk.v2.model.SystemMessageSystemMessage;
import com.mypurecloud.sdk.v2.api.request.PostNotificationsChannelsRequest;
import com.neovisionaries.ws.client.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.*;

public class NotificationHandler extends Object {
    private static final Logger LOGGER = LoggerFactory.getLogger(NotificationHandler.class);

    private NotificationsApi notificationsApi = new NotificationsApi();
    private WebSocket webSocket;
    private Channel channel;
    private Map<String, NotificationListener<?>> typeMap = new HashMap<>();
    private WebSocketListener webSocketListener = null;
    private ObjectMapper objectMapper = null;

    public WebSocket getWebSocket() {
        return webSocket;
    }

    public Channel getChannel() {
        return channel;
    }



    public NotificationHandler() throws IOException, ApiException, WebSocketException {
        this(Builder.standard());
    }

    private NotificationHandler(Builder builder) throws IOException, ApiException, WebSocketException {
        // Construct notifications API
        if (builder.notificationsApi != null) {
            this.notificationsApi = builder.notificationsApi;
        } else if (builder.apiClient != null) {
            this.notificationsApi = new NotificationsApi(builder.apiClient);
        } else {
            this.notificationsApi = new NotificationsApi();
        }

        // Set object mapper
        if (builder.objectMapper != null) {
            this.objectMapper = builder.objectMapper;
        } else if (builder.apiClient != null) {
            this.objectMapper = builder.apiClient.getObjectMapper();
        } else {
            this.objectMapper = Configuration.getDefaultApiClient().getObjectMapper();
        }

        // Set channel
        if (builder.channel == null) {
            this.channel = notificationsApi.postNotificationsChannels(PostNotificationsChannelsRequest.builder().build());
        } else {
            this.channel = builder.channel;
        }

        // Set notification listeners
        this.addSubscriptions(builder.notificationListeners);

        // Add handler for socket closing event
        this.addHandlerNoSubscribe(new SocketClosingHandler());

        // Set web socket listener
        this.setWebSocketListener(builder.webSocketListener);

        // Initialize web socket
        WebSocketFactory factory = new WebSocketFactory();

        if (builder.proxyHost != null)
            factory.getProxySettings().setServer(builder.proxyHost);

        this.webSocket = factory
                .createSocket(this.channel.getConnectUri())
                .addListener(new WebSocketAdapter() {
                    @Override
                    public void onStateChanged(WebSocket websocket, WebSocketState newState) throws Exception {
                        if (webSocketListener != null)
                            webSocketListener.onStateChanged(newState);
                    }

                    @Override
                    public void onConnected(WebSocket websocket, Map<String, List<String>> headers) throws Exception {
                        if (webSocketListener != null)
                            webSocketListener.onConnected();
                    }

                    @Override
                    public void onConnectError(WebSocket websocket, WebSocketException exception) throws Exception {
                        if (webSocketListener != null)
                            webSocketListener.onConnectError(exception);
                    }

                    @Override
                    public void onDisconnected(WebSocket websocket, WebSocketFrame serverCloseFrame, WebSocketFrame clientCloseFrame, boolean closedByServer) throws Exception {
                        if (webSocketListener != null)
                            webSocketListener.onDisconnected(closedByServer);
                    }

                    @Override
                    public void onTextMessage(WebSocket websocket, String message) {
                        try {
                            if (LOGGER.isDebugEnabled()) {
                                LOGGER.debug("---WEBSOCKET MESSAGE---\n"+message);
                            }
                            // Deserialize without knowing body type to figure out topic name
                            JavaType genericEventType = objectMapper.getTypeFactory().constructParametricType(NotificationEvent.class, Object.class);
                            NotificationEvent<Object> genericEventData = objectMapper.readValue(message, genericEventType);

                            // Look up Listener based on topic name
                            NotificationListener<?> specificType = typeMap.get(genericEventData.getTopicName());

                            if (specificType != null) {
                                // Deserialize to specific type provided by listener
                                JavaType specificEventType = objectMapper.getTypeFactory().constructParametricType(NotificationEvent.class, specificType.getEventBodyClass());
                                NotificationEvent<?> notificationEvent = (NotificationEvent<?>) objectMapper.readValue(message, specificEventType);

                                // Set raw body
                                notificationEvent.setEventBodyRaw(message);

                                // Raise event
                                specificType.onEvent(notificationEvent);
                            } else {
                                // Unhandled topic
                                if (webSocketListener != null)
                                    webSocketListener.onUnhandledEvent(message);
                            }
                        } catch (Exception ex) {
                            LOGGER.error(ex.getMessage(), ex);
                        }
                    }

                    @Override
                    public void onError(WebSocket websocket, WebSocketException cause) throws Exception {
                        if (webSocketListener != null)
                            webSocketListener.onError(cause);
                    }

                    @Override
                    public void handleCallbackError(WebSocket websocket, Throwable cause) throws Exception {
                        if (webSocketListener != null)
                            webSocketListener.onCallbackError(cause);
                    }
                });

        if (builder.connectAsync != null)
            this.connect(builder.connectAsync);
    }

    public static class Builder {
        private List<NotificationListener<?>> notificationListeners;
        private WebSocketListener webSocketListener;
        private Channel channel;
        private Boolean connectAsync;
        private ApiClient apiClient;
        private NotificationsApi notificationsApi;
        private ObjectMapper objectMapper;
        private String proxyHost;

        public static Builder standard() {
            Builder builder = new Builder();
            builder.notificationListeners = new ArrayList<>();
            builder.webSocketListener = null;
            builder.channel = null;
            builder.connectAsync = null;
            builder.apiClient = null;
            builder.notificationsApi = null;
            builder.objectMapper = null;
            builder.proxyHost = null;
            return builder;
        }

        public Builder withNotificationListener(NotificationListener<?> notificationListener) {
            this.notificationListeners.add(notificationListener);
            return this;
        }

        public Builder withNotificationListeners(List<NotificationListener<?>> notificationListeners) {
            this.notificationListeners.addAll(notificationListeners);
            return this;
        }

        public Builder withWebSocketListener(WebSocketListener webSocketListener) {
            this.webSocketListener = webSocketListener;
            return this;
        }

        public Builder withChannel(Channel channel) {
            this.channel = channel;
            return this;
        }

        public Builder withAutoConnect(Boolean connectAsync) {
            this.connectAsync = connectAsync;
            return this;
        }

        public Builder withApiClient(ApiClient apiClient) {
            this.apiClient = apiClient;
            return this;
        }

        public Builder withNotificationsApi(NotificationsApi notificationsApi) {
            this.notificationsApi = notificationsApi;
            return this;
        }

        public Builder withObjectMapper(ObjectMapper objectMapper) {
            this.objectMapper = objectMapper;
            return this;
        }

        public Builder withProxyHost(String proxyHost) {
            this.proxyHost = proxyHost;
            return this;
        }

        public NotificationHandler build() throws IOException, ApiException, WebSocketException {
            return new NotificationHandler(this);
        }
    }

    private class SocketClosingHandler implements NotificationListener<SystemMessageSystemMessage> {
        private String topic = "v2.system.socket_closing";

        @Override
        public String getTopic() {
            return topic;
        }

        @Override
        public Class<?> getEventBodyClass() {
            return SystemMessageSystemMessage.class;
        }

        @Override
        public void onEvent(NotificationEvent<?> event) {
            try {
                webSocket = webSocket.recreate();
            } catch (Exception ex) {
                LOGGER.error(ex.getMessage(), ex);
            }
        }
    }

    public void sendPing() {
        this.webSocket.sendText("{\"message\":\"ping\"}");
    }

    public void setWebSocketListener(WebSocketListener webSocketListener) {
        this.webSocketListener = webSocketListener;
    }

    public <T> void addSubscription(NotificationListener<T> listener) throws IOException, ApiException {
        addSubscriptions(Collections.<NotificationListener<?>>singletonList(listener));
    }

    public void addSubscriptions(List<NotificationListener<?>> listeners) throws IOException, ApiException {
        List<ChannelTopic> topics = new LinkedList<ChannelTopic>();

        for (NotificationListener<?> listener : listeners) {
            typeMap.put(listener.getTopic(), listener);

            if (!"channel.metadata".equals(listener.getTopic()) && !listener.getTopic().startsWith("v2.system")) {
                ChannelTopic channelTopic = new ChannelTopic();
                channelTopic.setId(listener.getTopic());
                topics.add(channelTopic);
            }
        }

        notificationsApi.postNotificationsChannelSubscriptions(this.channel.getId(), topics);
    }

    public <T> void addHandlerNoSubscribe(NotificationListener<T> listener) {
        addHandlersNoSubscribe(Collections.<NotificationListener<?>>singletonList(listener));
    }

    public void addHandlersNoSubscribe(List<NotificationListener<?>> listeners) {
        for (NotificationListener<?> listener : listeners) {
            typeMap.put(listener.getTopic(), listener);
        }
    }

    public void RemoveSubscription(String topic) throws IOException, ApiException {
        ChannelTopicEntityListing channels = notificationsApi.getNotificationsChannelSubscriptions(this.channel.getId());
        ChannelTopic match = null;
        for (ChannelTopic channelTopic : channels.getEntities()) {
            if (channelTopic.getId().equalsIgnoreCase(topic)) {
                match = channelTopic;
                break;
            }
        }
        if (match == null) return;
        channels.getEntities().remove(match);
        notificationsApi.putNotificationsChannelSubscriptions(this.channel.getId(), channels.getEntities());
        typeMap.remove(topic);
    }

    public void RemoveAllSubscriptions() throws IOException, ApiException {
        notificationsApi.deleteNotificationsChannelSubscriptions(this.channel.getId());
        typeMap.clear();
    }

    public void connect(boolean async) throws WebSocketException {
        if (async)
            this.webSocket.connectAsynchronously();
        else
            this.webSocket.connect();
    }

    public void disconnect() {
        if (this.webSocket != null && this.webSocket.isOpen())
            this.webSocket.disconnect();
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            // Ensure socket is closed on GC
            this.disconnect();
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage(), ex);
        }
        super.finalize();
    }
}
