# AgentlessEmailSendResponseDto


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **conversationId** | **String** | The identifier of the conversation. |  |
| **senderType** | [**SenderTypeEnum**](#Enum--SenderTypeEnum) | The identifier of the external participant of the given conversation. |  |
| **fromAddress** | [**EmailAddress**](EmailAddress) | The sender of the message. |  |
| **toAddresses** | [**List&lt;EmailAddress&gt;**](EmailAddress) | The recipient of the message. We currently support one recipient only. |  |
| **replyToAddress** | [**EmailAddress**](EmailAddress) | The address to use for reply. |  [optional] |
| **subject** | **String** | The subject of the message. |  [optional] |
| **dateCreated** | [**Date**](Date) | The message creation timestamp. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: SenderTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| OUTBOUND | &quot;Outbound&quot; | 
| INBOUND | &quot;Inbound&quot; | 
| INTEGRATION | &quot;Integration&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:216.0.0_
