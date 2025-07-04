# OpenStructuredResponseNormalizedMessage


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | Unique ID of the message. This ID is generated by Messaging Platform. Message receipts will have the same ID as the message they reference, as such should only be set when sending a message receipt. |  [optional] |
| **channel** | [**OpenMessagingChannel**](OpenMessagingChannel) | Channel-specific information that describes the message and the message channel/provider. |  |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | Message type. |  |
| **direction** | [**DirectionEnum**](#Enum--DirectionEnum) | The direction of the message. |  [optional] |
| **content** | [**List&lt;OpenInboundStructuredResponseNormalizedMessageContent&gt;**](OpenInboundStructuredResponseNormalizedMessageContent) | List of content elements. |  [optional] |
| **metadata** | **Map&lt;String, String&gt;** | Additional metadata about this message. |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| STRUCTURED | &quot;Structured&quot; | 


## Enum: DirectionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INBOUND | &quot;Inbound&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
