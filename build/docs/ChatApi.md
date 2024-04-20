---
title: ChatApi
---
## ChatApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteChatsRoomMessage**](ChatApi.html#deleteChatsRoomMessage) | Delete a message in a room |
| [**deleteChatsRoomMessagesPin**](ChatApi.html#deleteChatsRoomMessagesPin) | Remove a pinned message from a room |
| [**deleteChatsRoomParticipant**](ChatApi.html#deleteChatsRoomParticipant) | Remove a user from a room. |
| [**deleteChatsUserMessage**](ChatApi.html#deleteChatsUserMessage) | Delete a message to a user |
| [**deleteChatsUserMessagesPin**](ChatApi.html#deleteChatsUserMessagesPin) | Remove a pinned message from a 1on1 |
| [**getChatsMessage**](ChatApi.html#getChatsMessage) | Get a message |
| [**getChatsRoom**](ChatApi.html#getChatsRoom) | Get a room |
| [**getChatsRoomMessage**](ChatApi.html#getChatsRoomMessage) | Get messages by id(s) from a room |
| [**getChatsRoomMessages**](ChatApi.html#getChatsRoomMessages) | Get a room's message history |
| [**getChatsRoomParticipant**](ChatApi.html#getChatsRoomParticipant) | Get a room participant |
| [**getChatsRoomParticipants**](ChatApi.html#getChatsRoomParticipants) | Get room participants in a room |
| [**getChatsSettings**](ChatApi.html#getChatsSettings) | Get Chat Settings. |
| [**getChatsThreadMessages**](ChatApi.html#getChatsThreadMessages) | Get history by thread |
| [**getChatsUser**](ChatApi.html#getChatsUser) | Get information for a 1on1 |
| [**getChatsUserMessage**](ChatApi.html#getChatsUserMessage) | Get messages by id(s) from a 1on1 |
| [**getChatsUserMessages**](ChatApi.html#getChatsUserMessages) | Get 1on1 History between a user |
| [**getChatsUserSettings**](ChatApi.html#getChatsUserSettings) | Get a user's chat settings |
| [**patchChatsRoom**](ChatApi.html#patchChatsRoom) | Set properties for a room |
| [**patchChatsRoomMessage**](ChatApi.html#patchChatsRoomMessage) | Edit a message in a room |
| [**patchChatsSettings**](ChatApi.html#patchChatsSettings) | Patch Chat Settings. |
| [**patchChatsUserMessage**](ChatApi.html#patchChatsUserMessage) | Edit a message to a user |
| [**patchChatsUserSettings**](ChatApi.html#patchChatsUserSettings) | Update a user's chat settings |
| [**postChatsRoomMessages**](ChatApi.html#postChatsRoomMessages) | Send a message to a room |
| [**postChatsRoomMessagesPins**](ChatApi.html#postChatsRoomMessagesPins) | Add pinned messages for a room, up to a maximum of 5 pinned messages |
| [**postChatsRoomParticipant**](ChatApi.html#postChatsRoomParticipant) | Join a room |
| [**postChatsRooms**](ChatApi.html#postChatsRooms) | Create an adhoc room |
| [**postChatsUserMessages**](ChatApi.html#postChatsUserMessages) | Send a message to a user |
| [**postChatsUserMessagesPins**](ChatApi.html#postChatsUserMessagesPins) | Add pinned messages for a 1on1, up to a maximum of 5 pinned messages |
| [**putChatsMessageReactions**](ChatApi.html#putChatsMessageReactions) | Update reactions to a message |
| [**putChatsSettings**](ChatApi.html#putChatsSettings) | Update Chat Settings. |
{: class="table-striped"}

<a name="deleteChatsRoomMessage"></a>

# **deleteChatsRoomMessage**



> Void deleteChatsRoomMessage(roomJid, messageId)

Delete a message in a room

Wraps DELETE /api/v2/chats/rooms/{roomJid}/messages/{messageId}  

Requires ANY permissions: 

* chat:chat:access
* chat:roomMessage:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ChatApi apiInstance = new ChatApi();
String roomJid = "roomJid_example"; // String | roomId
String messageId = "messageId_example"; // String | messageId
try {
    apiInstance.deleteChatsRoomMessage(roomJid, messageId);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#deleteChatsRoomMessage");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roomJid** | **String**| roomId | 
| **messageId** | **String**| messageId | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteChatsRoomMessagesPin"></a>

# **deleteChatsRoomMessagesPin**



> Void deleteChatsRoomMessagesPin(roomJid, pinnedMessageId)

Remove a pinned message from a room

Wraps DELETE /api/v2/chats/rooms/{roomJid}/messages/pins/{pinnedMessageId}  

Requires ANY permissions: 

* chat:chat:access
* chat:room:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ChatApi apiInstance = new ChatApi();
String roomJid = "roomJid_example"; // String | roomJid
String pinnedMessageId = "pinnedMessageId_example"; // String | pinnedMessageId
try {
    apiInstance.deleteChatsRoomMessagesPin(roomJid, pinnedMessageId);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#deleteChatsRoomMessagesPin");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roomJid** | **String**| roomJid | 
| **pinnedMessageId** | **String**| pinnedMessageId | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteChatsRoomParticipant"></a>

# **deleteChatsRoomParticipant**



> Void deleteChatsRoomParticipant(roomJid, userId)

Remove a user from a room.

Wraps DELETE /api/v2/chats/rooms/{roomJid}/participants/{userId}  

Requires ANY permissions: 

* chat:chat:access
* chat:participant:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ChatApi apiInstance = new ChatApi();
String roomJid = "roomJid_example"; // String | roomJid
String userId = "userId_example"; // String | userId
try {
    apiInstance.deleteChatsRoomParticipant(roomJid, userId);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#deleteChatsRoomParticipant");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roomJid** | **String**| roomJid | 
| **userId** | **String**| userId | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteChatsUserMessage"></a>

# **deleteChatsUserMessage**



> Void deleteChatsUserMessage(userId, messageId)

Delete a message to a user

Wraps DELETE /api/v2/chats/users/{userId}/messages/{messageId}  

Requires ANY permissions: 

* chat:chat:access
* chat:1on1Message:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ChatApi apiInstance = new ChatApi();
String userId = "userId_example"; // String | userId
String messageId = "messageId_example"; // String | messageId
try {
    apiInstance.deleteChatsUserMessage(userId, messageId);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#deleteChatsUserMessage");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| userId | 
| **messageId** | **String**| messageId | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteChatsUserMessagesPin"></a>

# **deleteChatsUserMessagesPin**



> Void deleteChatsUserMessagesPin(userId, pinnedMessageId)

Remove a pinned message from a 1on1

deleteChatsUserMessagesPin is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps DELETE /api/v2/chats/users/{userId}/messages/pins/{pinnedMessageId}  

Requires ANY permissions: 

* chat:chat:access
* chat:1on1:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ChatApi apiInstance = new ChatApi();
String userId = "userId_example"; // String | userId
String pinnedMessageId = "pinnedMessageId_example"; // String | pinnedMessageId
try {
    apiInstance.deleteChatsUserMessagesPin(userId, pinnedMessageId);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#deleteChatsUserMessagesPin");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| userId | 
| **pinnedMessageId** | **String**| pinnedMessageId | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="getChatsMessage"></a>

# **getChatsMessage**



> [ChatMessageResponse](ChatMessageResponse.html) getChatsMessage(messageId)

Get a message

Wraps GET /api/v2/chats/messages/{messageId}  

Requires ANY permissions: 

* chat:chat:access
* chat:1on1Message:view
* chat:room:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ChatApi apiInstance = new ChatApi();
String messageId = "messageId_example"; // String | messageId
try {
    ChatMessageResponse result = apiInstance.getChatsMessage(messageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#getChatsMessage");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **messageId** | **String**| messageId | 
{: class="table-striped"}


### Return type

[**ChatMessageResponse**](ChatMessageResponse.html)

<a name="getChatsRoom"></a>

# **getChatsRoom**



> [Room](Room.html) getChatsRoom(roomJid)

Get a room

Wraps GET /api/v2/chats/rooms/{roomJid}  

Requires ANY permissions: 

* chat:chat:access
* chat:room:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ChatApi apiInstance = new ChatApi();
String roomJid = "roomJid_example"; // String | roomJid
try {
    Room result = apiInstance.getChatsRoom(roomJid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#getChatsRoom");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roomJid** | **String**| roomJid | 
{: class="table-striped"}


### Return type

[**Room**](Room.html)

<a name="getChatsRoomMessage"></a>

# **getChatsRoomMessage**



> [ChatMessageEntityListing](ChatMessageEntityListing.html) getChatsRoomMessage(roomJid, messageIds)

Get messages by id(s) from a room

Wraps GET /api/v2/chats/rooms/{roomJid}/messages/{messageIds}  

Requires ANY permissions: 

* chat:chat:access
* chat:room:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ChatApi apiInstance = new ChatApi();
String roomJid = "roomJid_example"; // String | roomJid
String messageIds = "messageIds_example"; // String | messageIds, comma separated
try {
    ChatMessageEntityListing result = apiInstance.getChatsRoomMessage(roomJid, messageIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#getChatsRoomMessage");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roomJid** | **String**| roomJid | 
| **messageIds** | **String**| messageIds, comma separated | 
{: class="table-striped"}


### Return type

[**ChatMessageEntityListing**](ChatMessageEntityListing.html)

<a name="getChatsRoomMessages"></a>

# **getChatsRoomMessages**



> [ChatMessageEntityListing](ChatMessageEntityListing.html) getChatsRoomMessages(roomJid, limit, before, after)

Get a room's message history

Wraps GET /api/v2/chats/rooms/{roomJid}/messages  

Requires ANY permissions: 

* chat:chat:access
* chat:room:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ChatApi apiInstance = new ChatApi();
String roomJid = "roomJid_example"; // String | roomJid
String limit = "limit_example"; // String | The maximum number of messages to retrieve
String before = "before_example"; // String | The cutoff date for messages to retrieve
String after = "after_example"; // String | The beginning date for messages to retrieve
try {
    ChatMessageEntityListing result = apiInstance.getChatsRoomMessages(roomJid, limit, before, after);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#getChatsRoomMessages");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roomJid** | **String**| roomJid | 
| **limit** | **String**| The maximum number of messages to retrieve | [optional] 
| **before** | **String**| The cutoff date for messages to retrieve | [optional] 
| **after** | **String**| The beginning date for messages to retrieve | [optional] 
{: class="table-striped"}


### Return type

[**ChatMessageEntityListing**](ChatMessageEntityListing.html)

<a name="getChatsRoomParticipant"></a>

# **getChatsRoomParticipant**



> [RoomParticipant](RoomParticipant.html) getChatsRoomParticipant(roomJid, participantJid)

Get a room participant

Wraps GET /api/v2/chats/rooms/{roomJid}/participants/{participantJid}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ChatApi apiInstance = new ChatApi();
String roomJid = "roomJid_example"; // String | roomJid
String participantJid = "participantJid_example"; // String | participantJid
try {
    RoomParticipant result = apiInstance.getChatsRoomParticipant(roomJid, participantJid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#getChatsRoomParticipant");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roomJid** | **String**| roomJid | 
| **participantJid** | **String**| participantJid | 
{: class="table-striped"}


### Return type

[**RoomParticipant**](RoomParticipant.html)

<a name="getChatsRoomParticipants"></a>

# **getChatsRoomParticipants**



> [RoomParticipantsResponse](RoomParticipantsResponse.html) getChatsRoomParticipants(roomJid)

Get room participants in a room

Wraps GET /api/v2/chats/rooms/{roomJid}/participants  

Requires ANY permissions: 

* chat:chat:access
* chat:room:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ChatApi apiInstance = new ChatApi();
String roomJid = "roomJid_example"; // String | roomJid
try {
    RoomParticipantsResponse result = apiInstance.getChatsRoomParticipants(roomJid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#getChatsRoomParticipants");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roomJid** | **String**| roomJid | 
{: class="table-striped"}


### Return type

[**RoomParticipantsResponse**](RoomParticipantsResponse.html)

<a name="getChatsSettings"></a>

# **getChatsSettings**



> [ChatSettings](ChatSettings.html) getChatsSettings()

Get Chat Settings.

Wraps GET /api/v2/chats/settings  

Requires ANY permissions: 

* chat:setting:view
* chat:setting:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ChatApi apiInstance = new ChatApi();
try {
    ChatSettings result = apiInstance.getChatsSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#getChatsSettings");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**ChatSettings**](ChatSettings.html)

<a name="getChatsThreadMessages"></a>

# **getChatsThreadMessages**



> [ChatMessageEntityListing](ChatMessageEntityListing.html) getChatsThreadMessages(threadId, limit, before, after)

Get history by thread

Wraps GET /api/v2/chats/threads/{threadId}/messages  

Requires ANY permissions: 

* chat:chat:access
* chat:room:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ChatApi apiInstance = new ChatApi();
String threadId = "threadId_example"; // String | threadId
String limit = "limit_example"; // String | The maximum number of messages to retrieve
String before = "before_example"; // String | The cutoff date for messages to retrieve
String after = "after_example"; // String | The beginning date for messages to retrieve
try {
    ChatMessageEntityListing result = apiInstance.getChatsThreadMessages(threadId, limit, before, after);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#getChatsThreadMessages");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **threadId** | **String**| threadId | 
| **limit** | **String**| The maximum number of messages to retrieve | [optional] 
| **before** | **String**| The cutoff date for messages to retrieve | [optional] 
| **after** | **String**| The beginning date for messages to retrieve | [optional] 
{: class="table-striped"}


### Return type

[**ChatMessageEntityListing**](ChatMessageEntityListing.html)

<a name="getChatsUser"></a>

# **getChatsUser**



> [OneOnOne](OneOnOne.html) getChatsUser(userId)

Get information for a 1on1

getChatsUser is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/chats/users/{userId}  

Requires ANY permissions: 

* chat:chat:access
* chat:1on1:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ChatApi apiInstance = new ChatApi();
String userId = "userId_example"; // String | userId
try {
    OneOnOne result = apiInstance.getChatsUser(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#getChatsUser");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| userId | 
{: class="table-striped"}


### Return type

[**OneOnOne**](OneOnOne.html)

<a name="getChatsUserMessage"></a>

# **getChatsUserMessage**



> [ChatMessageEntityListing](ChatMessageEntityListing.html) getChatsUserMessage(userId, messageIds)

Get messages by id(s) from a 1on1

Wraps GET /api/v2/chats/users/{userId}/messages/{messageIds}  

Requires ANY permissions: 

* chat:chat:access
* chat:1on1Message:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ChatApi apiInstance = new ChatApi();
String userId = "userId_example"; // String | userId
String messageIds = "messageIds_example"; // String | messageIds, comma separated
try {
    ChatMessageEntityListing result = apiInstance.getChatsUserMessage(userId, messageIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#getChatsUserMessage");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| userId | 
| **messageIds** | **String**| messageIds, comma separated | 
{: class="table-striped"}


### Return type

[**ChatMessageEntityListing**](ChatMessageEntityListing.html)

<a name="getChatsUserMessages"></a>

# **getChatsUserMessages**



> [ChatMessageResponse](ChatMessageResponse.html) getChatsUserMessages(userId, limit, before, after)

Get 1on1 History between a user

Wraps GET /api/v2/chats/users/{userId}/messages  

Requires ANY permissions: 

* chat:chat:access
* chat:1on1Message:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ChatApi apiInstance = new ChatApi();
String userId = "userId_example"; // String | userId
String limit = "limit_example"; // String | The maximum number of messages to retrieve
String before = "before_example"; // String | The cutoff date for messages to retrieve
String after = "after_example"; // String | The beginning date for messages to retrieve
try {
    ChatMessageResponse result = apiInstance.getChatsUserMessages(userId, limit, before, after);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#getChatsUserMessages");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| userId | 
| **limit** | **String**| The maximum number of messages to retrieve | [optional] 
| **before** | **String**| The cutoff date for messages to retrieve | [optional] 
| **after** | **String**| The beginning date for messages to retrieve | [optional] 
{: class="table-striped"}


### Return type

[**ChatMessageResponse**](ChatMessageResponse.html)

<a name="getChatsUserSettings"></a>

# **getChatsUserSettings**



> [ChatUserSettings](ChatUserSettings.html) getChatsUserSettings(userId)

Get a user's chat settings

getChatsUserSettings is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/chats/users/{userId}/settings  

Requires ANY permissions: 

* chat:usersettings:view
* chat:setting:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ChatApi apiInstance = new ChatApi();
String userId = "userId_example"; // String | User ID
try {
    ChatUserSettings result = apiInstance.getChatsUserSettings(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#getChatsUserSettings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
{: class="table-striped"}


### Return type

[**ChatUserSettings**](ChatUserSettings.html)

<a name="patchChatsRoom"></a>

# **patchChatsRoom**



> Void patchChatsRoom(roomJid, body)

Set properties for a room

Wraps PATCH /api/v2/chats/rooms/{roomJid}  

Requires ANY permissions: 

* chat:chat:access
* chat:room:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ChatApi apiInstance = new ChatApi();
String roomJid = "roomJid_example"; // String | roomJid
RoomUpdateRequest body = new RoomUpdateRequest(); // RoomUpdateRequest | Room properties
try {
    apiInstance.patchChatsRoom(roomJid, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#patchChatsRoom");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roomJid** | **String**| roomJid | 
| **body** | [**RoomUpdateRequest**](RoomUpdateRequest.html)| Room properties | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="patchChatsRoomMessage"></a>

# **patchChatsRoomMessage**



> [ChatSendMessageResponse](ChatSendMessageResponse.html) patchChatsRoomMessage(roomJid, messageId, body)

Edit a message in a room

Wraps PATCH /api/v2/chats/rooms/{roomJid}/messages/{messageId}  

Requires ANY permissions: 

* chat:chat:access
* chat:roomMessage:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ChatApi apiInstance = new ChatApi();
String roomJid = "roomJid_example"; // String | roomId
String messageId = "messageId_example"; // String | messageId
SendMessageBody body = new SendMessageBody(); // SendMessageBody | messageBody
try {
    ChatSendMessageResponse result = apiInstance.patchChatsRoomMessage(roomJid, messageId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#patchChatsRoomMessage");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roomJid** | **String**| roomId | 
| **messageId** | **String**| messageId | 
| **body** | [**SendMessageBody**](SendMessageBody.html)| messageBody | 
{: class="table-striped"}


### Return type

[**ChatSendMessageResponse**](ChatSendMessageResponse.html)

<a name="patchChatsSettings"></a>

# **patchChatsSettings**



> [ChatSettings](ChatSettings.html) patchChatsSettings(body)

Patch Chat Settings.

Wraps PATCH /api/v2/chats/settings  

Requires ANY permissions: 

* chat:setting:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ChatApi apiInstance = new ChatApi();
ChatSettings body = new ChatSettings(); // ChatSettings | Chat
try {
    ChatSettings result = apiInstance.patchChatsSettings(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#patchChatsSettings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**ChatSettings**](ChatSettings.html)| Chat | 
{: class="table-striped"}


### Return type

[**ChatSettings**](ChatSettings.html)

<a name="patchChatsUserMessage"></a>

# **patchChatsUserMessage**



> [ChatSendMessageResponse](ChatSendMessageResponse.html) patchChatsUserMessage(userId, messageId, body)

Edit a message to a user

Wraps PATCH /api/v2/chats/users/{userId}/messages/{messageId}  

Requires ANY permissions: 

* chat:chat:access
* chat:1on1Message:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ChatApi apiInstance = new ChatApi();
String userId = "userId_example"; // String | userId
String messageId = "messageId_example"; // String | messageId
SendMessageBody body = new SendMessageBody(); // SendMessageBody | message body
try {
    ChatSendMessageResponse result = apiInstance.patchChatsUserMessage(userId, messageId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#patchChatsUserMessage");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| userId | 
| **messageId** | **String**| messageId | 
| **body** | [**SendMessageBody**](SendMessageBody.html)| message body | 
{: class="table-striped"}


### Return type

[**ChatSendMessageResponse**](ChatSendMessageResponse.html)

<a name="patchChatsUserSettings"></a>

# **patchChatsUserSettings**



> [ChatUserSettings](ChatUserSettings.html) patchChatsUserSettings(userId, body)

Update a user's chat settings

patchChatsUserSettings is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps PATCH /api/v2/chats/users/{userId}/settings  

Requires ANY permissions: 

* chat:usersettings:edit
* chat:setting:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ChatApi apiInstance = new ChatApi();
String userId = "userId_example"; // String | User ID
ChatUserSettings body = new ChatUserSettings(); // ChatUserSettings | 
try {
    ChatUserSettings result = apiInstance.patchChatsUserSettings(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#patchChatsUserSettings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **body** | [**ChatUserSettings**](ChatUserSettings.html)|  | 
{: class="table-striped"}


### Return type

[**ChatUserSettings**](ChatUserSettings.html)

<a name="postChatsRoomMessages"></a>

# **postChatsRoomMessages**



> [ChatSendMessageResponse](ChatSendMessageResponse.html) postChatsRoomMessages(roomJid, body)

Send a message to a room

Wraps POST /api/v2/chats/rooms/{roomJid}/messages  

Requires ANY permissions: 

* chat:chat:access
* chat:roomMessage:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ChatApi apiInstance = new ChatApi();
String roomJid = "roomJid_example"; // String | roomId
SendMessageBody body = new SendMessageBody(); // SendMessageBody | messageBody
try {
    ChatSendMessageResponse result = apiInstance.postChatsRoomMessages(roomJid, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#postChatsRoomMessages");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roomJid** | **String**| roomId | 
| **body** | [**SendMessageBody**](SendMessageBody.html)| messageBody | 
{: class="table-striped"}


### Return type

[**ChatSendMessageResponse**](ChatSendMessageResponse.html)

<a name="postChatsRoomMessagesPins"></a>

# **postChatsRoomMessagesPins**



> Void postChatsRoomMessagesPins(roomJid, body)

Add pinned messages for a room, up to a maximum of 5 pinned messages

Wraps POST /api/v2/chats/rooms/{roomJid}/messages/pins  

Requires ANY permissions: 

* chat:chat:access
* chat:room:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ChatApi apiInstance = new ChatApi();
String roomJid = "roomJid_example"; // String | roomJid
PinnedMessageRequest body = new PinnedMessageRequest(); // PinnedMessageRequest | Pinned Message Ids
try {
    apiInstance.postChatsRoomMessagesPins(roomJid, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#postChatsRoomMessagesPins");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roomJid** | **String**| roomJid | 
| **body** | [**PinnedMessageRequest**](PinnedMessageRequest.html)| Pinned Message Ids | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="postChatsRoomParticipant"></a>

# **postChatsRoomParticipant**



> Void postChatsRoomParticipant(roomJid, userId)

Join a room

Wraps POST /api/v2/chats/rooms/{roomJid}/participants/{userId}  

Requires ANY permissions: 

* chat:chat:access
* chat:participant:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ChatApi apiInstance = new ChatApi();
String roomJid = "roomJid_example"; // String | roomJid
String userId = "userId_example"; // String | userId
try {
    apiInstance.postChatsRoomParticipant(roomJid, userId);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#postChatsRoomParticipant");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roomJid** | **String**| roomJid | 
| **userId** | **String**| userId | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="postChatsRooms"></a>

# **postChatsRooms**



> [CreateRoomResponse](CreateRoomResponse.html) postChatsRooms(body)

Create an adhoc room

Wraps POST /api/v2/chats/rooms  

Requires ANY permissions: 

* chat:chat:access
* chat:room:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ChatApi apiInstance = new ChatApi();
CreateRoomRequest body = new CreateRoomRequest(); // CreateRoomRequest | Room properties
try {
    CreateRoomResponse result = apiInstance.postChatsRooms(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#postChatsRooms");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**CreateRoomRequest**](CreateRoomRequest.html)| Room properties | 
{: class="table-striped"}


### Return type

[**CreateRoomResponse**](CreateRoomResponse.html)

<a name="postChatsUserMessages"></a>

# **postChatsUserMessages**



> [ChatSendMessageResponse](ChatSendMessageResponse.html) postChatsUserMessages(userId, body)

Send a message to a user

Wraps POST /api/v2/chats/users/{userId}/messages  

Requires ANY permissions: 

* chat:chat:access
* chat:1on1Message:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ChatApi apiInstance = new ChatApi();
String userId = "userId_example"; // String | userId
SendMessageBody body = new SendMessageBody(); // SendMessageBody | message body
try {
    ChatSendMessageResponse result = apiInstance.postChatsUserMessages(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#postChatsUserMessages");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| userId | 
| **body** | [**SendMessageBody**](SendMessageBody.html)| message body | 
{: class="table-striped"}


### Return type

[**ChatSendMessageResponse**](ChatSendMessageResponse.html)

<a name="postChatsUserMessagesPins"></a>

# **postChatsUserMessagesPins**



> Void postChatsUserMessagesPins(userId, body)

Add pinned messages for a 1on1, up to a maximum of 5 pinned messages

postChatsUserMessagesPins is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/chats/users/{userId}/messages/pins  

Requires ANY permissions: 

* chat:chat:access
* chat:1on1:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ChatApi apiInstance = new ChatApi();
String userId = "userId_example"; // String | userId
PinnedMessageRequest body = new PinnedMessageRequest(); // PinnedMessageRequest | Pinned Message Ids
try {
    apiInstance.postChatsUserMessagesPins(userId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#postChatsUserMessagesPins");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| userId | 
| **body** | [**PinnedMessageRequest**](PinnedMessageRequest.html)| Pinned Message Ids | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="putChatsMessageReactions"></a>

# **putChatsMessageReactions**



> Void putChatsMessageReactions(messageId, body)

Update reactions to a message

Wraps PUT /api/v2/chats/messages/{messageId}/reactions  

Requires ANY permissions: 

* chat:chat:access
* chat:reactions:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ChatApi apiInstance = new ChatApi();
String messageId = "messageId_example"; // String | messageId
ChatReactionUpdate body = new ChatReactionUpdate(); // ChatReactionUpdate | reactionUpdate
try {
    apiInstance.putChatsMessageReactions(messageId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#putChatsMessageReactions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **messageId** | **String**| messageId | 
| **body** | [**ChatReactionUpdate**](ChatReactionUpdate.html)| reactionUpdate | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="putChatsSettings"></a>

# **putChatsSettings**



> [ChatSettings](ChatSettings.html) putChatsSettings(body)

Update Chat Settings.

Wraps PUT /api/v2/chats/settings  

Requires ANY permissions: 

* chat:setting:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ChatApi apiInstance = new ChatApi();
ChatSettings body = new ChatSettings(); // ChatSettings | Chat
try {
    ChatSettings result = apiInstance.putChatsSettings(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#putChatsSettings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**ChatSettings**](ChatSettings.html)| Chat | 
{: class="table-striped"}


### Return type

[**ChatSettings**](ChatSettings.html)

