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

> [Page](Page.html) getScriptPage(scriptId, pageId)

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
try {
    Page result = apiInstance.getScriptPage(scriptId, pageId);
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
{: class="table table-striped"}

### Return type

[**Page**](Page.html)

<a name="getScriptPages"></a>

# **getScriptPages**

> [List&lt;Page&gt;](Page.html) getScriptPages(scriptId)

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
try {
    List<Page> result = apiInstance.getScriptPages(scriptId);
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
{: class="table table-striped"}

### Return type

[**List&lt;Page&gt;**](Page.html)

<a name="getScripts"></a>

# **getScripts**

> [ScriptEntityListing](ScriptEntityListing.html) getScripts(pageSize, pageNumber, expand, name, feature, flowId, sortBy, sortOrder)

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
try {
    ScriptEntityListing result = apiInstance.getScripts(pageSize, pageNumber, expand, name, feature, flowId, sortBy, sortOrder);
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
| **sortBy** | **String**| SortBy | [optional] [enum: modifiedDate, createdDate] |
| **sortOrder** | **String**| SortOrder | [optional] [enum: ascending, descending] |
{: class="table table-striped"}

### Return type

[**ScriptEntityListing**](ScriptEntityListing.html)

<a name="getScriptsPublished"></a>

# **getScriptsPublished**

> [ScriptEntityListing](ScriptEntityListing.html) getScriptsPublished(pageSize, pageNumber, expand, name, feature, flowId)

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
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String expand = "expand_example"; // String | Expand
String name = "name_example"; // String | Name filter
String feature = "feature_example"; // String | Feature filter
String flowId = "flowId_example"; // String | Secure flow id filter
try {
    ScriptEntityListing result = apiInstance.getScriptsPublished(pageSize, pageNumber, expand, name, feature, flowId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScriptsApi#getScriptsPublished");
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
{: class="table table-striped"}

### Return type

[**ScriptEntityListing**](ScriptEntityListing.html)

<a name="getScriptsPublishedScriptId"></a>

# **getScriptsPublishedScriptId**

> [Script](Script.html) getScriptsPublishedScriptId(scriptId)

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
try {
    Script result = apiInstance.getScriptsPublishedScriptId(scriptId);
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
{: class="table table-striped"}

### Return type

[**Script**](Script.html)

<a name="getScriptsPublishedScriptIdPage"></a>

# **getScriptsPublishedScriptIdPage**

> [Page](Page.html) getScriptsPublishedScriptIdPage(scriptId, pageId)

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
try {
    Page result = apiInstance.getScriptsPublishedScriptIdPage(scriptId, pageId);
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
{: class="table table-striped"}

### Return type

[**Page**](Page.html)

<a name="getScriptsPublishedScriptIdPages"></a>

# **getScriptsPublishedScriptIdPages**

> [List&lt;Page&gt;](Page.html) getScriptsPublishedScriptIdPages(scriptId)

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
try {
    List<Page> result = apiInstance.getScriptsPublishedScriptIdPages(scriptId);
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
{: class="table table-striped"}

### Return type

[**List&lt;Page&gt;**](Page.html)

<a name="getScriptsPublishedScriptIdVariables"></a>

# **getScriptsPublishedScriptIdVariables**

> Object getScriptsPublishedScriptIdVariables(scriptId, input, output, type)

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
try {
    Object result = apiInstance.getScriptsPublishedScriptIdVariables(scriptId, input, output, type);
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
{: class="table table-striped"}

### Return type

**Object**

