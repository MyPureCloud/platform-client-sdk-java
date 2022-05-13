---
title: MessageMediaData
---
## MessageMediaData


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **url** | <!----><!---->**String**<!----> | The location of the media, useful for retrieving it |  [optional] |
| **mediaType** | <!----><!---->**String**<!----> | The detected internet media type of the the media object.  If null then the media type should be dictated by the url. |  [optional] |
| **contentLengthBytes** | <!----><!---->**Integer**<!----> | The optional content length of the the media object, in bytes. |  [optional] |
| **uploadUrl** | <!----><!---->**String**<!----> | The URL returned to upload an attachment |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | The status of the media, indicates if the media is in the process of uploading. If the upload fails, the media becomes invalid |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UPLOADING | &quot;uploading&quot; | 
| VALID | &quot;valid&quot; | 
| INVALID | &quot;invalid&quot; | 
{: class="table table-striped"}



