# TimeOffRequestQueryBody


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **ids** | **List&lt;String&gt;** | The set of ids to filter time off requests |  [optional] |
| **userIds** | **List&lt;String&gt;** | The set of user ids to filter time off requests |  [optional] |
| **statuses** | [**List<StatusesEnum>**](#Enum--StatusesEnum) | The set of statuses to filter time off requests |  [optional] |
| **substatuses** | [**List<SubstatusesEnum>**](#Enum--SubstatusesEnum) | The set of substatuses to filter time off requests |  [optional] |
| **dateRange** | [**DateRange**](DateRange) | The inclusive range of dates to filter time off requests |  [optional] |


## Enum: StatusesEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| PENDING | &quot;PENDING&quot; |


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




_com.mypurecloud.sdk.v2:platform-client-v2:229.1.0_
