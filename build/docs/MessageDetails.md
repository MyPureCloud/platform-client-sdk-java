# MessageDetails


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **messageId** | **String** | UUID identifying the message media. |  [optional] |
| **messageURI** | **String** | A URI for this message entity. |  [optional] |
| **messageStatus** | [**MessageStatusEnum**](#Enum--MessageStatusEnum) | Indicates the delivery status of the message. |  [optional] |
| **messageSegmentCount** | **Integer** | The message segment count, greater than 1 if the message content was split into multiple parts for this message type, e.g. SMS character limits. |  [optional] |
| **messageTime** | [**Date**](Date) | The time when the message was sent or received. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **media** | [**List&lt;MessageMedia&gt;**](MessageMedia) | Deprecated: Use the API /api/v2/conversations/messages/{conversationId}/messages/{messageId} to get the associated media. |  [optional] |
| **stickers** | [**List&lt;MessageSticker&gt;**](MessageSticker) | Deprecated: This attribute is no longer used. Messages have not included associated stickers for a long time. |  [optional] |
| **messageMetadata** | [**ConversationMessageMetadata**](ConversationMessageMetadata) | Information that describes the content of the message, if any |  [optional] |
| **socialVisibility** | [**SocialVisibilityEnum**](#Enum--SocialVisibilityEnum) | For social media messages, the visibility of the message in the originating social platform |  [optional] |
| **errorInfo** | [**ErrorBody**](ErrorBody) | Provider specific error information for a communication. |  [optional] |


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




_com.mypurecloud.sdk.v2:platform-client-v2:235.0.0_
