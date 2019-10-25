---
title: BatchDownloadJobStatusResult
---
## BatchDownloadJobStatusResult


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **jobId** | <!----><!---->**String**<!----> | JobId returned when job was initially submitted |  [optional] |
| **expectedResultCount** | <!----><!---->**Integer**<!----> | Number of results expected when job is completed |  [optional] |
| **resultCount** | <!----><!---->**Integer**<!----> | Current number of results available |  [optional] |
| **errorCount** | <!----><!---->**Integer**<!----> | Number of error results produced so far |  [optional] |
| **results** | <!----><!---->[**List&lt;BatchDownloadJobResult&gt;**](BatchDownloadJobResult.html)<!----> | Current set of results for the job |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}



