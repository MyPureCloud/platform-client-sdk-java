---
title: ObjectsApi
---
## ObjectsApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteAuthorizationDivision**](ObjectsApi.html#deleteAuthorizationDivision) | Delete a division. |
| [**getAuthorizationDivision**](ObjectsApi.html#getAuthorizationDivision) | Returns an authorization division. |
| [**getAuthorizationDivisions**](ObjectsApi.html#getAuthorizationDivisions) | Retrieve a list of all divisions defined for the organization |
| [**getAuthorizationDivisionsHome**](ObjectsApi.html#getAuthorizationDivisionsHome) | Retrieve the home division for the organization. |
| [**getAuthorizationDivisionsLimit**](ObjectsApi.html#getAuthorizationDivisionsLimit) | Returns the maximum allowed number of divisions. |
| [**postAuthorizationDivisionObject**](ObjectsApi.html#postAuthorizationDivisionObject) | Assign a list of objects to a division |
| [**postAuthorizationDivisionRestore**](ObjectsApi.html#postAuthorizationDivisionRestore) | Recreate a previously deleted division. |
| [**postAuthorizationDivisions**](ObjectsApi.html#postAuthorizationDivisions) | Create a division. |
| [**putAuthorizationDivision**](ObjectsApi.html#putAuthorizationDivision) | Update a division. |
{: class="table-striped"}

<a name="deleteAuthorizationDivision"></a>

# **deleteAuthorizationDivision**



> Void deleteAuthorizationDivision(divisionId, force)

Delete a division.

Wraps DELETE /api/v2/authorization/divisions/{divisionId}  

Requires ANY permissions: 

* authorization:division:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ObjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ObjectsApi apiInstance = new ObjectsApi();
String divisionId = "divisionId_example"; // String | Division ID
Boolean force = false; // Boolean | Force delete this division as well as the grants and objects associated with it
try {
    apiInstance.deleteAuthorizationDivision(divisionId, force);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectsApi#deleteAuthorizationDivision");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **divisionId** | **String**| Division ID | 
| **force** | **Boolean**| Force delete this division as well as the grants and objects associated with it | [optional] [default to false] 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="getAuthorizationDivision"></a>

# **getAuthorizationDivision**



> [AuthzDivision](AuthzDivision.html) getAuthorizationDivision(divisionId, objectCount)

Returns an authorization division.

Wraps GET /api/v2/authorization/divisions/{divisionId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ObjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ObjectsApi apiInstance = new ObjectsApi();
String divisionId = "divisionId_example"; // String | Division ID
Boolean objectCount = false; // Boolean | Get count of objects in this division, grouped by type
try {
    AuthzDivision result = apiInstance.getAuthorizationDivision(divisionId, objectCount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectsApi#getAuthorizationDivision");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **divisionId** | **String**| Division ID | 
| **objectCount** | **Boolean**| Get count of objects in this division, grouped by type | [optional] [default to false]<br />**Values**: true, false 
{: class="table-striped"}


### Return type

[**AuthzDivision**](AuthzDivision.html)

<a name="getAuthorizationDivisions"></a>

# **getAuthorizationDivisions**



> [AuthzDivisionEntityListing](AuthzDivisionEntityListing.html) getAuthorizationDivisions(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, objectCount, id, name)

Retrieve a list of all divisions defined for the organization

Request specific divisions by id using a query param \"id\", e.g.  ?id=5f777167-63be-4c24-ad41-374155d9e28b&id=72e9fb25-c484-488d-9312-7acba82435b3

Wraps GET /api/v2/authorization/divisions  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ObjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ObjectsApi apiInstance = new ObjectsApi();
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<String> expand = Arrays.asList(null); // List<String> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
Boolean objectCount = false; // Boolean | Include the count of objects contained in the division
List<String> id = Arrays.asList(null); // List<String> | Optionally request specific divisions by their IDs
String name = "name_example"; // String | Search term to filter by division name
try {
    AuthzDivisionEntityListing result = apiInstance.getAuthorizationDivisions(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, objectCount, id, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectsApi#getAuthorizationDivisions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| The total page size requested | [optional] [default to 25] 
| **pageNumber** | **Integer**| The page number requested | [optional] [default to 1] 
| **sortBy** | **String**| variable name requested to sort by | [optional] 
| **expand** | [**List&lt;String&gt;**](String.html)| variable name requested by expand list | [optional] 
| **nextPage** | **String**| next page token | [optional] 
| **previousPage** | **String**| Previous page token | [optional] 
| **objectCount** | **Boolean**| Include the count of objects contained in the division | [optional] [default to false] 
| **id** | [**List&lt;String&gt;**](String.html)| Optionally request specific divisions by their IDs | [optional] 
| **name** | **String**| Search term to filter by division name | [optional] 
{: class="table-striped"}


### Return type

[**AuthzDivisionEntityListing**](AuthzDivisionEntityListing.html)

<a name="getAuthorizationDivisionsHome"></a>

# **getAuthorizationDivisionsHome**



> [AuthzDivision](AuthzDivision.html) getAuthorizationDivisionsHome()

Retrieve the home division for the organization.

Will not include object counts.

Wraps GET /api/v2/authorization/divisions/home  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ObjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ObjectsApi apiInstance = new ObjectsApi();
try {
    AuthzDivision result = apiInstance.getAuthorizationDivisionsHome();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectsApi#getAuthorizationDivisionsHome");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**AuthzDivision**](AuthzDivision.html)

<a name="getAuthorizationDivisionsLimit"></a>

# **getAuthorizationDivisionsLimit**



> Integer getAuthorizationDivisionsLimit()

Returns the maximum allowed number of divisions.

Wraps GET /api/v2/authorization/divisions/limit  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ObjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ObjectsApi apiInstance = new ObjectsApi();
try {
    Integer result = apiInstance.getAuthorizationDivisionsLimit();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectsApi#getAuthorizationDivisionsLimit");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

**Integer**

<a name="postAuthorizationDivisionObject"></a>

# **postAuthorizationDivisionObject**



> Void postAuthorizationDivisionObject(divisionId, objectType, body)

Assign a list of objects to a division

Set the division of a specified list of objects. The objects must all be of the same type, one of:  CAMPAIGN, MANAGEMENTUNIT, FLOW, QUEUE, DATATABLES or USER.  The body of the request is a list of object IDs, which are expected to be  GUIDs, e.g. [\"206ce31f-61ec-40ed-a8b1-be6f06303998\",\"250a754e-f5e4-4f51-800f-a92f09d3bf8c\"]

Wraps POST /api/v2/authorization/divisions/{divisionId}/objects/{objectType}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ObjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ObjectsApi apiInstance = new ObjectsApi();
String divisionId = "divisionId_example"; // String | Division ID
String objectType = "objectType_example"; // String | The type of the objects. Must be one of the valid object types
List<String> body = Arrays.asList(null); // List<String> | Object Id List
try {
    apiInstance.postAuthorizationDivisionObject(divisionId, objectType, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectsApi#postAuthorizationDivisionObject");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **divisionId** | **String**| Division ID | 
| **objectType** | **String**| The type of the objects. Must be one of the valid object types |<br />**Values**: QUEUE, CAMPAIGN, CONTACTLIST, DNCLIST, EMAILCAMPAIGN, MESSAGINGCAMPAIGN, MANAGEMENTUNIT, BUSINESSUNIT, FLOW, FLOWMILESTONE, FLOWOUTCOME, USER, CALLROUTE, EMERGENCYGROUPS, ROUTINGSCHEDULES, ROUTINGSCHEDULEGROUPS, DATATABLES, TEAM, WORKBIN, WORKTYPE, EXTENSIONPOOL, SKILLGROUP, SCRIPT 
| **body** | [**List&lt;String&gt;**](String.html)| Object Id List | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="postAuthorizationDivisionRestore"></a>

# **postAuthorizationDivisionRestore**



> [AuthzDivision](AuthzDivision.html) postAuthorizationDivisionRestore(divisionId, body)

Recreate a previously deleted division.

Wraps POST /api/v2/authorization/divisions/{divisionId}/restore  

Requires ANY permissions: 

* authorization:division:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ObjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ObjectsApi apiInstance = new ObjectsApi();
String divisionId = "divisionId_example"; // String | Division ID
AuthzDivision body = new AuthzDivision(); // AuthzDivision | Recreated division data
try {
    AuthzDivision result = apiInstance.postAuthorizationDivisionRestore(divisionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectsApi#postAuthorizationDivisionRestore");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **divisionId** | **String**| Division ID | 
| **body** | [**AuthzDivision**](AuthzDivision.html)| Recreated division data | 
{: class="table-striped"}


### Return type

[**AuthzDivision**](AuthzDivision.html)

<a name="postAuthorizationDivisions"></a>

# **postAuthorizationDivisions**



> [AuthzDivision](AuthzDivision.html) postAuthorizationDivisions(body)

Create a division.

Wraps POST /api/v2/authorization/divisions  

Requires ALL permissions: 

* authorization:division:add
* authorization:grant:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ObjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ObjectsApi apiInstance = new ObjectsApi();
AuthzDivision body = new AuthzDivision(); // AuthzDivision | Division
try {
    AuthzDivision result = apiInstance.postAuthorizationDivisions(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectsApi#postAuthorizationDivisions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**AuthzDivision**](AuthzDivision.html)| Division | 
{: class="table-striped"}


### Return type

[**AuthzDivision**](AuthzDivision.html)

<a name="putAuthorizationDivision"></a>

# **putAuthorizationDivision**



> [AuthzDivision](AuthzDivision.html) putAuthorizationDivision(divisionId, body)

Update a division.

Wraps PUT /api/v2/authorization/divisions/{divisionId}  

Requires ANY permissions: 

* authorization:division:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ObjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ObjectsApi apiInstance = new ObjectsApi();
String divisionId = "divisionId_example"; // String | Division ID
AuthzDivision body = new AuthzDivision(); // AuthzDivision | Updated division data
try {
    AuthzDivision result = apiInstance.putAuthorizationDivision(divisionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectsApi#putAuthorizationDivision");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **divisionId** | **String**| Division ID | 
| **body** | [**AuthzDivision**](AuthzDivision.html)| Updated division data | 
{: class="table-striped"}


### Return type

[**AuthzDivision**](AuthzDivision.html)

