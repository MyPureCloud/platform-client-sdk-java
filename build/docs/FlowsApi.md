---
title: FlowsApi
---
## FlowsApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**getAnalyticsFlowsAggregatesJob**](FlowsApi.html#getAnalyticsFlowsAggregatesJob) | Get status for async query for Flow aggregates |
| [**getAnalyticsFlowsAggregatesJobResults**](FlowsApi.html#getAnalyticsFlowsAggregatesJobResults) | Fetch a page of results for an async aggregates query |
| [**postAnalyticsFlowsActivityQuery**](FlowsApi.html#postAnalyticsFlowsActivityQuery) | Query for flow activity observations |
| [**postAnalyticsFlowsAggregatesJobs**](FlowsApi.html#postAnalyticsFlowsAggregatesJobs) | Query for flow aggregates asynchronously |
| [**postAnalyticsFlowsAggregatesQuery**](FlowsApi.html#postAnalyticsFlowsAggregatesQuery) | Query for flow aggregates |
| [**postAnalyticsFlowsObservationsQuery**](FlowsApi.html#postAnalyticsFlowsObservationsQuery) | Query for flow observations |
{: class="table-striped"}

<a name="getAnalyticsFlowsAggregatesJob"></a>

# **getAnalyticsFlowsAggregatesJob**



> [AsyncQueryStatus](AsyncQueryStatus.html) getAnalyticsFlowsAggregatesJob(jobId)

Get status for async query for Flow aggregates

getAnalyticsFlowsAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/analytics/flows/aggregates/jobs/{jobId}  

Requires ANY permissions: 

* analytics:flowAggregate:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.FlowsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

FlowsApi apiInstance = new FlowsApi();
String jobId = "jobId_example"; // String | jobId
try {
    AsyncQueryStatus result = apiInstance.getAnalyticsFlowsAggregatesJob(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowsApi#getAnalyticsFlowsAggregatesJob");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobId** | **String**| jobId | 
{: class="table-striped"}


### Return type

[**AsyncQueryStatus**](AsyncQueryStatus.html)

<a name="getAnalyticsFlowsAggregatesJobResults"></a>

# **getAnalyticsFlowsAggregatesJobResults**



> [FlowAsyncAggregateQueryResponse](FlowAsyncAggregateQueryResponse.html) getAnalyticsFlowsAggregatesJobResults(jobId, cursor)

Fetch a page of results for an async aggregates query

getAnalyticsFlowsAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/analytics/flows/aggregates/jobs/{jobId}/results  

Requires ANY permissions: 

* analytics:flowAggregate:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.FlowsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

FlowsApi apiInstance = new FlowsApi();
String jobId = "jobId_example"; // String | jobId
String cursor = "cursor_example"; // String | Cursor token to retrieve next page
try {
    FlowAsyncAggregateQueryResponse result = apiInstance.getAnalyticsFlowsAggregatesJobResults(jobId, cursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowsApi#getAnalyticsFlowsAggregatesJobResults");
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

[**FlowAsyncAggregateQueryResponse**](FlowAsyncAggregateQueryResponse.html)

<a name="postAnalyticsFlowsActivityQuery"></a>

# **postAnalyticsFlowsActivityQuery**



> [FlowActivityResponse](FlowActivityResponse.html) postAnalyticsFlowsActivityQuery(body, pageSize, pageNumber)

Query for flow activity observations

postAnalyticsFlowsActivityQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/analytics/flows/activity/query  

Requires ANY permissions: 

* analytics:flowObservation:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.FlowsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

FlowsApi apiInstance = new FlowsApi();
FlowActivityQuery body = new FlowActivityQuery(); // FlowActivityQuery | query
Integer pageSize = 56; // Integer | The desired page size
Integer pageNumber = 56; // Integer | The desired page number
try {
    FlowActivityResponse result = apiInstance.postAnalyticsFlowsActivityQuery(body, pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowsApi#postAnalyticsFlowsActivityQuery");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**FlowActivityQuery**](FlowActivityQuery.html)| query | 
| **pageSize** | **Integer**| The desired page size | [optional] 
| **pageNumber** | **Integer**| The desired page number | [optional] 
{: class="table-striped"}


### Return type

[**FlowActivityResponse**](FlowActivityResponse.html)

<a name="postAnalyticsFlowsAggregatesJobs"></a>

# **postAnalyticsFlowsAggregatesJobs**



> [AsyncQueryResponse](AsyncQueryResponse.html) postAnalyticsFlowsAggregatesJobs(body)

Query for flow aggregates asynchronously

postAnalyticsFlowsAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/analytics/flows/aggregates/jobs  

Requires ANY permissions: 

* analytics:flowAggregate:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.FlowsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

FlowsApi apiInstance = new FlowsApi();
FlowAsyncAggregationQuery body = new FlowAsyncAggregationQuery(); // FlowAsyncAggregationQuery | query
try {
    AsyncQueryResponse result = apiInstance.postAnalyticsFlowsAggregatesJobs(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowsApi#postAnalyticsFlowsAggregatesJobs");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**FlowAsyncAggregationQuery**](FlowAsyncAggregationQuery.html)| query | 
{: class="table-striped"}


### Return type

[**AsyncQueryResponse**](AsyncQueryResponse.html)

<a name="postAnalyticsFlowsAggregatesQuery"></a>

# **postAnalyticsFlowsAggregatesQuery**



> [FlowAggregateQueryResponse](FlowAggregateQueryResponse.html) postAnalyticsFlowsAggregatesQuery(body)

Query for flow aggregates

Wraps POST /api/v2/analytics/flows/aggregates/query  

Requires ANY permissions: 

* analytics:flowAggregate:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.FlowsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

FlowsApi apiInstance = new FlowsApi();
FlowAggregationQuery body = new FlowAggregationQuery(); // FlowAggregationQuery | query
try {
    FlowAggregateQueryResponse result = apiInstance.postAnalyticsFlowsAggregatesQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowsApi#postAnalyticsFlowsAggregatesQuery");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**FlowAggregationQuery**](FlowAggregationQuery.html)| query | 
{: class="table-striped"}


### Return type

[**FlowAggregateQueryResponse**](FlowAggregateQueryResponse.html)

<a name="postAnalyticsFlowsObservationsQuery"></a>

# **postAnalyticsFlowsObservationsQuery**



> [FlowObservationQueryResponse](FlowObservationQueryResponse.html) postAnalyticsFlowsObservationsQuery(body)

Query for flow observations

Wraps POST /api/v2/analytics/flows/observations/query  

Requires ANY permissions: 

* analytics:flowObservation:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.FlowsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

FlowsApi apiInstance = new FlowsApi();
FlowObservationQuery body = new FlowObservationQuery(); // FlowObservationQuery | query
try {
    FlowObservationQueryResponse result = apiInstance.postAnalyticsFlowsObservationsQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowsApi#postAnalyticsFlowsObservationsQuery");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**FlowObservationQuery**](FlowObservationQuery.html)| query | 
{: class="table-striped"}


### Return type

[**FlowObservationQueryResponse**](FlowObservationQueryResponse.html)

