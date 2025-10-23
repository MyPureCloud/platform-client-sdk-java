# V2ReprocessJobStateChangedTopicJobStateChanged


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **organizationId** | **String** |  |  [optional] |
| **jobId** | **String** |  |  [optional] |
| **jobStatus** | [**JobStatusEnum**](#Enum--JobStatusEnum) |  |  [optional] |
| **processedInteractionsCount** | **Long** |  |  [optional] |
| **failedInteractionsCount** | **Long** |  |  [optional] |
| **totalInteractions** | **Long** |  |  [optional] |


## Enum: JobStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| QUEUED | &quot;Queued&quot; | 
| INPROGRESS | &quot;InProgress&quot; | 
| COMPLETED | &quot;Completed&quot; | 
| FAILED | &quot;Failed&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:235.0.0_
