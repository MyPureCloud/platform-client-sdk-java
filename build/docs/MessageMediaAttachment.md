# MessageMediaAttachment


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **url** | **String** | The location of the media, useful for retrieving it |  [optional] |
| **mediaType** | [**MediaTypeEnum**](#Enum--MediaTypeEnum) | The optional internet media type of the the media object.If null then the media type should be dictated by the url. |  [optional] |
| **contentLength** | **Long** | The optional content length of the the media object, in bytes. |  [optional] |
| **name** | **String** | The name of the media object. |  [optional] |
| **id** | **String** | A globally unique identifier for the media object. |  [optional] |


## Enum: MediaTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| IMAGE_PNG | &quot;image/png&quot; | 
| IMAGE_JPEG | &quot;image/jpeg&quot; | 
| IMAGE_GIF | &quot;image/gif&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
