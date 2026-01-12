# LogCaptureUserConfiguration


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The ID of the user for which log capture is configured. |  [optional] |
| **dateStarted** | [**Date**](Date) | Indicates when log capture was enabled for the user. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateExpired** | [**Date**](Date) | Indicates when log capture will be turned off for the user. (Must be within 24 hours). Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **captureMethod** | [**CaptureMethodEnum**](#Enum--CaptureMethodEnum) | Indicates the method by which the logs were captured. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: CaptureMethodEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ONDEMAND | &quot;OnDemand&quot; | 
| SCHEDULED | &quot;Scheduled&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:243.0.0_
