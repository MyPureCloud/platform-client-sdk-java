# TaskManagementObservationQuery


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **groupBy** | [**List<GroupByEnum>**](#Enum--GroupByEnum) | Dimension(s) to group by. Determines how the results will be grouped in the response. |  |
| **metrics** | [**List&lt;TaskManagementQueryMetric&gt;**](TaskManagementQueryMetric) | List of metrics to be retrieved. Specifies which observational metrics should be included in the response. |  |
| **filter** | [**TaskManagementObservationQueryFilter**](TaskManagementObservationQueryFilter) | Filter to return a subset of observations. |  |
| **expands** | [**List<ExpandsEnum>**](#Enum--ExpandsEnum) | List of properties to expand. Additional details about the objects returned in the results will be included in the response if supplied. |  [optional] |


## Enum: GroupByEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| QUEUEID | &quot;queueId&quot; |
| TYPEID | &quot;typeId&quot; |
| ASSIGNEEID | &quot;assigneeId&quot; |
| STATUSCATEGORY | &quot;statusCategory&quot; |


## Enum: ExpandsEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| TYPE | &quot;type&quot; |
| ASSIGNEE | &quot;assignee&quot; |




_com.mypurecloud.sdk.v2:platform-client-v2:258.0.0_
