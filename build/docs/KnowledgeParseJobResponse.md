---
title: KnowledgeParseJobResponse
---
## KnowledgeParseJobResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | Id of the parse job |  [optional] |
| **downloadURL** | <!----><!---->**String**<!----> | The URL of the location at which the caller can download the original html file. |  [optional] |
| **hints** | <!----><!---->**List&lt;String&gt;**<!----> | Hinted titles for the parser. |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | Status of the parse job |  [optional] |
| **parseResults** | <!----><!---->[**List&lt;KnowledgeParseRecord&gt;**](KnowledgeParseRecord.html)<!----> | Results of the parse |  [optional] |
| **importResult** | <!----><!---->[**KnowledgeParseImportResult**](KnowledgeParseImportResult.html)<!----> | Result of the import phase |  [optional] |
| **createdBy** | <!----><!---->[**UserReference**](UserReference.html)<!----> | The user who created the operation |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | Created date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | Last modified date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| READYTOPARSE | &quot;ReadyToParse&quot; | 
| PARSEINPROGRESS | &quot;ParseInProgress&quot; | 
| PARSECOMPLETED | &quot;ParseCompleted&quot; | 
| READYTOIMPORT | &quot;ReadyToImport&quot; | 
| IMPORTINPROGRESS | &quot;ImportInProgress&quot; | 
| IMPORTCOMPLETED | &quot;ImportCompleted&quot; | 
| IMPORTPARTIALCOMPLETED | &quot;ImportPartialCompleted&quot; | 
| IMPORTFAILED | &quot;ImportFailed&quot; | 
{: class="table table-striped"}



