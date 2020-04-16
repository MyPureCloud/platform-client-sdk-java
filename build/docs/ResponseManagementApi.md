---
title: ResponseManagementApi
---
## ResponseManagementApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteResponsemanagementLibrary**](ResponseManagementApi.html#deleteResponsemanagementLibrary) | Delete an existing response library. |
| [**deleteResponsemanagementResponse**](ResponseManagementApi.html#deleteResponsemanagementResponse) | Delete an existing response. |
| [**getResponsemanagementLibraries**](ResponseManagementApi.html#getResponsemanagementLibraries) | Gets a list of existing response libraries. |
| [**getResponsemanagementLibrary**](ResponseManagementApi.html#getResponsemanagementLibrary) | Get details about an existing response library. |
| [**getResponsemanagementResponse**](ResponseManagementApi.html#getResponsemanagementResponse) | Get details about an existing response. |
| [**getResponsemanagementResponses**](ResponseManagementApi.html#getResponsemanagementResponses) | Gets a list of existing responses. |
| [**postResponsemanagementLibraries**](ResponseManagementApi.html#postResponsemanagementLibraries) | Create a response library. |
| [**postResponsemanagementResponses**](ResponseManagementApi.html#postResponsemanagementResponses) | Create a response. |
| [**postResponsemanagementResponsesQuery**](ResponseManagementApi.html#postResponsemanagementResponsesQuery) | Query responses |
| [**putResponsemanagementLibrary**](ResponseManagementApi.html#putResponsemanagementLibrary) | Update an existing response library. |
| [**putResponsemanagementResponse**](ResponseManagementApi.html#putResponsemanagementResponse) | Update an existing response. |
{: class="table-striped"}

<a name="deleteResponsemanagementLibrary"></a>

# **deleteResponsemanagementLibrary**



> Void deleteResponsemanagementLibrary(libraryId)

Delete an existing response library.

This will remove any responses associated with the library.

Wraps DELETE /api/v2/responsemanagement/libraries/{libraryId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ResponseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ResponseManagementApi apiInstance = new ResponseManagementApi();
String libraryId = "libraryId_example"; // String | Library ID
try {
    apiInstance.deleteResponsemanagementLibrary(libraryId);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponseManagementApi#deleteResponsemanagementLibrary");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **libraryId** | **String**| Library ID | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteResponsemanagementResponse"></a>

# **deleteResponsemanagementResponse**



> Void deleteResponsemanagementResponse(responseId)

Delete an existing response.

This will remove the response from any libraries associated with it.

Wraps DELETE /api/v2/responsemanagement/responses/{responseId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ResponseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ResponseManagementApi apiInstance = new ResponseManagementApi();
String responseId = "responseId_example"; // String | Response ID
try {
    apiInstance.deleteResponsemanagementResponse(responseId);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponseManagementApi#deleteResponsemanagementResponse");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **responseId** | **String**| Response ID | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="getResponsemanagementLibraries"></a>

# **getResponsemanagementLibraries**



> [LibraryEntityListing](LibraryEntityListing.html) getResponsemanagementLibraries(pageNumber, pageSize, messagingTemplateFilter)

Gets a list of existing response libraries.



Wraps GET /api/v2/responsemanagement/libraries  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ResponseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ResponseManagementApi apiInstance = new ResponseManagementApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String messagingTemplateFilter = "messagingTemplateFilter_example"; // String | Returns a list of libraries that contain responses with at least one messaging template defined for a specific message channel
try {
    LibraryEntityListing result = apiInstance.getResponsemanagementLibraries(pageNumber, pageSize, messagingTemplateFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponseManagementApi#getResponsemanagementLibraries");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **messagingTemplateFilter** | **String**| Returns a list of libraries that contain responses with at least one messaging template defined for a specific message channel | [optional]<br />**Values**: whatsapp 
{: class="table-striped"}


### Return type

[**LibraryEntityListing**](LibraryEntityListing.html)

<a name="getResponsemanagementLibrary"></a>

# **getResponsemanagementLibrary**



> [Library](Library.html) getResponsemanagementLibrary(libraryId)

Get details about an existing response library.



Wraps GET /api/v2/responsemanagement/libraries/{libraryId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ResponseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ResponseManagementApi apiInstance = new ResponseManagementApi();
String libraryId = "libraryId_example"; // String | Library ID
try {
    Library result = apiInstance.getResponsemanagementLibrary(libraryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponseManagementApi#getResponsemanagementLibrary");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **libraryId** | **String**| Library ID | 
{: class="table-striped"}


### Return type

[**Library**](Library.html)

<a name="getResponsemanagementResponse"></a>

# **getResponsemanagementResponse**



> [Response](Response.html) getResponsemanagementResponse(responseId, expand)

Get details about an existing response.



Wraps GET /api/v2/responsemanagement/responses/{responseId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ResponseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ResponseManagementApi apiInstance = new ResponseManagementApi();
String responseId = "responseId_example"; // String | Response ID
String expand = "expand_example"; // String | Expand instructions for the return value.
try {
    Response result = apiInstance.getResponsemanagementResponse(responseId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponseManagementApi#getResponsemanagementResponse");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **responseId** | **String**| Response ID | 
| **expand** | **String**| Expand instructions for the return value. | [optional]<br />**Values**: substitutionsSchema 
{: class="table-striped"}


### Return type

[**Response**](Response.html)

<a name="getResponsemanagementResponses"></a>

# **getResponsemanagementResponses**



> [ResponseEntityListing](ResponseEntityListing.html) getResponsemanagementResponses(libraryId, pageNumber, pageSize, expand)

Gets a list of existing responses.



Wraps GET /api/v2/responsemanagement/responses  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ResponseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ResponseManagementApi apiInstance = new ResponseManagementApi();
String libraryId = "libraryId_example"; // String | Library ID
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String expand = "expand_example"; // String | Expand instructions for the return value.
try {
    ResponseEntityListing result = apiInstance.getResponsemanagementResponses(libraryId, pageNumber, pageSize, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponseManagementApi#getResponsemanagementResponses");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **libraryId** | **String**| Library ID | 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **expand** | **String**| Expand instructions for the return value. | [optional]<br />**Values**: substitutionsSchema 
{: class="table-striped"}


### Return type

[**ResponseEntityListing**](ResponseEntityListing.html)

<a name="postResponsemanagementLibraries"></a>

# **postResponsemanagementLibraries**



> [Library](Library.html) postResponsemanagementLibraries(body)

Create a response library.



Wraps POST /api/v2/responsemanagement/libraries  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ResponseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ResponseManagementApi apiInstance = new ResponseManagementApi();
Library body = new Library(); // Library | Library
try {
    Library result = apiInstance.postResponsemanagementLibraries(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponseManagementApi#postResponsemanagementLibraries");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**Library**](Library.html)| Library | 
{: class="table-striped"}


### Return type

[**Library**](Library.html)

<a name="postResponsemanagementResponses"></a>

# **postResponsemanagementResponses**



> [Response](Response.html) postResponsemanagementResponses(body, expand)

Create a response.



Wraps POST /api/v2/responsemanagement/responses  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ResponseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ResponseManagementApi apiInstance = new ResponseManagementApi();
Response body = new Response(); // Response | Response
String expand = "expand_example"; // String | Expand instructions for the return value.
try {
    Response result = apiInstance.postResponsemanagementResponses(body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponseManagementApi#postResponsemanagementResponses");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**Response**](Response.html)| Response | 
| **expand** | **String**| Expand instructions for the return value. | [optional]<br />**Values**: substitutionsSchema 
{: class="table-striped"}


### Return type

[**Response**](Response.html)

<a name="postResponsemanagementResponsesQuery"></a>

# **postResponsemanagementResponsesQuery**



> [ResponseQueryResults](ResponseQueryResults.html) postResponsemanagementResponsesQuery(body)

Query responses



Wraps POST /api/v2/responsemanagement/responses/query  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ResponseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ResponseManagementApi apiInstance = new ResponseManagementApi();
ResponseQueryRequest body = new ResponseQueryRequest(); // ResponseQueryRequest | Response
try {
    ResponseQueryResults result = apiInstance.postResponsemanagementResponsesQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponseManagementApi#postResponsemanagementResponsesQuery");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**ResponseQueryRequest**](ResponseQueryRequest.html)| Response | 
{: class="table-striped"}


### Return type

[**ResponseQueryResults**](ResponseQueryResults.html)

<a name="putResponsemanagementLibrary"></a>

# **putResponsemanagementLibrary**



> [Library](Library.html) putResponsemanagementLibrary(libraryId, body)

Update an existing response library.

Fields that can be updated: name. The most recent version is required for updates.

Wraps PUT /api/v2/responsemanagement/libraries/{libraryId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ResponseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ResponseManagementApi apiInstance = new ResponseManagementApi();
String libraryId = "libraryId_example"; // String | Library ID
Library body = new Library(); // Library | Library
try {
    Library result = apiInstance.putResponsemanagementLibrary(libraryId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponseManagementApi#putResponsemanagementLibrary");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **libraryId** | **String**| Library ID | 
| **body** | [**Library**](Library.html)| Library | 
{: class="table-striped"}


### Return type

[**Library**](Library.html)

<a name="putResponsemanagementResponse"></a>

# **putResponsemanagementResponse**



> [Response](Response.html) putResponsemanagementResponse(responseId, body, expand)

Update an existing response.

Fields that can be updated: name, libraries, and texts. The most recent version is required for updates.

Wraps PUT /api/v2/responsemanagement/responses/{responseId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ResponseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ResponseManagementApi apiInstance = new ResponseManagementApi();
String responseId = "responseId_example"; // String | Response ID
Response body = new Response(); // Response | Response
String expand = "expand_example"; // String | Expand instructions for the return value.
try {
    Response result = apiInstance.putResponsemanagementResponse(responseId, body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponseManagementApi#putResponsemanagementResponse");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **responseId** | **String**| Response ID | 
| **body** | [**Response**](Response.html)| Response | 
| **expand** | **String**| Expand instructions for the return value. | [optional]<br />**Values**: substitutionsSchema 
{: class="table-striped"}


### Return type

[**Response**](Response.html)

