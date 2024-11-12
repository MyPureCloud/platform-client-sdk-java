# RecordingJob


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) | The current state of the job. |  |
| **recordingJobsQuery** | [**RecordingJobsQuery**](RecordingJobsQuery) | Original query of the job. |  [optional] |
| **dateCreated** | [**Date**](Date) | Date when the job was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **totalConversations** | **Integer** | Total number of conversations affected. |  [optional] |
| **totalRecordings** | **Integer** | Total number of recordings affected. |  [optional] |
| **totalSkippedRecordings** | **Integer** | Total number of recordings that have been skipped. |  [optional] |
| **totalFailedRecordings** | **Integer** | Total number of recordings that the bulk job failed to process. |  [optional] |
| **totalProcessedRecordings** | **Integer** | Total number of recordings have been processed. |  [optional] |
| **percentProgress** | **Integer** | Progress in percentage based on the number of recordings |  [optional] |
| **errorMessage** | **String** | Error occurred during the job execution |  [optional] |
| **failedRecordings** | **String** | Get IDs of recordings that the bulk job failed for |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
| **user** | [**AddressableEntityRef**](AddressableEntityRef) | Details of the user created the job |  [optional] |


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| FULFILLED | &quot;FULFILLED&quot; | 
| PENDING | &quot;PENDING&quot; | 
| READY | &quot;READY&quot; | 
| PROCESSING | &quot;PROCESSING&quot; | 
| CANCELLED | &quot;CANCELLED&quot; | 
| FAILED | &quot;FAILED&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:214.0.0_
