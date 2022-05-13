---
title: WfmBulkShiftTradeStateUpdateNotificationTopicBulkShiftTradeStateUpdateResult
---
## WfmBulkShiftTradeStateUpdateNotificationTopicBulkShiftTradeStateUpdateResult


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> |  |  [optional] |
| **state** | [**StateEnum**](#StateEnum)<!----> |  |  [optional] |
| **reviewedBy** | <!----><!---->[**WfmBulkShiftTradeStateUpdateNotificationTopicUserReference**](WfmBulkShiftTradeStateUpdateNotificationTopicUserReference.html)<!----> |  |  [optional] |
| **reviewedDate** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **failureReason** | [**FailureReasonEnum**](#FailureReasonEnum)<!----> |  |  [optional] |
| **metadata** | <!----><!---->[**WfmBulkShiftTradeStateUpdateNotificationTopicWfmVersionedEntityMetadata**](WfmBulkShiftTradeStateUpdateNotificationTopicWfmVersionedEntityMetadata.html)<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="StateEnum"></a>

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


<a name="FailureReasonEnum"></a>

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



