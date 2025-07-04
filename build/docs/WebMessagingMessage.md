# WebMessagingMessage


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | Unique ID of the message. This ID is generated by Messaging Platform. Message receipts will have the same ID as the message they reference. |  [optional] |
| **channel** | [**WebMessagingChannel**](WebMessagingChannel) | Channel-specific information that describes the message and the message channel/provider. |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | Message type. |  [optional] |
| **text** | **String** | Message text. |  [optional] |
| **content** | [**List&lt;WebMessagingContent&gt;**](WebMessagingContent) | List of content elements. |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | Message receipt status, only used with type Receipt. |  [optional] |
| **reasons** | [**List&lt;Reason&gt;**](Reason) | List of reasons for a message receipt that indicates the message has failed. Only used with Failed status. |  [optional] |
| **events** | [**List&lt;WebMessagingEvent&gt;**](WebMessagingEvent) | List of event elements. |  [optional] |
| **direction** | [**DirectionEnum**](#Enum--DirectionEnum) | The direction of the message.  Direction is always from the perspective of the Genesys Cloud platform.  An Inbound message is one sent from a guest to the Genesys Cloud Platform.  An Outbound message is one sent from the Genesys Cloud Platform to a guest. |  [optional] |
| **originatingEntity** | [**OriginatingEntityEnum**](#Enum--OriginatingEntityEnum) | Specifies if this message was sent by a human agent or bot. The platform may use this to apply appropriate provider policies. |  [optional] |
| **metadata** | **Map&lt;String, String&gt;** | Additional metadata about this message. |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| TEXT | &quot;Text&quot; | 
| STRUCTURED | &quot;Structured&quot; | 
| RECEIPT | &quot;Receipt&quot; | 
| EVENT | &quot;Event&quot; | 


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


## Enum: DirectionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INBOUND | &quot;Inbound&quot; | 
| OUTBOUND | &quot;Outbound&quot; | 


## Enum: OriginatingEntityEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| HUMAN | &quot;Human&quot; | 
| BOT | &quot;Bot&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
