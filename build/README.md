---
title: Platform API Client SDK - Java
---

## Resources

[![platform-client-v2](https://maven-badges.herokuapp.com/maven-central/com.mypurecloud/platform-client-v2/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.mypurecloud/platform-client-v2)
[![Release Notes Badge](https://developer-content.genesys.cloud/images/sdk-release-notes.png)](https://github.com/MyPureCloud/platform-client-sdk-java/blob/master/releaseNotes.md)

* **Documentation** https://developer.genesys.cloud/devapps/sdk/docexplorer/purecloudjava/
* **Source** https://github.com/MyPureCloud/platform-client-sdk-java

## Install Using maven

Install the library from maven via the package [com.mypurecloud:platform-client-v2](https://mvnrepository.com/artifact/com.mypurecloud/platform-client-v2)

## Android Support

The SDK may be used in Android as of SDK version 5.0.1. This requires Java 8 support in Android Studio (2.4 Preview 6 or later). For more information, see the Android Developers Blog: [Java 8 Language Features Support Update](https://android-developers.googleblog.com/2017/04/java-8-language-features-support-update.html)

## Using the SDK

### Referencing the Package

Import the necessary packages:

```java
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.api.UsersApi;
import com.mypurecloud.sdk.v2.model.User;
import com.mypurecloud.sdk.v2.model.UserMe;
import com.mypurecloud.sdk.v2.model.UsersEntityListing;
import com.mypurecloud.sdk.v2.PureCloudRegionHosts;
```

### Authenticating

The Java SDK contains a helper method to execute a Client Credentials OAuth flow. This is appropriate for non-user Java applications, typically when there is no UI. Invoking `authorizeClientCredentials(String clientId, String clientSecret)` will execute the client credentials OAuth grant and store the access token within the ApiClient class. 

```java
String clientId = "a0bda580-cb41-4ff6-8f06-28ffb4227594";
String clientSecret = "e4meQ53cXGq53j6uffdULVjRl8It8M3FVsupKei0nSg";

//Set Region
PureCloudRegionHosts region = PureCloudRegionHosts.us_east_1;

ApiClient apiClient = ApiClient.Builder.standard().withBasePath(region).build();
ApiResponse<AuthResponse> authResponse = apiClient.authorizeClientCredentials(clientId, clientSecret);

// Don't actually do this, this logs your auth token to the console!
System.out.println(authResponse.getBody().toString());

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

// Create API instances and make authenticated API requests
UsersApi apiInstance = new UsersApi();
UserEntityListing response = apiInstance.getUsers(null, null, null, null, null, null, null);
```

For user applications, the consuming application must complete an implicit, auth token, or SAML2 Bearer OAuth flow to get an access token outside the scope of the SDK. Once an access token is obtained, it should be set on the SDK via constructing a new ApiClient instance (use `withAccessToken(String token)`). For more information about authenticating with OAuth, see the Developer Center article [Authorization](https://developer.genesys.cloud/authorization/platform-auth/). For more information about SAML2 Bearer Oauth flow view the example below 

#### Authentication with SAML2Bearer token

```java
String clientId = "a0bda580-cb41-4ff6-8f06-28ffb4227594";
String clientSecret = "e4meQ53cXGq53j6uffdULVjRl8It8M3FVsupKei0nSg";
String orgName = "YourOrg"; // Your org name 
String encodedSamlAssertion= ""; // Base64 encoded SAML assertion

//Set Region
PureCloudRegionHosts region = PureCloudRegionHosts.us_east_1;

ApiClient apiClient = ApiClient.Builder.standard().withBasePath(region).build();
ApiResponse<AuthResponse> authResponse = apiClient.authorizeSaml2Bearer(clientId,clientSecret,orgName,encodedSamlAssertion);
System.out.println("Authentication successful. Access token expires in " + authResponse.getBody().getExpires_in() + " seconds");

```

#### Authentication with Authorization Code

See example on how to authenticate with an authorization code below. For more information see the article on [Code Authorization](https://developer.genesys.cloud/authorization/platform-auth/use-authorization-code)

```java
String clientId = "a0bda580-cb41-4ff6-8f06-28ffb4227594";
String clientSecret = "e4meQ53cXGq53j6uffdULVjRl8It8M3FVsupKei0nSg";
String authorizationCode = "YourAuthorizationCode"; // Your authorization code 
String redirectUri= ""; // Your redirect URI

//Set Region
PureCloudRegionHosts region = PureCloudRegionHosts.us_east_1;

ApiClient apiClient = ApiClient.Builder.standard().withBasePath(region).build();
ApiResponse<AuthResponse> authResponse = apiClient.authorizeCodeAuthorization(clientId,clientSecret,authorizationCode,redirectUri);
System.out.println("Authentication successful. Access token expires in " + authResponse.getBody().getExpires_in() + " seconds");
```

By default the SDK will transparently request a new access token when it expires. If you wish to apply the refresh logic yourself, build the ApiClient with `withShouldRefreshAccessToken(false)` and store the refresh token. The `getExpires_in()` value of the `authResponse` can be used to preemptively request a new token. Use `refreshCodeAuthorization` to request a new token when necessary

```java
ApiClient apiClient = ApiClient.Builder.standard()
                        .withBasePath(region)
                        .withShouldRefreshAccessToken(false)
                        .build();
ApiResponse<AuthResponse> authResponse = apiClient.authorizeCodeAuthorization(clientId,clientSecret,authorizationCode,redirectUri);
String refreshToken = authResponse.getBody().getRefresh_token();
int expiresIn = authResponse.getBody().getExpires_in();
System.out.println("Authentication successful. Access token expires in " + expiresIn + " seconds");

// When token expires
authResponse = apiClient.refreshCodeAuthorization(clientId,clientSecret,refreshToken);
refreshToken = authResponse.getBody().getRefresh_token();
expiresIn = authResponse.getBody().getExpires_in();
```

### Building an ApiClient Instance

`ApiClient` implements a builder pattern to construct new instances:

```java
// Create ApiClient instance
//Set Region
PureCloudRegionHosts region = PureCloudRegionHosts.us_east_1;
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath(region)
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

// Create API instances and make authenticated API requests
UsersApi apiInstance = new UsersApi();
UserEntityListing response = apiInstance.getUsers(null, null, null, null, null, null);
```

#### Setting the access token

If not authorizing using the authorization method helpers, provide the access token to use for API requests:

```java
.withAccessToken("aisuefh89734hfkhsaldkh348jf")
```

#### Setting the environment

Provide the full base url if not using `https://api.mypurecloud.com`:

```java
.withBasePath("https://api.mypurecloud.ie")
```

#### Setting the HTTP connector

The SDK supports the following HTTP connectors:

* Apache (_default_, synchronous), use `ApacheHttpClientConnectorProvider`
* Ning (async), use `AsyncHttpClientConnectorProvider`
* OkHTTP (synchronous, recommended for Android), use `OkHttpClientConnectorProvider`

Specify the connector in the builder:

```java
.withProperty(ApiClientConnectorProperty.CONNECTOR_PROVIDER, new OkHttpClientConnectorProvider())
```

#### Setting the max retry time

By default, the Java SDK does not automatically retry any failed requests.
To enable automatic retries, provide a RetryConfiguration object with the maximum number of seconds to retry requests and the max number of retries when building the ApiClient instance.

Building a `RetryConfiguration` instance:  

```java
ApiClient.RetryConfiguration retryConfiguration = new ApiClient.RetryConfiguration();
retryConfiguration.setMaxRetryTimeSec(30);
retryConfiguration.setRetryMax(5);
```

Setting `RetryConfiguration` instance to `ApiClient`:

```java
        .withRetryConfiguration(retryConfiguration)
```
Set the `maxRetryTimeSec` to the number of seconds to process retries before returning an error.
Set the 'MaxRetryTimeSec' to the number of seconds to process retries before returning an error.
When the retry time is a positive integer, the SDK will follow the recommended backoff logic using the provided configuration.
The best practices are documented in the [Rate Limiting](https://developer.genesys.cloud/platform/api/rate-limits) Developer Center article.

### SDK Logging

SDK users can choose between SL4J or our logging implementation, which makes use of STDOUT and an optional log file.

#### SL4J

Logging can be provided through SL4J, which uses HTTP request and response interceptors for requests when using the Apache connector. SL4J also logs exceptions from the Apache connector and Notification handler.  
To use SL4J, include a relevant SL4J library in the dependencies and SL4J configuration file.  

To provide a custom request interceptor, provide an object implementing `org.apache.http.HttpRequestInterceptor` to the following APIClient builder method:

```java
        .withHttpRequestInterceptor(requestInterceptor)
```

Use the following method to provide a custom response interceptor implementing `org.apache.http.HttpResponseInterceptor`:

```java
        .withHttpResponseInterceptor(responseInterceptor)
```

#### Standard Logging Implementation

Logging of API requests and responses can be controlled programmatically by creating an instance of `ApiClient.LoggingConfiguration` and passing it to the `withLoggingConfiguration` builder method of the `APIClient`.

`LogLevel` values:

1. trace (HTTP Method, URL, Request Body, HTTP Status Code, Request Headers, Response Headers)
2. debug (HTTP Method, URL, Request Body, HTTP Status Code, Request Headers)
3. error (HTTP Method, URL, Request Body, Response Body, HTTP Status Code, Request Headers, Response Headers)
4. none - default

`LogFormat` values:

1. JSON
2. Text - default

By default, the request and response bodies are not logged because these can contain PII. Be mindful of this data if choosing to log it.  
To log to a file, provide a value to `setLogFilePath`. SDK users are responsible for the rotation of the log file.

Example logging configuration:

```java
ApiClient.LoggingConfiguration loggingConfiguration = new ApiClient.LoggingConfiguration();
loggingConfiguration.setLogLevel("trace");
loggingConfiguration.setLogFormat("json");
loggingConfiguration.setLogRequestBody(true);
loggingConfiguration.setLogResponseBody(true);
loggingConfiguration.setLogToConsole(true);
loggingConfiguration.setLogFilePath("/var/log/javasdk.log");

ApiClient apiClient = ApiClient.Builder.standard()
                        .withLoggingConfiguration(loggingConfiguration)
                        .build();
```

#### Configuration file

A number of configuration parameters can be applied using a configuration file. There are two sources for this file:

1. The SDK will look for `%HOMEDRIVE%%HOMEPATH%\.genesyscloudjava\config` on Windows, or `$HOME/.genesyscloudjava/config` on Unix.
2. Provide a valid file path to the ApiClient

Example setting the configuration file:

```java
        .withConfigFilePath("/path/to/config")
```

The SDK will take an event-driven approach to monitor for config file changes and will apply changes in near real-time, regardless of whether a config file was present at start-up. To disable this behavior, set `autoReloadConfig` to false like so:  

```java
        .withAutoReloadConfig(false)
```

INI and JSON formats are supported. See below for examples of configuration values in both formats:

INI:

```ini
[logging]
log_level = trace
log_format = text
log_to_console = false
log_file_path = /var/log/javasdk.log
log_response_body = false
log_request_body = false
[retry]
retry_wait_min = 3
retry_wait_max = 10
retry_max = 5
[reauthentication]
refresh_access_token = true
refresh_token_wait_max = 10
[general]
live_reload_config = true
host = https://api.mypurecloud.com
```

JSON:

```json
{
    "logging": {
        "log_level": "trace",
        "log_format": "text",
        "log_to_console": false,
        "log_file_path": "/var/log/javasdk.log",
        "log_response_body": false,
        "log_request_body": false
    },
    "retry": {
        "retry_wait_min": 3,
        "retry_wait_max": 10,
        "retry_max": 5
    },
    "reauthentication": {
        "refresh_access_token": true,
        "refresh_token_wait_max": 10
    },
    "general": {
        "live_reload_config": true,
        "host": "https://api.mypurecloud.com"
    }
}
```

#### Other ApiClient.Builder methods

* `withDefaultHeader(String header, String value)` Specifies additional headers to be sent with every request
* `withUserAgent(String userAgent)` Overrides the default user agent header
* `withObjectMapper(ObjectMapper objectMapper)` Overrides the default `ObjectMapper` used for deserialization
* `withDateFormat(DateFormat dateFormat)` Overrides the default `DateFormat`
* `withConnectionTimeout(int connectionTimeout)` Overrides the default connection timeout
* `withShouldThrowErrors(boolean shouldThrowErrors)` Set to `false` to suppress throwing of all errors
* `withProxy(Proxy proxy)` Sets a proxy to use for requests
* `withAuthenticatedProxy(Proxy proxy, String user, String pass)` Sets an authenticated proxy to use for requests
* `withRefreshTokenWaitTime(int refreshTokenWaitTime)` Overrides the default time a thread will wait for another thread to request a new access token. The default is 10 seconds

### Making Requests

There are two steps to making requests:

1. Instantiate one of the API classes in the com.mypurecloud.sdk.v2.api namespace
2. Invoke the methods on the API object

Example of getting the authenticated user's information:

#### Using a request builder

Request builders allow requests to be constructed by only providing values for the properties you want to set. This is useful for methods with long signatures when you only need to set some properties and will help future-proof your code if the method signature changes (i.e. new parameters added).

```java
UsersApi usersApi = new UsersApi();
GetUsersMeRequest request = GetUsersMeRequest.builder()
        .withExpand(Collections.singletonList("presence"))
        .build();
UserMe me = usersApi.getUsersMe(request);
System.out.println("Hello " + me.getName());
```

#### Using method parameters

This request is identical to the request above, but uses the method with explicit parameters instead of a builder. These methods construct the request builder behind the scenes.

```java
UsersApi usersApi = new UsersApi();
UserMe me = usersApi.getUsersMe(Collections.singletonList("presence"));
System.out.println("Hello " + me.getName());
```


#### Getting extended info

The Java SDK has the ability to return extended information about the response in addition to the response body. There are varieties of each API method call that are suffixed with _WithHttpInfo_. E.g. The `UsersApi` has a method `getUsersMe(...)` as well as `getUsersMeWithHttpInfo(...)`. Additionally, the request builder classes (e.g. `GetUsersMeRequest`) has a method `withHttpInfo()` that can be used to transform the request into an `ApiRequest` object that will return the extended information.

The extended responses will be of type [ApiResponse<T>](https://github.com/MyPureCloud/platform-client-sdk-java/blob/master/build/src/main/java/com/mypurecloud/sdk/v2/ApiResponse.java). This interface provides methods to get the exception (can be null), get the HTTP status code, get the reason phrase associated with the status code, get all headers, get a specific header, get the correlation ID header, and get the response body as a raw string or as a typed object.

Examples:

```java
// Using the WithHttpInfo method
ApiResponse<UserMe> meWithHttpInfo = usersApi.getUsersMeWithHttpInfo(new ArrayList<String>());
System.out.println(meWithHttpInfo.getHeaders());
System.out.println(meWithHttpInfo.getCorrelationId());
System.out.println(meWithHttpInfo.getBody().getName());
```

```java
// Using the request builder
ApiRequest<Void> getUsersMeRequestWithHttpInfo = GetUsersMeRequest.builder()
        .withExpand(new ArrayList<String>())
        .build()
        .withHttpInfo();

// Execute request
ApiResponse<UserMe> meWithHttpInfo = usersApi.getUsersMe(getUsersMeRequestWithHttpInfo);
System.out.println(meWithHttpInfo.getHeaders());
System.out.println(meWithHttpInfo.getCorrelationId());
System.out.println(meWithHttpInfo.getBody().getName());
```


## NotificationHandler Helper Class

The Java SDK includes a helper class, `NotificationHandler`, to assist in managing Genesys Cloud notifications. The class will create a single notification channel, or use an existing one, and provides methods to add and remove subscriptions and raises an event with a deserialized notification object whenever one is received.

### Using NotificationHandler

**Create a new instance**

The preferred way to create a `NotificationHandler` instance is to use its builder to construct a new instance. This comes with the advantage of being able to set listeners and add subscriptions before the websocket is opened.

```java
NotificationHandler notificationHandler = NotificationHandler.Builder.standard()
        .withWebSocketListener(new MyWebSocketListener())
        // Individually
        .withNotificationListener(new UserPresenceListener(me.getId()))
        .withNotificationListener(new ChannelMetadataListener())
        // As a list
        .withNotificationListeners(new ArrayList<NotificationListener<?>>() { {
            add(new UserPresenceListener(me.getId()));
            add(new ChannelMetadataListener());
        }})
        .withAutoConnect(false)
        .build();
```

Alternatively, the `NotificationHandler` instance can be constructed with the default constructor and will connect to the websocket automatically. Listeners and subscriptions can then be managed from the instance regardless of how it was constructed. The following example is equivalent to the builder except that the socket will be connected in the constructor and the listeners and subscriptions will be added after it is connected:

```java
NotificationHandler notificationHandler = new NotificationHandler();
notificationHandler.setWebSocketListener(new MyWebSocketListener());
// Individually
notificationHandler.addSubscription(new UserPresenceListener(me.getId()));
notificationHandler.addSubscription(new ChannelMetadataListener());
// As a list
notificationHandler.addSubscriptions(new ArrayList<NotificationListener<?>>() { {
            add(new UserPresenceListener(me.getId()));
            add(new ChannelMetadataListener());
        }});
```

**Send a ping**

To test the connection, you may send a ping. For more information about this ping, see [Use the notification service](https://developer.genesys.cloud/notificationsalerts/notifications/) under the _WebSocket Health Check_ heading.

```java
notificationHandler.sendPing();
```

**Handle incoming notification events**

To handle incoming events, implement the `NotificationListener<T>` interface to handle registered topics and the `WebSocketListener` interface for information about the websocket itself. This is a basic example of how to handle user presence events:

```java
public class UserPresenceListener implements NotificationListener<PresenceEventUserPresence> {
    private String topic;

    public String getTopic() {
        return topic;
    }

    public Class<PresenceEventUserPresence> getEventBodyClass() {
        return PresenceEventUserPresence.class;
    }

    @Override
    public void onEvent(NotificationEvent<?> event) {
        System.out.println("system presence -> " + ((PresenceEventUserPresence)event.getEventBody()).getPresenceDefinition().getSystemPresence());
    }

    public UserPresenceListener(String userId) {
        this.topic = "v2.users." + userId + ".presence";
    }
}
```

And an example of listening to the channel metadata events (periodic heartbeat and ping/pong message):

```java
public class ChannelMetadataListener implements NotificationListener<ChannelMetadataNotification> {
    public String getTopic() {
        return "channel.metadata";
    }

    public Class<?> getEventBodyClass() {
        return ChannelMetadataNotification.class;
    }

    public void onEvent(NotificationEvent<?> notificationEvent) {
        System.out.println("[channel.metadata] " + ((ChannelMetadataNotification)notificationEvent.getEventBody()).getMessage());
    }
}
```

## SDK Source Code Generation

The SDK is automatically regenerated and published from the API's definition after each API release. For more information on the build process, see the [platform-client-sdk-common](https://github.com/MyPureCloud/platform-client-sdk-common) project.


## Versioning

The SDK's version is incremented according to the [Semantic Versioning Specification](https://semver.org/). The decision to increment version numbers is determined by [diffing the Platform API's swagger](https://github.com/purecloudlabs/platform-client-sdk-common/blob/master/modules/swaggerDiff.js) for automated builds, and optionally forcing a version bump when a build is triggered manually (e.g. releasing a bugfix).


## Support

This package is intended to be forwards compatible with v2 of Genesys Cloud's Platform API. While the general policy for the API is not to introduce breaking changes, there are certain additions and changes to the API that cause breaking changes for the SDK, often due to the way the API is expressed in its swagger definition. Because of this, the SDK can have a major version bump while the API remains at major version 2. While the SDK is intended to be forward compatible, patches will only be released to the latest version. For these reasons, it is strongly recommended that all applications using this SDK are kept up to date and use the latest version of the SDK.

For any issues, questions, or suggestions for the SDK, visit the [Genesys Cloud Developer Forum](https://developer.genesys.cloud/forum/).
