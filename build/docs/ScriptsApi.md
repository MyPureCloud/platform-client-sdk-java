# ScriptsApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**getScript**](ScriptsApi#getScript) | Get a script |
| [**getScriptPage**](ScriptsApi#getScriptPage) | Get a page |
| [**getScriptPages**](ScriptsApi#getScriptPages) | Get the list of pages |
| [**getScripts**](ScriptsApi#getScripts) | Get the list of scripts |
| [**getScriptsDivisionviews**](ScriptsApi#getScriptsDivisionviews) | Get the metadata for a list of scripts |
| [**getScriptsPublished**](ScriptsApi#getScriptsPublished) | Get the published scripts. |
| [**getScriptsPublishedDivisionviewVariables**](ScriptsApi#getScriptsPublishedDivisionviewVariables) | Get the published variables |
| [**getScriptsPublishedDivisionviews**](ScriptsApi#getScriptsPublishedDivisionviews) | Get the published scripts metadata. |
| [**getScriptsPublishedScriptId**](ScriptsApi#getScriptsPublishedScriptId) | Get the published script. |
| [**getScriptsPublishedScriptIdPage**](ScriptsApi#getScriptsPublishedScriptIdPage) | Get the published page. |
| [**getScriptsPublishedScriptIdPages**](ScriptsApi#getScriptsPublishedScriptIdPages) | Get the list of published pages |
| [**getScriptsPublishedScriptIdVariables**](ScriptsApi#getScriptsPublishedScriptIdVariables) | Get the published variables |
| [**getScriptsUploadStatus**](ScriptsApi#getScriptsUploadStatus) | Get the upload status of an imported script |
| [**postScriptExport**](ScriptsApi#postScriptExport) | Export a script via download service. |
| [**postScriptsPublished**](ScriptsApi#postScriptsPublished) | Publish a script. |
{: class="table-striped"}


# **getScript**


> [Script](Script) getScript(scriptId)

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

[**Script**](Script)


# **getScriptPage**


> [Page](Page) getScriptPage(scriptId, pageId, scriptDataVersion)

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

[**Page**](Page)


# **getScriptPages**


> [List&lt;Page&gt;](Page) getScriptPages(scriptId, scriptDataVersion)

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

[**List&lt;Page&gt;**](Page)


# **getScripts**


> [ScriptEntityListing](ScriptEntityListing) getScripts(pageSize, pageNumber, expand, name, feature, flowId, sortBy, sortOrder, scriptDataVersion, divisionIds)

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
| **sortBy** | **String**| SortBy | [optional]<br />**Values**: modifiedDate, createdDate, name 
| **sortOrder** | **String**| SortOrder | [optional]<br />**Values**: ascending, descending 
| **scriptDataVersion** | **String**| Advanced usage - controls the data version of the script | [optional] 
| **divisionIds** | **String**| Filters scripts to requested divisionIds | [optional] 
{: class="table-striped"}


### Return type

[**ScriptEntityListing**](ScriptEntityListing)


# **getScriptsDivisionviews**


> [ScriptEntityListing](ScriptEntityListing) getScriptsDivisionviews(pageSize, pageNumber, expand, name, feature, flowId, sortBy, sortOrder, scriptDataVersion, divisionIds)

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
| **sortBy** | **String**| SortBy | [optional]<br />**Values**: modifiedDate, createdDate, name 
| **sortOrder** | **String**| SortOrder | [optional]<br />**Values**: ascending, descending 
| **scriptDataVersion** | **String**| Advanced usage - controls the data version of the script | [optional] 
| **divisionIds** | **String**| Filters scripts to requested divisionIds | [optional] 
{: class="table-striped"}


### Return type

[**ScriptEntityListing**](ScriptEntityListing)


# **getScriptsPublished**


> [ScriptEntityListing](ScriptEntityListing) getScriptsPublished(pageSize, pageNumber, expand, name, feature, flowId, scriptDataVersion, divisionIds)

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

[**ScriptEntityListing**](ScriptEntityListing)


# **getScriptsPublishedDivisionviewVariables**


> Object getScriptsPublishedDivisionviewVariables(scriptId, input, output, type, scriptDataVersion)

Get the published variables

Wraps GET /api/v2/scripts/published/divisionviews/{scriptId}/variables  

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
String scriptId = "scriptId_example"; // String | Script ID
String input = "input_example"; // String | input
String output = "output_example"; // String | output
String type = "type_example"; // String | type
String scriptDataVersion = "scriptDataVersion_example"; // String | Advanced usage - controls the data version of the script
try {
    Object result = apiInstance.getScriptsPublishedDivisionviewVariables(scriptId, input, output, type, scriptDataVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScriptsApi#getScriptsPublishedDivisionviewVariables");
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


# **getScriptsPublishedDivisionviews**


> [ScriptEntityListing](ScriptEntityListing) getScriptsPublishedDivisionviews(pageSize, pageNumber, expand, name, feature, flowId, scriptDataVersion, divisionIds)

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

[**ScriptEntityListing**](ScriptEntityListing)


# **getScriptsPublishedScriptId**


> [Script](Script) getScriptsPublishedScriptId(scriptId, scriptDataVersion)

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

[**Script**](Script)


# **getScriptsPublishedScriptIdPage**


> [Page](Page) getScriptsPublishedScriptIdPage(scriptId, pageId, scriptDataVersion)

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

[**Page**](Page)


# **getScriptsPublishedScriptIdPages**


> [List&lt;Page&gt;](Page) getScriptsPublishedScriptIdPages(scriptId, scriptDataVersion)

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

[**List&lt;Page&gt;**](Page)


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


# **getScriptsUploadStatus**


> [ImportScriptStatusResponse](ImportScriptStatusResponse) getScriptsUploadStatus(uploadId, longPoll)

Get the upload status of an imported script

Wraps GET /api/v2/scripts/uploads/{uploadId}/status  

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

[**ImportScriptStatusResponse**](ImportScriptStatusResponse)


# **postScriptExport**


> [ExportScriptResponse](ExportScriptResponse) postScriptExport(scriptId, body)

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
| **body** | [**ExportScriptRequest**](ExportScriptRequest)|  | [optional] 
{: class="table-striped"}


### Return type

[**ExportScriptResponse**](ExportScriptResponse)


# **postScriptsPublished**


> [Script](Script) postScriptsPublished(scriptDataVersion, body)

Publish a script.

Wraps POST /api/v2/scripts/published  

Requires ANY permissions: 

* scripter:publishedScript:add

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
String scriptDataVersion = "scriptDataVersion_example"; // String | Advanced usage - controls the data version of the script
PublishScriptRequestData body = new PublishScriptRequestData(); // PublishScriptRequestData | body
try {
    Script result = apiInstance.postScriptsPublished(scriptDataVersion, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScriptsApi#postScriptsPublished");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **scriptDataVersion** | **String**| Advanced usage - controls the data version of the script | [optional] 
| **body** | [**PublishScriptRequestData**](PublishScriptRequestData)| body | [optional] 
{: class="table-striped"}


### Return type

[**Script**](Script)


_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
