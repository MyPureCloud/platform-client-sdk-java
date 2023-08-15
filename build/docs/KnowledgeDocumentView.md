---
title: KnowledgeDocumentView
---
## KnowledgeDocumentView


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **documentVariationId** | <!----><!---->**String**<!----> | The variation of the viewed document. |  |
| **documentVersionId** | <!----><!---->**String**<!----> | The version of the viewed document. |  |
| **searchId** | <!----><!---->**String**<!----> | The search that surfaced the viewed document. |  [optional] |
| **queryType** | [**QueryTypeEnum**](#QueryTypeEnum)<!----> | The type of the query that surfaced the document. |  [optional] |
| **application** | <!----><!---->[**KnowledgeSearchClientApplication**](KnowledgeSearchClientApplication.html)<!----> | The client application from which the document was viewed. |  |
| **sessionId** | <!----><!---->**String**<!----> | The unique identifier of the knowledge session in which the document was viewed. |  [optional] |
| **conversationContext** | <!----><!---->[**KnowledgeConversationContext**](KnowledgeConversationContext.html)<!----> | Conversation context information if the document was viewed in the context of a conversation. |  [optional] |
{: class="table table-striped"}


<a name="QueryTypeEnum"></a>

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
{: class="table table-striped"}



