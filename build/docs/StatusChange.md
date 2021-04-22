---
title: StatusChange
---
## StatusChange


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **dateStatusChanged** | <!----><!---->[**Date**](Date.html)<!----> | The date of this status change. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | The status the change request transitioned to |  [optional] |
| **previousStatus** | [**PreviousStatusEnum**](#PreviousStatusEnum)<!----> | The status the change request transitioned from |  [optional] |
| **message** | <!----><!---->**String**<!----> | A short message describing the status change |  [optional] |
| **changedBy** | <!----><!---->**String**<!----> | If applicable, the user who updated the change request to this status |  [optional] |
| **rejectReason** | [**RejectReasonEnum**](#RejectReasonEnum)<!----> | The reason for rejecting the limit override request |  [optional] |
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| OPEN | &quot;Open&quot; |
| APPROVED | &quot;Approved&quot; |
| IMPLEMENTINGCHANGE | &quot;ImplementingChange&quot; |
| CHANGEIMPLEMENTED | &quot;ChangeImplemented&quot; |
| REJECTED | &quot;Rejected&quot; |
| ROLLBACK | &quot;Rollback&quot; |
| IMPLEMENTINGROLLBACK | &quot;ImplementingRollback&quot; |
| ROLLBACKIMPLEMENTED | &quot;RollbackImplemented&quot; |
{: class="table table-striped"}


<a name="PreviousStatusEnum"></a>

## Enum: PreviousStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| OPEN | &quot;Open&quot; |
| APPROVED | &quot;Approved&quot; |
| IMPLEMENTINGCHANGE | &quot;ImplementingChange&quot; |
| CHANGEIMPLEMENTED | &quot;ChangeImplemented&quot; |
| REJECTED | &quot;Rejected&quot; |
| ROLLBACK | &quot;Rollback&quot; |
| IMPLEMENTINGROLLBACK | &quot;ImplementingRollback&quot; |
| ROLLBACKIMPLEMENTED | &quot;RollbackImplemented&quot; |
{: class="table table-striped"}


<a name="RejectReasonEnum"></a>

## Enum: RejectReasonEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ALTERNATIVEEXISTS | &quot;AlternativeExists&quot; |
| INCREASENOTREQUIRED | &quot;IncreaseNotRequired&quot; |
| PLATFORMMISUSE | &quot;PlatformMisuse&quot; |
| PLATFORMSTABILITY | &quot;PlatformStability&quot; |
| OTHERREASON | &quot;OtherReason&quot; |
{: class="table table-striped"}



