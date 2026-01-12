# ConversationMessageContent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **contentType** | [**ContentTypeEnum**](#Enum--ContentTypeEnum) | Type of this content element. |  |
| **location** | [**ConversationContentLocation**](ConversationContentLocation) | Location content. |  [optional] |
| **attachment** | [**ConversationContentAttachment**](ConversationContentAttachment) | Attachment content. |  [optional] |
| **quickReply** | [**ConversationContentQuickReply**](ConversationContentQuickReply) | Quick reply content. |  [optional] |
| **buttonResponse** | [**ConversationContentButtonResponse**](ConversationContentButtonResponse) | Button response content. |  [optional] |
| **template** | [**ConversationContentNotificationTemplate**](ConversationContentNotificationTemplate) | Template notification content. |  [optional] |
| **story** | [**ConversationContentStory**](ConversationContentStory) | Ephemeral story content. |  [optional] |
| **card** | [**ConversationContentCard**](ConversationContentCard) | Card content |  [optional] |
| **carousel** | [**ConversationContentCarousel**](ConversationContentCarousel) | Carousel content |  [optional] |
| **text** | [**ConversationContentText**](ConversationContentText) | Text content. |  [optional] |
| **quickReplyV2** | [**ConversationContentQuickReplyV2**](ConversationContentQuickReplyV2) | Quick reply V2 content. |  [optional] |
| **reactions** | [**List&lt;ConversationContentReaction&gt;**](ConversationContentReaction) | A set of reactions to a message. |  [optional] |
| **datePicker** | [**ConversationContentDatePicker**](ConversationContentDatePicker) | Date picker content. |  [optional] |
| **interactiveApplication** | [**ConversationContentInteractiveApplication**](ConversationContentInteractiveApplication) | InteractiveApplication content. |  [optional] |
| **listPicker** | [**ConversationContentListPicker**](ConversationContentListPicker) | List picker content. |  [optional] |
| **paymentRequest** | [**ConversationContentPaymentRequest**](ConversationContentPaymentRequest) | Payment request content. |  [optional] |
| **paymentResponse** | [**ConversationContentPaymentResponse**](ConversationContentPaymentResponse) | Payment response content. |  [optional] |
| **push** | [**ConversationContentPush**](ConversationContentPush) | Push content. |  [optional] |
| **form** | [**ConversationContentForm**](ConversationContentForm) | Form content. |  [optional] |


## Enum: ContentTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| REACTIONS | &quot;Reactions&quot; | 
| ATTACHMENT | &quot;Attachment&quot; | 
| LOCATION | &quot;Location&quot; | 
| QUICKREPLY | &quot;QuickReply&quot; | 
| NOTIFICATION | &quot;Notification&quot; | 
| BUTTONRESPONSE | &quot;ButtonResponse&quot; | 
| STORY | &quot;Story&quot; | 
| MENTION | &quot;Mention&quot; | 
| CARD | &quot;Card&quot; | 
| CAROUSEL | &quot;Carousel&quot; | 
| TEXT | &quot;Text&quot; | 
| QUICKREPLYV2 | &quot;QuickReplyV2&quot; | 
| DATEPICKER | &quot;DatePicker&quot; | 
| INTERACTIVEAPPLICATION | &quot;InteractiveApplication&quot; | 
| LISTPICKER | &quot;ListPicker&quot; | 
| PAYMENTREQUEST | &quot;PaymentRequest&quot; | 
| PAYMENTRESPONSE | &quot;PaymentResponse&quot; | 
| PUSH | &quot;Push&quot; | 
| FORM | &quot;Form&quot; | 
| ROADSIDEASSISTANCE | &quot;RoadsideAssistance&quot; | 
| RICHLINK | &quot;RichLink&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:243.0.0_
