# ScreenMonitoringApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteConversationParticipantScreenmonitorsSession**](ScreenMonitoringApi#deleteConversationParticipantScreenmonitorsSession) | Stop a conversation-level screen monitoring session. |
| [**deleteUserScreenmonitorsSession**](ScreenMonitoringApi#deleteUserScreenmonitorsSession) | Stop an agent-level screen monitoring session. |
| [**getConversationParticipantScreenmonitorsSession**](ScreenMonitoringApi#getConversationParticipantScreenmonitorsSession) | Get a conversation-level screen monitoring session object using the supplied screenMonitoringId. |
| [**getScreenmonitorsSessionsDetails**](ScreenMonitoringApi#getScreenmonitorsSessionsDetails) | Get the details of all screen monitoring sessions for the current organization. |
| [**getScreenmonitorsSettings**](ScreenMonitoringApi#getScreenmonitorsSettings) | Get the Screen Monitor Settings for the Organization |
| [**getScreenmonitorsUserSessions**](ScreenMonitoringApi#getScreenmonitorsUserSessions) | Get all screen monitoring sessions for the supplied userId. |
| [**getUserScreenmonitorsSession**](ScreenMonitoringApi#getUserScreenmonitorsSession) | Get an agent-level screen monitoring session object using the supplied screenMonitoringId. |
| [**postConversationParticipantScreenmonitorsSessions**](ScreenMonitoringApi#postConversationParticipantScreenmonitorsSessions) | Start a conversation-level screen monitoring session. |
| [**postScreenmonitorsSessionsUsersDetails**](ScreenMonitoringApi#postScreenmonitorsSessionsUsersDetails) | Get screen monitor session details for one or more users. |
| [**postUserScreenmonitorsSessions**](ScreenMonitoringApi#postUserScreenmonitorsSessions) | Start an agent-level screen monitoring session. |
| [**putScreenmonitorsSettings**](ScreenMonitoringApi#putScreenmonitorsSettings) | Update the Screen Monitor Settings for the Organization |
{: class="table-striped"}


# **deleteConversationParticipantScreenmonitorsSession**


> Void deleteConversationParticipantScreenmonitorsSession(conversationId, participantId, screenMonitoringId)

Stop a conversation-level screen monitoring session.

Wraps DELETE /api/v2/conversations/{conversationId}/participants/{participantId}/screenmonitors/sessions/{screenMonitoringId}  

Requires ANY permissions: 

* realtimeMonitor:screen:monitorConversation

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ScreenMonitoringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ScreenMonitoringApi apiInstance = new ScreenMonitoringApi();
String conversationId = "conversationId_example"; // String | Conversation ID
String participantId = "participantId_example"; // String | Participant ID
String screenMonitoringId = "screenMonitoringId_example"; // String | Screen Monitoring ID
try {
    apiInstance.deleteConversationParticipantScreenmonitorsSession(conversationId, participantId, screenMonitoringId);
} catch (ApiException e) {
    System.err.println("Exception when calling ScreenMonitoringApi#deleteConversationParticipantScreenmonitorsSession");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| Conversation ID | 
| **participantId** | **String**| Participant ID | 
| **screenMonitoringId** | **String**| Screen Monitoring ID | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteUserScreenmonitorsSession**


> Void deleteUserScreenmonitorsSession(userId, screenMonitoringId)

Stop an agent-level screen monitoring session.

Wraps DELETE /api/v2/users/{userId}/screenmonitors/sessions/{screenMonitoringId}  

Requires ANY permissions: 

* realtimeMonitor:screen:monitorAgent

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ScreenMonitoringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ScreenMonitoringApi apiInstance = new ScreenMonitoringApi();
String userId = "userId_example"; // String | User ID
String screenMonitoringId = "screenMonitoringId_example"; // String | Screen Monitoring ID
try {
    apiInstance.deleteUserScreenmonitorsSession(userId, screenMonitoringId);
} catch (ApiException e) {
    System.err.println("Exception when calling ScreenMonitoringApi#deleteUserScreenmonitorsSession");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **screenMonitoringId** | **String**| Screen Monitoring ID | 
{: class="table-striped"}


### Return type

null (empty response body)


# **getConversationParticipantScreenmonitorsSession**


> [ScreenMonitoringSession](ScreenMonitoringSession) getConversationParticipantScreenmonitorsSession(conversationId, participantId, screenMonitoringId)

Get a conversation-level screen monitoring session object using the supplied screenMonitoringId.

Wraps GET /api/v2/conversations/{conversationId}/participants/{participantId}/screenmonitors/sessions/{screenMonitoringId}  

Requires ANY permissions: 

* realtimeMonitor:screen:monitorConversation

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ScreenMonitoringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ScreenMonitoringApi apiInstance = new ScreenMonitoringApi();
String conversationId = "conversationId_example"; // String | Conversation ID
String participantId = "participantId_example"; // String | Participant ID
String screenMonitoringId = "screenMonitoringId_example"; // String | Screen Monitoring ID
try {
    ScreenMonitoringSession result = apiInstance.getConversationParticipantScreenmonitorsSession(conversationId, participantId, screenMonitoringId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScreenMonitoringApi#getConversationParticipantScreenmonitorsSession");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| Conversation ID | 
| **participantId** | **String**| Participant ID | 
| **screenMonitoringId** | **String**| Screen Monitoring ID | 
{: class="table-striped"}


### Return type

[**ScreenMonitoringSession**](ScreenMonitoringSession)


# **getScreenmonitorsSessionsDetails**


> [ScreenMonitoringDetails](ScreenMonitoringDetails) getScreenmonitorsSessionsDetails()

Get the details of all screen monitoring sessions for the current organization.

Wraps GET /api/v2/screenmonitors/sessions/details  

Requires ANY permissions: 

* realtimeMonitor:screenSession:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ScreenMonitoringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ScreenMonitoringApi apiInstance = new ScreenMonitoringApi();
try {
    ScreenMonitoringDetails result = apiInstance.getScreenmonitorsSessionsDetails();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScreenMonitoringApi#getScreenmonitorsSessionsDetails");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**ScreenMonitoringDetails**](ScreenMonitoringDetails)


# **getScreenmonitorsSettings**


> [ScreenMonitorSettings](ScreenMonitorSettings) getScreenmonitorsSettings()

Get the Screen Monitor Settings for the Organization

Wraps GET /api/v2/screenmonitors/settings  

Requires ANY permissions: 

* realtimeMonitor:settings:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ScreenMonitoringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ScreenMonitoringApi apiInstance = new ScreenMonitoringApi();
try {
    ScreenMonitorSettings result = apiInstance.getScreenmonitorsSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScreenMonitoringApi#getScreenmonitorsSettings");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**ScreenMonitorSettings**](ScreenMonitorSettings)


# **getScreenmonitorsUserSessions**


> [ScreenMonitoringSessionEntityListing](ScreenMonitoringSessionEntityListing) getScreenmonitorsUserSessions(userId)

Get all screen monitoring sessions for the supplied userId.

Wraps GET /api/v2/screenmonitors/users/{userId}/sessions  

Requires ANY permissions: 

* realtimeMonitor:screen:monitorConversation
* realtimeMonitor:screen:monitorAgent

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ScreenMonitoringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ScreenMonitoringApi apiInstance = new ScreenMonitoringApi();
String userId = "userId_example"; // String | User ID
try {
    ScreenMonitoringSessionEntityListing result = apiInstance.getScreenmonitorsUserSessions(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScreenMonitoringApi#getScreenmonitorsUserSessions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
{: class="table-striped"}


### Return type

[**ScreenMonitoringSessionEntityListing**](ScreenMonitoringSessionEntityListing)


# **getUserScreenmonitorsSession**


> [ScreenMonitoringSession](ScreenMonitoringSession) getUserScreenmonitorsSession(userId, screenMonitoringId)

Get an agent-level screen monitoring session object using the supplied screenMonitoringId.

Wraps GET /api/v2/users/{userId}/screenmonitors/sessions/{screenMonitoringId}  

Requires ANY permissions: 

* realtimeMonitor:screen:monitorAgent

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ScreenMonitoringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ScreenMonitoringApi apiInstance = new ScreenMonitoringApi();
String userId = "userId_example"; // String | User ID
String screenMonitoringId = "screenMonitoringId_example"; // String | Screen Monitoring ID
try {
    ScreenMonitoringSession result = apiInstance.getUserScreenmonitorsSession(userId, screenMonitoringId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScreenMonitoringApi#getUserScreenmonitorsSession");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **screenMonitoringId** | **String**| Screen Monitoring ID | 
{: class="table-striped"}


### Return type

[**ScreenMonitoringSession**](ScreenMonitoringSession)


# **postConversationParticipantScreenmonitorsSessions**


> [StartScreenMonitorResponseBody](StartScreenMonitorResponseBody) postConversationParticipantScreenmonitorsSessions(conversationId, participantId)

Start a conversation-level screen monitoring session.

Wraps POST /api/v2/conversations/{conversationId}/participants/{participantId}/screenmonitors/sessions  

Requires ANY permissions: 

* realtimeMonitor:screen:monitorConversation

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ScreenMonitoringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ScreenMonitoringApi apiInstance = new ScreenMonitoringApi();
String conversationId = "conversationId_example"; // String | Conversation ID
String participantId = "participantId_example"; // String | Participant ID
try {
    StartScreenMonitorResponseBody result = apiInstance.postConversationParticipantScreenmonitorsSessions(conversationId, participantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScreenMonitoringApi#postConversationParticipantScreenmonitorsSessions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| Conversation ID | 
| **participantId** | **String**| Participant ID | 
{: class="table-striped"}


### Return type

[**StartScreenMonitorResponseBody**](StartScreenMonitorResponseBody)


# **postScreenmonitorsSessionsUsersDetails**


> [ScreenMonitoringUserDetailsEntityListing](ScreenMonitoringUserDetailsEntityListing) postScreenmonitorsSessionsUsersDetails(body)

Get screen monitor session details for one or more users.

Wraps POST /api/v2/screenmonitors/sessions/users/details  

Requires ANY permissions: 

* realtimeMonitor:screenSession:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ScreenMonitoringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ScreenMonitoringApi apiInstance = new ScreenMonitoringApi();
List<String> body = Arrays.asList(null); // List<String> | List of target user IDs
try {
    ScreenMonitoringUserDetailsEntityListing result = apiInstance.postScreenmonitorsSessionsUsersDetails(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScreenMonitoringApi#postScreenmonitorsSessionsUsersDetails");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**List&lt;String&gt;**](String)| List of target user IDs | 
{: class="table-striped"}


### Return type

[**ScreenMonitoringUserDetailsEntityListing**](ScreenMonitoringUserDetailsEntityListing)


# **postUserScreenmonitorsSessions**


> [StartScreenMonitorResponseBody](StartScreenMonitorResponseBody) postUserScreenmonitorsSessions(userId)

Start an agent-level screen monitoring session.

Wraps POST /api/v2/users/{userId}/screenmonitors/sessions  

Requires ANY permissions: 

* realtimeMonitor:screen:monitorAgent

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ScreenMonitoringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ScreenMonitoringApi apiInstance = new ScreenMonitoringApi();
String userId = "userId_example"; // String | User ID
try {
    StartScreenMonitorResponseBody result = apiInstance.postUserScreenmonitorsSessions(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScreenMonitoringApi#postUserScreenmonitorsSessions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
{: class="table-striped"}


### Return type

[**StartScreenMonitorResponseBody**](StartScreenMonitorResponseBody)


# **putScreenmonitorsSettings**


> Void putScreenmonitorsSettings(body)

Update the Screen Monitor Settings for the Organization

Wraps PUT /api/v2/screenmonitors/settings  

Requires ANY permissions: 

* realtimeMonitor:settings:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ScreenMonitoringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ScreenMonitoringApi apiInstance = new ScreenMonitoringApi();
ScreenMonitorSettings body = new ScreenMonitorSettings(); // ScreenMonitorSettings | Screen Monitor settings
try {
    apiInstance.putScreenmonitorsSettings(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ScreenMonitoringApi#putScreenmonitorsSettings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**ScreenMonitorSettings**](ScreenMonitorSettings)| Screen Monitor settings | 
{: class="table-striped"}


### Return type

null (empty response body)


_com.mypurecloud.sdk.v2:platform-client-v2:259.0.0_
