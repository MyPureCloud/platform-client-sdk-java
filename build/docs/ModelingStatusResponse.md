---
title: ModelingStatusResponse
---
## ModelingStatusResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The ID generated for the modeling job.  Use to GET result when job is completed. |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | The status of the modeling job. |  [optional] |
| **errorDetails** | <!----><!---->[**List&lt;ModelingProcessingError&gt;**](ModelingProcessingError.html)<!----> | If the request could not be properly processed, error details will be given here. |  [optional] |
| **modelingResultUri** | <!----><!---->**String**<!----> | The uri of the modeling result. It has a value if the status is either 'Success', 'PartialFailure', or 'Failed'. |  [optional] |
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PENDING | &quot;Pending&quot; | 
| SUCCESS | &quot;Success&quot; | 
| FAILED | &quot;Failed&quot; | 
| ONGOING | &quot;Ongoing&quot; | 
| PARTIALFAILURE | &quot;PartialFailure&quot; | 
{: class="table table-striped"}



