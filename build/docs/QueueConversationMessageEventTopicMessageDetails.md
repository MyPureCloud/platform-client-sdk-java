# QueueConversationMessageEventTopicMessageDetails


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **message** | [**QueueConversationMessageEventTopicUriReference**](QueueConversationMessageEventTopicUriReference) |  |  [optional] |
| **messageTime** | [**Date**](Date) |  |  [optional] |
| **messageSegmentCount** | **Integer** |  |  [optional] |
| **messageStatus** | [**MessageStatusEnum**](#Enum--MessageStatusEnum) |  |  [optional] |
| **media** | [**List&lt;QueueConversationMessageEventTopicMessageMedia&gt;**](QueueConversationMessageEventTopicMessageMedia) |  |  [optional] |
| **stickers** | [**List&lt;QueueConversationMessageEventTopicMessageSticker&gt;**](QueueConversationMessageEventTopicMessageSticker) |  |  [optional] |
| **errorInfo** | [**QueueConversationMessageEventTopicErrorDetails**](QueueConversationMessageEventTopicErrorDetails) |  |  [optional] |
| **messageMetadata** | [**QueueConversationMessageEventTopicMessageMetadata**](QueueConversationMessageEventTopicMessageMetadata) |  |  [optional] |
| **socialVisibility** | [**SocialVisibilityEnum**](#Enum--SocialVisibilityEnum) |  |  [optional] |


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




_com.mypurecloud.sdk.v2:platform-client-v2:217.0.0_
