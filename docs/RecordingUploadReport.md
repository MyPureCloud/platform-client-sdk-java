# RecordingUploadReport


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The report id. |  [optional] |
| **name** | **String** |  |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) | The current status of the upload report. |  [optional] |
| **signedUrl** | **String** | For COMPLETED tasks, the signed url to download the report. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INPROGRESS | &quot;InProgress&quot; | 
| COMPLETED | &quot;Completed&quot; | 
| FAILED | &quot;Failed&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:212.0.0_
