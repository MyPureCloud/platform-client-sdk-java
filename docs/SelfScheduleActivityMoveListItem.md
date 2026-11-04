# SelfScheduleActivityMoveListItem


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  |
| **schedule** | [**BuScheduleReference**](BuScheduleReference) | The schedule to which the shift and activity are associated |  |
| **shiftId** | **String** | The ID of the shift to which this activity is associated |  |
| **state** | [**StateEnum**](#Enum--StateEnum) | The state of the self-schedule operation |  |
| **workflowStatus** | [**WorkflowStatusEnum**](#Enum--WorkflowStatusEnum) | The processing status of this self-schedule operation |  [optional] |
| **startDate** | [**Date**](Date) | The original start date of this activity in ISO-8601 format |  |
| **newDate** | [**Date**](Date) | The new start date of this activity in ISO-8601 format |  |
| **lengthMinutes** | **Integer** | The length of this activity in minutes |  |
| **activityCode** | [**ActivityCodeReference**](ActivityCodeReference) | The activity code related to this shift |  |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| APPROVED | &quot;Approved&quot; | 
| DENIED | &quot;Denied&quot; | 
| PENDING | &quot;Pending&quot; | 


## Enum: WorkflowStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ERROR | &quot;Error&quot; | 
| REVIEWING | &quot;Reviewing&quot; | 
| SCHEDULEUPDATED | &quot;ScheduleUpdated&quot; | 
| SCHEDULEUPDATING | &quot;ScheduleUpdating&quot; | 
| WAITINGFORREVIEW | &quot;WaitingForReview&quot; | 
| WAITINGFORSCHEDULEUPDATE | &quot;WaitingForScheduleUpdate&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:267.0.0_
