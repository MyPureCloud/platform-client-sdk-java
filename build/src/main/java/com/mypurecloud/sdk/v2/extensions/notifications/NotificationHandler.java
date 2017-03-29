package com.mypurecloud.sdk.v2.extensions.notifications;


import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.api.NotificationsApi;
import com.mypurecloud.sdk.v2.model.Channel;
import com.mypurecloud.sdk.v2.model.ChannelTopic;
import com.mypurecloud.sdk.v2.model.ChannelTopicEntityListing;
import com.neovisionaries.ws.client.*;

import java.io.IOException;
import java.util.*;

public class NotificationHandler extends Object {
    private NotificationsApi notificationsApi = new NotificationsApi();
    private WebSocket webSocket;
    private Channel channel;
    private Map<String, NotificationListener<?>> typeMap = new HashMap<>();
    private WebSocketListener webSocketListener = null;

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
        // Set channel
        if (builder.channel == null) {
            this.channel = notificationsApi.postNotificationsChannels();
        } else {
            this.channel = builder.channel;
        }

        // Set notification listeners
        for (NotificationListener<?> listener : builder.notificationListeners) {
            this.addSubscription(listener);
        }

        // Set web socket listener
        this.setWebSocketListener(builder.webSocketListener);

        // Initialize web socket
        this.webSocket = new WebSocketFactory()
                .createSocket(this.channel.getConnectUri())
                .addListener(new WebSocketAdapter() {
                    ObjectMapper objectMapper = new ObjectMapper();

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
                            // Deserialize without knowing body type to figure out topic name
                            JavaType genericEventType = objectMapper.getTypeFactory().constructParametricType(NotificationEvent.class, Object.class);
                            NotificationEvent<Object> genericEventData = objectMapper.readValue(message, genericEventType);

                            // Look up Listener based on topic name
                            NotificationListener<?> specificType = typeMap.getOrDefault(genericEventData.getTopicName(), null);

                            if (specificType != null) {
                                // Deserialize to specific type provided by listener
                                JavaType specificEventType = objectMapper.getTypeFactory().constructParametricType(NotificationEvent.class, specificType.getEventBodyClass());
                                specificType.onEvent(objectMapper.readValue(message, specificEventType));
                            } else {
                                // Unhandled topic
                                if (webSocketListener != null)
                                    webSocketListener.onUnhandledEvent(message);
                            }
                        } catch (Exception ex) {
                            ex.printStackTrace();
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

        public static Builder standard() {
            Builder builder = new Builder();
            builder.notificationListeners = new ArrayList<>();
            builder.webSocketListener = null;
            builder.channel = null;
            builder.connectAsync = null;
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

        public NotificationHandler build() throws IOException, ApiException, WebSocketException {
            return new NotificationHandler(this);
        }
    }



    public void sendPing() {
        this.webSocket.sendText("{\"message\":\"ping\"}");
    }

    public void setWebSocketListener(WebSocketListener webSocketListener) {
        this.webSocketListener = webSocketListener;
    }

    public <T> void addSubscription(NotificationListener<T> listener) throws ApiException {
        // This condition exists because channels are automatically subscribed to channel.metadata when created
        if (!"channel.metadata".equals(listener.getTopic())) {
            ChannelTopic channelTopic = new ChannelTopic();
            channelTopic.setId(listener.getTopic());
            notificationsApi.postNotificationsChannelSubscriptions(this.channel.getId(), Collections.singletonList(channelTopic));
        }

        // Add listener to map and key by topic
        typeMap.put(listener.getTopic(), listener);
    }

    public void RemoveSubscription(String topic) throws ApiException {
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

    public void RemoveAllSubscriptions() throws ApiException {
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
            System.out.println(ex);
        }
        super.finalize();
    }
}
