---
title: RoutingApi
---
## RoutingApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteRoutingAssessment**](RoutingApi.html#deleteRoutingAssessment) | Delete single benefit assessment. |
| [**deleteRoutingEmailDomain**](RoutingApi.html#deleteRoutingEmailDomain) | Delete a domain |
| [**deleteRoutingEmailDomainRoute**](RoutingApi.html#deleteRoutingEmailDomainRoute) | Delete a route |
| [**deleteRoutingPredictor**](RoutingApi.html#deleteRoutingPredictor) | Delete single predictor. |
| [**deleteRoutingQueue**](RoutingApi.html#deleteRoutingQueue) | Delete a queue |
| [**deleteRoutingQueueMember**](RoutingApi.html#deleteRoutingQueueMember) | Delete a queue member. |
| [**deleteRoutingQueueUser**](RoutingApi.html#deleteRoutingQueueUser) | DEPRECATED: use DELETE /routing/queues/{queueId}/members/{memberId}.  Delete queue member. |
| [**deleteRoutingQueueWrapupcode**](RoutingApi.html#deleteRoutingQueueWrapupcode) | Delete a wrap-up code from a queue |
| [**deleteRoutingSettings**](RoutingApi.html#deleteRoutingSettings) | Delete an organization&#39;s routing settings |
| [**deleteRoutingSkill**](RoutingApi.html#deleteRoutingSkill) | Delete Routing Skill |
| [**deleteRoutingSmsAddress**](RoutingApi.html#deleteRoutingSmsAddress) | Delete an Address by Id for SMS |
| [**deleteRoutingSmsPhonenumber**](RoutingApi.html#deleteRoutingSmsPhonenumber) | Delete a phone number provisioned for SMS. |
| [**deleteRoutingUserUtilization**](RoutingApi.html#deleteRoutingUserUtilization) | Delete the user&#39;s max utilization settings and revert to the organization-wide default. |
| [**deleteRoutingUtilization**](RoutingApi.html#deleteRoutingUtilization) | Delete the organization-wide max utilization settings and revert to the system default. |
| [**deleteRoutingWrapupcode**](RoutingApi.html#deleteRoutingWrapupcode) | Delete wrap-up code |
| [**deleteUserRoutinglanguage**](RoutingApi.html#deleteUserRoutinglanguage) | Remove routing language from user |
| [**deleteUserRoutingskill**](RoutingApi.html#deleteUserRoutingskill) | Remove routing skill from user |
| [**getRoutingAssessment**](RoutingApi.html#getRoutingAssessment) | Retrieve a single benefit assessment. |
| [**getRoutingAssessments**](RoutingApi.html#getRoutingAssessments) | Retrieve all benefit assessments. |
| [**getRoutingAssessmentsJob**](RoutingApi.html#getRoutingAssessmentsJob) | Retrieve a single benefit assessments job. |
| [**getRoutingAssessmentsJobs**](RoutingApi.html#getRoutingAssessmentsJobs) | Retrieve all benefit assessment jobs. |
| [**getRoutingEmailDomain**](RoutingApi.html#getRoutingEmailDomain) | Get domain |
| [**getRoutingEmailDomainRoute**](RoutingApi.html#getRoutingEmailDomainRoute) | Get a route |
| [**getRoutingEmailDomainRoutes**](RoutingApi.html#getRoutingEmailDomainRoutes) | Get routes |
| [**getRoutingEmailDomains**](RoutingApi.html#getRoutingEmailDomains) | Get domains |
| [**getRoutingEmailSetup**](RoutingApi.html#getRoutingEmailSetup) | Get email setup |
| [**getRoutingLanguages**](RoutingApi.html#getRoutingLanguages) | Get the list of supported languages. |
| [**getRoutingMessageRecipient**](RoutingApi.html#getRoutingMessageRecipient) | Get a recipient |
| [**getRoutingMessageRecipients**](RoutingApi.html#getRoutingMessageRecipients) | Get recipients |
| [**getRoutingPredictor**](RoutingApi.html#getRoutingPredictor) | Retrieve a single predictor. |
| [**getRoutingPredictors**](RoutingApi.html#getRoutingPredictors) | Retrieve all predictors. |
| [**getRoutingPredictorsKeyperformanceindicators**](RoutingApi.html#getRoutingPredictorsKeyperformanceindicators) | Get a list of Key Performance Indicators available for the predictors. |
| [**getRoutingQueue**](RoutingApi.html#getRoutingQueue) | Get details about this queue. |
| [**getRoutingQueueComparisonperiod**](RoutingApi.html#getRoutingQueueComparisonperiod) | Get a Comparison Period. |
| [**getRoutingQueueComparisonperiods**](RoutingApi.html#getRoutingQueueComparisonperiods) | Get list of comparison periods |
| [**getRoutingQueueEstimatedwaittime**](RoutingApi.html#getRoutingQueueEstimatedwaittime) | Get Estimated Wait Time |
| [**getRoutingQueueMediatypeEstimatedwaittime**](RoutingApi.html#getRoutingQueueMediatypeEstimatedwaittime) | Get Estimated Wait Time |
| [**getRoutingQueueMembers**](RoutingApi.html#getRoutingQueueMembers) | Get the members of this queue. |
| [**getRoutingQueueUsers**](RoutingApi.html#getRoutingQueueUsers) | DEPRECATED: use GET /routing/queues/{queueId}/members.  Get the members of this queue. |
| [**getRoutingQueueWrapupcodes**](RoutingApi.html#getRoutingQueueWrapupcodes) | Get the wrap-up codes for a queue |
| [**getRoutingQueues**](RoutingApi.html#getRoutingQueues) | Get list of queues. |
| [**getRoutingQueuesDivisionviews**](RoutingApi.html#getRoutingQueuesDivisionviews) | Get a paged listing of simplified queue objects, filterable by name, queue ID(s), or division ID(s). |
| [**getRoutingQueuesDivisionviewsAll**](RoutingApi.html#getRoutingQueuesDivisionviewsAll) | Get a paged listing of simplified queue objects, sorted by name.  Can be used to get a digest of all queues in an organization. |
| [**getRoutingQueuesMe**](RoutingApi.html#getRoutingQueuesMe) | Get a paged listing of queues the user is a member of. |
| [**getRoutingSettings**](RoutingApi.html#getRoutingSettings) | Get an organization&#39;s routing settings |
| [**getRoutingSettingsContactcenter**](RoutingApi.html#getRoutingSettingsContactcenter) | Get Contact Center Settings |
| [**getRoutingSettingsTranscription**](RoutingApi.html#getRoutingSettingsTranscription) | Get Transcription Settings |
| [**getRoutingSkill**](RoutingApi.html#getRoutingSkill) | Get Routing Skill |
| [**getRoutingSkills**](RoutingApi.html#getRoutingSkills) | Get the list of routing skills. |
| [**getRoutingSmsAddress**](RoutingApi.html#getRoutingSmsAddress) | Get an Address by Id for SMS |
| [**getRoutingSmsAddresses**](RoutingApi.html#getRoutingSmsAddresses) | Get a list of Addresses for SMS |
| [**getRoutingSmsAvailablephonenumbers**](RoutingApi.html#getRoutingSmsAvailablephonenumbers) | Get a list of available phone numbers for SMS provisioning. |
| [**getRoutingSmsPhonenumber**](RoutingApi.html#getRoutingSmsPhonenumber) | Get a phone number provisioned for SMS. |
| [**getRoutingSmsPhonenumbers**](RoutingApi.html#getRoutingSmsPhonenumbers) | Get a list of provisioned phone numbers. |
| [**getRoutingUserUtilization**](RoutingApi.html#getRoutingUserUtilization) | Get the user&#39;s max utilization settings.  If not configured, the organization-wide default is returned. |
| [**getRoutingUtilization**](RoutingApi.html#getRoutingUtilization) | Get the organization-wide max utilization settings. |
| [**getRoutingWrapupcode**](RoutingApi.html#getRoutingWrapupcode) | Get details about this wrap-up code. |
| [**getRoutingWrapupcodes**](RoutingApi.html#getRoutingWrapupcodes) | Get list of wrapup codes. |
| [**getUserQueues**](RoutingApi.html#getUserQueues) | Get queues for user |
| [**getUserRoutinglanguages**](RoutingApi.html#getUserRoutinglanguages) | List routing language for user |
| [**getUserRoutingskills**](RoutingApi.html#getUserRoutingskills) | List routing skills for user |
| [**patchRoutingConversation**](RoutingApi.html#patchRoutingConversation) | Update attributes of an in-queue conversation |
| [**patchRoutingEmailDomain**](RoutingApi.html#patchRoutingEmailDomain) | Update domain settings |
| [**patchRoutingEmailDomainValidate**](RoutingApi.html#patchRoutingEmailDomainValidate) | Validate domain settings |
| [**patchRoutingPredictor**](RoutingApi.html#patchRoutingPredictor) | Update single predictor. |
| [**patchRoutingQueueMember**](RoutingApi.html#patchRoutingQueueMember) | Update the ring number OR joined status for a queue member. |
| [**patchRoutingQueueMembers**](RoutingApi.html#patchRoutingQueueMembers) | Join or unjoin a set of users for a queue |
| [**patchRoutingQueueUser**](RoutingApi.html#patchRoutingQueueUser) | DEPRECATED: use PATCH /routing/queues/{queueId}/members/{memberId}.  Update the ring number OR joined status for a User in a Queue. |
| [**patchRoutingQueueUsers**](RoutingApi.html#patchRoutingQueueUsers) | DEPRECATED: use PATCH /routing/queues/{queueId}/members.  Join or unjoin a set of users for a queue. |
| [**patchRoutingSettingsContactcenter**](RoutingApi.html#patchRoutingSettingsContactcenter) | Update Contact Center Settings |
| [**patchUserQueue**](RoutingApi.html#patchUserQueue) | Join or unjoin a queue for a user |
| [**patchUserQueues**](RoutingApi.html#patchUserQueues) | Join or unjoin a set of queues for a user |
| [**patchUserRoutinglanguage**](RoutingApi.html#patchUserRoutinglanguage) | Update routing language proficiency or state. |
| [**patchUserRoutinglanguagesBulk**](RoutingApi.html#patchUserRoutinglanguagesBulk) | Add bulk routing language to user. Max limit 50 languages |
| [**patchUserRoutingskillsBulk**](RoutingApi.html#patchUserRoutingskillsBulk) | Bulk add routing skills to user |
| [**postAnalyticsQueuesObservationsQuery**](RoutingApi.html#postAnalyticsQueuesObservationsQuery) | Query for queue observations |
| [**postRoutingAssessments**](RoutingApi.html#postRoutingAssessments) | Create a benefit assessment. |
| [**postRoutingAssessmentsJobs**](RoutingApi.html#postRoutingAssessmentsJobs) | Create a benefit assessment job. |
| [**postRoutingEmailDomainRoutes**](RoutingApi.html#postRoutingEmailDomainRoutes) | Create a route |
| [**postRoutingEmailDomainTestconnection**](RoutingApi.html#postRoutingEmailDomainTestconnection) | Tests the custom SMTP server integration connection set on this domain |
| [**postRoutingEmailDomains**](RoutingApi.html#postRoutingEmailDomains) | Create a domain |
| [**postRoutingLanguages**](RoutingApi.html#postRoutingLanguages) | Create Language |
| [**postRoutingPredictors**](RoutingApi.html#postRoutingPredictors) | Create a predictor. |
| [**postRoutingQueueMembers**](RoutingApi.html#postRoutingQueueMembers) | Bulk add or delete up to 100 queue members |
| [**postRoutingQueueUsers**](RoutingApi.html#postRoutingQueueUsers) | DEPRECATED: use POST /routing/queues/{queueId}/members.  Bulk add or delete up to 100 queue members. |
| [**postRoutingQueueWrapupcodes**](RoutingApi.html#postRoutingQueueWrapupcodes) | Add up to 100 wrap-up codes to a queue |
| [**postRoutingQueues**](RoutingApi.html#postRoutingQueues) | Create a queue |
| [**postRoutingSkills**](RoutingApi.html#postRoutingSkills) | Create Skill |
| [**postRoutingSmsAddresses**](RoutingApi.html#postRoutingSmsAddresses) | Provision an Address for SMS |
| [**postRoutingSmsPhonenumbers**](RoutingApi.html#postRoutingSmsPhonenumbers) | Provision a phone number for SMS |
| [**postRoutingWrapupcodes**](RoutingApi.html#postRoutingWrapupcodes) | Create a wrap-up code |
| [**postUserRoutinglanguages**](RoutingApi.html#postUserRoutinglanguages) | Add routing language to user |
| [**postUserRoutingskills**](RoutingApi.html#postUserRoutingskills) | Add routing skill to user |
| [**putRoutingEmailDomainRoute**](RoutingApi.html#putRoutingEmailDomainRoute) | Update a route |
| [**putRoutingMessageRecipient**](RoutingApi.html#putRoutingMessageRecipient) | Update a recipient |
| [**putRoutingQueue**](RoutingApi.html#putRoutingQueue) | Update a queue |
| [**putRoutingSettings**](RoutingApi.html#putRoutingSettings) | Update an organization&#39;s routing settings |
| [**putRoutingSettingsTranscription**](RoutingApi.html#putRoutingSettingsTranscription) | Update Transcription Settings |
| [**putRoutingSmsPhonenumber**](RoutingApi.html#putRoutingSmsPhonenumber) | Update a phone number provisioned for SMS. |
| [**putRoutingUserUtilization**](RoutingApi.html#putRoutingUserUtilization) | Update the user&#39;s max utilization settings.  Include only those media types requiring custom configuration. |
| [**putRoutingUtilization**](RoutingApi.html#putRoutingUtilization) | Update the organization-wide max utilization settings.  Include only those media types requiring custom configuration. |
| [**putRoutingWrapupcode**](RoutingApi.html#putRoutingWrapupcode) | Update wrap-up code |
| [**putUserRoutingskill**](RoutingApi.html#putUserRoutingskill) | Update routing skill proficiency or state. |
| [**putUserRoutingskillsBulk**](RoutingApi.html#putUserRoutingskillsBulk) | Replace all routing skills assigned to a user |
{: class="table-striped"}

<a name="deleteRoutingAssessment"></a>

# **deleteRoutingAssessment**



> Void deleteRoutingAssessment(assessmentId)

Delete single benefit assessment.



Wraps DELETE /api/v2/routing/assessments/{assessmentId}  

Requires ANY permissions: 

* routing:assessment:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String assessmentId = "assessmentId_example"; // String | Benefit Assessment ID
try {
    apiInstance.deleteRoutingAssessment(assessmentId);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteRoutingAssessment");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **assessmentId** | **String**| Benefit Assessment ID | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteRoutingEmailDomain"></a>

# **deleteRoutingEmailDomain**



> Void deleteRoutingEmailDomain(domainId)

Delete a domain



Wraps DELETE /api/v2/routing/email/domains/{domainId}  

Requires ALL permissions: 

* routing:email:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String domainId = "domainId_example"; // String | domain ID
try {
    apiInstance.deleteRoutingEmailDomain(domainId);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteRoutingEmailDomain");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **domainId** | **String**| domain ID | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteRoutingEmailDomainRoute"></a>

# **deleteRoutingEmailDomainRoute**



> Void deleteRoutingEmailDomainRoute(domainName, routeId)

Delete a route



Wraps DELETE /api/v2/routing/email/domains/{domainName}/routes/{routeId}  

Requires ALL permissions: 

* routing:email:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String domainName = "domainName_example"; // String | email domain
String routeId = "routeId_example"; // String | route ID
try {
    apiInstance.deleteRoutingEmailDomainRoute(domainName, routeId);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteRoutingEmailDomainRoute");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **domainName** | **String**| email domain | 
| **routeId** | **String**| route ID | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteRoutingPredictor"></a>

# **deleteRoutingPredictor**



> Void deleteRoutingPredictor(predictorId)

Delete single predictor.



Wraps DELETE /api/v2/routing/predictors/{predictorId}  

Requires ALL permissions: 

* routing:predictor:delete
* routing:queue:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String predictorId = "predictorId_example"; // String | Predictor ID
try {
    apiInstance.deleteRoutingPredictor(predictorId);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteRoutingPredictor");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **predictorId** | **String**| Predictor ID | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteRoutingQueue"></a>

# **deleteRoutingQueue**



> Void deleteRoutingQueue(queueId, forceDelete)

Delete a queue



Wraps DELETE /api/v2/routing/queues/{queueId}  

Requires ALL permissions: 

* routing:queue:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
Boolean forceDelete = true; // Boolean | forceDelete
try {
    apiInstance.deleteRoutingQueue(queueId, forceDelete);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteRoutingQueue");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **queueId** | **String**| Queue ID | 
| **forceDelete** | **Boolean**| forceDelete | [optional] 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteRoutingQueueMember"></a>

# **deleteRoutingQueueMember**



> Void deleteRoutingQueueMember(queueId, memberId)

Delete a queue member.



Wraps DELETE /api/v2/routing/queues/{queueId}/members/{memberId}  

Requires ANY permissions: 

* routing:queue:edit
* routing:queueMember:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
String memberId = "memberId_example"; // String | Member ID
try {
    apiInstance.deleteRoutingQueueMember(queueId, memberId);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteRoutingQueueMember");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **queueId** | **String**| Queue ID | 
| **memberId** | **String**| Member ID | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteRoutingQueueUser"></a>

# **deleteRoutingQueueUser**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> Void deleteRoutingQueueUser(queueId, memberId)

DEPRECATED: use DELETE /routing/queues/{queueId}/members/{memberId}.  Delete queue member.



Wraps DELETE /api/v2/routing/queues/{queueId}/users/{memberId}  

Requires ANY permissions: 

* routing:queue:edit
* routing:queueMember:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
String memberId = "memberId_example"; // String | Member ID
try {
    apiInstance.deleteRoutingQueueUser(queueId, memberId);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteRoutingQueueUser");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **queueId** | **String**| Queue ID | 
| **memberId** | **String**| Member ID | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteRoutingQueueWrapupcode"></a>

# **deleteRoutingQueueWrapupcode**



> Void deleteRoutingQueueWrapupcode(queueId, codeId)

Delete a wrap-up code from a queue



Wraps DELETE /api/v2/routing/queues/{queueId}/wrapupcodes/{codeId}  

Requires ALL permissions: 

* routing:queue:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
String codeId = "codeId_example"; // String | Code ID
try {
    apiInstance.deleteRoutingQueueWrapupcode(queueId, codeId);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteRoutingQueueWrapupcode");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **queueId** | **String**| Queue ID | 
| **codeId** | **String**| Code ID | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteRoutingSettings"></a>

# **deleteRoutingSettings**



> Void deleteRoutingSettings()

Delete an organization&#39;s routing settings



Wraps DELETE /api/v2/routing/settings  

Requires ANY permissions: 

* routing:settings:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
try {
    apiInstance.deleteRoutingSettings();
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteRoutingSettings");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

null (empty response body)

<a name="deleteRoutingSkill"></a>

# **deleteRoutingSkill**



> Void deleteRoutingSkill(skillId)

Delete Routing Skill



Wraps DELETE /api/v2/routing/skills/{skillId}  

Requires ALL permissions: 

* routing:skill:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String skillId = "skillId_example"; // String | Skill ID
try {
    apiInstance.deleteRoutingSkill(skillId);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteRoutingSkill");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **skillId** | **String**| Skill ID | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteRoutingSmsAddress"></a>

# **deleteRoutingSmsAddress**



> Void deleteRoutingSmsAddress(addressId)

Delete an Address by Id for SMS



Wraps DELETE /api/v2/routing/sms/addresses/{addressId}  

Requires ALL permissions: 

* sms:phoneNumber:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String addressId = "addressId_example"; // String | Address ID
try {
    apiInstance.deleteRoutingSmsAddress(addressId);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteRoutingSmsAddress");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **addressId** | **String**| Address ID | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteRoutingSmsPhonenumber"></a>

# **deleteRoutingSmsPhonenumber**



> Void deleteRoutingSmsPhonenumber(addressId, async)

Delete a phone number provisioned for SMS.



Wraps DELETE /api/v2/routing/sms/phonenumbers/{addressId}  

Requires ALL permissions: 

* sms:phoneNumber:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String addressId = "addressId_example"; // String | Address ID
Boolean async = false; // Boolean | Delete a phone number for SMS in an asynchronous manner. If the async parameter value is true, this initiates the deletion of a provisioned phone number. 
try {
    apiInstance.deleteRoutingSmsPhonenumber(addressId, async);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteRoutingSmsPhonenumber");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **addressId** | **String**| Address ID | 
| **async** | **Boolean**| Delete a phone number for SMS in an asynchronous manner. If the async parameter value is true, this initiates the deletion of a provisioned phone number.  | [optional] [default to false] 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteRoutingUserUtilization"></a>

# **deleteRoutingUserUtilization**



> Void deleteRoutingUserUtilization(userId)

Delete the user&#39;s max utilization settings and revert to the organization-wide default.



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
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String userId = "userId_example"; // String | User ID
try {
    apiInstance.deleteRoutingUserUtilization(userId);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteRoutingUserUtilization");
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

<a name="deleteRoutingUtilization"></a>

# **deleteRoutingUtilization**



> Void deleteRoutingUtilization()

Delete the organization-wide max utilization settings and revert to the system default.



Wraps DELETE /api/v2/routing/utilization  

Requires ALL permissions: 

* routing:utilization:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
try {
    apiInstance.deleteRoutingUtilization();
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteRoutingUtilization");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

null (empty response body)

<a name="deleteRoutingWrapupcode"></a>

# **deleteRoutingWrapupcode**



> Void deleteRoutingWrapupcode(codeId)

Delete wrap-up code



Wraps DELETE /api/v2/routing/wrapupcodes/{codeId}  

Requires ALL permissions: 

* routing:wrapupCode:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String codeId = "codeId_example"; // String | Wrapup Code ID
try {
    apiInstance.deleteRoutingWrapupcode(codeId);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteRoutingWrapupcode");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **codeId** | **String**| Wrapup Code ID | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteUserRoutinglanguage"></a>

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
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String userId = "userId_example"; // String | User ID
String languageId = "languageId_example"; // String | languageId
try {
    apiInstance.deleteUserRoutinglanguage(userId, languageId);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteUserRoutinglanguage");
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

<a name="deleteUserRoutingskill"></a>

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
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String userId = "userId_example"; // String | User ID
String skillId = "skillId_example"; // String | skillId
try {
    apiInstance.deleteUserRoutingskill(userId, skillId);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteUserRoutingskill");
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

<a name="getRoutingAssessment"></a>

# **getRoutingAssessment**



> [BenefitAssessment](BenefitAssessment.html) getRoutingAssessment(assessmentId)

Retrieve a single benefit assessment.



Wraps GET /api/v2/routing/assessments/{assessmentId}  

Requires ANY permissions: 

* routing:assessment:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String assessmentId = "assessmentId_example"; // String | Benefit Assessment ID
try {
    BenefitAssessment result = apiInstance.getRoutingAssessment(assessmentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingAssessment");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **assessmentId** | **String**| Benefit Assessment ID | 
{: class="table-striped"}


### Return type

[**BenefitAssessment**](BenefitAssessment.html)

<a name="getRoutingAssessments"></a>

# **getRoutingAssessments**



> [AssessmentListing](AssessmentListing.html) getRoutingAssessments(before, after, limit, pageSize, queueId)

Retrieve all benefit assessments.



Wraps GET /api/v2/routing/assessments  

Requires ANY permissions: 

* routing:queue:view
* routing:assessment:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String before = "before_example"; // String | The cursor that points to the start of the set of entities that has been returned.
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned.
String limit = "limit_example"; // String | Number of entities to return. Maximum of 200. Deprecated in favour of pageSize, use CursorQueryParameters instead.
String pageSize = "pageSize_example"; // String | Number of entities to return. Maximum of 200.
List<String> queueId = Arrays.asList("queueId_example"); // List<String> | Queue ID(s) to filter assessments by.
try {
    AssessmentListing result = apiInstance.getRoutingAssessments(before, after, limit, pageSize, queueId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingAssessments");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **before** | **String**| The cursor that points to the start of the set of entities that has been returned. | [optional] 
| **after** | **String**| The cursor that points to the end of the set of entities that has been returned. | [optional] 
| **limit** | **String**| Number of entities to return. Maximum of 200. Deprecated in favour of pageSize, use CursorQueryParameters instead. | [optional] 
| **pageSize** | **String**| Number of entities to return. Maximum of 200. | [optional] 
| **queueId** | [**List&lt;String&gt;**](String.html)| Queue ID(s) to filter assessments by. | [optional] 
{: class="table-striped"}


### Return type

[**AssessmentListing**](AssessmentListing.html)

<a name="getRoutingAssessmentsJob"></a>

# **getRoutingAssessmentsJob**



> [BenefitAssessmentJob](BenefitAssessmentJob.html) getRoutingAssessmentsJob(jobId)

Retrieve a single benefit assessments job.



Wraps GET /api/v2/routing/assessments/jobs/{jobId}  

Requires ANY permissions: 

* routing:assessment:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String jobId = "jobId_example"; // String | Benefit Assessment Job ID
try {
    BenefitAssessmentJob result = apiInstance.getRoutingAssessmentsJob(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingAssessmentsJob");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobId** | **String**| Benefit Assessment Job ID | 
{: class="table-striped"}


### Return type

[**BenefitAssessmentJob**](BenefitAssessmentJob.html)

<a name="getRoutingAssessmentsJobs"></a>

# **getRoutingAssessmentsJobs**



> [AssessmentJobListing](AssessmentJobListing.html) getRoutingAssessmentsJobs(divisionId)

Retrieve all benefit assessment jobs.



Wraps GET /api/v2/routing/assessments/jobs  

Requires ANY permissions: 

* routing:queue:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
List<String> divisionId = Arrays.asList("divisionId_example"); // List<String> | Division ID(s) to filter assessment jobs by.
try {
    AssessmentJobListing result = apiInstance.getRoutingAssessmentsJobs(divisionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingAssessmentsJobs");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **divisionId** | [**List&lt;String&gt;**](String.html)| Division ID(s) to filter assessment jobs by. | [optional] 
{: class="table-striped"}


### Return type

[**AssessmentJobListing**](AssessmentJobListing.html)

<a name="getRoutingEmailDomain"></a>

# **getRoutingEmailDomain**



> [InboundDomain](InboundDomain.html) getRoutingEmailDomain(domainId)

Get domain



Wraps GET /api/v2/routing/email/domains/{domainId}  

Requires ALL permissions: 

* routing:email:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String domainId = "domainId_example"; // String | domain ID
try {
    InboundDomain result = apiInstance.getRoutingEmailDomain(domainId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingEmailDomain");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **domainId** | **String**| domain ID | 
{: class="table-striped"}


### Return type

[**InboundDomain**](InboundDomain.html)

<a name="getRoutingEmailDomainRoute"></a>

# **getRoutingEmailDomainRoute**



> [InboundRoute](InboundRoute.html) getRoutingEmailDomainRoute(domainName, routeId)

Get a route



Wraps GET /api/v2/routing/email/domains/{domainName}/routes/{routeId}  

Requires ALL permissions: 

* routing:email:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String domainName = "domainName_example"; // String | email domain
String routeId = "routeId_example"; // String | route ID
try {
    InboundRoute result = apiInstance.getRoutingEmailDomainRoute(domainName, routeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingEmailDomainRoute");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **domainName** | **String**| email domain | 
| **routeId** | **String**| route ID | 
{: class="table-striped"}


### Return type

[**InboundRoute**](InboundRoute.html)

<a name="getRoutingEmailDomainRoutes"></a>

# **getRoutingEmailDomainRoutes**



> [InboundRouteEntityListing](InboundRouteEntityListing.html) getRoutingEmailDomainRoutes(domainName, pageSize, pageNumber, pattern)

Get routes



Wraps GET /api/v2/routing/email/domains/{domainName}/routes  

Requires ALL permissions: 

* routing:email:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String domainName = "domainName_example"; // String | email domain
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String pattern = "pattern_example"; // String | Filter routes by the route's pattern property
try {
    InboundRouteEntityListing result = apiInstance.getRoutingEmailDomainRoutes(domainName, pageSize, pageNumber, pattern);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingEmailDomainRoutes");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **domainName** | **String**| email domain | 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pattern** | **String**| Filter routes by the route&#39;s pattern property | [optional] 
{: class="table-striped"}


### Return type

[**InboundRouteEntityListing**](InboundRouteEntityListing.html)

<a name="getRoutingEmailDomains"></a>

# **getRoutingEmailDomains**



> [InboundDomainEntityListing](InboundDomainEntityListing.html) getRoutingEmailDomains()

Get domains



Wraps GET /api/v2/routing/email/domains  

Requires ALL permissions: 

* routing:email:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
try {
    InboundDomainEntityListing result = apiInstance.getRoutingEmailDomains();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingEmailDomains");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**InboundDomainEntityListing**](InboundDomainEntityListing.html)

<a name="getRoutingEmailSetup"></a>

# **getRoutingEmailSetup**



> [EmailSetup](EmailSetup.html) getRoutingEmailSetup()

Get email setup



Wraps GET /api/v2/routing/email/setup  

Requires ALL permissions: 

* routing:email:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
try {
    EmailSetup result = apiInstance.getRoutingEmailSetup();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingEmailSetup");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**EmailSetup**](EmailSetup.html)

<a name="getRoutingLanguages"></a>

# **getRoutingLanguages**



> [LanguageEntityListing](LanguageEntityListing.html) getRoutingLanguages(pageSize, pageNumber, sortOrder, name, id)

Get the list of supported languages.



Wraps GET /api/v2/routing/languages  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortOrder = "ASC"; // String | Ascending or descending sort order
String name = "name_example"; // String | Name
List<String> id = Arrays.asList("id_example"); // List<String> | id
try {
    LanguageEntityListing result = apiInstance.getRoutingLanguages(pageSize, pageNumber, sortOrder, name, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingLanguages");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **sortOrder** | **String**| Ascending or descending sort order | [optional] [default to ASC]<br />**Values**: ascending, descending 
| **name** | **String**| Name | [optional] 
| **id** | [**List&lt;String&gt;**](String.html)| id | [optional] 
{: class="table-striped"}


### Return type

[**LanguageEntityListing**](LanguageEntityListing.html)

<a name="getRoutingMessageRecipient"></a>

# **getRoutingMessageRecipient**



> [Recipient](Recipient.html) getRoutingMessageRecipient(recipientId)

Get a recipient



Wraps GET /api/v2/routing/message/recipients/{recipientId}  

Requires ALL permissions: 

* routing:message:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String recipientId = "recipientId_example"; // String | Recipient ID
try {
    Recipient result = apiInstance.getRoutingMessageRecipient(recipientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingMessageRecipient");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **recipientId** | **String**| Recipient ID | 
{: class="table-striped"}


### Return type

[**Recipient**](Recipient.html)

<a name="getRoutingMessageRecipients"></a>

# **getRoutingMessageRecipients**



> [RecipientListing](RecipientListing.html) getRoutingMessageRecipients(messengerType, pageSize, pageNumber)

Get recipients



Wraps GET /api/v2/routing/message/recipients  

Requires ALL permissions: 

* routing:message:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String messengerType = "messengerType_example"; // String | Messenger Type
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    RecipientListing result = apiInstance.getRoutingMessageRecipients(messengerType, pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingMessageRecipients");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **messengerType** | **String**| Messenger Type | [optional]<br />**Values**: sms, facebook, twitter, line, whatsapp, open, instagram 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
{: class="table-striped"}


### Return type

[**RecipientListing**](RecipientListing.html)

<a name="getRoutingPredictor"></a>

# **getRoutingPredictor**



> [Predictor](Predictor.html) getRoutingPredictor(predictorId)

Retrieve a single predictor.



Wraps GET /api/v2/routing/predictors/{predictorId}  

Requires ANY permissions: 

* routing:predictor:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String predictorId = "predictorId_example"; // String | Predictor ID
try {
    Predictor result = apiInstance.getRoutingPredictor(predictorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingPredictor");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **predictorId** | **String**| Predictor ID | 
{: class="table-striped"}


### Return type

[**Predictor**](Predictor.html)

<a name="getRoutingPredictors"></a>

# **getRoutingPredictors**



> [PredictorListing](PredictorListing.html) getRoutingPredictors(before, after, limit, pageSize, queueId)

Retrieve all predictors.



Wraps GET /api/v2/routing/predictors  

Requires ANY permissions: 

* routing:predictor:view
* routing:queue:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String before = "before_example"; // String | The cursor that points to the start of the set of entities that has been returned.
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned.
String limit = "limit_example"; // String | Number of entities to return. Maximum of 200. Deprecated in favour of pageSize, use CursorQueryParameters instead.
String pageSize = "pageSize_example"; // String | Number of entities to return. Maximum of 200.
List<String> queueId = Arrays.asList("queueId_example"); // List<String> | Comma-separated list of queue Ids to filter by.
try {
    PredictorListing result = apiInstance.getRoutingPredictors(before, after, limit, pageSize, queueId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingPredictors");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **before** | **String**| The cursor that points to the start of the set of entities that has been returned. | [optional] 
| **after** | **String**| The cursor that points to the end of the set of entities that has been returned. | [optional] 
| **limit** | **String**| Number of entities to return. Maximum of 200. Deprecated in favour of pageSize, use CursorQueryParameters instead. | [optional] 
| **pageSize** | **String**| Number of entities to return. Maximum of 200. | [optional] 
| **queueId** | [**List&lt;String&gt;**](String.html)| Comma-separated list of queue Ids to filter by. | [optional] 
{: class="table-striped"}


### Return type

[**PredictorListing**](PredictorListing.html)

<a name="getRoutingPredictorsKeyperformanceindicators"></a>

# **getRoutingPredictorsKeyperformanceindicators**



> [List&lt;KeyPerformanceIndicator&gt;](KeyPerformanceIndicator.html) getRoutingPredictorsKeyperformanceindicators()

Get a list of Key Performance Indicators available for the predictors.



Wraps GET /api/v2/routing/predictors/keyperformanceindicators  

Requires ANY permissions: 

* routing:keyPerformanceIndicator:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
try {
    List<KeyPerformanceIndicator> result = apiInstance.getRoutingPredictorsKeyperformanceindicators();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingPredictorsKeyperformanceindicators");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**List&lt;KeyPerformanceIndicator&gt;**](KeyPerformanceIndicator.html)

<a name="getRoutingQueue"></a>

# **getRoutingQueue**



> [Queue](Queue.html) getRoutingQueue(queueId)

Get details about this queue.



Wraps GET /api/v2/routing/queues/{queueId}  

Requires ALL permissions: 

* routing:queue:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
try {
    Queue result = apiInstance.getRoutingQueue(queueId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingQueue");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **queueId** | **String**| Queue ID | 
{: class="table-striped"}


### Return type

[**Queue**](Queue.html)

<a name="getRoutingQueueComparisonperiod"></a>

# **getRoutingQueueComparisonperiod**



> [ComparisonPeriod](ComparisonPeriod.html) getRoutingQueueComparisonperiod(queueId, comparisonPeriodId)

Get a Comparison Period.



Wraps GET /api/v2/routing/queues/{queueId}/comparisonperiods/{comparisonPeriodId}  

Requires ALL permissions: 

* routing:comparisonPeriod:view
* routing:queue:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue id
String comparisonPeriodId = "comparisonPeriodId_example"; // String | ComparisonPeriod id
try {
    ComparisonPeriod result = apiInstance.getRoutingQueueComparisonperiod(queueId, comparisonPeriodId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingQueueComparisonperiod");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **queueId** | **String**| Queue id | 
| **comparisonPeriodId** | **String**| ComparisonPeriod id | 
{: class="table-striped"}


### Return type

[**ComparisonPeriod**](ComparisonPeriod.html)

<a name="getRoutingQueueComparisonperiods"></a>

# **getRoutingQueueComparisonperiods**



> [ComparisonPeriodListing](ComparisonPeriodListing.html) getRoutingQueueComparisonperiods(queueId)

Get list of comparison periods



Wraps GET /api/v2/routing/queues/{queueId}/comparisonperiods  

Requires ALL permissions: 

* routing:comparisonPeriod:view
* routing:queue:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue id
try {
    ComparisonPeriodListing result = apiInstance.getRoutingQueueComparisonperiods(queueId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingQueueComparisonperiods");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **queueId** | **String**| Queue id | 
{: class="table-striped"}


### Return type

[**ComparisonPeriodListing**](ComparisonPeriodListing.html)

<a name="getRoutingQueueEstimatedwaittime"></a>

# **getRoutingQueueEstimatedwaittime**



> [EstimatedWaitTimePredictions](EstimatedWaitTimePredictions.html) getRoutingQueueEstimatedwaittime(queueId, conversationId)

Get Estimated Wait Time



Wraps GET /api/v2/routing/queues/{queueId}/estimatedwaittime  

Requires ALL permissions: 

* routing:queue:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | queueId
String conversationId = "conversationId_example"; // String | conversationId
try {
    EstimatedWaitTimePredictions result = apiInstance.getRoutingQueueEstimatedwaittime(queueId, conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingQueueEstimatedwaittime");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **queueId** | **String**| queueId | 
| **conversationId** | **String**| conversationId | [optional] 
{: class="table-striped"}


### Return type

[**EstimatedWaitTimePredictions**](EstimatedWaitTimePredictions.html)

<a name="getRoutingQueueMediatypeEstimatedwaittime"></a>

# **getRoutingQueueMediatypeEstimatedwaittime**



> [EstimatedWaitTimePredictions](EstimatedWaitTimePredictions.html) getRoutingQueueMediatypeEstimatedwaittime(queueId, mediaType)

Get Estimated Wait Time



Wraps GET /api/v2/routing/queues/{queueId}/mediatypes/{mediaType}/estimatedwaittime  

Requires ALL permissions: 

* routing:queue:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | queueId
String mediaType = "mediaType_example"; // String | mediaType
try {
    EstimatedWaitTimePredictions result = apiInstance.getRoutingQueueMediatypeEstimatedwaittime(queueId, mediaType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingQueueMediatypeEstimatedwaittime");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **queueId** | **String**| queueId | 
| **mediaType** | **String**| mediaType | 
{: class="table-striped"}


### Return type

[**EstimatedWaitTimePredictions**](EstimatedWaitTimePredictions.html)

<a name="getRoutingQueueMembers"></a>

# **getRoutingQueueMembers**



> [QueueMemberEntityListing](QueueMemberEntityListing.html) getRoutingQueueMembers(queueId, pageNumber, pageSize, sortOrder, expand, name, profileSkills, skills, languages, routingStatus, presence, memberBy, joined)

Get the members of this queue.



Wraps GET /api/v2/routing/queues/{queueId}/members  

Requires ANY permissions: 

* routing:queue:view
* routing:queue:edit
* routing:queue:readonly
* routing:queueMember:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
Integer pageNumber = 1; // Integer | 
Integer pageSize = 25; // Integer | Max value is 100
String sortOrder = "asc"; // String | Note: results are sorted by name.
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand.
String name = "name_example"; // String | Filter by queue member name
List<String> profileSkills = Arrays.asList("profileSkills_example"); // List<String> | Filter by profile skill
List<String> skills = Arrays.asList("skills_example"); // List<String> | Filter by skill
List<String> languages = Arrays.asList("languages_example"); // List<String> | Filter by language
List<String> routingStatus = Arrays.asList("routingStatus_example"); // List<String> | Filter by routing status
List<String> presence = Arrays.asList("presence_example"); // List<String> | Filter by presence
String memberBy = "memberBy_example"; // String | Filter by member type
Boolean joined = true; // Boolean | Filter by joined status
try {
    QueueMemberEntityListing result = apiInstance.getRoutingQueueMembers(queueId, pageNumber, pageSize, sortOrder, expand, name, profileSkills, skills, languages, routingStatus, presence, memberBy, joined);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingQueueMembers");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **queueId** | **String**| Queue ID | 
| **pageNumber** | **Integer**|  | [optional] [default to 1] 
| **pageSize** | **Integer**| Max value is 100 | [optional] [default to 25] 
| **sortOrder** | **String**| Note: results are sorted by name. | [optional] [default to asc]<br />**Values**: asc, desc 
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand. | [optional]<br />**Values**: routingStatus, presence, conversationSummary, outOfOffice, geolocation, station, authorization, lasttokenissued, dateLastLogin, authorization.unusedRoles, team, profileSkills, certifications, locations, groups, skills, languages, languagePreference, employerInfo, biography 
| **name** | **String**| Filter by queue member name | [optional] 
| **profileSkills** | [**List&lt;String&gt;**](String.html)| Filter by profile skill | [optional] 
| **skills** | [**List&lt;String&gt;**](String.html)| Filter by skill | [optional] 
| **languages** | [**List&lt;String&gt;**](String.html)| Filter by language | [optional] 
| **routingStatus** | [**List&lt;String&gt;**](String.html)| Filter by routing status | [optional] 
| **presence** | [**List&lt;String&gt;**](String.html)| Filter by presence | [optional] 
| **memberBy** | **String**| Filter by member type | [optional]<br />**Values**: user, group 
| **joined** | **Boolean**| Filter by joined status | [optional] 
{: class="table-striped"}


### Return type

[**QueueMemberEntityListing**](QueueMemberEntityListing.html)

<a name="getRoutingQueueUsers"></a>

# **getRoutingQueueUsers**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [QueueMemberEntityListingV1](QueueMemberEntityListingV1.html) getRoutingQueueUsers(queueId, pageNumber, pageSize, sortOrder, expand, joined, name, profileSkills, skills, languages, routingStatus, presence)

DEPRECATED: use GET /routing/queues/{queueId}/members.  Get the members of this queue.



Wraps GET /api/v2/routing/queues/{queueId}/users  

Requires ANY permissions: 

* routing:queue:view
* routing:queueMember:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
Integer pageNumber = 1; // Integer | 
Integer pageSize = 25; // Integer | Max value is 100
String sortOrder = "asc"; // String | Note: results are sorted by name.
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand.
Boolean joined = true; // Boolean | Filter by joined status
String name = "name_example"; // String | Filter by queue member name
List<String> profileSkills = Arrays.asList("profileSkills_example"); // List<String> | Filter by profile skill
List<String> skills = Arrays.asList("skills_example"); // List<String> | Filter by skill
List<String> languages = Arrays.asList("languages_example"); // List<String> | Filter by language
List<String> routingStatus = Arrays.asList("routingStatus_example"); // List<String> | Filter by routing status
List<String> presence = Arrays.asList("presence_example"); // List<String> | Filter by presence
try {
    QueueMemberEntityListingV1 result = apiInstance.getRoutingQueueUsers(queueId, pageNumber, pageSize, sortOrder, expand, joined, name, profileSkills, skills, languages, routingStatus, presence);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingQueueUsers");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **queueId** | **String**| Queue ID | 
| **pageNumber** | **Integer**|  | [optional] [default to 1] 
| **pageSize** | **Integer**| Max value is 100 | [optional] [default to 25] 
| **sortOrder** | **String**| Note: results are sorted by name. | [optional] [default to asc]<br />**Values**: asc, desc 
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand. | [optional]<br />**Values**: routingStatus, presence, conversationSummary, outOfOffice, geolocation, station, authorization, lasttokenissued, dateLastLogin, authorization.unusedRoles, team, profileSkills, certifications, locations, groups, skills, languages, languagePreference, employerInfo, biography 
| **joined** | **Boolean**| Filter by joined status | [optional] 
| **name** | **String**| Filter by queue member name | [optional] 
| **profileSkills** | [**List&lt;String&gt;**](String.html)| Filter by profile skill | [optional] 
| **skills** | [**List&lt;String&gt;**](String.html)| Filter by skill | [optional] 
| **languages** | [**List&lt;String&gt;**](String.html)| Filter by language | [optional] 
| **routingStatus** | [**List&lt;String&gt;**](String.html)| Filter by routing status | [optional] 
| **presence** | [**List&lt;String&gt;**](String.html)| Filter by presence | [optional] 
{: class="table-striped"}


### Return type

[**QueueMemberEntityListingV1**](QueueMemberEntityListingV1.html)

<a name="getRoutingQueueWrapupcodes"></a>

# **getRoutingQueueWrapupcodes**



> [WrapupCodeEntityListing](WrapupCodeEntityListing.html) getRoutingQueueWrapupcodes(queueId, pageSize, pageNumber)

Get the wrap-up codes for a queue



Wraps GET /api/v2/routing/queues/{queueId}/wrapupcodes  

Requires ALL permissions: 

* routing:queue:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    WrapupCodeEntityListing result = apiInstance.getRoutingQueueWrapupcodes(queueId, pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingQueueWrapupcodes");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **queueId** | **String**| Queue ID | 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
{: class="table-striped"}


### Return type

[**WrapupCodeEntityListing**](WrapupCodeEntityListing.html)

<a name="getRoutingQueues"></a>

# **getRoutingQueues**



> [QueueEntityListing](QueueEntityListing.html) getRoutingQueues(pageNumber, pageSize, sortOrder, name, id, divisionId)

Get list of queues.



Wraps GET /api/v2/routing/queues  

Requires ANY permissions: 

* routing:queue:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortOrder = "asc"; // String | Note: results are sorted by name.
String name = "name_example"; // String | Filter by queue name
List<String> id = Arrays.asList("id_example"); // List<String> | Filter by queue ID(s)
List<String> divisionId = Arrays.asList("divisionId_example"); // List<String> | Filter by queue division ID(s)
try {
    QueueEntityListing result = apiInstance.getRoutingQueues(pageNumber, pageSize, sortOrder, name, id, divisionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingQueues");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **sortOrder** | **String**| Note: results are sorted by name. | [optional] [default to asc]<br />**Values**: asc, desc 
| **name** | **String**| Filter by queue name | [optional] 
| **id** | [**List&lt;String&gt;**](String.html)| Filter by queue ID(s) | [optional] 
| **divisionId** | [**List&lt;String&gt;**](String.html)| Filter by queue division ID(s) | [optional] 
{: class="table-striped"}


### Return type

[**QueueEntityListing**](QueueEntityListing.html)

<a name="getRoutingQueuesDivisionviews"></a>

# **getRoutingQueuesDivisionviews**



> [QueueEntityListing](QueueEntityListing.html) getRoutingQueuesDivisionviews(pageSize, pageNumber, sortBy, sortOrder, name, id, divisionId)

Get a paged listing of simplified queue objects, filterable by name, queue ID(s), or division ID(s).



Wraps GET /api/v2/routing/queues/divisionviews  

Requires ALL permissions: 

* routing:queue:search

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
Integer pageSize = 25; // Integer | Page size [max value is 100]
Integer pageNumber = 1; // Integer | Page number [max value is 5]
String sortBy = "name"; // String | Sort by
String sortOrder = "asc"; // String | Sort order
String name = "name_example"; // String | Name
List<String> id = Arrays.asList("id_example"); // List<String> | Queue ID(s)
List<String> divisionId = Arrays.asList("divisionId_example"); // List<String> | Division ID(s)
try {
    QueueEntityListing result = apiInstance.getRoutingQueuesDivisionviews(pageSize, pageNumber, sortBy, sortOrder, name, id, divisionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingQueuesDivisionviews");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size [max value is 100] | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number [max value is 5] | [optional] [default to 1] 
| **sortBy** | **String**| Sort by | [optional] [default to name]<br />**Values**: name, id, divisionId 
| **sortOrder** | **String**| Sort order | [optional] [default to asc]<br />**Values**: asc, desc 
| **name** | **String**| Name | [optional] 
| **id** | [**List&lt;String&gt;**](String.html)| Queue ID(s) | [optional] 
| **divisionId** | [**List&lt;String&gt;**](String.html)| Division ID(s) | [optional] 
{: class="table-striped"}


### Return type

[**QueueEntityListing**](QueueEntityListing.html)

<a name="getRoutingQueuesDivisionviewsAll"></a>

# **getRoutingQueuesDivisionviewsAll**



> [QueueEntityListing](QueueEntityListing.html) getRoutingQueuesDivisionviewsAll(pageSize, pageNumber, sortOrder)

Get a paged listing of simplified queue objects, sorted by name.  Can be used to get a digest of all queues in an organization.



Wraps GET /api/v2/routing/queues/divisionviews/all  

Requires ALL permissions: 

* routing:queue:search

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
Integer pageSize = 25; // Integer | Page size [max value is 500]
Integer pageNumber = 1; // Integer | Page number
String sortOrder = "asc"; // String | Sort order
try {
    QueueEntityListing result = apiInstance.getRoutingQueuesDivisionviewsAll(pageSize, pageNumber, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingQueuesDivisionviewsAll");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size [max value is 500] | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **sortOrder** | **String**| Sort order | [optional] [default to asc]<br />**Values**: asc, desc 
{: class="table-striped"}


### Return type

[**QueueEntityListing**](QueueEntityListing.html)

<a name="getRoutingQueuesMe"></a>

# **getRoutingQueuesMe**



> [UserQueueEntityListing](UserQueueEntityListing.html) getRoutingQueuesMe(pageNumber, pageSize, joined, sortOrder)

Get a paged listing of queues the user is a member of.



Wraps GET /api/v2/routing/queues/me  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
Boolean joined = true; // Boolean | Filter by joined status.
String sortOrder = "asc"; // String | Note: results are sorted by name.
try {
    UserQueueEntityListing result = apiInstance.getRoutingQueuesMe(pageNumber, pageSize, joined, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingQueuesMe");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **joined** | **Boolean**| Filter by joined status. | [optional] 
| **sortOrder** | **String**| Note: results are sorted by name. | [optional] [default to asc]<br />**Values**: asc, desc 
{: class="table-striped"}


### Return type

[**UserQueueEntityListing**](UserQueueEntityListing.html)

<a name="getRoutingSettings"></a>

# **getRoutingSettings**



> [RoutingSettings](RoutingSettings.html) getRoutingSettings()

Get an organization&#39;s routing settings



Wraps GET /api/v2/routing/settings  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
try {
    RoutingSettings result = apiInstance.getRoutingSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingSettings");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**RoutingSettings**](RoutingSettings.html)

<a name="getRoutingSettingsContactcenter"></a>

# **getRoutingSettingsContactcenter**



> [ContactCenterSettings](ContactCenterSettings.html) getRoutingSettingsContactcenter()

Get Contact Center Settings



Wraps GET /api/v2/routing/settings/contactcenter  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
try {
    ContactCenterSettings result = apiInstance.getRoutingSettingsContactcenter();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingSettingsContactcenter");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**ContactCenterSettings**](ContactCenterSettings.html)

<a name="getRoutingSettingsTranscription"></a>

# **getRoutingSettingsTranscription**



> [TranscriptionSettings](TranscriptionSettings.html) getRoutingSettingsTranscription()

Get Transcription Settings



Wraps GET /api/v2/routing/settings/transcription  

Requires ANY permissions: 

* routing:transcriptionSettings:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
try {
    TranscriptionSettings result = apiInstance.getRoutingSettingsTranscription();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingSettingsTranscription");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**TranscriptionSettings**](TranscriptionSettings.html)

<a name="getRoutingSkill"></a>

# **getRoutingSkill**



> [RoutingSkill](RoutingSkill.html) getRoutingSkill(skillId)

Get Routing Skill



Wraps GET /api/v2/routing/skills/{skillId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String skillId = "skillId_example"; // String | Skill ID
try {
    RoutingSkill result = apiInstance.getRoutingSkill(skillId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingSkill");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **skillId** | **String**| Skill ID | 
{: class="table-striped"}


### Return type

[**RoutingSkill**](RoutingSkill.html)

<a name="getRoutingSkills"></a>

# **getRoutingSkills**



> [SkillEntityListing](SkillEntityListing.html) getRoutingSkills(pageSize, pageNumber, name, id)

Get the list of routing skills.



Wraps GET /api/v2/routing/skills  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String name = "name_example"; // String | Filter for results that start with this value
List<String> id = Arrays.asList("id_example"); // List<String> | id
try {
    SkillEntityListing result = apiInstance.getRoutingSkills(pageSize, pageNumber, name, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingSkills");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **name** | **String**| Filter for results that start with this value | [optional] 
| **id** | [**List&lt;String&gt;**](String.html)| id | [optional] 
{: class="table-striped"}


### Return type

[**SkillEntityListing**](SkillEntityListing.html)

<a name="getRoutingSmsAddress"></a>

# **getRoutingSmsAddress**



> [SmsAddress](SmsAddress.html) getRoutingSmsAddress(addressId)

Get an Address by Id for SMS



Wraps GET /api/v2/routing/sms/addresses/{addressId}  

Requires ALL permissions: 

* sms:phoneNumber:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String addressId = "addressId_example"; // String | Address ID
try {
    SmsAddress result = apiInstance.getRoutingSmsAddress(addressId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingSmsAddress");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **addressId** | **String**| Address ID | 
{: class="table-striped"}


### Return type

[**SmsAddress**](SmsAddress.html)

<a name="getRoutingSmsAddresses"></a>

# **getRoutingSmsAddresses**



> [SmsAddressEntityListing](SmsAddressEntityListing.html) getRoutingSmsAddresses(pageSize, pageNumber)

Get a list of Addresses for SMS



Wraps GET /api/v2/routing/sms/addresses  

Requires ALL permissions: 

* sms:phoneNumber:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    SmsAddressEntityListing result = apiInstance.getRoutingSmsAddresses(pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingSmsAddresses");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
{: class="table-striped"}


### Return type

[**SmsAddressEntityListing**](SmsAddressEntityListing.html)

<a name="getRoutingSmsAvailablephonenumbers"></a>

# **getRoutingSmsAvailablephonenumbers**



> [SMSAvailablePhoneNumberEntityListing](SMSAvailablePhoneNumberEntityListing.html) getRoutingSmsAvailablephonenumbers(countryCode, phoneNumberType, region, city, areaCode, pattern, addressRequirement)

Get a list of available phone numbers for SMS provisioning.

This request will return up to 30 random phone numbers matching the criteria specified.  To get additional phone numbers repeat the request.

Wraps GET /api/v2/routing/sms/availablephonenumbers  

Requires ALL permissions: 

* sms:phoneNumber:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String countryCode = "countryCode_example"; // String | The ISO 3166-1 alpha-2 country code of the county for which available phone numbers should be returned
String phoneNumberType = "phoneNumberType_example"; // String | Type of available phone numbers searched
String region = "region_example"; // String | Region/province/state that can be used to restrict the numbers returned
String city = "city_example"; // String | City that can be used to restrict the numbers returned
String areaCode = "areaCode_example"; // String | Area code that can be used to restrict the numbers returned
String pattern = "pattern_example"; // String | A pattern to match phone numbers. Valid characters are '*' and [0-9a-zA-Z]. The '*' character will match any single digit.
String addressRequirement = "addressRequirement_example"; // String | This indicates whether the phone number requires to have an Address registered.
try {
    SMSAvailablePhoneNumberEntityListing result = apiInstance.getRoutingSmsAvailablephonenumbers(countryCode, phoneNumberType, region, city, areaCode, pattern, addressRequirement);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingSmsAvailablephonenumbers");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **countryCode** | **String**| The ISO 3166-1 alpha-2 country code of the county for which available phone numbers should be returned | 
| **phoneNumberType** | **String**| Type of available phone numbers searched |<br />**Values**: local, mobile, tollfree 
| **region** | **String**| Region/province/state that can be used to restrict the numbers returned | [optional] 
| **city** | **String**| City that can be used to restrict the numbers returned | [optional] 
| **areaCode** | **String**| Area code that can be used to restrict the numbers returned | [optional] 
| **pattern** | **String**| A pattern to match phone numbers. Valid characters are &#39;*&#39; and [0-9a-zA-Z]. The &#39;*&#39; character will match any single digit. | [optional] 
| **addressRequirement** | **String**| This indicates whether the phone number requires to have an Address registered. | [optional]<br />**Values**: none, any, local, foreign 
{: class="table-striped"}


### Return type

[**SMSAvailablePhoneNumberEntityListing**](SMSAvailablePhoneNumberEntityListing.html)

<a name="getRoutingSmsPhonenumber"></a>

# **getRoutingSmsPhonenumber**



> [SmsPhoneNumber](SmsPhoneNumber.html) getRoutingSmsPhonenumber(addressId)

Get a phone number provisioned for SMS.



Wraps GET /api/v2/routing/sms/phonenumbers/{addressId}  

Requires ALL permissions: 

* sms:phoneNumber:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String addressId = "addressId_example"; // String | Address ID
try {
    SmsPhoneNumber result = apiInstance.getRoutingSmsPhonenumber(addressId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingSmsPhonenumber");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **addressId** | **String**| Address ID | 
{: class="table-striped"}


### Return type

[**SmsPhoneNumber**](SmsPhoneNumber.html)

<a name="getRoutingSmsPhonenumbers"></a>

# **getRoutingSmsPhonenumbers**



> [SmsPhoneNumberEntityListing](SmsPhoneNumberEntityListing.html) getRoutingSmsPhonenumbers(phoneNumber, phoneNumberType, phoneNumberStatus, countryCode, pageSize, pageNumber, sortBy, sortOrder, language)

Get a list of provisioned phone numbers.



Wraps GET /api/v2/routing/sms/phonenumbers  

Requires ALL permissions: 

* sms:phoneNumber:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String phoneNumber = "phoneNumber_example"; // String | Filter on phone number address. Allowable characters are the digits '0-9' and the wild card character '\\*'. If just digits are present, a contains search is done on the address pattern. For example, '317' could be matched anywhere in the address. An '\\*' will match multiple digits. For example, to match a specific area code within the US a pattern like '1317*' could be used.
List<String> phoneNumberType = Arrays.asList("phoneNumberType_example"); // List<String> | Filter on phone number type
List<String> phoneNumberStatus = Arrays.asList("phoneNumberStatus_example"); // List<String> | Filter on phone number status
List<String> countryCode = Arrays.asList("countryCode_example"); // List<String> | Filter on country code
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortBy = "sortBy_example"; // String | Optional field to sort results
String sortOrder = "sortOrder_example"; // String | Sort order
String language = "en-US"; // String | A language tag (which is sometimes referred to as a \"locale identifier\") to use to localize country field and sort operations
try {
    SmsPhoneNumberEntityListing result = apiInstance.getRoutingSmsPhonenumbers(phoneNumber, phoneNumberType, phoneNumberStatus, countryCode, pageSize, pageNumber, sortBy, sortOrder, language);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingSmsPhonenumbers");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **phoneNumber** | **String**| Filter on phone number address. Allowable characters are the digits &#39;0-9&#39; and the wild card character &#39;\\*&#39;. If just digits are present, a contains search is done on the address pattern. For example, &#39;317&#39; could be matched anywhere in the address. An &#39;\\*&#39; will match multiple digits. For example, to match a specific area code within the US a pattern like &#39;1317*&#39; could be used. | [optional] 
| **phoneNumberType** | [**List&lt;String&gt;**](String.html)| Filter on phone number type | [optional]<br />**Values**: local, mobile, tollfree, shortcode 
| **phoneNumberStatus** | [**List&lt;String&gt;**](String.html)| Filter on phone number status | [optional]<br />**Values**: active, invalid, initiated, porting, pending, pending-cancellation 
| **countryCode** | [**List&lt;String&gt;**](String.html)| Filter on country code | [optional] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **sortBy** | **String**| Optional field to sort results | [optional]<br />**Values**: phoneNumber, countryCode, country, phoneNumberStatus, phoneNumberType, purchaseDate, supportsMms, supportsSms, supportsVoice 
| **sortOrder** | **String**| Sort order | [optional]<br />**Values**: ascending, descending 
| **language** | **String**| A language tag (which is sometimes referred to as a \&quot;locale identifier\&quot;) to use to localize country field and sort operations | [optional] [default to en-US] 
{: class="table-striped"}


### Return type

[**SmsPhoneNumberEntityListing**](SmsPhoneNumberEntityListing.html)

<a name="getRoutingUserUtilization"></a>

# **getRoutingUserUtilization**



> [AgentMaxUtilization](AgentMaxUtilization.html) getRoutingUserUtilization(userId)

Get the user&#39;s max utilization settings.  If not configured, the organization-wide default is returned.



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
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String userId = "userId_example"; // String | User ID
try {
    AgentMaxUtilization result = apiInstance.getRoutingUserUtilization(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingUserUtilization");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
{: class="table-striped"}


### Return type

[**AgentMaxUtilization**](AgentMaxUtilization.html)

<a name="getRoutingUtilization"></a>

# **getRoutingUtilization**



> [Utilization](Utilization.html) getRoutingUtilization()

Get the organization-wide max utilization settings.



Wraps GET /api/v2/routing/utilization  

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
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
try {
    Utilization result = apiInstance.getRoutingUtilization();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingUtilization");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**Utilization**](Utilization.html)

<a name="getRoutingWrapupcode"></a>

# **getRoutingWrapupcode**



> [WrapupCode](WrapupCode.html) getRoutingWrapupcode(codeId)

Get details about this wrap-up code.



Wraps GET /api/v2/routing/wrapupcodes/{codeId}  

Requires ALL permissions: 

* routing:wrapupCode:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String codeId = "codeId_example"; // String | Wrapup Code ID
try {
    WrapupCode result = apiInstance.getRoutingWrapupcode(codeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingWrapupcode");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **codeId** | **String**| Wrapup Code ID | 
{: class="table-striped"}


### Return type

[**WrapupCode**](WrapupCode.html)

<a name="getRoutingWrapupcodes"></a>

# **getRoutingWrapupcodes**



> [WrapupCodeEntityListing](WrapupCodeEntityListing.html) getRoutingWrapupcodes(pageSize, pageNumber, sortBy, sortOrder, name)

Get list of wrapup codes.



Wraps GET /api/v2/routing/wrapupcodes  

Requires ALL permissions: 

* routing:wrapupCode:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortBy = "name"; // String | Sort by
String sortOrder = "ascending"; // String | Sort order
String name = "name_example"; // String | Wrapup code's name ('Sort by' param is ignored unless this field is provided)
try {
    WrapupCodeEntityListing result = apiInstance.getRoutingWrapupcodes(pageSize, pageNumber, sortBy, sortOrder, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingWrapupcodes");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **sortBy** | **String**| Sort by | [optional] [default to name]<br />**Values**: name, id 
| **sortOrder** | **String**| Sort order | [optional] [default to ascending]<br />**Values**: ascending, descending 
| **name** | **String**| Wrapup code&#39;s name (&#39;Sort by&#39; param is ignored unless this field is provided) | [optional] 
{: class="table-striped"}


### Return type

[**WrapupCodeEntityListing**](WrapupCodeEntityListing.html)

<a name="getUserQueues"></a>

# **getUserQueues**



> [UserQueueEntityListing](UserQueueEntityListing.html) getUserQueues(userId, pageSize, pageNumber, joined, divisionId)

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
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String userId = "userId_example"; // String | User ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
Boolean joined = true; // Boolean | Is joined to the queue
List<String> divisionId = Arrays.asList("divisionId_example"); // List<String> | Division ID(s)
try {
    UserQueueEntityListing result = apiInstance.getUserQueues(userId, pageSize, pageNumber, joined, divisionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getUserQueues");
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
| **divisionId** | [**List&lt;String&gt;**](String.html)| Division ID(s) | [optional] 
{: class="table-striped"}


### Return type

[**UserQueueEntityListing**](UserQueueEntityListing.html)

<a name="getUserRoutinglanguages"></a>

# **getUserRoutinglanguages**



> [UserLanguageEntityListing](UserLanguageEntityListing.html) getUserRoutinglanguages(userId, pageSize, pageNumber, sortOrder)

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
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String userId = "userId_example"; // String | User ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortOrder = "ASC"; // String | Ascending or descending sort order
try {
    UserLanguageEntityListing result = apiInstance.getUserRoutinglanguages(userId, pageSize, pageNumber, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getUserRoutinglanguages");
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

[**UserLanguageEntityListing**](UserLanguageEntityListing.html)

<a name="getUserRoutingskills"></a>

# **getUserRoutingskills**



> [UserSkillEntityListing](UserSkillEntityListing.html) getUserRoutingskills(userId, pageSize, pageNumber, sortOrder)

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
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String userId = "userId_example"; // String | User ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortOrder = "ASC"; // String | Ascending or descending sort order
try {
    UserSkillEntityListing result = apiInstance.getUserRoutingskills(userId, pageSize, pageNumber, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getUserRoutingskills");
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

[**UserSkillEntityListing**](UserSkillEntityListing.html)

<a name="patchRoutingConversation"></a>

# **patchRoutingConversation**



> [RoutingConversationAttributesResponse](RoutingConversationAttributesResponse.html) patchRoutingConversation(conversationId, body)

Update attributes of an in-queue conversation

Returns an object indicating the updated values of all settable attributes. Supported attributes: skillIds, languageId, and priority.

Wraps PATCH /api/v2/routing/conversations/{conversationId}  

Requires ANY permissions: 

* routing:conversation:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String conversationId = "conversationId_example"; // String | Conversation ID
RoutingConversationAttributesRequest body = new RoutingConversationAttributesRequest(); // RoutingConversationAttributesRequest | Conversation Attributes
try {
    RoutingConversationAttributesResponse result = apiInstance.patchRoutingConversation(conversationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#patchRoutingConversation");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| Conversation ID | 
| **body** | [**RoutingConversationAttributesRequest**](RoutingConversationAttributesRequest.html)| Conversation Attributes | 
{: class="table-striped"}


### Return type

[**RoutingConversationAttributesResponse**](RoutingConversationAttributesResponse.html)

<a name="patchRoutingEmailDomain"></a>

# **patchRoutingEmailDomain**



> [InboundDomain](InboundDomain.html) patchRoutingEmailDomain(domainId, body)

Update domain settings



Wraps PATCH /api/v2/routing/email/domains/{domainId}  

Requires ALL permissions: 

* routing:email:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String domainId = "domainId_example"; // String | domain ID
InboundDomainPatchRequest body = new InboundDomainPatchRequest(); // InboundDomainPatchRequest | Domain settings
try {
    InboundDomain result = apiInstance.patchRoutingEmailDomain(domainId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#patchRoutingEmailDomain");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **domainId** | **String**| domain ID | 
| **body** | [**InboundDomainPatchRequest**](InboundDomainPatchRequest.html)| Domain settings | 
{: class="table-striped"}


### Return type

[**InboundDomain**](InboundDomain.html)

<a name="patchRoutingEmailDomainValidate"></a>

# **patchRoutingEmailDomainValidate**



> [InboundDomain](InboundDomain.html) patchRoutingEmailDomainValidate(domainId, body)

Validate domain settings



Wraps PATCH /api/v2/routing/email/domains/{domainId}/validate  

Requires ALL permissions: 

* routing:email:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String domainId = "domainId_example"; // String | domain ID
InboundDomainPatchRequest body = new InboundDomainPatchRequest(); // InboundDomainPatchRequest | Domain settings
try {
    InboundDomain result = apiInstance.patchRoutingEmailDomainValidate(domainId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#patchRoutingEmailDomainValidate");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **domainId** | **String**| domain ID | 
| **body** | [**InboundDomainPatchRequest**](InboundDomainPatchRequest.html)| Domain settings | 
{: class="table-striped"}


### Return type

[**InboundDomain**](InboundDomain.html)

<a name="patchRoutingPredictor"></a>

# **patchRoutingPredictor**



> [Predictor](Predictor.html) patchRoutingPredictor(predictorId, body)

Update single predictor.



Wraps PATCH /api/v2/routing/predictors/{predictorId}  

Requires ALL permissions: 

* routing:predictor:edit
* routing:queue:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String predictorId = "predictorId_example"; // String | Predictor ID
PatchPredictorRequest body = new PatchPredictorRequest(); // PatchPredictorRequest | 
try {
    Predictor result = apiInstance.patchRoutingPredictor(predictorId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#patchRoutingPredictor");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **predictorId** | **String**| Predictor ID | 
| **body** | [**PatchPredictorRequest**](PatchPredictorRequest.html)|  | [optional] 
{: class="table-striped"}


### Return type

[**Predictor**](Predictor.html)

<a name="patchRoutingQueueMember"></a>

# **patchRoutingQueueMember**



> Void patchRoutingQueueMember(queueId, memberId, body)

Update the ring number OR joined status for a queue member.



Wraps PATCH /api/v2/routing/queues/{queueId}/members/{memberId}  

Requires ANY permissions: 

* routing:queue:edit
* routing:queueMember:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
String memberId = "memberId_example"; // String | Member ID
QueueMember body = new QueueMember(); // QueueMember | Queue Member
try {
    apiInstance.patchRoutingQueueMember(queueId, memberId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#patchRoutingQueueMember");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **queueId** | **String**| Queue ID | 
| **memberId** | **String**| Member ID | 
| **body** | [**QueueMember**](QueueMember.html)| Queue Member | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="patchRoutingQueueMembers"></a>

# **patchRoutingQueueMembers**



> [QueueMemberEntityListing](QueueMemberEntityListing.html) patchRoutingQueueMembers(queueId, body)

Join or unjoin a set of users for a queue



Wraps PATCH /api/v2/routing/queues/{queueId}/members  

Requires ANY permissions: 

* routing:queue:edit
* routing:queueMember:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
List<QueueMember> body = Arrays.asList(new QueueMember()); // List<QueueMember> | Queue Members
try {
    QueueMemberEntityListing result = apiInstance.patchRoutingQueueMembers(queueId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#patchRoutingQueueMembers");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **queueId** | **String**| Queue ID | 
| **body** | [**List&lt;QueueMember&gt;**](QueueMember.html)| Queue Members | 
{: class="table-striped"}


### Return type

[**QueueMemberEntityListing**](QueueMemberEntityListing.html)

<a name="patchRoutingQueueUser"></a>

# **patchRoutingQueueUser**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> Void patchRoutingQueueUser(queueId, memberId, body)

DEPRECATED: use PATCH /routing/queues/{queueId}/members/{memberId}.  Update the ring number OR joined status for a User in a Queue.



Wraps PATCH /api/v2/routing/queues/{queueId}/users/{memberId}  

Requires ANY permissions: 

* routing:queue:edit
* routing:queueMember:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
String memberId = "memberId_example"; // String | Member ID
QueueMember body = new QueueMember(); // QueueMember | Queue Member
try {
    apiInstance.patchRoutingQueueUser(queueId, memberId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#patchRoutingQueueUser");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **queueId** | **String**| Queue ID | 
| **memberId** | **String**| Member ID | 
| **body** | [**QueueMember**](QueueMember.html)| Queue Member | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="patchRoutingQueueUsers"></a>

# **patchRoutingQueueUsers**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [QueueMemberEntityListingV1](QueueMemberEntityListingV1.html) patchRoutingQueueUsers(queueId, body)

DEPRECATED: use PATCH /routing/queues/{queueId}/members.  Join or unjoin a set of users for a queue.



Wraps PATCH /api/v2/routing/queues/{queueId}/users  

Requires ANY permissions: 

* routing:queue:edit
* routing:queueMember:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
List<QueueMember> body = Arrays.asList(new QueueMember()); // List<QueueMember> | Queue Members
try {
    QueueMemberEntityListingV1 result = apiInstance.patchRoutingQueueUsers(queueId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#patchRoutingQueueUsers");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **queueId** | **String**| Queue ID | 
| **body** | [**List&lt;QueueMember&gt;**](QueueMember.html)| Queue Members | 
{: class="table-striped"}


### Return type

[**QueueMemberEntityListingV1**](QueueMemberEntityListingV1.html)

<a name="patchRoutingSettingsContactcenter"></a>

# **patchRoutingSettingsContactcenter**



> Void patchRoutingSettingsContactcenter(body)

Update Contact Center Settings



Wraps PATCH /api/v2/routing/settings/contactcenter  

Requires ANY permissions: 

* routing:settings:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
ContactCenterSettings body = new ContactCenterSettings(); // ContactCenterSettings | Contact Center Settings
try {
    apiInstance.patchRoutingSettingsContactcenter(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#patchRoutingSettingsContactcenter");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**ContactCenterSettings**](ContactCenterSettings.html)| Contact Center Settings | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="patchUserQueue"></a>

# **patchUserQueue**



> [UserQueue](UserQueue.html) patchUserQueue(queueId, userId, body)

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
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
String userId = "userId_example"; // String | User ID
UserQueue body = new UserQueue(); // UserQueue | Queue Member
try {
    UserQueue result = apiInstance.patchUserQueue(queueId, userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#patchUserQueue");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **queueId** | **String**| Queue ID | 
| **userId** | **String**| User ID | 
| **body** | [**UserQueue**](UserQueue.html)| Queue Member | 
{: class="table-striped"}


### Return type

[**UserQueue**](UserQueue.html)

<a name="patchUserQueues"></a>

# **patchUserQueues**



> [UserQueueEntityListing](UserQueueEntityListing.html) patchUserQueues(userId, body, divisionId)

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
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String userId = "userId_example"; // String | User ID
List<UserQueue> body = Arrays.asList(new UserQueue()); // List<UserQueue> | User Queues
List<String> divisionId = Arrays.asList("divisionId_example"); // List<String> | Division ID(s)
try {
    UserQueueEntityListing result = apiInstance.patchUserQueues(userId, body, divisionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#patchUserQueues");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **body** | [**List&lt;UserQueue&gt;**](UserQueue.html)| User Queues | 
| **divisionId** | [**List&lt;String&gt;**](String.html)| Division ID(s) | [optional] 
{: class="table-striped"}


### Return type

[**UserQueueEntityListing**](UserQueueEntityListing.html)

<a name="patchUserRoutinglanguage"></a>

# **patchUserRoutinglanguage**



> [UserRoutingLanguage](UserRoutingLanguage.html) patchUserRoutinglanguage(userId, languageId, body)

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
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String userId = "userId_example"; // String | User ID
String languageId = "languageId_example"; // String | languageId
UserRoutingLanguage body = new UserRoutingLanguage(); // UserRoutingLanguage | Language
try {
    UserRoutingLanguage result = apiInstance.patchUserRoutinglanguage(userId, languageId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#patchUserRoutinglanguage");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **languageId** | **String**| languageId | 
| **body** | [**UserRoutingLanguage**](UserRoutingLanguage.html)| Language | 
{: class="table-striped"}


### Return type

[**UserRoutingLanguage**](UserRoutingLanguage.html)

<a name="patchUserRoutinglanguagesBulk"></a>

# **patchUserRoutinglanguagesBulk**



> [UserLanguageEntityListing](UserLanguageEntityListing.html) patchUserRoutinglanguagesBulk(userId, body)

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
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String userId = "userId_example"; // String | User ID
List<UserRoutingLanguagePost> body = Arrays.asList(new UserRoutingLanguagePost()); // List<UserRoutingLanguagePost> | Language
try {
    UserLanguageEntityListing result = apiInstance.patchUserRoutinglanguagesBulk(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#patchUserRoutinglanguagesBulk");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **body** | [**List&lt;UserRoutingLanguagePost&gt;**](UserRoutingLanguagePost.html)| Language | 
{: class="table-striped"}


### Return type

[**UserLanguageEntityListing**](UserLanguageEntityListing.html)

<a name="patchUserRoutingskillsBulk"></a>

# **patchUserRoutingskillsBulk**



> [UserSkillEntityListing](UserSkillEntityListing.html) patchUserRoutingskillsBulk(userId, body)

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
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String userId = "userId_example"; // String | User ID
List<UserRoutingSkillPost> body = Arrays.asList(new UserRoutingSkillPost()); // List<UserRoutingSkillPost> | Skill
try {
    UserSkillEntityListing result = apiInstance.patchUserRoutingskillsBulk(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#patchUserRoutingskillsBulk");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **body** | [**List&lt;UserRoutingSkillPost&gt;**](UserRoutingSkillPost.html)| Skill | 
{: class="table-striped"}


### Return type

[**UserSkillEntityListing**](UserSkillEntityListing.html)

<a name="postAnalyticsQueuesObservationsQuery"></a>

# **postAnalyticsQueuesObservationsQuery**



> [QueueObservationQueryResponse](QueueObservationQueryResponse.html) postAnalyticsQueuesObservationsQuery(body)

Query for queue observations



Wraps POST /api/v2/analytics/queues/observations/query  

Requires ANY permissions: 

* analytics:queueObservation:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
QueueObservationQuery body = new QueueObservationQuery(); // QueueObservationQuery | query
try {
    QueueObservationQueryResponse result = apiInstance.postAnalyticsQueuesObservationsQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postAnalyticsQueuesObservationsQuery");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**QueueObservationQuery**](QueueObservationQuery.html)| query | 
{: class="table-striped"}


### Return type

[**QueueObservationQueryResponse**](QueueObservationQueryResponse.html)

<a name="postRoutingAssessments"></a>

# **postRoutingAssessments**



> [BenefitAssessment](BenefitAssessment.html) postRoutingAssessments(body)

Create a benefit assessment.



Wraps POST /api/v2/routing/assessments  

Requires ALL permissions: 

* routing:assessment:add
* routing:queue:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
CreateBenefitAssessmentRequest body = new CreateBenefitAssessmentRequest(); // CreateBenefitAssessmentRequest | 
try {
    BenefitAssessment result = apiInstance.postRoutingAssessments(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postRoutingAssessments");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**CreateBenefitAssessmentRequest**](CreateBenefitAssessmentRequest.html)|  | [optional] 
{: class="table-striped"}


### Return type

[**BenefitAssessment**](BenefitAssessment.html)

<a name="postRoutingAssessmentsJobs"></a>

# **postRoutingAssessmentsJobs**



> [BenefitAssessmentJob](BenefitAssessmentJob.html) postRoutingAssessmentsJobs(body)

Create a benefit assessment job.



Wraps POST /api/v2/routing/assessments/jobs  

Requires ANY permissions: 

* routing:assessment:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
CreateBenefitAssessmentJobRequest body = new CreateBenefitAssessmentJobRequest(); // CreateBenefitAssessmentJobRequest | 
try {
    BenefitAssessmentJob result = apiInstance.postRoutingAssessmentsJobs(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postRoutingAssessmentsJobs");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**CreateBenefitAssessmentJobRequest**](CreateBenefitAssessmentJobRequest.html)|  | [optional] 
{: class="table-striped"}


### Return type

[**BenefitAssessmentJob**](BenefitAssessmentJob.html)

<a name="postRoutingEmailDomainRoutes"></a>

# **postRoutingEmailDomainRoutes**



> [InboundRoute](InboundRoute.html) postRoutingEmailDomainRoutes(domainName, body)

Create a route



Wraps POST /api/v2/routing/email/domains/{domainName}/routes  

Requires ALL permissions: 

* routing:email:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String domainName = "domainName_example"; // String | email domain
InboundRoute body = new InboundRoute(); // InboundRoute | Route
try {
    InboundRoute result = apiInstance.postRoutingEmailDomainRoutes(domainName, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postRoutingEmailDomainRoutes");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **domainName** | **String**| email domain | 
| **body** | [**InboundRoute**](InboundRoute.html)| Route | 
{: class="table-striped"}


### Return type

[**InboundRoute**](InboundRoute.html)

<a name="postRoutingEmailDomainTestconnection"></a>

# **postRoutingEmailDomainTestconnection**



> [TestMessage](TestMessage.html) postRoutingEmailDomainTestconnection(domainId, body)

Tests the custom SMTP server integration connection set on this domain

The request body is optional. If omitted, this endpoint will just test the connection of the Custom SMTP Server. If the body is specified, there will be an attempt to send an email message to the server.

Wraps POST /api/v2/routing/email/domains/{domainId}/testconnection  

Requires ALL permissions: 

* routing:email:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String domainId = "domainId_example"; // String | domain ID
TestMessage body = new TestMessage(); // TestMessage | TestMessage
try {
    TestMessage result = apiInstance.postRoutingEmailDomainTestconnection(domainId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postRoutingEmailDomainTestconnection");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **domainId** | **String**| domain ID | 
| **body** | [**TestMessage**](TestMessage.html)| TestMessage | [optional] 
{: class="table-striped"}


### Return type

[**TestMessage**](TestMessage.html)

<a name="postRoutingEmailDomains"></a>

# **postRoutingEmailDomains**



> [InboundDomain](InboundDomain.html) postRoutingEmailDomains(body)

Create a domain



Wraps POST /api/v2/routing/email/domains  

Requires ALL permissions: 

* routing:email:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
InboundDomain body = new InboundDomain(); // InboundDomain | Domain
try {
    InboundDomain result = apiInstance.postRoutingEmailDomains(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postRoutingEmailDomains");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**InboundDomain**](InboundDomain.html)| Domain | 
{: class="table-striped"}


### Return type

[**InboundDomain**](InboundDomain.html)

<a name="postRoutingLanguages"></a>

# **postRoutingLanguages**



> [Language](Language.html) postRoutingLanguages(body)

Create Language



Wraps POST /api/v2/routing/languages  

Requires ANY permissions: 

* routing:skill:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
Language body = new Language(); // Language | Language
try {
    Language result = apiInstance.postRoutingLanguages(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postRoutingLanguages");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**Language**](Language.html)| Language | 
{: class="table-striped"}


### Return type

[**Language**](Language.html)

<a name="postRoutingPredictors"></a>

# **postRoutingPredictors**



> [Predictor](Predictor.html) postRoutingPredictors(body)

Create a predictor.



Wraps POST /api/v2/routing/predictors  

Requires ALL permissions: 

* routing:predictor:add
* routing:queue:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
CreatePredictorRequest body = new CreatePredictorRequest(); // CreatePredictorRequest | 
try {
    Predictor result = apiInstance.postRoutingPredictors(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postRoutingPredictors");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**CreatePredictorRequest**](CreatePredictorRequest.html)|  | [optional] 
{: class="table-striped"}


### Return type

[**Predictor**](Predictor.html)

<a name="postRoutingQueueMembers"></a>

# **postRoutingQueueMembers**



> Void postRoutingQueueMembers(queueId, body, delete)

Bulk add or delete up to 100 queue members



Wraps POST /api/v2/routing/queues/{queueId}/members  

Requires ANY permissions: 

* routing:queue:edit
* routing:queueMember:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
List<WritableEntity> body = Arrays.asList(new WritableEntity()); // List<WritableEntity> | Queue Members
Boolean delete = false; // Boolean | True to delete queue members
try {
    apiInstance.postRoutingQueueMembers(queueId, body, delete);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postRoutingQueueMembers");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **queueId** | **String**| Queue ID | 
| **body** | [**List&lt;WritableEntity&gt;**](WritableEntity.html)| Queue Members | 
| **delete** | **Boolean**| True to delete queue members | [optional] [default to false] 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="postRoutingQueueUsers"></a>

# **postRoutingQueueUsers**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> Void postRoutingQueueUsers(queueId, body, delete)

DEPRECATED: use POST /routing/queues/{queueId}/members.  Bulk add or delete up to 100 queue members.



Wraps POST /api/v2/routing/queues/{queueId}/users  

Requires ANY permissions: 

* routing:queue:edit
* routing:queueMember:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
List<WritableEntity> body = Arrays.asList(new WritableEntity()); // List<WritableEntity> | Queue Members
Boolean delete = false; // Boolean | True to delete queue members
try {
    apiInstance.postRoutingQueueUsers(queueId, body, delete);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postRoutingQueueUsers");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **queueId** | **String**| Queue ID | 
| **body** | [**List&lt;WritableEntity&gt;**](WritableEntity.html)| Queue Members | 
| **delete** | **Boolean**| True to delete queue members | [optional] [default to false] 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="postRoutingQueueWrapupcodes"></a>

# **postRoutingQueueWrapupcodes**



> [List&lt;WrapupCode&gt;](WrapupCode.html) postRoutingQueueWrapupcodes(queueId, body)

Add up to 100 wrap-up codes to a queue



Wraps POST /api/v2/routing/queues/{queueId}/wrapupcodes  

Requires ALL permissions: 

* routing:queue:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
List<WrapUpCodeReference> body = Arrays.asList(new WrapUpCodeReference()); // List<WrapUpCodeReference> | List of wrapup codes
try {
    List<WrapupCode> result = apiInstance.postRoutingQueueWrapupcodes(queueId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postRoutingQueueWrapupcodes");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **queueId** | **String**| Queue ID | 
| **body** | [**List&lt;WrapUpCodeReference&gt;**](WrapUpCodeReference.html)| List of wrapup codes | 
{: class="table-striped"}


### Return type

[**List&lt;WrapupCode&gt;**](WrapupCode.html)

<a name="postRoutingQueues"></a>

# **postRoutingQueues**



> [Queue](Queue.html) postRoutingQueues(body)

Create a queue



Wraps POST /api/v2/routing/queues  

Requires ANY permissions: 

* routing:queue:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
CreateQueueRequest body = new CreateQueueRequest(); // CreateQueueRequest | Queue
try {
    Queue result = apiInstance.postRoutingQueues(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postRoutingQueues");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**CreateQueueRequest**](CreateQueueRequest.html)| Queue | 
{: class="table-striped"}


### Return type

[**Queue**](Queue.html)

<a name="postRoutingSkills"></a>

# **postRoutingSkills**



> [RoutingSkill](RoutingSkill.html) postRoutingSkills(body)

Create Skill



Wraps POST /api/v2/routing/skills  

Requires ANY permissions: 

* routing:skill:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
RoutingSkill body = new RoutingSkill(); // RoutingSkill | Skill
try {
    RoutingSkill result = apiInstance.postRoutingSkills(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postRoutingSkills");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**RoutingSkill**](RoutingSkill.html)| Skill | 
{: class="table-striped"}


### Return type

[**RoutingSkill**](RoutingSkill.html)

<a name="postRoutingSmsAddresses"></a>

# **postRoutingSmsAddresses**



> [SmsAddress](SmsAddress.html) postRoutingSmsAddresses(body)

Provision an Address for SMS



Wraps POST /api/v2/routing/sms/addresses  

Requires ALL permissions: 

* sms:phoneNumber:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
SmsAddressProvision body = new SmsAddressProvision(); // SmsAddressProvision | SmsAddress
try {
    SmsAddress result = apiInstance.postRoutingSmsAddresses(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postRoutingSmsAddresses");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**SmsAddressProvision**](SmsAddressProvision.html)| SmsAddress | 
{: class="table-striped"}


### Return type

[**SmsAddress**](SmsAddress.html)

<a name="postRoutingSmsPhonenumbers"></a>

# **postRoutingSmsPhonenumbers**



> [SmsPhoneNumber](SmsPhoneNumber.html) postRoutingSmsPhonenumbers(body, async)

Provision a phone number for SMS



Wraps POST /api/v2/routing/sms/phonenumbers  

Requires ALL permissions: 

* sms:phoneNumber:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
SmsPhoneNumberProvision body = new SmsPhoneNumberProvision(); // SmsPhoneNumberProvision | SmsPhoneNumber
Boolean async = false; // Boolean | Provision a new phone number for SMS in an asynchronous manner. If the async parameter value is true, this initiates the provisioning of a new phone number. Check the phoneNumber's provisioningStatus for completion of this request.
try {
    SmsPhoneNumber result = apiInstance.postRoutingSmsPhonenumbers(body, async);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postRoutingSmsPhonenumbers");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**SmsPhoneNumberProvision**](SmsPhoneNumberProvision.html)| SmsPhoneNumber | 
| **async** | **Boolean**| Provision a new phone number for SMS in an asynchronous manner. If the async parameter value is true, this initiates the provisioning of a new phone number. Check the phoneNumber&#39;s provisioningStatus for completion of this request. | [optional] [default to false] 
{: class="table-striped"}


### Return type

[**SmsPhoneNumber**](SmsPhoneNumber.html)

<a name="postRoutingWrapupcodes"></a>

# **postRoutingWrapupcodes**



> [WrapupCode](WrapupCode.html) postRoutingWrapupcodes(body)

Create a wrap-up code



Wraps POST /api/v2/routing/wrapupcodes  

Requires ALL permissions: 

* routing:wrapupCode:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
WrapupCode body = new WrapupCode(); // WrapupCode | WrapupCode
try {
    WrapupCode result = apiInstance.postRoutingWrapupcodes(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postRoutingWrapupcodes");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**WrapupCode**](WrapupCode.html)| WrapupCode | 
{: class="table-striped"}


### Return type

[**WrapupCode**](WrapupCode.html)

<a name="postUserRoutinglanguages"></a>

# **postUserRoutinglanguages**



> [UserRoutingLanguage](UserRoutingLanguage.html) postUserRoutinglanguages(userId, body)

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
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String userId = "userId_example"; // String | User ID
UserRoutingLanguagePost body = new UserRoutingLanguagePost(); // UserRoutingLanguagePost | Language
try {
    UserRoutingLanguage result = apiInstance.postUserRoutinglanguages(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postUserRoutinglanguages");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **body** | [**UserRoutingLanguagePost**](UserRoutingLanguagePost.html)| Language | 
{: class="table-striped"}


### Return type

[**UserRoutingLanguage**](UserRoutingLanguage.html)

<a name="postUserRoutingskills"></a>

# **postUserRoutingskills**



> [UserRoutingSkill](UserRoutingSkill.html) postUserRoutingskills(userId, body)

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
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String userId = "userId_example"; // String | User ID
UserRoutingSkillPost body = new UserRoutingSkillPost(); // UserRoutingSkillPost | Skill
try {
    UserRoutingSkill result = apiInstance.postUserRoutingskills(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postUserRoutingskills");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **body** | [**UserRoutingSkillPost**](UserRoutingSkillPost.html)| Skill | 
{: class="table-striped"}


### Return type

[**UserRoutingSkill**](UserRoutingSkill.html)

<a name="putRoutingEmailDomainRoute"></a>

# **putRoutingEmailDomainRoute**



> [InboundRoute](InboundRoute.html) putRoutingEmailDomainRoute(domainName, routeId, body)

Update a route



Wraps PUT /api/v2/routing/email/domains/{domainName}/routes/{routeId}  

Requires ALL permissions: 

* routing:email:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String domainName = "domainName_example"; // String | email domain
String routeId = "routeId_example"; // String | route ID
InboundRoute body = new InboundRoute(); // InboundRoute | Route
try {
    InboundRoute result = apiInstance.putRoutingEmailDomainRoute(domainName, routeId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#putRoutingEmailDomainRoute");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **domainName** | **String**| email domain | 
| **routeId** | **String**| route ID | 
| **body** | [**InboundRoute**](InboundRoute.html)| Route | 
{: class="table-striped"}


### Return type

[**InboundRoute**](InboundRoute.html)

<a name="putRoutingMessageRecipient"></a>

# **putRoutingMessageRecipient**



> [Recipient](Recipient.html) putRoutingMessageRecipient(recipientId, body)

Update a recipient



Wraps PUT /api/v2/routing/message/recipients/{recipientId}  

Requires ALL permissions: 

* routing:message:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String recipientId = "recipientId_example"; // String | Recipient ID
Recipient body = new Recipient(); // Recipient | Recipient
try {
    Recipient result = apiInstance.putRoutingMessageRecipient(recipientId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#putRoutingMessageRecipient");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **recipientId** | **String**| Recipient ID | 
| **body** | [**Recipient**](Recipient.html)| Recipient | 
{: class="table-striped"}


### Return type

[**Recipient**](Recipient.html)

<a name="putRoutingQueue"></a>

# **putRoutingQueue**



> [Queue](Queue.html) putRoutingQueue(queueId, body)

Update a queue



Wraps PUT /api/v2/routing/queues/{queueId}  

Requires ANY permissions: 

* routing:queue:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
QueueRequest body = new QueueRequest(); // QueueRequest | Queue
try {
    Queue result = apiInstance.putRoutingQueue(queueId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#putRoutingQueue");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **queueId** | **String**| Queue ID | 
| **body** | [**QueueRequest**](QueueRequest.html)| Queue | 
{: class="table-striped"}


### Return type

[**Queue**](Queue.html)

<a name="putRoutingSettings"></a>

# **putRoutingSettings**



> [RoutingSettings](RoutingSettings.html) putRoutingSettings(body)

Update an organization&#39;s routing settings



Wraps PUT /api/v2/routing/settings  

Requires ANY permissions: 

* routing:settings:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
RoutingSettings body = new RoutingSettings(); // RoutingSettings | Organization Settings
try {
    RoutingSettings result = apiInstance.putRoutingSettings(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#putRoutingSettings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**RoutingSettings**](RoutingSettings.html)| Organization Settings | 
{: class="table-striped"}


### Return type

[**RoutingSettings**](RoutingSettings.html)

<a name="putRoutingSettingsTranscription"></a>

# **putRoutingSettingsTranscription**



> [TranscriptionSettings](TranscriptionSettings.html) putRoutingSettingsTranscription(body)

Update Transcription Settings



Wraps PUT /api/v2/routing/settings/transcription  

Requires ANY permissions: 

* routing:transcriptionSettings:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
TranscriptionSettings body = new TranscriptionSettings(); // TranscriptionSettings | Organization Settings
try {
    TranscriptionSettings result = apiInstance.putRoutingSettingsTranscription(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#putRoutingSettingsTranscription");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**TranscriptionSettings**](TranscriptionSettings.html)| Organization Settings | 
{: class="table-striped"}


### Return type

[**TranscriptionSettings**](TranscriptionSettings.html)

<a name="putRoutingSmsPhonenumber"></a>

# **putRoutingSmsPhonenumber**



> [SmsPhoneNumber](SmsPhoneNumber.html) putRoutingSmsPhonenumber(addressId, body, async)

Update a phone number provisioned for SMS.



Wraps PUT /api/v2/routing/sms/phonenumbers/{addressId}  

Requires ALL permissions: 

* sms:phoneNumber:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String addressId = "addressId_example"; // String | Address ID
SmsPhoneNumber body = new SmsPhoneNumber(); // SmsPhoneNumber | SmsPhoneNumber
Boolean async = false; // Boolean | Update an existing phone number for SMS in an asynchronous manner. If the async parameter value is true, this initiates the update of a provisioned phone number. Check the phoneNumber's provisioningStatus for the progress of this request.
try {
    SmsPhoneNumber result = apiInstance.putRoutingSmsPhonenumber(addressId, body, async);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#putRoutingSmsPhonenumber");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **addressId** | **String**| Address ID | 
| **body** | [**SmsPhoneNumber**](SmsPhoneNumber.html)| SmsPhoneNumber | 
| **async** | **Boolean**| Update an existing phone number for SMS in an asynchronous manner. If the async parameter value is true, this initiates the update of a provisioned phone number. Check the phoneNumber&#39;s provisioningStatus for the progress of this request. | [optional] [default to false] 
{: class="table-striped"}


### Return type

[**SmsPhoneNumber**](SmsPhoneNumber.html)

<a name="putRoutingUserUtilization"></a>

# **putRoutingUserUtilization**



> [AgentMaxUtilization](AgentMaxUtilization.html) putRoutingUserUtilization(userId, body)

Update the user&#39;s max utilization settings.  Include only those media types requiring custom configuration.



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
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String userId = "userId_example"; // String | User ID
Utilization body = new Utilization(); // Utilization | utilization
try {
    AgentMaxUtilization result = apiInstance.putRoutingUserUtilization(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#putRoutingUserUtilization");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **body** | [**Utilization**](Utilization.html)| utilization | 
{: class="table-striped"}


### Return type

[**AgentMaxUtilization**](AgentMaxUtilization.html)

<a name="putRoutingUtilization"></a>

# **putRoutingUtilization**



> [Utilization](Utilization.html) putRoutingUtilization(body)

Update the organization-wide max utilization settings.  Include only those media types requiring custom configuration.



Wraps PUT /api/v2/routing/utilization  

Requires ALL permissions: 

* routing:utilization:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
Utilization body = new Utilization(); // Utilization | utilization
try {
    Utilization result = apiInstance.putRoutingUtilization(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#putRoutingUtilization");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**Utilization**](Utilization.html)| utilization | 
{: class="table-striped"}


### Return type

[**Utilization**](Utilization.html)

<a name="putRoutingWrapupcode"></a>

# **putRoutingWrapupcode**



> [WrapupCode](WrapupCode.html) putRoutingWrapupcode(codeId, body)

Update wrap-up code



Wraps PUT /api/v2/routing/wrapupcodes/{codeId}  

Requires ALL permissions: 

* routing:wrapupCode:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String codeId = "codeId_example"; // String | Wrapup Code ID
WrapupCode body = new WrapupCode(); // WrapupCode | WrapupCode
try {
    WrapupCode result = apiInstance.putRoutingWrapupcode(codeId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#putRoutingWrapupcode");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **codeId** | **String**| Wrapup Code ID | 
| **body** | [**WrapupCode**](WrapupCode.html)| WrapupCode | 
{: class="table-striped"}


### Return type

[**WrapupCode**](WrapupCode.html)

<a name="putUserRoutingskill"></a>

# **putUserRoutingskill**



> [UserRoutingSkill](UserRoutingSkill.html) putUserRoutingskill(userId, skillId, body)

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
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String userId = "userId_example"; // String | User ID
String skillId = "skillId_example"; // String | skillId
UserRoutingSkill body = new UserRoutingSkill(); // UserRoutingSkill | Skill
try {
    UserRoutingSkill result = apiInstance.putUserRoutingskill(userId, skillId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#putUserRoutingskill");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **skillId** | **String**| skillId | 
| **body** | [**UserRoutingSkill**](UserRoutingSkill.html)| Skill | 
{: class="table-striped"}


### Return type

[**UserRoutingSkill**](UserRoutingSkill.html)

<a name="putUserRoutingskillsBulk"></a>

# **putUserRoutingskillsBulk**



> [UserSkillEntityListing](UserSkillEntityListing.html) putUserRoutingskillsBulk(userId, body)

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
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String userId = "userId_example"; // String | User ID
List<UserRoutingSkillPost> body = Arrays.asList(new UserRoutingSkillPost()); // List<UserRoutingSkillPost> | Skill
try {
    UserSkillEntityListing result = apiInstance.putUserRoutingskillsBulk(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#putUserRoutingskillsBulk");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **body** | [**List&lt;UserRoutingSkillPost&gt;**](UserRoutingSkillPost.html)| Skill | 
{: class="table-striped"}


### Return type

[**UserSkillEntityListing**](UserSkillEntityListing.html)

