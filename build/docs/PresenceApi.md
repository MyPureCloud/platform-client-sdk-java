---
title: PresenceApi
---
## PresenceApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deletePresenceDefinition0**](PresenceApi.html#deletePresenceDefinition0) | Delete a Presence Definition |
| [**deletePresenceSource**](PresenceApi.html#deletePresenceSource) | Delete a Presence Source |
| [**deletePresencedefinition**](PresenceApi.html#deletePresencedefinition) | Delete a Presence Definition. Apps should migrate to use DELETE /api/v2/presence/definitions/{definitionId} instead |
| [**getPresenceDefinition0**](PresenceApi.html#getPresenceDefinition0) | Get a Presence Definition |
| [**getPresenceDefinitions0**](PresenceApi.html#getPresenceDefinitions0) | Get a list of Presence Definitions |
| [**getPresenceSettings**](PresenceApi.html#getPresenceSettings) | Get the presence settings |
| [**getPresenceSource**](PresenceApi.html#getPresenceSource) | Get a Presence Source |
| [**getPresenceSources**](PresenceApi.html#getPresenceSources) | Get a list of Presence Sources |
| [**getPresenceUserPrimarysource**](PresenceApi.html#getPresenceUserPrimarysource) | Get a user's Primary Presence Source |
| [**getPresencedefinition**](PresenceApi.html#getPresencedefinition) | Get a Presence Definition. Apps should migrate to use GET /api/v2/presence/definitions/{definitionId} instead |
| [**getPresencedefinitions**](PresenceApi.html#getPresencedefinitions) | Get an Organization's list of Presence Definitions. Apps should migrate to use GET /api/v2/presence/definitions instead |
| [**getSystempresences**](PresenceApi.html#getSystempresences) | Get the list of SystemPresences |
| [**getUserPresence**](PresenceApi.html#getUserPresence) | Get a user's Presence |
| [**getUserPresencesPurecloud**](PresenceApi.html#getUserPresencesPurecloud) | Get a user's Genesys Cloud presence. |
| [**getUsersPresenceBulk**](PresenceApi.html#getUsersPresenceBulk) | Get bulk user presences for a single presence source |
| [**getUsersPresencesPurecloudBulk**](PresenceApi.html#getUsersPresencesPurecloudBulk) | Get bulk user presences for a Genesys Cloud (PURECLOUD) presence source |
| [**patchUserPresence**](PresenceApi.html#patchUserPresence) | Patch a user's Presence |
| [**patchUserPresencesPurecloud**](PresenceApi.html#patchUserPresencesPurecloud) | Patch a Genesys Cloud user's presence |
| [**postPresenceDefinitions0**](PresenceApi.html#postPresenceDefinitions0) | Create a Presence Definition |
| [**postPresenceSources**](PresenceApi.html#postPresenceSources) | Create a Presence Source |
| [**postPresencedefinitions**](PresenceApi.html#postPresencedefinitions) | Create a Presence Definition. Apps should migrate to use POST /api/v2/presence/definitions instead |
| [**putPresenceDefinition0**](PresenceApi.html#putPresenceDefinition0) | Update a Presence Definition |
| [**putPresenceSettings**](PresenceApi.html#putPresenceSettings) | Update the presence settings |
| [**putPresenceSource**](PresenceApi.html#putPresenceSource) | Update a Presence Source |
| [**putPresenceUserPrimarysource**](PresenceApi.html#putPresenceUserPrimarysource) | Update a user's Primary Presence Source |
| [**putPresencedefinition**](PresenceApi.html#putPresencedefinition) | Update a Presence Definition. Apps should migrate to use PUT /api/v2/presence/definitions/{definitionId} instead) |
| [**putUsersPresencesBulk**](PresenceApi.html#putUsersPresencesBulk) | Update bulk user Presences |
{: class="table-striped"}

<a name="deletePresenceDefinition0"></a>

# **deletePresenceDefinition0**



> Void deletePresenceDefinition0(definitionId)

Delete a Presence Definition

Wraps DELETE /api/v2/presence/definitions/{definitionId}  

Requires ANY permissions: 

* presence:presenceDefinition:delete
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
String definitionId = "definitionId_example"; // String | Presence Definition ID
try {
    apiInstance.deletePresenceDefinition0(definitionId);
} catch (ApiException e) {
    System.err.println("Exception when calling PresenceApi#deletePresenceDefinition0");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **definitionId** | **String**| Presence Definition ID | 
{: class="table-striped"}


### Return type

null (empty response body)

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

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> Void deletePresencedefinition(presenceId)

Delete a Presence Definition. Apps should migrate to use DELETE /api/v2/presence/definitions/{definitionId} instead

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

<a name="getPresenceDefinition0"></a>

# **getPresenceDefinition0**



> [OrganizationPresenceDefinition](OrganizationPresenceDefinition.html) getPresenceDefinition0(definitionId, localeCode)

Get a Presence Definition

Wraps GET /api/v2/presence/definitions/{definitionId}  

Requires ALL permissions: 

* presence:presenceDefinition:view

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
String definitionId = "definitionId_example"; // String | Presence Definition ID
String localeCode = "localeCode_example"; // String | The locale code to fetch for the presence definition. Use ALL to fetch everything.
try {
    OrganizationPresenceDefinition result = apiInstance.getPresenceDefinition0(definitionId, localeCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PresenceApi#getPresenceDefinition0");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **definitionId** | **String**| Presence Definition ID | 
| **localeCode** | **String**| The locale code to fetch for the presence definition. Use ALL to fetch everything. | [optional]<br />**Values**: ALL, he, fr, en_US, da, de, it, cs, es, fi, ar, ja, ko, nl, no, pl, pt_BR, pt_PT, ru, sv, th, tr, uk, zh_CN, zh_TW 
{: class="table-striped"}


### Return type

[**OrganizationPresenceDefinition**](OrganizationPresenceDefinition.html)

<a name="getPresenceDefinitions0"></a>

# **getPresenceDefinitions0**



> [OrganizationPresenceDefinitionEntityListing](OrganizationPresenceDefinitionEntityListing.html) getPresenceDefinitions0(deactivated, divisionId, localeCode)

Get a list of Presence Definitions

Wraps GET /api/v2/presence/definitions  

Requires ALL permissions: 

* presence:presenceDefinition:view

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
List<String> divisionId = Arrays.asList(null); // List<String> | One or more division IDs. If nothing is provided, the definitions associated withthe list of divisions that the user has access to will be returned.
String localeCode = "localeCode_example"; // String | The locale code to fetch for the presence definition. Use ALL to fetch everything.
try {
    OrganizationPresenceDefinitionEntityListing result = apiInstance.getPresenceDefinitions0(deactivated, divisionId, localeCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PresenceApi#getPresenceDefinitions0");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deactivated** | **String**| Deactivated query can be TRUE or FALSE | [optional] [default to false] 
| **divisionId** | [**List&lt;String&gt;**](String.html)| One or more division IDs. If nothing is provided, the definitions associated withthe list of divisions that the user has access to will be returned. | [optional] 
| **localeCode** | **String**| The locale code to fetch for the presence definition. Use ALL to fetch everything. | [optional]<br />**Values**: ALL, he, fr, en_US, da, de, it, cs, es, fi, ar, ja, ko, nl, no, pl, pt_BR, pt_PT, ru, sv, th, tr, uk, zh_CN, zh_TW 
{: class="table-striped"}


### Return type

[**OrganizationPresenceDefinitionEntityListing**](OrganizationPresenceDefinitionEntityListing.html)

<a name="getPresenceSettings"></a>

# **getPresenceSettings**



> [PresenceSettings](PresenceSettings.html) getPresenceSettings()

Get the presence settings

Wraps GET /api/v2/presence/settings  

Requires ALL permissions: 

* presence:settings:view

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
    PresenceSettings result = apiInstance.getPresenceSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PresenceApi#getPresenceSettings");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**PresenceSettings**](PresenceSettings.html)

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

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [OrganizationPresence](OrganizationPresence.html) getPresencedefinition(presenceId, localeCode)

Get a Presence Definition. Apps should migrate to use GET /api/v2/presence/definitions/{definitionId} instead

Wraps GET /api/v2/presencedefinitions/{presenceId}  

Requires ALL permissions: 

* presence:presenceDefinition:view

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

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [OrganizationPresenceEntityListing](OrganizationPresenceEntityListing.html) getPresencedefinitions(pageNumber, pageSize, deleted, localeCode)

Get an Organization's list of Presence Definitions. Apps should migrate to use GET /api/v2/presence/definitions instead

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

Get a user's presence for the specified source that is not specifically listed.  Used to support custom presence sources. This endpoint does not support registered presence sources.

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

<a name="getUsersPresenceBulk"></a>

# **getUsersPresenceBulk**



> [List&lt;UcUserPresence&gt;](UcUserPresence.html) getUsersPresenceBulk(sourceId, id)

Get bulk user presences for a single presence source

Wraps GET /api/v2/users/presences/{sourceId}/bulk  

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
String sourceId = "sourceId_example"; // String | The requested presence source ID.
List<String> id = Arrays.asList(null); // List<String> | A comma separated list of user IDs to fetch their presence status in bulk. Limit 50.
try {
    List<UcUserPresence> result = apiInstance.getUsersPresenceBulk(sourceId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PresenceApi#getUsersPresenceBulk");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sourceId** | **String**| The requested presence source ID. | 
| **id** | [**List&lt;String&gt;**](String.html)| A comma separated list of user IDs to fetch their presence status in bulk. Limit 50. | [optional] 
{: class="table-striped"}


### Return type

[**List&lt;UcUserPresence&gt;**](UcUserPresence.html)

<a name="getUsersPresencesPurecloudBulk"></a>

# **getUsersPresencesPurecloudBulk**



> [List&lt;UcUserPresence&gt;](UcUserPresence.html) getUsersPresencesPurecloudBulk(id)

Get bulk user presences for a Genesys Cloud (PURECLOUD) presence source

Wraps GET /api/v2/users/presences/purecloud/bulk  

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
List<String> id = Arrays.asList(null); // List<String> | A comma separated list of user IDs to fetch their presence status in bulk. Limit 50.
try {
    List<UcUserPresence> result = apiInstance.getUsersPresencesPurecloudBulk(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PresenceApi#getUsersPresencesPurecloudBulk");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | [**List&lt;String&gt;**](String.html)| A comma separated list of user IDs to fetch their presence status in bulk. Limit 50. | [optional] 
{: class="table-striped"}


### Return type

[**List&lt;UcUserPresence&gt;**](UcUserPresence.html)

<a name="patchUserPresence"></a>

# **patchUserPresence**



> [UserPresence](UserPresence.html) patchUserPresence(userId, sourceId, body)

Patch a user's Presence

Patch a user's presence for the specified source that is not specifically listed. This endpoint does not support registered presence sources. The presence object can be patched one of three ways. Option 1: Set the 'primary' property to true. This will set the 'source' defined in the path as the user's primary presence source. Option 2: Provide the presenceDefinition value. The 'id' is the only value required within the presenceDefinition. Option 3: Provide the message value. Option 1 can be combined with Option 2 and/or Option 3.

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

<a name="postPresenceDefinitions0"></a>

# **postPresenceDefinitions0**



> [OrganizationPresenceDefinition](OrganizationPresenceDefinition.html) postPresenceDefinitions0(body)

Create a Presence Definition

Wraps POST /api/v2/presence/definitions  

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
OrganizationPresenceDefinition body = new OrganizationPresenceDefinition(); // OrganizationPresenceDefinition | The Presence Definition to create
try {
    OrganizationPresenceDefinition result = apiInstance.postPresenceDefinitions0(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PresenceApi#postPresenceDefinitions0");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**OrganizationPresenceDefinition**](OrganizationPresenceDefinition.html)| The Presence Definition to create | 
{: class="table-striped"}


### Return type

[**OrganizationPresenceDefinition**](OrganizationPresenceDefinition.html)

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

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [OrganizationPresence](OrganizationPresence.html) postPresencedefinitions(body)

Create a Presence Definition. Apps should migrate to use POST /api/v2/presence/definitions instead

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

<a name="putPresenceDefinition0"></a>

# **putPresenceDefinition0**



> [OrganizationPresenceDefinition](OrganizationPresenceDefinition.html) putPresenceDefinition0(definitionId, body)

Update a Presence Definition

Wraps PUT /api/v2/presence/definitions/{definitionId}  

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
String definitionId = "definitionId_example"; // String | Presence Definition ID
OrganizationPresenceDefinition body = new OrganizationPresenceDefinition(); // OrganizationPresenceDefinition | The updated Presence Definition
try {
    OrganizationPresenceDefinition result = apiInstance.putPresenceDefinition0(definitionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PresenceApi#putPresenceDefinition0");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **definitionId** | **String**| Presence Definition ID | 
| **body** | [**OrganizationPresenceDefinition**](OrganizationPresenceDefinition.html)| The updated Presence Definition | 
{: class="table-striped"}


### Return type

[**OrganizationPresenceDefinition**](OrganizationPresenceDefinition.html)

<a name="putPresenceSettings"></a>

# **putPresenceSettings**



> [PresenceSettings](PresenceSettings.html) putPresenceSettings(body)

Update the presence settings

Wraps PUT /api/v2/presence/settings  

Requires ALL permissions: 

* presence:settings:edit

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
PresenceSettings body = new PresenceSettings(); // PresenceSettings | Presence Settings
try {
    PresenceSettings result = apiInstance.putPresenceSettings(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PresenceApi#putPresenceSettings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**PresenceSettings**](PresenceSettings.html)| Presence Settings | 
{: class="table-striped"}


### Return type

[**PresenceSettings**](PresenceSettings.html)

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

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [OrganizationPresence](OrganizationPresence.html) putPresencedefinition(presenceId, body)

Update a Presence Definition. Apps should migrate to use PUT /api/v2/presence/definitions/{definitionId} instead)

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
List<MutableUserPresence> body = Arrays.asList(new MutableUserPresence()); // List<MutableUserPresence> | List of User presences
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
| **body** | [**List&lt;MutableUserPresence&gt;**](MutableUserPresence.html)| List of User presences | 
{: class="table-striped"}


### Return type

[**List&lt;UserPresence&gt;**](UserPresence.html)

