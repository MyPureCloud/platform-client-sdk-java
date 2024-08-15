# WfmBulkShiftTradeStateUpdateNotificationTopicBulkShiftTradeStateUpdateResult


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) |  |  [optional] |
| **reviewedBy** | [**WfmBulkShiftTradeStateUpdateNotificationTopicUserReference**](WfmBulkShiftTradeStateUpdateNotificationTopicUserReference) |  |  [optional] |
| **reviewedDate** | [**Date**](Date) |  |  [optional] |
| **failureReason** | [**FailureReasonEnum**](#Enum--FailureReasonEnum) |  |  [optional] |
| **metadata** | [**WfmBulkShiftTradeStateUpdateNotificationTopicWfmVersionedEntityMetadata**](WfmBulkShiftTradeStateUpdateNotificationTopicWfmVersionedEntityMetadata) |  |  [optional] |
{: class="table table-striped"}


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
{: class="table table-striped"}


## Enum: FailureReasonEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INITIATINGAGENTSCHEDULENOTFOUND | &quot;InitiatingAgentScheduleNotFound&quot; | 
| INITIATINGAGENTSHIFTNOTFOUND | &quot;InitiatingAgentShiftNotFound&quot; | 
| RECEIVINGAGENTNOTFOUND | &quot;ReceivingAgentNotFound&quot; | 
| RECEIVINGAGENTSCHEDULENOTFOUND | &quot;ReceivingAgentScheduleNotFound&quot; | 
| RECEIVINGAGENTSHIFTNOTFOUND | &quot;ReceivingAgentShiftNotFound&quot; | 
| SCHEDULENOTPUBLISHED | &quot;ScheduleNotPublished&quot; | 
| TRANSITIONNOTALLOWED | &quot;TransitionNotAllowed&quot; | 
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:207.0.0_
