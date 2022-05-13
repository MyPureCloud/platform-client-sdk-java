---
title: BulkUpdateShiftTradeStateResultItem
---
## BulkUpdateShiftTradeStateResultItem


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **state** | [**StateEnum**](#StateEnum)<!----> | The state of the shift trade after the update request is processed |  [optional] |
| **reviewedBy** | <!----><!---->[**UserReference**](UserReference.html)<!----> | The user who reviewed the request, if applicable |  [optional] |
| **reviewedDate** | <!----><!---->[**Date**](Date.html)<!----> | The date the request was reviewed, if applicable. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **failureReason** | [**FailureReasonEnum**](#FailureReasonEnum)<!----> | The reason the update failed, if applicable |  [optional] |
| **metadata** | <!----><!---->[**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata.html)<!----> | Version metadata for the shift trade |  [optional] |
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
| INITIATINGAGENTSHIFTHASEXTERNALACTIVITIES | &quot;InitiatingAgentShiftHasExternalActivities&quot; | 
| INITIATINGAGENTSHIFTNOTFOUND | &quot;InitiatingAgentShiftNotFound&quot; | 
| RECEIVINGAGENTNOTFOUND | &quot;ReceivingAgentNotFound&quot; | 
| RECEIVINGAGENTSCHEDULENOTFOUND | &quot;ReceivingAgentScheduleNotFound&quot; | 
| RECEIVINGAGENTSHIFTHASEXTERNALACTIVITIES | &quot;ReceivingAgentShiftHasExternalActivities&quot; | 
| RECEIVINGAGENTSHIFTNOTFOUND | &quot;ReceivingAgentShiftNotFound&quot; | 
| SCHEDULENOTPUBLISHED | &quot;ScheduleNotPublished&quot; | 
| TRANSITIONNOTALLOWED | &quot;TransitionNotAllowed&quot; | 
{: class="table table-striped"}



