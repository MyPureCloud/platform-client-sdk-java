---
title: JourneyApi
---
## JourneyApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**postAnalyticsJourneysAggregatesQuery**](JourneyApi.html#postAnalyticsJourneysAggregatesQuery) | Query for journey aggregates |
{: class="table-striped"}

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

