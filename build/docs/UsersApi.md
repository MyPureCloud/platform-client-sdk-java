# UsersApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteAnalyticsUsersDetailsJob**](UsersApi#deleteAnalyticsUsersDetailsJob) | Delete/cancel an async request |
| [**deleteAuthorizationSubjectDivisionRole**](UsersApi#deleteAuthorizationSubjectDivisionRole) | Delete a grant of a role in a division |
| [**deleteRoutingDirectroutingbackupSettingsMe**](UsersApi#deleteRoutingDirectroutingbackupSettingsMe) | Delete the user's Direct Routing Backup settings and revert to the Direct Routing Queue default. |
| [**deleteRoutingUserDirectroutingbackupSettings**](UsersApi#deleteRoutingUserDirectroutingbackupSettings) | Delete the user's Direct Routing Backup settings and revert to the Direct Routing Queue default. |
| [**deleteRoutingUserUtilization**](UsersApi#deleteRoutingUserUtilization) | Delete the user's max utilization settings and revert to the organization-wide default. |
| [**deleteUser**](UsersApi#deleteUser) | Delete user |
| [**deleteUserRoutinglanguage**](UsersApi#deleteUserRoutinglanguage) | Remove routing language from user |
| [**deleteUserRoutingskill**](UsersApi#deleteUserRoutingskill) | Remove routing skill from user |
| [**deleteUserStationAssociatedstation**](UsersApi#deleteUserStationAssociatedstation) | Clear associated station |
| [**deleteUserStationDefaultstation**](UsersApi#deleteUserStationDefaultstation) | Clear default station |
| [**deleteUserVerifier**](UsersApi#deleteUserVerifier) | Delete a verifier |
| [**getAnalyticsUsersAggregatesJob**](UsersApi#getAnalyticsUsersAggregatesJob) | Get status for async query for user aggregates |
| [**getAnalyticsUsersAggregatesJobResults**](UsersApi#getAnalyticsUsersAggregatesJobResults) | Fetch a page of results for an async aggregates query |
| [**getAnalyticsUsersDetailsJob**](UsersApi#getAnalyticsUsersDetailsJob) | Get status for async query for user details |
| [**getAnalyticsUsersDetailsJobResults**](UsersApi#getAnalyticsUsersDetailsJobResults) | Fetch a page of results for an async query |
| [**getAnalyticsUsersDetailsJobsAvailability**](UsersApi#getAnalyticsUsersDetailsJobsAvailability) | Lookup the datalake availability date and time |
| [**getAuthorizationDivisionspermittedMe**](UsersApi#getAuthorizationDivisionspermittedMe) | Returns which divisions the current user has the given permission in. |
| [**getAuthorizationDivisionspermittedPagedMe**](UsersApi#getAuthorizationDivisionspermittedPagedMe) | Returns which divisions the current user has the given permission in. |
| [**getAuthorizationDivisionspermittedPagedSubjectId**](UsersApi#getAuthorizationDivisionspermittedPagedSubjectId) | Returns which divisions the specified user has the given permission in. |
| [**getAuthorizationSubject**](UsersApi#getAuthorizationSubject) | Returns a listing of roles and permissions for a user. |
| [**getAuthorizationSubjectsMe**](UsersApi#getAuthorizationSubjectsMe) | Returns a listing of roles and permissions for the currently authenticated user. |
| [**getFieldconfig**](UsersApi#getFieldconfig) | Fetch field config for an entity type |
| [**getProfilesUsers**](UsersApi#getProfilesUsers) | Get a user profile listing |
| [**getRoutingDirectroutingbackupSettingsMe**](UsersApi#getRoutingDirectroutingbackupSettingsMe) | Get the user's Direct Routing Backup settings. |
| [**getRoutingUserDirectroutingbackupSettings**](UsersApi#getRoutingUserDirectroutingbackupSettings) | Get the user's Direct Routing Backup settings. |
| [**getRoutingUserUtilization**](UsersApi#getRoutingUserUtilization) | Get the user's max utilization settings.  If not configured, the organization-wide default is returned. |
| [**getUser**](UsersApi#getUser) | Get user. |
| [**getUserAdjacents**](UsersApi#getUserAdjacents) | Get adjacents |
| [**getUserCallforwarding**](UsersApi#getUserCallforwarding) | Get a user's CallForwarding |
| [**getUserDirectreports**](UsersApi#getUserDirectreports) | Get direct reports |
| [**getUserFavorites**](UsersApi#getUserFavorites) | Deprecated; will be revived with new contract |
| [**getUserGeolocation**](UsersApi#getUserGeolocation) | Get a user's Geolocation |
| [**getUserOutofoffice**](UsersApi#getUserOutofoffice) | Get a OutOfOffice |
| [**getUserProfile**](UsersApi#getUserProfile) | Get user profile |
| [**getUserProfileskills**](UsersApi#getUserProfileskills) | List profile skills for a user |
| [**getUserQueues**](UsersApi#getUserQueues) | Get queues for user |
| [**getUserRoles**](UsersApi#getUserRoles) | Returns a listing of roles and permissions for a user. |
| [**getUserRoutinglanguages**](UsersApi#getUserRoutinglanguages) | List routing language for user |
| [**getUserRoutingskills**](UsersApi#getUserRoutingskills) | List routing skills for user |
| [**getUserRoutingstatus**](UsersApi#getUserRoutingstatus) | Fetch the routing status of a user |
| [**getUserSkillgroups**](UsersApi#getUserSkillgroups) | Get skill groups for a user |
| [**getUserState**](UsersApi#getUserState) | Get user state information. |
| [**getUserStation**](UsersApi#getUserStation) | Get station information for user |
| [**getUserSuperiors**](UsersApi#getUserSuperiors) | Get superiors |
| [**getUserTrustors**](UsersApi#getUserTrustors) | List the organizations that have authorized/trusted the user. |
| [**getUserVerifiers**](UsersApi#getUserVerifiers) | Get a list of verifiers |
| [**getUsers**](UsersApi#getUsers) | Get the list of available users. |
| [**getUsersDevelopmentActivities**](UsersApi#getUsersDevelopmentActivities) | Get list of Development Activities |
| [**getUsersDevelopmentActivitiesMe**](UsersApi#getUsersDevelopmentActivitiesMe) | Get list of Development Activities for current user |
| [**getUsersDevelopmentActivity**](UsersApi#getUsersDevelopmentActivity) | Get a Development Activity |
| [**getUsersMe**](UsersApi#getUsersMe) | Get current user details. |
| [**getUsersSearch**](UsersApi#getUsersSearch) | Search users using the q64 value returned from a previous search |
| [**patchUser**](UsersApi#patchUser) | Update user |
| [**patchUserCallforwarding**](UsersApi#patchUserCallforwarding) | Patch a user's CallForwarding |
| [**patchUserGeolocation**](UsersApi#patchUserGeolocation) | Patch a user's Geolocation |
| [**patchUserQueue**](UsersApi#patchUserQueue) | Join or unjoin a queue for a user |
| [**patchUserQueues**](UsersApi#patchUserQueues) | Join or unjoin a set of queues for a user |
| [**patchUserRoutinglanguage**](UsersApi#patchUserRoutinglanguage) | Update routing language proficiency or state. |
| [**patchUserRoutinglanguagesBulk**](UsersApi#patchUserRoutinglanguagesBulk) | Add bulk routing language to user. Max limit 50 languages |
| [**patchUserRoutingskillsBulk**](UsersApi#patchUserRoutingskillsBulk) | Bulk add routing skills to user |
| [**patchUsersBulk**](UsersApi#patchUsersBulk) | Update bulk acd autoanswer on users. Max 50 users can be updated at a time. |
| [**postAnalyticsUsersActivityQuery**](UsersApi#postAnalyticsUsersActivityQuery) | Query for user activity observations |
| [**postAnalyticsUsersAggregatesJobs**](UsersApi#postAnalyticsUsersAggregatesJobs) | Query for user aggregates asynchronously |
| [**postAnalyticsUsersAggregatesQuery**](UsersApi#postAnalyticsUsersAggregatesQuery) | Query for user aggregates |
| [**postAnalyticsUsersDetailsJobs**](UsersApi#postAnalyticsUsersDetailsJobs) | Query for user details asynchronously |
| [**postAnalyticsUsersDetailsQuery**](UsersApi#postAnalyticsUsersDetailsQuery) | Query for user details |
| [**postAnalyticsUsersObservationsQuery**](UsersApi#postAnalyticsUsersObservationsQuery) | Query for user observations |
| [**postAuthorizationSubjectBulkadd**](UsersApi#postAuthorizationSubjectBulkadd) | Bulk-grant roles and divisions to a subject. |
| [**postAuthorizationSubjectBulkremove**](UsersApi#postAuthorizationSubjectBulkremove) | Bulk-remove grants from a subject. |
| [**postAuthorizationSubjectBulkreplace**](UsersApi#postAuthorizationSubjectBulkreplace) | Replace subject's roles and divisions with the exact list supplied in the request. |
| [**postAuthorizationSubjectDivisionRole**](UsersApi#postAuthorizationSubjectDivisionRole) | Make a grant of a role in a division |
| [**postUserExternalid**](UsersApi#postUserExternalid) | Create mapping between external identifier and user. Limit 100 per entity. |
| [**postUserInvite**](UsersApi#postUserInvite) | Send an activation email to the user |
| [**postUserPassword**](UsersApi#postUserPassword) | Change a users password |
| [**postUserRoutinglanguages**](UsersApi#postUserRoutinglanguages) | Add routing language to user |
| [**postUserRoutingskills**](UsersApi#postUserRoutingskills) | Add routing skill to user |
| [**postUsers**](UsersApi#postUsers) | Create user |
| [**postUsersDevelopmentActivitiesAggregatesQuery**](UsersApi#postUsersDevelopmentActivitiesAggregatesQuery) | Retrieve aggregated development activity data |
| [**postUsersMePassword**](UsersApi#postUsersMePassword) | Change your password |
| [**postUsersSearch**](UsersApi#postUsersSearch) | Search users |
| [**postUsersSearchConversationTarget**](UsersApi#postUsersSearchConversationTarget) | Search users as conversation targets |
| [**postUsersSearchQueuemembersManage**](UsersApi#postUsersSearchQueuemembersManage) | Search manage queue member |
| [**postUsersSearchTeamsAssign**](UsersApi#postUsersSearchTeamsAssign) | Search users assigned to teams |
| [**putRoutingDirectroutingbackupSettingsMe**](UsersApi#putRoutingDirectroutingbackupSettingsMe) | Update the user's Direct Routing Backup settings. |
| [**putRoutingUserDirectroutingbackupSettings**](UsersApi#putRoutingUserDirectroutingbackupSettings) | Update the user's Direct Routing Backup settings. |
| [**putRoutingUserUtilization**](UsersApi#putRoutingUserUtilization) | Update the user's max utilization settings.  Include only those media types requiring custom configuration. |
| [**putUserCallforwarding**](UsersApi#putUserCallforwarding) | Update a user's CallForwarding |
| [**putUserOutofoffice**](UsersApi#putUserOutofoffice) | Update an OutOfOffice |
| [**putUserProfileskills**](UsersApi#putUserProfileskills) | Update profile skills for a user |
| [**putUserRoles**](UsersApi#putUserRoles) | Sets the user's roles |
| [**putUserRoutingskill**](UsersApi#putUserRoutingskill) | Update routing skill proficiency or state. |
| [**putUserRoutingskillsBulk**](UsersApi#putUserRoutingskillsBulk) | Replace all routing skills assigned to a user |
| [**putUserRoutingstatus**](UsersApi#putUserRoutingstatus) | Update the routing status of a user |
| [**putUserState**](UsersApi#putUserState) | Update user state information. |
| [**putUserStationAssociatedstationStationId**](UsersApi#putUserStationAssociatedstationStationId) | Set associated station |
| [**putUserStationDefaultstationStationId**](UsersApi#putUserStationDefaultstationStationId) | Set default station |
| [**putUserVerifier**](UsersApi#putUserVerifier) | Update a verifier |
{: class="table-striped"}


# **deleteAnalyticsUsersDetailsJob**


> Void deleteAnalyticsUsersDetailsJob(jobId)

Delete/cancel an async request

Wraps DELETE /api/v2/analytics/users/details/jobs/{jobId}  

Requires ANY permissions: 

* analytics:userDetail:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String jobId = "jobId_example"; // String | jobId
try {
    apiInstance.deleteAnalyticsUsersDetailsJob(jobId);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#deleteAnalyticsUsersDetailsJob");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobId** | **String**| jobId | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteAuthorizationSubjectDivisionRole**


> Void deleteAuthorizationSubjectDivisionRole(subjectId, divisionId, roleId)

Delete a grant of a role in a division

Wraps DELETE /api/v2/authorization/subjects/{subjectId}/divisions/{divisionId}/roles/{roleId}  

Requires ALL permissions: 

* authorization:grant:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String subjectId = "subjectId_example"; // String | Subject ID (user or group)
String divisionId = "divisionId_example"; // String | the id of the division of the grant
String roleId = "roleId_example"; // String | the id of the role of the grant
try {
    apiInstance.deleteAuthorizationSubjectDivisionRole(subjectId, divisionId, roleId);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#deleteAuthorizationSubjectDivisionRole");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **subjectId** | **String**| Subject ID (user or group) | 
| **divisionId** | **String**| the id of the division of the grant | 
| **roleId** | **String**| the id of the role of the grant | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteRoutingDirectroutingbackupSettingsMe**


> Void deleteRoutingDirectroutingbackupSettingsMe()

Delete the user's Direct Routing Backup settings and revert to the Direct Routing Queue default.

Wraps DELETE /api/v2/routing/directroutingbackup/settings/me  

Requires ANY permissions: 

* routing:directRoutingBackup:selfDelete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
try {
    apiInstance.deleteRoutingDirectroutingbackupSettingsMe();
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#deleteRoutingDirectroutingbackupSettingsMe");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

null (empty response body)


# **deleteRoutingUserDirectroutingbackupSettings**


> Void deleteRoutingUserDirectroutingbackupSettings(userId)

Delete the user's Direct Routing Backup settings and revert to the Direct Routing Queue default.

Wraps DELETE /api/v2/routing/users/{userId}/directroutingbackup/settings  

Requires ANY permissions: 

* routing:directRoutingBackup:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
try {
    apiInstance.deleteRoutingUserDirectroutingbackupSettings(userId);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#deleteRoutingUserDirectroutingbackupSettings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteRoutingUserUtilization**


> Void deleteRoutingUserUtilization(userId)

Delete the user's max utilization settings and revert to the organization-wide default.

Wraps DELETE /api/v2/routing/users/{userId}/utilization  

Requires ANY permissions: 

* routing:utilization:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
try {
    apiInstance.deleteRoutingUserUtilization(userId);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#deleteRoutingUserUtilization");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteUser**


> Empty deleteUser(userId)

Delete user

Wraps DELETE /api/v2/users/{userId}  

Requires ANY permissions: 

* admin
* directory:user:delete
* directory:organization:admin

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
try {
    Empty result = apiInstance.deleteUser(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#deleteUser");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
{: class="table-striped"}


### Return type

**Empty**


# **deleteUserRoutinglanguage**


> Void deleteUserRoutinglanguage(userId, languageId)

Remove routing language from user

Wraps DELETE /api/v2/users/{userId}/routinglanguages/{languageId}  

Requires ANY permissions: 

* routing:skill:assign
* routing:language:assign

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
String languageId = "languageId_example"; // String | languageId
try {
    apiInstance.deleteUserRoutinglanguage(userId, languageId);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#deleteUserRoutinglanguage");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **languageId** | **String**| languageId | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteUserRoutingskill**


> Void deleteUserRoutingskill(userId, skillId)

Remove routing skill from user

Wraps DELETE /api/v2/users/{userId}/routingskills/{skillId}  

Requires ALL permissions: 

* routing:skill:assign

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
String skillId = "skillId_example"; // String | skillId
try {
    apiInstance.deleteUserRoutingskill(userId, skillId);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#deleteUserRoutingskill");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **skillId** | **String**| skillId | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteUserStationAssociatedstation**


> Void deleteUserStationAssociatedstation(userId)

Clear associated station

Wraps DELETE /api/v2/users/{userId}/station/associatedstation  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
try {
    apiInstance.deleteUserStationAssociatedstation(userId);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#deleteUserStationAssociatedstation");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteUserStationDefaultstation**


> Void deleteUserStationDefaultstation(userId)

Clear default station

Wraps DELETE /api/v2/users/{userId}/station/defaultstation  

Requires ANY permissions: 

* telephony:plugin:all
* telephony:phone:assign

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
try {
    apiInstance.deleteUserStationDefaultstation(userId);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#deleteUserStationDefaultstation");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteUserVerifier**


> Void deleteUserVerifier(userId, verifierId)

Delete a verifier

Wraps DELETE /api/v2/users/{userId}/verifiers/{verifierId}  

Requires ANY permissions: 

* mfa:verifier:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
String verifierId = "verifierId_example"; // String | Verifier ID
try {
    apiInstance.deleteUserVerifier(userId, verifierId);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#deleteUserVerifier");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **verifierId** | **String**| Verifier ID | 
{: class="table-striped"}


### Return type

null (empty response body)


# **getAnalyticsUsersAggregatesJob**


> [AsyncQueryStatus](AsyncQueryStatus) getAnalyticsUsersAggregatesJob(jobId)

Get status for async query for user aggregates

getAnalyticsUsersAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/analytics/users/aggregates/jobs/{jobId}  

Requires ANY permissions: 

* analytics:userAggregate:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String jobId = "jobId_example"; // String | jobId
try {
    AsyncQueryStatus result = apiInstance.getAnalyticsUsersAggregatesJob(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getAnalyticsUsersAggregatesJob");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobId** | **String**| jobId | 
{: class="table-striped"}


### Return type

[**AsyncQueryStatus**](AsyncQueryStatus)


# **getAnalyticsUsersAggregatesJobResults**


> [UserAsyncAggregateQueryResponse](UserAsyncAggregateQueryResponse) getAnalyticsUsersAggregatesJobResults(jobId, cursor)

Fetch a page of results for an async aggregates query

getAnalyticsUsersAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/analytics/users/aggregates/jobs/{jobId}/results  

Requires ANY permissions: 

* analytics:userAggregate:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String jobId = "jobId_example"; // String | jobId
String cursor = "cursor_example"; // String | Cursor token to retrieve next page
try {
    UserAsyncAggregateQueryResponse result = apiInstance.getAnalyticsUsersAggregatesJobResults(jobId, cursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getAnalyticsUsersAggregatesJobResults");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobId** | **String**| jobId | 
| **cursor** | **String**| Cursor token to retrieve next page | [optional] 
{: class="table-striped"}


### Return type

[**UserAsyncAggregateQueryResponse**](UserAsyncAggregateQueryResponse)


# **getAnalyticsUsersDetailsJob**


> [AsyncQueryStatus](AsyncQueryStatus) getAnalyticsUsersDetailsJob(jobId)

Get status for async query for user details

Wraps GET /api/v2/analytics/users/details/jobs/{jobId}  

Requires ANY permissions: 

* analytics:userDetail:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String jobId = "jobId_example"; // String | jobId
try {
    AsyncQueryStatus result = apiInstance.getAnalyticsUsersDetailsJob(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getAnalyticsUsersDetailsJob");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobId** | **String**| jobId | 
{: class="table-striped"}


### Return type

[**AsyncQueryStatus**](AsyncQueryStatus)


# **getAnalyticsUsersDetailsJobResults**


> [AnalyticsUserDetailsAsyncQueryResponse](AnalyticsUserDetailsAsyncQueryResponse) getAnalyticsUsersDetailsJobResults(jobId, cursor, pageSize)

Fetch a page of results for an async query

Wraps GET /api/v2/analytics/users/details/jobs/{jobId}/results  

Requires ANY permissions: 

* analytics:userDetail:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String jobId = "jobId_example"; // String | jobId
String cursor = "cursor_example"; // String | Indicates where to resume query results (not required for first page)
Integer pageSize = 56; // Integer | The desired maximum number of results
try {
    AnalyticsUserDetailsAsyncQueryResponse result = apiInstance.getAnalyticsUsersDetailsJobResults(jobId, cursor, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getAnalyticsUsersDetailsJobResults");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobId** | **String**| jobId | 
| **cursor** | **String**| Indicates where to resume query results (not required for first page) | [optional] 
| **pageSize** | **Integer**| The desired maximum number of results | [optional] 
{: class="table-striped"}


### Return type

[**AnalyticsUserDetailsAsyncQueryResponse**](AnalyticsUserDetailsAsyncQueryResponse)


# **getAnalyticsUsersDetailsJobsAvailability**


> [DataAvailabilityResponse](DataAvailabilityResponse) getAnalyticsUsersDetailsJobsAvailability()

Lookup the datalake availability date and time

Wraps GET /api/v2/analytics/users/details/jobs/availability  

Requires ANY permissions: 

* analytics:userDetail:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
try {
    DataAvailabilityResponse result = apiInstance.getAnalyticsUsersDetailsJobsAvailability();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getAnalyticsUsersDetailsJobsAvailability");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**DataAvailabilityResponse**](DataAvailabilityResponse)


# **getAuthorizationDivisionspermittedMe**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [List&lt;AuthzDivision&gt;](AuthzDivision) getAuthorizationDivisionspermittedMe(permission, name)

Returns which divisions the current user has the given permission in.

This route is deprecated, use authorization/divisionspermitted/paged/me instead.

Wraps GET /api/v2/authorization/divisionspermitted/me  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String permission = "permission_example"; // String | The permission string, including the object to access, e.g. routing:queue:view
String name = "name_example"; // String | Search term to filter by division name
try {
    List<AuthzDivision> result = apiInstance.getAuthorizationDivisionspermittedMe(permission, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getAuthorizationDivisionspermittedMe");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **permission** | **String**| The permission string, including the object to access, e.g. routing:queue:view | 
| **name** | **String**| Search term to filter by division name | [optional] 
{: class="table-striped"}


### Return type

[**List&lt;AuthzDivision&gt;**](AuthzDivision)


# **getAuthorizationDivisionspermittedPagedMe**


> [DivsPermittedEntityListing](DivsPermittedEntityListing) getAuthorizationDivisionspermittedPagedMe(permission, pageNumber, pageSize)

Returns which divisions the current user has the given permission in.

Wraps GET /api/v2/authorization/divisionspermitted/paged/me  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String permission = "permission_example"; // String | The permission string, including the object to access, e.g. routing:queue:view
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
try {
    DivsPermittedEntityListing result = apiInstance.getAuthorizationDivisionspermittedPagedMe(permission, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getAuthorizationDivisionspermittedPagedMe");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **permission** | **String**| The permission string, including the object to access, e.g. routing:queue:view | 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
{: class="table-striped"}


### Return type

[**DivsPermittedEntityListing**](DivsPermittedEntityListing)


# **getAuthorizationDivisionspermittedPagedSubjectId**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [DivsPermittedEntityListing](DivsPermittedEntityListing) getAuthorizationDivisionspermittedPagedSubjectId(subjectId, permission, pageNumber, pageSize)

Returns which divisions the specified user has the given permission in.

This route is deprecated, use authorization/divisionspermitted/paged/me instead.

Wraps GET /api/v2/authorization/divisionspermitted/paged/{subjectId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String subjectId = "subjectId_example"; // String | Subject ID (user or group)
String permission = "permission_example"; // String | The permission string, including the object to access, e.g. routing:queue:view
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
try {
    DivsPermittedEntityListing result = apiInstance.getAuthorizationDivisionspermittedPagedSubjectId(subjectId, permission, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getAuthorizationDivisionspermittedPagedSubjectId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **subjectId** | **String**| Subject ID (user or group) | 
| **permission** | **String**| The permission string, including the object to access, e.g. routing:queue:view | 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
{: class="table-striped"}


### Return type

[**DivsPermittedEntityListing**](DivsPermittedEntityListing)


# **getAuthorizationSubject**


> [AuthzSubject](AuthzSubject) getAuthorizationSubject(subjectId, includeDuplicates)

Returns a listing of roles and permissions for a user.

Wraps GET /api/v2/authorization/subjects/{subjectId}  

Requires ANY permissions: 

* authorization:grant:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String subjectId = "subjectId_example"; // String | Subject ID (user or group)
Boolean includeDuplicates = false; // Boolean | Include multiple entries with the same role and division but different subjects
try {
    AuthzSubject result = apiInstance.getAuthorizationSubject(subjectId, includeDuplicates);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getAuthorizationSubject");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **subjectId** | **String**| Subject ID (user or group) | 
| **includeDuplicates** | **Boolean**| Include multiple entries with the same role and division but different subjects | [optional] [default to false]<br />**Values**: true, false 
{: class="table-striped"}


### Return type

[**AuthzSubject**](AuthzSubject)


# **getAuthorizationSubjectsMe**


> [AuthzSubject](AuthzSubject) getAuthorizationSubjectsMe(includeDuplicates)

Returns a listing of roles and permissions for the currently authenticated user.

Wraps GET /api/v2/authorization/subjects/me  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
Boolean includeDuplicates = false; // Boolean | Include multiple entries with the same role and division but different subjects
try {
    AuthzSubject result = apiInstance.getAuthorizationSubjectsMe(includeDuplicates);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getAuthorizationSubjectsMe");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **includeDuplicates** | **Boolean**| Include multiple entries with the same role and division but different subjects | [optional] [default to false]<br />**Values**: true, false 
{: class="table-striped"}


### Return type

[**AuthzSubject**](AuthzSubject)


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
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String type = "type_example"; // String | Field type
try {
    FieldConfig result = apiInstance.getFieldconfig(type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getFieldconfig");
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


# **getProfilesUsers**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [UserProfileEntityListing](UserProfileEntityListing) getProfilesUsers(pageSize, pageNumber, id, jid, sortOrder, expand, integrationPresenceSource)

Get a user profile listing

This api is deprecated. User /api/v2/users

Wraps GET /api/v2/profiles/users  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
List<String> id = Arrays.asList(null); // List<String> | id
List<String> jid = Arrays.asList(null); // List<String> | jid
String sortOrder = "ASC"; // String | Ascending or descending sort order
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand
String integrationPresenceSource = "integrationPresenceSource_example"; // String | Gets an integration presence for users instead of their defaults. This parameter will only be used when presence is provided as an \"expand\".
try {
    UserProfileEntityListing result = apiInstance.getProfilesUsers(pageSize, pageNumber, id, jid, sortOrder, expand, integrationPresenceSource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getProfilesUsers");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **id** | [**List&lt;String&gt;**](String)| id | [optional] 
| **jid** | [**List&lt;String&gt;**](String)| jid | [optional] 
| **sortOrder** | **String**| Ascending or descending sort order | [optional] [default to ASC]<br />**Values**: ascending, descending 
| **expand** | [**List&lt;String&gt;**](String)| Which fields, if any, to expand | [optional]<br />**Values**: routingStatus, presence, integrationPresence, conversationSummary, outOfOffice, geolocation, station, authorization 
| **integrationPresenceSource** | **String**| Gets an integration presence for users instead of their defaults. This parameter will only be used when presence is provided as an \&quot;expand\&quot;. | [optional]<br />**Values**: MicrosoftTeams, ZoomPhone, EightByEight 
{: class="table-striped"}


### Return type

[**UserProfileEntityListing**](UserProfileEntityListing)


# **getRoutingDirectroutingbackupSettingsMe**


> [AgentDirectRoutingBackupSettings](AgentDirectRoutingBackupSettings) getRoutingDirectroutingbackupSettingsMe()

Get the user's Direct Routing Backup settings.

Wraps GET /api/v2/routing/directroutingbackup/settings/me  

Requires ANY permissions: 

* routing:directRoutingBackup:selfView

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
try {
    AgentDirectRoutingBackupSettings result = apiInstance.getRoutingDirectroutingbackupSettingsMe();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getRoutingDirectroutingbackupSettingsMe");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**AgentDirectRoutingBackupSettings**](AgentDirectRoutingBackupSettings)


# **getRoutingUserDirectroutingbackupSettings**


> [AgentDirectRoutingBackupSettings](AgentDirectRoutingBackupSettings) getRoutingUserDirectroutingbackupSettings(userId)

Get the user's Direct Routing Backup settings.

Wraps GET /api/v2/routing/users/{userId}/directroutingbackup/settings  

Requires ANY permissions: 

* routing:directRoutingBackup:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
try {
    AgentDirectRoutingBackupSettings result = apiInstance.getRoutingUserDirectroutingbackupSettings(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getRoutingUserDirectroutingbackupSettings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
{: class="table-striped"}


### Return type

[**AgentDirectRoutingBackupSettings**](AgentDirectRoutingBackupSettings)


# **getRoutingUserUtilization**


> [AgentMaxUtilizationResponse](AgentMaxUtilizationResponse) getRoutingUserUtilization(userId)

Get the user's max utilization settings.  If not configured, the organization-wide default is returned.

Wraps GET /api/v2/routing/users/{userId}/utilization  

Requires ANY permissions: 

* routing:utilization:manage
* routing:utilization:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
try {
    AgentMaxUtilizationResponse result = apiInstance.getRoutingUserUtilization(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getRoutingUserUtilization");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
{: class="table-striped"}


### Return type

[**AgentMaxUtilizationResponse**](AgentMaxUtilizationResponse)


# **getUser**


> [User](User) getUser(userId, expand, integrationPresenceSource, state)

Get user.

Wraps GET /api/v2/users/{userId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand. Note, expand parameters are resolved with a best effort approach and not guaranteed to be returned. If requested expand information is absolutely required, it's recommended to use specific API requests instead.
String integrationPresenceSource = "integrationPresenceSource_example"; // String | Gets an integration presence for a user instead of their default.
String state = "active"; // String | Search for a user with this state
try {
    User result = apiInstance.getUser(userId, expand, integrationPresenceSource, state);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUser");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **expand** | [**List&lt;String&gt;**](String)| Which fields, if any, to expand. Note, expand parameters are resolved with a best effort approach and not guaranteed to be returned. If requested expand information is absolutely required, it&#39;s recommended to use specific API requests instead. | [optional]<br />**Values**: routingStatus, presence, integrationPresence, conversationSummary, outOfOffice, geolocation, station, authorization, lasttokenissued, authorization.unusedRoles, team, workPlanBidRanks, externalContactsSettings, profileSkills, certifications, locations, groups, skills, languages, languagePreference, employerInfo, biography, dateLastLogin 
| **integrationPresenceSource** | **String**| Gets an integration presence for a user instead of their default. | [optional]<br />**Values**: MicrosoftTeams, ZoomPhone, EightByEight 
| **state** | **String**| Search for a user with this state | [optional] [default to active]<br />**Values**: active, deleted 
{: class="table-striped"}


### Return type

[**User**](User)


# **getUserAdjacents**


> [Adjacents](Adjacents) getUserAdjacents(userId, expand)

Get adjacents

Wraps GET /api/v2/users/{userId}/adjacents  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand
try {
    Adjacents result = apiInstance.getUserAdjacents(userId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserAdjacents");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **expand** | [**List&lt;String&gt;**](String)| Which fields, if any, to expand | [optional]<br />**Values**: routingStatus, presence, integrationPresence, conversationSummary, outOfOffice, geolocation, station, authorization, lasttokenissued, authorization.unusedRoles, team, workPlanBidRanks, externalContactsSettings, profileSkills, certifications, locations, groups, skills, languages, languagePreference, employerInfo, biography, dateLastLogin 
{: class="table-striped"}


### Return type

[**Adjacents**](Adjacents)


# **getUserCallforwarding**


> [CallForwarding](CallForwarding) getUserCallforwarding(userId)

Get a user's CallForwarding

Wraps GET /api/v2/users/{userId}/callforwarding  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
try {
    CallForwarding result = apiInstance.getUserCallforwarding(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserCallforwarding");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
{: class="table-striped"}


### Return type

[**CallForwarding**](CallForwarding)


# **getUserDirectreports**


> [List&lt;User&gt;](User) getUserDirectreports(userId, expand)

Get direct reports

Wraps GET /api/v2/users/{userId}/directreports  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand
try {
    List<User> result = apiInstance.getUserDirectreports(userId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserDirectreports");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **expand** | [**List&lt;String&gt;**](String)| Which fields, if any, to expand | [optional]<br />**Values**: routingStatus, presence, integrationPresence, conversationSummary, outOfOffice, geolocation, station, authorization, lasttokenissued, authorization.unusedRoles, team, workPlanBidRanks, externalContactsSettings, profileSkills, certifications, locations, groups, skills, languages, languagePreference, employerInfo, biography, dateLastLogin 
{: class="table-striped"}


### Return type

[**List&lt;User&gt;**](User)


# **getUserFavorites**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [UserEntityListing](UserEntityListing) getUserFavorites(userId, pageSize, pageNumber, sortOrder, expand)

Deprecated; will be revived with new contract

Wraps GET /api/v2/users/{userId}/favorites  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortOrder = "ASC"; // String | Sort order
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand
try {
    UserEntityListing result = apiInstance.getUserFavorites(userId, pageSize, pageNumber, sortOrder, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserFavorites");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **sortOrder** | **String**| Sort order | [optional] [default to ASC] 
| **expand** | [**List&lt;String&gt;**](String)| Which fields, if any, to expand | [optional]<br />**Values**: routingStatus, presence, integrationPresence, conversationSummary, outOfOffice, geolocation, station, authorization, lasttokenissued, authorization.unusedRoles, team, workPlanBidRanks, externalContactsSettings, profileSkills, certifications, locations, groups, skills, languages, languagePreference, employerInfo, biography, dateLastLogin 
{: class="table-striped"}


### Return type

[**UserEntityListing**](UserEntityListing)


# **getUserGeolocation**


> [Geolocation](Geolocation) getUserGeolocation(userId, clientId)

Get a user's Geolocation

Wraps GET /api/v2/users/{userId}/geolocations/{clientId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

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
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| user Id | 
| **clientId** | **String**| client Id | 
{: class="table-striped"}


### Return type

[**Geolocation**](Geolocation)


# **getUserOutofoffice**


> [OutOfOffice](OutOfOffice) getUserOutofoffice(userId)

Get a OutOfOffice

Wraps GET /api/v2/users/{userId}/outofoffice  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
try {
    OutOfOffice result = apiInstance.getUserOutofoffice(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserOutofoffice");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
{: class="table-striped"}


### Return type

[**OutOfOffice**](OutOfOffice)


# **getUserProfile**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [UserProfile](UserProfile) getUserProfile(userId, expand, integrationPresenceSource)

Get user profile

This api has been deprecated. Use api/v2/users instead

Wraps GET /api/v2/users/{userId}/profile  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | userId
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand
String integrationPresenceSource = "integrationPresenceSource_example"; // String | Gets an integration presence for a user instead of their default.
try {
    UserProfile result = apiInstance.getUserProfile(userId, expand, integrationPresenceSource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserProfile");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| userId | 
| **expand** | [**List&lt;String&gt;**](String)| Which fields, if any, to expand | [optional]<br />**Values**: routingStatus, presence, integrationPresence, conversationSummary, outOfOffice, geolocation, station, authorization, lasttokenissued, authorization.unusedRoles, team, workPlanBidRanks, externalContactsSettings 
| **integrationPresenceSource** | **String**| Gets an integration presence for a user instead of their default. | [optional]<br />**Values**: MicrosoftTeams, ZoomPhone, EightByEight 
{: class="table-striped"}


### Return type

[**UserProfile**](UserProfile)


# **getUserProfileskills**


> List&lt;String&gt; getUserProfileskills(userId)

List profile skills for a user

Wraps GET /api/v2/users/{userId}/profileskills  

Requires ANY permissions: 

* directory:userProfile:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
try {
    List<String> result = apiInstance.getUserProfileskills(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserProfileskills");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
{: class="table-striped"}


### Return type

**List&lt;String&gt;**


# **getUserQueues**


> [UserQueueEntityListing](UserQueueEntityListing) getUserQueues(userId, pageSize, pageNumber, joined, divisionId)

Get queues for user

Wraps GET /api/v2/users/{userId}/queues  

Requires ANY permissions: 

* routing:queue:view
* routing:queue:join
* routing:queueMember:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
Boolean joined = true; // Boolean | Is joined to the queue
List<String> divisionId = Arrays.asList(null); // List<String> | Division ID(s)
try {
    UserQueueEntityListing result = apiInstance.getUserQueues(userId, pageSize, pageNumber, joined, divisionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserQueues");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **joined** | **Boolean**| Is joined to the queue | [optional] [default to true] 
| **divisionId** | [**List&lt;String&gt;**](String)| Division ID(s) | [optional] 
{: class="table-striped"}


### Return type

[**UserQueueEntityListing**](UserQueueEntityListing)


# **getUserRoles**


> [UserAuthorization](UserAuthorization) getUserRoles(subjectId)

Returns a listing of roles and permissions for a user.

Wraps GET /api/v2/users/{subjectId}/roles  

Requires ANY permissions: 

* authorization:grant:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String subjectId = "subjectId_example"; // String | User ID
try {
    UserAuthorization result = apiInstance.getUserRoles(subjectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserRoles");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **subjectId** | **String**| User ID | 
{: class="table-striped"}


### Return type

[**UserAuthorization**](UserAuthorization)


# **getUserRoutinglanguages**


> [UserLanguageEntityListing](UserLanguageEntityListing) getUserRoutinglanguages(userId, pageSize, pageNumber, sortOrder)

List routing language for user

Wraps GET /api/v2/users/{userId}/routinglanguages  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortOrder = "ASC"; // String | Ascending or descending sort order
try {
    UserLanguageEntityListing result = apiInstance.getUserRoutinglanguages(userId, pageSize, pageNumber, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserRoutinglanguages");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **sortOrder** | **String**| Ascending or descending sort order | [optional] [default to ASC]<br />**Values**: ascending, descending 
{: class="table-striped"}


### Return type

[**UserLanguageEntityListing**](UserLanguageEntityListing)


# **getUserRoutingskills**


> [UserSkillEntityListing](UserSkillEntityListing) getUserRoutingskills(userId, pageSize, pageNumber, sortOrder)

List routing skills for user

Wraps GET /api/v2/users/{userId}/routingskills  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

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
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **sortOrder** | **String**| Ascending or descending sort order | [optional] [default to ASC]<br />**Values**: ascending, descending 
{: class="table-striped"}


### Return type

[**UserSkillEntityListing**](UserSkillEntityListing)


# **getUserRoutingstatus**


> [RoutingStatus](RoutingStatus) getUserRoutingstatus(userId)

Fetch the routing status of a user

Wraps GET /api/v2/users/{userId}/routingstatus  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
try {
    RoutingStatus result = apiInstance.getUserRoutingstatus(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserRoutingstatus");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
{: class="table-striped"}


### Return type

[**RoutingStatus**](RoutingStatus)


# **getUserSkillgroups**


> [UserSkillGroupEntityListing](UserSkillGroupEntityListing) getUserSkillgroups(userId, pageSize, after, before)

Get skill groups for a user

Wraps GET /api/v2/users/{userId}/skillgroups  

Requires ANY permissions: 

* routing:skillGroup:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
Integer pageSize = 25; // Integer | Page size
String after = "after_example"; // String | The cursor that points to the next page
String before = "before_example"; // String | The cursor that points to the previous page
try {
    UserSkillGroupEntityListing result = apiInstance.getUserSkillgroups(userId, pageSize, after, before);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserSkillgroups");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **after** | **String**| The cursor that points to the next page | [optional] 
| **before** | **String**| The cursor that points to the previous page | [optional] 
{: class="table-striped"}


### Return type

[**UserSkillGroupEntityListing**](UserSkillGroupEntityListing)


# **getUserState**


> [UserState](UserState) getUserState(userId)

Get user state information.

Wraps GET /api/v2/users/{userId}/state  

Requires ANY permissions: 

* directory:userStateChange:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
try {
    UserState result = apiInstance.getUserState(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserState");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
{: class="table-striped"}


### Return type

[**UserState**](UserState)


# **getUserStation**


> [UserStations](UserStations) getUserStation(userId)

Get station information for user

Wraps GET /api/v2/users/{userId}/station  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
try {
    UserStations result = apiInstance.getUserStation(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserStation");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
{: class="table-striped"}


### Return type

[**UserStations**](UserStations)


# **getUserSuperiors**


> [List&lt;User&gt;](User) getUserSuperiors(userId, expand)

Get superiors

Wraps GET /api/v2/users/{userId}/superiors  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand
try {
    List<User> result = apiInstance.getUserSuperiors(userId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserSuperiors");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **expand** | [**List&lt;String&gt;**](String)| Which fields, if any, to expand | [optional]<br />**Values**: routingStatus, presence, integrationPresence, conversationSummary, outOfOffice, geolocation, station, authorization, lasttokenissued, authorization.unusedRoles, team, workPlanBidRanks, externalContactsSettings, profileSkills, certifications, locations, groups, skills, languages, languagePreference, employerInfo, biography, dateLastLogin 
{: class="table-striped"}


### Return type

[**List&lt;User&gt;**](User)


# **getUserTrustors**


> [TrustorEntityListing](TrustorEntityListing) getUserTrustors(userId, pageSize, pageNumber)

List the organizations that have authorized/trusted the user.

Wraps GET /api/v2/users/{userId}/trustors  

Requires ALL permissions: 

* authorization:orgTrustor:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    TrustorEntityListing result = apiInstance.getUserTrustors(userId, pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserTrustors");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
{: class="table-striped"}


### Return type

[**TrustorEntityListing**](TrustorEntityListing)


# **getUserVerifiers**


> [VerifierEntityListing](VerifierEntityListing) getUserVerifiers(userId)

Get a list of verifiers

Wraps GET /api/v2/users/{userId}/verifiers  

Requires ANY permissions: 

* mfa:verifier:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
try {
    VerifierEntityListing result = apiInstance.getUserVerifiers(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserVerifiers");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
{: class="table-striped"}


### Return type

[**VerifierEntityListing**](VerifierEntityListing)


# **getUsers**


> [UserEntityListing](UserEntityListing) getUsers(pageSize, pageNumber, id, jabberId, sortOrder, expand, integrationPresenceSource, state)

Get the list of available users.

Wraps GET /api/v2/users  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
List<String> id = Arrays.asList(null); // List<String> | A list of user IDs to fetch by bulk
List<String> jabberId = Arrays.asList(null); // List<String> | A list of jabberIds to fetch by bulk (cannot be used with the \"id\" parameter)
String sortOrder = "ASC"; // String | Ascending or descending sort order
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand. Note, expand parameters are resolved with a best effort approach and not guaranteed to be returned. If requested expand information is absolutely required, it's recommended to use specific API requests instead.
String integrationPresenceSource = "integrationPresenceSource_example"; // String | Gets an integration presence for users instead of their defaults. This parameter will only be used when presence is provided as an \"expand\". When using this parameter the maximum number of users that can be returned is 100.
String state = "active"; // String | Only list users of this state
try {
    UserEntityListing result = apiInstance.getUsers(pageSize, pageNumber, id, jabberId, sortOrder, expand, integrationPresenceSource, state);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUsers");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **id** | [**List&lt;String&gt;**](String)| A list of user IDs to fetch by bulk | [optional] 
| **jabberId** | [**List&lt;String&gt;**](String)| A list of jabberIds to fetch by bulk (cannot be used with the \&quot;id\&quot; parameter) | [optional] 
| **sortOrder** | **String**| Ascending or descending sort order | [optional] [default to ASC]<br />**Values**: ascending, descending 
| **expand** | [**List&lt;String&gt;**](String)| Which fields, if any, to expand. Note, expand parameters are resolved with a best effort approach and not guaranteed to be returned. If requested expand information is absolutely required, it&#39;s recommended to use specific API requests instead. | [optional]<br />**Values**: routingStatus, presence, integrationPresence, conversationSummary, outOfOffice, geolocation, station, authorization, lasttokenissued, authorization.unusedRoles, team, workPlanBidRanks, externalContactsSettings, profileSkills, certifications, locations, groups, skills, languages, languagePreference, employerInfo, biography, dateLastLogin 
| **integrationPresenceSource** | **String**| Gets an integration presence for users instead of their defaults. This parameter will only be used when presence is provided as an \&quot;expand\&quot;. When using this parameter the maximum number of users that can be returned is 100. | [optional]<br />**Values**: MicrosoftTeams, ZoomPhone, EightByEight 
| **state** | **String**| Only list users of this state | [optional] [default to active]<br />**Values**: active, inactive, deleted, any 
{: class="table-striped"}


### Return type

[**UserEntityListing**](UserEntityListing)


# **getUsersDevelopmentActivities**


> [DevelopmentActivityListing](DevelopmentActivityListing) getUsersDevelopmentActivities(userId, moduleId, interval, completionInterval, overdue, pass, pageSize, pageNumber, sortOrder, types, statuses, relationship)

Get list of Development Activities

Either moduleId or userId is required. Results are filtered based on the applicable permissions.

Wraps GET /api/v2/users/development/activities  

Requires ANY permissions: 

* learning:assignment:view
* coaching:appointment:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
List<String> userId = Arrays.asList(null); // List<String> | Specifies the list of user IDs to be queried, up to 100 user IDs. It searches for any relationship for the userId.
String moduleId = "moduleId_example"; // String | Specifies the ID of the learning module.
String interval = "interval_example"; // String | Specifies the dateDue range to be queried. Milliseconds will be truncated. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss
String completionInterval = "completionInterval_example"; // String | Specifies the range of completion dates to be used for filtering. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss
String overdue = "Any"; // String | Specifies if non-overdue, overdue, or all activities are returned. If not specified, all activities are returned
String pass = "Any"; // String | Specifies if only the failed (pass is \"False\") or passed (pass is \"True\") activities are returned. If pass is \"Any\" or if the pass parameter is not supplied, all activities are returned
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortOrder = "Desc"; // String | Specifies result set sort order sorted by the date due; if not specified, default sort order is descending (Desc)
List<String> types = Arrays.asList(null); // List<String> | Specifies the activity types. Informational, AssessedContent and Assessment are deprecated
List<String> statuses = Arrays.asList(null); // List<String> | Specifies the activity statuses to filter by
List<String> relationship = Arrays.asList(null); // List<String> | Specifies how the current user relation should be interpreted, and filters the activities returned to only the activities that have the specified relationship. If a value besides Attendee is specified, it will only return Coaching Appointments. If not specified, no filtering is applied.
try {
    DevelopmentActivityListing result = apiInstance.getUsersDevelopmentActivities(userId, moduleId, interval, completionInterval, overdue, pass, pageSize, pageNumber, sortOrder, types, statuses, relationship);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUsersDevelopmentActivities");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | [**List&lt;String&gt;**](String)| Specifies the list of user IDs to be queried, up to 100 user IDs. It searches for any relationship for the userId. | [optional] 
| **moduleId** | **String**| Specifies the ID of the learning module. | [optional] 
| **interval** | **String**| Specifies the dateDue range to be queried. Milliseconds will be truncated. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss | [optional] 
| **completionInterval** | **String**| Specifies the range of completion dates to be used for filtering. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss | [optional] 
| **overdue** | **String**| Specifies if non-overdue, overdue, or all activities are returned. If not specified, all activities are returned | [optional] [default to Any]<br />**Values**: True, False, Any 
| **pass** | **String**| Specifies if only the failed (pass is \&quot;False\&quot;) or passed (pass is \&quot;True\&quot;) activities are returned. If pass is \&quot;Any\&quot; or if the pass parameter is not supplied, all activities are returned | [optional] [default to Any]<br />**Values**: True, False, Any 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **sortOrder** | **String**| Specifies result set sort order sorted by the date due; if not specified, default sort order is descending (Desc) | [optional] [default to Desc]<br />**Values**: Asc, Desc 
| **types** | [**List&lt;String&gt;**](String)| Specifies the activity types. Informational, AssessedContent and Assessment are deprecated | [optional]<br />**Values**: Informational, Coaching, AssessedContent, Assessment, External, Native 
| **statuses** | [**List&lt;String&gt;**](String)| Specifies the activity statuses to filter by | [optional]<br />**Values**: Planned, InProgress, Completed, InvalidSchedule, NotCompleted 
| **relationship** | [**List&lt;String&gt;**](String)| Specifies how the current user relation should be interpreted, and filters the activities returned to only the activities that have the specified relationship. If a value besides Attendee is specified, it will only return Coaching Appointments. If not specified, no filtering is applied. | [optional]<br />**Values**: Creator, Facilitator, Attendee 
{: class="table-striped"}


### Return type

[**DevelopmentActivityListing**](DevelopmentActivityListing)


# **getUsersDevelopmentActivitiesMe**


> [DevelopmentActivityListing](DevelopmentActivityListing) getUsersDevelopmentActivitiesMe(moduleId, interval, completionInterval, overdue, pass, pageSize, pageNumber, sortOrder, types, statuses, relationship)

Get list of Development Activities for current user

Results are filtered based on the applicable permissions.

Wraps GET /api/v2/users/development/activities/me  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String moduleId = "moduleId_example"; // String | Specifies the ID of the learning module.
String interval = "interval_example"; // String | Specifies the dateDue range to be queried. Milliseconds will be truncated. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss
String completionInterval = "completionInterval_example"; // String | Specifies the range of completion dates to be used for filtering. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss
String overdue = "Any"; // String | Specifies if non-overdue, overdue, or all activities are returned. If not specified, all activities are returned
String pass = "Any"; // String | Specifies if only the failed (pass is \"False\") or passed (pass is \"True\") activities are returned. If pass is \"Any\" or if the pass parameter is not supplied, all activities are returned
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortOrder = "Desc"; // String | Specifies result set sort order sorted by the date due; if not specified, default sort order is descending (Desc)
List<String> types = Arrays.asList(null); // List<String> | Specifies the activity types. Informational, AssessedContent and Assessment are deprecated
List<String> statuses = Arrays.asList(null); // List<String> | Specifies the activity statuses to filter by
List<String> relationship = Arrays.asList(null); // List<String> | Specifies how the current user relation should be interpreted, and filters the activities returned to only the activities that have the specified relationship. If a value besides Attendee is specified, it will only return Coaching Appointments. If not specified, no filtering is applied.
try {
    DevelopmentActivityListing result = apiInstance.getUsersDevelopmentActivitiesMe(moduleId, interval, completionInterval, overdue, pass, pageSize, pageNumber, sortOrder, types, statuses, relationship);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUsersDevelopmentActivitiesMe");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **moduleId** | **String**| Specifies the ID of the learning module. | [optional] 
| **interval** | **String**| Specifies the dateDue range to be queried. Milliseconds will be truncated. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss | [optional] 
| **completionInterval** | **String**| Specifies the range of completion dates to be used for filtering. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss | [optional] 
| **overdue** | **String**| Specifies if non-overdue, overdue, or all activities are returned. If not specified, all activities are returned | [optional] [default to Any]<br />**Values**: True, False, Any 
| **pass** | **String**| Specifies if only the failed (pass is \&quot;False\&quot;) or passed (pass is \&quot;True\&quot;) activities are returned. If pass is \&quot;Any\&quot; or if the pass parameter is not supplied, all activities are returned | [optional] [default to Any]<br />**Values**: True, False, Any 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **sortOrder** | **String**| Specifies result set sort order sorted by the date due; if not specified, default sort order is descending (Desc) | [optional] [default to Desc]<br />**Values**: Asc, Desc 
| **types** | [**List&lt;String&gt;**](String)| Specifies the activity types. Informational, AssessedContent and Assessment are deprecated | [optional]<br />**Values**: Informational, Coaching, AssessedContent, Assessment, External, Native 
| **statuses** | [**List&lt;String&gt;**](String)| Specifies the activity statuses to filter by | [optional]<br />**Values**: Planned, InProgress, Completed, InvalidSchedule, NotCompleted 
| **relationship** | [**List&lt;String&gt;**](String)| Specifies how the current user relation should be interpreted, and filters the activities returned to only the activities that have the specified relationship. If a value besides Attendee is specified, it will only return Coaching Appointments. If not specified, no filtering is applied. | [optional]<br />**Values**: Creator, Facilitator, Attendee 
{: class="table-striped"}


### Return type

[**DevelopmentActivityListing**](DevelopmentActivityListing)


# **getUsersDevelopmentActivity**


> [DevelopmentActivity](DevelopmentActivity) getUsersDevelopmentActivity(activityId, type)

Get a Development Activity

Permission not required if you are the attendee, creator or facilitator of the coaching appointment or you are the assigned user of the learning assignment.

Wraps GET /api/v2/users/development/activities/{activityId}  

Requires ANY permissions: 

* learning:assignment:view
* coaching:appointment:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String activityId = "activityId_example"; // String | Specifies the activity ID, maps to either assignment or appointment ID
String type = "type_example"; // String | Specifies the activity type. Informational, AssessedContent and Assessment are deprecated
try {
    DevelopmentActivity result = apiInstance.getUsersDevelopmentActivity(activityId, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUsersDevelopmentActivity");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **activityId** | **String**| Specifies the activity ID, maps to either assignment or appointment ID | 
| **type** | **String**| Specifies the activity type. Informational, AssessedContent and Assessment are deprecated |<br />**Values**: Informational, Coaching, AssessedContent, Assessment, External, Native 
{: class="table-striped"}


### Return type

[**DevelopmentActivity**](DevelopmentActivity)


# **getUsersMe**


> [UserMe](UserMe) getUsersMe(expand, integrationPresenceSource)

Get current user details.

This request is not valid when using the Client Credentials OAuth grant.

Wraps GET /api/v2/users/me  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand.
String integrationPresenceSource = "integrationPresenceSource_example"; // String | Get your presence for a given integration. This parameter will only be used when presence is provided as an \"expand\".
try {
    UserMe result = apiInstance.getUsersMe(expand, integrationPresenceSource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUsersMe");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **expand** | [**List&lt;String&gt;**](String)| Which fields, if any, to expand. | [optional]<br />**Values**: routingStatus, presence, integrationPresence, conversationSummary, outOfOffice, geolocation, station, authorization, lasttokenissued, authorization.unusedRoles, team, workPlanBidRanks, externalContactsSettings, profileSkills, certifications, locations, groups, skills, languages, languagePreference, employerInfo, biography, dateLastLogin, date, geolocationsettings, organization, presencedefinitions, divisionedpresencedefinitions, locationdefinitions, orgauthorization, orgproducts, favorites, superiors, directreports, adjacents, routingskills, routinglanguages, fieldconfigs, token, trustors, logCapture 
| **integrationPresenceSource** | **String**| Get your presence for a given integration. This parameter will only be used when presence is provided as an \&quot;expand\&quot;. | [optional]<br />**Values**: MicrosoftTeams, ZoomPhone, EightByEight 
{: class="table-striped"}


### Return type

[**UserMe**](UserMe)


# **getUsersSearch**


> [UsersSearchResponse](UsersSearchResponse) getUsersSearch(q64, expand, integrationPresenceSource)

Search users using the q64 value returned from a previous search

Wraps GET /api/v2/users/search  

Requires ANY permissions: 

* directory:user:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String q64 = "q64_example"; // String | q64
List<String> expand = Arrays.asList(null); // List<String> | expand
String integrationPresenceSource = "integrationPresenceSource_example"; // String | integrationPresenceSource
try {
    UsersSearchResponse result = apiInstance.getUsersSearch(q64, expand, integrationPresenceSource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUsersSearch");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **q64** | **String**| q64 | 
| **expand** | [**List&lt;String&gt;**](String)| expand | [optional] 
| **integrationPresenceSource** | **String**| integrationPresenceSource | [optional]<br />**Values**: MicrosoftTeams, ZoomPhone, EightByEight 
{: class="table-striped"}


### Return type

[**UsersSearchResponse**](UsersSearchResponse)


# **patchUser**


> [User](User) patchUser(userId, body)

Update user

Wraps PATCH /api/v2/users/{userId}  

Requires ANY permissions: 

* admin
* directory:user:edit
* directory:organization:admin

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

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
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **body** | [**UpdateUser**](UpdateUser)| User | 
{: class="table-striped"}


### Return type

[**User**](User)


# **patchUserCallforwarding**


> [CallForwarding](CallForwarding) patchUserCallforwarding(userId, body)

Patch a user's CallForwarding

Wraps PATCH /api/v2/users/{userId}/callforwarding  

Requires ANY permissions: 

* conversation:callForwarding:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

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
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **body** | [**CallForwarding**](CallForwarding)| Call forwarding | 
{: class="table-striped"}


### Return type

[**CallForwarding**](CallForwarding)


# **patchUserGeolocation**


> [Geolocation](Geolocation) patchUserGeolocation(userId, clientId, body)

Patch a user's Geolocation

The geolocation object can be patched one of three ways. Option 1: Set the 'primary' property to true. This will set the client as the user's primary geolocation source.  Option 2: Provide the 'latitude' and 'longitude' values.  This will enqueue an asynchronous update of the 'city', 'region', and 'country', generating a notification. A subsequent GET operation will include the new values for 'city', 'region' and 'country'.  Option 3:  Provide the 'city', 'region', 'country' values.  Option 1 can be combined with Option 2 or Option 3.  For example, update the client as primary and provide latitude and longitude values.

Wraps PATCH /api/v2/users/{userId}/geolocations/{clientId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

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
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| user Id | 
| **clientId** | **String**| client Id | 
| **body** | [**Geolocation**](Geolocation)| Geolocation | 
{: class="table-striped"}


### Return type

[**Geolocation**](Geolocation)


# **patchUserQueue**


> [UserQueue](UserQueue) patchUserQueue(queueId, userId, body)

Join or unjoin a queue for a user

Wraps PATCH /api/v2/users/{userId}/queues/{queueId}  

Requires ANY permissions: 

* routing:queue:join
* routing:queueMember:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

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
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **queueId** | **String**| Queue ID | 
| **userId** | **String**| User ID | 
| **body** | [**UserQueue**](UserQueue)| Queue Member | 
{: class="table-striped"}


### Return type

[**UserQueue**](UserQueue)


# **patchUserQueues**


> [UserQueueEntityListing](UserQueueEntityListing) patchUserQueues(userId, body, divisionId)

Join or unjoin a set of queues for a user

Wraps PATCH /api/v2/users/{userId}/queues  

Requires ANY permissions: 

* routing:queue:join
* routing:queueMember:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
List<UserQueue> body = Arrays.asList(new UserQueue()); // List<UserQueue> | User Queues
List<String> divisionId = Arrays.asList(null); // List<String> | Division ID(s)
try {
    UserQueueEntityListing result = apiInstance.patchUserQueues(userId, body, divisionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#patchUserQueues");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **body** | [**List&lt;UserQueue&gt;**](UserQueue)| User Queues | 
| **divisionId** | [**List&lt;String&gt;**](String)| Division ID(s) | [optional] 
{: class="table-striped"}


### Return type

[**UserQueueEntityListing**](UserQueueEntityListing)


# **patchUserRoutinglanguage**


> [UserRoutingLanguage](UserRoutingLanguage) patchUserRoutinglanguage(userId, languageId, body)

Update routing language proficiency or state.

Wraps PATCH /api/v2/users/{userId}/routinglanguages/{languageId}  

Requires ANY permissions: 

* routing:skill:assign
* routing:language:assign

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
String languageId = "languageId_example"; // String | languageId
UserRoutingLanguage body = new UserRoutingLanguage(); // UserRoutingLanguage | Language
try {
    UserRoutingLanguage result = apiInstance.patchUserRoutinglanguage(userId, languageId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#patchUserRoutinglanguage");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **languageId** | **String**| languageId | 
| **body** | [**UserRoutingLanguage**](UserRoutingLanguage)| Language | 
{: class="table-striped"}


### Return type

[**UserRoutingLanguage**](UserRoutingLanguage)


# **patchUserRoutinglanguagesBulk**


> [UserLanguageEntityListing](UserLanguageEntityListing) patchUserRoutinglanguagesBulk(userId, body)

Add bulk routing language to user. Max limit 50 languages

Wraps PATCH /api/v2/users/{userId}/routinglanguages/bulk  

Requires ANY permissions: 

* routing:skill:assign
* routing:language:assign

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
List<UserRoutingLanguagePost> body = Arrays.asList(new UserRoutingLanguagePost()); // List<UserRoutingLanguagePost> | Language
try {
    UserLanguageEntityListing result = apiInstance.patchUserRoutinglanguagesBulk(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#patchUserRoutinglanguagesBulk");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **body** | [**List&lt;UserRoutingLanguagePost&gt;**](UserRoutingLanguagePost)| Language | 
{: class="table-striped"}


### Return type

[**UserLanguageEntityListing**](UserLanguageEntityListing)


# **patchUserRoutingskillsBulk**


> [UserSkillEntityListing](UserSkillEntityListing) patchUserRoutingskillsBulk(userId, body)

Bulk add routing skills to user

Wraps PATCH /api/v2/users/{userId}/routingskills/bulk  

Requires ANY permissions: 

* routing:skill:assign

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
List<UserRoutingSkillPost> body = Arrays.asList(new UserRoutingSkillPost()); // List<UserRoutingSkillPost> | Skill
try {
    UserSkillEntityListing result = apiInstance.patchUserRoutingskillsBulk(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#patchUserRoutingskillsBulk");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **body** | [**List&lt;UserRoutingSkillPost&gt;**](UserRoutingSkillPost)| Skill | 
{: class="table-striped"}


### Return type

[**UserSkillEntityListing**](UserSkillEntityListing)


# **patchUsersBulk**


> [UserEntityListing](UserEntityListing) patchUsersBulk(body)

Update bulk acd autoanswer on users. Max 50 users can be updated at a time.

Wraps PATCH /api/v2/users/bulk  

Requires ANY permissions: 

* directory:user:edit
* directory:organization:admin

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
List<PatchUser> body = Arrays.asList(new PatchUser()); // List<PatchUser> | Users
try {
    UserEntityListing result = apiInstance.patchUsersBulk(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#patchUsersBulk");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**List&lt;PatchUser&gt;**](PatchUser)| Users | 
{: class="table-striped"}


### Return type

[**UserEntityListing**](UserEntityListing)


# **postAnalyticsUsersActivityQuery**


> [UserActivityResponse](UserActivityResponse) postAnalyticsUsersActivityQuery(body, pageSize, pageNumber)

Query for user activity observations

Wraps POST /api/v2/analytics/users/activity/query  

Requires ANY permissions: 

* analytics:userObservation:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
UserActivityQuery body = new UserActivityQuery(); // UserActivityQuery | query
Integer pageSize = 56; // Integer | The desired page size
Integer pageNumber = 56; // Integer | The desired page number
try {
    UserActivityResponse result = apiInstance.postAnalyticsUsersActivityQuery(body, pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postAnalyticsUsersActivityQuery");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**UserActivityQuery**](UserActivityQuery)| query | 
| **pageSize** | **Integer**| The desired page size | [optional] 
| **pageNumber** | **Integer**| The desired page number | [optional] 
{: class="table-striped"}


### Return type

[**UserActivityResponse**](UserActivityResponse)


# **postAnalyticsUsersAggregatesJobs**


> [AsyncQueryResponse](AsyncQueryResponse) postAnalyticsUsersAggregatesJobs(body)

Query for user aggregates asynchronously

postAnalyticsUsersAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/analytics/users/aggregates/jobs  

Requires ANY permissions: 

* analytics:userAggregate:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
UserAsyncAggregationQuery body = new UserAsyncAggregationQuery(); // UserAsyncAggregationQuery | query
try {
    AsyncQueryResponse result = apiInstance.postAnalyticsUsersAggregatesJobs(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postAnalyticsUsersAggregatesJobs");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**UserAsyncAggregationQuery**](UserAsyncAggregationQuery)| query | 
{: class="table-striped"}


### Return type

[**AsyncQueryResponse**](AsyncQueryResponse)


# **postAnalyticsUsersAggregatesQuery**


> [UserAggregateQueryResponse](UserAggregateQueryResponse) postAnalyticsUsersAggregatesQuery(body)

Query for user aggregates

Wraps POST /api/v2/analytics/users/aggregates/query  

Requires ANY permissions: 

* analytics:userAggregate:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
UserAggregationQuery body = new UserAggregationQuery(); // UserAggregationQuery | query
try {
    UserAggregateQueryResponse result = apiInstance.postAnalyticsUsersAggregatesQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postAnalyticsUsersAggregatesQuery");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**UserAggregationQuery**](UserAggregationQuery)| query | 
{: class="table-striped"}


### Return type

[**UserAggregateQueryResponse**](UserAggregateQueryResponse)


# **postAnalyticsUsersDetailsJobs**


> [AsyncQueryResponse](AsyncQueryResponse) postAnalyticsUsersDetailsJobs(body)

Query for user details asynchronously

Wraps POST /api/v2/analytics/users/details/jobs  

Requires ANY permissions: 

* analytics:userDetail:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
AsyncUserDetailsQuery body = new AsyncUserDetailsQuery(); // AsyncUserDetailsQuery | query
try {
    AsyncQueryResponse result = apiInstance.postAnalyticsUsersDetailsJobs(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postAnalyticsUsersDetailsJobs");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**AsyncUserDetailsQuery**](AsyncUserDetailsQuery)| query | 
{: class="table-striped"}


### Return type

[**AsyncQueryResponse**](AsyncQueryResponse)


# **postAnalyticsUsersDetailsQuery**


> [AnalyticsUserDetailsQueryResponse](AnalyticsUserDetailsQueryResponse) postAnalyticsUsersDetailsQuery(body)

Query for user details

Wraps POST /api/v2/analytics/users/details/query  

Requires ANY permissions: 

* analytics:userDetail:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
UserDetailsQuery body = new UserDetailsQuery(); // UserDetailsQuery | query
try {
    AnalyticsUserDetailsQueryResponse result = apiInstance.postAnalyticsUsersDetailsQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postAnalyticsUsersDetailsQuery");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**UserDetailsQuery**](UserDetailsQuery)| query | 
{: class="table-striped"}


### Return type

[**AnalyticsUserDetailsQueryResponse**](AnalyticsUserDetailsQueryResponse)


# **postAnalyticsUsersObservationsQuery**


> [UserObservationQueryResponse](UserObservationQueryResponse) postAnalyticsUsersObservationsQuery(body)

Query for user observations

Wraps POST /api/v2/analytics/users/observations/query  

Requires ANY permissions: 

* analytics:userObservation:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
UserObservationQuery body = new UserObservationQuery(); // UserObservationQuery | query
try {
    UserObservationQueryResponse result = apiInstance.postAnalyticsUsersObservationsQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postAnalyticsUsersObservationsQuery");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**UserObservationQuery**](UserObservationQuery)| query | 
{: class="table-striped"}


### Return type

[**UserObservationQueryResponse**](UserObservationQueryResponse)


# **postAuthorizationSubjectBulkadd**


> Void postAuthorizationSubjectBulkadd(subjectId, body, subjectType)

Bulk-grant roles and divisions to a subject.

Wraps POST /api/v2/authorization/subjects/{subjectId}/bulkadd  

Requires ALL permissions: 

* authorization:grant:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String subjectId = "subjectId_example"; // String | Subject ID (user or group)
RoleDivisionGrants body = new RoleDivisionGrants(); // RoleDivisionGrants | Pairs of role and division IDs
String subjectType = "PC_USER"; // String | what the type of the subject is (PC_GROUP, PC_USER or PC_OAUTH_CLIENT)
try {
    apiInstance.postAuthorizationSubjectBulkadd(subjectId, body, subjectType);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postAuthorizationSubjectBulkadd");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **subjectId** | **String**| Subject ID (user or group) | 
| **body** | [**RoleDivisionGrants**](RoleDivisionGrants)| Pairs of role and division IDs | 
| **subjectType** | **String**| what the type of the subject is (PC_GROUP, PC_USER or PC_OAUTH_CLIENT) | [optional] [default to PC_USER] 
{: class="table-striped"}


### Return type

null (empty response body)


# **postAuthorizationSubjectBulkremove**


> Void postAuthorizationSubjectBulkremove(subjectId, body)

Bulk-remove grants from a subject.

Wraps POST /api/v2/authorization/subjects/{subjectId}/bulkremove  

Requires ALL permissions: 

* authorization:grant:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String subjectId = "subjectId_example"; // String | Subject ID (user or group)
RoleDivisionGrants body = new RoleDivisionGrants(); // RoleDivisionGrants | Pairs of role and division IDs
try {
    apiInstance.postAuthorizationSubjectBulkremove(subjectId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postAuthorizationSubjectBulkremove");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **subjectId** | **String**| Subject ID (user or group) | 
| **body** | [**RoleDivisionGrants**](RoleDivisionGrants)| Pairs of role and division IDs | 
{: class="table-striped"}


### Return type

null (empty response body)


# **postAuthorizationSubjectBulkreplace**


> Void postAuthorizationSubjectBulkreplace(subjectId, body, subjectType)

Replace subject's roles and divisions with the exact list supplied in the request.

This operation will not remove grants that are inherited from group membership. It will only set the grants directly applied to the subject.

Wraps POST /api/v2/authorization/subjects/{subjectId}/bulkreplace  

Requires ALL permissions: 

* authorization:grant:add
* authorization:grant:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String subjectId = "subjectId_example"; // String | Subject ID (user or group)
RoleDivisionGrants body = new RoleDivisionGrants(); // RoleDivisionGrants | Pairs of role and division IDs
String subjectType = "PC_USER"; // String | what the type of the subject is (PC_GROUP, PC_USER or PC_OAUTH_CLIENT)
try {
    apiInstance.postAuthorizationSubjectBulkreplace(subjectId, body, subjectType);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postAuthorizationSubjectBulkreplace");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **subjectId** | **String**| Subject ID (user or group) | 
| **body** | [**RoleDivisionGrants**](RoleDivisionGrants)| Pairs of role and division IDs | 
| **subjectType** | **String**| what the type of the subject is (PC_GROUP, PC_USER or PC_OAUTH_CLIENT) | [optional] [default to PC_USER] 
{: class="table-striped"}


### Return type

null (empty response body)


# **postAuthorizationSubjectDivisionRole**


> Void postAuthorizationSubjectDivisionRole(subjectId, divisionId, roleId, subjectType)

Make a grant of a role in a division

Wraps POST /api/v2/authorization/subjects/{subjectId}/divisions/{divisionId}/roles/{roleId}  

Requires ALL permissions: 

* authorization:grant:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String subjectId = "subjectId_example"; // String | Subject ID (user or group)
String divisionId = "divisionId_example"; // String | the id of the division to which to make the grant
String roleId = "roleId_example"; // String | the id of the role to grant
String subjectType = "PC_USER"; // String | what the type of the subject is: PC_GROUP, PC_USER or PC_OAUTH_CLIENT (note: for cross-org authorization, please use the Organization Authorization endpoints)
try {
    apiInstance.postAuthorizationSubjectDivisionRole(subjectId, divisionId, roleId, subjectType);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postAuthorizationSubjectDivisionRole");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **subjectId** | **String**| Subject ID (user or group) | 
| **divisionId** | **String**| the id of the division to which to make the grant | 
| **roleId** | **String**| the id of the role to grant | 
| **subjectType** | **String**| what the type of the subject is: PC_GROUP, PC_USER or PC_OAUTH_CLIENT (note: for cross-org authorization, please use the Organization Authorization endpoints) | [optional] [default to PC_USER] 
{: class="table-striped"}


### Return type

null (empty response body)


# **postUserExternalid**


> [List&lt;UserExternalIdentifier&gt;](UserExternalIdentifier) postUserExternalid(userId, body)

Create mapping between external identifier and user. Limit 100 per entity.

Authority Name and External key are case sensitive.

Wraps POST /api/v2/users/{userId}/externalid  

Requires ANY permissions: 

* directory:user:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
UserExternalIdentifier body = new UserExternalIdentifier(); // UserExternalIdentifier | 
try {
    List<UserExternalIdentifier> result = apiInstance.postUserExternalid(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postUserExternalid");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **body** | [**UserExternalIdentifier**](UserExternalIdentifier)|  | 
{: class="table-striped"}


### Return type

[**List&lt;UserExternalIdentifier&gt;**](UserExternalIdentifier)


# **postUserInvite**


> Void postUserInvite(userId, force)

Send an activation email to the user

Wraps POST /api/v2/users/{userId}/invite  

Requires ANY permissions: 

* admin
* directory:organization:admin
* directory:userPassword:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
Boolean force = false; // Boolean | Resend the invitation even if one is already outstanding
try {
    apiInstance.postUserInvite(userId, force);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postUserInvite");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **force** | **Boolean**| Resend the invitation even if one is already outstanding | [optional] [default to false] 
{: class="table-striped"}


### Return type

null (empty response body)


# **postUserPassword**


> Void postUserPassword(userId, body)

Change a users password

Wraps POST /api/v2/users/{userId}/password  

Requires ANY permissions: 

* directory:user:setPassword

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
ChangePasswordRequest body = new ChangePasswordRequest(); // ChangePasswordRequest | Password
try {
    apiInstance.postUserPassword(userId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postUserPassword");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **body** | [**ChangePasswordRequest**](ChangePasswordRequest)| Password | 
{: class="table-striped"}


### Return type

null (empty response body)


# **postUserRoutinglanguages**


> [UserRoutingLanguage](UserRoutingLanguage) postUserRoutinglanguages(userId, body)

Add routing language to user

Wraps POST /api/v2/users/{userId}/routinglanguages  

Requires ANY permissions: 

* routing:skill:assign
* routing:language:assign

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
UserRoutingLanguagePost body = new UserRoutingLanguagePost(); // UserRoutingLanguagePost | Language
try {
    UserRoutingLanguage result = apiInstance.postUserRoutinglanguages(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postUserRoutinglanguages");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **body** | [**UserRoutingLanguagePost**](UserRoutingLanguagePost)| Language | 
{: class="table-striped"}


### Return type

[**UserRoutingLanguage**](UserRoutingLanguage)


# **postUserRoutingskills**


> [UserRoutingSkill](UserRoutingSkill) postUserRoutingskills(userId, body)

Add routing skill to user

Wraps POST /api/v2/users/{userId}/routingskills  

Requires ALL permissions: 

* routing:skill:assign

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

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
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **body** | [**UserRoutingSkillPost**](UserRoutingSkillPost)| Skill | 
{: class="table-striped"}


### Return type

[**UserRoutingSkill**](UserRoutingSkill)


# **postUsers**


> [User](User) postUsers(body)

Create user

If user creation is successful but the provided password is invalid or configuration fails, POST api/v2/users/{userId}/password can be used to re-attempt password configuration.

Wraps POST /api/v2/users  

Requires ANY permissions: 

* directory:user:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
CreateUser body = new CreateUser(); // CreateUser | User
try {
    User result = apiInstance.postUsers(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postUsers");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**CreateUser**](CreateUser)| User | 
{: class="table-striped"}


### Return type

[**User**](User)


# **postUsersDevelopmentActivitiesAggregatesQuery**


> [DevelopmentActivityAggregateResponse](DevelopmentActivityAggregateResponse) postUsersDevelopmentActivitiesAggregatesQuery(body)

Retrieve aggregated development activity data

Results are filtered based on the applicable permissions.

Wraps POST /api/v2/users/development/activities/aggregates/query  

Requires ANY permissions: 

* learning:assignment:view
* coaching:appointment:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
DevelopmentActivityAggregateParam body = new DevelopmentActivityAggregateParam(); // DevelopmentActivityAggregateParam | Aggregate Request
try {
    DevelopmentActivityAggregateResponse result = apiInstance.postUsersDevelopmentActivitiesAggregatesQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postUsersDevelopmentActivitiesAggregatesQuery");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**DevelopmentActivityAggregateParam**](DevelopmentActivityAggregateParam)| Aggregate Request | 
{: class="table-striped"}


### Return type

[**DevelopmentActivityAggregateResponse**](DevelopmentActivityAggregateResponse)


# **postUsersMePassword**


> Void postUsersMePassword(body)

Change your password

Wraps POST /api/v2/users/me/password  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
ChangeMyPasswordRequest body = new ChangeMyPasswordRequest(); // ChangeMyPasswordRequest | Password
try {
    apiInstance.postUsersMePassword(body);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postUsersMePassword");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**ChangeMyPasswordRequest**](ChangeMyPasswordRequest)| Password | 
{: class="table-striped"}


### Return type

null (empty response body)


# **postUsersSearch**


> [UsersSearchResponse](UsersSearchResponse) postUsersSearch(body)

Search users

Wraps POST /api/v2/users/search  

Requires ANY permissions: 

* directory:user:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
UserSearchRequest body = new UserSearchRequest(); // UserSearchRequest | Search request options
try {
    UsersSearchResponse result = apiInstance.postUsersSearch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postUsersSearch");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**UserSearchRequest**](UserSearchRequest)| Search request options | 
{: class="table-striped"}


### Return type

[**UsersSearchResponse**](UsersSearchResponse)


# **postUsersSearchConversationTarget**


> [UsersSearchResponse](UsersSearchResponse) postUsersSearchConversationTarget(body)

Search users as conversation targets

postUsersSearchConversationTarget is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/users/search/conversation/target  

Requires ANY permissions: 

* conversation:communication:target

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
UserSearchRequest body = new UserSearchRequest(); // UserSearchRequest | Search request options
try {
    UsersSearchResponse result = apiInstance.postUsersSearchConversationTarget(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postUsersSearchConversationTarget");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**UserSearchRequest**](UserSearchRequest)| Search request options | 
{: class="table-striped"}


### Return type

[**UsersSearchResponse**](UsersSearchResponse)


# **postUsersSearchQueuemembersManage**


> [UsersSearchResponse](UsersSearchResponse) postUsersSearchQueuemembersManage(body)

Search manage queue member

postUsersSearchQueuemembersManage is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/users/search/queuemembers/manage  

Requires ANY permissions: 

* routing:queueMember:manage
* routing:queue:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
UserSearchRequest body = new UserSearchRequest(); // UserSearchRequest | Search request options
try {
    UsersSearchResponse result = apiInstance.postUsersSearchQueuemembersManage(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postUsersSearchQueuemembersManage");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**UserSearchRequest**](UserSearchRequest)| Search request options | 
{: class="table-striped"}


### Return type

[**UsersSearchResponse**](UsersSearchResponse)


# **postUsersSearchTeamsAssign**


> [UsersSearchResponse](UsersSearchResponse) postUsersSearchTeamsAssign(body)

Search users assigned to teams

Wraps POST /api/v2/users/search/teams/assign  

Requires ANY permissions: 

* groups:team:assign

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
UserSearchRequest body = new UserSearchRequest(); // UserSearchRequest | Search request options
try {
    UsersSearchResponse result = apiInstance.postUsersSearchTeamsAssign(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postUsersSearchTeamsAssign");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**UserSearchRequest**](UserSearchRequest)| Search request options | 
{: class="table-striped"}


### Return type

[**UsersSearchResponse**](UsersSearchResponse)


# **putRoutingDirectroutingbackupSettingsMe**


> [AgentDirectRoutingBackupSettings](AgentDirectRoutingBackupSettings) putRoutingDirectroutingbackupSettingsMe(body)

Update the user's Direct Routing Backup settings.

Wraps PUT /api/v2/routing/directroutingbackup/settings/me  

Requires ANY permissions: 

* routing:directRoutingBackup:selfEdit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
AgentDirectRoutingBackupSettings body = new AgentDirectRoutingBackupSettings(); // AgentDirectRoutingBackupSettings | directRoutingBackup
try {
    AgentDirectRoutingBackupSettings result = apiInstance.putRoutingDirectroutingbackupSettingsMe(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#putRoutingDirectroutingbackupSettingsMe");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**AgentDirectRoutingBackupSettings**](AgentDirectRoutingBackupSettings)| directRoutingBackup | 
{: class="table-striped"}


### Return type

[**AgentDirectRoutingBackupSettings**](AgentDirectRoutingBackupSettings)


# **putRoutingUserDirectroutingbackupSettings**


> [AgentDirectRoutingBackupSettings](AgentDirectRoutingBackupSettings) putRoutingUserDirectroutingbackupSettings(userId, body)

Update the user's Direct Routing Backup settings.

Wraps PUT /api/v2/routing/users/{userId}/directroutingbackup/settings  

Requires ANY permissions: 

* routing:directRoutingBackup:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
AgentDirectRoutingBackupSettings body = new AgentDirectRoutingBackupSettings(); // AgentDirectRoutingBackupSettings | directRoutingBackup
try {
    AgentDirectRoutingBackupSettings result = apiInstance.putRoutingUserDirectroutingbackupSettings(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#putRoutingUserDirectroutingbackupSettings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **body** | [**AgentDirectRoutingBackupSettings**](AgentDirectRoutingBackupSettings)| directRoutingBackup | 
{: class="table-striped"}


### Return type

[**AgentDirectRoutingBackupSettings**](AgentDirectRoutingBackupSettings)


# **putRoutingUserUtilization**


> [AgentMaxUtilizationResponse](AgentMaxUtilizationResponse) putRoutingUserUtilization(userId, body)

Update the user's max utilization settings.  Include only those media types requiring custom configuration.

Wraps PUT /api/v2/routing/users/{userId}/utilization  

Requires ANY permissions: 

* routing:utilization:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
UtilizationRequest body = new UtilizationRequest(); // UtilizationRequest | utilization
try {
    AgentMaxUtilizationResponse result = apiInstance.putRoutingUserUtilization(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#putRoutingUserUtilization");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **body** | [**UtilizationRequest**](UtilizationRequest)| utilization | 
{: class="table-striped"}


### Return type

[**AgentMaxUtilizationResponse**](AgentMaxUtilizationResponse)


# **putUserCallforwarding**


> [CallForwarding](CallForwarding) putUserCallforwarding(userId, body)

Update a user's CallForwarding

Wraps PUT /api/v2/users/{userId}/callforwarding  

Requires ANY permissions: 

* conversation:callForwarding:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

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
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **body** | [**CallForwarding**](CallForwarding)| Call forwarding | 
{: class="table-striped"}


### Return type

[**CallForwarding**](CallForwarding)


# **putUserOutofoffice**


> [OutOfOffice](OutOfOffice) putUserOutofoffice(userId, body)

Update an OutOfOffice

Wraps PUT /api/v2/users/{userId}/outofoffice  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
OutOfOffice body = new OutOfOffice(); // OutOfOffice | The updated OutOffOffice
try {
    OutOfOffice result = apiInstance.putUserOutofoffice(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#putUserOutofoffice");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **body** | [**OutOfOffice**](OutOfOffice)| The updated OutOffOffice | 
{: class="table-striped"}


### Return type

[**OutOfOffice**](OutOfOffice)


# **putUserProfileskills**


> List&lt;String&gt; putUserProfileskills(userId, body)

Update profile skills for a user

Wraps PUT /api/v2/users/{userId}/profileskills  

Requires ANY permissions: 

* directory:userProfile:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
List<String> body = Arrays.asList(null); // List<String> | Skills
try {
    List<String> result = apiInstance.putUserProfileskills(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#putUserProfileskills");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **body** | [**List&lt;String&gt;**](String)| Skills | 
{: class="table-striped"}


### Return type

**List&lt;String&gt;**


# **putUserRoles**


> [UserAuthorization](UserAuthorization) putUserRoles(subjectId, body)

Sets the user's roles

Wraps PUT /api/v2/users/{subjectId}/roles  

Requires ANY permissions: 

* authorization:grant:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String subjectId = "subjectId_example"; // String | User ID
List<String> body = Arrays.asList(null); // List<String> | List of roles
try {
    UserAuthorization result = apiInstance.putUserRoles(subjectId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#putUserRoles");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **subjectId** | **String**| User ID | 
| **body** | [**List&lt;String&gt;**](String)| List of roles | 
{: class="table-striped"}


### Return type

[**UserAuthorization**](UserAuthorization)


# **putUserRoutingskill**


> [UserRoutingSkill](UserRoutingSkill) putUserRoutingskill(userId, skillId, body)

Update routing skill proficiency or state.

Wraps PUT /api/v2/users/{userId}/routingskills/{skillId}  

Requires ALL permissions: 

* routing:skill:assign

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

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
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **skillId** | **String**| skillId | 
| **body** | [**UserRoutingSkill**](UserRoutingSkill)| Skill | 
{: class="table-striped"}


### Return type

[**UserRoutingSkill**](UserRoutingSkill)


# **putUserRoutingskillsBulk**


> [UserSkillEntityListing](UserSkillEntityListing) putUserRoutingskillsBulk(userId, body)

Replace all routing skills assigned to a user

Wraps PUT /api/v2/users/{userId}/routingskills/bulk  

Requires ANY permissions: 

* routing:skill:assign

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
List<UserRoutingSkillPost> body = Arrays.asList(new UserRoutingSkillPost()); // List<UserRoutingSkillPost> | Skill
try {
    UserSkillEntityListing result = apiInstance.putUserRoutingskillsBulk(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#putUserRoutingskillsBulk");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **body** | [**List&lt;UserRoutingSkillPost&gt;**](UserRoutingSkillPost)| Skill | 
{: class="table-striped"}


### Return type

[**UserSkillEntityListing**](UserSkillEntityListing)


# **putUserRoutingstatus**


> [RoutingStatus](RoutingStatus) putUserRoutingstatus(userId, body)

Update the routing status of a user

Wraps PUT /api/v2/users/{userId}/routingstatus  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

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
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **body** | [**RoutingStatus**](RoutingStatus)| Routing Status | 
{: class="table-striped"}


### Return type

[**RoutingStatus**](RoutingStatus)


# **putUserState**


> [UserState](UserState) putUserState(userId, body)

Update user state information.

Wraps PUT /api/v2/users/{userId}/state  

Requires ANY permissions: 

* directory:user:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
UserState body = new UserState(); // UserState | User
try {
    UserState result = apiInstance.putUserState(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#putUserState");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **body** | [**UserState**](UserState)| User | 
{: class="table-striped"}


### Return type

[**UserState**](UserState)


# **putUserStationAssociatedstationStationId**


> Void putUserStationAssociatedstationStationId(userId, stationId)

Set associated station

Wraps PUT /api/v2/users/{userId}/station/associatedstation/{stationId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
String stationId = "stationId_example"; // String | stationId
try {
    apiInstance.putUserStationAssociatedstationStationId(userId, stationId);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#putUserStationAssociatedstationStationId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **stationId** | **String**| stationId | 
{: class="table-striped"}


### Return type

null (empty response body)


# **putUserStationDefaultstationStationId**


> Void putUserStationDefaultstationStationId(userId, stationId)

Set default station

Wraps PUT /api/v2/users/{userId}/station/defaultstation/{stationId}  

Requires ANY permissions: 

* telephony:plugin:all
* telephony:phone:assign

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
String stationId = "stationId_example"; // String | stationId
try {
    apiInstance.putUserStationDefaultstationStationId(userId, stationId);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#putUserStationDefaultstationStationId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **stationId** | **String**| stationId | 
{: class="table-striped"}


### Return type

null (empty response body)


# **putUserVerifier**


> [Verifier](Verifier) putUserVerifier(userId, verifierId, body)

Update a verifier

Wraps PUT /api/v2/users/{userId}/verifiers/{verifierId}  

Requires ANY permissions: 

* mfa:verifier:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
String verifierId = "verifierId_example"; // String | Verifier ID
UpdateVerifierRequest body = new UpdateVerifierRequest(); // UpdateVerifierRequest | Verifier Update
try {
    Verifier result = apiInstance.putUserVerifier(userId, verifierId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#putUserVerifier");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **verifierId** | **String**| Verifier ID | 
| **body** | [**UpdateVerifierRequest**](UpdateVerifierRequest)| Verifier Update | 
{: class="table-striped"}


### Return type

[**Verifier**](Verifier)


_com.mypurecloud.sdk.v2:platform-client-v2:212.0.0_
