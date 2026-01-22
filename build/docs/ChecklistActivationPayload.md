# ChecklistActivationPayload


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **activationTriggerType** | [**ActivationTriggerTypeEnum**](#Enum--ActivationTriggerTypeEnum) | Trigger type that activated this checklist. |  |
| **intentId** | **String** | The intent ID if checklist was triggered by an intent. |  [optional] |
| **intentName** | **String** | The intent name if checklist was triggered by an intent. |  [optional] |
| **language** | **String** | Language associated with the checklist. |  |
| **agentId** | **String** | Agent ID. |  [optional] |
| **participantId** | **String** | Participant ID. |  [optional] |
| **queueId** | **String** | Queue ID. |  [optional] |
| **assistantId** | **String** | Assistant ID. |  [optional] |
| **mediaType** | [**MediaTypeEnum**](#Enum--MediaTypeEnum) | Media type. |  [optional] |
| **direction** | [**DirectionEnum**](#Enum--DirectionEnum) | Direction of the conversation. |  [optional] |


## Enum: ActivationTriggerTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INTENT | &quot;Intent&quot; | 
| CONVERSATIONSTART | &quot;ConversationStart&quot; | 


## Enum: MediaTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| VOICE | &quot;Voice&quot; | 
| MESSAGE | &quot;Message&quot; | 
| EMAIL | &quot;Email&quot; | 


## Enum: DirectionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INBOUND | &quot;Inbound&quot; | 
| OUTBOUND | &quot;Outbound&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:245.0.0_
