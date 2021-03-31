---
title: SendAgentlessOutboundMessageResponse
---
## SendAgentlessOutboundMessageResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **conversationId** | <!----><!---->**String**<!----> | The identifier of the conversation. |  [optional] |
| **fromAddress** | <!----><!---->**String**<!----> | The sender of the message. |  [optional] |
| **toAddress** | <!----><!---->**String**<!----> | The recipient of the message. |  [optional] |
| **messengerType** | [**MessengerTypeEnum**](#MessengerTypeEnum)<!----> | Type of messenger. |  [optional] |
| **textBody** | <!----><!---->**String**<!----> | The body of the text message. |  [optional] |
| **messagingTemplate** | <!----><!---->[**MessagingTemplateRequest**](MessagingTemplateRequest.html)<!----> | The messaging template sent |  [optional] |
| **timestamp** | <!----><!---->[**Date**](Date.html)<!----> | The time when the message was sent. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
| **user** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.html)<!----> | Details of the user created the job |  [optional] |
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
| OPEN | &quot;open&quot; |
{: class="table table-striped"}



