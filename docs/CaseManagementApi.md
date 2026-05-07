# CaseManagementApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteCasemanagementCase**](CaseManagementApi#deleteCasemanagementCase) | Delete a Case. |
| [**deleteCasemanagementCaseplan**](CaseManagementApi#deleteCasemanagementCaseplan) | Delete a Caseplan. |
| [**getCasemanagementCase**](CaseManagementApi#getCasemanagementCase) | Get a Case. |
| [**getCasemanagementCaseAssociation**](CaseManagementApi#getCasemanagementCaseAssociation) | Get a Case Association. |
| [**getCasemanagementCaseAssociations**](CaseManagementApi#getCasemanagementCaseAssociations) | Get a list of case associations for a provided case. |
| [**getCasemanagementCaseStage**](CaseManagementApi#getCasemanagementCaseStage) | Get a Stage. |
| [**getCasemanagementCaseStageStep**](CaseManagementApi#getCasemanagementCaseStageStep) | Get a Step. |
| [**getCasemanagementCaseStageSteps**](CaseManagementApi#getCasemanagementCaseStageSteps) | Get a list of Steps. |
| [**getCasemanagementCaseStages**](CaseManagementApi#getCasemanagementCaseStages) | Get a list of Stages. |
| [**getCasemanagementCaseTerminateJob**](CaseManagementApi#getCasemanagementCaseTerminateJob) | Get a Terminate Job for a Case. |
| [**getCasemanagementCaseplan**](CaseManagementApi#getCasemanagementCaseplan) | Get a Caseplan. |
| [**getCasemanagementCaseplanVersion**](CaseManagementApi#getCasemanagementCaseplanVersion) | Get a Caseplan version. |
| [**getCasemanagementCaseplanVersionDataschemas**](CaseManagementApi#getCasemanagementCaseplanVersionDataschemas) | Get the dataSchemas for a caseplan version. |
| [**getCasemanagementCaseplanVersionIntakesettings**](CaseManagementApi#getCasemanagementCaseplanVersionIntakesettings) | Get the intake settings for a Caseplan version. |
| [**getCasemanagementCaseplanVersionStageplan**](CaseManagementApi#getCasemanagementCaseplanVersionStageplan) | Get a Stageplan. |
| [**getCasemanagementCaseplanVersionStageplanStepplan**](CaseManagementApi#getCasemanagementCaseplanVersionStageplanStepplan) | Get a Stepplan. |
| [**getCasemanagementCaseplanVersionStageplanStepplans**](CaseManagementApi#getCasemanagementCaseplanVersionStageplanStepplans) | Get a list of Stepplans. |
| [**getCasemanagementCaseplanVersionStageplans**](CaseManagementApi#getCasemanagementCaseplanVersionStageplans) | Get a list of Stageplans. |
| [**getCasemanagementCaseplans**](CaseManagementApi#getCasemanagementCaseplans) | Get a list of Caseplans. |
| [**getCasemanagementCasesExternalcontact**](CaseManagementApi#getCasemanagementCasesExternalcontact) | Get a list of cases for provided external contact id. |
| [**getCasemanagementCasesReference**](CaseManagementApi#getCasemanagementCasesReference) | Get a Case by reference. |
| [**patchCasemanagementCaseDatedue**](CaseManagementApi#patchCasemanagementCaseDatedue) | Update date due of a Case. |
| [**patchCasemanagementCasePriority**](CaseManagementApi#patchCasemanagementCasePriority) | Update priority of a Case. |
| [**patchCasemanagementCaseSummary**](CaseManagementApi#patchCasemanagementCaseSummary) | Update summary of a Case. |
| [**patchCasemanagementCaseplan**](CaseManagementApi#patchCasemanagementCaseplan) | Update the attributes of a Caseplan. |
| [**patchCasemanagementCaseplanStageplan**](CaseManagementApi#patchCasemanagementCaseplanStageplan) | Update the attributes of a Stageplan. |
| [**patchCasemanagementCaseplanStageplanStepplan**](CaseManagementApi#patchCasemanagementCaseplanStageplanStepplan) | Update the attributes of a Stepplan. |
| [**postCasemanagementCaseAssociations**](CaseManagementApi#postCasemanagementCaseAssociations) | Create a case association. |
| [**postCasemanagementCaseTerminateJobs**](CaseManagementApi#postCasemanagementCaseTerminateJobs) | Create a Terminate Job for a Case. |
| [**postCasemanagementCaseplanPublish**](CaseManagementApi#postCasemanagementCaseplanPublish) | Publish Caseplan. |
| [**postCasemanagementCaseplanVersions**](CaseManagementApi#postCasemanagementCaseplanVersions) | Create Caseplan version. |
| [**postCasemanagementCaseplans**](CaseManagementApi#postCasemanagementCaseplans) | Create a Caseplan. |
| [**postCasemanagementCaseplansQuery**](CaseManagementApi#postCasemanagementCaseplansQuery) | Query for caseplans |
| [**postCasemanagementCases**](CaseManagementApi#postCasemanagementCases) | Create a Case. |
| [**postCasemanagementCasesAssociationsQuery**](CaseManagementApi#postCasemanagementCasesAssociationsQuery) | Query for case associations |
| [**putCasemanagementCaseplanIntakesettings**](CaseManagementApi#putCasemanagementCaseplanIntakesettings) | Update the intake settings for a Caseplan. |
{: class="table-striped"}


# **deleteCasemanagementCase**


> Empty deleteCasemanagementCase(caseId)

Delete a Case.

deleteCasemanagementCase is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps DELETE /api/v2/casemanagement/cases/{caseId}  

Requires ALL permissions: 

* caseManagement:case:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CaseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CaseManagementApi apiInstance = new CaseManagementApi();
String caseId = "caseId_example"; // String | Case ID
try {
    Empty result = apiInstance.deleteCasemanagementCase(caseId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaseManagementApi#deleteCasemanagementCase");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **caseId** | **String**| Case ID | 
{: class="table-striped"}


### Return type

**Empty**


# **deleteCasemanagementCaseplan**


> Empty deleteCasemanagementCaseplan(caseplanId)

Delete a Caseplan.

deleteCasemanagementCaseplan is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps DELETE /api/v2/casemanagement/caseplans/{caseplanId}  

Requires ALL permissions: 

* caseManagement:caseplan:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CaseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CaseManagementApi apiInstance = new CaseManagementApi();
String caseplanId = "caseplanId_example"; // String | Caseplan ID
try {
    Empty result = apiInstance.deleteCasemanagementCaseplan(caseplanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaseManagementApi#deleteCasemanagementCaseplan");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **caseplanId** | **String**| Caseplan ID | 
{: class="table-striped"}


### Return type

**Empty**


# **getCasemanagementCase**


> [ModelCase](Case) getCasemanagementCase(caseId, expands)

Get a Case.

getCasemanagementCase is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/casemanagement/cases/{caseId}  

Requires ANY permissions: 

* caseManagement:case:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CaseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CaseManagementApi apiInstance = new CaseManagementApi();
String caseId = "caseId_example"; // String | Case ID
String expands = "expands_example"; // String | Which fields to expand.
try {
    ModelCase result = apiInstance.getCasemanagementCase(caseId, expands);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaseManagementApi#getCasemanagementCase");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **caseId** | **String**| Case ID | 
| **expands** | **String**| Which fields to expand. | [optional]<br />**Values**: caseplan 
{: class="table-striped"}


### Return type

[**ModelCase**](Case)


# **getCasemanagementCaseAssociation**


> [CaseAssociation](CaseAssociation) getCasemanagementCaseAssociation(caseId, associationId)

Get a Case Association.

getCasemanagementCaseAssociation is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/casemanagement/cases/{caseId}/associations/{associationId}  

Requires ANY permissions: 

* caseManagement:caseAssociation:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CaseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CaseManagementApi apiInstance = new CaseManagementApi();
String caseId = "caseId_example"; // String | Case ID
String associationId = "associationId_example"; // String | Case Association ID
try {
    CaseAssociation result = apiInstance.getCasemanagementCaseAssociation(caseId, associationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaseManagementApi#getCasemanagementCaseAssociation");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **caseId** | **String**| Case ID | 
| **associationId** | **String**| Case Association ID | 
{: class="table-striped"}


### Return type

[**CaseAssociation**](CaseAssociation)


# **getCasemanagementCaseAssociations**


> [CaseAssociationListing](CaseAssociationListing) getCasemanagementCaseAssociations(caseId, before, after, pageSize)

Get a list of case associations for a provided case.

getCasemanagementCaseAssociations is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/casemanagement/cases/{caseId}/associations  

Requires ANY permissions: 

* caseManagement:caseAssociation:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CaseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CaseManagementApi apiInstance = new CaseManagementApi();
String caseId = "caseId_example"; // String | Case ID.
String before = "before_example"; // String | The cursor that points to the start of the set of entities that has been returned.
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned.
String pageSize = "pageSize_example"; // String | Number of entities to return. Maximum of 200.
try {
    CaseAssociationListing result = apiInstance.getCasemanagementCaseAssociations(caseId, before, after, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaseManagementApi#getCasemanagementCaseAssociations");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **caseId** | **String**| Case ID. | 
| **before** | **String**| The cursor that points to the start of the set of entities that has been returned. | [optional] 
| **after** | **String**| The cursor that points to the end of the set of entities that has been returned. | [optional] 
| **pageSize** | **String**| Number of entities to return. Maximum of 200. | [optional] 
{: class="table-striped"}


### Return type

[**CaseAssociationListing**](CaseAssociationListing)


# **getCasemanagementCaseStage**


> [Stage](Stage) getCasemanagementCaseStage(caseId, stageId)

Get a Stage.

getCasemanagementCaseStage is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/casemanagement/cases/{caseId}/stages/{stageId}  

Requires ANY permissions: 

* caseManagement:stage:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CaseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CaseManagementApi apiInstance = new CaseManagementApi();
String caseId = "caseId_example"; // String | Case ID
String stageId = "stageId_example"; // String | Stage ID
try {
    Stage result = apiInstance.getCasemanagementCaseStage(caseId, stageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaseManagementApi#getCasemanagementCaseStage");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **caseId** | **String**| Case ID | 
| **stageId** | **String**| Stage ID | 
{: class="table-striped"}


### Return type

[**Stage**](Stage)


# **getCasemanagementCaseStageStep**


> [Step](Step) getCasemanagementCaseStageStep(caseId, stageId, stepId)

Get a Step.

getCasemanagementCaseStageStep is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/casemanagement/cases/{caseId}/stages/{stageId}/steps/{stepId}  

Requires ANY permissions: 

* caseManagement:step:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CaseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CaseManagementApi apiInstance = new CaseManagementApi();
String caseId = "caseId_example"; // String | Case ID
String stageId = "stageId_example"; // String | Stage ID
String stepId = "stepId_example"; // String | Step ID
try {
    Step result = apiInstance.getCasemanagementCaseStageStep(caseId, stageId, stepId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaseManagementApi#getCasemanagementCaseStageStep");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **caseId** | **String**| Case ID | 
| **stageId** | **String**| Stage ID | 
| **stepId** | **String**| Step ID | 
{: class="table-striped"}


### Return type

[**Step**](Step)


# **getCasemanagementCaseStageSteps**


> [StepListing](StepListing) getCasemanagementCaseStageSteps(caseId, stageId, before, after, pageSize)

Get a list of Steps.

getCasemanagementCaseStageSteps is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/casemanagement/cases/{caseId}/stages/{stageId}/steps  

Requires ANY permissions: 

* caseManagement:step:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CaseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CaseManagementApi apiInstance = new CaseManagementApi();
String caseId = "caseId_example"; // String | Case ID
String stageId = "stageId_example"; // String | Stage ID
String before = "before_example"; // String | The cursor that points to the start of the set of entities that has been returned.
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned.
String pageSize = "pageSize_example"; // String | Number of entities to return. Maximum of 200.
try {
    StepListing result = apiInstance.getCasemanagementCaseStageSteps(caseId, stageId, before, after, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaseManagementApi#getCasemanagementCaseStageSteps");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **caseId** | **String**| Case ID | 
| **stageId** | **String**| Stage ID | 
| **before** | **String**| The cursor that points to the start of the set of entities that has been returned. | [optional] 
| **after** | **String**| The cursor that points to the end of the set of entities that has been returned. | [optional] 
| **pageSize** | **String**| Number of entities to return. Maximum of 200. | [optional] 
{: class="table-striped"}


### Return type

[**StepListing**](StepListing)


# **getCasemanagementCaseStages**


> [StageListing](StageListing) getCasemanagementCaseStages(caseId, before, after, pageSize)

Get a list of Stages.

getCasemanagementCaseStages is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/casemanagement/cases/{caseId}/stages  

Requires ANY permissions: 

* caseManagement:stage:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CaseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CaseManagementApi apiInstance = new CaseManagementApi();
String caseId = "caseId_example"; // String | Case ID
String before = "before_example"; // String | The cursor that points to the start of the set of entities that has been returned.
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned.
String pageSize = "pageSize_example"; // String | Number of entities to return. Maximum of 200.
try {
    StageListing result = apiInstance.getCasemanagementCaseStages(caseId, before, after, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaseManagementApi#getCasemanagementCaseStages");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **caseId** | **String**| Case ID | 
| **before** | **String**| The cursor that points to the start of the set of entities that has been returned. | [optional] 
| **after** | **String**| The cursor that points to the end of the set of entities that has been returned. | [optional] 
| **pageSize** | **String**| Number of entities to return. Maximum of 200. | [optional] 
{: class="table-striped"}


### Return type

[**StageListing**](StageListing)


# **getCasemanagementCaseTerminateJob**


> [TerminateJob](TerminateJob) getCasemanagementCaseTerminateJob(caseId, jobId)

Get a Terminate Job for a Case.

getCasemanagementCaseTerminateJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/casemanagement/cases/{caseId}/terminate/jobs/{jobId}  

Requires ANY permissions: 

* caseManagement:terminateJob:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CaseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CaseManagementApi apiInstance = new CaseManagementApi();
String caseId = "caseId_example"; // String | Case ID
String jobId = "jobId_example"; // String | Job ID
try {
    TerminateJob result = apiInstance.getCasemanagementCaseTerminateJob(caseId, jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaseManagementApi#getCasemanagementCaseTerminateJob");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **caseId** | **String**| Case ID | 
| **jobId** | **String**| Job ID | 
{: class="table-striped"}


### Return type

[**TerminateJob**](TerminateJob)


# **getCasemanagementCaseplan**


> [Caseplan](Caseplan) getCasemanagementCaseplan(caseplanId)

Get a Caseplan.

getCasemanagementCaseplan is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/casemanagement/caseplans/{caseplanId}  

Requires ANY permissions: 

* caseManagement:caseplan:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CaseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CaseManagementApi apiInstance = new CaseManagementApi();
String caseplanId = "caseplanId_example"; // String | Caseplan ID
try {
    Caseplan result = apiInstance.getCasemanagementCaseplan(caseplanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaseManagementApi#getCasemanagementCaseplan");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **caseplanId** | **String**| Caseplan ID | 
{: class="table-striped"}


### Return type

[**Caseplan**](Caseplan)


# **getCasemanagementCaseplanVersion**


> [Caseplan](Caseplan) getCasemanagementCaseplanVersion(caseplanId, versionId)

Get a Caseplan version.

getCasemanagementCaseplanVersion is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/casemanagement/caseplans/{caseplanId}/versions/{versionId}  

Requires ANY permissions: 

* caseManagement:caseplan:version

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CaseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CaseManagementApi apiInstance = new CaseManagementApi();
String caseplanId = "caseplanId_example"; // String | Caseplan ID
String versionId = "versionId_example"; // String | Version of the caseplan
try {
    Caseplan result = apiInstance.getCasemanagementCaseplanVersion(caseplanId, versionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaseManagementApi#getCasemanagementCaseplanVersion");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **caseplanId** | **String**| Caseplan ID | 
| **versionId** | **String**| Version of the caseplan | 
{: class="table-striped"}


### Return type

[**Caseplan**](Caseplan)


# **getCasemanagementCaseplanVersionDataschemas**


> [CaseplanDataSchemaListing](CaseplanDataSchemaListing) getCasemanagementCaseplanVersionDataschemas(caseplanId, versionId)

Get the dataSchemas for a caseplan version.

getCasemanagementCaseplanVersionDataschemas is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/casemanagement/caseplans/{caseplanId}/versions/{versionId}/dataschemas  

Requires ANY permissions: 

* caseManagement:caseplanDataSchemas:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CaseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CaseManagementApi apiInstance = new CaseManagementApi();
String caseplanId = "caseplanId_example"; // String | Caseplan ID
String versionId = "versionId_example"; // String | Version of the caseplan
try {
    CaseplanDataSchemaListing result = apiInstance.getCasemanagementCaseplanVersionDataschemas(caseplanId, versionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaseManagementApi#getCasemanagementCaseplanVersionDataschemas");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **caseplanId** | **String**| Caseplan ID | 
| **versionId** | **String**| Version of the caseplan | 
{: class="table-striped"}


### Return type

[**CaseplanDataSchemaListing**](CaseplanDataSchemaListing)


# **getCasemanagementCaseplanVersionIntakesettings**


> [IntakeSettingsListing](IntakeSettingsListing) getCasemanagementCaseplanVersionIntakesettings(caseplanId, versionId)

Get the intake settings for a Caseplan version.

getCasemanagementCaseplanVersionIntakesettings is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/casemanagement/caseplans/{caseplanId}/versions/{versionId}/intakesettings  

Requires ANY permissions: 

* caseManagement:caseplanIntakeSettings:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CaseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CaseManagementApi apiInstance = new CaseManagementApi();
String caseplanId = "caseplanId_example"; // String | Caseplan ID
String versionId = "versionId_example"; // String | Version of the caseplan
try {
    IntakeSettingsListing result = apiInstance.getCasemanagementCaseplanVersionIntakesettings(caseplanId, versionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaseManagementApi#getCasemanagementCaseplanVersionIntakesettings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **caseplanId** | **String**| Caseplan ID | 
| **versionId** | **String**| Version of the caseplan | 
{: class="table-striped"}


### Return type

[**IntakeSettingsListing**](IntakeSettingsListing)


# **getCasemanagementCaseplanVersionStageplan**


> [Stageplan](Stageplan) getCasemanagementCaseplanVersionStageplan(caseplanId, versionId, stageplanId, expands)

Get a Stageplan.

getCasemanagementCaseplanVersionStageplan is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/casemanagement/caseplans/{caseplanId}/versions/{versionId}/stageplans/{stageplanId}  

Requires ANY permissions: 

* caseManagement:stageplan:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CaseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CaseManagementApi apiInstance = new CaseManagementApi();
String caseplanId = "caseplanId_example"; // String | Caseplan ID
String versionId = "versionId_example"; // String | Version ID
String stageplanId = "stageplanId_example"; // String | Stageplan ID
List<String> expands = Arrays.asList(null); // List<String> | Which fields to expand.
try {
    Stageplan result = apiInstance.getCasemanagementCaseplanVersionStageplan(caseplanId, versionId, stageplanId, expands);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaseManagementApi#getCasemanagementCaseplanVersionStageplan");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **caseplanId** | **String**| Caseplan ID | 
| **versionId** | **String**| Version ID | 
| **stageplanId** | **String**| Stageplan ID | 
| **expands** | [**List&lt;String&gt;**](String)| Which fields to expand. | [optional]<br />**Values**: caseplan 
{: class="table-striped"}


### Return type

[**Stageplan**](Stageplan)


# **getCasemanagementCaseplanVersionStageplanStepplan**


> [Stepplan](Stepplan) getCasemanagementCaseplanVersionStageplanStepplan(caseplanId, versionId, stageplanId, stepplanId, expands)

Get a Stepplan.

getCasemanagementCaseplanVersionStageplanStepplan is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/casemanagement/caseplans/{caseplanId}/versions/{versionId}/stageplans/{stageplanId}/stepplans/{stepplanId}  

Requires ANY permissions: 

* caseManagement:stepplan:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CaseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CaseManagementApi apiInstance = new CaseManagementApi();
String caseplanId = "caseplanId_example"; // String | Caseplan ID
String versionId = "versionId_example"; // String | Version ID
String stageplanId = "stageplanId_example"; // String | Stageplan ID
String stepplanId = "stepplanId_example"; // String | Stepplan ID
List<String> expands = Arrays.asList(null); // List<String> | Which fields to expand.
try {
    Stepplan result = apiInstance.getCasemanagementCaseplanVersionStageplanStepplan(caseplanId, versionId, stageplanId, stepplanId, expands);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaseManagementApi#getCasemanagementCaseplanVersionStageplanStepplan");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **caseplanId** | **String**| Caseplan ID | 
| **versionId** | **String**| Version ID | 
| **stageplanId** | **String**| Stageplan ID | 
| **stepplanId** | **String**| Stepplan ID | 
| **expands** | [**List&lt;String&gt;**](String)| Which fields to expand. | [optional]<br />**Values**: stageplan, caseplan, worktype 
{: class="table-striped"}


### Return type

[**Stepplan**](Stepplan)


# **getCasemanagementCaseplanVersionStageplanStepplans**


> [StepplanListing](StepplanListing) getCasemanagementCaseplanVersionStageplanStepplans(caseplanId, versionId, stageplanId, before, after, pageSize, expands)

Get a list of Stepplans.

getCasemanagementCaseplanVersionStageplanStepplans is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/casemanagement/caseplans/{caseplanId}/versions/{versionId}/stageplans/{stageplanId}/stepplans  

Requires ANY permissions: 

* caseManagement:stepplan:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CaseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CaseManagementApi apiInstance = new CaseManagementApi();
String caseplanId = "caseplanId_example"; // String | Caseplan ID
String versionId = "versionId_example"; // String | Version ID
String stageplanId = "stageplanId_example"; // String | Stageplan ID
String before = "before_example"; // String | The cursor that points to the start of the set of entities that has been returned.
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned.
String pageSize = "pageSize_example"; // String | Number of entities to return. Maximum of 200.
List<String> expands = Arrays.asList(null); // List<String> | Which fields to expand.
try {
    StepplanListing result = apiInstance.getCasemanagementCaseplanVersionStageplanStepplans(caseplanId, versionId, stageplanId, before, after, pageSize, expands);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaseManagementApi#getCasemanagementCaseplanVersionStageplanStepplans");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **caseplanId** | **String**| Caseplan ID | 
| **versionId** | **String**| Version ID | 
| **stageplanId** | **String**| Stageplan ID | 
| **before** | **String**| The cursor that points to the start of the set of entities that has been returned. | [optional] 
| **after** | **String**| The cursor that points to the end of the set of entities that has been returned. | [optional] 
| **pageSize** | **String**| Number of entities to return. Maximum of 200. | [optional] 
| **expands** | [**List&lt;String&gt;**](String)| Which fields to expand. | [optional]<br />**Values**: caseplan, stageplan, worktype 
{: class="table-striped"}


### Return type

[**StepplanListing**](StepplanListing)


# **getCasemanagementCaseplanVersionStageplans**


> [StageplanListing](StageplanListing) getCasemanagementCaseplanVersionStageplans(caseplanId, versionId, before, after, pageSize, expands)

Get a list of Stageplans.

getCasemanagementCaseplanVersionStageplans is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/casemanagement/caseplans/{caseplanId}/versions/{versionId}/stageplans  

Requires ANY permissions: 

* caseManagement:stageplan:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CaseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CaseManagementApi apiInstance = new CaseManagementApi();
String caseplanId = "caseplanId_example"; // String | Caseplan ID
String versionId = "versionId_example"; // String | Version ID
String before = "before_example"; // String | The cursor that points to the start of the set of entities that has been returned.
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned.
String pageSize = "pageSize_example"; // String | Number of entities to return. Maximum of 200.
List<String> expands = Arrays.asList(null); // List<String> | Which fields to expand.
try {
    StageplanListing result = apiInstance.getCasemanagementCaseplanVersionStageplans(caseplanId, versionId, before, after, pageSize, expands);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaseManagementApi#getCasemanagementCaseplanVersionStageplans");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **caseplanId** | **String**| Caseplan ID | 
| **versionId** | **String**| Version ID | 
| **before** | **String**| The cursor that points to the start of the set of entities that has been returned. | [optional] 
| **after** | **String**| The cursor that points to the end of the set of entities that has been returned. | [optional] 
| **pageSize** | **String**| Number of entities to return. Maximum of 200. | [optional] 
| **expands** | [**List&lt;String&gt;**](String)| Which fields to expand. | [optional]<br />**Values**: caseplan 
{: class="table-striped"}


### Return type

[**StageplanListing**](StageplanListing)


# **getCasemanagementCaseplans**


> [CaseplanListing](CaseplanListing) getCasemanagementCaseplans(after, pageSize, customerIntentId, divisionIds)

Get a list of Caseplans.

getCasemanagementCaseplans is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/casemanagement/caseplans  

Requires ANY permissions: 

* caseManagement:caseplan:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CaseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CaseManagementApi apiInstance = new CaseManagementApi();
String after = "after_example"; // String | The cursor that points to the end of the set of caseplans that has been returned.
Integer pageSize = 56; // Integer | Number of caseplans to return. Maximum of 200.
String customerIntentId = "customerIntentId_example"; // String | Filter by Customer Intent.
String divisionIds = "divisionIds_example"; // String | Filter by Divisions.
try {
    CaseplanListing result = apiInstance.getCasemanagementCaseplans(after, pageSize, customerIntentId, divisionIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaseManagementApi#getCasemanagementCaseplans");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **after** | **String**| The cursor that points to the end of the set of caseplans that has been returned. | [optional] 
| **pageSize** | **Integer**| Number of caseplans to return. Maximum of 200. | [optional] 
| **customerIntentId** | **String**| Filter by Customer Intent. | [optional] 
| **divisionIds** | **String**| Filter by Divisions. | [optional] 
{: class="table-striped"}


### Return type

[**CaseplanListing**](CaseplanListing)


# **getCasemanagementCasesExternalcontact**


> [CaseListing](CaseListing) getCasemanagementCasesExternalcontact(externalContactId, after, pageSize, divisionIds, expands)

Get a list of cases for provided external contact id.

getCasemanagementCasesExternalcontact is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/casemanagement/cases/externalcontacts/{externalContactId}  

Requires ANY permissions: 

* caseManagement:caseExternalContact:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CaseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CaseManagementApi apiInstance = new CaseManagementApi();
String externalContactId = "externalContactId_example"; // String | External Contact ID
String after = "after_example"; // String | The cursor that points to the end of the set of cases that has been returned.
Integer pageSize = 56; // Integer | Number of cases to return. Maximum of 200.
String divisionIds = "divisionIds_example"; // String | Filter by Divisions
List<String> expands = Arrays.asList(null); // List<String> | Which fields to expand.
try {
    CaseListing result = apiInstance.getCasemanagementCasesExternalcontact(externalContactId, after, pageSize, divisionIds, expands);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaseManagementApi#getCasemanagementCasesExternalcontact");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **externalContactId** | **String**| External Contact ID | 
| **after** | **String**| The cursor that points to the end of the set of cases that has been returned. | [optional] 
| **pageSize** | **Integer**| Number of cases to return. Maximum of 200. | [optional] 
| **divisionIds** | **String**| Filter by Divisions | [optional] 
| **expands** | [**List&lt;String&gt;**](String)| Which fields to expand. | [optional]<br />**Values**: caseplan 
{: class="table-striped"}


### Return type

[**CaseListing**](CaseListing)


# **getCasemanagementCasesReference**


> [ModelCase](Case) getCasemanagementCasesReference(referenceId, expands)

Get a Case by reference.

getCasemanagementCasesReference is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/casemanagement/cases/references/{referenceId}  

Requires ANY permissions: 

* caseManagement:caseReference:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CaseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CaseManagementApi apiInstance = new CaseManagementApi();
String referenceId = "referenceId_example"; // String | Reference
String expands = "expands_example"; // String | Which fields to expand.
try {
    ModelCase result = apiInstance.getCasemanagementCasesReference(referenceId, expands);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaseManagementApi#getCasemanagementCasesReference");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **referenceId** | **String**| Reference | 
| **expands** | **String**| Which fields to expand. | [optional]<br />**Values**: caseplan 
{: class="table-striped"}


### Return type

[**ModelCase**](Case)


# **patchCasemanagementCaseDatedue**


> [ModelCase](Case) patchCasemanagementCaseDatedue(caseId, body)

Update date due of a Case.

patchCasemanagementCaseDatedue is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps PATCH /api/v2/casemanagement/cases/{caseId}/datedue  

Requires ANY permissions: 

* caseManagement:caseDateDue:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CaseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CaseManagementApi apiInstance = new CaseManagementApi();
String caseId = "caseId_example"; // String | Case ID
CaseDateDueUpdate body = new CaseDateDueUpdate(); // CaseDateDueUpdate | Date due
try {
    ModelCase result = apiInstance.patchCasemanagementCaseDatedue(caseId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaseManagementApi#patchCasemanagementCaseDatedue");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **caseId** | **String**| Case ID | 
| **body** | [**CaseDateDueUpdate**](CaseDateDueUpdate)| Date due | 
{: class="table-striped"}


### Return type

[**ModelCase**](Case)


# **patchCasemanagementCasePriority**


> [ModelCase](Case) patchCasemanagementCasePriority(caseId, body)

Update priority of a Case.

patchCasemanagementCasePriority is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps PATCH /api/v2/casemanagement/cases/{caseId}/priority  

Requires ANY permissions: 

* caseManagement:casePriority:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CaseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CaseManagementApi apiInstance = new CaseManagementApi();
String caseId = "caseId_example"; // String | Case ID
CasePriorityUpdate body = new CasePriorityUpdate(); // CasePriorityUpdate | Priority
try {
    ModelCase result = apiInstance.patchCasemanagementCasePriority(caseId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaseManagementApi#patchCasemanagementCasePriority");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **caseId** | **String**| Case ID | 
| **body** | [**CasePriorityUpdate**](CasePriorityUpdate)| Priority | 
{: class="table-striped"}


### Return type

[**ModelCase**](Case)


# **patchCasemanagementCaseSummary**


> [ModelCase](Case) patchCasemanagementCaseSummary(caseId, body)

Update summary of a Case.

patchCasemanagementCaseSummary is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps PATCH /api/v2/casemanagement/cases/{caseId}/summary  

Requires ANY permissions: 

* caseManagement:caseSummary:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CaseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CaseManagementApi apiInstance = new CaseManagementApi();
String caseId = "caseId_example"; // String | Case ID
CaseSummaryUpdate body = new CaseSummaryUpdate(); // CaseSummaryUpdate | Summary
try {
    ModelCase result = apiInstance.patchCasemanagementCaseSummary(caseId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaseManagementApi#patchCasemanagementCaseSummary");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **caseId** | **String**| Case ID | 
| **body** | [**CaseSummaryUpdate**](CaseSummaryUpdate)| Summary | 
{: class="table-striped"}


### Return type

[**ModelCase**](Case)


# **patchCasemanagementCaseplan**


> [Caseplan](Caseplan) patchCasemanagementCaseplan(caseplanId, body)

Update the attributes of a Caseplan.

patchCasemanagementCaseplan is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps PATCH /api/v2/casemanagement/caseplans/{caseplanId}  

Requires ALL permissions: 

* caseManagement:caseplan:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CaseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CaseManagementApi apiInstance = new CaseManagementApi();
String caseplanId = "caseplanId_example"; // String | Caseplan ID
CaseplanUpdate body = new CaseplanUpdate(); // CaseplanUpdate | Caseplan
try {
    Caseplan result = apiInstance.patchCasemanagementCaseplan(caseplanId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaseManagementApi#patchCasemanagementCaseplan");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **caseplanId** | **String**| Caseplan ID | 
| **body** | [**CaseplanUpdate**](CaseplanUpdate)| Caseplan | 
{: class="table-striped"}


### Return type

[**Caseplan**](Caseplan)


# **patchCasemanagementCaseplanStageplan**


> [Stageplan](Stageplan) patchCasemanagementCaseplanStageplan(caseplanId, stageplanId, body)

Update the attributes of a Stageplan.

patchCasemanagementCaseplanStageplan is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps PATCH /api/v2/casemanagement/caseplans/{caseplanId}/stageplans/{stageplanId}  

Requires ANY permissions: 

* caseManagement:stageplan:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CaseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CaseManagementApi apiInstance = new CaseManagementApi();
String caseplanId = "caseplanId_example"; // String | Caseplan ID
String stageplanId = "stageplanId_example"; // String | Stageplan ID
StageplanUpdate body = new StageplanUpdate(); // StageplanUpdate | Stageplan
try {
    Stageplan result = apiInstance.patchCasemanagementCaseplanStageplan(caseplanId, stageplanId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaseManagementApi#patchCasemanagementCaseplanStageplan");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **caseplanId** | **String**| Caseplan ID | 
| **stageplanId** | **String**| Stageplan ID | 
| **body** | [**StageplanUpdate**](StageplanUpdate)| Stageplan | 
{: class="table-striped"}


### Return type

[**Stageplan**](Stageplan)


# **patchCasemanagementCaseplanStageplanStepplan**


> [Stepplan](Stepplan) patchCasemanagementCaseplanStageplanStepplan(caseplanId, stageplanId, stepplanId, body)

Update the attributes of a Stepplan.

patchCasemanagementCaseplanStageplanStepplan is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps PATCH /api/v2/casemanagement/caseplans/{caseplanId}/stageplans/{stageplanId}/stepplans/{stepplanId}  

Requires ANY permissions: 

* caseManagement:stepplan:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CaseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CaseManagementApi apiInstance = new CaseManagementApi();
String caseplanId = "caseplanId_example"; // String | Caseplan ID
String stageplanId = "stageplanId_example"; // String | Stageplan ID
String stepplanId = "stepplanId_example"; // String | Stepplan ID
StepplanUpdate body = new StepplanUpdate(); // StepplanUpdate | Stepplan
try {
    Stepplan result = apiInstance.patchCasemanagementCaseplanStageplanStepplan(caseplanId, stageplanId, stepplanId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaseManagementApi#patchCasemanagementCaseplanStageplanStepplan");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **caseplanId** | **String**| Caseplan ID | 
| **stageplanId** | **String**| Stageplan ID | 
| **stepplanId** | **String**| Stepplan ID | 
| **body** | [**StepplanUpdate**](StepplanUpdate)| Stepplan | 
{: class="table-striped"}


### Return type

[**Stepplan**](Stepplan)


# **postCasemanagementCaseAssociations**


> [CaseAssociation](CaseAssociation) postCasemanagementCaseAssociations(caseId, body)

Create a case association.

postCasemanagementCaseAssociations is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/casemanagement/cases/{caseId}/associations  

Requires ANY permissions: 

* caseManagement:caseAssociation:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CaseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CaseManagementApi apiInstance = new CaseManagementApi();
String caseId = "caseId_example"; // String | Case ID.
CaseAssociationCreate body = new CaseAssociationCreate(); // CaseAssociationCreate | Case Association
try {
    CaseAssociation result = apiInstance.postCasemanagementCaseAssociations(caseId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaseManagementApi#postCasemanagementCaseAssociations");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **caseId** | **String**| Case ID. | 
| **body** | [**CaseAssociationCreate**](CaseAssociationCreate)| Case Association | [optional] 
{: class="table-striped"}


### Return type

[**CaseAssociation**](CaseAssociation)


# **postCasemanagementCaseTerminateJobs**


> [TerminateJob](TerminateJob) postCasemanagementCaseTerminateJobs(caseId)

Create a Terminate Job for a Case.

postCasemanagementCaseTerminateJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/casemanagement/cases/{caseId}/terminate/jobs  

Requires ANY permissions: 

* caseManagement:terminateJob:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CaseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CaseManagementApi apiInstance = new CaseManagementApi();
String caseId = "caseId_example"; // String | Case ID
try {
    TerminateJob result = apiInstance.postCasemanagementCaseTerminateJobs(caseId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaseManagementApi#postCasemanagementCaseTerminateJobs");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **caseId** | **String**| Case ID | 
{: class="table-striped"}


### Return type

[**TerminateJob**](TerminateJob)


# **postCasemanagementCaseplanPublish**


> [Caseplan](Caseplan) postCasemanagementCaseplanPublish(caseplanId)

Publish Caseplan.

postCasemanagementCaseplanPublish is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/casemanagement/caseplans/{caseplanId}/publish  

Requires ANY permissions: 

* caseManagement:caseplan:publish

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CaseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CaseManagementApi apiInstance = new CaseManagementApi();
String caseplanId = "caseplanId_example"; // String | Caseplan ID
try {
    Caseplan result = apiInstance.postCasemanagementCaseplanPublish(caseplanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaseManagementApi#postCasemanagementCaseplanPublish");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **caseplanId** | **String**| Caseplan ID | 
{: class="table-striped"}


### Return type

[**Caseplan**](Caseplan)


# **postCasemanagementCaseplanVersions**


> [Caseplan](Caseplan) postCasemanagementCaseplanVersions(caseplanId)

Create Caseplan version.

postCasemanagementCaseplanVersions is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/casemanagement/caseplans/{caseplanId}/versions  

Requires ALL permissions: 

* caseManagement:caseplan:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CaseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CaseManagementApi apiInstance = new CaseManagementApi();
String caseplanId = "caseplanId_example"; // String | Caseplan ID
try {
    Caseplan result = apiInstance.postCasemanagementCaseplanVersions(caseplanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaseManagementApi#postCasemanagementCaseplanVersions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **caseplanId** | **String**| Caseplan ID | 
{: class="table-striped"}


### Return type

[**Caseplan**](Caseplan)


# **postCasemanagementCaseplans**


> [CaseplanCreateResponse](CaseplanCreateResponse) postCasemanagementCaseplans(body)

Create a Caseplan.

postCasemanagementCaseplans is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/casemanagement/caseplans  

Requires ANY permissions: 

* caseManagement:caseplan:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CaseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CaseManagementApi apiInstance = new CaseManagementApi();
CaseplanCreate body = new CaseplanCreate(); // CaseplanCreate | Caseplan
try {
    CaseplanCreateResponse result = apiInstance.postCasemanagementCaseplans(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaseManagementApi#postCasemanagementCaseplans");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**CaseplanCreate**](CaseplanCreate)| Caseplan | 
{: class="table-striped"}


### Return type

[**CaseplanCreateResponse**](CaseplanCreateResponse)


# **postCasemanagementCaseplansQuery**


> [CaseplanQueryEntityListing](CaseplanQueryEntityListing) postCasemanagementCaseplansQuery(body)

Query for caseplans

postCasemanagementCaseplansQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/casemanagement/caseplans/query  

Requires ANY permissions: 

* caseManagement:caseplan:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CaseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CaseManagementApi apiInstance = new CaseManagementApi();
CaseplanQueryRequest body = new CaseplanQueryRequest(); // CaseplanQueryRequest | CaseplanQueryRequest
try {
    CaseplanQueryEntityListing result = apiInstance.postCasemanagementCaseplansQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaseManagementApi#postCasemanagementCaseplansQuery");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**CaseplanQueryRequest**](CaseplanQueryRequest)| CaseplanQueryRequest | 
{: class="table-striped"}


### Return type

[**CaseplanQueryEntityListing**](CaseplanQueryEntityListing)


# **postCasemanagementCases**


> [ModelCase](Case) postCasemanagementCases(body)

Create a Case.

postCasemanagementCases is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/casemanagement/cases  

Requires ANY permissions: 

* caseManagement:case:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CaseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CaseManagementApi apiInstance = new CaseManagementApi();
CaseCreate body = new CaseCreate(); // CaseCreate | Case
try {
    ModelCase result = apiInstance.postCasemanagementCases(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaseManagementApi#postCasemanagementCases");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**CaseCreate**](CaseCreate)| Case | 
{: class="table-striped"}


### Return type

[**ModelCase**](Case)


# **postCasemanagementCasesAssociationsQuery**


> [CaseAssociationQueryEntityListing](CaseAssociationQueryEntityListing) postCasemanagementCasesAssociationsQuery(body)

Query for case associations

postCasemanagementCasesAssociationsQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/casemanagement/cases/associations/query  

Requires ANY permissions: 

* caseManagement:caseAssociation:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CaseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CaseManagementApi apiInstance = new CaseManagementApi();
CaseAssociationQuery body = new CaseAssociationQuery(); // CaseAssociationQuery | Case Association
try {
    CaseAssociationQueryEntityListing result = apiInstance.postCasemanagementCasesAssociationsQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaseManagementApi#postCasemanagementCasesAssociationsQuery");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**CaseAssociationQuery**](CaseAssociationQuery)| Case Association | [optional] 
{: class="table-striped"}


### Return type

[**CaseAssociationQueryEntityListing**](CaseAssociationQueryEntityListing)


# **putCasemanagementCaseplanIntakesettings**


> [IntakeSettingsListing](IntakeSettingsListing) putCasemanagementCaseplanIntakesettings(caseplanId, body)

Update the intake settings for a Caseplan.

putCasemanagementCaseplanIntakesettings is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps PUT /api/v2/casemanagement/caseplans/{caseplanId}/intakesettings  

Requires ANY permissions: 

* caseManagement:caseplanIntakeSettings:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CaseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CaseManagementApi apiInstance = new CaseManagementApi();
String caseplanId = "caseplanId_example"; // String | Caseplan ID
IntakeSettingsUpdate body = new IntakeSettingsUpdate(); // IntakeSettingsUpdate | Intake Settings
try {
    IntakeSettingsListing result = apiInstance.putCasemanagementCaseplanIntakesettings(caseplanId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaseManagementApi#putCasemanagementCaseplanIntakesettings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **caseplanId** | **String**| Caseplan ID | 
| **body** | [**IntakeSettingsUpdate**](IntakeSettingsUpdate)| Intake Settings | 
{: class="table-striped"}


### Return type

[**IntakeSettingsListing**](IntakeSettingsListing)


_com.mypurecloud.sdk.v2:platform-client-v2:253.0.0_
