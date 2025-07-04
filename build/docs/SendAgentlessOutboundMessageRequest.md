# SendAgentlessOutboundMessageRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **fromAddress** | **String** | The messaging address of the sender of the message. For an SMS messenger type, this must be a currently provisioned SMS phone number. For a WhatsApp messenger type use the provisioned WhatsApp integration’s ID |  |
| **toAddress** | **String** | The messaging address of the recipient of the message. For an SMS messenger type, the phone number address must be in E.164 format. E.g. +13175555555 or +34234234234. For WhatsApp messenger type, use a WhatsApp ID of a phone number. E.g for a E.164 formatted phone number `+13175555555`, a WhatsApp ID would be 13175555555 |  |
| **toAddressMessengerType** | [**ToAddressMessengerTypeEnum**](#Enum--ToAddressMessengerTypeEnum) | The recipient messaging address messenger type. |  |
| **textBody** | **String** | The text of the message to send. This field is required in the case of SMS messenger type. Maximum character counts are: SMS - 765 characters, other channels - 2000 characters. |  [optional] |
| **messagingTemplate** | [**SendMessagingTemplateRequest**](SendMessagingTemplateRequest) | The messaging template to use in the case of WhatsApp messenger type. This field is required when using WhatsApp messenger type |  [optional] |
| **useExistingActiveConversation** | **Boolean** | Use an existing active conversation to send the agentless outbound message. Set this parameter to 'true' to use active conversation. Default value: false |  [optional] |


## Enum: ToAddressMessengerTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SMS | &quot;sms&quot; | 
| WHATSAPP | &quot;whatsapp&quot; | 
| OPEN | &quot;open&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
