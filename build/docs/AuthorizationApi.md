---
title: AuthorizationApi
---
## AuthorizationApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteAuthorizationRole**](AuthorizationApi.html#deleteAuthorizationRole) | Delete an organization role. |
| [**deleteUserRoles**](AuthorizationApi.html#deleteUserRoles) | Removes all the roles from the user. |
| [**getAuthorizationPermissions**](AuthorizationApi.html#getAuthorizationPermissions) | Get all permissions. |
| [**getAuthorizationProducts**](AuthorizationApi.html#getAuthorizationProducts) | Get the list of enabled products |
| [**getAuthorizationRole**](AuthorizationApi.html#getAuthorizationRole) | Get a single organization role. |
| [**getAuthorizationRoleComparedefaultRightRoleId**](AuthorizationApi.html#getAuthorizationRoleComparedefaultRightRoleId) | Get an org role to default role comparison comparison |
| [**getAuthorizationRoles**](AuthorizationApi.html#getAuthorizationRoles) | Retrieve a list of all roles defined for the organization |
| [**getUserRoles**](AuthorizationApi.html#getUserRoles) | Returns a listing of roles and permissions for a user. |
| [**patchAuthorizationRole**](AuthorizationApi.html#patchAuthorizationRole) | Patch Organization Role for needsUpdate Field |
| [**postAuthorizationRoleComparedefaultRightRoleId**](AuthorizationApi.html#postAuthorizationRoleComparedefaultRightRoleId) | Get an unsaved org role to default role comparison |
| [**postAuthorizationRoles**](AuthorizationApi.html#postAuthorizationRoles) | Create an organization role. |
| [**postAuthorizationRolesDefault**](AuthorizationApi.html#postAuthorizationRolesDefault) | Restores all default roles |
| [**putAuthorizationRole**](AuthorizationApi.html#putAuthorizationRole) | Update an organization role. |
| [**putAuthorizationRoleUsersAdd**](AuthorizationApi.html#putAuthorizationRoleUsersAdd) | Sets the users for the role |
| [**putAuthorizationRoleUsersRemove**](AuthorizationApi.html#putAuthorizationRoleUsersRemove) | Removes the users from the role |
| [**putAuthorizationRolesDefault**](AuthorizationApi.html#putAuthorizationRolesDefault) | Restore specified default roles |
| [**putUserRoles**](AuthorizationApi.html#putUserRoles) | Sets the user&#39;s roles |
{: class="table table-striped"}

<a name="deleteAuthorizationRole"></a>

# **deleteAuthorizationRole**

> Void deleteAuthorizationRole(roleId)

Delete an organization role.



Wraps DELETE /api/v2/authorization/roles/{roleId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AuthorizationApi apiInstance = new AuthorizationApi();
String roleId = "roleId_example"; // String | Role ID
try {
    apiInstance.deleteAuthorizationRole(roleId);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#deleteAuthorizationRole");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roleId** | **String**| Role ID | |
{: class="table table-striped"}

### Return type

null (empty response body)

<a name="deleteUserRoles"></a>

# **deleteUserRoles**

> Void deleteUserRoles(userId)

Removes all the roles from the user.



Wraps DELETE /api/v2/users/{userId}/roles  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AuthorizationApi apiInstance = new AuthorizationApi();
String userId = "userId_example"; // String | User ID
try {
    apiInstance.deleteUserRoles(userId);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#deleteUserRoles");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | |
{: class="table table-striped"}

### Return type

null (empty response body)

<a name="getAuthorizationPermissions"></a>

# **getAuthorizationPermissions**

> [PermissionCollectionEntityListing](PermissionCollectionEntityListing.html) getAuthorizationPermissions(pageSize, pageNumber)

Get all permissions.

Retrieve a list of all permission defined in the system.

Wraps GET /api/v2/authorization/permissions  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AuthorizationApi apiInstance = new AuthorizationApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    PermissionCollectionEntityListing result = apiInstance.getAuthorizationPermissions(pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationPermissions");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] |
{: class="table table-striped"}

### Return type

[**PermissionCollectionEntityListing**](PermissionCollectionEntityListing.html)

<a name="getAuthorizationProducts"></a>

# **getAuthorizationProducts**

> [OrganizationProductEntityListing](OrganizationProductEntityListing.html) getAuthorizationProducts()

Get the list of enabled products

Gets the list of enabled products. Some example product names are: collaborateFree, collaboratePro, communicate, and engage.

Wraps GET /api/v2/authorization/products  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AuthorizationApi apiInstance = new AuthorizationApi();
try {
    OrganizationProductEntityListing result = apiInstance.getAuthorizationProducts();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationProducts");
    e.printStackTrace();
}
~~~

### Parameters

This endpoint does not require any parameters.
{: class="table table-striped"}

### Return type

[**OrganizationProductEntityListing**](OrganizationProductEntityListing.html)

<a name="getAuthorizationRole"></a>

# **getAuthorizationRole**

> [DomainOrganizationRole](DomainOrganizationRole.html) getAuthorizationRole(roleId)

Get a single organization role.

Get the organization role specified by its ID.

Wraps GET /api/v2/authorization/roles/{roleId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AuthorizationApi apiInstance = new AuthorizationApi();
String roleId = "roleId_example"; // String | Role ID
try {
    DomainOrganizationRole result = apiInstance.getAuthorizationRole(roleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationRole");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roleId** | **String**| Role ID | |
{: class="table table-striped"}

### Return type

[**DomainOrganizationRole**](DomainOrganizationRole.html)

<a name="getAuthorizationRoleComparedefaultRightRoleId"></a>

# **getAuthorizationRoleComparedefaultRightRoleId**

> [DomainOrgRoleDifference](DomainOrgRoleDifference.html) getAuthorizationRoleComparedefaultRightRoleId(leftRoleId, rightRoleId)

Get an org role to default role comparison comparison

Compares any organization role to a default role id and show differences

Wraps GET /api/v2/authorization/roles/{leftRoleId}/comparedefault/{rightRoleId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

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
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **leftRoleId** | **String**| Left Role ID | |
| **rightRoleId** | **String**| Right Role id | |
{: class="table table-striped"}

### Return type

[**DomainOrgRoleDifference**](DomainOrgRoleDifference.html)

<a name="getAuthorizationRoles"></a>

# **getAuthorizationRoles**

> [OrganizationRoleEntityListing](OrganizationRoleEntityListing.html) getAuthorizationRoles(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, permission, defaultRoleId, userCount)

Retrieve a list of all roles defined for the organization



Wraps GET /api/v2/authorization/roles  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AuthorizationApi apiInstance = new AuthorizationApi();
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<Object> expand = null; // List<Object> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
List<Object> permission = null; // List<Object> | 
List<Object> defaultRoleId = null; // List<Object> | 
Boolean userCount = true; // Boolean | 
try {
    OrganizationRoleEntityListing result = apiInstance.getAuthorizationRoles(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, permission, defaultRoleId, userCount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationRoles");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| The total page size requested | [optional] [default to 25] |
| **pageNumber** | **Integer**| The page number requested | [optional] [default to 1] |
| **sortBy** | **String**| variable name requested to sort by | [optional] |
| **expand** | [**List&lt;Object&gt;**](Object.html)| variable name requested by expand list | [optional] |
| **nextPage** | **String**| next page token | [optional] |
| **previousPage** | **String**| Previous page token | [optional] |
| **permission** | [**List&lt;Object&gt;**](Object.html)|  | [optional] |
| **defaultRoleId** | [**List&lt;Object&gt;**](Object.html)|  | [optional] |
| **userCount** | **Boolean**|  | [optional] [default to true] |
{: class="table table-striped"}

### Return type

[**OrganizationRoleEntityListing**](OrganizationRoleEntityListing.html)

<a name="getUserRoles"></a>

# **getUserRoles**

> [UserAuthorization](UserAuthorization.html) getUserRoles(userId)

Returns a listing of roles and permissions for a user.



Wraps GET /api/v2/users/{userId}/roles  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AuthorizationApi apiInstance = new AuthorizationApi();
String userId = "userId_example"; // String | User ID
try {
    UserAuthorization result = apiInstance.getUserRoles(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getUserRoles");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | |
{: class="table table-striped"}

### Return type

[**UserAuthorization**](UserAuthorization.html)

<a name="patchAuthorizationRole"></a>

# **patchAuthorizationRole**

> [DomainOrganizationRole](DomainOrganizationRole.html) patchAuthorizationRole(roleId, body)

Patch Organization Role for needsUpdate Field

Patch Organization Role for needsUpdate Field

Wraps PATCH /api/v2/authorization/roles/{roleId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

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
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roleId** | **String**| Role ID | |
| **body** | [**DomainOrganizationRole**](DomainOrganizationRole.html)| Organization role | |
{: class="table table-striped"}

### Return type

[**DomainOrganizationRole**](DomainOrganizationRole.html)

<a name="postAuthorizationRoleComparedefaultRightRoleId"></a>

# **postAuthorizationRoleComparedefaultRightRoleId**

> [DomainOrgRoleDifference](DomainOrgRoleDifference.html) postAuthorizationRoleComparedefaultRightRoleId(leftRoleId, rightRoleId, body)

Get an unsaved org role to default role comparison

Allows users to compare their existing roles in an unsaved state to its default role

Wraps POST /api/v2/authorization/roles/{leftRoleId}/comparedefault/{rightRoleId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

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
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **leftRoleId** | **String**| Left Role ID | |
| **rightRoleId** | **String**| Right Role id | |
| **body** | [**DomainOrganizationRole**](DomainOrganizationRole.html)| Organization role | |
{: class="table table-striped"}

### Return type

[**DomainOrgRoleDifference**](DomainOrgRoleDifference.html)

<a name="postAuthorizationRoles"></a>

# **postAuthorizationRoles**

> [DomainOrganizationRole](DomainOrganizationRole.html) postAuthorizationRoles(body)

Create an organization role.



Wraps POST /api/v2/authorization/roles  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AuthorizationApi apiInstance = new AuthorizationApi();
DomainOrganizationRoleCreate body = new DomainOrganizationRoleCreate(); // DomainOrganizationRoleCreate | Organization role
try {
    DomainOrganizationRole result = apiInstance.postAuthorizationRoles(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#postAuthorizationRoles");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**DomainOrganizationRoleCreate**](DomainOrganizationRoleCreate.html)| Organization role | |
{: class="table table-striped"}

### Return type

[**DomainOrganizationRole**](DomainOrganizationRole.html)

<a name="postAuthorizationRolesDefault"></a>

# **postAuthorizationRolesDefault**

> [OrganizationRoleEntityListing](OrganizationRoleEntityListing.html) postAuthorizationRolesDefault(force)

Restores all default roles

This endpoint serves several purposes. 1. It provides the org with default roles. This is important for default roles that will be added after go-live (they can retroactively add the new default-role). Note: When not using a query param of force=true, it only adds the default roles not configured for the org; it does not overwrite roles. 2. Using the query param force=true, you can restore all default roles. Note: This does not have an effect on custom roles.

Wraps POST /api/v2/authorization/roles/default  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AuthorizationApi apiInstance = new AuthorizationApi();
Boolean force = false; // Boolean | Restore default roles
try {
    OrganizationRoleEntityListing result = apiInstance.postAuthorizationRolesDefault(force);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#postAuthorizationRolesDefault");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **force** | **Boolean**| Restore default roles | [optional] [default to false] |
{: class="table table-striped"}

### Return type

[**OrganizationRoleEntityListing**](OrganizationRoleEntityListing.html)

<a name="putAuthorizationRole"></a>

# **putAuthorizationRole**

> [DomainOrganizationRole](DomainOrganizationRole.html) putAuthorizationRole(roleId, body)

Update an organization role.

Update

Wraps PUT /api/v2/authorization/roles/{roleId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

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
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roleId** | **String**| Role ID | |
| **body** | [**DomainOrganizationRoleUpdate**](DomainOrganizationRoleUpdate.html)| Organization role | |
{: class="table table-striped"}

### Return type

[**DomainOrganizationRole**](DomainOrganizationRole.html)

<a name="putAuthorizationRoleUsersAdd"></a>

# **putAuthorizationRoleUsersAdd**

> List&lt;String&gt; putAuthorizationRoleUsersAdd(roleId, body)

Sets the users for the role



Wraps PUT /api/v2/authorization/roles/{roleId}/users/add  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AuthorizationApi apiInstance = new AuthorizationApi();
String roleId = "roleId_example"; // String | Role ID
List<String> body = Arrays.asList(new List<String>()); // List<String> | List of user IDs
try {
    List<String> result = apiInstance.putAuthorizationRoleUsersAdd(roleId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#putAuthorizationRoleUsersAdd");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roleId** | **String**| Role ID | |
| **body** | **List&lt;String&gt;**| List of user IDs | |
{: class="table table-striped"}

### Return type

**List&lt;String&gt;**

<a name="putAuthorizationRoleUsersRemove"></a>

# **putAuthorizationRoleUsersRemove**

> List&lt;String&gt; putAuthorizationRoleUsersRemove(roleId, body)

Removes the users from the role



Wraps PUT /api/v2/authorization/roles/{roleId}/users/remove  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AuthorizationApi apiInstance = new AuthorizationApi();
String roleId = "roleId_example"; // String | Role ID
List<String> body = Arrays.asList(new List<String>()); // List<String> | List of user IDs
try {
    List<String> result = apiInstance.putAuthorizationRoleUsersRemove(roleId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#putAuthorizationRoleUsersRemove");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roleId** | **String**| Role ID | |
| **body** | **List&lt;String&gt;**| List of user IDs | |
{: class="table table-striped"}

### Return type

**List&lt;String&gt;**

<a name="putAuthorizationRolesDefault"></a>

# **putAuthorizationRolesDefault**

> [OrganizationRoleEntityListing](OrganizationRoleEntityListing.html) putAuthorizationRolesDefault(body)

Restore specified default roles



Wraps PUT /api/v2/authorization/roles/default  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AuthorizationApi apiInstance = new AuthorizationApi();
List<DomainOrganizationRole> body = Arrays.asList(new DomainOrganizationRole()); // List<DomainOrganizationRole> | Organization roles list
try {
    OrganizationRoleEntityListing result = apiInstance.putAuthorizationRolesDefault(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#putAuthorizationRolesDefault");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**List&lt;DomainOrganizationRole&gt;**](DomainOrganizationRole.html)| Organization roles list | |
{: class="table table-striped"}

### Return type

[**OrganizationRoleEntityListing**](OrganizationRoleEntityListing.html)

<a name="putUserRoles"></a>

# **putUserRoles**

> [UserAuthorization](UserAuthorization.html) putUserRoles(userId, body)

Sets the user&#39;s roles



Wraps PUT /api/v2/users/{userId}/roles  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AuthorizationApi apiInstance = new AuthorizationApi();
String userId = "userId_example"; // String | User ID
List<String> body = Arrays.asList(new List<String>()); // List<String> | List of roles
try {
    UserAuthorization result = apiInstance.putUserRoles(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#putUserRoles");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | |
| **body** | **List&lt;String&gt;**| List of roles | |
{: class="table table-striped"}

### Return type

[**UserAuthorization**](UserAuthorization.html)

