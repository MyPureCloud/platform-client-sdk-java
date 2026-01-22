# TimeOffRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The id of the time off request |  |
| **user** | [**UserReference**](UserReference) | The user that the time off request belongs to |  |
| **isFullDayRequest** | **Boolean** | Whether this is a full day request (false means partial day) |  [optional] |
| **markedAsRead** | **Boolean** | Whether this request has been marked as read by the agent |  [optional] |
| **activityCodeId** | **String** | The ID of the activity code associated with this time off request. Activity code must be of the TimeOff category |  [optional] |
| **paid** | **Boolean** | Whether this is a paid time off request |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The status of this time off request |  [optional] |
| **substatus** | [**SubstatusEnum**](#Enum--SubstatusEnum) | The substatus of this time off request |  [optional] |
| **partialDayStartDateTimes** | [**List&lt;Date&gt;**](Date) | A set of start date-times in ISO-8601 format for partial day requests.  Will be not empty if isFullDayRequest == false |  [optional] |
| **fullDayManagementUnitDates** | **List&lt;String&gt;** | A set of dates in yyyy-MM-dd format.  Should be interpreted in the management unit's configured time zone.  Will be not empty if isFullDayRequest == true |  [optional] |
| **dailyDurationMinutes** | **Integer** | The daily duration of this time off request in minutes |  [optional] |
| **durationMinutes** | **List&lt;Integer&gt;** | Daily durations for each day of this time off request in minutes |  [optional] |
| **payableMinutes** | **List&lt;Integer&gt;** | Payable minutes for each day of this time off request |  [optional] |
| **notes** | **String** | Notes about the time off request |  [optional] |
| **submittedBy** | [**UserReference**](UserReference) | The user who submitted this time off request. The id may be 'System' if it was an automated process |  [optional] |
| **submittedDate** | [**Date**](Date) | The timestamp when this request was submitted. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **reviewedBy** | [**UserReference**](UserReference) | The user who reviewed this time off request. The id may be 'System' if it was an automated process |  [optional] |
| **reviewedDate** | [**Date**](Date) | The timestamp when this request was reviewed. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **syncVersion** | **Integer** | The sync version of this time off request for which the scheduled activity is associated |  [optional] |
| **metadata** | [**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata) | The version metadata of the time off request |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PENDING | &quot;PENDING&quot; | 
| APPROVED | &quot;APPROVED&quot; | 
| DENIED | &quot;DENIED&quot; | 
| CANCELED | &quot;CANCELED&quot; | 


## Enum: SubstatusEnum

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




_com.mypurecloud.sdk.v2:platform-client-v2:245.0.0_
