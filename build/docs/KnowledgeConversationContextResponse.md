# KnowledgeConversationContextResponse


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
| UNKNOWN | &quot;Unknown&quot; | 
| CALLBACK | &quot;Callback&quot; | 
| CHAT | &quot;Chat&quot; | 
| COBROWSE | &quot;Cobrowse&quot; | 
| EMAIL | &quot;Email&quot; | 
| MESSAGE | &quot;Message&quot; | 
| SCREENSHARE | &quot;Screenshare&quot; | 
| VIDEO | &quot;Video&quot; | 
| VOICE | &quot;Voice&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:223.1.0_
