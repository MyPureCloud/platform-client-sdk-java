---
title: UserDetailsQuery
---
## UserDetailsQuery


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **interval** | <!----><!---->**String**<!----> | Specifies the date and time range of data being queried. Conversations MUST have started within this time range to potentially be included within the result set. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss |  |
| **userFilters** | <!----><!---->[**List&lt;UserDetailQueryFilter&gt;**](UserDetailQueryFilter.html)<!----> | Filters that target the users to retrieve data for |  [optional] |
| **presenceFilters** | <!----><!---->[**List&lt;PresenceDetailQueryFilter&gt;**](PresenceDetailQueryFilter.html)<!----> | Filters that target system and organization presence-level data |  [optional] |
| **routingStatusFilters** | <!----><!---->[**List&lt;RoutingStatusDetailQueryFilter&gt;**](RoutingStatusDetailQueryFilter.html)<!----> | Filters that target agent routing status-level data |  [optional] |
| **order** | [**OrderEnum**](#OrderEnum)<!----> | Sort the result set in ascending/descending order. Default is ascending |  [optional] |
| **presenceAggregations** | <!----><!---->[**List&lt;AnalyticsQueryAggregation&gt;**](AnalyticsQueryAggregation.html)<!----> | Include faceted search and aggregate roll-ups of presence data in your search results. This does not function as a filter, but rather, summary data about the presence results matching your filters |  [optional] |
| **routingStatusAggregations** | <!----><!---->[**List&lt;AnalyticsQueryAggregation&gt;**](AnalyticsQueryAggregation.html)<!----> | Include faceted search and aggregate roll-ups of agent routing status data in your search results. This does not function as a filter, but rather, summary data about the agent routing status results matching your filters |  [optional] |
| **paging** | <!----><!---->[**PagingSpec**](PagingSpec.html)<!----> | Page size and number to control iterating through large result sets. Default page size is 25 |  [optional] |
{: class="table table-striped"}


<a name="OrderEnum"></a>

## Enum: OrderEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ASC | &quot;asc&quot; | 
| DESC | &quot;desc&quot; | 
{: class="table table-striped"}



