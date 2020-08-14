---
title: QualityApi
---
## QualityApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteQualityCalibration**](QualityApi.html#deleteQualityCalibration) | Delete a calibration by id. |
| [**deleteQualityConversationEvaluation**](QualityApi.html#deleteQualityConversationEvaluation) | Delete an evaluation |
| [**deleteQualityForm**](QualityApi.html#deleteQualityForm) | Delete an evaluation form. |
| [**deleteQualityFormsEvaluation**](QualityApi.html#deleteQualityFormsEvaluation) | Delete an evaluation form. |
| [**deleteQualityFormsSurvey**](QualityApi.html#deleteQualityFormsSurvey) | Delete a survey form. |
| [**deleteQualityKeywordset**](QualityApi.html#deleteQualityKeywordset) | Delete a keywordSet by id. |
| [**deleteQualityKeywordsets**](QualityApi.html#deleteQualityKeywordsets) | Delete keyword sets |
| [**getQualityAgentsActivity**](QualityApi.html#getQualityAgentsActivity) | Gets a list of Agent Activities |
| [**getQualityCalibration**](QualityApi.html#getQualityCalibration) | Get a calibration by id.  Requires either calibrator id or conversation id |
| [**getQualityCalibrations**](QualityApi.html#getQualityCalibrations) | Get the list of calibrations |
| [**getQualityConversationAudits**](QualityApi.html#getQualityConversationAudits) | Get audits for conversation or recording |
| [**getQualityConversationEvaluation**](QualityApi.html#getQualityConversationEvaluation) | Get an evaluation |
| [**getQualityConversationSurveys**](QualityApi.html#getQualityConversationSurveys) | Get the surveys for a conversation |
| [**getQualityEvaluationsQuery**](QualityApi.html#getQualityEvaluationsQuery) | Queries Evaluations and returns a paged list |
| [**getQualityEvaluatorsActivity**](QualityApi.html#getQualityEvaluatorsActivity) | Get an evaluator activity |
| [**getQualityForm**](QualityApi.html#getQualityForm) | Get an evaluation form |
| [**getQualityFormVersions**](QualityApi.html#getQualityFormVersions) | Gets all the revisions for a specific evaluation. |
| [**getQualityForms**](QualityApi.html#getQualityForms) | Get the list of evaluation forms |
| [**getQualityFormsEvaluation**](QualityApi.html#getQualityFormsEvaluation) | Get an evaluation form |
| [**getQualityFormsEvaluationVersions**](QualityApi.html#getQualityFormsEvaluationVersions) | Gets all the revisions for a specific evaluation. |
| [**getQualityFormsEvaluations**](QualityApi.html#getQualityFormsEvaluations) | Get the list of evaluation forms |
| [**getQualityFormsSurvey**](QualityApi.html#getQualityFormsSurvey) | Get a survey form |
| [**getQualityFormsSurveyVersions**](QualityApi.html#getQualityFormsSurveyVersions) | Gets all the revisions for a specific survey. |
| [**getQualityFormsSurveys**](QualityApi.html#getQualityFormsSurveys) | Get the list of survey forms |
| [**getQualityFormsSurveysBulk**](QualityApi.html#getQualityFormsSurveysBulk) | Retrieve a list of survey forms by their ids |
| [**getQualityFormsSurveysBulkContexts**](QualityApi.html#getQualityFormsSurveysBulkContexts) | Retrieve a list of the latest form versions by context ids |
| [**getQualityKeywordset**](QualityApi.html#getQualityKeywordset) | Get a keywordSet by id. |
| [**getQualityKeywordsets**](QualityApi.html#getQualityKeywordsets) | Get the list of keyword sets |
| [**getQualityPublishedform**](QualityApi.html#getQualityPublishedform) | Get the published evaluation forms. |
| [**getQualityPublishedforms**](QualityApi.html#getQualityPublishedforms) | Get the published evaluation forms. |
| [**getQualityPublishedformsEvaluation**](QualityApi.html#getQualityPublishedformsEvaluation) | Get the most recent published version of an evaluation form. |
| [**getQualityPublishedformsEvaluations**](QualityApi.html#getQualityPublishedformsEvaluations) | Get the published evaluation forms. |
| [**getQualityPublishedformsSurvey**](QualityApi.html#getQualityPublishedformsSurvey) | Get the most recent published version of a survey form. |
| [**getQualityPublishedformsSurveys**](QualityApi.html#getQualityPublishedformsSurveys) | Get the published survey forms. |
| [**getQualitySurvey**](QualityApi.html#getQualitySurvey) | Get a survey for a conversation |
| [**getQualitySurveysScorable**](QualityApi.html#getQualitySurveysScorable) | Get a survey as an end-customer, for the purposes of scoring it. |
| [**patchQualityFormsSurvey**](QualityApi.html#patchQualityFormsSurvey) | Disable a particular version of a survey form and invalidates any invitations that have already been sent to customers using this version of the form. |
| [**postAnalyticsEvaluationsAggregatesQuery**](QualityApi.html#postAnalyticsEvaluationsAggregatesQuery) | Query for evaluation aggregates |
| [**postAnalyticsSurveysAggregatesQuery**](QualityApi.html#postAnalyticsSurveysAggregatesQuery) | Query for survey aggregates |
| [**postQualityCalibrations**](QualityApi.html#postQualityCalibrations) | Create a calibration |
| [**postQualityConversationEvaluations**](QualityApi.html#postQualityConversationEvaluations) | Create an evaluation |
| [**postQualityEvaluationsScoring**](QualityApi.html#postQualityEvaluationsScoring) | Score evaluation |
| [**postQualityForms**](QualityApi.html#postQualityForms) | Create an evaluation form. |
| [**postQualityFormsEvaluations**](QualityApi.html#postQualityFormsEvaluations) | Create an evaluation form. |
| [**postQualityFormsSurveys**](QualityApi.html#postQualityFormsSurveys) | Create a survey form. |
| [**postQualityKeywordsets**](QualityApi.html#postQualityKeywordsets) | Create a Keyword Set |
| [**postQualityPublishedforms**](QualityApi.html#postQualityPublishedforms) | Publish an evaluation form. |
| [**postQualityPublishedformsEvaluations**](QualityApi.html#postQualityPublishedformsEvaluations) | Publish an evaluation form. |
| [**postQualityPublishedformsSurveys**](QualityApi.html#postQualityPublishedformsSurveys) | Publish a survey form. |
| [**postQualitySpotability**](QualityApi.html#postQualitySpotability) | Retrieve the spotability statistic |
| [**postQualitySurveysScoring**](QualityApi.html#postQualitySurveysScoring) | Score survey |
| [**putQualityCalibration**](QualityApi.html#putQualityCalibration) | Update a calibration to the specified calibration via PUT.  Editable fields include: evaluators, expertEvaluator, and scoringIndex |
| [**putQualityConversationEvaluation**](QualityApi.html#putQualityConversationEvaluation) | Update an evaluation |
| [**putQualityForm**](QualityApi.html#putQualityForm) | Update an evaluation form. |
| [**putQualityFormsEvaluation**](QualityApi.html#putQualityFormsEvaluation) | Update an evaluation form. |
| [**putQualityFormsSurvey**](QualityApi.html#putQualityFormsSurvey) | Update a survey form. |
| [**putQualityKeywordset**](QualityApi.html#putQualityKeywordset) | Update a keywordSet to the specified keywordSet via PUT. |
| [**putQualitySurveysScorable**](QualityApi.html#putQualitySurveysScorable) | Update a survey as an end-customer, for the purposes of scoring it. |
{: class="table-striped"}

<a name="deleteQualityCalibration"></a>

# **deleteQualityCalibration**



> [Calibration](Calibration.html) deleteQualityCalibration(calibrationId, calibratorId)

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

[**Calibration**](Calibration.html)

<a name="deleteQualityConversationEvaluation"></a>

# **deleteQualityConversationEvaluation**



> [Evaluation](Evaluation.html) deleteQualityConversationEvaluation(conversationId, evaluationId, expand)

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
String expand = "expand_example"; // String | evaluatorId
try {
    Evaluation result = apiInstance.deleteQualityConversationEvaluation(conversationId, evaluationId, expand);
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
| **expand** | **String**| evaluatorId | [optional] 
{: class="table-striped"}


### Return type

[**Evaluation**](Evaluation.html)

<a name="deleteQualityForm"></a>

# **deleteQualityForm**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

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

<a name="deleteQualityFormsEvaluation"></a>

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

<a name="deleteQualityFormsSurvey"></a>

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

<a name="deleteQualityKeywordset"></a>

# **deleteQualityKeywordset**



> Void deleteQualityKeywordset(keywordSetId)

Delete a keywordSet by id.



Wraps DELETE /api/v2/quality/keywordsets/{keywordSetId}  

Requires ANY permissions: 

* quality:keywordset:delete

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
String keywordSetId = "keywordSetId_example"; // String | KeywordSet ID
try {
    apiInstance.deleteQualityKeywordset(keywordSetId);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#deleteQualityKeywordset");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **keywordSetId** | **String**| KeywordSet ID | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteQualityKeywordsets"></a>

# **deleteQualityKeywordsets**



> Void deleteQualityKeywordsets(ids)

Delete keyword sets

Bulk delete of keyword sets; this will only delete the keyword sets that match the ids specified in the query param.

Wraps DELETE /api/v2/quality/keywordsets  

Requires ANY permissions: 

* quality:keywordset:delete

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
String ids = "ids_example"; // String | A comma-delimited list of valid KeywordSet ids
try {
    apiInstance.deleteQualityKeywordsets(ids);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#deleteQualityKeywordsets");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ids** | **String**| A comma-delimited list of valid KeywordSet ids | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="getQualityAgentsActivity"></a>

# **getQualityAgentsActivity**



> [AgentActivityEntityListing](AgentActivityEntityListing.html) getQualityAgentsActivity(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, startTime, endTime, agentUserId, evaluatorUserId, name, group)

Gets a list of Agent Activities

Including the number of evaluations and average evaluation score

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
List<Object> expand = null; // List<Object> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
Date startTime = new Date(); // Date | Start time of agent activity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
Date endTime = new Date(); // Date | End time of agent activity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
List<Object> agentUserId = null; // List<Object> | user id of agent requested
String evaluatorUserId = "evaluatorUserId_example"; // String | user id of the evaluator
String name = "name_example"; // String | name
String group = "group_example"; // String | group id
try {
    AgentActivityEntityListing result = apiInstance.getQualityAgentsActivity(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, startTime, endTime, agentUserId, evaluatorUserId, name, group);
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
| **expand** | [**List&lt;Object&gt;**](Object.html)| variable name requested by expand list | [optional] 
| **nextPage** | **String**| next page token | [optional] 
| **previousPage** | **String**| Previous page token | [optional] 
| **startTime** | **Date**| Start time of agent activity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ | [optional] 
| **endTime** | **Date**| End time of agent activity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ | [optional] 
| **agentUserId** | [**List&lt;Object&gt;**](Object.html)| user id of agent requested | [optional] 
| **evaluatorUserId** | **String**| user id of the evaluator | [optional] 
| **name** | **String**| name | [optional] 
| **group** | **String**| group id | [optional] 
{: class="table-striped"}


### Return type

[**AgentActivityEntityListing**](AgentActivityEntityListing.html)

<a name="getQualityCalibration"></a>

# **getQualityCalibration**



> [Calibration](Calibration.html) getQualityCalibration(calibrationId, calibratorId, conversationId)

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

[**Calibration**](Calibration.html)

<a name="getQualityCalibrations"></a>

# **getQualityCalibrations**



> [CalibrationEntityListing](CalibrationEntityListing.html) getQualityCalibrations(calibratorId, pageSize, pageNumber, sortBy, expand, nextPage, previousPage, conversationId, startTime, endTime)

Get the list of calibrations



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
List<Object> expand = null; // List<Object> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
String conversationId = "conversationId_example"; // String | conversation id
Date startTime = new Date(); // Date | Beginning of the calibration query. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
Date endTime = new Date(); // Date | end of the calibration query. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
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
| **expand** | [**List&lt;Object&gt;**](Object.html)| variable name requested by expand list | [optional] 
| **nextPage** | **String**| next page token | [optional] 
| **previousPage** | **String**| Previous page token | [optional] 
| **conversationId** | **String**| conversation id | [optional] 
| **startTime** | **Date**| Beginning of the calibration query. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ | [optional] 
| **endTime** | **Date**| end of the calibration query. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ | [optional] 
{: class="table-striped"}


### Return type

[**CalibrationEntityListing**](CalibrationEntityListing.html)

<a name="getQualityConversationAudits"></a>

# **getQualityConversationAudits**



> [QualityAuditPage](QualityAuditPage.html) getQualityConversationAudits(conversationId, pageSize, pageNumber, sortBy, expand, nextPage, previousPage, recordingId, entityType)

Get audits for conversation or recording

Different permissions are required for viewing different resource audit entries.  The quality:evaluation:viewAudit permission is required to view evaluation audits, the recording:recording:viewAudit permission is required to view recording audits, and so on.

Wraps GET /api/v2/quality/conversations/{conversationId}/audits  

Requires ANY permissions: 

* quality:calibration:viewAudit
* quality:evaluation:viewAudit
* quality:survey:viewAudit
* recording:recording:viewAudit
* recording:annotation:viewAudit
* recording:screenRecording:viewAudit

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
String conversationId = "conversationId_example"; // String | Conversation ID
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<Object> expand = null; // List<Object> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
String recordingId = "recordingId_example"; // String | id of the recording
String entityType = "Recording"; // String | entity type options: Recording, Calibration, Evaluation, Annotation, Screen_Recording
try {
    QualityAuditPage result = apiInstance.getQualityConversationAudits(conversationId, pageSize, pageNumber, sortBy, expand, nextPage, previousPage, recordingId, entityType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualityConversationAudits");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| Conversation ID | 
| **pageSize** | **Integer**| The total page size requested | [optional] [default to 25] 
| **pageNumber** | **Integer**| The page number requested | [optional] [default to 1] 
| **sortBy** | **String**| variable name requested to sort by | [optional] 
| **expand** | [**List&lt;Object&gt;**](Object.html)| variable name requested by expand list | [optional] 
| **nextPage** | **String**| next page token | [optional] 
| **previousPage** | **String**| Previous page token | [optional] 
| **recordingId** | **String**| id of the recording | [optional] 
| **entityType** | **String**| entity type options: Recording, Calibration, Evaluation, Annotation, Screen_Recording | [optional] [default to Recording] 
{: class="table-striped"}


### Return type

[**QualityAuditPage**](QualityAuditPage.html)

<a name="getQualityConversationEvaluation"></a>

# **getQualityConversationEvaluation**



> [Evaluation](Evaluation.html) getQualityConversationEvaluation(conversationId, evaluationId, expand)

Get an evaluation



Wraps GET /api/v2/quality/conversations/{conversationId}/evaluations/{evaluationId}  

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
String conversationId = "conversationId_example"; // String | conversationId
String evaluationId = "evaluationId_example"; // String | evaluationId
String expand = "expand_example"; // String | agent, evaluator, evaluationForm
try {
    Evaluation result = apiInstance.getQualityConversationEvaluation(conversationId, evaluationId, expand);
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
| **expand** | **String**| agent, evaluator, evaluationForm | [optional] 
{: class="table-striped"}


### Return type

[**Evaluation**](Evaluation.html)

<a name="getQualityConversationSurveys"></a>

# **getQualityConversationSurveys**



> [List&lt;Survey&gt;](Survey.html) getQualityConversationSurveys(conversationId)

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

[**List&lt;Survey&gt;**](Survey.html)

<a name="getQualityEvaluationsQuery"></a>

# **getQualityEvaluationsQuery**



> [EvaluationEntityListing](EvaluationEntityListing.html) getQualityEvaluationsQuery(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, conversationId, agentUserId, evaluatorUserId, queueId, startTime, endTime, evaluationState, isReleased, agentHasRead, expandAnswerTotalScores, maximum, sortOrder)

Queries Evaluations and returns a paged list

Query params must include one of conversationId, evaluatorUserId, or agentUserId

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
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<Object> expand = null; // List<Object> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
String conversationId = "conversationId_example"; // String | conversationId specified
String agentUserId = "agentUserId_example"; // String | user id of the agent
String evaluatorUserId = "evaluatorUserId_example"; // String | evaluator user id
String queueId = "queueId_example"; // String | queue id
String startTime = "startTime_example"; // String | start time of the evaluation query
String endTime = "endTime_example"; // String | end time of the evaluation query
List<Object> evaluationState = null; // List<Object> | 
Boolean isReleased = true; // Boolean | the evaluation has been released
Boolean agentHasRead = true; // Boolean | agent has the evaluation
Boolean expandAnswerTotalScores = true; // Boolean | get the total scores for evaluations
Integer maximum = 56; // Integer | maximum
String sortOrder = "sortOrder_example"; // String | sort order options for agentUserId or evaluatorUserId query. Valid options are 'a', 'asc', 'ascending', 'd', 'desc', 'descending'
try {
    EvaluationEntityListing result = apiInstance.getQualityEvaluationsQuery(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, conversationId, agentUserId, evaluatorUserId, queueId, startTime, endTime, evaluationState, isReleased, agentHasRead, expandAnswerTotalScores, maximum, sortOrder);
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
| **sortBy** | **String**| variable name requested to sort by | [optional] 
| **expand** | [**List&lt;Object&gt;**](Object.html)| variable name requested by expand list | [optional] 
| **nextPage** | **String**| next page token | [optional] 
| **previousPage** | **String**| Previous page token | [optional] 
| **conversationId** | **String**| conversationId specified | [optional] 
| **agentUserId** | **String**| user id of the agent | [optional] 
| **evaluatorUserId** | **String**| evaluator user id | [optional] 
| **queueId** | **String**| queue id | [optional] 
| **startTime** | **String**| start time of the evaluation query | [optional] 
| **endTime** | **String**| end time of the evaluation query | [optional] 
| **evaluationState** | [**List&lt;Object&gt;**](Object.html)|  | [optional] 
| **isReleased** | **Boolean**| the evaluation has been released | [optional] 
| **agentHasRead** | **Boolean**| agent has the evaluation | [optional] 
| **expandAnswerTotalScores** | **Boolean**| get the total scores for evaluations | [optional] 
| **maximum** | **Integer**| maximum | [optional] 
| **sortOrder** | **String**| sort order options for agentUserId or evaluatorUserId query. Valid options are &#39;a&#39;, &#39;asc&#39;, &#39;ascending&#39;, &#39;d&#39;, &#39;desc&#39;, &#39;descending&#39; | [optional] 
{: class="table-striped"}


### Return type

[**EvaluationEntityListing**](EvaluationEntityListing.html)

<a name="getQualityEvaluatorsActivity"></a>

# **getQualityEvaluatorsActivity**



> [EvaluatorActivityEntityListing](EvaluatorActivityEntityListing.html) getQualityEvaluatorsActivity(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, startTime, endTime, name, permission, group)

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
List<Object> expand = null; // List<Object> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
Date startTime = new Date(); // Date | The start time specified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
Date endTime = new Date(); // Date | The end time specified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
String name = "name_example"; // String | Evaluator name
List<Object> permission = null; // List<Object> | permission strings
String group = "group_example"; // String | group id
try {
    EvaluatorActivityEntityListing result = apiInstance.getQualityEvaluatorsActivity(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, startTime, endTime, name, permission, group);
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
| **expand** | [**List&lt;Object&gt;**](Object.html)| variable name requested by expand list | [optional] 
| **nextPage** | **String**| next page token | [optional] 
| **previousPage** | **String**| Previous page token | [optional] 
| **startTime** | **Date**| The start time specified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ | [optional] 
| **endTime** | **Date**| The end time specified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ | [optional] 
| **name** | **String**| Evaluator name | [optional] 
| **permission** | [**List&lt;Object&gt;**](Object.html)| permission strings | [optional] 
| **group** | **String**| group id | [optional] 
{: class="table-striped"}


### Return type

[**EvaluatorActivityEntityListing**](EvaluatorActivityEntityListing.html)

<a name="getQualityForm"></a>

# **getQualityForm**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [EvaluationForm](EvaluationForm.html) getQualityForm(formId)

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
    EvaluationForm result = apiInstance.getQualityForm(formId);
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

[**EvaluationForm**](EvaluationForm.html)

<a name="getQualityFormVersions"></a>

# **getQualityFormVersions**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [EvaluationFormEntityListing](EvaluationFormEntityListing.html) getQualityFormVersions(formId, pageSize, pageNumber)

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
    EvaluationFormEntityListing result = apiInstance.getQualityFormVersions(formId, pageSize, pageNumber);
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

[**EvaluationFormEntityListing**](EvaluationFormEntityListing.html)

<a name="getQualityForms"></a>

# **getQualityForms**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [EvaluationFormEntityListing](EvaluationFormEntityListing.html) getQualityForms(pageSize, pageNumber, sortBy, nextPage, previousPage, expand, name, sortOrder)

Get the list of evaluation forms



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
String expand = "expand_example"; // String | Expand
String name = "name_example"; // String | Name
String sortOrder = "sortOrder_example"; // String | Order to sort results, either asc or desc
try {
    EvaluationFormEntityListing result = apiInstance.getQualityForms(pageSize, pageNumber, sortBy, nextPage, previousPage, expand, name, sortOrder);
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
| **expand** | **String**| Expand | [optional] 
| **name** | **String**| Name | [optional] 
| **sortOrder** | **String**| Order to sort results, either asc or desc | [optional] 
{: class="table-striped"}


### Return type

[**EvaluationFormEntityListing**](EvaluationFormEntityListing.html)

<a name="getQualityFormsEvaluation"></a>

# **getQualityFormsEvaluation**



> [EvaluationForm](EvaluationForm.html) getQualityFormsEvaluation(formId)

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
    EvaluationForm result = apiInstance.getQualityFormsEvaluation(formId);
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

[**EvaluationForm**](EvaluationForm.html)

<a name="getQualityFormsEvaluationVersions"></a>

# **getQualityFormsEvaluationVersions**



> [EvaluationFormEntityListing](EvaluationFormEntityListing.html) getQualityFormsEvaluationVersions(formId, pageSize, pageNumber)

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
try {
    EvaluationFormEntityListing result = apiInstance.getQualityFormsEvaluationVersions(formId, pageSize, pageNumber);
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
{: class="table-striped"}


### Return type

[**EvaluationFormEntityListing**](EvaluationFormEntityListing.html)

<a name="getQualityFormsEvaluations"></a>

# **getQualityFormsEvaluations**



> [EvaluationFormEntityListing](EvaluationFormEntityListing.html) getQualityFormsEvaluations(pageSize, pageNumber, sortBy, nextPage, previousPage, expand, name, sortOrder)

Get the list of evaluation forms



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
String expand = "expand_example"; // String | Expand
String name = "name_example"; // String | Name
String sortOrder = "sortOrder_example"; // String | Order to sort results, either asc or desc
try {
    EvaluationFormEntityListing result = apiInstance.getQualityFormsEvaluations(pageSize, pageNumber, sortBy, nextPage, previousPage, expand, name, sortOrder);
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
| **expand** | **String**| Expand | [optional] 
| **name** | **String**| Name | [optional] 
| **sortOrder** | **String**| Order to sort results, either asc or desc | [optional] 
{: class="table-striped"}


### Return type

[**EvaluationFormEntityListing**](EvaluationFormEntityListing.html)

<a name="getQualityFormsSurvey"></a>

# **getQualityFormsSurvey**



> [SurveyForm](SurveyForm.html) getQualityFormsSurvey(formId)

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

[**SurveyForm**](SurveyForm.html)

<a name="getQualityFormsSurveyVersions"></a>

# **getQualityFormsSurveyVersions**



> [SurveyFormEntityListing](SurveyFormEntityListing.html) getQualityFormsSurveyVersions(formId, pageSize, pageNumber)

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

[**SurveyFormEntityListing**](SurveyFormEntityListing.html)

<a name="getQualityFormsSurveys"></a>

# **getQualityFormsSurveys**



> [SurveyFormEntityListing](SurveyFormEntityListing.html) getQualityFormsSurveys(pageSize, pageNumber, sortBy, nextPage, previousPage, expand, name, sortOrder)

Get the list of survey forms



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
String expand = "expand_example"; // String | Expand
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
| **expand** | **String**| Expand | [optional] 
| **name** | **String**| Name | [optional] 
| **sortOrder** | **String**| Order to sort results, either asc or desc | [optional] 
{: class="table-striped"}


### Return type

[**SurveyFormEntityListing**](SurveyFormEntityListing.html)

<a name="getQualityFormsSurveysBulk"></a>

# **getQualityFormsSurveysBulk**



> [SurveyFormEntityListing](SurveyFormEntityListing.html) getQualityFormsSurveysBulk(id)

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
List<String> id = Arrays.asList("id_example"); // List<String> | A comma-delimited list of valid survey form ids
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
| **id** | [**List&lt;String&gt;**](String.html)| A comma-delimited list of valid survey form ids | 
{: class="table-striped"}


### Return type

[**SurveyFormEntityListing**](SurveyFormEntityListing.html)

<a name="getQualityFormsSurveysBulkContexts"></a>

# **getQualityFormsSurveysBulkContexts**



> [SurveyFormEntityListing](SurveyFormEntityListing.html) getQualityFormsSurveysBulkContexts(contextId, published)

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
List<String> contextId = Arrays.asList("contextId_example"); // List<String> | A comma-delimited list of valid survey form context ids
Boolean published = true; // Boolean | If true, the latest published version will be included. If false, only the unpublished version will be included.
try {
    SurveyFormEntityListing result = apiInstance.getQualityFormsSurveysBulkContexts(contextId, published);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualityFormsSurveysBulkContexts");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **contextId** | [**List&lt;String&gt;**](String.html)| A comma-delimited list of valid survey form context ids | 
| **published** | **Boolean**| If true, the latest published version will be included. If false, only the unpublished version will be included. | [optional] [default to true] 
{: class="table-striped"}


### Return type

[**SurveyFormEntityListing**](SurveyFormEntityListing.html)

<a name="getQualityKeywordset"></a>

# **getQualityKeywordset**



> [KeywordSet](KeywordSet.html) getQualityKeywordset(keywordSetId)

Get a keywordSet by id.



Wraps GET /api/v2/quality/keywordsets/{keywordSetId}  

Requires ANY permissions: 

* quality:keywordset:view

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
String keywordSetId = "keywordSetId_example"; // String | KeywordSet ID
try {
    KeywordSet result = apiInstance.getQualityKeywordset(keywordSetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualityKeywordset");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **keywordSetId** | **String**| KeywordSet ID | 
{: class="table-striped"}


### Return type

[**KeywordSet**](KeywordSet.html)

<a name="getQualityKeywordsets"></a>

# **getQualityKeywordsets**



> [KeywordSetEntityListing](KeywordSetEntityListing.html) getQualityKeywordsets(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, name, queueId, agentId, operator)

Get the list of keyword sets



Wraps GET /api/v2/quality/keywordsets  

Requires ANY permissions: 

* quality:keywordset:view

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
List<Object> expand = null; // List<Object> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
String name = "name_example"; // String | the keyword set name - used for filtering results in searches.
String queueId = "queueId_example"; // String | the queue id - used for filtering results in searches.
String agentId = "agentId_example"; // String | the agent id - used for filtering results in searches.
String operator = "operator_example"; // String | If agentID and queueId are both present, this determines whether the query is an AND or OR between those parameters.
try {
    KeywordSetEntityListing result = apiInstance.getQualityKeywordsets(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, name, queueId, agentId, operator);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualityKeywordsets");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| The total page size requested | [optional] [default to 25] 
| **pageNumber** | **Integer**| The page number requested | [optional] [default to 1] 
| **sortBy** | **String**| variable name requested to sort by | [optional] 
| **expand** | [**List&lt;Object&gt;**](Object.html)| variable name requested by expand list | [optional] 
| **nextPage** | **String**| next page token | [optional] 
| **previousPage** | **String**| Previous page token | [optional] 
| **name** | **String**| the keyword set name - used for filtering results in searches. | [optional] 
| **queueId** | **String**| the queue id - used for filtering results in searches. | [optional] 
| **agentId** | **String**| the agent id - used for filtering results in searches. | [optional] 
| **operator** | **String**| If agentID and queueId are both present, this determines whether the query is an AND or OR between those parameters. | [optional]<br />**Values**: AND, OR 
{: class="table-striped"}


### Return type

[**KeywordSetEntityListing**](KeywordSetEntityListing.html)

<a name="getQualityPublishedform"></a>

# **getQualityPublishedform**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [EvaluationForm](EvaluationForm.html) getQualityPublishedform(formId)

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
    EvaluationForm result = apiInstance.getQualityPublishedform(formId);
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

[**EvaluationForm**](EvaluationForm.html)

<a name="getQualityPublishedforms"></a>

# **getQualityPublishedforms**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [EvaluationFormEntityListing](EvaluationFormEntityListing.html) getQualityPublishedforms(pageSize, pageNumber, name, onlyLatestPerContext)

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
    EvaluationFormEntityListing result = apiInstance.getQualityPublishedforms(pageSize, pageNumber, name, onlyLatestPerContext);
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

[**EvaluationFormEntityListing**](EvaluationFormEntityListing.html)

<a name="getQualityPublishedformsEvaluation"></a>

# **getQualityPublishedformsEvaluation**



> [EvaluationForm](EvaluationForm.html) getQualityPublishedformsEvaluation(formId)

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
    EvaluationForm result = apiInstance.getQualityPublishedformsEvaluation(formId);
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

[**EvaluationForm**](EvaluationForm.html)

<a name="getQualityPublishedformsEvaluations"></a>

# **getQualityPublishedformsEvaluations**



> [EvaluationFormEntityListing](EvaluationFormEntityListing.html) getQualityPublishedformsEvaluations(pageSize, pageNumber, name, onlyLatestPerContext)

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
    EvaluationFormEntityListing result = apiInstance.getQualityPublishedformsEvaluations(pageSize, pageNumber, name, onlyLatestPerContext);
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

[**EvaluationFormEntityListing**](EvaluationFormEntityListing.html)

<a name="getQualityPublishedformsSurvey"></a>

# **getQualityPublishedformsSurvey**



> [SurveyForm](SurveyForm.html) getQualityPublishedformsSurvey(formId)

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

[**SurveyForm**](SurveyForm.html)

<a name="getQualityPublishedformsSurveys"></a>

# **getQualityPublishedformsSurveys**



> [SurveyFormEntityListing](SurveyFormEntityListing.html) getQualityPublishedformsSurveys(pageSize, pageNumber, name, onlyLatestEnabledPerContext)

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

[**SurveyFormEntityListing**](SurveyFormEntityListing.html)

<a name="getQualitySurvey"></a>

# **getQualitySurvey**



> [Survey](Survey.html) getQualitySurvey(surveyId)

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

[**Survey**](Survey.html)

<a name="getQualitySurveysScorable"></a>

# **getQualitySurveysScorable**



> [ScorableSurvey](ScorableSurvey.html) getQualitySurveysScorable(customerSurveyUrl)

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

[**ScorableSurvey**](ScorableSurvey.html)

<a name="patchQualityFormsSurvey"></a>

# **patchQualityFormsSurvey**



> [SurveyForm](SurveyForm.html) patchQualityFormsSurvey(formId, body)

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
| **body** | [**SurveyForm**](SurveyForm.html)| Survey form | 
{: class="table-striped"}


### Return type

[**SurveyForm**](SurveyForm.html)

<a name="postAnalyticsEvaluationsAggregatesQuery"></a>

# **postAnalyticsEvaluationsAggregatesQuery**



> [EvaluationAggregateQueryResponse](EvaluationAggregateQueryResponse.html) postAnalyticsEvaluationsAggregatesQuery(body)

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
| **body** | [**EvaluationAggregationQuery**](EvaluationAggregationQuery.html)| query | 
{: class="table-striped"}


### Return type

[**EvaluationAggregateQueryResponse**](EvaluationAggregateQueryResponse.html)

<a name="postAnalyticsSurveysAggregatesQuery"></a>

# **postAnalyticsSurveysAggregatesQuery**



> [SurveyAggregateQueryResponse](SurveyAggregateQueryResponse.html) postAnalyticsSurveysAggregatesQuery(body)

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
| **body** | [**SurveyAggregationQuery**](SurveyAggregationQuery.html)| query | 
{: class="table-striped"}


### Return type

[**SurveyAggregateQueryResponse**](SurveyAggregateQueryResponse.html)

<a name="postQualityCalibrations"></a>

# **postQualityCalibrations**



> [Calibration](Calibration.html) postQualityCalibrations(body, expand)

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
| **body** | [**CalibrationCreate**](CalibrationCreate.html)| calibration | 
| **expand** | **String**| calibratorId | [optional] 
{: class="table-striped"}


### Return type

[**Calibration**](Calibration.html)

<a name="postQualityConversationEvaluations"></a>

# **postQualityConversationEvaluations**



> [Evaluation](Evaluation.html) postQualityConversationEvaluations(conversationId, body, expand)

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
Evaluation body = new Evaluation(); // Evaluation | evaluation
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
| **body** | [**Evaluation**](Evaluation.html)| evaluation | 
| **expand** | **String**| evaluatorId | [optional] 
{: class="table-striped"}


### Return type

[**Evaluation**](Evaluation.html)

<a name="postQualityEvaluationsScoring"></a>

# **postQualityEvaluationsScoring**



> [EvaluationScoringSet](EvaluationScoringSet.html) postQualityEvaluationsScoring(body)

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
| **body** | [**EvaluationFormAndScoringSet**](EvaluationFormAndScoringSet.html)| evaluationAndScoringSet | 
{: class="table-striped"}


### Return type

[**EvaluationScoringSet**](EvaluationScoringSet.html)

<a name="postQualityForms"></a>

# **postQualityForms**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [EvaluationForm](EvaluationForm.html) postQualityForms(body)

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
    EvaluationForm result = apiInstance.postQualityForms(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#postQualityForms");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**EvaluationForm**](EvaluationForm.html)| Evaluation form | 
{: class="table-striped"}


### Return type

[**EvaluationForm**](EvaluationForm.html)

<a name="postQualityFormsEvaluations"></a>

# **postQualityFormsEvaluations**



> [EvaluationForm](EvaluationForm.html) postQualityFormsEvaluations(body)

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
    EvaluationForm result = apiInstance.postQualityFormsEvaluations(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#postQualityFormsEvaluations");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**EvaluationForm**](EvaluationForm.html)| Evaluation form | 
{: class="table-striped"}


### Return type

[**EvaluationForm**](EvaluationForm.html)

<a name="postQualityFormsSurveys"></a>

# **postQualityFormsSurveys**



> [SurveyForm](SurveyForm.html) postQualityFormsSurveys(body)

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
| **body** | [**SurveyForm**](SurveyForm.html)| Survey form | 
{: class="table-striped"}


### Return type

[**SurveyForm**](SurveyForm.html)

<a name="postQualityKeywordsets"></a>

# **postQualityKeywordsets**



> [KeywordSet](KeywordSet.html) postQualityKeywordsets(body, expand)

Create a Keyword Set



Wraps POST /api/v2/quality/keywordsets  

Requires ANY permissions: 

* quality:keywordset:add

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
KeywordSet body = new KeywordSet(); // KeywordSet | keywordSet
String expand = "expand_example"; // String | queueId
try {
    KeywordSet result = apiInstance.postQualityKeywordsets(body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#postQualityKeywordsets");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**KeywordSet**](KeywordSet.html)| keywordSet | 
| **expand** | **String**| queueId | [optional] 
{: class="table-striped"}


### Return type

[**KeywordSet**](KeywordSet.html)

<a name="postQualityPublishedforms"></a>

# **postQualityPublishedforms**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [EvaluationForm](EvaluationForm.html) postQualityPublishedforms(body)

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
    EvaluationForm result = apiInstance.postQualityPublishedforms(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#postQualityPublishedforms");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**PublishForm**](PublishForm.html)| Publish request containing id of form to publish | 
{: class="table-striped"}


### Return type

[**EvaluationForm**](EvaluationForm.html)

<a name="postQualityPublishedformsEvaluations"></a>

# **postQualityPublishedformsEvaluations**



> [EvaluationForm](EvaluationForm.html) postQualityPublishedformsEvaluations(body)

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
    EvaluationForm result = apiInstance.postQualityPublishedformsEvaluations(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#postQualityPublishedformsEvaluations");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**PublishForm**](PublishForm.html)| Publish request containing id of form to publish | 
{: class="table-striped"}


### Return type

[**EvaluationForm**](EvaluationForm.html)

<a name="postQualityPublishedformsSurveys"></a>

# **postQualityPublishedformsSurveys**



> [SurveyForm](SurveyForm.html) postQualityPublishedformsSurveys(body)

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
| **body** | [**PublishForm**](PublishForm.html)| Survey form | 
{: class="table-striped"}


### Return type

[**SurveyForm**](SurveyForm.html)

<a name="postQualitySpotability"></a>

# **postQualitySpotability**



> [KeywordSet](KeywordSet.html) postQualitySpotability(body)

Retrieve the spotability statistic



Wraps POST /api/v2/quality/spotability  

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
KeywordSet body = new KeywordSet(); // KeywordSet | Keyword Set
try {
    KeywordSet result = apiInstance.postQualitySpotability(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#postQualitySpotability");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**KeywordSet**](KeywordSet.html)| Keyword Set | [optional] 
{: class="table-striped"}


### Return type

[**KeywordSet**](KeywordSet.html)

<a name="postQualitySurveysScoring"></a>

# **postQualitySurveysScoring**



> [SurveyScoringSet](SurveyScoringSet.html) postQualitySurveysScoring(body)

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
| **body** | [**SurveyFormAndScoringSet**](SurveyFormAndScoringSet.html)| surveyAndScoringSet | 
{: class="table-striped"}


### Return type

[**SurveyScoringSet**](SurveyScoringSet.html)

<a name="putQualityCalibration"></a>

# **putQualityCalibration**



> [Calibration](Calibration.html) putQualityCalibration(calibrationId, body)

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
| **body** | [**Calibration**](Calibration.html)| Calibration | 
{: class="table-striped"}


### Return type

[**Calibration**](Calibration.html)

<a name="putQualityConversationEvaluation"></a>

# **putQualityConversationEvaluation**



> [Evaluation](Evaluation.html) putQualityConversationEvaluation(conversationId, evaluationId, body, expand)

Update an evaluation

The quality:evaluation:edit permission allows modification of most fields, while the quality:evaluation:editScore permission allows an evaluator to change just the question scores, and the quality:evaluation:editAgentSignoff permission allows an agent to change the agent comments and sign off on the evaluation.

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
String expand = "expand_example"; // String | evaluatorId
try {
    Evaluation result = apiInstance.putQualityConversationEvaluation(conversationId, evaluationId, body, expand);
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
| **body** | [**Evaluation**](Evaluation.html)| evaluation | 
| **expand** | **String**| evaluatorId | [optional] 
{: class="table-striped"}


### Return type

[**Evaluation**](Evaluation.html)

<a name="putQualityForm"></a>

# **putQualityForm**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [EvaluationForm](EvaluationForm.html) putQualityForm(formId, body)

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
    EvaluationForm result = apiInstance.putQualityForm(formId, body);
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
| **body** | [**EvaluationForm**](EvaluationForm.html)| Evaluation form | 
{: class="table-striped"}


### Return type

[**EvaluationForm**](EvaluationForm.html)

<a name="putQualityFormsEvaluation"></a>

# **putQualityFormsEvaluation**



> [EvaluationForm](EvaluationForm.html) putQualityFormsEvaluation(formId, body)

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
    EvaluationForm result = apiInstance.putQualityFormsEvaluation(formId, body);
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
| **body** | [**EvaluationForm**](EvaluationForm.html)| Evaluation form | 
{: class="table-striped"}


### Return type

[**EvaluationForm**](EvaluationForm.html)

<a name="putQualityFormsSurvey"></a>

# **putQualityFormsSurvey**



> [SurveyForm](SurveyForm.html) putQualityFormsSurvey(formId, body)

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
| **body** | [**SurveyForm**](SurveyForm.html)| Survey form | 
{: class="table-striped"}


### Return type

[**SurveyForm**](SurveyForm.html)

<a name="putQualityKeywordset"></a>

# **putQualityKeywordset**



> [KeywordSet](KeywordSet.html) putQualityKeywordset(keywordSetId, body)

Update a keywordSet to the specified keywordSet via PUT.



Wraps PUT /api/v2/quality/keywordsets/{keywordSetId}  

Requires ANY permissions: 

* quality:keywordset:edit

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
String keywordSetId = "keywordSetId_example"; // String | KeywordSet ID
KeywordSet body = new KeywordSet(); // KeywordSet | keywordSet
try {
    KeywordSet result = apiInstance.putQualityKeywordset(keywordSetId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#putQualityKeywordset");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **keywordSetId** | **String**| KeywordSet ID | 
| **body** | [**KeywordSet**](KeywordSet.html)| keywordSet | 
{: class="table-striped"}


### Return type

[**KeywordSet**](KeywordSet.html)

<a name="putQualitySurveysScorable"></a>

# **putQualitySurveysScorable**



> [ScorableSurvey](ScorableSurvey.html) putQualitySurveysScorable(body, customerSurveyUrl)

Update a survey as an end-customer, for the purposes of scoring it.



Wraps PUT /api/v2/quality/surveys/scorable  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.api.QualityApi;


QualityApi apiInstance = new QualityApi();
ScorableSurvey body = new ScorableSurvey(); // ScorableSurvey | survey
String customerSurveyUrl = "customerSurveyUrl_example"; // String | customerSurveyUrl
try {
    ScorableSurvey result = apiInstance.putQualitySurveysScorable(body, customerSurveyUrl);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#putQualitySurveysScorable");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**ScorableSurvey**](ScorableSurvey.html)| survey | 
| **customerSurveyUrl** | **String**| customerSurveyUrl | [optional] 
{: class="table-striped"}


### Return type

[**ScorableSurvey**](ScorableSurvey.html)

