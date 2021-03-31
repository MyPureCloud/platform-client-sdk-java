---
title: SendAgentlessOutboundMessageRequest
---
## SendAgentlessOutboundMessageRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **fromAddress** | <!----><!---->**String**<!----> | The messaging address of the sender of the message. For an SMS messenger type, this must be a currently provisioned SMS phone number. For a WhatsApp messenger type use the provisioned WhatsApp integration’s ID |  |
| **toAddress** | <!----><!---->**String**<!----> | The messaging address of the recipient of the message. For an SMS messenger type, the phone number address must be in E.164 format. E.g. +13175555555 or +34234234234. |  |
| **toAddressMessengerType** | [**ToAddressMessengerTypeEnum**](#ToAddressMessengerTypeEnum)<!----> | The recipient messaging address messenger type. Currently SMS and WhatsApp is the only supported type. |  |
| **textBody** | <!----><!---->**String**<!----> | The text of the message to send. This field is required in the case of SMS messenger type |  [optional] |
| **messagingTemplate** | <!----><!---->[**MessagingTemplateRequest**](MessagingTemplateRequest.html)<!----> | The messaging template to use in the case of WhatsApp messenger type. This field is required when using WhatsApp messenger type |  [optional] |
{: class="table table-striped"}


<a name="ToAddressMessengerTypeEnum"></a>

## Enum: ToAddressMessengerTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| SMS | &quot;sms&quot; |
| FACEBOOK | &quot;facebook&quot; |
| TWITTER | &quot;twitter&quot; |
| LINE | &quot;line&quot; |
| WHATSAPP | &quot;whatsapp&quot; |
| WEBMESSAGING | &quot;webmessaging&quot; |
| OPEN | &quot;open&quot; |
{: class="table table-striped"}



