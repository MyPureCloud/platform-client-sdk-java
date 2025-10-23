# ConversationSummaryTopicVirtualAgentsConversationSummaryEvent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **conversationId** | **String** |  |  [optional] |
| **queueId** | **String** |  |  [optional] |
| **participants** | [**List&lt;ConversationSummaryTopicVirtualAgentsConversationSummaryParticipant&gt;**](ConversationSummaryTopicVirtualAgentsConversationSummaryParticipant) |  |  [optional] |
| **communicationIds** | **List&lt;String&gt;** |  |  [optional] |
| **createdDate** | [**Date**](Date) |  |  [optional] |
| **messageType** | [**MessageTypeEnum**](#Enum--MessageTypeEnum) |  |  [optional] |
| **mediaType** | [**MediaTypeEnum**](#Enum--MediaTypeEnum) |  |  [optional] |
| **summaryId** | **String** |  |  [optional] |
| **language** | **String** |  |  [optional] |
| **summary** | [**ConversationSummaryTopicVirtualAgentsConversationSummary**](ConversationSummaryTopicVirtualAgentsConversationSummary) |  |  [optional] |
| **headline** | [**ConversationSummaryTopicVirtualAgentsConversationHeadline**](ConversationSummaryTopicVirtualAgentsConversationHeadline) |  |  [optional] |
| **reason** | [**ConversationSummaryTopicVirtualAgentsConversationReason**](ConversationSummaryTopicVirtualAgentsConversationReason) |  |  [optional] |
| **resolution** | [**ConversationSummaryTopicVirtualAgentsConversationResolution**](ConversationSummaryTopicVirtualAgentsConversationResolution) |  |  [optional] |
| **followupActions** | [**List&lt;ConversationSummaryTopicVirtualAgentsConversationFollowupAction&gt;**](ConversationSummaryTopicVirtualAgentsConversationFollowupAction) |  |  [optional] |
| **extractedEntities** | [**List&lt;ConversationSummaryTopicVirtualAgentsSummaryExtractedCustomEntity&gt;**](ConversationSummaryTopicVirtualAgentsSummaryExtractedCustomEntity) |  |  [optional] |
| **wrapUpCodes** | [**List&lt;ConversationSummaryTopicVirtualAgentsConversationWrapUpCode&gt;**](ConversationSummaryTopicVirtualAgentsConversationWrapUpCode) |  |  [optional] |
| **triggerSource** | [**ConversationSummaryTopicVirtualAgentsTriggerSource**](ConversationSummaryTopicVirtualAgentsTriggerSource) |  |  [optional] |
| **lastEditedBy** | [**ConversationSummaryTopicVirtualAgentsConversationSummaryParticipant**](ConversationSummaryTopicVirtualAgentsConversationSummaryParticipant) |  |  [optional] |
| **errorType** | [**ErrorTypeEnum**](#Enum--ErrorTypeEnum) |  |  [optional] |
| **durationMs** | **Long** |  |  [optional] |


## Enum: MessageTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;UNKNOWN&quot; | 
| SMS | &quot;SMS&quot; | 
| TWITTER | &quot;TWITTER&quot; | 
| FACEBOOK | &quot;FACEBOOK&quot; | 
| INSTAGRAM | &quot;INSTAGRAM&quot; | 
| LINE | &quot;LINE&quot; | 
| WHATSAPP | &quot;WHATSAPP&quot; | 
| WEBMESSAGING | &quot;WEBMESSAGING&quot; | 
| OPEN | &quot;OPEN&quot; | 
| APPLE | &quot;APPLE&quot; | 


## Enum: MediaTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;UNKNOWN&quot; | 
| MESSAGE | &quot;MESSAGE&quot; | 
| CALL | &quot;CALL&quot; | 
| EMAIL | &quot;EMAIL&quot; | 


## Enum: ErrorTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;UNKNOWN&quot; | 
| CONVERSATION_TOO_LONG | &quot;CONVERSATION_TOO_LONG&quot; | 
| CONVERSATION_TOO_SHORT | &quot;CONVERSATION_TOO_SHORT&quot; | 
| RATE_LIMITED | &quot;RATE_LIMITED&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:235.0.0_
