# KnowledgeSearchClientApplication


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | Application type. |  |
| **deployment** | [**AddressableEntityRef**](AddressableEntityRef) | Application details when type is MessengerKnowledgeApp or SupportCenter. |  [optional] |
| **botFlow** | [**AddressableEntityRef**](AddressableEntityRef) | Application details when type is BotFlow. |  [optional] |
| **assistant** | [**AddressableEntityRef**](AddressableEntityRef) | Application details when type is Assistant. |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ASSISTANT | &quot;Assistant&quot; | 
| BOTFLOW | &quot;BotFlow&quot; | 
| MESSENGERKNOWLEDGEAPP | &quot;MessengerKnowledgeApp&quot; | 
| SMARTADVISOR | &quot;SmartAdvisor&quot; | 
| SUPPORTCENTER | &quot;SupportCenter&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:227.0.0_
