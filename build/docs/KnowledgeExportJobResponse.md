# KnowledgeExportJobResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | Id of the export job. |  [optional] |
| **downloadURL** | **String** | The URL of the location at which the caller can download the export file, when available. |  [optional] |
| **fileType** | [**FileTypeEnum**](#Enum--FileTypeEnum) | File type of the document |  |
| **jsonFileVersion** | **Integer** | Requested version of the exported json file. |  [optional] |
| **countDocumentProcessed** | **Integer** | The current count of the number of records processed. |  [optional] |
| **exportFilter** | [**KnowledgeExportJobFilter**](KnowledgeExportJobFilter) | Filters to narrow down what to export. |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The status of the export job. |  [optional] |
| **knowledgeBase** | [**KnowledgeBase**](KnowledgeBase) | Knowledge base which document export belongs to. |  [optional] |
| **createdBy** | [**UserReference**](UserReference) | The user who created the operation |  [optional] |
| **dateCreated** | [**Date**](Date) | The timestamp of when the export began. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | The timestamp of when the export stopped. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **errorInformation** | [**ErrorBody**](ErrorBody) | Any error information, or null of the processing is not in failed state. |  [optional] |
| **source** | [**KnowledgeOperationSource**](KnowledgeOperationSource) | Source of the export job. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: FileTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| JSON | &quot;Json&quot; | 
| CSV | &quot;Csv&quot; | 
| XLSX | &quot;Xlsx&quot; | 


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




_com.mypurecloud.sdk.v2:platform-client-v2:240.0.0_
