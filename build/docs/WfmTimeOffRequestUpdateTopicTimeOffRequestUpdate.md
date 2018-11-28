---
title: WfmTimeOffRequestUpdateTopicTimeOffRequestUpdate
---
## WfmTimeOffRequestUpdateTopicTimeOffRequestUpdate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **user** | [**WfmTimeOffRequestUpdateTopicUserReference**](WfmTimeOffRequestUpdateTopicUserReference.html) |  |  [optional] |
| **isFullDayRequest** | **Boolean** |  |  [optional] |
| **markedAsRead** | **Boolean** |  |  [optional] |
| **activityCodeId** | **String** |  |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
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



