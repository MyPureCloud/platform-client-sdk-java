---
title: RecordingJob
---
## RecordingJob


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **state** | [**StateEnum**](#StateEnum) | The current state of the job. |  |
| **recordingJobsQuery** | [**RecordingJobsQuery**](RecordingJobsQuery.html) | Original query of the job. |  [optional] |
| **dateCreated** | [**Date**](Date.html) | Date when the job was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **totalConversations** | **Integer** | Total number of conversations affected. |  [optional] |
| **totalRecordings** | **Integer** | Total number of recordings affected. |  [optional] |
| **totalProcessedRecordings** | **Integer** | Total number of recordings have been processed. |  [optional] |
| **percentProgress** | **Integer** | Progress in percentage based on the number of recordings |  [optional] |
| **errorMessage** | **String** | Error occurred during the job execution |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="StateEnum"></a>

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
{: class="table table-striped"}



