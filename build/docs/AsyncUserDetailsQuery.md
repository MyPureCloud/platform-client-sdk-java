---
title: AsyncUserDetailsQuery
---
## AsyncUserDetailsQuery


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **interval** | <!----><!---->**String**<!----> | Specifies the date and time range of data being queried. Conversations MUST have started within this time range to potentially be included within the result set. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss |  |
| **userFilters** | <!----><!---->[**List&lt;UserDetailQueryFilter&gt;**](UserDetailQueryFilter.html)<!----> | Filters that target the users to retrieve data for |  [optional] |
| **presenceFilters** | <!----><!---->[**List&lt;PresenceDetailQueryFilter&gt;**](PresenceDetailQueryFilter.html)<!----> | Filters that target system and organization presence-level data |  [optional] |
| **routingStatusFilters** | <!----><!---->[**List&lt;RoutingStatusDetailQueryFilter&gt;**](RoutingStatusDetailQueryFilter.html)<!----> | Filters that target agent routing status-level data |  [optional] |
| **order** | [**OrderEnum**](#OrderEnum)<!----> | Sort the result set in ascending/descending order. Default is ascending |  [optional] |
| **limit** | <!----><!---->**Integer**<!----> | Specify number of results to be returned |  [optional] |
{: class="table table-striped"}


<a name="OrderEnum"></a>

## Enum: OrderEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ASC | &quot;asc&quot; | 
| DESC | &quot;desc&quot; | 
{: class="table table-striped"}



