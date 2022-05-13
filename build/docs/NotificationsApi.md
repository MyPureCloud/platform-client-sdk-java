---
title: NotificationsApi
---
## NotificationsApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteNotificationsChannelSubscriptions**](NotificationsApi.html#deleteNotificationsChannelSubscriptions) | Remove all subscriptions |
| [**getNotificationsAvailabletopics**](NotificationsApi.html#getNotificationsAvailabletopics) | Get available notification topics. |
| [**getNotificationsChannelSubscriptions**](NotificationsApi.html#getNotificationsChannelSubscriptions) | The list of all subscriptions for this channel |
| [**getNotificationsChannels**](NotificationsApi.html#getNotificationsChannels) | The list of existing channels |
| [**headNotificationsChannel**](NotificationsApi.html#headNotificationsChannel) | Verify a channel still exists and is valid |
| [**postNotificationsChannelSubscriptions**](NotificationsApi.html#postNotificationsChannelSubscriptions) | Add a list of subscriptions to the existing list of subscriptions |
| [**postNotificationsChannels**](NotificationsApi.html#postNotificationsChannels) | Create a new channel |
| [**putNotificationsChannelSubscriptions**](NotificationsApi.html#putNotificationsChannelSubscriptions) | Replace the current list of subscriptions with a new list. |
{: class="table-striped"}

<a name="deleteNotificationsChannelSubscriptions"></a>

# **deleteNotificationsChannelSubscriptions**



> Void deleteNotificationsChannelSubscriptions(channelId)

Remove all subscriptions

Wraps DELETE /api/v2/notifications/channels/{channelId}/subscriptions  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.NotificationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

NotificationsApi apiInstance = new NotificationsApi();
String channelId = "channelId_example"; // String | Channel ID
try {
    apiInstance.deleteNotificationsChannelSubscriptions(channelId);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationsApi#deleteNotificationsChannelSubscriptions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **channelId** | **String**| Channel ID | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="getNotificationsAvailabletopics"></a>

# **getNotificationsAvailabletopics**



> [AvailableTopicEntityListing](AvailableTopicEntityListing.html) getNotificationsAvailabletopics(expand, includePreview)

Get available notification topics.

Wraps GET /api/v2/notifications/availabletopics  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.NotificationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

NotificationsApi apiInstance = new NotificationsApi();
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand
Boolean includePreview = true; // Boolean | Whether or not to include Preview topics
try {
    AvailableTopicEntityListing result = apiInstance.getNotificationsAvailabletopics(expand, includePreview);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationsApi#getNotificationsAvailabletopics");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand | [optional]<br />**Values**: description, enforced, schema, visibility, transports, publicApiTemplateUriPaths, requiresPermissions, permissionDetails, topicParameters 
| **includePreview** | **Boolean**| Whether or not to include Preview topics | [optional] [default to true] 
{: class="table-striped"}


### Return type

[**AvailableTopicEntityListing**](AvailableTopicEntityListing.html)

<a name="getNotificationsChannelSubscriptions"></a>

# **getNotificationsChannelSubscriptions**



> [ChannelTopicEntityListing](ChannelTopicEntityListing.html) getNotificationsChannelSubscriptions(channelId)

The list of all subscriptions for this channel

Wraps GET /api/v2/notifications/channels/{channelId}/subscriptions  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.NotificationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

NotificationsApi apiInstance = new NotificationsApi();
String channelId = "channelId_example"; // String | Channel ID
try {
    ChannelTopicEntityListing result = apiInstance.getNotificationsChannelSubscriptions(channelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationsApi#getNotificationsChannelSubscriptions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **channelId** | **String**| Channel ID | 
{: class="table-striped"}


### Return type

[**ChannelTopicEntityListing**](ChannelTopicEntityListing.html)

<a name="getNotificationsChannels"></a>

# **getNotificationsChannels**



> [ChannelEntityListing](ChannelEntityListing.html) getNotificationsChannels(includechannels)

The list of existing channels

Wraps GET /api/v2/notifications/channels  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.NotificationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

NotificationsApi apiInstance = new NotificationsApi();
String includechannels = "token"; // String | Show user's channels for this specific token or across all tokens for this user and app.  Channel Ids for other access tokens will not be shown, but will be presented to show their existence.
try {
    ChannelEntityListing result = apiInstance.getNotificationsChannels(includechannels);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationsApi#getNotificationsChannels");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **includechannels** | **String**| Show user&#39;s channels for this specific token or across all tokens for this user and app.  Channel Ids for other access tokens will not be shown, but will be presented to show their existence. | [optional] [default to token]<br />**Values**: token, oauthclient 
{: class="table-striped"}


### Return type

[**ChannelEntityListing**](ChannelEntityListing.html)

<a name="headNotificationsChannel"></a>

# **headNotificationsChannel**



> Void headNotificationsChannel(channelId)

Verify a channel still exists and is valid

Returns a 200 OK if channel exists, and a 404 Not Found if it doesn't

Wraps HEAD /api/v2/notifications/channels/{channelId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.NotificationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

NotificationsApi apiInstance = new NotificationsApi();
String channelId = "channelId_example"; // String | Channel ID
try {
    apiInstance.headNotificationsChannel(channelId);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationsApi#headNotificationsChannel");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **channelId** | **String**| Channel ID | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="postNotificationsChannelSubscriptions"></a>

# **postNotificationsChannelSubscriptions**



> [ChannelTopicEntityListing](ChannelTopicEntityListing.html) postNotificationsChannelSubscriptions(channelId, body)

Add a list of subscriptions to the existing list of subscriptions

Wraps POST /api/v2/notifications/channels/{channelId}/subscriptions  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.NotificationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

NotificationsApi apiInstance = new NotificationsApi();
String channelId = "channelId_example"; // String | Channel ID
List<ChannelTopic> body = Arrays.asList(new ChannelTopic()); // List<ChannelTopic> | Body
try {
    ChannelTopicEntityListing result = apiInstance.postNotificationsChannelSubscriptions(channelId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationsApi#postNotificationsChannelSubscriptions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **channelId** | **String**| Channel ID | 
| **body** | [**List&lt;ChannelTopic&gt;**](ChannelTopic.html)| Body | 
{: class="table-striped"}


### Return type

[**ChannelTopicEntityListing**](ChannelTopicEntityListing.html)

<a name="postNotificationsChannels"></a>

# **postNotificationsChannels**



> [Channel](Channel.html) postNotificationsChannels()

Create a new channel

There is a limit of 20 channels per user/app combination. Creating a 21st channel will remove the channel with oldest last used date. Channels without an active connection will be removed first.

Wraps POST /api/v2/notifications/channels  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.NotificationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

NotificationsApi apiInstance = new NotificationsApi();
try {
    Channel result = apiInstance.postNotificationsChannels();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationsApi#postNotificationsChannels");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**Channel**](Channel.html)

<a name="putNotificationsChannelSubscriptions"></a>

# **putNotificationsChannelSubscriptions**



> [ChannelTopicEntityListing](ChannelTopicEntityListing.html) putNotificationsChannelSubscriptions(channelId, body)

Replace the current list of subscriptions with a new list.

Wraps PUT /api/v2/notifications/channels/{channelId}/subscriptions  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.NotificationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

NotificationsApi apiInstance = new NotificationsApi();
String channelId = "channelId_example"; // String | Channel ID
List<ChannelTopic> body = Arrays.asList(new ChannelTopic()); // List<ChannelTopic> | Body
try {
    ChannelTopicEntityListing result = apiInstance.putNotificationsChannelSubscriptions(channelId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationsApi#putNotificationsChannelSubscriptions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **channelId** | **String**| Channel ID | 
| **body** | [**List&lt;ChannelTopic&gt;**](ChannelTopic.html)| Body | 
{: class="table-striped"}


### Return type

[**ChannelTopicEntityListing**](ChannelTopicEntityListing.html)

