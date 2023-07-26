---
title: AgentlessEmailSendResponseDto
---
## AgentlessEmailSendResponseDto


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **conversationId** | <!----><!---->**String**<!----> | The identifier of the conversation. |  |
| **senderType** | [**SenderTypeEnum**](#SenderTypeEnum)<!----> | The identifier of the external participant of the given conversation. |  |
| **fromAddress** | <!----><!---->[**EmailAddress**](EmailAddress.html)<!----> | The sender of the message. |  |
| **toAddresses** | <!----><!---->[**List&lt;EmailAddress&gt;**](EmailAddress.html)<!----> | The recipient of the message. We currently support one recipient only. |  |
| **replyToAddress** | <!----><!---->[**EmailAddress**](EmailAddress.html)<!----> | The address to use for reply. |  [optional] |
| **subject** | <!----><!---->**String**<!----> | The subject of the message. |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | The message creation timestamp. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="SenderTypeEnum"></a>

## Enum: SenderTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| OUTBOUND | &quot;Outbound&quot; | 
| INBOUND | &quot;Inbound&quot; | 
| INTEGRATION | &quot;Integration&quot; | 
{: class="table table-striped"}



