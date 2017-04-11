---
title: TimeOffRequest
---
## TimeOffRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **user** | [**User**](User.html) | The user associated with this TimeOffRequest |  |
| **isFullDayRequest** | **Boolean** | Whether this is a full day request (false means partial day) |  |
| **markedAsRead** | **Boolean** | Whether this request has been marked as read by the agent |  |
| **activityCodeId** | **String** | The ID of the activity code associated with this TimeOffRequest |  |
| **status** | [**StatusEnum**](#StatusEnum) | The administrative status of this TimeOffRequest |  |
| **partialDayStartDateTimes** | [**List&lt;Date&gt;**](Date.html) | The start date-times for partial day requests.  Required if isFullDayRequest &#x3D;&#x3D; false |  [optional] |
| **dailyDurationMinutes** | **Integer** | The daily duration of this TimeOffRequest in minutes |  |
| **notes** | **String** | The notes as input by the one who entered the TimeOffRequest |  [optional] |
| **submittedBy** | [**User**](User.html) | The user who submitted this TimeOffRequest |  [optional] |
| **submittedDate** | [**Date**](Date.html) | The timestamp when this request was submitted. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **reviewedBy** | [**User**](User.html) | The user who reviewed this TimeOffRequest |  [optional] |
| **reviewedDate** | [**Date**](Date.html) | The timestamp when this request was reviewed. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **modifiedBy** | [**User**](User.html) | The user who last modified this TimeOffRequest |  [optional] |
| **modifiedDate** | [**Date**](Date.html) | The timestamp when this request was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
| **fullDayManagementUnitDates** | **List&lt;String&gt;** | ISO-8601 date only with no timezones.  Should be interpreted in the Management Unit&#39;s configured time zone.  Required if isFullDayRequest &#x3D;&#x3D; true |  [optional] |
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


