---
title: MessagingApi
---
## MessagingApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteMessagingIntegrationsFacebookIntegrationId**](MessagingApi.html#deleteMessagingIntegrationsFacebookIntegrationId) | Delete a Facebook messaging integration |
| [**deleteMessagingIntegrationsLineIntegrationId**](MessagingApi.html#deleteMessagingIntegrationsLineIntegrationId) | Delete a LINE messenger integration |
| [**deleteMessagingIntegrationsTwitterIntegrationId**](MessagingApi.html#deleteMessagingIntegrationsTwitterIntegrationId) | Delete a Twitter messaging integration |
| [**getMessagingIntegrationsFacebook**](MessagingApi.html#getMessagingIntegrationsFacebook) | Get a list of Facebook Integrations |
| [**getMessagingIntegrationsFacebookIntegrationId**](MessagingApi.html#getMessagingIntegrationsFacebookIntegrationId) | Get a Facebook messaging integration |
| [**getMessagingIntegrationsLine**](MessagingApi.html#getMessagingIntegrationsLine) | Get a list of LINE messenger Integrations |
| [**getMessagingIntegrationsLineIntegrationId**](MessagingApi.html#getMessagingIntegrationsLineIntegrationId) | Get a LINE messenger integration |
| [**getMessagingIntegrationsTwitter**](MessagingApi.html#getMessagingIntegrationsTwitter) | Get a list of Twitter Integrations |
| [**getMessagingIntegrationsTwitterIntegrationId**](MessagingApi.html#getMessagingIntegrationsTwitterIntegrationId) | Get a Twitter messaging integration |
| [**getMessagingSticker**](MessagingApi.html#getMessagingSticker) | Get a list of Messaging Stickers |
| [**postMessagingIntegrationsFacebook**](MessagingApi.html#postMessagingIntegrationsFacebook) | Create a Facebook Integration |
| [**postMessagingIntegrationsLine**](MessagingApi.html#postMessagingIntegrationsLine) | Create a LINE messenger Integration |
| [**postMessagingIntegrationsLineWebhookIntegrationId**](MessagingApi.html#postMessagingIntegrationsLineWebhookIntegrationId) | Webhook redirect for LINE messenger Integration |
| [**postMessagingIntegrationsTwitter**](MessagingApi.html#postMessagingIntegrationsTwitter) | Create a Twitter Integration |
| [**putMessagingIntegrationsLineIntegrationId**](MessagingApi.html#putMessagingIntegrationsLineIntegrationId) | Update a LINE messenger integration |
{: class="table table-striped"}

<a name="deleteMessagingIntegrationsFacebookIntegrationId"></a>

# **deleteMessagingIntegrationsFacebookIntegrationId**



> Void deleteMessagingIntegrationsFacebookIntegrationId(integrationId)

Delete a Facebook messaging integration



Wraps DELETE /api/v2/messaging/integrations/facebook/{integrationId}  

Requires ANY permissions: 

* messaging:integration:delete

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.MessagingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

MessagingApi apiInstance = new MessagingApi();
String integrationId = "integrationId_example"; // String | Integration ID
try {
    apiInstance.deleteMessagingIntegrationsFacebookIntegrationId(integrationId);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#deleteMessagingIntegrationsFacebookIntegrationId");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration ID | |
{: class="table table-striped"}

### Return type

null (empty response body)

<a name="deleteMessagingIntegrationsLineIntegrationId"></a>

# **deleteMessagingIntegrationsLineIntegrationId**



> Void deleteMessagingIntegrationsLineIntegrationId(integrationId)

Delete a LINE messenger integration



Wraps DELETE /api/v2/messaging/integrations/line/{integrationId}  

Requires ANY permissions: 

* messaging:integration:delete

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.MessagingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

MessagingApi apiInstance = new MessagingApi();
String integrationId = "integrationId_example"; // String | Integration ID
try {
    apiInstance.deleteMessagingIntegrationsLineIntegrationId(integrationId);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#deleteMessagingIntegrationsLineIntegrationId");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration ID | |
{: class="table table-striped"}

### Return type

null (empty response body)

<a name="deleteMessagingIntegrationsTwitterIntegrationId"></a>

# **deleteMessagingIntegrationsTwitterIntegrationId**



> Void deleteMessagingIntegrationsTwitterIntegrationId(integrationId)

Delete a Twitter messaging integration



Wraps DELETE /api/v2/messaging/integrations/twitter/{integrationId}  

Requires ANY permissions: 

* messaging:integration:delete

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.MessagingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

MessagingApi apiInstance = new MessagingApi();
String integrationId = "integrationId_example"; // String | Integration ID
try {
    apiInstance.deleteMessagingIntegrationsTwitterIntegrationId(integrationId);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#deleteMessagingIntegrationsTwitterIntegrationId");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration ID | |
{: class="table table-striped"}

### Return type

null (empty response body)

<a name="getMessagingIntegrationsFacebook"></a>

# **getMessagingIntegrationsFacebook**



> [FacebookIntegrationEntityListing](FacebookIntegrationEntityListing.html) getMessagingIntegrationsFacebook(pageSize, pageNumber)

Get a list of Facebook Integrations



Wraps GET /api/v2/messaging/integrations/facebook  

Requires ANY permissions: 

* messaging:integration:view

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.MessagingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

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
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] |
{: class="table table-striped"}

### Return type

[**FacebookIntegrationEntityListing**](FacebookIntegrationEntityListing.html)

<a name="getMessagingIntegrationsFacebookIntegrationId"></a>

# **getMessagingIntegrationsFacebookIntegrationId**



> [FacebookIntegration](FacebookIntegration.html) getMessagingIntegrationsFacebookIntegrationId(integrationId)

Get a Facebook messaging integration



Wraps GET /api/v2/messaging/integrations/facebook/{integrationId}  

Requires ANY permissions: 

* messaging:integration:view

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.MessagingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

MessagingApi apiInstance = new MessagingApi();
String integrationId = "integrationId_example"; // String | Integration ID
try {
    FacebookIntegration result = apiInstance.getMessagingIntegrationsFacebookIntegrationId(integrationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#getMessagingIntegrationsFacebookIntegrationId");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration ID | |
{: class="table table-striped"}

### Return type

[**FacebookIntegration**](FacebookIntegration.html)

<a name="getMessagingIntegrationsLine"></a>

# **getMessagingIntegrationsLine**



> [LineIntegrationEntityListing](LineIntegrationEntityListing.html) getMessagingIntegrationsLine(pageSize, pageNumber)

Get a list of LINE messenger Integrations



Wraps GET /api/v2/messaging/integrations/line  

Requires ANY permissions: 

* messaging:integration:view

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.MessagingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

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
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] |
{: class="table table-striped"}

### Return type

[**LineIntegrationEntityListing**](LineIntegrationEntityListing.html)

<a name="getMessagingIntegrationsLineIntegrationId"></a>

# **getMessagingIntegrationsLineIntegrationId**



> [LineIntegration](LineIntegration.html) getMessagingIntegrationsLineIntegrationId(integrationId)

Get a LINE messenger integration



Wraps GET /api/v2/messaging/integrations/line/{integrationId}  

Requires ANY permissions: 

* messaging:integration:view

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.MessagingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

MessagingApi apiInstance = new MessagingApi();
String integrationId = "integrationId_example"; // String | Integration ID
try {
    LineIntegration result = apiInstance.getMessagingIntegrationsLineIntegrationId(integrationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#getMessagingIntegrationsLineIntegrationId");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration ID | |
{: class="table table-striped"}

### Return type

[**LineIntegration**](LineIntegration.html)

<a name="getMessagingIntegrationsTwitter"></a>

# **getMessagingIntegrationsTwitter**



> [TwitterIntegrationEntityListing](TwitterIntegrationEntityListing.html) getMessagingIntegrationsTwitter(pageSize, pageNumber)

Get a list of Twitter Integrations



Wraps GET /api/v2/messaging/integrations/twitter  

Requires ANY permissions: 

* messaging:integration:view

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.MessagingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

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
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] |
{: class="table table-striped"}

### Return type

[**TwitterIntegrationEntityListing**](TwitterIntegrationEntityListing.html)

<a name="getMessagingIntegrationsTwitterIntegrationId"></a>

# **getMessagingIntegrationsTwitterIntegrationId**



> [TwitterIntegration](TwitterIntegration.html) getMessagingIntegrationsTwitterIntegrationId(integrationId)

Get a Twitter messaging integration



Wraps GET /api/v2/messaging/integrations/twitter/{integrationId}  

Requires ANY permissions: 

* messaging:integration:view

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.MessagingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

MessagingApi apiInstance = new MessagingApi();
String integrationId = "integrationId_example"; // String | Integration ID
try {
    TwitterIntegration result = apiInstance.getMessagingIntegrationsTwitterIntegrationId(integrationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#getMessagingIntegrationsTwitterIntegrationId");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration ID | |
{: class="table table-striped"}

### Return type

[**TwitterIntegration**](TwitterIntegration.html)

<a name="getMessagingSticker"></a>

# **getMessagingSticker**



> [MessagingStickerEntityListing](MessagingStickerEntityListing.html) getMessagingSticker(messengerType, pageSize, pageNumber)

Get a list of Messaging Stickers



Wraps GET /api/v2/messaging/stickers/{messengerType}  

Requires ANY permissions: 

* conversation:message:create

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.MessagingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

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
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **messengerType** | **String**| Messenger Type | |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] |
{: class="table table-striped"}

### Return type

[**MessagingStickerEntityListing**](MessagingStickerEntityListing.html)

<a name="postMessagingIntegrationsFacebook"></a>

# **postMessagingIntegrationsFacebook**



> [FacebookIntegration](FacebookIntegration.html) postMessagingIntegrationsFacebook(body)

Create a Facebook Integration



Wraps POST /api/v2/messaging/integrations/facebook  

Requires ANY permissions: 

* messaging:integration:add

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.MessagingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

MessagingApi apiInstance = new MessagingApi();
FacebookIntegrationRequest body = new FacebookIntegrationRequest(); // FacebookIntegrationRequest | FacebookIntegrationRequest
try {
    FacebookIntegration result = apiInstance.postMessagingIntegrationsFacebook(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#postMessagingIntegrationsFacebook");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**FacebookIntegrationRequest**](FacebookIntegrationRequest.html)| FacebookIntegrationRequest | |
{: class="table table-striped"}

### Return type

[**FacebookIntegration**](FacebookIntegration.html)

<a name="postMessagingIntegrationsLine"></a>

# **postMessagingIntegrationsLine**



> [LineIntegration](LineIntegration.html) postMessagingIntegrationsLine(body)

Create a LINE messenger Integration



Wraps POST /api/v2/messaging/integrations/line  

Requires ANY permissions: 

* messaging:integration:add

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.MessagingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

MessagingApi apiInstance = new MessagingApi();
LineIntegrationRequest body = new LineIntegrationRequest(); // LineIntegrationRequest | LineIntegrationRequest
try {
    LineIntegration result = apiInstance.postMessagingIntegrationsLine(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#postMessagingIntegrationsLine");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**LineIntegrationRequest**](LineIntegrationRequest.html)| LineIntegrationRequest | |
{: class="table table-striped"}

### Return type

[**LineIntegration**](LineIntegration.html)

<a name="postMessagingIntegrationsLineWebhookIntegrationId"></a>

# **postMessagingIntegrationsLineWebhookIntegrationId**



> Void postMessagingIntegrationsLineWebhookIntegrationId(integrationId)

Webhook redirect for LINE messenger Integration



Wraps POST /api/v2/messaging/integrations/line/webhook/{integrationId}  

Requires NO permissions: 


### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.MessagingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

MessagingApi apiInstance = new MessagingApi();
String integrationId = "integrationId_example"; // String | Integration ID
try {
    apiInstance.postMessagingIntegrationsLineWebhookIntegrationId(integrationId);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#postMessagingIntegrationsLineWebhookIntegrationId");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration ID | |
{: class="table table-striped"}

### Return type

null (empty response body)

<a name="postMessagingIntegrationsTwitter"></a>

# **postMessagingIntegrationsTwitter**



> [TwitterIntegration](TwitterIntegration.html) postMessagingIntegrationsTwitter(body)

Create a Twitter Integration



Wraps POST /api/v2/messaging/integrations/twitter  

Requires ANY permissions: 

* messaging:integration:add

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.MessagingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

MessagingApi apiInstance = new MessagingApi();
TwitterIntegrationRequest body = new TwitterIntegrationRequest(); // TwitterIntegrationRequest | TwitterIntegrationRequest
try {
    TwitterIntegration result = apiInstance.postMessagingIntegrationsTwitter(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#postMessagingIntegrationsTwitter");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**TwitterIntegrationRequest**](TwitterIntegrationRequest.html)| TwitterIntegrationRequest | |
{: class="table table-striped"}

### Return type

[**TwitterIntegration**](TwitterIntegration.html)

<a name="putMessagingIntegrationsLineIntegrationId"></a>

# **putMessagingIntegrationsLineIntegrationId**



> [LineIntegration](LineIntegration.html) putMessagingIntegrationsLineIntegrationId(integrationId, body)

Update a LINE messenger integration



Wraps PUT /api/v2/messaging/integrations/line/{integrationId}  

Requires ANY permissions: 

* messaging:integration:edit

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.MessagingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

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
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration ID | |
| **body** | [**LineIntegrationRequest**](LineIntegrationRequest.html)| LineIntegrationRequest | |
{: class="table table-striped"}

### Return type

[**LineIntegration**](LineIntegration.html)

