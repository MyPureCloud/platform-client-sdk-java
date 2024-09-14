# CommonAlertBulkUpdateRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The action to take |  |
| **alertIds** | **List&lt;String&gt;** | The user supplied alert ids to be muted |  |
| **muteSnooze** | [**MuteSnoozeFields**](MuteSnoozeFields) | The fields need for a mute or snooze requests |  [optional] |
| **unread** | [**UnreadFields**](UnreadFields) | The fields need for an unread update requests |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| MUTE | &quot;Mute&quot; | 
| SNOOZE | &quot;Snooze&quot; | 
| UNREAD | &quot;Unread&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:209.1.0_
