---
title: KnowledgeDocumentCopy
---
## KnowledgeDocumentCopy


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **documentVariationId** | <!----><!---->**String**<!----> | The variation of the document whose content was copied. |  |
| **documentVersionId** | <!----><!---->**String**<!----> | The version of the document whose content was copied. |  |
| **searchId** | <!----><!---->**String**<!----> | The search that surfaced the document whose content was copied. |  [optional] |
| **queryType** | [**QueryTypeEnum**](#QueryTypeEnum)<!----> | The type of the query that surfaced the document. |  [optional] |
| **sessionId** | <!----><!---->**String**<!----> | Knowledge session ID. |  [optional] |
| **conversationContext** | <!----><!---->[**KnowledgeConversationContext**](KnowledgeConversationContext.html)<!----> | Conversation context information, if the document content is copied in the context of a conversation. |  [optional] |
| **application** | <!----><!---->[**KnowledgeSearchClientApplication**](KnowledgeSearchClientApplication.html)<!----> | The client application in which the document content was copied. |  |
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



