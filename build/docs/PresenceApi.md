---
title: PresenceApi
---
## PresenceApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deletePresenceSource**](PresenceApi.html#deletePresenceSource) | Delete a Presence Source |
| [**deletePresencedefinition**](PresenceApi.html#deletePresencedefinition) | Delete a Presence Definition |
| [**getPresenceSource**](PresenceApi.html#getPresenceSource) | Get a Presence Source |
| [**getPresenceSources**](PresenceApi.html#getPresenceSources) | Get a list of Presence Sources |
| [**getPresenceUserPrimarysource**](PresenceApi.html#getPresenceUserPrimarysource) | Get a user's Primary Presence Source |
| [**getPresencedefinition**](PresenceApi.html#getPresencedefinition) | Get a Presence Definition |
| [**getPresencedefinitions**](PresenceApi.html#getPresencedefinitions) | Get an Organization's list of Presence Definitions |
| [**getSystempresences**](PresenceApi.html#getSystempresences) | Get the list of SystemPresences |
| [**getUserPresence**](PresenceApi.html#getUserPresence) | Get a user's Presence |
| [**getUserPresencesPurecloud**](PresenceApi.html#getUserPresencesPurecloud) | Get a user's Genesys Cloud presence. |
| [**patchUserPresence**](PresenceApi.html#patchUserPresence) | Patch a user's Presence |
| [**patchUserPresencesPurecloud**](PresenceApi.html#patchUserPresencesPurecloud) | Patch a Genesys Cloud user's presence |
| [**postPresenceSources**](PresenceApi.html#postPresenceSources) | Create a Presence Source |
| [**postPresencedefinitions**](PresenceApi.html#postPresencedefinitions) | Create a Presence Definition |
| [**putPresenceSource**](PresenceApi.html#putPresenceSource) | Update a Presence Source |
| [**putPresenceUserPrimarysource**](PresenceApi.html#putPresenceUserPrimarysource) | Update a user's Primary Presence Source |
| [**putPresencedefinition**](PresenceApi.html#putPresencedefinition) | Update a Presence Definition |
| [**putUsersPresencesBulk**](PresenceApi.html#putUsersPresencesBulk) | Update bulk user Presences |
{: class="table-striped"}

<a name="deletePresenceSource"></a>

# **deletePresenceSource**



> Void deletePresenceSource(sourceId)

Delete a Presence Source

Wraps DELETE /api/v2/presence/sources/{sourceId}  

Requires ANY permissions: 

* presence:source:delete
* presence:source:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.PresenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

PresenceApi apiInstance = new PresenceApi();
String sourceId = "sourceId_example"; // String | Presence Source ID
try {
    apiInstance.deletePresenceSource(sourceId);
} catch (ApiException e) {
    System.err.println("Exception when calling PresenceApi#deletePresenceSource");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sourceId** | **String**| Presence Source ID | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deletePresencedefinition"></a>

# **deletePresencedefinition**



> Void deletePresencedefinition(presenceId)

Delete a Presence Definition

Wraps DELETE /api/v2/presencedefinitions/{presenceId}  

Requires ALL permissions: 

* presence:presenceDefinition:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.PresenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

PresenceApi apiInstance = new PresenceApi();
String presenceId = "presenceId_example"; // String | Organization Presence ID
try {
    apiInstance.deletePresencedefinition(presenceId);
} catch (ApiException e) {
    System.err.println("Exception when calling PresenceApi#deletePresencedefinition");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **presenceId** | **String**| Organization Presence ID | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="getPresenceSource"></a>

# **getPresenceSource**



> [Source](Source.html) getPresenceSource(sourceId)

Get a Presence Source

Wraps GET /api/v2/presence/sources/{sourceId}  

Requires ALL permissions: 

* presence:source:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.PresenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

PresenceApi apiInstance = new PresenceApi();
String sourceId = "sourceId_example"; // String | Presence Source ID
try {
    Source result = apiInstance.getPresenceSource(sourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PresenceApi#getPresenceSource");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sourceId** | **String**| Presence Source ID | 
{: class="table-striped"}


### Return type

[**Source**](Source.html)

<a name="getPresenceSources"></a>

# **getPresenceSources**



> [SourceEntityListing](SourceEntityListing.html) getPresenceSources(deactivated)

Get a list of Presence Sources

Wraps GET /api/v2/presence/sources  

Requires ALL permissions: 

* presence:source:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.PresenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

PresenceApi apiInstance = new PresenceApi();
String deactivated = "false"; // String | Deactivated query can be TRUE or FALSE
try {
    SourceEntityListing result = apiInstance.getPresenceSources(deactivated);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PresenceApi#getPresenceSources");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deactivated** | **String**| Deactivated query can be TRUE or FALSE | [optional] [default to false] 
{: class="table-striped"}


### Return type

[**SourceEntityListing**](SourceEntityListing.html)

<a name="getPresenceUserPrimarysource"></a>

# **getPresenceUserPrimarysource**



> [UserPrimarySource](UserPrimarySource.html) getPresenceUserPrimarysource(userId)

Get a user's Primary Presence Source

Wraps GET /api/v2/presence/users/{userId}/primarysource  

Requires ALL permissions: 

* presence:userPrimarySource:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.PresenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

PresenceApi apiInstance = new PresenceApi();
String userId = "userId_example"; // String | user ID
try {
    UserPrimarySource result = apiInstance.getPresenceUserPrimarysource(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PresenceApi#getPresenceUserPrimarysource");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| user ID | 
{: class="table-striped"}


### Return type

[**UserPrimarySource**](UserPrimarySource.html)

<a name="getPresencedefinition"></a>

# **getPresencedefinition**



> [OrganizationPresence](OrganizationPresence.html) getPresencedefinition(presenceId, localeCode)

Get a Presence Definition

Wraps GET /api/v2/presencedefinitions/{presenceId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.PresenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

PresenceApi apiInstance = new PresenceApi();
String presenceId = "presenceId_example"; // String | Organization Presence ID
String localeCode = "localeCode_example"; // String | The locale code to fetch for the presence definition. Use ALL to fetch everything.
try {
    OrganizationPresence result = apiInstance.getPresencedefinition(presenceId, localeCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PresenceApi#getPresencedefinition");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **presenceId** | **String**| Organization Presence ID | 
| **localeCode** | **String**| The locale code to fetch for the presence definition. Use ALL to fetch everything. | [optional] 
{: class="table-striped"}


### Return type

[**OrganizationPresence**](OrganizationPresence.html)

<a name="getPresencedefinitions"></a>

# **getPresencedefinitions**



> [OrganizationPresenceEntityListing](OrganizationPresenceEntityListing.html) getPresencedefinitions(pageNumber, pageSize, deleted, localeCode)

Get an Organization's list of Presence Definitions

Wraps GET /api/v2/presencedefinitions  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.PresenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

PresenceApi apiInstance = new PresenceApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String deleted = "false"; // String | Deleted query can be TRUE, FALSE or ALL
String localeCode = "localeCode_example"; // String | The locale code to fetch for each presence definition. Use ALL to fetch everything.
try {
    OrganizationPresenceEntityListing result = apiInstance.getPresencedefinitions(pageNumber, pageSize, deleted, localeCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PresenceApi#getPresencedefinitions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **deleted** | **String**| Deleted query can be TRUE, FALSE or ALL | [optional] [default to false] 
| **localeCode** | **String**| The locale code to fetch for each presence definition. Use ALL to fetch everything. | [optional] 
{: class="table-striped"}


### Return type

[**OrganizationPresenceEntityListing**](OrganizationPresenceEntityListing.html)

<a name="getSystempresences"></a>

# **getSystempresences**



> [List&lt;SystemPresence&gt;](SystemPresence.html) getSystempresences()

Get the list of SystemPresences

Wraps GET /api/v2/systempresences  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.PresenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

PresenceApi apiInstance = new PresenceApi();
try {
    List<SystemPresence> result = apiInstance.getSystempresences();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PresenceApi#getSystempresences");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**List&lt;SystemPresence&gt;**](SystemPresence.html)

<a name="getUserPresence"></a>

# **getUserPresence**



> [UserPresence](UserPresence.html) getUserPresence(userId, sourceId)

Get a user's Presence

Get a user's presence for the specified source that is not specifically listed.  Used to support custom presence sources.

Wraps GET /api/v2/users/{userId}/presences/{sourceId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.PresenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

PresenceApi apiInstance = new PresenceApi();
String userId = "userId_example"; // String | user Id
String sourceId = "sourceId_example"; // String | Presence source ID
try {
    UserPresence result = apiInstance.getUserPresence(userId, sourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PresenceApi#getUserPresence");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| user Id | 
| **sourceId** | **String**| Presence source ID | 
{: class="table-striped"}


### Return type

[**UserPresence**](UserPresence.html)

<a name="getUserPresencesPurecloud"></a>

# **getUserPresencesPurecloud**



> [UserPresence](UserPresence.html) getUserPresencesPurecloud(userId)

Get a user's Genesys Cloud presence.

Get the default Genesys Cloud user presence source PURECLOUD

Wraps GET /api/v2/users/{userId}/presences/purecloud  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.PresenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

PresenceApi apiInstance = new PresenceApi();
String userId = "userId_example"; // String | user Id
try {
    UserPresence result = apiInstance.getUserPresencesPurecloud(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PresenceApi#getUserPresencesPurecloud");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| user Id | 
{: class="table-striped"}


### Return type

[**UserPresence**](UserPresence.html)

<a name="patchUserPresence"></a>

# **patchUserPresence**



> [UserPresence](UserPresence.html) patchUserPresence(userId, sourceId, body)

Patch a user's Presence

Patch a user's presence for the specified source that is not specifically listed. The presence object can be patched one of three ways. Option 1: Set the 'primary' property to true. This will set the 'source' defined in the path as the user's primary presence source. Option 2: Provide the presenceDefinition value. The 'id' is the only value required within the presenceDefinition. Option 3: Provide the message value. Option 1 can be combined with Option 2 and/or Option 3.

Wraps PATCH /api/v2/users/{userId}/presences/{sourceId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.PresenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

PresenceApi apiInstance = new PresenceApi();
String userId = "userId_example"; // String | user Id
String sourceId = "sourceId_example"; // String | Presence source ID
UserPresence body = new UserPresence(); // UserPresence | User presence
try {
    UserPresence result = apiInstance.patchUserPresence(userId, sourceId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PresenceApi#patchUserPresence");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| user Id | 
| **sourceId** | **String**| Presence source ID | 
| **body** | [**UserPresence**](UserPresence.html)| User presence | 
{: class="table-striped"}


### Return type

[**UserPresence**](UserPresence.html)

<a name="patchUserPresencesPurecloud"></a>

# **patchUserPresencesPurecloud**



> [UserPresence](UserPresence.html) patchUserPresencesPurecloud(userId, body)

Patch a Genesys Cloud user's presence

The presence object can be patched one of three ways. Option 1: Set the 'primary' property to true. This will set the PURECLOUD source as the user's primary presence source. Option 2: Provide the presenceDefinition value. The 'id' is the only value required within the presenceDefinition. Option 3: Provide the message value. Option 1 can be combined with Option 2 and/or Option 3.

Wraps PATCH /api/v2/users/{userId}/presences/purecloud  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.PresenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

PresenceApi apiInstance = new PresenceApi();
String userId = "userId_example"; // String | user Id
UserPresence body = new UserPresence(); // UserPresence | User presence
try {
    UserPresence result = apiInstance.patchUserPresencesPurecloud(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PresenceApi#patchUserPresencesPurecloud");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| user Id | 
| **body** | [**UserPresence**](UserPresence.html)| User presence | 
{: class="table-striped"}


### Return type

[**UserPresence**](UserPresence.html)

<a name="postPresenceSources"></a>

# **postPresenceSources**



> [Source](Source.html) postPresenceSources(body)

Create a Presence Source

Wraps POST /api/v2/presence/sources  

Requires ALL permissions: 

* presence:source:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.PresenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

PresenceApi apiInstance = new PresenceApi();
Source body = new Source(); // Source | The Presence Source to create
try {
    Source result = apiInstance.postPresenceSources(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PresenceApi#postPresenceSources");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**Source**](Source.html)| The Presence Source to create | 
{: class="table-striped"}


### Return type

[**Source**](Source.html)

<a name="postPresencedefinitions"></a>

# **postPresencedefinitions**



> [OrganizationPresence](OrganizationPresence.html) postPresencedefinitions(body)

Create a Presence Definition

Wraps POST /api/v2/presencedefinitions  

Requires ALL permissions: 

* presence:presenceDefinition:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.PresenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

PresenceApi apiInstance = new PresenceApi();
OrganizationPresence body = new OrganizationPresence(); // OrganizationPresence | The Presence Definition to create
try {
    OrganizationPresence result = apiInstance.postPresencedefinitions(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PresenceApi#postPresencedefinitions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**OrganizationPresence**](OrganizationPresence.html)| The Presence Definition to create | 
{: class="table-striped"}


### Return type

[**OrganizationPresence**](OrganizationPresence.html)

<a name="putPresenceSource"></a>

# **putPresenceSource**



> [Source](Source.html) putPresenceSource(sourceId, body)

Update a Presence Source

Wraps PUT /api/v2/presence/sources/{sourceId}  

Requires ALL permissions: 

* presence:source:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.PresenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

PresenceApi apiInstance = new PresenceApi();
String sourceId = "sourceId_example"; // String | Presence Source ID
Source body = new Source(); // Source | The updated Presence Source
try {
    Source result = apiInstance.putPresenceSource(sourceId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PresenceApi#putPresenceSource");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sourceId** | **String**| Presence Source ID | 
| **body** | [**Source**](Source.html)| The updated Presence Source | 
{: class="table-striped"}


### Return type

[**Source**](Source.html)

<a name="putPresenceUserPrimarysource"></a>

# **putPresenceUserPrimarysource**



> [UserPrimarySource](UserPrimarySource.html) putPresenceUserPrimarysource(userId, body)

Update a user's Primary Presence Source

Wraps PUT /api/v2/presence/users/{userId}/primarysource  

Requires ALL permissions: 

* presence:userPrimarySource:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.PresenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

PresenceApi apiInstance = new PresenceApi();
String userId = "userId_example"; // String | user ID
UserPrimarySource body = new UserPrimarySource(); // UserPrimarySource | Primary Source
try {
    UserPrimarySource result = apiInstance.putPresenceUserPrimarysource(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PresenceApi#putPresenceUserPrimarysource");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| user ID | 
| **body** | [**UserPrimarySource**](UserPrimarySource.html)| Primary Source | 
{: class="table-striped"}


### Return type

[**UserPrimarySource**](UserPrimarySource.html)

<a name="putPresencedefinition"></a>

# **putPresencedefinition**



> [OrganizationPresence](OrganizationPresence.html) putPresencedefinition(presenceId, body)

Update a Presence Definition

Wraps PUT /api/v2/presencedefinitions/{presenceId}  

Requires ALL permissions: 

* presence:presenceDefinition:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.PresenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

PresenceApi apiInstance = new PresenceApi();
String presenceId = "presenceId_example"; // String | Organization Presence ID
OrganizationPresence body = new OrganizationPresence(); // OrganizationPresence | The OrganizationPresence to update
try {
    OrganizationPresence result = apiInstance.putPresencedefinition(presenceId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PresenceApi#putPresencedefinition");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **presenceId** | **String**| Organization Presence ID | 
| **body** | [**OrganizationPresence**](OrganizationPresence.html)| The OrganizationPresence to update | 
{: class="table-striped"}


### Return type

[**OrganizationPresence**](OrganizationPresence.html)

<a name="putUsersPresencesBulk"></a>

# **putUsersPresencesBulk**



> [List&lt;UserPresence&gt;](UserPresence.html) putUsersPresencesBulk(body)

Update bulk user Presences

Wraps PUT /api/v2/users/presences/bulk  

Requires ANY permissions: 

* presence:userPresence:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.PresenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

PresenceApi apiInstance = new PresenceApi();
List<UserPresence> body = Arrays.asList(new UserPresence()); // List<UserPresence> | List of User presences
try {
    List<UserPresence> result = apiInstance.putUsersPresencesBulk(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PresenceApi#putUsersPresencesBulk");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**List&lt;UserPresence&gt;**](UserPresence.html)| List of User presences | 
{: class="table-striped"}


### Return type

[**List&lt;UserPresence&gt;**](UserPresence.html)

