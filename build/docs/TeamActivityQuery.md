# TeamActivityQuery


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **metrics** | [**List&lt;TeamActivityQueryMetric&gt;**](TeamActivityQueryMetric) | List of requested metrics |  |
| **groupBy** | [**List<GroupByEnum>**](#Enum--GroupByEnum) | Dimension(s) to group by |  |
| **filter** | [**TeamActivityQueryFilter**](TeamActivityQueryFilter) | Filter to return a subset of observations. Expresses boolean logical predicates as well as dimensional filters |  [optional] |
| **order** | [**OrderEnum**](#Enum--OrderEnum) | Sort the result set in ascending/descending order. Default is ascending |  [optional] |


## Enum: GroupByEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| TEAMID | &quot;teamId&quot; |


## Enum: OrderEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ASC | &quot;asc&quot; | 
| DESC | &quot;desc&quot; | 
| UNORDERED | &quot;unordered&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:236.0.0_
