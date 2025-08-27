# V2SessionConversationsSummarySettingsPreviewEventConversationSummarySettingsPreviewMessage


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **createdDate** | [**Date**](Date) |  |  [optional] |
| **summaryId** | **String** |  |  [optional] |
| **sessionId** | **String** |  |  [optional] |
| **userId** | **String** |  |  [optional] |
| **summarySettingsId** | **String** |  |  [optional] |
| **language** | **String** |  |  [optional] |
| **mediaType** | [**MediaTypeEnum**](#Enum--MediaTypeEnum) |  |  [optional] |
| **summary** | [**V2SessionConversationsSummarySettingsPreviewEventConversationSummaryMessage**](V2SessionConversationsSummarySettingsPreviewEventConversationSummaryMessage) |  |  [optional] |
| **reason** | [**V2SessionConversationsSummarySettingsPreviewEventConversationReasonMessage**](V2SessionConversationsSummarySettingsPreviewEventConversationReasonMessage) |  |  [optional] |
| **resolution** | [**V2SessionConversationsSummarySettingsPreviewEventConversationResolutionMessage**](V2SessionConversationsSummarySettingsPreviewEventConversationResolutionMessage) |  |  [optional] |
| **followupActions** | [**List&lt;V2SessionConversationsSummarySettingsPreviewEventConversationFollowupAction&gt;**](V2SessionConversationsSummarySettingsPreviewEventConversationFollowupAction) |  |  [optional] |
| **extractedEntities** | [**List&lt;V2SessionConversationsSummarySettingsPreviewEventConversationSummaryExtractedEntity&gt;**](V2SessionConversationsSummarySettingsPreviewEventConversationSummaryExtractedEntity) |  |  [optional] |
| **errorType** | [**ErrorTypeEnum**](#Enum--ErrorTypeEnum) |  |  [optional] |
| **durationMs** | **Long** |  |  [optional] |


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




_com.mypurecloud.sdk.v2:platform-client-v2:230.0.0_
