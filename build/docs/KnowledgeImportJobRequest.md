---
title: KnowledgeImportJobRequest
---
## KnowledgeImportJobRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **uploadKey** | <!----><!---->**String**<!----> | Upload key |  |
| **fileType** | [**FileTypeEnum**](#FileTypeEnum)<!----> | File type of the document |  |
| **settings** | <!----><!---->[**KnowledgeImportJobSettings**](KnowledgeImportJobSettings.html)<!----> | Additional optional settings |  [optional] |
| **skipConfirmationStep** | <!----><!---->**Boolean**<!----> | If enabled pre-validation step will be skipped. |  [optional] |
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



