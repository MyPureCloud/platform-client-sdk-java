# MessageContent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **contentType** | [**ContentTypeEnum**](#Enum--ContentTypeEnum) | Type of this content element. |  |
| **attachment** | [**ContentAttachment**](ContentAttachment) | Attachment content. |  [optional] |
| **quickReply** | [**ContentQuickReply**](ContentQuickReply) | Quick reply content. |  [optional] |
| **buttonResponse** | [**ContentButtonResponse**](ContentButtonResponse) | Button response content. |  [optional] |
| **generic** | [**ContentGeneric**](ContentGeneric) | Generic content (Deprecated). |  [optional] |
| **list** | [**ContentList**](ContentList) | List content (Deprecated). |  [optional] |
| **template** | [**ContentNotificationTemplate**](ContentNotificationTemplate) | Template notification content. |  [optional] |
| **reactions** | [**List&lt;ContentReaction&gt;**](ContentReaction) | A set of reactions to a message. |  [optional] |
| **mention** | [**MessagingRecipient**](MessagingRecipient) | Mention content. |  [optional] |
| **postback** | [**ContentPostback**](ContentPostback) | Structured message postback (Deprecated). |  [optional] |
| **story** | [**ContentStory**](ContentStory) | Ephemeral story content. |  [optional] |
| **card** | [**ContentCard**](ContentCard) | Card content |  [optional] |
| **carousel** | [**ContentCarousel**](ContentCarousel) | Carousel content |  [optional] |
| **text** | [**ContentText**](ContentText) | Text content. |  [optional] |
| **quickReplyV2** | [**ContentQuickReplyV2**](ContentQuickReplyV2) | Quick reply V2 content. |  [optional] |
| **datePicker** | [**ContentDatePicker**](ContentDatePicker) | DatePicker content. |  [optional] |
| **location** | [**ContentLocation**](ContentLocation) | Location content. |  [optional] |


## Enum: ContentTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ATTACHMENT | &quot;Attachment&quot; | 
| LOCATION | &quot;Location&quot; | 
| QUICKREPLY | &quot;QuickReply&quot; | 
| NOTIFICATION | &quot;Notification&quot; | 
| GENERICTEMPLATE | &quot;GenericTemplate&quot; | 
| LISTTEMPLATE | &quot;ListTemplate&quot; | 
| POSTBACK | &quot;Postback&quot; | 
| REACTIONS | &quot;Reactions&quot; | 
| MENTION | &quot;Mention&quot; | 
| BUTTONRESPONSE | &quot;ButtonResponse&quot; | 
| STORY | &quot;Story&quot; | 
| CARD | &quot;Card&quot; | 
| CAROUSEL | &quot;Carousel&quot; | 
| TEXT | &quot;Text&quot; | 
| QUICKREPLYV2 | &quot;QuickReplyV2&quot; | 
| DATEPICKER | &quot;DatePicker&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:223.1.0_
