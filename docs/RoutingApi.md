# RoutingApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteRoutingAssessment**](RoutingApi#deleteRoutingAssessment) | Delete single benefit assessment. |
| [**deleteRoutingDirectroutingbackupSettingsMe**](RoutingApi#deleteRoutingDirectroutingbackupSettingsMe) | Delete the user's Direct Routing Backup settings and revert to the Direct Routing Queue default. |
| [**deleteRoutingEmailDomain**](RoutingApi#deleteRoutingEmailDomain) | Delete a domain |
| [**deleteRoutingEmailDomainRoute**](RoutingApi#deleteRoutingEmailDomainRoute) | Delete a route |
| [**deleteRoutingEmailOutboundDomain**](RoutingApi#deleteRoutingEmailOutboundDomain) | Delete an outbound domain |
| [**deleteRoutingLanguage**](RoutingApi#deleteRoutingLanguage) | Delete a routing language |
| [**deleteRoutingPredictor**](RoutingApi#deleteRoutingPredictor) | Delete single predictor. |
| [**deleteRoutingQueue**](RoutingApi#deleteRoutingQueue) | Delete a queue |
| [**deleteRoutingQueueMember**](RoutingApi#deleteRoutingQueueMember) | Delete a queue member. |
| [**deleteRoutingQueueUser**](RoutingApi#deleteRoutingQueueUser) | DEPRECATED: use DELETE /routing/queues/{queueId}/members/{memberId}.  Delete queue member. |
| [**deleteRoutingQueueWrapupcode**](RoutingApi#deleteRoutingQueueWrapupcode) | Delete a wrap-up code from a queue |
| [**deleteRoutingSettings**](RoutingApi#deleteRoutingSettings) | Delete an organization's routing settings |
| [**deleteRoutingSkill**](RoutingApi#deleteRoutingSkill) | Delete Routing Skill |
| [**deleteRoutingSkillgroup**](RoutingApi#deleteRoutingSkillgroup) | Remove skill group definition |
| [**deleteRoutingSmsAddress**](RoutingApi#deleteRoutingSmsAddress) | Delete an Address by Id for SMS |
| [**deleteRoutingSmsPhonenumber**](RoutingApi#deleteRoutingSmsPhonenumber) | Delete a phone number provisioned for SMS. |
| [**deleteRoutingUserDirectroutingbackupSettings**](RoutingApi#deleteRoutingUserDirectroutingbackupSettings) | Delete the user's Direct Routing Backup settings and revert to the Direct Routing Queue default. |
| [**deleteRoutingUserUtilization**](RoutingApi#deleteRoutingUserUtilization) | Delete the user's max utilization settings and revert to the organization-wide default. |
| [**deleteRoutingUtilization**](RoutingApi#deleteRoutingUtilization) | Delete the organization-wide max utilization settings and revert to the system default. |
| [**deleteRoutingUtilizationLabel**](RoutingApi#deleteRoutingUtilizationLabel) | Delete a utilization label |
| [**deleteRoutingUtilizationTag**](RoutingApi#deleteRoutingUtilizationTag) | Delete an utilization tag |
| [**deleteRoutingWrapupcode**](RoutingApi#deleteRoutingWrapupcode) | Delete wrap-up code |
| [**deleteUserRoutinglanguage**](RoutingApi#deleteUserRoutinglanguage) | Remove a routing language from a user |
| [**deleteUserRoutingskill**](RoutingApi#deleteUserRoutingskill) | Remove a routing skill from a user |
| [**getRoutingAssessment**](RoutingApi#getRoutingAssessment) | Retrieve a single benefit assessment. |
| [**getRoutingAssessments**](RoutingApi#getRoutingAssessments) | Retrieve all benefit assessments. |
| [**getRoutingAssessmentsJob**](RoutingApi#getRoutingAssessmentsJob) | Retrieve a single benefit assessments job. |
| [**getRoutingAssessmentsJobs**](RoutingApi#getRoutingAssessmentsJobs) | Retrieve all benefit assessment jobs. |
| [**getRoutingAvailablemediatypes**](RoutingApi#getRoutingAvailablemediatypes) | Get available media types |
| [**getRoutingDirectroutingbackupSettingsMe**](RoutingApi#getRoutingDirectroutingbackupSettingsMe) | Get the user's Direct Routing Backup settings. |
| [**getRoutingEmailDomain**](RoutingApi#getRoutingEmailDomain) | Get domain |
| [**getRoutingEmailDomainRoute**](RoutingApi#getRoutingEmailDomainRoute) | Get a route |
| [**getRoutingEmailDomainRouteIdentityresolution**](RoutingApi#getRoutingEmailDomainRouteIdentityresolution) | Get a route identity resolution setting. |
| [**getRoutingEmailDomainRoutes**](RoutingApi#getRoutingEmailDomainRoutes) | Get routes |
| [**getRoutingEmailDomains**](RoutingApi#getRoutingEmailDomains) | Get domains |
| [**getRoutingEmailOutboundDomain**](RoutingApi#getRoutingEmailOutboundDomain) | Get domain |
| [**getRoutingEmailOutboundDomainActivation**](RoutingApi#getRoutingEmailOutboundDomainActivation) | Get activation status (cname + dkim) of an outbound domain |
| [**getRoutingEmailOutboundDomainSearch**](RoutingApi#getRoutingEmailOutboundDomainSearch) | Search a domain across organizations |
| [**getRoutingEmailOutboundDomains**](RoutingApi#getRoutingEmailOutboundDomains) | Get outbound domains |
| [**getRoutingEmailSetup**](RoutingApi#getRoutingEmailSetup) | Get email setup |
| [**getRoutingLanguage**](RoutingApi#getRoutingLanguage) | Get a routing language |
| [**getRoutingLanguages**](RoutingApi#getRoutingLanguages) | Get the list of supported languages. |
| [**getRoutingMessageRecipient**](RoutingApi#getRoutingMessageRecipient) | Get a recipient |
| [**getRoutingMessageRecipients**](RoutingApi#getRoutingMessageRecipients) | Get recipients |
| [**getRoutingPredictor**](RoutingApi#getRoutingPredictor) | Retrieve a single predictor. |
| [**getRoutingPredictorModelFeatures**](RoutingApi#getRoutingPredictorModelFeatures) | Retrieve Predictor Model Features. |
| [**getRoutingPredictorModels**](RoutingApi#getRoutingPredictorModels) | Retrieve Predictor Models and Top Features. |
| [**getRoutingPredictors**](RoutingApi#getRoutingPredictors) | Retrieve all predictors. |
| [**getRoutingPredictorsKeyperformanceindicators**](RoutingApi#getRoutingPredictorsKeyperformanceindicators) | Get a list of Key Performance Indicators |
| [**getRoutingQueue**](RoutingApi#getRoutingQueue) | Get details about this queue. |
| [**getRoutingQueueAssistant**](RoutingApi#getRoutingQueueAssistant) | Get an assistant associated with a queue. |
| [**getRoutingQueueComparisonperiod**](RoutingApi#getRoutingQueueComparisonperiod) | Get a Comparison Period. |
| [**getRoutingQueueComparisonperiods**](RoutingApi#getRoutingQueueComparisonperiods) | Get list of comparison periods |
| [**getRoutingQueueEstimatedwaittime**](RoutingApi#getRoutingQueueEstimatedwaittime) | Get Estimated Wait Time |
| [**getRoutingQueueIdentityresolution**](RoutingApi#getRoutingQueueIdentityresolution) | Get Queue IdentityResolution Settings. |
| [**getRoutingQueueMediatypeEstimatedwaittime**](RoutingApi#getRoutingQueueMediatypeEstimatedwaittime) | Get Estimated Wait Time |
| [**getRoutingQueueMembers**](RoutingApi#getRoutingQueueMembers) | Get the members of this queue. |
| [**getRoutingQueueUsers**](RoutingApi#getRoutingQueueUsers) | DEPRECATED: use GET /routing/queues/{queueId}/members.  Get the members of this queue. |
| [**getRoutingQueueWrapupcodes**](RoutingApi#getRoutingQueueWrapupcodes) | Get the wrap-up codes for a queue |
| [**getRoutingQueues**](RoutingApi#getRoutingQueues) | Get list of queues. |
| [**getRoutingQueuesDivisionviews**](RoutingApi#getRoutingQueuesDivisionviews) | Get a paged listing of simplified queue objects, filterable by name, queue ID(s), or division ID(s). |
| [**getRoutingQueuesDivisionviewsAll**](RoutingApi#getRoutingQueuesDivisionviewsAll) | Get a paged listing of simplified queue objects, sorted by name.  Can be used to get a digest of all queues in an organization. |
| [**getRoutingQueuesMe**](RoutingApi#getRoutingQueuesMe) | Get a paged listing of queues the user is a member of. |
| [**getRoutingSettings**](RoutingApi#getRoutingSettings) | Get an organization's routing settings |
| [**getRoutingSettingsContactcenter**](RoutingApi#getRoutingSettingsContactcenter) | Get Contact Center Settings |
| [**getRoutingSettingsTranscription**](RoutingApi#getRoutingSettingsTranscription) | Get Transcription Settings |
| [**getRoutingSkill**](RoutingApi#getRoutingSkill) | Get Routing Skill |
| [**getRoutingSkillgroup**](RoutingApi#getRoutingSkillgroup) | Get skill group |
| [**getRoutingSkillgroupMembers**](RoutingApi#getRoutingSkillgroupMembers) | Get skill group members |
| [**getRoutingSkillgroupMembersDivisions**](RoutingApi#getRoutingSkillgroupMembersDivisions) | Get list of member divisions for this skill group. |
| [**getRoutingSkillgroups**](RoutingApi#getRoutingSkillgroups) | Get skill group listing |
| [**getRoutingSkills**](RoutingApi#getRoutingSkills) | Get the list of routing skills. |
| [**getRoutingSmsAddress**](RoutingApi#getRoutingSmsAddress) | Get an Address by Id for SMS |
| [**getRoutingSmsAddresses**](RoutingApi#getRoutingSmsAddresses) | Get a list of Addresses for SMS |
| [**getRoutingSmsAvailablephonenumbers**](RoutingApi#getRoutingSmsAvailablephonenumbers) | Get a list of available phone numbers for SMS provisioning. |
| [**getRoutingSmsIdentityresolutionPhonenumber**](RoutingApi#getRoutingSmsIdentityresolutionPhonenumber) | Get a SMS identity resolution settings. |
| [**getRoutingSmsPhonenumber**](RoutingApi#getRoutingSmsPhonenumber) | Get a phone number provisioned for SMS. |
| [**getRoutingSmsPhonenumbers**](RoutingApi#getRoutingSmsPhonenumbers) | Get a list of provisioned phone numbers. |
| [**getRoutingUserDirectroutingbackupSettings**](RoutingApi#getRoutingUserDirectroutingbackupSettings) | Get the user's Direct Routing Backup settings. |
| [**getRoutingUserUtilization**](RoutingApi#getRoutingUserUtilization) | Get the user's max utilization settings.  If not configured, the organization-wide default is returned. |
| [**getRoutingUtilization**](RoutingApi#getRoutingUtilization) | Get the organization-wide max utilization settings. |
| [**getRoutingUtilizationLabel**](RoutingApi#getRoutingUtilizationLabel) | Get details about this utilization label |
| [**getRoutingUtilizationLabelAgents**](RoutingApi#getRoutingUtilizationLabelAgents) | Get list of agent ids associated with a utilization label |
| [**getRoutingUtilizationLabels**](RoutingApi#getRoutingUtilizationLabels) | Get list of utilization labels |
| [**getRoutingUtilizationTag**](RoutingApi#getRoutingUtilizationTag) | Get details about this utilization tag |
| [**getRoutingUtilizationTagAgents**](RoutingApi#getRoutingUtilizationTagAgents) | Get list of agent ids associated with a utilization tag |
| [**getRoutingUtilizationTags**](RoutingApi#getRoutingUtilizationTags) | Get list of utilization tags |
| [**getRoutingWrapupcode**](RoutingApi#getRoutingWrapupcode) | Get details about this wrap-up code. |
| [**getRoutingWrapupcodes**](RoutingApi#getRoutingWrapupcodes) | Get list of wrapup codes. |
| [**getRoutingWrapupcodesDivisionview**](RoutingApi#getRoutingWrapupcodesDivisionview) | Get a simplified wrap-up code. |
| [**getRoutingWrapupcodesDivisionviews**](RoutingApi#getRoutingWrapupcodesDivisionviews) | Get a paged listing of simplified wrapup code objects, filterable by name, wrapup code ID(s), or division ID(s). |
| [**getUserQueues**](RoutingApi#getUserQueues) | Get queues for user |
| [**getUserRoutinglanguages**](RoutingApi#getUserRoutinglanguages) | List routing languages assigned to a user |
| [**getUserRoutingskills**](RoutingApi#getUserRoutingskills) | List routing skills assigned to a user |
| [**getUserSkillgroups**](RoutingApi#getUserSkillgroups) | Get skill groups for a user |
| [**patchRoutingConversation**](RoutingApi#patchRoutingConversation) | Update attributes of an in-queue conversation |
| [**patchRoutingEmailDomain**](RoutingApi#patchRoutingEmailDomain) | Update domain settings |
| [**patchRoutingEmailDomainValidate**](RoutingApi#patchRoutingEmailDomainValidate) | Validate domain settings |
| [**patchRoutingPredictor**](RoutingApi#patchRoutingPredictor) | Update single predictor. |
| [**patchRoutingQueueMember**](RoutingApi#patchRoutingQueueMember) | Update the ring number OR joined status for a queue member. |
| [**patchRoutingQueueMembers**](RoutingApi#patchRoutingQueueMembers) | Join or unjoin a set of up to 100 users for a queue |
| [**patchRoutingQueueUser**](RoutingApi#patchRoutingQueueUser) | DEPRECATED: use PATCH /routing/queues/{queueId}/members/{memberId}.  Update the ring number OR joined status for a User in a Queue. |
| [**patchRoutingQueueUsers**](RoutingApi#patchRoutingQueueUsers) | DEPRECATED: use PATCH /routing/queues/{queueId}/members.  Join or unjoin a set of users for a queue. |
| [**patchRoutingSettingsContactcenter**](RoutingApi#patchRoutingSettingsContactcenter) | Update Contact Center Settings |
| [**patchRoutingSettingsTranscription**](RoutingApi#patchRoutingSettingsTranscription) | Patch Transcription Settings |
| [**patchRoutingSkillgroup**](RoutingApi#patchRoutingSkillgroup) | Update skill group definition |
| [**patchRoutingSmsPhonenumber**](RoutingApi#patchRoutingSmsPhonenumber) | Update a phone number provisioned for SMS. |
| [**patchUserQueue**](RoutingApi#patchUserQueue) | Join or unjoin a queue for a user |
| [**patchUserQueues**](RoutingApi#patchUserQueues) | Join or unjoin a set of queues for a user |
| [**patchUserRoutinglanguage**](RoutingApi#patchUserRoutinglanguage) | Update an assigned routing language's proficiency |
| [**patchUserRoutinglanguagesBulk**](RoutingApi#patchUserRoutinglanguagesBulk) | Assign multiple routing languages to a user. Max 50 routing languages in request body |
| [**patchUserRoutingskillsBulk**](RoutingApi#patchUserRoutingskillsBulk) | Assign multiple routing skills to a user |
| [**postAnalyticsQueuesObservationsQuery**](RoutingApi#postAnalyticsQueuesObservationsQuery) | Query for queue observations |
| [**postAnalyticsRoutingActivityQuery**](RoutingApi#postAnalyticsRoutingActivityQuery) | Query for user activity observations |
| [**postRoutingAssessments**](RoutingApi#postRoutingAssessments) | Create a benefit assessment. |
| [**postRoutingAssessmentsJobs**](RoutingApi#postRoutingAssessmentsJobs) | Create a benefit assessment job. |
| [**postRoutingEmailDomainRoutes**](RoutingApi#postRoutingEmailDomainRoutes) | Create a route |
| [**postRoutingEmailDomainTestconnection**](RoutingApi#postRoutingEmailDomainTestconnection) | Tests the custom SMTP server integration connection set on this domain |
| [**postRoutingEmailDomains**](RoutingApi#postRoutingEmailDomains) | Create a domain |
| [**postRoutingEmailOutboundDomains**](RoutingApi#postRoutingEmailOutboundDomains) | Create a domain |
| [**postRoutingEmailOutboundDomainsSimulated**](RoutingApi#postRoutingEmailOutboundDomainsSimulated) | Create a simulated domain |
| [**postRoutingLanguages**](RoutingApi#postRoutingLanguages) | Create Language |
| [**postRoutingPredictors**](RoutingApi#postRoutingPredictors) | Create a predictor. |
| [**postRoutingQueueMembers**](RoutingApi#postRoutingQueueMembers) | Bulk add or delete up to 100 queue members |
| [**postRoutingQueueUsers**](RoutingApi#postRoutingQueueUsers) | DEPRECATED: use POST /routing/queues/{queueId}/members.  Bulk add or delete up to 100 queue members. |
| [**postRoutingQueueWrapupcodes**](RoutingApi#postRoutingQueueWrapupcodes) | Add up to 100 wrap-up codes to a queue |
| [**postRoutingQueues**](RoutingApi#postRoutingQueues) | Create a queue |
| [**postRoutingSkillgroupMembersDivisions**](RoutingApi#postRoutingSkillgroupMembersDivisions) | Add or remove member divisions for this skill group. |
| [**postRoutingSkillgroups**](RoutingApi#postRoutingSkillgroups) | Create a skill group |
| [**postRoutingSkills**](RoutingApi#postRoutingSkills) | Create Skill |
| [**postRoutingSmsAddresses**](RoutingApi#postRoutingSmsAddresses) | Provision an Address for SMS |
| [**postRoutingSmsPhonenumbers**](RoutingApi#postRoutingSmsPhonenumbers) | Provision a phone number for SMS |
| [**postRoutingSmsPhonenumbersAlphanumeric**](RoutingApi#postRoutingSmsPhonenumbersAlphanumeric) | Provision an alphanumeric number for SMS |
| [**postRoutingSmsPhonenumbersImport**](RoutingApi#postRoutingSmsPhonenumbersImport) | Imports a phone number for SMS |
| [**postRoutingUtilizationLabels**](RoutingApi#postRoutingUtilizationLabels) | Create a utilization label |
| [**postRoutingUtilizationTags**](RoutingApi#postRoutingUtilizationTags) | Create an utilization tag |
| [**postRoutingWrapupcodes**](RoutingApi#postRoutingWrapupcodes) | Create a wrap-up code |
| [**postUserRoutinglanguages**](RoutingApi#postUserRoutinglanguages) | Assign a routing language to a user |
| [**postUserRoutingskills**](RoutingApi#postUserRoutingskills) | Assign a routing skill to a user |
| [**putRoutingDirectroutingbackupSettingsMe**](RoutingApi#putRoutingDirectroutingbackupSettingsMe) | Update the user's Direct Routing Backup settings. |
| [**putRoutingEmailDomainRoute**](RoutingApi#putRoutingEmailDomainRoute) | Update a route |
| [**putRoutingEmailDomainRouteIdentityresolution**](RoutingApi#putRoutingEmailDomainRouteIdentityresolution) | Update identity resolution settings for a route. |
| [**putRoutingEmailOutboundDomainActivation**](RoutingApi#putRoutingEmailOutboundDomainActivation) | Request an activation status (cname + dkim) update of an outbound domain |
| [**putRoutingMessageRecipient**](RoutingApi#putRoutingMessageRecipient) | Update a recipient |
| [**putRoutingQueue**](RoutingApi#putRoutingQueue) | Update a queue |
| [**putRoutingQueueIdentityresolution**](RoutingApi#putRoutingQueueIdentityresolution) | Update Queue IdentityResolution Settings. |
| [**putRoutingSettings**](RoutingApi#putRoutingSettings) | Update an organization's routing settings |
| [**putRoutingSettingsTranscription**](RoutingApi#putRoutingSettingsTranscription) | Update Transcription Settings |
| [**putRoutingSmsIdentityresolutionPhonenumber**](RoutingApi#putRoutingSmsIdentityresolutionPhonenumber) | Update an SMS identity resolution settings. |
| [**putRoutingUserDirectroutingbackupSettings**](RoutingApi#putRoutingUserDirectroutingbackupSettings) | Update the user's Direct Routing Backup settings. |
| [**putRoutingUserUtilization**](RoutingApi#putRoutingUserUtilization) | Update the user's max utilization settings.  Include only those media types requiring custom configuration. |
| [**putRoutingUtilization**](RoutingApi#putRoutingUtilization) | Update the organization-wide max utilization settings.  Include only those media types requiring custom configuration. |
| [**putRoutingUtilizationLabel**](RoutingApi#putRoutingUtilizationLabel) | Update a utilization label |
| [**putRoutingWrapupcode**](RoutingApi#putRoutingWrapupcode) | Update wrap-up code |
| [**putUserRoutingskill**](RoutingApi#putUserRoutingskill) | Update an assigned routing skill's proficiency |
| [**putUserRoutingskillsBulk**](RoutingApi#putUserRoutingskillsBulk) | Assign multiple routing skills to a user, replacing any current assignments |
{: class="table-striped"}


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
    apiInstance.deleteRoutingDirectroutingbackupSettingsMe();
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteRoutingDirectroutingbackupSettingsMe");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

null (empty response body)


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


# **deleteRoutingEmailOutboundDomain**


> Void deleteRoutingEmailOutboundDomain(domainId)

Delete an outbound domain

Wraps DELETE /api/v2/routing/email/outbound/domains/{domainId}  

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
    apiInstance.deleteRoutingEmailOutboundDomain(domainId);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteRoutingEmailOutboundDomain");
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


# **deleteRoutingLanguage**


> Void deleteRoutingLanguage(languageId)

Delete a routing language

Wraps DELETE /api/v2/routing/languages/{languageId}  

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
String languageId = "languageId_example"; // String | Language ID
try {
    apiInstance.deleteRoutingLanguage(languageId);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteRoutingLanguage");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **languageId** | **String**| Language ID | 
{: class="table-striped"}


### Return type

null (empty response body)


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


# **deleteRoutingQueueUser**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

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


# **deleteRoutingSettings**


> Void deleteRoutingSettings()

Delete an organization's routing settings

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


# **deleteRoutingSkillgroup**


> Void deleteRoutingSkillgroup(skillGroupId)

Remove skill group definition

Wraps DELETE /api/v2/routing/skillgroups/{skillGroupId}  

Requires ANY permissions: 

* routing:skillGroup:delete

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
String skillGroupId = "skillGroupId_example"; // String | Skill Group ID
try {
    apiInstance.deleteRoutingSkillgroup(skillGroupId);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteRoutingSkillgroup");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **skillGroupId** | **String**| Skill Group ID | 
{: class="table-striped"}


### Return type

null (empty response body)


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


# **deleteRoutingSmsPhonenumber**


> Void deleteRoutingSmsPhonenumber(phoneNumberId)

Delete a phone number provisioned for SMS.

Wraps DELETE /api/v2/routing/sms/phonenumbers/{phoneNumberId}  

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
String phoneNumberId = "phoneNumberId_example"; // String | phone number
try {
    apiInstance.deleteRoutingSmsPhonenumber(phoneNumberId);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteRoutingSmsPhonenumber");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **phoneNumberId** | **String**| phone number | 
{: class="table-striped"}


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
    apiInstance.deleteRoutingUserDirectroutingbackupSettings(userId);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteRoutingUserDirectroutingbackupSettings");
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


# **deleteRoutingUtilizationLabel**


> Void deleteRoutingUtilizationLabel(labelId, forceDelete)

Delete a utilization label

Wraps DELETE /api/v2/routing/utilization/labels/{labelId}  

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
String labelId = "labelId_example"; // String | Utilization Label ID
Boolean forceDelete = false; // Boolean | Remove all label usages (if found) without warning
try {
    apiInstance.deleteRoutingUtilizationLabel(labelId, forceDelete);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteRoutingUtilizationLabel");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **labelId** | **String**| Utilization Label ID | 
| **forceDelete** | **Boolean**| Remove all label usages (if found) without warning | [optional] [default to false] 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteRoutingUtilizationTag**


> Void deleteRoutingUtilizationTag(tagId, forceDelete)

Delete an utilization tag

deleteRoutingUtilizationTag is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps DELETE /api/v2/routing/utilization/tags/{tagId}  

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
String tagId = "tagId_example"; // String | Utilization Tag ID
Boolean forceDelete = false; // Boolean | Remove all tag usages (if found) without warning
try {
    apiInstance.deleteRoutingUtilizationTag(tagId, forceDelete);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteRoutingUtilizationTag");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tagId** | **String**| Utilization Tag ID | 
| **forceDelete** | **Boolean**| Remove all tag usages (if found) without warning | [optional] [default to false] 
{: class="table-striped"}


### Return type

null (empty response body)


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


# **deleteUserRoutinglanguage**


> Void deleteUserRoutinglanguage(userId, languageId)

Remove a routing language from a user

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


# **deleteUserRoutingskill**


> Void deleteUserRoutingskill(userId, skillId)

Remove a routing skill from a user

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


# **getRoutingAssessment**


> [BenefitAssessment](BenefitAssessment) getRoutingAssessment(assessmentId)

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

[**BenefitAssessment**](BenefitAssessment)


# **getRoutingAssessments**


> [AssessmentListing](AssessmentListing) getRoutingAssessments(before, after, limit, pageSize, queueId)

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
String limit = "limit_example"; // String | Number of entities to return. Maximum of 200. Deprecated in favour of pageSize
String pageSize = "pageSize_example"; // String | Number of entities to return. Maximum of 200.
List<String> queueId = Arrays.asList(null); // List<String> | Queue ID(s) to filter assessments by.
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
| **limit** | **String**| Number of entities to return. Maximum of 200. Deprecated in favour of pageSize | [optional] 
| **pageSize** | **String**| Number of entities to return. Maximum of 200. | [optional] 
| **queueId** | [**List&lt;String&gt;**](String)| Queue ID(s) to filter assessments by. | [optional] 
{: class="table-striped"}


### Return type

[**AssessmentListing**](AssessmentListing)


# **getRoutingAssessmentsJob**


> [BenefitAssessmentJob](BenefitAssessmentJob) getRoutingAssessmentsJob(jobId)

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

[**BenefitAssessmentJob**](BenefitAssessmentJob)


# **getRoutingAssessmentsJobs**


> [AssessmentJobListing](AssessmentJobListing) getRoutingAssessmentsJobs(divisionId)

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
List<String> divisionId = Arrays.asList(null); // List<String> | Division ID(s) to filter assessment jobs by.
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
| **divisionId** | [**List&lt;String&gt;**](String)| Division ID(s) to filter assessment jobs by. | [optional] 
{: class="table-striped"}


### Return type

[**AssessmentJobListing**](AssessmentJobListing)


# **getRoutingAvailablemediatypes**


> [AvailableMediaTypeEntityListing](AvailableMediaTypeEntityListing) getRoutingAvailablemediatypes()

Get available media types

Wraps GET /api/v2/routing/availablemediatypes  

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
    AvailableMediaTypeEntityListing result = apiInstance.getRoutingAvailablemediatypes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingAvailablemediatypes");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**AvailableMediaTypeEntityListing**](AvailableMediaTypeEntityListing)


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
    AgentDirectRoutingBackupSettings result = apiInstance.getRoutingDirectroutingbackupSettingsMe();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingDirectroutingbackupSettingsMe");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**AgentDirectRoutingBackupSettings**](AgentDirectRoutingBackupSettings)


# **getRoutingEmailDomain**


> [InboundDomain](InboundDomain) getRoutingEmailDomain(domainId)

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

[**InboundDomain**](InboundDomain)


# **getRoutingEmailDomainRoute**


> [InboundRoute](InboundRoute) getRoutingEmailDomainRoute(domainName, routeId, expand)

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
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand
try {
    InboundRoute result = apiInstance.getRoutingEmailDomainRoute(domainName, routeId, expand);
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
| **expand** | [**List&lt;String&gt;**](String)| Which fields, if any, to expand | [optional]<br />**Values**: identityresolution 
{: class="table-striped"}


### Return type

[**InboundRoute**](InboundRoute)


# **getRoutingEmailDomainRouteIdentityresolution**


> [IdentityResolutionConfig](IdentityResolutionConfig) getRoutingEmailDomainRouteIdentityresolution(domainName, routeId)

Get a route identity resolution setting.

Wraps GET /api/v2/routing/email/domains/{domainName}/routes/{routeId}/identityresolution  

Requires ALL permissions: 

* routing:email:manage
* routing:identityResolution:view

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
    IdentityResolutionConfig result = apiInstance.getRoutingEmailDomainRouteIdentityresolution(domainName, routeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingEmailDomainRouteIdentityresolution");
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

[**IdentityResolutionConfig**](IdentityResolutionConfig)


# **getRoutingEmailDomainRoutes**


> [InboundRouteEntityListing](InboundRouteEntityListing) getRoutingEmailDomainRoutes(domainName, pageSize, pageNumber, pattern, expand)

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
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand
try {
    InboundRouteEntityListing result = apiInstance.getRoutingEmailDomainRoutes(domainName, pageSize, pageNumber, pattern, expand);
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
| **expand** | [**List&lt;String&gt;**](String)| Which fields, if any, to expand | [optional]<br />**Values**: identityresolution 
{: class="table-striped"}


### Return type

[**InboundRouteEntityListing**](InboundRouteEntityListing)


# **getRoutingEmailDomains**


> [InboundDomainEntityListing](InboundDomainEntityListing) getRoutingEmailDomains(pageSize, pageNumber, excludeStatus, filter)

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
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
Boolean excludeStatus = false; // Boolean | Exclude MX record data
String filter = "filter_example"; // String | Optional search filter that, if defined, use the **filter** syntax, eg: **mySearchedPattern**. Note that **** is considered no filter.
try {
    InboundDomainEntityListing result = apiInstance.getRoutingEmailDomains(pageSize, pageNumber, excludeStatus, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingEmailDomains");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **excludeStatus** | **Boolean**| Exclude MX record data | [optional] [default to false] 
| **filter** | **String**| Optional search filter that, if defined, use the **filter** syntax, eg: **mySearchedPattern**. Note that **** is considered no filter. | [optional] 
{: class="table-striped"}


### Return type

[**InboundDomainEntityListing**](InboundDomainEntityListing)


# **getRoutingEmailOutboundDomain**


> [OutboundDomain](OutboundDomain) getRoutingEmailOutboundDomain(domainId)

Get domain

Wraps GET /api/v2/routing/email/outbound/domains/{domainId}  

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
    OutboundDomain result = apiInstance.getRoutingEmailOutboundDomain(domainId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingEmailOutboundDomain");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **domainId** | **String**| domain ID | 
{: class="table-striped"}


### Return type

[**OutboundDomain**](OutboundDomain)


# **getRoutingEmailOutboundDomainActivation**


> [EmailOutboundDomainResult](EmailOutboundDomainResult) getRoutingEmailOutboundDomainActivation(domainId)

Get activation status (cname + dkim) of an outbound domain

Wraps GET /api/v2/routing/email/outbound/domains/{domainId}/activation  

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
    EmailOutboundDomainResult result = apiInstance.getRoutingEmailOutboundDomainActivation(domainId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingEmailOutboundDomainActivation");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **domainId** | **String**| domain ID | 
{: class="table-striped"}


### Return type

[**EmailOutboundDomainResult**](EmailOutboundDomainResult)


# **getRoutingEmailOutboundDomainSearch**


> [OutboundDomain](OutboundDomain) getRoutingEmailOutboundDomainSearch(domainId)

Search a domain across organizations

Wraps GET /api/v2/routing/email/outbound/domains/{domainId}/search  

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
    OutboundDomain result = apiInstance.getRoutingEmailOutboundDomainSearch(domainId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingEmailOutboundDomainSearch");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **domainId** | **String**| domain ID | 
{: class="table-striped"}


### Return type

[**OutboundDomain**](OutboundDomain)


# **getRoutingEmailOutboundDomains**


> [OutboundDomainEntityListing](OutboundDomainEntityListing) getRoutingEmailOutboundDomains(pageSize, pageNumber, filter)

Get outbound domains

Wraps GET /api/v2/routing/email/outbound/domains  

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
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String filter = "filter_example"; // String | Optional search filter that, if defined, use the **filter** syntax, eg: **mySearchedPattern**. Note that **** is considered no filter.
try {
    OutboundDomainEntityListing result = apiInstance.getRoutingEmailOutboundDomains(pageSize, pageNumber, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingEmailOutboundDomains");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **filter** | **String**| Optional search filter that, if defined, use the **filter** syntax, eg: **mySearchedPattern**. Note that **** is considered no filter. | [optional] 
{: class="table-striped"}


### Return type

[**OutboundDomainEntityListing**](OutboundDomainEntityListing)


# **getRoutingEmailSetup**


> [EmailSetup](EmailSetup) getRoutingEmailSetup()

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

[**EmailSetup**](EmailSetup)


# **getRoutingLanguage**


> [Language](Language) getRoutingLanguage(languageId)

Get a routing language

Wraps GET /api/v2/routing/languages/{languageId}  

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
String languageId = "languageId_example"; // String | Language ID
try {
    Language result = apiInstance.getRoutingLanguage(languageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingLanguage");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **languageId** | **String**| Language ID | 
{: class="table-striped"}


### Return type

[**Language**](Language)


# **getRoutingLanguages**


> [LanguageEntityListing](LanguageEntityListing) getRoutingLanguages(pageSize, pageNumber, sortOrder, name, id)

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
List<String> id = Arrays.asList(null); // List<String> | id
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
| **id** | [**List&lt;String&gt;**](String)| id | [optional] 
{: class="table-striped"}


### Return type

[**LanguageEntityListing**](LanguageEntityListing)


# **getRoutingMessageRecipient**


> [Recipient](Recipient) getRoutingMessageRecipient(recipientId)

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

[**Recipient**](Recipient)


# **getRoutingMessageRecipients**


> [RecipientListing](RecipientListing) getRoutingMessageRecipients(messengerType, name, pageSize, pageNumber)

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
String name = "name_example"; // String | Recipient Name
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    RecipientListing result = apiInstance.getRoutingMessageRecipients(messengerType, name, pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingMessageRecipients");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **messengerType** | **String**| Messenger Type | [optional]<br />**Values**: sms, facebook, twitter, whatsapp, open, instagram, apple 
| **name** | **String**| Recipient Name | [optional] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
{: class="table-striped"}


### Return type

[**RecipientListing**](RecipientListing)


# **getRoutingPredictor**


> [Predictor](Predictor) getRoutingPredictor(predictorId)

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

[**Predictor**](Predictor)


# **getRoutingPredictorModelFeatures**


> [PredictorModelFeatureListing](PredictorModelFeatureListing) getRoutingPredictorModelFeatures(predictorId, modelId)

Retrieve Predictor Model Features.

Wraps GET /api/v2/routing/predictors/{predictorId}/models/{modelId}/features  

Requires ALL permissions: 

* routing:predictorModelFeature:view

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
String modelId = "modelId_example"; // String | Model ID
try {
    PredictorModelFeatureListing result = apiInstance.getRoutingPredictorModelFeatures(predictorId, modelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingPredictorModelFeatures");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **predictorId** | **String**| Predictor ID | 
| **modelId** | **String**| Model ID | 
{: class="table-striped"}


### Return type

[**PredictorModelFeatureListing**](PredictorModelFeatureListing)


# **getRoutingPredictorModels**


> [PredictorModels](PredictorModels) getRoutingPredictorModels(predictorId)

Retrieve Predictor Models and Top Features.

Wraps GET /api/v2/routing/predictors/{predictorId}/models  

Requires ALL permissions: 

* routing:predictorModel:view

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
    PredictorModels result = apiInstance.getRoutingPredictorModels(predictorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingPredictorModels");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **predictorId** | **String**| Predictor ID | 
{: class="table-striped"}


### Return type

[**PredictorModels**](PredictorModels)


# **getRoutingPredictors**


> [PredictorListing](PredictorListing) getRoutingPredictors(before, after, limit, pageSize, queueId)

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
String limit = "limit_example"; // String | Number of entities to return. Maximum of 200. Deprecated in favour of pageSize
String pageSize = "pageSize_example"; // String | Number of entities to return. Maximum of 200.
List<String> queueId = Arrays.asList(null); // List<String> | Comma-separated list of queue Ids to filter by.
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
| **limit** | **String**| Number of entities to return. Maximum of 200. Deprecated in favour of pageSize | [optional] 
| **pageSize** | **String**| Number of entities to return. Maximum of 200. | [optional] 
| **queueId** | [**List&lt;String&gt;**](String)| Comma-separated list of queue Ids to filter by. | [optional] 
{: class="table-striped"}


### Return type

[**PredictorListing**](PredictorListing)


# **getRoutingPredictorsKeyperformanceindicators**


> [List&lt;KeyPerformanceIndicator&gt;](KeyPerformanceIndicator) getRoutingPredictorsKeyperformanceindicators(kpiGroup, expand)

Get a list of Key Performance Indicators

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
String kpiGroup = "kpiGroup_example"; // String | The Group of Key Performance Indicators to return
List<String> expand = Arrays.asList(null); // List<String> | Parameter to request additional data to return in KPI payload
try {
    List<KeyPerformanceIndicator> result = apiInstance.getRoutingPredictorsKeyperformanceindicators(kpiGroup, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingPredictorsKeyperformanceindicators");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **kpiGroup** | **String**| The Group of Key Performance Indicators to return | [optional]<br />**Values**: Standard, Custom 
| **expand** | [**List&lt;String&gt;**](String)| Parameter to request additional data to return in KPI payload | [optional]<br />**Values**: queues 
{: class="table-striped"}


### Return type

[**List&lt;KeyPerformanceIndicator&gt;**](KeyPerformanceIndicator)


# **getRoutingQueue**


> [Queue](Queue) getRoutingQueue(queueId, expand)

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
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand
try {
    Queue result = apiInstance.getRoutingQueue(queueId, expand);
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
| **expand** | [**List&lt;String&gt;**](String)| Which fields, if any, to expand | [optional]<br />**Values**: identityresolution 
{: class="table-striped"}


### Return type

[**Queue**](Queue)


# **getRoutingQueueAssistant**


> [AssistantQueue](AssistantQueue) getRoutingQueueAssistant(queueId, expand)

Get an assistant associated with a queue.

Wraps GET /api/v2/routing/queues/{queueId}/assistant  

Requires ALL permissions: 

* assistants:queue:view

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
String expand = "expand_example"; // String | Which fields, if any, to expand.
try {
    AssistantQueue result = apiInstance.getRoutingQueueAssistant(queueId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingQueueAssistant");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **queueId** | **String**| Queue ID | 
| **expand** | **String**| Which fields, if any, to expand. | [optional]<br />**Values**: assistant 
{: class="table-striped"}


### Return type

[**AssistantQueue**](AssistantQueue)


# **getRoutingQueueComparisonperiod**


> [ComparisonPeriod](ComparisonPeriod) getRoutingQueueComparisonperiod(queueId, comparisonPeriodId)

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

[**ComparisonPeriod**](ComparisonPeriod)


# **getRoutingQueueComparisonperiods**


> [ComparisonPeriodListing](ComparisonPeriodListing) getRoutingQueueComparisonperiods(queueId)

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

[**ComparisonPeriodListing**](ComparisonPeriodListing)


# **getRoutingQueueEstimatedwaittime**


> [EstimatedWaitTimePredictions](EstimatedWaitTimePredictions) getRoutingQueueEstimatedwaittime(queueId, conversationId)

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

[**EstimatedWaitTimePredictions**](EstimatedWaitTimePredictions)


# **getRoutingQueueIdentityresolution**


> [IdentityResolutionQueueConfig](IdentityResolutionQueueConfig) getRoutingQueueIdentityresolution(queueId)

Get Queue IdentityResolution Settings.

Wraps GET /api/v2/routing/queues/{queueId}/identityresolution  

Requires ALL permissions: 

* routing:queue:view
* routing:identityResolution:view

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
    IdentityResolutionQueueConfig result = apiInstance.getRoutingQueueIdentityresolution(queueId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingQueueIdentityresolution");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **queueId** | **String**| Queue ID | 
{: class="table-striped"}


### Return type

[**IdentityResolutionQueueConfig**](IdentityResolutionQueueConfig)


# **getRoutingQueueMediatypeEstimatedwaittime**


> [EstimatedWaitTimePredictions](EstimatedWaitTimePredictions) getRoutingQueueMediatypeEstimatedwaittime(queueId, mediaType, labelId)

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
String labelId = "labelId_example"; // String | Unique id that represents the interaction label used with media type for EWT calculation
try {
    EstimatedWaitTimePredictions result = apiInstance.getRoutingQueueMediatypeEstimatedwaittime(queueId, mediaType, labelId);
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
| **mediaType** | **String**| mediaType |<br />**Values**: all, call, chat, callback, email, videoComm, message 
| **labelId** | **String**| Unique id that represents the interaction label used with media type for EWT calculation | [optional] 
{: class="table-striped"}


### Return type

[**EstimatedWaitTimePredictions**](EstimatedWaitTimePredictions)


# **getRoutingQueueMembers**


> [QueueMemberEntityListing](QueueMemberEntityListing) getRoutingQueueMembers(queueId, pageNumber, pageSize, sortOrder, expand, name, profileSkills, skills, languages, routingStatus, presence, memberBy, joined)

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
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand.
String name = "name_example"; // String | Filter by queue member name (contains-style search)
List<String> profileSkills = Arrays.asList(null); // List<String> | Filter by profile skill (contains-style search)
List<String> skills = Arrays.asList(null); // List<String> | Filter by skill (contains-style search)
List<String> languages = Arrays.asList(null); // List<String> | Filter by language (contains-style search)
List<String> routingStatus = Arrays.asList(null); // List<String> | Filter by routing status
List<String> presence = Arrays.asList(null); // List<String> | Filter by presence
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
| **expand** | [**List&lt;String&gt;**](String)| Which fields, if any, to expand. | [optional]<br />**Values**: routingStatus, presence, integrationPresence, conversationSummary, outOfOffice, geolocation, station, authorization, lasttokenissued, authorization.unusedRoles, team, workPlanBidRanks, externalContactsSettings, groups, profileSkills, certifications, locations, skills, languages, languagePreference, employerInfo, biography, dateLastLogin, dateWelcomeSent 
| **name** | **String**| Filter by queue member name (contains-style search) | [optional] 
| **profileSkills** | [**List&lt;String&gt;**](String)| Filter by profile skill (contains-style search) | [optional] 
| **skills** | [**List&lt;String&gt;**](String)| Filter by skill (contains-style search) | [optional] 
| **languages** | [**List&lt;String&gt;**](String)| Filter by language (contains-style search) | [optional] 
| **routingStatus** | [**List&lt;String&gt;**](String)| Filter by routing status | [optional] 
| **presence** | [**List&lt;String&gt;**](String)| Filter by presence | [optional] 
| **memberBy** | **String**| Filter by member type | [optional]<br />**Values**: user, group 
| **joined** | **Boolean**| Filter by joined status | [optional]<br />**Values**: true, false 
{: class="table-striped"}


### Return type

[**QueueMemberEntityListing**](QueueMemberEntityListing)


# **getRoutingQueueUsers**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [QueueMemberEntityListingV1](QueueMemberEntityListingV1) getRoutingQueueUsers(queueId, pageNumber, pageSize, sortOrder, expand, joined, name, profileSkills, skills, languages, routingStatus, presence)

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
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand.
Boolean joined = true; // Boolean | Filter by joined status
String name = "name_example"; // String | Filter by queue member name
List<String> profileSkills = Arrays.asList(null); // List<String> | Filter by profile skill
List<String> skills = Arrays.asList(null); // List<String> | Filter by skill
List<String> languages = Arrays.asList(null); // List<String> | Filter by language
List<String> routingStatus = Arrays.asList(null); // List<String> | Filter by routing status
List<String> presence = Arrays.asList(null); // List<String> | Filter by presence
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
| **expand** | [**List&lt;String&gt;**](String)| Which fields, if any, to expand. | [optional]<br />**Values**: routingStatus, presence, integrationPresence, conversationSummary, outOfOffice, geolocation, station, authorization, lasttokenissued, authorization.unusedRoles, team, workPlanBidRanks, externalContactsSettings, groups, profileSkills, certifications, locations, skills, languages, languagePreference, employerInfo, biography, dateLastLogin, dateWelcomeSent 
| **joined** | **Boolean**| Filter by joined status | [optional] 
| **name** | **String**| Filter by queue member name | [optional] 
| **profileSkills** | [**List&lt;String&gt;**](String)| Filter by profile skill | [optional] 
| **skills** | [**List&lt;String&gt;**](String)| Filter by skill | [optional] 
| **languages** | [**List&lt;String&gt;**](String)| Filter by language | [optional] 
| **routingStatus** | [**List&lt;String&gt;**](String)| Filter by routing status | [optional] 
| **presence** | [**List&lt;String&gt;**](String)| Filter by presence | [optional] 
{: class="table-striped"}


### Return type

[**QueueMemberEntityListingV1**](QueueMemberEntityListingV1)


# **getRoutingQueueWrapupcodes**


> [WrapupCodeEntityListing](WrapupCodeEntityListing) getRoutingQueueWrapupcodes(queueId, pageSize, pageNumber, name)

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
String name = "name_example"; // String | Wrapup code's name (trailing asterisks allowed)
try {
    WrapupCodeEntityListing result = apiInstance.getRoutingQueueWrapupcodes(queueId, pageSize, pageNumber, name);
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
| **name** | **String**| Wrapup code&#39;s name (trailing asterisks allowed) | [optional] 
{: class="table-striped"}


### Return type

[**WrapupCodeEntityListing**](WrapupCodeEntityListing)


# **getRoutingQueues**


> [QueueEntityListing](QueueEntityListing) getRoutingQueues(pageNumber, pageSize, sortOrder, name, id, divisionId, peerId, cannedResponseLibraryId, hasPeer, expand)

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
String name = "name_example"; // String | Include only queues with the given name (leading and trailing asterisks allowed)
List<String> id = Arrays.asList(null); // List<String> | Include only queues with the specified ID(s)
List<String> divisionId = Arrays.asList(null); // List<String> | Include only queues in the specified division ID(s)
List<String> peerId = Arrays.asList(null); // List<String> | Include only queues with the specified peer ID(s)
String cannedResponseLibraryId = "cannedResponseLibraryId_example"; // String | Include only queues explicitly associated with the specified canned response library ID
Boolean hasPeer = true; // Boolean | Include only queues with a peer ID
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand
try {
    QueueEntityListing result = apiInstance.getRoutingQueues(pageNumber, pageSize, sortOrder, name, id, divisionId, peerId, cannedResponseLibraryId, hasPeer, expand);
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
| **name** | **String**| Include only queues with the given name (leading and trailing asterisks allowed) | [optional] 
| **id** | [**List&lt;String&gt;**](String)| Include only queues with the specified ID(s) | [optional] 
| **divisionId** | [**List&lt;String&gt;**](String)| Include only queues in the specified division ID(s) | [optional] 
| **peerId** | [**List&lt;String&gt;**](String)| Include only queues with the specified peer ID(s) | [optional] 
| **cannedResponseLibraryId** | **String**| Include only queues explicitly associated with the specified canned response library ID | [optional] 
| **hasPeer** | **Boolean**| Include only queues with a peer ID | [optional] 
| **expand** | [**List&lt;String&gt;**](String)| Which fields, if any, to expand | [optional]<br />**Values**: identityresolution 
{: class="table-striped"}


### Return type

[**QueueEntityListing**](QueueEntityListing)


# **getRoutingQueuesDivisionviews**


> [QueueEntityListing](QueueEntityListing) getRoutingQueuesDivisionviews(pageSize, pageNumber, sortBy, sortOrder, name, id, divisionId)

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
List<String> id = Arrays.asList(null); // List<String> | Queue ID(s)
List<String> divisionId = Arrays.asList(null); // List<String> | Division ID(s)
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
| **id** | [**List&lt;String&gt;**](String)| Queue ID(s) | [optional] 
| **divisionId** | [**List&lt;String&gt;**](String)| Division ID(s) | [optional] 
{: class="table-striped"}


### Return type

[**QueueEntityListing**](QueueEntityListing)


# **getRoutingQueuesDivisionviewsAll**


> [QueueEntityListing](QueueEntityListing) getRoutingQueuesDivisionviewsAll(pageSize, pageNumber, sortOrder)

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

[**QueueEntityListing**](QueueEntityListing)


# **getRoutingQueuesMe**


> [UserQueueEntityListing](UserQueueEntityListing) getRoutingQueuesMe(pageNumber, pageSize, joined, sortOrder)

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
| **joined** | **Boolean**| Filter by joined status. | [optional]<br />**Values**: true, false 
| **sortOrder** | **String**| Note: results are sorted by name. | [optional] [default to asc]<br />**Values**: asc, desc 
{: class="table-striped"}


### Return type

[**UserQueueEntityListing**](UserQueueEntityListing)


# **getRoutingSettings**


> [RoutingSettings](RoutingSettings) getRoutingSettings()

Get an organization's routing settings

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

[**RoutingSettings**](RoutingSettings)


# **getRoutingSettingsContactcenter**


> [ContactCenterSettings](ContactCenterSettings) getRoutingSettingsContactcenter()

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

[**ContactCenterSettings**](ContactCenterSettings)


# **getRoutingSettingsTranscription**


> [TranscriptionSettings](TranscriptionSettings) getRoutingSettingsTranscription()

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

[**TranscriptionSettings**](TranscriptionSettings)


# **getRoutingSkill**


> [RoutingSkill](RoutingSkill) getRoutingSkill(skillId)

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

[**RoutingSkill**](RoutingSkill)


# **getRoutingSkillgroup**


> [SkillGroup](SkillGroup) getRoutingSkillgroup(skillGroupId)

Get skill group

Wraps GET /api/v2/routing/skillgroups/{skillGroupId}  

Requires ANY permissions: 

* routing:skillGroup:view

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
String skillGroupId = "skillGroupId_example"; // String | Skill Group ID
try {
    SkillGroup result = apiInstance.getRoutingSkillgroup(skillGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingSkillgroup");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **skillGroupId** | **String**| Skill Group ID | 
{: class="table-striped"}


### Return type

[**SkillGroup**](SkillGroup)


# **getRoutingSkillgroupMembers**


> [SkillGroupMemberEntityListing](SkillGroupMemberEntityListing) getRoutingSkillgroupMembers(skillGroupId, pageSize, after, before, expand)

Get skill group members

Wraps GET /api/v2/routing/skillgroups/{skillGroupId}/members  

Requires ANY permissions: 

* routing:skillGroup:view

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
String skillGroupId = "skillGroupId_example"; // String | Skill Group ID
Integer pageSize = 25; // Integer | Page size
String after = "after_example"; // String | The cursor that points to the next item
String before = "before_example"; // String | The cursor that points to the previous item
String expand = "expand_example"; // String | Expand the name on each user
try {
    SkillGroupMemberEntityListing result = apiInstance.getRoutingSkillgroupMembers(skillGroupId, pageSize, after, before, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingSkillgroupMembers");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **skillGroupId** | **String**| Skill Group ID | 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **after** | **String**| The cursor that points to the next item | [optional] 
| **before** | **String**| The cursor that points to the previous item | [optional] 
| **expand** | **String**| Expand the name on each user | [optional]<br />**Values**: entities 
{: class="table-striped"}


### Return type

[**SkillGroupMemberEntityListing**](SkillGroupMemberEntityListing)


# **getRoutingSkillgroupMembersDivisions**


> [SkillGroupMemberDivisionList](SkillGroupMemberDivisionList) getRoutingSkillgroupMembersDivisions(skillGroupId, expand)

Get list of member divisions for this skill group.

Wraps GET /api/v2/routing/skillgroups/{skillGroupId}/members/divisions  

Requires ANY permissions: 

* routing:skillGroup:view

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
String skillGroupId = "skillGroupId_example"; // String | Skill Group ID
String expand = "expand_example"; // String | Expand the name on each user
try {
    SkillGroupMemberDivisionList result = apiInstance.getRoutingSkillgroupMembersDivisions(skillGroupId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingSkillgroupMembersDivisions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **skillGroupId** | **String**| Skill Group ID | 
| **expand** | **String**| Expand the name on each user | [optional]<br />**Values**: entities 
{: class="table-striped"}


### Return type

[**SkillGroupMemberDivisionList**](SkillGroupMemberDivisionList)


# **getRoutingSkillgroups**


> [SkillGroupEntityListing](SkillGroupEntityListing) getRoutingSkillgroups(pageSize, name, after, before)

Get skill group listing

Wraps GET /api/v2/routing/skillgroups  

Requires ANY permissions: 

* routing:skillGroup:view

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
String name = "name_example"; // String | Return only skill group names whose names start with this value (case-insensitive matching)
String after = "after_example"; // String | The cursor that points to the next item
String before = "before_example"; // String | The cursor that points to the previous item
try {
    SkillGroupEntityListing result = apiInstance.getRoutingSkillgroups(pageSize, name, after, before);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingSkillgroups");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **name** | **String**| Return only skill group names whose names start with this value (case-insensitive matching) | [optional] 
| **after** | **String**| The cursor that points to the next item | [optional] 
| **before** | **String**| The cursor that points to the previous item | [optional] 
{: class="table-striped"}


### Return type

[**SkillGroupEntityListing**](SkillGroupEntityListing)


# **getRoutingSkills**


> [SkillEntityListing](SkillEntityListing) getRoutingSkills(pageSize, pageNumber, name, id)

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
List<String> id = Arrays.asList(null); // List<String> | id
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
| **id** | [**List&lt;String&gt;**](String)| id | [optional] 
{: class="table-striped"}


### Return type

[**SkillEntityListing**](SkillEntityListing)


# **getRoutingSmsAddress**


> [SmsAddress](SmsAddress) getRoutingSmsAddress(addressId)

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

[**SmsAddress**](SmsAddress)


# **getRoutingSmsAddresses**


> [SmsAddressEntityListing](SmsAddressEntityListing) getRoutingSmsAddresses(pageSize, pageNumber)

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

[**SmsAddressEntityListing**](SmsAddressEntityListing)


# **getRoutingSmsAvailablephonenumbers**


> [SMSAvailablePhoneNumberEntityListing](SMSAvailablePhoneNumberEntityListing) getRoutingSmsAvailablephonenumbers(countryCode, phoneNumberType, region, city, areaCode, pattern, addressRequirement)

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

[**SMSAvailablePhoneNumberEntityListing**](SMSAvailablePhoneNumberEntityListing)


# **getRoutingSmsIdentityresolutionPhonenumber**


> [IdentityResolutionConfig](IdentityResolutionConfig) getRoutingSmsIdentityresolutionPhonenumber(addressId)

Get a SMS identity resolution settings.

Wraps GET /api/v2/routing/sms/identityresolution/phonenumbers/{addressId}  

Requires ALL permissions: 

* sms:phoneNumber:view
* routing:identityResolution:view

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
    IdentityResolutionConfig result = apiInstance.getRoutingSmsIdentityresolutionPhonenumber(addressId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingSmsIdentityresolutionPhonenumber");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **addressId** | **String**| Address ID | 
{: class="table-striped"}


### Return type

[**IdentityResolutionConfig**](IdentityResolutionConfig)


# **getRoutingSmsPhonenumber**


> [SmsPhoneNumber](SmsPhoneNumber) getRoutingSmsPhonenumber(phoneNumberId, expand)

Get a phone number provisioned for SMS.

Wraps GET /api/v2/routing/sms/phonenumbers/{phoneNumberId}  

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
String phoneNumberId = "phoneNumberId_example"; // String | phone number
String expand = "expand_example"; // String | Expand response with additional information
try {
    SmsPhoneNumber result = apiInstance.getRoutingSmsPhonenumber(phoneNumberId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingSmsPhonenumber");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **phoneNumberId** | **String**| phone number | 
| **expand** | **String**| Expand response with additional information | [optional]<br />**Values**: compliance, supportedContent 
{: class="table-striped"}


### Return type

[**SmsPhoneNumber**](SmsPhoneNumber)


# **getRoutingSmsPhonenumbers**


> [SmsPhoneNumberEntityListing](SmsPhoneNumberEntityListing) getRoutingSmsPhonenumbers(phoneNumber, phoneNumberType, phoneNumberStatus, countryCode, pageSize, pageNumber, sortBy, sortOrder, language, integrationId, supportedContentId, expand)

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
List<String> phoneNumberType = Arrays.asList(null); // List<String> | Filter on phone number type
List<String> phoneNumberStatus = Arrays.asList(null); // List<String> | Filter on phone number status
List<String> countryCode = Arrays.asList(null); // List<String> | Filter on country code
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortBy = "sortBy_example"; // String | Optional field to sort results
String sortOrder = "sortOrder_example"; // String | Sort order
String language = en-US; // String | A language tag (which is sometimes referred to as a \"locale identifier\") to use to localize country field and sort operations
String integrationId = "integrationId_example"; // String | Filter on the Genesys Cloud integration id to which the phone number belongs to
String supportedContentId = "supportedContentId_example"; // String | Filter based on the supported content ID
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand
try {
    SmsPhoneNumberEntityListing result = apiInstance.getRoutingSmsPhonenumbers(phoneNumber, phoneNumberType, phoneNumberStatus, countryCode, pageSize, pageNumber, sortBy, sortOrder, language, integrationId, supportedContentId, expand);
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
| **phoneNumberType** | [**List&lt;String&gt;**](String)| Filter on phone number type | [optional]<br />**Values**: local, mobile, tollfree, shortcode, alphanumeric 
| **phoneNumberStatus** | [**List&lt;String&gt;**](String)| Filter on phone number status | [optional]<br />**Values**: active, invalid, initiated, porting, pending, pending-cancellation 
| **countryCode** | [**List&lt;String&gt;**](String)| Filter on country code | [optional] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **sortBy** | **String**| Optional field to sort results | [optional]<br />**Values**: phoneNumber, countryCode, country, dateCreated, dateModified, phoneNumberStatus, phoneNumberType, purchaseDate, supportsMms, supportsSms, supportsVoice 
| **sortOrder** | **String**| Sort order | [optional]<br />**Values**: ascending, descending 
| **language** | **String**| A language tag (which is sometimes referred to as a \&quot;locale identifier\&quot;) to use to localize country field and sort operations | [optional] [default to &quot;en-US&quot;] 
| **integrationId** | **String**| Filter on the Genesys Cloud integration id to which the phone number belongs to | [optional] 
| **supportedContentId** | **String**| Filter based on the supported content ID | [optional] 
| **expand** | [**List&lt;String&gt;**](String)| Which fields, if any, to expand | [optional]<br />**Values**: identityresolution, supportedContent 
{: class="table-striped"}


### Return type

[**SmsPhoneNumberEntityListing**](SmsPhoneNumberEntityListing)


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
    AgentDirectRoutingBackupSettings result = apiInstance.getRoutingUserDirectroutingbackupSettings(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingUserDirectroutingbackupSettings");
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
    AgentMaxUtilizationResponse result = apiInstance.getRoutingUserUtilization(userId);
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

[**AgentMaxUtilizationResponse**](AgentMaxUtilizationResponse)


# **getRoutingUtilization**


> [UtilizationResponse](UtilizationResponse) getRoutingUtilization()

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
    UtilizationResponse result = apiInstance.getRoutingUtilization();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingUtilization");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**UtilizationResponse**](UtilizationResponse)


# **getRoutingUtilizationLabel**


> [UtilizationLabel](UtilizationLabel) getRoutingUtilizationLabel(labelId)

Get details about this utilization label

Wraps GET /api/v2/routing/utilization/labels/{labelId}  

Requires ALL permissions: 

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
String labelId = "labelId_example"; // String | Utilization Label ID
try {
    UtilizationLabel result = apiInstance.getRoutingUtilizationLabel(labelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingUtilizationLabel");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **labelId** | **String**| Utilization Label ID | 
{: class="table-striped"}


### Return type

[**UtilizationLabel**](UtilizationLabel)


# **getRoutingUtilizationLabelAgents**


> List&lt;Object&gt; getRoutingUtilizationLabelAgents(labelId)

Get list of agent ids associated with a utilization label

Wraps GET /api/v2/routing/utilization/labels/{labelId}/agents  

Requires ALL permissions: 

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
String labelId = "labelId_example"; // String | Utilization Label ID
try {
    List<Object> result = apiInstance.getRoutingUtilizationLabelAgents(labelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingUtilizationLabelAgents");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **labelId** | **String**| Utilization Label ID | 
{: class="table-striped"}


### Return type

**List&lt;Object&gt;**


# **getRoutingUtilizationLabels**


> [UtilizationLabelEntityListing](UtilizationLabelEntityListing) getRoutingUtilizationLabels(pageSize, pageNumber, sortOrder, name)

Get list of utilization labels

Wraps GET /api/v2/routing/utilization/labels  

Requires ALL permissions: 

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
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortOrder = "ascending"; // String | Sort order by name
String name = "name_example"; // String | Utilization label's name (Wildcard is supported, e.g., 'label1*', '*label*'
try {
    UtilizationLabelEntityListing result = apiInstance.getRoutingUtilizationLabels(pageSize, pageNumber, sortOrder, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingUtilizationLabels");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **sortOrder** | **String**| Sort order by name | [optional] [default to ascending]<br />**Values**: ascending, descending 
| **name** | **String**| Utilization label&#39;s name (Wildcard is supported, e.g., &#39;label1*&#39;, &#39;*label*&#39; | [optional] 
{: class="table-striped"}


### Return type

[**UtilizationLabelEntityListing**](UtilizationLabelEntityListing)


# **getRoutingUtilizationTag**


> [UtilizationTag](UtilizationTag) getRoutingUtilizationTag(tagId)

Get details about this utilization tag

getRoutingUtilizationTag is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/routing/utilization/tags/{tagId}  

Requires ALL permissions: 

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
String tagId = "tagId_example"; // String | Utilization Tag ID
try {
    UtilizationTag result = apiInstance.getRoutingUtilizationTag(tagId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingUtilizationTag");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tagId** | **String**| Utilization Tag ID | 
{: class="table-striped"}


### Return type

[**UtilizationTag**](UtilizationTag)


# **getRoutingUtilizationTagAgents**


> List&lt;Object&gt; getRoutingUtilizationTagAgents(tagId)

Get list of agent ids associated with a utilization tag

getRoutingUtilizationTagAgents is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/routing/utilization/tags/{tagId}/agents  

Requires ALL permissions: 

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
String tagId = "tagId_example"; // String | Utilization Tag ID
try {
    List<Object> result = apiInstance.getRoutingUtilizationTagAgents(tagId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingUtilizationTagAgents");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tagId** | **String**| Utilization Tag ID | 
{: class="table-striped"}


### Return type

**List&lt;Object&gt;**


# **getRoutingUtilizationTags**


> [UtilizationTagEntityListing](UtilizationTagEntityListing) getRoutingUtilizationTags(pageSize, pageNumber, sortOrder, name)

Get list of utilization tags

getRoutingUtilizationTags is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/routing/utilization/tags  

Requires ALL permissions: 

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
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortOrder = "ascending"; // String | Sort order by name
String name = "name_example"; // String | Utilization tag's name (Wildcard is supported, e.g., 'tag1*')
try {
    UtilizationTagEntityListing result = apiInstance.getRoutingUtilizationTags(pageSize, pageNumber, sortOrder, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingUtilizationTags");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **sortOrder** | **String**| Sort order by name | [optional] [default to ascending]<br />**Values**: ascending, descending 
| **name** | **String**| Utilization tag&#39;s name (Wildcard is supported, e.g., &#39;tag1*&#39;) | [optional] 
{: class="table-striped"}


### Return type

[**UtilizationTagEntityListing**](UtilizationTagEntityListing)


# **getRoutingWrapupcode**


> [WrapupCode](WrapupCode) getRoutingWrapupcode(codeId)

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

[**WrapupCode**](WrapupCode)


# **getRoutingWrapupcodes**


> [WrapupCodeEntityListing](WrapupCodeEntityListing) getRoutingWrapupcodes(pageSize, pageNumber, sortBy, sortOrder, name, id, divisionId)

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
List<String> id = Arrays.asList(null); // List<String> | Filter by wrapup code ID(s)
List<String> divisionId = Arrays.asList(null); // List<String> | Filter by division ID(s)
try {
    WrapupCodeEntityListing result = apiInstance.getRoutingWrapupcodes(pageSize, pageNumber, sortBy, sortOrder, name, id, divisionId);
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
| **id** | [**List&lt;String&gt;**](String)| Filter by wrapup code ID(s) | [optional] 
| **divisionId** | [**List&lt;String&gt;**](String)| Filter by division ID(s) | [optional] 
{: class="table-striped"}


### Return type

[**WrapupCodeEntityListing**](WrapupCodeEntityListing)


# **getRoutingWrapupcodesDivisionview**


> [WrapupCode](WrapupCode) getRoutingWrapupcodesDivisionview(codeId)

Get a simplified wrap-up code.

Wraps GET /api/v2/routing/wrapupcodes/divisionviews/{codeId}  

Requires ALL permissions: 

* routing:wrapupCode:search

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
    WrapupCode result = apiInstance.getRoutingWrapupcodesDivisionview(codeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingWrapupcodesDivisionview");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **codeId** | **String**| Wrapup Code ID | 
{: class="table-striped"}


### Return type

[**WrapupCode**](WrapupCode)


# **getRoutingWrapupcodesDivisionviews**


> [WrapupCodeEntityListing](WrapupCodeEntityListing) getRoutingWrapupcodesDivisionviews(pageSize, pageNumber, name, id, divisionId, includeState)

Get a paged listing of simplified wrapup code objects, filterable by name, wrapup code ID(s), or division ID(s).

Specifying both name and ID parameters is not supported.

Wraps GET /api/v2/routing/wrapupcodes/divisionviews  

Requires ALL permissions: 

* routing:wrapupCode:search

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
String name = "name_example"; // String | Name (trailing asterisks allowed)
List<String> id = Arrays.asList(null); // List<String> | Wrapup code ID(s)
List<String> divisionId = Arrays.asList(null); // List<String> | Division ID(s)
String includeState = "includeState_example"; // String | Wrapup code state(s) to include
try {
    WrapupCodeEntityListing result = apiInstance.getRoutingWrapupcodesDivisionviews(pageSize, pageNumber, name, id, divisionId, includeState);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingWrapupcodesDivisionviews");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **name** | **String**| Name (trailing asterisks allowed) | [optional] 
| **id** | [**List&lt;String&gt;**](String)| Wrapup code ID(s) | [optional] 
| **divisionId** | [**List&lt;String&gt;**](String)| Division ID(s) | [optional] 
| **includeState** | **String**| Wrapup code state(s) to include | [optional]<br />**Values**: Active, Deleted, ActiveAndDeleted 
{: class="table-striped"}


### Return type

[**WrapupCodeEntityListing**](WrapupCodeEntityListing)


# **getUserQueues**


> [UserQueueEntityListing](UserQueueEntityListing) getUserQueues(userId, pageSize, pageNumber, joined, divisionId)

Get queues for user

Wraps GET /api/v2/users/{userId}/queues  

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
String userId = "userId_example"; // String | User ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
Boolean joined = true; // Boolean | Is joined to the queue
List<String> divisionId = Arrays.asList(null); // List<String> | Division ID(s)
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
| **divisionId** | [**List&lt;String&gt;**](String)| Division ID(s) | [optional] 
{: class="table-striped"}


### Return type

[**UserQueueEntityListing**](UserQueueEntityListing)


# **getUserRoutinglanguages**


> [UserLanguageEntityListing](UserLanguageEntityListing) getUserRoutinglanguages(userId, pageSize, pageNumber, sortOrder)

List routing languages assigned to a user

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

[**UserLanguageEntityListing**](UserLanguageEntityListing)


# **getUserRoutingskills**


> [UserSkillEntityListing](UserSkillEntityListing) getUserRoutingskills(userId, pageSize, pageNumber, sortOrder)

List routing skills assigned to a user

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

[**UserSkillEntityListing**](UserSkillEntityListing)


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
String after = "after_example"; // String | The cursor that points to the next page
String before = "before_example"; // String | The cursor that points to the previous page
try {
    UserSkillGroupEntityListing result = apiInstance.getUserSkillgroups(userId, pageSize, after, before);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getUserSkillgroups");
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


# **patchRoutingConversation**


> [RoutingConversationAttributesResponse](RoutingConversationAttributesResponse) patchRoutingConversation(conversationId, body)

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
| **body** | [**RoutingConversationAttributesRequest**](RoutingConversationAttributesRequest)| Conversation Attributes | 
{: class="table-striped"}


### Return type

[**RoutingConversationAttributesResponse**](RoutingConversationAttributesResponse)


# **patchRoutingEmailDomain**


> [InboundDomain](InboundDomain) patchRoutingEmailDomain(domainId, body)

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
| **body** | [**InboundDomainPatchRequest**](InboundDomainPatchRequest)| Domain settings | 
{: class="table-striped"}


### Return type

[**InboundDomain**](InboundDomain)


# **patchRoutingEmailDomainValidate**


> [InboundDomain](InboundDomain) patchRoutingEmailDomainValidate(domainId, body)

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
| **body** | [**InboundDomainPatchRequest**](InboundDomainPatchRequest)| Domain settings | 
{: class="table-striped"}


### Return type

[**InboundDomain**](InboundDomain)


# **patchRoutingPredictor**


> [Predictor](Predictor) patchRoutingPredictor(predictorId, body)

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
| **body** | [**PatchPredictorRequest**](PatchPredictorRequest)|  | [optional] 
{: class="table-striped"}


### Return type

[**Predictor**](Predictor)


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
| **body** | [**QueueMember**](QueueMember)| Queue Member | 
{: class="table-striped"}


### Return type

null (empty response body)


# **patchRoutingQueueMembers**


> [QueueMemberEntityListing](QueueMemberEntityListing) patchRoutingQueueMembers(queueId, body)

Join or unjoin a set of up to 100 users for a queue

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
| **body** | [**List&lt;QueueMember&gt;**](QueueMember)| Queue Members | 
{: class="table-striped"}


### Return type

[**QueueMemberEntityListing**](QueueMemberEntityListing)


# **patchRoutingQueueUser**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

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
| **body** | [**QueueMember**](QueueMember)| Queue Member | 
{: class="table-striped"}


### Return type

null (empty response body)


# **patchRoutingQueueUsers**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [QueueMemberEntityListingV1](QueueMemberEntityListingV1) patchRoutingQueueUsers(queueId, body)

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
| **body** | [**List&lt;QueueMember&gt;**](QueueMember)| Queue Members | 
{: class="table-striped"}


### Return type

[**QueueMemberEntityListingV1**](QueueMemberEntityListingV1)


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
| **body** | [**ContactCenterSettings**](ContactCenterSettings)| Contact Center Settings | 
{: class="table-striped"}


### Return type

null (empty response body)


# **patchRoutingSettingsTranscription**


> [TranscriptionSettings](TranscriptionSettings) patchRoutingSettingsTranscription(body)

Patch Transcription Settings

Wraps PATCH /api/v2/routing/settings/transcription  

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
    TranscriptionSettings result = apiInstance.patchRoutingSettingsTranscription(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#patchRoutingSettingsTranscription");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**TranscriptionSettings**](TranscriptionSettings)| Organization Settings | 
{: class="table-striped"}


### Return type

[**TranscriptionSettings**](TranscriptionSettings)


# **patchRoutingSkillgroup**


> [SkillGroup](SkillGroup) patchRoutingSkillgroup(skillGroupId, body)

Update skill group definition

Wraps PATCH /api/v2/routing/skillgroups/{skillGroupId}  

Requires ANY permissions: 

* routing:skillGroup:edit

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
String skillGroupId = "skillGroupId_example"; // String | Skill Group ID
SkillGroup body = new SkillGroup(); // SkillGroup | Update skill groups
try {
    SkillGroup result = apiInstance.patchRoutingSkillgroup(skillGroupId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#patchRoutingSkillgroup");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **skillGroupId** | **String**| Skill Group ID | 
| **body** | [**SkillGroup**](SkillGroup)| Update skill groups | 
{: class="table-striped"}


### Return type

[**SkillGroup**](SkillGroup)


# **patchRoutingSmsPhonenumber**


> [SmsPhoneNumber](SmsPhoneNumber) patchRoutingSmsPhonenumber(phoneNumberId, body)

Update a phone number provisioned for SMS.

Wraps PATCH /api/v2/routing/sms/phonenumbers/{phoneNumberId}  

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
String phoneNumberId = "phoneNumberId_example"; // String | phone number
SmsPhoneNumberPatchRequest body = new SmsPhoneNumberPatchRequest(); // SmsPhoneNumberPatchRequest | SmsPhoneNumberPatchRequest
try {
    SmsPhoneNumber result = apiInstance.patchRoutingSmsPhonenumber(phoneNumberId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#patchRoutingSmsPhonenumber");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **phoneNumberId** | **String**| phone number | 
| **body** | [**SmsPhoneNumberPatchRequest**](SmsPhoneNumberPatchRequest)| SmsPhoneNumberPatchRequest | 
{: class="table-striped"}


### Return type

[**SmsPhoneNumber**](SmsPhoneNumber)


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
List<String> divisionId = Arrays.asList(null); // List<String> | Division ID(s)
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
| **body** | [**List&lt;UserQueue&gt;**](UserQueue)| User Queues | 
| **divisionId** | [**List&lt;String&gt;**](String)| Division ID(s) | [optional] 
{: class="table-striped"}


### Return type

[**UserQueueEntityListing**](UserQueueEntityListing)


# **patchUserRoutinglanguage**


> [UserRoutingLanguage](UserRoutingLanguage) patchUserRoutinglanguage(userId, languageId, body)

Update an assigned routing language's proficiency

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
| **body** | [**UserRoutingLanguage**](UserRoutingLanguage)| Language | 
{: class="table-striped"}


### Return type

[**UserRoutingLanguage**](UserRoutingLanguage)


# **patchUserRoutinglanguagesBulk**


> [UserLanguageEntityListing](UserLanguageEntityListing) patchUserRoutinglanguagesBulk(userId, body)

Assign multiple routing languages to a user. Max 50 routing languages in request body

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
| **body** | [**List&lt;UserRoutingLanguagePost&gt;**](UserRoutingLanguagePost)| Language | 
{: class="table-striped"}


### Return type

[**UserLanguageEntityListing**](UserLanguageEntityListing)


# **patchUserRoutingskillsBulk**


> [UserSkillEntityListing](UserSkillEntityListing) patchUserRoutingskillsBulk(userId, body)

Assign multiple routing skills to a user

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
| **body** | [**List&lt;UserRoutingSkillPost&gt;**](UserRoutingSkillPost)| Skill | 
{: class="table-striped"}


### Return type

[**UserSkillEntityListing**](UserSkillEntityListing)


# **postAnalyticsQueuesObservationsQuery**


> [QueueObservationQueryResponse](QueueObservationQueryResponse) postAnalyticsQueuesObservationsQuery(body)

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
| **body** | [**QueueObservationQuery**](QueueObservationQuery)| query | 
{: class="table-striped"}


### Return type

[**QueueObservationQueryResponse**](QueueObservationQueryResponse)


# **postAnalyticsRoutingActivityQuery**


> [RoutingActivityResponse](RoutingActivityResponse) postAnalyticsRoutingActivityQuery(body, pageSize, pageNumber)

Query for user activity observations

Wraps POST /api/v2/analytics/routing/activity/query  

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
RoutingActivityQuery body = new RoutingActivityQuery(); // RoutingActivityQuery | query
Integer pageSize = 56; // Integer | The desired page size
Integer pageNumber = 56; // Integer | The desired page number
try {
    RoutingActivityResponse result = apiInstance.postAnalyticsRoutingActivityQuery(body, pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postAnalyticsRoutingActivityQuery");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**RoutingActivityQuery**](RoutingActivityQuery)| query | 
| **pageSize** | **Integer**| The desired page size | [optional] 
| **pageNumber** | **Integer**| The desired page number | [optional] 
{: class="table-striped"}


### Return type

[**RoutingActivityResponse**](RoutingActivityResponse)


# **postRoutingAssessments**


> [BenefitAssessment](BenefitAssessment) postRoutingAssessments(body)

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
| **body** | [**CreateBenefitAssessmentRequest**](CreateBenefitAssessmentRequest)|  | [optional] 
{: class="table-striped"}


### Return type

[**BenefitAssessment**](BenefitAssessment)


# **postRoutingAssessmentsJobs**


> [BenefitAssessmentJob](BenefitAssessmentJob) postRoutingAssessmentsJobs(body)

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
| **body** | [**CreateBenefitAssessmentJobRequest**](CreateBenefitAssessmentJobRequest)|  | [optional] 
{: class="table-striped"}


### Return type

[**BenefitAssessmentJob**](BenefitAssessmentJob)


# **postRoutingEmailDomainRoutes**


> [InboundRoute](InboundRoute) postRoutingEmailDomainRoutes(domainName, body)

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
| **body** | [**InboundRoute**](InboundRoute)| Route | 
{: class="table-striped"}


### Return type

[**InboundRoute**](InboundRoute)


# **postRoutingEmailDomainTestconnection**


> [TestMessage](TestMessage) postRoutingEmailDomainTestconnection(domainId, body)

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
| **body** | [**TestMessage**](TestMessage)| TestMessage | [optional] 
{: class="table-striped"}


### Return type

[**TestMessage**](TestMessage)


# **postRoutingEmailDomains**


> [InboundDomain](InboundDomain) postRoutingEmailDomains(body)

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
| **body** | [**InboundDomain**](InboundDomain)| Domain | 
{: class="table-striped"}


### Return type

[**InboundDomain**](InboundDomain)


# **postRoutingEmailOutboundDomains**


> [EmailOutboundDomainResult](EmailOutboundDomainResult) postRoutingEmailOutboundDomains(body)

Create a domain

Wraps POST /api/v2/routing/email/outbound/domains  

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
OutboundDomainRequest body = new OutboundDomainRequest(); // OutboundDomainRequest | Domain
try {
    EmailOutboundDomainResult result = apiInstance.postRoutingEmailOutboundDomains(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postRoutingEmailOutboundDomains");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**OutboundDomainRequest**](OutboundDomainRequest)| Domain | 
{: class="table-striped"}


### Return type

[**EmailOutboundDomainResult**](EmailOutboundDomainResult)


# **postRoutingEmailOutboundDomainsSimulated**


> [EmailOutboundDomainResult](EmailOutboundDomainResult) postRoutingEmailOutboundDomainsSimulated(body)

Create a simulated domain

Wraps POST /api/v2/routing/email/outbound/domains/simulated  

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
OutboundDomainRequest body = new OutboundDomainRequest(); // OutboundDomainRequest | Domain
try {
    EmailOutboundDomainResult result = apiInstance.postRoutingEmailOutboundDomainsSimulated(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postRoutingEmailOutboundDomainsSimulated");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**OutboundDomainRequest**](OutboundDomainRequest)| Domain | 
{: class="table-striped"}


### Return type

[**EmailOutboundDomainResult**](EmailOutboundDomainResult)


# **postRoutingLanguages**


> [Language](Language) postRoutingLanguages(body)

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
| **body** | [**Language**](Language)| Language | 
{: class="table-striped"}


### Return type

[**Language**](Language)


# **postRoutingPredictors**


> [Predictor](Predictor) postRoutingPredictors(body)

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
| **body** | [**CreatePredictorRequest**](CreatePredictorRequest)|  | [optional] 
{: class="table-striped"}


### Return type

[**Predictor**](Predictor)


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
| **body** | [**List&lt;WritableEntity&gt;**](WritableEntity)| Queue Members | 
| **delete** | **Boolean**| True to delete queue members | [optional] [default to false] 
{: class="table-striped"}


### Return type

null (empty response body)


# **postRoutingQueueUsers**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

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
| **body** | [**List&lt;WritableEntity&gt;**](WritableEntity)| Queue Members | 
| **delete** | **Boolean**| True to delete queue members | [optional] [default to false] 
{: class="table-striped"}


### Return type

null (empty response body)


# **postRoutingQueueWrapupcodes**


> [List&lt;WrapupCode&gt;](WrapupCode) postRoutingQueueWrapupcodes(queueId, body)

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
| **body** | [**List&lt;WrapUpCodeReference&gt;**](WrapUpCodeReference)| List of wrapup codes | 
{: class="table-striped"}


### Return type

[**List&lt;WrapupCode&gt;**](WrapupCode)


# **postRoutingQueues**


> [Queue](Queue) postRoutingQueues(body)

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
| **body** | [**CreateQueueRequest**](CreateQueueRequest)| Queue | 
{: class="table-striped"}


### Return type

[**Queue**](Queue)


# **postRoutingSkillgroupMembersDivisions**


> Void postRoutingSkillgroupMembersDivisions(skillGroupId, body)

Add or remove member divisions for this skill group.

Wraps POST /api/v2/routing/skillgroups/{skillGroupId}/members/divisions  

Requires ALL permissions: 

* routing:skillGroup:add

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
String skillGroupId = "skillGroupId_example"; // String | Skill Group ID
SkillGroupMemberDivisions body = new SkillGroupMemberDivisions(); // SkillGroupMemberDivisions | 
try {
    apiInstance.postRoutingSkillgroupMembersDivisions(skillGroupId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postRoutingSkillgroupMembersDivisions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **skillGroupId** | **String**| Skill Group ID | 
| **body** | [**SkillGroupMemberDivisions**](SkillGroupMemberDivisions)|  | [optional] 
{: class="table-striped"}


### Return type

null (empty response body)


# **postRoutingSkillgroups**


> [SkillGroupWithMemberDivisions](SkillGroupWithMemberDivisions) postRoutingSkillgroups(body)

Create a skill group

Wraps POST /api/v2/routing/skillgroups  

Requires ALL permissions: 

* routing:skillGroup:add

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
SkillGroupWithMemberDivisions body = new SkillGroupWithMemberDivisions(); // SkillGroupWithMemberDivisions | Create skill group
try {
    SkillGroupWithMemberDivisions result = apiInstance.postRoutingSkillgroups(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postRoutingSkillgroups");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**SkillGroupWithMemberDivisions**](SkillGroupWithMemberDivisions)| Create skill group | 
{: class="table-striped"}


### Return type

[**SkillGroupWithMemberDivisions**](SkillGroupWithMemberDivisions)


# **postRoutingSkills**


> [RoutingSkill](RoutingSkill) postRoutingSkills(body)

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
| **body** | [**RoutingSkill**](RoutingSkill)| Skill | 
{: class="table-striped"}


### Return type

[**RoutingSkill**](RoutingSkill)


# **postRoutingSmsAddresses**


> [SmsAddress](SmsAddress) postRoutingSmsAddresses(body)

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
| **body** | [**SmsAddressProvision**](SmsAddressProvision)| SmsAddress | 
{: class="table-striped"}


### Return type

[**SmsAddress**](SmsAddress)


# **postRoutingSmsPhonenumbers**


> [SmsPhoneNumber](SmsPhoneNumber) postRoutingSmsPhonenumbers(body)

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
try {
    SmsPhoneNumber result = apiInstance.postRoutingSmsPhonenumbers(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postRoutingSmsPhonenumbers");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**SmsPhoneNumberProvision**](SmsPhoneNumberProvision)| SmsPhoneNumber | 
{: class="table-striped"}


### Return type

[**SmsPhoneNumber**](SmsPhoneNumber)


# **postRoutingSmsPhonenumbersAlphanumeric**


> [SmsPhoneNumber](SmsPhoneNumber) postRoutingSmsPhonenumbersAlphanumeric(body)

Provision an alphanumeric number for SMS

postRoutingSmsPhonenumbersAlphanumeric is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/routing/sms/phonenumbers/alphanumeric  

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
SmsAlphanumericProvision body = new SmsAlphanumericProvision(); // SmsAlphanumericProvision | SmsPhoneNumber
try {
    SmsPhoneNumber result = apiInstance.postRoutingSmsPhonenumbersAlphanumeric(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postRoutingSmsPhonenumbersAlphanumeric");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**SmsAlphanumericProvision**](SmsAlphanumericProvision)| SmsPhoneNumber | 
{: class="table-striped"}


### Return type

[**SmsPhoneNumber**](SmsPhoneNumber)


# **postRoutingSmsPhonenumbersImport**


> [SmsPhoneNumber](SmsPhoneNumber) postRoutingSmsPhonenumbersImport(body)

Imports a phone number for SMS

Wraps POST /api/v2/routing/sms/phonenumbers/import  

Requires ALL permissions: 

* sms:phoneNumber:byoImport

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
SmsPhoneNumberImport body = new SmsPhoneNumberImport(); // SmsPhoneNumberImport | SmsPhoneNumber
try {
    SmsPhoneNumber result = apiInstance.postRoutingSmsPhonenumbersImport(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postRoutingSmsPhonenumbersImport");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**SmsPhoneNumberImport**](SmsPhoneNumberImport)| SmsPhoneNumber | 
{: class="table-striped"}


### Return type

[**SmsPhoneNumber**](SmsPhoneNumber)


# **postRoutingUtilizationLabels**


> [UtilizationLabel](UtilizationLabel) postRoutingUtilizationLabels(body)

Create a utilization label

Wraps POST /api/v2/routing/utilization/labels  

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
CreateUtilizationLabelRequest body = new CreateUtilizationLabelRequest(); // CreateUtilizationLabelRequest | UtilizationLabel
try {
    UtilizationLabel result = apiInstance.postRoutingUtilizationLabels(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postRoutingUtilizationLabels");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**CreateUtilizationLabelRequest**](CreateUtilizationLabelRequest)| UtilizationLabel | 
{: class="table-striped"}


### Return type

[**UtilizationLabel**](UtilizationLabel)


# **postRoutingUtilizationTags**


> [UtilizationTag](UtilizationTag) postRoutingUtilizationTags(body)

Create an utilization tag

postRoutingUtilizationTags is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/routing/utilization/tags  

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
CreateUtilizationTagRequest body = new CreateUtilizationTagRequest(); // CreateUtilizationTagRequest | UtilizationTag
try {
    UtilizationTag result = apiInstance.postRoutingUtilizationTags(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postRoutingUtilizationTags");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**CreateUtilizationTagRequest**](CreateUtilizationTagRequest)| UtilizationTag | 
{: class="table-striped"}


### Return type

[**UtilizationTag**](UtilizationTag)


# **postRoutingWrapupcodes**


> [WrapupCode](WrapupCode) postRoutingWrapupcodes(body)

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
WrapupCodeRequest body = new WrapupCodeRequest(); // WrapupCodeRequest | WrapupCode
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
| **body** | [**WrapupCodeRequest**](WrapupCodeRequest)| WrapupCode | 
{: class="table-striped"}


### Return type

[**WrapupCode**](WrapupCode)


# **postUserRoutinglanguages**


> [UserRoutingLanguage](UserRoutingLanguage) postUserRoutinglanguages(userId, body)

Assign a routing language to a user

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
| **body** | [**UserRoutingLanguagePost**](UserRoutingLanguagePost)| Language | 
{: class="table-striped"}


### Return type

[**UserRoutingLanguage**](UserRoutingLanguage)


# **postUserRoutingskills**


> [UserRoutingSkill](UserRoutingSkill) postUserRoutingskills(userId, body)

Assign a routing skill to a user

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
| **body** | [**UserRoutingSkillPost**](UserRoutingSkillPost)| Skill | 
{: class="table-striped"}


### Return type

[**UserRoutingSkill**](UserRoutingSkill)


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
AgentDirectRoutingBackupSettings body = new AgentDirectRoutingBackupSettings(); // AgentDirectRoutingBackupSettings | directRoutingBackup
try {
    AgentDirectRoutingBackupSettings result = apiInstance.putRoutingDirectroutingbackupSettingsMe(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#putRoutingDirectroutingbackupSettingsMe");
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


# **putRoutingEmailDomainRoute**


> [InboundRoute](InboundRoute) putRoutingEmailDomainRoute(domainName, routeId, body)

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
| **body** | [**InboundRoute**](InboundRoute)| Route | 
{: class="table-striped"}


### Return type

[**InboundRoute**](InboundRoute)


# **putRoutingEmailDomainRouteIdentityresolution**


> [IdentityResolutionConfig](IdentityResolutionConfig) putRoutingEmailDomainRouteIdentityresolution(domainName, routeId, body)

Update identity resolution settings for a route.

Wraps PUT /api/v2/routing/email/domains/{domainName}/routes/{routeId}/identityresolution  

Requires ALL permissions: 

* routing:email:manage
* routing:identityResolution:edit

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
IdentityResolutionConfig body = new IdentityResolutionConfig(); // IdentityResolutionConfig | 
try {
    IdentityResolutionConfig result = apiInstance.putRoutingEmailDomainRouteIdentityresolution(domainName, routeId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#putRoutingEmailDomainRouteIdentityresolution");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **domainName** | **String**| email domain | 
| **routeId** | **String**| route ID | 
| **body** | [**IdentityResolutionConfig**](IdentityResolutionConfig)|  | 
{: class="table-striped"}


### Return type

[**IdentityResolutionConfig**](IdentityResolutionConfig)


# **putRoutingEmailOutboundDomainActivation**


> [EmailOutboundDomainResult](EmailOutboundDomainResult) putRoutingEmailOutboundDomainActivation(domainId)

Request an activation status (cname + dkim) update of an outbound domain

Wraps PUT /api/v2/routing/email/outbound/domains/{domainId}/activation  

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
    EmailOutboundDomainResult result = apiInstance.putRoutingEmailOutboundDomainActivation(domainId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#putRoutingEmailOutboundDomainActivation");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **domainId** | **String**| domain ID | 
{: class="table-striped"}


### Return type

[**EmailOutboundDomainResult**](EmailOutboundDomainResult)


# **putRoutingMessageRecipient**


> [Recipient](Recipient) putRoutingMessageRecipient(recipientId, body)

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
RecipientRequest body = new RecipientRequest(); // RecipientRequest | Recipient
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
| **body** | [**RecipientRequest**](RecipientRequest)| Recipient | 
{: class="table-striped"}


### Return type

[**Recipient**](Recipient)


# **putRoutingQueue**


> [Queue](Queue) putRoutingQueue(queueId, body)

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
| **body** | [**QueueRequest**](QueueRequest)| Queue | 
{: class="table-striped"}


### Return type

[**Queue**](Queue)


# **putRoutingQueueIdentityresolution**


> [IdentityResolutionQueueConfig](IdentityResolutionQueueConfig) putRoutingQueueIdentityresolution(queueId, body)

Update Queue IdentityResolution Settings.

Wraps PUT /api/v2/routing/queues/{queueId}/identityresolution  

Requires ALL permissions: 

* routing:queue:edit
* routing:identityResolution:edit

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
IdentityResolutionQueueConfig body = new IdentityResolutionQueueConfig(); // IdentityResolutionQueueConfig | 
try {
    IdentityResolutionQueueConfig result = apiInstance.putRoutingQueueIdentityresolution(queueId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#putRoutingQueueIdentityresolution");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **queueId** | **String**| Queue ID | 
| **body** | [**IdentityResolutionQueueConfig**](IdentityResolutionQueueConfig)|  | 
{: class="table-striped"}


### Return type

[**IdentityResolutionQueueConfig**](IdentityResolutionQueueConfig)


# **putRoutingSettings**


> [RoutingSettings](RoutingSettings) putRoutingSettings(body)

Update an organization's routing settings

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
| **body** | [**RoutingSettings**](RoutingSettings)| Organization Settings | 
{: class="table-striped"}


### Return type

[**RoutingSettings**](RoutingSettings)


# **putRoutingSettingsTranscription**


> [TranscriptionSettings](TranscriptionSettings) putRoutingSettingsTranscription(body)

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
| **body** | [**TranscriptionSettings**](TranscriptionSettings)| Organization Settings | 
{: class="table-striped"}


### Return type

[**TranscriptionSettings**](TranscriptionSettings)


# **putRoutingSmsIdentityresolutionPhonenumber**


> [IdentityResolutionConfig](IdentityResolutionConfig) putRoutingSmsIdentityresolutionPhonenumber(addressId, body)

Update an SMS identity resolution settings.

Wraps PUT /api/v2/routing/sms/identityresolution/phonenumbers/{addressId}  

Requires ALL permissions: 

* sms:phoneNumber:edit
* routing:identityResolution:edit

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
IdentityResolutionConfig body = new IdentityResolutionConfig(); // IdentityResolutionConfig | 
try {
    IdentityResolutionConfig result = apiInstance.putRoutingSmsIdentityresolutionPhonenumber(addressId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#putRoutingSmsIdentityresolutionPhonenumber");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **addressId** | **String**| Address ID | 
| **body** | [**IdentityResolutionConfig**](IdentityResolutionConfig)|  | 
{: class="table-striped"}


### Return type

[**IdentityResolutionConfig**](IdentityResolutionConfig)


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
AgentDirectRoutingBackupSettings body = new AgentDirectRoutingBackupSettings(); // AgentDirectRoutingBackupSettings | directRoutingBackup
try {
    AgentDirectRoutingBackupSettings result = apiInstance.putRoutingUserDirectroutingbackupSettings(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#putRoutingUserDirectroutingbackupSettings");
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
UtilizationRequest body = new UtilizationRequest(); // UtilizationRequest | utilization
try {
    AgentMaxUtilizationResponse result = apiInstance.putRoutingUserUtilization(userId, body);
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
| **body** | [**UtilizationRequest**](UtilizationRequest)| utilization | 
{: class="table-striped"}


### Return type

[**AgentMaxUtilizationResponse**](AgentMaxUtilizationResponse)


# **putRoutingUtilization**


> [UtilizationResponse](UtilizationResponse) putRoutingUtilization(body)

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
UtilizationRequest body = new UtilizationRequest(); // UtilizationRequest | utilization
try {
    UtilizationResponse result = apiInstance.putRoutingUtilization(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#putRoutingUtilization");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**UtilizationRequest**](UtilizationRequest)| utilization | 
{: class="table-striped"}


### Return type

[**UtilizationResponse**](UtilizationResponse)


# **putRoutingUtilizationLabel**


> [UtilizationLabel](UtilizationLabel) putRoutingUtilizationLabel(labelId, body)

Update a utilization label

Wraps PUT /api/v2/routing/utilization/labels/{labelId}  

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
String labelId = "labelId_example"; // String | Utilization Label ID
UpdateUtilizationLabelRequest body = new UpdateUtilizationLabelRequest(); // UpdateUtilizationLabelRequest | UtilizationLabel
try {
    UtilizationLabel result = apiInstance.putRoutingUtilizationLabel(labelId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#putRoutingUtilizationLabel");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **labelId** | **String**| Utilization Label ID | 
| **body** | [**UpdateUtilizationLabelRequest**](UpdateUtilizationLabelRequest)| UtilizationLabel | 
{: class="table-striped"}


### Return type

[**UtilizationLabel**](UtilizationLabel)


# **putRoutingWrapupcode**


> [WrapupCode](WrapupCode) putRoutingWrapupcode(codeId, body)

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
WrapupCodeRequest body = new WrapupCodeRequest(); // WrapupCodeRequest | WrapupCode
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
| **body** | [**WrapupCodeRequest**](WrapupCodeRequest)| WrapupCode | 
{: class="table-striped"}


### Return type

[**WrapupCode**](WrapupCode)


# **putUserRoutingskill**


> [UserRoutingSkill](UserRoutingSkill) putUserRoutingskill(userId, skillId, body)

Update an assigned routing skill's proficiency

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
| **body** | [**UserRoutingSkill**](UserRoutingSkill)| Skill | 
{: class="table-striped"}


### Return type

[**UserRoutingSkill**](UserRoutingSkill)


# **putUserRoutingskillsBulk**


> [UserSkillEntityListing](UserSkillEntityListing) putUserRoutingskillsBulk(userId, body)

Assign multiple routing skills to a user, replacing any current assignments

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
| **body** | [**List&lt;UserRoutingSkillPost&gt;**](UserRoutingSkillPost)| Skill | 
{: class="table-striped"}


### Return type

[**UserSkillEntityListing**](UserSkillEntityListing)


_com.mypurecloud.sdk.v2:platform-client-v2:229.0.0_
