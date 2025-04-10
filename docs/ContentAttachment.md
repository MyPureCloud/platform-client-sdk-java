# ContentAttachment


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | Provider specific ID for attachment. For example, a LINE sticker ID. |  [optional] |
| **mediaType** | [**MediaTypeEnum**](#Enum--MediaTypeEnum) | The type of attachment this instance represents. |  |
| **url** | **String** | URL of the attachment. |  [optional] |
| **mime** | **String** | Attachment mime type (https://www.iana.org/assignments/media-types/media-types.xhtml). |  [optional] |
| **text** | **String** | Text associated with attachment such as an image caption. |  [optional] |
| **sha256** | **String** | Secure hash of the attachment content. |  [optional] |
| **filename** | **String** | Suggested file name for attachment. |  [optional] |
| **contentSizeBytes** | **Long** | Size in bytes of the attachment content. |  [optional] |


## Enum: MediaTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| IMAGE | &quot;Image&quot; | 
| VIDEO | &quot;Video&quot; | 
| AUDIO | &quot;Audio&quot; | 
| FILE | &quot;File&quot; | 
| LINK | &quot;Link&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:223.1.0_
