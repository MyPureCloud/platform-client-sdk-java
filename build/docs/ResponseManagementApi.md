# ResponseManagementApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteResponsemanagementLibrary**](ResponseManagementApi#deleteResponsemanagementLibrary) | Delete an existing response library. |
| [**deleteResponsemanagementResponse**](ResponseManagementApi#deleteResponsemanagementResponse) | Delete an existing response. |
| [**deleteResponsemanagementResponseasset**](ResponseManagementApi#deleteResponsemanagementResponseasset) | Delete response asset |
| [**getResponsemanagementLibraries**](ResponseManagementApi#getResponsemanagementLibraries) | Gets a list of existing response libraries. |
| [**getResponsemanagementLibrary**](ResponseManagementApi#getResponsemanagementLibrary) | Get details about an existing response library. |
| [**getResponsemanagementResponse**](ResponseManagementApi#getResponsemanagementResponse) | Get details about an existing response. |
| [**getResponsemanagementResponseasset**](ResponseManagementApi#getResponsemanagementResponseasset) | Get response asset information |
| [**getResponsemanagementResponseassetsStatusStatusId**](ResponseManagementApi#getResponsemanagementResponseassetsStatusStatusId) | Get response asset upload status |
| [**getResponsemanagementResponses**](ResponseManagementApi#getResponsemanagementResponses) | Gets a list of existing responses. |
| [**postResponsemanagementLibraries**](ResponseManagementApi#postResponsemanagementLibraries) | Create a response library. |
| [**postResponsemanagementLibrariesBulk**](ResponseManagementApi#postResponsemanagementLibrariesBulk) | Get response libraries. |
| [**postResponsemanagementResponseassetsSearch**](ResponseManagementApi#postResponsemanagementResponseassetsSearch) | Search response assets |
| [**postResponsemanagementResponseassetsUploads**](ResponseManagementApi#postResponsemanagementResponseassetsUploads) | Creates pre-signed url for uploading response asset |
| [**postResponsemanagementResponses**](ResponseManagementApi#postResponsemanagementResponses) | Create a response. |
| [**postResponsemanagementResponsesQuery**](ResponseManagementApi#postResponsemanagementResponsesQuery) | Query responses |
| [**putResponsemanagementLibrary**](ResponseManagementApi#putResponsemanagementLibrary) | Update an existing response library. |
| [**putResponsemanagementResponse**](ResponseManagementApi#putResponsemanagementResponse) | Update an existing response. |
| [**putResponsemanagementResponseasset**](ResponseManagementApi#putResponsemanagementResponseasset) | Update response asset |
{: class="table-striped"}


# **deleteResponsemanagementLibrary**


> Void deleteResponsemanagementLibrary(libraryId)

Delete an existing response library.

This will remove any responses associated with the library.

Wraps DELETE /api/v2/responsemanagement/libraries/{libraryId}  

Requires ANY permissions: 

* responses:library:delete

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


# **deleteResponsemanagementResponse**


> Void deleteResponsemanagementResponse(responseId)

Delete an existing response.

This will remove the response from any libraries associated with it.

Wraps DELETE /api/v2/responsemanagement/responses/{responseId}  

Requires ANY permissions: 

* responses:response:delete

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


# **deleteResponsemanagementResponseasset**


> Void deleteResponsemanagementResponseasset(responseAssetId)

Delete response asset

Wraps DELETE /api/v2/responsemanagement/responseassets/{responseAssetId}  

Requires ANY permissions: 

* responseAssets:asset:delete

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
String responseAssetId = "responseAssetId_example"; // String | Asset Id
try {
    apiInstance.deleteResponsemanagementResponseasset(responseAssetId);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponseManagementApi#deleteResponsemanagementResponseasset");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **responseAssetId** | **String**| Asset Id | 
{: class="table-striped"}


### Return type

null (empty response body)


# **getResponsemanagementLibraries**


> [LibraryEntityListing](LibraryEntityListing) getResponsemanagementLibraries(pageNumber, pageSize, messagingTemplateFilter, libraryPrefix)

Gets a list of existing response libraries.

Wraps GET /api/v2/responsemanagement/libraries  

Requires ANY permissions: 

* responses:library:view

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
String libraryPrefix = "libraryPrefix_example"; // String | Returns a list of libraries that contain the prefix provided
try {
    LibraryEntityListing result = apiInstance.getResponsemanagementLibraries(pageNumber, pageSize, messagingTemplateFilter, libraryPrefix);
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
| **libraryPrefix** | **String**| Returns a list of libraries that contain the prefix provided | [optional] 
{: class="table-striped"}


### Return type

[**LibraryEntityListing**](LibraryEntityListing)


# **getResponsemanagementLibrary**


> [Library](Library) getResponsemanagementLibrary(libraryId)

Get details about an existing response library.

Wraps GET /api/v2/responsemanagement/libraries/{libraryId}  

Requires ANY permissions: 

* responses:library:view

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

[**Library**](Library)


# **getResponsemanagementResponse**


> [Response](Response) getResponsemanagementResponse(responseId, expand)

Get details about an existing response.

Wraps GET /api/v2/responsemanagement/responses/{responseId}  

Requires ANY permissions: 

* responses:response:view

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

[**Response**](Response)


# **getResponsemanagementResponseasset**


> [ResponseAsset](ResponseAsset) getResponsemanagementResponseasset(responseAssetId)

Get response asset information

Wraps GET /api/v2/responsemanagement/responseassets/{responseAssetId}  

Requires ANY permissions: 

* responseAssets:asset:view

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
String responseAssetId = "responseAssetId_example"; // String | Asset Id
try {
    ResponseAsset result = apiInstance.getResponsemanagementResponseasset(responseAssetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponseManagementApi#getResponsemanagementResponseasset");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **responseAssetId** | **String**| Asset Id | 
{: class="table-striped"}


### Return type

[**ResponseAsset**](ResponseAsset)


# **getResponsemanagementResponseassetsStatusStatusId**


> [ResponseAssetStatus](ResponseAssetStatus) getResponsemanagementResponseassetsStatusStatusId(statusId)

Get response asset upload status

Wraps GET /api/v2/responsemanagement/responseassets/status/{statusId}  

Requires ANY permissions: 

* responseAssets:asset:view

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
String statusId = "statusId_example"; // String | Status Id
try {
    ResponseAssetStatus result = apiInstance.getResponsemanagementResponseassetsStatusStatusId(statusId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponseManagementApi#getResponsemanagementResponseassetsStatusStatusId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **statusId** | **String**| Status Id | 
{: class="table-striped"}


### Return type

[**ResponseAssetStatus**](ResponseAssetStatus)


# **getResponsemanagementResponses**


> [ResponseEntityListing](ResponseEntityListing) getResponsemanagementResponses(libraryId, pageNumber, pageSize, expand)

Gets a list of existing responses.

Wraps GET /api/v2/responsemanagement/responses  

Requires ANY permissions: 

* responses:response:view

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

[**ResponseEntityListing**](ResponseEntityListing)


# **postResponsemanagementLibraries**


> [Library](Library) postResponsemanagementLibraries(body)

Create a response library.

Wraps POST /api/v2/responsemanagement/libraries  

Requires ANY permissions: 

* responses:library:add

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
| **body** | [**Library**](Library)| Library | 
{: class="table-striped"}


### Return type

[**Library**](Library)


# **postResponsemanagementLibrariesBulk**


> [LibraryEntityListing](LibraryEntityListing) postResponsemanagementLibrariesBulk(body)

Get response libraries.

Wraps POST /api/v2/responsemanagement/libraries/bulk  

Requires ANY permissions: 

* responses:library:view

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
LibraryBatchRequest body = new LibraryBatchRequest(); // LibraryBatchRequest | LibraryIDs (max allowed 50)
try {
    LibraryEntityListing result = apiInstance.postResponsemanagementLibrariesBulk(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponseManagementApi#postResponsemanagementLibrariesBulk");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**LibraryBatchRequest**](LibraryBatchRequest)| LibraryIDs (max allowed 50) | 
{: class="table-striped"}


### Return type

[**LibraryEntityListing**](LibraryEntityListing)


# **postResponsemanagementResponseassetsSearch**


> [ResponseAssetSearchResults](ResponseAssetSearchResults) postResponsemanagementResponseassetsSearch(body, expand)

Search response assets

Wraps POST /api/v2/responsemanagement/responseassets/search  

Requires ALL permissions: 

* responseAssets:asset:view

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
ResponseAssetSearchRequest body = new ResponseAssetSearchRequest(); // ResponseAssetSearchRequest | request
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand
try {
    ResponseAssetSearchResults result = apiInstance.postResponsemanagementResponseassetsSearch(body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponseManagementApi#postResponsemanagementResponseassetsSearch");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**ResponseAssetSearchRequest**](ResponseAssetSearchRequest)| request | 
| **expand** | [**List&lt;String&gt;**](String)| Which fields, if any, to expand | [optional]<br />**Values**: user, division 
{: class="table-striped"}


### Return type

[**ResponseAssetSearchResults**](ResponseAssetSearchResults)


# **postResponsemanagementResponseassetsUploads**


> [CreateResponseAssetResponse](CreateResponseAssetResponse) postResponsemanagementResponseassetsUploads(body)

Creates pre-signed url for uploading response asset

Wraps POST /api/v2/responsemanagement/responseassets/uploads  

Requires ANY permissions: 

* responseAssets:asset:add

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
CreateResponseAssetRequest body = new CreateResponseAssetRequest(); // CreateResponseAssetRequest | request
try {
    CreateResponseAssetResponse result = apiInstance.postResponsemanagementResponseassetsUploads(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponseManagementApi#postResponsemanagementResponseassetsUploads");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**CreateResponseAssetRequest**](CreateResponseAssetRequest)| request | 
{: class="table-striped"}


### Return type

[**CreateResponseAssetResponse**](CreateResponseAssetResponse)


# **postResponsemanagementResponses**


> [Response](Response) postResponsemanagementResponses(body, expand)

Create a response.

Wraps POST /api/v2/responsemanagement/responses  

Requires ANY permissions: 

* responses:response:add

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
| **body** | [**Response**](Response)| Response | 
| **expand** | **String**| Expand instructions for the return value. | [optional]<br />**Values**: substitutionsSchema 
{: class="table-striped"}


### Return type

[**Response**](Response)


# **postResponsemanagementResponsesQuery**


> [ResponseQueryResults](ResponseQueryResults) postResponsemanagementResponsesQuery(body)

Query responses

Wraps POST /api/v2/responsemanagement/responses/query  

Requires ANY permissions: 

* responses:response:view

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
| **body** | [**ResponseQueryRequest**](ResponseQueryRequest)| Response | 
{: class="table-striped"}


### Return type

[**ResponseQueryResults**](ResponseQueryResults)


# **putResponsemanagementLibrary**


> [Library](Library) putResponsemanagementLibrary(libraryId, body)

Update an existing response library.

Fields that can be updated: name. The most recent version is required for updates.

Wraps PUT /api/v2/responsemanagement/libraries/{libraryId}  

Requires ANY permissions: 

* responses:library:edit

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
| **body** | [**Library**](Library)| Library | 
{: class="table-striped"}


### Return type

[**Library**](Library)


# **putResponsemanagementResponse**


> [Response](Response) putResponsemanagementResponse(responseId, body, expand)

Update an existing response.

Fields that can be updated: name, libraries, and texts. The most recent version is required for updates.

Wraps PUT /api/v2/responsemanagement/responses/{responseId}  

Requires ANY permissions: 

* responses:response:edit

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
| **body** | [**Response**](Response)| Response | 
| **expand** | **String**| Expand instructions for the return value. | [optional]<br />**Values**: substitutionsSchema 
{: class="table-striped"}


### Return type

[**Response**](Response)


# **putResponsemanagementResponseasset**


> [ResponseAsset](ResponseAsset) putResponsemanagementResponseasset(responseAssetId, body)

Update response asset

Wraps PUT /api/v2/responsemanagement/responseassets/{responseAssetId}  

Requires ALL permissions: 

* responseAssets:asset:edit

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
String responseAssetId = "responseAssetId_example"; // String | Asset Id
ResponseAssetRequest body = new ResponseAssetRequest(); // ResponseAssetRequest | request
try {
    ResponseAsset result = apiInstance.putResponsemanagementResponseasset(responseAssetId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponseManagementApi#putResponsemanagementResponseasset");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **responseAssetId** | **String**| Asset Id | 
| **body** | [**ResponseAssetRequest**](ResponseAssetRequest)| request | 
{: class="table-striped"}


### Return type

[**ResponseAsset**](ResponseAsset)


_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
