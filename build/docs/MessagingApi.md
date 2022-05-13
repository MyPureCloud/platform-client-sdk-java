---
title: MessagingApi
---
## MessagingApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteMessagingSupportedcontentSupportedContentId**](MessagingApi.html#deleteMessagingSupportedcontentSupportedContentId) | Delete a supported content profile |
| [**getMessagingSupportedcontent**](MessagingApi.html#getMessagingSupportedcontent) | Get a list of Supported Content profiles |
| [**getMessagingSupportedcontentSupportedContentId**](MessagingApi.html#getMessagingSupportedcontentSupportedContentId) | Get a supported content profile |
| [**patchMessagingSupportedcontentSupportedContentId**](MessagingApi.html#patchMessagingSupportedcontentSupportedContentId) | Update a supported content profile |
| [**postMessagingSupportedcontent**](MessagingApi.html#postMessagingSupportedcontent) | Create a Supported Content profile |
{: class="table-striped"}

<a name="deleteMessagingSupportedcontentSupportedContentId"></a>

# **deleteMessagingSupportedcontentSupportedContentId**



> Void deleteMessagingSupportedcontentSupportedContentId(supportedContentId)

Delete a supported content profile

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

<a name="getMessagingSupportedcontent"></a>

# **getMessagingSupportedcontent**



> [SupportedContentListing](SupportedContentListing.html) getMessagingSupportedcontent(pageSize, pageNumber)

Get a list of Supported Content profiles

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

[**SupportedContentListing**](SupportedContentListing.html)

<a name="getMessagingSupportedcontentSupportedContentId"></a>

# **getMessagingSupportedcontentSupportedContentId**



> [SupportedContent](SupportedContent.html) getMessagingSupportedcontentSupportedContentId(supportedContentId)

Get a supported content profile

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

[**SupportedContent**](SupportedContent.html)

<a name="patchMessagingSupportedcontentSupportedContentId"></a>

# **patchMessagingSupportedcontentSupportedContentId**



> [SupportedContent](SupportedContent.html) patchMessagingSupportedcontentSupportedContentId(supportedContentId, body)

Update a supported content profile

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
| **body** | [**SupportedContent**](SupportedContent.html)| SupportedContent | 
{: class="table-striped"}


### Return type

[**SupportedContent**](SupportedContent.html)

<a name="postMessagingSupportedcontent"></a>

# **postMessagingSupportedcontent**



> [SupportedContent](SupportedContent.html) postMessagingSupportedcontent(body)

Create a Supported Content profile

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
| **body** | [**SupportedContent**](SupportedContent.html)| SupportedContent | 
{: class="table-striped"}


### Return type

[**SupportedContent**](SupportedContent.html)

