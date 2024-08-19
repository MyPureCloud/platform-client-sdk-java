# ConversationMessageEventTopicMessageDetails


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **message** | [**ConversationMessageEventTopicUriReference**](ConversationMessageEventTopicUriReference) |  |  [optional] |
| **messageTime** | [**Date**](Date) |  |  [optional] |
| **messageSegmentCount** | **Integer** |  |  [optional] |
| **messageStatus** | [**MessageStatusEnum**](#Enum--MessageStatusEnum) |  |  [optional] |
| **media** | [**List&lt;ConversationMessageEventTopicMessageMedia&gt;**](ConversationMessageEventTopicMessageMedia) |  |  [optional] |
| **stickers** | [**List&lt;ConversationMessageEventTopicMessageSticker&gt;**](ConversationMessageEventTopicMessageSticker) |  |  [optional] |
| **errorInfo** | [**ConversationMessageEventTopicErrorDetails**](ConversationMessageEventTopicErrorDetails) |  |  [optional] |
| **messageMetadata** | [**ConversationMessageEventTopicMessageMetadata**](ConversationMessageEventTopicMessageMetadata) |  |  [optional] |
{: class="table table-striped"}


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
| REMOVED | &quot;removed&quot; | 
| PUBLISHED | &quot;published&quot; | 
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:208.0.0_
