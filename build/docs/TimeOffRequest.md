---
title: TimeOffRequest
---
## TimeOffRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The id of the time off request |  |
| **user** | <!----><!---->[**UserReference**](UserReference.html)<!----> | The user that the time off request belongs to |  |
| **isFullDayRequest** | <!----><!---->**Boolean**<!----> | Whether this is a full day request (false means partial day) |  [optional] |
| **markedAsRead** | <!----><!---->**Boolean**<!----> | Whether this request has been marked as read by the agent |  [optional] |
| **activityCodeId** | <!----><!---->**String**<!----> | The ID of the activity code associated with this time off request. Activity code must be of the TimeOff category |  [optional] |
| **paid** | <!----><!---->**Boolean**<!----> | Whether this is a paid time off request |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | The status of this time off request |  [optional] |
| **substatus** | [**SubstatusEnum**](#SubstatusEnum)<!----> | The substatus of this time off request |  [optional] |
| **partialDayStartDateTimes** | <!----><!---->[**List&lt;Date&gt;**](Date.html)<!----> | A set of start date-times in ISO-8601 format for partial day requests.  Will be not empty if isFullDayRequest == false |  [optional] |
| **fullDayManagementUnitDates** | <!----><!---->**List&lt;String&gt;**<!----> | A set of dates in yyyy-MM-dd format.  Should be interpreted in the management unit's configured time zone.  Will be not empty if isFullDayRequest == true |  [optional] |
| **dailyDurationMinutes** | <!----><!---->**Integer**<!----> | The daily duration of this time off request in minutes |  [optional] |
| **notes** | <!----><!---->**String**<!----> | Notes about the time off request |  [optional] |
| **submittedBy** | <!----><!---->[**UserReference**](UserReference.html)<!----> | The user who submitted this time off request |  [optional] |
| **submittedDate** | <!----><!---->[**Date**](Date.html)<!----> | The timestamp when this request was submitted. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **reviewedBy** | <!----><!---->[**UserReference**](UserReference.html)<!----> | The user who reviewed this time off request |  [optional] |
| **reviewedDate** | <!----><!---->[**Date**](Date.html)<!----> | The timestamp when this request was reviewed. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **metadata** | <!----><!---->[**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata.html)<!----> | The version metadata of the time off request |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PENDING | &quot;PENDING&quot; | 
| APPROVED | &quot;APPROVED&quot; | 
| DENIED | &quot;DENIED&quot; | 
| CANCELED | &quot;CANCELED&quot; | 
{: class="table table-striped"}


<a name="SubstatusEnum"></a>

## Enum: SubstatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ADVANCETIMEELAPSED | &quot;AdvanceTimeElapsed&quot; | 
| AUTOAPPROVED | &quot;AutoApproved&quot; | 
| INSUFFICIENTBALANCE | &quot;InsufficientBalance&quot; | 
| INVALIDDAILYDURATION | &quot;InvalidDailyDuration&quot; | 
| OUTSIDESHIFT | &quot;OutsideShift&quot; | 
| REMOVEDFROMWAITLIST | &quot;RemovedFromWaitlist&quot; | 
| WAITLISTED | &quot;Waitlisted&quot; | 
{: class="table table-striped"}



