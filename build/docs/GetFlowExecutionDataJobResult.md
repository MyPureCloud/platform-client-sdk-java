# GetFlowExecutionDataJobResult


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **entities** | [**List&lt;ExecutionDataEntity&gt;**](ExecutionDataEntity) | On jobState = Success this field will be populated with the list of results of files for download. |  [optional] |
| **jobState** | [**JobStateEnum**](#Enum--JobStateEnum) | The state of the backend process to prep the files for download. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: JobStateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| REGISTERED | &quot;Registered&quot; | 
| RUNNING | &quot;Running&quot; | 
| SUCCESS | &quot;Success&quot; | 
| FAILED | &quot;Failed&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:238.0.0_
