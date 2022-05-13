---
title: ConversationMessagingChannel
---
## ConversationMessagingChannel


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The integration ID. |  [optional] |
| **platform** | [**PlatformEnum**](#PlatformEnum)<!----> | The provider type. |  [optional] |
| **messageId** | <!----><!---->**String**<!----> | Unique provider ID of the message such as a Facebook message ID. |  [optional] |
| **to** | <!----><!---->[**ConversationMessagingToRecipient**](ConversationMessagingToRecipient.html)<!----> | Information about the recipient the message is sent to. |  [optional] |
| **from** | <!----><!---->[**ConversationMessagingFromRecipient**](ConversationMessagingFromRecipient.html)<!----> | Information about the recipient the message is received from. |  [optional] |
| **time** | <!----><!---->[**Date**](Date.html)<!----> | Original time of the event. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | Time the message was edited. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateDeleted** | <!----><!---->[**Date**](Date.html)<!----> | Time the message was deleted. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
{: class="table table-striped"}


<a name="PlatformEnum"></a>

## Enum: PlatformEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| TWITTER | &quot;Twitter&quot; | 
| FACEBOOK | &quot;Facebook&quot; | 
| INSTAGRAM | &quot;Instagram&quot; | 
| LINE | &quot;Line&quot; | 
| WHATSAPP | &quot;Whatsapp&quot; | 
| WEBMESSAGING | &quot;WebMessaging&quot; | 
| OPEN | &quot;Open&quot; | 
| SMS | &quot;Sms&quot; | 
{: class="table table-striped"}



