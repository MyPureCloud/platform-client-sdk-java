# SchedulingStatusResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The ID generated for the scheduling job.  Use to GET result when job is completed. |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The status of the scheduling job. |  [optional] |
| **errorDetails** | [**List&lt;SchedulingProcessingError&gt;**](SchedulingProcessingError) | If the request could not be properly processed, error details will be given here. |  [optional] |
| **schedulingResultUri** | **String** | The uri of the scheduling result. It has a value if the status is 'Success'. |  [optional] |
| **percentComplete** | **Integer** | The percentage of the job that is complete. |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PENDING | &quot;Pending&quot; | 
| SUCCESS | &quot;Success&quot; | 
| FAILED | &quot;Failed&quot; | 
| ONGOING | &quot;Ongoing&quot; | 
| PARTIALFAILURE | &quot;PartialFailure&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
