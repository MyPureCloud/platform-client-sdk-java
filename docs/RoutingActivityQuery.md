# RoutingActivityQuery


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **metrics** | [**List&lt;RoutingActivityQueryMetric&gt;**](RoutingActivityQueryMetric) | List of requested metrics |  |
| **groupBy** | [**List<GroupByEnum>**](#Enum--GroupByEnum) | Dimension(s) to group by |  |
| **filter** | [**RoutingActivityQueryFilter**](RoutingActivityQueryFilter) | Filter to return a subset of observations. Expresses boolean logical predicates as well as dimensional filters |  [optional] |
| **order** | [**OrderEnum**](#Enum--OrderEnum) | Sort the result set in ascending/descending order. Default is ascending |  [optional] |


## Enum: GroupByEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| QUEUEID | &quot;queueId&quot; |


## Enum: OrderEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ASC | &quot;asc&quot; | 
| DESC | &quot;desc&quot; | 
| UNORDERED | &quot;unordered&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:229.1.0_
