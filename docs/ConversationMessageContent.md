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
{: class="table table-striped"}


## Enum: ContentTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
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
| UNKNOWN | &quot;Unknown&quot; | 
{: class="table table-striped"}



