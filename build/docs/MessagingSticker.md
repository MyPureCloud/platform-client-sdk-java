---
title: MessagingSticker
---
## MessagingSticker


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **providerStickerId** | <!----><!---->**Integer**<!----> | The sticker Id of the sticker, assigned by the sticker provider. |  |
| **providerPackageId** | <!----><!---->**Integer**<!----> | The package Id of the sticker, assigned by the sticker provider. |  [optional] |
| **packageName** | <!----><!---->**String**<!----> | The package name of the sticker, assigned by the sticker provider. |  [optional] |
| **messengerType** | [**MessengerTypeEnum**](#MessengerTypeEnum)<!----> | The type of the messenger provider. |  |
| **stickerType** | [**StickerTypeEnum**](#StickerTypeEnum)<!----> | The type of the sticker. |  |
| **providerVersion** | <!----><!---->**Long**<!----> | The version of the sticker, assigned by the provider. |  [optional] |
| **uriLocation** | <!----><!---->**String**<!----> |  |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="MessengerTypeEnum"></a>

## Enum: MessengerTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SMS | &quot;sms&quot; | 
| FACEBOOK | &quot;facebook&quot; | 
| TWITTER | &quot;twitter&quot; | 
| LINE | &quot;line&quot; | 
| WHATSAPP | &quot;whatsapp&quot; | 
| WEBMESSAGING | &quot;webmessaging&quot; | 
| INSTAGRAM | &quot;instagram&quot; | 
| OPEN | &quot;open&quot; | 
{: class="table table-striped"}


<a name="StickerTypeEnum"></a>

## Enum: StickerTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| STANDARD | &quot;standard&quot; | 
| FREE | &quot;free&quot; | 
| PAID | &quot;paid&quot; | 
{: class="table table-striped"}



