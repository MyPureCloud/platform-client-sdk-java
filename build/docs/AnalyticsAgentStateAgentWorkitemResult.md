# AnalyticsAgentStateAgentWorkitemResult


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | Workitem Id |  [optional] |
| **queueId** | **String** | The Id of the queue used for routing the workitem |  [optional] |
| **divisionId** | **String** | The Id of the division the workitem belongs to |  [optional] |
| **typeId** | **String** | The Id of the worktype of the workitem |  [optional] |
| **workbinId** | **String** | The Id of the workbin the workitem is placed in |  [optional] |
| **dateDue** | [**Date**](Date) | Due datetime of the workitem. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateExpires** | [**Date**](Date) | Expiry datetime of the workitem. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **statusId** | **String** | The Id of the current status of the workitem |  [optional] |
| **statusCategory** | [**StatusCategoryEnum**](#Enum--StatusCategoryEnum) | The category of the current status of the workitem |  [optional] |
| **dateStatusChanged** | [**Date**](Date) | Datetime the status of the workitem last changed. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **priority** | **Integer** | Priority of the workitem |  [optional] |
| **assignmentState** | [**AssignmentStateEnum**](#Enum--AssignmentStateEnum) | Assignment state of the workitem |  [optional] |
| **dateAssignmentStateChanged** | [**Date**](Date) | Datetime the assignment state of the workitem last changed. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateCreated** | [**Date**](Date) | Creation datetime of the workitem. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |


## Enum: StatusCategoryEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| OPEN | &quot;Open&quot; | 
| INPROGRESS | &quot;InProgress&quot; | 
| WAITING | &quot;Waiting&quot; | 
| CLOSED | &quot;Closed&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 


## Enum: AssignmentStateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| ACDSTARTED | &quot;AcdStarted&quot; | 
| ALERTING | &quot;Alerting&quot; | 
| ALERTTIMEOUT | &quot;AlertTimeout&quot; | 
| ACDCANCELLED | &quot;AcdCancelled&quot; | 
| TERMINATED | &quot;Terminated&quot; | 
| IDLE | &quot;Idle&quot; | 
| DECLINED | &quot;Declined&quot; | 
| CONNECTED | &quot;Connected&quot; | 
| DISCONNECTED | &quot;Disconnected&quot; | 
| PARKED | &quot;Parked&quot; | 
| HELD | &quot;Held&quot; | 
| ACDEXPIRED | &quot;AcdExpired&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:267.0.0_
