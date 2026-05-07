# KnowledgeV3ConversationContextResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **conversation** | [**AddressableEntityRef**](AddressableEntityRef) | The conversation. |  |
| **queue** | [**AddressableEntityRef**](AddressableEntityRef) | The queue used to assign the interaction to the user. |  [optional] |
| **externalContact** | [**AddressableEntityRef**](AddressableEntityRef) | The end-user participant of the conversation. |  [optional] |
| **mediaType** | [**MediaTypeEnum**](#Enum--MediaTypeEnum) | The media type of the conversation. |  [optional] |


## Enum: MediaTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CALL | &quot;Call&quot; | 
| CHAT | &quot;Chat&quot; | 
| EMAIL | &quot;Email&quot; | 
| MESSAGE | &quot;Message&quot; | 
| VOICE | &quot;Voice&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:253.0.0_
