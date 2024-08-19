# MessageDetails


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **messageId** | **String** | UUID identifying the message media. |  [optional] |
| **messageURI** | **String** | A URI for this message entity. |  [optional] |
| **messageStatus** | [**MessageStatusEnum**](#Enum--MessageStatusEnum) | Indicates the delivery status of the message. |  [optional] |
| **messageSegmentCount** | **Integer** | The message segment count, greater than 1 if the message content was split into multiple parts for this message type, e.g. SMS character limits. |  [optional] |
| **messageTime** | [**Date**](Date) | The time when the message was sent or received. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **media** | [**List&lt;MessageMedia&gt;**](MessageMedia) | The media (images, files, etc) associated with this message, if any |  [optional] |
| **stickers** | [**List&lt;MessageSticker&gt;**](MessageSticker) | One or more stickers associated with this message, if any |  [optional] |
| **messageMetadata** | [**ConversationMessageMetadata**](ConversationMessageMetadata) | Information that describes the content of the message, if any |  [optional] |
| **errorInfo** | [**ErrorBody**](ErrorBody) | Provider specific error information for a communication. |  [optional] |
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
