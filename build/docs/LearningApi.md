---
title: LearningApi
---
## LearningApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteLearningAssignment**](LearningApi.html#deleteLearningAssignment) | Delete a learning assignment |
| [**deleteLearningModule**](LearningApi.html#deleteLearningModule) | Delete a learning module |
| [**getLearningAssignment**](LearningApi.html#getLearningAssignment) | Get Learning Assignment |
| [**getLearningAssignments**](LearningApi.html#getLearningAssignments) | List of Learning module Assignments |
| [**getLearningAssignmentsMe**](LearningApi.html#getLearningAssignmentsMe) | List of Learning Assignments assigned to current user |
| [**getLearningModule**](LearningApi.html#getLearningModule) | Get a learning module |
| [**getLearningModuleRule**](LearningApi.html#getLearningModuleRule) | Get a learning module rule |
| [**getLearningModuleVersion**](LearningApi.html#getLearningModuleVersion) | Get specific version of a published module |
| [**getLearningModules**](LearningApi.html#getLearningModules) | Get all learning modules of an organization |
| [**patchLearningAssignment**](LearningApi.html#patchLearningAssignment) | Update Learning Assignment |
| [**postLearningAssessmentsScoring**](LearningApi.html#postLearningAssessmentsScoring) | Score learning assessment for preview |
| [**postLearningAssignments**](LearningApi.html#postLearningAssignments) | Create Learning Assignment |
| [**postLearningAssignmentsAggregatesQuery**](LearningApi.html#postLearningAssignmentsAggregatesQuery) | Retrieve aggregated assignment data |
| [**postLearningAssignmentsBulkadd**](LearningApi.html#postLearningAssignmentsBulkadd) | Add multiple learning assignments |
| [**postLearningAssignmentsBulkremove**](LearningApi.html#postLearningAssignmentsBulkremove) | Remove multiple Learning Assignments |
| [**postLearningModulePublish**](LearningApi.html#postLearningModulePublish) | Publish a Learning module |
| [**postLearningModules**](LearningApi.html#postLearningModules) | Create a new learning module |
| [**postLearningRulesQuery**](LearningApi.html#postLearningRulesQuery) | Get users for learning module rule |
| [**putLearningModule**](LearningApi.html#putLearningModule) | Update a learning module |
| [**putLearningModuleRule**](LearningApi.html#putLearningModuleRule) | Update a learning module rule |
{: class="table-striped"}

<a name="deleteLearningAssignment"></a>

# **deleteLearningAssignment**



> Void deleteLearningAssignment(assignmentId)

Delete a learning assignment



Wraps DELETE /api/v2/learning/assignments/{assignmentId}  

Requires ANY permissions: 

* learning:assignment:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LearningApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LearningApi apiInstance = new LearningApi();
String assignmentId = "assignmentId_example"; // String | The Learning Assignment ID
try {
    apiInstance.deleteLearningAssignment(assignmentId);
} catch (ApiException e) {
    System.err.println("Exception when calling LearningApi#deleteLearningAssignment");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **assignmentId** | **String**| The Learning Assignment ID | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteLearningModule"></a>

# **deleteLearningModule**



> Void deleteLearningModule(moduleId)

Delete a learning module

This will delete a learning module if it is unpublished or it will delete a published and archived learning module

Wraps DELETE /api/v2/learning/modules/{moduleId}  

Requires ANY permissions: 

* learning:module:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LearningApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LearningApi apiInstance = new LearningApi();
String moduleId = "moduleId_example"; // String | The ID of the learning module
try {
    apiInstance.deleteLearningModule(moduleId);
} catch (ApiException e) {
    System.err.println("Exception when calling LearningApi#deleteLearningModule");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **moduleId** | **String**| The ID of the learning module | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="getLearningAssignment"></a>

# **getLearningAssignment**



> [LearningAssignment](LearningAssignment.html) getLearningAssignment(assignmentId, expand)

Get Learning Assignment

Permission not required if you are the assigned user of the learning assignment

Wraps GET /api/v2/learning/assignments/{assignmentId}  

Requires ANY permissions: 

* learning:assignment:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LearningApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LearningApi apiInstance = new LearningApi();
String assignmentId = "assignmentId_example"; // String | The ID of Learning Assignment
List<String> expand = Arrays.asList("expand_example"); // List<String> | Fields to expand in response
try {
    LearningAssignment result = apiInstance.getLearningAssignment(assignmentId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LearningApi#getLearningAssignment");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **assignmentId** | **String**| The ID of Learning Assignment | 
| **expand** | [**List&lt;String&gt;**](String.html)| Fields to expand in response | [optional]<br />**Values**: module, assessment, assessmentForm 
{: class="table-striped"}


### Return type

[**LearningAssignment**](LearningAssignment.html)

<a name="getLearningAssignments"></a>

# **getLearningAssignments**



> [LearningAssignmentsDomainEntity](LearningAssignmentsDomainEntity.html) getLearningAssignments(moduleId, interval, completionInterval, overdue, pageSize, pageNumber, pass, minPercentageScore, maxPercentageScore, sortOrder, sortBy, userId, types, states, expand)

List of Learning module Assignments

Either moduleId or user value is required

Wraps GET /api/v2/learning/assignments  

Requires ANY permissions: 

* learning:assignment:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LearningApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LearningApi apiInstance = new LearningApi();
String moduleId = "moduleId_example"; // String | Specifies the ID of the learning module. Fetch assignments for learning module ID
String interval = "interval_example"; // String | Specifies the range of dueDates to be queried. Milliseconds will be truncated. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss
String completionInterval = "completionInterval_example"; // String | Specifies the range of completion dates to be used for filtering. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss
String overdue = "Any"; // String | Specifies if only the non-overdue (overdue is \"False\") or overdue (overdue is \"True\") assignments are returned. If overdue is \"Any\" or if the overdue parameter is not supplied, all assignments are returned
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String pass = "Any"; // String | Specifies if only the failed (pass is \"False\") or passed (pass is \"True\") assignments (completed with assessment)are returned. If pass is \"Any\" or if the pass parameter is not supplied, all assignments are returned
Float minPercentageScore = 3.4F; // Float | The minimum assessment score for an assignment (completed with assessment) to be included in the results (inclusive)
Float maxPercentageScore = 3.4F; // Float | The maximum assessment score for an assignment (completed with assessment) to be included in the results (inclusive)
String sortOrder = "Desc"; // String | Specifies result set sort order; if not specified, default sort order is descending (Desc)
String sortBy = "sortBy_example"; // String | Specifies which field to sort the results by, default sort is by recommendedCompletionDate
List<String> userId = Arrays.asList("userId_example"); // List<String> | Specifies the list of user IDs to be queried, up to 100 user IDs.
List<String> types = Arrays.asList("types_example"); // List<String> | Specifies the assignment types, currently not supported and will be ignored. For now, all learning assignments regardless of types will be returned
List<String> states = Arrays.asList("states_example"); // List<String> | Specifies the assignment states to filter by
List<String> expand = Arrays.asList("expand_example"); // List<String> | Specifies the expand option for returning additional information
try {
    LearningAssignmentsDomainEntity result = apiInstance.getLearningAssignments(moduleId, interval, completionInterval, overdue, pageSize, pageNumber, pass, minPercentageScore, maxPercentageScore, sortOrder, sortBy, userId, types, states, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LearningApi#getLearningAssignments");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **moduleId** | **String**| Specifies the ID of the learning module. Fetch assignments for learning module ID | [optional] 
| **interval** | **String**| Specifies the range of dueDates to be queried. Milliseconds will be truncated. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss | [optional] 
| **completionInterval** | **String**| Specifies the range of completion dates to be used for filtering. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss | [optional] 
| **overdue** | **String**| Specifies if only the non-overdue (overdue is \&quot;False\&quot;) or overdue (overdue is \&quot;True\&quot;) assignments are returned. If overdue is \&quot;Any\&quot; or if the overdue parameter is not supplied, all assignments are returned | [optional] [default to Any]<br />**Values**: True, False, Any 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pass** | **String**| Specifies if only the failed (pass is \&quot;False\&quot;) or passed (pass is \&quot;True\&quot;) assignments (completed with assessment)are returned. If pass is \&quot;Any\&quot; or if the pass parameter is not supplied, all assignments are returned | [optional] [default to Any]<br />**Values**: True, False, Any 
| **minPercentageScore** | **Float**| The minimum assessment score for an assignment (completed with assessment) to be included in the results (inclusive) | [optional] 
| **maxPercentageScore** | **Float**| The maximum assessment score for an assignment (completed with assessment) to be included in the results (inclusive) | [optional] 
| **sortOrder** | **String**| Specifies result set sort order; if not specified, default sort order is descending (Desc) | [optional] [default to Desc]<br />**Values**: Asc, Desc 
| **sortBy** | **String**| Specifies which field to sort the results by, default sort is by recommendedCompletionDate | [optional]<br />**Values**: RecommendedCompletionDate, DateModified 
| **userId** | [**List&lt;String&gt;**](String.html)| Specifies the list of user IDs to be queried, up to 100 user IDs. | [optional] 
| **types** | [**List&lt;String&gt;**](String.html)| Specifies the assignment types, currently not supported and will be ignored. For now, all learning assignments regardless of types will be returned | [optional]<br />**Values**: Informational, AssessedContent, Assessment 
| **states** | [**List&lt;String&gt;**](String.html)| Specifies the assignment states to filter by | [optional]<br />**Values**: Assigned, InProgress, Completed, NotCompleted 
| **expand** | [**List&lt;String&gt;**](String.html)| Specifies the expand option for returning additional information | [optional]<br />**Values**: ModuleSummary 
{: class="table-striped"}


### Return type

[**LearningAssignmentsDomainEntity**](LearningAssignmentsDomainEntity.html)

<a name="getLearningAssignmentsMe"></a>

# **getLearningAssignmentsMe**



> [LearningAssignmentsDomainEntity](LearningAssignmentsDomainEntity.html) getLearningAssignmentsMe(moduleId, interval, completionInterval, overdue, pageSize, pageNumber, pass, minPercentageScore, maxPercentageScore, sortOrder, sortBy, types, states, expand)

List of Learning Assignments assigned to current user



Wraps GET /api/v2/learning/assignments/me  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LearningApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LearningApi apiInstance = new LearningApi();
String moduleId = "moduleId_example"; // String | Specifies the ID of the learning module. Fetch assignments for learning module ID
String interval = "interval_example"; // String | Specifies the range of dueDates to be queried. Milliseconds will be truncated. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss
String completionInterval = "completionInterval_example"; // String | Specifies the range of completion dates to be used for filtering. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss
String overdue = "Any"; // String | Specifies if only the non-overdue (overdue is \"False\") or overdue (overdue is \"True\") assignments are returned. If overdue is \"Any\" or if the overdue parameter is not supplied, all assignments are returned
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String pass = "Any"; // String | Specifies if only the failed (pass is \"False\") or passed (pass is \"True\") assignments (completed with assessment)are returned. If pass is \"Any\" or if the pass parameter is not supplied, all assignments are returned
Float minPercentageScore = 3.4F; // Float | The minimum assessment score for an assignment (completed with assessment) to be included in the results (inclusive)
Float maxPercentageScore = 3.4F; // Float | The maximum assessment score for an assignment (completed with assessment) to be included in the results (inclusive)
String sortOrder = "Desc"; // String | Specifies result set sort order; if not specified, default sort order is descending (Desc)
String sortBy = "sortBy_example"; // String | Specifies which field to sort the results by, default sort is by recommendedCompletionDate
List<String> types = Arrays.asList("types_example"); // List<String> | Specifies the assignment types, currently not supported and will be ignored. For now, all learning assignments regardless of types will be returned
List<String> states = Arrays.asList("states_example"); // List<String> | Specifies the assignment states to filter by
List<String> expand = Arrays.asList("expand_example"); // List<String> | Specifies the expand option for returning additional information
try {
    LearningAssignmentsDomainEntity result = apiInstance.getLearningAssignmentsMe(moduleId, interval, completionInterval, overdue, pageSize, pageNumber, pass, minPercentageScore, maxPercentageScore, sortOrder, sortBy, types, states, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LearningApi#getLearningAssignmentsMe");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **moduleId** | **String**| Specifies the ID of the learning module. Fetch assignments for learning module ID | [optional] 
| **interval** | **String**| Specifies the range of dueDates to be queried. Milliseconds will be truncated. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss | [optional] 
| **completionInterval** | **String**| Specifies the range of completion dates to be used for filtering. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss | [optional] 
| **overdue** | **String**| Specifies if only the non-overdue (overdue is \&quot;False\&quot;) or overdue (overdue is \&quot;True\&quot;) assignments are returned. If overdue is \&quot;Any\&quot; or if the overdue parameter is not supplied, all assignments are returned | [optional] [default to Any]<br />**Values**: True, False, Any 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pass** | **String**| Specifies if only the failed (pass is \&quot;False\&quot;) or passed (pass is \&quot;True\&quot;) assignments (completed with assessment)are returned. If pass is \&quot;Any\&quot; or if the pass parameter is not supplied, all assignments are returned | [optional] [default to Any]<br />**Values**: True, False, Any 
| **minPercentageScore** | **Float**| The minimum assessment score for an assignment (completed with assessment) to be included in the results (inclusive) | [optional] 
| **maxPercentageScore** | **Float**| The maximum assessment score for an assignment (completed with assessment) to be included in the results (inclusive) | [optional] 
| **sortOrder** | **String**| Specifies result set sort order; if not specified, default sort order is descending (Desc) | [optional] [default to Desc]<br />**Values**: Asc, Desc 
| **sortBy** | **String**| Specifies which field to sort the results by, default sort is by recommendedCompletionDate | [optional]<br />**Values**: RecommendedCompletionDate, DateModified 
| **types** | [**List&lt;String&gt;**](String.html)| Specifies the assignment types, currently not supported and will be ignored. For now, all learning assignments regardless of types will be returned | [optional]<br />**Values**: Informational, AssessedContent, Assessment 
| **states** | [**List&lt;String&gt;**](String.html)| Specifies the assignment states to filter by | [optional]<br />**Values**: Assigned, InProgress, Completed, NotCompleted 
| **expand** | [**List&lt;String&gt;**](String.html)| Specifies the expand option for returning additional information | [optional]<br />**Values**: ModuleSummary 
{: class="table-striped"}


### Return type

[**LearningAssignmentsDomainEntity**](LearningAssignmentsDomainEntity.html)

<a name="getLearningModule"></a>

# **getLearningModule**



> [LearningModule](LearningModule.html) getLearningModule(moduleId, expand)

Get a learning module



Wraps GET /api/v2/learning/modules/{moduleId}  

Requires ANY permissions: 

* learning:module:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LearningApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LearningApi apiInstance = new LearningApi();
String moduleId = "moduleId_example"; // String | The ID of the learning module
List<String> expand = Arrays.asList("expand_example"); // List<String> | Fields to expand in response(case insensitive)
try {
    LearningModule result = apiInstance.getLearningModule(moduleId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LearningApi#getLearningModule");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **moduleId** | **String**| The ID of the learning module | 
| **expand** | [**List&lt;String&gt;**](String.html)| Fields to expand in response(case insensitive) | [optional]<br />**Values**: assessmentForm 
{: class="table-striped"}


### Return type

[**LearningModule**](LearningModule.html)

<a name="getLearningModuleRule"></a>

# **getLearningModuleRule**



> [LearningModuleRule](LearningModuleRule.html) getLearningModuleRule(moduleId)

Get a learning module rule



Wraps GET /api/v2/learning/modules/{moduleId}/rule  

Requires ANY permissions: 

* learning:rule:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LearningApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LearningApi apiInstance = new LearningApi();
String moduleId = "moduleId_example"; // String | The ID of the learning module
try {
    LearningModuleRule result = apiInstance.getLearningModuleRule(moduleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LearningApi#getLearningModuleRule");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **moduleId** | **String**| The ID of the learning module | 
{: class="table-striped"}


### Return type

[**LearningModuleRule**](LearningModuleRule.html)

<a name="getLearningModuleVersion"></a>

# **getLearningModuleVersion**



> [LearningModule](LearningModule.html) getLearningModuleVersion(moduleId, versionId, expand)

Get specific version of a published module



Wraps GET /api/v2/learning/modules/{moduleId}/versions/{versionId}  

Requires ANY permissions: 

* learning:module:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LearningApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LearningApi apiInstance = new LearningApi();
String moduleId = "moduleId_example"; // String | The ID of the learning module
String versionId = "versionId_example"; // String | The version of learning module
List<String> expand = Arrays.asList("expand_example"); // List<String> | Fields to expand in response(case insensitive)
try {
    LearningModule result = apiInstance.getLearningModuleVersion(moduleId, versionId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LearningApi#getLearningModuleVersion");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **moduleId** | **String**| The ID of the learning module | 
| **versionId** | **String**| The version of learning module | 
| **expand** | [**List&lt;String&gt;**](String.html)| Fields to expand in response(case insensitive) | [optional]<br />**Values**: assessmentForm 
{: class="table-striped"}


### Return type

[**LearningModule**](LearningModule.html)

<a name="getLearningModules"></a>

# **getLearningModules**



> [LearningModulesDomainEntityListing](LearningModulesDomainEntityListing.html) getLearningModules(isArchived, types, pageSize, pageNumber, sortOrder, sortBy, searchTerm, expand, isPublished)

Get all learning modules of an organization



Wraps GET /api/v2/learning/modules  

Requires ANY permissions: 

* learning:module:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LearningApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LearningApi apiInstance = new LearningApi();
Boolean isArchived = false; // Boolean | Archive status
List<String> types = Arrays.asList("types_example"); // List<String> | Specifies the module types.
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortOrder = "ascending"; // String | Sort order
String sortBy = "name"; // String | Sort by
String searchTerm = "searchTerm_example"; // String | Search Term (searchable by name)
List<String> expand = Arrays.asList("expand_example"); // List<String> | Fields to expand in response(case insensitive)
String isPublished = "Any"; // String | Specifies if only the Unpublished (isPublished is \"False\") or Published (isPublished is \"True\") modules are returned. If isPublished is \"Any\" or omitted, both types are returned
try {
    LearningModulesDomainEntityListing result = apiInstance.getLearningModules(isArchived, types, pageSize, pageNumber, sortOrder, sortBy, searchTerm, expand, isPublished);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LearningApi#getLearningModules");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **isArchived** | **Boolean**| Archive status | [optional] [default to false] 
| **types** | [**List&lt;String&gt;**](String.html)| Specifies the module types. | [optional]<br />**Values**: Informational, AssessedContent, Assessment 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **sortOrder** | **String**| Sort order | [optional] [default to ascending]<br />**Values**: ascending, descending 
| **sortBy** | **String**| Sort by | [optional] [default to name]<br />**Values**: name 
| **searchTerm** | **String**| Search Term (searchable by name) | [optional] 
| **expand** | [**List&lt;String&gt;**](String.html)| Fields to expand in response(case insensitive) | [optional]<br />**Values**: rule, summaryData 
| **isPublished** | **String**| Specifies if only the Unpublished (isPublished is \&quot;False\&quot;) or Published (isPublished is \&quot;True\&quot;) modules are returned. If isPublished is \&quot;Any\&quot; or omitted, both types are returned | [optional] [default to Any]<br />**Values**: True, False, Any 
{: class="table-striped"}


### Return type

[**LearningModulesDomainEntityListing**](LearningModulesDomainEntityListing.html)

<a name="patchLearningAssignment"></a>

# **patchLearningAssignment**



> [LearningAssignment](LearningAssignment.html) patchLearningAssignment(assignmentId, body)

Update Learning Assignment



Wraps PATCH /api/v2/learning/assignments/{assignmentId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LearningApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LearningApi apiInstance = new LearningApi();
String assignmentId = "assignmentId_example"; // String | The ID of Learning Assignment
LearningAssignmentUpdate body = new LearningAssignmentUpdate(); // LearningAssignmentUpdate | The Learning Assignment to be updated
try {
    LearningAssignment result = apiInstance.patchLearningAssignment(assignmentId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LearningApi#patchLearningAssignment");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **assignmentId** | **String**| The ID of Learning Assignment | 
| **body** | [**LearningAssignmentUpdate**](LearningAssignmentUpdate.html)| The Learning Assignment to be updated | [optional] 
{: class="table-striped"}


### Return type

[**LearningAssignment**](LearningAssignment.html)

<a name="postLearningAssessmentsScoring"></a>

# **postLearningAssessmentsScoring**



> [AssessmentScoringSet](AssessmentScoringSet.html) postLearningAssessmentsScoring(body)

Score learning assessment for preview



Wraps POST /api/v2/learning/assessments/scoring  

Requires ANY permissions: 

* learning:module:view
* learning:module:add
* learning:module:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LearningApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LearningApi apiInstance = new LearningApi();
LearningAssessmentScoringRequest body = new LearningAssessmentScoringRequest(); // LearningAssessmentScoringRequest | Assessment form and answers to score
try {
    AssessmentScoringSet result = apiInstance.postLearningAssessmentsScoring(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LearningApi#postLearningAssessmentsScoring");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**LearningAssessmentScoringRequest**](LearningAssessmentScoringRequest.html)| Assessment form and answers to score | 
{: class="table-striped"}


### Return type

[**AssessmentScoringSet**](AssessmentScoringSet.html)

<a name="postLearningAssignments"></a>

# **postLearningAssignments**



> [LearningAssignment](LearningAssignment.html) postLearningAssignments(body)

Create Learning Assignment



Wraps POST /api/v2/learning/assignments  

Requires ANY permissions: 

* learning:assignment:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LearningApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LearningApi apiInstance = new LearningApi();
LearningAssignmentCreate body = new LearningAssignmentCreate(); // LearningAssignmentCreate | The Learning Assignment to be created
try {
    LearningAssignment result = apiInstance.postLearningAssignments(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LearningApi#postLearningAssignments");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**LearningAssignmentCreate**](LearningAssignmentCreate.html)| The Learning Assignment to be created | [optional] 
{: class="table-striped"}


### Return type

[**LearningAssignment**](LearningAssignment.html)

<a name="postLearningAssignmentsAggregatesQuery"></a>

# **postLearningAssignmentsAggregatesQuery**



> [LearningAssignmentAggregateResponse](LearningAssignmentAggregateResponse.html) postLearningAssignmentsAggregatesQuery(body)

Retrieve aggregated assignment data



Wraps POST /api/v2/learning/assignments/aggregates/query  

Requires ANY permissions: 

* learning:assignment:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LearningApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LearningApi apiInstance = new LearningApi();
LearningAssignmentAggregateParam body = new LearningAssignmentAggregateParam(); // LearningAssignmentAggregateParam | Aggregate Request
try {
    LearningAssignmentAggregateResponse result = apiInstance.postLearningAssignmentsAggregatesQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LearningApi#postLearningAssignmentsAggregatesQuery");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**LearningAssignmentAggregateParam**](LearningAssignmentAggregateParam.html)| Aggregate Request | 
{: class="table-striped"}


### Return type

[**LearningAssignmentAggregateResponse**](LearningAssignmentAggregateResponse.html)

<a name="postLearningAssignmentsBulkadd"></a>

# **postLearningAssignmentsBulkadd**



> [LearningAssignmentBulkAddResponse](LearningAssignmentBulkAddResponse.html) postLearningAssignmentsBulkadd(body)

Add multiple learning assignments



Wraps POST /api/v2/learning/assignments/bulkadd  

Requires ANY permissions: 

* learning:assignment:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LearningApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LearningApi apiInstance = new LearningApi();
List<LearningAssignmentItem> body = Arrays.asList(new LearningAssignmentItem()); // List<LearningAssignmentItem> | The learning assignments to be created
try {
    LearningAssignmentBulkAddResponse result = apiInstance.postLearningAssignmentsBulkadd(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LearningApi#postLearningAssignmentsBulkadd");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**List&lt;LearningAssignmentItem&gt;**](LearningAssignmentItem.html)| The learning assignments to be created | [optional] 
{: class="table-striped"}


### Return type

[**LearningAssignmentBulkAddResponse**](LearningAssignmentBulkAddResponse.html)

<a name="postLearningAssignmentsBulkremove"></a>

# **postLearningAssignmentsBulkremove**



> [LearningAssignmentBulkRemoveResponse](LearningAssignmentBulkRemoveResponse.html) postLearningAssignmentsBulkremove(body)

Remove multiple Learning Assignments



Wraps POST /api/v2/learning/assignments/bulkremove  

Requires ANY permissions: 

* learning:assignment:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LearningApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LearningApi apiInstance = new LearningApi();
List<String> body = Arrays.asList(new List<String>()); // List<String> | The IDs of the learning assignments to be removed
try {
    LearningAssignmentBulkRemoveResponse result = apiInstance.postLearningAssignmentsBulkremove(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LearningApi#postLearningAssignmentsBulkremove");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **List&lt;String&gt;**| The IDs of the learning assignments to be removed | [optional] 
{: class="table-striped"}


### Return type

[**LearningAssignmentBulkRemoveResponse**](LearningAssignmentBulkRemoveResponse.html)

<a name="postLearningModulePublish"></a>

# **postLearningModulePublish**



> [LearningModulePublishResponse](LearningModulePublishResponse.html) postLearningModulePublish(moduleId)

Publish a Learning module



Wraps POST /api/v2/learning/modules/{moduleId}/publish  

Requires ANY permissions: 

* learning:module:publish

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LearningApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LearningApi apiInstance = new LearningApi();
String moduleId = "moduleId_example"; // String | The ID of the learning module
try {
    LearningModulePublishResponse result = apiInstance.postLearningModulePublish(moduleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LearningApi#postLearningModulePublish");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **moduleId** | **String**| The ID of the learning module | 
{: class="table-striped"}


### Return type

[**LearningModulePublishResponse**](LearningModulePublishResponse.html)

<a name="postLearningModules"></a>

# **postLearningModules**



> [LearningModule](LearningModule.html) postLearningModules(body)

Create a new learning module

This will create a new unpublished learning module with the specified fields.

Wraps POST /api/v2/learning/modules  

Requires ANY permissions: 

* learning:module:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LearningApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LearningApi apiInstance = new LearningApi();
LearningModuleRequest body = new LearningModuleRequest(); // LearningModuleRequest | The learning module to be created
try {
    LearningModule result = apiInstance.postLearningModules(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LearningApi#postLearningModules");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**LearningModuleRequest**](LearningModuleRequest.html)| The learning module to be created | 
{: class="table-striped"}


### Return type

[**LearningModule**](LearningModule.html)

<a name="postLearningRulesQuery"></a>

# **postLearningRulesQuery**



> [LearningAssignmentUserListing](LearningAssignmentUserListing.html) postLearningRulesQuery(pageSize, pageNumber, body)

Get users for learning module rule

This will get the users who matches the given rule.

Wraps POST /api/v2/learning/rules/query  

Requires ANY permissions: 

* learning:rule:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LearningApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LearningApi apiInstance = new LearningApi();
Integer pageSize = 50; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
LearningAssignmentUserQuery body = new LearningAssignmentUserQuery(); // LearningAssignmentUserQuery | The learning module rule to fetch users
try {
    LearningAssignmentUserListing result = apiInstance.postLearningRulesQuery(pageSize, pageNumber, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LearningApi#postLearningRulesQuery");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [default to 50] 
| **pageNumber** | **Integer**| Page number | [default to 1] 
| **body** | [**LearningAssignmentUserQuery**](LearningAssignmentUserQuery.html)| The learning module rule to fetch users | 
{: class="table-striped"}


### Return type

[**LearningAssignmentUserListing**](LearningAssignmentUserListing.html)

<a name="putLearningModule"></a>

# **putLearningModule**



> [LearningModule](LearningModule.html) putLearningModule(moduleId, body)

Update a learning module

This will update the name, description, completion time in days and inform steps for a learning module

Wraps PUT /api/v2/learning/modules/{moduleId}  

Requires ANY permissions: 

* learning:module:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LearningApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LearningApi apiInstance = new LearningApi();
String moduleId = "moduleId_example"; // String | The ID of the learning module
LearningModuleRequest body = new LearningModuleRequest(); // LearningModuleRequest | The learning module to be updated
try {
    LearningModule result = apiInstance.putLearningModule(moduleId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LearningApi#putLearningModule");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **moduleId** | **String**| The ID of the learning module | 
| **body** | [**LearningModuleRequest**](LearningModuleRequest.html)| The learning module to be updated | 
{: class="table-striped"}


### Return type

[**LearningModule**](LearningModule.html)

<a name="putLearningModuleRule"></a>

# **putLearningModuleRule**



> [LearningModuleRule](LearningModuleRule.html) putLearningModuleRule(moduleId, body)

Update a learning module rule

This will update a learning module rule with the specified fields.

Wraps PUT /api/v2/learning/modules/{moduleId}/rule  

Requires ANY permissions: 

* learning:rule:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LearningApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LearningApi apiInstance = new LearningApi();
String moduleId = "moduleId_example"; // String | The ID of the learning module
LearningModuleRule body = new LearningModuleRule(); // LearningModuleRule | The learning module rule to be updated
try {
    LearningModuleRule result = apiInstance.putLearningModuleRule(moduleId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LearningApi#putLearningModuleRule");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **moduleId** | **String**| The ID of the learning module | 
| **body** | [**LearningModuleRule**](LearningModuleRule.html)| The learning module rule to be updated | 
{: class="table-striped"}


### Return type

[**LearningModuleRule**](LearningModuleRule.html)

