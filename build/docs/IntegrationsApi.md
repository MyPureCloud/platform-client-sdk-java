---
title: IntegrationsApi
---
## IntegrationsApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteIntegration**](IntegrationsApi.html#deleteIntegration) | Delete integration. |
| [**deleteIntegrationsAction**](IntegrationsApi.html#deleteIntegrationsAction) | Delete an Action |
| [**deleteIntegrationsActionDraft**](IntegrationsApi.html#deleteIntegrationsActionDraft) | Delete a Draft |
| [**deleteIntegrationsCredential**](IntegrationsApi.html#deleteIntegrationsCredential) | Delete a set of credentials |
| [**getIntegration**](IntegrationsApi.html#getIntegration) | Get integration. |
| [**getIntegrationConfigCurrent**](IntegrationsApi.html#getIntegrationConfigCurrent) | Get integration configuration. |
| [**getIntegrations**](IntegrationsApi.html#getIntegrations) | List integrations |
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
| [**getIntegrationsClientapps**](IntegrationsApi.html#getIntegrationsClientapps) | List permitted client app integrations for the logged in user |
| [**getIntegrationsCredential**](IntegrationsApi.html#getIntegrationsCredential) | Get a single credential with sensitive fields redacted |
| [**getIntegrationsCredentials**](IntegrationsApi.html#getIntegrationsCredentials) | List multiple sets of credentials |
| [**getIntegrationsCredentialsTypes**](IntegrationsApi.html#getIntegrationsCredentialsTypes) | List all credential types |
| [**getIntegrationsEventlog**](IntegrationsApi.html#getIntegrationsEventlog) | List all events |
| [**getIntegrationsEventlogEventId**](IntegrationsApi.html#getIntegrationsEventlogEventId) | Get a single event |
| [**getIntegrationsType**](IntegrationsApi.html#getIntegrationsType) | Get integration type. |
| [**getIntegrationsTypeConfigschema**](IntegrationsApi.html#getIntegrationsTypeConfigschema) | Get properties config schema for an integration type. |
| [**getIntegrationsTypes**](IntegrationsApi.html#getIntegrationsTypes) | List integration types |
| [**patchIntegration**](IntegrationsApi.html#patchIntegration) | Update an integration. |
| [**patchIntegrationsAction**](IntegrationsApi.html#patchIntegrationsAction) | Patch an Action |
| [**patchIntegrationsActionDraft**](IntegrationsApi.html#patchIntegrationsActionDraft) | Update an existing Draft |
| [**postIntegrations**](IntegrationsApi.html#postIntegrations) | Create an integration. |
| [**postIntegrationsActionDraft**](IntegrationsApi.html#postIntegrationsActionDraft) | Create a new Draft from existing Action |
| [**postIntegrationsActionDraftPublish**](IntegrationsApi.html#postIntegrationsActionDraftPublish) | Publish a Draft and make it the active Action configuration |
| [**postIntegrationsActionDraftTest**](IntegrationsApi.html#postIntegrationsActionDraftTest) | Test the execution of a draft. Responses will show execution steps broken out with intermediate results to help in debugging. |
| [**postIntegrationsActionExecute**](IntegrationsApi.html#postIntegrationsActionExecute) | Execute Action and return response from 3rd party.  Responses will follow the schemas defined on the Action for success and error. |
| [**postIntegrationsActionTest**](IntegrationsApi.html#postIntegrationsActionTest) | Test the execution of an action. Responses will show execution steps broken out with intermediate results to help in debugging. |
| [**postIntegrationsActions**](IntegrationsApi.html#postIntegrationsActions) | Create a new Action |
| [**postIntegrationsActionsDrafts**](IntegrationsApi.html#postIntegrationsActionsDrafts) | Create a new Draft |
| [**postIntegrationsCredentials**](IntegrationsApi.html#postIntegrationsCredentials) | Create a set of credentials |
| [**postIntegrationsWorkforcemanagementVendorconnection**](IntegrationsApi.html#postIntegrationsWorkforcemanagementVendorconnection) | Add a vendor connection |
| [**putIntegrationConfigCurrent**](IntegrationsApi.html#putIntegrationConfigCurrent) | Update integration configuration. |
| [**putIntegrationsCredential**](IntegrationsApi.html#putIntegrationsCredential) | Update a set of credentials |
{: class="table table-striped"}

<a name="deleteIntegration"></a>

# **deleteIntegration**



> [Integration](Integration.html) deleteIntegration(integrationId)

Delete integration.



Wraps DELETE /api/v2/integrations/{integrationId}  

Requires NO permissions: 



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
String integrationId = "integrationId_example"; // String | Integration Id
try {
    Integration result = apiInstance.deleteIntegration(integrationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#deleteIntegration");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration Id | |
{: class="table table-striped"}

### Return type

[**Integration**](Integration.html)

<a name="deleteIntegrationsAction"></a>

# **deleteIntegrationsAction**



> Void deleteIntegrationsAction(actionId)

Delete an Action



Wraps DELETE /api/v2/integrations/actions/{actionId}  

Requires ANY permissions: 

* integrations:action:delete

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

Requires ANY permissions: 

* integrations:action:delete

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

<a name="deleteIntegrationsCredential"></a>

# **deleteIntegrationsCredential**



> Void deleteIntegrationsCredential(credentialId)

Delete a set of credentials



Wraps DELETE /api/v2/integrations/credentials/{credentialId}  

Requires NO permissions: 



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
String credentialId = "credentialId_example"; // String | Credential ID
try {
    apiInstance.deleteIntegrationsCredential(credentialId);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#deleteIntegrationsCredential");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **credentialId** | **String**| Credential ID | |
{: class="table table-striped"}

### Return type

null (empty response body)

<a name="getIntegration"></a>

# **getIntegration**



> [Integration](Integration.html) getIntegration(integrationId, pageSize, pageNumber, sortBy, expand, nextPage, previousPage)

Get integration.



Wraps GET /api/v2/integrations/{integrationId}  

Requires NO permissions: 



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
String integrationId = "integrationId_example"; // String | Integration Id
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<String> expand = Arrays.asList("expand_example"); // List<String> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
try {
    Integration result = apiInstance.getIntegration(integrationId, pageSize, pageNumber, sortBy, expand, nextPage, previousPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegration");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration Id | |
| **pageSize** | **Integer**| The total page size requested | [optional] [default to 25] |
| **pageNumber** | **Integer**| The page number requested | [optional] [default to 1] |
| **sortBy** | **String**| variable name requested to sort by | [optional] |
| **expand** | [**List&lt;String&gt;**](String.html)| variable name requested by expand list | [optional] |
| **nextPage** | **String**| next page token | [optional] |
| **previousPage** | **String**| Previous page token | [optional] |
{: class="table table-striped"}

### Return type

[**Integration**](Integration.html)

<a name="getIntegrationConfigCurrent"></a>

# **getIntegrationConfigCurrent**



> [IntegrationConfiguration](IntegrationConfiguration.html) getIntegrationConfigCurrent(integrationId)

Get integration configuration.



Wraps GET /api/v2/integrations/{integrationId}/config/current  

Requires NO permissions: 



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
String integrationId = "integrationId_example"; // String | Integration Id
try {
    IntegrationConfiguration result = apiInstance.getIntegrationConfigCurrent(integrationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationConfigCurrent");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration Id | |
{: class="table table-striped"}

### Return type

[**IntegrationConfiguration**](IntegrationConfiguration.html)

<a name="getIntegrations"></a>

# **getIntegrations**



> [IntegrationEntityListing](IntegrationEntityListing.html) getIntegrations(pageSize, pageNumber, sortBy, expand, nextPage, previousPage)

List integrations



Wraps GET /api/v2/integrations  

Requires NO permissions: 



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
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<String> expand = Arrays.asList("expand_example"); // List<String> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
try {
    IntegrationEntityListing result = apiInstance.getIntegrations(pageSize, pageNumber, sortBy, expand, nextPage, previousPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrations");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| The total page size requested | [optional] [default to 25] |
| **pageNumber** | **Integer**| The page number requested | [optional] [default to 1] |
| **sortBy** | **String**| variable name requested to sort by | [optional] |
| **expand** | [**List&lt;String&gt;**](String.html)| variable name requested by expand list | [optional] |
| **nextPage** | **String**| next page token | [optional] |
| **previousPage** | **String**| Previous page token | [optional] |
{: class="table table-striped"}

### Return type

[**IntegrationEntityListing**](IntegrationEntityListing.html)

<a name="getIntegrationsAction"></a>

# **getIntegrationsAction**



> [Action](Action.html) getIntegrationsAction(actionId, expand, includeConfig)

Retrieves a single Action matching id.



Wraps GET /api/v2/integrations/actions/{actionId}  

Requires ANY permissions: 

* integrations:action:view* bridge:actions:view

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

Requires ANY permissions: 

* integrations:action:view* bridge:actions:view

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

Requires ANY permissions: 

* integrations:action:view* bridge:actions:view

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

Requires ANY permissions: 

* integrations:action:view* bridge:actions:view

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

Requires ANY permissions: 

* integrations:action:edit

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

Requires ANY permissions: 

* integrations:action:view* bridge:actions:view

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

Requires ANY permissions: 

* integrations:action:view* bridge:actions:view

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

Requires ANY permissions: 

* integrations:action:view* bridge:actions:view

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
List<String> expand = Arrays.asList("expand_example"); // List<String> | variable name requested by expand list
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
| **expand** | [**List&lt;String&gt;**](String.html)| variable name requested by expand list | [optional] |
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

Requires ANY permissions: 

* integrations:action:view* bridge:actions:view

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
List<String> expand = Arrays.asList("expand_example"); // List<String> | variable name requested by expand list
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
| **expand** | [**List&lt;String&gt;**](String.html)| variable name requested by expand list | [optional] |
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

Requires ANY permissions: 

* integrations:action:view* bridge:actions:view

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
List<String> expand = Arrays.asList("expand_example"); // List<String> | variable name requested by expand list
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
| **expand** | [**List&lt;String&gt;**](String.html)| variable name requested by expand list | [optional] |
| **nextPage** | **String**| next page token | [optional] |
| **previousPage** | **String**| Previous page token | [optional] |
{: class="table table-striped"}

### Return type

[**ActionEntityListing**](ActionEntityListing.html)

<a name="getIntegrationsClientapps"></a>

# **getIntegrationsClientapps**



> [ClientAppEntityListing](ClientAppEntityListing.html) getIntegrationsClientapps(pageSize, pageNumber, sortBy, expand, nextPage, previousPage)

List permitted client app integrations for the logged in user



Wraps GET /api/v2/integrations/clientapps  

Requires NO permissions: 



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
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<String> expand = Arrays.asList("expand_example"); // List<String> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
try {
    ClientAppEntityListing result = apiInstance.getIntegrationsClientapps(pageSize, pageNumber, sortBy, expand, nextPage, previousPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsClientapps");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| The total page size requested | [optional] [default to 25] |
| **pageNumber** | **Integer**| The page number requested | [optional] [default to 1] |
| **sortBy** | **String**| variable name requested to sort by | [optional] |
| **expand** | [**List&lt;String&gt;**](String.html)| variable name requested by expand list | [optional] |
| **nextPage** | **String**| next page token | [optional] |
| **previousPage** | **String**| Previous page token | [optional] |
{: class="table table-striped"}

### Return type

[**ClientAppEntityListing**](ClientAppEntityListing.html)

<a name="getIntegrationsCredential"></a>

# **getIntegrationsCredential**



> [Credential](Credential.html) getIntegrationsCredential(credentialId)

Get a single credential with sensitive fields redacted



Wraps GET /api/v2/integrations/credentials/{credentialId}  

Requires NO permissions: 



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
String credentialId = "credentialId_example"; // String | Credential ID
try {
    Credential result = apiInstance.getIntegrationsCredential(credentialId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsCredential");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **credentialId** | **String**| Credential ID | |
{: class="table table-striped"}

### Return type

[**Credential**](Credential.html)

<a name="getIntegrationsCredentials"></a>

# **getIntegrationsCredentials**



> [CredentialInfoListing](CredentialInfoListing.html) getIntegrationsCredentials(pageNumber, pageSize)

List multiple sets of credentials



Wraps GET /api/v2/integrations/credentials  

Requires NO permissions: 



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
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
try {
    CredentialInfoListing result = apiInstance.getIntegrationsCredentials(pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsCredentials");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] |
{: class="table table-striped"}

### Return type

[**CredentialInfoListing**](CredentialInfoListing.html)

<a name="getIntegrationsCredentialsTypes"></a>

# **getIntegrationsCredentialsTypes**



> [CredentialTypeListing](CredentialTypeListing.html) getIntegrationsCredentialsTypes()

List all credential types



Wraps GET /api/v2/integrations/credentials/types  

Requires NO permissions: 



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
try {
    CredentialTypeListing result = apiInstance.getIntegrationsCredentialsTypes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsCredentialsTypes");
    e.printStackTrace();
}
~~~

### Parameters

This endpoint does not require any parameters.
{: class="table table-striped"}

### Return type

[**CredentialTypeListing**](CredentialTypeListing.html)

<a name="getIntegrationsEventlog"></a>

# **getIntegrationsEventlog**



> [IntegrationEventEntityListing](IntegrationEventEntityListing.html) getIntegrationsEventlog(pageSize, pageNumber, sortBy, sortOrder, entityId)

List all events



Wraps GET /api/v2/integrations/eventlog  

Requires ANY permissions: 

* integrations:integration:view* bridge:notification:view

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
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortBy = "timestamp"; // String | Sort by
String sortOrder = "descending"; // String | Order by
String entityId = "entityId_example"; // String | Include only events with this entity ID
try {
    IntegrationEventEntityListing result = apiInstance.getIntegrationsEventlog(pageSize, pageNumber, sortBy, sortOrder, entityId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsEventlog");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] |
| **sortBy** | **String**| Sort by | [optional] [default to timestamp] |
| **sortOrder** | **String**| Order by | [optional] [default to descending] |
| **entityId** | **String**| Include only events with this entity ID | [optional] |
{: class="table table-striped"}

### Return type

[**IntegrationEventEntityListing**](IntegrationEventEntityListing.html)

<a name="getIntegrationsEventlogEventId"></a>

# **getIntegrationsEventlogEventId**



> [IntegrationEvent](IntegrationEvent.html) getIntegrationsEventlogEventId(eventId)

Get a single event



Wraps GET /api/v2/integrations/eventlog/{eventId}  

Requires ANY permissions: 

* integrations:integration:view* bridge:notification:view

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
String eventId = "eventId_example"; // String | Event Id
try {
    IntegrationEvent result = apiInstance.getIntegrationsEventlogEventId(eventId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsEventlogEventId");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **eventId** | **String**| Event Id | |
{: class="table table-striped"}

### Return type

[**IntegrationEvent**](IntegrationEvent.html)

<a name="getIntegrationsType"></a>

# **getIntegrationsType**



> [IntegrationType](IntegrationType.html) getIntegrationsType(typeId)

Get integration type.



Wraps GET /api/v2/integrations/types/{typeId}  

Requires NO permissions: 



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
String typeId = "typeId_example"; // String | Integration Type Id
try {
    IntegrationType result = apiInstance.getIntegrationsType(typeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsType");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **typeId** | **String**| Integration Type Id | |
{: class="table table-striped"}

### Return type

[**IntegrationType**](IntegrationType.html)

<a name="getIntegrationsTypeConfigschema"></a>

# **getIntegrationsTypeConfigschema**



> [JsonSchemaDocument](JsonSchemaDocument.html) getIntegrationsTypeConfigschema(typeId, configType)

Get properties config schema for an integration type.



Wraps GET /api/v2/integrations/types/{typeId}/configschemas/{configType}  

Requires NO permissions: 



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
String typeId = "typeId_example"; // String | Integration Type Id
String configType = "configType_example"; // String | Config schema type
try {
    JsonSchemaDocument result = apiInstance.getIntegrationsTypeConfigschema(typeId, configType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsTypeConfigschema");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **typeId** | **String**| Integration Type Id | |
| **configType** | **String**| Config schema type |<br />**Values**: properties, advanced |
{: class="table table-striped"}

### Return type

[**JsonSchemaDocument**](JsonSchemaDocument.html)

<a name="getIntegrationsTypes"></a>

# **getIntegrationsTypes**



> [IntegrationTypeEntityListing](IntegrationTypeEntityListing.html) getIntegrationsTypes(pageSize, pageNumber, sortBy, expand, nextPage, previousPage)

List integration types



Wraps GET /api/v2/integrations/types  

Requires NO permissions: 



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
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<String> expand = Arrays.asList("expand_example"); // List<String> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
try {
    IntegrationTypeEntityListing result = apiInstance.getIntegrationsTypes(pageSize, pageNumber, sortBy, expand, nextPage, previousPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsTypes");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| The total page size requested | [optional] [default to 25] |
| **pageNumber** | **Integer**| The page number requested | [optional] [default to 1] |
| **sortBy** | **String**| variable name requested to sort by | [optional] |
| **expand** | [**List&lt;String&gt;**](String.html)| variable name requested by expand list | [optional] |
| **nextPage** | **String**| next page token | [optional] |
| **previousPage** | **String**| Previous page token | [optional] |
{: class="table table-striped"}

### Return type

[**IntegrationTypeEntityListing**](IntegrationTypeEntityListing.html)

<a name="patchIntegration"></a>

# **patchIntegration**



> [Integration](Integration.html) patchIntegration(integrationId, body, pageSize, pageNumber, sortBy, expand, nextPage, previousPage)

Update an integration.



Wraps PATCH /api/v2/integrations/{integrationId}  

Requires NO permissions: 



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
String integrationId = "integrationId_example"; // String | Integration Id
Integration body = new Integration(); // Integration | Integration Update
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<String> expand = Arrays.asList("expand_example"); // List<String> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
try {
    Integration result = apiInstance.patchIntegration(integrationId, body, pageSize, pageNumber, sortBy, expand, nextPage, previousPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#patchIntegration");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration Id | |
| **body** | [**Integration**](Integration.html)| Integration Update | [optional] |
| **pageSize** | **Integer**| The total page size requested | [optional] [default to 25] |
| **pageNumber** | **Integer**| The page number requested | [optional] [default to 1] |
| **sortBy** | **String**| variable name requested to sort by | [optional] |
| **expand** | [**List&lt;String&gt;**](String.html)| variable name requested by expand list | [optional] |
| **nextPage** | **String**| next page token | [optional] |
| **previousPage** | **String**| Previous page token | [optional] |
{: class="table table-striped"}

### Return type

[**Integration**](Integration.html)

<a name="patchIntegrationsAction"></a>

# **patchIntegrationsAction**



> [Action](Action.html) patchIntegrationsAction(actionId, body)

Patch an Action



Wraps PATCH /api/v2/integrations/actions/{actionId}  

Requires ANY permissions: 

* integrations:action:edit

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

Requires ANY permissions: 

* integrations:action:edit

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

<a name="postIntegrations"></a>

# **postIntegrations**



> [Integration](Integration.html) postIntegrations(body)

Create an integration.



Wraps POST /api/v2/integrations  

Requires NO permissions: 



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
CreateIntegrationRequest body = new CreateIntegrationRequest(); // CreateIntegrationRequest | Integration
try {
    Integration result = apiInstance.postIntegrations(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#postIntegrations");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**CreateIntegrationRequest**](CreateIntegrationRequest.html)| Integration | [optional] |
{: class="table table-striped"}

### Return type

[**Integration**](Integration.html)

<a name="postIntegrationsActionDraft"></a>

# **postIntegrationsActionDraft**



> [Action](Action.html) postIntegrationsActionDraft(actionId)

Create a new Draft from existing Action



Wraps POST /api/v2/integrations/actions/{actionId}/draft  

Requires ANY permissions: 

* integrations:action:edit

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

Requires ANY permissions: 

* integrations:action:edit

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

Requires ANY permissions: 

* integrations:action:execute

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

Requires ANY permissions: 

* integrations:action:execute* bridge:actions:execute

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

Requires ANY permissions: 

* integrations:action:execute* bridge:actions:execute

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

Requires ANY permissions: 

* integrations:action:add

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

Requires ANY permissions: 

* integrations:action:add

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

<a name="postIntegrationsCredentials"></a>

# **postIntegrationsCredentials**



> [CredentialInfo](CredentialInfo.html) postIntegrationsCredentials(body)

Create a set of credentials



Wraps POST /api/v2/integrations/credentials  

Requires NO permissions: 



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
Credential body = new Credential(); // Credential | Credential
try {
    CredentialInfo result = apiInstance.postIntegrationsCredentials(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#postIntegrationsCredentials");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**Credential**](Credential.html)| Credential | [optional] |
{: class="table table-striped"}

### Return type

[**CredentialInfo**](CredentialInfo.html)

<a name="postIntegrationsWorkforcemanagementVendorconnection"></a>

# **postIntegrationsWorkforcemanagementVendorconnection**



> [UserActionCategoryEntityListing](UserActionCategoryEntityListing.html) postIntegrationsWorkforcemanagementVendorconnection(body)

Add a vendor connection



Wraps POST /api/v2/integrations/workforcemanagement/vendorconnection  

Requires NO permissions: 



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
VendorConnectionRequest body = new VendorConnectionRequest(); // VendorConnectionRequest | 
try {
    UserActionCategoryEntityListing result = apiInstance.postIntegrationsWorkforcemanagementVendorconnection(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#postIntegrationsWorkforcemanagementVendorconnection");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**VendorConnectionRequest**](VendorConnectionRequest.html)|  | [optional] |
{: class="table table-striped"}

### Return type

[**UserActionCategoryEntityListing**](UserActionCategoryEntityListing.html)

<a name="putIntegrationConfigCurrent"></a>

# **putIntegrationConfigCurrent**



> [IntegrationConfiguration](IntegrationConfiguration.html) putIntegrationConfigCurrent(integrationId, body)

Update integration configuration.



Wraps PUT /api/v2/integrations/{integrationId}/config/current  

Requires NO permissions: 



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
String integrationId = "integrationId_example"; // String | Integration Id
IntegrationConfiguration body = new IntegrationConfiguration(); // IntegrationConfiguration | Integration Configuration
try {
    IntegrationConfiguration result = apiInstance.putIntegrationConfigCurrent(integrationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#putIntegrationConfigCurrent");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration Id | |
| **body** | [**IntegrationConfiguration**](IntegrationConfiguration.html)| Integration Configuration | [optional] |
{: class="table table-striped"}

### Return type

[**IntegrationConfiguration**](IntegrationConfiguration.html)

<a name="putIntegrationsCredential"></a>

# **putIntegrationsCredential**



> [CredentialInfo](CredentialInfo.html) putIntegrationsCredential(credentialId, body)

Update a set of credentials



Wraps PUT /api/v2/integrations/credentials/{credentialId}  

Requires NO permissions: 



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
String credentialId = "credentialId_example"; // String | Credential ID
Credential body = new Credential(); // Credential | Credential
try {
    CredentialInfo result = apiInstance.putIntegrationsCredential(credentialId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#putIntegrationsCredential");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **credentialId** | **String**| Credential ID | |
| **body** | [**Credential**](Credential.html)| Credential | [optional] |
{: class="table table-striped"}

### Return type

[**CredentialInfo**](CredentialInfo.html)

