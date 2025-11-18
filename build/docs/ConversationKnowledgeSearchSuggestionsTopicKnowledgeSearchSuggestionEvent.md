# ConversationKnowledgeSearchSuggestionsTopicKnowledgeSearchSuggestionEvent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **eventTime** | [**Date**](Date) |  |  [optional] |
| **conversationId** | **String** |  |  [optional] |
| **suggestionId** | **String** |  |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) |  |  [optional] |
| **triggerType** | [**TriggerTypeEnum**](#Enum--TriggerTypeEnum) |  |  [optional] |
| **engagementType** | [**EngagementTypeEnum**](#Enum--EngagementTypeEnum) |  |  [optional] |
| **context** | [**ConversationKnowledgeSearchSuggestionsTopicSuggestionContext**](ConversationKnowledgeSearchSuggestionsTopicSuggestionContext) |  |  [optional] |
| **feedback** | [**ConversationKnowledgeSearchSuggestionsTopicSuggestionFeedback**](ConversationKnowledgeSearchSuggestionsTopicSuggestionFeedback) |  |  [optional] |
| **knowledgeSearch** | [**ConversationKnowledgeSearchSuggestionsTopicSuggestedSearchResult**](ConversationKnowledgeSearchSuggestionsTopicSuggestedSearchResult) |  |  [optional] |
| **activeIntent** | [**ConversationKnowledgeSearchSuggestionsTopicSuggestedIntent**](ConversationKnowledgeSearchSuggestionsTopicSuggestedIntent) |  |  [optional] |


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| SUGGESTED | &quot;Suggested&quot; | 
| ACCEPTED | &quot;Accepted&quot; | 
| DISMISSED | &quot;Dismissed&quot; | 
| FAILED | &quot;Failed&quot; | 
| RATED | &quot;Rated&quot; | 


## Enum: TriggerTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| FALLBACK | &quot;Fallback&quot; | 
| CONVERSATIONSTART | &quot;ConversationStart&quot; | 
| CONVERSATIONTRANSFER | &quot;ConversationTransfer&quot; | 
| CONVERSATIONEND | &quot;ConversationEnd&quot; | 
| INTENT | &quot;Intent&quot; | 


## Enum: EngagementTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| DISMISSED | &quot;Dismissed&quot; | 
| COPIED | &quot;Copied&quot; | 
| OPENED | &quot;Opened&quot; | 
| FEEDBACK | &quot;Feedback&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:237.0.0_
