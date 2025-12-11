# FaxSendResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **uploadDestinationUri** | **String** |  |  [optional] |
| **uploadMethodType** | [**UploadMethodTypeEnum**](#Enum--UploadMethodTypeEnum) |  |  [optional] |
| **headers** | **Map&lt;String, String&gt;** |  |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: UploadMethodTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SINGLE_PUT | &quot;SINGLE_PUT&quot; | 
| MULTIPART_POST | &quot;MULTIPART_POST&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:240.0.0_
