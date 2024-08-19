# GrammarLanguageFileMetadata


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **fileName** | **String** | The name of the file as defined by the user |  [optional] |
| **fileSizeBytes** | **Integer** | The size of the file in bytes |  [optional] |
| **dateUploaded** | [**Date**](Date) | The date the file was uploaded. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **fileType** | [**FileTypeEnum**](#Enum--FileTypeEnum) | The extension of the file |  [optional] |
{: class="table table-striped"}


## Enum: FileTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| GRAM | &quot;Gram&quot; | 
| GRXML | &quot;Grxml&quot; | 
{: class="table table-striped"}



