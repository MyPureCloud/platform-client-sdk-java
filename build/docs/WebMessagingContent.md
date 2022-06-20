---
title: WebMessagingContent
---
## WebMessagingContent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **contentType** | [**ContentTypeEnum**](#ContentTypeEnum)<!----> | Type of this content element. If contentType = \"Attachment\" only one item is allowed. |  [optional] |
| **attachment** | <!----><!---->[**WebMessagingAttachment**](WebMessagingAttachment.html)<!----> | Attachment content. |  [optional] |
| **quickReply** | <!----><!---->[**WebMessagingQuickReply**](WebMessagingQuickReply.html)<!----> | Quick reply content. |  [optional] |
| **buttonResponse** | <!----><!---->[**WebMessagingButtonResponse**](WebMessagingButtonResponse.html)<!----> | Button response content. |  [optional] |
| **generic** | <!----><!---->[**WebMessagingGeneric**](WebMessagingGeneric.html)<!----> | Generic content (Deprecated). |  [optional] |
| **card** | <!----><!---->[**ContentCard**](ContentCard.html)<!----> | Card content |  [optional] |
| **carousel** | <!----><!---->[**ContentCarousel**](ContentCarousel.html)<!----> | Carousel content |  [optional] |
{: class="table table-striped"}


<a name="ContentTypeEnum"></a>

## Enum: ContentTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ATTACHMENT | &quot;Attachment&quot; | 
| QUICKREPLY | &quot;QuickReply&quot; | 
| BUTTONRESPONSE | &quot;ButtonResponse&quot; | 
| GENERICTEMPLATE | &quot;GenericTemplate&quot; | 
| CARD | &quot;Card&quot; | 
| CAROUSEL | &quot;Carousel&quot; | 
{: class="table table-striped"}



