---
title: MessageDetails
---
## MessageDetails


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **messageId** | <!----><!---->**String**<!----> | UUID identifying the message media. |  [optional] |
| **messageURI** | <!----><!---->**String**<!----> | A URI for this message entity. |  [optional] |
| **messageStatus** | [**MessageStatusEnum**](#MessageStatusEnum)<!----> | Indicates the delivery status of the message. |  [optional] |
| **messageSegmentCount** | <!----><!---->**Integer**<!----> | The message segment count, greater than 1 if the message content was split into multiple parts for this message type, e.g. SMS character limits. |  [optional] |
| **messageTime** | <!----><!---->[**Date**](Date.html)<!----> | The time when the message was sent or received. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **media** | <!----><!---->[**List&lt;MessageMedia&gt;**](MessageMedia.html)<!----> | The media (images, files, etc) associated with this message, if any |  [optional] |
| **stickers** | <!----><!---->[**List&lt;MessageSticker&gt;**](MessageSticker.html)<!----> | One or more stickers associated with this message, if any |  [optional] |
| **messageMetadata** | <!----><!---->[**ConversationMessageMetadata**](ConversationMessageMetadata.html)<!----> | Information that describes the content of the message, if any |  [optional] |
| **errorInfo** | <!----><!---->[**ErrorBody**](ErrorBody.html)<!----> | Provider specific error information for a communication. |  [optional] |
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
| REMOVED | &quot;removed&quot; | 
{: class="table table-striped"}



