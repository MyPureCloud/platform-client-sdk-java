---
title: ArchitectApi
---
## ArchitectApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteArchitectPrompt**](ArchitectApi.html#deleteArchitectPrompt) | Delete specified user prompt |
| [**deleteArchitectPromptResource**](ArchitectApi.html#deleteArchitectPromptResource) | Delete specified user prompt resource |
| [**deleteArchitectPrompts**](ArchitectApi.html#deleteArchitectPrompts) | Batch-delete a list of prompts asynchronously |
| [**deleteArchitectSystempromptResource**](ArchitectApi.html#deleteArchitectSystempromptResource) | Delete a system prompt resource override. |
| [**getArchitectPrompt**](ArchitectApi.html#getArchitectPrompt) | Get specified user prompt |
| [**getArchitectPromptResource**](ArchitectApi.html#getArchitectPromptResource) | Get specified user prompt resource |
| [**getArchitectPromptResources**](ArchitectApi.html#getArchitectPromptResources) | Get a pageable list of user prompt resources |
| [**getArchitectPrompts**](ArchitectApi.html#getArchitectPrompts) | Get a pageable list of user prompts |
| [**getArchitectSystemprompt**](ArchitectApi.html#getArchitectSystemprompt) | Get a system prompt |
| [**getArchitectSystempromptResource**](ArchitectApi.html#getArchitectSystempromptResource) | Get a system prompt resource. |
| [**getArchitectSystempromptResources**](ArchitectApi.html#getArchitectSystempromptResources) | Get IVR System Prompt resources. |
| [**getArchitectSystemprompts**](ArchitectApi.html#getArchitectSystemprompts) | Get System Prompts |
| [**getFlows**](ArchitectApi.html#getFlows) | Get a pageable list of flows, filtered by query parameters |
| [**postArchitectPromptResources**](ArchitectApi.html#postArchitectPromptResources) | Create a new user prompt resource |
| [**postArchitectPrompts**](ArchitectApi.html#postArchitectPrompts) | Create a new user prompt |
| [**postArchitectSystempromptResources**](ArchitectApi.html#postArchitectSystempromptResources) | Create system prompt resource override. |
| [**putArchitectPrompt**](ArchitectApi.html#putArchitectPrompt) | Update specified user prompt |
| [**putArchitectPromptResource**](ArchitectApi.html#putArchitectPromptResource) | Update specified user prompt resource |
| [**putArchitectSystempromptResource**](ArchitectApi.html#putArchitectSystempromptResource) | Updates a system prompt resource override. |
{: class="table table-striped"}

<a name="deleteArchitectPrompt"></a>

# **deleteArchitectPrompt**

> Void deleteArchitectPrompt(promptId, allResources)

Delete specified user prompt



Wraps DELETE /api/v2/architect/prompts/{promptId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ArchitectApi apiInstance = new ArchitectApi();
String promptId = "promptId_example"; // String | Prompt ID
Boolean allResources = true; // Boolean | Whether or not to delete all the prompt resources
try {
    apiInstance.deleteArchitectPrompt(promptId, allResources);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#deleteArchitectPrompt");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **promptId** | **String**| Prompt ID | |
| **allResources** | **Boolean**| Whether or not to delete all the prompt resources | [optional] |
{: class="table table-striped"}

### Return type

null (empty response body)

<a name="deleteArchitectPromptResource"></a>

# **deleteArchitectPromptResource**

> Void deleteArchitectPromptResource(promptId, languageCode)

Delete specified user prompt resource



Wraps DELETE /api/v2/architect/prompts/{promptId}/resources/{languageCode}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ArchitectApi apiInstance = new ArchitectApi();
String promptId = "promptId_example"; // String | Prompt ID
String languageCode = "languageCode_example"; // String | Language
try {
    apiInstance.deleteArchitectPromptResource(promptId, languageCode);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#deleteArchitectPromptResource");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **promptId** | **String**| Prompt ID | |
| **languageCode** | **String**| Language | |
{: class="table table-striped"}

### Return type

null (empty response body)

<a name="deleteArchitectPrompts"></a>

# **deleteArchitectPrompts**

> [Operation](Operation.html) deleteArchitectPrompts(id)

Batch-delete a list of prompts asynchronously

Multiple IDs can be specified, in which case all specified prompts will be deleted.

Wraps DELETE /api/v2/architect/prompts  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ArchitectApi apiInstance = new ArchitectApi();
List<String> id = Arrays.asList("id_example"); // List<String> | List of Prompt IDs
try {
    Operation result = apiInstance.deleteArchitectPrompts(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#deleteArchitectPrompts");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | [**List&lt;String&gt;**](String.html)| List of Prompt IDs | |
{: class="table table-striped"}

### Return type

[**Operation**](Operation.html)

<a name="deleteArchitectSystempromptResource"></a>

# **deleteArchitectSystempromptResource**

> String deleteArchitectSystempromptResource(promptId, languageCode)

Delete a system prompt resource override.



Wraps DELETE /api/v2/architect/systemprompts/{promptId}/resources/{languageCode}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ArchitectApi apiInstance = new ArchitectApi();
String promptId = "promptId_example"; // String | Prompt ID
String languageCode = "languageCode_example"; // String | Language
try {
    String result = apiInstance.deleteArchitectSystempromptResource(promptId, languageCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#deleteArchitectSystempromptResource");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **promptId** | **String**| Prompt ID | |
| **languageCode** | **String**| Language | |
{: class="table table-striped"}

### Return type

**String**

<a name="getArchitectPrompt"></a>

# **getArchitectPrompt**

> [Prompt](Prompt.html) getArchitectPrompt(promptId)

Get specified user prompt



Wraps GET /api/v2/architect/prompts/{promptId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ArchitectApi apiInstance = new ArchitectApi();
String promptId = "promptId_example"; // String | Prompt ID
try {
    Prompt result = apiInstance.getArchitectPrompt(promptId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectPrompt");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **promptId** | **String**| Prompt ID | |
{: class="table table-striped"}

### Return type

[**Prompt**](Prompt.html)

<a name="getArchitectPromptResource"></a>

# **getArchitectPromptResource**

> [PromptAsset](PromptAsset.html) getArchitectPromptResource(promptId, languageCode)

Get specified user prompt resource



Wraps GET /api/v2/architect/prompts/{promptId}/resources/{languageCode}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ArchitectApi apiInstance = new ArchitectApi();
String promptId = "promptId_example"; // String | Prompt ID
String languageCode = "languageCode_example"; // String | Language
try {
    PromptAsset result = apiInstance.getArchitectPromptResource(promptId, languageCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectPromptResource");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **promptId** | **String**| Prompt ID | |
| **languageCode** | **String**| Language | |
{: class="table table-striped"}

### Return type

[**PromptAsset**](PromptAsset.html)

<a name="getArchitectPromptResources"></a>

# **getArchitectPromptResources**

> [PromptAssetEntityListing](PromptAssetEntityListing.html) getArchitectPromptResources(promptId, pageNumber, pageSize)

Get a pageable list of user prompt resources

The returned list is pageable, and query parameters can be used for filtering.

Wraps GET /api/v2/architect/prompts/{promptId}/resources  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ArchitectApi apiInstance = new ArchitectApi();
String promptId = "promptId_example"; // String | Prompt ID
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
try {
    PromptAssetEntityListing result = apiInstance.getArchitectPromptResources(promptId, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectPromptResources");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **promptId** | **String**| Prompt ID | |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] |
{: class="table table-striped"}

### Return type

[**PromptAssetEntityListing**](PromptAssetEntityListing.html)

<a name="getArchitectPrompts"></a>

# **getArchitectPrompts**

> [PromptEntityListing](PromptEntityListing.html) getArchitectPrompts(pageNumber, pageSize, name, description, nameOrDescription)

Get a pageable list of user prompts

The returned list is pageable, and query parameters can be used for filtering.  Multiple names can be specified, in which case all matching prompts will be returned, and no other filters will be evaluated.

Wraps GET /api/v2/architect/prompts  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ArchitectApi apiInstance = new ArchitectApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String name = "name_example"; // String | Name
String description = "description_example"; // String | Description
String nameOrDescription = "nameOrDescription_example"; // String | Name or description
try {
    PromptEntityListing result = apiInstance.getArchitectPrompts(pageNumber, pageSize, name, description, nameOrDescription);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectPrompts");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] |
| **name** | **String**| Name | [optional] |
| **description** | **String**| Description | [optional] |
| **nameOrDescription** | **String**| Name or description | [optional] |
{: class="table table-striped"}

### Return type

[**PromptEntityListing**](PromptEntityListing.html)

<a name="getArchitectSystemprompt"></a>

# **getArchitectSystemprompt**

> [SystemPrompt](SystemPrompt.html) getArchitectSystemprompt(promptId)

Get a system prompt



Wraps GET /api/v2/architect/systemprompts/{promptId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ArchitectApi apiInstance = new ArchitectApi();
String promptId = "promptId_example"; // String | promptId
try {
    SystemPrompt result = apiInstance.getArchitectSystemprompt(promptId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectSystemprompt");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **promptId** | **String**| promptId | |
{: class="table table-striped"}

### Return type

[**SystemPrompt**](SystemPrompt.html)

<a name="getArchitectSystempromptResource"></a>

# **getArchitectSystempromptResource**

> [SystemPromptAsset](SystemPromptAsset.html) getArchitectSystempromptResource(promptId, languageCode)

Get a system prompt resource.



Wraps GET /api/v2/architect/systemprompts/{promptId}/resources/{languageCode}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ArchitectApi apiInstance = new ArchitectApi();
String promptId = "promptId_example"; // String | Prompt ID
String languageCode = "languageCode_example"; // String | Language
try {
    SystemPromptAsset result = apiInstance.getArchitectSystempromptResource(promptId, languageCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectSystempromptResource");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **promptId** | **String**| Prompt ID | |
| **languageCode** | **String**| Language | |
{: class="table table-striped"}

### Return type

[**SystemPromptAsset**](SystemPromptAsset.html)

<a name="getArchitectSystempromptResources"></a>

# **getArchitectSystempromptResources**

> [SystemPromptAssetEntityListing](SystemPromptAssetEntityListing.html) getArchitectSystempromptResources(promptId, pageNumber, pageSize, sortBy, sortOrder)

Get IVR System Prompt resources.



Wraps GET /api/v2/architect/systemprompts/{promptId}/resources  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ArchitectApi apiInstance = new ArchitectApi();
String promptId = "promptId_example"; // String | Prompt ID
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortBy = "id"; // String | Sort by
String sortOrder = "asc"; // String | Sort order
try {
    SystemPromptAssetEntityListing result = apiInstance.getArchitectSystempromptResources(promptId, pageNumber, pageSize, sortBy, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectSystempromptResources");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **promptId** | **String**| Prompt ID | |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] |
| **sortBy** | **String**| Sort by | [optional] [default to id] |
| **sortOrder** | **String**| Sort order | [optional] [default to asc] |
{: class="table table-striped"}

### Return type

[**SystemPromptAssetEntityListing**](SystemPromptAssetEntityListing.html)

<a name="getArchitectSystemprompts"></a>

# **getArchitectSystemprompts**

> [SystemPromptEntityListing](SystemPromptEntityListing.html) getArchitectSystemprompts(pageNumber, pageSize, sortBy, sortOrder, name, description, nameOrDescription)

Get System Prompts



Wraps GET /api/v2/architect/systemprompts  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ArchitectApi apiInstance = new ArchitectApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortBy = "id"; // String | Sort by
String sortOrder = "asc"; // String | Sort order
String name = "name_example"; // String | Name
String description = "description_example"; // String | Description
String nameOrDescription = "nameOrDescription_example"; // String | Name or description
try {
    SystemPromptEntityListing result = apiInstance.getArchitectSystemprompts(pageNumber, pageSize, sortBy, sortOrder, name, description, nameOrDescription);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectSystemprompts");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] |
| **sortBy** | **String**| Sort by | [optional] [default to id] |
| **sortOrder** | **String**| Sort order | [optional] [default to asc] |
| **name** | **String**| Name | [optional] |
| **description** | **String**| Description | [optional] |
| **nameOrDescription** | **String**| Name or description | [optional] |
{: class="table table-striped"}

### Return type

[**SystemPromptEntityListing**](SystemPromptEntityListing.html)

<a name="getFlows"></a>

# **getFlows**

> [FlowEntityListing](FlowEntityListing.html) getFlows(type, pageNumber, pageSize, sortBy, sortOrder, id, name, description, nameOrDescription, publishVersionId, editableBy, lockedBy, secure, deleted, includeSchemas)

Get a pageable list of flows, filtered by query parameters

Multiple IDs can be specified, in which case all matching flows will be returned, and no other parameters will be evaluated.

Wraps GET /api/v2/flows  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ArchitectApi apiInstance = new ArchitectApi();
String type = "type_example"; // String | Type
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortBy = "id"; // String | Sort by
String sortOrder = "asc"; // String | Sort order
List<String> id = Arrays.asList("id_example"); // List<String> | ID
String name = "name_example"; // String | Name
String description = "description_example"; // String | Description
String nameOrDescription = "nameOrDescription_example"; // String | Name or description
String publishVersionId = "publishVersionId_example"; // String | Publish version ID
String editableBy = "editableBy_example"; // String | Editable by
String lockedBy = "lockedBy_example"; // String | Locked by
String secure = "secure_example"; // String | Secure
Boolean deleted = false; // Boolean | Include deleted
Boolean includeSchemas = false; // Boolean | Include variable schemas
try {
    FlowEntityListing result = apiInstance.getFlows(type, pageNumber, pageSize, sortBy, sortOrder, id, name, description, nameOrDescription, publishVersionId, editableBy, lockedBy, secure, deleted, includeSchemas);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlows");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **type** | **String**| Type | |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] |
| **sortBy** | **String**| Sort by | [optional] [default to id] |
| **sortOrder** | **String**| Sort order | [optional] [default to asc] |
| **id** | [**List&lt;String&gt;**](String.html)| ID | [optional] |
| **name** | **String**| Name | [optional] |
| **description** | **String**| Description | [optional] |
| **nameOrDescription** | **String**| Name or description | [optional] |
| **publishVersionId** | **String**| Publish version ID | [optional] |
| **editableBy** | **String**| Editable by | [optional] |
| **lockedBy** | **String**| Locked by | [optional] |
| **secure** | **String**| Secure | [optional] [enum: any, checkedin, published] |
| **deleted** | **Boolean**| Include deleted | [optional] [default to false] |
| **includeSchemas** | **Boolean**| Include variable schemas | [optional] [default to false] |
{: class="table table-striped"}

### Return type

[**FlowEntityListing**](FlowEntityListing.html)

<a name="postArchitectPromptResources"></a>

# **postArchitectPromptResources**

> [PromptAsset](PromptAsset.html) postArchitectPromptResources(promptId, body)

Create a new user prompt resource



Wraps POST /api/v2/architect/prompts/{promptId}/resources  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ArchitectApi apiInstance = new ArchitectApi();
String promptId = "promptId_example"; // String | Prompt ID
PromptAssetCreate body = new PromptAssetCreate(); // PromptAssetCreate | 
try {
    PromptAsset result = apiInstance.postArchitectPromptResources(promptId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postArchitectPromptResources");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **promptId** | **String**| Prompt ID | |
| **body** | [**PromptAssetCreate**](PromptAssetCreate.html)|  | [optional] |
{: class="table table-striped"}

### Return type

[**PromptAsset**](PromptAsset.html)

<a name="postArchitectPrompts"></a>

# **postArchitectPrompts**

> [Prompt](Prompt.html) postArchitectPrompts(body)

Create a new user prompt



Wraps POST /api/v2/architect/prompts  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ArchitectApi apiInstance = new ArchitectApi();
Prompt body = new Prompt(); // Prompt | 
try {
    Prompt result = apiInstance.postArchitectPrompts(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postArchitectPrompts");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**Prompt**](Prompt.html)|  | [optional] |
{: class="table table-striped"}

### Return type

[**Prompt**](Prompt.html)

<a name="postArchitectSystempromptResources"></a>

# **postArchitectSystempromptResources**

> [SystemPromptAsset](SystemPromptAsset.html) postArchitectSystempromptResources(promptId, body)

Create system prompt resource override.



Wraps POST /api/v2/architect/systemprompts/{promptId}/resources  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ArchitectApi apiInstance = new ArchitectApi();
String promptId = "promptId_example"; // String | Prompt ID
SystemPromptAsset body = new SystemPromptAsset(); // SystemPromptAsset | 
try {
    SystemPromptAsset result = apiInstance.postArchitectSystempromptResources(promptId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postArchitectSystempromptResources");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **promptId** | **String**| Prompt ID | |
| **body** | [**SystemPromptAsset**](SystemPromptAsset.html)|  | [optional] |
{: class="table table-striped"}

### Return type

[**SystemPromptAsset**](SystemPromptAsset.html)

<a name="putArchitectPrompt"></a>

# **putArchitectPrompt**

> [Prompt](Prompt.html) putArchitectPrompt(promptId, body)

Update specified user prompt



Wraps PUT /api/v2/architect/prompts/{promptId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ArchitectApi apiInstance = new ArchitectApi();
String promptId = "promptId_example"; // String | Prompt ID
Prompt body = new Prompt(); // Prompt | 
try {
    Prompt result = apiInstance.putArchitectPrompt(promptId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#putArchitectPrompt");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **promptId** | **String**| Prompt ID | |
| **body** | [**Prompt**](Prompt.html)|  | [optional] |
{: class="table table-striped"}

### Return type

[**Prompt**](Prompt.html)

<a name="putArchitectPromptResource"></a>

# **putArchitectPromptResource**

> [PromptAsset](PromptAsset.html) putArchitectPromptResource(promptId, languageCode, body)

Update specified user prompt resource



Wraps PUT /api/v2/architect/prompts/{promptId}/resources/{languageCode}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ArchitectApi apiInstance = new ArchitectApi();
String promptId = "promptId_example"; // String | Prompt ID
String languageCode = "languageCode_example"; // String | Language
PromptAsset body = new PromptAsset(); // PromptAsset | 
try {
    PromptAsset result = apiInstance.putArchitectPromptResource(promptId, languageCode, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#putArchitectPromptResource");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **promptId** | **String**| Prompt ID | |
| **languageCode** | **String**| Language | |
| **body** | [**PromptAsset**](PromptAsset.html)|  | [optional] |
{: class="table table-striped"}

### Return type

[**PromptAsset**](PromptAsset.html)

<a name="putArchitectSystempromptResource"></a>

# **putArchitectSystempromptResource**

> [SystemPromptAsset](SystemPromptAsset.html) putArchitectSystempromptResource(promptId, languageCode, body)

Updates a system prompt resource override.



Wraps PUT /api/v2/architect/systemprompts/{promptId}/resources/{languageCode}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ArchitectApi apiInstance = new ArchitectApi();
String promptId = "promptId_example"; // String | Prompt ID
String languageCode = "languageCode_example"; // String | Language
SystemPromptAsset body = new SystemPromptAsset(); // SystemPromptAsset | 
try {
    SystemPromptAsset result = apiInstance.putArchitectSystempromptResource(promptId, languageCode, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#putArchitectSystempromptResource");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **promptId** | **String**| Prompt ID | |
| **languageCode** | **String**| Language | |
| **body** | [**SystemPromptAsset**](SystemPromptAsset.html)|  | [optional] |
{: class="table table-striped"}

### Return type

[**SystemPromptAsset**](SystemPromptAsset.html)

