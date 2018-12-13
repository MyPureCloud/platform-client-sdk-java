---
title: FlowsApi
---
## FlowsApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**postAnalyticsFlowsAggregatesQuery**](FlowsApi.html#postAnalyticsFlowsAggregatesQuery) | Query for flow aggregates |
{: class="table table-striped"}

<a name="postAnalyticsFlowsAggregatesQuery"></a>

# **postAnalyticsFlowsAggregatesQuery**



> [AggregateQueryResponse](AggregateQueryResponse.html) postAnalyticsFlowsAggregatesQuery(body)

Query for flow aggregates



Wraps POST /api/v2/analytics/flows/aggregates/query  

Requires ANY permissions: 

* analytics:flowAggregate:view

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.FlowsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud OAuth
OAuth PureCloud OAuth = (OAuth) defaultClient.getAuthentication("PureCloud OAuth");
PureCloud OAuth.setAccessToken("YOUR ACCESS TOKEN");

FlowsApi apiInstance = new FlowsApi();
AggregationQuery body = new AggregationQuery(); // AggregationQuery | query
try {
    AggregateQueryResponse result = apiInstance.postAnalyticsFlowsAggregatesQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowsApi#postAnalyticsFlowsAggregatesQuery");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**AggregationQuery**](AggregationQuery.html)| query | |
{: class="table table-striped"}

### Return type

[**AggregateQueryResponse**](AggregateQueryResponse.html)

