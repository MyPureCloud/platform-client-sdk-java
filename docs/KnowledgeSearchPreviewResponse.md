# KnowledgeSearchPreviewResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **query** | **String** | Query to search content in the knowledge base. |  [optional] |
| **searchId** | **String** | The globally unique identifier for the search. |  [optional] |
| **sessionId** | **String** | The sessionId for search request. |  [optional] |
| **result** | [**KnowledgeSearchResult**](KnowledgeSearchResult) | Content matching the search query. |  [optional] |
| **application** | [**V3KnowledgeSearchPreviewClientApplication**](V3KnowledgeSearchPreviewClientApplication) | The touchpoint application used for the preview. |  [optional] |
| **conversationContext** | [**KnowledgeV3PreviewConversationContext**](KnowledgeV3PreviewConversationContext) | The channel context used for the preview. |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:260.0.0_
