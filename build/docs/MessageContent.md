---
title: MessageContent
---
## MessageContent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **contentType** | [**ContentTypeEnum**](#ContentTypeEnum)<!----> | Type of this content element. If contentType = \&quot;Attachment\&quot; only one item is allowed. |  |
| **location** | <!----><!---->[**ContentLocation**](ContentLocation.html)<!----> | Location object |  [optional] |
| **attachment** | <!----><!---->[**ContentAttachment**](ContentAttachment.html)<!----> | Attachment object |  [optional] |
| **quickReply** | <!----><!---->[**ContentQuickReply**](ContentQuickReply.html)<!----> | Quick reply object |  [optional] |
| **generic** | <!----><!---->[**ContentGeneric**](ContentGeneric.html)<!----> | Generic content object |  [optional] |
| **list** | <!----><!---->[**ContentList**](ContentList.html)<!----> | List content object |  [optional] |
| **template** | <!----><!---->[**ContentNotificationTemplate**](ContentNotificationTemplate.html)<!----> | Template notification object |  [optional] |
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
{: class="table table-striped"}



