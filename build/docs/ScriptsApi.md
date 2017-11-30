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
| [**getScriptsPublished**](ScriptsApi.html#getScriptsPublished) | Get the published scripts. |
| [**getScriptsPublishedScriptId**](ScriptsApi.html#getScriptsPublishedScriptId) | Get the published script. |
| [**getScriptsPublishedScriptIdPage**](ScriptsApi.html#getScriptsPublishedScriptIdPage) | Get the published page. |
| [**getScriptsPublishedScriptIdPages**](ScriptsApi.html#getScriptsPublishedScriptIdPages) | Get the list of published pages |
| [**getScriptsPublishedScriptIdVariables**](ScriptsApi.html#getScriptsPublishedScriptIdVariables) | Get the published variables |
| [**getScriptsUploadStatus**](ScriptsApi.html#getScriptsUploadStatus) | Get the upload status of an imported script |
{: class="table table-striped"}

<a name="getScript"></a>

# **getScript**

> [Script](Script.html) getScript(scriptId)

Get a script



Wraps GET /api/v2/scripts/{scriptId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ScriptsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ScriptsApi apiInstance = new ScriptsApi();
String scriptId = "scriptId_example"; // String | Script ID
try {
    Script result = apiInstance.getScript(scriptId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScriptsApi#getScript");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **scriptId** | **String**| Script ID | |
{: class="table table-striped"}

### Return type

[**Script**](Script.html)

<a name="getScriptPage"></a>

# **getScriptPage**

> [Page](Page.html) getScriptPage(scriptId, pageId, scriptDataVersion)

Get a page



Wraps GET /api/v2/scripts/{scriptId}/pages/{pageId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ScriptsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

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
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **scriptId** | **String**| Script ID | |
| **pageId** | **String**| Page ID | |
| **scriptDataVersion** | **String**| Advanced usage - controls the data version of the script | [optional] |
{: class="table table-striped"}

### Return type

[**Page**](Page.html)

<a name="getScriptPages"></a>

# **getScriptPages**

> [List&lt;Page&gt;](Page.html) getScriptPages(scriptId, scriptDataVersion)

Get the list of pages



Wraps GET /api/v2/scripts/{scriptId}/pages  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ScriptsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

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
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **scriptId** | **String**| Script ID | |
| **scriptDataVersion** | **String**| Advanced usage - controls the data version of the script | [optional] |
{: class="table table-striped"}

### Return type

[**List&lt;Page&gt;**](Page.html)

<a name="getScripts"></a>

# **getScripts**

> [ScriptEntityListing](ScriptEntityListing.html) getScripts(pageSize, pageNumber, expand, name, feature, flowId, sortBy, sortOrder, scriptDataVersion)

Get the list of scripts



Wraps GET /api/v2/scripts  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ScriptsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

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
try {
    ScriptEntityListing result = apiInstance.getScripts(pageSize, pageNumber, expand, name, feature, flowId, sortBy, sortOrder, scriptDataVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScriptsApi#getScripts");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] |
| **expand** | **String**| Expand | [optional] |
| **name** | **String**| Name filter | [optional] |
| **feature** | **String**| Feature filter | [optional] |
| **flowId** | **String**| Secure flow id filter | [optional] |
| **sortBy** | **String**| SortBy | [optional]<br />**Values**: modifiedDate, createdDate |
| **sortOrder** | **String**| SortOrder | [optional]<br />**Values**: ascending, descending |
| **scriptDataVersion** | **String**| Advanced usage - controls the data version of the script | [optional] |
{: class="table table-striped"}

### Return type

[**ScriptEntityListing**](ScriptEntityListing.html)

<a name="getScriptsPublished"></a>

# **getScriptsPublished**

> [ScriptEntityListing](ScriptEntityListing.html) getScriptsPublished(scriptId, pageSize, pageNumber, expand, name, feature, flowId, scriptDataVersion)

Get the published scripts.



Wraps GET /api/v2/scripts/published  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ScriptsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ScriptsApi apiInstance = new ScriptsApi();
String scriptId = "scriptId_example"; // String | Script ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String expand = "expand_example"; // String | Expand
String name = "name_example"; // String | Name filter
String feature = "feature_example"; // String | Feature filter
String flowId = "flowId_example"; // String | Secure flow id filter
String scriptDataVersion = "scriptDataVersion_example"; // String | Advanced usage - controls the data version of the script
try {
    ScriptEntityListing result = apiInstance.getScriptsPublished(scriptId, pageSize, pageNumber, expand, name, feature, flowId, scriptDataVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScriptsApi#getScriptsPublished");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **scriptId** | **String**| Script ID | |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] |
| **expand** | **String**| Expand | [optional] |
| **name** | **String**| Name filter | [optional] |
| **feature** | **String**| Feature filter | [optional] |
| **flowId** | **String**| Secure flow id filter | [optional] |
| **scriptDataVersion** | **String**| Advanced usage - controls the data version of the script | [optional] |
{: class="table table-striped"}

### Return type

[**ScriptEntityListing**](ScriptEntityListing.html)

<a name="getScriptsPublishedScriptId"></a>

# **getScriptsPublishedScriptId**

> [Script](Script.html) getScriptsPublishedScriptId(scriptId, scriptDataVersion)

Get the published script.



Wraps GET /api/v2/scripts/published/{scriptId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ScriptsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

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
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **scriptId** | **String**| Script ID | |
| **scriptDataVersion** | **String**| Advanced usage - controls the data version of the script | [optional] |
{: class="table table-striped"}

### Return type

[**Script**](Script.html)

<a name="getScriptsPublishedScriptIdPage"></a>

# **getScriptsPublishedScriptIdPage**

> [Page](Page.html) getScriptsPublishedScriptIdPage(scriptId, pageId, scriptDataVersion)

Get the published page.



Wraps GET /api/v2/scripts/published/{scriptId}/pages/{pageId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ScriptsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

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
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **scriptId** | **String**| Script ID | |
| **pageId** | **String**| Page ID | |
| **scriptDataVersion** | **String**| Advanced usage - controls the data version of the script | [optional] |
{: class="table table-striped"}

### Return type

[**Page**](Page.html)

<a name="getScriptsPublishedScriptIdPages"></a>

# **getScriptsPublishedScriptIdPages**

> [List&lt;Page&gt;](Page.html) getScriptsPublishedScriptIdPages(scriptId, foo, scriptDataVersion)

Get the list of published pages



Wraps GET /api/v2/scripts/published/{scriptId}/pages  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ScriptsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ScriptsApi apiInstance = new ScriptsApi();
String scriptId = "scriptId_example"; // String | Script ID
Integer foo = 25; // Integer | 
String scriptDataVersion = "scriptDataVersion_example"; // String | Advanced usage - controls the data version of the script
try {
    List<Page> result = apiInstance.getScriptsPublishedScriptIdPages(scriptId, foo, scriptDataVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScriptsApi#getScriptsPublishedScriptIdPages");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **scriptId** | **String**| Script ID | |
| **foo** | **Integer**|  | [optional] [default to 25] |
| **scriptDataVersion** | **String**| Advanced usage - controls the data version of the script | [optional] |
{: class="table table-striped"}

### Return type

[**List&lt;Page&gt;**](Page.html)

<a name="getScriptsPublishedScriptIdVariables"></a>

# **getScriptsPublishedScriptIdVariables**

> Object getScriptsPublishedScriptIdVariables(scriptId, input, output, type, scriptDataVersion)

Get the published variables



Wraps GET /api/v2/scripts/published/{scriptId}/variables  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ScriptsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

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
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **scriptId** | **String**| Script ID | |
| **input** | **String**| input | [optional] |
| **output** | **String**| output | [optional] |
| **type** | **String**| type | [optional] |
| **scriptDataVersion** | **String**| Advanced usage - controls the data version of the script | [optional] |
{: class="table table-striped"}

### Return type

**Object**

<a name="getScriptsUploadStatus"></a>

# **getScriptsUploadStatus**

> [ImportScriptStatusResponse](ImportScriptStatusResponse.html) getScriptsUploadStatus(uploadId, longPoll)

Get the upload status of an imported script



Wraps GET /api/v2/scripts/uploads/{uploadId}/status  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ScriptsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

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
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **uploadId** | **String**| Upload ID | |
| **longPoll** | **Boolean**| Enable longPolling endpoint | [optional] [default to false] |
{: class="table table-striped"}

### Return type

[**ImportScriptStatusResponse**](ImportScriptStatusResponse.html)

