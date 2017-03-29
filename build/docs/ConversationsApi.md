---
title: ConversationsApi
---
## ConversationsApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteConversationParticipantCode**](ConversationsApi.html#deleteConversationParticipantCode) | Delete a code used to add a communication to this participant |
| [**deleteConversationsCallParticipantConsult**](ConversationsApi.html#deleteConversationsCallParticipantConsult) | Cancel the transfer |
| [**deleteConversationsEmailMessagesDraftAttachment**](ConversationsApi.html#deleteConversationsEmailMessagesDraftAttachment) | Delete attachment from draft |
| [**getAnalyticsConversationDetails**](ConversationsApi.html#getAnalyticsConversationDetails) | Get a conversation by id |
| [**getConversation**](ConversationsApi.html#getConversation) | Get conversation |
| [**getConversationParticipantWrapup**](ConversationsApi.html#getConversationParticipantWrapup) | Get the wrap-up for this conversation participant.  |
| [**getConversationParticipantWrapupcodes**](ConversationsApi.html#getConversationParticipantWrapupcodes) | Get list of wrapup codes for this conversation participant |
| [**getConversations**](ConversationsApi.html#getConversations) | Get conversations |
| [**getConversationsCall**](ConversationsApi.html#getConversationsCall) | Get call conversation |
| [**getConversationsCallParticipantWrapup**](ConversationsApi.html#getConversationsCallParticipantWrapup) | Get the wrap-up for this conversation participant.  |
| [**getConversationsCallParticipantWrapupcodes**](ConversationsApi.html#getConversationsCallParticipantWrapupcodes) | Get list of wrapup codes for this conversation participant |
| [**getConversationsCallback**](ConversationsApi.html#getConversationsCallback) | Get callback conversation |
| [**getConversationsCallbackParticipantWrapup**](ConversationsApi.html#getConversationsCallbackParticipantWrapup) | Get the wrap-up for this conversation participant.  |
| [**getConversationsCallbackParticipantWrapupcodes**](ConversationsApi.html#getConversationsCallbackParticipantWrapupcodes) | Get list of wrapup codes for this conversation participant |
| [**getConversationsCallbacks**](ConversationsApi.html#getConversationsCallbacks) | Get callback conversations |
| [**getConversationsCalls**](ConversationsApi.html#getConversationsCalls) | Get recent conversations |
| [**getConversationsCallsHistory**](ConversationsApi.html#getConversationsCallsHistory) | Get call history |
| [**getConversationsCallsMaximumconferenceparties**](ConversationsApi.html#getConversationsCallsMaximumconferenceparties) | Get the maximum number of participants that this user can have on a conference |
| [**getConversationsChat**](ConversationsApi.html#getConversationsChat) | Get chat conversation |
| [**getConversationsChatParticipantWrapup**](ConversationsApi.html#getConversationsChatParticipantWrapup) | Get the wrap-up for this conversation participant.  |
| [**getConversationsChatParticipantWrapupcodes**](ConversationsApi.html#getConversationsChatParticipantWrapupcodes) | Get list of wrapup codes for this conversation participant |
| [**getConversationsChats**](ConversationsApi.html#getConversationsChats) | Get recent chat conversations |
| [**getConversationsCobrowsesession**](ConversationsApi.html#getConversationsCobrowsesession) | Get cobrowse conversation |
| [**getConversationsCobrowsesessionParticipantWrapup**](ConversationsApi.html#getConversationsCobrowsesessionParticipantWrapup) | Get the wrap-up for this conversation participant.  |
| [**getConversationsCobrowsesessionParticipantWrapupcodes**](ConversationsApi.html#getConversationsCobrowsesessionParticipantWrapupcodes) | Get list of wrapup codes for this conversation participant |
| [**getConversationsCobrowsesessions**](ConversationsApi.html#getConversationsCobrowsesessions) | Get recent cobrowse conversations |
| [**getConversationsEmail**](ConversationsApi.html#getConversationsEmail) | Get email conversation |
| [**getConversationsEmailMessage**](ConversationsApi.html#getConversationsEmailMessage) | Get conversation message |
| [**getConversationsEmailMessages**](ConversationsApi.html#getConversationsEmailMessages) | Get conversation messages |
| [**getConversationsEmailMessagesDraft**](ConversationsApi.html#getConversationsEmailMessagesDraft) | Get conversation draft reply |
| [**getConversationsEmailParticipantWrapup**](ConversationsApi.html#getConversationsEmailParticipantWrapup) | Get the wrap-up for this conversation participant.  |
| [**getConversationsEmailParticipantWrapupcodes**](ConversationsApi.html#getConversationsEmailParticipantWrapupcodes) | Get list of wrapup codes for this conversation participant |
| [**getConversationsEmails**](ConversationsApi.html#getConversationsEmails) | Get recent email conversations |
| [**patchConversationParticipant**](ConversationsApi.html#patchConversationParticipant) | Update a participant. |
| [**patchConversationParticipantAttributes**](ConversationsApi.html#patchConversationParticipantAttributes) | Update the attributes on a conversation participant. |
| [**patchConversationsCall**](ConversationsApi.html#patchConversationsCall) | Update a conversation by setting it&#39;s recording state, merging in other conversations to create a conference, or disconnecting all of the participants |
| [**patchConversationsCallParticipant**](ConversationsApi.html#patchConversationsCallParticipant) | Update conversation participant |
| [**patchConversationsCallParticipantAttributes**](ConversationsApi.html#patchConversationsCallParticipantAttributes) | Update the attributes on a conversation participant. |
| [**patchConversationsCallParticipantCommunication**](ConversationsApi.html#patchConversationsCallParticipantCommunication) | Update conversation participant&#39;s communication by disconnecting it. |
| [**patchConversationsCallParticipantConsult**](ConversationsApi.html#patchConversationsCallParticipantConsult) | Change who can speak |
| [**patchConversationsCallback**](ConversationsApi.html#patchConversationsCallback) | Update a conversation by disconnecting all of the participants |
| [**patchConversationsCallbackParticipant**](ConversationsApi.html#patchConversationsCallbackParticipant) | Update conversation participant |
| [**patchConversationsCallbackParticipantAttributes**](ConversationsApi.html#patchConversationsCallbackParticipantAttributes) | Update the attributes on a conversation participant. |
| [**patchConversationsCallbackParticipantCommunication**](ConversationsApi.html#patchConversationsCallbackParticipantCommunication) | Update conversation participant&#39;s communication by disconnecting it. |
| [**patchConversationsChat**](ConversationsApi.html#patchConversationsChat) | Update a conversation by disconnecting all of the participants |
| [**patchConversationsChatParticipant**](ConversationsApi.html#patchConversationsChatParticipant) | Update conversation participant |
| [**patchConversationsChatParticipantAttributes**](ConversationsApi.html#patchConversationsChatParticipantAttributes) | Update the attributes on a conversation participant. |
| [**patchConversationsChatParticipantCommunication**](ConversationsApi.html#patchConversationsChatParticipantCommunication) | Update conversation participant&#39;s communication by disconnecting it. |
| [**patchConversationsCobrowsesession**](ConversationsApi.html#patchConversationsCobrowsesession) | Update a conversation by disconnecting all of the participants |
| [**patchConversationsCobrowsesessionParticipant**](ConversationsApi.html#patchConversationsCobrowsesessionParticipant) | Update conversation participant |
| [**patchConversationsCobrowsesessionParticipantAttributes**](ConversationsApi.html#patchConversationsCobrowsesessionParticipantAttributes) | Update the attributes on a conversation participant. |
| [**patchConversationsCobrowsesessionParticipantCommunication**](ConversationsApi.html#patchConversationsCobrowsesessionParticipantCommunication) | Update conversation participant&#39;s communication by disconnecting it. |
| [**patchConversationsEmail**](ConversationsApi.html#patchConversationsEmail) | Update a conversation by disconnecting all of the participants |
| [**patchConversationsEmailParticipant**](ConversationsApi.html#patchConversationsEmailParticipant) | Update conversation participant |
| [**patchConversationsEmailParticipantAttributes**](ConversationsApi.html#patchConversationsEmailParticipantAttributes) | Update the attributes on a conversation participant. |
| [**patchConversationsEmailParticipantCommunication**](ConversationsApi.html#patchConversationsEmailParticipantCommunication) | Update conversation participant&#39;s communication by disconnecting it. |
| [**postAnalyticsConversationDetailsProperties**](ConversationsApi.html#postAnalyticsConversationDetailsProperties) | Index conversation properties |
| [**postAnalyticsConversationsAggregatesQuery**](ConversationsApi.html#postAnalyticsConversationsAggregatesQuery) | Query for conversation aggregates |
| [**postAnalyticsConversationsDetailsQuery**](ConversationsApi.html#postAnalyticsConversationsDetailsQuery) | Query for conversation details |
| [**postConversationParticipantCallbacks**](ConversationsApi.html#postConversationParticipantCallbacks) | Create a new callback for the specified participant on the conversation. |
| [**postConversationParticipantReplace**](ConversationsApi.html#postConversationParticipantReplace) | Replace this participant with the specified user and/or address |
| [**postConversationsCall**](ConversationsApi.html#postConversationsCall) | Add a new call to a conversation |
| [**postConversationsCallParticipantConsult**](ConversationsApi.html#postConversationsCallParticipantConsult) | Initiate and update consult transfer |
| [**postConversationsCallParticipantMonitor**](ConversationsApi.html#postConversationsCallParticipantMonitor) | Listen in on the conversation from the point of view of a given participant. |
| [**postConversationsCallParticipantReplace**](ConversationsApi.html#postConversationsCallParticipantReplace) | Replace this participant with the specified user and/or address |
| [**postConversationsCallParticipants**](ConversationsApi.html#postConversationsCallParticipants) | Add participants to a conversation |
| [**postConversationsCallbackParticipantReplace**](ConversationsApi.html#postConversationsCallbackParticipantReplace) | Replace this participant with the specified user and/or address |
| [**postConversationsCallbacks**](ConversationsApi.html#postConversationsCallbacks) | Create a Callback |
| [**postConversationsCalls**](ConversationsApi.html#postConversationsCalls) | Create a call conversation |
| [**postConversationsChatParticipantReplace**](ConversationsApi.html#postConversationsChatParticipantReplace) | Replace this participant with the specified user and/or address |
| [**postConversationsChats**](ConversationsApi.html#postConversationsChats) | Create a web chat conversation |
| [**postConversationsCobrowsesessionParticipantReplace**](ConversationsApi.html#postConversationsCobrowsesessionParticipantReplace) | Replace this participant with the specified user and/or address |
| [**postConversationsEmailMessages**](ConversationsApi.html#postConversationsEmailMessages) | Send an email reply |
| [**postConversationsEmailParticipantReplace**](ConversationsApi.html#postConversationsEmailParticipantReplace) | Replace this participant with the specified user and/or address |
| [**postConversationsEmails**](ConversationsApi.html#postConversationsEmails) | Create an email conversation |
| [**postConversationsFaxes**](ConversationsApi.html#postConversationsFaxes) | Create Fax Conversation |
| [**putConversationsEmailMessagesDraft**](ConversationsApi.html#putConversationsEmailMessagesDraft) | Update conversation draft reply |
{: class="table table-striped"}

<a name="deleteConversationParticipantCode"></a>

# **deleteConversationParticipantCode**

> Void deleteConversationParticipantCode(conversationId, participantId, addCommunicationCode)

Delete a code used to add a communication to this participant



Wraps DELETE /api/v2/conversations/{conversationId}/participants/{participantId}/codes/{addCommunicationCode}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
String participantId = "participantId_example"; // String | participant ID
String addCommunicationCode = "addCommunicationCode_example"; // String | addCommunicationCode
try {
    apiInstance.deleteConversationParticipantCode(conversationId, participantId, addCommunicationCode);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#deleteConversationParticipantCode");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversation ID | |
| **participantId** | **String**| participant ID | |
| **addCommunicationCode** | **String**| addCommunicationCode | |
{: class="table table-striped"}

### Return type

null (empty response body)

<a name="deleteConversationsCallParticipantConsult"></a>

# **deleteConversationsCallParticipantConsult**

> String deleteConversationsCallParticipantConsult(callId, participantId)

Cancel the transfer



Wraps DELETE /api/v2/conversations/calls/{callId}/participants/{participantId}/consult  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String callId = "callId_example"; // String | callId
String participantId = "participantId_example"; // String | participantId
try {
    String result = apiInstance.deleteConversationsCallParticipantConsult(callId, participantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#deleteConversationsCallParticipantConsult");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **callId** | **String**| callId | |
| **participantId** | **String**| participantId | |
{: class="table table-striped"}

### Return type

**String**

<a name="deleteConversationsEmailMessagesDraftAttachment"></a>

# **deleteConversationsEmailMessagesDraftAttachment**

> String deleteConversationsEmailMessagesDraftAttachment(emailId, attachmentId)

Delete attachment from draft



Wraps DELETE /api/v2/conversations/emails/{emailId}/messages/draft/attachments/{attachmentId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String emailId = "emailId_example"; // String | emailId
String attachmentId = "attachmentId_example"; // String | attachmentId
try {
    String result = apiInstance.deleteConversationsEmailMessagesDraftAttachment(emailId, attachmentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#deleteConversationsEmailMessagesDraftAttachment");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **emailId** | **String**| emailId | |
| **attachmentId** | **String**| attachmentId | |
{: class="table table-striped"}

### Return type

**String**

<a name="getAnalyticsConversationDetails"></a>

# **getAnalyticsConversationDetails**

> [AnalyticsConversation](AnalyticsConversation.html) getAnalyticsConversationDetails(conversationId)

Get a conversation by id



Wraps GET /api/v2/analytics/conversations/{conversationId}/details  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
try {
    AnalyticsConversation result = apiInstance.getAnalyticsConversationDetails(conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getAnalyticsConversationDetails");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | |
{: class="table table-striped"}

### Return type

[**AnalyticsConversation**](AnalyticsConversation.html)

<a name="getConversation"></a>

# **getConversation**

> [Conversation](Conversation.html) getConversation(conversationId)

Get conversation



Wraps GET /api/v2/conversations/{conversationId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
try {
    Conversation result = apiInstance.getConversation(conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversation");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversation ID | |
{: class="table table-striped"}

### Return type

[**Conversation**](Conversation.html)

<a name="getConversationParticipantWrapup"></a>

# **getConversationParticipantWrapup**

> [WrapupCode](WrapupCode.html) getConversationParticipantWrapup(conversationId, participantId, provisional)

Get the wrap-up for this conversation participant. 



Wraps GET /api/v2/conversations/{conversationId}/participants/{participantId}/wrapup  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
String participantId = "participantId_example"; // String | participant ID
Boolean provisional = false; // Boolean | Indicates if the wrap-up code is provisional.
try {
    WrapupCode result = apiInstance.getConversationParticipantWrapup(conversationId, participantId, provisional);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationParticipantWrapup");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversation ID | |
| **participantId** | **String**| participant ID | |
| **provisional** | **Boolean**| Indicates if the wrap-up code is provisional. | [optional] [default to false] |
{: class="table table-striped"}

### Return type

[**WrapupCode**](WrapupCode.html)

<a name="getConversationParticipantWrapupcodes"></a>

# **getConversationParticipantWrapupcodes**

> [List&lt;WrapupCode&gt;](WrapupCode.html) getConversationParticipantWrapupcodes(conversationId, participantId)

Get list of wrapup codes for this conversation participant



Wraps GET /api/v2/conversations/{conversationId}/participants/{participantId}/wrapupcodes  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
String participantId = "participantId_example"; // String | participant ID
try {
    List<WrapupCode> result = apiInstance.getConversationParticipantWrapupcodes(conversationId, participantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationParticipantWrapupcodes");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversation ID | |
| **participantId** | **String**| participant ID | |
{: class="table table-striped"}

### Return type

[**List&lt;WrapupCode&gt;**](WrapupCode.html)

<a name="getConversations"></a>

# **getConversations**

> [ConversationEntityListing](ConversationEntityListing.html) getConversations(communicationType)

Get conversations



Wraps GET /api/v2/conversations  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String communicationType = "communicationType_example"; // String | Call or Chat communication filtering
try {
    ConversationEntityListing result = apiInstance.getConversations(communicationType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversations");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **communicationType** | **String**| Call or Chat communication filtering | [optional] |
{: class="table table-striped"}

### Return type

[**ConversationEntityListing**](ConversationEntityListing.html)

<a name="getConversationsCall"></a>

# **getConversationsCall**

> [CallConversation](CallConversation.html) getConversationsCall(callId)

Get call conversation



Wraps GET /api/v2/conversations/calls/{callId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String callId = "callId_example"; // String | callId
try {
    CallConversation result = apiInstance.getConversationsCall(callId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsCall");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **callId** | **String**| callId | |
{: class="table table-striped"}

### Return type

[**CallConversation**](CallConversation.html)

<a name="getConversationsCallParticipantWrapup"></a>

# **getConversationsCallParticipantWrapup**

> [Wrapup](Wrapup.html) getConversationsCallParticipantWrapup(callId, participantId, provisional)

Get the wrap-up for this conversation participant. 



Wraps GET /api/v2/conversations/calls/{callId}/participants/{participantId}/wrapup  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String callId = "callId_example"; // String | callId
String participantId = "participantId_example"; // String | participantId
Boolean provisional = false; // Boolean | Indicates if the wrap-up code is provisional.
try {
    Wrapup result = apiInstance.getConversationsCallParticipantWrapup(callId, participantId, provisional);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsCallParticipantWrapup");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **callId** | **String**| callId | |
| **participantId** | **String**| participantId | |
| **provisional** | **Boolean**| Indicates if the wrap-up code is provisional. | [optional] [default to false] |
{: class="table table-striped"}

### Return type

[**Wrapup**](Wrapup.html)

<a name="getConversationsCallParticipantWrapupcodes"></a>

# **getConversationsCallParticipantWrapupcodes**

> [List&lt;WrapupCode&gt;](WrapupCode.html) getConversationsCallParticipantWrapupcodes(callId, participantId)

Get list of wrapup codes for this conversation participant



Wraps GET /api/v2/conversations/calls/{callId}/participants/{participantId}/wrapupcodes  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String callId = "callId_example"; // String | callId
String participantId = "participantId_example"; // String | participantId
try {
    List<WrapupCode> result = apiInstance.getConversationsCallParticipantWrapupcodes(callId, participantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsCallParticipantWrapupcodes");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **callId** | **String**| callId | |
| **participantId** | **String**| participantId | |
{: class="table table-striped"}

### Return type

[**List&lt;WrapupCode&gt;**](WrapupCode.html)

<a name="getConversationsCallback"></a>

# **getConversationsCallback**

> [CallbackConversation](CallbackConversation.html) getConversationsCallback(callbackId)

Get callback conversation



Wraps GET /api/v2/conversations/callbacks/{callbackId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String callbackId = "callbackId_example"; // String | callbackId
try {
    CallbackConversation result = apiInstance.getConversationsCallback(callbackId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsCallback");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **callbackId** | **String**| callbackId | |
{: class="table table-striped"}

### Return type

[**CallbackConversation**](CallbackConversation.html)

<a name="getConversationsCallbackParticipantWrapup"></a>

# **getConversationsCallbackParticipantWrapup**

> [Wrapup](Wrapup.html) getConversationsCallbackParticipantWrapup(callbackId, participantId, provisional)

Get the wrap-up for this conversation participant. 



Wraps GET /api/v2/conversations/callbacks/{callbackId}/participants/{participantId}/wrapup  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String callbackId = "callbackId_example"; // String | callbackId
String participantId = "participantId_example"; // String | participantId
Boolean provisional = false; // Boolean | Indicates if the wrap-up code is provisional.
try {
    Wrapup result = apiInstance.getConversationsCallbackParticipantWrapup(callbackId, participantId, provisional);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsCallbackParticipantWrapup");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **callbackId** | **String**| callbackId | |
| **participantId** | **String**| participantId | |
| **provisional** | **Boolean**| Indicates if the wrap-up code is provisional. | [optional] [default to false] |
{: class="table table-striped"}

### Return type

[**Wrapup**](Wrapup.html)

<a name="getConversationsCallbackParticipantWrapupcodes"></a>

# **getConversationsCallbackParticipantWrapupcodes**

> [List&lt;WrapupCode&gt;](WrapupCode.html) getConversationsCallbackParticipantWrapupcodes(callbackId, participantId)

Get list of wrapup codes for this conversation participant



Wraps GET /api/v2/conversations/callbacks/{callbackId}/participants/{participantId}/wrapupcodes  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String callbackId = "callbackId_example"; // String | callbackId
String participantId = "participantId_example"; // String | participantId
try {
    List<WrapupCode> result = apiInstance.getConversationsCallbackParticipantWrapupcodes(callbackId, participantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsCallbackParticipantWrapupcodes");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **callbackId** | **String**| callbackId | |
| **participantId** | **String**| participantId | |
{: class="table table-striped"}

### Return type

[**List&lt;WrapupCode&gt;**](WrapupCode.html)

<a name="getConversationsCallbacks"></a>

# **getConversationsCallbacks**

> [CallbackConversationEntityListing](CallbackConversationEntityListing.html) getConversationsCallbacks()

Get callback conversations



Wraps GET /api/v2/conversations/callbacks  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
try {
    CallbackConversationEntityListing result = apiInstance.getConversationsCallbacks();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsCallbacks");
    e.printStackTrace();
}
~~~

### Parameters

This endpoint does not require any parameters.
{: class="table table-striped"}

### Return type

[**CallbackConversationEntityListing**](CallbackConversationEntityListing.html)

<a name="getConversationsCalls"></a>

# **getConversationsCalls**

> [CallConversationEntityListing](CallConversationEntityListing.html) getConversationsCalls()

Get recent conversations



Wraps GET /api/v2/conversations/calls  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
try {
    CallConversationEntityListing result = apiInstance.getConversationsCalls();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsCalls");
    e.printStackTrace();
}
~~~

### Parameters

This endpoint does not require any parameters.
{: class="table table-striped"}

### Return type

[**CallConversationEntityListing**](CallConversationEntityListing.html)

<a name="getConversationsCallsHistory"></a>

# **getConversationsCallsHistory**

> [CallConversationEntityListing](CallConversationEntityListing.html) getConversationsCallsHistory(pageSize, pageNumber, interval)

Get call history



Wraps GET /api/v2/conversations/calls/history  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String interval = "interval_example"; // String | Interval string; format is ISO-8601. Separate start and end times with forward slash '/'
try {
    CallConversationEntityListing result = apiInstance.getConversationsCallsHistory(pageSize, pageNumber, interval);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsCallsHistory");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] |
| **interval** | **String**| Interval string; format is ISO-8601. Separate start and end times with forward slash &#39;/&#39; | [optional] |
{: class="table table-striped"}

### Return type

[**CallConversationEntityListing**](CallConversationEntityListing.html)

<a name="getConversationsCallsMaximumconferenceparties"></a>

# **getConversationsCallsMaximumconferenceparties**

> [MaxParticipants](MaxParticipants.html) getConversationsCallsMaximumconferenceparties()

Get the maximum number of participants that this user can have on a conference



Wraps GET /api/v2/conversations/calls/maximumconferenceparties  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
try {
    MaxParticipants result = apiInstance.getConversationsCallsMaximumconferenceparties();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsCallsMaximumconferenceparties");
    e.printStackTrace();
}
~~~

### Parameters

This endpoint does not require any parameters.
{: class="table table-striped"}

### Return type

[**MaxParticipants**](MaxParticipants.html)

<a name="getConversationsChat"></a>

# **getConversationsChat**

> [ChatConversation](ChatConversation.html) getConversationsChat(chatId)

Get chat conversation



Wraps GET /api/v2/conversations/chats/{chatId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String chatId = "chatId_example"; // String | chatId
try {
    ChatConversation result = apiInstance.getConversationsChat(chatId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsChat");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **chatId** | **String**| chatId | |
{: class="table table-striped"}

### Return type

[**ChatConversation**](ChatConversation.html)

<a name="getConversationsChatParticipantWrapup"></a>

# **getConversationsChatParticipantWrapup**

> [Wrapup](Wrapup.html) getConversationsChatParticipantWrapup(chatId, participantId, provisional)

Get the wrap-up for this conversation participant. 



Wraps GET /api/v2/conversations/chats/{chatId}/participants/{participantId}/wrapup  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String chatId = "chatId_example"; // String | chatId
String participantId = "participantId_example"; // String | participantId
Boolean provisional = false; // Boolean | Indicates if the wrap-up code is provisional.
try {
    Wrapup result = apiInstance.getConversationsChatParticipantWrapup(chatId, participantId, provisional);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsChatParticipantWrapup");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **chatId** | **String**| chatId | |
| **participantId** | **String**| participantId | |
| **provisional** | **Boolean**| Indicates if the wrap-up code is provisional. | [optional] [default to false] |
{: class="table table-striped"}

### Return type

[**Wrapup**](Wrapup.html)

<a name="getConversationsChatParticipantWrapupcodes"></a>

# **getConversationsChatParticipantWrapupcodes**

> [List&lt;WrapupCode&gt;](WrapupCode.html) getConversationsChatParticipantWrapupcodes(chatId, participantId)

Get list of wrapup codes for this conversation participant



Wraps GET /api/v2/conversations/chats/{chatId}/participants/{participantId}/wrapupcodes  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String chatId = "chatId_example"; // String | chatId
String participantId = "participantId_example"; // String | participantId
try {
    List<WrapupCode> result = apiInstance.getConversationsChatParticipantWrapupcodes(chatId, participantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsChatParticipantWrapupcodes");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **chatId** | **String**| chatId | |
| **participantId** | **String**| participantId | |
{: class="table table-striped"}

### Return type

[**List&lt;WrapupCode&gt;**](WrapupCode.html)

<a name="getConversationsChats"></a>

# **getConversationsChats**

> [ChatConversationEntityListing](ChatConversationEntityListing.html) getConversationsChats()

Get recent chat conversations



Wraps GET /api/v2/conversations/chats  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
try {
    ChatConversationEntityListing result = apiInstance.getConversationsChats();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsChats");
    e.printStackTrace();
}
~~~

### Parameters

This endpoint does not require any parameters.
{: class="table table-striped"}

### Return type

[**ChatConversationEntityListing**](ChatConversationEntityListing.html)

<a name="getConversationsCobrowsesession"></a>

# **getConversationsCobrowsesession**

> [CobrowseConversation](CobrowseConversation.html) getConversationsCobrowsesession(cobrowseId)

Get cobrowse conversation



Wraps GET /api/v2/conversations/cobrowsesessions/{cobrowseId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String cobrowseId = "cobrowseId_example"; // String | cobrowseId
try {
    CobrowseConversation result = apiInstance.getConversationsCobrowsesession(cobrowseId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsCobrowsesession");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cobrowseId** | **String**| cobrowseId | |
{: class="table table-striped"}

### Return type

[**CobrowseConversation**](CobrowseConversation.html)

<a name="getConversationsCobrowsesessionParticipantWrapup"></a>

# **getConversationsCobrowsesessionParticipantWrapup**

> [Wrapup](Wrapup.html) getConversationsCobrowsesessionParticipantWrapup(cobrowseId, participantId, provisional)

Get the wrap-up for this conversation participant. 



Wraps GET /api/v2/conversations/cobrowsesessions/{cobrowseId}/participants/{participantId}/wrapup  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String cobrowseId = "cobrowseId_example"; // String | cobrowseId
String participantId = "participantId_example"; // String | participantId
Boolean provisional = false; // Boolean | Indicates if the wrap-up code is provisional.
try {
    Wrapup result = apiInstance.getConversationsCobrowsesessionParticipantWrapup(cobrowseId, participantId, provisional);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsCobrowsesessionParticipantWrapup");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cobrowseId** | **String**| cobrowseId | |
| **participantId** | **String**| participantId | |
| **provisional** | **Boolean**| Indicates if the wrap-up code is provisional. | [optional] [default to false] |
{: class="table table-striped"}

### Return type

[**Wrapup**](Wrapup.html)

<a name="getConversationsCobrowsesessionParticipantWrapupcodes"></a>

# **getConversationsCobrowsesessionParticipantWrapupcodes**

> [List&lt;WrapupCode&gt;](WrapupCode.html) getConversationsCobrowsesessionParticipantWrapupcodes(cobrowseId, participantId)

Get list of wrapup codes for this conversation participant



Wraps GET /api/v2/conversations/cobrowsesessions/{cobrowseId}/participants/{participantId}/wrapupcodes  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String cobrowseId = "cobrowseId_example"; // String | cobrowseId
String participantId = "participantId_example"; // String | participantId
try {
    List<WrapupCode> result = apiInstance.getConversationsCobrowsesessionParticipantWrapupcodes(cobrowseId, participantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsCobrowsesessionParticipantWrapupcodes");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cobrowseId** | **String**| cobrowseId | |
| **participantId** | **String**| participantId | |
{: class="table table-striped"}

### Return type

[**List&lt;WrapupCode&gt;**](WrapupCode.html)

<a name="getConversationsCobrowsesessions"></a>

# **getConversationsCobrowsesessions**

> [CobrowseConversationEntityListing](CobrowseConversationEntityListing.html) getConversationsCobrowsesessions()

Get recent cobrowse conversations



Wraps GET /api/v2/conversations/cobrowsesessions  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
try {
    CobrowseConversationEntityListing result = apiInstance.getConversationsCobrowsesessions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsCobrowsesessions");
    e.printStackTrace();
}
~~~

### Parameters

This endpoint does not require any parameters.
{: class="table table-striped"}

### Return type

[**CobrowseConversationEntityListing**](CobrowseConversationEntityListing.html)

<a name="getConversationsEmail"></a>

# **getConversationsEmail**

> [EmailConversation](EmailConversation.html) getConversationsEmail(emailId)

Get email conversation



Wraps GET /api/v2/conversations/emails/{emailId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String emailId = "emailId_example"; // String | emailId
try {
    EmailConversation result = apiInstance.getConversationsEmail(emailId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsEmail");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **emailId** | **String**| emailId | |
{: class="table table-striped"}

### Return type

[**EmailConversation**](EmailConversation.html)

<a name="getConversationsEmailMessage"></a>

# **getConversationsEmailMessage**

> [EmailMessage](EmailMessage.html) getConversationsEmailMessage(emailId, messageId)

Get conversation message



Wraps GET /api/v2/conversations/emails/{emailId}/messages/{messageId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String emailId = "emailId_example"; // String | emailId
String messageId = "messageId_example"; // String | messageId
try {
    EmailMessage result = apiInstance.getConversationsEmailMessage(emailId, messageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsEmailMessage");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **emailId** | **String**| emailId | |
| **messageId** | **String**| messageId | |
{: class="table table-striped"}

### Return type

[**EmailMessage**](EmailMessage.html)

<a name="getConversationsEmailMessages"></a>

# **getConversationsEmailMessages**

> [EmailMessageListing](EmailMessageListing.html) getConversationsEmailMessages(emailId)

Get conversation messages



Wraps GET /api/v2/conversations/emails/{emailId}/messages  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String emailId = "emailId_example"; // String | emailId
try {
    EmailMessageListing result = apiInstance.getConversationsEmailMessages(emailId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsEmailMessages");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **emailId** | **String**| emailId | |
{: class="table table-striped"}

### Return type

[**EmailMessageListing**](EmailMessageListing.html)

<a name="getConversationsEmailMessagesDraft"></a>

# **getConversationsEmailMessagesDraft**

> [EmailMessage](EmailMessage.html) getConversationsEmailMessagesDraft(emailId)

Get conversation draft reply



Wraps GET /api/v2/conversations/emails/{emailId}/messages/draft  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String emailId = "emailId_example"; // String | emailId
try {
    EmailMessage result = apiInstance.getConversationsEmailMessagesDraft(emailId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsEmailMessagesDraft");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **emailId** | **String**| emailId | |
{: class="table table-striped"}

### Return type

[**EmailMessage**](EmailMessage.html)

<a name="getConversationsEmailParticipantWrapup"></a>

# **getConversationsEmailParticipantWrapup**

> [Wrapup](Wrapup.html) getConversationsEmailParticipantWrapup(emailId, participantId, provisional)

Get the wrap-up for this conversation participant. 



Wraps GET /api/v2/conversations/emails/{emailId}/participants/{participantId}/wrapup  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String emailId = "emailId_example"; // String | emailId
String participantId = "participantId_example"; // String | participantId
Boolean provisional = false; // Boolean | Indicates if the wrap-up code is provisional.
try {
    Wrapup result = apiInstance.getConversationsEmailParticipantWrapup(emailId, participantId, provisional);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsEmailParticipantWrapup");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **emailId** | **String**| emailId | |
| **participantId** | **String**| participantId | |
| **provisional** | **Boolean**| Indicates if the wrap-up code is provisional. | [optional] [default to false] |
{: class="table table-striped"}

### Return type

[**Wrapup**](Wrapup.html)

<a name="getConversationsEmailParticipantWrapupcodes"></a>

# **getConversationsEmailParticipantWrapupcodes**

> [List&lt;WrapupCode&gt;](WrapupCode.html) getConversationsEmailParticipantWrapupcodes(emailId, participantId)

Get list of wrapup codes for this conversation participant



Wraps GET /api/v2/conversations/emails/{emailId}/participants/{participantId}/wrapupcodes  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String emailId = "emailId_example"; // String | emailId
String participantId = "participantId_example"; // String | participantId
try {
    List<WrapupCode> result = apiInstance.getConversationsEmailParticipantWrapupcodes(emailId, participantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsEmailParticipantWrapupcodes");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **emailId** | **String**| emailId | |
| **participantId** | **String**| participantId | |
{: class="table table-striped"}

### Return type

[**List&lt;WrapupCode&gt;**](WrapupCode.html)

<a name="getConversationsEmails"></a>

# **getConversationsEmails**

> [EmailConversationEntityListing](EmailConversationEntityListing.html) getConversationsEmails()

Get recent email conversations



Wraps GET /api/v2/conversations/emails  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
try {
    EmailConversationEntityListing result = apiInstance.getConversationsEmails();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsEmails");
    e.printStackTrace();
}
~~~

### Parameters

This endpoint does not require any parameters.
{: class="table table-striped"}

### Return type

[**EmailConversationEntityListing**](EmailConversationEntityListing.html)

<a name="patchConversationParticipant"></a>

# **patchConversationParticipant**

> Void patchConversationParticipant(conversationId, participantId, body)

Update a participant.

Update conversation participant.

Wraps PATCH /api/v2/conversations/{conversationId}/participants/{participantId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
String participantId = "participantId_example"; // String | participant ID
MediaParticipantRequest body = new MediaParticipantRequest(); // MediaParticipantRequest | Update request
try {
    apiInstance.patchConversationParticipant(conversationId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationParticipant");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversation ID | |
| **participantId** | **String**| participant ID | |
| **body** | [**MediaParticipantRequest**](MediaParticipantRequest.html)| Update request | |
{: class="table table-striped"}

### Return type

null (empty response body)

<a name="patchConversationParticipantAttributes"></a>

# **patchConversationParticipantAttributes**

> Void patchConversationParticipantAttributes(conversationId, participantId, body)

Update the attributes on a conversation participant.



Wraps PATCH /api/v2/conversations/{conversationId}/participants/{participantId}/attributes  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
String participantId = "participantId_example"; // String | participant ID
ParticipantAttributes body = new ParticipantAttributes(); // ParticipantAttributes | Participant attributes
try {
    apiInstance.patchConversationParticipantAttributes(conversationId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationParticipantAttributes");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversation ID | |
| **participantId** | **String**| participant ID | |
| **body** | [**ParticipantAttributes**](ParticipantAttributes.html)| Participant attributes | |
{: class="table table-striped"}

### Return type

null (empty response body)

<a name="patchConversationsCall"></a>

# **patchConversationsCall**

> [Conversation](Conversation.html) patchConversationsCall(callId, body)

Update a conversation by setting it&#39;s recording state, merging in other conversations to create a conference, or disconnecting all of the participants



Wraps PATCH /api/v2/conversations/calls/{callId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String callId = "callId_example"; // String | callId
Conversation body = new Conversation(); // Conversation | Conversation
try {
    Conversation result = apiInstance.patchConversationsCall(callId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsCall");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **callId** | **String**| callId | |
| **body** | [**Conversation**](Conversation.html)| Conversation | |
{: class="table table-striped"}

### Return type

[**Conversation**](Conversation.html)

<a name="patchConversationsCallParticipant"></a>

# **patchConversationsCallParticipant**

> Void patchConversationsCallParticipant(callId, participantId, body)

Update conversation participant



Wraps PATCH /api/v2/conversations/calls/{callId}/participants/{participantId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String callId = "callId_example"; // String | callId
String participantId = "participantId_example"; // String | participantId
MediaParticipantRequest body = new MediaParticipantRequest(); // MediaParticipantRequest | Participant request
try {
    apiInstance.patchConversationsCallParticipant(callId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsCallParticipant");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **callId** | **String**| callId | |
| **participantId** | **String**| participantId | |
| **body** | [**MediaParticipantRequest**](MediaParticipantRequest.html)| Participant request | |
{: class="table table-striped"}

### Return type

null (empty response body)

<a name="patchConversationsCallParticipantAttributes"></a>

# **patchConversationsCallParticipantAttributes**

> Void patchConversationsCallParticipantAttributes(callId, participantId, body)

Update the attributes on a conversation participant.



Wraps PATCH /api/v2/conversations/calls/{callId}/participants/{participantId}/attributes  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String callId = "callId_example"; // String | callId
String participantId = "participantId_example"; // String | participantId
ParticipantAttributes body = new ParticipantAttributes(); // ParticipantAttributes | Participant attributes
try {
    apiInstance.patchConversationsCallParticipantAttributes(callId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsCallParticipantAttributes");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **callId** | **String**| callId | |
| **participantId** | **String**| participantId | |
| **body** | [**ParticipantAttributes**](ParticipantAttributes.html)| Participant attributes | |
{: class="table table-striped"}

### Return type

null (empty response body)

<a name="patchConversationsCallParticipantCommunication"></a>

# **patchConversationsCallParticipantCommunication**

> [Empty](Empty.html) patchConversationsCallParticipantCommunication(callId, participantId, communicationId, body)

Update conversation participant&#39;s communication by disconnecting it.



Wraps PATCH /api/v2/conversations/calls/{callId}/participants/{participantId}/communications/{communicationId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String callId = "callId_example"; // String | callId
String participantId = "participantId_example"; // String | participantId
String communicationId = "communicationId_example"; // String | communicationId
MediaParticipantRequest body = new MediaParticipantRequest(); // MediaParticipantRequest | Participant
try {
    Empty result = apiInstance.patchConversationsCallParticipantCommunication(callId, participantId, communicationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsCallParticipantCommunication");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **callId** | **String**| callId | |
| **participantId** | **String**| participantId | |
| **communicationId** | **String**| communicationId | |
| **body** | [**MediaParticipantRequest**](MediaParticipantRequest.html)| Participant | |
{: class="table table-striped"}

### Return type

[**Empty**](Empty.html)

<a name="patchConversationsCallParticipantConsult"></a>

# **patchConversationsCallParticipantConsult**

> [ConsultTransferResponse](ConsultTransferResponse.html) patchConversationsCallParticipantConsult(callId, participantId, body)

Change who can speak



Wraps PATCH /api/v2/conversations/calls/{callId}/participants/{participantId}/consult  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String callId = "callId_example"; // String | callId
String participantId = "participantId_example"; // String | participantId
ConsultTransferUpdate body = new ConsultTransferUpdate(); // ConsultTransferUpdate | new speak to
try {
    ConsultTransferResponse result = apiInstance.patchConversationsCallParticipantConsult(callId, participantId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsCallParticipantConsult");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **callId** | **String**| callId | |
| **participantId** | **String**| participantId | |
| **body** | [**ConsultTransferUpdate**](ConsultTransferUpdate.html)| new speak to | |
{: class="table table-striped"}

### Return type

[**ConsultTransferResponse**](ConsultTransferResponse.html)

<a name="patchConversationsCallback"></a>

# **patchConversationsCallback**

> [Conversation](Conversation.html) patchConversationsCallback(callbackId, body)

Update a conversation by disconnecting all of the participants



Wraps PATCH /api/v2/conversations/callbacks/{callbackId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String callbackId = "callbackId_example"; // String | callbackId
Conversation body = new Conversation(); // Conversation | Conversation
try {
    Conversation result = apiInstance.patchConversationsCallback(callbackId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsCallback");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **callbackId** | **String**| callbackId | |
| **body** | [**Conversation**](Conversation.html)| Conversation | |
{: class="table table-striped"}

### Return type

[**Conversation**](Conversation.html)

<a name="patchConversationsCallbackParticipant"></a>

# **patchConversationsCallbackParticipant**

> Void patchConversationsCallbackParticipant(callbackId, participantId, body)

Update conversation participant



Wraps PATCH /api/v2/conversations/callbacks/{callbackId}/participants/{participantId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String callbackId = "callbackId_example"; // String | callbackId
String participantId = "participantId_example"; // String | participantId
MediaParticipantRequest body = new MediaParticipantRequest(); // MediaParticipantRequest | Participant
try {
    apiInstance.patchConversationsCallbackParticipant(callbackId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsCallbackParticipant");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **callbackId** | **String**| callbackId | |
| **participantId** | **String**| participantId | |
| **body** | [**MediaParticipantRequest**](MediaParticipantRequest.html)| Participant | |
{: class="table table-striped"}

### Return type

null (empty response body)

<a name="patchConversationsCallbackParticipantAttributes"></a>

# **patchConversationsCallbackParticipantAttributes**

> Void patchConversationsCallbackParticipantAttributes(callbackId, participantId, body)

Update the attributes on a conversation participant.



Wraps PATCH /api/v2/conversations/callbacks/{callbackId}/participants/{participantId}/attributes  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String callbackId = "callbackId_example"; // String | callbackId
String participantId = "participantId_example"; // String | participantId
ParticipantAttributes body = new ParticipantAttributes(); // ParticipantAttributes | Attributes
try {
    apiInstance.patchConversationsCallbackParticipantAttributes(callbackId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsCallbackParticipantAttributes");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **callbackId** | **String**| callbackId | |
| **participantId** | **String**| participantId | |
| **body** | [**ParticipantAttributes**](ParticipantAttributes.html)| Attributes | |
{: class="table table-striped"}

### Return type

null (empty response body)

<a name="patchConversationsCallbackParticipantCommunication"></a>

# **patchConversationsCallbackParticipantCommunication**

> [Empty](Empty.html) patchConversationsCallbackParticipantCommunication(callbackId, participantId, communicationId, body)

Update conversation participant&#39;s communication by disconnecting it.



Wraps PATCH /api/v2/conversations/callbacks/{callbackId}/participants/{participantId}/communications/{communicationId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String callbackId = "callbackId_example"; // String | callbackId
String participantId = "participantId_example"; // String | participantId
String communicationId = "communicationId_example"; // String | communicationId
MediaParticipantRequest body = new MediaParticipantRequest(); // MediaParticipantRequest | Participant
try {
    Empty result = apiInstance.patchConversationsCallbackParticipantCommunication(callbackId, participantId, communicationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsCallbackParticipantCommunication");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **callbackId** | **String**| callbackId | |
| **participantId** | **String**| participantId | |
| **communicationId** | **String**| communicationId | |
| **body** | [**MediaParticipantRequest**](MediaParticipantRequest.html)| Participant | |
{: class="table table-striped"}

### Return type

[**Empty**](Empty.html)

<a name="patchConversationsChat"></a>

# **patchConversationsChat**

> [Conversation](Conversation.html) patchConversationsChat(chatId, body)

Update a conversation by disconnecting all of the participants



Wraps PATCH /api/v2/conversations/chats/{chatId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String chatId = "chatId_example"; // String | chatId
Conversation body = new Conversation(); // Conversation | Conversation
try {
    Conversation result = apiInstance.patchConversationsChat(chatId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsChat");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **chatId** | **String**| chatId | |
| **body** | [**Conversation**](Conversation.html)| Conversation | |
{: class="table table-striped"}

### Return type

[**Conversation**](Conversation.html)

<a name="patchConversationsChatParticipant"></a>

# **patchConversationsChatParticipant**

> Void patchConversationsChatParticipant(chatId, participantId, body)

Update conversation participant



Wraps PATCH /api/v2/conversations/chats/{chatId}/participants/{participantId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String chatId = "chatId_example"; // String | chatId
String participantId = "participantId_example"; // String | participantId
MediaParticipantRequest body = new MediaParticipantRequest(); // MediaParticipantRequest | Update request
try {
    apiInstance.patchConversationsChatParticipant(chatId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsChatParticipant");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **chatId** | **String**| chatId | |
| **participantId** | **String**| participantId | |
| **body** | [**MediaParticipantRequest**](MediaParticipantRequest.html)| Update request | |
{: class="table table-striped"}

### Return type

null (empty response body)

<a name="patchConversationsChatParticipantAttributes"></a>

# **patchConversationsChatParticipantAttributes**

> Void patchConversationsChatParticipantAttributes(chatId, participantId, body)

Update the attributes on a conversation participant.



Wraps PATCH /api/v2/conversations/chats/{chatId}/participants/{participantId}/attributes  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String chatId = "chatId_example"; // String | chatId
String participantId = "participantId_example"; // String | participantId
ParticipantAttributes body = new ParticipantAttributes(); // ParticipantAttributes | Participant attributes
try {
    apiInstance.patchConversationsChatParticipantAttributes(chatId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsChatParticipantAttributes");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **chatId** | **String**| chatId | |
| **participantId** | **String**| participantId | |
| **body** | [**ParticipantAttributes**](ParticipantAttributes.html)| Participant attributes | |
{: class="table table-striped"}

### Return type

null (empty response body)

<a name="patchConversationsChatParticipantCommunication"></a>

# **patchConversationsChatParticipantCommunication**

> [Empty](Empty.html) patchConversationsChatParticipantCommunication(chatId, participantId, communicationId, body)

Update conversation participant&#39;s communication by disconnecting it.



Wraps PATCH /api/v2/conversations/chats/{chatId}/participants/{participantId}/communications/{communicationId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String chatId = "chatId_example"; // String | chatId
String participantId = "participantId_example"; // String | participantId
String communicationId = "communicationId_example"; // String | communicationId
MediaParticipantRequest body = new MediaParticipantRequest(); // MediaParticipantRequest | Participant
try {
    Empty result = apiInstance.patchConversationsChatParticipantCommunication(chatId, participantId, communicationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsChatParticipantCommunication");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **chatId** | **String**| chatId | |
| **participantId** | **String**| participantId | |
| **communicationId** | **String**| communicationId | |
| **body** | [**MediaParticipantRequest**](MediaParticipantRequest.html)| Participant | |
{: class="table table-striped"}

### Return type

[**Empty**](Empty.html)

<a name="patchConversationsCobrowsesession"></a>

# **patchConversationsCobrowsesession**

> [Conversation](Conversation.html) patchConversationsCobrowsesession(cobrowseId, body)

Update a conversation by disconnecting all of the participants



Wraps PATCH /api/v2/conversations/cobrowsesessions/{cobrowseId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String cobrowseId = "cobrowseId_example"; // String | cobrowseId
Conversation body = new Conversation(); // Conversation | Conversation
try {
    Conversation result = apiInstance.patchConversationsCobrowsesession(cobrowseId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsCobrowsesession");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cobrowseId** | **String**| cobrowseId | |
| **body** | [**Conversation**](Conversation.html)| Conversation | |
{: class="table table-striped"}

### Return type

[**Conversation**](Conversation.html)

<a name="patchConversationsCobrowsesessionParticipant"></a>

# **patchConversationsCobrowsesessionParticipant**

> Void patchConversationsCobrowsesessionParticipant(cobrowseId, participantId, body)

Update conversation participant



Wraps PATCH /api/v2/conversations/cobrowsesessions/{cobrowseId}/participants/{participantId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String cobrowseId = "cobrowseId_example"; // String | cobrowseId
String participantId = "participantId_example"; // String | participantId
MediaParticipantRequest body = new MediaParticipantRequest(); // MediaParticipantRequest | 
try {
    apiInstance.patchConversationsCobrowsesessionParticipant(cobrowseId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsCobrowsesessionParticipant");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cobrowseId** | **String**| cobrowseId | |
| **participantId** | **String**| participantId | |
| **body** | [**MediaParticipantRequest**](MediaParticipantRequest.html)|  | [optional] |
{: class="table table-striped"}

### Return type

null (empty response body)

<a name="patchConversationsCobrowsesessionParticipantAttributes"></a>

# **patchConversationsCobrowsesessionParticipantAttributes**

> Void patchConversationsCobrowsesessionParticipantAttributes(cobrowseId, participantId, body)

Update the attributes on a conversation participant.



Wraps PATCH /api/v2/conversations/cobrowsesessions/{cobrowseId}/participants/{participantId}/attributes  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String cobrowseId = "cobrowseId_example"; // String | cobrowseId
String participantId = "participantId_example"; // String | participantId
ParticipantAttributes body = new ParticipantAttributes(); // ParticipantAttributes | 
try {
    apiInstance.patchConversationsCobrowsesessionParticipantAttributes(cobrowseId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsCobrowsesessionParticipantAttributes");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cobrowseId** | **String**| cobrowseId | |
| **participantId** | **String**| participantId | |
| **body** | [**ParticipantAttributes**](ParticipantAttributes.html)|  | [optional] |
{: class="table table-striped"}

### Return type

null (empty response body)

<a name="patchConversationsCobrowsesessionParticipantCommunication"></a>

# **patchConversationsCobrowsesessionParticipantCommunication**

> [Empty](Empty.html) patchConversationsCobrowsesessionParticipantCommunication(cobrowseId, participantId, communicationId, body)

Update conversation participant&#39;s communication by disconnecting it.



Wraps PATCH /api/v2/conversations/cobrowsesessions/{cobrowseId}/participants/{participantId}/communications/{communicationId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String cobrowseId = "cobrowseId_example"; // String | cobrowseId
String participantId = "participantId_example"; // String | participantId
String communicationId = "communicationId_example"; // String | communicationId
MediaParticipantRequest body = new MediaParticipantRequest(); // MediaParticipantRequest | Participant
try {
    Empty result = apiInstance.patchConversationsCobrowsesessionParticipantCommunication(cobrowseId, participantId, communicationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsCobrowsesessionParticipantCommunication");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cobrowseId** | **String**| cobrowseId | |
| **participantId** | **String**| participantId | |
| **communicationId** | **String**| communicationId | |
| **body** | [**MediaParticipantRequest**](MediaParticipantRequest.html)| Participant | |
{: class="table table-striped"}

### Return type

[**Empty**](Empty.html)

<a name="patchConversationsEmail"></a>

# **patchConversationsEmail**

> [Conversation](Conversation.html) patchConversationsEmail(emailId, body)

Update a conversation by disconnecting all of the participants



Wraps PATCH /api/v2/conversations/emails/{emailId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String emailId = "emailId_example"; // String | emailId
Conversation body = new Conversation(); // Conversation | Conversation
try {
    Conversation result = apiInstance.patchConversationsEmail(emailId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsEmail");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **emailId** | **String**| emailId | |
| **body** | [**Conversation**](Conversation.html)| Conversation | |
{: class="table table-striped"}

### Return type

[**Conversation**](Conversation.html)

<a name="patchConversationsEmailParticipant"></a>

# **patchConversationsEmailParticipant**

> Void patchConversationsEmailParticipant(emailId, participantId, body)

Update conversation participant



Wraps PATCH /api/v2/conversations/emails/{emailId}/participants/{participantId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String emailId = "emailId_example"; // String | emailId
String participantId = "participantId_example"; // String | participantId
MediaParticipantRequest body = new MediaParticipantRequest(); // MediaParticipantRequest | Update request
try {
    apiInstance.patchConversationsEmailParticipant(emailId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsEmailParticipant");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **emailId** | **String**| emailId | |
| **participantId** | **String**| participantId | |
| **body** | [**MediaParticipantRequest**](MediaParticipantRequest.html)| Update request | |
{: class="table table-striped"}

### Return type

null (empty response body)

<a name="patchConversationsEmailParticipantAttributes"></a>

# **patchConversationsEmailParticipantAttributes**

> Void patchConversationsEmailParticipantAttributes(emailId, participantId, body)

Update the attributes on a conversation participant.



Wraps PATCH /api/v2/conversations/emails/{emailId}/participants/{participantId}/attributes  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String emailId = "emailId_example"; // String | emailId
String participantId = "participantId_example"; // String | participantId
ParticipantAttributes body = new ParticipantAttributes(); // ParticipantAttributes | Participant attributes
try {
    apiInstance.patchConversationsEmailParticipantAttributes(emailId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsEmailParticipantAttributes");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **emailId** | **String**| emailId | |
| **participantId** | **String**| participantId | |
| **body** | [**ParticipantAttributes**](ParticipantAttributes.html)| Participant attributes | |
{: class="table table-striped"}

### Return type

null (empty response body)

<a name="patchConversationsEmailParticipantCommunication"></a>

# **patchConversationsEmailParticipantCommunication**

> [Empty](Empty.html) patchConversationsEmailParticipantCommunication(emailId, participantId, communicationId, body)

Update conversation participant&#39;s communication by disconnecting it.



Wraps PATCH /api/v2/conversations/emails/{emailId}/participants/{participantId}/communications/{communicationId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String emailId = "emailId_example"; // String | emailId
String participantId = "participantId_example"; // String | participantId
String communicationId = "communicationId_example"; // String | communicationId
MediaParticipantRequest body = new MediaParticipantRequest(); // MediaParticipantRequest | Participant
try {
    Empty result = apiInstance.patchConversationsEmailParticipantCommunication(emailId, participantId, communicationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsEmailParticipantCommunication");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **emailId** | **String**| emailId | |
| **participantId** | **String**| participantId | |
| **communicationId** | **String**| communicationId | |
| **body** | [**MediaParticipantRequest**](MediaParticipantRequest.html)| Participant | |
{: class="table table-striped"}

### Return type

[**Empty**](Empty.html)

<a name="postAnalyticsConversationDetailsProperties"></a>

# **postAnalyticsConversationDetailsProperties**

> [PropertyIndexRequest](PropertyIndexRequest.html) postAnalyticsConversationDetailsProperties(conversationId, body)

Index conversation properties



Wraps POST /api/v2/analytics/conversations/{conversationId}/details/properties  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
PropertyIndexRequest body = new PropertyIndexRequest(); // PropertyIndexRequest | request
try {
    PropertyIndexRequest result = apiInstance.postAnalyticsConversationDetailsProperties(conversationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postAnalyticsConversationDetailsProperties");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | |
| **body** | [**PropertyIndexRequest**](PropertyIndexRequest.html)| request | |
{: class="table table-striped"}

### Return type

[**PropertyIndexRequest**](PropertyIndexRequest.html)

<a name="postAnalyticsConversationsAggregatesQuery"></a>

# **postAnalyticsConversationsAggregatesQuery**

> [AggregateQueryResponse](AggregateQueryResponse.html) postAnalyticsConversationsAggregatesQuery(body)

Query for conversation aggregates



Wraps POST /api/v2/analytics/conversations/aggregates/query  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
AggregationQuery body = new AggregationQuery(); // AggregationQuery | query
try {
    AggregateQueryResponse result = apiInstance.postAnalyticsConversationsAggregatesQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postAnalyticsConversationsAggregatesQuery");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**AggregationQuery**](AggregationQuery.html)| query | |
{: class="table table-striped"}

### Return type

[**AggregateQueryResponse**](AggregateQueryResponse.html)

<a name="postAnalyticsConversationsDetailsQuery"></a>

# **postAnalyticsConversationsDetailsQuery**

> [AnalyticsConversationQueryResponse](AnalyticsConversationQueryResponse.html) postAnalyticsConversationsDetailsQuery(body)

Query for conversation details



Wraps POST /api/v2/analytics/conversations/details/query  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
ConversationQuery body = new ConversationQuery(); // ConversationQuery | query
try {
    AnalyticsConversationQueryResponse result = apiInstance.postAnalyticsConversationsDetailsQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postAnalyticsConversationsDetailsQuery");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**ConversationQuery**](ConversationQuery.html)| query | |
{: class="table table-striped"}

### Return type

[**AnalyticsConversationQueryResponse**](AnalyticsConversationQueryResponse.html)

<a name="postConversationParticipantCallbacks"></a>

# **postConversationParticipantCallbacks**

> Void postConversationParticipantCallbacks(conversationId, participantId, body)

Create a new callback for the specified participant on the conversation.



Wraps POST /api/v2/conversations/{conversationId}/participants/{participantId}/callbacks  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
String participantId = "participantId_example"; // String | participant ID
CreateCallbackCommand body = new CreateCallbackCommand(); // CreateCallbackCommand | 
try {
    apiInstance.postConversationParticipantCallbacks(conversationId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationParticipantCallbacks");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversation ID | |
| **participantId** | **String**| participant ID | |
| **body** | [**CreateCallbackCommand**](CreateCallbackCommand.html)|  | [optional] |
{: class="table table-striped"}

### Return type

null (empty response body)

<a name="postConversationParticipantReplace"></a>

# **postConversationParticipantReplace**

> Void postConversationParticipantReplace(conversationId, participantId, body)

Replace this participant with the specified user and/or address



Wraps POST /api/v2/conversations/{conversationId}/participants/{participantId}/replace  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
String participantId = "participantId_example"; // String | participant ID
TransferRequest body = new TransferRequest(); // TransferRequest | Transfer request
try {
    apiInstance.postConversationParticipantReplace(conversationId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationParticipantReplace");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversation ID | |
| **participantId** | **String**| participant ID | |
| **body** | [**TransferRequest**](TransferRequest.html)| Transfer request | |
{: class="table table-striped"}

### Return type

null (empty response body)

<a name="postConversationsCall"></a>

# **postConversationsCall**

> [Conversation](Conversation.html) postConversationsCall(callId, body)

Add a new call to a conversation



Wraps POST /api/v2/conversations/calls/{callId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String callId = "callId_example"; // String | callId
CallCommand body = new CallCommand(); // CallCommand | Conversation
try {
    Conversation result = apiInstance.postConversationsCall(callId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsCall");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **callId** | **String**| callId | |
| **body** | [**CallCommand**](CallCommand.html)| Conversation | |
{: class="table table-striped"}

### Return type

[**Conversation**](Conversation.html)

<a name="postConversationsCallParticipantConsult"></a>

# **postConversationsCallParticipantConsult**

> [ConsultTransferResponse](ConsultTransferResponse.html) postConversationsCallParticipantConsult(callId, participantId, body)

Initiate and update consult transfer



Wraps POST /api/v2/conversations/calls/{callId}/participants/{participantId}/consult  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String callId = "callId_example"; // String | callId
String participantId = "participantId_example"; // String | participantId
ConsultTransfer body = new ConsultTransfer(); // ConsultTransfer | Destination address & initial speak to
try {
    ConsultTransferResponse result = apiInstance.postConversationsCallParticipantConsult(callId, participantId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsCallParticipantConsult");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **callId** | **String**| callId | |
| **participantId** | **String**| participantId | |
| **body** | [**ConsultTransfer**](ConsultTransfer.html)| Destination address &amp; initial speak to | |
{: class="table table-striped"}

### Return type

[**ConsultTransferResponse**](ConsultTransferResponse.html)

<a name="postConversationsCallParticipantMonitor"></a>

# **postConversationsCallParticipantMonitor**

> Void postConversationsCallParticipantMonitor(callId, participantId)

Listen in on the conversation from the point of view of a given participant.



Wraps POST /api/v2/conversations/calls/{callId}/participants/{participantId}/monitor  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String callId = "callId_example"; // String | callId
String participantId = "participantId_example"; // String | participantId
try {
    apiInstance.postConversationsCallParticipantMonitor(callId, participantId);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsCallParticipantMonitor");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **callId** | **String**| callId | |
| **participantId** | **String**| participantId | |
{: class="table table-striped"}

### Return type

null (empty response body)

<a name="postConversationsCallParticipantReplace"></a>

# **postConversationsCallParticipantReplace**

> Void postConversationsCallParticipantReplace(callId, participantId, body)

Replace this participant with the specified user and/or address



Wraps POST /api/v2/conversations/calls/{callId}/participants/{participantId}/replace  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String callId = "callId_example"; // String | callId
String participantId = "participantId_example"; // String | participantId
TransferRequest body = new TransferRequest(); // TransferRequest | Transfer request
try {
    apiInstance.postConversationsCallParticipantReplace(callId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsCallParticipantReplace");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **callId** | **String**| callId | |
| **participantId** | **String**| participantId | |
| **body** | [**TransferRequest**](TransferRequest.html)| Transfer request | |
{: class="table table-striped"}

### Return type

null (empty response body)

<a name="postConversationsCallParticipants"></a>

# **postConversationsCallParticipants**

> [Conversation](Conversation.html) postConversationsCallParticipants(callId, body)

Add participants to a conversation



Wraps POST /api/v2/conversations/calls/{callId}/participants  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String callId = "callId_example"; // String | callId
Conversation body = new Conversation(); // Conversation | Conversation
try {
    Conversation result = apiInstance.postConversationsCallParticipants(callId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsCallParticipants");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **callId** | **String**| callId | |
| **body** | [**Conversation**](Conversation.html)| Conversation | |
{: class="table table-striped"}

### Return type

[**Conversation**](Conversation.html)

<a name="postConversationsCallbackParticipantReplace"></a>

# **postConversationsCallbackParticipantReplace**

> Void postConversationsCallbackParticipantReplace(callbackId, participantId, body)

Replace this participant with the specified user and/or address



Wraps POST /api/v2/conversations/callbacks/{callbackId}/participants/{participantId}/replace  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String callbackId = "callbackId_example"; // String | callbackId
String participantId = "participantId_example"; // String | participantId
TransferRequest body = new TransferRequest(); // TransferRequest | Transfer request
try {
    apiInstance.postConversationsCallbackParticipantReplace(callbackId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsCallbackParticipantReplace");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **callbackId** | **String**| callbackId | |
| **participantId** | **String**| participantId | |
| **body** | [**TransferRequest**](TransferRequest.html)| Transfer request | |
{: class="table table-striped"}

### Return type

null (empty response body)

<a name="postConversationsCallbacks"></a>

# **postConversationsCallbacks**

> [CreateCallbackResponse](CreateCallbackResponse.html) postConversationsCallbacks(body)

Create a Callback



Wraps POST /api/v2/conversations/callbacks  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
CreateCallbackCommand body = new CreateCallbackCommand(); // CreateCallbackCommand | Callback
try {
    CreateCallbackResponse result = apiInstance.postConversationsCallbacks(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsCallbacks");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**CreateCallbackCommand**](CreateCallbackCommand.html)| Callback | |
{: class="table table-striped"}

### Return type

[**CreateCallbackResponse**](CreateCallbackResponse.html)

<a name="postConversationsCalls"></a>

# **postConversationsCalls**

> [CreateCallResponse](CreateCallResponse.html) postConversationsCalls(body)

Create a call conversation



Wraps POST /api/v2/conversations/calls  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
CreateCallRequest body = new CreateCallRequest(); // CreateCallRequest | Call request
try {
    CreateCallResponse result = apiInstance.postConversationsCalls(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsCalls");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**CreateCallRequest**](CreateCallRequest.html)| Call request | |
{: class="table table-striped"}

### Return type

[**CreateCallResponse**](CreateCallResponse.html)

<a name="postConversationsChatParticipantReplace"></a>

# **postConversationsChatParticipantReplace**

> Void postConversationsChatParticipantReplace(chatId, participantId, body)

Replace this participant with the specified user and/or address



Wraps POST /api/v2/conversations/chats/{chatId}/participants/{participantId}/replace  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String chatId = "chatId_example"; // String | chatId
String participantId = "participantId_example"; // String | participantId
TransferRequest body = new TransferRequest(); // TransferRequest | Transfer request
try {
    apiInstance.postConversationsChatParticipantReplace(chatId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsChatParticipantReplace");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **chatId** | **String**| chatId | |
| **participantId** | **String**| participantId | |
| **body** | [**TransferRequest**](TransferRequest.html)| Transfer request | |
{: class="table table-striped"}

### Return type

null (empty response body)

<a name="postConversationsChats"></a>

# **postConversationsChats**

> [ChatConversation](ChatConversation.html) postConversationsChats(body)

Create a web chat conversation



Wraps POST /api/v2/conversations/chats  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
CreateWebChatRequest body = new CreateWebChatRequest(); // CreateWebChatRequest | Create web chat request
try {
    ChatConversation result = apiInstance.postConversationsChats(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsChats");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**CreateWebChatRequest**](CreateWebChatRequest.html)| Create web chat request | |
{: class="table table-striped"}

### Return type

[**ChatConversation**](ChatConversation.html)

<a name="postConversationsCobrowsesessionParticipantReplace"></a>

# **postConversationsCobrowsesessionParticipantReplace**

> Void postConversationsCobrowsesessionParticipantReplace(cobrowseId, participantId, body)

Replace this participant with the specified user and/or address



Wraps POST /api/v2/conversations/cobrowsesessions/{cobrowseId}/participants/{participantId}/replace  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String cobrowseId = "cobrowseId_example"; // String | cobrowseId
String participantId = "participantId_example"; // String | participantId
TransferRequest body = new TransferRequest(); // TransferRequest | 
try {
    apiInstance.postConversationsCobrowsesessionParticipantReplace(cobrowseId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsCobrowsesessionParticipantReplace");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cobrowseId** | **String**| cobrowseId | |
| **participantId** | **String**| participantId | |
| **body** | [**TransferRequest**](TransferRequest.html)|  | [optional] |
{: class="table table-striped"}

### Return type

null (empty response body)

<a name="postConversationsEmailMessages"></a>

# **postConversationsEmailMessages**

> [EmailMessage](EmailMessage.html) postConversationsEmailMessages(emailId, body)

Send an email reply



Wraps POST /api/v2/conversations/emails/{emailId}/messages  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String emailId = "emailId_example"; // String | emailId
EmailMessage body = new EmailMessage(); // EmailMessage | Reply
try {
    EmailMessage result = apiInstance.postConversationsEmailMessages(emailId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsEmailMessages");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **emailId** | **String**| emailId | |
| **body** | [**EmailMessage**](EmailMessage.html)| Reply | |
{: class="table table-striped"}

### Return type

[**EmailMessage**](EmailMessage.html)

<a name="postConversationsEmailParticipantReplace"></a>

# **postConversationsEmailParticipantReplace**

> Void postConversationsEmailParticipantReplace(emailId, participantId, body)

Replace this participant with the specified user and/or address



Wraps POST /api/v2/conversations/emails/{emailId}/participants/{participantId}/replace  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String emailId = "emailId_example"; // String | emailId
String participantId = "participantId_example"; // String | participantId
TransferRequest body = new TransferRequest(); // TransferRequest | Transfer request
try {
    apiInstance.postConversationsEmailParticipantReplace(emailId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsEmailParticipantReplace");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **emailId** | **String**| emailId | |
| **participantId** | **String**| participantId | |
| **body** | [**TransferRequest**](TransferRequest.html)| Transfer request | |
{: class="table table-striped"}

### Return type

null (empty response body)

<a name="postConversationsEmails"></a>

# **postConversationsEmails**

> [EmailConversation](EmailConversation.html) postConversationsEmails(body)

Create an email conversation



Wraps POST /api/v2/conversations/emails  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
CreateEmailRequest body = new CreateEmailRequest(); // CreateEmailRequest | Create email request
try {
    EmailConversation result = apiInstance.postConversationsEmails(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsEmails");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**CreateEmailRequest**](CreateEmailRequest.html)| Create email request | |
{: class="table table-striped"}

### Return type

[**EmailConversation**](EmailConversation.html)

<a name="postConversationsFaxes"></a>

# **postConversationsFaxes**

> [FaxSendResponse](FaxSendResponse.html) postConversationsFaxes(body)

Create Fax Conversation



Wraps POST /api/v2/conversations/faxes  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
FaxSendRequest body = new FaxSendRequest(); // FaxSendRequest | Fax
try {
    FaxSendResponse result = apiInstance.postConversationsFaxes(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsFaxes");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**FaxSendRequest**](FaxSendRequest.html)| Fax | |
{: class="table table-striped"}

### Return type

[**FaxSendResponse**](FaxSendResponse.html)

<a name="putConversationsEmailMessagesDraft"></a>

# **putConversationsEmailMessagesDraft**

> [EmailMessage](EmailMessage.html) putConversationsEmailMessagesDraft(emailId, body)

Update conversation draft reply



Wraps PUT /api/v2/conversations/emails/{emailId}/messages/draft  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String emailId = "emailId_example"; // String | emailId
EmailMessage body = new EmailMessage(); // EmailMessage | Draft
try {
    EmailMessage result = apiInstance.putConversationsEmailMessagesDraft(emailId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#putConversationsEmailMessagesDraft");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **emailId** | **String**| emailId | |
| **body** | [**EmailMessage**](EmailMessage.html)| Draft | |
{: class="table table-striped"}

### Return type

[**EmailMessage**](EmailMessage.html)

