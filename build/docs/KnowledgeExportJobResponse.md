---
title: KnowledgeExportJobResponse
---
## KnowledgeExportJobResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | Id of the export job. |  [optional] |
| **downloadURL** | <!----><!---->**String**<!----> | The URL of the location at which the caller can download the export file, when available. |  [optional] |
| **fileType** | [**FileTypeEnum**](#FileTypeEnum)<!----> | File type of the document |  |
| **jsonFileVersion** | <!----><!---->**Integer**<!----> | Requested version of the exported json file. |  [optional] |
| **countDocumentProcessed** | <!----><!---->**Integer**<!----> | The current count of the number of records processed. |  [optional] |
| **exportFilter** | <!----><!---->[**KnowledgeExportJobFilter**](KnowledgeExportJobFilter.html)<!----> | Filters to narrow down what to export. |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | The status of the export job. |  [optional] |
| **knowledgeBase** | <!----><!---->[**KnowledgeBase**](KnowledgeBase.html)<!----> | Knowledge base which document export belongs to. |  [optional] |
| **createdBy** | <!----><!---->[**UserReference**](UserReference.html)<!----> | The user who created the operation |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | The timestamp of when the export began. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | The timestamp of when the export stopped. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **errorInformation** | <!----><!---->[**ErrorBody**](ErrorBody.html)<!----> | Any error information, or null of the processing is not in failed state. |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="FileTypeEnum"></a>

## Enum: FileTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| JSON | &quot;Json&quot; | 
| CSV | &quot;Csv&quot; | 
| XLSX | &quot;Xlsx&quot; | 
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CREATED | &quot;Created&quot; | 
| VALIDATIONINPROGRESS | &quot;ValidationInProgress&quot; | 
| VALIDATIONCOMPLETED | &quot;ValidationCompleted&quot; | 
| VALIDATIONFAILED | &quot;ValidationFailed&quot; | 
| STARTED | &quot;Started&quot; | 
| INPROGRESS | &quot;InProgress&quot; | 
| COMPLETED | &quot;Completed&quot; | 
| PARTIALCOMPLETED | &quot;PartialCompleted&quot; | 
| FAILED | &quot;Failed&quot; | 
| ABORTREQUESTED | &quot;AbortRequested&quot; | 
| ABORTED | &quot;Aborted&quot; | 
{: class="table table-striped"}



