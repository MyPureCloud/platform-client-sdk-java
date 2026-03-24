# KnowledgeSearchPreviewRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **query** | **String** | Query to search content in the knowledge sources. |  |
| **sources** | [**List&lt;V3SourceRef&gt;**](V3SourceRef) | Source information to search upon. |  |
| **generationSetting** | [**KnowledgeGenerationSetting**](KnowledgeGenerationSetting) | Setting for answer generation. |  |
| **stateful** | **Boolean** | Indicates if stateful search and generation is enabled for the knowledge setting. |  [optional] |
| **conversationTurns** | [**List&lt;KnowledgeConversationTurn&gt;**](KnowledgeConversationTurn) | List of conversation turns to use for stateful search. |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:250.0.0_
