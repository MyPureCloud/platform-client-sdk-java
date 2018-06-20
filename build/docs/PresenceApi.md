---
title: PresenceApi
---
## PresenceApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deletePresencedefinition**](PresenceApi.html#deletePresencedefinition) | Delete a Presence Definition |
| [**getPresencedefinition**](PresenceApi.html#getPresencedefinition) | Get a Presence Definition |
| [**getPresencedefinitions**](PresenceApi.html#getPresencedefinitions) | Get an Organization&#39;s list of Presence Definitions |
| [**getSystempresences**](PresenceApi.html#getSystempresences) | Get the list of SystemPresences |
| [**getUserPresence**](PresenceApi.html#getUserPresence) | Get a user&#39;s Presence |
| [**patchUserPresence**](PresenceApi.html#patchUserPresence) | Patch a user&#39;s Presence |
| [**postPresencedefinitions**](PresenceApi.html#postPresencedefinitions) | Create a Presence Definition |
| [**putPresencedefinition**](PresenceApi.html#putPresencedefinition) | Update a Presence Definition |
{: class="table table-striped"}

<a name="deletePresencedefinition"></a>

# **deletePresencedefinition**



> Void deletePresencedefinition(presenceId)

Delete a Presence Definition



Wraps DELETE /api/v2/presencedefinitions/{presenceId}  

Requires ANY permissions: 

* presence:presenceDefinition:delete

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.PresenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

PresenceApi apiInstance = new PresenceApi();
String presenceId = "presenceId_example"; // String | Organization Presence ID
try {
    apiInstance.deletePresencedefinition(presenceId);
} catch (ApiException e) {
    System.err.println("Exception when calling PresenceApi#deletePresencedefinition");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **presenceId** | **String**| Organization Presence ID | |
{: class="table table-striped"}

### Return type

null (empty response body)

<a name="getPresencedefinition"></a>

# **getPresencedefinition**



> [OrganizationPresence](OrganizationPresence.html) getPresencedefinition(presenceId, localeCode)

Get a Presence Definition



Wraps GET /api/v2/presencedefinitions/{presenceId}  

Requires NO permissions: 


### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.PresenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

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
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **presenceId** | **String**| Organization Presence ID | |
| **localeCode** | **String**| The locale code to fetch for the presence definition. Use ALL to fetch everything. | [optional] |
{: class="table table-striped"}

### Return type

[**OrganizationPresence**](OrganizationPresence.html)

<a name="getPresencedefinitions"></a>

# **getPresencedefinitions**



> [OrganizationPresenceEntityListing](OrganizationPresenceEntityListing.html) getPresencedefinitions(pageNumber, pageSize, deleted, localeCode)

Get an Organization&#39;s list of Presence Definitions



Wraps GET /api/v2/presencedefinitions  

Requires NO permissions: 


### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.PresenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

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
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] |
| **deleted** | **String**| Deleted query can be TRUE, FALSE or ALL | [optional] [default to false] |
| **localeCode** | **String**| The locale code to fetch for each presence definition. Use ALL to fetch everything. | [optional] |
{: class="table table-striped"}

### Return type

[**OrganizationPresenceEntityListing**](OrganizationPresenceEntityListing.html)

<a name="getSystempresences"></a>

# **getSystempresences**



> [List&lt;SystemPresence&gt;](SystemPresence.html) getSystempresences()

Get the list of SystemPresences



Wraps GET /api/v2/systempresences  

Requires NO permissions: 


### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.PresenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

PresenceApi apiInstance = new PresenceApi();
try {
    List<SystemPresence> result = apiInstance.getSystempresences();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PresenceApi#getSystempresences");
    e.printStackTrace();
}
~~~

### Parameters

This endpoint does not require any parameters.
{: class="table table-striped"}

### Return type

[**List&lt;SystemPresence&gt;**](SystemPresence.html)

<a name="getUserPresence"></a>

# **getUserPresence**



> [UserPresence](UserPresence.html) getUserPresence(userId, sourceId)

Get a user&#39;s Presence



Wraps GET /api/v2/users/{userId}/presences/{sourceId}  

Requires NO permissions: 


### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.PresenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

PresenceApi apiInstance = new PresenceApi();
String userId = "userId_example"; // String | user Id
String sourceId = "sourceId_example"; // String | Source
try {
    UserPresence result = apiInstance.getUserPresence(userId, sourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PresenceApi#getUserPresence");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| user Id | |
| **sourceId** | **String**| Source | |
{: class="table table-striped"}

### Return type

[**UserPresence**](UserPresence.html)

<a name="patchUserPresence"></a>

# **patchUserPresence**



> [UserPresence](UserPresence.html) patchUserPresence(userId, sourceId, body)

Patch a user&#39;s Presence

The presence object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the &#39;source&#39; defined in the path as the user&#39;s primary presence source. Option 2: Provide the presenceDefinition value. The &#39;id&#39; is the only value required within the presenceDefinition. Option 3: Provide the message value. Option 1 can be combined with Option 2 and/or Option 3.

Wraps PATCH /api/v2/users/{userId}/presences/{sourceId}  

Requires NO permissions: 


### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.PresenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

PresenceApi apiInstance = new PresenceApi();
String userId = "userId_example"; // String | user Id
String sourceId = "sourceId_example"; // String | Source
UserPresence body = new UserPresence(); // UserPresence | User presence
try {
    UserPresence result = apiInstance.patchUserPresence(userId, sourceId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PresenceApi#patchUserPresence");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| user Id | |
| **sourceId** | **String**| Source | |
| **body** | [**UserPresence**](UserPresence.html)| User presence | |
{: class="table table-striped"}

### Return type

[**UserPresence**](UserPresence.html)

<a name="postPresencedefinitions"></a>

# **postPresencedefinitions**



> [OrganizationPresence](OrganizationPresence.html) postPresencedefinitions(body)

Create a Presence Definition



Wraps POST /api/v2/presencedefinitions  

Requires ANY permissions: 

* presence:presenceDefinition:add

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.PresenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

PresenceApi apiInstance = new PresenceApi();
OrganizationPresence body = new OrganizationPresence(); // OrganizationPresence | The Presence Definition to create
try {
    OrganizationPresence result = apiInstance.postPresencedefinitions(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PresenceApi#postPresencedefinitions");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**OrganizationPresence**](OrganizationPresence.html)| The Presence Definition to create | |
{: class="table table-striped"}

### Return type

[**OrganizationPresence**](OrganizationPresence.html)

<a name="putPresencedefinition"></a>

# **putPresencedefinition**



> [OrganizationPresence](OrganizationPresence.html) putPresencedefinition(presenceId, body)

Update a Presence Definition



Wraps PUT /api/v2/presencedefinitions/{presenceId}  

Requires ANY permissions: 

* presence:presenceDefinition:edit

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.PresenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

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
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **presenceId** | **String**| Organization Presence ID | |
| **body** | [**OrganizationPresence**](OrganizationPresence.html)| The OrganizationPresence to update | |
{: class="table table-striped"}

### Return type

[**OrganizationPresence**](OrganizationPresence.html)

