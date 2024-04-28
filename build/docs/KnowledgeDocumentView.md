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
| **surfacingMethod** | [**SurfacingMethodEnum**](#SurfacingMethodEnum)<!----> | The method how knowledge was surfaced. Article: Full article was shown. Snippet: A snippet from the article was shown. Highlight: A highlighted answer in a snippet was shown. |  [optional] |
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


<a name="SurfacingMethodEnum"></a>

## Enum: SurfacingMethodEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| ARTICLE | &quot;Article&quot; | 
| SNIPPET | &quot;Snippet&quot; | 
| HIGHLIGHT | &quot;Highlight&quot; | 
{: class="table table-striped"}



