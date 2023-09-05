---
title: GrammarLanguageFileMetadata
---
## GrammarLanguageFileMetadata


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **fileName** | <!----><!---->**String**<!----> | The name of the file as defined by the user |  [optional] |
| **fileSizeBytes** | <!----><!---->**Integer**<!----> | The size of the file in bytes |  [optional] |
| **dateUploaded** | <!----><!---->[**Date**](Date.html)<!----> | The date the file was uploaded. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **fileType** | [**FileTypeEnum**](#FileTypeEnum)<!----> | The extension of the file |  [optional] |
{: class="table table-striped"}


<a name="FileTypeEnum"></a>

## Enum: FileTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| GRAM | &quot;Gram&quot; | 
| GRXML | &quot;Grxml&quot; | 
{: class="table table-striped"}



