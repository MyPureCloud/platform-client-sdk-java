# ContinuousForecastGetSessionResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **sessionId** | **String** | The ID of the latest session, regardless of the session's status |  |
| **lastSuccessfulSessionId** | **String** | The ID of the last session that has a state of Complete |  |
| **state** | [**StateEnum**](#Enum--StateEnum) | The state of the latest session |  |
| **errorCode** | **String** | The error code if the latest session has a state of Error |  [optional] |


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| PROCESSING | &quot;Processing&quot; | 
| ERROR | &quot;Error&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:262.0.0_
