# KnowledgeSettingsRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | Knowledge setting name. |  |
| **description** | **String** | Knowledge setting description. |  [optional] |
| **sources** | [**List&lt;V3SourceRef&gt;**](V3SourceRef) | Knowledge source information to search upon. |  |
| **generationSetting** | [**KnowledgeGenerationSetting**](KnowledgeGenerationSetting) | Setting for answer generation. |  [optional] |
| **stateful** | **Boolean** | Indicates if stateful search and generation is enabled for the knowledge setting. |  [optional] |
| **filter** | [**V3SourceTagFilter**](V3SourceTagFilter) | Composite tag filter of search results. |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:256.1.0_
