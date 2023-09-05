---
title: KnowledgeImportJobResponse
---
## KnowledgeImportJobResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | Id of the import job |  [optional] |
| **downloadURL** | <!----><!---->**String**<!----> | The URL of the location at which the caller can download the imported file. |  [optional] |
| **failedEntitiesURL** | <!----><!---->**String**<!----> | The URL of the location at which the caller can download the entities in json format that failed during the import. |  [optional] |
| **uploadKey** | <!----><!---->**String**<!----> | Upload key |  |
| **fileType** | [**FileTypeEnum**](#FileTypeEnum)<!----> | File type of the document |  |
| **settings** | <!----><!---->[**KnowledgeImportJobSettings**](KnowledgeImportJobSettings.html)<!----> | Additional optional settings |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | Status of the import job |  [optional] |
| **report** | <!----><!---->[**KnowledgeImportJobReport**](KnowledgeImportJobReport.html)<!----> | Report of the import job |  [optional] |
| **knowledgeBase** | <!----><!---->[**KnowledgeBase**](KnowledgeBase.html)<!----> | Knowledge base which document import does belong to |  [optional] |
| **createdBy** | <!----><!---->[**UserReference**](UserReference.html)<!----> | The user who created the operation |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | Created date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | Last modified date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **skipConfirmationStep** | <!----><!---->**Boolean**<!----> | If enabled pre-validation step will be skipped. |  [optional] |
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



