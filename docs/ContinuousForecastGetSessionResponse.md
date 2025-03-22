# ContinuousForecastGetSessionResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **sessionId** | **String** | Latest session ID of the business unit |  [optional] |
| **lastSuccessfulSessionId** | **String** | Last successful session ID of the business unit |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) | State of the latest session |  [optional] |
| **errorCode** | **String** | Failed session error code |  [optional] |


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| PROCESSING | &quot;Processing&quot; | 
| ERROR | &quot;Error&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:222.0.0_
