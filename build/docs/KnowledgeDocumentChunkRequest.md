# KnowledgeDocumentChunkRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **query** | **String** | Query to search chunks in the knowledge base. |  |
| **pageSize** | **Integer** | Page size of the returned results. |  [optional] |
| **pageNumber** | **Integer** | Page number of the returned results. |  [optional] |
| **filter** | [**DocumentQuery**](DocumentQuery) | Filter for the document chunks. |  [optional] |
| **queryType** | [**QueryTypeEnum**](#Enum--QueryTypeEnum) | The type of the query that initiates the chunks search. |  [optional] |
| **preprocessQuery** | **Boolean** | Indicates whether the chunks search query should be preprocessed. |  [optional] |
| **includeDraftDocuments** | **Boolean** | Indicates whether the chunk results would also include draft documents. |  [optional] |
| **application** | [**KnowledgeSearchClientApplication**](KnowledgeSearchClientApplication) | The client application details from which chunks request was sent. |  [optional] |
| **conversationContext** | [**KnowledgeConversationContext**](KnowledgeConversationContext) | Conversation context information if the chunks search is initiated in the context of a conversation. |  [optional] |
| **confidenceThreshold** | **Float** | The confidence threshold for the chunk results. If applied, the returned results will have an equal or higher confidence than the threshold. The value should be between 0 to 1. |  [optional] |


## Enum: QueryTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AUTOSEARCH | &quot;AutoSearch&quot; | 
| MANUALSEARCH | &quot;ManualSearch&quot; | 
| SUGGESTION | &quot;Suggestion&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:234.0.0_
