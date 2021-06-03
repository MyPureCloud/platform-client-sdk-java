---
title: MessageContent
---
## MessageContent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **contentType** | [**ContentTypeEnum**](#ContentTypeEnum)<!----> | Type of this content element. If contentType = \&quot;Attachment\&quot; only one item is allowed. |  |
| **location** | <!----><!---->[**ContentLocation**](ContentLocation.html)<!----> | Location content. |  [optional] |
| **attachment** | <!----><!---->[**ContentAttachment**](ContentAttachment.html)<!----> | Attachment content. |  [optional] |
| **quickReply** | <!----><!---->[**ContentQuickReply**](ContentQuickReply.html)<!----> | Quick reply content. |  [optional] |
| **buttonResponse** | <!----><!---->[**ContentButtonResponse**](ContentButtonResponse.html)<!----> | Button response content. |  [optional] |
| **generic** | <!----><!---->[**ContentGeneric**](ContentGeneric.html)<!----> | Generic content. |  [optional] |
| **list** | <!----><!---->[**ContentList**](ContentList.html)<!----> | List content. |  [optional] |
| **template** | <!----><!---->[**ContentNotificationTemplate**](ContentNotificationTemplate.html)<!----> | Template notification content. |  [optional] |
| **reactions** | <!----><!---->[**List&lt;ContentReaction&gt;**](ContentReaction.html)<!----> | A set of reactions to a message. |  [optional] |
| **mention** | <!----><!---->[**MessagingRecipient**](MessagingRecipient.html)<!----> | Mention content. |  [optional] |
| **postback** | <!----><!---->[**ContentPostback**](ContentPostback.html)<!----> | Structured message postback (Deprecated). |  [optional] |
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
| GENERICTEMPLATE | &quot;GenericTemplate&quot; |
| LISTTEMPLATE | &quot;ListTemplate&quot; |
| POSTBACK | &quot;Postback&quot; |
| REACTIONS | &quot;Reactions&quot; |
| MENTION | &quot;Mention&quot; |
| BUTTONRESPONSE | &quot;ButtonResponse&quot; |
{: class="table table-striped"}



