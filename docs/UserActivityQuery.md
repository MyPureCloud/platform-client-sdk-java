# UserActivityQuery


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **metrics** | [**List&lt;UserActivityQueryMetric&gt;**](UserActivityQueryMetric) | List of requested metrics |  |
| **groupBy** | [**List<GroupByEnum>**](#Enum--GroupByEnum) | Dimension(s) to group by |  |
| **filter** | [**UserActivityQueryFilter**](UserActivityQueryFilter) | Filter to return a subset of observations. Expresses boolean logical predicates as well as dimensional filters |  [optional] |
| **order** | [**OrderEnum**](#Enum--OrderEnum) | Sort the result set in ascending/descending order. Default is ascending |  [optional] |


## Enum: GroupByEnum

| Name | Value |
| ---- | ----- |
| USERID | &quot;userId&quot; |


## Enum: OrderEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ASC | &quot;asc&quot; | 
| DESC | &quot;desc&quot; | 
| UNORDERED | &quot;unordered&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:217.0.0_
