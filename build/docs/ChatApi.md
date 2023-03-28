---
title: ChatApi
---
## ChatApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**getChatSettings**](ChatApi.html#getChatSettings) | Get Chat Settings. |
| [**getChatsSettings**](ChatApi.html#getChatsSettings) | Get Chat Settings. |
| [**patchChatSettings**](ChatApi.html#patchChatSettings) | Patch Chat Settings. |
| [**patchChatsSettings**](ChatApi.html#patchChatsSettings) | Patch Chat Settings. |
| [**putChatSettings**](ChatApi.html#putChatSettings) | Update Chat Settings. |
| [**putChatsSettings**](ChatApi.html#putChatsSettings) | Update Chat Settings. |
{: class="table-striped"}

<a name="getChatSettings"></a>

# **getChatSettings**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [ChatSettings](ChatSettings.html) getChatSettings()

Get Chat Settings.

This route is deprecated, please use /chats/settings instead

Wraps GET /api/v2/chat/settings  

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
    ChatSettings result = apiInstance.getChatSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#getChatSettings");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**ChatSettings**](ChatSettings.html)

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

<a name="patchChatSettings"></a>

# **patchChatSettings**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [ChatSettings](ChatSettings.html) patchChatSettings(body)

Patch Chat Settings.

This route is deprecated, please use /chats/settings instead

Wraps PATCH /api/v2/chat/settings  

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
    ChatSettings result = apiInstance.patchChatSettings(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#patchChatSettings");
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

<a name="putChatSettings"></a>

# **putChatSettings**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [ChatSettings](ChatSettings.html) putChatSettings(body)

Update Chat Settings.

This route is deprecated, please use /chats/settings instead

Wraps PUT /api/v2/chat/settings  

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
    ChatSettings result = apiInstance.putChatSettings(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#putChatSettings");
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

