# ConversationNormalizedMessage


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | Unique ID of the message. Message receipts will have the same ID as the message they reference. |  [optional] |
| **channel** | [**ConversationMessagingChannel**](ConversationMessagingChannel) | Channel-specific information that describes the message and the message channel/provider. |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | Message type. |  |
| **text** | **String** | Message text. |  [optional] |
| **content** | [**List&lt;ConversationMessageContent&gt;**](ConversationMessageContent) | List of content elements. |  [optional] |
| **events** | [**List&lt;ConversationMessageEvent&gt;**](ConversationMessageEvent) | List of event elements. |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | Message receipt status, only used with type Receipt. |  [optional] |
| **reasons** | [**List&lt;ConversationReason&gt;**](ConversationReason) | List of reasons for a message receipt that indicates the message has failed. Only used with Failed status. |  [optional] |
| **originatingEntity** | [**OriginatingEntityEnum**](#Enum--OriginatingEntityEnum) | Specifies if this message was sent by a human agent or bot. The platform may use this to apply appropriate provider policies. |  [optional] |
| **isFinalReceipt** | **Boolean** | Indicates if this is the last message receipt for this message, or if another message receipt can be expected. |  [optional] |
| **direction** | [**DirectionEnum**](#Enum--DirectionEnum) | The direction of the message. |  [optional] |
| **metadata** | **Map&lt;String, String&gt;** | Additional metadata about this message. |  [optional] |
| **byoSmsIntegrationId** | **String** | The internal id representing the customer supplied sms integration message. |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| TEXT | &quot;Text&quot; | 
| STRUCTURED | &quot;Structured&quot; | 
| RECEIPT | &quot;Receipt&quot; | 
| EVENT | &quot;Event&quot; | 
| MESSAGE | &quot;Message&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 


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


## Enum: OriginatingEntityEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| HUMAN | &quot;Human&quot; | 
| BOT | &quot;Bot&quot; | 


## Enum: DirectionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INBOUND | &quot;Inbound&quot; | 
| OUTBOUND | &quot;Outbound&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:223.0.0_
