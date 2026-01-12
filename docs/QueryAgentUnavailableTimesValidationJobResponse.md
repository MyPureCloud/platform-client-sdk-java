# QueryAgentUnavailableTimesValidationJobResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **agent** | [**UserReference**](UserReference) | The agent who started the job |  |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | Status of the job |  |
| **result** | [**UnavailableTimesValidationResult**](UnavailableTimesValidationResult) | Validation results if status == 'Complete' |  [optional] |
| **error** | [**ErrorBody**](ErrorBody) | Error details if status == 'Error'. The error occurs if the validation job has failed |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PROCESSING | &quot;Processing&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| CANCELED | &quot;Canceled&quot; | 
| ERROR | &quot;Error&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:243.0.0_
