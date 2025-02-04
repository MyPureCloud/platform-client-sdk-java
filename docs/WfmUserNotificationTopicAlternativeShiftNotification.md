# WfmUserNotificationTopicAlternativeShiftNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **weekDate** | [**Date**](Date) |  |  [optional] |
| **granularity** | [**GranularityEnum**](#Enum--GranularityEnum) |  |  [optional] |
| **newState** | [**NewStateEnum**](#Enum--NewStateEnum) |  |  [optional] |
| **initiatingUser** | [**WfmUserNotificationTopicUserReference**](WfmUserNotificationTopicUserReference) |  |  [optional] |
| **initiatingShiftDate** | [**Date**](Date) |  |  [optional] |
| **receivingUser** | [**WfmUserNotificationTopicUserReference**](WfmUserNotificationTopicUserReference) |  |  [optional] |
| **receivingShiftDate** | [**Date**](Date) |  |  [optional] |


## Enum: GranularityEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DAILY | &quot;Daily&quot; | 
| WEEKLY | &quot;Weekly&quot; | 


## Enum: NewStateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SUBMITTED | &quot;Submitted&quot; | 
| EXPIRED | &quot;Expired&quot; | 
| APPROVED | &quot;Approved&quot; | 
| DENIED | &quot;Denied&quot; | 
| CANCELED | &quot;Canceled&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:219.0.0_
