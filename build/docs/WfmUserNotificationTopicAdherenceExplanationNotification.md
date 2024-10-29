# WfmUserNotificationTopicAdherenceExplanationNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **agent** | [**WfmUserNotificationTopicUserReference**](WfmUserNotificationTopicUserReference) |  |  [optional] |
| **managementUnit** | [**WfmUserNotificationTopicManagementUnit**](WfmUserNotificationTopicManagementUnit) |  |  [optional] |
| **businessUnit** | [**WfmUserNotificationTopicBusinessUnit**](WfmUserNotificationTopicBusinessUnit) |  |  [optional] |
| **startDate** | [**Date**](Date) |  |  [optional] |
| **lengthMinutes** | **Integer** |  |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) |  |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) |  |  [optional] |
| **notes** | **String** |  |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PENDING | &quot;Pending&quot; | 
| APPROVED | &quot;Approved&quot; | 
| DENIED | &quot;Denied&quot; | 


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| LATE | &quot;Late&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:213.0.0_
