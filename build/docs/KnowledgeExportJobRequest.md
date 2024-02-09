---
title: KnowledgeExportJobRequest
---
## KnowledgeExportJobRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **exportFilter** | <!----><!---->[**KnowledgeExportJobFilter**](KnowledgeExportJobFilter.html)<!----> | What to export. |  |
| **fileType** | [**FileTypeEnum**](#FileTypeEnum)<!----> | File type of the document |  |
| **jsonFileVersion** | <!----><!---->**Integer**<!----> | Requested version of the exported json file. Available versions are 2 and 3, default is 2 |  [optional] |
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



