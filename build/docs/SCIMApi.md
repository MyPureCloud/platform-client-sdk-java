---
title: SCIMApi
---
## SCIMApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteScimUser**](SCIMApi.html#deleteScimUser) | Delete a user |
| [**deleteScimV2User**](SCIMApi.html#deleteScimV2User) | Delete a user |
| [**getScimGroup**](SCIMApi.html#getScimGroup) | Get a group |
| [**getScimGroups**](SCIMApi.html#getScimGroups) | Get a list of groups |
| [**getScimResourcetype**](SCIMApi.html#getScimResourcetype) | Get a resource type |
| [**getScimResourcetypes**](SCIMApi.html#getScimResourcetypes) | Get a list of resource types |
| [**getScimSchema**](SCIMApi.html#getScimSchema) | Get a SCIM schema |
| [**getScimSchemas**](SCIMApi.html#getScimSchemas) | Get a list of SCIM schemas |
| [**getScimServiceproviderconfig**](SCIMApi.html#getScimServiceproviderconfig) | Get a service provider's configuration |
| [**getScimUser**](SCIMApi.html#getScimUser) | Get a user |
| [**getScimUsers**](SCIMApi.html#getScimUsers) | Get a list of users |
| [**getScimV2Group**](SCIMApi.html#getScimV2Group) | Get a group |
| [**getScimV2Groups**](SCIMApi.html#getScimV2Groups) | Get a list of groups |
| [**getScimV2Resourcetype**](SCIMApi.html#getScimV2Resourcetype) | Get a resource type |
| [**getScimV2Resourcetypes**](SCIMApi.html#getScimV2Resourcetypes) | Get a list of resource types |
| [**getScimV2Schema**](SCIMApi.html#getScimV2Schema) | Get a SCIM schema |
| [**getScimV2Schemas**](SCIMApi.html#getScimV2Schemas) | Get a list of SCIM schemas |
| [**getScimV2Serviceproviderconfig**](SCIMApi.html#getScimV2Serviceproviderconfig) | Get a service provider's configuration |
| [**getScimV2User**](SCIMApi.html#getScimV2User) | Get a user |
| [**getScimV2Users**](SCIMApi.html#getScimV2Users) | Get a list of users |
| [**patchScimGroup**](SCIMApi.html#patchScimGroup) | Modify a group |
| [**patchScimUser**](SCIMApi.html#patchScimUser) | Modify a user |
| [**patchScimV2Group**](SCIMApi.html#patchScimV2Group) | Modify a group |
| [**patchScimV2User**](SCIMApi.html#patchScimV2User) | Modify a user |
| [**postScimUsers**](SCIMApi.html#postScimUsers) | Create a user |
| [**postScimV2Users**](SCIMApi.html#postScimV2Users) | Create a user |
| [**putScimGroup**](SCIMApi.html#putScimGroup) | Replace a group |
| [**putScimUser**](SCIMApi.html#putScimUser) | Replace a user |
| [**putScimV2Group**](SCIMApi.html#putScimV2Group) | Replace a group |
| [**putScimV2User**](SCIMApi.html#putScimV2User) | Replace a user |
{: class="table-striped"}

<a name="deleteScimUser"></a>

# **deleteScimUser**



> Empty deleteScimUser(userId, ifMatch)

Delete a user

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
String userId = "userId_example"; // String | The ID of a user. Returned with GET /api/v2/scim/users.
String ifMatch = "ifMatch_example"; // String | The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/users/{userId}. Example: \"42\". If the ETag is different from the version on the server, returns 400 with a \"scimType\" of \"invalidVers\".
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
| **userId** | **String**| The ID of a user. Returned with GET /api/v2/scim/users. | 
| **ifMatch** | **String**| The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/users/{userId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns 400 with a \&quot;scimType\&quot; of \&quot;invalidVers\&quot;. | [optional] 
{: class="table-striped"}


### Return type

**Empty**

<a name="deleteScimV2User"></a>

# **deleteScimV2User**



> Empty deleteScimV2User(userId, ifMatch)

Delete a user

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
String userId = "userId_example"; // String | The ID of a user. Returned with GET /api/v2/scim/v2/users.
String ifMatch = "ifMatch_example"; // String | The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/v2/users/{userId}. Example: \"42\". If the ETag is different from the version on the server, returns 400 with a \"scimType\" of \"invalidVers\".
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
| **userId** | **String**| The ID of a user. Returned with GET /api/v2/scim/v2/users. | 
| **ifMatch** | **String**| The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/v2/users/{userId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns 400 with a \&quot;scimType\&quot; of \&quot;invalidVers\&quot;. | [optional] 
{: class="table-striped"}


### Return type

**Empty**

<a name="getScimGroup"></a>

# **getScimGroup**



> [ScimV2Group](ScimV2Group.html) getScimGroup(groupId, attributes, excludedAttributes, ifNoneMatch)

Get a group

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
String groupId = "groupId_example"; // String | The ID of a group. Returned with GET /api/v2/scim/groups.
List<String> attributes = Arrays.asList(null); // List<String> | Indicates which attributes to include. Returns these attributes and the \"id\", \"active\", and \"meta\" attributes. Use \"attributes\" to avoid expensive secondary calls for the default attributes.
List<String> excludedAttributes = Arrays.asList(null); // List<String> | Indicates which attributes to exclude. Returns the default attributes minus \"excludedAttributes\". Always returns \"id\", \"active\", and \"meta\" attributes. Use \"excludedAttributes\" to avoid expensive secondary calls for the default attributes.
String ifNoneMatch = "ifNoneMatch_example"; // String | The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/groups/{groupId}. Example: \"42\". If the ETag is different from the version on the server, returns the current configuration of the resource. If the ETag is current, returns 304 Not Modified.
try {
    ScimV2Group result = apiInstance.getScimGroup(groupId, attributes, excludedAttributes, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#getScimGroup");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **groupId** | **String**| The ID of a group. Returned with GET /api/v2/scim/groups. | 
| **attributes** | [**List&lt;String&gt;**](String.html)| Indicates which attributes to include. Returns these attributes and the \&quot;id\&quot;, \&quot;active\&quot;, and \&quot;meta\&quot; attributes. Use \&quot;attributes\&quot; to avoid expensive secondary calls for the default attributes. | [optional]<br />**Values**: id, displayName, members, externalId, meta, meta.version, meta.lastModified, urn:ietf:params:scim:schemas:core:2.0:Group:id, urn:ietf:params:scim:schemas:core:2.0:Group:meta, urn:ietf:params:scim:schemas:core:2.0:Group:meta.version, urn:ietf:params:scim:schemas:core:2.0:Group:meta.lastModified, urn:ietf:params:scim:schemas:core:2.0:Group:displayName, urn:ietf:params:scim:schemas:core:2.0:Group:members, urn:ietf:params:scim:schemas:core:2.0:Group:externalId 
| **excludedAttributes** | [**List&lt;String&gt;**](String.html)| Indicates which attributes to exclude. Returns the default attributes minus \&quot;excludedAttributes\&quot;. Always returns \&quot;id\&quot;, \&quot;active\&quot;, and \&quot;meta\&quot; attributes. Use \&quot;excludedAttributes\&quot; to avoid expensive secondary calls for the default attributes. | [optional]<br />**Values**: id, displayName, members, externalId, meta, meta.version, meta.lastModified, urn:ietf:params:scim:schemas:core:2.0:Group:id, urn:ietf:params:scim:schemas:core:2.0:Group:meta, urn:ietf:params:scim:schemas:core:2.0:Group:meta.version, urn:ietf:params:scim:schemas:core:2.0:Group:meta.lastModified, urn:ietf:params:scim:schemas:core:2.0:Group:displayName, urn:ietf:params:scim:schemas:core:2.0:Group:members, urn:ietf:params:scim:schemas:core:2.0:Group:externalId 
| **ifNoneMatch** | **String**| The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/groups/{groupId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns the current configuration of the resource. If the ETag is current, returns 304 Not Modified. | [optional] 
{: class="table-striped"}


### Return type

[**ScimV2Group**](ScimV2Group.html)

<a name="getScimGroups"></a>

# **getScimGroups**



> [ScimGroupListResponse](ScimGroupListResponse.html) getScimGroups(startIndex, count, attributes, excludedAttributes, filter)

Get a list of groups

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
Integer startIndex = 1; // Integer | The 1-based index of the first query result.
Integer count = 25; // Integer | The requested number of items per page. A value of 0 returns \"totalResults\". A page size over 25 may exceed internal resource limits and return a 429 error. For a page size over 25, use the \"excludedAttributes\" or \"attributes\" query parameters to exclude or only include secondary lookup values such as \"externalId\",  \"roles\", \"urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:routingLanguages\", or \"urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:routingSkills\".
List<String> attributes = Arrays.asList(null); // List<String> | Indicates which attributes to include. Returns these attributes and the \"id\", \"active\", and \"meta\" attributes. Use \"attributes\" to avoid expensive secondary calls for the default attributes.
List<String> excludedAttributes = Arrays.asList(null); // List<String> | Indicates which attributes to exclude. Returns the default attributes minus \"excludedAttributes\". Always returns \"id\", \"active\", and \"meta\" attributes. Use \"excludedAttributes\" to avoid expensive secondary calls for the default attributes.
String filter = displayName eq groupName; // String | Filters results. If nothing is specified, returns all groups. Examples of valid values: \"id eq 5f4bc742-a019-4e38-8e2a-d39d5bc0b0f3\", \"displayname eq Sales\".
try {
    ScimGroupListResponse result = apiInstance.getScimGroups(startIndex, count, attributes, excludedAttributes, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#getScimGroups");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **startIndex** | **Integer**| The 1-based index of the first query result. | [optional] [default to 1] 
| **count** | **Integer**| The requested number of items per page. A value of 0 returns \&quot;totalResults\&quot;. A page size over 25 may exceed internal resource limits and return a 429 error. For a page size over 25, use the \&quot;excludedAttributes\&quot; or \&quot;attributes\&quot; query parameters to exclude or only include secondary lookup values such as \&quot;externalId\&quot;,  \&quot;roles\&quot;, \&quot;urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:routingLanguages\&quot;, or \&quot;urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:routingSkills\&quot;. | [optional] [default to 25] 
| **attributes** | [**List&lt;String&gt;**](String.html)| Indicates which attributes to include. Returns these attributes and the \&quot;id\&quot;, \&quot;active\&quot;, and \&quot;meta\&quot; attributes. Use \&quot;attributes\&quot; to avoid expensive secondary calls for the default attributes. | [optional]<br />**Values**: id, displayName, members, externalId, meta, meta.version, meta.lastModified, urn:ietf:params:scim:schemas:core:2.0:Group:id, urn:ietf:params:scim:schemas:core:2.0:Group:meta, urn:ietf:params:scim:schemas:core:2.0:Group:meta.version, urn:ietf:params:scim:schemas:core:2.0:Group:meta.lastModified, urn:ietf:params:scim:schemas:core:2.0:Group:displayName, urn:ietf:params:scim:schemas:core:2.0:Group:members, urn:ietf:params:scim:schemas:core:2.0:Group:externalId 
| **excludedAttributes** | [**List&lt;String&gt;**](String.html)| Indicates which attributes to exclude. Returns the default attributes minus \&quot;excludedAttributes\&quot;. Always returns \&quot;id\&quot;, \&quot;active\&quot;, and \&quot;meta\&quot; attributes. Use \&quot;excludedAttributes\&quot; to avoid expensive secondary calls for the default attributes. | [optional]<br />**Values**: id, displayName, members, externalId, meta, meta.version, meta.lastModified, urn:ietf:params:scim:schemas:core:2.0:Group:id, urn:ietf:params:scim:schemas:core:2.0:Group:meta, urn:ietf:params:scim:schemas:core:2.0:Group:meta.version, urn:ietf:params:scim:schemas:core:2.0:Group:meta.lastModified, urn:ietf:params:scim:schemas:core:2.0:Group:displayName, urn:ietf:params:scim:schemas:core:2.0:Group:members, urn:ietf:params:scim:schemas:core:2.0:Group:externalId 
| **filter** | **String**| Filters results. If nothing is specified, returns all groups. Examples of valid values: \&quot;id eq 5f4bc742-a019-4e38-8e2a-d39d5bc0b0f3\&quot;, \&quot;displayname eq Sales\&quot;. | [optional] [default to null] 
{: class="table-striped"}


### Return type

[**ScimGroupListResponse**](ScimGroupListResponse.html)

<a name="getScimResourcetype"></a>

# **getScimResourcetype**



> [ScimConfigResourceType](ScimConfigResourceType.html) getScimResourcetype(resourceType)

Get a resource type

Wraps GET /api/v2/scim/resourcetypes/{resourceType}  

Requires NO permissions: 


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
String resourceType = "resourceType_example"; // String | The type of resource. Returned with GET /api/v2/scim/resourcetypes.
try {
    ScimConfigResourceType result = apiInstance.getScimResourcetype(resourceType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#getScimResourcetype");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **resourceType** | **String**| The type of resource. Returned with GET /api/v2/scim/resourcetypes. |<br />**Values**: User, Group, ServiceProviderConfig, ResourceType, Schema 
{: class="table-striped"}


### Return type

[**ScimConfigResourceType**](ScimConfigResourceType.html)

<a name="getScimResourcetypes"></a>

# **getScimResourcetypes**



> [ScimConfigResourceTypesListResponse](ScimConfigResourceTypesListResponse.html) getScimResourcetypes()

Get a list of resource types

Wraps GET /api/v2/scim/resourcetypes  

Requires NO permissions: 


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
try {
    ScimConfigResourceTypesListResponse result = apiInstance.getScimResourcetypes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#getScimResourcetypes");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**ScimConfigResourceTypesListResponse**](ScimConfigResourceTypesListResponse.html)

<a name="getScimSchema"></a>

# **getScimSchema**



> [ScimV2SchemaDefinition](ScimV2SchemaDefinition.html) getScimSchema(schemaId)

Get a SCIM schema

Wraps GET /api/v2/scim/schemas/{schemaId}  

Requires NO permissions: 


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
String schemaId = "schemaId_example"; // String | The ID of a schema. Returned with GET /api/v2/scim/schemas.
try {
    ScimV2SchemaDefinition result = apiInstance.getScimSchema(schemaId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#getScimSchema");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **schemaId** | **String**| The ID of a schema. Returned with GET /api/v2/scim/schemas. |<br />**Values**: urn:ietf:params:scim:schemas:core:2.0:User, urn:ietf:params:scim:schemas:core:2.0:Group, urn:ietf:params:scim:schemas:core:2.0:ServiceProviderConfig, urn:ietf:params:scim:schemas:core:2.0:ResourceType, urn:ietf:params:scim:schemas:core:2.0:Schema, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User, urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User 
{: class="table-striped"}


### Return type

[**ScimV2SchemaDefinition**](ScimV2SchemaDefinition.html)

<a name="getScimSchemas"></a>

# **getScimSchemas**



> [ScimV2SchemaListResponse](ScimV2SchemaListResponse.html) getScimSchemas(filter)

Get a list of SCIM schemas

Wraps GET /api/v2/scim/schemas  

Requires NO permissions: 


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
String filter = displayName eq groupName; // String | Filtered results are invalid and return 403 Unauthorized.
try {
    ScimV2SchemaListResponse result = apiInstance.getScimSchemas(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#getScimSchemas");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **filter** | **String**| Filtered results are invalid and return 403 Unauthorized. | [optional] [default to null] 
{: class="table-striped"}


### Return type

[**ScimV2SchemaListResponse**](ScimV2SchemaListResponse.html)

<a name="getScimServiceproviderconfig"></a>

# **getScimServiceproviderconfig**



> [ScimServiceProviderConfig](ScimServiceProviderConfig.html) getScimServiceproviderconfig(ifNoneMatch)

Get a service provider's configuration

Wraps GET /api/v2/scim/serviceproviderconfig  

Requires NO permissions: 


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
String ifNoneMatch = "ifNoneMatch_example"; // String | The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/serviceproviderconfig. Example: \"42\". If the ETag is different from the version on the server, returns the current configuration of the resource. If the ETag is current, returns 304 Not Modified. 
try {
    ScimServiceProviderConfig result = apiInstance.getScimServiceproviderconfig(ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#getScimServiceproviderconfig");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ifNoneMatch** | **String**| The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/serviceproviderconfig. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns the current configuration of the resource. If the ETag is current, returns 304 Not Modified.  | [optional] 
{: class="table-striped"}


### Return type

[**ScimServiceProviderConfig**](ScimServiceProviderConfig.html)

<a name="getScimUser"></a>

# **getScimUser**



> [ScimV2User](ScimV2User.html) getScimUser(userId, attributes, excludedAttributes, ifNoneMatch)

Get a user

Wraps GET /api/v2/scim/users/{userId}  

Requires NO permissions: 


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
String userId = "userId_example"; // String | The ID of a user. Returned with GET /api/v2/scim/users.
List<String> attributes = Arrays.asList(null); // List<String> | Indicates which attributes to include. Returns these attributes and the \"id\", \"userName\", \"active\", and \"meta\" attributes. Use \"attributes\" to avoid expensive secondary calls for the default attributes.
List<String> excludedAttributes = Arrays.asList(null); // List<String> | Indicates which attributes to exclude. Returns the default attributes minus \"excludedAttributes\". Always returns the \"id\", \"userName\", \"active\", and \"meta\" attributes. Use \"excludedAttributes\" to avoid expensive secondary calls for the default attributes.
String ifNoneMatch = "ifNoneMatch_example"; // String | The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/users/{userId}. Example: \"42\". If the ETag is different from the version on the server, returns the current configuration of the resource. If the ETag is current, returns 304 Not Modified.
try {
    ScimV2User result = apiInstance.getScimUser(userId, attributes, excludedAttributes, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#getScimUser");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| The ID of a user. Returned with GET /api/v2/scim/users. | 
| **attributes** | [**List&lt;String&gt;**](String.html)| Indicates which attributes to include. Returns these attributes and the \&quot;id\&quot;, \&quot;userName\&quot;, \&quot;active\&quot;, and \&quot;meta\&quot; attributes. Use \&quot;attributes\&quot; to avoid expensive secondary calls for the default attributes. | [optional]<br />**Values**: id, userName, displayName, title, active, externalId, phoneNumbers, emails, groups, roles, meta, meta.version, meta.lastModified, urn:ietf:params:scim:schemas:core:2.0:User:id, urn:ietf:params:scim:schemas:core:2.0:User:userName, urn:ietf:params:scim:schemas:core:2.0:User:displayName, urn:ietf:params:scim:schemas:core:2.0:User:title, urn:ietf:params:scim:schemas:core:2.0:User:active, urn:ietf:params:scim:schemas:core:2.0:User:externalId, urn:ietf:params:scim:schemas:core:2.0:User:phoneNumbers, urn:ietf:params:scim:schemas:core:2.0:User:emails, urn:ietf:params:scim:schemas:core:2.0:User:groups, urn:ietf:params:scim:schemas:core:2.0:User:roles, urn:ietf:params:scim:schemas:core:2.0:User:meta, urn:ietf:params:scim:schemas:core:2.0:User:meta.version, urn:ietf:params:scim:schemas:core:2.0:User:meta.lastModified, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:division, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:department, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:manager, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:manager.value, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:employeeNumber, urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User, urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:routingSkills, urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:routingLanguages, urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:externalIds 
| **excludedAttributes** | [**List&lt;String&gt;**](String.html)| Indicates which attributes to exclude. Returns the default attributes minus \&quot;excludedAttributes\&quot;. Always returns the \&quot;id\&quot;, \&quot;userName\&quot;, \&quot;active\&quot;, and \&quot;meta\&quot; attributes. Use \&quot;excludedAttributes\&quot; to avoid expensive secondary calls for the default attributes. | [optional]<br />**Values**: id, userName, displayName, title, active, externalId, phoneNumbers, emails, groups, roles, meta, meta.version, meta.lastModified, urn:ietf:params:scim:schemas:core:2.0:User:id, urn:ietf:params:scim:schemas:core:2.0:User:userName, urn:ietf:params:scim:schemas:core:2.0:User:displayName, urn:ietf:params:scim:schemas:core:2.0:User:title, urn:ietf:params:scim:schemas:core:2.0:User:active, urn:ietf:params:scim:schemas:core:2.0:User:externalId, urn:ietf:params:scim:schemas:core:2.0:User:phoneNumbers, urn:ietf:params:scim:schemas:core:2.0:User:emails, urn:ietf:params:scim:schemas:core:2.0:User:groups, urn:ietf:params:scim:schemas:core:2.0:User:roles, urn:ietf:params:scim:schemas:core:2.0:User:meta, urn:ietf:params:scim:schemas:core:2.0:User:meta.version, urn:ietf:params:scim:schemas:core:2.0:User:meta.lastModified, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:division, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:department, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:manager, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:manager.value, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:employeeNumber, urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User, urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:routingSkills, urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:routingLanguages, urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:externalIds 
| **ifNoneMatch** | **String**| The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/users/{userId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns the current configuration of the resource. If the ETag is current, returns 304 Not Modified. | [optional] 
{: class="table-striped"}


### Return type

[**ScimV2User**](ScimV2User.html)

<a name="getScimUsers"></a>

# **getScimUsers**



> [ScimUserListResponse](ScimUserListResponse.html) getScimUsers(startIndex, count, attributes, excludedAttributes, filter)

Get a list of users

To return all active users, do not use the filter parameter. To return inactive users, set the filter parameter to \"active eq false\". By default, returns SCIM attributes \"externalId\", \"enterprise-user:manager\", and \"roles\". To exclude these attributes, set the attributes parameter to \"id,active\" or the excludeAttributes parameter to \"externalId,roles,urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:division\".

Wraps GET /api/v2/scim/users  

Requires NO permissions: 


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
Integer startIndex = 1; // Integer | The 1-based index of the first query result.
Integer count = 25; // Integer | The requested number of items per page. A value of 0 returns \"totalResults\". A page size over 25 may exceed internal resource limits and return a 429 error. For a page size over 25, use the \"excludedAttributes\" or \"attributes\" query parameters to exclude or only include secondary lookup values such as \"externalId\",  \"roles\", \"urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:routingLanguages\", or \"urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:routingSkills\".
List<String> attributes = Arrays.asList(null); // List<String> | Indicates which attributes to include. Returns these attributes and the \"id\", \"userName\", \"active\", and \"meta\" attributes. Use \"attributes\" to avoid expensive secondary calls for the default attributes.
List<String> excludedAttributes = Arrays.asList(null); // List<String> | Indicates which attributes to exclude. Returns the default attributes minus \"excludedAttributes\". Always returns the \"id\", \"userName\", \"active\", and \"meta\" attributes. Use \"excludedAttributes\" to avoid expensive secondary calls for the default attributes.
String filter = "filter_example"; // String | Filters results. If nothing is specified, returns all active users. Examples of valid values: \"id eq 857449b0-d9e7-4cd0-acbf-a6adfb9ef1e9\", \"userName eq search@sample.org\", \"manager eq 16e10e2f-1136-43fe-bb84-eac073168a49\", \"email eq search@sample.org\", \"division eq divisionName\", \"externalId eq 167844\", \"active eq false\", \"employeeNumber eq 9876543210\".
try {
    ScimUserListResponse result = apiInstance.getScimUsers(startIndex, count, attributes, excludedAttributes, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#getScimUsers");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **startIndex** | **Integer**| The 1-based index of the first query result. | [optional] [default to 1] 
| **count** | **Integer**| The requested number of items per page. A value of 0 returns \&quot;totalResults\&quot;. A page size over 25 may exceed internal resource limits and return a 429 error. For a page size over 25, use the \&quot;excludedAttributes\&quot; or \&quot;attributes\&quot; query parameters to exclude or only include secondary lookup values such as \&quot;externalId\&quot;,  \&quot;roles\&quot;, \&quot;urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:routingLanguages\&quot;, or \&quot;urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:routingSkills\&quot;. | [optional] [default to 25] 
| **attributes** | [**List&lt;String&gt;**](String.html)| Indicates which attributes to include. Returns these attributes and the \&quot;id\&quot;, \&quot;userName\&quot;, \&quot;active\&quot;, and \&quot;meta\&quot; attributes. Use \&quot;attributes\&quot; to avoid expensive secondary calls for the default attributes. | [optional]<br />**Values**: id, userName, displayName, title, active, externalId, phoneNumbers, emails, groups, roles, meta, meta.version, meta.lastModified, urn:ietf:params:scim:schemas:core:2.0:User:id, urn:ietf:params:scim:schemas:core:2.0:User:userName, urn:ietf:params:scim:schemas:core:2.0:User:displayName, urn:ietf:params:scim:schemas:core:2.0:User:title, urn:ietf:params:scim:schemas:core:2.0:User:active, urn:ietf:params:scim:schemas:core:2.0:User:externalId, urn:ietf:params:scim:schemas:core:2.0:User:phoneNumbers, urn:ietf:params:scim:schemas:core:2.0:User:emails, urn:ietf:params:scim:schemas:core:2.0:User:groups, urn:ietf:params:scim:schemas:core:2.0:User:roles, urn:ietf:params:scim:schemas:core:2.0:User:meta, urn:ietf:params:scim:schemas:core:2.0:User:meta.version, urn:ietf:params:scim:schemas:core:2.0:User:meta.lastModified, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:division, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:department, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:manager, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:manager.value, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:employeeNumber, urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User, urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:routingSkills, urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:routingLanguages, urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:externalIds 
| **excludedAttributes** | [**List&lt;String&gt;**](String.html)| Indicates which attributes to exclude. Returns the default attributes minus \&quot;excludedAttributes\&quot;. Always returns the \&quot;id\&quot;, \&quot;userName\&quot;, \&quot;active\&quot;, and \&quot;meta\&quot; attributes. Use \&quot;excludedAttributes\&quot; to avoid expensive secondary calls for the default attributes. | [optional]<br />**Values**: id, userName, displayName, title, active, externalId, phoneNumbers, emails, groups, roles, meta, meta.version, meta.lastModified, urn:ietf:params:scim:schemas:core:2.0:User:id, urn:ietf:params:scim:schemas:core:2.0:User:userName, urn:ietf:params:scim:schemas:core:2.0:User:displayName, urn:ietf:params:scim:schemas:core:2.0:User:title, urn:ietf:params:scim:schemas:core:2.0:User:active, urn:ietf:params:scim:schemas:core:2.0:User:externalId, urn:ietf:params:scim:schemas:core:2.0:User:phoneNumbers, urn:ietf:params:scim:schemas:core:2.0:User:emails, urn:ietf:params:scim:schemas:core:2.0:User:groups, urn:ietf:params:scim:schemas:core:2.0:User:roles, urn:ietf:params:scim:schemas:core:2.0:User:meta, urn:ietf:params:scim:schemas:core:2.0:User:meta.version, urn:ietf:params:scim:schemas:core:2.0:User:meta.lastModified, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:division, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:department, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:manager, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:manager.value, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:employeeNumber, urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User, urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:routingSkills, urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:routingLanguages, urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:externalIds 
| **filter** | **String**| Filters results. If nothing is specified, returns all active users. Examples of valid values: \&quot;id eq 857449b0-d9e7-4cd0-acbf-a6adfb9ef1e9\&quot;, \&quot;userName eq search@sample.org\&quot;, \&quot;manager eq 16e10e2f-1136-43fe-bb84-eac073168a49\&quot;, \&quot;email eq search@sample.org\&quot;, \&quot;division eq divisionName\&quot;, \&quot;externalId eq 167844\&quot;, \&quot;active eq false\&quot;, \&quot;employeeNumber eq 9876543210\&quot;. | [optional] 
{: class="table-striped"}


### Return type

[**ScimUserListResponse**](ScimUserListResponse.html)

<a name="getScimV2Group"></a>

# **getScimV2Group**



> [ScimV2Group](ScimV2Group.html) getScimV2Group(groupId, attributes, excludedAttributes, ifNoneMatch)

Get a group

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
String groupId = "groupId_example"; // String | The ID of a group. Returned with GET /api/v2/scim/v2/groups.
List<String> attributes = Arrays.asList(null); // List<String> | Indicates which attributes to include. Returns these attributes and the \"id\", \"active\", and \"meta\" attributes. Use \"attributes\" to avoid expensive secondary calls for the default attributes.
List<String> excludedAttributes = Arrays.asList(null); // List<String> | Indicates which attributes to exclude. Returns the default attributes minus \"excludedAttributes\". Always returns \"id\", \"active\", and \"meta\" attributes. Use \"excludedAttributes\" to avoid expensive secondary calls for the default attributes.
String ifNoneMatch = "ifNoneMatch_example"; // String | The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/v2/groups/{groupId}. Example: \"42\". If the ETag is different from the version on the server, returns the current configuration of the resource. If the ETag is current, returns 304 Not Modified.
try {
    ScimV2Group result = apiInstance.getScimV2Group(groupId, attributes, excludedAttributes, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#getScimV2Group");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **groupId** | **String**| The ID of a group. Returned with GET /api/v2/scim/v2/groups. | 
| **attributes** | [**List&lt;String&gt;**](String.html)| Indicates which attributes to include. Returns these attributes and the \&quot;id\&quot;, \&quot;active\&quot;, and \&quot;meta\&quot; attributes. Use \&quot;attributes\&quot; to avoid expensive secondary calls for the default attributes. | [optional]<br />**Values**: id, displayName, members, externalId, meta, meta.version, meta.lastModified, urn:ietf:params:scim:schemas:core:2.0:Group:id, urn:ietf:params:scim:schemas:core:2.0:Group:meta, urn:ietf:params:scim:schemas:core:2.0:Group:meta.version, urn:ietf:params:scim:schemas:core:2.0:Group:meta.lastModified, urn:ietf:params:scim:schemas:core:2.0:Group:displayName, urn:ietf:params:scim:schemas:core:2.0:Group:members, urn:ietf:params:scim:schemas:core:2.0:Group:externalId 
| **excludedAttributes** | [**List&lt;String&gt;**](String.html)| Indicates which attributes to exclude. Returns the default attributes minus \&quot;excludedAttributes\&quot;. Always returns \&quot;id\&quot;, \&quot;active\&quot;, and \&quot;meta\&quot; attributes. Use \&quot;excludedAttributes\&quot; to avoid expensive secondary calls for the default attributes. | [optional]<br />**Values**: id, displayName, members, externalId, meta, meta.version, meta.lastModified, urn:ietf:params:scim:schemas:core:2.0:Group:id, urn:ietf:params:scim:schemas:core:2.0:Group:meta, urn:ietf:params:scim:schemas:core:2.0:Group:meta.version, urn:ietf:params:scim:schemas:core:2.0:Group:meta.lastModified, urn:ietf:params:scim:schemas:core:2.0:Group:displayName, urn:ietf:params:scim:schemas:core:2.0:Group:members, urn:ietf:params:scim:schemas:core:2.0:Group:externalId 
| **ifNoneMatch** | **String**| The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/v2/groups/{groupId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns the current configuration of the resource. If the ETag is current, returns 304 Not Modified. | [optional] 
{: class="table-striped"}


### Return type

[**ScimV2Group**](ScimV2Group.html)

<a name="getScimV2Groups"></a>

# **getScimV2Groups**



> [ScimGroupListResponse](ScimGroupListResponse.html) getScimV2Groups(filter, startIndex, count, attributes, excludedAttributes)

Get a list of groups

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
String filter = displayName eq groupName; // String | Filters results. If nothing is specified, returns all groups. Examples of valid values: \"id eq 5f4bc742-a019-4e38-8e2a-d39d5bc0b0f3\", \"displayname eq Sales\".
Integer startIndex = 1; // Integer | The 1-based index of the first query result.
Integer count = 25; // Integer | The requested number of items per page. A value of 0 returns \"totalResults\". A page size over 25 may exceed internal resource limits and return a 429 error. For a page size over 25, use the \"excludedAttributes\" or \"attributes\" query parameters to exclude or only include secondary lookup values such as \"externalId\",  \"roles\", \"urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:routingLanguages\", or \"urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:routingSkills\".
List<String> attributes = Arrays.asList(null); // List<String> | Indicates which attributes to include. Returns these attributes and the \"id\", \"active\", and \"meta\" attributes. Use \"attributes\" to avoid expensive secondary calls for the default attributes.
List<String> excludedAttributes = Arrays.asList(null); // List<String> | Indicates which attributes to exclude. Returns the default attributes minus \"excludedAttributes\". Always returns \"id\", \"active\", and \"meta\" attributes. Use \"excludedAttributes\" to avoid expensive secondary calls for the default attributes.
try {
    ScimGroupListResponse result = apiInstance.getScimV2Groups(filter, startIndex, count, attributes, excludedAttributes);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#getScimV2Groups");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **filter** | **String**| Filters results. If nothing is specified, returns all groups. Examples of valid values: \&quot;id eq 5f4bc742-a019-4e38-8e2a-d39d5bc0b0f3\&quot;, \&quot;displayname eq Sales\&quot;. | [default to null] 
| **startIndex** | **Integer**| The 1-based index of the first query result. | [optional] [default to 1] 
| **count** | **Integer**| The requested number of items per page. A value of 0 returns \&quot;totalResults\&quot;. A page size over 25 may exceed internal resource limits and return a 429 error. For a page size over 25, use the \&quot;excludedAttributes\&quot; or \&quot;attributes\&quot; query parameters to exclude or only include secondary lookup values such as \&quot;externalId\&quot;,  \&quot;roles\&quot;, \&quot;urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:routingLanguages\&quot;, or \&quot;urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:routingSkills\&quot;. | [optional] [default to 25] 
| **attributes** | [**List&lt;String&gt;**](String.html)| Indicates which attributes to include. Returns these attributes and the \&quot;id\&quot;, \&quot;active\&quot;, and \&quot;meta\&quot; attributes. Use \&quot;attributes\&quot; to avoid expensive secondary calls for the default attributes. | [optional]<br />**Values**: id, displayName, members, externalId, meta, meta.version, meta.lastModified, urn:ietf:params:scim:schemas:core:2.0:Group:id, urn:ietf:params:scim:schemas:core:2.0:Group:meta, urn:ietf:params:scim:schemas:core:2.0:Group:meta.version, urn:ietf:params:scim:schemas:core:2.0:Group:meta.lastModified, urn:ietf:params:scim:schemas:core:2.0:Group:displayName, urn:ietf:params:scim:schemas:core:2.0:Group:members, urn:ietf:params:scim:schemas:core:2.0:Group:externalId 
| **excludedAttributes** | [**List&lt;String&gt;**](String.html)| Indicates which attributes to exclude. Returns the default attributes minus \&quot;excludedAttributes\&quot;. Always returns \&quot;id\&quot;, \&quot;active\&quot;, and \&quot;meta\&quot; attributes. Use \&quot;excludedAttributes\&quot; to avoid expensive secondary calls for the default attributes. | [optional]<br />**Values**: id, displayName, members, externalId, meta, meta.version, meta.lastModified, urn:ietf:params:scim:schemas:core:2.0:Group:id, urn:ietf:params:scim:schemas:core:2.0:Group:meta, urn:ietf:params:scim:schemas:core:2.0:Group:meta.version, urn:ietf:params:scim:schemas:core:2.0:Group:meta.lastModified, urn:ietf:params:scim:schemas:core:2.0:Group:displayName, urn:ietf:params:scim:schemas:core:2.0:Group:members, urn:ietf:params:scim:schemas:core:2.0:Group:externalId 
{: class="table-striped"}


### Return type

[**ScimGroupListResponse**](ScimGroupListResponse.html)

<a name="getScimV2Resourcetype"></a>

# **getScimV2Resourcetype**



> [ScimConfigResourceType](ScimConfigResourceType.html) getScimV2Resourcetype(resourceType)

Get a resource type

Wraps GET /api/v2/scim/v2/resourcetypes/{resourceType}  

Requires NO permissions: 


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
String resourceType = "resourceType_example"; // String | The type of resource. Returned with GET /api/v2/scim/v2/resourcetypes.
try {
    ScimConfigResourceType result = apiInstance.getScimV2Resourcetype(resourceType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#getScimV2Resourcetype");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **resourceType** | **String**| The type of resource. Returned with GET /api/v2/scim/v2/resourcetypes. |<br />**Values**: User, Group, ServiceProviderConfig, ResourceType, Schema 
{: class="table-striped"}


### Return type

[**ScimConfigResourceType**](ScimConfigResourceType.html)

<a name="getScimV2Resourcetypes"></a>

# **getScimV2Resourcetypes**



> [ScimConfigResourceTypesListResponse](ScimConfigResourceTypesListResponse.html) getScimV2Resourcetypes()

Get a list of resource types

Wraps GET /api/v2/scim/v2/resourcetypes  

Requires NO permissions: 


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
try {
    ScimConfigResourceTypesListResponse result = apiInstance.getScimV2Resourcetypes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#getScimV2Resourcetypes");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**ScimConfigResourceTypesListResponse**](ScimConfigResourceTypesListResponse.html)

<a name="getScimV2Schema"></a>

# **getScimV2Schema**



> [ScimV2SchemaDefinition](ScimV2SchemaDefinition.html) getScimV2Schema(schemaId)

Get a SCIM schema

Wraps GET /api/v2/scim/v2/schemas/{schemaId}  

Requires NO permissions: 


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
String schemaId = "schemaId_example"; // String | The ID of a schema. Returned with GET /api/v2/scim/v2/schemas.
try {
    ScimV2SchemaDefinition result = apiInstance.getScimV2Schema(schemaId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#getScimV2Schema");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **schemaId** | **String**| The ID of a schema. Returned with GET /api/v2/scim/v2/schemas. |<br />**Values**: urn:ietf:params:scim:schemas:core:2.0:User, urn:ietf:params:scim:schemas:core:2.0:Group, urn:ietf:params:scim:schemas:core:2.0:ServiceProviderConfig, urn:ietf:params:scim:schemas:core:2.0:ResourceType, urn:ietf:params:scim:schemas:core:2.0:Schema, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User, urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User 
{: class="table-striped"}


### Return type

[**ScimV2SchemaDefinition**](ScimV2SchemaDefinition.html)

<a name="getScimV2Schemas"></a>

# **getScimV2Schemas**



> [ScimV2SchemaListResponse](ScimV2SchemaListResponse.html) getScimV2Schemas(filter)

Get a list of SCIM schemas

Wraps GET /api/v2/scim/v2/schemas  

Requires NO permissions: 


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
String filter = displayName eq groupName; // String | Filtered results are invalid and return 403 Unauthorized.
try {
    ScimV2SchemaListResponse result = apiInstance.getScimV2Schemas(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#getScimV2Schemas");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **filter** | **String**| Filtered results are invalid and return 403 Unauthorized. | [optional] [default to null] 
{: class="table-striped"}


### Return type

[**ScimV2SchemaListResponse**](ScimV2SchemaListResponse.html)

<a name="getScimV2Serviceproviderconfig"></a>

# **getScimV2Serviceproviderconfig**



> [ScimServiceProviderConfig](ScimServiceProviderConfig.html) getScimV2Serviceproviderconfig(ifNoneMatch)

Get a service provider's configuration

Wraps GET /api/v2/scim/v2/serviceproviderconfig  

Requires NO permissions: 


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
String ifNoneMatch = "ifNoneMatch_example"; // String | The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/v2/serviceproviderconfig. Example: \"42\". If the ETag is different from the version on the server, returns the current configuration of the resource. If the ETag is current, returns 304 Not Modified. 
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
| **ifNoneMatch** | **String**| The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/v2/serviceproviderconfig. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns the current configuration of the resource. If the ETag is current, returns 304 Not Modified.  | [optional] 
{: class="table-striped"}


### Return type

[**ScimServiceProviderConfig**](ScimServiceProviderConfig.html)

<a name="getScimV2User"></a>

# **getScimV2User**



> [ScimV2User](ScimV2User.html) getScimV2User(userId, attributes, excludedAttributes, ifNoneMatch)

Get a user

Wraps GET /api/v2/scim/v2/users/{userId}  

Requires NO permissions: 


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
String userId = "userId_example"; // String | The ID of a user. Returned with GET /api/v2/scim/v2/users.
List<String> attributes = Arrays.asList(null); // List<String> | Indicates which attributes to include. Returns these attributes and the \"id\", \"userName\", \"active\", and \"meta\" attributes. Use \"attributes\" to avoid expensive secondary calls for the default attributes.
List<String> excludedAttributes = Arrays.asList(null); // List<String> | Indicates which attributes to exclude. Returns the default attributes minus \"excludedAttributes\". Always returns the \"id\", \"userName\", \"active\", and \"meta\" attributes. Use \"excludedAttributes\" to avoid expensive secondary calls for the default attributes.
String ifNoneMatch = "ifNoneMatch_example"; // String | The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/v2/users/{userId}. Example: \"42\". If the ETag is different from the version on the server, returns the current configuration of the resource. If the ETag is current, returns 304 Not Modified.
try {
    ScimV2User result = apiInstance.getScimV2User(userId, attributes, excludedAttributes, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#getScimV2User");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| The ID of a user. Returned with GET /api/v2/scim/v2/users. | 
| **attributes** | [**List&lt;String&gt;**](String.html)| Indicates which attributes to include. Returns these attributes and the \&quot;id\&quot;, \&quot;userName\&quot;, \&quot;active\&quot;, and \&quot;meta\&quot; attributes. Use \&quot;attributes\&quot; to avoid expensive secondary calls for the default attributes. | [optional]<br />**Values**: id, userName, displayName, title, active, externalId, phoneNumbers, emails, groups, roles, meta, meta.version, meta.lastModified, urn:ietf:params:scim:schemas:core:2.0:User:id, urn:ietf:params:scim:schemas:core:2.0:User:userName, urn:ietf:params:scim:schemas:core:2.0:User:displayName, urn:ietf:params:scim:schemas:core:2.0:User:title, urn:ietf:params:scim:schemas:core:2.0:User:active, urn:ietf:params:scim:schemas:core:2.0:User:externalId, urn:ietf:params:scim:schemas:core:2.0:User:phoneNumbers, urn:ietf:params:scim:schemas:core:2.0:User:emails, urn:ietf:params:scim:schemas:core:2.0:User:groups, urn:ietf:params:scim:schemas:core:2.0:User:roles, urn:ietf:params:scim:schemas:core:2.0:User:meta, urn:ietf:params:scim:schemas:core:2.0:User:meta.version, urn:ietf:params:scim:schemas:core:2.0:User:meta.lastModified, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:division, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:department, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:manager, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:manager.value, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:employeeNumber, urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User, urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:routingSkills, urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:routingLanguages, urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:externalIds 
| **excludedAttributes** | [**List&lt;String&gt;**](String.html)| Indicates which attributes to exclude. Returns the default attributes minus \&quot;excludedAttributes\&quot;. Always returns the \&quot;id\&quot;, \&quot;userName\&quot;, \&quot;active\&quot;, and \&quot;meta\&quot; attributes. Use \&quot;excludedAttributes\&quot; to avoid expensive secondary calls for the default attributes. | [optional]<br />**Values**: id, userName, displayName, title, active, externalId, phoneNumbers, emails, groups, roles, meta, meta.version, meta.lastModified, urn:ietf:params:scim:schemas:core:2.0:User:id, urn:ietf:params:scim:schemas:core:2.0:User:userName, urn:ietf:params:scim:schemas:core:2.0:User:displayName, urn:ietf:params:scim:schemas:core:2.0:User:title, urn:ietf:params:scim:schemas:core:2.0:User:active, urn:ietf:params:scim:schemas:core:2.0:User:externalId, urn:ietf:params:scim:schemas:core:2.0:User:phoneNumbers, urn:ietf:params:scim:schemas:core:2.0:User:emails, urn:ietf:params:scim:schemas:core:2.0:User:groups, urn:ietf:params:scim:schemas:core:2.0:User:roles, urn:ietf:params:scim:schemas:core:2.0:User:meta, urn:ietf:params:scim:schemas:core:2.0:User:meta.version, urn:ietf:params:scim:schemas:core:2.0:User:meta.lastModified, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:division, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:department, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:manager, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:manager.value, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:employeeNumber, urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User, urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:routingSkills, urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:routingLanguages, urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:externalIds 
| **ifNoneMatch** | **String**| The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/v2/users/{userId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns the current configuration of the resource. If the ETag is current, returns 304 Not Modified. | [optional] 
{: class="table-striped"}


### Return type

[**ScimV2User**](ScimV2User.html)

<a name="getScimV2Users"></a>

# **getScimV2Users**



> [ScimUserListResponse](ScimUserListResponse.html) getScimV2Users(startIndex, count, attributes, excludedAttributes, filter)

Get a list of users

To return all active users, do not use the filter parameter. To return inactive users, set the filter parameter to \"active eq false\". By default, returns SCIM attributes \"externalId\", \"enterprise-user:manager\", and \"roles\". To exclude these attributes, set the attributes parameter to \"id,active\" or the excludeAttributes parameter to \"externalId,roles,urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:division\".

Wraps GET /api/v2/scim/v2/users  

Requires NO permissions: 


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
Integer startIndex = 1; // Integer | The 1-based index of the first query result.
Integer count = 25; // Integer | The requested number of items per page. A value of 0 returns \"totalResults\". A page size over 25 may exceed internal resource limits and return a 429 error. For a page size over 25, use the \"excludedAttributes\" or \"attributes\" query parameters to exclude or only include secondary lookup values such as \"externalId\",  \"roles\", \"urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:routingLanguages\", or \"urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:routingSkills\".
List<String> attributes = Arrays.asList(null); // List<String> | Indicates which attributes to include. Returns these attributes and the \"id\", \"userName\", \"active\", and \"meta\" attributes. Use \"attributes\" to avoid expensive secondary calls for the default attributes.
List<String> excludedAttributes = Arrays.asList(null); // List<String> | Indicates which attributes to exclude. Returns the default attributes minus \"excludedAttributes\". Always returns the \"id\", \"userName\", \"active\", and \"meta\" attributes. Use \"excludedAttributes\" to avoid expensive secondary calls for the default attributes.
String filter = "filter_example"; // String | Filters results. If nothing is specified, returns all active users. Examples of valid values: \"id eq 857449b0-d9e7-4cd0-acbf-a6adfb9ef1e9\", \"userName eq search@sample.org\", \"manager eq 16e10e2f-1136-43fe-bb84-eac073168a49\", \"email eq search@sample.org\", \"division eq divisionName\", \"externalId eq 167844\", \"active eq false\", \"employeeNumber eq 9876543210\".
try {
    ScimUserListResponse result = apiInstance.getScimV2Users(startIndex, count, attributes, excludedAttributes, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SCIMApi#getScimV2Users");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **startIndex** | **Integer**| The 1-based index of the first query result. | [optional] [default to 1] 
| **count** | **Integer**| The requested number of items per page. A value of 0 returns \&quot;totalResults\&quot;. A page size over 25 may exceed internal resource limits and return a 429 error. For a page size over 25, use the \&quot;excludedAttributes\&quot; or \&quot;attributes\&quot; query parameters to exclude or only include secondary lookup values such as \&quot;externalId\&quot;,  \&quot;roles\&quot;, \&quot;urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:routingLanguages\&quot;, or \&quot;urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:routingSkills\&quot;. | [optional] [default to 25] 
| **attributes** | [**List&lt;String&gt;**](String.html)| Indicates which attributes to include. Returns these attributes and the \&quot;id\&quot;, \&quot;userName\&quot;, \&quot;active\&quot;, and \&quot;meta\&quot; attributes. Use \&quot;attributes\&quot; to avoid expensive secondary calls for the default attributes. | [optional]<br />**Values**: id, userName, displayName, title, active, externalId, phoneNumbers, emails, groups, roles, meta, meta.version, meta.lastModified, urn:ietf:params:scim:schemas:core:2.0:User:id, urn:ietf:params:scim:schemas:core:2.0:User:userName, urn:ietf:params:scim:schemas:core:2.0:User:displayName, urn:ietf:params:scim:schemas:core:2.0:User:title, urn:ietf:params:scim:schemas:core:2.0:User:active, urn:ietf:params:scim:schemas:core:2.0:User:externalId, urn:ietf:params:scim:schemas:core:2.0:User:phoneNumbers, urn:ietf:params:scim:schemas:core:2.0:User:emails, urn:ietf:params:scim:schemas:core:2.0:User:groups, urn:ietf:params:scim:schemas:core:2.0:User:roles, urn:ietf:params:scim:schemas:core:2.0:User:meta, urn:ietf:params:scim:schemas:core:2.0:User:meta.version, urn:ietf:params:scim:schemas:core:2.0:User:meta.lastModified, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:division, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:department, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:manager, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:manager.value, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:employeeNumber, urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User, urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:routingSkills, urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:routingLanguages, urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:externalIds 
| **excludedAttributes** | [**List&lt;String&gt;**](String.html)| Indicates which attributes to exclude. Returns the default attributes minus \&quot;excludedAttributes\&quot;. Always returns the \&quot;id\&quot;, \&quot;userName\&quot;, \&quot;active\&quot;, and \&quot;meta\&quot; attributes. Use \&quot;excludedAttributes\&quot; to avoid expensive secondary calls for the default attributes. | [optional]<br />**Values**: id, userName, displayName, title, active, externalId, phoneNumbers, emails, groups, roles, meta, meta.version, meta.lastModified, urn:ietf:params:scim:schemas:core:2.0:User:id, urn:ietf:params:scim:schemas:core:2.0:User:userName, urn:ietf:params:scim:schemas:core:2.0:User:displayName, urn:ietf:params:scim:schemas:core:2.0:User:title, urn:ietf:params:scim:schemas:core:2.0:User:active, urn:ietf:params:scim:schemas:core:2.0:User:externalId, urn:ietf:params:scim:schemas:core:2.0:User:phoneNumbers, urn:ietf:params:scim:schemas:core:2.0:User:emails, urn:ietf:params:scim:schemas:core:2.0:User:groups, urn:ietf:params:scim:schemas:core:2.0:User:roles, urn:ietf:params:scim:schemas:core:2.0:User:meta, urn:ietf:params:scim:schemas:core:2.0:User:meta.version, urn:ietf:params:scim:schemas:core:2.0:User:meta.lastModified, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:division, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:department, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:manager, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:manager.value, urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:employeeNumber, urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User, urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:routingSkills, urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:routingLanguages, urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:externalIds 
| **filter** | **String**| Filters results. If nothing is specified, returns all active users. Examples of valid values: \&quot;id eq 857449b0-d9e7-4cd0-acbf-a6adfb9ef1e9\&quot;, \&quot;userName eq search@sample.org\&quot;, \&quot;manager eq 16e10e2f-1136-43fe-bb84-eac073168a49\&quot;, \&quot;email eq search@sample.org\&quot;, \&quot;division eq divisionName\&quot;, \&quot;externalId eq 167844\&quot;, \&quot;active eq false\&quot;, \&quot;employeeNumber eq 9876543210\&quot;. | [optional] 
{: class="table-striped"}


### Return type

[**ScimUserListResponse**](ScimUserListResponse.html)

<a name="patchScimGroup"></a>

# **patchScimGroup**



> [ScimV2Group](ScimV2Group.html) patchScimGroup(groupId, body, ifMatch)

Modify a group

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
String groupId = "groupId_example"; // String | The ID of a group. Returned with GET /api/v2/scim/groups.
ScimV2PatchRequest body = new ScimV2PatchRequest(); // ScimV2PatchRequest | The information used to modify a group.
String ifMatch = "ifMatch_example"; // String | The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/groups/{groupId}. Example: \"42\". If the ETag is different from the version on the server, returns 400 with a \"scimType\" of \"invalidVers\".
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
| **groupId** | **String**| The ID of a group. Returned with GET /api/v2/scim/groups. | 
| **body** | [**ScimV2PatchRequest**](ScimV2PatchRequest.html)| The information used to modify a group. | 
| **ifMatch** | **String**| The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/groups/{groupId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns 400 with a \&quot;scimType\&quot; of \&quot;invalidVers\&quot;. | [optional] 
{: class="table-striped"}


### Return type

[**ScimV2Group**](ScimV2Group.html)

<a name="patchScimUser"></a>

# **patchScimUser**



> [ScimV2User](ScimV2User.html) patchScimUser(userId, body, ifMatch)

Modify a user

Wraps PATCH /api/v2/scim/users/{userId}  

Requires ANY permissions: 

* directory:user:edit
* directory:user:setPassword
* authorization:grant:add
* authorization:grant:delete
* routing:skill:assign
* routing:language:assign

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
String userId = "userId_example"; // String | The ID of a user. Returned with GET /api/v2/scim/users.
ScimV2PatchRequest body = new ScimV2PatchRequest(); // ScimV2PatchRequest | The information used to modify a user.
String ifMatch = "ifMatch_example"; // String | The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/users/{userId}. Example: \"42\". If the ETag is different from the version on the server, returns 400 with a \"scimType\" of \"invalidVers\".
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
| **userId** | **String**| The ID of a user. Returned with GET /api/v2/scim/users. | 
| **body** | [**ScimV2PatchRequest**](ScimV2PatchRequest.html)| The information used to modify a user. | 
| **ifMatch** | **String**| The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/users/{userId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns 400 with a \&quot;scimType\&quot; of \&quot;invalidVers\&quot;. | [optional] 
{: class="table-striped"}


### Return type

[**ScimV2User**](ScimV2User.html)

<a name="patchScimV2Group"></a>

# **patchScimV2Group**



> [ScimV2Group](ScimV2Group.html) patchScimV2Group(groupId, body, ifMatch)

Modify a group

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
String groupId = "groupId_example"; // String | The ID of a group. Returned with GET /api/v2/scim/v2/groups.
ScimV2PatchRequest body = new ScimV2PatchRequest(); // ScimV2PatchRequest | The information used to modify a group.
String ifMatch = "ifMatch_example"; // String | The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/v2/groups/{groupId}. Example: \"42\". If the ETag is different from the version on the server, returns 400 with a \"scimType\" of \"invalidVers\".
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
| **groupId** | **String**| The ID of a group. Returned with GET /api/v2/scim/v2/groups. | 
| **body** | [**ScimV2PatchRequest**](ScimV2PatchRequest.html)| The information used to modify a group. | 
| **ifMatch** | **String**| The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/v2/groups/{groupId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns 400 with a \&quot;scimType\&quot; of \&quot;invalidVers\&quot;. | [optional] 
{: class="table-striped"}


### Return type

[**ScimV2Group**](ScimV2Group.html)

<a name="patchScimV2User"></a>

# **patchScimV2User**



> [ScimV2User](ScimV2User.html) patchScimV2User(userId, body, ifMatch)

Modify a user

Wraps PATCH /api/v2/scim/v2/users/{userId}  

Requires ANY permissions: 

* directory:user:edit
* directory:user:setPassword
* authorization:grant:add
* authorization:grant:delete
* routing:skill:assign
* routing:language:assign

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
String userId = "userId_example"; // String | The ID of a user. Returned with GET /api/v2/scim/v2/users.
ScimV2PatchRequest body = new ScimV2PatchRequest(); // ScimV2PatchRequest | The information used to modify a user.
String ifMatch = "ifMatch_example"; // String | The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/v2/users/{userId}. Example: \"42\". If the ETag is different from the version on the server, returns 400 with a \"scimType\" of \"invalidVers\".
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
| **userId** | **String**| The ID of a user. Returned with GET /api/v2/scim/v2/users. | 
| **body** | [**ScimV2PatchRequest**](ScimV2PatchRequest.html)| The information used to modify a user. | 
| **ifMatch** | **String**| The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/v2/users/{userId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns 400 with a \&quot;scimType\&quot; of \&quot;invalidVers\&quot;. | [optional] 
{: class="table-striped"}


### Return type

[**ScimV2User**](ScimV2User.html)

<a name="postScimUsers"></a>

# **postScimUsers**



> [ScimV2User](ScimV2User.html) postScimUsers(body)

Create a user

Wraps POST /api/v2/scim/users  

Requires ANY permissions: 

* directory:user:add
* authorization:grant:add
* authorization:grant:delete
* routing:skill:assign
* routing:language:assign

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
ScimV2CreateUser body = new ScimV2CreateUser(); // ScimV2CreateUser | The information used to create a user.
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
| **body** | [**ScimV2CreateUser**](ScimV2CreateUser.html)| The information used to create a user. | 
{: class="table-striped"}


### Return type

[**ScimV2User**](ScimV2User.html)

<a name="postScimV2Users"></a>

# **postScimV2Users**



> [ScimV2User](ScimV2User.html) postScimV2Users(body)

Create a user

Wraps POST /api/v2/scim/v2/users  

Requires ANY permissions: 

* directory:user:add
* authorization:grant:add
* authorization:grant:delete
* routing:skill:assign
* routing:language:assign

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
ScimV2CreateUser body = new ScimV2CreateUser(); // ScimV2CreateUser | The information used to create a user.
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
| **body** | [**ScimV2CreateUser**](ScimV2CreateUser.html)| The information used to create a user. | 
{: class="table-striped"}


### Return type

[**ScimV2User**](ScimV2User.html)

<a name="putScimGroup"></a>

# **putScimGroup**



> [ScimV2Group](ScimV2Group.html) putScimGroup(groupId, body, ifMatch)

Replace a group

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
String groupId = "groupId_example"; // String | The ID of a group. Returned with GET /api/v2/scim/groups.
ScimV2Group body = new ScimV2Group(); // ScimV2Group | The information used to replace a group.
String ifMatch = "ifMatch_example"; // String | The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/groups/{groupId}. Example: \"42\". If the ETag is different from the version on the server, returns 400 with a \"scimType\" of \"invalidVers\".
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
| **groupId** | **String**| The ID of a group. Returned with GET /api/v2/scim/groups. | 
| **body** | [**ScimV2Group**](ScimV2Group.html)| The information used to replace a group. | 
| **ifMatch** | **String**| The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/groups/{groupId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns 400 with a \&quot;scimType\&quot; of \&quot;invalidVers\&quot;. | [optional] 
{: class="table-striped"}


### Return type

[**ScimV2Group**](ScimV2Group.html)

<a name="putScimUser"></a>

# **putScimUser**



> [ScimV2User](ScimV2User.html) putScimUser(userId, body, ifMatch)

Replace a user

Wraps PUT /api/v2/scim/users/{userId}  

Requires ANY permissions: 

* directory:user:edit
* directory:user:setPassword
* authorization:grant:add
* authorization:grant:delete
* routing:skill:assign
* routing:language:assign

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
String userId = "userId_example"; // String | The ID of a user. Returned with GET /api/v2/scim/users.
ScimV2User body = new ScimV2User(); // ScimV2User | The information used to replace a user.
String ifMatch = "ifMatch_example"; // String | The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/users/{userId}. Example: \"42\". If the ETag is different from the version on the server, returns 400 with a \"scimType\" of \"invalidVers\".
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
| **userId** | **String**| The ID of a user. Returned with GET /api/v2/scim/users. | 
| **body** | [**ScimV2User**](ScimV2User.html)| The information used to replace a user. | 
| **ifMatch** | **String**| The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/users/{userId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns 400 with a \&quot;scimType\&quot; of \&quot;invalidVers\&quot;. | [optional] 
{: class="table-striped"}


### Return type

[**ScimV2User**](ScimV2User.html)

<a name="putScimV2Group"></a>

# **putScimV2Group**



> [ScimV2Group](ScimV2Group.html) putScimV2Group(groupId, body, ifMatch)

Replace a group

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
String groupId = "groupId_example"; // String | The ID of a group. Returned with GET /api/v2/scim/v2/groups.
ScimV2Group body = new ScimV2Group(); // ScimV2Group | The information used to replace a group.
String ifMatch = "ifMatch_example"; // String | The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/v2/groups/{groupId}. Example: \"42\". If the ETag is different from the version on the server, returns 400 with a \"scimType\" of \"invalidVers\".
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
| **groupId** | **String**| The ID of a group. Returned with GET /api/v2/scim/v2/groups. | 
| **body** | [**ScimV2Group**](ScimV2Group.html)| The information used to replace a group. | 
| **ifMatch** | **String**| The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/v2/groups/{groupId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns 400 with a \&quot;scimType\&quot; of \&quot;invalidVers\&quot;. | [optional] 
{: class="table-striped"}


### Return type

[**ScimV2Group**](ScimV2Group.html)

<a name="putScimV2User"></a>

# **putScimV2User**



> [ScimV2User](ScimV2User.html) putScimV2User(userId, body, ifMatch)

Replace a user

Wraps PUT /api/v2/scim/v2/users/{userId}  

Requires ANY permissions: 

* directory:user:edit
* directory:user:setPassword
* authorization:grant:add
* authorization:grant:delete
* routing:skill:assign
* routing:language:assign

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
String userId = "userId_example"; // String | The ID of a user. Returned with GET /api/v2/scim/v2/users.
ScimV2User body = new ScimV2User(); // ScimV2User | The information used to replace a user.
String ifMatch = "ifMatch_example"; // String | The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/v2/users/{userId}. Example: \"42\". If the ETag is different from the version on the server, returns 400 with a \"scimType\" of \"invalidVers\".
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
| **userId** | **String**| The ID of a user. Returned with GET /api/v2/scim/v2/users. | 
| **body** | [**ScimV2User**](ScimV2User.html)| The information used to replace a user. | 
| **ifMatch** | **String**| The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/v2/users/{userId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns 400 with a \&quot;scimType\&quot; of \&quot;invalidVers\&quot;. | [optional] 
{: class="table-striped"}


### Return type

[**ScimV2User**](ScimV2User.html)

