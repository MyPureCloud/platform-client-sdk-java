---
title: SCIMApi
---
## SCIMApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteScimUser**](SCIMApi.html#deleteScimUser) | Soft delete user with specified ID |
| [**deleteScimV2User**](SCIMApi.html#deleteScimV2User) | Soft delete user with specified ID |
| [**getScimGroup**](SCIMApi.html#getScimGroup) | Return Group with specified ID |
| [**getScimGroups**](SCIMApi.html#getScimGroups) | Query Groups |
| [**getScimUser**](SCIMApi.html#getScimUser) | Return user with specified ID (default version) |
| [**getScimUsers**](SCIMApi.html#getScimUsers) | Query Users |
| [**getScimV2Group**](SCIMApi.html#getScimV2Group) | Return Group with specified ID |
| [**getScimV2Groups**](SCIMApi.html#getScimV2Groups) | Query Groups |
| [**getScimV2Serviceproviderconfig**](SCIMApi.html#getScimV2Serviceproviderconfig) | Get SCIM Configuration |
| [**getScimV2User**](SCIMApi.html#getScimV2User) | Return User with specified ID |
| [**getScimV2Users**](SCIMApi.html#getScimV2Users) | Query Users |
| [**patchScimGroup**](SCIMApi.html#patchScimGroup) | Update Group with specified ID |
| [**patchScimUser**](SCIMApi.html#patchScimUser) | Patch user with specified ID |
| [**patchScimV2Group**](SCIMApi.html#patchScimV2Group) | Update Group with specified ID |
| [**patchScimV2User**](SCIMApi.html#patchScimV2User) | Update user with specified ID |
| [**postScimUsers**](SCIMApi.html#postScimUsers) | Create user |
| [**postScimV2Users**](SCIMApi.html#postScimV2Users) | Create user |
| [**putScimGroup**](SCIMApi.html#putScimGroup) | Update Group with specified ID |
| [**putScimUser**](SCIMApi.html#putScimUser) | Update user with specified ID |
| [**putScimV2Group**](SCIMApi.html#putScimV2Group) | Update Group with specified ID |
| [**putScimV2User**](SCIMApi.html#putScimV2User) | Update user with specified ID |
{: class="table-striped"}

<a name="deleteScimUser"></a>

# **deleteScimUser**



> [Empty](Empty.html) deleteScimUser(userId, ifMatch)

Soft delete user with specified ID



Wraps DELETE /api/v2/scim/users/{userId}  

Requires ANY permissions: 

* directory:user:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SCIMApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SCIMApi apiInstance = new SCIMApi();
String userId = "userId_example"; // String | 
String ifMatch = "ifMatch_example"; // String | If-Match for ETag version checking
try {
    Empty result = apiInstance.deleteScimUser(userId, ifMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#deleteScimUser");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**|  | 
| **ifMatch** | **String**| If-Match for ETag version checking | [optional] 
{: class="table-striped"}


### Return type

[**Empty**](Empty.html)

<a name="deleteScimV2User"></a>

# **deleteScimV2User**



> [Empty](Empty.html) deleteScimV2User(userId, ifMatch)

Soft delete user with specified ID



Wraps DELETE /api/v2/scim/v2/users/{userId}  

Requires ANY permissions: 

* directory:user:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SCIMApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SCIMApi apiInstance = new SCIMApi();
String userId = "userId_example"; // String | 
String ifMatch = "ifMatch_example"; // String | If-Match for ETag version checking
try {
    Empty result = apiInstance.deleteScimV2User(userId, ifMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#deleteScimV2User");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**|  | 
| **ifMatch** | **String**| If-Match for ETag version checking | [optional] 
{: class="table-striped"}


### Return type

[**Empty**](Empty.html)

<a name="getScimGroup"></a>

# **getScimGroup**



> [ScimV2Group](ScimV2Group.html) getScimGroup(groupId, ifNoneMatch)

Return Group with specified ID



Wraps GET /api/v2/scim/groups/{groupId}  

Requires ANY permissions: 

* directory:group:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SCIMApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SCIMApi apiInstance = new SCIMApi();
String groupId = "groupId_example"; // String | 
String ifNoneMatch = "ifNoneMatch_example"; // String | If-None-Match for ETag version checking
try {
    ScimV2Group result = apiInstance.getScimGroup(groupId, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#getScimGroup");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **groupId** | **String**|  | 
| **ifNoneMatch** | **String**| If-None-Match for ETag version checking | [optional] 
{: class="table-striped"}


### Return type

[**ScimV2Group**](ScimV2Group.html)

<a name="getScimGroups"></a>

# **getScimGroups**



> [ScimListResponse](ScimListResponse.html) getScimGroups(startIndex, count, filter)

Query Groups



Wraps GET /api/v2/scim/groups  

Requires ANY permissions: 

* directory:group:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SCIMApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SCIMApi apiInstance = new SCIMApi();
Integer startIndex = 1; // Integer | Starting item of request. 1-based
Integer count = 25; // Integer | The requested number of items per page. A value of 0 will return no results other than the totalResults count.
String filter = "displayName eq groupName"; // String | filter parameter e.g. displayName eq groupName
try {
    ScimListResponse result = apiInstance.getScimGroups(startIndex, count, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#getScimGroups");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **startIndex** | **Integer**| Starting item of request. 1-based | [optional] [default to 1] 
| **count** | **Integer**| The requested number of items per page. A value of 0 will return no results other than the totalResults count. | [optional] [default to 25] 
| **filter** | **String**| filter parameter e.g. displayName eq groupName | [optional] 
{: class="table-striped"}


### Return type

[**ScimListResponse**](ScimListResponse.html)

<a name="getScimUser"></a>

# **getScimUser**



> [ScimV2User](ScimV2User.html) getScimUser(userId, ifNoneMatch)

Return user with specified ID (default version)



Wraps GET /api/v2/scim/users/{userId}  

Requires ANY permissions: 

* directory:user:view
* directory:user:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SCIMApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SCIMApi apiInstance = new SCIMApi();
String userId = "userId_example"; // String | 
String ifNoneMatch = "ifNoneMatch_example"; // String | If-None-Match for ETag version checking
try {
    ScimV2User result = apiInstance.getScimUser(userId, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#getScimUser");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**|  | 
| **ifNoneMatch** | **String**| If-None-Match for ETag version checking | [optional] 
{: class="table-striped"}


### Return type

[**ScimV2User**](ScimV2User.html)

<a name="getScimUsers"></a>

# **getScimUsers**



> [ScimListResponse](ScimListResponse.html) getScimUsers(filter, startIndex, count)

Query Users



Wraps GET /api/v2/scim/users  

Requires ANY permissions: 

* directory:user:view
* directory:user:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SCIMApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SCIMApi apiInstance = new SCIMApi();
String filter = "filter_example"; // String | filter parameter e.g. userName eq search@sample.org
Integer startIndex = 1; // Integer | Starting item of request. 1-based
Integer count = 25; // Integer | The requested number of items per page. A value of 0 will return no results other than the totalResults count.
try {
    ScimListResponse result = apiInstance.getScimUsers(filter, startIndex, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#getScimUsers");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **filter** | **String**| filter parameter e.g. userName eq search@sample.org | 
| **startIndex** | **Integer**| Starting item of request. 1-based | [optional] [default to 1] 
| **count** | **Integer**| The requested number of items per page. A value of 0 will return no results other than the totalResults count. | [optional] [default to 25] 
{: class="table-striped"}


### Return type

[**ScimListResponse**](ScimListResponse.html)

<a name="getScimV2Group"></a>

# **getScimV2Group**



> [ScimV2Group](ScimV2Group.html) getScimV2Group(groupId, ifNoneMatch)

Return Group with specified ID



Wraps GET /api/v2/scim/v2/groups/{groupId}  

Requires ANY permissions: 

* directory:group:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SCIMApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SCIMApi apiInstance = new SCIMApi();
String groupId = "groupId_example"; // String | 
String ifNoneMatch = "ifNoneMatch_example"; // String | If-None-Match for ETag version checking
try {
    ScimV2Group result = apiInstance.getScimV2Group(groupId, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#getScimV2Group");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **groupId** | **String**|  | 
| **ifNoneMatch** | **String**| If-None-Match for ETag version checking | [optional] 
{: class="table-striped"}


### Return type

[**ScimV2Group**](ScimV2Group.html)

<a name="getScimV2Groups"></a>

# **getScimV2Groups**



> [ScimListResponse](ScimListResponse.html) getScimV2Groups(filter, startIndex, count)

Query Groups



Wraps GET /api/v2/scim/v2/groups  

Requires ANY permissions: 

* directory:group:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SCIMApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SCIMApi apiInstance = new SCIMApi();
String filter = "displayName eq groupName"; // String | filter parameter e.g. displayName eq groupName
Integer startIndex = 1; // Integer | Starting item of request. 1-based
Integer count = 25; // Integer | The requested number of items per page. A value of 0 will return no results other than the totalResults count.
try {
    ScimListResponse result = apiInstance.getScimV2Groups(filter, startIndex, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#getScimV2Groups");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **filter** | **String**| filter parameter e.g. displayName eq groupName | 
| **startIndex** | **Integer**| Starting item of request. 1-based | [optional] [default to 1] 
| **count** | **Integer**| The requested number of items per page. A value of 0 will return no results other than the totalResults count. | [optional] [default to 25] 
{: class="table-striped"}


### Return type

[**ScimListResponse**](ScimListResponse.html)

<a name="getScimV2Serviceproviderconfig"></a>

# **getScimV2Serviceproviderconfig**



> [ScimServiceProviderConfig](ScimServiceProviderConfig.html) getScimV2Serviceproviderconfig(ifNoneMatch)

Get SCIM Configuration



Wraps GET /api/v2/scim/v2/serviceproviderconfig  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.api.SCIMApi;


SCIMApi apiInstance = new SCIMApi();
String ifNoneMatch = "ifNoneMatch_example"; // String | If-None-Match for ETag version checking
try {
    ScimServiceProviderConfig result = apiInstance.getScimV2Serviceproviderconfig(ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#getScimV2Serviceproviderconfig");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ifNoneMatch** | **String**| If-None-Match for ETag version checking | [optional] 
{: class="table-striped"}


### Return type

[**ScimServiceProviderConfig**](ScimServiceProviderConfig.html)

<a name="getScimV2User"></a>

# **getScimV2User**



> [ScimV2User](ScimV2User.html) getScimV2User(userId, ifNoneMatch)

Return User with specified ID



Wraps GET /api/v2/scim/v2/users/{userId}  

Requires ANY permissions: 

* directory:user:view
* directory:user:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SCIMApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SCIMApi apiInstance = new SCIMApi();
String userId = "userId_example"; // String | 
String ifNoneMatch = "ifNoneMatch_example"; // String | If-None-Match for ETag version checking
try {
    ScimV2User result = apiInstance.getScimV2User(userId, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#getScimV2User");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**|  | 
| **ifNoneMatch** | **String**| If-None-Match for ETag version checking | [optional] 
{: class="table-striped"}


### Return type

[**ScimV2User**](ScimV2User.html)

<a name="getScimV2Users"></a>

# **getScimV2Users**



> [ScimListResponse](ScimListResponse.html) getScimV2Users(filter, startIndex, count)

Query Users



Wraps GET /api/v2/scim/v2/users  

Requires ANY permissions: 

* directory:user:view
* directory:user:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SCIMApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SCIMApi apiInstance = new SCIMApi();
String filter = "filter_example"; // String | filter parameter e.g. userName eq search@sample.org
Integer startIndex = 1; // Integer | Starting item of request. 1-based
Integer count = 25; // Integer | The requested number of items per page. A value of 0 will return no results other than the totalResults count.
try {
    ScimListResponse result = apiInstance.getScimV2Users(filter, startIndex, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#getScimV2Users");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **filter** | **String**| filter parameter e.g. userName eq search@sample.org | 
| **startIndex** | **Integer**| Starting item of request. 1-based | [optional] [default to 1] 
| **count** | **Integer**| The requested number of items per page. A value of 0 will return no results other than the totalResults count. | [optional] [default to 25] 
{: class="table-striped"}


### Return type

[**ScimListResponse**](ScimListResponse.html)

<a name="patchScimGroup"></a>

# **patchScimGroup**



> [ScimV2Group](ScimV2Group.html) patchScimGroup(groupId, body, ifMatch)

Update Group with specified ID



Wraps PATCH /api/v2/scim/groups/{groupId}  

Requires ANY permissions: 

* directory:group:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SCIMApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SCIMApi apiInstance = new SCIMApi();
String groupId = "groupId_example"; // String | 
PatchRequest body = new PatchRequest(); // PatchRequest | Group
String ifMatch = "ifMatch_example"; // String | If-Match for ETag version checking
try {
    ScimV2Group result = apiInstance.patchScimGroup(groupId, body, ifMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#patchScimGroup");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **groupId** | **String**|  | 
| **body** | [**PatchRequest**](PatchRequest.html)| Group | 
| **ifMatch** | **String**| If-Match for ETag version checking | [optional] 
{: class="table-striped"}


### Return type

[**ScimV2Group**](ScimV2Group.html)

<a name="patchScimUser"></a>

# **patchScimUser**



> [ScimV2User](ScimV2User.html) patchScimUser(userId, body, ifMatch)

Patch user with specified ID



Wraps PATCH /api/v2/scim/users/{userId}  

Requires ANY permissions: 

* directory:user:edit
* directory:user:setPassword

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SCIMApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SCIMApi apiInstance = new SCIMApi();
String userId = "userId_example"; // String | 
ScimV2PatchRequest body = new ScimV2PatchRequest(); // ScimV2PatchRequest | SCIM Patch Request
String ifMatch = "ifMatch_example"; // String | If-Match for ETag version checking
try {
    ScimV2User result = apiInstance.patchScimUser(userId, body, ifMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#patchScimUser");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**|  | 
| **body** | [**ScimV2PatchRequest**](ScimV2PatchRequest.html)| SCIM Patch Request | 
| **ifMatch** | **String**| If-Match for ETag version checking | [optional] 
{: class="table-striped"}


### Return type

[**ScimV2User**](ScimV2User.html)

<a name="patchScimV2Group"></a>

# **patchScimV2Group**



> [ScimV2Group](ScimV2Group.html) patchScimV2Group(groupId, body, ifMatch)

Update Group with specified ID



Wraps PATCH /api/v2/scim/v2/groups/{groupId}  

Requires ANY permissions: 

* directory:group:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SCIMApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SCIMApi apiInstance = new SCIMApi();
String groupId = "groupId_example"; // String | 
PatchRequest body = new PatchRequest(); // PatchRequest | Group
String ifMatch = "ifMatch_example"; // String | If-Match for ETag version checking
try {
    ScimV2Group result = apiInstance.patchScimV2Group(groupId, body, ifMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#patchScimV2Group");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **groupId** | **String**|  | 
| **body** | [**PatchRequest**](PatchRequest.html)| Group | 
| **ifMatch** | **String**| If-Match for ETag version checking | [optional] 
{: class="table-striped"}


### Return type

[**ScimV2Group**](ScimV2Group.html)

<a name="patchScimV2User"></a>

# **patchScimV2User**



> [ScimV2User](ScimV2User.html) patchScimV2User(userId, body, ifMatch)

Update user with specified ID



Wraps PATCH /api/v2/scim/v2/users/{userId}  

Requires ANY permissions: 

* directory:user:edit
* directory:user:setPassword

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SCIMApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SCIMApi apiInstance = new SCIMApi();
String userId = "userId_example"; // String | User Id
ScimV2PatchRequest body = new ScimV2PatchRequest(); // ScimV2PatchRequest | SCIM Patch Request
String ifMatch = "ifMatch_example"; // String | If-Match for ETag version checking
try {
    ScimV2User result = apiInstance.patchScimV2User(userId, body, ifMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#patchScimV2User");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User Id | 
| **body** | [**ScimV2PatchRequest**](ScimV2PatchRequest.html)| SCIM Patch Request | 
| **ifMatch** | **String**| If-Match for ETag version checking | [optional] 
{: class="table-striped"}


### Return type

[**ScimV2User**](ScimV2User.html)

<a name="postScimUsers"></a>

# **postScimUsers**



> [ScimV2User](ScimV2User.html) postScimUsers(body)

Create user



Wraps POST /api/v2/scim/users  

Requires ANY permissions: 

* directory:user:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SCIMApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SCIMApi apiInstance = new SCIMApi();
ScimV2CreateUser body = new ScimV2CreateUser(); // ScimV2CreateUser | SCIM Create User
try {
    ScimV2User result = apiInstance.postScimUsers(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#postScimUsers");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**ScimV2CreateUser**](ScimV2CreateUser.html)| SCIM Create User | 
{: class="table-striped"}


### Return type

[**ScimV2User**](ScimV2User.html)

<a name="postScimV2Users"></a>

# **postScimV2Users**



> [ScimV2User](ScimV2User.html) postScimV2Users(body)

Create user



Wraps POST /api/v2/scim/v2/users  

Requires ANY permissions: 

* directory:user:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SCIMApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SCIMApi apiInstance = new SCIMApi();
ScimV2CreateUser body = new ScimV2CreateUser(); // ScimV2CreateUser | SCIM Create User
try {
    ScimV2User result = apiInstance.postScimV2Users(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#postScimV2Users");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**ScimV2CreateUser**](ScimV2CreateUser.html)| SCIM Create User | 
{: class="table-striped"}


### Return type

[**ScimV2User**](ScimV2User.html)

<a name="putScimGroup"></a>

# **putScimGroup**



> [ScimV2Group](ScimV2Group.html) putScimGroup(groupId, body, ifMatch)

Update Group with specified ID



Wraps PUT /api/v2/scim/groups/{groupId}  

Requires ANY permissions: 

* directory:group:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SCIMApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SCIMApi apiInstance = new SCIMApi();
String groupId = "groupId_example"; // String | 
ScimV2Group body = new ScimV2Group(); // ScimV2Group | Group
String ifMatch = "ifMatch_example"; // String | If-Match for ETag version checking
try {
    ScimV2Group result = apiInstance.putScimGroup(groupId, body, ifMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#putScimGroup");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **groupId** | **String**|  | 
| **body** | [**ScimV2Group**](ScimV2Group.html)| Group | 
| **ifMatch** | **String**| If-Match for ETag version checking | [optional] 
{: class="table-striped"}


### Return type

[**ScimV2Group**](ScimV2Group.html)

<a name="putScimUser"></a>

# **putScimUser**



> [ScimV2User](ScimV2User.html) putScimUser(userId, body, ifMatch)

Update user with specified ID



Wraps PUT /api/v2/scim/users/{userId}  

Requires ANY permissions: 

* directory:user:edit
* directory:user:setPassword

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SCIMApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SCIMApi apiInstance = new SCIMApi();
String userId = "userId_example"; // String | 
ScimV2User body = new ScimV2User(); // ScimV2User | User
String ifMatch = "ifMatch_example"; // String | If-Match for ETag version checking
try {
    ScimV2User result = apiInstance.putScimUser(userId, body, ifMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#putScimUser");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**|  | 
| **body** | [**ScimV2User**](ScimV2User.html)| User | 
| **ifMatch** | **String**| If-Match for ETag version checking | [optional] 
{: class="table-striped"}


### Return type

[**ScimV2User**](ScimV2User.html)

<a name="putScimV2Group"></a>

# **putScimV2Group**



> [ScimV2Group](ScimV2Group.html) putScimV2Group(groupId, body, ifMatch)

Update Group with specified ID



Wraps PUT /api/v2/scim/v2/groups/{groupId}  

Requires ANY permissions: 

* directory:group:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SCIMApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SCIMApi apiInstance = new SCIMApi();
String groupId = "groupId_example"; // String | 
ScimV2Group body = new ScimV2Group(); // ScimV2Group | Group
String ifMatch = "ifMatch_example"; // String | If-Match for ETag version checking
try {
    ScimV2Group result = apiInstance.putScimV2Group(groupId, body, ifMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#putScimV2Group");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **groupId** | **String**|  | 
| **body** | [**ScimV2Group**](ScimV2Group.html)| Group | 
| **ifMatch** | **String**| If-Match for ETag version checking | [optional] 
{: class="table-striped"}


### Return type

[**ScimV2Group**](ScimV2Group.html)

<a name="putScimV2User"></a>

# **putScimV2User**



> [ScimV2User](ScimV2User.html) putScimV2User(userId, body, ifMatch)

Update user with specified ID



Wraps PUT /api/v2/scim/v2/users/{userId}  

Requires ANY permissions: 

* directory:user:edit
* directory:user:setPassword

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SCIMApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SCIMApi apiInstance = new SCIMApi();
String userId = "userId_example"; // String | User Id
ScimV2User body = new ScimV2User(); // ScimV2User | User
String ifMatch = "ifMatch_example"; // String | If-Match for ETag version checking
try {
    ScimV2User result = apiInstance.putScimV2User(userId, body, ifMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#putScimV2User");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User Id | 
| **body** | [**ScimV2User**](ScimV2User.html)| User | 
| **ifMatch** | **String**| If-Match for ETag version checking | [optional] 
{: class="table-striped"}


### Return type

[**ScimV2User**](ScimV2User.html)

