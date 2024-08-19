# LogCaptureDownloadExecutionResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | Id of file download job. |  |
| **state** | [**StateEnum**](#Enum--StateEnum) | Execution state of the download. |  |
| **dateStart** | [**Date**](Date) | Start date of file download execution. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **fileUrl** | **String** | Url of a file with query result. |  |
| **selfUri** | **String** | The URI for this object |  [optional] |
| **user** | [**AddressableEntityRef**](AddressableEntityRef) | Details of the user that created the job |  |
{: class="table table-striped"}


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| RUNNING | &quot;Running&quot; | 
| FAILED | &quot;Failed&quot; | 
| SUCCEEDED | &quot;Succeeded&quot; | 
{: class="table table-striped"}



