---
title: MessageData
---
## MessageData


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **providerMessageId** | <!----><!---->**String**<!----> | The unique identifier of the message from provider |  [optional] |
| **timestamp** | <!----><!---->[**Date**](Date.html)<!----> | The time when the message was received or sent. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **fromAddress** | <!----><!---->**String**<!----> | The sender of the text message. |  [optional] |
| **toAddress** | <!----><!---->**String**<!----> | The recipient of the text message. |  [optional] |
| **direction** | [**DirectionEnum**](#DirectionEnum)<!----> | The direction of the message. |  [optional] |
| **messengerType** | [**MessengerTypeEnum**](#MessengerTypeEnum)<!----> | Type of text messenger. |  [optional] |
| **textBody** | <!----><!---->**String**<!----> | The body of the text message. |  |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | The status of the message. |  |
| **media** | <!----><!---->[**List&lt;MessageMedia&gt;**](MessageMedia.html)<!----> | The media details associated to a message. |  [optional] |
| **stickers** | <!----><!---->[**List&lt;MessageSticker&gt;**](MessageSticker.html)<!----> | The sticker details associated to a message. |  [optional] |
| **normalizedMessage** | <!----><!---->[**ConversationNormalizedMessage**](ConversationNormalizedMessage.html)<!----> | The message into normalized format |  [optional] |
| **normalizedReceipts** | <!----><!---->[**List&lt;ConversationNormalizedMessage&gt;**](ConversationNormalizedMessage.html)<!----> | The delivery event associated with this message in normalized format, if the message direction was outbound |  [optional] |
| **createdBy** | <!----><!---->[**User**](User.html)<!----> | User who sent this message. |  [optional] |
| **conversationId** | <!----><!---->**String**<!----> | The id of the conversation of this message. |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="DirectionEnum"></a>

## Enum: DirectionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INBOUND | &quot;inbound&quot; | 
| OUTBOUND | &quot;outbound&quot; | 
{: class="table table-striped"}


<a name="MessengerTypeEnum"></a>

## Enum: MessengerTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SMS | &quot;sms&quot; | 
| FACEBOOK | &quot;facebook&quot; | 
| TWITTER | &quot;twitter&quot; | 
| LINE | &quot;line&quot; | 
| WHATSAPP | &quot;whatsapp&quot; | 
| WEBMESSAGING | &quot;webmessaging&quot; | 
| INSTAGRAM | &quot;instagram&quot; | 
| OPEN | &quot;open&quot; | 
{: class="table table-striped"}


<a name="StatusEnum"></a>

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
{: class="table table-striped"}



