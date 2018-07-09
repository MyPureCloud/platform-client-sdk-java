---
title: MessageConversationNotificationMessages
---
## MessageConversationNotificationMessages


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **message** | [**MessageConversationNotificationUriReference**](MessageConversationNotificationUriReference.html) |  |  [optional] |
| **messageTime** | [**Date**](Date.html) |  |  [optional] |
| **messageSegmentCount** | **Integer** |  |  [optional] |
| **messageStatus** | [**MessageStatusEnum**](#MessageStatusEnum) |  |  [optional] |
| **media** | [**List&lt;ConversationNotificationMedia&gt;**](ConversationNotificationMedia.html) |  |  [optional] |
| **stickers** | [**List&lt;ConversationNotificationStickers&gt;**](ConversationNotificationStickers.html) |  |  [optional] |
{: class="table table-striped"}


<a name="MessageStatusEnum"></a>

## Enum: MessageStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| QUEUED | &quot;QUEUED&quot; |
| SENT | &quot;SENT&quot; |
| FAILED | &quot;FAILED&quot; |
| RECEIVED | &quot;RECEIVED&quot; |
{: class="table table-striped"}


