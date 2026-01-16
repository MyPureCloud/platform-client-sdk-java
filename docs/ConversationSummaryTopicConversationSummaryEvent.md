# ConversationSummaryTopicConversationSummaryEvent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **conversationId** | **String** |  |  [optional] |
| **queueId** | **String** |  |  [optional] |
| **participants** | [**List&lt;ConversationSummaryTopicConversationSummaryParticipant&gt;**](ConversationSummaryTopicConversationSummaryParticipant) |  |  [optional] |
| **communicationIds** | **List&lt;String&gt;** |  |  [optional] |
| **createdDate** | [**Date**](Date) |  |  [optional] |
| **messageType** | [**MessageTypeEnum**](#Enum--MessageTypeEnum) |  |  [optional] |
| **mediaType** | [**MediaTypeEnum**](#Enum--MediaTypeEnum) |  |  [optional] |
| **summaryId** | **String** |  |  [optional] |
| **language** | **String** |  |  [optional] |
| **summary** | [**ConversationSummaryTopicConversationSummary**](ConversationSummaryTopicConversationSummary) |  |  [optional] |
| **headline** | [**ConversationSummaryTopicConversationHeadline**](ConversationSummaryTopicConversationHeadline) |  |  [optional] |
| **reason** | [**ConversationSummaryTopicConversationReason**](ConversationSummaryTopicConversationReason) |  |  [optional] |
| **resolution** | [**ConversationSummaryTopicConversationResolution**](ConversationSummaryTopicConversationResolution) |  |  [optional] |
| **followupActions** | [**List&lt;ConversationSummaryTopicConversationFollowupAction&gt;**](ConversationSummaryTopicConversationFollowupAction) |  |  [optional] |
| **extractedEntities** | [**List&lt;ConversationSummaryTopicSummaryExtractedCustomEntity&gt;**](ConversationSummaryTopicSummaryExtractedCustomEntity) |  |  [optional] |
| **wrapUpCodes** | [**List&lt;ConversationSummaryTopicConversationWrapUpCode&gt;**](ConversationSummaryTopicConversationWrapUpCode) |  |  [optional] |
| **triggerSource** | [**ConversationSummaryTopicTriggerSource**](ConversationSummaryTopicTriggerSource) |  |  [optional] |
| **lastEditedBy** | [**ConversationSummaryTopicConversationSummaryParticipant**](ConversationSummaryTopicConversationSummaryParticipant) |  |  [optional] |
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




_com.mypurecloud.sdk.v2:platform-client-v2:244.0.0_
