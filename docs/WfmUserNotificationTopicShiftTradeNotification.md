# WfmUserNotificationTopicShiftTradeNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **weekDate** | **String** |  |  [optional] |
| **tradeId** | **String** |  |  [optional] |
| **oneSided** | **Boolean** |  |  [optional] |
| **newState** | [**NewStateEnum**](#Enum--NewStateEnum) |  |  [optional] |
| **initiatingUser** | [**WfmUserNotificationTopicUserReference**](WfmUserNotificationTopicUserReference) |  |  [optional] |
| **initiatingShiftDate** | [**Date**](Date) |  |  [optional] |
| **receivingUser** | [**WfmUserNotificationTopicUserReference**](WfmUserNotificationTopicUserReference) |  |  [optional] |
| **receivingShiftDate** | [**Date**](Date) |  |  [optional] |


## Enum: NewStateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNMATCHED | &quot;Unmatched&quot; | 
| MATCHED | &quot;Matched&quot; | 
| APPROVED | &quot;Approved&quot; | 
| DENIED | &quot;Denied&quot; | 
| EXPIRED | &quot;Expired&quot; | 
| CANCELED | &quot;Canceled&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:216.0.0_
