# BuConvertTimeOffLimitGranularityJobResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  |
| **timeOffLimit** | [**BuTimeOffLimitReference**](BuTimeOffLimitReference) | The time-off limit associated with this job |  |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The status of the job |  |
| **progress** | [**BuConvertTimeOffLimitGranularityJobProgress**](BuConvertTimeOffLimitGranularityJobProgress) | Progress of time-off limit granularity conversion |  [optional] |
| **error** | [**ErrorBody**](ErrorBody) | Error information. Set only when status is Error |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| ERROR | &quot;Error&quot; | 
| PROCESSING | &quot;Processing&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:258.0.0_
