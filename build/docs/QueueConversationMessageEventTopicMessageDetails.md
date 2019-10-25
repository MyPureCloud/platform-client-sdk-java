---
title: QueueConversationMessageEventTopicMessageDetails
---
## QueueConversationMessageEventTopicMessageDetails


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **message** | <!----><!---->[**QueueConversationMessageEventTopicUriReference**](QueueConversationMessageEventTopicUriReference.html)<!----> |  |  [optional] |
| **messageTime** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **messageSegmentCount** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **messageStatus** | [**MessageStatusEnum**](#MessageStatusEnum)<!----> |  |  [optional] |
| **media** | <!----><!---->[**List&lt;QueueConversationMessageEventTopicMessageMedia&gt;**](QueueConversationMessageEventTopicMessageMedia.html)<!----> |  |  [optional] |
| **stickers** | <!----><!---->[**List&lt;QueueConversationMessageEventTopicMessageSticker&gt;**](QueueConversationMessageEventTopicMessageSticker.html)<!----> |  |  [optional] |
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
| DELIVERY_SUCCESS | &quot;DELIVERY_SUCCESS&quot; |
| DELIVERY_FAILED | &quot;DELIVERY_FAILED&quot; |
| READ | &quot;READ&quot; |
{: class="table table-striped"}



