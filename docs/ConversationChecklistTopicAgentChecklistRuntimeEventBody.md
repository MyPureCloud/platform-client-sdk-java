# ConversationChecklistTopicAgentChecklistRuntimeEventBody


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **evaluationStartDate** | [**Date**](Date) |  |  [optional] |
| **evaluationLastModifiedDate** | [**Date**](Date) |  |  [optional] |
| **evaluationFinalizedDate** | [**Date**](Date) |  |  [optional] |
| **evaluationFinalizedWithAcwDate** | [**Date**](Date) |  |  [optional] |
| **conversationId** | **String** |  |  [optional] |
| **communicationId** | **String** |  |  [optional] |
| **agentChecklistId** | **String** |  |  [optional] |
| **name** | **String** |  |  [optional] |
| **language** | **String** |  |  [optional] |
| **agentId** | **String** |  |  [optional] |
| **participantId** | **String** |  |  [optional] |
| **queueId** | **String** |  |  [optional] |
| **assistantId** | **String** |  |  [optional] |
| **mediaType** | [**MediaTypeEnum**](#Enum--MediaTypeEnum) |  |  [optional] |
| **direction** | [**DirectionEnum**](#Enum--DirectionEnum) |  |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) |  |  [optional] |
| **exitReason** | **String** |  |  [optional] |
| **activationTriggers** | [**List&lt;ConversationChecklistTopicAgentChecklistActivationTrigger&gt;**](ConversationChecklistTopicAgentChecklistActivationTrigger) |  |  [optional] |
| **conversationContext** | [**List&lt;ConversationChecklistTopicConversationContextTurnInfo&gt;**](ConversationChecklistTopicConversationContextTurnInfo) |  |  [optional] |
| **agentChecklistItems** | [**List&lt;ConversationChecklistTopicAgentChecklistItemState&gt;**](ConversationChecklistTopicAgentChecklistItemState) |  |  [optional] |


## Enum: MediaTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| VOICE | &quot;Voice&quot; | 
| MESSAGE | &quot;Message&quot; | 
| EMAIL | &quot;Email&quot; | 


## Enum: DirectionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| INBOUND | &quot;Inbound&quot; | 
| OUTBOUND | &quot;Outbound&quot; | 


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| EVALUATIONSTARTED | &quot;EvaluationStarted&quot; | 
| EVALUATIONINPROGRESS | &quot;EvaluationInProgress&quot; | 
| EVALUATIONFINALIZED | &quot;EvaluationFinalized&quot; | 
| EVALUATIONFINALIZEDWITHACW | &quot;EvaluationFinalizedWithAcw&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:234.0.0_
