# CaseManagementApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteCasemanagementCase**](CaseManagementApi#deleteCasemanagementCase) | Delete a Case. |
| [**deleteCasemanagementCaseCommentsMeCommentId**](CaseManagementApi#deleteCasemanagementCaseCommentsMeCommentId) | Delete my Comment. |
| [**deleteCasemanagementCaseplan**](CaseManagementApi#deleteCasemanagementCaseplan) | Delete a Caseplan. |
| [**deleteCasemanagementCaseplanDataschema**](CaseManagementApi#deleteCasemanagementCaseplanDataschema) | Remove a data schema from a draft Caseplan. |
| [**deleteCasemanagementCaseplanStageplan**](CaseManagementApi#deleteCasemanagementCaseplanStageplan) | Delete a Stageplan from a draft Caseplan. |
| [**getCasemanagementCase**](CaseManagementApi#getCasemanagementCase) | Get a Case. |
| [**getCasemanagementCaseAssociation**](CaseManagementApi#getCasemanagementCaseAssociation) | Get a Case Association. |
| [**getCasemanagementCaseAssociations**](CaseManagementApi#getCasemanagementCaseAssociations) | Get a list of Case associations for the Case. |
| [**getCasemanagementCaseComment**](CaseManagementApi#getCasemanagementCaseComment) | Get a Comment. |
| [**getCasemanagementCaseComments**](CaseManagementApi#getCasemanagementCaseComments) | Get comments for a Case. |
| [**getCasemanagementCaseStage**](CaseManagementApi#getCasemanagementCaseStage) | Get a Stage. |
| [**getCasemanagementCaseStageStep**](CaseManagementApi#getCasemanagementCaseStageStep) | Get a Step. |
| [**getCasemanagementCaseStageSteps**](CaseManagementApi#getCasemanagementCaseStageSteps) | Get a list of Steps. |
| [**getCasemanagementCaseStages**](CaseManagementApi#getCasemanagementCaseStages) | Get a list of Stages. |
| [**getCasemanagementCaseTerminateJob**](CaseManagementApi#getCasemanagementCaseTerminateJob) | Get a Terminate Job for a Case. |
| [**getCasemanagementCaseplan**](CaseManagementApi#getCasemanagementCaseplan) | Get a Caseplan. |
| [**getCasemanagementCaseplanVersion**](CaseManagementApi#getCasemanagementCaseplanVersion) | Get a Caseplan version. |
| [**getCasemanagementCaseplanVersionDataschemas**](CaseManagementApi#getCasemanagementCaseplanVersionDataschemas) | Get the data schemas for a Caseplan version. |
| [**getCasemanagementCaseplanVersionIntakesettings**](CaseManagementApi#getCasemanagementCaseplanVersionIntakesettings) | Get the intake settings for a Caseplan version. |
| [**getCasemanagementCaseplanVersionStageplan**](CaseManagementApi#getCasemanagementCaseplanVersionStageplan) | Get a Stageplan. |
| [**getCasemanagementCaseplanVersionStageplanStepplan**](CaseManagementApi#getCasemanagementCaseplanVersionStageplanStepplan) | Get a Stepplan. |
| [**getCasemanagementCaseplanVersionStageplanStepplans**](CaseManagementApi#getCasemanagementCaseplanVersionStageplanStepplans) | Get a list of Stepplans. |
| [**getCasemanagementCaseplanVersionStageplans**](CaseManagementApi#getCasemanagementCaseplanVersionStageplans) | Get a list of Stageplans. |
| [**getCasemanagementCaseplans**](CaseManagementApi#getCasemanagementCaseplans) | Get a list of Caseplans. |
| [**getCasemanagementCasesExternalcontact**](CaseManagementApi#getCasemanagementCasesExternalcontact) | Get a list of Cases for an External Contact. |
| [**getCasemanagementCasesQueryJob**](CaseManagementApi#getCasemanagementCasesQueryJob) | Get a case query job by id |
| [**getCasemanagementCasesQueryJobResults**](CaseManagementApi#getCasemanagementCasesQueryJobResults) | Get results for a case query job |
| [**getCasemanagementCasesReference**](CaseManagementApi#getCasemanagementCasesReference) | Get a Case by reference. |
| [**patchCasemanagementCaseDatedue**](CaseManagementApi#patchCasemanagementCaseDatedue) | Update the due date of a Case. |
| [**patchCasemanagementCaseOwner**](CaseManagementApi#patchCasemanagementCaseOwner) | Update the ownerId of a Case |
| [**patchCasemanagementCasePriority**](CaseManagementApi#patchCasemanagementCasePriority) | Update priority of a Case. |
| [**patchCasemanagementCaseSummary**](CaseManagementApi#patchCasemanagementCaseSummary) | Update summary of a Case. |
| [**patchCasemanagementCaseplan**](CaseManagementApi#patchCasemanagementCaseplan) | Update the attributes of a Caseplan. |
| [**patchCasemanagementCaseplanStageplan**](CaseManagementApi#patchCasemanagementCaseplanStageplan) | Update the attributes of a Stageplan. |
| [**patchCasemanagementCaseplanStageplanStepplan**](CaseManagementApi#patchCasemanagementCaseplanStageplanStepplan) | Update the attributes of a Stepplan. |
| [**postCasemanagementCaseAssociations**](CaseManagementApi#postCasemanagementCaseAssociations) | Create a Case association. |
| [**postCasemanagementCaseComments**](CaseManagementApi#postCasemanagementCaseComments) | Add a comment to a Case. |
| [**postCasemanagementCaseTerminateJobs**](CaseManagementApi#postCasemanagementCaseTerminateJobs) | Create a Terminate Job for a Case. |
| [**postCasemanagementCaseplanDataschemas**](CaseManagementApi#postCasemanagementCaseplanDataschemas) | Add a data schema to a draft Caseplan. |
| [**postCasemanagementCaseplanPublish**](CaseManagementApi#postCasemanagementCaseplanPublish) | Publish Caseplan. |
| [**postCasemanagementCaseplanStageplanReposition**](CaseManagementApi#postCasemanagementCaseplanStageplanReposition) | Reposition a Stageplan within a draft Caseplan. |
| [**postCasemanagementCaseplanStageplans**](CaseManagementApi#postCasemanagementCaseplanStageplans) | Create a Stageplan on a draft Caseplan. |
| [**postCasemanagementCaseplanVersions**](CaseManagementApi#postCasemanagementCaseplanVersions) | Create Caseplan version. |
| [**postCasemanagementCaseplans**](CaseManagementApi#postCasemanagementCaseplans) | Create a Caseplan. |
| [**postCasemanagementCaseplansQuery**](CaseManagementApi#postCasemanagementCaseplansQuery) | Query for Caseplans. |
| [**postCasemanagementCases**](CaseManagementApi#postCasemanagementCases) | Create a Case. |
| [**postCasemanagementCasesAssociationsQuery**](CaseManagementApi#postCasemanagementCasesAssociationsQuery) | Query for Case associations by interaction. |
| [**postCasemanagementCasesQueryJobs**](CaseManagementApi#postCasemanagementCasesQueryJobs) | Create a Case query job. |
| [**putCasemanagementCaseplanDataschema**](CaseManagementApi#putCasemanagementCaseplanDataschema) | Update a data schema on a draft Caseplan. |
| [**putCasemanagementCaseplanIntakesettings**](CaseManagementApi#putCasemanagementCaseplanIntakesettings) | Update the intake settings for a Caseplan. |
{: class="table-striped"}


# **deleteCasemanagementCase**


> Empty deleteCasemanagementCase(caseId)

Delete a Case.

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
String caseId = "caseId_example"; // String | Case identifier.
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
| **caseId** | **String**| Case identifier. | 
{: class="table-striped"}


### Return type

**Empty**


# **deleteCasemanagementCaseCommentsMeCommentId**


> Empty deleteCasemanagementCaseCommentsMeCommentId(caseId, commentId)

Delete my Comment.

Wraps DELETE /api/v2/casemanagement/cases/{caseId}/comments/me/{commentId}  

Requires ANY permissions: 

* caseManagement:commentSelf:delete

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
String caseId = "caseId_example"; // String | Case identifier.
String commentId = "commentId_example"; // String | Comment identifier.
try {
    Empty result = apiInstance.deleteCasemanagementCaseCommentsMeCommentId(caseId, commentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaseManagementApi#deleteCasemanagementCaseCommentsMeCommentId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **caseId** | **String**| Case identifier. | 
| **commentId** | **String**| Comment identifier. | 
{: class="table-striped"}


### Return type

**Empty**


# **deleteCasemanagementCaseplan**


> Empty deleteCasemanagementCaseplan(caseplanId)

Delete a Caseplan.

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
String caseplanId = "caseplanId_example"; // String | Caseplan identifier.
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
| **caseplanId** | **String**| Caseplan identifier. | 
{: class="table-striped"}


### Return type

**Empty**


# **deleteCasemanagementCaseplanDataschema**


> Empty deleteCasemanagementCaseplanDataschema(caseplanId, schemaKeyName)

Remove a data schema from a draft Caseplan.

Wraps DELETE /api/v2/casemanagement/caseplans/{caseplanId}/dataschemas/{schemaKeyName}  

Requires ALL permissions: 

* caseManagement:caseplanDataSchemas:delete

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
String caseplanId = "caseplanId_example"; // String | Caseplan identifier.
String schemaKeyName = "schemaKeyName_example"; // String | Schema key (for example \"default\").
try {
    Empty result = apiInstance.deleteCasemanagementCaseplanDataschema(caseplanId, schemaKeyName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaseManagementApi#deleteCasemanagementCaseplanDataschema");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **caseplanId** | **String**| Caseplan identifier. | 
| **schemaKeyName** | **String**| Schema key (for example \&quot;default\&quot;). | 
{: class="table-striped"}


### Return type

**Empty**


# **deleteCasemanagementCaseplanStageplan**


> Empty deleteCasemanagementCaseplanStageplan(caseplanId, stageplanId)

Delete a Stageplan from a draft Caseplan.

deleteCasemanagementCaseplanStageplan is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps DELETE /api/v2/casemanagement/caseplans/{caseplanId}/stageplans/{stageplanId}  

Requires ANY permissions: 

* caseManagement:stageplan:delete

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
String caseplanId = "caseplanId_example"; // String | Caseplan identifier.
String stageplanId = "stageplanId_example"; // String | Stageplan identifier.
try {
    Empty result = apiInstance.deleteCasemanagementCaseplanStageplan(caseplanId, stageplanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaseManagementApi#deleteCasemanagementCaseplanStageplan");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **caseplanId** | **String**| Caseplan identifier. | 
| **stageplanId** | **String**| Stageplan identifier. | 
{: class="table-striped"}


### Return type

**Empty**


# **getCasemanagementCase**


> [ModelCase](Case) getCasemanagementCase(caseId, expands)

Get a Case.

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
String caseId = "caseId_example"; // String | Case identifier.
List<String> expands = Arrays.asList(null); // List<String> | Attributes to expand. Comma-separated if more than one.
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
| **caseId** | **String**| Case identifier. | 
| **expands** | [**List&lt;String&gt;**](String)| Attributes to expand. Comma-separated if more than one. | [optional]<br />**Values**: caseplan, owner, modifiedBy, externalContact, customerIntent 
{: class="table-striped"}


### Return type

[**ModelCase**](Case)


# **getCasemanagementCaseAssociation**


> [CaseAssociation](CaseAssociation) getCasemanagementCaseAssociation(caseId, associationId)

Get a Case Association.

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
String caseId = "caseId_example"; // String | Case identifier.
String associationId = "associationId_example"; // String | Case association identifier.
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
| **caseId** | **String**| Case identifier. | 
| **associationId** | **String**| Case association identifier. | 
{: class="table-striped"}


### Return type

[**CaseAssociation**](CaseAssociation)


# **getCasemanagementCaseAssociations**


> [CaseAssociationListing](CaseAssociationListing) getCasemanagementCaseAssociations(caseId, before, after, pageSize)

Get a list of Case associations for the Case.

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
String caseId = "caseId_example"; // String | Case identifier.
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
| **caseId** | **String**| Case identifier. | 
| **before** | **String**| The cursor that points to the start of the set of entities that has been returned. | [optional] 
| **after** | **String**| The cursor that points to the end of the set of entities that has been returned. | [optional] 
| **pageSize** | **String**| Number of entities to return. Maximum of 200. | [optional] 
{: class="table-striped"}


### Return type

[**CaseAssociationListing**](CaseAssociationListing)


# **getCasemanagementCaseComment**


> [Comment](Comment) getCasemanagementCaseComment(caseId, commentId)

Get a Comment.

Wraps GET /api/v2/casemanagement/cases/{caseId}/comments/{commentId}  

Requires ANY permissions: 

* caseManagement:comment:view

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
String caseId = "caseId_example"; // String | Case identifier.
String commentId = "commentId_example"; // String | Comment identifier.
try {
    Comment result = apiInstance.getCasemanagementCaseComment(caseId, commentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaseManagementApi#getCasemanagementCaseComment");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **caseId** | **String**| Case identifier. | 
| **commentId** | **String**| Comment identifier. | 
{: class="table-striped"}


### Return type

[**Comment**](Comment)


# **getCasemanagementCaseComments**


> [CommentListing](CommentListing) getCasemanagementCaseComments(caseId, after, pageSize, sortOrder)

Get comments for a Case.

Wraps GET /api/v2/casemanagement/cases/{caseId}/comments  

Requires ANY permissions: 

* caseManagement:comment:view

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
String caseId = "caseId_example"; // String | Case identifier.
String after = "after_example"; // String | Cursor pointing to the end of the previously returned page of comments.
Integer pageSize = 56; // Integer | Number of comments to return. Maximum is 100.
String sortOrder = "desc"; // String | Ascending or descending sort order.
try {
    CommentListing result = apiInstance.getCasemanagementCaseComments(caseId, after, pageSize, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaseManagementApi#getCasemanagementCaseComments");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **caseId** | **String**| Case identifier. | 
| **after** | **String**| Cursor pointing to the end of the previously returned page of comments. | [optional] 
| **pageSize** | **Integer**| Number of comments to return. Maximum is 100. | [optional] 
| **sortOrder** | **String**| Ascending or descending sort order. | [optional] [default to desc]<br />**Values**: asc, desc 
{: class="table-striped"}


### Return type

[**CommentListing**](CommentListing)


# **getCasemanagementCaseStage**


> [Stage](Stage) getCasemanagementCaseStage(caseId, stageId)

Get a Stage.

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
String caseId = "caseId_example"; // String | Case identifier.
String stageId = "stageId_example"; // String | Stage identifier.
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
| **caseId** | **String**| Case identifier. | 
| **stageId** | **String**| Stage identifier. | 
{: class="table-striped"}


### Return type

[**Stage**](Stage)


# **getCasemanagementCaseStageStep**


> [Step](Step) getCasemanagementCaseStageStep(caseId, stageId, stepId)

Get a Step.

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
String caseId = "caseId_example"; // String | Case identifier.
String stageId = "stageId_example"; // String | Stage identifier.
String stepId = "stepId_example"; // String | Step identifier.
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
| **caseId** | **String**| Case identifier. | 
| **stageId** | **String**| Stage identifier. | 
| **stepId** | **String**| Step identifier. | 
{: class="table-striped"}


### Return type

[**Step**](Step)


# **getCasemanagementCaseStageSteps**


> [StepListing](StepListing) getCasemanagementCaseStageSteps(caseId, stageId, before, after, pageSize)

Get a list of Steps.

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
String caseId = "caseId_example"; // String | Case identifier.
String stageId = "stageId_example"; // String | Stage identifier.
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
| **caseId** | **String**| Case identifier. | 
| **stageId** | **String**| Stage identifier. | 
| **before** | **String**| The cursor that points to the start of the set of entities that has been returned. | [optional] 
| **after** | **String**| The cursor that points to the end of the set of entities that has been returned. | [optional] 
| **pageSize** | **String**| Number of entities to return. Maximum of 200. | [optional] 
{: class="table-striped"}


### Return type

[**StepListing**](StepListing)


# **getCasemanagementCaseStages**


> [StageListing](StageListing) getCasemanagementCaseStages(caseId, before, after, pageSize)

Get a list of Stages.

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
String caseId = "caseId_example"; // String | Case identifier.
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
| **caseId** | **String**| Case identifier. | 
| **before** | **String**| The cursor that points to the start of the set of entities that has been returned. | [optional] 
| **after** | **String**| The cursor that points to the end of the set of entities that has been returned. | [optional] 
| **pageSize** | **String**| Number of entities to return. Maximum of 200. | [optional] 
{: class="table-striped"}


### Return type

[**StageListing**](StageListing)


# **getCasemanagementCaseTerminateJob**


> [TerminateJob](TerminateJob) getCasemanagementCaseTerminateJob(caseId, jobId)

Get a Terminate Job for a Case.

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
String caseId = "caseId_example"; // String | Case identifier.
String jobId = "jobId_example"; // String | Terminate Job identifier.
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
| **caseId** | **String**| Case identifier. | 
| **jobId** | **String**| Terminate Job identifier. | 
{: class="table-striped"}


### Return type

[**TerminateJob**](TerminateJob)


# **getCasemanagementCaseplan**


> [Caseplan](Caseplan) getCasemanagementCaseplan(caseplanId)

Get a Caseplan.

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
String caseplanId = "caseplanId_example"; // String | Caseplan identifier.
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
| **caseplanId** | **String**| Caseplan identifier. | 
{: class="table-striped"}


### Return type

[**Caseplan**](Caseplan)


# **getCasemanagementCaseplanVersion**


> [Caseplan](Caseplan) getCasemanagementCaseplanVersion(caseplanId, versionId)

Get a Caseplan version.

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
String caseplanId = "caseplanId_example"; // String | Caseplan identifier.
String versionId = "versionId_example"; // String | Caseplan version identifier.
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
| **caseplanId** | **String**| Caseplan identifier. | 
| **versionId** | **String**| Caseplan version identifier. | 
{: class="table-striped"}


### Return type

[**Caseplan**](Caseplan)


# **getCasemanagementCaseplanVersionDataschemas**


> [CaseplanDataSchemaListing](CaseplanDataSchemaListing) getCasemanagementCaseplanVersionDataschemas(caseplanId, versionId)

Get the data schemas for a Caseplan version.

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
String caseplanId = "caseplanId_example"; // String | Caseplan identifier.
String versionId = "versionId_example"; // String | Caseplan version identifier.
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
| **caseplanId** | **String**| Caseplan identifier. | 
| **versionId** | **String**| Caseplan version identifier. | 
{: class="table-striped"}


### Return type

[**CaseplanDataSchemaListing**](CaseplanDataSchemaListing)


# **getCasemanagementCaseplanVersionIntakesettings**


> [IntakeSettingsListing](IntakeSettingsListing) getCasemanagementCaseplanVersionIntakesettings(caseplanId, versionId)

Get the intake settings for a Caseplan version.

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
String caseplanId = "caseplanId_example"; // String | Caseplan identifier.
String versionId = "versionId_example"; // String | Caseplan version identifier.
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
| **caseplanId** | **String**| Caseplan identifier. | 
| **versionId** | **String**| Caseplan version identifier. | 
{: class="table-striped"}


### Return type

[**IntakeSettingsListing**](IntakeSettingsListing)


# **getCasemanagementCaseplanVersionStageplan**


> [Stageplan](Stageplan) getCasemanagementCaseplanVersionStageplan(caseplanId, versionId, stageplanId, expands)

Get a Stageplan.

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
String caseplanId = "caseplanId_example"; // String | Caseplan identifier.
String versionId = "versionId_example"; // String | Caseplan version identifier.
String stageplanId = "stageplanId_example"; // String | Stageplan identifier.
List<String> expands = Arrays.asList(null); // List<String> | Fields to expand.
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
| **caseplanId** | **String**| Caseplan identifier. | 
| **versionId** | **String**| Caseplan version identifier. | 
| **stageplanId** | **String**| Stageplan identifier. | 
| **expands** | [**List&lt;String&gt;**](String)| Fields to expand. | [optional]<br />**Values**: caseplan 
{: class="table-striped"}


### Return type

[**Stageplan**](Stageplan)


# **getCasemanagementCaseplanVersionStageplanStepplan**


> [Stepplan](Stepplan) getCasemanagementCaseplanVersionStageplanStepplan(caseplanId, versionId, stageplanId, stepplanId, expands)

Get a Stepplan.

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
String caseplanId = "caseplanId_example"; // String | Caseplan identifier.
String versionId = "versionId_example"; // String | Caseplan version identifier.
String stageplanId = "stageplanId_example"; // String | Stageplan identifier.
String stepplanId = "stepplanId_example"; // String | Stepplan identifier.
List<String> expands = Arrays.asList(null); // List<String> | Fields to expand.
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
| **caseplanId** | **String**| Caseplan identifier. | 
| **versionId** | **String**| Caseplan version identifier. | 
| **stageplanId** | **String**| Stageplan identifier. | 
| **stepplanId** | **String**| Stepplan identifier. | 
| **expands** | [**List&lt;String&gt;**](String)| Fields to expand. | [optional]<br />**Values**: stageplan, caseplan, worktype 
{: class="table-striped"}


### Return type

[**Stepplan**](Stepplan)


# **getCasemanagementCaseplanVersionStageplanStepplans**


> [StepplanListing](StepplanListing) getCasemanagementCaseplanVersionStageplanStepplans(caseplanId, versionId, stageplanId, before, after, pageSize, expands)

Get a list of Stepplans.

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
String caseplanId = "caseplanId_example"; // String | Caseplan identifier.
String versionId = "versionId_example"; // String | Caseplan version identifier.
String stageplanId = "stageplanId_example"; // String | Stageplan identifier.
String before = "before_example"; // String | The cursor that points to the start of the set of entities that has been returned.
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned.
String pageSize = "pageSize_example"; // String | Number of entities to return. Maximum of 200.
List<String> expands = Arrays.asList(null); // List<String> | Fields to expand.
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
| **caseplanId** | **String**| Caseplan identifier. | 
| **versionId** | **String**| Caseplan version identifier. | 
| **stageplanId** | **String**| Stageplan identifier. | 
| **before** | **String**| The cursor that points to the start of the set of entities that has been returned. | [optional] 
| **after** | **String**| The cursor that points to the end of the set of entities that has been returned. | [optional] 
| **pageSize** | **String**| Number of entities to return. Maximum of 200. | [optional] 
| **expands** | [**List&lt;String&gt;**](String)| Fields to expand. | [optional]<br />**Values**: caseplan, stageplan, worktype 
{: class="table-striped"}


### Return type

[**StepplanListing**](StepplanListing)


# **getCasemanagementCaseplanVersionStageplans**


> [StageplanListing](StageplanListing) getCasemanagementCaseplanVersionStageplans(caseplanId, versionId, before, after, pageSize, expands)

Get a list of Stageplans.

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
String caseplanId = "caseplanId_example"; // String | Caseplan identifier.
String versionId = "versionId_example"; // String | Caseplan version identifier.
String before = "before_example"; // String | The cursor that points to the start of the set of entities that has been returned.
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned.
String pageSize = "pageSize_example"; // String | Number of entities to return. Maximum of 200.
List<String> expands = Arrays.asList(null); // List<String> | Fields to expand.
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
| **caseplanId** | **String**| Caseplan identifier. | 
| **versionId** | **String**| Caseplan version identifier. | 
| **before** | **String**| The cursor that points to the start of the set of entities that has been returned. | [optional] 
| **after** | **String**| The cursor that points to the end of the set of entities that has been returned. | [optional] 
| **pageSize** | **String**| Number of entities to return. Maximum of 200. | [optional] 
| **expands** | [**List&lt;String&gt;**](String)| Fields to expand. | [optional]<br />**Values**: caseplan 
{: class="table-striped"}


### Return type

[**StageplanListing**](StageplanListing)


# **getCasemanagementCaseplans**


> [CaseplanListing](CaseplanListing) getCasemanagementCaseplans(after, pageSize, customerIntentId, divisionIds)

Get a list of Caseplans.

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
String after = "after_example"; // String | Cursor that points to the end of the previously returned set of Caseplans.
Integer pageSize = 56; // Integer | Number of Caseplans to return. Maximum is 200.
String customerIntentId = "customerIntentId_example"; // String | Filter by customer intent.
String divisionIds = "divisionIds_example"; // String | Filter by divisions.
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
| **after** | **String**| Cursor that points to the end of the previously returned set of Caseplans. | [optional] 
| **pageSize** | **Integer**| Number of Caseplans to return. Maximum is 200. | [optional] 
| **customerIntentId** | **String**| Filter by customer intent. | [optional] 
| **divisionIds** | **String**| Filter by divisions. | [optional] 
{: class="table-striped"}


### Return type

[**CaseplanListing**](CaseplanListing)


# **getCasemanagementCasesExternalcontact**


> [CaseListing](CaseListing) getCasemanagementCasesExternalcontact(externalContactId, after, pageSize, divisionIds, expands)

Get a list of Cases for an External Contact.

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
String externalContactId = "externalContactId_example"; // String | External contact identifier.
String after = "after_example"; // String | Cursor pointing to the end of the previously returned page of Cases.
Integer pageSize = 56; // Integer | Number of Cases to return (maximum 200).
String divisionIds = "divisionIds_example"; // String | Filter by divisions.
List<String> expands = Arrays.asList(null); // List<String> | Fields to expand.
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
| **externalContactId** | **String**| External contact identifier. | 
| **after** | **String**| Cursor pointing to the end of the previously returned page of Cases. | [optional] 
| **pageSize** | **Integer**| Number of Cases to return (maximum 200). | [optional] 
| **divisionIds** | **String**| Filter by divisions. | [optional] 
| **expands** | [**List&lt;String&gt;**](String)| Fields to expand. | [optional]<br />**Values**: caseplan 
{: class="table-striped"}


### Return type

[**CaseListing**](CaseListing)


# **getCasemanagementCasesQueryJob**


> [CaseQueryJobResponse](CaseQueryJobResponse) getCasemanagementCasesQueryJob(jobId)

Get a case query job by id

getCasemanagementCasesQueryJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/casemanagement/cases/query/jobs/{jobId}  

Requires ALL permissions: 

* caseManagement:queryJob:view

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
String jobId = "jobId_example"; // String | Job ID
try {
    CaseQueryJobResponse result = apiInstance.getCasemanagementCasesQueryJob(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaseManagementApi#getCasemanagementCasesQueryJob");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobId** | **String**| Job ID | 
{: class="table-striped"}


### Return type

[**CaseQueryJobResponse**](CaseQueryJobResponse)


# **getCasemanagementCasesQueryJobResults**


> [CaseQueryJobResultsResponse](CaseQueryJobResultsResponse) getCasemanagementCasesQueryJobResults(jobId)

Get results for a case query job

getCasemanagementCasesQueryJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/casemanagement/cases/query/jobs/{jobId}/results  

Requires ALL permissions: 

* caseManagement:queryJobResults:view

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
String jobId = "jobId_example"; // String | Job ID
try {
    CaseQueryJobResultsResponse result = apiInstance.getCasemanagementCasesQueryJobResults(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaseManagementApi#getCasemanagementCasesQueryJobResults");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobId** | **String**| Job ID | 
{: class="table-striped"}


### Return type

[**CaseQueryJobResultsResponse**](CaseQueryJobResultsResponse)


# **getCasemanagementCasesReference**


> [ModelCase](Case) getCasemanagementCasesReference(referenceId, expands)

Get a Case by reference.

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
String referenceId = "referenceId_example"; // String | Case reference.
List<String> expands = Arrays.asList(null); // List<String> | Attributes to expand. Comma-separated if more than one.
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
| **referenceId** | **String**| Case reference. | 
| **expands** | [**List&lt;String&gt;**](String)| Attributes to expand. Comma-separated if more than one. | [optional]<br />**Values**: caseplan, owner, modifiedBy, externalContact, customerIntent 
{: class="table-striped"}


### Return type

[**ModelCase**](Case)


# **patchCasemanagementCaseDatedue**


> [ModelCase](Case) patchCasemanagementCaseDatedue(caseId, body)

Update the due date of a Case.

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
String caseId = "caseId_example"; // String | Case identifier.
CaseDateDueUpdate body = new CaseDateDueUpdate(); // CaseDateDueUpdate | Due date update.
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
| **caseId** | **String**| Case identifier. | 
| **body** | [**CaseDateDueUpdate**](CaseDateDueUpdate)| Due date update. | 
{: class="table-striped"}


### Return type

[**ModelCase**](Case)


# **patchCasemanagementCaseOwner**


> [ModelCase](Case) patchCasemanagementCaseOwner(caseId, body)

Update the ownerId of a Case

patchCasemanagementCaseOwner is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps PATCH /api/v2/casemanagement/cases/{caseId}/owner  

Requires ANY permissions: 

* caseManagement:caseOwner:edit

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
String caseId = "caseId_example"; // String | Case identifier.
CaseOwnerUpdate body = new CaseOwnerUpdate(); // CaseOwnerUpdate | OwnerId
try {
    ModelCase result = apiInstance.patchCasemanagementCaseOwner(caseId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaseManagementApi#patchCasemanagementCaseOwner");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **caseId** | **String**| Case identifier. | 
| **body** | [**CaseOwnerUpdate**](CaseOwnerUpdate)| OwnerId | 
{: class="table-striped"}


### Return type

[**ModelCase**](Case)


# **patchCasemanagementCasePriority**


> [ModelCase](Case) patchCasemanagementCasePriority(caseId, body)

Update priority of a Case.

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
String caseId = "caseId_example"; // String | Case identifier.
CasePriorityUpdate body = new CasePriorityUpdate(); // CasePriorityUpdate | Priority update.
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
| **caseId** | **String**| Case identifier. | 
| **body** | [**CasePriorityUpdate**](CasePriorityUpdate)| Priority update. | 
{: class="table-striped"}


### Return type

[**ModelCase**](Case)


# **patchCasemanagementCaseSummary**


> [ModelCase](Case) patchCasemanagementCaseSummary(caseId, body)

Update summary of a Case.

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
String caseId = "caseId_example"; // String | Case identifier.
CaseSummaryUpdate body = new CaseSummaryUpdate(); // CaseSummaryUpdate | Summary update.
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
| **caseId** | **String**| Case identifier. | 
| **body** | [**CaseSummaryUpdate**](CaseSummaryUpdate)| Summary update. | 
{: class="table-striped"}


### Return type

[**ModelCase**](Case)


# **patchCasemanagementCaseplan**


> [Caseplan](Caseplan) patchCasemanagementCaseplan(caseplanId, body)

Update the attributes of a Caseplan.

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
String caseplanId = "caseplanId_example"; // String | Caseplan identifier.
CaseplanUpdate body = new CaseplanUpdate(); // CaseplanUpdate | Caseplan update.
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
| **caseplanId** | **String**| Caseplan identifier. | 
| **body** | [**CaseplanUpdate**](CaseplanUpdate)| Caseplan update. | 
{: class="table-striped"}


### Return type

[**Caseplan**](Caseplan)


# **patchCasemanagementCaseplanStageplan**


> [Stageplan](Stageplan) patchCasemanagementCaseplanStageplan(caseplanId, stageplanId, body)

Update the attributes of a Stageplan.

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
String caseplanId = "caseplanId_example"; // String | Caseplan identifier.
String stageplanId = "stageplanId_example"; // String | Stageplan identifier.
StageplanUpdate body = new StageplanUpdate(); // StageplanUpdate | Stageplan update.
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
| **caseplanId** | **String**| Caseplan identifier. | 
| **stageplanId** | **String**| Stageplan identifier. | 
| **body** | [**StageplanUpdate**](StageplanUpdate)| Stageplan update. | 
{: class="table-striped"}


### Return type

[**Stageplan**](Stageplan)


# **patchCasemanagementCaseplanStageplanStepplan**


> [Stepplan](Stepplan) patchCasemanagementCaseplanStageplanStepplan(caseplanId, stageplanId, stepplanId, body)

Update the attributes of a Stepplan.

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
String caseplanId = "caseplanId_example"; // String | Caseplan identifier.
String stageplanId = "stageplanId_example"; // String | Stageplan identifier.
String stepplanId = "stepplanId_example"; // String | Stepplan identifier.
StepplanUpdate body = new StepplanUpdate(); // StepplanUpdate | Stepplan update.
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
| **caseplanId** | **String**| Caseplan identifier. | 
| **stageplanId** | **String**| Stageplan identifier. | 
| **stepplanId** | **String**| Stepplan identifier. | 
| **body** | [**StepplanUpdate**](StepplanUpdate)| Stepplan update. | 
{: class="table-striped"}


### Return type

[**Stepplan**](Stepplan)


# **postCasemanagementCaseAssociations**


> [CaseAssociation](CaseAssociation) postCasemanagementCaseAssociations(caseId, body)

Create a Case association.

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
String caseId = "caseId_example"; // String | Case identifier.
CaseAssociationCreate body = new CaseAssociationCreate(); // CaseAssociationCreate | Case association create request.
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
| **caseId** | **String**| Case identifier. | 
| **body** | [**CaseAssociationCreate**](CaseAssociationCreate)| Case association create request. | 
{: class="table-striped"}


### Return type

[**CaseAssociation**](CaseAssociation)


# **postCasemanagementCaseComments**


> [Comment](Comment) postCasemanagementCaseComments(caseId, body)

Add a comment to a Case.

Wraps POST /api/v2/casemanagement/cases/{caseId}/comments  

Requires ANY permissions: 

* caseManagement:comment:add

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
String caseId = "caseId_example"; // String | Case identifier.
CommentCreate body = new CommentCreate(); // CommentCreate | Comment create request.
try {
    Comment result = apiInstance.postCasemanagementCaseComments(caseId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaseManagementApi#postCasemanagementCaseComments");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **caseId** | **String**| Case identifier. | 
| **body** | [**CommentCreate**](CommentCreate)| Comment create request. | 
{: class="table-striped"}


### Return type

[**Comment**](Comment)


# **postCasemanagementCaseTerminateJobs**


> [TerminateJob](TerminateJob) postCasemanagementCaseTerminateJobs(caseId)

Create a Terminate Job for a Case.

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
String caseId = "caseId_example"; // String | Case identifier.
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
| **caseId** | **String**| Case identifier. | 
{: class="table-striped"}


### Return type

[**TerminateJob**](TerminateJob)


# **postCasemanagementCaseplanDataschemas**


> [CaseplanDataSchema](CaseplanDataSchema) postCasemanagementCaseplanDataschemas(caseplanId, body)

Add a data schema to a draft Caseplan.

Wraps POST /api/v2/casemanagement/caseplans/{caseplanId}/dataschemas  

Requires ALL permissions: 

* caseManagement:caseplanDataSchemas:add

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
String caseplanId = "caseplanId_example"; // String | Caseplan identifier.
CaseplanDataSchemaRequest body = new CaseplanDataSchemaRequest(); // CaseplanDataSchemaRequest | Data schema reference.
try {
    CaseplanDataSchema result = apiInstance.postCasemanagementCaseplanDataschemas(caseplanId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaseManagementApi#postCasemanagementCaseplanDataschemas");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **caseplanId** | **String**| Caseplan identifier. | 
| **body** | [**CaseplanDataSchemaRequest**](CaseplanDataSchemaRequest)| Data schema reference. | 
{: class="table-striped"}


### Return type

[**CaseplanDataSchema**](CaseplanDataSchema)


# **postCasemanagementCaseplanPublish**


> [Caseplan](Caseplan) postCasemanagementCaseplanPublish(caseplanId)

Publish Caseplan.

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
String caseplanId = "caseplanId_example"; // String | Caseplan identifier.
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
| **caseplanId** | **String**| Caseplan identifier. | 
{: class="table-striped"}


### Return type

[**Caseplan**](Caseplan)


# **postCasemanagementCaseplanStageplanReposition**


> Empty postCasemanagementCaseplanStageplanReposition(caseplanId, stageplanId, body)

Reposition a Stageplan within a draft Caseplan.

postCasemanagementCaseplanStageplanReposition is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/casemanagement/caseplans/{caseplanId}/stageplans/{stageplanId}/reposition  

Requires ANY permissions: 

* caseManagement:stageplan:reposition

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
String caseplanId = "caseplanId_example"; // String | Caseplan identifier.
String stageplanId = "stageplanId_example"; // String | Stageplan identifier.
StageplanReposition body = new StageplanReposition(); // StageplanReposition | Stageplan reposition request.
try {
    Empty result = apiInstance.postCasemanagementCaseplanStageplanReposition(caseplanId, stageplanId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaseManagementApi#postCasemanagementCaseplanStageplanReposition");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **caseplanId** | **String**| Caseplan identifier. | 
| **stageplanId** | **String**| Stageplan identifier. | 
| **body** | [**StageplanReposition**](StageplanReposition)| Stageplan reposition request. | 
{: class="table-striped"}


### Return type

**Empty**


# **postCasemanagementCaseplanStageplans**


> [Stageplan](Stageplan) postCasemanagementCaseplanStageplans(caseplanId, body)

Create a Stageplan on a draft Caseplan.

postCasemanagementCaseplanStageplans is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/casemanagement/caseplans/{caseplanId}/stageplans  

Requires ANY permissions: 

* caseManagement:stageplan:add

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
String caseplanId = "caseplanId_example"; // String | Caseplan identifier.
StageplanCreate body = new StageplanCreate(); // StageplanCreate | Stageplan create request.
try {
    Stageplan result = apiInstance.postCasemanagementCaseplanStageplans(caseplanId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaseManagementApi#postCasemanagementCaseplanStageplans");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **caseplanId** | **String**| Caseplan identifier. | 
| **body** | [**StageplanCreate**](StageplanCreate)| Stageplan create request. | 
{: class="table-striped"}


### Return type

[**Stageplan**](Stageplan)


# **postCasemanagementCaseplanVersions**


> [Caseplan](Caseplan) postCasemanagementCaseplanVersions(caseplanId)

Create Caseplan version.

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
String caseplanId = "caseplanId_example"; // String | Caseplan identifier.
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
| **caseplanId** | **String**| Caseplan identifier. | 
{: class="table-striped"}


### Return type

[**Caseplan**](Caseplan)


# **postCasemanagementCaseplans**


> [CaseplanCreateResponse](CaseplanCreateResponse) postCasemanagementCaseplans(body)

Create a Caseplan.

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
CaseplanCreate body = new CaseplanCreate(); // CaseplanCreate | Caseplan create request.
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
| **body** | [**CaseplanCreate**](CaseplanCreate)| Caseplan create request. | 
{: class="table-striped"}


### Return type

[**CaseplanCreateResponse**](CaseplanCreateResponse)


# **postCasemanagementCaseplansQuery**


> [CaseplanQueryEntityListing](CaseplanQueryEntityListing) postCasemanagementCaseplansQuery(body)

Query for Caseplans.

This endpoint supports two filtering modes. The recommended approach uses 'filters' (generic filter model) and 'attributes' (field projection). During the migration period, the legacy fields 'name', 'nameSearchType', and 'divisionIds' remain available as an alternative.

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
CaseplanQueryRequest body = new CaseplanQueryRequest(); // CaseplanQueryRequest | Caseplan query request.
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
| **body** | [**CaseplanQueryRequest**](CaseplanQueryRequest)| Caseplan query request. | 
{: class="table-striped"}


### Return type

[**CaseplanQueryEntityListing**](CaseplanQueryEntityListing)


# **postCasemanagementCases**


> [ModelCase](Case) postCasemanagementCases(body)

Create a Case.

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
CaseCreate body = new CaseCreate(); // CaseCreate | Case create request.
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
| **body** | [**CaseCreate**](CaseCreate)| Case create request. | 
{: class="table-striped"}


### Return type

[**ModelCase**](Case)


# **postCasemanagementCasesAssociationsQuery**


> [CaseAssociationQueryEntityListing](CaseAssociationQueryEntityListing) postCasemanagementCasesAssociationsQuery(body)

Query for Case associations by interaction.

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
CaseAssociationQuery body = new CaseAssociationQuery(); // CaseAssociationQuery | Case association query request.
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
| **body** | [**CaseAssociationQuery**](CaseAssociationQuery)| Case association query request. | 
{: class="table-striped"}


### Return type

[**CaseAssociationQueryEntityListing**](CaseAssociationQueryEntityListing)


# **postCasemanagementCasesQueryJobs**


> [CaseQueryJobResponse](CaseQueryJobResponse) postCasemanagementCasesQueryJobs(body)

Create a Case query job.

postCasemanagementCasesQueryJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/casemanagement/cases/query/jobs  

Requires ANY permissions: 

* caseManagement:queryJob:add

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
CaseQueryJobCreate body = new CaseQueryJobCreate(); // CaseQueryJobCreate | Case query job create request.
try {
    CaseQueryJobResponse result = apiInstance.postCasemanagementCasesQueryJobs(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaseManagementApi#postCasemanagementCasesQueryJobs");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**CaseQueryJobCreate**](CaseQueryJobCreate)| Case query job create request. | 
{: class="table-striped"}


### Return type

[**CaseQueryJobResponse**](CaseQueryJobResponse)


# **putCasemanagementCaseplanDataschema**


> [CaseplanDataSchema](CaseplanDataSchema) putCasemanagementCaseplanDataschema(caseplanId, schemaKeyName, body)

Update a data schema on a draft Caseplan.

Wraps PUT /api/v2/casemanagement/caseplans/{caseplanId}/dataschemas/{schemaKeyName}  

Requires ALL permissions: 

* caseManagement:caseplanDataSchemas:edit

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
String caseplanId = "caseplanId_example"; // String | Caseplan identifier.
String schemaKeyName = "schemaKeyName_example"; // String | Schema key (for example \"default\").
CaseplanDataSchemaRequest body = new CaseplanDataSchemaRequest(); // CaseplanDataSchemaRequest | Data schema reference.
try {
    CaseplanDataSchema result = apiInstance.putCasemanagementCaseplanDataschema(caseplanId, schemaKeyName, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaseManagementApi#putCasemanagementCaseplanDataschema");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **caseplanId** | **String**| Caseplan identifier. | 
| **schemaKeyName** | **String**| Schema key (for example \&quot;default\&quot;). | 
| **body** | [**CaseplanDataSchemaRequest**](CaseplanDataSchemaRequest)| Data schema reference. | 
{: class="table-striped"}


### Return type

[**CaseplanDataSchema**](CaseplanDataSchema)


# **putCasemanagementCaseplanIntakesettings**


> [IntakeSettingsListing](IntakeSettingsListing) putCasemanagementCaseplanIntakesettings(caseplanId, body)

Update the intake settings for a Caseplan.

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
String caseplanId = "caseplanId_example"; // String | Caseplan identifier.
IntakeSettingsUpdate body = new IntakeSettingsUpdate(); // IntakeSettingsUpdate | Intake settings update.
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
| **caseplanId** | **String**| Caseplan identifier. | 
| **body** | [**IntakeSettingsUpdate**](IntakeSettingsUpdate)| Intake settings update. | 
{: class="table-striped"}


### Return type

[**IntakeSettingsListing**](IntakeSettingsListing)


_com.mypurecloud.sdk.v2:platform-client-v2:262.0.0_
