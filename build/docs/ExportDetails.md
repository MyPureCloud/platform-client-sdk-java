# ExportDetails


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **flow** | [**ArchitectFlowReference**](ArchitectFlowReference) | The flow to export. If you do not provide the flow ID, you must provide both the name and type. |  |
| **fileName** | **String** | Name to assign to the file after download. The extension will be automatically appended based on desired export type. Must contain only alphanumeric characters, underscores, or hyphens. |  [optional] |
| **exportType** | [**ExportTypeEnum**](#Enum--ExportTypeEnum) | The export type for the flow. Default: 'Yaml'. |  [optional] |


## Enum: ExportTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ARCHITECT | &quot;Architect&quot; | 
| YAML | &quot;Yaml&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:244.0.0_
