---
title: ConversationMessageContent
---
## ConversationMessageContent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **contentType** | [**ContentTypeEnum**](#ContentTypeEnum)<!----> | Type of this content element. |  |
| **location** | <!----><!---->[**ConversationContentLocation**](ConversationContentLocation.html)<!----> | Location content. |  [optional] |
| **attachment** | <!----><!---->[**ConversationContentAttachment**](ConversationContentAttachment.html)<!----> | Attachment content. |  [optional] |
| **quickReply** | <!----><!---->[**ConversationContentQuickReply**](ConversationContentQuickReply.html)<!----> | Quick reply content. |  [optional] |
| **buttonResponse** | <!----><!---->[**ConversationContentButtonResponse**](ConversationContentButtonResponse.html)<!----> | Button response content. |  [optional] |
| **template** | <!----><!---->[**ConversationContentNotificationTemplate**](ConversationContentNotificationTemplate.html)<!----> | Template notification content. |  [optional] |
| **story** | <!----><!---->[**ConversationContentStory**](ConversationContentStory.html)<!----> | Ephemeral story content. |  [optional] |
| **card** | <!----><!---->[**ConversationContentCard**](ConversationContentCard.html)<!----> | Card content |  [optional] |
| **carousel** | <!----><!---->[**ConversationContentCarousel**](ConversationContentCarousel.html)<!----> | Carousel content |  [optional] |
{: class="table table-striped"}


<a name="ContentTypeEnum"></a>

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
| UNKNOWN | &quot;Unknown&quot; | 
{: class="table table-striped"}



