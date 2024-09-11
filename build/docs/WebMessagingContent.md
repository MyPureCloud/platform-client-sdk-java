# WebMessagingContent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **contentType** | [**ContentTypeEnum**](#Enum--ContentTypeEnum) | Type of this content element. If contentType = \"Attachment\" only one item is allowed. |  [optional] |
| **attachment** | [**WebMessagingAttachment**](WebMessagingAttachment) | Attachment content. |  [optional] |
| **quickReply** | [**WebMessagingQuickReply**](WebMessagingQuickReply) | Quick reply content. |  [optional] |
| **buttonResponse** | [**WebMessagingButtonResponse**](WebMessagingButtonResponse) | Button response content. |  [optional] |
| **generic** | [**WebMessagingGeneric**](WebMessagingGeneric) | Generic content (Deprecated). |  [optional] |
| **card** | [**ContentCard**](ContentCard) | Card content |  [optional] |
| **carousel** | [**ContentCarousel**](ContentCarousel) | Carousel content |  [optional] |


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




_com.mypurecloud.sdk.v2:platform-client-v2:209.0.1_
