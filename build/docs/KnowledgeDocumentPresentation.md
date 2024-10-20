# KnowledgeDocumentPresentation


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **documents** | [**List&lt;KnowledgeDocumentVersionVariationReference&gt;**](KnowledgeDocumentVersionVariationReference) | The presented documents |  |
| **searchId** | **String** | The search that surfaced the documents that were presented. |  [optional] |
| **queryType** | [**QueryTypeEnum**](#Enum--QueryTypeEnum) | The type of the query that surfaced the documents. |  [optional] |
| **surfacingMethod** | [**SurfacingMethodEnum**](#Enum--SurfacingMethodEnum) | The method how knowledge was surfaced. Article: Full article was shown. Snippet: A snippet from the article was shown. Highlight: A highlighted answer in a snippet was shown. |  [optional] |
| **sessionId** | **String** | Knowledge session ID. |  [optional] |
| **conversationContext** | [**KnowledgeConversationContext**](KnowledgeConversationContext) | Conversation context information if the documents were presented in the context of a conversation. |  [optional] |
| **application** | [**KnowledgeSearchClientApplication**](KnowledgeSearchClientApplication) | The client application in which the documents were presented. |  |


## Enum: QueryTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| ARTICLE | &quot;Article&quot; | 
| AUTOSEARCH | &quot;AutoSearch&quot; | 
| CATEGORY | &quot;Category&quot; | 
| MANUALSEARCH | &quot;ManualSearch&quot; | 
| RECOMMENDATION | &quot;Recommendation&quot; | 
| SUGGESTION | &quot;Suggestion&quot; | 


## Enum: SurfacingMethodEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| ARTICLE | &quot;Article&quot; | 
| SNIPPET | &quot;Snippet&quot; | 
| HIGHLIGHT | &quot;Highlight&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:212.0.0_
