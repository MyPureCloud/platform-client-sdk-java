# WfmUserNotificationTopicTimeOffRequestNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **timeOffRequestId** | **String** |  |  [optional] |
| **user** | [**WfmUserNotificationTopicUserReference**](WfmUserNotificationTopicUserReference) |  |  [optional] |
| **isFullDayRequest** | **Boolean** |  |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) |  |  [optional] |
| **partialDayStartDateTimes** | [**List&lt;Date&gt;**](Date) |  |  [optional] |
| **fullDayManagementUnitDates** | **List&lt;String&gt;** |  |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PENDING | &quot;PENDING&quot; | 
| APPROVED | &quot;APPROVED&quot; | 
| DENIED | &quot;DENIED&quot; | 
| CANCELED | &quot;CANCELED&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:217.0.0_
