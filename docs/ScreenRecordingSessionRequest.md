# ScreenRecordingSessionRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **state** | [**StateEnum**](#Enum--StateEnum) | The screen recording session's state.  Values can be: 'stopped' |  [optional] |
| **archiveDate** | [**Date**](Date) | The screen recording session's archive date. Must be greater than 1 day from now if set. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **deleteDate** | [**Date**](Date) | The screen recording session's delete date. Must be greater than archiveDate if set, otherwise one day from now. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| STOPPED | &quot;STOPPED&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:215.0.0_
