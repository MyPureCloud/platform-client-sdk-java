# ConversationMessagingChannel


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The integration ID. |  [optional] |
| **platform** | [**PlatformEnum**](#Enum--PlatformEnum) | The provider type. |  [optional] |
| **messageId** | **String** | Unique provider ID of the message such as a Facebook message ID. |  [optional] |
| **to** | [**ConversationMessagingToRecipient**](ConversationMessagingToRecipient) | Information about the recipient the message is sent to. |  [optional] |
| **from** | [**ConversationMessagingFromRecipient**](ConversationMessagingFromRecipient) | Information about the recipient the message is received from. |  [optional] |
| **time** | [**Date**](Date) | Original time of the event. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | Time the message was edited. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateDeleted** | [**Date**](Date) | Time the message was deleted. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |


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
| APPLE | &quot;Apple&quot; | 
| SMS | &quot;Sms&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:214.0.0_
