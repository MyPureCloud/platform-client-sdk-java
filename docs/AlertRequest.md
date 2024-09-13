# AlertRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The action being taken on the alert. |  |
| **dateStart** | [**Date**](Date) | The start date of the mute/snooze period. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateEnd** | [**Date**](Date) | The end date of the mute/snooze period. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **unread** | [**UnreadFields**](UnreadFields) | The fields need for an unread update requests |  [optional] |
| **validRequest** | **Boolean** |  |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| MUTE | &quot;Mute&quot; | 
| SNOOZE | &quot;Snooze&quot; | 
| UNREAD | &quot;Unread&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:209.0.1_
