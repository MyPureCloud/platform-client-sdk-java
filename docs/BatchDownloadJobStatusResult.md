# BatchDownloadJobStatusResult


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **jobId** | **String** | JobId returned when job was initially submitted. |  [optional] |
| **expectedResultCount** | **Integer** | Number of results expected when job is completed, this includes both success and error results. This number could change as recordings are being discovered and processed. |  [optional] |
| **resultCount** | **Integer** | Current number of results available, this includes both success and error results. |  [optional] |
| **errorCount** | **Integer** | Current number of error results. |  [optional] |
| **results** | [**List&lt;BatchDownloadJobResult&gt;**](BatchDownloadJobResult) | Current set of results for the job. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
{: class="table table-striped"}



