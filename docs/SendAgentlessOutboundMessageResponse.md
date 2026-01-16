# SendAgentlessOutboundMessageResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **conversationId** | **String** | The identifier of the conversation. |  [optional] |
| **fromAddress** | **String** | The sender of the message. |  [optional] |
| **toAddress** | **String** | The recipient of the message. |  [optional] |
| **messengerType** | [**MessengerTypeEnum**](#Enum--MessengerTypeEnum) | Type of messenger. |  [optional] |
| **textBody** | **String** | The body of the text message. (Deprecated - Instead use message.normalizedMessage.text) |  [optional] |
| **messagingTemplate** | [**SendMessagingTemplateRequest**](SendMessagingTemplateRequest) | The messaging template sent. (Deprecated - Instead use message.normalizedMessage.content[#].template) |  [optional] |
| **useExistingActiveConversation** | **Boolean** | Use an existing active conversation to send the agentless outbound message. Set this parameter to 'true' to use active conversation. Default value: false |  [optional] |
| **message** | [**MessageData**](MessageData) | Sent agentless outbound message in normalized format |  [optional] |
| **timestamp** | [**Date**](Date) | The time when the message was sent. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **user** | [**AddressableEntityRef**](AddressableEntityRef) | Details of the user created the job |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: MessengerTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SMS | &quot;sms&quot; | 
| WHATSAPP | &quot;whatsapp&quot; | 
| OPEN | &quot;open&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:244.0.0_
