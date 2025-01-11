# MessagingApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteMessagingSetting**](MessagingApi#deleteMessagingSetting) | Delete a messaging setting |
| [**deleteMessagingSettingsDefault**](MessagingApi#deleteMessagingSettingsDefault) | Delete the organization's default setting, a global default will be applied to integrations without settings |
| [**deleteMessagingSupportedcontentSupportedContentId**](MessagingApi#deleteMessagingSupportedcontentSupportedContentId) | Delete a supported content profile |
| [**getMessagingSetting**](MessagingApi#getMessagingSetting) | Get a messaging setting |
| [**getMessagingSettings**](MessagingApi#getMessagingSettings) | Get a list of messaging settings |
| [**getMessagingSettingsDefault**](MessagingApi#getMessagingSettingsDefault) | Get the organization's default settings that will be used as the default when creating an integration. |
| [**getMessagingSupportedcontent**](MessagingApi#getMessagingSupportedcontent) | Get a list of Supported Content profiles |
| [**getMessagingSupportedcontentSupportedContentId**](MessagingApi#getMessagingSupportedcontentSupportedContentId) | Get a supported content profile |
| [**patchMessagingSetting**](MessagingApi#patchMessagingSetting) | Update a messaging setting |
| [**patchMessagingSupportedcontentSupportedContentId**](MessagingApi#patchMessagingSupportedcontentSupportedContentId) | Update a supported content profile |
| [**postMessagingSettings**](MessagingApi#postMessagingSettings) | Create a messaging setting |
| [**postMessagingSupportedcontent**](MessagingApi#postMessagingSupportedcontent) | Create a Supported Content profile |
| [**putMessagingSettingsDefault**](MessagingApi#putMessagingSettingsDefault) | Set the organization's default settings that may be applied to an integration when it is created. |
{: class="table-striped"}


# **deleteMessagingSetting**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> Void deleteMessagingSetting(messageSettingId)

Delete a messaging setting

Wraps DELETE /api/v2/messaging/settings/{messageSettingId}  

Requires ALL permissions: 

* messaging:setting:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.MessagingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

MessagingApi apiInstance = new MessagingApi();
String messageSettingId = "messageSettingId_example"; // String | Message Settings ID
try {
    apiInstance.deleteMessagingSetting(messageSettingId);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#deleteMessagingSetting");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **messageSettingId** | **String**| Message Settings ID | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteMessagingSettingsDefault**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> Void deleteMessagingSettingsDefault()

Delete the organization's default setting, a global default will be applied to integrations without settings

When an integration is created a settings ID may be assigned to it. If the settings ID is not supplied, the default settings will be applied to it.

Wraps DELETE /api/v2/messaging/settings/default  

Requires ALL permissions: 

* messaging:setting:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.MessagingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

MessagingApi apiInstance = new MessagingApi();
try {
    apiInstance.deleteMessagingSettingsDefault();
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#deleteMessagingSettingsDefault");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

null (empty response body)


# **deleteMessagingSupportedcontentSupportedContentId**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> Void deleteMessagingSupportedcontentSupportedContentId(supportedContentId)

Delete a supported content profile

Deprecated - use DELETE /api/v2/conversations/messaging/supportedcontent/{supportedContentId} as replacement

Wraps DELETE /api/v2/messaging/supportedcontent/{supportedContentId}  

Requires ALL permissions: 

* messaging:supportedContent:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.MessagingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

MessagingApi apiInstance = new MessagingApi();
String supportedContentId = "supportedContentId_example"; // String | Supported Content ID
try {
    apiInstance.deleteMessagingSupportedcontentSupportedContentId(supportedContentId);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#deleteMessagingSupportedcontentSupportedContentId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **supportedContentId** | **String**| Supported Content ID | 
{: class="table-striped"}


### Return type

null (empty response body)


# **getMessagingSetting**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [MessagingSetting](MessagingSetting) getMessagingSetting(messageSettingId)

Get a messaging setting

Wraps GET /api/v2/messaging/settings/{messageSettingId}  

Requires ALL permissions: 

* messaging:setting:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.MessagingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

MessagingApi apiInstance = new MessagingApi();
String messageSettingId = "messageSettingId_example"; // String | Message Settings ID
try {
    MessagingSetting result = apiInstance.getMessagingSetting(messageSettingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#getMessagingSetting");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **messageSettingId** | **String**| Message Settings ID | 
{: class="table-striped"}


### Return type

[**MessagingSetting**](MessagingSetting)


# **getMessagingSettings**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [MessagingConfigListing](MessagingConfigListing) getMessagingSettings(pageSize, pageNumber)

Get a list of messaging settings

Wraps GET /api/v2/messaging/settings  

Requires ALL permissions: 

* messaging:setting:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.MessagingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

MessagingApi apiInstance = new MessagingApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    MessagingConfigListing result = apiInstance.getMessagingSettings(pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#getMessagingSettings");
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

[**MessagingConfigListing**](MessagingConfigListing)


# **getMessagingSettingsDefault**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [MessagingSetting](MessagingSetting) getMessagingSettingsDefault()

Get the organization's default settings that will be used as the default when creating an integration.

When an integration is created a settings ID may be assigned to it. If the settings ID is not supplied, the default settings will be applied to it.

Wraps GET /api/v2/messaging/settings/default  

Requires ALL permissions: 

* messaging:setting:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.MessagingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

MessagingApi apiInstance = new MessagingApi();
try {
    MessagingSetting result = apiInstance.getMessagingSettingsDefault();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#getMessagingSettingsDefault");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**MessagingSetting**](MessagingSetting)


# **getMessagingSupportedcontent**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [SupportedContentListing](SupportedContentListing) getMessagingSupportedcontent(pageSize, pageNumber)

Get a list of Supported Content profiles

Deprecated - use GET /api/v2/conversations/messaging/supportedcontent as replacement

Wraps GET /api/v2/messaging/supportedcontent  

Requires ALL permissions: 

* messaging:supportedContent:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.MessagingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

MessagingApi apiInstance = new MessagingApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    SupportedContentListing result = apiInstance.getMessagingSupportedcontent(pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#getMessagingSupportedcontent");
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

[**SupportedContentListing**](SupportedContentListing)


# **getMessagingSupportedcontentSupportedContentId**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [SupportedContent](SupportedContent) getMessagingSupportedcontentSupportedContentId(supportedContentId)

Get a supported content profile

Deprecated - use GET /api/v2/conversations/messaging/supportedcontent/{supportedContentId} as replacement

Wraps GET /api/v2/messaging/supportedcontent/{supportedContentId}  

Requires ALL permissions: 

* messaging:supportedContent:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.MessagingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

MessagingApi apiInstance = new MessagingApi();
String supportedContentId = "supportedContentId_example"; // String | Supported Content ID
try {
    SupportedContent result = apiInstance.getMessagingSupportedcontentSupportedContentId(supportedContentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#getMessagingSupportedcontentSupportedContentId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **supportedContentId** | **String**| Supported Content ID | 
{: class="table-striped"}


### Return type

[**SupportedContent**](SupportedContent)


# **patchMessagingSetting**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [MessagingSetting](MessagingSetting) patchMessagingSetting(messageSettingId, body)

Update a messaging setting

Wraps PATCH /api/v2/messaging/settings/{messageSettingId}  

Requires ALL permissions: 

* messaging:setting:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.MessagingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

MessagingApi apiInstance = new MessagingApi();
String messageSettingId = "messageSettingId_example"; // String | Message Settings ID
MessagingSettingRequest body = new MessagingSettingRequest(); // MessagingSettingRequest | MessagingSetting
try {
    MessagingSetting result = apiInstance.patchMessagingSetting(messageSettingId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#patchMessagingSetting");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **messageSettingId** | **String**| Message Settings ID | 
| **body** | [**MessagingSettingRequest**](MessagingSettingRequest)| MessagingSetting | 
{: class="table-striped"}


### Return type

[**MessagingSetting**](MessagingSetting)


# **patchMessagingSupportedcontentSupportedContentId**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [SupportedContent](SupportedContent) patchMessagingSupportedcontentSupportedContentId(supportedContentId, body)

Update a supported content profile

Deprecated - use PATCH /api/v2/conversations/messaging/supportedcontent/{supportedContentId} as replacement

Wraps PATCH /api/v2/messaging/supportedcontent/{supportedContentId}  

Requires ALL permissions: 

* messaging:supportedContent:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.MessagingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

MessagingApi apiInstance = new MessagingApi();
String supportedContentId = "supportedContentId_example"; // String | Supported Content ID
SupportedContent body = new SupportedContent(); // SupportedContent | SupportedContent
try {
    SupportedContent result = apiInstance.patchMessagingSupportedcontentSupportedContentId(supportedContentId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#patchMessagingSupportedcontentSupportedContentId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **supportedContentId** | **String**| Supported Content ID | 
| **body** | [**SupportedContent**](SupportedContent)| SupportedContent | 
{: class="table-striped"}


### Return type

[**SupportedContent**](SupportedContent)


# **postMessagingSettings**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [MessagingSetting](MessagingSetting) postMessagingSettings(body)

Create a messaging setting

Wraps POST /api/v2/messaging/settings  

Requires ANY permissions: 

* messaging:setting:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.MessagingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

MessagingApi apiInstance = new MessagingApi();
MessagingSettingRequest body = new MessagingSettingRequest(); // MessagingSettingRequest | MessagingSetting
try {
    MessagingSetting result = apiInstance.postMessagingSettings(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#postMessagingSettings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**MessagingSettingRequest**](MessagingSettingRequest)| MessagingSetting | 
{: class="table-striped"}


### Return type

[**MessagingSetting**](MessagingSetting)


# **postMessagingSupportedcontent**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [SupportedContent](SupportedContent) postMessagingSupportedcontent(body)

Create a Supported Content profile

Deprecated - use POST /api/v2/conversations/messaging/supportedcontent as replacement

Wraps POST /api/v2/messaging/supportedcontent  

Requires ANY permissions: 

* messaging:supportedContent:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.MessagingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

MessagingApi apiInstance = new MessagingApi();
SupportedContent body = new SupportedContent(); // SupportedContent | SupportedContent
try {
    SupportedContent result = apiInstance.postMessagingSupportedcontent(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#postMessagingSupportedcontent");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**SupportedContent**](SupportedContent)| SupportedContent | 
{: class="table-striped"}


### Return type

[**SupportedContent**](SupportedContent)


# **putMessagingSettingsDefault**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [MessagingSetting](MessagingSetting) putMessagingSettingsDefault(body)

Set the organization's default settings that may be applied to an integration when it is created.

When an integration is created a settings ID may be assigned to it. If the settings ID is not supplied, the default settings will be applied to it.

Wraps PUT /api/v2/messaging/settings/default  

Requires ALL permissions: 

* messaging:setting:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.MessagingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

MessagingApi apiInstance = new MessagingApi();
MessagingSettingDefaultRequest body = new MessagingSettingDefaultRequest(); // MessagingSettingDefaultRequest | Messaging Setting ID
try {
    MessagingSetting result = apiInstance.putMessagingSettingsDefault(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#putMessagingSettingsDefault");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**MessagingSettingDefaultRequest**](MessagingSettingDefaultRequest)| Messaging Setting ID | 
{: class="table-striped"}


### Return type

[**MessagingSetting**](MessagingSetting)


_com.mypurecloud.sdk.v2:platform-client-v2:217.1.0_
