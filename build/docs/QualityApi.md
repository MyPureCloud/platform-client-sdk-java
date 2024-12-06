# QualityApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteQualityCalibration**](QualityApi#deleteQualityCalibration) | Delete a calibration by id. |
| [**deleteQualityConversationEvaluation**](QualityApi#deleteQualityConversationEvaluation) | Delete an evaluation |
| [**deleteQualityForm**](QualityApi#deleteQualityForm) | Delete an evaluation form. |
| [**deleteQualityFormsEvaluation**](QualityApi#deleteQualityFormsEvaluation) | Delete an evaluation form. |
| [**deleteQualityFormsSurvey**](QualityApi#deleteQualityFormsSurvey) | Delete a survey form. |
| [**getAnalyticsEvaluationsAggregatesJob**](QualityApi#getAnalyticsEvaluationsAggregatesJob) | Get status for async query for evaluation aggregates |
| [**getAnalyticsEvaluationsAggregatesJobResults**](QualityApi#getAnalyticsEvaluationsAggregatesJobResults) | Fetch a page of results for an async aggregates query |
| [**getAnalyticsSurveysAggregatesJob**](QualityApi#getAnalyticsSurveysAggregatesJob) | Get status for async query for survey aggregates |
| [**getAnalyticsSurveysAggregatesJobResults**](QualityApi#getAnalyticsSurveysAggregatesJobResults) | Fetch a page of results for an async aggregates query |
| [**getQualityAgentsActivity**](QualityApi#getQualityAgentsActivity) | Gets a list of Agent Activities |
| [**getQualityCalibration**](QualityApi#getQualityCalibration) | Get a calibration by id.  Requires either calibrator id or conversation id |
| [**getQualityCalibrations**](QualityApi#getQualityCalibrations) | Get the list of calibrations |
| [**getQualityConversationEvaluation**](QualityApi#getQualityConversationEvaluation) | Get an evaluation |
| [**getQualityConversationSurveys**](QualityApi#getQualityConversationSurveys) | Get the surveys for a conversation |
| [**getQualityConversationsAuditsQueryTransactionId**](QualityApi#getQualityConversationsAuditsQueryTransactionId) | Get status of audit query execution |
| [**getQualityConversationsAuditsQueryTransactionIdResults**](QualityApi#getQualityConversationsAuditsQueryTransactionIdResults) | Get results of audit query |
| [**getQualityEvaluationsQuery**](QualityApi#getQualityEvaluationsQuery) | Queries Evaluations and returns a paged list |
| [**getQualityEvaluatorsActivity**](QualityApi#getQualityEvaluatorsActivity) | Get an evaluator activity |
| [**getQualityForm**](QualityApi#getQualityForm) | Get an evaluation form |
| [**getQualityFormVersions**](QualityApi#getQualityFormVersions) | Gets all the revisions for a specific evaluation. |
| [**getQualityForms**](QualityApi#getQualityForms) | Get the list of evaluation forms. If you set \"expand=publishHistory\", then you will be able to get published versions for each corresponding evaluation form. |
| [**getQualityFormsEvaluation**](QualityApi#getQualityFormsEvaluation) | Get an evaluation form |
| [**getQualityFormsEvaluationVersions**](QualityApi#getQualityFormsEvaluationVersions) | Gets all the revisions for a specific evaluation. |
| [**getQualityFormsEvaluations**](QualityApi#getQualityFormsEvaluations) | Get the list of evaluation forms |
| [**getQualityFormsEvaluationsBulkContexts**](QualityApi#getQualityFormsEvaluationsBulkContexts) | Retrieve a list of the latest published evaluation form versions by context ids |
| [**getQualityFormsSurvey**](QualityApi#getQualityFormsSurvey) | Get a survey form |
| [**getQualityFormsSurveyVersions**](QualityApi#getQualityFormsSurveyVersions) | Gets all the revisions for a specific survey. |
| [**getQualityFormsSurveys**](QualityApi#getQualityFormsSurveys) | Get the list of survey forms. If you set \"expand=publishHistory\", then you will be able to get published versions for each corresponding survey form. |
| [**getQualityFormsSurveysBulk**](QualityApi#getQualityFormsSurveysBulk) | Retrieve a list of survey forms by their ids |
| [**getQualityFormsSurveysBulkContexts**](QualityApi#getQualityFormsSurveysBulkContexts) | Retrieve a list of the latest form versions by context ids |
| [**getQualityPublishedform**](QualityApi#getQualityPublishedform) | Get the published evaluation forms. |
| [**getQualityPublishedforms**](QualityApi#getQualityPublishedforms) | Get the published evaluation forms. |
| [**getQualityPublishedformsEvaluation**](QualityApi#getQualityPublishedformsEvaluation) | Get the most recent published version of an evaluation form. |
| [**getQualityPublishedformsEvaluations**](QualityApi#getQualityPublishedformsEvaluations) | Get the published evaluation forms. |
| [**getQualityPublishedformsSurvey**](QualityApi#getQualityPublishedformsSurvey) | Get the most recent published version of a survey form. |
| [**getQualityPublishedformsSurveys**](QualityApi#getQualityPublishedformsSurveys) | Get the published survey forms. |
| [**getQualitySurvey**](QualityApi#getQualitySurvey) | Get a survey for a conversation |
| [**getQualitySurveysScorable**](QualityApi#getQualitySurveysScorable) | Get a survey as an end-customer, for the purposes of scoring it. |
| [**patchQualityFormsSurvey**](QualityApi#patchQualityFormsSurvey) | Disable a particular version of a survey form and invalidates any invitations that have already been sent to customers using this version of the form. |
| [**postAnalyticsEvaluationsAggregatesJobs**](QualityApi#postAnalyticsEvaluationsAggregatesJobs) | Query for evaluation aggregates asynchronously |
| [**postAnalyticsEvaluationsAggregatesQuery**](QualityApi#postAnalyticsEvaluationsAggregatesQuery) | Query for evaluation aggregates |
| [**postAnalyticsSurveysAggregatesJobs**](QualityApi#postAnalyticsSurveysAggregatesJobs) | Query for survey aggregates asynchronously |
| [**postAnalyticsSurveysAggregatesQuery**](QualityApi#postAnalyticsSurveysAggregatesQuery) | Query for survey aggregates |
| [**postQualityCalibrations**](QualityApi#postQualityCalibrations) | Create a calibration |
| [**postQualityConversationEvaluations**](QualityApi#postQualityConversationEvaluations) | Create an evaluation |
| [**postQualityConversationsAuditsQuery**](QualityApi#postQualityConversationsAuditsQuery) | Create audit query execution |
| [**postQualityEvaluationsAggregatesQueryMe**](QualityApi#postQualityEvaluationsAggregatesQueryMe) | Query for evaluation aggregates for the current user |
| [**postQualityEvaluationsScoring**](QualityApi#postQualityEvaluationsScoring) | Score evaluation |
| [**postQualityForms**](QualityApi#postQualityForms) | Create an evaluation form. |
| [**postQualityFormsEvaluations**](QualityApi#postQualityFormsEvaluations) | Create an evaluation form. |
| [**postQualityFormsSurveys**](QualityApi#postQualityFormsSurveys) | Create a survey form. |
| [**postQualityPublishedforms**](QualityApi#postQualityPublishedforms) | Publish an evaluation form. |
| [**postQualityPublishedformsEvaluations**](QualityApi#postQualityPublishedformsEvaluations) | Publish an evaluation form. |
| [**postQualityPublishedformsSurveys**](QualityApi#postQualityPublishedformsSurveys) | Publish a survey form. |
| [**postQualitySurveysScoring**](QualityApi#postQualitySurveysScoring) | Score survey |
| [**putQualityCalibration**](QualityApi#putQualityCalibration) | Update a calibration to the specified calibration via PUT.  Editable fields include: evaluators, expertEvaluator, and scoringIndex |
| [**putQualityConversationEvaluation**](QualityApi#putQualityConversationEvaluation) | Update an evaluation |
| [**putQualityForm**](QualityApi#putQualityForm) | Update an evaluation form. |
| [**putQualityFormsEvaluation**](QualityApi#putQualityFormsEvaluation) | Update an evaluation form. |
| [**putQualityFormsEvaluationAiscoringSettings**](QualityApi#putQualityFormsEvaluationAiscoringSettings) | Update the AI Scoring settings of an evaluation form. |
| [**putQualityFormsSurvey**](QualityApi#putQualityFormsSurvey) | Update a survey form. |
| [**putQualitySurveysScorable**](QualityApi#putQualitySurveysScorable) | Update a survey as an end-customer, for the purposes of scoring it. |
{: class="table-striped"}


# **deleteQualityCalibration**


> [Calibration](Calibration) deleteQualityCalibration(calibrationId, calibratorId)

Delete a calibration by id.

Wraps DELETE /api/v2/quality/calibrations/{calibrationId}  

Requires ANY permissions: 

* quality:calibration:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String calibrationId = "calibrationId_example"; // String | Calibration ID
String calibratorId = "calibratorId_example"; // String | calibratorId
try {
    Calibration result = apiInstance.deleteQualityCalibration(calibrationId, calibratorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#deleteQualityCalibration");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **calibrationId** | **String**| Calibration ID | 
| **calibratorId** | **String**| calibratorId | 
{: class="table-striped"}


### Return type

[**Calibration**](Calibration)


# **deleteQualityConversationEvaluation**


> [EvaluationResponse](EvaluationResponse) deleteQualityConversationEvaluation(conversationId, evaluationId, expand)

Delete an evaluation

Wraps DELETE /api/v2/quality/conversations/{conversationId}/evaluations/{evaluationId}  

Requires ANY permissions: 

* quality:evaluation:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String conversationId = "conversationId_example"; // String | conversationId
String evaluationId = "evaluationId_example"; // String | evaluationId
String expand = "expand_example"; // String | evaluatorId, evaluationForm
try {
    EvaluationResponse result = apiInstance.deleteQualityConversationEvaluation(conversationId, evaluationId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#deleteQualityConversationEvaluation");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **evaluationId** | **String**| evaluationId | 
| **expand** | **String**| evaluatorId, evaluationForm | [optional] 
{: class="table-striped"}


### Return type

[**EvaluationResponse**](EvaluationResponse)


# **deleteQualityForm**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> Void deleteQualityForm(formId)

Delete an evaluation form.

Wraps DELETE /api/v2/quality/forms/{formId}  

Requires ANY permissions: 

* quality:evaluationForm:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String formId = "formId_example"; // String | Form ID
try {
    apiInstance.deleteQualityForm(formId);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#deleteQualityForm");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **formId** | **String**| Form ID | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteQualityFormsEvaluation**


> Void deleteQualityFormsEvaluation(formId)

Delete an evaluation form.

Wraps DELETE /api/v2/quality/forms/evaluations/{formId}  

Requires ANY permissions: 

* quality:evaluationForm:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String formId = "formId_example"; // String | Form ID
try {
    apiInstance.deleteQualityFormsEvaluation(formId);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#deleteQualityFormsEvaluation");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **formId** | **String**| Form ID | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteQualityFormsSurvey**


> Void deleteQualityFormsSurvey(formId)

Delete a survey form.

Wraps DELETE /api/v2/quality/forms/surveys/{formId}  

Requires ALL permissions: 

* quality:surveyForm:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String formId = "formId_example"; // String | Form ID
try {
    apiInstance.deleteQualityFormsSurvey(formId);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#deleteQualityFormsSurvey");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **formId** | **String**| Form ID | 
{: class="table-striped"}


### Return type

null (empty response body)


# **getAnalyticsEvaluationsAggregatesJob**


> [AsyncQueryStatus](AsyncQueryStatus) getAnalyticsEvaluationsAggregatesJob(jobId)

Get status for async query for evaluation aggregates

getAnalyticsEvaluationsAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/analytics/evaluations/aggregates/jobs/{jobId}  

Requires ANY permissions: 

* analytics:evaluationAggregate:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String jobId = "jobId_example"; // String | jobId
try {
    AsyncQueryStatus result = apiInstance.getAnalyticsEvaluationsAggregatesJob(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getAnalyticsEvaluationsAggregatesJob");
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


# **getAnalyticsEvaluationsAggregatesJobResults**


> [EvaluationAsyncAggregateQueryResponse](EvaluationAsyncAggregateQueryResponse) getAnalyticsEvaluationsAggregatesJobResults(jobId, cursor)

Fetch a page of results for an async aggregates query

getAnalyticsEvaluationsAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/analytics/evaluations/aggregates/jobs/{jobId}/results  

Requires ANY permissions: 

* analytics:evaluationAggregate:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String jobId = "jobId_example"; // String | jobId
String cursor = "cursor_example"; // String | Cursor token to retrieve next page
try {
    EvaluationAsyncAggregateQueryResponse result = apiInstance.getAnalyticsEvaluationsAggregatesJobResults(jobId, cursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getAnalyticsEvaluationsAggregatesJobResults");
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

[**EvaluationAsyncAggregateQueryResponse**](EvaluationAsyncAggregateQueryResponse)


# **getAnalyticsSurveysAggregatesJob**


> [AsyncQueryStatus](AsyncQueryStatus) getAnalyticsSurveysAggregatesJob(jobId)

Get status for async query for survey aggregates

getAnalyticsSurveysAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/analytics/surveys/aggregates/jobs/{jobId}  

Requires ANY permissions: 

* analytics:surveyAggregate:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String jobId = "jobId_example"; // String | jobId
try {
    AsyncQueryStatus result = apiInstance.getAnalyticsSurveysAggregatesJob(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getAnalyticsSurveysAggregatesJob");
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


# **getAnalyticsSurveysAggregatesJobResults**


> [SurveyAsyncAggregateQueryResponse](SurveyAsyncAggregateQueryResponse) getAnalyticsSurveysAggregatesJobResults(jobId, cursor)

Fetch a page of results for an async aggregates query

getAnalyticsSurveysAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/analytics/surveys/aggregates/jobs/{jobId}/results  

Requires ANY permissions: 

* analytics:surveyAggregate:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String jobId = "jobId_example"; // String | jobId
String cursor = "cursor_example"; // String | Cursor token to retrieve next page
try {
    SurveyAsyncAggregateQueryResponse result = apiInstance.getAnalyticsSurveysAggregatesJobResults(jobId, cursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getAnalyticsSurveysAggregatesJobResults");
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

[**SurveyAsyncAggregateQueryResponse**](SurveyAsyncAggregateQueryResponse)


# **getQualityAgentsActivity**


> [AgentActivityEntityListing](AgentActivityEntityListing) getQualityAgentsActivity(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, startTime, endTime, agentUserId, evaluatorUserId, name, group, agentTeamId, formContextId, userState)

Gets a list of Agent Activities

Each item on the list shows one agent's evaluation activity comprised of the number of evaluations and the highest, average, and lowest standard and critical scores, as well as a sub list showing the number and average score of evaluations for each evaluator for that agent.  evaluatorUserId, startTime, and endTime are all filtering criteria. If specified, the only evaluations used to compile the agent activity response will be ones that match the filtering criteria. agentUserId, name, group, and agentTeamId are all agent selection criteria. criteria.  If one or more agent selection criteria are specified, then the returned activity will include users that match the criteria even if those users did not have any agent activity or evaluations that do not match any filtering criteria.  If no agent selection criteria are specified but an evaluatorUserId is, then the returned activity will be only for those agents that had evaluations where the evaluator is the evaluatorUserId.  If no agent selection criteria are specified and no evaluatorUserId is specified, then the returned activity will be for all users

Wraps GET /api/v2/quality/agents/activity  

Requires ANY permissions: 

* quality:evaluation:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<String> expand = Arrays.asList(null); // List<String> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
Date startTime = new Date(); // Date | Start time of agent activity based on assigned date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
Date endTime = new Date(); // Date | End time of agent activity based on assigned date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
List<String> agentUserId = Arrays.asList(null); // List<String> | user id of agent requested
String evaluatorUserId = "evaluatorUserId_example"; // String | user id of the evaluator
String name = "name_example"; // String | name
String group = "group_example"; // String | group id
String agentTeamId = "agentTeamId_example"; // String | team id of agents requested
String formContextId = "formContextId_example"; // String | shared id between form versions
String userState = "Legacy"; // String | 'Legacy' fetches active and inactive users when evaluatorUserId or no user filters are supplied; otherwise fetches active users.  'Any' fetches users of 'active', 'inactive' and 'deleted' states.
try {
    AgentActivityEntityListing result = apiInstance.getQualityAgentsActivity(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, startTime, endTime, agentUserId, evaluatorUserId, name, group, agentTeamId, formContextId, userState);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualityAgentsActivity");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| The total page size requested | [optional] [default to 25] 
| **pageNumber** | **Integer**| The page number requested | [optional] [default to 1] 
| **sortBy** | **String**| variable name requested to sort by | [optional] 
| **expand** | [**List&lt;String&gt;**](String)| variable name requested by expand list | [optional] 
| **nextPage** | **String**| next page token | [optional] 
| **previousPage** | **String**| Previous page token | [optional] 
| **startTime** | **Date**| Start time of agent activity based on assigned date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z | [optional] 
| **endTime** | **Date**| End time of agent activity based on assigned date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z | [optional] 
| **agentUserId** | [**List&lt;String&gt;**](String)| user id of agent requested | [optional] 
| **evaluatorUserId** | **String**| user id of the evaluator | [optional] 
| **name** | **String**| name | [optional] 
| **group** | **String**| group id | [optional] 
| **agentTeamId** | **String**| team id of agents requested | [optional] 
| **formContextId** | **String**| shared id between form versions | [optional] 
| **userState** | **String**| &#39;Legacy&#39; fetches active and inactive users when evaluatorUserId or no user filters are supplied; otherwise fetches active users.  &#39;Any&#39; fetches users of &#39;active&#39;, &#39;inactive&#39; and &#39;deleted&#39; states. | [optional] [default to Legacy]<br />**Values**: Any, Legacy 
{: class="table-striped"}


### Return type

[**AgentActivityEntityListing**](AgentActivityEntityListing)


# **getQualityCalibration**


> [Calibration](Calibration) getQualityCalibration(calibrationId, calibratorId, conversationId)

Get a calibration by id.  Requires either calibrator id or conversation id

Wraps GET /api/v2/quality/calibrations/{calibrationId}  

Requires ANY permissions: 

* quality:calibration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String calibrationId = "calibrationId_example"; // String | Calibration ID
String calibratorId = "calibratorId_example"; // String | calibratorId
String conversationId = "conversationId_example"; // String | conversationId
try {
    Calibration result = apiInstance.getQualityCalibration(calibrationId, calibratorId, conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualityCalibration");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **calibrationId** | **String**| Calibration ID | 
| **calibratorId** | **String**| calibratorId | [optional] 
| **conversationId** | **String**| conversationId | [optional] 
{: class="table-striped"}


### Return type

[**Calibration**](Calibration)


# **getQualityCalibrations**


> [CalibrationEntityListing](CalibrationEntityListing) getQualityCalibrations(calibratorId, pageSize, pageNumber, sortBy, expand, nextPage, previousPage, conversationId, startTime, endTime)

Get the list of calibrations

NOTE: The count for total and pageCount might not be accurate when querying for a large number of calibrations. nextUri, if present, will indicate that there are more calibrations to fetch.

Wraps GET /api/v2/quality/calibrations  

Requires ANY permissions: 

* quality:calibration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String calibratorId = "calibratorId_example"; // String | user id of calibrator
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<String> expand = Arrays.asList(null); // List<String> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
String conversationId = "conversationId_example"; // String | conversation id
Date startTime = new Date(); // Date | Beginning of the calibration query. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
Date endTime = new Date(); // Date | end of the calibration query. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
try {
    CalibrationEntityListing result = apiInstance.getQualityCalibrations(calibratorId, pageSize, pageNumber, sortBy, expand, nextPage, previousPage, conversationId, startTime, endTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualityCalibrations");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **calibratorId** | **String**| user id of calibrator | 
| **pageSize** | **Integer**| The total page size requested | [optional] [default to 25] 
| **pageNumber** | **Integer**| The page number requested | [optional] [default to 1] 
| **sortBy** | **String**| variable name requested to sort by | [optional] 
| **expand** | [**List&lt;String&gt;**](String)| variable name requested by expand list | [optional] 
| **nextPage** | **String**| next page token | [optional] 
| **previousPage** | **String**| Previous page token | [optional] 
| **conversationId** | **String**| conversation id | [optional] 
| **startTime** | **Date**| Beginning of the calibration query. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z | [optional] 
| **endTime** | **Date**| end of the calibration query. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z | [optional] 
{: class="table-striped"}


### Return type

[**CalibrationEntityListing**](CalibrationEntityListing)


# **getQualityConversationEvaluation**


> [EvaluationResponse](EvaluationResponse) getQualityConversationEvaluation(conversationId, evaluationId, expand)

Get an evaluation

Wraps GET /api/v2/quality/conversations/{conversationId}/evaluations/{evaluationId}  

Requires ANY permissions: 

* quality:evaluation:view
* quality:evaluation:assign
* quality:evaluation:release

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String conversationId = "conversationId_example"; // String | conversationId
String evaluationId = "evaluationId_example"; // String | evaluationId
String expand = "expand_example"; // String | agent, assignee, evaluator, evaluationForm
try {
    EvaluationResponse result = apiInstance.getQualityConversationEvaluation(conversationId, evaluationId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualityConversationEvaluation");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **evaluationId** | **String**| evaluationId | 
| **expand** | **String**| agent, assignee, evaluator, evaluationForm | [optional] 
{: class="table-striped"}


### Return type

[**EvaluationResponse**](EvaluationResponse)


# **getQualityConversationSurveys**


> [List&lt;Survey&gt;](Survey) getQualityConversationSurveys(conversationId)

Get the surveys for a conversation

Wraps GET /api/v2/quality/conversations/{conversationId}/surveys  

Requires ANY permissions: 

* quality:survey:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String conversationId = "conversationId_example"; // String | conversationId
try {
    List<Survey> result = apiInstance.getQualityConversationSurveys(conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualityConversationSurveys");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
{: class="table-striped"}


### Return type

[**List&lt;Survey&gt;**](Survey)


# **getQualityConversationsAuditsQueryTransactionId**


> [QualityAuditQueryExecutionStatusResponse](QualityAuditQueryExecutionStatusResponse) getQualityConversationsAuditsQueryTransactionId(transactionId)

Get status of audit query execution

Wraps GET /api/v2/quality/conversations/audits/query/{transactionId}  

Requires ALL permissions: 

* audits:interactionDetails:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String transactionId = "transactionId_example"; // String | Transaction ID
try {
    QualityAuditQueryExecutionStatusResponse result = apiInstance.getQualityConversationsAuditsQueryTransactionId(transactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualityConversationsAuditsQueryTransactionId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **transactionId** | **String**| Transaction ID | 
{: class="table-striped"}


### Return type

[**QualityAuditQueryExecutionStatusResponse**](QualityAuditQueryExecutionStatusResponse)


# **getQualityConversationsAuditsQueryTransactionIdResults**


> [QualityAuditQueryExecutionResultsResponse](QualityAuditQueryExecutionResultsResponse) getQualityConversationsAuditsQueryTransactionIdResults(transactionId, cursor, pageSize, expand)

Get results of audit query

Wraps GET /api/v2/quality/conversations/audits/query/{transactionId}/results  

Requires ALL permissions: 

* audits:interactionDetails:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String transactionId = "transactionId_example"; // String | Transaction ID
String cursor = "cursor_example"; // String | Indicates where to resume query results (not required for first page)
Integer pageSize = 25; // Integer | Page size
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand
try {
    QualityAuditQueryExecutionResultsResponse result = apiInstance.getQualityConversationsAuditsQueryTransactionIdResults(transactionId, cursor, pageSize, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualityConversationsAuditsQueryTransactionIdResults");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **transactionId** | **String**| Transaction ID | 
| **cursor** | **String**| Indicates where to resume query results (not required for first page) | [optional] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **expand** | [**List&lt;String&gt;**](String)| Which fields, if any, to expand | [optional]<br />**Values**: user 
{: class="table-striped"}


### Return type

[**QualityAuditQueryExecutionResultsResponse**](QualityAuditQueryExecutionResultsResponse)


# **getQualityEvaluationsQuery**


> [EvaluationEntityListing](EvaluationEntityListing) getQualityEvaluationsQuery(pageSize, pageNumber, expand, previousPage, conversationId, agentUserId, agentTeamId, evaluatorUserId, assigneeUserId, queueId, startTime, endTime, formContextId, evaluationState, isReleased, agentHasRead, expandAnswerTotalScores, maximum, sortOrder, includeDeletedUsers)

Queries Evaluations and returns a paged list

Query params must include one of conversationId, evaluatorUserId, agentUserId or assigneeUserId. When querying by agentUserId (and not conversationId or evaluatorUserId), the results are sorted by release date. Evaluations set to 'Never Release' are omitted in this case. When querying by evaluatorUserId or conversationId (including when combined with agentUserId), the results are sorted by assigned date. NOTE: The count for total and pageCount might not be accurate when querying for a large number of evaluations. nextUri, if present, will indicate that there are more evaluations to fetch. The evaluation entities contained in the response might only contain a subset of all the properties listed below. It is often because a given property's value has not yet been populated or is not applicable in the current state of the evaluation. It might also be because the missing property in the response was not requested by the user.

Wraps GET /api/v2/quality/evaluations/query  

Requires ANY permissions: 

* quality:evaluation:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
List<String> expand = Arrays.asList(null); // List<String> | variable name requested by expand list
String previousPage = "previousPage_example"; // String | Previous page token
String conversationId = "conversationId_example"; // String | conversationId specified
String agentUserId = "agentUserId_example"; // String | user id of the agent
String agentTeamId = "agentTeamId_example"; // String | team id of the agent
String evaluatorUserId = "evaluatorUserId_example"; // String | evaluator user id
String assigneeUserId = "assigneeUserId_example"; // String | assignee user id
String queueId = "queueId_example"; // String | queue id
String startTime = "startTime_example"; // String | start time of the evaluation query
String endTime = "endTime_example"; // String | end time of the evaluation query
String formContextId = "formContextId_example"; // String | shared id between form versions
List<String> evaluationState = Arrays.asList(null); // List<String> | 
Boolean isReleased = true; // Boolean | the evaluation has been released
Boolean agentHasRead = true; // Boolean | agent has the evaluation
Boolean expandAnswerTotalScores = true; // Boolean | get the total scores for evaluations. NOTE: The answers will only be populated if this parameter is set to true in the request.
Integer maximum = 56; // Integer | the maximum number of results to return
String sortOrder = "sortOrder_example"; // String | NOTE: Does not work when conversationId is supplied.
Boolean includeDeletedUsers = false; // Boolean | Allow returning an agent or evaluator user with a 'delete' status. Defaults to false.
try {
    EvaluationEntityListing result = apiInstance.getQualityEvaluationsQuery(pageSize, pageNumber, expand, previousPage, conversationId, agentUserId, agentTeamId, evaluatorUserId, assigneeUserId, queueId, startTime, endTime, formContextId, evaluationState, isReleased, agentHasRead, expandAnswerTotalScores, maximum, sortOrder, includeDeletedUsers);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualityEvaluationsQuery");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| The total page size requested | [optional] [default to 25] 
| **pageNumber** | **Integer**| The page number requested | [optional] [default to 1] 
| **expand** | [**List&lt;String&gt;**](String)| variable name requested by expand list | [optional] 
| **previousPage** | **String**| Previous page token | [optional] 
| **conversationId** | **String**| conversationId specified | [optional] 
| **agentUserId** | **String**| user id of the agent | [optional] 
| **agentTeamId** | **String**| team id of the agent | [optional] 
| **evaluatorUserId** | **String**| evaluator user id | [optional] 
| **assigneeUserId** | **String**| assignee user id | [optional] 
| **queueId** | **String**| queue id | [optional] 
| **startTime** | **String**| start time of the evaluation query | [optional] 
| **endTime** | **String**| end time of the evaluation query | [optional] 
| **formContextId** | **String**| shared id between form versions | [optional] 
| **evaluationState** | [**List&lt;String&gt;**](String)|  | [optional] 
| **isReleased** | **Boolean**| the evaluation has been released | [optional] 
| **agentHasRead** | **Boolean**| agent has the evaluation | [optional] 
| **expandAnswerTotalScores** | **Boolean**| get the total scores for evaluations. NOTE: The answers will only be populated if this parameter is set to true in the request. | [optional] 
| **maximum** | **Integer**| the maximum number of results to return | [optional] 
| **sortOrder** | **String**| NOTE: Does not work when conversationId is supplied. | [optional] 
| **includeDeletedUsers** | **Boolean**| Allow returning an agent or evaluator user with a &#39;delete&#39; status. Defaults to false. | [optional] [default to false] 
{: class="table-striped"}


### Return type

[**EvaluationEntityListing**](EvaluationEntityListing)


# **getQualityEvaluatorsActivity**


> [EvaluatorActivityEntityListing](EvaluatorActivityEntityListing) getQualityEvaluatorsActivity(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, startTime, endTime, name, permission, group, agentTeamId)

Get an evaluator activity

Wraps GET /api/v2/quality/evaluators/activity  

Requires ANY permissions: 

* quality:evaluation:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<String> expand = Arrays.asList(null); // List<String> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
Date startTime = new Date(); // Date | The start time specified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
Date endTime = new Date(); // Date | The end time specified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
String name = "name_example"; // String | Evaluator name
List<String> permission = Arrays.asList(null); // List<String> | permission strings
String group = "group_example"; // String | group id
String agentTeamId = "agentTeamId_example"; // String | team id of agents to be considered
try {
    EvaluatorActivityEntityListing result = apiInstance.getQualityEvaluatorsActivity(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, startTime, endTime, name, permission, group, agentTeamId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualityEvaluatorsActivity");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| The total page size requested | [optional] [default to 25] 
| **pageNumber** | **Integer**| The page number requested | [optional] [default to 1] 
| **sortBy** | **String**| variable name requested to sort by | [optional] 
| **expand** | [**List&lt;String&gt;**](String)| variable name requested by expand list | [optional] 
| **nextPage** | **String**| next page token | [optional] 
| **previousPage** | **String**| Previous page token | [optional] 
| **startTime** | **Date**| The start time specified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z | [optional] 
| **endTime** | **Date**| The end time specified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z | [optional] 
| **name** | **String**| Evaluator name | [optional] 
| **permission** | [**List&lt;String&gt;**](String)| permission strings | [optional] 
| **group** | **String**| group id | [optional] 
| **agentTeamId** | **String**| team id of agents to be considered | [optional] 
{: class="table-striped"}


### Return type

[**EvaluatorActivityEntityListing**](EvaluatorActivityEntityListing)


# **getQualityForm**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [EvaluationFormResponse](EvaluationFormResponse) getQualityForm(formId)

Get an evaluation form

Wraps GET /api/v2/quality/forms/{formId}  

Requires ANY permissions: 

* quality:evaluationForm:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String formId = "formId_example"; // String | Form ID
try {
    EvaluationFormResponse result = apiInstance.getQualityForm(formId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualityForm");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **formId** | **String**| Form ID | 
{: class="table-striped"}


### Return type

[**EvaluationFormResponse**](EvaluationFormResponse)


# **getQualityFormVersions**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [EvaluationFormResponseEntityListing](EvaluationFormResponseEntityListing) getQualityFormVersions(formId, pageSize, pageNumber)

Gets all the revisions for a specific evaluation.

Wraps GET /api/v2/quality/forms/{formId}/versions  

Requires ANY permissions: 

* quality:evaluationForm:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String formId = "formId_example"; // String | Form ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    EvaluationFormResponseEntityListing result = apiInstance.getQualityFormVersions(formId, pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualityFormVersions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **formId** | **String**| Form ID | 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
{: class="table-striped"}


### Return type

[**EvaluationFormResponseEntityListing**](EvaluationFormResponseEntityListing)


# **getQualityForms**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [EvaluationFormResponseEntityListing](EvaluationFormResponseEntityListing) getQualityForms(pageSize, pageNumber, sortBy, nextPage, previousPage, expand, name, sortOrder)

Get the list of evaluation forms. If you set \"expand=publishHistory\", then you will be able to get published versions for each corresponding evaluation form.

Wraps GET /api/v2/quality/forms  

Requires ANY permissions: 

* quality:evaluationForm:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
String expand = "expand_example"; // String | If 'expand=publishHistory', then each unpublished evaluation form includes a listing of its published versions
String name = "name_example"; // String | Name
String sortOrder = "sortOrder_example"; // String | Order to sort results, either asc or desc
try {
    EvaluationFormResponseEntityListing result = apiInstance.getQualityForms(pageSize, pageNumber, sortBy, nextPage, previousPage, expand, name, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualityForms");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| The total page size requested | [optional] [default to 25] 
| **pageNumber** | **Integer**| The page number requested | [optional] [default to 1] 
| **sortBy** | **String**| variable name requested to sort by | [optional] 
| **nextPage** | **String**| next page token | [optional] 
| **previousPage** | **String**| Previous page token | [optional] 
| **expand** | **String**| If &#39;expand&#x3D;publishHistory&#39;, then each unpublished evaluation form includes a listing of its published versions | [optional]<br />**Values**: publishHistory 
| **name** | **String**| Name | [optional] 
| **sortOrder** | **String**| Order to sort results, either asc or desc | [optional] 
{: class="table-striped"}


### Return type

[**EvaluationFormResponseEntityListing**](EvaluationFormResponseEntityListing)


# **getQualityFormsEvaluation**


> [EvaluationFormResponse](EvaluationFormResponse) getQualityFormsEvaluation(formId)

Get an evaluation form

Wraps GET /api/v2/quality/forms/evaluations/{formId}  

Requires ANY permissions: 

* quality:evaluationForm:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String formId = "formId_example"; // String | Form ID
try {
    EvaluationFormResponse result = apiInstance.getQualityFormsEvaluation(formId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualityFormsEvaluation");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **formId** | **String**| Form ID | 
{: class="table-striped"}


### Return type

[**EvaluationFormResponse**](EvaluationFormResponse)


# **getQualityFormsEvaluationVersions**


> [EvaluationFormResponseEntityListing](EvaluationFormResponseEntityListing) getQualityFormsEvaluationVersions(formId, pageSize, pageNumber, sortOrder)

Gets all the revisions for a specific evaluation.

Wraps GET /api/v2/quality/forms/evaluations/{formId}/versions  

Requires ANY permissions: 

* quality:evaluationForm:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String formId = "formId_example"; // String | Form ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortOrder = "asc"; // String | Sort order
try {
    EvaluationFormResponseEntityListing result = apiInstance.getQualityFormsEvaluationVersions(formId, pageSize, pageNumber, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualityFormsEvaluationVersions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **formId** | **String**| Form ID | 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **sortOrder** | **String**| Sort order | [optional] [default to asc] 
{: class="table-striped"}


### Return type

[**EvaluationFormResponseEntityListing**](EvaluationFormResponseEntityListing)


# **getQualityFormsEvaluations**


> [EvaluationFormResponseEntityListing](EvaluationFormResponseEntityListing) getQualityFormsEvaluations(pageSize, pageNumber, sortBy, nextPage, previousPage, expand, name, sortOrder)

Get the list of evaluation forms

By default, \"published\" field is always returned as false for all evaluation forms. If you set \"expand=publishHistory\", then you will be able to get published versions for each corresponding evaluation form. In addition, \"questionGroups\", the detailed information about evaluation form, is not returned. We will enhance this field in a future release.

Wraps GET /api/v2/quality/forms/evaluations  

Requires ANY permissions: 

* quality:evaluationForm:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
String expand = "expand_example"; // String | If 'expand=publishHistory', then each unpublished evaluation form includes a listing of its published versions
String name = "name_example"; // String | Name
String sortOrder = "sortOrder_example"; // String | Order to sort results, either asc or desc
try {
    EvaluationFormResponseEntityListing result = apiInstance.getQualityFormsEvaluations(pageSize, pageNumber, sortBy, nextPage, previousPage, expand, name, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualityFormsEvaluations");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| The total page size requested | [optional] [default to 25] 
| **pageNumber** | **Integer**| The page number requested | [optional] [default to 1] 
| **sortBy** | **String**| variable name requested to sort by | [optional] 
| **nextPage** | **String**| next page token | [optional] 
| **previousPage** | **String**| Previous page token | [optional] 
| **expand** | **String**| If &#39;expand&#x3D;publishHistory&#39;, then each unpublished evaluation form includes a listing of its published versions | [optional]<br />**Values**: publishHistory 
| **name** | **String**| Name | [optional] 
| **sortOrder** | **String**| Order to sort results, either asc or desc | [optional] 
{: class="table-striped"}


### Return type

[**EvaluationFormResponseEntityListing**](EvaluationFormResponseEntityListing)


# **getQualityFormsEvaluationsBulkContexts**


> [List&lt;EvaluationFormResponse&gt;](EvaluationFormResponse) getQualityFormsEvaluationsBulkContexts(contextId)

Retrieve a list of the latest published evaluation form versions by context ids

Wraps GET /api/v2/quality/forms/evaluations/bulk/contexts  

Requires ALL permissions: 

* quality:evaluationForm:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
List<String> contextId = Arrays.asList(null); // List<String> | A comma-delimited list of valid evaluation form context ids
try {
    List<EvaluationFormResponse> result = apiInstance.getQualityFormsEvaluationsBulkContexts(contextId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualityFormsEvaluationsBulkContexts");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **contextId** | [**List&lt;String&gt;**](String)| A comma-delimited list of valid evaluation form context ids | 
{: class="table-striped"}


### Return type

[**List&lt;EvaluationFormResponse&gt;**](EvaluationFormResponse)


# **getQualityFormsSurvey**


> [SurveyForm](SurveyForm) getQualityFormsSurvey(formId)

Get a survey form

Wraps GET /api/v2/quality/forms/surveys/{formId}  

Requires ALL permissions: 

* quality:surveyForm:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String formId = "formId_example"; // String | Form ID
try {
    SurveyForm result = apiInstance.getQualityFormsSurvey(formId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualityFormsSurvey");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **formId** | **String**| Form ID | 
{: class="table-striped"}


### Return type

[**SurveyForm**](SurveyForm)


# **getQualityFormsSurveyVersions**


> [SurveyFormEntityListing](SurveyFormEntityListing) getQualityFormsSurveyVersions(formId, pageSize, pageNumber)

Gets all the revisions for a specific survey.

Wraps GET /api/v2/quality/forms/surveys/{formId}/versions  

Requires ALL permissions: 

* quality:surveyForm:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String formId = "formId_example"; // String | Form ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    SurveyFormEntityListing result = apiInstance.getQualityFormsSurveyVersions(formId, pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualityFormsSurveyVersions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **formId** | **String**| Form ID | 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
{: class="table-striped"}


### Return type

[**SurveyFormEntityListing**](SurveyFormEntityListing)


# **getQualityFormsSurveys**


> [SurveyFormEntityListing](SurveyFormEntityListing) getQualityFormsSurveys(pageSize, pageNumber, sortBy, nextPage, previousPage, expand, name, sortOrder)

Get the list of survey forms. If you set \"expand=publishHistory\", then you will be able to get published versions for each corresponding survey form.

Wraps GET /api/v2/quality/forms/surveys  

Requires ALL permissions: 

* quality:surveyForm:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
String expand = "expand_example"; // String | If 'expand=publishHistory', then each unpublished evaluation form includes a listing of its published versions
String name = "name_example"; // String | Name
String sortOrder = "sortOrder_example"; // String | Order to sort results, either asc or desc
try {
    SurveyFormEntityListing result = apiInstance.getQualityFormsSurveys(pageSize, pageNumber, sortBy, nextPage, previousPage, expand, name, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualityFormsSurveys");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| The total page size requested | [optional] [default to 25] 
| **pageNumber** | **Integer**| The page number requested | [optional] [default to 1] 
| **sortBy** | **String**| variable name requested to sort by | [optional] 
| **nextPage** | **String**| next page token | [optional] 
| **previousPage** | **String**| Previous page token | [optional] 
| **expand** | **String**| If &#39;expand&#x3D;publishHistory&#39;, then each unpublished evaluation form includes a listing of its published versions | [optional]<br />**Values**: publishHistory 
| **name** | **String**| Name | [optional] 
| **sortOrder** | **String**| Order to sort results, either asc or desc | [optional] 
{: class="table-striped"}


### Return type

[**SurveyFormEntityListing**](SurveyFormEntityListing)


# **getQualityFormsSurveysBulk**


> [SurveyFormEntityListing](SurveyFormEntityListing) getQualityFormsSurveysBulk(id)

Retrieve a list of survey forms by their ids

Wraps GET /api/v2/quality/forms/surveys/bulk  

Requires ALL permissions: 

* quality:surveyForm:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
List<String> id = Arrays.asList(null); // List<String> | A comma-delimited list of valid survey form ids
try {
    SurveyFormEntityListing result = apiInstance.getQualityFormsSurveysBulk(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualityFormsSurveysBulk");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | [**List&lt;String&gt;**](String)| A comma-delimited list of valid survey form ids | 
{: class="table-striped"}


### Return type

[**SurveyFormEntityListing**](SurveyFormEntityListing)


# **getQualityFormsSurveysBulkContexts**


> [List&lt;SurveyForm&gt;](SurveyForm) getQualityFormsSurveysBulkContexts(contextId, published)

Retrieve a list of the latest form versions by context ids

Wraps GET /api/v2/quality/forms/surveys/bulk/contexts  

Requires ALL permissions: 

* quality:surveyForm:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
List<String> contextId = Arrays.asList(null); // List<String> | A comma-delimited list of valid survey form context ids. The maximum number of ids allowed in this list is 100.
Boolean published = true; // Boolean | If true, the latest published version will be included. If false, only the unpublished version will be included.
try {
    List<SurveyForm> result = apiInstance.getQualityFormsSurveysBulkContexts(contextId, published);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualityFormsSurveysBulkContexts");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **contextId** | [**List&lt;String&gt;**](String)| A comma-delimited list of valid survey form context ids. The maximum number of ids allowed in this list is 100. | 
| **published** | **Boolean**| If true, the latest published version will be included. If false, only the unpublished version will be included. | [optional] [default to true] 
{: class="table-striped"}


### Return type

[**List&lt;SurveyForm&gt;**](SurveyForm)


# **getQualityPublishedform**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [EvaluationFormResponse](EvaluationFormResponse) getQualityPublishedform(formId)

Get the published evaluation forms.

Wraps GET /api/v2/quality/publishedforms/{formId}  

Requires ANY permissions: 

* quality:evaluationForm:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String formId = "formId_example"; // String | Form ID
try {
    EvaluationFormResponse result = apiInstance.getQualityPublishedform(formId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualityPublishedform");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **formId** | **String**| Form ID | 
{: class="table-striped"}


### Return type

[**EvaluationFormResponse**](EvaluationFormResponse)


# **getQualityPublishedforms**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [EvaluationFormResponseEntityListing](EvaluationFormResponseEntityListing) getQualityPublishedforms(pageSize, pageNumber, name, onlyLatestPerContext)

Get the published evaluation forms.

Wraps GET /api/v2/quality/publishedforms  

Requires ANY permissions: 

* quality:evaluationForm:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String name = "name_example"; // String | Name
Boolean onlyLatestPerContext = false; // Boolean | onlyLatestPerContext
try {
    EvaluationFormResponseEntityListing result = apiInstance.getQualityPublishedforms(pageSize, pageNumber, name, onlyLatestPerContext);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualityPublishedforms");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **name** | **String**| Name | [optional] 
| **onlyLatestPerContext** | **Boolean**| onlyLatestPerContext | [optional] [default to false] 
{: class="table-striped"}


### Return type

[**EvaluationFormResponseEntityListing**](EvaluationFormResponseEntityListing)


# **getQualityPublishedformsEvaluation**


> [EvaluationFormResponse](EvaluationFormResponse) getQualityPublishedformsEvaluation(formId)

Get the most recent published version of an evaluation form.

Wraps GET /api/v2/quality/publishedforms/evaluations/{formId}  

Requires ANY permissions: 

* quality:evaluationForm:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String formId = "formId_example"; // String | Form ID
try {
    EvaluationFormResponse result = apiInstance.getQualityPublishedformsEvaluation(formId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualityPublishedformsEvaluation");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **formId** | **String**| Form ID | 
{: class="table-striped"}


### Return type

[**EvaluationFormResponse**](EvaluationFormResponse)


# **getQualityPublishedformsEvaluations**


> [EvaluationFormResponseEntityListing](EvaluationFormResponseEntityListing) getQualityPublishedformsEvaluations(pageSize, pageNumber, name, onlyLatestPerContext)

Get the published evaluation forms.

Wraps GET /api/v2/quality/publishedforms/evaluations  

Requires ANY permissions: 

* quality:evaluationForm:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String name = "name_example"; // String | Name
Boolean onlyLatestPerContext = false; // Boolean | onlyLatestPerContext
try {
    EvaluationFormResponseEntityListing result = apiInstance.getQualityPublishedformsEvaluations(pageSize, pageNumber, name, onlyLatestPerContext);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualityPublishedformsEvaluations");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **name** | **String**| Name | [optional] 
| **onlyLatestPerContext** | **Boolean**| onlyLatestPerContext | [optional] [default to false] 
{: class="table-striped"}


### Return type

[**EvaluationFormResponseEntityListing**](EvaluationFormResponseEntityListing)


# **getQualityPublishedformsSurvey**


> [SurveyForm](SurveyForm) getQualityPublishedformsSurvey(formId)

Get the most recent published version of a survey form.

Wraps GET /api/v2/quality/publishedforms/surveys/{formId}  

Requires ALL permissions: 

* quality:surveyForm:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String formId = "formId_example"; // String | Form ID
try {
    SurveyForm result = apiInstance.getQualityPublishedformsSurvey(formId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualityPublishedformsSurvey");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **formId** | **String**| Form ID | 
{: class="table-striped"}


### Return type

[**SurveyForm**](SurveyForm)


# **getQualityPublishedformsSurveys**


> [SurveyFormEntityListing](SurveyFormEntityListing) getQualityPublishedformsSurveys(pageSize, pageNumber, name, onlyLatestEnabledPerContext)

Get the published survey forms.

Wraps GET /api/v2/quality/publishedforms/surveys  

Requires ALL permissions: 

* quality:surveyForm:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String name = "name_example"; // String | Name
Boolean onlyLatestEnabledPerContext = false; // Boolean | onlyLatestEnabledPerContext
try {
    SurveyFormEntityListing result = apiInstance.getQualityPublishedformsSurveys(pageSize, pageNumber, name, onlyLatestEnabledPerContext);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualityPublishedformsSurveys");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **name** | **String**| Name | [optional] 
| **onlyLatestEnabledPerContext** | **Boolean**| onlyLatestEnabledPerContext | [optional] [default to false] 
{: class="table-striped"}


### Return type

[**SurveyFormEntityListing**](SurveyFormEntityListing)


# **getQualitySurvey**


> [Survey](Survey) getQualitySurvey(surveyId)

Get a survey for a conversation

Wraps GET /api/v2/quality/surveys/{surveyId}  

Requires ANY permissions: 

* quality:survey:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String surveyId = "surveyId_example"; // String | surveyId
try {
    Survey result = apiInstance.getQualitySurvey(surveyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualitySurvey");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **surveyId** | **String**| surveyId | 
{: class="table-striped"}


### Return type

[**Survey**](Survey)


# **getQualitySurveysScorable**


> [ScorableSurvey](ScorableSurvey) getQualitySurveysScorable(customerSurveyUrl)

Get a survey as an end-customer, for the purposes of scoring it.

Wraps GET /api/v2/quality/surveys/scorable  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.api.QualityApi;


QualityApi apiInstance = new QualityApi();
String customerSurveyUrl = "customerSurveyUrl_example"; // String | customerSurveyUrl
try {
    ScorableSurvey result = apiInstance.getQualitySurveysScorable(customerSurveyUrl);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualitySurveysScorable");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **customerSurveyUrl** | **String**| customerSurveyUrl | 
{: class="table-striped"}


### Return type

[**ScorableSurvey**](ScorableSurvey)


# **patchQualityFormsSurvey**


> [SurveyForm](SurveyForm) patchQualityFormsSurvey(formId, body)

Disable a particular version of a survey form and invalidates any invitations that have already been sent to customers using this version of the form.

Wraps PATCH /api/v2/quality/forms/surveys/{formId}  

Requires ALL permissions: 

* quality:surveyForm:disable

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String formId = "formId_example"; // String | Form ID
SurveyForm body = new SurveyForm(); // SurveyForm | Survey form
try {
    SurveyForm result = apiInstance.patchQualityFormsSurvey(formId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#patchQualityFormsSurvey");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **formId** | **String**| Form ID | 
| **body** | [**SurveyForm**](SurveyForm)| Survey form | 
{: class="table-striped"}


### Return type

[**SurveyForm**](SurveyForm)


# **postAnalyticsEvaluationsAggregatesJobs**


> [AsyncQueryResponse](AsyncQueryResponse) postAnalyticsEvaluationsAggregatesJobs(body)

Query for evaluation aggregates asynchronously

postAnalyticsEvaluationsAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/analytics/evaluations/aggregates/jobs  

Requires ANY permissions: 

* analytics:evaluationAggregate:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
EvaluationAsyncAggregationQuery body = new EvaluationAsyncAggregationQuery(); // EvaluationAsyncAggregationQuery | query
try {
    AsyncQueryResponse result = apiInstance.postAnalyticsEvaluationsAggregatesJobs(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#postAnalyticsEvaluationsAggregatesJobs");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**EvaluationAsyncAggregationQuery**](EvaluationAsyncAggregationQuery)| query | 
{: class="table-striped"}


### Return type

[**AsyncQueryResponse**](AsyncQueryResponse)


# **postAnalyticsEvaluationsAggregatesQuery**


> [EvaluationAggregateQueryResponse](EvaluationAggregateQueryResponse) postAnalyticsEvaluationsAggregatesQuery(body)

Query for evaluation aggregates

Wraps POST /api/v2/analytics/evaluations/aggregates/query  

Requires ANY permissions: 

* analytics:evaluationAggregate:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
EvaluationAggregationQuery body = new EvaluationAggregationQuery(); // EvaluationAggregationQuery | query
try {
    EvaluationAggregateQueryResponse result = apiInstance.postAnalyticsEvaluationsAggregatesQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#postAnalyticsEvaluationsAggregatesQuery");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**EvaluationAggregationQuery**](EvaluationAggregationQuery)| query | 
{: class="table-striped"}


### Return type

[**EvaluationAggregateQueryResponse**](EvaluationAggregateQueryResponse)


# **postAnalyticsSurveysAggregatesJobs**


> [AsyncQueryResponse](AsyncQueryResponse) postAnalyticsSurveysAggregatesJobs(body)

Query for survey aggregates asynchronously

postAnalyticsSurveysAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/analytics/surveys/aggregates/jobs  

Requires ANY permissions: 

* analytics:surveyAggregate:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
SurveyAsyncAggregationQuery body = new SurveyAsyncAggregationQuery(); // SurveyAsyncAggregationQuery | query
try {
    AsyncQueryResponse result = apiInstance.postAnalyticsSurveysAggregatesJobs(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#postAnalyticsSurveysAggregatesJobs");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**SurveyAsyncAggregationQuery**](SurveyAsyncAggregationQuery)| query | 
{: class="table-striped"}


### Return type

[**AsyncQueryResponse**](AsyncQueryResponse)


# **postAnalyticsSurveysAggregatesQuery**


> [SurveyAggregateQueryResponse](SurveyAggregateQueryResponse) postAnalyticsSurveysAggregatesQuery(body)

Query for survey aggregates

Wraps POST /api/v2/analytics/surveys/aggregates/query  

Requires ANY permissions: 

* analytics:surveyAggregate:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
SurveyAggregationQuery body = new SurveyAggregationQuery(); // SurveyAggregationQuery | query
try {
    SurveyAggregateQueryResponse result = apiInstance.postAnalyticsSurveysAggregatesQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#postAnalyticsSurveysAggregatesQuery");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**SurveyAggregationQuery**](SurveyAggregationQuery)| query | 
{: class="table-striped"}


### Return type

[**SurveyAggregateQueryResponse**](SurveyAggregateQueryResponse)


# **postQualityCalibrations**


> [Calibration](Calibration) postQualityCalibrations(body, expand)

Create a calibration

Wraps POST /api/v2/quality/calibrations  

Requires ANY permissions: 

* quality:calibration:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
CalibrationCreate body = new CalibrationCreate(); // CalibrationCreate | calibration
String expand = "expand_example"; // String | calibratorId
try {
    Calibration result = apiInstance.postQualityCalibrations(body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#postQualityCalibrations");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**CalibrationCreate**](CalibrationCreate)| calibration | 
| **expand** | **String**| calibratorId | [optional] 
{: class="table-striped"}


### Return type

[**Calibration**](Calibration)


# **postQualityConversationEvaluations**


> [Evaluation](Evaluation) postQualityConversationEvaluations(conversationId, body, expand)

Create an evaluation

Wraps POST /api/v2/quality/conversations/{conversationId}/evaluations  

Requires ANY permissions: 

* quality:evaluation:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String conversationId = "conversationId_example"; // String | conversationId
EvaluationCreateBody body = new EvaluationCreateBody(); // EvaluationCreateBody | evaluation
String expand = "expand_example"; // String | evaluatorId
try {
    Evaluation result = apiInstance.postQualityConversationEvaluations(conversationId, body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#postQualityConversationEvaluations");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **body** | [**EvaluationCreateBody**](EvaluationCreateBody)| evaluation | 
| **expand** | **String**| evaluatorId | [optional] 
{: class="table-striped"}


### Return type

[**Evaluation**](Evaluation)


# **postQualityConversationsAuditsQuery**


> [QualityAuditQueryExecutionStatusResponse](QualityAuditQueryExecutionStatusResponse) postQualityConversationsAuditsQuery(body)

Create audit query execution

Wraps POST /api/v2/quality/conversations/audits/query  

Requires ALL permissions: 

* audits:interactionDetails:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
QMAuditQueryRequest body = new QMAuditQueryRequest(); // QMAuditQueryRequest | query
try {
    QualityAuditQueryExecutionStatusResponse result = apiInstance.postQualityConversationsAuditsQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#postQualityConversationsAuditsQuery");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**QMAuditQueryRequest**](QMAuditQueryRequest)| query | 
{: class="table-striped"}


### Return type

[**QualityAuditQueryExecutionStatusResponse**](QualityAuditQueryExecutionStatusResponse)


# **postQualityEvaluationsAggregatesQueryMe**


> [EvaluationAggregateQueryResponse](EvaluationAggregateQueryResponse) postQualityEvaluationsAggregatesQueryMe(body)

Query for evaluation aggregates for the current user

Wraps POST /api/v2/quality/evaluations/aggregates/query/me  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
EvaluationAggregationQueryMe body = new EvaluationAggregationQueryMe(); // EvaluationAggregationQueryMe | query
try {
    EvaluationAggregateQueryResponse result = apiInstance.postQualityEvaluationsAggregatesQueryMe(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#postQualityEvaluationsAggregatesQueryMe");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**EvaluationAggregationQueryMe**](EvaluationAggregationQueryMe)| query | 
{: class="table-striped"}


### Return type

[**EvaluationAggregateQueryResponse**](EvaluationAggregateQueryResponse)


# **postQualityEvaluationsScoring**


> [EvaluationScoringSet](EvaluationScoringSet) postQualityEvaluationsScoring(body)

Score evaluation

Wraps POST /api/v2/quality/evaluations/scoring  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
EvaluationFormAndScoringSet body = new EvaluationFormAndScoringSet(); // EvaluationFormAndScoringSet | evaluationAndScoringSet
try {
    EvaluationScoringSet result = apiInstance.postQualityEvaluationsScoring(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#postQualityEvaluationsScoring");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**EvaluationFormAndScoringSet**](EvaluationFormAndScoringSet)| evaluationAndScoringSet | 
{: class="table-striped"}


### Return type

[**EvaluationScoringSet**](EvaluationScoringSet)


# **postQualityForms**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [EvaluationFormResponse](EvaluationFormResponse) postQualityForms(body)

Create an evaluation form.

Wraps POST /api/v2/quality/forms  

Requires ANY permissions: 

* quality:evaluationForm:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
EvaluationForm body = new EvaluationForm(); // EvaluationForm | Evaluation form
try {
    EvaluationFormResponse result = apiInstance.postQualityForms(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#postQualityForms");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**EvaluationForm**](EvaluationForm)| Evaluation form | 
{: class="table-striped"}


### Return type

[**EvaluationFormResponse**](EvaluationFormResponse)


# **postQualityFormsEvaluations**


> [EvaluationFormResponse](EvaluationFormResponse) postQualityFormsEvaluations(body)

Create an evaluation form.

Wraps POST /api/v2/quality/forms/evaluations  

Requires ANY permissions: 

* quality:evaluationForm:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
EvaluationForm body = new EvaluationForm(); // EvaluationForm | Evaluation form
try {
    EvaluationFormResponse result = apiInstance.postQualityFormsEvaluations(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#postQualityFormsEvaluations");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**EvaluationForm**](EvaluationForm)| Evaluation form | 
{: class="table-striped"}


### Return type

[**EvaluationFormResponse**](EvaluationFormResponse)


# **postQualityFormsSurveys**


> [SurveyForm](SurveyForm) postQualityFormsSurveys(body)

Create a survey form.

Wraps POST /api/v2/quality/forms/surveys  

Requires ALL permissions: 

* quality:surveyForm:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
SurveyForm body = new SurveyForm(); // SurveyForm | Survey form
try {
    SurveyForm result = apiInstance.postQualityFormsSurveys(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#postQualityFormsSurveys");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**SurveyForm**](SurveyForm)| Survey form | 
{: class="table-striped"}


### Return type

[**SurveyForm**](SurveyForm)


# **postQualityPublishedforms**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [EvaluationFormResponse](EvaluationFormResponse) postQualityPublishedforms(body)

Publish an evaluation form.

Wraps POST /api/v2/quality/publishedforms  

Requires ANY permissions: 

* quality:evaluationForm:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
PublishForm body = new PublishForm(); // PublishForm | Publish request containing id of form to publish
try {
    EvaluationFormResponse result = apiInstance.postQualityPublishedforms(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#postQualityPublishedforms");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**PublishForm**](PublishForm)| Publish request containing id of form to publish | 
{: class="table-striped"}


### Return type

[**EvaluationFormResponse**](EvaluationFormResponse)


# **postQualityPublishedformsEvaluations**


> [EvaluationFormResponse](EvaluationFormResponse) postQualityPublishedformsEvaluations(body)

Publish an evaluation form.

Wraps POST /api/v2/quality/publishedforms/evaluations  

Requires ANY permissions: 

* quality:evaluationForm:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
PublishForm body = new PublishForm(); // PublishForm | Publish request containing id of form to publish
try {
    EvaluationFormResponse result = apiInstance.postQualityPublishedformsEvaluations(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#postQualityPublishedformsEvaluations");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**PublishForm**](PublishForm)| Publish request containing id of form to publish | 
{: class="table-striped"}


### Return type

[**EvaluationFormResponse**](EvaluationFormResponse)


# **postQualityPublishedformsSurveys**


> [SurveyForm](SurveyForm) postQualityPublishedformsSurveys(body)

Publish a survey form.

Wraps POST /api/v2/quality/publishedforms/surveys  

Requires ALL permissions: 

* quality:surveyForm:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
PublishForm body = new PublishForm(); // PublishForm | Survey form
try {
    SurveyForm result = apiInstance.postQualityPublishedformsSurveys(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#postQualityPublishedformsSurveys");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**PublishForm**](PublishForm)| Survey form | 
{: class="table-striped"}


### Return type

[**SurveyForm**](SurveyForm)


# **postQualitySurveysScoring**


> [SurveyScoringSet](SurveyScoringSet) postQualitySurveysScoring(body)

Score survey

Wraps POST /api/v2/quality/surveys/scoring  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
SurveyFormAndScoringSet body = new SurveyFormAndScoringSet(); // SurveyFormAndScoringSet | surveyAndScoringSet
try {
    SurveyScoringSet result = apiInstance.postQualitySurveysScoring(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#postQualitySurveysScoring");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**SurveyFormAndScoringSet**](SurveyFormAndScoringSet)| surveyAndScoringSet | 
{: class="table-striped"}


### Return type

[**SurveyScoringSet**](SurveyScoringSet)


# **putQualityCalibration**


> [Calibration](Calibration) putQualityCalibration(calibrationId, body)

Update a calibration to the specified calibration via PUT.  Editable fields include: evaluators, expertEvaluator, and scoringIndex

Wraps PUT /api/v2/quality/calibrations/{calibrationId}  

Requires ANY permissions: 

* quality:calibration:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String calibrationId = "calibrationId_example"; // String | Calibration ID
Calibration body = new Calibration(); // Calibration | Calibration
try {
    Calibration result = apiInstance.putQualityCalibration(calibrationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#putQualityCalibration");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **calibrationId** | **String**| Calibration ID | 
| **body** | [**Calibration**](Calibration)| Calibration | 
{: class="table-striped"}


### Return type

[**Calibration**](Calibration)


# **putQualityConversationEvaluation**


> [EvaluationResponse](EvaluationResponse) putQualityConversationEvaluation(conversationId, evaluationId, body, expand)

Update an evaluation

The quality:evaluation:edit permission allows modification of most fields, while the quality:evaluation:editScore permission allows an evaluator to change just the question scores, and the quality:evaluation:editAgentSignoff permission allows an agent to change the agent comments and sign off on the evaluation. authorizedActions is not returned for this PUT request, and is only returned for GET requests to this endpoint.

Wraps PUT /api/v2/quality/conversations/{conversationId}/evaluations/{evaluationId}  

Requires ANY permissions: 

* quality:evaluation:edit
* quality:evaluation:editScore
* quality:evaluation:editAgentSignoff

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String conversationId = "conversationId_example"; // String | conversationId
String evaluationId = "evaluationId_example"; // String | evaluationId
Evaluation body = new Evaluation(); // Evaluation | evaluation
String expand = "expand_example"; // String | evaluatorId, evaluationForm, assignee, evaluator
try {
    EvaluationResponse result = apiInstance.putQualityConversationEvaluation(conversationId, evaluationId, body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#putQualityConversationEvaluation");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **evaluationId** | **String**| evaluationId | 
| **body** | [**Evaluation**](Evaluation)| evaluation | 
| **expand** | **String**| evaluatorId, evaluationForm, assignee, evaluator | [optional] 
{: class="table-striped"}


### Return type

[**EvaluationResponse**](EvaluationResponse)


# **putQualityForm**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [EvaluationFormResponse](EvaluationFormResponse) putQualityForm(formId, body)

Update an evaluation form.

Wraps PUT /api/v2/quality/forms/{formId}  

Requires ANY permissions: 

* quality:evaluationForm:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String formId = "formId_example"; // String | Form ID
EvaluationForm body = new EvaluationForm(); // EvaluationForm | Evaluation form
try {
    EvaluationFormResponse result = apiInstance.putQualityForm(formId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#putQualityForm");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **formId** | **String**| Form ID | 
| **body** | [**EvaluationForm**](EvaluationForm)| Evaluation form | 
{: class="table-striped"}


### Return type

[**EvaluationFormResponse**](EvaluationFormResponse)


# **putQualityFormsEvaluation**


> [EvaluationFormResponse](EvaluationFormResponse) putQualityFormsEvaluation(formId, body)

Update an evaluation form.

Wraps PUT /api/v2/quality/forms/evaluations/{formId}  

Requires ANY permissions: 

* quality:evaluationForm:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String formId = "formId_example"; // String | Form ID
EvaluationForm body = new EvaluationForm(); // EvaluationForm | Evaluation form
try {
    EvaluationFormResponse result = apiInstance.putQualityFormsEvaluation(formId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#putQualityFormsEvaluation");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **formId** | **String**| Form ID | 
| **body** | [**EvaluationForm**](EvaluationForm)| Evaluation form | 
{: class="table-striped"}


### Return type

[**EvaluationFormResponse**](EvaluationFormResponse)


# **putQualityFormsEvaluationAiscoringSettings**


> [AiScoringSettings](AiScoringSettings) putQualityFormsEvaluationAiscoringSettings(formId, body)

Update the AI Scoring settings of an evaluation form.

putQualityFormsEvaluationAiscoringSettings is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps PUT /api/v2/quality/forms/evaluations/{formId}/aiscoring/settings  

Requires ANY permissions: 

* quality:evaluationForm:aiScoringEdit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String formId = "formId_example"; // String | Form ID
AiScoringSettings body = new AiScoringSettings(); // AiScoringSettings | AI Scoring Settings
try {
    AiScoringSettings result = apiInstance.putQualityFormsEvaluationAiscoringSettings(formId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#putQualityFormsEvaluationAiscoringSettings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **formId** | **String**| Form ID | 
| **body** | [**AiScoringSettings**](AiScoringSettings)| AI Scoring Settings | 
{: class="table-striped"}


### Return type

[**AiScoringSettings**](AiScoringSettings)


# **putQualityFormsSurvey**


> [SurveyForm](SurveyForm) putQualityFormsSurvey(formId, body)

Update a survey form.

Wraps PUT /api/v2/quality/forms/surveys/{formId}  

Requires ALL permissions: 

* quality:surveyForm:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String formId = "formId_example"; // String | Form ID
SurveyForm body = new SurveyForm(); // SurveyForm | Survey form
try {
    SurveyForm result = apiInstance.putQualityFormsSurvey(formId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#putQualityFormsSurvey");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **formId** | **String**| Form ID | 
| **body** | [**SurveyForm**](SurveyForm)| Survey form | 
{: class="table-striped"}


### Return type

[**SurveyForm**](SurveyForm)


# **putQualitySurveysScorable**


> [ScorableSurvey](ScorableSurvey) putQualitySurveysScorable(customerSurveyUrl, body)

Update a survey as an end-customer, for the purposes of scoring it.

Wraps PUT /api/v2/quality/surveys/scorable  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.api.QualityApi;


QualityApi apiInstance = new QualityApi();
String customerSurveyUrl = "customerSurveyUrl_example"; // String | customerSurveyUrl
ScorableSurvey body = new ScorableSurvey(); // ScorableSurvey | survey
try {
    ScorableSurvey result = apiInstance.putQualitySurveysScorable(customerSurveyUrl, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#putQualitySurveysScorable");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **customerSurveyUrl** | **String**| customerSurveyUrl | 
| **body** | [**ScorableSurvey**](ScorableSurvey)| survey | 
{: class="table-striped"}


### Return type

[**ScorableSurvey**](ScorableSurvey)


_com.mypurecloud.sdk.v2:platform-client-v2:215.0.0_
