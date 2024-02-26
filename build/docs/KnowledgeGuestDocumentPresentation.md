---
title: KnowledgeGuestDocumentPresentation
---
## KnowledgeGuestDocumentPresentation


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **documents** | <!----><!---->[**List&lt;KnowledgeDocumentVersionVariationReference&gt;**](KnowledgeDocumentVersionVariationReference.html)<!----> | The presented documents |  |
| **searchId** | <!----><!---->**String**<!----> | The search that surfaced the documents that were presented. |  [optional] |
| **queryType** | [**QueryTypeEnum**](#QueryTypeEnum)<!----> | The type of the query that surfaced the documents. |  [optional] |
| **sessionId** | <!----><!---->**String**<!----> | Knowledge session ID. |  [optional] |
| **application** | <!----><!---->[**KnowledgeGuestSearchClientApplication**](KnowledgeGuestSearchClientApplication.html)<!----> | The client application in which the documents were presented. |  [optional] |
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



