# AuthorizationApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteAuthorizationDivision**](AuthorizationApi#deleteAuthorizationDivision) | Delete a division. |
| [**deleteAuthorizationPoliciesTargetSubjectSubjectId**](AuthorizationApi#deleteAuthorizationPoliciesTargetSubjectSubjectId) | Delete an access control policy |
| [**deleteAuthorizationRole**](AuthorizationApi#deleteAuthorizationRole) | Delete an organization role. |
| [**deleteAuthorizationSubjectDivisionRole**](AuthorizationApi#deleteAuthorizationSubjectDivisionRole) | Delete a grant of a role in a division |
| [**getAuthorizationDivision**](AuthorizationApi#getAuthorizationDivision) | Returns an authorization division. |
| [**getAuthorizationDivisionGrants**](AuthorizationApi#getAuthorizationDivisionGrants) | Gets all grants for a given division. |
| [**getAuthorizationDivisions**](AuthorizationApi#getAuthorizationDivisions) | Retrieve a list of all divisions defined for the organization |
| [**getAuthorizationDivisionsDeleted**](AuthorizationApi#getAuthorizationDivisionsDeleted) | Get a list of soft deleted divisions for the org |
| [**getAuthorizationDivisionsHome**](AuthorizationApi#getAuthorizationDivisionsHome) | Retrieve the home division for the organization. |
| [**getAuthorizationDivisionsLimit**](AuthorizationApi#getAuthorizationDivisionsLimit) | Returns the maximum allowed number of divisions. |
| [**getAuthorizationDivisionsQuery**](AuthorizationApi#getAuthorizationDivisionsQuery) | Retrieve a list of all divisions defined for the organization with cursor |
| [**getAuthorizationDivisionspermittedMe**](AuthorizationApi#getAuthorizationDivisionspermittedMe) | Returns which divisions the current user has the given permission in. |
| [**getAuthorizationDivisionspermittedPagedMe**](AuthorizationApi#getAuthorizationDivisionspermittedPagedMe) | Returns which divisions the current user has the given permission in. |
| [**getAuthorizationDivisionspermittedPagedSubjectId**](AuthorizationApi#getAuthorizationDivisionspermittedPagedSubjectId) | Returns which divisions the specified user has the given permission in. |
| [**getAuthorizationPermissions**](AuthorizationApi#getAuthorizationPermissions) | Get all permissions. |
| [**getAuthorizationPolicies**](AuthorizationApi#getAuthorizationPolicies) | Get a page of access policies for an organization |
| [**getAuthorizationPoliciesSubjectSubjectId**](AuthorizationApi#getAuthorizationPoliciesSubjectSubjectId) | Get a page of access policies for a given subject |
| [**getAuthorizationPoliciesTarget**](AuthorizationApi#getAuthorizationPoliciesTarget) | Get a page of access policies for a given policy target |
| [**getAuthorizationPoliciesTargetSubjectSubjectId**](AuthorizationApi#getAuthorizationPoliciesTargetSubjectSubjectId) | Get an access control policy for a specified resource target and subject |
| [**getAuthorizationPoliciesTargets**](AuthorizationApi#getAuthorizationPoliciesTargets) | Get a map of policy targets to valid attributes for those targets |
| [**getAuthorizationPolicy**](AuthorizationApi#getAuthorizationPolicy) | Get an access control policy with the specified policy ID |
| [**getAuthorizationPolicyAttributes**](AuthorizationApi#getAuthorizationPolicyAttributes) | Get the list of attributes used to evaluate an access control policy with the specified policy ID |
| [**getAuthorizationProducts**](AuthorizationApi#getAuthorizationProducts) | Get the list of enabled products |
| [**getAuthorizationRole**](AuthorizationApi#getAuthorizationRole) | Get a single organization role. |
| [**getAuthorizationRoleComparedefaultRightRoleId**](AuthorizationApi#getAuthorizationRoleComparedefaultRightRoleId) | Get an org role to default role comparison |
| [**getAuthorizationRoleSubjectgrants**](AuthorizationApi#getAuthorizationRoleSubjectgrants) | Get the subjects' granted divisions in the specified role. |
| [**getAuthorizationRoleUsers**](AuthorizationApi#getAuthorizationRoleUsers) | Get a list of the users in a specified role. |
| [**getAuthorizationRoles**](AuthorizationApi#getAuthorizationRoles) | Retrieve a list of all roles defined for the organization |
| [**getAuthorizationRolesSettings**](AuthorizationApi#getAuthorizationRolesSettings) | Get authorization role settings |
| [**getAuthorizationSettings**](AuthorizationApi#getAuthorizationSettings) | Get authorization settings |
| [**getAuthorizationSubject**](AuthorizationApi#getAuthorizationSubject) | Returns a listing of roles and permissions for a user. |
| [**getAuthorizationSubjectsMe**](AuthorizationApi#getAuthorizationSubjectsMe) | Returns a listing of roles and permissions for the currently authenticated user. |
| [**getAuthorizationSubjectsRolecounts**](AuthorizationApi#getAuthorizationSubjectsRolecounts) | Get the count of roles granted to a list of subjects |
| [**getUserRoles**](AuthorizationApi#getUserRoles) | Returns a listing of roles and permissions for a user. |
| [**patchAuthorizationRole**](AuthorizationApi#patchAuthorizationRole) | Patch Organization Role for needsUpdate Field |
| [**patchAuthorizationSettings**](AuthorizationApi#patchAuthorizationSettings) | Change authorization settings |
| [**postAuthorizationDivisionObject**](AuthorizationApi#postAuthorizationDivisionObject) | Assign a list of objects to a division |
| [**postAuthorizationDivisionRestore**](AuthorizationApi#postAuthorizationDivisionRestore) | Recreate a previously deleted division. |
| [**postAuthorizationDivisions**](AuthorizationApi#postAuthorizationDivisions) | Create a division. |
| [**postAuthorizationPoliciesTarget**](AuthorizationApi#postAuthorizationPoliciesTarget) | Add an access control policy for a specified resource target and subject |
| [**postAuthorizationPoliciesTargetValidate**](AuthorizationApi#postAuthorizationPoliciesTargetValidate) | Validate the conditions and attributes of an access control policy for a specified resource target |
| [**postAuthorizationPolicySimulate**](AuthorizationApi#postAuthorizationPolicySimulate) | Simulate a request and evaluate the specified policy ID against the provided values |
| [**postAuthorizationRole**](AuthorizationApi#postAuthorizationRole) | Bulk-grant subjects and divisions with an organization role. |
| [**postAuthorizationRoleComparedefaultRightRoleId**](AuthorizationApi#postAuthorizationRoleComparedefaultRightRoleId) | Get an unsaved org role to default role comparison |
| [**postAuthorizationRoles**](AuthorizationApi#postAuthorizationRoles) | Create an organization role. |
| [**postAuthorizationRolesDefault**](AuthorizationApi#postAuthorizationRolesDefault) | Restores all default roles |
| [**postAuthorizationSubjectBulkadd**](AuthorizationApi#postAuthorizationSubjectBulkadd) | Bulk-grant roles and divisions to a subject. |
| [**postAuthorizationSubjectBulkremove**](AuthorizationApi#postAuthorizationSubjectBulkremove) | Bulk-remove grants from a subject. |
| [**postAuthorizationSubjectBulkreplace**](AuthorizationApi#postAuthorizationSubjectBulkreplace) | Replace subject's roles and divisions with the exact list supplied in the request. |
| [**postAuthorizationSubjectDivisionRole**](AuthorizationApi#postAuthorizationSubjectDivisionRole) | Make a grant of a role in a division |
| [**putAuthorizationDivision**](AuthorizationApi#putAuthorizationDivision) | Update a division. |
| [**putAuthorizationPoliciesTarget**](AuthorizationApi#putAuthorizationPoliciesTarget) | Add an access control policy for a specified resource target and subject, overwriting any existing policy |
| [**putAuthorizationPolicy**](AuthorizationApi#putAuthorizationPolicy) | Update an access control policy with a given ID |
| [**putAuthorizationRole**](AuthorizationApi#putAuthorizationRole) | Update an organization role. |
| [**putAuthorizationRoleUsersAdd**](AuthorizationApi#putAuthorizationRoleUsersAdd) | Sets the users for the role |
| [**putAuthorizationRoleUsersRemove**](AuthorizationApi#putAuthorizationRoleUsersRemove) | Removes the users from the role |
| [**putAuthorizationRolesDefault**](AuthorizationApi#putAuthorizationRolesDefault) | Restore specified default roles |
| [**putAuthorizationRolesSettings**](AuthorizationApi#putAuthorizationRolesSettings) | Change authorization role settings |
| [**putUserRoles**](AuthorizationApi#putUserRoles) | Sets the user's roles |
{: class="table-striped"}


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
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String divisionId = "divisionId_example"; // String | Division ID
Boolean force = false; // Boolean | DEPRECATED -  Force delete this division. Warning: This option may cause any remaining objects in this division to be inaccessible.
try {
    apiInstance.deleteAuthorizationDivision(divisionId, force);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#deleteAuthorizationDivision");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **divisionId** | **String**| Division ID | 
| **force** | **Boolean**| DEPRECATED -  Force delete this division. Warning: This option may cause any remaining objects in this division to be inaccessible. | [optional] [default to false] 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteAuthorizationPoliciesTargetSubjectSubjectId**


> Void deleteAuthorizationPoliciesTargetSubjectSubjectId(targetName, subjectId)

Delete an access control policy

deleteAuthorizationPoliciesTargetSubjectSubjectId is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps DELETE /api/v2/authorization/policies/targets/{targetName}/subject/{subjectId}  

Requires ANY permissions: 

* authorization:policy:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String targetName = "targetName_example"; // String | The domain:entity:action target to which the policy is applied
String subjectId = "subjectId_example"; // String | The ID of the subject to which the policy is applied
try {
    apiInstance.deleteAuthorizationPoliciesTargetSubjectSubjectId(targetName, subjectId);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#deleteAuthorizationPoliciesTargetSubjectSubjectId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **targetName** | **String**| The domain:entity:action target to which the policy is applied | 
| **subjectId** | **String**| The ID of the subject to which the policy is applied | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteAuthorizationRole**


> Void deleteAuthorizationRole(roleId)

Delete an organization role.

Wraps DELETE /api/v2/authorization/roles/{roleId}  

Requires ANY permissions: 

* authorization:role:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String roleId = "roleId_example"; // String | Role ID
try {
    apiInstance.deleteAuthorizationRole(roleId);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#deleteAuthorizationRole");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roleId** | **String**| Role ID | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteAuthorizationSubjectDivisionRole**


> Void deleteAuthorizationSubjectDivisionRole(subjectId, divisionId, roleId)

Delete a grant of a role in a division

Wraps DELETE /api/v2/authorization/subjects/{subjectId}/divisions/{divisionId}/roles/{roleId}  

Requires ALL permissions: 

* authorization:grant:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String subjectId = "subjectId_example"; // String | Subject ID (user or group)
String divisionId = "divisionId_example"; // String | the id of the division of the grant
String roleId = "roleId_example"; // String | the id of the role of the grant
try {
    apiInstance.deleteAuthorizationSubjectDivisionRole(subjectId, divisionId, roleId);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#deleteAuthorizationSubjectDivisionRole");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **subjectId** | **String**| Subject ID (user or group) | 
| **divisionId** | **String**| the id of the division of the grant | 
| **roleId** | **String**| the id of the role of the grant | 
{: class="table-striped"}


### Return type

null (empty response body)


# **getAuthorizationDivision**


> [AuthzDivision](AuthzDivision) getAuthorizationDivision(divisionId, objectCount)

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
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String divisionId = "divisionId_example"; // String | Division ID
Boolean objectCount = false; // Boolean | Get count of objects in this division, grouped by type
try {
    AuthzDivision result = apiInstance.getAuthorizationDivision(divisionId, objectCount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationDivision");
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

[**AuthzDivision**](AuthzDivision)


# **getAuthorizationDivisionGrants**


> [AuthzDivisionGrantEntityListing](AuthzDivisionGrantEntityListing) getAuthorizationDivisionGrants(divisionId, pageNumber, pageSize)

Gets all grants for a given division.

Returns all grants assigned to a given division. Maximum page size is 500.

Wraps GET /api/v2/authorization/divisions/{divisionId}/grants  

Requires ANY permissions: 

* authorization:grant:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String divisionId = "divisionId_example"; // String | Division ID
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
try {
    AuthzDivisionGrantEntityListing result = apiInstance.getAuthorizationDivisionGrants(divisionId, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationDivisionGrants");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **divisionId** | **String**| Division ID | 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
{: class="table-striped"}


### Return type

[**AuthzDivisionGrantEntityListing**](AuthzDivisionGrantEntityListing)


# **getAuthorizationDivisions**


> [AuthzDivisionEntityListing](AuthzDivisionEntityListing) getAuthorizationDivisions(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, objectCount, id, name)

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
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
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
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationDivisions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| The total page size requested | [optional] [default to 25] 
| **pageNumber** | **Integer**| The page number requested | [optional] [default to 1] 
| **sortBy** | **String**| variable name requested to sort by | [optional] 
| **expand** | [**List&lt;String&gt;**](String)| variable name requested by expand list | [optional] 
| **nextPage** | **String**| next page token | [optional] 
| **previousPage** | **String**| Previous page token | [optional] 
| **objectCount** | **Boolean**| Include the count of objects contained in the division | [optional] [default to false] 
| **id** | [**List&lt;String&gt;**](String)| Optionally request specific divisions by their IDs | [optional] 
| **name** | **String**| Search term to filter by division name | [optional] 
{: class="table-striped"}


### Return type

[**AuthzDivisionEntityListing**](AuthzDivisionEntityListing)


# **getAuthorizationDivisionsDeleted**


> [AuthzDivisionEntityListing](AuthzDivisionEntityListing) getAuthorizationDivisionsDeleted(pageNumber, pageSize)

Get a list of soft deleted divisions for the org

Wraps GET /api/v2/authorization/divisions/deleted  

Requires ANY permissions: 

* authorization:divisionDeleted:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
try {
    AuthzDivisionEntityListing result = apiInstance.getAuthorizationDivisionsDeleted(pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationDivisionsDeleted");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
{: class="table-striped"}


### Return type

[**AuthzDivisionEntityListing**](AuthzDivisionEntityListing)


# **getAuthorizationDivisionsHome**


> [AuthzDivision](AuthzDivision) getAuthorizationDivisionsHome()

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
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
try {
    AuthzDivision result = apiInstance.getAuthorizationDivisionsHome();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationDivisionsHome");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**AuthzDivision**](AuthzDivision)


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
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
try {
    Integer result = apiInstance.getAuthorizationDivisionsLimit();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationDivisionsLimit");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

**Integer**


# **getAuthorizationDivisionsQuery**


> [AuthzDivisionCursorListing](AuthzDivisionCursorListing) getAuthorizationDivisionsQuery(before, after, pageSize, id, name)

Retrieve a list of all divisions defined for the organization with cursor

Use \"after\" and \"before\" param to fetch next/previous page}

Wraps GET /api/v2/authorization/divisions/query  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String before = "before_example"; // String | The cursor that points to the start of the set of entities that has been returned.
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned.
String pageSize = "25"; // String | Page size (max 200, default 25)
List<String> id = Arrays.asList(null); // List<String> | Optionally request specific divisions by their IDs
String name = "name_example"; // String | Optionally request specific divisions by division name
try {
    AuthzDivisionCursorListing result = apiInstance.getAuthorizationDivisionsQuery(before, after, pageSize, id, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationDivisionsQuery");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **before** | **String**| The cursor that points to the start of the set of entities that has been returned. | [optional] 
| **after** | **String**| The cursor that points to the end of the set of entities that has been returned. | [optional] 
| **pageSize** | **String**| Page size (max 200, default 25) | [optional] [default to 25] 
| **id** | [**List&lt;String&gt;**](String)| Optionally request specific divisions by their IDs | [optional] 
| **name** | **String**| Optionally request specific divisions by division name | [optional] 
{: class="table-striped"}


### Return type

[**AuthzDivisionCursorListing**](AuthzDivisionCursorListing)


# **getAuthorizationDivisionspermittedMe**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [List&lt;AuthzDivision&gt;](AuthzDivision) getAuthorizationDivisionspermittedMe(permission, name)

Returns which divisions the current user has the given permission in.

This route is deprecated, use authorization/divisionspermitted/paged/me instead.

Wraps GET /api/v2/authorization/divisionspermitted/me  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String permission = "permission_example"; // String | The permission string, including the object to access, e.g. routing:queue:view
String name = "name_example"; // String | Search term to filter by division name
try {
    List<AuthzDivision> result = apiInstance.getAuthorizationDivisionspermittedMe(permission, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationDivisionspermittedMe");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **permission** | **String**| The permission string, including the object to access, e.g. routing:queue:view | 
| **name** | **String**| Search term to filter by division name | [optional] 
{: class="table-striped"}


### Return type

[**List&lt;AuthzDivision&gt;**](AuthzDivision)


# **getAuthorizationDivisionspermittedPagedMe**


> [DivsPermittedEntityListing](DivsPermittedEntityListing) getAuthorizationDivisionspermittedPagedMe(permission, pageNumber, pageSize)

Returns which divisions the current user has the given permission in.

Wraps GET /api/v2/authorization/divisionspermitted/paged/me  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String permission = "permission_example"; // String | The permission string, including the object to access, e.g. routing:queue:view
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
try {
    DivsPermittedEntityListing result = apiInstance.getAuthorizationDivisionspermittedPagedMe(permission, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationDivisionspermittedPagedMe");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **permission** | **String**| The permission string, including the object to access, e.g. routing:queue:view | 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
{: class="table-striped"}


### Return type

[**DivsPermittedEntityListing**](DivsPermittedEntityListing)


# **getAuthorizationDivisionspermittedPagedSubjectId**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [DivsPermittedEntityListing](DivsPermittedEntityListing) getAuthorizationDivisionspermittedPagedSubjectId(subjectId, permission, pageNumber, pageSize)

Returns which divisions the specified user has the given permission in.

This route is deprecated, use authorization/divisionspermitted/paged/me instead.

Wraps GET /api/v2/authorization/divisionspermitted/paged/{subjectId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String subjectId = "subjectId_example"; // String | Subject ID (user or group)
String permission = "permission_example"; // String | The permission string, including the object to access, e.g. routing:queue:view
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
try {
    DivsPermittedEntityListing result = apiInstance.getAuthorizationDivisionspermittedPagedSubjectId(subjectId, permission, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationDivisionspermittedPagedSubjectId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **subjectId** | **String**| Subject ID (user or group) | 
| **permission** | **String**| The permission string, including the object to access, e.g. routing:queue:view | 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
{: class="table-striped"}


### Return type

[**DivsPermittedEntityListing**](DivsPermittedEntityListing)


# **getAuthorizationPermissions**


> [PermissionCollectionEntityListing](PermissionCollectionEntityListing) getAuthorizationPermissions(pageSize, pageNumber, queryType, query)

Get all permissions.

Retrieve a list of all permission defined in the system.

Wraps GET /api/v2/authorization/permissions  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String queryType = "queryType_example"; // String | Query filter type
String query = "query_example"; // String | Comma-separated list of permissions or domains to query
try {
    PermissionCollectionEntityListing result = apiInstance.getAuthorizationPermissions(pageSize, pageNumber, queryType, query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationPermissions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **queryType** | **String**| Query filter type | [optional]<br />**Values**: domain, permission 
| **query** | **String**| Comma-separated list of permissions or domains to query | [optional] 
{: class="table-striped"}


### Return type

[**PermissionCollectionEntityListing**](PermissionCollectionEntityListing)


# **getAuthorizationPolicies**


> [AuthorizationPolicyEntityListing](AuthorizationPolicyEntityListing) getAuthorizationPolicies(after, pageSize)

Get a page of access policies for an organization

getAuthorizationPolicies is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/authorization/policies  

Requires ANY permissions: 

* authorization:policy:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned.
Integer pageSize = 25; // Integer | Number of entities to return. Maximum of 200.
try {
    AuthorizationPolicyEntityListing result = apiInstance.getAuthorizationPolicies(after, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationPolicies");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **after** | **String**| The cursor that points to the end of the set of entities that has been returned. | [optional] 
| **pageSize** | **Integer**| Number of entities to return. Maximum of 200. | [optional] [default to 25] 
{: class="table-striped"}


### Return type

[**AuthorizationPolicyEntityListing**](AuthorizationPolicyEntityListing)


# **getAuthorizationPoliciesSubjectSubjectId**


> [AuthorizationPolicyEntityListing](AuthorizationPolicyEntityListing) getAuthorizationPoliciesSubjectSubjectId(subjectId, after, pageSize)

Get a page of access policies for a given subject

getAuthorizationPoliciesSubjectSubjectId is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/authorization/policies/subject/{subjectId}  

Requires ANY permissions: 

* authorization:policy:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String subjectId = "subjectId_example"; // String | The ID of the subject to which policies are applied
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned.
Integer pageSize = 25; // Integer | Number of entities to return. Maximum of 200.
try {
    AuthorizationPolicyEntityListing result = apiInstance.getAuthorizationPoliciesSubjectSubjectId(subjectId, after, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationPoliciesSubjectSubjectId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **subjectId** | **String**| The ID of the subject to which policies are applied | 
| **after** | **String**| The cursor that points to the end of the set of entities that has been returned. | [optional] 
| **pageSize** | **Integer**| Number of entities to return. Maximum of 200. | [optional] [default to 25] 
{: class="table-striped"}


### Return type

[**AuthorizationPolicyEntityListing**](AuthorizationPolicyEntityListing)


# **getAuthorizationPoliciesTarget**


> [AuthorizationPolicyEntityListing](AuthorizationPolicyEntityListing) getAuthorizationPoliciesTarget(targetName, after, pageSize)

Get a page of access policies for a given policy target

getAuthorizationPoliciesTarget is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/authorization/policies/targets/{targetName}  

Requires ANY permissions: 

* authorization:policy:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String targetName = "targetName_example"; // String | The domain:entity:action resource target to which policies are applied
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned.
Integer pageSize = 25; // Integer | Number of entities to return. Maximum of 200.
try {
    AuthorizationPolicyEntityListing result = apiInstance.getAuthorizationPoliciesTarget(targetName, after, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationPoliciesTarget");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **targetName** | **String**| The domain:entity:action resource target to which policies are applied | 
| **after** | **String**| The cursor that points to the end of the set of entities that has been returned. | [optional] 
| **pageSize** | **Integer**| Number of entities to return. Maximum of 200. | [optional] [default to 25] 
{: class="table-striped"}


### Return type

[**AuthorizationPolicyEntityListing**](AuthorizationPolicyEntityListing)


# **getAuthorizationPoliciesTargetSubjectSubjectId**


> [AuthorizationPolicy](AuthorizationPolicy) getAuthorizationPoliciesTargetSubjectSubjectId(targetName, subjectId)

Get an access control policy for a specified resource target and subject

getAuthorizationPoliciesTargetSubjectSubjectId is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/authorization/policies/targets/{targetName}/subject/{subjectId}  

Requires ANY permissions: 

* authorization:policy:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String targetName = "targetName_example"; // String | The domain:entity:action resource target to which the policy is applied
String subjectId = "subjectId_example"; // String | The ID of the subject to which the policy is applied
try {
    AuthorizationPolicy result = apiInstance.getAuthorizationPoliciesTargetSubjectSubjectId(targetName, subjectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationPoliciesTargetSubjectSubjectId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **targetName** | **String**| The domain:entity:action resource target to which the policy is applied | 
| **subjectId** | **String**| The ID of the subject to which the policy is applied | 
{: class="table-striped"}


### Return type

[**AuthorizationPolicy**](AuthorizationPolicy)


# **getAuthorizationPoliciesTargets**


> [TargetAttributes](TargetAttributes) getAuthorizationPoliciesTargets()

Get a map of policy targets to valid attributes for those targets

getAuthorizationPoliciesTargets is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/authorization/policies/targets  

Requires ANY permissions: 

* authorization:policy:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
try {
    TargetAttributes result = apiInstance.getAuthorizationPoliciesTargets();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationPoliciesTargets");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**TargetAttributes**](TargetAttributes)


# **getAuthorizationPolicy**


> [AuthorizationPolicy](AuthorizationPolicy) getAuthorizationPolicy(policyId)

Get an access control policy with the specified policy ID

getAuthorizationPolicy is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/authorization/policies/{policyId}  

Requires ANY permissions: 

* authorization:policy:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String policyId = "policyId_example"; // String | The ID of the policy to retrieve
try {
    AuthorizationPolicy result = apiInstance.getAuthorizationPolicy(policyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationPolicy");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **policyId** | **String**| The ID of the policy to retrieve | 
{: class="table-striped"}


### Return type

[**AuthorizationPolicy**](AuthorizationPolicy)


# **getAuthorizationPolicyAttributes**


> [PolicyAttributeSet](PolicyAttributeSet) getAuthorizationPolicyAttributes(policyId)

Get the list of attributes used to evaluate an access control policy with the specified policy ID

getAuthorizationPolicyAttributes is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/authorization/policies/{policyId}/attributes  

Requires ANY permissions: 

* authorization:policy:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String policyId = "policyId_example"; // String | The ID of the policy to retrieve attributes
try {
    PolicyAttributeSet result = apiInstance.getAuthorizationPolicyAttributes(policyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationPolicyAttributes");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **policyId** | **String**| The ID of the policy to retrieve attributes | 
{: class="table-striped"}


### Return type

[**PolicyAttributeSet**](PolicyAttributeSet)


# **getAuthorizationProducts**


> [OrganizationProductEntityListing](OrganizationProductEntityListing) getAuthorizationProducts()

Get the list of enabled products

Gets the list of enabled products. Some example product names are: collaborateFree, collaboratePro, communicate, and engage.

Wraps GET /api/v2/authorization/products  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
try {
    OrganizationProductEntityListing result = apiInstance.getAuthorizationProducts();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationProducts");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**OrganizationProductEntityListing**](OrganizationProductEntityListing)


# **getAuthorizationRole**


> [DomainOrganizationRole](DomainOrganizationRole) getAuthorizationRole(roleId, userCount, expand)

Get a single organization role.

Get the organization role specified by its ID.

Wraps GET /api/v2/authorization/roles/{roleId}  

Requires ANY permissions: 

* authorization:role:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String roleId = "roleId_example"; // String | Role ID
Boolean userCount = true; // Boolean | Fetch the count of users who have this role granted in at least one division. Setting this value or defaulting to 'true' can lead to slower load times or timeouts for role queries with large member counts.
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand. \"unusedPermissions\" returns the permissions not used for the role
try {
    DomainOrganizationRole result = apiInstance.getAuthorizationRole(roleId, userCount, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationRole");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roleId** | **String**| Role ID | 
| **userCount** | **Boolean**| Fetch the count of users who have this role granted in at least one division. Setting this value or defaulting to &#39;true&#39; can lead to slower load times or timeouts for role queries with large member counts. | [optional] [default to true]<br />**Values**: true, false 
| **expand** | [**List&lt;String&gt;**](String)| Which fields, if any, to expand. \&quot;unusedPermissions\&quot; returns the permissions not used for the role | [optional]<br />**Values**: unusedPermissions 
{: class="table-striped"}


### Return type

[**DomainOrganizationRole**](DomainOrganizationRole)


# **getAuthorizationRoleComparedefaultRightRoleId**


> [DomainOrgRoleDifference](DomainOrgRoleDifference) getAuthorizationRoleComparedefaultRightRoleId(leftRoleId, rightRoleId)

Get an org role to default role comparison

Compares any organization role to a default role id and show differences

Wraps GET /api/v2/authorization/roles/{leftRoleId}/comparedefault/{rightRoleId}  

Requires ANY permissions: 

* authorization:role:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String leftRoleId = "leftRoleId_example"; // String | Left Role ID
String rightRoleId = "rightRoleId_example"; // String | Right Role id
try {
    DomainOrgRoleDifference result = apiInstance.getAuthorizationRoleComparedefaultRightRoleId(leftRoleId, rightRoleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationRoleComparedefaultRightRoleId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **leftRoleId** | **String**| Left Role ID | 
| **rightRoleId** | **String**| Right Role id | 
{: class="table-striped"}


### Return type

[**DomainOrgRoleDifference**](DomainOrgRoleDifference)


# **getAuthorizationRoleSubjectgrants**


> [SubjectDivisionGrantsEntityListing](SubjectDivisionGrantsEntityListing) getAuthorizationRoleSubjectgrants(roleId, pageSize, pageNumber, sortBy, expand, nextPage, previousPage)

Get the subjects' granted divisions in the specified role.

Includes the divisions for which the subject has a grant.

Wraps GET /api/v2/authorization/roles/{roleId}/subjectgrants  

Requires ANY permissions: 

* authorization:role:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String roleId = "roleId_example"; // String | Role ID
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<String> expand = Arrays.asList(null); // List<String> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
try {
    SubjectDivisionGrantsEntityListing result = apiInstance.getAuthorizationRoleSubjectgrants(roleId, pageSize, pageNumber, sortBy, expand, nextPage, previousPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationRoleSubjectgrants");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roleId** | **String**| Role ID | 
| **pageSize** | **Integer**| The total page size requested | [optional] [default to 25] 
| **pageNumber** | **Integer**| The page number requested | [optional] [default to 1] 
| **sortBy** | **String**| variable name requested to sort by | [optional] 
| **expand** | [**List&lt;String&gt;**](String)| variable name requested by expand list | [optional] 
| **nextPage** | **String**| next page token | [optional] 
| **previousPage** | **String**| Previous page token | [optional] 
{: class="table-striped"}


### Return type

[**SubjectDivisionGrantsEntityListing**](SubjectDivisionGrantsEntityListing)


# **getAuthorizationRoleUsers**


> [UserReferenceEntityListing](UserReferenceEntityListing) getAuthorizationRoleUsers(roleId, pageSize, pageNumber)

Get a list of the users in a specified role.

Get an array of the UUIDs of the users in the specified role.

Wraps GET /api/v2/authorization/roles/{roleId}/users  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String roleId = "roleId_example"; // String | Role ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    UserReferenceEntityListing result = apiInstance.getAuthorizationRoleUsers(roleId, pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationRoleUsers");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roleId** | **String**| Role ID | 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
{: class="table-striped"}


### Return type

[**UserReferenceEntityListing**](UserReferenceEntityListing)


# **getAuthorizationRoles**


> [OrganizationRoleEntityListing](OrganizationRoleEntityListing) getAuthorizationRoles(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, name, permission, defaultRoleId, userCount, id)

Retrieve a list of all roles defined for the organization

Wraps GET /api/v2/authorization/roles  

Requires ANY permissions: 

* authorization:role:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<String> expand = Arrays.asList(null); // List<String> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
String name = "name_example"; // String | 
List<String> permission = Arrays.asList(null); // List<String> | 
List<String> defaultRoleId = Arrays.asList(null); // List<String> | 
Boolean userCount = true; // Boolean | 
List<String> id = Arrays.asList(null); // List<String> | id
try {
    OrganizationRoleEntityListing result = apiInstance.getAuthorizationRoles(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, name, permission, defaultRoleId, userCount, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationRoles");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| The total page size requested | [optional] [default to 25] 
| **pageNumber** | **Integer**| The page number requested | [optional] [default to 1] 
| **sortBy** | **String**| variable name requested to sort by | [optional] 
| **expand** | [**List&lt;String&gt;**](String)| variable name requested by expand list | [optional] 
| **nextPage** | **String**| next page token | [optional] 
| **previousPage** | **String**| Previous page token | [optional] 
| **name** | **String**|  | [optional] 
| **permission** | [**List&lt;String&gt;**](String)|  | [optional] 
| **defaultRoleId** | [**List&lt;String&gt;**](String)|  | [optional] 
| **userCount** | **Boolean**|  | [optional] [default to true] 
| **id** | [**List&lt;String&gt;**](String)| id | [optional] 
{: class="table-striped"}


### Return type

[**OrganizationRoleEntityListing**](OrganizationRoleEntityListing)


# **getAuthorizationRolesSettings**


> [RoleSettings](RoleSettings) getAuthorizationRolesSettings()

Get authorization role settings

Wraps GET /api/v2/authorization/roles/settings  

Requires ANY permissions: 

* directory:organization:admin
* authorization:settings:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
try {
    RoleSettings result = apiInstance.getAuthorizationRolesSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationRolesSettings");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**RoleSettings**](RoleSettings)


# **getAuthorizationSettings**


> [AuthorizationSettings](AuthorizationSettings) getAuthorizationSettings()

Get authorization settings

Wraps GET /api/v2/authorization/settings  

Requires ANY permissions: 

* directory:organization:admin
* authorization:settings:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
try {
    AuthorizationSettings result = apiInstance.getAuthorizationSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationSettings");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**AuthorizationSettings**](AuthorizationSettings)


# **getAuthorizationSubject**


> [AuthzSubject](AuthzSubject) getAuthorizationSubject(subjectId, includeDuplicates)

Returns a listing of roles and permissions for a user.

Wraps GET /api/v2/authorization/subjects/{subjectId}  

Requires ANY permissions: 

* authorization:grant:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String subjectId = "subjectId_example"; // String | Subject ID (user or group)
Boolean includeDuplicates = false; // Boolean | Include multiple entries with the same role and division but different subjects
try {
    AuthzSubject result = apiInstance.getAuthorizationSubject(subjectId, includeDuplicates);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationSubject");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **subjectId** | **String**| Subject ID (user or group) | 
| **includeDuplicates** | **Boolean**| Include multiple entries with the same role and division but different subjects | [optional] [default to false]<br />**Values**: true, false 
{: class="table-striped"}


### Return type

[**AuthzSubject**](AuthzSubject)


# **getAuthorizationSubjectsMe**


> [AuthzSubject](AuthzSubject) getAuthorizationSubjectsMe(includeDuplicates)

Returns a listing of roles and permissions for the currently authenticated user.

Wraps GET /api/v2/authorization/subjects/me  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
Boolean includeDuplicates = false; // Boolean | Include multiple entries with the same role and division but different subjects
try {
    AuthzSubject result = apiInstance.getAuthorizationSubjectsMe(includeDuplicates);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationSubjectsMe");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **includeDuplicates** | **Boolean**| Include multiple entries with the same role and division but different subjects | [optional] [default to false]<br />**Values**: true, false 
{: class="table-striped"}


### Return type

[**AuthzSubject**](AuthzSubject)


# **getAuthorizationSubjectsRolecounts**


> Map&lt;String, Object&gt; getAuthorizationSubjectsRolecounts(id)

Get the count of roles granted to a list of subjects

Wraps GET /api/v2/authorization/subjects/rolecounts  

Requires ANY permissions: 

* authorization:grant:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
List<String> id = Arrays.asList(null); // List<String> | id
try {
    Map<String, Object> result = apiInstance.getAuthorizationSubjectsRolecounts(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationSubjectsRolecounts");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | [**List&lt;String&gt;**](String)| id | [optional] 
{: class="table-striped"}


### Return type

**Map&lt;String, Object&gt;**


# **getUserRoles**


> [UserAuthorization](UserAuthorization) getUserRoles(subjectId)

Returns a listing of roles and permissions for a user.

Wraps GET /api/v2/users/{subjectId}/roles  

Requires ANY permissions: 

* authorization:grant:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String subjectId = "subjectId_example"; // String | User ID
try {
    UserAuthorization result = apiInstance.getUserRoles(subjectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getUserRoles");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **subjectId** | **String**| User ID | 
{: class="table-striped"}


### Return type

[**UserAuthorization**](UserAuthorization)


# **patchAuthorizationRole**


> [DomainOrganizationRole](DomainOrganizationRole) patchAuthorizationRole(roleId, body)

Patch Organization Role for needsUpdate Field

Patch Organization Role for needsUpdate Field

Wraps PATCH /api/v2/authorization/roles/{roleId}  

Requires ANY permissions: 

* authorization:role:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String roleId = "roleId_example"; // String | Role ID
DomainOrganizationRole body = new DomainOrganizationRole(); // DomainOrganizationRole | Organization role
try {
    DomainOrganizationRole result = apiInstance.patchAuthorizationRole(roleId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#patchAuthorizationRole");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roleId** | **String**| Role ID | 
| **body** | [**DomainOrganizationRole**](DomainOrganizationRole)| Organization role | 
{: class="table-striped"}


### Return type

[**DomainOrganizationRole**](DomainOrganizationRole)


# **patchAuthorizationSettings**


> [AuthorizationSettings](AuthorizationSettings) patchAuthorizationSettings(body)

Change authorization settings

Change authorization settings

Wraps PATCH /api/v2/authorization/settings  

Requires ANY permissions: 

* directory:organization:admin
* authorization:settings:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
AuthorizationSettings body = new AuthorizationSettings(); // AuthorizationSettings | Authorization Settings
try {
    AuthorizationSettings result = apiInstance.patchAuthorizationSettings(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#patchAuthorizationSettings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**AuthorizationSettings**](AuthorizationSettings)| Authorization Settings | 
{: class="table-striped"}


### Return type

[**AuthorizationSettings**](AuthorizationSettings)


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
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String divisionId = "divisionId_example"; // String | Division ID
String objectType = "objectType_example"; // String | The type of the objects. Must be one of the valid object types
List<String> body = Arrays.asList(null); // List<String> | Object Id List
try {
    apiInstance.postAuthorizationDivisionObject(divisionId, objectType, body);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#postAuthorizationDivisionObject");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **divisionId** | **String**| Division ID | 
| **objectType** | **String**| The type of the objects. Must be one of the valid object types |<br />**Values**: QUEUE, CAMPAIGN, CONTACTLIST, DNCLIST, EMAILCAMPAIGN, MESSAGINGCAMPAIGN, MANAGEMENTUNIT, BUSINESSUNIT, FLOW, FLOWMILESTONE, FLOWOUTCOME, USER, CALLROUTE, EMERGENCYGROUPS, ROUTINGSCHEDULES, ROUTINGSCHEDULEGROUPS, DATATABLES, TEAM, WORKBIN, WORKTYPE, EXTENSIONPOOL, SKILLGROUP, SCRIPT 
| **body** | [**List&lt;String&gt;**](String)| Object Id List | 
{: class="table-striped"}


### Return type

null (empty response body)


# **postAuthorizationDivisionRestore**


> [AuthzDivision](AuthzDivision) postAuthorizationDivisionRestore(divisionId, body)

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
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String divisionId = "divisionId_example"; // String | Division ID
AuthzDivision body = new AuthzDivision(); // AuthzDivision | Recreated division data
try {
    AuthzDivision result = apiInstance.postAuthorizationDivisionRestore(divisionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#postAuthorizationDivisionRestore");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **divisionId** | **String**| Division ID | 
| **body** | [**AuthzDivision**](AuthzDivision)| Recreated division data | 
{: class="table-striped"}


### Return type

[**AuthzDivision**](AuthzDivision)


# **postAuthorizationDivisions**


> [AuthzDivision](AuthzDivision) postAuthorizationDivisions(body)

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
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
AuthzDivision body = new AuthzDivision(); // AuthzDivision | Division
try {
    AuthzDivision result = apiInstance.postAuthorizationDivisions(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#postAuthorizationDivisions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**AuthzDivision**](AuthzDivision)| Division | 
{: class="table-striped"}


### Return type

[**AuthzDivision**](AuthzDivision)


# **postAuthorizationPoliciesTarget**


> [AuthorizationPolicy](AuthorizationPolicy) postAuthorizationPoliciesTarget(targetName, body)

Add an access control policy for a specified resource target and subject

postAuthorizationPoliciesTarget is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/authorization/policies/targets/{targetName}  

Requires ANY permissions: 

* authorization:policy:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String targetName = "targetName_example"; // String | The domain:entity:action target to which the policy will be applied
AuthorizationPolicy body = new AuthorizationPolicy(); // AuthorizationPolicy | Access control policy
try {
    AuthorizationPolicy result = apiInstance.postAuthorizationPoliciesTarget(targetName, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#postAuthorizationPoliciesTarget");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **targetName** | **String**| The domain:entity:action target to which the policy will be applied | 
| **body** | [**AuthorizationPolicy**](AuthorizationPolicy)| Access control policy | 
{: class="table-striped"}


### Return type

[**AuthorizationPolicy**](AuthorizationPolicy)


# **postAuthorizationPoliciesTargetValidate**


> [ValidationErrorListing](ValidationErrorListing) postAuthorizationPoliciesTargetValidate(targetName, body)

Validate the conditions and attributes of an access control policy for a specified resource target

postAuthorizationPoliciesTargetValidate is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/authorization/policies/targets/{targetName}/validate  

Requires ANY permissions: 

* authorization:policy:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String targetName = "targetName_example"; // String | The domain:entity:action target to which the policy will be applied
AuthorizationPolicy body = new AuthorizationPolicy(); // AuthorizationPolicy | Access control policy
try {
    ValidationErrorListing result = apiInstance.postAuthorizationPoliciesTargetValidate(targetName, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#postAuthorizationPoliciesTargetValidate");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **targetName** | **String**| The domain:entity:action target to which the policy will be applied | 
| **body** | [**AuthorizationPolicy**](AuthorizationPolicy)| Access control policy | 
{: class="table-striped"}


### Return type

[**ValidationErrorListing**](ValidationErrorListing)


# **postAuthorizationPolicySimulate**


> [PolicyTestResult](PolicyTestResult) postAuthorizationPolicySimulate(policyId, body)

Simulate a request and evaluate the specified policy ID against the provided values

postAuthorizationPolicySimulate is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/authorization/policies/{policyId}/simulate  

Requires ANY permissions: 

* authorization:policy:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String policyId = "policyId_example"; // String | The ID of the policy to test the simulated data against
PolicyTestPayload body = new PolicyTestPayload(); // PolicyTestPayload | A map of attribute names to type and simulated data value
try {
    PolicyTestResult result = apiInstance.postAuthorizationPolicySimulate(policyId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#postAuthorizationPolicySimulate");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **policyId** | **String**| The ID of the policy to test the simulated data against | 
| **body** | [**PolicyTestPayload**](PolicyTestPayload)| A map of attribute names to type and simulated data value | 
{: class="table-striped"}


### Return type

[**PolicyTestResult**](PolicyTestResult)


# **postAuthorizationRole**


> Void postAuthorizationRole(roleId, body, subjectType)

Bulk-grant subjects and divisions with an organization role.

Wraps POST /api/v2/authorization/roles/{roleId}  

Requires ALL permissions: 

* authorization:grant:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String roleId = "roleId_example"; // String | Role ID
SubjectDivisions body = new SubjectDivisions(); // SubjectDivisions | Subjects and Divisions
String subjectType = "PC_USER"; // String | what the type of the subjects are (PC_GROUP, PC_USER or PC_OAUTH_CLIENT)
try {
    apiInstance.postAuthorizationRole(roleId, body, subjectType);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#postAuthorizationRole");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roleId** | **String**| Role ID | 
| **body** | [**SubjectDivisions**](SubjectDivisions)| Subjects and Divisions | 
| **subjectType** | **String**| what the type of the subjects are (PC_GROUP, PC_USER or PC_OAUTH_CLIENT) | [optional] [default to PC_USER] 
{: class="table-striped"}


### Return type

null (empty response body)


# **postAuthorizationRoleComparedefaultRightRoleId**


> [DomainOrgRoleDifference](DomainOrgRoleDifference) postAuthorizationRoleComparedefaultRightRoleId(leftRoleId, rightRoleId, body)

Get an unsaved org role to default role comparison

Allows users to compare their existing roles in an unsaved state to its default role

Wraps POST /api/v2/authorization/roles/{leftRoleId}/comparedefault/{rightRoleId}  

Requires ANY permissions: 

* authorization:role:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String leftRoleId = "leftRoleId_example"; // String | Left Role ID
String rightRoleId = "rightRoleId_example"; // String | Right Role id
DomainOrganizationRole body = new DomainOrganizationRole(); // DomainOrganizationRole | Organization role
try {
    DomainOrgRoleDifference result = apiInstance.postAuthorizationRoleComparedefaultRightRoleId(leftRoleId, rightRoleId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#postAuthorizationRoleComparedefaultRightRoleId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **leftRoleId** | **String**| Left Role ID | 
| **rightRoleId** | **String**| Right Role id | 
| **body** | [**DomainOrganizationRole**](DomainOrganizationRole)| Organization role | 
{: class="table-striped"}


### Return type

[**DomainOrgRoleDifference**](DomainOrgRoleDifference)


# **postAuthorizationRoles**


> [DomainOrganizationRole](DomainOrganizationRole) postAuthorizationRoles(body)

Create an organization role.

Wraps POST /api/v2/authorization/roles  

Requires ANY permissions: 

* authorization:role:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
DomainOrganizationRoleCreate body = new DomainOrganizationRoleCreate(); // DomainOrganizationRoleCreate | Organization role
try {
    DomainOrganizationRole result = apiInstance.postAuthorizationRoles(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#postAuthorizationRoles");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**DomainOrganizationRoleCreate**](DomainOrganizationRoleCreate)| Organization role | 
{: class="table-striped"}


### Return type

[**DomainOrganizationRole**](DomainOrganizationRole)


# **postAuthorizationRolesDefault**


> [OrganizationRoleEntityListing](OrganizationRoleEntityListing) postAuthorizationRolesDefault(force)

Restores all default roles

This endpoint serves several purposes. 1. It provides the org with default roles. This is important for default roles that will be added after go-live (they can retroactively add the new default-role). Note: When not using a query param of force=true, it only adds the default roles not configured for the org; it does not overwrite roles. 2. Using the query param force=true, you can restore all default roles. Note: This does not have an effect on custom roles.

Wraps POST /api/v2/authorization/roles/default  

Requires ANY permissions: 

* authorization:role:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
Boolean force = false; // Boolean | Restore default roles
try {
    OrganizationRoleEntityListing result = apiInstance.postAuthorizationRolesDefault(force);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#postAuthorizationRolesDefault");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **force** | **Boolean**| Restore default roles | [optional] [default to false] 
{: class="table-striped"}


### Return type

[**OrganizationRoleEntityListing**](OrganizationRoleEntityListing)


# **postAuthorizationSubjectBulkadd**


> Void postAuthorizationSubjectBulkadd(subjectId, body, subjectType)

Bulk-grant roles and divisions to a subject.

Wraps POST /api/v2/authorization/subjects/{subjectId}/bulkadd  

Requires ALL permissions: 

* authorization:grant:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String subjectId = "subjectId_example"; // String | Subject ID (user or group)
RoleDivisionGrants body = new RoleDivisionGrants(); // RoleDivisionGrants | Pairs of role and division IDs
String subjectType = "PC_USER"; // String | what the type of the subject is (PC_GROUP, PC_USER or PC_OAUTH_CLIENT)
try {
    apiInstance.postAuthorizationSubjectBulkadd(subjectId, body, subjectType);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#postAuthorizationSubjectBulkadd");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **subjectId** | **String**| Subject ID (user or group) | 
| **body** | [**RoleDivisionGrants**](RoleDivisionGrants)| Pairs of role and division IDs | 
| **subjectType** | **String**| what the type of the subject is (PC_GROUP, PC_USER or PC_OAUTH_CLIENT) | [optional] [default to PC_USER] 
{: class="table-striped"}


### Return type

null (empty response body)


# **postAuthorizationSubjectBulkremove**


> Void postAuthorizationSubjectBulkremove(subjectId, body)

Bulk-remove grants from a subject.

Wraps POST /api/v2/authorization/subjects/{subjectId}/bulkremove  

Requires ALL permissions: 

* authorization:grant:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String subjectId = "subjectId_example"; // String | Subject ID (user or group)
RoleDivisionGrants body = new RoleDivisionGrants(); // RoleDivisionGrants | Pairs of role and division IDs
try {
    apiInstance.postAuthorizationSubjectBulkremove(subjectId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#postAuthorizationSubjectBulkremove");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **subjectId** | **String**| Subject ID (user or group) | 
| **body** | [**RoleDivisionGrants**](RoleDivisionGrants)| Pairs of role and division IDs | 
{: class="table-striped"}


### Return type

null (empty response body)


# **postAuthorizationSubjectBulkreplace**


> Void postAuthorizationSubjectBulkreplace(subjectId, body, subjectType)

Replace subject's roles and divisions with the exact list supplied in the request.

This operation will not remove grants that are inherited from group membership. It will only set the grants directly applied to the subject.

Wraps POST /api/v2/authorization/subjects/{subjectId}/bulkreplace  

Requires ALL permissions: 

* authorization:grant:add
* authorization:grant:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String subjectId = "subjectId_example"; // String | Subject ID (user or group)
RoleDivisionGrants body = new RoleDivisionGrants(); // RoleDivisionGrants | Pairs of role and division IDs
String subjectType = "PC_USER"; // String | what the type of the subject is (PC_GROUP, PC_USER or PC_OAUTH_CLIENT)
try {
    apiInstance.postAuthorizationSubjectBulkreplace(subjectId, body, subjectType);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#postAuthorizationSubjectBulkreplace");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **subjectId** | **String**| Subject ID (user or group) | 
| **body** | [**RoleDivisionGrants**](RoleDivisionGrants)| Pairs of role and division IDs | 
| **subjectType** | **String**| what the type of the subject is (PC_GROUP, PC_USER or PC_OAUTH_CLIENT) | [optional] [default to PC_USER] 
{: class="table-striped"}


### Return type

null (empty response body)


# **postAuthorizationSubjectDivisionRole**


> Void postAuthorizationSubjectDivisionRole(subjectId, divisionId, roleId, subjectType)

Make a grant of a role in a division

Wraps POST /api/v2/authorization/subjects/{subjectId}/divisions/{divisionId}/roles/{roleId}  

Requires ALL permissions: 

* authorization:grant:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String subjectId = "subjectId_example"; // String | Subject ID (user or group)
String divisionId = "divisionId_example"; // String | the id of the division to which to make the grant
String roleId = "roleId_example"; // String | the id of the role to grant
String subjectType = "PC_USER"; // String | what the type of the subject is: PC_GROUP, PC_USER or PC_OAUTH_CLIENT (note: for cross-org authorization, please use the Organization Authorization endpoints)
try {
    apiInstance.postAuthorizationSubjectDivisionRole(subjectId, divisionId, roleId, subjectType);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#postAuthorizationSubjectDivisionRole");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **subjectId** | **String**| Subject ID (user or group) | 
| **divisionId** | **String**| the id of the division to which to make the grant | 
| **roleId** | **String**| the id of the role to grant | 
| **subjectType** | **String**| what the type of the subject is: PC_GROUP, PC_USER or PC_OAUTH_CLIENT (note: for cross-org authorization, please use the Organization Authorization endpoints) | [optional] [default to PC_USER] 
{: class="table-striped"}


### Return type

null (empty response body)


# **putAuthorizationDivision**


> [AuthzDivision](AuthzDivision) putAuthorizationDivision(divisionId, body)

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
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String divisionId = "divisionId_example"; // String | Division ID
AuthzDivision body = new AuthzDivision(); // AuthzDivision | Updated division data
try {
    AuthzDivision result = apiInstance.putAuthorizationDivision(divisionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#putAuthorizationDivision");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **divisionId** | **String**| Division ID | 
| **body** | [**AuthzDivision**](AuthzDivision)| Updated division data | 
{: class="table-striped"}


### Return type

[**AuthzDivision**](AuthzDivision)


# **putAuthorizationPoliciesTarget**


> [AuthorizationPolicy](AuthorizationPolicy) putAuthorizationPoliciesTarget(targetName, body)

Add an access control policy for a specified resource target and subject, overwriting any existing policy

putAuthorizationPoliciesTarget is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps PUT /api/v2/authorization/policies/targets/{targetName}  

Requires ANY permissions: 

* authorization:policy:edit
* authorization:policy:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String targetName = "targetName_example"; // String | The domain:entity:action target to which the policy will be applied
AuthorizationPolicy body = new AuthorizationPolicy(); // AuthorizationPolicy | Access control policy
try {
    AuthorizationPolicy result = apiInstance.putAuthorizationPoliciesTarget(targetName, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#putAuthorizationPoliciesTarget");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **targetName** | **String**| The domain:entity:action target to which the policy will be applied | 
| **body** | [**AuthorizationPolicy**](AuthorizationPolicy)| Access control policy | 
{: class="table-striped"}


### Return type

[**AuthorizationPolicy**](AuthorizationPolicy)


# **putAuthorizationPolicy**


> [AuthorizationPolicy](AuthorizationPolicy) putAuthorizationPolicy(policyId, body)

Update an access control policy with a given ID

putAuthorizationPolicy is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps PUT /api/v2/authorization/policies/{policyId}  

Requires ANY permissions: 

* authorization:policy:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String policyId = "policyId_example"; // String | The ID of the policy to update
AuthorizationPolicy body = new AuthorizationPolicy(); // AuthorizationPolicy | Access control policy
try {
    AuthorizationPolicy result = apiInstance.putAuthorizationPolicy(policyId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#putAuthorizationPolicy");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **policyId** | **String**| The ID of the policy to update | 
| **body** | [**AuthorizationPolicy**](AuthorizationPolicy)| Access control policy | 
{: class="table-striped"}


### Return type

[**AuthorizationPolicy**](AuthorizationPolicy)


# **putAuthorizationRole**


> [DomainOrganizationRole](DomainOrganizationRole) putAuthorizationRole(roleId, body)

Update an organization role.

Update

Wraps PUT /api/v2/authorization/roles/{roleId}  

Requires ANY permissions: 

* authorization:role:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String roleId = "roleId_example"; // String | Role ID
DomainOrganizationRoleUpdate body = new DomainOrganizationRoleUpdate(); // DomainOrganizationRoleUpdate | Organization role
try {
    DomainOrganizationRole result = apiInstance.putAuthorizationRole(roleId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#putAuthorizationRole");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roleId** | **String**| Role ID | 
| **body** | [**DomainOrganizationRoleUpdate**](DomainOrganizationRoleUpdate)| Organization role | 
{: class="table-striped"}


### Return type

[**DomainOrganizationRole**](DomainOrganizationRole)


# **putAuthorizationRoleUsersAdd**


> List&lt;String&gt; putAuthorizationRoleUsersAdd(roleId, body)

Sets the users for the role

Wraps PUT /api/v2/authorization/roles/{roleId}/users/add  

Requires ANY permissions: 

* authorization:grant:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String roleId = "roleId_example"; // String | Role ID
List<String> body = Arrays.asList(null); // List<String> | List of user IDs
try {
    List<String> result = apiInstance.putAuthorizationRoleUsersAdd(roleId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#putAuthorizationRoleUsersAdd");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roleId** | **String**| Role ID | 
| **body** | [**List&lt;String&gt;**](String)| List of user IDs | 
{: class="table-striped"}


### Return type

**List&lt;String&gt;**


# **putAuthorizationRoleUsersRemove**


> List&lt;String&gt; putAuthorizationRoleUsersRemove(roleId, body)

Removes the users from the role

Wraps PUT /api/v2/authorization/roles/{roleId}/users/remove  

Requires ANY permissions: 

* authorization:grant:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String roleId = "roleId_example"; // String | Role ID
List<String> body = Arrays.asList(null); // List<String> | List of user IDs
try {
    List<String> result = apiInstance.putAuthorizationRoleUsersRemove(roleId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#putAuthorizationRoleUsersRemove");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roleId** | **String**| Role ID | 
| **body** | [**List&lt;String&gt;**](String)| List of user IDs | 
{: class="table-striped"}


### Return type

**List&lt;String&gt;**


# **putAuthorizationRolesDefault**


> [OrganizationRoleEntityListing](OrganizationRoleEntityListing) putAuthorizationRolesDefault(body)

Restore specified default roles

Wraps PUT /api/v2/authorization/roles/default  

Requires ANY permissions: 

* authorization:role:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
List<DomainOrganizationRole> body = Arrays.asList(new DomainOrganizationRole()); // List<DomainOrganizationRole> | Organization roles list
try {
    OrganizationRoleEntityListing result = apiInstance.putAuthorizationRolesDefault(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#putAuthorizationRolesDefault");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**List&lt;DomainOrganizationRole&gt;**](DomainOrganizationRole)| Organization roles list | 
{: class="table-striped"}


### Return type

[**OrganizationRoleEntityListing**](OrganizationRoleEntityListing)


# **putAuthorizationRolesSettings**


> [RoleSettings](RoleSettings) putAuthorizationRolesSettings(body)

Change authorization role settings

Change role settings

Wraps PUT /api/v2/authorization/roles/settings  

Requires ANY permissions: 

* directory:organization:admin
* authorization:settings:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
RoleSettings body = new RoleSettings(); // RoleSettings | Authorization Role Settings
try {
    RoleSettings result = apiInstance.putAuthorizationRolesSettings(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#putAuthorizationRolesSettings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**RoleSettings**](RoleSettings)| Authorization Role Settings | 
{: class="table-striped"}


### Return type

[**RoleSettings**](RoleSettings)


# **putUserRoles**


> [UserAuthorization](UserAuthorization) putUserRoles(subjectId, body)

Sets the user's roles

Wraps PUT /api/v2/users/{subjectId}/roles  

Requires ANY permissions: 

* authorization:grant:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String subjectId = "subjectId_example"; // String | User ID
List<String> body = Arrays.asList(null); // List<String> | List of roles
try {
    UserAuthorization result = apiInstance.putUserRoles(subjectId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#putUserRoles");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **subjectId** | **String**| User ID | 
| **body** | [**List&lt;String&gt;**](String)| List of roles | 
{: class="table-striped"}


### Return type

[**UserAuthorization**](UserAuthorization)


_com.mypurecloud.sdk.v2:platform-client-v2:237.0.0_
