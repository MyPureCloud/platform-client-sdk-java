---
title: ArchitectApi
---
## ArchitectApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteArchitectIvr**](ArchitectApi.html#deleteArchitectIvr) | Delete an IVR Config. |
| [**deleteArchitectPrompt**](ArchitectApi.html#deleteArchitectPrompt) | Delete specified user prompt |
| [**deleteArchitectPromptResource**](ArchitectApi.html#deleteArchitectPromptResource) | Delete specified user prompt resource |
| [**deleteArchitectPrompts**](ArchitectApi.html#deleteArchitectPrompts) | Batch-delete a list of prompts |
| [**deleteArchitectSchedule**](ArchitectApi.html#deleteArchitectSchedule) | Delete a schedule by id |
| [**deleteArchitectSchedulegroup**](ArchitectApi.html#deleteArchitectSchedulegroup) | Deletes a schedule group by ID |
| [**deleteArchitectSystempromptResource**](ArchitectApi.html#deleteArchitectSystempromptResource) | Delete a system prompt resource override. |
| [**deleteFlow**](ArchitectApi.html#deleteFlow) | Delete flow |
| [**deleteFlows**](ArchitectApi.html#deleteFlows) | Batch-delete a list of flows |
| [**getArchitectDependencytracking**](ArchitectApi.html#getArchitectDependencytracking) | Get Dependency Tracking objects that have a given display name |
| [**getArchitectDependencytrackingBuild**](ArchitectApi.html#getArchitectDependencytrackingBuild) | Get Dependency Tracking build status for an organization |
| [**getArchitectDependencytrackingConsumedresources**](ArchitectApi.html#getArchitectDependencytrackingConsumedresources) | Get resources that are consumed by a given Dependency Tracking object |
| [**getArchitectDependencytrackingConsumingresources**](ArchitectApi.html#getArchitectDependencytrackingConsumingresources) | Get resources that consume a given Dependency Tracking object |
| [**getArchitectDependencytrackingDeletedresourceconsumers**](ArchitectApi.html#getArchitectDependencytrackingDeletedresourceconsumers) | Get Dependency Tracking objects that consume deleted resources |
| [**getArchitectDependencytrackingObject**](ArchitectApi.html#getArchitectDependencytrackingObject) | Get a Dependency Tracking object |
| [**getArchitectDependencytrackingType**](ArchitectApi.html#getArchitectDependencytrackingType) | Get a Dependency Tracking type. |
| [**getArchitectDependencytrackingTypes**](ArchitectApi.html#getArchitectDependencytrackingTypes) | Get Dependency Tracking types. |
| [**getArchitectDependencytrackingUpdatedresourceconsumers**](ArchitectApi.html#getArchitectDependencytrackingUpdatedresourceconsumers) | Get Dependency Tracking objects that depend on updated resources |
| [**getArchitectIvr**](ArchitectApi.html#getArchitectIvr) | Get an IVR config. |
| [**getArchitectIvrs**](ArchitectApi.html#getArchitectIvrs) | Get IVR configs. |
| [**getArchitectPrompt**](ArchitectApi.html#getArchitectPrompt) | Get specified user prompt |
| [**getArchitectPromptHistoryHistoryId**](ArchitectApi.html#getArchitectPromptHistoryHistoryId) | Get generated prompt history |
| [**getArchitectPromptResource**](ArchitectApi.html#getArchitectPromptResource) | Get specified user prompt resource |
| [**getArchitectPromptResources**](ArchitectApi.html#getArchitectPromptResources) | Get a pageable list of user prompt resources |
| [**getArchitectPrompts**](ArchitectApi.html#getArchitectPrompts) | Get a pageable list of user prompts |
| [**getArchitectSchedule**](ArchitectApi.html#getArchitectSchedule) | Get a schedule by ID |
| [**getArchitectSchedulegroup**](ArchitectApi.html#getArchitectSchedulegroup) | Gets a schedule group by ID |
| [**getArchitectSchedulegroups**](ArchitectApi.html#getArchitectSchedulegroups) | Get a list of schedule groups. |
| [**getArchitectSchedules**](ArchitectApi.html#getArchitectSchedules) | Get a list of schedules. |
| [**getArchitectSystemprompt**](ArchitectApi.html#getArchitectSystemprompt) | Get a system prompt |
| [**getArchitectSystempromptHistoryHistoryId**](ArchitectApi.html#getArchitectSystempromptHistoryHistoryId) | Get generated prompt history |
| [**getArchitectSystempromptResource**](ArchitectApi.html#getArchitectSystempromptResource) | Get a system prompt resource. |
| [**getArchitectSystempromptResources**](ArchitectApi.html#getArchitectSystempromptResources) | Get system prompt resources. |
| [**getArchitectSystemprompts**](ArchitectApi.html#getArchitectSystemprompts) | Get System Prompts |
| [**getFlow**](ArchitectApi.html#getFlow) | Get flow |
| [**getFlowHistoryHistoryId**](ArchitectApi.html#getFlowHistoryHistoryId) | Get generated flow history |
| [**getFlowLatestconfiguration**](ArchitectApi.html#getFlowLatestconfiguration) | Get the latest configuration for flow |
| [**getFlowVersion**](ArchitectApi.html#getFlowVersion) | Get flow version |
| [**getFlowVersionConfiguration**](ArchitectApi.html#getFlowVersionConfiguration) | Create flow version configuration |
| [**getFlowVersions**](ArchitectApi.html#getFlowVersions) | Get flow version list |
| [**getFlows**](ArchitectApi.html#getFlows) | Get a pageable list of flows, filtered by query parameters |
| [**postArchitectDependencytrackingBuild**](ArchitectApi.html#postArchitectDependencytrackingBuild) | Rebuild Dependency Tracking data for an organization |
| [**postArchitectIvrs**](ArchitectApi.html#postArchitectIvrs) | Create IVR config. |
| [**postArchitectPromptHistory**](ArchitectApi.html#postArchitectPromptHistory) | Generate prompt history |
| [**postArchitectPromptResources**](ArchitectApi.html#postArchitectPromptResources) | Create a new user prompt resource |
| [**postArchitectPrompts**](ArchitectApi.html#postArchitectPrompts) | Create a new user prompt |
| [**postArchitectSchedulegroups**](ArchitectApi.html#postArchitectSchedulegroups) | Creates a new schedule group |
| [**postArchitectSchedules**](ArchitectApi.html#postArchitectSchedules) | Create a new schedule. |
| [**postArchitectSystempromptHistory**](ArchitectApi.html#postArchitectSystempromptHistory) | Generate system prompt history |
| [**postArchitectSystempromptResources**](ArchitectApi.html#postArchitectSystempromptResources) | Create system prompt resource override. |
| [**postFlowVersions**](ArchitectApi.html#postFlowVersions) | Create flow version |
| [**postFlows**](ArchitectApi.html#postFlows) | Create flow |
| [**postFlowsActionsCheckin**](ArchitectApi.html#postFlowsActionsCheckin) | Check-in flow |
| [**postFlowsActionsCheckout**](ArchitectApi.html#postFlowsActionsCheckout) | Check-out flow |
| [**postFlowsActionsDeactivate**](ArchitectApi.html#postFlowsActionsDeactivate) | Deactivate flow |
| [**postFlowsActionsPublish**](ArchitectApi.html#postFlowsActionsPublish) | Publish flow |
| [**postFlowsActionsRevert**](ArchitectApi.html#postFlowsActionsRevert) | Revert flow |
| [**postFlowsActionsUnlock**](ArchitectApi.html#postFlowsActionsUnlock) | Unlock flow |
| [**putArchitectIvr**](ArchitectApi.html#putArchitectIvr) | Update an IVR Config. |
| [**putArchitectPrompt**](ArchitectApi.html#putArchitectPrompt) | Update specified user prompt |
| [**putArchitectPromptResource**](ArchitectApi.html#putArchitectPromptResource) | Update specified user prompt resource |
| [**putArchitectSchedule**](ArchitectApi.html#putArchitectSchedule) | Update schedule by ID |
| [**putArchitectSchedulegroup**](ArchitectApi.html#putArchitectSchedulegroup) | Updates a schedule group by ID |
| [**putArchitectSystempromptResource**](ArchitectApi.html#putArchitectSystempromptResource) | Updates a system prompt resource override. |
| [**putFlow**](ArchitectApi.html#putFlow) | Update flow |
{: class="table table-striped"}

<a name="deleteArchitectIvr"></a>

# **deleteArchitectIvr**

> Void deleteArchitectIvr(ivrId)

Delete an IVR Config.



Wraps DELETE /api/v2/architect/ivrs/{ivrId}  

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
String ivrId = "ivrId_example"; // String | IVR id
try {
    apiInstance.deleteArchitectIvr(ivrId);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#deleteArchitectIvr");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ivrId** | **String**| IVR id | |
{: class="table table-striped"}

### Return type

null (empty response body)

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

Batch-delete a list of prompts

Multiple IDs can be specified, in which case all specified prompts will be deleted.  Asynchronous.  Notification topic: v2.architect.prompts.{promptId}

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

<a name="deleteArchitectSchedule"></a>

# **deleteArchitectSchedule**

> Void deleteArchitectSchedule(scheduleId)

Delete a schedule by id



Wraps DELETE /api/v2/architect/schedules/{scheduleId}  

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
String scheduleId = "scheduleId_example"; // String | Schedule ID
try {
    apiInstance.deleteArchitectSchedule(scheduleId);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#deleteArchitectSchedule");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **scheduleId** | **String**| Schedule ID | |
{: class="table table-striped"}

### Return type

null (empty response body)

<a name="deleteArchitectSchedulegroup"></a>

# **deleteArchitectSchedulegroup**

> Void deleteArchitectSchedulegroup(scheduleGroupId)

Deletes a schedule group by ID



Wraps DELETE /api/v2/architect/schedulegroups/{scheduleGroupId}  

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
String scheduleGroupId = "scheduleGroupId_example"; // String | Schedule group ID
try {
    apiInstance.deleteArchitectSchedulegroup(scheduleGroupId);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#deleteArchitectSchedulegroup");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **scheduleGroupId** | **String**| Schedule group ID | |
{: class="table table-striped"}

### Return type

null (empty response body)

<a name="deleteArchitectSystempromptResource"></a>

# **deleteArchitectSystempromptResource**

> Void deleteArchitectSystempromptResource(promptId, languageCode)

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
    apiInstance.deleteArchitectSystempromptResource(promptId, languageCode);
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

null (empty response body)

<a name="deleteFlow"></a>

# **deleteFlow**

> Void deleteFlow(flowId)

Delete flow



Wraps DELETE /api/v2/flows/{flowId}  

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
String flowId = "flowId_example"; // String | Flow ID
try {
    apiInstance.deleteFlow(flowId);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#deleteFlow");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **flowId** | **String**| Flow ID | |
{: class="table table-striped"}

### Return type

null (empty response body)

<a name="deleteFlows"></a>

# **deleteFlows**

> [Operation](Operation.html) deleteFlows(id)

Batch-delete a list of flows

Multiple IDs can be specified, in which case all specified flows will be deleted.  Asynchronous.  Notification topic: v2.flows.{flowId}

Wraps DELETE /api/v2/flows  

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
List<String> id = Arrays.asList("id_example"); // List<String> | List of Flow IDs
try {
    Operation result = apiInstance.deleteFlows(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#deleteFlows");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | [**List&lt;String&gt;**](String.html)| List of Flow IDs | |
{: class="table table-striped"}

### Return type

[**Operation**](Operation.html)

<a name="getArchitectDependencytracking"></a>

# **getArchitectDependencytracking**

> [DependencyObjectEntityListing](DependencyObjectEntityListing.html) getArchitectDependencytracking(name, pageNumber, pageSize, objectType, consumedResources, consumingResources, consumedResourceType, consumingResourceType)

Get Dependency Tracking objects that have a given display name



Wraps GET /api/v2/architect/dependencytracking  

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
String name = "name_example"; // String | Object name to search for
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
List<String> objectType = Arrays.asList("objectType_example"); // List<String> | Object type(s) to search for
Boolean consumedResources = true; // Boolean | Include resources each result item consumes
Boolean consumingResources = true; // Boolean | Include resources that consume each result item
List<String> consumedResourceType = Arrays.asList("consumedResourceType_example"); // List<String> | Types of consumed resources to return, if consumed resources are requested
List<String> consumingResourceType = Arrays.asList("consumingResourceType_example"); // List<String> | Types of consuming resources to return, if consuming resources are requested
try {
    DependencyObjectEntityListing result = apiInstance.getArchitectDependencytracking(name, pageNumber, pageSize, objectType, consumedResources, consumingResources, consumedResourceType, consumingResourceType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectDependencytracking");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **name** | **String**| Object name to search for | |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] |
| **objectType** | [**List&lt;String&gt;**](String.html)| Object type(s) to search for | [optional]<br />**Values**: ACDLANGUAGE, ACDSKILL, ACDWRAPUPCODE, BRIDGEACTION, COMPOSERSCRIPT, CONTACTLIST, DATAACTION, EMAILROUTE, GROUP, INBOUNDCALLFLOW, INBOUNDEMAILFLOW, INBOUNDSHORTMESSAGEFLOW, INQUEUECALLFLOW, IVRCONFIGURATION, LANGUAGE, LEXBOT, LEXBOTALIAS, OUTBOUNDCALLFLOW, QUEUE, RESPONSE, SCHEDULE, SCHEDULEGROUP, SECUREACTION, SECURECALLFLOW, SURVEYINVITEFLOW, SYSTEMPROMPT, USER, USERPROMPT, VOICEXML, WORKFLOW |
| **consumedResources** | **Boolean**| Include resources each result item consumes | [optional] |
| **consumingResources** | **Boolean**| Include resources that consume each result item | [optional] |
| **consumedResourceType** | [**List&lt;String&gt;**](String.html)| Types of consumed resources to return, if consumed resources are requested | [optional]<br />**Values**: ACDLANGUAGE, ACDSKILL, ACDWRAPUPCODE, BRIDGEACTION, COMPOSERSCRIPT, CONTACTLIST, DATAACTION, EMAILROUTE, GROUP, INBOUNDCALLFLOW, INBOUNDEMAILFLOW, INBOUNDSHORTMESSAGEFLOW, INQUEUECALLFLOW, IVRCONFIGURATION, LANGUAGE, LEXBOT, LEXBOTALIAS, OUTBOUNDCALLFLOW, QUEUE, RESPONSE, SCHEDULE, SCHEDULEGROUP, SECUREACTION, SECURECALLFLOW, SURVEYINVITEFLOW, SYSTEMPROMPT, USER, USERPROMPT, VOICEXML, WORKFLOW |
| **consumingResourceType** | [**List&lt;String&gt;**](String.html)| Types of consuming resources to return, if consuming resources are requested | [optional]<br />**Values**: ACDLANGUAGE, ACDSKILL, ACDWRAPUPCODE, BRIDGEACTION, COMPOSERSCRIPT, CONTACTLIST, DATAACTION, EMAILROUTE, GROUP, INBOUNDCALLFLOW, INBOUNDEMAILFLOW, INBOUNDSHORTMESSAGEFLOW, INQUEUECALLFLOW, IVRCONFIGURATION, LANGUAGE, LEXBOT, LEXBOTALIAS, OUTBOUNDCALLFLOW, QUEUE, RESPONSE, SCHEDULE, SCHEDULEGROUP, SECUREACTION, SECURECALLFLOW, SURVEYINVITEFLOW, SYSTEMPROMPT, USER, USERPROMPT, VOICEXML, WORKFLOW |
{: class="table table-striped"}

### Return type

[**DependencyObjectEntityListing**](DependencyObjectEntityListing.html)

<a name="getArchitectDependencytrackingBuild"></a>

# **getArchitectDependencytrackingBuild**

> [DependencyStatus](DependencyStatus.html) getArchitectDependencytrackingBuild()

Get Dependency Tracking build status for an organization



Wraps GET /api/v2/architect/dependencytracking/build  

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
try {
    DependencyStatus result = apiInstance.getArchitectDependencytrackingBuild();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectDependencytrackingBuild");
    e.printStackTrace();
}
~~~

### Parameters

This endpoint does not require any parameters.
{: class="table table-striped"}

### Return type

[**DependencyStatus**](DependencyStatus.html)

<a name="getArchitectDependencytrackingConsumedresources"></a>

# **getArchitectDependencytrackingConsumedresources**

> [ConsumedResourcesEntityListing](ConsumedResourcesEntityListing.html) getArchitectDependencytrackingConsumedresources(id, version, objectType, resourceType)

Get resources that are consumed by a given Dependency Tracking object



Wraps GET /api/v2/architect/dependencytracking/consumedresources  

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
String id = "id_example"; // String | Consuming object ID
String version = "version_example"; // String | Consuming object version
String objectType = "objectType_example"; // String | Consuming object type.  Only versioned types are allowed here.
List<String> resourceType = Arrays.asList("resourceType_example"); // List<String> | Types of consumed resources to show
try {
    ConsumedResourcesEntityListing result = apiInstance.getArchitectDependencytrackingConsumedresources(id, version, objectType, resourceType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectDependencytrackingConsumedresources");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **String**| Consuming object ID | |
| **version** | **String**| Consuming object version | |
| **objectType** | **String**| Consuming object type.  Only versioned types are allowed here. |<br />**Values**: ACDLANGUAGE, ACDSKILL, ACDWRAPUPCODE, BRIDGEACTION, COMPOSERSCRIPT, CONTACTLIST, DATAACTION, EMAILROUTE, GROUP, INBOUNDCALLFLOW, INBOUNDEMAILFLOW, INBOUNDSHORTMESSAGEFLOW, INQUEUECALLFLOW, IVRCONFIGURATION, LANGUAGE, LEXBOT, LEXBOTALIAS, OUTBOUNDCALLFLOW, QUEUE, RESPONSE, SCHEDULE, SCHEDULEGROUP, SECUREACTION, SECURECALLFLOW, SURVEYINVITEFLOW, SYSTEMPROMPT, USER, USERPROMPT, VOICEXML, WORKFLOW |
| **resourceType** | [**List&lt;String&gt;**](String.html)| Types of consumed resources to show | [optional]<br />**Values**: ACDLANGUAGE, ACDSKILL, ACDWRAPUPCODE, BRIDGEACTION, COMPOSERSCRIPT, CONTACTLIST, DATAACTION, EMAILROUTE, GROUP, INBOUNDCALLFLOW, INBOUNDEMAILFLOW, INBOUNDSHORTMESSAGEFLOW, INQUEUECALLFLOW, IVRCONFIGURATION, LANGUAGE, LEXBOT, LEXBOTALIAS, OUTBOUNDCALLFLOW, QUEUE, RESPONSE, SCHEDULE, SCHEDULEGROUP, SECUREACTION, SECURECALLFLOW, SURVEYINVITEFLOW, SYSTEMPROMPT, USER, USERPROMPT, VOICEXML, WORKFLOW |
{: class="table table-striped"}

### Return type

[**ConsumedResourcesEntityListing**](ConsumedResourcesEntityListing.html)

<a name="getArchitectDependencytrackingConsumingresources"></a>

# **getArchitectDependencytrackingConsumingresources**

> [ConsumingResourcesEntityListing](ConsumingResourcesEntityListing.html) getArchitectDependencytrackingConsumingresources(id, objectType, resourceType)

Get resources that consume a given Dependency Tracking object



Wraps GET /api/v2/architect/dependencytracking/consumingresources  

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
String id = "id_example"; // String | Consumed object ID
String objectType = "objectType_example"; // String | Consumed object type
List<String> resourceType = Arrays.asList("resourceType_example"); // List<String> | Types of consuming resources to show.  Only versioned types are allowed here.
try {
    ConsumingResourcesEntityListing result = apiInstance.getArchitectDependencytrackingConsumingresources(id, objectType, resourceType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectDependencytrackingConsumingresources");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **String**| Consumed object ID | |
| **objectType** | **String**| Consumed object type |<br />**Values**: ACDLANGUAGE, ACDSKILL, ACDWRAPUPCODE, BRIDGEACTION, COMPOSERSCRIPT, CONTACTLIST, DATAACTION, EMAILROUTE, GROUP, INBOUNDCALLFLOW, INBOUNDEMAILFLOW, INBOUNDSHORTMESSAGEFLOW, INQUEUECALLFLOW, IVRCONFIGURATION, LANGUAGE, LEXBOT, LEXBOTALIAS, OUTBOUNDCALLFLOW, QUEUE, RESPONSE, SCHEDULE, SCHEDULEGROUP, SECUREACTION, SECURECALLFLOW, SURVEYINVITEFLOW, SYSTEMPROMPT, USER, USERPROMPT, VOICEXML, WORKFLOW |
| **resourceType** | [**List&lt;String&gt;**](String.html)| Types of consuming resources to show.  Only versioned types are allowed here. | [optional]<br />**Values**: ACDLANGUAGE, ACDSKILL, ACDWRAPUPCODE, BRIDGEACTION, COMPOSERSCRIPT, CONTACTLIST, DATAACTION, EMAILROUTE, GROUP, INBOUNDCALLFLOW, INBOUNDEMAILFLOW, INBOUNDSHORTMESSAGEFLOW, INQUEUECALLFLOW, IVRCONFIGURATION, LANGUAGE, LEXBOT, LEXBOTALIAS, OUTBOUNDCALLFLOW, QUEUE, RESPONSE, SCHEDULE, SCHEDULEGROUP, SECUREACTION, SECURECALLFLOW, SURVEYINVITEFLOW, SYSTEMPROMPT, USER, USERPROMPT, VOICEXML, WORKFLOW |
{: class="table table-striped"}

### Return type

[**ConsumingResourcesEntityListing**](ConsumingResourcesEntityListing.html)

<a name="getArchitectDependencytrackingDeletedresourceconsumers"></a>

# **getArchitectDependencytrackingDeletedresourceconsumers**

> [DependencyObjectEntityListing](DependencyObjectEntityListing.html) getArchitectDependencytrackingDeletedresourceconsumers(name, objectType, flowFilter, consumedResources, consumedResourceType, pageNumber, pageSize)

Get Dependency Tracking objects that consume deleted resources



Wraps GET /api/v2/architect/dependencytracking/deletedresourceconsumers  

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
String name = "name_example"; // String | Name to search for
List<String> objectType = Arrays.asList("objectType_example"); // List<String> | Object type(s) to search for
String flowFilter = "flowFilter_example"; // String | Show only checkedIn or published flows
Boolean consumedResources = false; // Boolean | Return consumed resources?
List<String> consumedResourceType = Arrays.asList("consumedResourceType_example"); // List<String> | Resource type(s) to return
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
try {
    DependencyObjectEntityListing result = apiInstance.getArchitectDependencytrackingDeletedresourceconsumers(name, objectType, flowFilter, consumedResources, consumedResourceType, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectDependencytrackingDeletedresourceconsumers");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **name** | **String**| Name to search for | [optional] |
| **objectType** | [**List&lt;String&gt;**](String.html)| Object type(s) to search for | [optional]<br />**Values**: ACDLANGUAGE, ACDSKILL, ACDWRAPUPCODE, BRIDGEACTION, COMPOSERSCRIPT, CONTACTLIST, DATAACTION, EMAILROUTE, GROUP, INBOUNDCALLFLOW, INBOUNDEMAILFLOW, INBOUNDSHORTMESSAGEFLOW, INQUEUECALLFLOW, IVRCONFIGURATION, LANGUAGE, LEXBOT, LEXBOTALIAS, OUTBOUNDCALLFLOW, QUEUE, RESPONSE, SCHEDULE, SCHEDULEGROUP, SECUREACTION, SECURECALLFLOW, SURVEYINVITEFLOW, SYSTEMPROMPT, USER, USERPROMPT, VOICEXML, WORKFLOW |
| **flowFilter** | **String**| Show only checkedIn or published flows | [optional]<br />**Values**: checkedIn, published |
| **consumedResources** | **Boolean**| Return consumed resources? | [optional] [default to false] |
| **consumedResourceType** | [**List&lt;String&gt;**](String.html)| Resource type(s) to return | [optional]<br />**Values**: ACDLANGUAGE, ACDSKILL, ACDWRAPUPCODE, BRIDGEACTION, COMPOSERSCRIPT, CONTACTLIST, DATAACTION, EMAILROUTE, GROUP, INBOUNDCALLFLOW, INBOUNDEMAILFLOW, INBOUNDSHORTMESSAGEFLOW, INQUEUECALLFLOW, IVRCONFIGURATION, LANGUAGE, LEXBOT, LEXBOTALIAS, OUTBOUNDCALLFLOW, QUEUE, RESPONSE, SCHEDULE, SCHEDULEGROUP, SECUREACTION, SECURECALLFLOW, SURVEYINVITEFLOW, SYSTEMPROMPT, USER, USERPROMPT, VOICEXML, WORKFLOW |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] |
{: class="table table-striped"}

### Return type

[**DependencyObjectEntityListing**](DependencyObjectEntityListing.html)

<a name="getArchitectDependencytrackingObject"></a>

# **getArchitectDependencytrackingObject**

> [DependencyObject](DependencyObject.html) getArchitectDependencytrackingObject(id, version, objectType, consumedResources, consumingResources, consumedResourceType, consumingResourceType)

Get a Dependency Tracking object



Wraps GET /api/v2/architect/dependencytracking/object  

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
String id = "id_example"; // String | Object ID
String version = "version_example"; // String | Object version
String objectType = "objectType_example"; // String | Object type
Boolean consumedResources = true; // Boolean | Include resources this item consumes
Boolean consumingResources = true; // Boolean | Include resources that consume this item
List<String> consumedResourceType = Arrays.asList("consumedResourceType_example"); // List<String> | Types of consumed resources to return, if consumed resources are requested
List<String> consumingResourceType = Arrays.asList("consumingResourceType_example"); // List<String> | Types of consuming resources to return, if consuming resources are requested
try {
    DependencyObject result = apiInstance.getArchitectDependencytrackingObject(id, version, objectType, consumedResources, consumingResources, consumedResourceType, consumingResourceType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectDependencytrackingObject");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **String**| Object ID | |
| **version** | **String**| Object version | [optional] |
| **objectType** | **String**| Object type | [optional]<br />**Values**: ACDLANGUAGE, ACDSKILL, ACDWRAPUPCODE, BRIDGEACTION, COMPOSERSCRIPT, CONTACTLIST, DATAACTION, EMAILROUTE, GROUP, INBOUNDCALLFLOW, INBOUNDEMAILFLOW, INBOUNDSHORTMESSAGEFLOW, INQUEUECALLFLOW, IVRCONFIGURATION, LANGUAGE, LEXBOT, LEXBOTALIAS, OUTBOUNDCALLFLOW, QUEUE, RESPONSE, SCHEDULE, SCHEDULEGROUP, SECUREACTION, SECURECALLFLOW, SURVEYINVITEFLOW, SYSTEMPROMPT, USER, USERPROMPT, VOICEXML, WORKFLOW |
| **consumedResources** | **Boolean**| Include resources this item consumes | [optional] |
| **consumingResources** | **Boolean**| Include resources that consume this item | [optional] |
| **consumedResourceType** | [**List&lt;String&gt;**](String.html)| Types of consumed resources to return, if consumed resources are requested | [optional]<br />**Values**: ACDLANGUAGE, ACDSKILL, ACDWRAPUPCODE, BRIDGEACTION, COMPOSERSCRIPT, CONTACTLIST, DATAACTION, EMAILROUTE, GROUP, INBOUNDCALLFLOW, INBOUNDEMAILFLOW, INBOUNDSHORTMESSAGEFLOW, INQUEUECALLFLOW, IVRCONFIGURATION, LANGUAGE, LEXBOT, LEXBOTALIAS, OUTBOUNDCALLFLOW, QUEUE, RESPONSE, SCHEDULE, SCHEDULEGROUP, SECUREACTION, SECURECALLFLOW, SURVEYINVITEFLOW, SYSTEMPROMPT, USER, USERPROMPT, VOICEXML, WORKFLOW |
| **consumingResourceType** | [**List&lt;String&gt;**](String.html)| Types of consuming resources to return, if consuming resources are requested | [optional]<br />**Values**: ACDLANGUAGE, ACDSKILL, ACDWRAPUPCODE, BRIDGEACTION, COMPOSERSCRIPT, CONTACTLIST, DATAACTION, EMAILROUTE, GROUP, INBOUNDCALLFLOW, INBOUNDEMAILFLOW, INBOUNDSHORTMESSAGEFLOW, INQUEUECALLFLOW, IVRCONFIGURATION, LANGUAGE, LEXBOT, LEXBOTALIAS, OUTBOUNDCALLFLOW, QUEUE, RESPONSE, SCHEDULE, SCHEDULEGROUP, SECUREACTION, SECURECALLFLOW, SURVEYINVITEFLOW, SYSTEMPROMPT, USER, USERPROMPT, VOICEXML, WORKFLOW |
{: class="table table-striped"}

### Return type

[**DependencyObject**](DependencyObject.html)

<a name="getArchitectDependencytrackingType"></a>

# **getArchitectDependencytrackingType**

> [DependencyType](DependencyType.html) getArchitectDependencytrackingType(typeId)

Get a Dependency Tracking type.



Wraps GET /api/v2/architect/dependencytracking/types/{typeId}  

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
String typeId = "typeId_example"; // String | Type ID
try {
    DependencyType result = apiInstance.getArchitectDependencytrackingType(typeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectDependencytrackingType");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **typeId** | **String**| Type ID | |
{: class="table table-striped"}

### Return type

[**DependencyType**](DependencyType.html)

<a name="getArchitectDependencytrackingTypes"></a>

# **getArchitectDependencytrackingTypes**

> [DependencyTypeEntityListing](DependencyTypeEntityListing.html) getArchitectDependencytrackingTypes(pageNumber, pageSize)

Get Dependency Tracking types.



Wraps GET /api/v2/architect/dependencytracking/types  

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
try {
    DependencyTypeEntityListing result = apiInstance.getArchitectDependencytrackingTypes(pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectDependencytrackingTypes");
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

[**DependencyTypeEntityListing**](DependencyTypeEntityListing.html)

<a name="getArchitectDependencytrackingUpdatedresourceconsumers"></a>

# **getArchitectDependencytrackingUpdatedresourceconsumers**

> [DependencyObjectEntityListing](DependencyObjectEntityListing.html) getArchitectDependencytrackingUpdatedresourceconsumers(name, objectType, consumedResources, consumedResourceType, pageNumber, pageSize)

Get Dependency Tracking objects that depend on updated resources



Wraps GET /api/v2/architect/dependencytracking/updatedresourceconsumers  

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
String name = "name_example"; // String | Name to search for
List<String> objectType = Arrays.asList("objectType_example"); // List<String> | Object type(s) to search for
Boolean consumedResources = false; // Boolean | Return consumed resources?
List<String> consumedResourceType = Arrays.asList("consumedResourceType_example"); // List<String> | Resource type(s) to return
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
try {
    DependencyObjectEntityListing result = apiInstance.getArchitectDependencytrackingUpdatedresourceconsumers(name, objectType, consumedResources, consumedResourceType, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectDependencytrackingUpdatedresourceconsumers");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **name** | **String**| Name to search for | [optional] |
| **objectType** | [**List&lt;String&gt;**](String.html)| Object type(s) to search for | [optional]<br />**Values**: ACDLANGUAGE, ACDSKILL, ACDWRAPUPCODE, BRIDGEACTION, COMPOSERSCRIPT, CONTACTLIST, DATAACTION, EMAILROUTE, GROUP, INBOUNDCALLFLOW, INBOUNDEMAILFLOW, INBOUNDSHORTMESSAGEFLOW, INQUEUECALLFLOW, IVRCONFIGURATION, LANGUAGE, LEXBOT, LEXBOTALIAS, OUTBOUNDCALLFLOW, QUEUE, RESPONSE, SCHEDULE, SCHEDULEGROUP, SECUREACTION, SECURECALLFLOW, SURVEYINVITEFLOW, SYSTEMPROMPT, USER, USERPROMPT, VOICEXML, WORKFLOW |
| **consumedResources** | **Boolean**| Return consumed resources? | [optional] [default to false] |
| **consumedResourceType** | [**List&lt;String&gt;**](String.html)| Resource type(s) to return | [optional]<br />**Values**: ACDLANGUAGE, ACDSKILL, ACDWRAPUPCODE, BRIDGEACTION, COMPOSERSCRIPT, CONTACTLIST, DATAACTION, EMAILROUTE, GROUP, INBOUNDCALLFLOW, INBOUNDEMAILFLOW, INBOUNDSHORTMESSAGEFLOW, INQUEUECALLFLOW, IVRCONFIGURATION, LANGUAGE, LEXBOT, LEXBOTALIAS, OUTBOUNDCALLFLOW, QUEUE, RESPONSE, SCHEDULE, SCHEDULEGROUP, SECUREACTION, SECURECALLFLOW, SURVEYINVITEFLOW, SYSTEMPROMPT, USER, USERPROMPT, VOICEXML, WORKFLOW |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] |
{: class="table table-striped"}

### Return type

[**DependencyObjectEntityListing**](DependencyObjectEntityListing.html)

<a name="getArchitectIvr"></a>

# **getArchitectIvr**

> [IVR](IVR.html) getArchitectIvr(ivrId)

Get an IVR config.



Wraps GET /api/v2/architect/ivrs/{ivrId}  

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
String ivrId = "ivrId_example"; // String | IVR id
try {
    IVR result = apiInstance.getArchitectIvr(ivrId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectIvr");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ivrId** | **String**| IVR id | |
{: class="table table-striped"}

### Return type

[**IVR**](IVR.html)

<a name="getArchitectIvrs"></a>

# **getArchitectIvrs**

> [IVREntityListing](IVREntityListing.html) getArchitectIvrs(pageNumber, pageSize, sortBy, sortOrder, name)

Get IVR configs.



Wraps GET /api/v2/architect/ivrs  

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
String sortBy = "name"; // String | Sort by
String sortOrder = "ASC"; // String | Sort order
String name = "name_example"; // String | Name of the IVR to filter by.
try {
    IVREntityListing result = apiInstance.getArchitectIvrs(pageNumber, pageSize, sortBy, sortOrder, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectIvrs");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] |
| **sortBy** | **String**| Sort by | [optional] [default to name] |
| **sortOrder** | **String**| Sort order | [optional] [default to ASC] |
| **name** | **String**| Name of the IVR to filter by. | [optional] |
{: class="table table-striped"}

### Return type

[**IVREntityListing**](IVREntityListing.html)

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

<a name="getArchitectPromptHistoryHistoryId"></a>

# **getArchitectPromptHistoryHistoryId**

> [HistoryListing](HistoryListing.html) getArchitectPromptHistoryHistoryId(promptId, historyId, pageNumber, pageSize, sortOrder, sortBy, action)

Get generated prompt history



Wraps GET /api/v2/architect/prompts/{promptId}/history/{historyId}  

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
String historyId = "historyId_example"; // String | History request ID
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortOrder = "desc"; // String | Sort order
String sortBy = "timestamp"; // String | Sort by
List<String> action = Arrays.asList("action_example"); // List<String> | Flow actions to include (omit to include all)
try {
    HistoryListing result = apiInstance.getArchitectPromptHistoryHistoryId(promptId, historyId, pageNumber, pageSize, sortOrder, sortBy, action);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectPromptHistoryHistoryId");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **promptId** | **String**| Prompt ID | |
| **historyId** | **String**| History request ID | |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] |
| **sortOrder** | **String**| Sort order | [optional] [default to desc] |
| **sortBy** | **String**| Sort by | [optional] [default to timestamp]<br />**Values**: action, timestamp, user |
| **action** | [**List&lt;String&gt;**](String.html)| Flow actions to include (omit to include all) | [optional]<br />**Values**: checkin, checkout, create, deactivate, debug, delete, publish, revert, save |
{: class="table table-striped"}

### Return type

[**HistoryListing**](HistoryListing.html)

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

> [PromptEntityListing](PromptEntityListing.html) getArchitectPrompts(pageNumber, pageSize, name, description, nameOrDescription, sortBy, sortOrder)

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
String sortBy = "id"; // String | Sort by
String sortOrder = "asc"; // String | Sort order
try {
    PromptEntityListing result = apiInstance.getArchitectPrompts(pageNumber, pageSize, name, description, nameOrDescription, sortBy, sortOrder);
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
| **sortBy** | **String**| Sort by | [optional] [default to id] |
| **sortOrder** | **String**| Sort order | [optional] [default to asc] |
{: class="table table-striped"}

### Return type

[**PromptEntityListing**](PromptEntityListing.html)

<a name="getArchitectSchedule"></a>

# **getArchitectSchedule**

> [Schedule](Schedule.html) getArchitectSchedule(scheduleId)

Get a schedule by ID



Wraps GET /api/v2/architect/schedules/{scheduleId}  

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
String scheduleId = "scheduleId_example"; // String | Schedule ID
try {
    Schedule result = apiInstance.getArchitectSchedule(scheduleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectSchedule");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **scheduleId** | **String**| Schedule ID | |
{: class="table table-striped"}

### Return type

[**Schedule**](Schedule.html)

<a name="getArchitectSchedulegroup"></a>

# **getArchitectSchedulegroup**

> [ScheduleGroup](ScheduleGroup.html) getArchitectSchedulegroup(scheduleGroupId)

Gets a schedule group by ID



Wraps GET /api/v2/architect/schedulegroups/{scheduleGroupId}  

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
String scheduleGroupId = "scheduleGroupId_example"; // String | Schedule group ID
try {
    ScheduleGroup result = apiInstance.getArchitectSchedulegroup(scheduleGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectSchedulegroup");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **scheduleGroupId** | **String**| Schedule group ID | |
{: class="table table-striped"}

### Return type

[**ScheduleGroup**](ScheduleGroup.html)

<a name="getArchitectSchedulegroups"></a>

# **getArchitectSchedulegroups**

> [ScheduleGroupEntityListing](ScheduleGroupEntityListing.html) getArchitectSchedulegroups(pageNumber, pageSize, sortBy, sortOrder, name)

Get a list of schedule groups.



Wraps GET /api/v2/architect/schedulegroups  

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
String sortBy = "name"; // String | Sort by
String sortOrder = "ASC"; // String | Sort order
String name = "name_example"; // String | Name of the Schedule Group to filter by.
try {
    ScheduleGroupEntityListing result = apiInstance.getArchitectSchedulegroups(pageNumber, pageSize, sortBy, sortOrder, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectSchedulegroups");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] |
| **sortBy** | **String**| Sort by | [optional] [default to name] |
| **sortOrder** | **String**| Sort order | [optional] [default to ASC] |
| **name** | **String**| Name of the Schedule Group to filter by. | [optional] |
{: class="table table-striped"}

### Return type

[**ScheduleGroupEntityListing**](ScheduleGroupEntityListing.html)

<a name="getArchitectSchedules"></a>

# **getArchitectSchedules**

> [ScheduleEntityListing](ScheduleEntityListing.html) getArchitectSchedules(pageNumber, pageSize, sortBy, sortOrder, name)

Get a list of schedules.



Wraps GET /api/v2/architect/schedules  

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
String sortBy = "name"; // String | Sort by
String sortOrder = "ASC"; // String | Sort order
String name = "name_example"; // String | Name of the Schedule to filter by.
try {
    ScheduleEntityListing result = apiInstance.getArchitectSchedules(pageNumber, pageSize, sortBy, sortOrder, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectSchedules");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] |
| **sortBy** | **String**| Sort by | [optional] [default to name] |
| **sortOrder** | **String**| Sort order | [optional] [default to ASC] |
| **name** | **String**| Name of the Schedule to filter by. | [optional] |
{: class="table table-striped"}

### Return type

[**ScheduleEntityListing**](ScheduleEntityListing.html)

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

<a name="getArchitectSystempromptHistoryHistoryId"></a>

# **getArchitectSystempromptHistoryHistoryId**

> [HistoryListing](HistoryListing.html) getArchitectSystempromptHistoryHistoryId(promptId, historyId, pageNumber, pageSize, sortOrder, sortBy, action)

Get generated prompt history



Wraps GET /api/v2/architect/systemprompts/{promptId}/history/{historyId}  

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
String historyId = "historyId_example"; // String | History request ID
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortOrder = "desc"; // String | Sort order
String sortBy = "timestamp"; // String | Sort by
List<String> action = Arrays.asList("action_example"); // List<String> | Flow actions to include (omit to include all)
try {
    HistoryListing result = apiInstance.getArchitectSystempromptHistoryHistoryId(promptId, historyId, pageNumber, pageSize, sortOrder, sortBy, action);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectSystempromptHistoryHistoryId");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **promptId** | **String**| promptId | |
| **historyId** | **String**| History request ID | |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] |
| **sortOrder** | **String**| Sort order | [optional] [default to desc] |
| **sortBy** | **String**| Sort by | [optional] [default to timestamp]<br />**Values**: action, timestamp, user |
| **action** | [**List&lt;String&gt;**](String.html)| Flow actions to include (omit to include all) | [optional]<br />**Values**: checkin, checkout, create, deactivate, debug, delete, publish, revert, save |
{: class="table table-striped"}

### Return type

[**HistoryListing**](HistoryListing.html)

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

Get system prompt resources.



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

<a name="getFlow"></a>

# **getFlow**

> [Flow](Flow.html) getFlow(flowId, deleted)

Get flow



Wraps GET /api/v2/flows/{flowId}  

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
String flowId = "flowId_example"; // String | Flow ID
Boolean deleted = false; // Boolean | Include deleted flows
try {
    Flow result = apiInstance.getFlow(flowId, deleted);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlow");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **flowId** | **String**| Flow ID | |
| **deleted** | **Boolean**| Include deleted flows | [optional] [default to false] |
{: class="table table-striped"}

### Return type

[**Flow**](Flow.html)

<a name="getFlowHistoryHistoryId"></a>

# **getFlowHistoryHistoryId**

> [HistoryListing](HistoryListing.html) getFlowHistoryHistoryId(flowId, historyId, pageNumber, pageSize, sortOrder, sortBy, action)

Get generated flow history



Wraps GET /api/v2/flows/{flowId}/history/{historyId}  

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
String flowId = "flowId_example"; // String | Flow ID
String historyId = "historyId_example"; // String | History request ID
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortOrder = "desc"; // String | Sort order
String sortBy = "timestamp"; // String | Sort by
List<String> action = Arrays.asList("action_example"); // List<String> | Flow actions to include (omit to include all)
try {
    HistoryListing result = apiInstance.getFlowHistoryHistoryId(flowId, historyId, pageNumber, pageSize, sortOrder, sortBy, action);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowHistoryHistoryId");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **flowId** | **String**| Flow ID | |
| **historyId** | **String**| History request ID | |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] |
| **sortOrder** | **String**| Sort order | [optional] [default to desc] |
| **sortBy** | **String**| Sort by | [optional] [default to timestamp]<br />**Values**: action, timestamp, user |
| **action** | [**List&lt;String&gt;**](String.html)| Flow actions to include (omit to include all) | [optional]<br />**Values**: checkin, checkout, create, deactivate, debug, delete, publish, revert, save |
{: class="table table-striped"}

### Return type

[**HistoryListing**](HistoryListing.html)

<a name="getFlowLatestconfiguration"></a>

# **getFlowLatestconfiguration**

> Object getFlowLatestconfiguration(flowId, deleted)

Get the latest configuration for flow



Wraps GET /api/v2/flows/{flowId}/latestconfiguration  

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
String flowId = "flowId_example"; // String | Flow ID
Boolean deleted = false; // Boolean | Include deleted flows
try {
    Object result = apiInstance.getFlowLatestconfiguration(flowId, deleted);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowLatestconfiguration");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **flowId** | **String**| Flow ID | |
| **deleted** | **Boolean**| Include deleted flows | [optional] [default to false] |
{: class="table table-striped"}

### Return type

**Object**

<a name="getFlowVersion"></a>

# **getFlowVersion**

> [FlowVersion](FlowVersion.html) getFlowVersion(flowId, versionId, deleted)

Get flow version



Wraps GET /api/v2/flows/{flowId}/versions/{versionId}  

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
String flowId = "flowId_example"; // String | Flow ID
String versionId = "versionId_example"; // String | Version ID
String deleted = "deleted_example"; // String | Include deleted flows
try {
    FlowVersion result = apiInstance.getFlowVersion(flowId, versionId, deleted);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowVersion");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **flowId** | **String**| Flow ID | |
| **versionId** | **String**| Version ID | |
| **deleted** | **String**| Include deleted flows | [optional] |
{: class="table table-striped"}

### Return type

[**FlowVersion**](FlowVersion.html)

<a name="getFlowVersionConfiguration"></a>

# **getFlowVersionConfiguration**

> Object getFlowVersionConfiguration(flowId, versionId, deleted)

Create flow version configuration



Wraps GET /api/v2/flows/{flowId}/versions/{versionId}/configuration  

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
String flowId = "flowId_example"; // String | Flow ID
String versionId = "versionId_example"; // String | Version ID
String deleted = "deleted_example"; // String | Include deleted flows
try {
    Object result = apiInstance.getFlowVersionConfiguration(flowId, versionId, deleted);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowVersionConfiguration");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **flowId** | **String**| Flow ID | |
| **versionId** | **String**| Version ID | |
| **deleted** | **String**| Include deleted flows | [optional] |
{: class="table table-striped"}

### Return type

**Object**

<a name="getFlowVersions"></a>

# **getFlowVersions**

> [FlowVersionEntityListing](FlowVersionEntityListing.html) getFlowVersions(flowId, pageNumber, pageSize, deleted)

Get flow version list



Wraps GET /api/v2/flows/{flowId}/versions  

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
String flowId = "flowId_example"; // String | Flow ID
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
Boolean deleted = true; // Boolean | Include deleted flows
try {
    FlowVersionEntityListing result = apiInstance.getFlowVersions(flowId, pageNumber, pageSize, deleted);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowVersions");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **flowId** | **String**| Flow ID | |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] |
| **deleted** | **Boolean**| Include deleted flows | [optional] |
{: class="table table-striped"}

### Return type

[**FlowVersionEntityListing**](FlowVersionEntityListing.html)

<a name="getFlows"></a>

# **getFlows**

> [FlowEntityListing](FlowEntityListing.html) getFlows(type, pageNumber, pageSize, sortBy, sortOrder, id, name, description, nameOrDescription, publishVersionId, editableBy, lockedBy, secure, deleted, includeSchemas, publishedAfter, publishedBefore)

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
String publishedAfter = "2015-01-01T12:00:00-0600, 2015-01-01T18:00:00Z, 2015-01-01T12:00:00.000-0600, 2015-01-01T18:00:00.000Z, 2015-01-01"; // String | Published after
String publishedBefore = "2015-01-01T12:00:00-0600, 2015-01-01T18:00:00Z, 2015-01-01T12:00:00.000-0600, 2015-01-01T18:00:00.000Z, 2015-01-01"; // String | Published before
try {
    FlowEntityListing result = apiInstance.getFlows(type, pageNumber, pageSize, sortBy, sortOrder, id, name, description, nameOrDescription, publishVersionId, editableBy, lockedBy, secure, deleted, includeSchemas, publishedAfter, publishedBefore);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlows");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **type** | **String**| Type |<br />**Values**: inboundcall, inboundemail, inboundshortmessage, outboundcall, inqueuecall, speech, securecall, surveyinvite, workflow |
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
| **secure** | **String**| Secure | [optional]<br />**Values**: any, checkedin, published |
| **deleted** | **Boolean**| Include deleted | [optional] [default to false] |
| **includeSchemas** | **Boolean**| Include variable schemas | [optional] [default to false] |
| **publishedAfter** | **String**| Published after | [optional] |
| **publishedBefore** | **String**| Published before | [optional] |
{: class="table table-striped"}

### Return type

[**FlowEntityListing**](FlowEntityListing.html)

<a name="postArchitectDependencytrackingBuild"></a>

# **postArchitectDependencytrackingBuild**

> Void postArchitectDependencytrackingBuild()

Rebuild Dependency Tracking data for an organization

Asynchronous.  Notification topic: v2.architect.dependencytracking.build

Wraps POST /api/v2/architect/dependencytracking/build  

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
try {
    apiInstance.postArchitectDependencytrackingBuild();
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postArchitectDependencytrackingBuild");
    e.printStackTrace();
}
~~~

### Parameters

This endpoint does not require any parameters.
{: class="table table-striped"}

### Return type

null (empty response body)

<a name="postArchitectIvrs"></a>

# **postArchitectIvrs**

> [IVR](IVR.html) postArchitectIvrs(body)

Create IVR config.



Wraps POST /api/v2/architect/ivrs  

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
IVR body = new IVR(); // IVR | 
try {
    IVR result = apiInstance.postArchitectIvrs(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postArchitectIvrs");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**IVR**](IVR.html)|  | [optional] |
{: class="table table-striped"}

### Return type

[**IVR**](IVR.html)

<a name="postArchitectPromptHistory"></a>

# **postArchitectPromptHistory**

> [Operation](Operation.html) postArchitectPromptHistory(promptId)

Generate prompt history

Asynchronous.  Notification topic: v2.architect.prompts.{promptId}

Wraps POST /api/v2/architect/prompts/{promptId}/history  

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
    Operation result = apiInstance.postArchitectPromptHistory(promptId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postArchitectPromptHistory");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **promptId** | **String**| Prompt ID | |
{: class="table table-striped"}

### Return type

[**Operation**](Operation.html)

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

<a name="postArchitectSchedulegroups"></a>

# **postArchitectSchedulegroups**

> [ScheduleGroup](ScheduleGroup.html) postArchitectSchedulegroups(body)

Creates a new schedule group



Wraps POST /api/v2/architect/schedulegroups  

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
ScheduleGroup body = new ScheduleGroup(); // ScheduleGroup | 
try {
    ScheduleGroup result = apiInstance.postArchitectSchedulegroups(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postArchitectSchedulegroups");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**ScheduleGroup**](ScheduleGroup.html)|  | [optional] |
{: class="table table-striped"}

### Return type

[**ScheduleGroup**](ScheduleGroup.html)

<a name="postArchitectSchedules"></a>

# **postArchitectSchedules**

> [Schedule](Schedule.html) postArchitectSchedules(body)

Create a new schedule.



Wraps POST /api/v2/architect/schedules  

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
Schedule body = new Schedule(); // Schedule | 
try {
    Schedule result = apiInstance.postArchitectSchedules(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postArchitectSchedules");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**Schedule**](Schedule.html)|  | [optional] |
{: class="table table-striped"}

### Return type

[**Schedule**](Schedule.html)

<a name="postArchitectSystempromptHistory"></a>

# **postArchitectSystempromptHistory**

> [Operation](Operation.html) postArchitectSystempromptHistory(promptId)

Generate system prompt history

Asynchronous.  Notification topic: v2.architect.systemprompts.{systemPromptId}

Wraps POST /api/v2/architect/systemprompts/{promptId}/history  

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
    Operation result = apiInstance.postArchitectSystempromptHistory(promptId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postArchitectSystempromptHistory");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **promptId** | **String**| promptId | |
{: class="table table-striped"}

### Return type

[**Operation**](Operation.html)

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

<a name="postFlowVersions"></a>

# **postFlowVersions**

> [FlowVersion](FlowVersion.html) postFlowVersions(flowId, body)

Create flow version



Wraps POST /api/v2/flows/{flowId}/versions  

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
String flowId = "flowId_example"; // String | Flow ID
Object body = null; // Object | 
try {
    FlowVersion result = apiInstance.postFlowVersions(flowId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postFlowVersions");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **flowId** | **String**| Flow ID | |
| **body** | **Object**|  | [optional] |
{: class="table table-striped"}

### Return type

[**FlowVersion**](FlowVersion.html)

<a name="postFlows"></a>

# **postFlows**

> [Flow](Flow.html) postFlows(body)

Create flow



Wraps POST /api/v2/flows  

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
Flow body = new Flow(); // Flow | 
try {
    Flow result = apiInstance.postFlows(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postFlows");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**Flow**](Flow.html)|  | [optional] |
{: class="table table-striped"}

### Return type

[**Flow**](Flow.html)

<a name="postFlowsActionsCheckin"></a>

# **postFlowsActionsCheckin**

> [Flow](Flow.html) postFlowsActionsCheckin(flow)

Check-in flow

Asynchronous.  Notification topic: v2.flows.{flowId}

Wraps POST /api/v2/flows/actions/checkin  

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
String flow = "flow_example"; // String | Flow ID
try {
    Flow result = apiInstance.postFlowsActionsCheckin(flow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postFlowsActionsCheckin");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **flow** | **String**| Flow ID | |
{: class="table table-striped"}

### Return type

[**Flow**](Flow.html)

<a name="postFlowsActionsCheckout"></a>

# **postFlowsActionsCheckout**

> [Flow](Flow.html) postFlowsActionsCheckout(flow)

Check-out flow



Wraps POST /api/v2/flows/actions/checkout  

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
String flow = "flow_example"; // String | Flow ID
try {
    Flow result = apiInstance.postFlowsActionsCheckout(flow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postFlowsActionsCheckout");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **flow** | **String**| Flow ID | |
{: class="table table-striped"}

### Return type

[**Flow**](Flow.html)

<a name="postFlowsActionsDeactivate"></a>

# **postFlowsActionsDeactivate**

> [Flow](Flow.html) postFlowsActionsDeactivate(flow)

Deactivate flow



Wraps POST /api/v2/flows/actions/deactivate  

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
String flow = "flow_example"; // String | Flow ID
try {
    Flow result = apiInstance.postFlowsActionsDeactivate(flow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postFlowsActionsDeactivate");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **flow** | **String**| Flow ID | |
{: class="table table-striped"}

### Return type

[**Flow**](Flow.html)

<a name="postFlowsActionsPublish"></a>

# **postFlowsActionsPublish**

> [Operation](Operation.html) postFlowsActionsPublish(flow, version)

Publish flow

Asynchronous.  Notification topic: v2.flows.{flowId}

Wraps POST /api/v2/flows/actions/publish  

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
String flow = "flow_example"; // String | Flow ID
String version = "version_example"; // String | version
try {
    Operation result = apiInstance.postFlowsActionsPublish(flow, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postFlowsActionsPublish");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **flow** | **String**| Flow ID | |
| **version** | **String**| version | [optional] |
{: class="table table-striped"}

### Return type

[**Operation**](Operation.html)

<a name="postFlowsActionsRevert"></a>

# **postFlowsActionsRevert**

> [Flow](Flow.html) postFlowsActionsRevert(flow)

Revert flow



Wraps POST /api/v2/flows/actions/revert  

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
String flow = "flow_example"; // String | Flow ID
try {
    Flow result = apiInstance.postFlowsActionsRevert(flow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postFlowsActionsRevert");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **flow** | **String**| Flow ID | |
{: class="table table-striped"}

### Return type

[**Flow**](Flow.html)

<a name="postFlowsActionsUnlock"></a>

# **postFlowsActionsUnlock**

> [Flow](Flow.html) postFlowsActionsUnlock(flow)

Unlock flow

Allows for unlocking a flow in the case where there is no flow configuration available, and thus a check-in will not unlock the flow. The user must have Architect Admin permissions to perform this action.

Wraps POST /api/v2/flows/actions/unlock  

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
String flow = "flow_example"; // String | Flow ID
try {
    Flow result = apiInstance.postFlowsActionsUnlock(flow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postFlowsActionsUnlock");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **flow** | **String**| Flow ID | |
{: class="table table-striped"}

### Return type

[**Flow**](Flow.html)

<a name="putArchitectIvr"></a>

# **putArchitectIvr**

> [IVR](IVR.html) putArchitectIvr(ivrId, body)

Update an IVR Config.



Wraps PUT /api/v2/architect/ivrs/{ivrId}  

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
String ivrId = "ivrId_example"; // String | IVR id
IVR body = new IVR(); // IVR | 
try {
    IVR result = apiInstance.putArchitectIvr(ivrId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#putArchitectIvr");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ivrId** | **String**| IVR id | |
| **body** | [**IVR**](IVR.html)|  | [optional] |
{: class="table table-striped"}

### Return type

[**IVR**](IVR.html)

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

<a name="putArchitectSchedule"></a>

# **putArchitectSchedule**

> [Schedule](Schedule.html) putArchitectSchedule(scheduleId, body)

Update schedule by ID



Wraps PUT /api/v2/architect/schedules/{scheduleId}  

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
String scheduleId = "scheduleId_example"; // String | Schedule ID
Schedule body = new Schedule(); // Schedule | 
try {
    Schedule result = apiInstance.putArchitectSchedule(scheduleId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#putArchitectSchedule");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **scheduleId** | **String**| Schedule ID | |
| **body** | [**Schedule**](Schedule.html)|  | [optional] |
{: class="table table-striped"}

### Return type

[**Schedule**](Schedule.html)

<a name="putArchitectSchedulegroup"></a>

# **putArchitectSchedulegroup**

> [ScheduleGroup](ScheduleGroup.html) putArchitectSchedulegroup(scheduleGroupId, body)

Updates a schedule group by ID



Wraps PUT /api/v2/architect/schedulegroups/{scheduleGroupId}  

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
String scheduleGroupId = "scheduleGroupId_example"; // String | Schedule group ID
ScheduleGroup body = new ScheduleGroup(); // ScheduleGroup | 
try {
    ScheduleGroup result = apiInstance.putArchitectSchedulegroup(scheduleGroupId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#putArchitectSchedulegroup");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **scheduleGroupId** | **String**| Schedule group ID | |
| **body** | [**ScheduleGroup**](ScheduleGroup.html)|  | [optional] |
{: class="table table-striped"}

### Return type

[**ScheduleGroup**](ScheduleGroup.html)

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

<a name="putFlow"></a>

# **putFlow**

> [Flow](Flow.html) putFlow(flowId, body)

Update flow



Wraps PUT /api/v2/flows/{flowId}  

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
String flowId = "flowId_example"; // String | Flow ID
Flow body = new Flow(); // Flow | 
try {
    Flow result = apiInstance.putFlow(flowId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#putFlow");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **flowId** | **String**| Flow ID | |
| **body** | [**Flow**](Flow.html)|  | [optional] |
{: class="table table-striped"}

### Return type

[**Flow**](Flow.html)

