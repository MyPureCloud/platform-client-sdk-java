# RegisterArchitectExportJobResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The status of the export job. |  [optional] |
| **totalFlows** | **Integer** | The number of flows submitted for export. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| REGISTERED | &quot;Registered&quot; | 
| STARTED | &quot;Started&quot; | 
| SUCCESS | &quot;Success&quot; | 
| FAILURE | &quot;Failure&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:227.0.0_
