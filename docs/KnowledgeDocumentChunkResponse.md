# KnowledgeDocumentChunkResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **query** | **String** | Query to search chunks in the knowledge base. |  [optional] |
| **total** | **Integer** | The total number of chunks matching the query. |  [optional] |
| **pageCount** | **Integer** | Number of pages returned in the result calculated according to the pageSize and the total |  [optional] |
| **pageSize** | **Integer** | Page size of the returned results. |  [optional] |
| **pageNumber** | **Integer** | Page number of the returned results. |  [optional] |
| **queryType** | [**QueryTypeEnum**](#Enum--QueryTypeEnum) | The type of the query that initiates the chunks search. |  [optional] |
| **searchId** | **String** | The globally unique identifier for the chunks search. |  [optional] |
| **preprocessQuery** | **Boolean** | Indicates whether the chunks search query should be preprocessed. |  [optional] |
| **confidenceThreshold** | **Float** | The confidence threshold for the chunk results. If applied, the returned results will have an equal or higher chunk confidence than the threshold. |  [optional] |
| **results** | [**List&lt;DocumentChunkBlock&gt;**](DocumentChunkBlock) | Chunks matching the search query. |  [optional] |
| **application** | [**KnowledgeSearchClientApplication**](KnowledgeSearchClientApplication) | The client application details from which chunks search happened. |  [optional] |
| **conversationContext** | [**KnowledgeConversationContextResponse**](KnowledgeConversationContextResponse) | Conversation context information if the chunks search is initiated in the context of a conversation. |  [optional] |


## Enum: QueryTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AUTOSEARCH | &quot;AutoSearch&quot; | 
| MANUALSEARCH | &quot;ManualSearch&quot; | 
| SUGGESTION | &quot;Suggestion&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:245.0.0_
