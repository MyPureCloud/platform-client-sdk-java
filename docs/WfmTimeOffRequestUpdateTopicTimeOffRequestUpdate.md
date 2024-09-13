# WfmTimeOffRequestUpdateTopicTimeOffRequestUpdate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **user** | [**WfmTimeOffRequestUpdateTopicUserReference**](WfmTimeOffRequestUpdateTopicUserReference) |  |  [optional] |
| **isFullDayRequest** | **Boolean** |  |  [optional] |
| **markedAsRead** | **Boolean** |  |  [optional] |
| **activityCodeId** | **String** |  |  [optional] |
| **paid** | **Boolean** |  |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) |  |  [optional] |
| **substatus** | [**SubstatusEnum**](#Enum--SubstatusEnum) |  |  [optional] |
| **partialDayStartDateTimes** | **List&lt;String&gt;** |  |  [optional] |
| **fullDayManagementUnitDates** | **List&lt;String&gt;** |  |  [optional] |
| **dailyDurationMinutes** | **Integer** |  |  [optional] |
| **notes** | **String** |  |  [optional] |
| **reviewedDate** | **String** |  |  [optional] |
| **reviewedBy** | **String** |  |  [optional] |
| **submittedDate** | **String** |  |  [optional] |
| **submittedBy** | **String** |  |  [optional] |
| **modifiedDate** | **String** |  |  [optional] |
| **modifiedBy** | **String** |  |  [optional] |


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
| INSUFFICIENTBALANCE | &quot;InsufficientBalance&quot; | 
| INVALIDDAILYDURATION | &quot;InvalidDailyDuration&quot; | 
| OUTSIDESHIFT | &quot;OutsideShift&quot; | 
| OVERLAPSRESTRICTEDACTIVITYCODE | &quot;OverlapsRestrictedActivityCode&quot; | 
| REMOVEDFROMWAITLIST | &quot;RemovedFromWaitlist&quot; | 
| WAITLISTED | &quot;Waitlisted&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:209.0.1_
