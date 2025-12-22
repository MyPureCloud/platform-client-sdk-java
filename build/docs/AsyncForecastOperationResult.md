# AsyncForecastOperationResult


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The status of the operation |  [optional] |
| **operationId** | **String** | The ID for the operation |  [optional] |
| **result** | [**BuShortTermForecast**](BuShortTermForecast) | The result of the operation.  Null unless status == Complete |  [optional] |
| **progress** | **Integer** | Percent progress for the operation |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PROCESSING | &quot;Processing&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| CANCELED | &quot;Canceled&quot; | 
| ERROR | &quot;Error&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:241.0.0_
