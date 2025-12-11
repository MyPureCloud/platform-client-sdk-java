# KnowledgeExportJobFilter


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **documentsFilter** | [**KnowledgeExportJobDocumentsFilter**](KnowledgeExportJobDocumentsFilter) | Filters for narrowing down which documents to export. |  [optional] |
| **versionFilter** | [**VersionFilterEnum**](#Enum--VersionFilterEnum) | Specifies what version should be exported. |  |
| **exclude** | [**List<ExcludeEnum>**](#Enum--ExcludeEnum) | Reduce the size of the export file by excluding certain items. |  [optional] |


## Enum: VersionFilterEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ALL | &quot;All&quot; | 
| LATEST | &quot;Latest&quot; | 


## Enum: ExcludeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| CATEGORIES | &quot;Categories&quot; |
| LABELS | &quot;Labels&quot; |
| VARIATIONS | &quot;Variations&quot; |




_com.mypurecloud.sdk.v2:platform-client-v2:240.0.0_
