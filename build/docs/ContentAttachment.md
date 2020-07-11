---
title: ContentAttachment
---
## ContentAttachment


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | Vendor specific ID for media. For example, a LINE sticker ID |  [optional] |
| **mediaType** | [**MediaTypeEnum**](#MediaTypeEnum)<!----> | The type of media this instance represents |  |
| **url** | <!----><!---->**String**<!----> | Content element url |  [optional] |
| **mime** | <!----><!---->**String**<!----> | Content mime type from https://www.iana.org/assignments/media-types/media-types.xhtml |  [optional] |
| **text** | <!----><!---->**String**<!----> | Text message associated with media element: e.g. caption in case of image. |  [optional] |
| **sha256** | <!----><!---->**String**<!----> | Secure hash of the media content |  [optional] |
| **filename** | <!----><!---->**String**<!----> | Suggested file name for media file |  [optional] |
{: class="table table-striped"}


<a name="MediaTypeEnum"></a>

## Enum: MediaTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| IMAGE | &quot;Image&quot; |
| VIDEO | &quot;Video&quot; |
| AUDIO | &quot;Audio&quot; |
| FILE | &quot;File&quot; |
{: class="table table-striped"}



