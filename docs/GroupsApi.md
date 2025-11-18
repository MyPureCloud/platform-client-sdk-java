# GroupsApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteGroup**](GroupsApi#deleteGroup) | Delete group |
| [**deleteGroupDynamicsettings**](GroupsApi#deleteGroupDynamicsettings) | Remove dynamic group definition |
| [**deleteGroupMembers**](GroupsApi#deleteGroupMembers) | Remove members |
| [**getFieldconfig**](GroupsApi#getFieldconfig) | Fetch field config for an entity type |
| [**getGroup**](GroupsApi#getGroup) | Get group |
| [**getGroupDynamicsettings**](GroupsApi#getGroupDynamicsettings) | Get dynamic group definition |
| [**getGroupIndividuals**](GroupsApi#getGroupIndividuals) | Get all individuals associated with the group |
| [**getGroupMembers**](GroupsApi#getGroupMembers) | Get group members, includes individuals, owners, and dynamically included people |
| [**getGroupProfile**](GroupsApi#getGroupProfile) | Get group profile |
| [**getGroups**](GroupsApi#getGroups) | Get a group list |
| [**getGroupsSearch**](GroupsApi#getGroupsSearch) | Search groups using the q64 value returned from a previous search |
| [**getProfilesGroups**](GroupsApi#getProfilesGroups) | Get group profile listing |
| [**postGroupMembers**](GroupsApi#postGroupMembers) | Add members |
| [**postGroups**](GroupsApi#postGroups) | Create a group |
| [**postGroupsDynamicsettingsPreview**](GroupsApi#postGroupsDynamicsettingsPreview) | Preview the number of users selected for a dynamic group definition query |
| [**postGroupsSearch**](GroupsApi#postGroupsSearch) | Search groups |
| [**putGroup**](GroupsApi#putGroup) | Update group |
| [**putGroupDynamicsettings**](GroupsApi#putGroupDynamicsettings) | Create / Update dynamic group definition |
{: class="table-striped"}


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


# **deleteGroupDynamicsettings**


> Void deleteGroupDynamicsettings(groupId)

Remove dynamic group definition

deleteGroupDynamicsettings is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps DELETE /api/v2/groups/{groupId}/dynamicsettings  

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
    apiInstance.deleteGroupDynamicsettings(groupId);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#deleteGroupDynamicsettings");
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
String ids = "ids_example"; // String | Comma separated list of userIds to remove. A maximum of 50 members are allowed per request.
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
| **ids** | **String**| Comma separated list of userIds to remove. A maximum of 50 members are allowed per request. | 
{: class="table-striped"}


### Return type

**Empty**


# **getFieldconfig**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [FieldConfig](FieldConfig) getFieldconfig(type)

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
| **type** | **String**| Field type |<br />**Values**: person, group, org 
{: class="table-striped"}


### Return type

[**FieldConfig**](FieldConfig)


# **getGroup**


> [Group](Group) getGroup(groupId)

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

[**Group**](Group)


# **getGroupDynamicsettings**


> [DynamicGroupDefinition](DynamicGroupDefinition) getGroupDynamicsettings(groupId)

Get dynamic group definition

getGroupDynamicsettings is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/groups/{groupId}/dynamicsettings  

Requires ANY permissions: 

* directory:group:view

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
    DynamicGroupDefinition result = apiInstance.getGroupDynamicsettings(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#getGroupDynamicsettings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **groupId** | **String**| Group ID | 
{: class="table-striped"}


### Return type

[**DynamicGroupDefinition**](DynamicGroupDefinition)


# **getGroupIndividuals**


> [UserEntityListing](UserEntityListing) getGroupIndividuals(groupId)

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

[**UserEntityListing**](UserEntityListing)


# **getGroupMembers**


> [UserEntityListing](UserEntityListing) getGroupMembers(groupId, pageSize, pageNumber, sortOrder, expand)

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
| **expand** | [**List&lt;String&gt;**](String)| Which fields, if any, to expand | [optional]<br />**Values**: routingStatus, presence, integrationPresence, conversationSummary, outOfOffice, geolocation, station, authorization, lasttokenissued, authorization.unusedRoles, team, workPlanBidRanks, externalContactsSettings, groups, customAttributes, profileSkills, certifications, locations, skills, languages, languagePreference, employerInfo, biography, dateLastLogin, dateWelcomeSent 
{: class="table-striped"}


### Return type

[**UserEntityListing**](UserEntityListing)


# **getGroupProfile**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [GroupProfile](GroupProfile) getGroupProfile(groupId, fields)

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

[**GroupProfile**](GroupProfile)


# **getGroups**


> [GroupEntityListing](GroupEntityListing) getGroups(pageSize, pageNumber, id, jabberId, sortOrder)

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
| **id** | [**List&lt;String&gt;**](String)| id | [optional] 
| **jabberId** | [**List&lt;String&gt;**](String)| A list of jabberIds to fetch by bulk (cannot be used with the \&quot;id\&quot; parameter) | [optional] 
| **sortOrder** | **String**| Ascending or descending sort order | [optional] [default to ASC]<br />**Values**: ascending, descending 
{: class="table-striped"}


### Return type

[**GroupEntityListing**](GroupEntityListing)


# **getGroupsSearch**


> [GroupsSearchResponse](GroupsSearchResponse) getGroupsSearch(q64, expand)

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
| **expand** | [**List&lt;String&gt;**](String)| expand | [optional] 
{: class="table-striped"}


### Return type

[**GroupsSearchResponse**](GroupsSearchResponse)


# **getProfilesGroups**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [GroupProfileEntityListing](GroupProfileEntityListing) getProfilesGroups(pageSize, pageNumber, id, jabberId, sortOrder)

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
List<String> jabberId = Arrays.asList(null); // List<String> | A list of jabberIds to fetch by bulk (cannot be used with the \"id\" parameter)
String sortOrder = "ASC"; // String | Ascending or descending sort order
try {
    GroupProfileEntityListing result = apiInstance.getProfilesGroups(pageSize, pageNumber, id, jabberId, sortOrder);
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
| **id** | [**List&lt;String&gt;**](String)| id | [optional] 
| **jabberId** | [**List&lt;String&gt;**](String)| A list of jabberIds to fetch by bulk (cannot be used with the \&quot;id\&quot; parameter) | [optional] 
| **sortOrder** | **String**| Ascending or descending sort order | [optional] [default to ASC]<br />**Values**: ascending, descending 
{: class="table-striped"}


### Return type

[**GroupProfileEntityListing**](GroupProfileEntityListing)


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
| **body** | [**GroupMembersUpdate**](GroupMembersUpdate)| Add members | 
{: class="table-striped"}


### Return type

**Empty**


# **postGroups**


> [Group](Group) postGroups(body)

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
| **body** | [**GroupCreate**](GroupCreate)| Group | 
{: class="table-striped"}


### Return type

[**Group**](Group)


# **postGroupsDynamicsettingsPreview**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [DynamicGroupQueryPreview](DynamicGroupQueryPreview) postGroupsDynamicsettingsPreview(body)

Preview the number of users selected for a dynamic group definition query

postGroupsDynamicsettingsPreview is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/groups/dynamicsettings/preview  

Requires ANY permissions: 

* directory:group:view

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
DynamicGroupQuery body = new DynamicGroupQuery(); // DynamicGroupQuery | Group query to preview
try {
    DynamicGroupQueryPreview result = apiInstance.postGroupsDynamicsettingsPreview(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#postGroupsDynamicsettingsPreview");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**DynamicGroupQuery**](DynamicGroupQuery)| Group query to preview | 
{: class="table-striped"}


### Return type

[**DynamicGroupQueryPreview**](DynamicGroupQueryPreview)


# **postGroupsSearch**


> [GroupsSearchResponse](GroupsSearchResponse) postGroupsSearch(body)

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
| **body** | [**GroupSearchRequest**](GroupSearchRequest)| Search request options | 
{: class="table-striped"}


### Return type

[**GroupsSearchResponse**](GroupsSearchResponse)


# **putGroup**


> [Group](Group) putGroup(groupId, body)

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
| **body** | [**GroupUpdate**](GroupUpdate)| Group | [optional] 
{: class="table-striped"}


### Return type

[**Group**](Group)


# **putGroupDynamicsettings**


> Void putGroupDynamicsettings(groupId, body)

Create / Update dynamic group definition

putGroupDynamicsettings is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps PUT /api/v2/groups/{groupId}/dynamicsettings  

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
DynamicGroupQuery body = new DynamicGroupQuery(); // DynamicGroupQuery | Create/Update dynamic groups
try {
    apiInstance.putGroupDynamicsettings(groupId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#putGroupDynamicsettings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **groupId** | **String**| Group ID | 
| **body** | [**DynamicGroupQuery**](DynamicGroupQuery)| Create/Update dynamic groups | 
{: class="table-striped"}


### Return type

null (empty response body)


_com.mypurecloud.sdk.v2:platform-client-v2:237.0.0_
