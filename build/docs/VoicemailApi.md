---
title: VoicemailApi
---
## VoicemailApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteVoicemailMessage**](VoicemailApi.html#deleteVoicemailMessage) | Delete a voicemail message. |
| [**deleteVoicemailMessages**](VoicemailApi.html#deleteVoicemailMessages) | Delete all voicemail messages |
| [**getVoicemailGroupMailbox**](VoicemailApi.html#getVoicemailGroupMailbox) | Get the group's mailbox information |
| [**getVoicemailGroupMessages**](VoicemailApi.html#getVoicemailGroupMessages) | List voicemail messages |
| [**getVoicemailGroupPolicy**](VoicemailApi.html#getVoicemailGroupPolicy) | Get a group's voicemail policy |
| [**getVoicemailMailbox**](VoicemailApi.html#getVoicemailMailbox) | Get the current user's mailbox information |
| [**getVoicemailMeMailbox**](VoicemailApi.html#getVoicemailMeMailbox) | Get the current user's mailbox information |
| [**getVoicemailMeMessages**](VoicemailApi.html#getVoicemailMeMessages) | List voicemail messages |
| [**getVoicemailMePolicy**](VoicemailApi.html#getVoicemailMePolicy) | Get the current user's voicemail policy |
| [**getVoicemailMessage**](VoicemailApi.html#getVoicemailMessage) | Get a voicemail message |
| [**getVoicemailMessageMedia**](VoicemailApi.html#getVoicemailMessageMedia) | Get media playback URI for this voicemail message |
| [**getVoicemailMessages**](VoicemailApi.html#getVoicemailMessages) | List voicemail messages |
| [**getVoicemailPolicy**](VoicemailApi.html#getVoicemailPolicy) | Get a policy |
| [**getVoicemailQueueMessages**](VoicemailApi.html#getVoicemailQueueMessages) | List voicemail messages |
| [**getVoicemailSearch**](VoicemailApi.html#getVoicemailSearch) | Search voicemails using the q64 value returned from a previous search |
| [**getVoicemailUserpolicy**](VoicemailApi.html#getVoicemailUserpolicy) | Get a user's voicemail policy |
| [**patchVoicemailGroupPolicy**](VoicemailApi.html#patchVoicemailGroupPolicy) | Update a group's voicemail policy |
| [**patchVoicemailMePolicy**](VoicemailApi.html#patchVoicemailMePolicy) | Update the current user's voicemail policy |
| [**patchVoicemailMessage**](VoicemailApi.html#patchVoicemailMessage) | Update a voicemail message |
| [**patchVoicemailUserpolicy**](VoicemailApi.html#patchVoicemailUserpolicy) | Update a user's voicemail policy |
| [**postVoicemailMessages**](VoicemailApi.html#postVoicemailMessages) | Copy a voicemail message to a user or group |
| [**postVoicemailSearch**](VoicemailApi.html#postVoicemailSearch) | Search voicemails |
| [**putVoicemailMessage**](VoicemailApi.html#putVoicemailMessage) | Update a voicemail message |
| [**putVoicemailPolicy**](VoicemailApi.html#putVoicemailPolicy) | Update a policy |
| [**putVoicemailUserpolicy**](VoicemailApi.html#putVoicemailUserpolicy) | Update a user's voicemail policy |
{: class="table-striped"}

<a name="deleteVoicemailMessage"></a>

# **deleteVoicemailMessage**



> Void deleteVoicemailMessage(messageId)

Delete a voicemail message.

A user voicemail can only be deleted by its associated user. A group voicemail can only be deleted by a user that is a member of the group. A queue voicemail can only be deleted by a user with the acd voicemail delete permission.

Wraps DELETE /api/v2/voicemail/messages/{messageId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

VoicemailApi apiInstance = new VoicemailApi();
String messageId = "messageId_example"; // String | Message ID
try {
    apiInstance.deleteVoicemailMessage(messageId);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#deleteVoicemailMessage");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **messageId** | **String**| Message ID | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteVoicemailMessages"></a>

# **deleteVoicemailMessages**



> Void deleteVoicemailMessages()

Delete all voicemail messages

Wraps DELETE /api/v2/voicemail/messages  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

VoicemailApi apiInstance = new VoicemailApi();
try {
    apiInstance.deleteVoicemailMessages();
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#deleteVoicemailMessages");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

null (empty response body)

<a name="getVoicemailGroupMailbox"></a>

# **getVoicemailGroupMailbox**



> [VoicemailMailboxInfo](VoicemailMailboxInfo.html) getVoicemailGroupMailbox(groupId)

Get the group's mailbox information

Wraps GET /api/v2/voicemail/groups/{groupId}/mailbox  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

VoicemailApi apiInstance = new VoicemailApi();
String groupId = "groupId_example"; // String | groupId
try {
    VoicemailMailboxInfo result = apiInstance.getVoicemailGroupMailbox(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#getVoicemailGroupMailbox");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **groupId** | **String**| groupId | 
{: class="table-striped"}


### Return type

[**VoicemailMailboxInfo**](VoicemailMailboxInfo.html)

<a name="getVoicemailGroupMessages"></a>

# **getVoicemailGroupMessages**



> [VoicemailMessageEntityListing](VoicemailMessageEntityListing.html) getVoicemailGroupMessages(groupId, pageSize, pageNumber)

List voicemail messages

Wraps GET /api/v2/voicemail/groups/{groupId}/messages  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

VoicemailApi apiInstance = new VoicemailApi();
String groupId = "groupId_example"; // String | Group ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    VoicemailMessageEntityListing result = apiInstance.getVoicemailGroupMessages(groupId, pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#getVoicemailGroupMessages");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **groupId** | **String**| Group ID | 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
{: class="table-striped"}


### Return type

[**VoicemailMessageEntityListing**](VoicemailMessageEntityListing.html)

<a name="getVoicemailGroupPolicy"></a>

# **getVoicemailGroupPolicy**



> [VoicemailGroupPolicy](VoicemailGroupPolicy.html) getVoicemailGroupPolicy(groupId)

Get a group's voicemail policy

Wraps GET /api/v2/voicemail/groups/{groupId}/policy  

Requires ANY permissions: 

* directory:group:add
* directory:group:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

VoicemailApi apiInstance = new VoicemailApi();
String groupId = "groupId_example"; // String | Group ID
try {
    VoicemailGroupPolicy result = apiInstance.getVoicemailGroupPolicy(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#getVoicemailGroupPolicy");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **groupId** | **String**| Group ID | 
{: class="table-striped"}


### Return type

[**VoicemailGroupPolicy**](VoicemailGroupPolicy.html)

<a name="getVoicemailMailbox"></a>

# **getVoicemailMailbox**



> [VoicemailMailboxInfo](VoicemailMailboxInfo.html) getVoicemailMailbox()

Get the current user's mailbox information

Wraps GET /api/v2/voicemail/mailbox  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

VoicemailApi apiInstance = new VoicemailApi();
try {
    VoicemailMailboxInfo result = apiInstance.getVoicemailMailbox();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#getVoicemailMailbox");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**VoicemailMailboxInfo**](VoicemailMailboxInfo.html)

<a name="getVoicemailMeMailbox"></a>

# **getVoicemailMeMailbox**



> [VoicemailMailboxInfo](VoicemailMailboxInfo.html) getVoicemailMeMailbox()

Get the current user's mailbox information

Wraps GET /api/v2/voicemail/me/mailbox  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

VoicemailApi apiInstance = new VoicemailApi();
try {
    VoicemailMailboxInfo result = apiInstance.getVoicemailMeMailbox();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#getVoicemailMeMailbox");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**VoicemailMailboxInfo**](VoicemailMailboxInfo.html)

<a name="getVoicemailMeMessages"></a>

# **getVoicemailMeMessages**



> [VoicemailMessageEntityListing](VoicemailMessageEntityListing.html) getVoicemailMeMessages(pageSize, pageNumber)

List voicemail messages

Wraps GET /api/v2/voicemail/me/messages  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

VoicemailApi apiInstance = new VoicemailApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    VoicemailMessageEntityListing result = apiInstance.getVoicemailMeMessages(pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#getVoicemailMeMessages");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
{: class="table-striped"}


### Return type

[**VoicemailMessageEntityListing**](VoicemailMessageEntityListing.html)

<a name="getVoicemailMePolicy"></a>

# **getVoicemailMePolicy**



> [VoicemailUserPolicy](VoicemailUserPolicy.html) getVoicemailMePolicy()

Get the current user's voicemail policy

Wraps GET /api/v2/voicemail/me/policy  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

VoicemailApi apiInstance = new VoicemailApi();
try {
    VoicemailUserPolicy result = apiInstance.getVoicemailMePolicy();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#getVoicemailMePolicy");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**VoicemailUserPolicy**](VoicemailUserPolicy.html)

<a name="getVoicemailMessage"></a>

# **getVoicemailMessage**



> [VoicemailMessage](VoicemailMessage.html) getVoicemailMessage(messageId, expand)

Get a voicemail message

Wraps GET /api/v2/voicemail/messages/{messageId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

VoicemailApi apiInstance = new VoicemailApi();
String messageId = "messageId_example"; // String | Message ID
List<String> expand = Arrays.asList(null); // List<String> | If the caller is a known user, which fields, if any, to expand
try {
    VoicemailMessage result = apiInstance.getVoicemailMessage(messageId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#getVoicemailMessage");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **messageId** | **String**| Message ID | 
| **expand** | [**List&lt;String&gt;**](String.html)| If the caller is a known user, which fields, if any, to expand | [optional]<br />**Values**: callerUser.routingStatus, callerUser.primaryPresence, callerUser.conversationSummary, callerUser.outOfOffice, callerUser.geolocation 
{: class="table-striped"}


### Return type

[**VoicemailMessage**](VoicemailMessage.html)

<a name="getVoicemailMessageMedia"></a>

# **getVoicemailMessageMedia**



> [VoicemailMediaInfo](VoicemailMediaInfo.html) getVoicemailMessageMedia(messageId, formatId)

Get media playback URI for this voicemail message

Wraps GET /api/v2/voicemail/messages/{messageId}/media  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

VoicemailApi apiInstance = new VoicemailApi();
String messageId = "messageId_example"; // String | Message ID
String formatId = "WEBM"; // String | The desired media format.
try {
    VoicemailMediaInfo result = apiInstance.getVoicemailMessageMedia(messageId, formatId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#getVoicemailMessageMedia");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **messageId** | **String**| Message ID | 
| **formatId** | **String**| The desired media format. | [optional] [default to WEBM]<br />**Values**: WAV, WEBM, WAV_ULAW, OGG_VORBIS, OGG_OPUS, MP3, NONE 
{: class="table-striped"}


### Return type

[**VoicemailMediaInfo**](VoicemailMediaInfo.html)

<a name="getVoicemailMessages"></a>

# **getVoicemailMessages**



> [VoicemailMessageEntityListing](VoicemailMessageEntityListing.html) getVoicemailMessages(ids, expand)

List voicemail messages

Wraps GET /api/v2/voicemail/messages  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

VoicemailApi apiInstance = new VoicemailApi();
String ids = "ids_example"; // String | An optional comma separated list of VoicemailMessage ids
List<String> expand = Arrays.asList(null); // List<String> | If the caller is a known user, which fields, if any, to expand
try {
    VoicemailMessageEntityListing result = apiInstance.getVoicemailMessages(ids, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#getVoicemailMessages");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ids** | **String**| An optional comma separated list of VoicemailMessage ids | [optional] 
| **expand** | [**List&lt;String&gt;**](String.html)| If the caller is a known user, which fields, if any, to expand | [optional]<br />**Values**: callerUser.routingStatus, callerUser.primaryPresence, callerUser.conversationSummary, callerUser.outOfOffice, callerUser.geolocation 
{: class="table-striped"}


### Return type

[**VoicemailMessageEntityListing**](VoicemailMessageEntityListing.html)

<a name="getVoicemailPolicy"></a>

# **getVoicemailPolicy**



> [VoicemailOrganizationPolicy](VoicemailOrganizationPolicy.html) getVoicemailPolicy()

Get a policy

Wraps GET /api/v2/voicemail/policy  

Requires ALL permissions: 

* telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

VoicemailApi apiInstance = new VoicemailApi();
try {
    VoicemailOrganizationPolicy result = apiInstance.getVoicemailPolicy();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#getVoicemailPolicy");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**VoicemailOrganizationPolicy**](VoicemailOrganizationPolicy.html)

<a name="getVoicemailQueueMessages"></a>

# **getVoicemailQueueMessages**



> [VoicemailMessageEntityListing](VoicemailMessageEntityListing.html) getVoicemailQueueMessages(queueId, pageSize, pageNumber)

List voicemail messages

Wraps GET /api/v2/voicemail/queues/{queueId}/messages  

Requires ANY permissions: 

* voicemail:acdvoicemail:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

VoicemailApi apiInstance = new VoicemailApi();
String queueId = "queueId_example"; // String | Queue ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    VoicemailMessageEntityListing result = apiInstance.getVoicemailQueueMessages(queueId, pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#getVoicemailQueueMessages");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **queueId** | **String**| Queue ID | 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
{: class="table-striped"}


### Return type

[**VoicemailMessageEntityListing**](VoicemailMessageEntityListing.html)

<a name="getVoicemailSearch"></a>

# **getVoicemailSearch**



> [VoicemailsSearchResponse](VoicemailsSearchResponse.html) getVoicemailSearch(q64, expand)

Search voicemails using the q64 value returned from a previous search

Wraps GET /api/v2/voicemail/search  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

VoicemailApi apiInstance = new VoicemailApi();
String q64 = "q64_example"; // String | q64
List<String> expand = Arrays.asList(null); // List<String> | expand
try {
    VoicemailsSearchResponse result = apiInstance.getVoicemailSearch(q64, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#getVoicemailSearch");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **q64** | **String**| q64 | 
| **expand** | [**List&lt;String&gt;**](String.html)| expand | [optional] 
{: class="table-striped"}


### Return type

[**VoicemailsSearchResponse**](VoicemailsSearchResponse.html)

<a name="getVoicemailUserpolicy"></a>

# **getVoicemailUserpolicy**



> [VoicemailUserPolicy](VoicemailUserPolicy.html) getVoicemailUserpolicy(userId)

Get a user's voicemail policy

Wraps GET /api/v2/voicemail/userpolicies/{userId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

VoicemailApi apiInstance = new VoicemailApi();
String userId = "userId_example"; // String | User ID
try {
    VoicemailUserPolicy result = apiInstance.getVoicemailUserpolicy(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#getVoicemailUserpolicy");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
{: class="table-striped"}


### Return type

[**VoicemailUserPolicy**](VoicemailUserPolicy.html)

<a name="patchVoicemailGroupPolicy"></a>

# **patchVoicemailGroupPolicy**



> [VoicemailGroupPolicy](VoicemailGroupPolicy.html) patchVoicemailGroupPolicy(groupId, body)

Update a group's voicemail policy

Wraps PATCH /api/v2/voicemail/groups/{groupId}/policy  

Requires ANY permissions: 

* directory:group:add
* directory:group:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

VoicemailApi apiInstance = new VoicemailApi();
String groupId = "groupId_example"; // String | Group ID
VoicemailGroupPolicy body = new VoicemailGroupPolicy(); // VoicemailGroupPolicy | The group's voicemail policy
try {
    VoicemailGroupPolicy result = apiInstance.patchVoicemailGroupPolicy(groupId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#patchVoicemailGroupPolicy");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **groupId** | **String**| Group ID | 
| **body** | [**VoicemailGroupPolicy**](VoicemailGroupPolicy.html)| The group&#39;s voicemail policy | 
{: class="table-striped"}


### Return type

[**VoicemailGroupPolicy**](VoicemailGroupPolicy.html)

<a name="patchVoicemailMePolicy"></a>

# **patchVoicemailMePolicy**



> [VoicemailUserPolicy](VoicemailUserPolicy.html) patchVoicemailMePolicy(body)

Update the current user's voicemail policy

Wraps PATCH /api/v2/voicemail/me/policy  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

VoicemailApi apiInstance = new VoicemailApi();
VoicemailUserPolicy body = new VoicemailUserPolicy(); // VoicemailUserPolicy | The user's voicemail policy
try {
    VoicemailUserPolicy result = apiInstance.patchVoicemailMePolicy(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#patchVoicemailMePolicy");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**VoicemailUserPolicy**](VoicemailUserPolicy.html)| The user&#39;s voicemail policy | 
{: class="table-striped"}


### Return type

[**VoicemailUserPolicy**](VoicemailUserPolicy.html)

<a name="patchVoicemailMessage"></a>

# **patchVoicemailMessage**



> [VoicemailMessage](VoicemailMessage.html) patchVoicemailMessage(messageId, body)

Update a voicemail message

A user voicemail can only be modified by its associated user. A group voicemail can only be modified by a user that is a member of the group. A queue voicemail can only be modified by a participant of the conversation the voicemail is associated with.

Wraps PATCH /api/v2/voicemail/messages/{messageId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

VoicemailApi apiInstance = new VoicemailApi();
String messageId = "messageId_example"; // String | Message ID
VoicemailMessage body = new VoicemailMessage(); // VoicemailMessage | VoicemailMessage
try {
    VoicemailMessage result = apiInstance.patchVoicemailMessage(messageId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#patchVoicemailMessage");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **messageId** | **String**| Message ID | 
| **body** | [**VoicemailMessage**](VoicemailMessage.html)| VoicemailMessage | 
{: class="table-striped"}


### Return type

[**VoicemailMessage**](VoicemailMessage.html)

<a name="patchVoicemailUserpolicy"></a>

# **patchVoicemailUserpolicy**



> [VoicemailUserPolicy](VoicemailUserPolicy.html) patchVoicemailUserpolicy(userId, body)

Update a user's voicemail policy

Wraps PATCH /api/v2/voicemail/userpolicies/{userId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

VoicemailApi apiInstance = new VoicemailApi();
String userId = "userId_example"; // String | User ID
VoicemailUserPolicy body = new VoicemailUserPolicy(); // VoicemailUserPolicy | The user's voicemail policy
try {
    VoicemailUserPolicy result = apiInstance.patchVoicemailUserpolicy(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#patchVoicemailUserpolicy");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **body** | [**VoicemailUserPolicy**](VoicemailUserPolicy.html)| The user&#39;s voicemail policy | 
{: class="table-striped"}


### Return type

[**VoicemailUserPolicy**](VoicemailUserPolicy.html)

<a name="postVoicemailMessages"></a>

# **postVoicemailMessages**



> [VoicemailMessage](VoicemailMessage.html) postVoicemailMessages(body)

Copy a voicemail message to a user or group

Wraps POST /api/v2/voicemail/messages  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

VoicemailApi apiInstance = new VoicemailApi();
CopyVoicemailMessage body = new CopyVoicemailMessage(); // CopyVoicemailMessage | 
try {
    VoicemailMessage result = apiInstance.postVoicemailMessages(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#postVoicemailMessages");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**CopyVoicemailMessage**](CopyVoicemailMessage.html)|  | [optional] 
{: class="table-striped"}


### Return type

[**VoicemailMessage**](VoicemailMessage.html)

<a name="postVoicemailSearch"></a>

# **postVoicemailSearch**



> [VoicemailsSearchResponse](VoicemailsSearchResponse.html) postVoicemailSearch(body)

Search voicemails

Wraps POST /api/v2/voicemail/search  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

VoicemailApi apiInstance = new VoicemailApi();
VoicemailSearchRequest body = new VoicemailSearchRequest(); // VoicemailSearchRequest | Search request options
try {
    VoicemailsSearchResponse result = apiInstance.postVoicemailSearch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#postVoicemailSearch");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**VoicemailSearchRequest**](VoicemailSearchRequest.html)| Search request options | 
{: class="table-striped"}


### Return type

[**VoicemailsSearchResponse**](VoicemailsSearchResponse.html)

<a name="putVoicemailMessage"></a>

# **putVoicemailMessage**



> [VoicemailMessage](VoicemailMessage.html) putVoicemailMessage(messageId, body)

Update a voicemail message

A user voicemail can only be modified by its associated user. A group voicemail can only be modified by a user that is a member of the group. A queue voicemail can only be modified by a participant of the conversation the voicemail is associated with.

Wraps PUT /api/v2/voicemail/messages/{messageId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

VoicemailApi apiInstance = new VoicemailApi();
String messageId = "messageId_example"; // String | Message ID
VoicemailMessage body = new VoicemailMessage(); // VoicemailMessage | VoicemailMessage
try {
    VoicemailMessage result = apiInstance.putVoicemailMessage(messageId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#putVoicemailMessage");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **messageId** | **String**| Message ID | 
| **body** | [**VoicemailMessage**](VoicemailMessage.html)| VoicemailMessage | 
{: class="table-striped"}


### Return type

[**VoicemailMessage**](VoicemailMessage.html)

<a name="putVoicemailPolicy"></a>

# **putVoicemailPolicy**



> [VoicemailOrganizationPolicy](VoicemailOrganizationPolicy.html) putVoicemailPolicy(body)

Update a policy

Wraps PUT /api/v2/voicemail/policy  

Requires ALL permissions: 

* telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

VoicemailApi apiInstance = new VoicemailApi();
VoicemailOrganizationPolicy body = new VoicemailOrganizationPolicy(); // VoicemailOrganizationPolicy | Policy
try {
    VoicemailOrganizationPolicy result = apiInstance.putVoicemailPolicy(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#putVoicemailPolicy");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**VoicemailOrganizationPolicy**](VoicemailOrganizationPolicy.html)| Policy | 
{: class="table-striped"}


### Return type

[**VoicemailOrganizationPolicy**](VoicemailOrganizationPolicy.html)

<a name="putVoicemailUserpolicy"></a>

# **putVoicemailUserpolicy**



> [VoicemailUserPolicy](VoicemailUserPolicy.html) putVoicemailUserpolicy(userId, body)

Update a user's voicemail policy

Wraps PUT /api/v2/voicemail/userpolicies/{userId}  

Requires ALL permissions: 

* telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

VoicemailApi apiInstance = new VoicemailApi();
String userId = "userId_example"; // String | User ID
VoicemailUserPolicy body = new VoicemailUserPolicy(); // VoicemailUserPolicy | The user's voicemail policy
try {
    VoicemailUserPolicy result = apiInstance.putVoicemailUserpolicy(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#putVoicemailUserpolicy");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **body** | [**VoicemailUserPolicy**](VoicemailUserPolicy.html)| The user&#39;s voicemail policy | 
{: class="table-striped"}


### Return type

[**VoicemailUserPolicy**](VoicemailUserPolicy.html)

