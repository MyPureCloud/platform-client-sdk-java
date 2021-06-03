---
title: ConversationMessageContent
---
## ConversationMessageContent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **contentType** | [**ContentTypeEnum**](#ContentTypeEnum)<!----> | Type of this content element. If contentType = \&quot;Attachment\&quot; only one item is allowed. |  |
| **attachment** | <!----><!---->[**ConversationContentAttachment**](ConversationContentAttachment.html)<!----> | Attachment content. |  [optional] |
| **quickReply** | <!----><!---->[**ConversationContentQuickReply**](ConversationContentQuickReply.html)<!----> | Quick reply content. |  [optional] |
| **template** | <!----><!---->[**ConversationContentNotificationTemplate**](ConversationContentNotificationTemplate.html)<!----> | Template notification content. |  [optional] |
| **buttonResponse** | <!----><!---->[**ConversationContentButtonResponse**](ConversationContentButtonResponse.html)<!----> | Button response content. |  [optional] |
{: class="table table-striped"}


<a name="ContentTypeEnum"></a>

## Enum: ContentTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ATTACHMENT | &quot;Attachment&quot; |
| QUICKREPLY | &quot;QuickReply&quot; |
| NOTIFICATION | &quot;Notification&quot; |
| BUTTONRESPONSE | &quot;ButtonResponse&quot; |
{: class="table table-striped"}



