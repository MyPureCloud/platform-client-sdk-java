---
title: ConversationMessageContent
---
## ConversationMessageContent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **contentType** | [**ContentTypeEnum**](#ContentTypeEnum)<!----> | Type of this content element. If contentType = \&quot;Attachment\&quot; only one item is allowed. |  |
| **location** | <!----><!---->[**ConversationContentLocation**](ConversationContentLocation.html)<!----> | Location content. |  [optional] |
| **story** | <!----><!---->[**ConversationContentStory**](ConversationContentStory.html)<!----> | Ephemeral story content. |  [optional] |
| **attachment** | <!----><!---->[**ConversationContentAttachment**](ConversationContentAttachment.html)<!----> | Attachment content. |  [optional] |
| **quickReply** | <!----><!---->[**ConversationContentQuickReply**](ConversationContentQuickReply.html)<!----> | Quick reply content. |  [optional] |
| **template** | <!----><!---->[**ConversationContentNotificationTemplate**](ConversationContentNotificationTemplate.html)<!----> | Template notification content. |  [optional] |
| **buttonResponse** | <!----><!---->[**ConversationContentButtonResponse**](ConversationContentButtonResponse.html)<!----> | Button response content. |  [optional] |
| **generic** | <!----><!---->[**ConversationContentGeneric**](ConversationContentGeneric.html)<!----> | Generic Template Object |  [optional] |
| **card** | <!----><!---->[**ConversationContentCard**](ConversationContentCard.html)<!----> | Card (Generic Template) Object |  [optional] |
| **carousel** | <!----><!---->[**ConversationContentCarousel**](ConversationContentCarousel.html)<!----> | Carousel (Multiple Generic Template) Object |  [optional] |
{: class="table table-striped"}


<a name="ContentTypeEnum"></a>

## Enum: ContentTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ATTACHMENT | &quot;Attachment&quot; |
| LOCATION | &quot;Location&quot; |
| STORY | &quot;Story&quot; |
| QUICKREPLY | &quot;QuickReply&quot; |
| NOTIFICATION | &quot;Notification&quot; |
| BUTTONRESPONSE | &quot;ButtonResponse&quot; |
| GENERICTEMPLATE | &quot;GenericTemplate&quot; |
| CARD | &quot;Card&quot; |
| CAROUSEL | &quot;Carousel&quot; |
{: class="table table-striped"}



