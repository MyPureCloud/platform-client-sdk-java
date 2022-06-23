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
| **errorInfo** | <!----><!---->[**QueueConversationMessageEventTopicErrorDetails**](QueueConversationMessageEventTopicErrorDetails.html)<!----> |  |  [optional] |
| **messageMetadata** | <!----><!---->[**QueueConversationMessageEventTopicMessageMetadata**](QueueConversationMessageEventTopicMessageMetadata.html)<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="MessageStatusEnum"></a>

## Enum: MessageStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| QUEUED | &quot;queued&quot; | 
| SENT | &quot;sent&quot; | 
| FAILED | &quot;failed&quot; | 
| RECEIVED | &quot;received&quot; | 
| DELIVERY_SUCCESS | &quot;delivery-success&quot; | 
| DELIVERY_FAILED | &quot;delivery-failed&quot; | 
| READ | &quot;read&quot; | 
{: class="table table-striped"}



