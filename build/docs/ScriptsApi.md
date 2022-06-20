---
title: ScriptsApi
---
## ScriptsApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**getScript**](ScriptsApi.html#getScript) | Get a script |
| [**getScriptPage**](ScriptsApi.html#getScriptPage) | Get a page |
| [**getScriptPages**](ScriptsApi.html#getScriptPages) | Get the list of pages |
| [**getScripts**](ScriptsApi.html#getScripts) | Get the list of scripts |
| [**getScriptsDivisionviews**](ScriptsApi.html#getScriptsDivisionviews) | Get the metadata for a list of scripts |
| [**getScriptsPublished**](ScriptsApi.html#getScriptsPublished) | Get the published scripts. |
| [**getScriptsPublishedDivisionviews**](ScriptsApi.html#getScriptsPublishedDivisionviews) | Get the published scripts metadata. |
| [**getScriptsPublishedScriptId**](ScriptsApi.html#getScriptsPublishedScriptId) | Get the published script. |
| [**getScriptsPublishedScriptIdPage**](ScriptsApi.html#getScriptsPublishedScriptIdPage) | Get the published page. |
| [**getScriptsPublishedScriptIdPages**](ScriptsApi.html#getScriptsPublishedScriptIdPages) | Get the list of published pages |
| [**getScriptsPublishedScriptIdVariables**](ScriptsApi.html#getScriptsPublishedScriptIdVariables) | Get the published variables |
| [**getScriptsUploadStatus**](ScriptsApi.html#getScriptsUploadStatus) | Get the upload status of an imported script |
| [**postScriptExport**](ScriptsApi.html#postScriptExport) | Export a script via download service. |
{: class="table-striped"}

<a name="getScript"></a>

# **getScript**



> [Script](Script.html) getScript(scriptId)

Get a script

Wraps GET /api/v2/scripts/{scriptId}  

Requires ANY permissions: 

* scripter:script:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ScriptsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ScriptsApi apiInstance = new ScriptsApi();
String scriptId = "scriptId_example"; // String | Script ID
try {
    Script result = apiInstance.getScript(scriptId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScriptsApi#getScript");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **scriptId** | **String**| Script ID | 
{: class="table-striped"}


### Return type

[**Script**](Script.html)

<a name="getScriptPage"></a>

# **getScriptPage**



> [Page](Page.html) getScriptPage(scriptId, pageId, scriptDataVersion)

Get a page

Wraps GET /api/v2/scripts/{scriptId}/pages/{pageId}  

Requires ANY permissions: 

* scripter:script:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ScriptsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ScriptsApi apiInstance = new ScriptsApi();
String scriptId = "scriptId_example"; // String | Script ID
String pageId = "pageId_example"; // String | Page ID
String scriptDataVersion = "scriptDataVersion_example"; // String | Advanced usage - controls the data version of the script
try {
    Page result = apiInstance.getScriptPage(scriptId, pageId, scriptDataVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScriptsApi#getScriptPage");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **scriptId** | **String**| Script ID | 
| **pageId** | **String**| Page ID | 
| **scriptDataVersion** | **String**| Advanced usage - controls the data version of the script | [optional] 
{: class="table-striped"}


### Return type

[**Page**](Page.html)

<a name="getScriptPages"></a>

# **getScriptPages**



> [List&lt;Page&gt;](Page.html) getScriptPages(scriptId, scriptDataVersion)

Get the list of pages

Wraps GET /api/v2/scripts/{scriptId}/pages  

Requires ANY permissions: 

* scripter:script:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ScriptsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ScriptsApi apiInstance = new ScriptsApi();
String scriptId = "scriptId_example"; // String | Script ID
String scriptDataVersion = "scriptDataVersion_example"; // String | Advanced usage - controls the data version of the script
try {
    List<Page> result = apiInstance.getScriptPages(scriptId, scriptDataVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScriptsApi#getScriptPages");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **scriptId** | **String**| Script ID | 
| **scriptDataVersion** | **String**| Advanced usage - controls the data version of the script | [optional] 
{: class="table-striped"}


### Return type

[**List&lt;Page&gt;**](Page.html)

<a name="getScripts"></a>

# **getScripts**



> [ScriptEntityListing](ScriptEntityListing.html) getScripts(pageSize, pageNumber, expand, name, feature, flowId, sortBy, sortOrder, scriptDataVersion, divisionIds)

Get the list of scripts

Wraps GET /api/v2/scripts  

Requires ANY permissions: 

* scripter:script:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ScriptsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ScriptsApi apiInstance = new ScriptsApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String expand = "expand_example"; // String | Expand
String name = "name_example"; // String | Name filter
String feature = "feature_example"; // String | Feature filter
String flowId = "flowId_example"; // String | Secure flow id filter
String sortBy = "sortBy_example"; // String | SortBy
String sortOrder = "sortOrder_example"; // String | SortOrder
String scriptDataVersion = "scriptDataVersion_example"; // String | Advanced usage - controls the data version of the script
String divisionIds = "divisionIds_example"; // String | Filters scripts to requested divisionIds
try {
    ScriptEntityListing result = apiInstance.getScripts(pageSize, pageNumber, expand, name, feature, flowId, sortBy, sortOrder, scriptDataVersion, divisionIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScriptsApi#getScripts");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **expand** | **String**| Expand | [optional] 
| **name** | **String**| Name filter | [optional] 
| **feature** | **String**| Feature filter | [optional] 
| **flowId** | **String**| Secure flow id filter | [optional] 
| **sortBy** | **String**| SortBy | [optional]<br />**Values**: modifiedDate, createdDate 
| **sortOrder** | **String**| SortOrder | [optional]<br />**Values**: ascending, descending 
| **scriptDataVersion** | **String**| Advanced usage - controls the data version of the script | [optional] 
| **divisionIds** | **String**| Filters scripts to requested divisionIds | [optional] 
{: class="table-striped"}


### Return type

[**ScriptEntityListing**](ScriptEntityListing.html)

<a name="getScriptsDivisionviews"></a>

# **getScriptsDivisionviews**



> [ScriptEntityListing](ScriptEntityListing.html) getScriptsDivisionviews(pageSize, pageNumber, expand, name, feature, flowId, sortBy, sortOrder, scriptDataVersion, divisionIds)

Get the metadata for a list of scripts

Wraps GET /api/v2/scripts/divisionviews  

Requires ANY permissions: 

* scripter:script:search

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ScriptsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ScriptsApi apiInstance = new ScriptsApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String expand = "expand_example"; // String | Expand
String name = "name_example"; // String | Name filter
String feature = "feature_example"; // String | Feature filter
String flowId = "flowId_example"; // String | Secure flow id filter
String sortBy = "sortBy_example"; // String | SortBy
String sortOrder = "sortOrder_example"; // String | SortOrder
String scriptDataVersion = "scriptDataVersion_example"; // String | Advanced usage - controls the data version of the script
String divisionIds = "divisionIds_example"; // String | Filters scripts to requested divisionIds
try {
    ScriptEntityListing result = apiInstance.getScriptsDivisionviews(pageSize, pageNumber, expand, name, feature, flowId, sortBy, sortOrder, scriptDataVersion, divisionIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScriptsApi#getScriptsDivisionviews");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **expand** | **String**| Expand | [optional] 
| **name** | **String**| Name filter | [optional] 
| **feature** | **String**| Feature filter | [optional] 
| **flowId** | **String**| Secure flow id filter | [optional] 
| **sortBy** | **String**| SortBy | [optional]<br />**Values**: modifiedDate, createdDate 
| **sortOrder** | **String**| SortOrder | [optional]<br />**Values**: ascending, descending 
| **scriptDataVersion** | **String**| Advanced usage - controls the data version of the script | [optional] 
| **divisionIds** | **String**| Filters scripts to requested divisionIds | [optional] 
{: class="table-striped"}


### Return type

[**ScriptEntityListing**](ScriptEntityListing.html)

<a name="getScriptsPublished"></a>

# **getScriptsPublished**



> [ScriptEntityListing](ScriptEntityListing.html) getScriptsPublished(pageSize, pageNumber, expand, name, feature, flowId, scriptDataVersion, divisionIds)

Get the published scripts.

Wraps GET /api/v2/scripts/published  

Requires ANY permissions: 

* scripter:publishedScript:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ScriptsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ScriptsApi apiInstance = new ScriptsApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String expand = "expand_example"; // String | Expand
String name = "name_example"; // String | Name filter
String feature = "feature_example"; // String | Feature filter
String flowId = "flowId_example"; // String | Secure flow id filter
String scriptDataVersion = "scriptDataVersion_example"; // String | Advanced usage - controls the data version of the script
String divisionIds = "divisionIds_example"; // String | Filters scripts to requested divisionIds
try {
    ScriptEntityListing result = apiInstance.getScriptsPublished(pageSize, pageNumber, expand, name, feature, flowId, scriptDataVersion, divisionIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScriptsApi#getScriptsPublished");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **expand** | **String**| Expand | [optional] 
| **name** | **String**| Name filter | [optional] 
| **feature** | **String**| Feature filter | [optional] 
| **flowId** | **String**| Secure flow id filter | [optional] 
| **scriptDataVersion** | **String**| Advanced usage - controls the data version of the script | [optional] 
| **divisionIds** | **String**| Filters scripts to requested divisionIds | [optional] 
{: class="table-striped"}


### Return type

[**ScriptEntityListing**](ScriptEntityListing.html)

<a name="getScriptsPublishedDivisionviews"></a>

# **getScriptsPublishedDivisionviews**



> [ScriptEntityListing](ScriptEntityListing.html) getScriptsPublishedDivisionviews(pageSize, pageNumber, expand, name, feature, flowId, scriptDataVersion, divisionIds)

Get the published scripts metadata.

Wraps GET /api/v2/scripts/published/divisionviews  

Requires ANY permissions: 

* scripter:publishedScript:search

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ScriptsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ScriptsApi apiInstance = new ScriptsApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String expand = "expand_example"; // String | Expand
String name = "name_example"; // String | Name filter
String feature = "feature_example"; // String | Feature filter
String flowId = "flowId_example"; // String | Secure flow id filter
String scriptDataVersion = "scriptDataVersion_example"; // String | Advanced usage - controls the data version of the script
String divisionIds = "divisionIds_example"; // String | Filters scripts to requested divisionIds
try {
    ScriptEntityListing result = apiInstance.getScriptsPublishedDivisionviews(pageSize, pageNumber, expand, name, feature, flowId, scriptDataVersion, divisionIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScriptsApi#getScriptsPublishedDivisionviews");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **expand** | **String**| Expand | [optional] 
| **name** | **String**| Name filter | [optional] 
| **feature** | **String**| Feature filter | [optional] 
| **flowId** | **String**| Secure flow id filter | [optional] 
| **scriptDataVersion** | **String**| Advanced usage - controls the data version of the script | [optional] 
| **divisionIds** | **String**| Filters scripts to requested divisionIds | [optional] 
{: class="table-striped"}


### Return type

[**ScriptEntityListing**](ScriptEntityListing.html)

<a name="getScriptsPublishedScriptId"></a>

# **getScriptsPublishedScriptId**



> [Script](Script.html) getScriptsPublishedScriptId(scriptId, scriptDataVersion)

Get the published script.

Wraps GET /api/v2/scripts/published/{scriptId}  

Requires ANY permissions: 

* scripter:publishedScript:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ScriptsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ScriptsApi apiInstance = new ScriptsApi();
String scriptId = "scriptId_example"; // String | Script ID
String scriptDataVersion = "scriptDataVersion_example"; // String | Advanced usage - controls the data version of the script
try {
    Script result = apiInstance.getScriptsPublishedScriptId(scriptId, scriptDataVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScriptsApi#getScriptsPublishedScriptId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **scriptId** | **String**| Script ID | 
| **scriptDataVersion** | **String**| Advanced usage - controls the data version of the script | [optional] 
{: class="table-striped"}


### Return type

[**Script**](Script.html)

<a name="getScriptsPublishedScriptIdPage"></a>

# **getScriptsPublishedScriptIdPage**



> [Page](Page.html) getScriptsPublishedScriptIdPage(scriptId, pageId, scriptDataVersion)

Get the published page.

Wraps GET /api/v2/scripts/published/{scriptId}/pages/{pageId}  

Requires ANY permissions: 

* scripter:publishedScript:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ScriptsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ScriptsApi apiInstance = new ScriptsApi();
String scriptId = "scriptId_example"; // String | Script ID
String pageId = "pageId_example"; // String | Page ID
String scriptDataVersion = "scriptDataVersion_example"; // String | Advanced usage - controls the data version of the script
try {
    Page result = apiInstance.getScriptsPublishedScriptIdPage(scriptId, pageId, scriptDataVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScriptsApi#getScriptsPublishedScriptIdPage");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **scriptId** | **String**| Script ID | 
| **pageId** | **String**| Page ID | 
| **scriptDataVersion** | **String**| Advanced usage - controls the data version of the script | [optional] 
{: class="table-striped"}


### Return type

[**Page**](Page.html)

<a name="getScriptsPublishedScriptIdPages"></a>

# **getScriptsPublishedScriptIdPages**



> [List&lt;Page&gt;](Page.html) getScriptsPublishedScriptIdPages(scriptId, scriptDataVersion)

Get the list of published pages

Wraps GET /api/v2/scripts/published/{scriptId}/pages  

Requires ANY permissions: 

* scripter:publishedScript:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ScriptsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ScriptsApi apiInstance = new ScriptsApi();
String scriptId = "scriptId_example"; // String | Script ID
String scriptDataVersion = "scriptDataVersion_example"; // String | Advanced usage - controls the data version of the script
try {
    List<Page> result = apiInstance.getScriptsPublishedScriptIdPages(scriptId, scriptDataVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScriptsApi#getScriptsPublishedScriptIdPages");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **scriptId** | **String**| Script ID | 
| **scriptDataVersion** | **String**| Advanced usage - controls the data version of the script | [optional] 
{: class="table-striped"}


### Return type

[**List&lt;Page&gt;**](Page.html)

<a name="getScriptsPublishedScriptIdVariables"></a>

# **getScriptsPublishedScriptIdVariables**



> Object getScriptsPublishedScriptIdVariables(scriptId, input, output, type, scriptDataVersion)

Get the published variables

Wraps GET /api/v2/scripts/published/{scriptId}/variables  

Requires ANY permissions: 

* scripter:publishedScript:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ScriptsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ScriptsApi apiInstance = new ScriptsApi();
String scriptId = "scriptId_example"; // String | Script ID
String input = "input_example"; // String | input
String output = "output_example"; // String | output
String type = "type_example"; // String | type
String scriptDataVersion = "scriptDataVersion_example"; // String | Advanced usage - controls the data version of the script
try {
    Object result = apiInstance.getScriptsPublishedScriptIdVariables(scriptId, input, output, type, scriptDataVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScriptsApi#getScriptsPublishedScriptIdVariables");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **scriptId** | **String**| Script ID | 
| **input** | **String**| input | [optional]<br />**Values**: true, false 
| **output** | **String**| output | [optional]<br />**Values**: true, false 
| **type** | **String**| type | [optional]<br />**Values**: string, number, boolean 
| **scriptDataVersion** | **String**| Advanced usage - controls the data version of the script | [optional] 
{: class="table-striped"}


### Return type

**Object**

<a name="getScriptsUploadStatus"></a>

# **getScriptsUploadStatus**



> [ImportScriptStatusResponse](ImportScriptStatusResponse.html) getScriptsUploadStatus(uploadId, longPoll)

Get the upload status of an imported script

Wraps GET /api/v2/scripts/uploads/{uploadId}/status  

Requires ANY permissions: 

* scripter:script:search

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ScriptsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ScriptsApi apiInstance = new ScriptsApi();
String uploadId = "uploadId_example"; // String | Upload ID
Boolean longPoll = false; // Boolean | Enable longPolling endpoint
try {
    ImportScriptStatusResponse result = apiInstance.getScriptsUploadStatus(uploadId, longPoll);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScriptsApi#getScriptsUploadStatus");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **uploadId** | **String**| Upload ID | 
| **longPoll** | **Boolean**| Enable longPolling endpoint | [optional] [default to false] 
{: class="table-striped"}


### Return type

[**ImportScriptStatusResponse**](ImportScriptStatusResponse.html)

<a name="postScriptExport"></a>

# **postScriptExport**



> [ExportScriptResponse](ExportScriptResponse.html) postScriptExport(scriptId, body)

Export a script via download service.

Wraps POST /api/v2/scripts/{scriptId}/export  

Requires ANY permissions: 

* scripter:script:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ScriptsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ScriptsApi apiInstance = new ScriptsApi();
String scriptId = "scriptId_example"; // String | Script ID
ExportScriptRequest body = new ExportScriptRequest(); // ExportScriptRequest | 
try {
    ExportScriptResponse result = apiInstance.postScriptExport(scriptId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScriptsApi#postScriptExport");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **scriptId** | **String**| Script ID | 
| **body** | [**ExportScriptRequest**](ExportScriptRequest.html)|  | [optional] 
{: class="table-striped"}


### Return type

[**ExportScriptResponse**](ExportScriptResponse.html)

