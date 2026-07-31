# ContinuousForecastGetSessionResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **sessionId** | **String** | Latest session ID of the business unit |  [optional] |
| **lastSuccessfulSessionId** | **String** | Last successful session ID of the business unit |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) | State of the latest session |  [optional] |
| **forecastDataState** | [**ForecastDataStateEnum**](#Enum--ForecastDataStateEnum) | State of the forecast data |  [optional] |
| **errorCode** | **String** | Failed session error code |  [optional] |


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| PROCESSING | &quot;Processing&quot; | 
| ERROR | &quot;Error&quot; | 


## Enum: ForecastDataStateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CURRENT | &quot;Current&quot; | 
| STALE | &quot;Stale&quot; | 
| PROCESSING | &quot;Processing&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:259.0.0_
