# KnowledgeExportJobRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **exportFilter** | [**KnowledgeExportJobFilter**](KnowledgeExportJobFilter) | What to export. |  |
| **fileType** | [**FileTypeEnum**](#Enum--FileTypeEnum) | File type of the document |  |
| **sourceId** | **String** | Knowledge integration source id. |  [optional] |
| **jsonFileVersion** | **Integer** | Requested version of the exported json file. Available versions are 2 and 3, default is 2 |  [optional] |


## Enum: FileTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| JSON | &quot;Json&quot; | 
| CSV | &quot;Csv&quot; | 
| XLSX | &quot;Xlsx&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:220.0.0_
