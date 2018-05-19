---
title: TimeOffRequestResponse
---
## TimeOffRequestResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **user** | [**User**](User.html) | The user associated with this time off request |  [optional] |
| **isFullDayRequest** | **Boolean** | Whether this is a full day request (false means partial day) |  [optional] |
| **markedAsRead** | **Boolean** | Whether this request has been marked as read by the agent |  [optional] |
| **activityCodeId** | **String** | The ID of the activity code associated with this time off request. Activity code must be of the TimeOff category |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum) | The status of this time off request |  [optional] |
| **partialDayStartDateTimes** | [**List&lt;Date&gt;**](Date.html) | A set of start date-times in ISO-8601 format for partial day requests.  Will be not empty if isFullDayRequest == false |  [optional] |
| **fullDayManagementUnitDates** | **List&lt;String&gt;** | A set of dates in yyyy-MM-dd format.  Should be interpreted in the management unit&#39;s configured time zone.  Will be not empty if isFullDayRequest == true |  [optional] |
| **dailyDurationMinutes** | **Integer** | The daily duration of this time off request in minutes |  [optional] |
| **notes** | **String** | Notes about the time off request |  [optional] |
| **submittedBy** | [**User**](User.html) | The user who submitted this time off request |  [optional] |
| **submittedDate** | [**Date**](Date.html) | The timestamp when this request was submitted. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **reviewedBy** | [**User**](User.html) | The user who reviewed this time off request |  [optional] |
| **reviewedDate** | [**Date**](Date.html) | The timestamp when this request was reviewed. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **modifiedBy** | [**UserReference**](UserReference.html) | The user who last modified this TimeOffRequestResponse |  [optional] |
| **modifiedDate** | [**Date**](Date.html) | The timestamp when this request was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **metadata** | [**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata.html) | The version metadata of the time off request |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
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


