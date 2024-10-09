# PresenceApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deletePresenceDefinition0**](PresenceApi#deletePresenceDefinition0) | Delete a Presence Definition |
| [**deletePresenceSource**](PresenceApi#deletePresenceSource) | Delete a Presence Source |
| [**deletePresencedefinition**](PresenceApi#deletePresencedefinition) | Delete a Presence Definition. Apps should migrate to use DELETE /api/v2/presence/definitions/{definitionId} instead |
| [**getPresenceDefinition0**](PresenceApi#getPresenceDefinition0) | Get a Presence Definition |
| [**getPresenceDefinitions0**](PresenceApi#getPresenceDefinitions0) | Get a list of Presence Definitions |
| [**getPresenceSettings**](PresenceApi#getPresenceSettings) | Get the presence settings |
| [**getPresenceSource**](PresenceApi#getPresenceSource) | Get a Presence Source |
| [**getPresenceSources**](PresenceApi#getPresenceSources) | Get a list of Presence Sources |
| [**getPresenceUserPrimarysource**](PresenceApi#getPresenceUserPrimarysource) | Get a user's Primary Presence Source |
| [**getPresencedefinition**](PresenceApi#getPresencedefinition) | Get a Presence Definition. Apps should migrate to use GET /api/v2/presence/definitions/{definitionId} instead |
| [**getPresencedefinitions**](PresenceApi#getPresencedefinitions) | Get an Organization's list of Presence Definitions. Apps should migrate to use GET /api/v2/presence/definitions instead |
| [**getSystempresences**](PresenceApi#getSystempresences) | Get the list of SystemPresences |
| [**getUserPresence**](PresenceApi#getUserPresence) | Get a user's Presence |
| [**getUserPresencesPurecloud**](PresenceApi#getUserPresencesPurecloud) | Get a user's Genesys Cloud presence. |
| [**getUsersPresenceBulk**](PresenceApi#getUsersPresenceBulk) | Get bulk user presences for a single presence source |
| [**getUsersPresencesPurecloudBulk**](PresenceApi#getUsersPresencesPurecloudBulk) | Get bulk user presences for a Genesys Cloud (PURECLOUD) presence source |
| [**patchUserPresence**](PresenceApi#patchUserPresence) | Patch a user's Presence |
| [**patchUserPresencesPurecloud**](PresenceApi#patchUserPresencesPurecloud) | Patch a Genesys Cloud user's presence |
| [**postPresenceDefinitions0**](PresenceApi#postPresenceDefinitions0) | Create a Presence Definition |
| [**postPresenceSources**](PresenceApi#postPresenceSources) | Create a Presence Source |
| [**postPresencedefinitions**](PresenceApi#postPresencedefinitions) | Create a Presence Definition. Apps should migrate to use POST /api/v2/presence/definitions instead |
| [**putPresenceDefinition0**](PresenceApi#putPresenceDefinition0) | Update a Presence Definition |
| [**putPresenceSettings**](PresenceApi#putPresenceSettings) | Update the presence settings |
| [**putPresenceSource**](PresenceApi#putPresenceSource) | Update a Presence Source |
| [**putPresenceUserPrimarysource**](PresenceApi#putPresenceUserPrimarysource) | Update a user's Primary Presence Source |
| [**putPresencedefinition**](PresenceApi#putPresencedefinition) | Update a Presence Definition. Apps should migrate to use PUT /api/v2/presence/definitions/{definitionId} instead) |
| [**putUsersPresencesBulk**](PresenceApi#putUsersPresencesBulk) | Update bulk user Presences |
{: class="table-striped"}


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


# **deletePresencedefinition**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

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


# **getPresenceDefinition0**


> [OrganizationPresenceDefinition](OrganizationPresenceDefinition) getPresenceDefinition0(definitionId, localeCode)

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

[**OrganizationPresenceDefinition**](OrganizationPresenceDefinition)


# **getPresenceDefinitions0**


> [OrganizationPresenceDefinitionEntityListing](OrganizationPresenceDefinitionEntityListing) getPresenceDefinitions0(deactivated, divisionId, localeCode)

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
| **divisionId** | [**List&lt;String&gt;**](String)| One or more division IDs. If nothing is provided, the definitions associated withthe list of divisions that the user has access to will be returned. | [optional] 
| **localeCode** | **String**| The locale code to fetch for the presence definition. Use ALL to fetch everything. | [optional]<br />**Values**: ALL, he, fr, en_US, da, de, it, cs, es, fi, ar, ja, ko, nl, no, pl, pt_BR, pt_PT, ru, sv, th, tr, uk, zh_CN, zh_TW 
{: class="table-striped"}


### Return type

[**OrganizationPresenceDefinitionEntityListing**](OrganizationPresenceDefinitionEntityListing)


# **getPresenceSettings**


> [PresenceSettings](PresenceSettings) getPresenceSettings()

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

[**PresenceSettings**](PresenceSettings)


# **getPresenceSource**


> [Source](Source) getPresenceSource(sourceId)

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

[**Source**](Source)


# **getPresenceSources**


> [SourceEntityListing](SourceEntityListing) getPresenceSources(deactivated)

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

[**SourceEntityListing**](SourceEntityListing)


# **getPresenceUserPrimarysource**


> [UserPrimarySource](UserPrimarySource) getPresenceUserPrimarysource(userId)

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

[**UserPrimarySource**](UserPrimarySource)


# **getPresencedefinition**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [OrganizationPresence](OrganizationPresence) getPresencedefinition(presenceId, localeCode)

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

[**OrganizationPresence**](OrganizationPresence)


# **getPresencedefinitions**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [OrganizationPresenceEntityListing](OrganizationPresenceEntityListing) getPresencedefinitions(pageNumber, pageSize, deleted, localeCode)

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

[**OrganizationPresenceEntityListing**](OrganizationPresenceEntityListing)


# **getSystempresences**


> [List&lt;SystemPresence&gt;](SystemPresence) getSystempresences()

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

[**List&lt;SystemPresence&gt;**](SystemPresence)


# **getUserPresence**


> [UserPresence](UserPresence) getUserPresence(userId, sourceId)

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

[**UserPresence**](UserPresence)


# **getUserPresencesPurecloud**


> [UserPresence](UserPresence) getUserPresencesPurecloud(userId)

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

[**UserPresence**](UserPresence)


# **getUsersPresenceBulk**


> [List&lt;UcUserPresence&gt;](UcUserPresence) getUsersPresenceBulk(sourceId, id)

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
| **id** | [**List&lt;String&gt;**](String)| A comma separated list of user IDs to fetch their presence status in bulk. Limit 50. | [optional] 
{: class="table-striped"}


### Return type

[**List&lt;UcUserPresence&gt;**](UcUserPresence)


# **getUsersPresencesPurecloudBulk**


> [List&lt;UcUserPresence&gt;](UcUserPresence) getUsersPresencesPurecloudBulk(id)

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
| **id** | [**List&lt;String&gt;**](String)| A comma separated list of user IDs to fetch their presence status in bulk. Limit 50. | [optional] 
{: class="table-striped"}


### Return type

[**List&lt;UcUserPresence&gt;**](UcUserPresence)


# **patchUserPresence**


> [UserPresence](UserPresence) patchUserPresence(userId, sourceId, body)

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
| **body** | [**UserPresence**](UserPresence)| User presence | 
{: class="table-striped"}


### Return type

[**UserPresence**](UserPresence)


# **patchUserPresencesPurecloud**


> [UserPresence](UserPresence) patchUserPresencesPurecloud(userId, body)

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
| **body** | [**UserPresence**](UserPresence)| User presence | 
{: class="table-striped"}


### Return type

[**UserPresence**](UserPresence)


# **postPresenceDefinitions0**


> [OrganizationPresenceDefinition](OrganizationPresenceDefinition) postPresenceDefinitions0(body)

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
| **body** | [**OrganizationPresenceDefinition**](OrganizationPresenceDefinition)| The Presence Definition to create | 
{: class="table-striped"}


### Return type

[**OrganizationPresenceDefinition**](OrganizationPresenceDefinition)


# **postPresenceSources**


> [Source](Source) postPresenceSources(body)

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
| **body** | [**Source**](Source)| The Presence Source to create | 
{: class="table-striped"}


### Return type

[**Source**](Source)


# **postPresencedefinitions**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [OrganizationPresence](OrganizationPresence) postPresencedefinitions(body)

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
| **body** | [**OrganizationPresence**](OrganizationPresence)| The Presence Definition to create | 
{: class="table-striped"}


### Return type

[**OrganizationPresence**](OrganizationPresence)


# **putPresenceDefinition0**


> [OrganizationPresenceDefinition](OrganizationPresenceDefinition) putPresenceDefinition0(definitionId, body)

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
| **body** | [**OrganizationPresenceDefinition**](OrganizationPresenceDefinition)| The updated Presence Definition | 
{: class="table-striped"}


### Return type

[**OrganizationPresenceDefinition**](OrganizationPresenceDefinition)


# **putPresenceSettings**


> [PresenceSettings](PresenceSettings) putPresenceSettings(body)

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
| **body** | [**PresenceSettings**](PresenceSettings)| Presence Settings | 
{: class="table-striped"}


### Return type

[**PresenceSettings**](PresenceSettings)


# **putPresenceSource**


> [Source](Source) putPresenceSource(sourceId, body)

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
| **body** | [**Source**](Source)| The updated Presence Source | 
{: class="table-striped"}


### Return type

[**Source**](Source)


# **putPresenceUserPrimarysource**


> [UserPrimarySource](UserPrimarySource) putPresenceUserPrimarysource(userId, body)

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
| **body** | [**UserPrimarySource**](UserPrimarySource)| Primary Source | 
{: class="table-striped"}


### Return type

[**UserPrimarySource**](UserPrimarySource)


# **putPresencedefinition**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [OrganizationPresence](OrganizationPresence) putPresencedefinition(presenceId, body)

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
| **body** | [**OrganizationPresence**](OrganizationPresence)| The OrganizationPresence to update | 
{: class="table-striped"}


### Return type

[**OrganizationPresence**](OrganizationPresence)


# **putUsersPresencesBulk**


> [List&lt;UserPresence&gt;](UserPresence) putUsersPresencesBulk(body)

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
| **body** | [**List&lt;MutableUserPresence&gt;**](MutableUserPresence)| List of User presences | 
{: class="table-striped"}


### Return type

[**List&lt;UserPresence&gt;**](UserPresence)


_com.mypurecloud.sdk.v2:platform-client-v2:210.0.0_
