# ContinuousForecastSessionResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **sessionId** | **String** | Session ID of the continuous forecast data |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) | State of the requested session |  [optional] |
| **files** | [**SessionFiles**](SessionFiles) | Link to the files containing data for requested session |  [optional] |


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| PROCESSING | &quot;Processing&quot; | 
| ERROR | &quot;Error&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:219.0.0_
