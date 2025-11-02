# MessageData


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **providerMessageId** | **String** | The unique identifier of the message from provider |  [optional] |
| **timestamp** | [**Date**](Date) | The time when the message was received or sent. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **fromAddress** | **String** | The sender of the text message. |  [optional] |
| **toAddress** | **String** | The recipient of the text message. |  [optional] |
| **direction** | [**DirectionEnum**](#Enum--DirectionEnum) | The direction of the message. |  [optional] |
| **messengerType** | [**MessengerTypeEnum**](#Enum--MessengerTypeEnum) | Type of text messenger. |  [optional] |
| **textBody** | **String** | The body of the text message. (Deprecated - Instead use normalizedMessage.text) |  |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The status of the message. |  |
| **media** | [**List&lt;MessageMedia&gt;**](MessageMedia) | The media details associated to a message. (Deprecated - Instead use normalizedMessage.content[index].attachment) |  [optional] |
| **normalizedMessage** | [**ConversationNormalizedMessage**](ConversationNormalizedMessage) | The message into normalized format |  [optional] |
| **normalizedReceipts** | [**List&lt;ConversationNormalizedMessage&gt;**](ConversationNormalizedMessage) | The delivery event associated with this message in normalized format, if the message direction was outbound |  [optional] |
| **createdBy** | [**User**](User) | User who sent this message. |  [optional] |
| **conversationId** | **String** | The id of the conversation of this message. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: DirectionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INBOUND | &quot;inbound&quot; | 
| OUTBOUND | &quot;outbound&quot; | 


## Enum: MessengerTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SMS | &quot;sms&quot; | 
| FACEBOOK | &quot;facebook&quot; | 
| TWITTER | &quot;twitter&quot; | 
| WHATSAPP | &quot;whatsapp&quot; | 
| WEBMESSAGING | &quot;webmessaging&quot; | 
| INSTAGRAM | &quot;instagram&quot; | 
| OPEN | &quot;open&quot; | 
| APPLE | &quot;apple&quot; | 


## Enum: StatusEnum

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




_com.mypurecloud.sdk.v2:platform-client-v2:236.0.0_
