# BulkUpdateShiftTradeStateResultItem


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) | The state of the shift trade after the update request is processed |  [optional] |
| **reviewedBy** | [**UserReference**](UserReference) | The user who reviewed the request, if applicable. The id may be 'System' if it was an automated process |  [optional] |
| **reviewedDate** | [**Date**](Date) | The date the request was reviewed, if applicable. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **failureReason** | [**FailureReasonEnum**](#Enum--FailureReasonEnum) | The reason the update failed, if applicable |  [optional] |
| **metadata** | [**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata) | Version metadata for the shift trade |  [optional] |


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNMATCHED | &quot;Unmatched&quot; | 
| MATCHED | &quot;Matched&quot; | 
| APPROVED | &quot;Approved&quot; | 
| DENIED | &quot;Denied&quot; | 
| EXPIRED | &quot;Expired&quot; | 
| CANCELED | &quot;Canceled&quot; | 


## Enum: FailureReasonEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INITIATINGAGENTSCHEDULENOTFOUND | &quot;InitiatingAgentScheduleNotFound&quot; | 
| INITIATINGAGENTSHIFTHASEXTERNALACTIVITIES | &quot;InitiatingAgentShiftHasExternalActivities&quot; | 
| INITIATINGAGENTSHIFTNOTFOUND | &quot;InitiatingAgentShiftNotFound&quot; | 
| INITIATINGEXTERNALACTIVITYOUTSIDERECEIVINGSHIFT | &quot;InitiatingExternalActivityOutsideReceivingShift&quot; | 
| RECEIVINGAGENTNOTFOUND | &quot;ReceivingAgentNotFound&quot; | 
| RECEIVINGAGENTSCHEDULENOTFOUND | &quot;ReceivingAgentScheduleNotFound&quot; | 
| RECEIVINGAGENTSHIFTHASEXTERNALACTIVITIES | &quot;ReceivingAgentShiftHasExternalActivities&quot; | 
| RECEIVINGAGENTSHIFTNOTFOUND | &quot;ReceivingAgentShiftNotFound&quot; | 
| RECEIVINGEXTERNALACTIVITYOUTSIDEINITIATINGSHIFT | &quot;ReceivingExternalActivityOutsideInitiatingShift&quot; | 
| SCHEDULENOTPUBLISHED | &quot;ScheduleNotPublished&quot; | 
| TRANSITIONNOTALLOWED | &quot;TransitionNotAllowed&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:235.0.0_
