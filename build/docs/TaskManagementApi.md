---
title: TaskManagementApi
---
## TaskManagementApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteTaskmanagementWorkbin**](TaskManagementApi.html#deleteTaskmanagementWorkbin) | Delete a workbin |
| [**deleteTaskmanagementWorkitem**](TaskManagementApi.html#deleteTaskmanagementWorkitem) | Delete a workitem |
| [**deleteTaskmanagementWorkitemsSchema**](TaskManagementApi.html#deleteTaskmanagementWorkitemsSchema) | Delete a schema |
| [**deleteTaskmanagementWorktype**](TaskManagementApi.html#deleteTaskmanagementWorktype) | Delete a worktype |
| [**deleteTaskmanagementWorktypeStatus**](TaskManagementApi.html#deleteTaskmanagementWorktypeStatus) | Delete a status |
| [**getTaskmanagementWorkbin**](TaskManagementApi.html#getTaskmanagementWorkbin) | Get a workbin |
| [**getTaskmanagementWorkbinHistory**](TaskManagementApi.html#getTaskmanagementWorkbinHistory) | Get a listing of a workbin's attribute change history |
| [**getTaskmanagementWorkbinVersion**](TaskManagementApi.html#getTaskmanagementWorkbinVersion) | Get a version of a workbin |
| [**getTaskmanagementWorkbinVersions**](TaskManagementApi.html#getTaskmanagementWorkbinVersions) | Get all versions of a workbin |
| [**getTaskmanagementWorkitem**](TaskManagementApi.html#getTaskmanagementWorkitem) | Get a workitem |
| [**getTaskmanagementWorkitemHistory**](TaskManagementApi.html#getTaskmanagementWorkitemHistory) | Get a listing of a workitem's attribute change history |
| [**getTaskmanagementWorkitemUserWrapups**](TaskManagementApi.html#getTaskmanagementWorkitemUserWrapups) | Get all wrapup codes added for the given user for a workitem. |
| [**getTaskmanagementWorkitemVersion**](TaskManagementApi.html#getTaskmanagementWorkitemVersion) | Get a version of a workitem |
| [**getTaskmanagementWorkitemVersions**](TaskManagementApi.html#getTaskmanagementWorkitemVersions) | Get all versions of a workitem |
| [**getTaskmanagementWorkitemWrapups**](TaskManagementApi.html#getTaskmanagementWorkitemWrapups) | Get all wrapup codes added for all users for a workitem. |
| [**getTaskmanagementWorkitemsQueryJob**](TaskManagementApi.html#getTaskmanagementWorkitemsQueryJob) | Get the workitem query job associated with the job id. |
| [**getTaskmanagementWorkitemsQueryJobResults**](TaskManagementApi.html#getTaskmanagementWorkitemsQueryJobResults) | Get results from for workitem query job  |
| [**getTaskmanagementWorkitemsSchema**](TaskManagementApi.html#getTaskmanagementWorkitemsSchema) | Get a schema |
| [**getTaskmanagementWorkitemsSchemaVersion**](TaskManagementApi.html#getTaskmanagementWorkitemsSchemaVersion) | Get a specific version of a schema |
| [**getTaskmanagementWorkitemsSchemaVersions**](TaskManagementApi.html#getTaskmanagementWorkitemsSchemaVersions) | Get all versions of a schema |
| [**getTaskmanagementWorkitemsSchemas**](TaskManagementApi.html#getTaskmanagementWorkitemsSchemas) | Get a list of schemas. |
| [**getTaskmanagementWorktype**](TaskManagementApi.html#getTaskmanagementWorktype) | Get a worktype |
| [**getTaskmanagementWorktypeHistory**](TaskManagementApi.html#getTaskmanagementWorktypeHistory) | Get a listing of a worktype's attribute change history |
| [**getTaskmanagementWorktypeStatus**](TaskManagementApi.html#getTaskmanagementWorktypeStatus) | Get a status |
| [**getTaskmanagementWorktypeStatuses**](TaskManagementApi.html#getTaskmanagementWorktypeStatuses) | Get list of statuses for this worktype. |
| [**getTaskmanagementWorktypeVersion**](TaskManagementApi.html#getTaskmanagementWorktypeVersion) | Get a version of a worktype |
| [**getTaskmanagementWorktypeVersions**](TaskManagementApi.html#getTaskmanagementWorktypeVersions) | Get all versions of a worktype |
| [**patchTaskmanagementWorkbin**](TaskManagementApi.html#patchTaskmanagementWorkbin) | Update the attributes of a workbin |
| [**patchTaskmanagementWorkitem**](TaskManagementApi.html#patchTaskmanagementWorkitem) | Update the attributes of a workitem |
| [**patchTaskmanagementWorkitemAssignment**](TaskManagementApi.html#patchTaskmanagementWorkitemAssignment) | Attempts to manually assign a specified workitem to a specified user.  Ignores bullseye ring, PAR score, skills, and languages. |
| [**patchTaskmanagementWorkitemUserWrapups**](TaskManagementApi.html#patchTaskmanagementWorkitemUserWrapups) | Add/Remove a wrapup code for a given user in a workitem. |
| [**patchTaskmanagementWorkitemUsersMeWrapups**](TaskManagementApi.html#patchTaskmanagementWorkitemUsersMeWrapups) | Add/Remove a wrapup code for the current user in a workitem. |
| [**patchTaskmanagementWorktype**](TaskManagementApi.html#patchTaskmanagementWorktype) | Update the attributes of a worktype |
| [**patchTaskmanagementWorktypeStatus**](TaskManagementApi.html#patchTaskmanagementWorktypeStatus) | Update the attributes of a status |
| [**postTaskmanagementWorkbins**](TaskManagementApi.html#postTaskmanagementWorkbins) | Create a workbin |
| [**postTaskmanagementWorkbinsQuery**](TaskManagementApi.html#postTaskmanagementWorkbinsQuery) | Query for workbins |
| [**postTaskmanagementWorkitemAcdCancel**](TaskManagementApi.html#postTaskmanagementWorkitemAcdCancel) | Cancel the assignment process for a workitem that is currently queued for assignment through ACD. |
| [**postTaskmanagementWorkitemDisconnect**](TaskManagementApi.html#postTaskmanagementWorkitemDisconnect) | Disconnect the assignee of the workitem |
| [**postTaskmanagementWorkitemTerminate**](TaskManagementApi.html#postTaskmanagementWorkitemTerminate) | Terminate a workitem |
| [**postTaskmanagementWorkitems**](TaskManagementApi.html#postTaskmanagementWorkitems) | Create a workitem |
| [**postTaskmanagementWorkitemsQuery**](TaskManagementApi.html#postTaskmanagementWorkitemsQuery) | Query for workitems |
| [**postTaskmanagementWorkitemsQueryJobs**](TaskManagementApi.html#postTaskmanagementWorkitemsQueryJobs) | Create a workitem query job |
| [**postTaskmanagementWorkitemsSchemas**](TaskManagementApi.html#postTaskmanagementWorkitemsSchemas) | Create a schema |
| [**postTaskmanagementWorktypeStatuses**](TaskManagementApi.html#postTaskmanagementWorktypeStatuses) | Add a status to a worktype |
| [**postTaskmanagementWorktypes**](TaskManagementApi.html#postTaskmanagementWorktypes) | Create a worktype |
| [**postTaskmanagementWorktypesQuery**](TaskManagementApi.html#postTaskmanagementWorktypesQuery) | Query for worktypes |
| [**putTaskmanagementWorkitemsSchema**](TaskManagementApi.html#putTaskmanagementWorkitemsSchema) | Update a schema |
{: class="table-striped"}

<a name="deleteTaskmanagementWorkbin"></a>

# **deleteTaskmanagementWorkbin**



> Void deleteTaskmanagementWorkbin(workbinId)

Delete a workbin

deleteTaskmanagementWorkbin is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps DELETE /api/v2/taskmanagement/workbins/{workbinId}  

Requires ANY permissions: 

* workitems:workbin:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TaskManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TaskManagementApi apiInstance = new TaskManagementApi();
String workbinId = "workbinId_example"; // String | Workbin ID
try {
    apiInstance.deleteTaskmanagementWorkbin(workbinId);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskManagementApi#deleteTaskmanagementWorkbin");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **workbinId** | **String**| Workbin ID | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteTaskmanagementWorkitem"></a>

# **deleteTaskmanagementWorkitem**



> Void deleteTaskmanagementWorkitem(workitemId)

Delete a workitem

deleteTaskmanagementWorkitem is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps DELETE /api/v2/taskmanagement/workitems/{workitemId}  

Requires ANY permissions: 

* workitems:workitem:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TaskManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TaskManagementApi apiInstance = new TaskManagementApi();
String workitemId = "workitemId_example"; // String | Workitem ID
try {
    apiInstance.deleteTaskmanagementWorkitem(workitemId);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskManagementApi#deleteTaskmanagementWorkitem");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **workitemId** | **String**| Workitem ID | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteTaskmanagementWorkitemsSchema"></a>

# **deleteTaskmanagementWorkitemsSchema**



> Void deleteTaskmanagementWorkitemsSchema(schemaId)

Delete a schema

deleteTaskmanagementWorkitemsSchema is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps DELETE /api/v2/taskmanagement/workitems/schemas/{schemaId}  

Requires ANY permissions: 

* workitems:workitemSchema:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TaskManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TaskManagementApi apiInstance = new TaskManagementApi();
String schemaId = "schemaId_example"; // String | Schema ID
try {
    apiInstance.deleteTaskmanagementWorkitemsSchema(schemaId);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskManagementApi#deleteTaskmanagementWorkitemsSchema");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **schemaId** | **String**| Schema ID | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteTaskmanagementWorktype"></a>

# **deleteTaskmanagementWorktype**



> Void deleteTaskmanagementWorktype(worktypeId)

Delete a worktype

deleteTaskmanagementWorktype is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps DELETE /api/v2/taskmanagement/worktypes/{worktypeId}  

Requires ANY permissions: 

* workitems:worktype:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TaskManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TaskManagementApi apiInstance = new TaskManagementApi();
String worktypeId = "worktypeId_example"; // String | Worktype id
try {
    apiInstance.deleteTaskmanagementWorktype(worktypeId);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskManagementApi#deleteTaskmanagementWorktype");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **worktypeId** | **String**| Worktype id | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteTaskmanagementWorktypeStatus"></a>

# **deleteTaskmanagementWorktypeStatus**



> Void deleteTaskmanagementWorktypeStatus(worktypeId, statusId)

Delete a status

deleteTaskmanagementWorktypeStatus is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps DELETE /api/v2/taskmanagement/worktypes/{worktypeId}/statuses/{statusId}  

Requires ANY permissions: 

* workitems:status:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TaskManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TaskManagementApi apiInstance = new TaskManagementApi();
String worktypeId = "worktypeId_example"; // String | Worktype id
String statusId = "statusId_example"; // String | Status id
try {
    apiInstance.deleteTaskmanagementWorktypeStatus(worktypeId, statusId);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskManagementApi#deleteTaskmanagementWorktypeStatus");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **worktypeId** | **String**| Worktype id | 
| **statusId** | **String**| Status id | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="getTaskmanagementWorkbin"></a>

# **getTaskmanagementWorkbin**



> [Workbin](Workbin.html) getTaskmanagementWorkbin(workbinId)

Get a workbin

getTaskmanagementWorkbin is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/taskmanagement/workbins/{workbinId}  

Requires ANY permissions: 

* workitems:workbin:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TaskManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TaskManagementApi apiInstance = new TaskManagementApi();
String workbinId = "workbinId_example"; // String | Workbin ID
try {
    Workbin result = apiInstance.getTaskmanagementWorkbin(workbinId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskManagementApi#getTaskmanagementWorkbin");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **workbinId** | **String**| Workbin ID | 
{: class="table-striped"}


### Return type

[**Workbin**](Workbin.html)

<a name="getTaskmanagementWorkbinHistory"></a>

# **getTaskmanagementWorkbinHistory**



> [WorkbinChangeListing](WorkbinChangeListing.html) getTaskmanagementWorkbinHistory(workbinId, after, pageSize, sortOrder)

Get a listing of a workbin's attribute change history

getTaskmanagementWorkbinHistory is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/taskmanagement/workbins/{workbinId}/history  

Requires ANY permissions: 

* workitems:workbin:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TaskManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TaskManagementApi apiInstance = new TaskManagementApi();
String workbinId = "workbinId_example"; // String | Workbin ID
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned.
Integer pageSize = 25; // Integer | Limit the number of entities to return. It is not guaranteed that the requested number of entities will be filled in a single request. If an `after` key is returned as part of the response it is possible that more entities that match the filter criteria exist. Maximum of 200.
String sortOrder = "descending"; // String | Ascending or descending sort order
try {
    WorkbinChangeListing result = apiInstance.getTaskmanagementWorkbinHistory(workbinId, after, pageSize, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskManagementApi#getTaskmanagementWorkbinHistory");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **workbinId** | **String**| Workbin ID | 
| **after** | **String**| The cursor that points to the end of the set of entities that has been returned. | [optional] 
| **pageSize** | **Integer**| Limit the number of entities to return. It is not guaranteed that the requested number of entities will be filled in a single request. If an &#x60;after&#x60; key is returned as part of the response it is possible that more entities that match the filter criteria exist. Maximum of 200. | [optional] [default to 25] 
| **sortOrder** | **String**| Ascending or descending sort order | [optional] [default to descending]<br />**Values**: ascending, descending 
{: class="table-striped"}


### Return type

[**WorkbinChangeListing**](WorkbinChangeListing.html)

<a name="getTaskmanagementWorkbinVersion"></a>

# **getTaskmanagementWorkbinVersion**



> [WorkbinVersion](WorkbinVersion.html) getTaskmanagementWorkbinVersion(workbinId, entityVersion)

Get a version of a workbin

getTaskmanagementWorkbinVersion is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/taskmanagement/workbins/{workbinId}/versions/{entityVersion}  

Requires ANY permissions: 

* workitems:workbin:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TaskManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TaskManagementApi apiInstance = new TaskManagementApi();
String workbinId = "workbinId_example"; // String | Workbin ID
Integer entityVersion = 56; // Integer | Workbin version
try {
    WorkbinVersion result = apiInstance.getTaskmanagementWorkbinVersion(workbinId, entityVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskManagementApi#getTaskmanagementWorkbinVersion");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **workbinId** | **String**| Workbin ID | 
| **entityVersion** | **Integer**| Workbin version | 
{: class="table-striped"}


### Return type

[**WorkbinVersion**](WorkbinVersion.html)

<a name="getTaskmanagementWorkbinVersions"></a>

# **getTaskmanagementWorkbinVersions**



> [WorkbinVersionListing](WorkbinVersionListing.html) getTaskmanagementWorkbinVersions(workbinId, after, pageSize, sortOrder)

Get all versions of a workbin

getTaskmanagementWorkbinVersions is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/taskmanagement/workbins/{workbinId}/versions  

Requires ANY permissions: 

* workitems:workbin:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TaskManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TaskManagementApi apiInstance = new TaskManagementApi();
String workbinId = "workbinId_example"; // String | Workbin ID
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned.
Integer pageSize = 25; // Integer | Limit the number of entities to return. It is not guaranteed that the requested number of entities will be filled in a single request. If an `after` key is returned as part of the response it is possible that more entities that match the filter criteria exist. Maximum of 200.
String sortOrder = "descending"; // String | Ascending or descending sort order
try {
    WorkbinVersionListing result = apiInstance.getTaskmanagementWorkbinVersions(workbinId, after, pageSize, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskManagementApi#getTaskmanagementWorkbinVersions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **workbinId** | **String**| Workbin ID | 
| **after** | **String**| The cursor that points to the end of the set of entities that has been returned. | [optional] 
| **pageSize** | **Integer**| Limit the number of entities to return. It is not guaranteed that the requested number of entities will be filled in a single request. If an &#x60;after&#x60; key is returned as part of the response it is possible that more entities that match the filter criteria exist. Maximum of 200. | [optional] [default to 25] 
| **sortOrder** | **String**| Ascending or descending sort order | [optional] [default to descending]<br />**Values**: ascending, descending 
{: class="table-striped"}


### Return type

[**WorkbinVersionListing**](WorkbinVersionListing.html)

<a name="getTaskmanagementWorkitem"></a>

# **getTaskmanagementWorkitem**



> [Workitem](Workitem.html) getTaskmanagementWorkitem(workitemId, expands)

Get a workitem

getTaskmanagementWorkitem is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/taskmanagement/workitems/{workitemId}  

Requires ANY permissions: 

* workitems:workitem:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TaskManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TaskManagementApi apiInstance = new TaskManagementApi();
String workitemId = "workitemId_example"; // String | Workitem ID
String expands = "expands_example"; // String | Which fields to expand. Comma separated if more than one.
try {
    Workitem result = apiInstance.getTaskmanagementWorkitem(workitemId, expands);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskManagementApi#getTaskmanagementWorkitem");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **workitemId** | **String**| Workitem ID | 
| **expands** | **String**| Which fields to expand. Comma separated if more than one. | [optional]<br />**Values**: type, workbin, status, queue, assignee 
{: class="table-striped"}


### Return type

[**Workitem**](Workitem.html)

<a name="getTaskmanagementWorkitemHistory"></a>

# **getTaskmanagementWorkitemHistory**



> [WorkitemChangeListing](WorkitemChangeListing.html) getTaskmanagementWorkitemHistory(workitemId, after, pageSize, sortOrder)

Get a listing of a workitem's attribute change history

getTaskmanagementWorkitemHistory is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/taskmanagement/workitems/{workitemId}/history  

Requires ANY permissions: 

* workitems:workitem:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TaskManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TaskManagementApi apiInstance = new TaskManagementApi();
String workitemId = "workitemId_example"; // String | Workitem ID
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned.
Integer pageSize = 25; // Integer | Limit the number of entities to return. It is not guaranteed that the requested number of entities will be filled in a single request. If an `after` key is returned as part of the response it is possible that more entities that match the filter criteria exist. Maximum of 200.
String sortOrder = "descending"; // String | Ascending or descending sort order
try {
    WorkitemChangeListing result = apiInstance.getTaskmanagementWorkitemHistory(workitemId, after, pageSize, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskManagementApi#getTaskmanagementWorkitemHistory");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **workitemId** | **String**| Workitem ID | 
| **after** | **String**| The cursor that points to the end of the set of entities that has been returned. | [optional] 
| **pageSize** | **Integer**| Limit the number of entities to return. It is not guaranteed that the requested number of entities will be filled in a single request. If an &#x60;after&#x60; key is returned as part of the response it is possible that more entities that match the filter criteria exist. Maximum of 200. | [optional] [default to 25] 
| **sortOrder** | **String**| Ascending or descending sort order | [optional] [default to descending]<br />**Values**: ascending, descending 
{: class="table-striped"}


### Return type

[**WorkitemChangeListing**](WorkitemChangeListing.html)

<a name="getTaskmanagementWorkitemUserWrapups"></a>

# **getTaskmanagementWorkitemUserWrapups**



> [WorkitemWrapup](WorkitemWrapup.html) getTaskmanagementWorkitemUserWrapups(workitemId, userId, expands, after, pageSize, sortOrder)

Get all wrapup codes added for the given user for a workitem.

getTaskmanagementWorkitemUserWrapups is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/taskmanagement/workitems/{workitemId}/users/{userId}/wrapups  

Requires ANY permissions: 

* workitems:wrapup:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TaskManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TaskManagementApi apiInstance = new TaskManagementApi();
String workitemId = "workitemId_example"; // String | The ID of the Workitem.
String userId = "userId_example"; // String | The ID of the user
String expands = "expands_example"; // String | Which fields, if any, to expand.
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned.
Integer pageSize = 25; // Integer | Limit the number of entities to return. It is not guaranteed that the requested number of entities will be filled in a single request. If an `after` key is returned as part of the response it is possible that more entities that match the filter criteria exist. Maximum of 50.
String sortOrder = "descending"; // String | Ascending or descending sort order
try {
    WorkitemWrapup result = apiInstance.getTaskmanagementWorkitemUserWrapups(workitemId, userId, expands, after, pageSize, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskManagementApi#getTaskmanagementWorkitemUserWrapups");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **workitemId** | **String**| The ID of the Workitem. | 
| **userId** | **String**| The ID of the user | 
| **expands** | **String**| Which fields, if any, to expand. | [optional]<br />**Values**: wrapupCode 
| **after** | **String**| The cursor that points to the end of the set of entities that has been returned. | [optional] 
| **pageSize** | **Integer**| Limit the number of entities to return. It is not guaranteed that the requested number of entities will be filled in a single request. If an &#x60;after&#x60; key is returned as part of the response it is possible that more entities that match the filter criteria exist. Maximum of 50. | [optional] [default to 25] 
| **sortOrder** | **String**| Ascending or descending sort order | [optional] [default to descending]<br />**Values**: ascending, descending 
{: class="table-striped"}


### Return type

[**WorkitemWrapup**](WorkitemWrapup.html)

<a name="getTaskmanagementWorkitemVersion"></a>

# **getTaskmanagementWorkitemVersion**



> [WorkitemVersion](WorkitemVersion.html) getTaskmanagementWorkitemVersion(workitemId, entityVersion)

Get a version of a workitem

getTaskmanagementWorkitemVersion is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/taskmanagement/workitems/{workitemId}/versions/{entityVersion}  

Requires ANY permissions: 

* workitems:workitem:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TaskManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TaskManagementApi apiInstance = new TaskManagementApi();
String workitemId = "workitemId_example"; // String | Workitem ID
Integer entityVersion = 56; // Integer | Workitem version
try {
    WorkitemVersion result = apiInstance.getTaskmanagementWorkitemVersion(workitemId, entityVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskManagementApi#getTaskmanagementWorkitemVersion");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **workitemId** | **String**| Workitem ID | 
| **entityVersion** | **Integer**| Workitem version | 
{: class="table-striped"}


### Return type

[**WorkitemVersion**](WorkitemVersion.html)

<a name="getTaskmanagementWorkitemVersions"></a>

# **getTaskmanagementWorkitemVersions**



> [WorkitemVersionListing](WorkitemVersionListing.html) getTaskmanagementWorkitemVersions(workitemId, after, pageSize, sortOrder)

Get all versions of a workitem

getTaskmanagementWorkitemVersions is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/taskmanagement/workitems/{workitemId}/versions  

Requires ANY permissions: 

* workitems:workitem:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TaskManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TaskManagementApi apiInstance = new TaskManagementApi();
String workitemId = "workitemId_example"; // String | Workitem ID
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned.
Integer pageSize = 25; // Integer | Limit the number of entities to return. It is not guaranteed that the requested number of entities will be filled in a single request. If an `after` key is returned as part of the response it is possible that more entities that match the filter criteria exist. Maximum of 200.
String sortOrder = "descending"; // String | Ascending or descending sort order
try {
    WorkitemVersionListing result = apiInstance.getTaskmanagementWorkitemVersions(workitemId, after, pageSize, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskManagementApi#getTaskmanagementWorkitemVersions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **workitemId** | **String**| Workitem ID | 
| **after** | **String**| The cursor that points to the end of the set of entities that has been returned. | [optional] 
| **pageSize** | **Integer**| Limit the number of entities to return. It is not guaranteed that the requested number of entities will be filled in a single request. If an &#x60;after&#x60; key is returned as part of the response it is possible that more entities that match the filter criteria exist. Maximum of 200. | [optional] [default to 25] 
| **sortOrder** | **String**| Ascending or descending sort order | [optional] [default to descending]<br />**Values**: ascending, descending 
{: class="table-striped"}


### Return type

[**WorkitemVersionListing**](WorkitemVersionListing.html)

<a name="getTaskmanagementWorkitemWrapups"></a>

# **getTaskmanagementWorkitemWrapups**



> [WorkitemWrapupEntityListing](WorkitemWrapupEntityListing.html) getTaskmanagementWorkitemWrapups(workitemId, expands, after, pageSize, sortOrder)

Get all wrapup codes added for all users for a workitem.

getTaskmanagementWorkitemWrapups is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/taskmanagement/workitems/{workitemId}/wrapups  

Requires ANY permissions: 

* workitems:wrapup:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TaskManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TaskManagementApi apiInstance = new TaskManagementApi();
String workitemId = "workitemId_example"; // String | The ID of the Workitem.
String expands = "expands_example"; // String | Which fields, if any, to expand.
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned.
Integer pageSize = 25; // Integer | Limit the number of entities to return. It is not guaranteed that the requested number of entities will be filled in a single request. If an `after` key is returned as part of the response it is possible that more entities that match the filter criteria exist. Maximum of 50.
String sortOrder = "descending"; // String | Ascending or descending sort order
try {
    WorkitemWrapupEntityListing result = apiInstance.getTaskmanagementWorkitemWrapups(workitemId, expands, after, pageSize, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskManagementApi#getTaskmanagementWorkitemWrapups");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **workitemId** | **String**| The ID of the Workitem. | 
| **expands** | **String**| Which fields, if any, to expand. | [optional]<br />**Values**: wrapupCode 
| **after** | **String**| The cursor that points to the end of the set of entities that has been returned. | [optional] 
| **pageSize** | **Integer**| Limit the number of entities to return. It is not guaranteed that the requested number of entities will be filled in a single request. If an &#x60;after&#x60; key is returned as part of the response it is possible that more entities that match the filter criteria exist. Maximum of 50. | [optional] [default to 25] 
| **sortOrder** | **String**| Ascending or descending sort order | [optional] [default to descending]<br />**Values**: ascending, descending 
{: class="table-striped"}


### Return type

[**WorkitemWrapupEntityListing**](WorkitemWrapupEntityListing.html)

<a name="getTaskmanagementWorkitemsQueryJob"></a>

# **getTaskmanagementWorkitemsQueryJob**



> [WorkitemQueryJobResponse](WorkitemQueryJobResponse.html) getTaskmanagementWorkitemsQueryJob(jobId)

Get the workitem query job associated with the job id.

getTaskmanagementWorkitemsQueryJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/taskmanagement/workitems/query/jobs/{jobId}  

Requires ALL permissions: 

* workitems:queryJob:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TaskManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TaskManagementApi apiInstance = new TaskManagementApi();
String jobId = "jobId_example"; // String | jobId
try {
    WorkitemQueryJobResponse result = apiInstance.getTaskmanagementWorkitemsQueryJob(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskManagementApi#getTaskmanagementWorkitemsQueryJob");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobId** | **String**| jobId | 
{: class="table-striped"}


### Return type

[**WorkitemQueryJobResponse**](WorkitemQueryJobResponse.html)

<a name="getTaskmanagementWorkitemsQueryJobResults"></a>

# **getTaskmanagementWorkitemsQueryJobResults**



> [WorkitemPagedEntityListing](WorkitemPagedEntityListing.html) getTaskmanagementWorkitemsQueryJobResults(jobId)

Get results from for workitem query job 

getTaskmanagementWorkitemsQueryJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/taskmanagement/workitems/query/jobs/{jobId}/results  

Requires ALL permissions: 

* workitems:queryJobResults:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TaskManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TaskManagementApi apiInstance = new TaskManagementApi();
String jobId = "jobId_example"; // String | jobId
try {
    WorkitemPagedEntityListing result = apiInstance.getTaskmanagementWorkitemsQueryJobResults(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskManagementApi#getTaskmanagementWorkitemsQueryJobResults");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobId** | **String**| jobId | 
{: class="table-striped"}


### Return type

[**WorkitemPagedEntityListing**](WorkitemPagedEntityListing.html)

<a name="getTaskmanagementWorkitemsSchema"></a>

# **getTaskmanagementWorkitemsSchema**



> [DataSchema](DataSchema.html) getTaskmanagementWorkitemsSchema(schemaId)

Get a schema

getTaskmanagementWorkitemsSchema is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/taskmanagement/workitems/schemas/{schemaId}  

Requires ANY permissions: 

* workitems:workitemSchema:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TaskManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TaskManagementApi apiInstance = new TaskManagementApi();
String schemaId = "schemaId_example"; // String | Schema ID
try {
    DataSchema result = apiInstance.getTaskmanagementWorkitemsSchema(schemaId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskManagementApi#getTaskmanagementWorkitemsSchema");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **schemaId** | **String**| Schema ID | 
{: class="table-striped"}


### Return type

[**DataSchema**](DataSchema.html)

<a name="getTaskmanagementWorkitemsSchemaVersion"></a>

# **getTaskmanagementWorkitemsSchemaVersion**



> [DataSchema](DataSchema.html) getTaskmanagementWorkitemsSchemaVersion(schemaId, versionId)

Get a specific version of a schema

getTaskmanagementWorkitemsSchemaVersion is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/taskmanagement/workitems/schemas/{schemaId}/versions/{versionId}  

Requires ANY permissions: 

* workitems:workitemSchema:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TaskManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TaskManagementApi apiInstance = new TaskManagementApi();
String schemaId = "schemaId_example"; // String | Schema ID
String versionId = "versionId_example"; // String | Schema version
try {
    DataSchema result = apiInstance.getTaskmanagementWorkitemsSchemaVersion(schemaId, versionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskManagementApi#getTaskmanagementWorkitemsSchemaVersion");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **schemaId** | **String**| Schema ID | 
| **versionId** | **String**| Schema version | 
{: class="table-striped"}


### Return type

[**DataSchema**](DataSchema.html)

<a name="getTaskmanagementWorkitemsSchemaVersions"></a>

# **getTaskmanagementWorkitemsSchemaVersions**



> [DataSchema](DataSchema.html) getTaskmanagementWorkitemsSchemaVersions(schemaId)

Get all versions of a schema

getTaskmanagementWorkitemsSchemaVersions is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/taskmanagement/workitems/schemas/{schemaId}/versions  

Requires ANY permissions: 

* workitems:workitemSchema:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TaskManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TaskManagementApi apiInstance = new TaskManagementApi();
String schemaId = "schemaId_example"; // String | Schema ID
try {
    DataSchema result = apiInstance.getTaskmanagementWorkitemsSchemaVersions(schemaId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskManagementApi#getTaskmanagementWorkitemsSchemaVersions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **schemaId** | **String**| Schema ID | 
{: class="table-striped"}


### Return type

[**DataSchema**](DataSchema.html)

<a name="getTaskmanagementWorkitemsSchemas"></a>

# **getTaskmanagementWorkitemsSchemas**



> [DataSchemaListing](DataSchemaListing.html) getTaskmanagementWorkitemsSchemas()

Get a list of schemas.

getTaskmanagementWorkitemsSchemas is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/taskmanagement/workitems/schemas  

Requires ANY permissions: 

* workitems:workitemSchema:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TaskManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TaskManagementApi apiInstance = new TaskManagementApi();
try {
    DataSchemaListing result = apiInstance.getTaskmanagementWorkitemsSchemas();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskManagementApi#getTaskmanagementWorkitemsSchemas");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**DataSchemaListing**](DataSchemaListing.html)

<a name="getTaskmanagementWorktype"></a>

# **getTaskmanagementWorktype**



> [Worktype](Worktype.html) getTaskmanagementWorktype(worktypeId, expands)

Get a worktype

getTaskmanagementWorktype is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/taskmanagement/worktypes/{worktypeId}  

Requires ANY permissions: 

* workitems:worktype:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TaskManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TaskManagementApi apiInstance = new TaskManagementApi();
String worktypeId = "worktypeId_example"; // String | Worktype id
List<String> expands = Arrays.asList(null); // List<String> | Which fields, if any, to expand.
try {
    Worktype result = apiInstance.getTaskmanagementWorktype(worktypeId, expands);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskManagementApi#getTaskmanagementWorktype");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **worktypeId** | **String**| Worktype id | 
| **expands** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand. | [optional]<br />**Values**: defaultQueue, defaultSkills, defaultLanguage, schema 
{: class="table-striped"}


### Return type

[**Worktype**](Worktype.html)

<a name="getTaskmanagementWorktypeHistory"></a>

# **getTaskmanagementWorktypeHistory**



> [WorktypeChangeListing](WorktypeChangeListing.html) getTaskmanagementWorktypeHistory(worktypeId, after, pageSize, sortOrder)

Get a listing of a worktype's attribute change history

getTaskmanagementWorktypeHistory is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/taskmanagement/worktypes/{worktypeId}/history  

Requires ANY permissions: 

* workitems:worktype:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TaskManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TaskManagementApi apiInstance = new TaskManagementApi();
String worktypeId = "worktypeId_example"; // String | Worktype id
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned.
Integer pageSize = 25; // Integer | Limit the number of entities to return. It is not guaranteed that the requested number of entities will be filled in a single request. If an `after` key is returned as part of the response it is possible that more entities that match the filter criteria exist. Maximum of 200.
String sortOrder = "descending"; // String | Ascending or descending sort order
try {
    WorktypeChangeListing result = apiInstance.getTaskmanagementWorktypeHistory(worktypeId, after, pageSize, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskManagementApi#getTaskmanagementWorktypeHistory");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **worktypeId** | **String**| Worktype id | 
| **after** | **String**| The cursor that points to the end of the set of entities that has been returned. | [optional] 
| **pageSize** | **Integer**| Limit the number of entities to return. It is not guaranteed that the requested number of entities will be filled in a single request. If an &#x60;after&#x60; key is returned as part of the response it is possible that more entities that match the filter criteria exist. Maximum of 200. | [optional] [default to 25] 
| **sortOrder** | **String**| Ascending or descending sort order | [optional] [default to descending]<br />**Values**: ascending, descending 
{: class="table-striped"}


### Return type

[**WorktypeChangeListing**](WorktypeChangeListing.html)

<a name="getTaskmanagementWorktypeStatus"></a>

# **getTaskmanagementWorktypeStatus**



> [WorkitemStatus](WorkitemStatus.html) getTaskmanagementWorktypeStatus(worktypeId, statusId)

Get a status

getTaskmanagementWorktypeStatus is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/taskmanagement/worktypes/{worktypeId}/statuses/{statusId}  

Requires ANY permissions: 

* workitems:status:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TaskManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TaskManagementApi apiInstance = new TaskManagementApi();
String worktypeId = "worktypeId_example"; // String | Worktype id
String statusId = "statusId_example"; // String | Status id
try {
    WorkitemStatus result = apiInstance.getTaskmanagementWorktypeStatus(worktypeId, statusId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskManagementApi#getTaskmanagementWorktypeStatus");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **worktypeId** | **String**| Worktype id | 
| **statusId** | **String**| Status id | 
{: class="table-striped"}


### Return type

[**WorkitemStatus**](WorkitemStatus.html)

<a name="getTaskmanagementWorktypeStatuses"></a>

# **getTaskmanagementWorktypeStatuses**



> [WorkitemStatusListing](WorkitemStatusListing.html) getTaskmanagementWorktypeStatuses(worktypeId)

Get list of statuses for this worktype.

getTaskmanagementWorktypeStatuses is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/taskmanagement/worktypes/{worktypeId}/statuses  

Requires ANY permissions: 

* workitems:status:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TaskManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TaskManagementApi apiInstance = new TaskManagementApi();
String worktypeId = "worktypeId_example"; // String | Worktype id
try {
    WorkitemStatusListing result = apiInstance.getTaskmanagementWorktypeStatuses(worktypeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskManagementApi#getTaskmanagementWorktypeStatuses");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **worktypeId** | **String**| Worktype id | 
{: class="table-striped"}


### Return type

[**WorkitemStatusListing**](WorkitemStatusListing.html)

<a name="getTaskmanagementWorktypeVersion"></a>

# **getTaskmanagementWorktypeVersion**



> [WorktypeVersion](WorktypeVersion.html) getTaskmanagementWorktypeVersion(worktypeId, entityVersion)

Get a version of a worktype

getTaskmanagementWorktypeVersion is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/taskmanagement/worktypes/{worktypeId}/versions/{entityVersion}  

Requires ANY permissions: 

* workitems:worktype:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TaskManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TaskManagementApi apiInstance = new TaskManagementApi();
String worktypeId = "worktypeId_example"; // String | Worktype id
Integer entityVersion = 56; // Integer | Worktype version
try {
    WorktypeVersion result = apiInstance.getTaskmanagementWorktypeVersion(worktypeId, entityVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskManagementApi#getTaskmanagementWorktypeVersion");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **worktypeId** | **String**| Worktype id | 
| **entityVersion** | **Integer**| Worktype version | 
{: class="table-striped"}


### Return type

[**WorktypeVersion**](WorktypeVersion.html)

<a name="getTaskmanagementWorktypeVersions"></a>

# **getTaskmanagementWorktypeVersions**



> [WorktypeVersionListing](WorktypeVersionListing.html) getTaskmanagementWorktypeVersions(worktypeId, after, pageSize, sortOrder)

Get all versions of a worktype

getTaskmanagementWorktypeVersions is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/taskmanagement/worktypes/{worktypeId}/versions  

Requires ANY permissions: 

* workitems:worktype:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TaskManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TaskManagementApi apiInstance = new TaskManagementApi();
String worktypeId = "worktypeId_example"; // String | Worktype id
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned.
Integer pageSize = 25; // Integer | Limit the number of entities to return. It is not guaranteed that the requested number of entities will be filled in a single request. If an `after` key is returned as part of the response it is possible that more entities that match the filter criteria exist. Maximum of 200.
String sortOrder = "descending"; // String | Ascending or descending sort order
try {
    WorktypeVersionListing result = apiInstance.getTaskmanagementWorktypeVersions(worktypeId, after, pageSize, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskManagementApi#getTaskmanagementWorktypeVersions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **worktypeId** | **String**| Worktype id | 
| **after** | **String**| The cursor that points to the end of the set of entities that has been returned. | [optional] 
| **pageSize** | **Integer**| Limit the number of entities to return. It is not guaranteed that the requested number of entities will be filled in a single request. If an &#x60;after&#x60; key is returned as part of the response it is possible that more entities that match the filter criteria exist. Maximum of 200. | [optional] [default to 25] 
| **sortOrder** | **String**| Ascending or descending sort order | [optional] [default to descending]<br />**Values**: ascending, descending 
{: class="table-striped"}


### Return type

[**WorktypeVersionListing**](WorktypeVersionListing.html)

<a name="patchTaskmanagementWorkbin"></a>

# **patchTaskmanagementWorkbin**



> [Workbin](Workbin.html) patchTaskmanagementWorkbin(workbinId, body)

Update the attributes of a workbin

patchTaskmanagementWorkbin is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps PATCH /api/v2/taskmanagement/workbins/{workbinId}  

Requires ANY permissions: 

* workitems:workbin:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TaskManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TaskManagementApi apiInstance = new TaskManagementApi();
String workbinId = "workbinId_example"; // String | Workbin ID
WorkbinUpdate body = new WorkbinUpdate(); // WorkbinUpdate | Json with attributes and their new values: {\"description\":\"new description\", \"name\":\"new name\"}.
try {
    Workbin result = apiInstance.patchTaskmanagementWorkbin(workbinId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskManagementApi#patchTaskmanagementWorkbin");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **workbinId** | **String**| Workbin ID | 
| **body** | [**WorkbinUpdate**](WorkbinUpdate.html)| Json with attributes and their new values: {\&quot;description\&quot;:\&quot;new description\&quot;, \&quot;name\&quot;:\&quot;new name\&quot;}. | 
{: class="table-striped"}


### Return type

[**Workbin**](Workbin.html)

<a name="patchTaskmanagementWorkitem"></a>

# **patchTaskmanagementWorkitem**



> [Workitem](Workitem.html) patchTaskmanagementWorkitem(workitemId, body)

Update the attributes of a workitem

patchTaskmanagementWorkitem is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps PATCH /api/v2/taskmanagement/workitems/{workitemId}  

Requires ANY permissions: 

* workitems:workitem:edit
* workitems:workitem:accept

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TaskManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TaskManagementApi apiInstance = new TaskManagementApi();
String workitemId = "workitemId_example"; // String | Workitem ID
WorkitemUpdate body = new WorkitemUpdate(); // WorkitemUpdate | Workitem
try {
    Workitem result = apiInstance.patchTaskmanagementWorkitem(workitemId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskManagementApi#patchTaskmanagementWorkitem");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **workitemId** | **String**| Workitem ID | 
| **body** | [**WorkitemUpdate**](WorkitemUpdate.html)| Workitem | 
{: class="table-striped"}


### Return type

[**Workitem**](Workitem.html)

<a name="patchTaskmanagementWorkitemAssignment"></a>

# **patchTaskmanagementWorkitemAssignment**



> Void patchTaskmanagementWorkitemAssignment(workitemId, body)

Attempts to manually assign a specified workitem to a specified user.  Ignores bullseye ring, PAR score, skills, and languages.

patchTaskmanagementWorkitemAssignment is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps PATCH /api/v2/taskmanagement/workitems/{workitemId}/assignment  

Requires ANY permissions: 

* workitems:workitem:pull
* workitems:workitem:assign

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TaskManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TaskManagementApi apiInstance = new TaskManagementApi();
String workitemId = "workitemId_example"; // String | Workitem ID
WorkitemManualAssign body = new WorkitemManualAssign(); // WorkitemManualAssign | Targeted user
try {
    apiInstance.patchTaskmanagementWorkitemAssignment(workitemId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskManagementApi#patchTaskmanagementWorkitemAssignment");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **workitemId** | **String**| Workitem ID | 
| **body** | [**WorkitemManualAssign**](WorkitemManualAssign.html)| Targeted user | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="patchTaskmanagementWorkitemUserWrapups"></a>

# **patchTaskmanagementWorkitemUserWrapups**



> [WorkitemWrapup](WorkitemWrapup.html) patchTaskmanagementWorkitemUserWrapups(workitemId, userId, body)

Add/Remove a wrapup code for a given user in a workitem.

patchTaskmanagementWorkitemUserWrapups is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps PATCH /api/v2/taskmanagement/workitems/{workitemId}/users/{userId}/wrapups  

Requires ANY permissions: 

* workitems:wrapup:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TaskManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TaskManagementApi apiInstance = new TaskManagementApi();
String workitemId = "workitemId_example"; // String | The ID of the Workitem.
String userId = "userId_example"; // String | The ID of the user
WorkitemWrapupUpdate body = new WorkitemWrapupUpdate(); // WorkitemWrapupUpdate | Request body to add/remove a wrapup code for a workitem
try {
    WorkitemWrapup result = apiInstance.patchTaskmanagementWorkitemUserWrapups(workitemId, userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskManagementApi#patchTaskmanagementWorkitemUserWrapups");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **workitemId** | **String**| The ID of the Workitem. | 
| **userId** | **String**| The ID of the user | 
| **body** | [**WorkitemWrapupUpdate**](WorkitemWrapupUpdate.html)| Request body to add/remove a wrapup code for a workitem | 
{: class="table-striped"}


### Return type

[**WorkitemWrapup**](WorkitemWrapup.html)

<a name="patchTaskmanagementWorkitemUsersMeWrapups"></a>

# **patchTaskmanagementWorkitemUsersMeWrapups**



> [WorkitemWrapup](WorkitemWrapup.html) patchTaskmanagementWorkitemUsersMeWrapups(workitemId, body)

Add/Remove a wrapup code for the current user in a workitem.

patchTaskmanagementWorkitemUsersMeWrapups is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps PATCH /api/v2/taskmanagement/workitems/{workitemId}/users/me/wrapups  

Requires ANY permissions: 

* workitems:wrapupSelf:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TaskManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TaskManagementApi apiInstance = new TaskManagementApi();
String workitemId = "workitemId_example"; // String | The ID of the Workitem.
WorkitemWrapupUpdate body = new WorkitemWrapupUpdate(); // WorkitemWrapupUpdate | Request body to add/remove the wrapup code for workitem
try {
    WorkitemWrapup result = apiInstance.patchTaskmanagementWorkitemUsersMeWrapups(workitemId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskManagementApi#patchTaskmanagementWorkitemUsersMeWrapups");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **workitemId** | **String**| The ID of the Workitem. | 
| **body** | [**WorkitemWrapupUpdate**](WorkitemWrapupUpdate.html)| Request body to add/remove the wrapup code for workitem | 
{: class="table-striped"}


### Return type

[**WorkitemWrapup**](WorkitemWrapup.html)

<a name="patchTaskmanagementWorktype"></a>

# **patchTaskmanagementWorktype**



> [Worktype](Worktype.html) patchTaskmanagementWorktype(worktypeId, body)

Update the attributes of a worktype

patchTaskmanagementWorktype is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps PATCH /api/v2/taskmanagement/worktypes/{worktypeId}  

Requires ALL permissions: 

* workitems:worktype:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TaskManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TaskManagementApi apiInstance = new TaskManagementApi();
String worktypeId = "worktypeId_example"; // String | Worktype id
WorktypeUpdate body = new WorktypeUpdate(); // WorktypeUpdate | body
try {
    Worktype result = apiInstance.patchTaskmanagementWorktype(worktypeId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskManagementApi#patchTaskmanagementWorktype");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **worktypeId** | **String**| Worktype id | 
| **body** | [**WorktypeUpdate**](WorktypeUpdate.html)| body | [optional] 
{: class="table-striped"}


### Return type

[**Worktype**](Worktype.html)

<a name="patchTaskmanagementWorktypeStatus"></a>

# **patchTaskmanagementWorktypeStatus**



> [WorkitemStatus](WorkitemStatus.html) patchTaskmanagementWorktypeStatus(worktypeId, statusId, body)

Update the attributes of a status

patchTaskmanagementWorktypeStatus is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps PATCH /api/v2/taskmanagement/worktypes/{worktypeId}/statuses/{statusId}  

Requires ANY permissions: 

* workitems:status:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TaskManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TaskManagementApi apiInstance = new TaskManagementApi();
String worktypeId = "worktypeId_example"; // String | Worktype id
String statusId = "statusId_example"; // String | Status id
WorkitemStatusUpdate body = new WorkitemStatusUpdate(); // WorkitemStatusUpdate | body
try {
    WorkitemStatus result = apiInstance.patchTaskmanagementWorktypeStatus(worktypeId, statusId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskManagementApi#patchTaskmanagementWorktypeStatus");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **worktypeId** | **String**| Worktype id | 
| **statusId** | **String**| Status id | 
| **body** | [**WorkitemStatusUpdate**](WorkitemStatusUpdate.html)| body | [optional] 
{: class="table-striped"}


### Return type

[**WorkitemStatus**](WorkitemStatus.html)

<a name="postTaskmanagementWorkbins"></a>

# **postTaskmanagementWorkbins**



> [Workbin](Workbin.html) postTaskmanagementWorkbins(body)

Create a workbin

postTaskmanagementWorkbins is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/taskmanagement/workbins  

Requires ANY permissions: 

* workitems:workbin:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TaskManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TaskManagementApi apiInstance = new TaskManagementApi();
WorkbinCreate body = new WorkbinCreate(); // WorkbinCreate | body
try {
    Workbin result = apiInstance.postTaskmanagementWorkbins(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskManagementApi#postTaskmanagementWorkbins");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**WorkbinCreate**](WorkbinCreate.html)| body | [optional] 
{: class="table-striped"}


### Return type

[**Workbin**](Workbin.html)

<a name="postTaskmanagementWorkbinsQuery"></a>

# **postTaskmanagementWorkbinsQuery**



> [WorkbinQueryEntityListing](WorkbinQueryEntityListing.html) postTaskmanagementWorkbinsQuery(body)

Query for workbins

postTaskmanagementWorkbinsQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/taskmanagement/workbins/query  

Requires ALL permissions: 

* workitems:workbin:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TaskManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TaskManagementApi apiInstance = new TaskManagementApi();
WorkbinQueryRequest body = new WorkbinQueryRequest(); // WorkbinQueryRequest | QueryPostRequest
try {
    WorkbinQueryEntityListing result = apiInstance.postTaskmanagementWorkbinsQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskManagementApi#postTaskmanagementWorkbinsQuery");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**WorkbinQueryRequest**](WorkbinQueryRequest.html)| QueryPostRequest | 
{: class="table-striped"}


### Return type

[**WorkbinQueryEntityListing**](WorkbinQueryEntityListing.html)

<a name="postTaskmanagementWorkitemAcdCancel"></a>

# **postTaskmanagementWorkitemAcdCancel**



> [Workitem](Workitem.html) postTaskmanagementWorkitemAcdCancel(workitemId)

Cancel the assignment process for a workitem that is currently queued for assignment through ACD.

postTaskmanagementWorkitemAcdCancel is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/taskmanagement/workitems/{workitemId}/acd/cancel  

Requires ANY permissions: 

* workitems:workitem:cancelRouting

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TaskManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TaskManagementApi apiInstance = new TaskManagementApi();
String workitemId = "workitemId_example"; // String | Workitem ID
try {
    Workitem result = apiInstance.postTaskmanagementWorkitemAcdCancel(workitemId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskManagementApi#postTaskmanagementWorkitemAcdCancel");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **workitemId** | **String**| Workitem ID | 
{: class="table-striped"}


### Return type

[**Workitem**](Workitem.html)

<a name="postTaskmanagementWorkitemDisconnect"></a>

# **postTaskmanagementWorkitemDisconnect**



> [Workitem](Workitem.html) postTaskmanagementWorkitemDisconnect(workitemId)

Disconnect the assignee of the workitem

postTaskmanagementWorkitemDisconnect is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/taskmanagement/workitems/{workitemId}/disconnect  

Requires ANY permissions: 

* workitems:workitem:disconnect

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TaskManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TaskManagementApi apiInstance = new TaskManagementApi();
String workitemId = "workitemId_example"; // String | Workitem ID
try {
    Workitem result = apiInstance.postTaskmanagementWorkitemDisconnect(workitemId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskManagementApi#postTaskmanagementWorkitemDisconnect");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **workitemId** | **String**| Workitem ID | 
{: class="table-striped"}


### Return type

[**Workitem**](Workitem.html)

<a name="postTaskmanagementWorkitemTerminate"></a>

# **postTaskmanagementWorkitemTerminate**



> [Workitem](Workitem.html) postTaskmanagementWorkitemTerminate(workitemId, body)

Terminate a workitem

postTaskmanagementWorkitemTerminate is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/taskmanagement/workitems/{workitemId}/terminate  

Requires ANY permissions: 

* workitems:workitem:terminate

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TaskManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TaskManagementApi apiInstance = new TaskManagementApi();
String workitemId = "workitemId_example"; // String | Workitem ID
WorkitemTerminate body = new WorkitemTerminate(); // WorkitemTerminate | Terminated request
try {
    Workitem result = apiInstance.postTaskmanagementWorkitemTerminate(workitemId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskManagementApi#postTaskmanagementWorkitemTerminate");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **workitemId** | **String**| Workitem ID | 
| **body** | [**WorkitemTerminate**](WorkitemTerminate.html)| Terminated request | [optional] 
{: class="table-striped"}


### Return type

[**Workitem**](Workitem.html)

<a name="postTaskmanagementWorkitems"></a>

# **postTaskmanagementWorkitems**



> [Workitem](Workitem.html) postTaskmanagementWorkitems(body)

Create a workitem

postTaskmanagementWorkitems is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/taskmanagement/workitems  

Requires ANY permissions: 

* workitems:workitem:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TaskManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TaskManagementApi apiInstance = new TaskManagementApi();
WorkitemCreate body = new WorkitemCreate(); // WorkitemCreate | Workitem
try {
    Workitem result = apiInstance.postTaskmanagementWorkitems(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskManagementApi#postTaskmanagementWorkitems");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**WorkitemCreate**](WorkitemCreate.html)| Workitem | 
{: class="table-striped"}


### Return type

[**Workitem**](Workitem.html)

<a name="postTaskmanagementWorkitemsQuery"></a>

# **postTaskmanagementWorkitemsQuery**



> [WorkitemPostQueryEntityListing](WorkitemPostQueryEntityListing.html) postTaskmanagementWorkitemsQuery(body)

Query for workitems

This query requires at least one EQ filter on the workbinId, assigneeId or typeId attributes.

postTaskmanagementWorkitemsQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/taskmanagement/workitems/query  

Requires ANY permissions: 

* workitems:workitem:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TaskManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TaskManagementApi apiInstance = new TaskManagementApi();
WorkitemQueryPostRequest body = new WorkitemQueryPostRequest(); // WorkitemQueryPostRequest | WorkitemQueryPostRequest
try {
    WorkitemPostQueryEntityListing result = apiInstance.postTaskmanagementWorkitemsQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskManagementApi#postTaskmanagementWorkitemsQuery");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**WorkitemQueryPostRequest**](WorkitemQueryPostRequest.html)| WorkitemQueryPostRequest | 
{: class="table-striped"}


### Return type

[**WorkitemPostQueryEntityListing**](WorkitemPostQueryEntityListing.html)

<a name="postTaskmanagementWorkitemsQueryJobs"></a>

# **postTaskmanagementWorkitemsQueryJobs**



> [WorkitemQueryJobResponse](WorkitemQueryJobResponse.html) postTaskmanagementWorkitemsQueryJobs(body)

Create a workitem query job

postTaskmanagementWorkitemsQueryJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/taskmanagement/workitems/query/jobs  

Requires ANY permissions: 

* workitems:queryJob:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TaskManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TaskManagementApi apiInstance = new TaskManagementApi();
WorkitemQueryJobCreate body = new WorkitemQueryJobCreate(); // WorkitemQueryJobCreate | WorkitemQueryJobCreate
try {
    WorkitemQueryJobResponse result = apiInstance.postTaskmanagementWorkitemsQueryJobs(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskManagementApi#postTaskmanagementWorkitemsQueryJobs");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**WorkitemQueryJobCreate**](WorkitemQueryJobCreate.html)| WorkitemQueryJobCreate | 
{: class="table-striped"}


### Return type

[**WorkitemQueryJobResponse**](WorkitemQueryJobResponse.html)

<a name="postTaskmanagementWorkitemsSchemas"></a>

# **postTaskmanagementWorkitemsSchemas**



> [DataSchema](DataSchema.html) postTaskmanagementWorkitemsSchemas(body)

Create a schema

postTaskmanagementWorkitemsSchemas is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/taskmanagement/workitems/schemas  

Requires ANY permissions: 

* workitems:workitemSchema:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TaskManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TaskManagementApi apiInstance = new TaskManagementApi();
DataSchema body = new DataSchema(); // DataSchema | Schema
try {
    DataSchema result = apiInstance.postTaskmanagementWorkitemsSchemas(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskManagementApi#postTaskmanagementWorkitemsSchemas");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**DataSchema**](DataSchema.html)| Schema | 
{: class="table-striped"}


### Return type

[**DataSchema**](DataSchema.html)

<a name="postTaskmanagementWorktypeStatuses"></a>

# **postTaskmanagementWorktypeStatuses**



> [WorkitemStatus](WorkitemStatus.html) postTaskmanagementWorktypeStatuses(worktypeId, body)

Add a status to a worktype

postTaskmanagementWorktypeStatuses is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/taskmanagement/worktypes/{worktypeId}/statuses  

Requires ANY permissions: 

* workitems:status:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TaskManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TaskManagementApi apiInstance = new TaskManagementApi();
String worktypeId = "worktypeId_example"; // String | Worktype id
WorkitemStatusCreate body = new WorkitemStatusCreate(); // WorkitemStatusCreate | body
try {
    WorkitemStatus result = apiInstance.postTaskmanagementWorktypeStatuses(worktypeId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskManagementApi#postTaskmanagementWorktypeStatuses");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **worktypeId** | **String**| Worktype id | 
| **body** | [**WorkitemStatusCreate**](WorkitemStatusCreate.html)| body | [optional] 
{: class="table-striped"}


### Return type

[**WorkitemStatus**](WorkitemStatus.html)

<a name="postTaskmanagementWorktypes"></a>

# **postTaskmanagementWorktypes**



> [Worktype](Worktype.html) postTaskmanagementWorktypes(body)

Create a worktype

postTaskmanagementWorktypes is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/taskmanagement/worktypes  

Requires ANY permissions: 

* workitems:worktype:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TaskManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TaskManagementApi apiInstance = new TaskManagementApi();
WorktypeCreate body = new WorktypeCreate(); // WorktypeCreate | body
try {
    Worktype result = apiInstance.postTaskmanagementWorktypes(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskManagementApi#postTaskmanagementWorktypes");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**WorktypeCreate**](WorktypeCreate.html)| body | [optional] 
{: class="table-striped"}


### Return type

[**Worktype**](Worktype.html)

<a name="postTaskmanagementWorktypesQuery"></a>

# **postTaskmanagementWorktypesQuery**



> [WorktypeQueryEntityListing](WorktypeQueryEntityListing.html) postTaskmanagementWorktypesQuery(body)

Query for worktypes

postTaskmanagementWorktypesQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/taskmanagement/worktypes/query  

Requires ALL permissions: 

* workitems:worktype:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TaskManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TaskManagementApi apiInstance = new TaskManagementApi();
WorktypeQueryRequest body = new WorktypeQueryRequest(); // WorktypeQueryRequest | QueryPostRequest
try {
    WorktypeQueryEntityListing result = apiInstance.postTaskmanagementWorktypesQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskManagementApi#postTaskmanagementWorktypesQuery");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**WorktypeQueryRequest**](WorktypeQueryRequest.html)| QueryPostRequest | 
{: class="table-striped"}


### Return type

[**WorktypeQueryEntityListing**](WorktypeQueryEntityListing.html)

<a name="putTaskmanagementWorkitemsSchema"></a>

# **putTaskmanagementWorkitemsSchema**



> [DataSchema](DataSchema.html) putTaskmanagementWorkitemsSchema(schemaId, body)

Update a schema

putTaskmanagementWorkitemsSchema is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps PUT /api/v2/taskmanagement/workitems/schemas/{schemaId}  

Requires ANY permissions: 

* workitems:workitemSchema:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TaskManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TaskManagementApi apiInstance = new TaskManagementApi();
String schemaId = "schemaId_example"; // String | Schema ID
DataSchema body = new DataSchema(); // DataSchema | Data Schema
try {
    DataSchema result = apiInstance.putTaskmanagementWorkitemsSchema(schemaId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskManagementApi#putTaskmanagementWorkitemsSchema");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **schemaId** | **String**| Schema ID | 
| **body** | [**DataSchema**](DataSchema.html)| Data Schema | 
{: class="table-striped"}


### Return type

[**DataSchema**](DataSchema.html)

