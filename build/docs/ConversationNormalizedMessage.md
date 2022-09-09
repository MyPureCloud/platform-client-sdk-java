---
title: ConversationNormalizedMessage
---
## ConversationNormalizedMessage


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | Unique ID of the message. Message receipts will have the same ID as the message they reference. |  [optional] |
| **channel** | <!----><!---->[**ConversationMessagingChannel**](ConversationMessagingChannel.html)<!----> | Channel-specific information that describes the message and the message channel/provider. |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | Message type. |  |
| **text** | <!----><!---->**String**<!----> | Message text. |  [optional] |
| **content** | <!----><!---->[**List&lt;ConversationMessageContent&gt;**](ConversationMessageContent.html)<!----> | List of content elements. |  [optional] |
| **events** | <!----><!---->[**List&lt;ConversationMessageEvent&gt;**](ConversationMessageEvent.html)<!----> | List of event elements. |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | Message receipt status, only used with type Receipt. |  [optional] |
| **reasons** | <!----><!---->[**List&lt;ConversationReason&gt;**](ConversationReason.html)<!----> | List of reasons for a message receipt that indicates the message has failed. Only used with Failed status. |  [optional] |
| **originatingEntity** | [**OriginatingEntityEnum**](#OriginatingEntityEnum)<!----> | Specifies if this message was sent by a human agent or bot. The platform may use this to apply appropriate provider policies. |  [optional] |
| **isFinalReceipt** | <!----><!---->**Boolean**<!----> | Indicates if this is the last message receipt for this message, or if another message receipt can be expected. |  [optional] |
| **direction** | [**DirectionEnum**](#DirectionEnum)<!----> | The direction of the message. |  [optional] |
| **metadata** | <!----><!---->**Map&lt;String, String&gt;**<!----> | Additional metadata about this message. |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| TEXT | &quot;Text&quot; | 
| STRUCTURED | &quot;Structured&quot; | 
| RECEIPT | &quot;Receipt&quot; | 
| EVENT | &quot;Event&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SENT | &quot;Sent&quot; | 
| DELIVERED | &quot;Delivered&quot; | 
| READ | &quot;Read&quot; | 
| FAILED | &quot;Failed&quot; | 
| PUBLISHED | &quot;Published&quot; | 
| REMOVED | &quot;Removed&quot; | 
{: class="table table-striped"}


<a name="OriginatingEntityEnum"></a>

## Enum: OriginatingEntityEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| HUMAN | &quot;Human&quot; | 
| BOT | &quot;Bot&quot; | 
{: class="table table-striped"}


<a name="DirectionEnum"></a>

## Enum: DirectionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INBOUND | &quot;Inbound&quot; | 
| OUTBOUND | &quot;Outbound&quot; | 
{: class="table table-striped"}



