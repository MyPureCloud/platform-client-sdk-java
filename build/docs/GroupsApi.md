---
title: GroupsApi
---
## GroupsApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteGroup**](GroupsApi.html#deleteGroup) | Delete group |
| [**deleteGroupMembers**](GroupsApi.html#deleteGroupMembers) | Remove members |
| [**getFieldconfig**](GroupsApi.html#getFieldconfig) | Fetch field config for an entity type |
| [**getGroup**](GroupsApi.html#getGroup) | Get group |
| [**getGroupIndividuals**](GroupsApi.html#getGroupIndividuals) | Get all individuals associated with the group |
| [**getGroupMembers**](GroupsApi.html#getGroupMembers) | Get group members, includes individuals, owners, and dynamically included people |
| [**getGroupProfile**](GroupsApi.html#getGroupProfile) | Get group profile |
| [**getGroups**](GroupsApi.html#getGroups) | Get a group list |
| [**getGroupsSearch**](GroupsApi.html#getGroupsSearch) | Search groups using the q64 value returned from a previous search |
| [**getProfilesGroups**](GroupsApi.html#getProfilesGroups) | Get group profile listing |
| [**postGroupMembers**](GroupsApi.html#postGroupMembers) | Add members |
| [**postGroups**](GroupsApi.html#postGroups) | Create a group |
| [**postGroupsSearch**](GroupsApi.html#postGroupsSearch) | Search groups |
| [**putGroup**](GroupsApi.html#putGroup) | Update group |
{: class="table-striped"}

<a name="deleteGroup"></a>

# **deleteGroup**



> Void deleteGroup(groupId)

Delete group

Wraps DELETE /api/v2/groups/{groupId}  

Requires ANY permissions: 

* directory:group:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GroupsApi apiInstance = new GroupsApi();
String groupId = "groupId_example"; // String | Group ID
try {
    apiInstance.deleteGroup(groupId);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#deleteGroup");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **groupId** | **String**| Group ID | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteGroupMembers"></a>

# **deleteGroupMembers**



> Empty deleteGroupMembers(groupId, ids)

Remove members

Wraps DELETE /api/v2/groups/{groupId}/members  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GroupsApi apiInstance = new GroupsApi();
String groupId = "groupId_example"; // String | Group ID
String ids = "ids_example"; // String | Comma separated list of userIds to remove
try {
    Empty result = apiInstance.deleteGroupMembers(groupId, ids);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#deleteGroupMembers");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **groupId** | **String**| Group ID | 
| **ids** | **String**| Comma separated list of userIds to remove | 
{: class="table-striped"}


### Return type

**Empty**

<a name="getFieldconfig"></a>

# **getFieldconfig**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [FieldConfig](FieldConfig.html) getFieldconfig(type)

Fetch field config for an entity type

Wraps GET /api/v2/fieldconfig  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GroupsApi apiInstance = new GroupsApi();
String type = "type_example"; // String | Field type
try {
    FieldConfig result = apiInstance.getFieldconfig(type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#getFieldconfig");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **type** | **String**| Field type |<br />**Values**: person, group, org, externalContact 
{: class="table-striped"}


### Return type

[**FieldConfig**](FieldConfig.html)

<a name="getGroup"></a>

# **getGroup**



> [Group](Group.html) getGroup(groupId)

Get group

Wraps GET /api/v2/groups/{groupId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GroupsApi apiInstance = new GroupsApi();
String groupId = "groupId_example"; // String | Group ID
try {
    Group result = apiInstance.getGroup(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#getGroup");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **groupId** | **String**| Group ID | 
{: class="table-striped"}


### Return type

[**Group**](Group.html)

<a name="getGroupIndividuals"></a>

# **getGroupIndividuals**



> [UserEntityListing](UserEntityListing.html) getGroupIndividuals(groupId)

Get all individuals associated with the group

Wraps GET /api/v2/groups/{groupId}/individuals  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GroupsApi apiInstance = new GroupsApi();
String groupId = "groupId_example"; // String | Group ID
try {
    UserEntityListing result = apiInstance.getGroupIndividuals(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#getGroupIndividuals");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **groupId** | **String**| Group ID | 
{: class="table-striped"}


### Return type

[**UserEntityListing**](UserEntityListing.html)

<a name="getGroupMembers"></a>

# **getGroupMembers**



> [UserEntityListing](UserEntityListing.html) getGroupMembers(groupId, pageSize, pageNumber, sortOrder, expand)

Get group members, includes individuals, owners, and dynamically included people

Wraps GET /api/v2/groups/{groupId}/members  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GroupsApi apiInstance = new GroupsApi();
String groupId = "groupId_example"; // String | Group ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortOrder = "ASC"; // String | Ascending or descending sort order
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand
try {
    UserEntityListing result = apiInstance.getGroupMembers(groupId, pageSize, pageNumber, sortOrder, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#getGroupMembers");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **groupId** | **String**| Group ID | 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **sortOrder** | **String**| Ascending or descending sort order | [optional] [default to ASC]<br />**Values**: ascending, descending 
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand | [optional]<br />**Values**: routingStatus, presence, conversationSummary, outOfOffice, geolocation, station, authorization, lasttokenissued, dateLastLogin, authorization.unusedRoles, team, profileSkills, certifications, locations, groups, skills, languages, languagePreference, employerInfo, biography 
{: class="table-striped"}


### Return type

[**UserEntityListing**](UserEntityListing.html)

<a name="getGroupProfile"></a>

# **getGroupProfile**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [GroupProfile](GroupProfile.html) getGroupProfile(groupId, fields)

Get group profile

This api is deprecated. Use /api/v2/groups instead

Wraps GET /api/v2/groups/{groupId}/profile  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GroupsApi apiInstance = new GroupsApi();
String groupId = "groupId_example"; // String | groupId
String fields = "fields_example"; // String | Comma separated fields to return.  Allowable values can be found by querying /api/v2/fieldconfig?type=group and using the key for the elements returned by the fieldList
try {
    GroupProfile result = apiInstance.getGroupProfile(groupId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#getGroupProfile");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **groupId** | **String**| groupId | 
| **fields** | **String**| Comma separated fields to return.  Allowable values can be found by querying /api/v2/fieldconfig?type&#x3D;group and using the key for the elements returned by the fieldList | [optional] 
{: class="table-striped"}


### Return type

[**GroupProfile**](GroupProfile.html)

<a name="getGroups"></a>

# **getGroups**



> [GroupEntityListing](GroupEntityListing.html) getGroups(pageSize, pageNumber, id, jabberId, sortOrder)

Get a group list

Wraps GET /api/v2/groups  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GroupsApi apiInstance = new GroupsApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
List<String> id = Arrays.asList(null); // List<String> | id
List<String> jabberId = Arrays.asList(null); // List<String> | A list of jabberIds to fetch by bulk (cannot be used with the \"id\" parameter)
String sortOrder = "ASC"; // String | Ascending or descending sort order
try {
    GroupEntityListing result = apiInstance.getGroups(pageSize, pageNumber, id, jabberId, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#getGroups");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **id** | [**List&lt;String&gt;**](String.html)| id | [optional] 
| **jabberId** | [**List&lt;String&gt;**](String.html)| A list of jabberIds to fetch by bulk (cannot be used with the \&quot;id\&quot; parameter) | [optional] 
| **sortOrder** | **String**| Ascending or descending sort order | [optional] [default to ASC]<br />**Values**: ascending, descending 
{: class="table-striped"}


### Return type

[**GroupEntityListing**](GroupEntityListing.html)

<a name="getGroupsSearch"></a>

# **getGroupsSearch**



> [GroupsSearchResponse](GroupsSearchResponse.html) getGroupsSearch(q64, expand)

Search groups using the q64 value returned from a previous search

Wraps GET /api/v2/groups/search  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GroupsApi apiInstance = new GroupsApi();
String q64 = "q64_example"; // String | q64
List<String> expand = Arrays.asList(null); // List<String> | expand
try {
    GroupsSearchResponse result = apiInstance.getGroupsSearch(q64, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#getGroupsSearch");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **q64** | **String**| q64 | 
| **expand** | [**List&lt;String&gt;**](String.html)| expand | [optional] 
{: class="table-striped"}


### Return type

[**GroupsSearchResponse**](GroupsSearchResponse.html)

<a name="getProfilesGroups"></a>

# **getProfilesGroups**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [GroupProfileEntityListing](GroupProfileEntityListing.html) getProfilesGroups(pageSize, pageNumber, id, sortOrder)

Get group profile listing

This api is deprecated. Use /api/v2/groups instead.

Wraps GET /api/v2/profiles/groups  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GroupsApi apiInstance = new GroupsApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
List<String> id = Arrays.asList(null); // List<String> | id
String sortOrder = "ASC"; // String | Ascending or descending sort order
try {
    GroupProfileEntityListing result = apiInstance.getProfilesGroups(pageSize, pageNumber, id, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#getProfilesGroups");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **id** | [**List&lt;String&gt;**](String.html)| id | [optional] 
| **sortOrder** | **String**| Ascending or descending sort order | [optional] [default to ASC]<br />**Values**: ascending, descending 
{: class="table-striped"}


### Return type

[**GroupProfileEntityListing**](GroupProfileEntityListing.html)

<a name="postGroupMembers"></a>

# **postGroupMembers**



> Empty postGroupMembers(groupId, body)

Add members

Wraps POST /api/v2/groups/{groupId}/members  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GroupsApi apiInstance = new GroupsApi();
String groupId = "groupId_example"; // String | Group ID
GroupMembersUpdate body = new GroupMembersUpdate(); // GroupMembersUpdate | Add members
try {
    Empty result = apiInstance.postGroupMembers(groupId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#postGroupMembers");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **groupId** | **String**| Group ID | 
| **body** | [**GroupMembersUpdate**](GroupMembersUpdate.html)| Add members | 
{: class="table-striped"}


### Return type

**Empty**

<a name="postGroups"></a>

# **postGroups**



> [Group](Group.html) postGroups(body)

Create a group

Wraps POST /api/v2/groups  

Requires ANY permissions: 

* directory:group:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GroupsApi apiInstance = new GroupsApi();
GroupCreate body = new GroupCreate(); // GroupCreate | Group
try {
    Group result = apiInstance.postGroups(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#postGroups");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**GroupCreate**](GroupCreate.html)| Group | 
{: class="table-striped"}


### Return type

[**Group**](Group.html)

<a name="postGroupsSearch"></a>

# **postGroupsSearch**



> [GroupsSearchResponse](GroupsSearchResponse.html) postGroupsSearch(body)

Search groups

Wraps POST /api/v2/groups/search  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GroupsApi apiInstance = new GroupsApi();
GroupSearchRequest body = new GroupSearchRequest(); // GroupSearchRequest | Search request options
try {
    GroupsSearchResponse result = apiInstance.postGroupsSearch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#postGroupsSearch");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**GroupSearchRequest**](GroupSearchRequest.html)| Search request options | 
{: class="table-striped"}


### Return type

[**GroupsSearchResponse**](GroupsSearchResponse.html)

<a name="putGroup"></a>

# **putGroup**



> [Group](Group.html) putGroup(groupId, body)

Update group

Wraps PUT /api/v2/groups/{groupId}  

Requires ANY permissions: 

* directory:group:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GroupsApi apiInstance = new GroupsApi();
String groupId = "groupId_example"; // String | Group ID
GroupUpdate body = new GroupUpdate(); // GroupUpdate | Group
try {
    Group result = apiInstance.putGroup(groupId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#putGroup");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **groupId** | **String**| Group ID | 
| **body** | [**GroupUpdate**](GroupUpdate.html)| Group | [optional] 
{: class="table-striped"}


### Return type

[**Group**](Group.html)

