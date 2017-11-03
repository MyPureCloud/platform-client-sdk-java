---
title: IntegrationsApi
---
## IntegrationsApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteIntegrationsAction**](IntegrationsApi.html#deleteIntegrationsAction) | Delete an Action |
| [**deleteIntegrationsActionDraft**](IntegrationsApi.html#deleteIntegrationsActionDraft) | Delete a Draft |
| [**getIntegrationsAction**](IntegrationsApi.html#getIntegrationsAction) | Retrieves a single Action matching id. |
| [**getIntegrationsActionDraft**](IntegrationsApi.html#getIntegrationsActionDraft) | Retrieve a Draft |
| [**getIntegrationsActionDraftSchema**](IntegrationsApi.html#getIntegrationsActionDraftSchema) | Retrieve schema for a Draft based on filename. |
| [**getIntegrationsActionDraftTemplate**](IntegrationsApi.html#getIntegrationsActionDraftTemplate) | Retrieve templates for a Draft based on filename. |
| [**getIntegrationsActionDraftValidation**](IntegrationsApi.html#getIntegrationsActionDraftValidation) | Validate current Draft configuration. |
| [**getIntegrationsActionSchema**](IntegrationsApi.html#getIntegrationsActionSchema) | Retrieve schema for an action based on filename. |
| [**getIntegrationsActionTemplate**](IntegrationsApi.html#getIntegrationsActionTemplate) | Retrieve text of templates for an action based on filename. |
| [**getIntegrationsActions**](IntegrationsApi.html#getIntegrationsActions) | Retrieves all actions associated with filters passed in via query param. |
| [**getIntegrationsActionsCategories**](IntegrationsApi.html#getIntegrationsActionsCategories) | Retrieves all categories of available Actions |
| [**getIntegrationsActionsDrafts**](IntegrationsApi.html#getIntegrationsActionsDrafts) | Retrieves all action drafts associated with the filters passed in via query param. |
| [**patchIntegrationsAction**](IntegrationsApi.html#patchIntegrationsAction) | Patch an Action |
| [**patchIntegrationsActionDraft**](IntegrationsApi.html#patchIntegrationsActionDraft) | Update an existing Draft |
| [**postIntegrationsActionDraft**](IntegrationsApi.html#postIntegrationsActionDraft) | Create a new Draft from existing Action |
| [**postIntegrationsActionDraftPublish**](IntegrationsApi.html#postIntegrationsActionDraftPublish) | Publish a Draft and make it the active Action configuration |
| [**postIntegrationsActionDraftTest**](IntegrationsApi.html#postIntegrationsActionDraftTest) | Test the execution of a draft. Responses will show execution steps broken out with intermediate results to help in debugging. |
| [**postIntegrationsActionExecute**](IntegrationsApi.html#postIntegrationsActionExecute) | Execute Action and return response from 3rd party.  Responses will follow the schemas defined on the Action for success and error. |
| [**postIntegrationsActionTest**](IntegrationsApi.html#postIntegrationsActionTest) | Test the execution of an action. Responses will show execution steps broken out with intermediate results to help in debugging. |
| [**postIntegrationsActions**](IntegrationsApi.html#postIntegrationsActions) | Create a new Action |
| [**postIntegrationsActionsDrafts**](IntegrationsApi.html#postIntegrationsActionsDrafts) | Create a new Draft |
{: class="table table-striped"}

<a name="deleteIntegrationsAction"></a>

# **deleteIntegrationsAction**

> Void deleteIntegrationsAction(actionId)

Delete an Action



Wraps DELETE /api/v2/integrations/actions/{actionId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IntegrationsApi apiInstance = new IntegrationsApi();
String actionId = "actionId_example"; // String | actionId
try {
    apiInstance.deleteIntegrationsAction(actionId);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#deleteIntegrationsAction");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionId** | **String**| actionId | |
{: class="table table-striped"}

### Return type

null (empty response body)

<a name="deleteIntegrationsActionDraft"></a>

# **deleteIntegrationsActionDraft**

> Void deleteIntegrationsActionDraft(actionId)

Delete a Draft



Wraps DELETE /api/v2/integrations/actions/{actionId}/draft  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IntegrationsApi apiInstance = new IntegrationsApi();
String actionId = "actionId_example"; // String | actionId
try {
    apiInstance.deleteIntegrationsActionDraft(actionId);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#deleteIntegrationsActionDraft");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionId** | **String**| actionId | |
{: class="table table-striped"}

### Return type

null (empty response body)

<a name="getIntegrationsAction"></a>

# **getIntegrationsAction**

> [Action](Action.html) getIntegrationsAction(actionId, expand, includeConfig)

Retrieves a single Action matching id.



Wraps GET /api/v2/integrations/actions/{actionId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IntegrationsApi apiInstance = new IntegrationsApi();
String actionId = "actionId_example"; // String | actionId
String expand = "expand_example"; // String | Indicates fields of the response which should be expanded.
Boolean includeConfig = false; // Boolean | Show config when available
try {
    Action result = apiInstance.getIntegrationsAction(actionId, expand, includeConfig);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsAction");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionId** | **String**| actionId | |
| **expand** | **String**| Indicates fields of the response which should be expanded. | [optional]<br />**Values**: contract |
| **includeConfig** | **Boolean**| Show config when available | [optional] [default to false] |
{: class="table table-striped"}

### Return type

[**Action**](Action.html)

<a name="getIntegrationsActionDraft"></a>

# **getIntegrationsActionDraft**

> [Action](Action.html) getIntegrationsActionDraft(actionId, expand, includeConfig)

Retrieve a Draft



Wraps GET /api/v2/integrations/actions/{actionId}/draft  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IntegrationsApi apiInstance = new IntegrationsApi();
String actionId = "actionId_example"; // String | actionId
String expand = "expand_example"; // String | Indicates fields of the response which should be expanded.
Boolean includeConfig = false; // Boolean | Show config when available
try {
    Action result = apiInstance.getIntegrationsActionDraft(actionId, expand, includeConfig);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsActionDraft");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionId** | **String**| actionId | |
| **expand** | **String**| Indicates fields of the response which should be expanded. | [optional]<br />**Values**: contract |
| **includeConfig** | **Boolean**| Show config when available | [optional] [default to false] |
{: class="table table-striped"}

### Return type

[**Action**](Action.html)

<a name="getIntegrationsActionDraftSchema"></a>

# **getIntegrationsActionDraftSchema**

> [JsonSchemaDocument](JsonSchemaDocument.html) getIntegrationsActionDraftSchema(actionId, fileName)

Retrieve schema for a Draft based on filename.



Wraps GET /api/v2/integrations/actions/{actionId}/draft/schemas/{fileName}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IntegrationsApi apiInstance = new IntegrationsApi();
String actionId = "actionId_example"; // String | actionId
String fileName = "fileName_example"; // String | Name of schema file to be retrieved for this draft.
try {
    JsonSchemaDocument result = apiInstance.getIntegrationsActionDraftSchema(actionId, fileName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsActionDraftSchema");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionId** | **String**| actionId | |
| **fileName** | **String**| Name of schema file to be retrieved for this draft. | |
{: class="table table-striped"}

### Return type

[**JsonSchemaDocument**](JsonSchemaDocument.html)

<a name="getIntegrationsActionDraftTemplate"></a>

# **getIntegrationsActionDraftTemplate**

> String getIntegrationsActionDraftTemplate(actionId, fileName)

Retrieve templates for a Draft based on filename.



Wraps GET /api/v2/integrations/actions/{actionId}/draft/templates/{fileName}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IntegrationsApi apiInstance = new IntegrationsApi();
String actionId = "actionId_example"; // String | actionId
String fileName = "fileName_example"; // String | Name of template file to be retrieved for this action draft.
try {
    String result = apiInstance.getIntegrationsActionDraftTemplate(actionId, fileName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsActionDraftTemplate");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionId** | **String**| actionId | |
| **fileName** | **String**| Name of template file to be retrieved for this action draft. | |
{: class="table table-striped"}

### Return type

**String**

<a name="getIntegrationsActionDraftValidation"></a>

# **getIntegrationsActionDraftValidation**

> [DraftValidationResult](DraftValidationResult.html) getIntegrationsActionDraftValidation(actionId)

Validate current Draft configuration.



Wraps GET /api/v2/integrations/actions/{actionId}/draft/validation  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IntegrationsApi apiInstance = new IntegrationsApi();
String actionId = "actionId_example"; // String | actionId
try {
    DraftValidationResult result = apiInstance.getIntegrationsActionDraftValidation(actionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsActionDraftValidation");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionId** | **String**| actionId | |
{: class="table table-striped"}

### Return type

[**DraftValidationResult**](DraftValidationResult.html)

<a name="getIntegrationsActionSchema"></a>

# **getIntegrationsActionSchema**

> [JsonSchemaDocument](JsonSchemaDocument.html) getIntegrationsActionSchema(actionId, fileName)

Retrieve schema for an action based on filename.



Wraps GET /api/v2/integrations/actions/{actionId}/schemas/{fileName}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IntegrationsApi apiInstance = new IntegrationsApi();
String actionId = "actionId_example"; // String | actionId
String fileName = "fileName_example"; // String | Name of schema file to be retrieved for this action.
try {
    JsonSchemaDocument result = apiInstance.getIntegrationsActionSchema(actionId, fileName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsActionSchema");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionId** | **String**| actionId | |
| **fileName** | **String**| Name of schema file to be retrieved for this action. | |
{: class="table table-striped"}

### Return type

[**JsonSchemaDocument**](JsonSchemaDocument.html)

<a name="getIntegrationsActionTemplate"></a>

# **getIntegrationsActionTemplate**

> String getIntegrationsActionTemplate(actionId, fileName)

Retrieve text of templates for an action based on filename.



Wraps GET /api/v2/integrations/actions/{actionId}/templates/{fileName}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IntegrationsApi apiInstance = new IntegrationsApi();
String actionId = "actionId_example"; // String | actionId
String fileName = "fileName_example"; // String | Name of template file to be retrieved for this action.
try {
    String result = apiInstance.getIntegrationsActionTemplate(actionId, fileName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsActionTemplate");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionId** | **String**| actionId | |
| **fileName** | **String**| Name of template file to be retrieved for this action. | |
{: class="table table-striped"}

### Return type

**String**

<a name="getIntegrationsActions"></a>

# **getIntegrationsActions**

> [ActionEntityListing](ActionEntityListing.html) getIntegrationsActions(category, secure, includeAuthActions, pageSize, pageNumber, sortBy, expand, nextPage, previousPage)

Retrieves all actions associated with filters passed in via query param.



Wraps GET /api/v2/integrations/actions  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IntegrationsApi apiInstance = new IntegrationsApi();
String category = "category_example"; // String | Filter by category name
String secure = "secure_example"; // String | Filter to only include secure actions. True will only include actions marked secured. False will include only unsecure actions. Do not use filter if you want all Actions.
String includeAuthActions = "includeAuthActions_example"; // String | Whether or not to include authentication actions in the response. These actions are not directly executable. Some integrations create them and will run them as needed to refresh authentication information for other actions.
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<Object> expand = null; // List<Object> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
try {
    ActionEntityListing result = apiInstance.getIntegrationsActions(category, secure, includeAuthActions, pageSize, pageNumber, sortBy, expand, nextPage, previousPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsActions");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **category** | **String**| Filter by category name | [optional] |
| **secure** | **String**| Filter to only include secure actions. True will only include actions marked secured. False will include only unsecure actions. Do not use filter if you want all Actions. | [optional]<br />**Values**: true, false |
| **includeAuthActions** | **String**| Whether or not to include authentication actions in the response. These actions are not directly executable. Some integrations create them and will run them as needed to refresh authentication information for other actions. | [optional]<br />**Values**: true, false |
| **pageSize** | **Integer**| The total page size requested | [optional] [default to 25] |
| **pageNumber** | **Integer**| The page number requested | [optional] [default to 1] |
| **sortBy** | **String**| variable name requested to sort by | [optional] |
| **expand** | [**List&lt;Object&gt;**](Object.html)| variable name requested by expand list | [optional] |
| **nextPage** | **String**| next page token | [optional] |
| **previousPage** | **String**| Previous page token | [optional] |
{: class="table table-striped"}

### Return type

[**ActionEntityListing**](ActionEntityListing.html)

<a name="getIntegrationsActionsCategories"></a>

# **getIntegrationsActionsCategories**

> [CategoryEntityListing](CategoryEntityListing.html) getIntegrationsActionsCategories(secure, pageSize, pageNumber, sortBy, expand, nextPage, previousPage)

Retrieves all categories of available Actions



Wraps GET /api/v2/integrations/actions/categories  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IntegrationsApi apiInstance = new IntegrationsApi();
String secure = "secure_example"; // String | Filter to only include/exclude Action categories based on if they are considered secure. True will only include categories with Actions marked secured. False will only include categories of unsecured Actions.
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<Object> expand = null; // List<Object> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
try {
    CategoryEntityListing result = apiInstance.getIntegrationsActionsCategories(secure, pageSize, pageNumber, sortBy, expand, nextPage, previousPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsActionsCategories");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **secure** | **String**| Filter to only include/exclude Action categories based on if they are considered secure. True will only include categories with Actions marked secured. False will only include categories of unsecured Actions. | [optional]<br />**Values**: true, false |
| **pageSize** | **Integer**| The total page size requested | [optional] [default to 25] |
| **pageNumber** | **Integer**| The page number requested | [optional] [default to 1] |
| **sortBy** | **String**| variable name requested to sort by | [optional] |
| **expand** | [**List&lt;Object&gt;**](Object.html)| variable name requested by expand list | [optional] |
| **nextPage** | **String**| next page token | [optional] |
| **previousPage** | **String**| Previous page token | [optional] |
{: class="table table-striped"}

### Return type

[**CategoryEntityListing**](CategoryEntityListing.html)

<a name="getIntegrationsActionsDrafts"></a>

# **getIntegrationsActionsDrafts**

> [ActionEntityListing](ActionEntityListing.html) getIntegrationsActionsDrafts(category, secure, includeAuthActions, pageSize, pageNumber, sortBy, expand, nextPage, previousPage)

Retrieves all action drafts associated with the filters passed in via query param.



Wraps GET /api/v2/integrations/actions/drafts  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IntegrationsApi apiInstance = new IntegrationsApi();
String category = "category_example"; // String | Filter by category name
String secure = "secure_example"; // String | Filter to only include secure actions. True will only include actions marked secured. False will include only unsecure actions. Do not use filter if you want all Actions.
String includeAuthActions = "includeAuthActions_example"; // String | Whether or not to include authentication actions in the response. These actions are not directly executable. Some integrations create them and will run them as needed to refresh authentication information for other actions.
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<Object> expand = null; // List<Object> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
try {
    ActionEntityListing result = apiInstance.getIntegrationsActionsDrafts(category, secure, includeAuthActions, pageSize, pageNumber, sortBy, expand, nextPage, previousPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsActionsDrafts");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **category** | **String**| Filter by category name | [optional] |
| **secure** | **String**| Filter to only include secure actions. True will only include actions marked secured. False will include only unsecure actions. Do not use filter if you want all Actions. | [optional]<br />**Values**: true, false |
| **includeAuthActions** | **String**| Whether or not to include authentication actions in the response. These actions are not directly executable. Some integrations create them and will run them as needed to refresh authentication information for other actions. | [optional]<br />**Values**: true, false |
| **pageSize** | **Integer**| The total page size requested | [optional] [default to 25] |
| **pageNumber** | **Integer**| The page number requested | [optional] [default to 1] |
| **sortBy** | **String**| variable name requested to sort by | [optional] |
| **expand** | [**List&lt;Object&gt;**](Object.html)| variable name requested by expand list | [optional] |
| **nextPage** | **String**| next page token | [optional] |
| **previousPage** | **String**| Previous page token | [optional] |
{: class="table table-striped"}

### Return type

[**ActionEntityListing**](ActionEntityListing.html)

<a name="patchIntegrationsAction"></a>

# **patchIntegrationsAction**

> [Action](Action.html) patchIntegrationsAction(actionId, body)

Patch an Action



Wraps PATCH /api/v2/integrations/actions/{actionId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IntegrationsApi apiInstance = new IntegrationsApi();
String actionId = "actionId_example"; // String | actionId
UpdateActionInput body = new UpdateActionInput(); // UpdateActionInput | Input used to patch the Action.
try {
    Action result = apiInstance.patchIntegrationsAction(actionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#patchIntegrationsAction");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionId** | **String**| actionId | |
| **body** | [**UpdateActionInput**](UpdateActionInput.html)| Input used to patch the Action. | |
{: class="table table-striped"}

### Return type

[**Action**](Action.html)

<a name="patchIntegrationsActionDraft"></a>

# **patchIntegrationsActionDraft**

> [Action](Action.html) patchIntegrationsActionDraft(actionId, body)

Update an existing Draft



Wraps PATCH /api/v2/integrations/actions/{actionId}/draft  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IntegrationsApi apiInstance = new IntegrationsApi();
String actionId = "actionId_example"; // String | actionId
UpdateDraftInput body = new UpdateDraftInput(); // UpdateDraftInput | Input used to patch the Action Draft.
try {
    Action result = apiInstance.patchIntegrationsActionDraft(actionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#patchIntegrationsActionDraft");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionId** | **String**| actionId | |
| **body** | [**UpdateDraftInput**](UpdateDraftInput.html)| Input used to patch the Action Draft. | |
{: class="table table-striped"}

### Return type

[**Action**](Action.html)

<a name="postIntegrationsActionDraft"></a>

# **postIntegrationsActionDraft**

> [Action](Action.html) postIntegrationsActionDraft(actionId)

Create a new Draft from existing Action



Wraps POST /api/v2/integrations/actions/{actionId}/draft  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IntegrationsApi apiInstance = new IntegrationsApi();
String actionId = "actionId_example"; // String | actionId
try {
    Action result = apiInstance.postIntegrationsActionDraft(actionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#postIntegrationsActionDraft");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionId** | **String**| actionId | |
{: class="table table-striped"}

### Return type

[**Action**](Action.html)

<a name="postIntegrationsActionDraftPublish"></a>

# **postIntegrationsActionDraftPublish**

> [Action](Action.html) postIntegrationsActionDraftPublish(actionId, body)

Publish a Draft and make it the active Action configuration



Wraps POST /api/v2/integrations/actions/{actionId}/draft/publish  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IntegrationsApi apiInstance = new IntegrationsApi();
String actionId = "actionId_example"; // String | actionId
PublishDraftInput body = new PublishDraftInput(); // PublishDraftInput | Input used to patch the Action.
try {
    Action result = apiInstance.postIntegrationsActionDraftPublish(actionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#postIntegrationsActionDraftPublish");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionId** | **String**| actionId | |
| **body** | [**PublishDraftInput**](PublishDraftInput.html)| Input used to patch the Action. | |
{: class="table table-striped"}

### Return type

[**Action**](Action.html)

<a name="postIntegrationsActionDraftTest"></a>

# **postIntegrationsActionDraftTest**

> [TestExecutionResult](TestExecutionResult.html) postIntegrationsActionDraftTest(actionId, body)

Test the execution of a draft. Responses will show execution steps broken out with intermediate results to help in debugging.



Wraps POST /api/v2/integrations/actions/{actionId}/draft/test  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IntegrationsApi apiInstance = new IntegrationsApi();
String actionId = "actionId_example"; // String | actionId
Object body = null; // Object | Map of parameters used for variable substitution.
try {
    TestExecutionResult result = apiInstance.postIntegrationsActionDraftTest(actionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#postIntegrationsActionDraftTest");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionId** | **String**| actionId | |
| **body** | **Object**| Map of parameters used for variable substitution. | |
{: class="table table-striped"}

### Return type

[**TestExecutionResult**](TestExecutionResult.html)

<a name="postIntegrationsActionExecute"></a>

# **postIntegrationsActionExecute**

> Object postIntegrationsActionExecute(actionId, body)

Execute Action and return response from 3rd party.  Responses will follow the schemas defined on the Action for success and error.



Wraps POST /api/v2/integrations/actions/{actionId}/execute  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IntegrationsApi apiInstance = new IntegrationsApi();
String actionId = "actionId_example"; // String | actionId
Object body = null; // Object | Map of parameters used for variable substitution.
try {
    Object result = apiInstance.postIntegrationsActionExecute(actionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#postIntegrationsActionExecute");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionId** | **String**| actionId | |
| **body** | **Object**| Map of parameters used for variable substitution. | |
{: class="table table-striped"}

### Return type

**Object**

<a name="postIntegrationsActionTest"></a>

# **postIntegrationsActionTest**

> [TestExecutionResult](TestExecutionResult.html) postIntegrationsActionTest(actionId, body)

Test the execution of an action. Responses will show execution steps broken out with intermediate results to help in debugging.



Wraps POST /api/v2/integrations/actions/{actionId}/test  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IntegrationsApi apiInstance = new IntegrationsApi();
String actionId = "actionId_example"; // String | actionId
Object body = null; // Object | Map of parameters used for variable substitution.
try {
    TestExecutionResult result = apiInstance.postIntegrationsActionTest(actionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#postIntegrationsActionTest");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionId** | **String**| actionId | |
| **body** | **Object**| Map of parameters used for variable substitution. | |
{: class="table table-striped"}

### Return type

[**TestExecutionResult**](TestExecutionResult.html)

<a name="postIntegrationsActions"></a>

# **postIntegrationsActions**

> [Action](Action.html) postIntegrationsActions(body)

Create a new Action



Wraps POST /api/v2/integrations/actions  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IntegrationsApi apiInstance = new IntegrationsApi();
PostActionInput body = new PostActionInput(); // PostActionInput | Input used to create Action.
try {
    Action result = apiInstance.postIntegrationsActions(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#postIntegrationsActions");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**PostActionInput**](PostActionInput.html)| Input used to create Action. | |
{: class="table table-striped"}

### Return type

[**Action**](Action.html)

<a name="postIntegrationsActionsDrafts"></a>

# **postIntegrationsActionsDrafts**

> [Action](Action.html) postIntegrationsActionsDrafts(body)

Create a new Draft



Wraps POST /api/v2/integrations/actions/drafts  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IntegrationsApi apiInstance = new IntegrationsApi();
PostActionInput body = new PostActionInput(); // PostActionInput | Input used to create Action Draft.
try {
    Action result = apiInstance.postIntegrationsActionsDrafts(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#postIntegrationsActionsDrafts");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**PostActionInput**](PostActionInput.html)| Input used to create Action Draft. | |
{: class="table table-striped"}

### Return type

[**Action**](Action.html)

