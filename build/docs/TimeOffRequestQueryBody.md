# TimeOffRequestQueryBody


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **ids** | **List&lt;String&gt;** | The set of ids to filter time off requests |  [optional] |
| **userIds** | **List&lt;String&gt;** | The set of user ids to filter time off requests. Omit to query all users in the management unit. Note: If teamIds is also specified, only time off requests for users in the requested teams will be returned |  [optional] |
| **statuses** | [**List<StatusesEnum>**](#Enum--StatusesEnum) | The set of statuses to filter time off requests |  [optional] |
| **substatuses** | [**List<SubstatusesEnum>**](#Enum--SubstatusesEnum) | The set of substatuses to filter time off requests |  [optional] |
| **dateRange** | [**DateRange**](DateRange) | The inclusive range of dates to filter time off requests |  [optional] |
| **teamIds** | **List&lt;String&gt;** | The IDs of work teams to query. If null or not set, results will be queried for requested users if applicable or otherwise all users in the management unit |  [optional] |


## Enum: StatusesEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| PENDING | &quot;PENDING&quot; |
| APPROVED | &quot;APPROVED&quot; |
| DENIED | &quot;DENIED&quot; |
| CANCELED | &quot;CANCELED&quot; |


## Enum: SubstatusesEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ADVANCETIMEELAPSED | &quot;AdvanceTimeElapsed&quot; |
| AUTOAPPROVED | &quot;AutoApproved&quot; |
| BLOCKEDDATE | &quot;BlockedDate&quot; |
| INSUFFICIENTBALANCE | &quot;InsufficientBalance&quot; |
| INVALIDDAILYDURATION | &quot;InvalidDailyDuration&quot; |
| MANUALAPPROVAL | &quot;ManualApproval&quot; |
| OUTSIDESHIFT | &quot;OutsideShift&quot; |
| OVERLAPSRESTRICTEDACTIVITYCODE | &quot;OverlapsRestrictedActivityCode&quot; |
| REMOVEDFROMWAITLIST | &quot;RemovedFromWaitlist&quot; |
| REVIEWDATE | &quot;ReviewDate&quot; |
| WAITLISTED | &quot;Waitlisted&quot; |




_com.mypurecloud.sdk.v2:platform-client-v2:263.0.0_
