---
title: LimitChangeRequestDetails
---
## LimitChangeRequestDetails


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **key** | <!----><!---->**String**<!----> | Limit key to be overridden (see https://developer.mypurecloud.com/api/rest/v2/organization/limits.html#available_limits) |  |
| **namespace** | <!----><!---->**String**<!----> | Namespace the key belongs to (see https://developer.mypurecloud.com/api/rest/v2/organization/limits.html#available_limits) |  |
| **requestedValue** | <!----><!---->**Double**<!----> | Requested limit value for a given key |  |
| **description** | <!----><!---->**String**<!----> | Description of the need for the limit change request |  |
| **supportCaseUrl** | <!----><!---->**String**<!----> | The support case url created by Care |  |
| **createdBy** | <!----><!---->**String**<!----> | The user who created the change request |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | Current status of the limit change request |  [optional] |
| **currentValue** | <!----><!---->**Double**<!----> | Current limit value for a given key |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | The date of the limit change request creation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **statusHistory** | <!----><!---->[**List&lt;StatusChange&gt;**](StatusChange.html)<!----> | List of statuses that a limit change request has gone through |  [optional] |
| **dateCompleted** | <!----><!---->[**Date**](Date.html)<!----> | The date of the limit change request completion (ChangeImplemented, Rejected, or RollbackImplemented. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **lastChangedBy** | <!----><!---->**String**<!----> | The user who last updated the status of the limit change request |  [optional] |
| **rejectReason** | [**RejectReasonEnum**](#RejectReasonEnum)<!----> | The reason for rejecting the limit override request |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
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



