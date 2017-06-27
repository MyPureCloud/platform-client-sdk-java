---
title: UsersApi
---
## UsersApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteUser**](UsersApi.html#deleteUser) | Delete user |
| [**deleteUserRoles**](UsersApi.html#deleteUserRoles) | Removes all the roles from the user. |
| [**deleteUserRoutingskill**](UsersApi.html#deleteUserRoutingskill) | Remove routing skill from user |
| [**deleteUserStationAssociatedstation**](UsersApi.html#deleteUserStationAssociatedstation) | Clear associated station |
| [**deleteUserStationDefaultstation**](UsersApi.html#deleteUserStationDefaultstation) | Clear default station |
| [**getFieldconfig**](UsersApi.html#getFieldconfig) | Fetch field config for an entity type |
| [**getUser**](UsersApi.html#getUser) | Get user. |
| [**getUserAdjacents**](UsersApi.html#getUserAdjacents) | Get adjacents |
| [**getUserCallforwarding**](UsersApi.html#getUserCallforwarding) | Get a user&#39;s CallForwarding |
| [**getUserDirectreports**](UsersApi.html#getUserDirectreports) | Get direct reports |
| [**getUserFavorites**](UsersApi.html#getUserFavorites) | Get favorites |
| [**getUserGeolocation**](UsersApi.html#getUserGeolocation) | Get a user&#39;s Geolocation |
| [**getUserOutofoffice**](UsersApi.html#getUserOutofoffice) | Get a OutOfOffice |
| [**getUserProfileskills**](UsersApi.html#getUserProfileskills) | List profile skills for a user |
| [**getUserQueues**](UsersApi.html#getUserQueues) | Get queues for user |
| [**getUserRoles**](UsersApi.html#getUserRoles) | Returns a listing of roles and permissions for a user. |
| [**getUserRoutingskills**](UsersApi.html#getUserRoutingskills) | List routing skills for user |
| [**getUserRoutingstatus**](UsersApi.html#getUserRoutingstatus) | Fetch the routing status of a user |
| [**getUserStation**](UsersApi.html#getUserStation) | Get station information for user |
| [**getUserSuperiors**](UsersApi.html#getUserSuperiors) | Get superiors |
| [**getUsers**](UsersApi.html#getUsers) | Get the list of available users. |
| [**getUsersMe**](UsersApi.html#getUsersMe) | Get current user details. |
| [**getUsersSearch**](UsersApi.html#getUsersSearch) | Search users using the q64 value returned from a previous search |
| [**patchUser**](UsersApi.html#patchUser) | Update user |
| [**patchUserCallforwarding**](UsersApi.html#patchUserCallforwarding) | Patch a user&#39;s CallForwarding |
| [**patchUserGeolocation**](UsersApi.html#patchUserGeolocation) | Patch a user&#39;s Geolocation |
| [**patchUserQueue**](UsersApi.html#patchUserQueue) | Join or unjoin a queue for a user |
| [**patchUserQueues**](UsersApi.html#patchUserQueues) | Join or unjoin a set of queues for a user |
| [**postAnalyticsUsersAggregatesQuery**](UsersApi.html#postAnalyticsUsersAggregatesQuery) | Query for user aggregates |
| [**postAnalyticsUsersDetailsQuery**](UsersApi.html#postAnalyticsUsersDetailsQuery) | Query for user details |
| [**postAnalyticsUsersObservationsQuery**](UsersApi.html#postAnalyticsUsersObservationsQuery) | Query for user observations |
| [**postUserInvite**](UsersApi.html#postUserInvite) | Send an activation email to the user |
| [**postUserRoutingskills**](UsersApi.html#postUserRoutingskills) | Add routing skill to user |
| [**postUsers**](UsersApi.html#postUsers) | Create user |
| [**postUsersSearch**](UsersApi.html#postUsersSearch) | Search users |
| [**putUserCallforwarding**](UsersApi.html#putUserCallforwarding) | Update a user&#39;s CallForwarding |
| [**putUserOutofoffice**](UsersApi.html#putUserOutofoffice) | Update an OutOfOffice |
| [**putUserProfileskills**](UsersApi.html#putUserProfileskills) | Update profile skills for a user |
| [**putUserRoles**](UsersApi.html#putUserRoles) | Sets the user&#39;s roles |
| [**putUserRoutingskill**](UsersApi.html#putUserRoutingskill) | Update routing skill proficiency or state. |
| [**putUserRoutingstatus**](UsersApi.html#putUserRoutingstatus) | Update the routing status of a user |
| [**putUserStationAssociatedstationStationId**](UsersApi.html#putUserStationAssociatedstationStationId) | Set associated station |
| [**putUserStationDefaultstationStationId**](UsersApi.html#putUserStationDefaultstationStationId) | Set default station |
{: class="table table-striped"}

<a name="deleteUser"></a>

# **deleteUser**

> [Empty](Empty.html) deleteUser(userId)

Delete user



Wraps DELETE /api/v2/users/{userId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
try {
    Empty result = apiInstance.deleteUser(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#deleteUser");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | |
{: class="table table-striped"}

### Return type

[**Empty**](Empty.html)

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
//import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
try {
    apiInstance.deleteUserRoles(userId);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#deleteUserRoles");
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

<a name="deleteUserRoutingskill"></a>

# **deleteUserRoutingskill**

> Void deleteUserRoutingskill(userId, skillId)

Remove routing skill from user



Wraps DELETE /api/v2/users/{userId}/routingskills/{skillId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
String skillId = "skillId_example"; // String | skillId
try {
    apiInstance.deleteUserRoutingskill(userId, skillId);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#deleteUserRoutingskill");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | |
| **skillId** | **String**| skillId | |
{: class="table table-striped"}

### Return type

null (empty response body)

<a name="deleteUserStationAssociatedstation"></a>

# **deleteUserStationAssociatedstation**

> Void deleteUserStationAssociatedstation(userId)

Clear associated station



Wraps DELETE /api/v2/users/{userId}/station/associatedstation  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
try {
    apiInstance.deleteUserStationAssociatedstation(userId);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#deleteUserStationAssociatedstation");
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

<a name="deleteUserStationDefaultstation"></a>

# **deleteUserStationDefaultstation**

> Void deleteUserStationDefaultstation(userId)

Clear default station



Wraps DELETE /api/v2/users/{userId}/station/defaultstation  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
try {
    apiInstance.deleteUserStationDefaultstation(userId);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#deleteUserStationDefaultstation");
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

<a name="getFieldconfig"></a>

# **getFieldconfig**

> [FieldConfig](FieldConfig.html) getFieldconfig(type)

Fetch field config for an entity type



Wraps GET /api/v2/fieldconfig  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String type = "type_example"; // String | Field type
try {
    FieldConfig result = apiInstance.getFieldconfig(type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getFieldconfig");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **type** | **String**| Field type |<br />**Values**: person, group, org, externalContact |
{: class="table table-striped"}

### Return type

[**FieldConfig**](FieldConfig.html)

<a name="getUser"></a>

# **getUser**

> [User](User.html) getUser(userId, expand, state)

Get user.



Wraps GET /api/v2/users/{userId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand
String state = "active"; // String | Search for a user with this state
try {
    User result = apiInstance.getUser(userId, expand, state);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUser");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | |
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand | [optional]<br />**Values**: routingStatus, presence, conversationSummary, outOfOffice, geolocation, station, authorization, profileSkills, locations, groups |
| **state** | **String**| Search for a user with this state | [optional] [default to active]<br />**Values**: active, deleted |
{: class="table table-striped"}

### Return type

[**User**](User.html)

<a name="getUserAdjacents"></a>

# **getUserAdjacents**

> [Adjacents](Adjacents.html) getUserAdjacents(userId, expand)

Get adjacents



Wraps GET /api/v2/users/{userId}/adjacents  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand
try {
    Adjacents result = apiInstance.getUserAdjacents(userId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserAdjacents");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | |
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand | [optional]<br />**Values**: routingStatus, presence, conversationSummary, outOfOffice, geolocation, station, authorization, profileSkills, locations, groups |
{: class="table table-striped"}

### Return type

[**Adjacents**](Adjacents.html)

<a name="getUserCallforwarding"></a>

# **getUserCallforwarding**

> [CallForwarding](CallForwarding.html) getUserCallforwarding(userId)

Get a user&#39;s CallForwarding



Wraps GET /api/v2/users/{userId}/callforwarding  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
try {
    CallForwarding result = apiInstance.getUserCallforwarding(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserCallforwarding");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | |
{: class="table table-striped"}

### Return type

[**CallForwarding**](CallForwarding.html)

<a name="getUserDirectreports"></a>

# **getUserDirectreports**

> [List&lt;User&gt;](User.html) getUserDirectreports(userId, expand)

Get direct reports



Wraps GET /api/v2/users/{userId}/directreports  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand
try {
    List<User> result = apiInstance.getUserDirectreports(userId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserDirectreports");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | |
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand | [optional]<br />**Values**: routingStatus, presence, conversationSummary, outOfOffice, geolocation, station, authorization, profileSkills, locations, groups |
{: class="table table-striped"}

### Return type

[**List&lt;User&gt;**](User.html)

<a name="getUserFavorites"></a>

# **getUserFavorites**

> [UserEntityListing](UserEntityListing.html) getUserFavorites(userId, pageSize, pageNumber, sortOrder, expand)

Get favorites



Wraps GET /api/v2/users/{userId}/favorites  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortOrder = "ASC"; // String | Sort order
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand
try {
    UserEntityListing result = apiInstance.getUserFavorites(userId, pageSize, pageNumber, sortOrder, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserFavorites");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] |
| **sortOrder** | **String**| Sort order | [optional] [default to ASC] |
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand | [optional]<br />**Values**: routingStatus, presence, conversationSummary, outOfOffice, geolocation, station, authorization, profileSkills, locations, groups |
{: class="table table-striped"}

### Return type

[**UserEntityListing**](UserEntityListing.html)

<a name="getUserGeolocation"></a>

# **getUserGeolocation**

> [Geolocation](Geolocation.html) getUserGeolocation(userId, clientId)

Get a user&#39;s Geolocation



Wraps GET /api/v2/users/{userId}/geolocations/{clientId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | user Id
String clientId = "clientId_example"; // String | client Id
try {
    Geolocation result = apiInstance.getUserGeolocation(userId, clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserGeolocation");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| user Id | |
| **clientId** | **String**| client Id | |
{: class="table table-striped"}

### Return type

[**Geolocation**](Geolocation.html)

<a name="getUserOutofoffice"></a>

# **getUserOutofoffice**

> [OutOfOffice](OutOfOffice.html) getUserOutofoffice(userId)

Get a OutOfOffice



Wraps GET /api/v2/users/{userId}/outofoffice  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
try {
    OutOfOffice result = apiInstance.getUserOutofoffice(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserOutofoffice");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | |
{: class="table table-striped"}

### Return type

[**OutOfOffice**](OutOfOffice.html)

<a name="getUserProfileskills"></a>

# **getUserProfileskills**

> List&lt;String&gt; getUserProfileskills(userId)

List profile skills for a user



Wraps GET /api/v2/users/{userId}/profileskills  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
try {
    List<String> result = apiInstance.getUserProfileskills(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserProfileskills");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | |
{: class="table table-striped"}

### Return type

**List&lt;String&gt;**

<a name="getUserQueues"></a>

# **getUserQueues**

> [UserQueueEntityListing](UserQueueEntityListing.html) getUserQueues(userId, pageSize, pageNumber, joined)

Get queues for user



Wraps GET /api/v2/users/{userId}/queues  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
Boolean joined = true; // Boolean | Is joined to the queue
try {
    UserQueueEntityListing result = apiInstance.getUserQueues(userId, pageSize, pageNumber, joined);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserQueues");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] |
| **joined** | **Boolean**| Is joined to the queue | [optional] [default to true] |
{: class="table table-striped"}

### Return type

[**UserQueueEntityListing**](UserQueueEntityListing.html)

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
//import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
try {
    UserAuthorization result = apiInstance.getUserRoles(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserRoles");
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

<a name="getUserRoutingskills"></a>

# **getUserRoutingskills**

> [UserSkillEntityListing](UserSkillEntityListing.html) getUserRoutingskills(userId, pageSize, pageNumber, sortOrder)

List routing skills for user



Wraps GET /api/v2/users/{userId}/routingskills  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortOrder = "ASC"; // String | Ascending or descending sort order
try {
    UserSkillEntityListing result = apiInstance.getUserRoutingskills(userId, pageSize, pageNumber, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserRoutingskills");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] |
| **sortOrder** | **String**| Ascending or descending sort order | [optional] [default to ASC]<br />**Values**: ascending, descending |
{: class="table table-striped"}

### Return type

[**UserSkillEntityListing**](UserSkillEntityListing.html)

<a name="getUserRoutingstatus"></a>

# **getUserRoutingstatus**

> [RoutingStatus](RoutingStatus.html) getUserRoutingstatus(userId)

Fetch the routing status of a user



Wraps GET /api/v2/users/{userId}/routingstatus  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
try {
    RoutingStatus result = apiInstance.getUserRoutingstatus(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserRoutingstatus");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | |
{: class="table table-striped"}

### Return type

[**RoutingStatus**](RoutingStatus.html)

<a name="getUserStation"></a>

# **getUserStation**

> [UserStations](UserStations.html) getUserStation(userId)

Get station information for user



Wraps GET /api/v2/users/{userId}/station  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
try {
    UserStations result = apiInstance.getUserStation(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserStation");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | |
{: class="table table-striped"}

### Return type

[**UserStations**](UserStations.html)

<a name="getUserSuperiors"></a>

# **getUserSuperiors**

> [List&lt;User&gt;](User.html) getUserSuperiors(userId, expand)

Get superiors



Wraps GET /api/v2/users/{userId}/superiors  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand
try {
    List<User> result = apiInstance.getUserSuperiors(userId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserSuperiors");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | |
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand | [optional]<br />**Values**: routingStatus, presence, conversationSummary, outOfOffice, geolocation, station, authorization, profileSkills, locations, groups |
{: class="table table-striped"}

### Return type

[**List&lt;User&gt;**](User.html)

<a name="getUsers"></a>

# **getUsers**

> [UserEntityListing](UserEntityListing.html) getUsers(pageSize, pageNumber, id, sortOrder, expand, state)

Get the list of available users.



Wraps GET /api/v2/users  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
List<String> id = Arrays.asList("id_example"); // List<String> | id
String sortOrder = "ASC"; // String | Ascending or descending sort order
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand
String state = "active"; // String | Only list users of this state
try {
    UserEntityListing result = apiInstance.getUsers(pageSize, pageNumber, id, sortOrder, expand, state);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUsers");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] |
| **id** | [**List&lt;String&gt;**](String.html)| id | [optional] |
| **sortOrder** | **String**| Ascending or descending sort order | [optional] [default to ASC]<br />**Values**: ascending, descending |
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand | [optional]<br />**Values**: routingStatus, presence, conversationSummary, outOfOffice, geolocation, station, authorization, profileSkills, locations, groups |
| **state** | **String**| Only list users of this state | [optional] [default to active]<br />**Values**: active, deleted |
{: class="table table-striped"}

### Return type

[**UserEntityListing**](UserEntityListing.html)

<a name="getUsersMe"></a>

# **getUsersMe**

> [UserMe](UserMe.html) getUsersMe(expand)

Get current user details.

This request is not valid when using the Client Credentials OAuth grant.

Wraps GET /api/v2/users/me  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand.
try {
    UserMe result = apiInstance.getUsersMe(expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUsersMe");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand. | [optional]<br />**Values**: routingStatus, presence, conversationSummary, outOfOffice, geolocation, station, authorization, profileSkills, locations, groups, date, geolocationsettings, organization, presencedefinitions, locationdefinitions, orgauthorization, favorites, superiors, directreports, adjacents, routingskills, routinglanguages, fieldconfigs, token |
{: class="table table-striped"}

### Return type

[**UserMe**](UserMe.html)

<a name="getUsersSearch"></a>

# **getUsersSearch**

> [UsersSearchResponse](UsersSearchResponse.html) getUsersSearch(q64, expand)

Search users using the q64 value returned from a previous search



Wraps GET /api/v2/users/search  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String q64 = "q64_example"; // String | q64
List<String> expand = Arrays.asList("expand_example"); // List<String> | expand
try {
    UsersSearchResponse result = apiInstance.getUsersSearch(q64, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUsersSearch");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **q64** | **String**| q64 | |
| **expand** | [**List&lt;String&gt;**](String.html)| expand | [optional] |
{: class="table table-striped"}

### Return type

[**UsersSearchResponse**](UsersSearchResponse.html)

<a name="patchUser"></a>

# **patchUser**

> [User](User.html) patchUser(userId, body)

Update user



Wraps PATCH /api/v2/users/{userId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
UpdateUser body = new UpdateUser(); // UpdateUser | User
try {
    User result = apiInstance.patchUser(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#patchUser");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | |
| **body** | [**UpdateUser**](UpdateUser.html)| User | |
{: class="table table-striped"}

### Return type

[**User**](User.html)

<a name="patchUserCallforwarding"></a>

# **patchUserCallforwarding**

> [CallForwarding](CallForwarding.html) patchUserCallforwarding(userId, body)

Patch a user&#39;s CallForwarding



Wraps PATCH /api/v2/users/{userId}/callforwarding  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
CallForwarding body = new CallForwarding(); // CallForwarding | Call forwarding
try {
    CallForwarding result = apiInstance.patchUserCallforwarding(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#patchUserCallforwarding");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | |
| **body** | [**CallForwarding**](CallForwarding.html)| Call forwarding | |
{: class="table table-striped"}

### Return type

[**CallForwarding**](CallForwarding.html)

<a name="patchUserGeolocation"></a>

# **patchUserGeolocation**

> [Geolocation](Geolocation.html) patchUserGeolocation(userId, clientId, body)

Patch a user&#39;s Geolocation

The geolocation object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the client as the user&#39;s primary geolocation source.  Option 2: Provide the &#39;latitude&#39; and &#39;longitude&#39; values.  This will enqueue an asynchronous update of the &#39;city&#39;, &#39;region&#39;, and &#39;country&#39;, generating a notification. A subsequent GET operation will include the new values for &#39;city&#39;, &#39;region&#39; and &#39;country&#39;.  Option 3:  Provide the &#39;city&#39;, &#39;region&#39;, &#39;country&#39; values.  Option 1 can be combined with Option 2 or Option 3.  For example, update the client as primary and provide latitude and longitude values.

Wraps PATCH /api/v2/users/{userId}/geolocations/{clientId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | user Id
String clientId = "clientId_example"; // String | client Id
Geolocation body = new Geolocation(); // Geolocation | Geolocation
try {
    Geolocation result = apiInstance.patchUserGeolocation(userId, clientId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#patchUserGeolocation");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| user Id | |
| **clientId** | **String**| client Id | |
| **body** | [**Geolocation**](Geolocation.html)| Geolocation | |
{: class="table table-striped"}

### Return type

[**Geolocation**](Geolocation.html)

<a name="patchUserQueue"></a>

# **patchUserQueue**

> [UserQueue](UserQueue.html) patchUserQueue(queueId, userId, body)

Join or unjoin a queue for a user



Wraps PATCH /api/v2/users/{userId}/queues/{queueId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String queueId = "queueId_example"; // String | Queue ID
String userId = "userId_example"; // String | User ID
UserQueue body = new UserQueue(); // UserQueue | Queue Member
try {
    UserQueue result = apiInstance.patchUserQueue(queueId, userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#patchUserQueue");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **queueId** | **String**| Queue ID | |
| **userId** | **String**| User ID | |
| **body** | [**UserQueue**](UserQueue.html)| Queue Member | |
{: class="table table-striped"}

### Return type

[**UserQueue**](UserQueue.html)

<a name="patchUserQueues"></a>

# **patchUserQueues**

> [UserQueueEntityListing](UserQueueEntityListing.html) patchUserQueues(userId, body)

Join or unjoin a set of queues for a user



Wraps PATCH /api/v2/users/{userId}/queues  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
List<UserQueue> body = Arrays.asList(new UserQueue()); // List<UserQueue> | User Queues
try {
    UserQueueEntityListing result = apiInstance.patchUserQueues(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#patchUserQueues");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | |
| **body** | [**List&lt;UserQueue&gt;**](UserQueue.html)| User Queues | |
{: class="table table-striped"}

### Return type

[**UserQueueEntityListing**](UserQueueEntityListing.html)

<a name="postAnalyticsUsersAggregatesQuery"></a>

# **postAnalyticsUsersAggregatesQuery**

> [PresenceQueryResponse](PresenceQueryResponse.html) postAnalyticsUsersAggregatesQuery(body)

Query for user aggregates



Wraps POST /api/v2/analytics/users/aggregates/query  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
AggregationQuery body = new AggregationQuery(); // AggregationQuery | query
try {
    PresenceQueryResponse result = apiInstance.postAnalyticsUsersAggregatesQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postAnalyticsUsersAggregatesQuery");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**AggregationQuery**](AggregationQuery.html)| query | |
{: class="table table-striped"}

### Return type

[**PresenceQueryResponse**](PresenceQueryResponse.html)

<a name="postAnalyticsUsersDetailsQuery"></a>

# **postAnalyticsUsersDetailsQuery**

> [AnalyticsUserDetailsQueryResponse](AnalyticsUserDetailsQueryResponse.html) postAnalyticsUsersDetailsQuery(body)

Query for user details



Wraps POST /api/v2/analytics/users/details/query  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
UserDetailsQuery body = new UserDetailsQuery(); // UserDetailsQuery | query
try {
    AnalyticsUserDetailsQueryResponse result = apiInstance.postAnalyticsUsersDetailsQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postAnalyticsUsersDetailsQuery");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**UserDetailsQuery**](UserDetailsQuery.html)| query | |
{: class="table table-striped"}

### Return type

[**AnalyticsUserDetailsQueryResponse**](AnalyticsUserDetailsQueryResponse.html)

<a name="postAnalyticsUsersObservationsQuery"></a>

# **postAnalyticsUsersObservationsQuery**

> [ObservationQueryResponse](ObservationQueryResponse.html) postAnalyticsUsersObservationsQuery(body)

Query for user observations



Wraps POST /api/v2/analytics/users/observations/query  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
ObservationQuery body = new ObservationQuery(); // ObservationQuery | query
try {
    ObservationQueryResponse result = apiInstance.postAnalyticsUsersObservationsQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postAnalyticsUsersObservationsQuery");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**ObservationQuery**](ObservationQuery.html)| query | |
{: class="table table-striped"}

### Return type

[**ObservationQueryResponse**](ObservationQueryResponse.html)

<a name="postUserInvite"></a>

# **postUserInvite**

> Void postUserInvite(userId, force)

Send an activation email to the user



Wraps POST /api/v2/users/{userId}/invite  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
Boolean force = false; // Boolean | Resend the invitation even if one is already outstanding
try {
    apiInstance.postUserInvite(userId, force);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postUserInvite");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | |
| **force** | **Boolean**| Resend the invitation even if one is already outstanding | [optional] [default to false] |
{: class="table table-striped"}

### Return type

null (empty response body)

<a name="postUserRoutingskills"></a>

# **postUserRoutingskills**

> [UserRoutingSkill](UserRoutingSkill.html) postUserRoutingskills(userId, body)

Add routing skill to user



Wraps POST /api/v2/users/{userId}/routingskills  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
UserRoutingSkillPost body = new UserRoutingSkillPost(); // UserRoutingSkillPost | Skill
try {
    UserRoutingSkill result = apiInstance.postUserRoutingskills(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postUserRoutingskills");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | |
| **body** | [**UserRoutingSkillPost**](UserRoutingSkillPost.html)| Skill | |
{: class="table table-striped"}

### Return type

[**UserRoutingSkill**](UserRoutingSkill.html)

<a name="postUsers"></a>

# **postUsers**

> [User](User.html) postUsers(body)

Create user



Wraps POST /api/v2/users  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
CreateUser body = new CreateUser(); // CreateUser | User
try {
    User result = apiInstance.postUsers(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postUsers");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**CreateUser**](CreateUser.html)| User | |
{: class="table table-striped"}

### Return type

[**User**](User.html)

<a name="postUsersSearch"></a>

# **postUsersSearch**

> [UsersSearchResponse](UsersSearchResponse.html) postUsersSearch(body)

Search users



Wraps POST /api/v2/users/search  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
UserSearchRequest body = new UserSearchRequest(); // UserSearchRequest | Search request options
try {
    UsersSearchResponse result = apiInstance.postUsersSearch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postUsersSearch");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**UserSearchRequest**](UserSearchRequest.html)| Search request options | |
{: class="table table-striped"}

### Return type

[**UsersSearchResponse**](UsersSearchResponse.html)

<a name="putUserCallforwarding"></a>

# **putUserCallforwarding**

> [CallForwarding](CallForwarding.html) putUserCallforwarding(userId, body)

Update a user&#39;s CallForwarding



Wraps PUT /api/v2/users/{userId}/callforwarding  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
CallForwarding body = new CallForwarding(); // CallForwarding | Call forwarding
try {
    CallForwarding result = apiInstance.putUserCallforwarding(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#putUserCallforwarding");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | |
| **body** | [**CallForwarding**](CallForwarding.html)| Call forwarding | |
{: class="table table-striped"}

### Return type

[**CallForwarding**](CallForwarding.html)

<a name="putUserOutofoffice"></a>

# **putUserOutofoffice**

> [OutOfOffice](OutOfOffice.html) putUserOutofoffice(userId, body)

Update an OutOfOffice



Wraps PUT /api/v2/users/{userId}/outofoffice  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
OutOfOffice body = new OutOfOffice(); // OutOfOffice | The updated UserPresence
try {
    OutOfOffice result = apiInstance.putUserOutofoffice(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#putUserOutofoffice");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | |
| **body** | [**OutOfOffice**](OutOfOffice.html)| The updated UserPresence | |
{: class="table table-striped"}

### Return type

[**OutOfOffice**](OutOfOffice.html)

<a name="putUserProfileskills"></a>

# **putUserProfileskills**

> List&lt;String&gt; putUserProfileskills(userId, body)

Update profile skills for a user



Wraps PUT /api/v2/users/{userId}/profileskills  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
List<String> body = Arrays.asList(new List<String>()); // List<String> | Skills
try {
    List<String> result = apiInstance.putUserProfileskills(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#putUserProfileskills");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | |
| **body** | **List&lt;String&gt;**| Skills | [optional] |
{: class="table table-striped"}

### Return type

**List&lt;String&gt;**

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
//import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
List<String> body = Arrays.asList(new List<String>()); // List<String> | List of roles
try {
    UserAuthorization result = apiInstance.putUserRoles(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#putUserRoles");
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

<a name="putUserRoutingskill"></a>

# **putUserRoutingskill**

> [UserRoutingSkill](UserRoutingSkill.html) putUserRoutingskill(userId, skillId, body)

Update routing skill proficiency or state.



Wraps PUT /api/v2/users/{userId}/routingskills/{skillId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
String skillId = "skillId_example"; // String | skillId
UserRoutingSkill body = new UserRoutingSkill(); // UserRoutingSkill | Skill
try {
    UserRoutingSkill result = apiInstance.putUserRoutingskill(userId, skillId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#putUserRoutingskill");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | |
| **skillId** | **String**| skillId | |
| **body** | [**UserRoutingSkill**](UserRoutingSkill.html)| Skill | |
{: class="table table-striped"}

### Return type

[**UserRoutingSkill**](UserRoutingSkill.html)

<a name="putUserRoutingstatus"></a>

# **putUserRoutingstatus**

> [RoutingStatus](RoutingStatus.html) putUserRoutingstatus(userId, body)

Update the routing status of a user



Wraps PUT /api/v2/users/{userId}/routingstatus  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
RoutingStatus body = new RoutingStatus(); // RoutingStatus | Routing Status
try {
    RoutingStatus result = apiInstance.putUserRoutingstatus(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#putUserRoutingstatus");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | |
| **body** | [**RoutingStatus**](RoutingStatus.html)| Routing Status | |
{: class="table table-striped"}

### Return type

[**RoutingStatus**](RoutingStatus.html)

<a name="putUserStationAssociatedstationStationId"></a>

# **putUserStationAssociatedstationStationId**

> Void putUserStationAssociatedstationStationId(userId, stationId)

Set associated station



Wraps PUT /api/v2/users/{userId}/station/associatedstation/{stationId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
String stationId = "stationId_example"; // String | stationId
try {
    apiInstance.putUserStationAssociatedstationStationId(userId, stationId);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#putUserStationAssociatedstationStationId");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | |
| **stationId** | **String**| stationId | |
{: class="table table-striped"}

### Return type

null (empty response body)

<a name="putUserStationDefaultstationStationId"></a>

# **putUserStationDefaultstationStationId**

> Void putUserStationDefaultstationStationId(userId, stationId)

Set default station



Wraps PUT /api/v2/users/{userId}/station/defaultstation/{stationId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
String stationId = "stationId_example"; // String | stationId
try {
    apiInstance.putUserStationDefaultstationStationId(userId, stationId);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#putUserStationDefaultstationStationId");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | |
| **stationId** | **String**| stationId | |
{: class="table table-striped"}

### Return type

null (empty response body)

