---
title: WfmUserNotificationTopicTimeOffRequestNotification
---
## WfmUserNotificationTopicTimeOffRequestNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **timeOffRequestId** | <!----><!---->**String**<!----> |  |  [optional] |
| **user** | <!----><!---->[**WfmUserNotificationTopicUserReference**](WfmUserNotificationTopicUserReference.html)<!----> |  |  [optional] |
| **isFullDayRequest** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> |  |  [optional] |
| **partialDayStartDateTimes** | <!----><!---->[**List&lt;Date&gt;**](Date.html)<!----> |  |  [optional] |
| **fullDayManagementUnitDates** | <!----><!---->**List&lt;String&gt;**<!----> |  |  [optional] |
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



