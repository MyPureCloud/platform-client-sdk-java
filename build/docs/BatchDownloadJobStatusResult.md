# BatchDownloadJobStatusResult


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **jobId** | **String** | JobId returned when job was initially submitted. |  [optional] |
| **expectedResultCount** | **Integer** | Number of results expected when job is completed, this includes both success and error results. This number could change as recordings are being discovered and processed. |  [optional] |
| **resultCount** | **Integer** | Current number of results available, this includes both success and error results. |  [optional] |
| **errorCount** | **Integer** | Current number of error results. |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | Current status of the job. A job is considered completed when all the submitted requests have been processed and fulfilled. |  [optional] |
| **results** | [**List&lt;BatchDownloadJobResult&gt;**](BatchDownloadJobResult) | Current set of results for the job. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INPROGRESS | &quot;InProgress&quot; | 
| COMPLETED | &quot;Completed&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:220.0.0_
