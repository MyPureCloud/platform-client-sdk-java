# TaskManagementObservationGroupResult


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **queueId** | **String** | The queueId for this group. |  [optional] |
| **typeId** | **String** | The typeId for this group. Present when group includes typeId. |  [optional] |
| **assigneeId** | **String** | The assigneeId for this group. Present when group includes assigneeId. |  [optional] |
| **statusCategory** | [**StatusCategoryEnum**](#Enum--StatusCategoryEnum) | The status category for this group. Present when group includes statusCategory. |  [optional] |


## Enum: StatusCategoryEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| OPEN | &quot;Open&quot; | 
| INPROGRESS | &quot;InProgress&quot; | 
| WAITING | &quot;Waiting&quot; | 
| CLOSED | &quot;Closed&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:261.0.0_
