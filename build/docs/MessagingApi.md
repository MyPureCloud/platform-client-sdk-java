---
title: MessagingApi
---
## MessagingApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteConversationsMessagingIntegrationsFacebookIntegrationId**](MessagingApi.html#deleteConversationsMessagingIntegrationsFacebookIntegrationId) | Delete a Facebook messaging integration |
| [**deleteConversationsMessagingIntegrationsLineIntegrationId**](MessagingApi.html#deleteConversationsMessagingIntegrationsLineIntegrationId) | Delete a LINE messenger integration |
| [**deleteConversationsMessagingIntegrationsTwitterIntegrationId**](MessagingApi.html#deleteConversationsMessagingIntegrationsTwitterIntegrationId) | Delete a Twitter messaging integration |
| [**deleteMessagingIntegrationsFacebookIntegrationId**](MessagingApi.html#deleteMessagingIntegrationsFacebookIntegrationId) | Delete a Facebook messaging integration |
| [**deleteMessagingIntegrationsLineIntegrationId**](MessagingApi.html#deleteMessagingIntegrationsLineIntegrationId) | Delete a LINE messenger integration |
| [**deleteMessagingIntegrationsTwitterIntegrationId**](MessagingApi.html#deleteMessagingIntegrationsTwitterIntegrationId) | Delete a Twitter messaging integration |
| [**getConversationsMessagingIntegrations**](MessagingApi.html#getConversationsMessagingIntegrations) | Get a list of Integrations |
| [**getConversationsMessagingIntegrationsFacebook**](MessagingApi.html#getConversationsMessagingIntegrationsFacebook) | Get a list of Facebook Integrations |
| [**getConversationsMessagingIntegrationsFacebookIntegrationId**](MessagingApi.html#getConversationsMessagingIntegrationsFacebookIntegrationId) | Get a Facebook messaging integration |
| [**getConversationsMessagingIntegrationsLine**](MessagingApi.html#getConversationsMessagingIntegrationsLine) | Get a list of LINE messenger Integrations |
| [**getConversationsMessagingIntegrationsLineIntegrationId**](MessagingApi.html#getConversationsMessagingIntegrationsLineIntegrationId) | Get a LINE messenger integration |
| [**getConversationsMessagingIntegrationsTwitter**](MessagingApi.html#getConversationsMessagingIntegrationsTwitter) | Get a list of Twitter Integrations |
| [**getConversationsMessagingIntegrationsTwitterIntegrationId**](MessagingApi.html#getConversationsMessagingIntegrationsTwitterIntegrationId) | Get a Twitter messaging integration |
| [**getConversationsMessagingSticker**](MessagingApi.html#getConversationsMessagingSticker) | Get a list of Messaging Stickers |
| [**getMessagingIntegrations**](MessagingApi.html#getMessagingIntegrations) | Get a list of Integrations |
| [**getMessagingIntegrationsFacebook**](MessagingApi.html#getMessagingIntegrationsFacebook) | Get a list of Facebook Integrations |
| [**getMessagingIntegrationsFacebookIntegrationId**](MessagingApi.html#getMessagingIntegrationsFacebookIntegrationId) | Get a Facebook messaging integration |
| [**getMessagingIntegrationsLine**](MessagingApi.html#getMessagingIntegrationsLine) | Get a list of LINE messenger Integrations |
| [**getMessagingIntegrationsLineIntegrationId**](MessagingApi.html#getMessagingIntegrationsLineIntegrationId) | Get a LINE messenger integration |
| [**getMessagingIntegrationsTwitter**](MessagingApi.html#getMessagingIntegrationsTwitter) | Get a list of Twitter Integrations |
| [**getMessagingIntegrationsTwitterIntegrationId**](MessagingApi.html#getMessagingIntegrationsTwitterIntegrationId) | Get a Twitter messaging integration |
| [**getMessagingSticker**](MessagingApi.html#getMessagingSticker) | Get a list of Messaging Stickers |
| [**postConversationsMessagingIntegrationsFacebook**](MessagingApi.html#postConversationsMessagingIntegrationsFacebook) | Create a Facebook Integration |
| [**postConversationsMessagingIntegrationsLine**](MessagingApi.html#postConversationsMessagingIntegrationsLine) | Create a LINE messenger Integration |
| [**postConversationsMessagingIntegrationsTwitter**](MessagingApi.html#postConversationsMessagingIntegrationsTwitter) | Create a Twitter Integration |
| [**postMessagingIntegrationsFacebook**](MessagingApi.html#postMessagingIntegrationsFacebook) | Create a Facebook Integration |
| [**postMessagingIntegrationsLine**](MessagingApi.html#postMessagingIntegrationsLine) | Create a LINE messenger Integration |
| [**postMessagingIntegrationsTwitter**](MessagingApi.html#postMessagingIntegrationsTwitter) | Create a Twitter Integration |
| [**putConversationsMessagingIntegrationsLineIntegrationId**](MessagingApi.html#putConversationsMessagingIntegrationsLineIntegrationId) | Update a LINE messenger integration |
| [**putMessagingIntegrationsLineIntegrationId**](MessagingApi.html#putMessagingIntegrationsLineIntegrationId) | Update a LINE messenger integration |
{: class="table-striped"}

<a name="deleteConversationsMessagingIntegrationsFacebookIntegrationId"></a>

# **deleteConversationsMessagingIntegrationsFacebookIntegrationId**



> Void deleteConversationsMessagingIntegrationsFacebookIntegrationId(integrationId)

Delete a Facebook messaging integration



Wraps DELETE /api/v2/conversations/messaging/integrations/facebook/{integrationId}  

Requires ANY permissions: 

* messaging:integration:delete

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
String integrationId = "integrationId_example"; // String | Integration ID
try {
    apiInstance.deleteConversationsMessagingIntegrationsFacebookIntegrationId(integrationId);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#deleteConversationsMessagingIntegrationsFacebookIntegrationId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration ID | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteConversationsMessagingIntegrationsLineIntegrationId"></a>

# **deleteConversationsMessagingIntegrationsLineIntegrationId**



> Void deleteConversationsMessagingIntegrationsLineIntegrationId(integrationId)

Delete a LINE messenger integration



Wraps DELETE /api/v2/conversations/messaging/integrations/line/{integrationId}  

Requires ANY permissions: 

* messaging:integration:delete

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
String integrationId = "integrationId_example"; // String | Integration ID
try {
    apiInstance.deleteConversationsMessagingIntegrationsLineIntegrationId(integrationId);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#deleteConversationsMessagingIntegrationsLineIntegrationId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration ID | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteConversationsMessagingIntegrationsTwitterIntegrationId"></a>

# **deleteConversationsMessagingIntegrationsTwitterIntegrationId**



> Void deleteConversationsMessagingIntegrationsTwitterIntegrationId(integrationId)

Delete a Twitter messaging integration



Wraps DELETE /api/v2/conversations/messaging/integrations/twitter/{integrationId}  

Requires ANY permissions: 

* messaging:integration:delete

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
String integrationId = "integrationId_example"; // String | Integration ID
try {
    apiInstance.deleteConversationsMessagingIntegrationsTwitterIntegrationId(integrationId);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#deleteConversationsMessagingIntegrationsTwitterIntegrationId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration ID | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteMessagingIntegrationsFacebookIntegrationId"></a>

# **deleteMessagingIntegrationsFacebookIntegrationId**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> Void deleteMessagingIntegrationsFacebookIntegrationId(integrationId)

Delete a Facebook messaging integration



Wraps DELETE /api/v2/messaging/integrations/facebook/{integrationId}  

Requires ANY permissions: 

* messaging:integration:delete

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
String integrationId = "integrationId_example"; // String | Integration ID
try {
    apiInstance.deleteMessagingIntegrationsFacebookIntegrationId(integrationId);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#deleteMessagingIntegrationsFacebookIntegrationId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration ID | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteMessagingIntegrationsLineIntegrationId"></a>

# **deleteMessagingIntegrationsLineIntegrationId**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> Void deleteMessagingIntegrationsLineIntegrationId(integrationId)

Delete a LINE messenger integration



Wraps DELETE /api/v2/messaging/integrations/line/{integrationId}  

Requires ANY permissions: 

* messaging:integration:delete

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
String integrationId = "integrationId_example"; // String | Integration ID
try {
    apiInstance.deleteMessagingIntegrationsLineIntegrationId(integrationId);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#deleteMessagingIntegrationsLineIntegrationId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration ID | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteMessagingIntegrationsTwitterIntegrationId"></a>

# **deleteMessagingIntegrationsTwitterIntegrationId**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> Void deleteMessagingIntegrationsTwitterIntegrationId(integrationId)

Delete a Twitter messaging integration



Wraps DELETE /api/v2/messaging/integrations/twitter/{integrationId}  

Requires ANY permissions: 

* messaging:integration:delete

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
String integrationId = "integrationId_example"; // String | Integration ID
try {
    apiInstance.deleteMessagingIntegrationsTwitterIntegrationId(integrationId);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#deleteMessagingIntegrationsTwitterIntegrationId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration ID | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="getConversationsMessagingIntegrations"></a>

# **getConversationsMessagingIntegrations**



> [MessagingIntegrationEntityListing](MessagingIntegrationEntityListing.html) getConversationsMessagingIntegrations(pageSize, pageNumber)

Get a list of Integrations



Wraps GET /api/v2/conversations/messaging/integrations  

Requires ANY permissions: 

* messaging:integration:view

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
    MessagingIntegrationEntityListing result = apiInstance.getConversationsMessagingIntegrations(pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#getConversationsMessagingIntegrations");
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

[**MessagingIntegrationEntityListing**](MessagingIntegrationEntityListing.html)

<a name="getConversationsMessagingIntegrationsFacebook"></a>

# **getConversationsMessagingIntegrationsFacebook**



> [FacebookIntegrationEntityListing](FacebookIntegrationEntityListing.html) getConversationsMessagingIntegrationsFacebook(pageSize, pageNumber)

Get a list of Facebook Integrations



Wraps GET /api/v2/conversations/messaging/integrations/facebook  

Requires ANY permissions: 

* messaging:integration:view

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
    FacebookIntegrationEntityListing result = apiInstance.getConversationsMessagingIntegrationsFacebook(pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#getConversationsMessagingIntegrationsFacebook");
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

[**FacebookIntegrationEntityListing**](FacebookIntegrationEntityListing.html)

<a name="getConversationsMessagingIntegrationsFacebookIntegrationId"></a>

# **getConversationsMessagingIntegrationsFacebookIntegrationId**



> [FacebookIntegration](FacebookIntegration.html) getConversationsMessagingIntegrationsFacebookIntegrationId(integrationId)

Get a Facebook messaging integration



Wraps GET /api/v2/conversations/messaging/integrations/facebook/{integrationId}  

Requires ANY permissions: 

* messaging:integration:view

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
String integrationId = "integrationId_example"; // String | Integration ID
try {
    FacebookIntegration result = apiInstance.getConversationsMessagingIntegrationsFacebookIntegrationId(integrationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#getConversationsMessagingIntegrationsFacebookIntegrationId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration ID | 
{: class="table-striped"}


### Return type

[**FacebookIntegration**](FacebookIntegration.html)

<a name="getConversationsMessagingIntegrationsLine"></a>

# **getConversationsMessagingIntegrationsLine**



> [LineIntegrationEntityListing](LineIntegrationEntityListing.html) getConversationsMessagingIntegrationsLine(pageSize, pageNumber)

Get a list of LINE messenger Integrations



Wraps GET /api/v2/conversations/messaging/integrations/line  

Requires ANY permissions: 

* messaging:integration:view

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
    LineIntegrationEntityListing result = apiInstance.getConversationsMessagingIntegrationsLine(pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#getConversationsMessagingIntegrationsLine");
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

[**LineIntegrationEntityListing**](LineIntegrationEntityListing.html)

<a name="getConversationsMessagingIntegrationsLineIntegrationId"></a>

# **getConversationsMessagingIntegrationsLineIntegrationId**



> [LineIntegration](LineIntegration.html) getConversationsMessagingIntegrationsLineIntegrationId(integrationId)

Get a LINE messenger integration



Wraps GET /api/v2/conversations/messaging/integrations/line/{integrationId}  

Requires ANY permissions: 

* messaging:integration:view

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
String integrationId = "integrationId_example"; // String | Integration ID
try {
    LineIntegration result = apiInstance.getConversationsMessagingIntegrationsLineIntegrationId(integrationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#getConversationsMessagingIntegrationsLineIntegrationId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration ID | 
{: class="table-striped"}


### Return type

[**LineIntegration**](LineIntegration.html)

<a name="getConversationsMessagingIntegrationsTwitter"></a>

# **getConversationsMessagingIntegrationsTwitter**



> [TwitterIntegrationEntityListing](TwitterIntegrationEntityListing.html) getConversationsMessagingIntegrationsTwitter(pageSize, pageNumber)

Get a list of Twitter Integrations



Wraps GET /api/v2/conversations/messaging/integrations/twitter  

Requires ANY permissions: 

* messaging:integration:view

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
    TwitterIntegrationEntityListing result = apiInstance.getConversationsMessagingIntegrationsTwitter(pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#getConversationsMessagingIntegrationsTwitter");
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

[**TwitterIntegrationEntityListing**](TwitterIntegrationEntityListing.html)

<a name="getConversationsMessagingIntegrationsTwitterIntegrationId"></a>

# **getConversationsMessagingIntegrationsTwitterIntegrationId**



> [TwitterIntegration](TwitterIntegration.html) getConversationsMessagingIntegrationsTwitterIntegrationId(integrationId)

Get a Twitter messaging integration



Wraps GET /api/v2/conversations/messaging/integrations/twitter/{integrationId}  

Requires ANY permissions: 

* messaging:integration:view

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
String integrationId = "integrationId_example"; // String | Integration ID
try {
    TwitterIntegration result = apiInstance.getConversationsMessagingIntegrationsTwitterIntegrationId(integrationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#getConversationsMessagingIntegrationsTwitterIntegrationId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration ID | 
{: class="table-striped"}


### Return type

[**TwitterIntegration**](TwitterIntegration.html)

<a name="getConversationsMessagingSticker"></a>

# **getConversationsMessagingSticker**



> [MessagingStickerEntityListing](MessagingStickerEntityListing.html) getConversationsMessagingSticker(messengerType, pageSize, pageNumber)

Get a list of Messaging Stickers



Wraps GET /api/v2/conversations/messaging/stickers/{messengerType}  

Requires ANY permissions: 

* conversation:message:create

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
String messengerType = "messengerType_example"; // String | Messenger Type
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    MessagingStickerEntityListing result = apiInstance.getConversationsMessagingSticker(messengerType, pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#getConversationsMessagingSticker");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **messengerType** | **String**| Messenger Type | 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
{: class="table-striped"}


### Return type

[**MessagingStickerEntityListing**](MessagingStickerEntityListing.html)

<a name="getMessagingIntegrations"></a>

# **getMessagingIntegrations**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [MessagingIntegrationEntityListing](MessagingIntegrationEntityListing.html) getMessagingIntegrations(pageSize, pageNumber)

Get a list of Integrations



Wraps GET /api/v2/messaging/integrations  

Requires ANY permissions: 

* messaging:integration:view

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
    MessagingIntegrationEntityListing result = apiInstance.getMessagingIntegrations(pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#getMessagingIntegrations");
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

[**MessagingIntegrationEntityListing**](MessagingIntegrationEntityListing.html)

<a name="getMessagingIntegrationsFacebook"></a>

# **getMessagingIntegrationsFacebook**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [FacebookIntegrationEntityListing](FacebookIntegrationEntityListing.html) getMessagingIntegrationsFacebook(pageSize, pageNumber)

Get a list of Facebook Integrations



Wraps GET /api/v2/messaging/integrations/facebook  

Requires ANY permissions: 

* messaging:integration:view

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
    FacebookIntegrationEntityListing result = apiInstance.getMessagingIntegrationsFacebook(pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#getMessagingIntegrationsFacebook");
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

[**FacebookIntegrationEntityListing**](FacebookIntegrationEntityListing.html)

<a name="getMessagingIntegrationsFacebookIntegrationId"></a>

# **getMessagingIntegrationsFacebookIntegrationId**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [FacebookIntegration](FacebookIntegration.html) getMessagingIntegrationsFacebookIntegrationId(integrationId)

Get a Facebook messaging integration



Wraps GET /api/v2/messaging/integrations/facebook/{integrationId}  

Requires ANY permissions: 

* messaging:integration:view

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
String integrationId = "integrationId_example"; // String | Integration ID
try {
    FacebookIntegration result = apiInstance.getMessagingIntegrationsFacebookIntegrationId(integrationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#getMessagingIntegrationsFacebookIntegrationId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration ID | 
{: class="table-striped"}


### Return type

[**FacebookIntegration**](FacebookIntegration.html)

<a name="getMessagingIntegrationsLine"></a>

# **getMessagingIntegrationsLine**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [LineIntegrationEntityListing](LineIntegrationEntityListing.html) getMessagingIntegrationsLine(pageSize, pageNumber)

Get a list of LINE messenger Integrations



Wraps GET /api/v2/messaging/integrations/line  

Requires ANY permissions: 

* messaging:integration:view

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
    LineIntegrationEntityListing result = apiInstance.getMessagingIntegrationsLine(pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#getMessagingIntegrationsLine");
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

[**LineIntegrationEntityListing**](LineIntegrationEntityListing.html)

<a name="getMessagingIntegrationsLineIntegrationId"></a>

# **getMessagingIntegrationsLineIntegrationId**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [LineIntegration](LineIntegration.html) getMessagingIntegrationsLineIntegrationId(integrationId)

Get a LINE messenger integration



Wraps GET /api/v2/messaging/integrations/line/{integrationId}  

Requires ANY permissions: 

* messaging:integration:view

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
String integrationId = "integrationId_example"; // String | Integration ID
try {
    LineIntegration result = apiInstance.getMessagingIntegrationsLineIntegrationId(integrationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#getMessagingIntegrationsLineIntegrationId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration ID | 
{: class="table-striped"}


### Return type

[**LineIntegration**](LineIntegration.html)

<a name="getMessagingIntegrationsTwitter"></a>

# **getMessagingIntegrationsTwitter**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [TwitterIntegrationEntityListing](TwitterIntegrationEntityListing.html) getMessagingIntegrationsTwitter(pageSize, pageNumber)

Get a list of Twitter Integrations



Wraps GET /api/v2/messaging/integrations/twitter  

Requires ANY permissions: 

* messaging:integration:view

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
    TwitterIntegrationEntityListing result = apiInstance.getMessagingIntegrationsTwitter(pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#getMessagingIntegrationsTwitter");
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

[**TwitterIntegrationEntityListing**](TwitterIntegrationEntityListing.html)

<a name="getMessagingIntegrationsTwitterIntegrationId"></a>

# **getMessagingIntegrationsTwitterIntegrationId**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [TwitterIntegration](TwitterIntegration.html) getMessagingIntegrationsTwitterIntegrationId(integrationId)

Get a Twitter messaging integration



Wraps GET /api/v2/messaging/integrations/twitter/{integrationId}  

Requires ANY permissions: 

* messaging:integration:view

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
String integrationId = "integrationId_example"; // String | Integration ID
try {
    TwitterIntegration result = apiInstance.getMessagingIntegrationsTwitterIntegrationId(integrationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#getMessagingIntegrationsTwitterIntegrationId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration ID | 
{: class="table-striped"}


### Return type

[**TwitterIntegration**](TwitterIntegration.html)

<a name="getMessagingSticker"></a>

# **getMessagingSticker**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [MessagingStickerEntityListing](MessagingStickerEntityListing.html) getMessagingSticker(messengerType, pageSize, pageNumber)

Get a list of Messaging Stickers



Wraps GET /api/v2/messaging/stickers/{messengerType}  

Requires ANY permissions: 

* conversation:message:create

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
String messengerType = "messengerType_example"; // String | Messenger Type
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    MessagingStickerEntityListing result = apiInstance.getMessagingSticker(messengerType, pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#getMessagingSticker");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **messengerType** | **String**| Messenger Type | 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
{: class="table-striped"}


### Return type

[**MessagingStickerEntityListing**](MessagingStickerEntityListing.html)

<a name="postConversationsMessagingIntegrationsFacebook"></a>

# **postConversationsMessagingIntegrationsFacebook**



> [FacebookIntegration](FacebookIntegration.html) postConversationsMessagingIntegrationsFacebook(body)

Create a Facebook Integration



Wraps POST /api/v2/conversations/messaging/integrations/facebook  

Requires ANY permissions: 

* messaging:integration:add

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
FacebookIntegrationRequest body = new FacebookIntegrationRequest(); // FacebookIntegrationRequest | FacebookIntegrationRequest
try {
    FacebookIntegration result = apiInstance.postConversationsMessagingIntegrationsFacebook(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#postConversationsMessagingIntegrationsFacebook");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**FacebookIntegrationRequest**](FacebookIntegrationRequest.html)| FacebookIntegrationRequest | 
{: class="table-striped"}


### Return type

[**FacebookIntegration**](FacebookIntegration.html)

<a name="postConversationsMessagingIntegrationsLine"></a>

# **postConversationsMessagingIntegrationsLine**



> [LineIntegration](LineIntegration.html) postConversationsMessagingIntegrationsLine(body)

Create a LINE messenger Integration



Wraps POST /api/v2/conversations/messaging/integrations/line  

Requires ANY permissions: 

* messaging:integration:add

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
LineIntegrationRequest body = new LineIntegrationRequest(); // LineIntegrationRequest | LineIntegrationRequest
try {
    LineIntegration result = apiInstance.postConversationsMessagingIntegrationsLine(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#postConversationsMessagingIntegrationsLine");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**LineIntegrationRequest**](LineIntegrationRequest.html)| LineIntegrationRequest | 
{: class="table-striped"}


### Return type

[**LineIntegration**](LineIntegration.html)

<a name="postConversationsMessagingIntegrationsTwitter"></a>

# **postConversationsMessagingIntegrationsTwitter**



> [TwitterIntegration](TwitterIntegration.html) postConversationsMessagingIntegrationsTwitter(body)

Create a Twitter Integration



Wraps POST /api/v2/conversations/messaging/integrations/twitter  

Requires ANY permissions: 

* messaging:integration:add

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
TwitterIntegrationRequest body = new TwitterIntegrationRequest(); // TwitterIntegrationRequest | TwitterIntegrationRequest
try {
    TwitterIntegration result = apiInstance.postConversationsMessagingIntegrationsTwitter(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#postConversationsMessagingIntegrationsTwitter");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**TwitterIntegrationRequest**](TwitterIntegrationRequest.html)| TwitterIntegrationRequest | 
{: class="table-striped"}


### Return type

[**TwitterIntegration**](TwitterIntegration.html)

<a name="postMessagingIntegrationsFacebook"></a>

# **postMessagingIntegrationsFacebook**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [FacebookIntegration](FacebookIntegration.html) postMessagingIntegrationsFacebook(body)

Create a Facebook Integration



Wraps POST /api/v2/messaging/integrations/facebook  

Requires ANY permissions: 

* messaging:integration:add

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
FacebookIntegrationRequest body = new FacebookIntegrationRequest(); // FacebookIntegrationRequest | FacebookIntegrationRequest
try {
    FacebookIntegration result = apiInstance.postMessagingIntegrationsFacebook(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#postMessagingIntegrationsFacebook");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**FacebookIntegrationRequest**](FacebookIntegrationRequest.html)| FacebookIntegrationRequest | 
{: class="table-striped"}


### Return type

[**FacebookIntegration**](FacebookIntegration.html)

<a name="postMessagingIntegrationsLine"></a>

# **postMessagingIntegrationsLine**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [LineIntegration](LineIntegration.html) postMessagingIntegrationsLine(body)

Create a LINE messenger Integration



Wraps POST /api/v2/messaging/integrations/line  

Requires ANY permissions: 

* messaging:integration:add

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
LineIntegrationRequest body = new LineIntegrationRequest(); // LineIntegrationRequest | LineIntegrationRequest
try {
    LineIntegration result = apiInstance.postMessagingIntegrationsLine(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#postMessagingIntegrationsLine");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**LineIntegrationRequest**](LineIntegrationRequest.html)| LineIntegrationRequest | 
{: class="table-striped"}


### Return type

[**LineIntegration**](LineIntegration.html)

<a name="postMessagingIntegrationsTwitter"></a>

# **postMessagingIntegrationsTwitter**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [TwitterIntegration](TwitterIntegration.html) postMessagingIntegrationsTwitter(body)

Create a Twitter Integration



Wraps POST /api/v2/messaging/integrations/twitter  

Requires ANY permissions: 

* messaging:integration:add

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
TwitterIntegrationRequest body = new TwitterIntegrationRequest(); // TwitterIntegrationRequest | TwitterIntegrationRequest
try {
    TwitterIntegration result = apiInstance.postMessagingIntegrationsTwitter(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#postMessagingIntegrationsTwitter");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**TwitterIntegrationRequest**](TwitterIntegrationRequest.html)| TwitterIntegrationRequest | 
{: class="table-striped"}


### Return type

[**TwitterIntegration**](TwitterIntegration.html)

<a name="putConversationsMessagingIntegrationsLineIntegrationId"></a>

# **putConversationsMessagingIntegrationsLineIntegrationId**



> [LineIntegration](LineIntegration.html) putConversationsMessagingIntegrationsLineIntegrationId(integrationId, body)

Update a LINE messenger integration



Wraps PUT /api/v2/conversations/messaging/integrations/line/{integrationId}  

Requires ANY permissions: 

* messaging:integration:edit

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
String integrationId = "integrationId_example"; // String | Integration ID
LineIntegrationRequest body = new LineIntegrationRequest(); // LineIntegrationRequest | LineIntegrationRequest
try {
    LineIntegration result = apiInstance.putConversationsMessagingIntegrationsLineIntegrationId(integrationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#putConversationsMessagingIntegrationsLineIntegrationId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration ID | 
| **body** | [**LineIntegrationRequest**](LineIntegrationRequest.html)| LineIntegrationRequest | 
{: class="table-striped"}


### Return type

[**LineIntegration**](LineIntegration.html)

<a name="putMessagingIntegrationsLineIntegrationId"></a>

# **putMessagingIntegrationsLineIntegrationId**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [LineIntegration](LineIntegration.html) putMessagingIntegrationsLineIntegrationId(integrationId, body)

Update a LINE messenger integration



Wraps PUT /api/v2/messaging/integrations/line/{integrationId}  

Requires ANY permissions: 

* messaging:integration:edit

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
String integrationId = "integrationId_example"; // String | Integration ID
LineIntegrationRequest body = new LineIntegrationRequest(); // LineIntegrationRequest | LineIntegrationRequest
try {
    LineIntegration result = apiInstance.putMessagingIntegrationsLineIntegrationId(integrationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#putMessagingIntegrationsLineIntegrationId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration ID | 
| **body** | [**LineIntegrationRequest**](LineIntegrationRequest.html)| LineIntegrationRequest | 
{: class="table-striped"}


### Return type

[**LineIntegration**](LineIntegration.html)

