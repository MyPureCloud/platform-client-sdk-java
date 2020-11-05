---
title: JourneyApi
---
## JourneyApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**getJourneyActiontarget**](JourneyApi.html#getJourneyActiontarget) | Retrieve a single action target. |
| [**getJourneyActiontargets**](JourneyApi.html#getJourneyActiontargets) | Retrieve all action targets. |
| [**getJourneyCustomerCustomerIdSegments**](JourneyApi.html#getJourneyCustomerCustomerIdSegments) | Retrieve segment assignments by customer ID. |
| [**getJourneyExternalcontactSegments**](JourneyApi.html#getJourneyExternalcontactSegments) | Retrieve segment assignments by external contact ID. |
| [**getJourneySessionSegments**](JourneyApi.html#getJourneySessionSegments) | Retrieve segment assignments by session ID. |
| [**patchJourneyActiontarget**](JourneyApi.html#patchJourneyActiontarget) | Update a single action target. |
| [**postAnalyticsJourneysAggregatesQuery**](JourneyApi.html#postAnalyticsJourneysAggregatesQuery) | Query for journey aggregates |
| [**postJourneyExternalcontactSegments**](JourneyApi.html#postJourneyExternalcontactSegments) | Assign/Unassign a segment to/from an external contact or, if a segment is already assigned, update the expiry date of the segment assignment. |
{: class="table-striped"}

<a name="getJourneyActiontarget"></a>

# **getJourneyActiontarget**



> [ActionTarget](ActionTarget.html) getJourneyActiontarget(actionTargetId)

Retrieve a single action target.



Wraps GET /api/v2/journey/actiontargets/{actionTargetId}  

Requires ANY permissions: 

* journey:actiontarget:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.JourneyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

JourneyApi apiInstance = new JourneyApi();
String actionTargetId = "actionTargetId_example"; // String | ID of the action target.
try {
    ActionTarget result = apiInstance.getJourneyActiontarget(actionTargetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#getJourneyActiontarget");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionTargetId** | **String**| ID of the action target. | 
{: class="table-striped"}


### Return type

[**ActionTarget**](ActionTarget.html)

<a name="getJourneyActiontargets"></a>

# **getJourneyActiontargets**



> [ActionTargetListing](ActionTargetListing.html) getJourneyActiontargets(pageNumber, pageSize)

Retrieve all action targets.



Wraps GET /api/v2/journey/actiontargets  

Requires ANY permissions: 

* journey:actiontarget:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.JourneyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

JourneyApi apiInstance = new JourneyApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
try {
    ActionTargetListing result = apiInstance.getJourneyActiontargets(pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#getJourneyActiontargets");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
{: class="table-striped"}


### Return type

[**ActionTargetListing**](ActionTargetListing.html)

<a name="getJourneyCustomerCustomerIdSegments"></a>

# **getJourneyCustomerCustomerIdSegments**



> [SegmentAssignmentListing](SegmentAssignmentListing.html) getJourneyCustomerCustomerIdSegments(customerIdType, customerId, pageSize, after, segmentScope, assignmentState)

Retrieve segment assignments by customer ID.



Wraps GET /api/v2/journey/customers/{customerIdType}/{customerId}/segments  

Requires ANY permissions: 

* journey:segmentassignment:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.JourneyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

JourneyApi apiInstance = new JourneyApi();
String customerIdType = "customerIdType_example"; // String | Type of ID used to identify customer (e.g. email, cookie, and phone).
String customerId = "customerId_example"; // String | Primary identifier of the customer to query for segment assignments.
String pageSize = "pageSize_example"; // String | Number of entities to return. Maximum of 200.
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned.
String segmentScope = "segmentScope_example"; // String | Scope to filter on. If not specified, both session-scoped and customer-scoped assignments are returned.
String assignmentState = "assignmentState_example"; // String | Assignment state to filter on. If not specified, both assigned and unassigned assignments are returned.
try {
    SegmentAssignmentListing result = apiInstance.getJourneyCustomerCustomerIdSegments(customerIdType, customerId, pageSize, after, segmentScope, assignmentState);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#getJourneyCustomerCustomerIdSegments");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **customerIdType** | **String**| Type of ID used to identify customer (e.g. email, cookie, and phone). | 
| **customerId** | **String**| Primary identifier of the customer to query for segment assignments. | 
| **pageSize** | **String**| Number of entities to return. Maximum of 200. | [optional] 
| **after** | **String**| The cursor that points to the end of the set of entities that has been returned. | [optional] 
| **segmentScope** | **String**| Scope to filter on. If not specified, both session-scoped and customer-scoped assignments are returned. | [optional]<br />**Values**: Session, Customer 
| **assignmentState** | **String**| Assignment state to filter on. If not specified, both assigned and unassigned assignments are returned. | [optional]<br />**Values**: Assigned, Unassigned 
{: class="table-striped"}


### Return type

[**SegmentAssignmentListing**](SegmentAssignmentListing.html)

<a name="getJourneyExternalcontactSegments"></a>

# **getJourneyExternalcontactSegments**



> [SegmentAssignmentListing](SegmentAssignmentListing.html) getJourneyExternalcontactSegments(externalContactId, pageSize, after, segmentScope, assignmentState)

Retrieve segment assignments by external contact ID.



Wraps GET /api/v2/journey/externalcontacts/{externalContactId}/segments  

Requires ANY permissions: 

* journey:segmentassignment:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.JourneyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

JourneyApi apiInstance = new JourneyApi();
String externalContactId = "externalContactId_example"; // String | ID of the external contact to query for segment assignments.
String pageSize = "pageSize_example"; // String | Number of entities to return. Maximum of 200.
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned.
String segmentScope = "segmentScope_example"; // String | Scope to filter on. If not specified, both session-scoped and customer-scoped assignments are returned.
String assignmentState = "assignmentState_example"; // String | Assignment state to filter on. If not specified, both assigned and unassigned assignments are returned.
try {
    SegmentAssignmentListing result = apiInstance.getJourneyExternalcontactSegments(externalContactId, pageSize, after, segmentScope, assignmentState);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#getJourneyExternalcontactSegments");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **externalContactId** | **String**| ID of the external contact to query for segment assignments. | 
| **pageSize** | **String**| Number of entities to return. Maximum of 200. | [optional] 
| **after** | **String**| The cursor that points to the end of the set of entities that has been returned. | [optional] 
| **segmentScope** | **String**| Scope to filter on. If not specified, both session-scoped and customer-scoped assignments are returned. | [optional]<br />**Values**: Session, Customer 
| **assignmentState** | **String**| Assignment state to filter on. If not specified, both assigned and unassigned assignments are returned. | [optional]<br />**Values**: Assigned, Unassigned 
{: class="table-striped"}


### Return type

[**SegmentAssignmentListing**](SegmentAssignmentListing.html)

<a name="getJourneySessionSegments"></a>

# **getJourneySessionSegments**



> [SegmentAssignmentListing](SegmentAssignmentListing.html) getJourneySessionSegments(sessionId, pageSize, after, segmentScope, assignmentState)

Retrieve segment assignments by session ID.



Wraps GET /api/v2/journey/sessions/{sessionId}/segments  

Requires ANY permissions: 

* journey:segmentassignment:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.JourneyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

JourneyApi apiInstance = new JourneyApi();
String sessionId = "sessionId_example"; // String | ID of the session to query for segment assignments.
String pageSize = "pageSize_example"; // String | Number of entities to return. Maximum of 200.
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned.
String segmentScope = "segmentScope_example"; // String | Scope to filter on. If not specified, both session-scoped and customer-scoped assignments are returned.
String assignmentState = "assignmentState_example"; // String | Assignment state to filter on. If not specified, both assigned and unassigned assignments are returned.
try {
    SegmentAssignmentListing result = apiInstance.getJourneySessionSegments(sessionId, pageSize, after, segmentScope, assignmentState);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#getJourneySessionSegments");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sessionId** | **String**| ID of the session to query for segment assignments. | 
| **pageSize** | **String**| Number of entities to return. Maximum of 200. | [optional] 
| **after** | **String**| The cursor that points to the end of the set of entities that has been returned. | [optional] 
| **segmentScope** | **String**| Scope to filter on. If not specified, both session-scoped and customer-scoped assignments are returned. | [optional]<br />**Values**: Session, Customer 
| **assignmentState** | **String**| Assignment state to filter on. If not specified, both assigned and unassigned assignments are returned. | [optional]<br />**Values**: Assigned, Unassigned 
{: class="table-striped"}


### Return type

[**SegmentAssignmentListing**](SegmentAssignmentListing.html)

<a name="patchJourneyActiontarget"></a>

# **patchJourneyActiontarget**



> [ActionTarget](ActionTarget.html) patchJourneyActiontarget(actionTargetId, body)

Update a single action target.



Wraps PATCH /api/v2/journey/actiontargets/{actionTargetId}  

Requires ANY permissions: 

* journey:actiontarget:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.JourneyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

JourneyApi apiInstance = new JourneyApi();
String actionTargetId = "actionTargetId_example"; // String | ID of the action target.
PatchActionTarget body = new PatchActionTarget(); // PatchActionTarget | 
try {
    ActionTarget result = apiInstance.patchJourneyActiontarget(actionTargetId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#patchJourneyActiontarget");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionTargetId** | **String**| ID of the action target. | 
| **body** | [**PatchActionTarget**](PatchActionTarget.html)|  | [optional] 
{: class="table-striped"}


### Return type

[**ActionTarget**](ActionTarget.html)

<a name="postAnalyticsJourneysAggregatesQuery"></a>

# **postAnalyticsJourneysAggregatesQuery**



> [JourneyAggregateQueryResponse](JourneyAggregateQueryResponse.html) postAnalyticsJourneysAggregatesQuery(body)

Query for journey aggregates



Wraps POST /api/v2/analytics/journeys/aggregates/query  

Requires ANY permissions: 

* analytics:journeyAggregate:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.JourneyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

JourneyApi apiInstance = new JourneyApi();
JourneyAggregationQuery body = new JourneyAggregationQuery(); // JourneyAggregationQuery | query
try {
    JourneyAggregateQueryResponse result = apiInstance.postAnalyticsJourneysAggregatesQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#postAnalyticsJourneysAggregatesQuery");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**JourneyAggregationQuery**](JourneyAggregationQuery.html)| query | 
{: class="table-striped"}


### Return type

[**JourneyAggregateQueryResponse**](JourneyAggregateQueryResponse.html)

<a name="postJourneyExternalcontactSegments"></a>

# **postJourneyExternalcontactSegments**



> Void postJourneyExternalcontactSegments(externalContactId, body)

Assign/Unassign a segment to/from an external contact or, if a segment is already assigned, update the expiry date of the segment assignment.



Wraps POST /api/v2/journey/externalcontacts/{externalContactId}/segments  

Requires ANY permissions: 

* journey:segmentassignment:add
* journey:segmentassignment:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.JourneyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

JourneyApi apiInstance = new JourneyApi();
String externalContactId = "externalContactId_example"; // String | ID of the external contact to query for segment assignments.
List<SegmentAssignmentsUpdate> body = Arrays.asList(new SegmentAssignmentsUpdate()); // List<SegmentAssignmentsUpdate> | 
try {
    apiInstance.postJourneyExternalcontactSegments(externalContactId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#postJourneyExternalcontactSegments");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **externalContactId** | **String**| ID of the external contact to query for segment assignments. | 
| **body** | [**List&lt;SegmentAssignmentsUpdate&gt;**](SegmentAssignmentsUpdate.html)|  | [optional] 
{: class="table-striped"}


### Return type

null (empty response body)

