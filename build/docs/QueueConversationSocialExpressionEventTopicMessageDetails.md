# QueueConversationSocialExpressionEventTopicMessageDetails


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **messageId** | **String** | UUID identifying the message media. |  [optional] |
| **messageTime** | [**Date**](Date) | The time when the message was sent or received. |  [optional] |
| **messageStatus** | [**MessageStatusEnum**](#Enum--MessageStatusEnum) | Indicates the delivery status of the message. |  [optional] |
| **messageSegmentCount** | **Long** | The message segment count, greater than 1 if the message content was split into multiple parts for this message type, e.g. SMS character limits. |  [optional] |
| **media** | [**List&lt;QueueConversationSocialExpressionEventTopicMessageMedia&gt;**](QueueConversationSocialExpressionEventTopicMessageMedia) | The media (images, files, etc) associated with this message, if any |  [optional] |
| **errorInfo** | [**QueueConversationSocialExpressionEventTopicErrorDetails**](QueueConversationSocialExpressionEventTopicErrorDetails) | Detailed information about an error response. |  [optional] |
| **stickers** | [**List&lt;QueueConversationSocialExpressionEventTopicMessageSticker&gt;**](QueueConversationSocialExpressionEventTopicMessageSticker) | A list of stickers included in the message |  [optional] |
| **messageMetadata** | [**QueueConversationSocialExpressionEventTopicMessageMetadata**](QueueConversationSocialExpressionEventTopicMessageMetadata) |  |  [optional] |
| **socialVisibility** | [**SocialVisibilityEnum**](#Enum--SocialVisibilityEnum) | For social media messages, the visibility of the message in the originating social platform |  [optional] |


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


## Enum: SocialVisibilityEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PRIVATE | &quot;private&quot; | 
| PUBLIC | &quot;public&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:239.0.0_
