---
title: Platform API Client SDK - Java
---

Documentation can be found at [https://developer.mypurecloud.com/api/rest/client-libraries/java/](https://developer.mypurecloud.com/api/rest/client-libraries/java/)

[![platform-client-v2](https://maven-badges.herokuapp.com/maven-central/com.mypurecloud/platform-client-v2/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.mypurecloud/platform-client-v2)

## Install Using maven

Install the library from maven via the package [com.mypurecloud:platform-client-v2](https://mvnrepository.com/artifact/com.mypurecloud/platform-client-v2)

## Android Support

The SDK may be used in Android as of SDK version 5.0.1. This requires Java 8 support in Android Studio (2.4 Preview 6 or later). For more information, see the Android Developers Blog: [Java 8 Language Features Support Update]](https://android-developers.googleblog.com/2017/04/java-8-language-features-support-update.html)

## Using the SDK

### Referencing the Package

Import the necessary packages:

~~~java
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.api.UsersApi;
import com.mypurecloud.sdk.v2.model.User;
import com.mypurecloud.sdk.v2.model.UserMe;
import com.mypurecloud.sdk.v2.model.UsersEntityListing;
~~~

### Authenticating

The Java SDK does not currently contain helper methods to complete an OAuth flow. The consuming applicaiton must complete an OAuth flow to get an access token outside the scope of the SDK. Once an access token is obtained, it should be set on the SDK via constructing a new ApiClient instance. For more information about authenticating with OAuth, see the Developer Center article [Authorization](https://developer.mypurecloud.com/api/rest/authorization/index.html).

### Building an ApiClient Instance

`ApiClient` implements a builder pattern to construct new instances:

~~~java
// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.ie")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);
~~~

#### Setting the access token

Provide the access token to use for API requests:

~~~java
.withAccessToken("aisuefh89734hfkhsaldkh348jf")
~~~

#### Setting the environment

Provide the full base url if not using `https://api.mypurecloud.com`:

~~~java
.withBasePath("https://api.mypurecloud.ie")
~~~

#### Setting the HTTP connector

The SDK supports the following HTTP connectors:

* Apache (_default_, synchronous), use `ApacheHttpClientConnectorProvider`
* Ning (async), use `AsyncHttpClientConnectorProvider`
* OkHTTP (synchronous, recommended for Android), use `OkHttpClientConnectorProvider`

Specify the connector in the builder:

~~~java
.withProperty(ApiClientConnectorProperty.CONNECTOR_PROVIDER, new OkHttpClientConnectorProvider())
~~~

#### Other ApiClient.Builder methods

* `withDefaultHeader(String header, String value)` Specifies additional headers to be sent with every request
* `withUserAgent(String userAgent)` Overrides the default user agent header
* `withObjectMapper(ObjectMapper objectMapper)` Overrides the default `ObjectMapper` used for deserialization
* `withDateFormat(DateFormat dateFormat)` Overrides the default `DateFormat`
* `withConnectionTimeout(int connectionTimeout)` Overrides the default connection timeout
* `withShouldThrowErrors(boolean shouldThrowErrors)` Set to `false` to suppress throwing of all errors
* `withProxy(Proxy proxy)` Sets a proxy to use for requests

### Making Requests

There are two steps to making requests:

1. Instantiate one of the API classes in the com.mypurecloud.sdk.v2.api namespace
2. Invoke the methods on the API object

Example of getting the authenticated user's information:

#### Using a request builder

Request builders allow requests to be constructed by only providing values for the properties you want to set. This is useful for methods with long signatures when you only need to set some properties and will help future-proof your code if the method signature changes (i.e. new parameters added).

~~~java
UsersApi usersApi = new UsersApi();
GetUsersMeRequest request = GetUsersMeRequest.builder()
        .withExpand(Collections.singletonList("presence"))
        .build();
UserMe me = usersApi.getUsersMe(request);
System.out.println("Hello " + me.getName());
~~~

#### Using method parameters

This request is identical to the request above, but uses the method with explicit parameters instead of a builder. These methods construct the request builder behind the scenes.

~~~java
UsersApi usersApi = new UsersApi();
UserMe me = usersApi.getUsersMe(Collections.singletonList("presence"));
System.out.println("Hello " + me.getName());
~~~

## NotificationHandler Helper Class

The Java SDK includes a helper class, `NotificationHandler`, to assist in managing PureCloud notifications. The class will create a single notification channel, or use an existing one, and provides methods to add and remove subscriptions and raises an event with a deserialized notification object whenever one is received.

### Using NotificationHandler

**Create a new instance**

The preferred way to create a `NotificationHandler` instance is to use its builder to construct a new instance. This comes with the advantage of being able to set listeners and add subscriptions before the websocket is opened.

~~~java
NotificationHandler notificationHandler = NotificationHandler.Builder.standard()
        .withWebSocketListener(new MyWebSocketListener())
        .withNotificationListener(new UserPresenceListener(me.getId()))
        .withNotificationListener(new ChannelMetadataListener())
        .withAutoConnect(false)
        .build();
~~~

Alternatively, the `NotificationHandler` instance can be constructed with the default constructor and will connect to the websocket automatically. Listeners and subscriptions can then be managed from the instance regardless of how it was constructed. The following example is equivalent to the builder except that the socket will be connected in the constructor and the listeners and subscriptions will be added after it is connected:

~~~java
NotificationHandler notificationHandler = new NotificationHandler();
notificationHandler.setWebSocketListener(new MyWebSocketListener());
notificationHandler.addSubscription(new PresenceListener(me.getId()));
notificationHandler.addSubscription(new ChannelMetadataListener());
~~~

**Send a ping**

To test the connection, you may send a ping. For more information about this ping, see [Use the notification service](https://developer.mypurecloud.com/api/rest/v2/notifications/notification_service.html) under the _WebSocket Health Check_ heading.

~~~java
notificationHandler.sendPing();
~~~

**Handle incoming notification events**

To handle incoming events, implement the `NotificationListener<T>` interface to handle registered topics and the `WebSocketListener` interface for information about the websocket itself. This is a basic example of how to handle user presence events:

~~~java
public class UserPresenceListener implements NotificationListener<UserPresenceNotification> {
    private String topic;

    public String getTopic() {
        return topic;
    }

    public Class<UserPresenceNotification> getEventBodyClass() {
        return UserPresenceNotification.class;
    }

    public void onEvent(NotificationEvent<UserPresenceNotification> event) {
        System.out.println("system presence -> " + event.getEventBody().getPresenceDefinition().getSystemPresence());
    }

    public UserPresenceListener(String userId) {
        this.topic = "v2.users." + userId + ".presence";
    }
}
~~~

And an example of listening to the channel metadata events (periodic heartbeat and ping/pong message):

~~~java
public class ChannelMetadataListener implements NotificationListener<ChannelMetadataNotification> {
    public String getTopic() {
        return "channel.metadata";
    }

    public Class<?> getEventBodyClass() {
        return ChannelMetadataNotification.class;
    }

    public void onEvent(NotificationEvent<ChannelMetadataNotification> notificationEvent) {
        System.out.println("[channel.metadata] " + notificationEvent.getEventBody().getMessage());
    }
}
~~~

## SDK Source Code Generation

The SDK is automatically regenerated and published from the API's definition after each API release. For more information on the build process, see the [platform-client-sdk-common](https://github.com/MyPureCloud/platform-client-sdk-common) project.
