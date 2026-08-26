# KnowledgeSearchPreviewRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **query** | **String** | Query to search content in the knowledge sources. |  |
| **sources** | [**List&lt;V3SourceRef&gt;**](V3SourceRef) | Source information to search upon. |  |
| **generationSetting** | [**KnowledgeGenerationSetting**](KnowledgeGenerationSetting) | Setting for answer generation. |  |
| **stateful** | **Boolean** | Indicates if stateful search and generation is enabled for the knowledge setting. |  [optional] |
| **conversationTurns** | [**List&lt;KnowledgeConversationTurn&gt;**](KnowledgeConversationTurn) | List of conversation turns to use for stateful search. |  [optional] |
| **filter** | [**V3SourceTagFilter**](V3SourceTagFilter) | Composite tag filter applied to the search preview. |  [optional] |
| **application** | [**V3KnowledgeSearchPreviewClientApplication**](V3KnowledgeSearchPreviewClientApplication) | The touchpoint application to simulate for the preview. |  [optional] |
| **conversationContext** | [**KnowledgeV3PreviewConversationContext**](KnowledgeV3PreviewConversationContext) | The channel context to simulate for the preview. |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:261.0.0_
