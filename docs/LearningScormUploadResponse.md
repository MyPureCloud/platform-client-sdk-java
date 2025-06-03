# LearningScormUploadResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The status of the SCORM package |  [optional] |
| **uploadUrl** | **String** | The pre-signed URL. Use it with headers below to upload file to S3 |  [optional] |
| **headers** | **Map&lt;String, String&gt;** | The additional headers that need to be included in the upload request |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UPLOADPENDING | &quot;UploadPending&quot; | 
| UNPACKING | &quot;Unpacking&quot; | 
| ERROR | &quot;Error&quot; | 
| READY | &quot;Ready&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:226.0.0_
