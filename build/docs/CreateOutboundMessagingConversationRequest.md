---
title: CreateOutboundMessagingConversationRequest
---
## CreateOutboundMessagingConversationRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **queueId** | **String** | The ID of the queue to be associated with the message. This will determine the fromAddress of the message. |  |
| **toAddress** | **String** | The messaging address of the recipient of the message. |  |
| **toAddressMessengerType** | [**ToAddressMessengerTypeEnum**](#ToAddressMessengerTypeEnum) | The messaging address messenger type. |  |
| **useExistingConversation** | **Boolean** | An override to use an existing conversation.  If set to true, an existing conversation will be used if there is one within the conversation window.  If set to false, create request fails if there is a conversation within the conversation window. |  [optional] |
| **externalContactId** | **String** | The external contact Id of the recipient of the message. |  [optional] |
| **externalOrganizationId** | **String** | The external organization Id of the recipient of the message. |  [optional] |
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
| TELEGRAM | &quot;telegram&quot; |
| KAKAO | &quot;kakao&quot; |
{: class="table table-striped"}



