# V2WfmContinuousForecastSessionEventContinuousForecastSessionNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **sessionId** | **String** |  |  [optional] |
| **lastSuccessfulSessionId** | **String** |  |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) |  |  [optional] |
| **errorCode** | **String** |  |  [optional] |
| **forecastDataState** | [**ForecastDataStateEnum**](#Enum--ForecastDataStateEnum) |  |  [optional] |


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| PROCESSING | &quot;Processing&quot; | 
| ERROR | &quot;Error&quot; | 
| CANCELLED | &quot;Cancelled&quot; | 


## Enum: ForecastDataStateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CURRENT | &quot;Current&quot; | 
| STALE | &quot;Stale&quot; | 
| PROCESSING | &quot;Processing&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:265.1.0_
