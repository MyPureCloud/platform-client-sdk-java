---
title: AgentlessEmailSendRequestDto
---
## AgentlessEmailSendRequestDto


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **senderType** | [**SenderTypeEnum**](#SenderTypeEnum)<!----> | The direction of the message. |  |
| **conversationId** | <!----><!---->**String**<!----> | The identifier of the conversation. This must be an email interaction. |  [optional] |
| **fromAddress** | <!----><!---->[**EmailAddress**](EmailAddress.html)<!----> | The sender of the message. |  |
| **toAddresses** | <!----><!---->[**List&lt;EmailAddress&gt;**](EmailAddress.html)<!----> | The recipient of the message. We currently support one recipient only. |  |
| **replyToAddress** | <!----><!---->[**EmailAddress**](EmailAddress.html)<!----> | The address to use for reply. |  [optional] |
| **subject** | <!----><!---->**String**<!----> | The subject of the message. |  [optional] |
| **textBody** | <!----><!---->**String**<!----> | The Content of the message, in plain text. |  [optional] |
| **htmlBody** | <!----><!---->**String**<!----> | The Content of the message, in HTML. Links, images and styles are allowed |  [optional] |
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



