# PerformancePredictionRecalculationResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **operationId** | **String** | The operationId for which to listen |  |
| **downloadUrl** | **String** | The url to GET the results of the performance prediction. This field is populated only if query state is 'Complete' |  [optional] |
| **downloadResult** | [**PerformancePredictionOutputs**](PerformancePredictionOutputs) | Result will always come via downloadUrls; however the schema is included for documentation |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) | The state of the performance prediction |  |


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PROCESSING | &quot;Processing&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| ERROR | &quot;Error&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
