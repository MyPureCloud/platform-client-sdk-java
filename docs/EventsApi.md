# EventsApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**postEventsConversations**](EventsApi#postEventsConversations) | Publish Conversation Batch Events |
| [**postEventsUsersPresence**](EventsApi#postEventsUsersPresence) | Publish User Presence Status Batch Events |
| [**postEventsUsersRoutingstatus**](EventsApi#postEventsUsersRoutingstatus) | Publish Agent Routing Status Batch Events |
{: class="table-striped"}


# **postEventsConversations**


> [BatchEventResponse](BatchEventResponse) postEventsConversations(body)

Publish Conversation Batch Events

Wraps POST /api/v2/events/conversations  

Requires ANY permissions: 

* conversation:conversation:inject

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.EventsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

EventsApi apiInstance = new EventsApi();
BatchConversationEventRequest body = new BatchConversationEventRequest(); // BatchConversationEventRequest | batchRequest
try {
    BatchEventResponse result = apiInstance.postEventsConversations(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#postEventsConversations");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**BatchConversationEventRequest**](BatchConversationEventRequest)| batchRequest | 
{: class="table-striped"}


### Return type

[**BatchEventResponse**](BatchEventResponse)


# **postEventsUsersPresence**


> [BatchEventResponse](BatchEventResponse) postEventsUsersPresence(body)

Publish User Presence Status Batch Events

Wraps POST /api/v2/events/users/presence  

Requires ANY permissions: 

* presence:userPresence:inject

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.EventsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

EventsApi apiInstance = new EventsApi();
BatchUserPresenceEventRequest body = new BatchUserPresenceEventRequest(); // BatchUserPresenceEventRequest | batchRequest
try {
    BatchEventResponse result = apiInstance.postEventsUsersPresence(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#postEventsUsersPresence");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**BatchUserPresenceEventRequest**](BatchUserPresenceEventRequest)| batchRequest | 
{: class="table-striped"}


### Return type

[**BatchEventResponse**](BatchEventResponse)


# **postEventsUsersRoutingstatus**


> [BatchEventResponse](BatchEventResponse) postEventsUsersRoutingstatus(body)

Publish Agent Routing Status Batch Events

Wraps POST /api/v2/events/users/routingstatus  

Requires ANY permissions: 

* routing:routingstatus:inject

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.EventsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

EventsApi apiInstance = new EventsApi();
BatchUserRoutingStatusEventRequest body = new BatchUserRoutingStatusEventRequest(); // BatchUserRoutingStatusEventRequest | batchRequest
try {
    BatchEventResponse result = apiInstance.postEventsUsersRoutingstatus(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#postEventsUsersRoutingstatus");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**BatchUserRoutingStatusEventRequest**](BatchUserRoutingStatusEventRequest)| batchRequest | 
{: class="table-striped"}


### Return type

[**BatchEventResponse**](BatchEventResponse)


_com.mypurecloud.sdk.v2:platform-client-v2:227.0.0_
