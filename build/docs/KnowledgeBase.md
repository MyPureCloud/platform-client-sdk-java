---
title: KnowledgeBase
---
## KnowledgeBase


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **description** | <!----><!---->**String**<!----> | Knowledge base description |  [optional] |
| **coreLanguage** | [**CoreLanguageEnum**](#CoreLanguageEnum)<!----> | Core language for knowledge base in which initial content must be created first |  |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | Knowledge base creation date-time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | Knowledge base last modification date-time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **faqCount** | <!----><!---->**Integer**<!----> | The count representing the number of documents of type FAQ in the KnowledgeBase |  [optional] |
| **dateDocumentLastModified** | <!----><!---->[**Date**](Date.html)<!----> | The date representing when the last document is modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **articleCount** | <!----><!---->**Integer**<!----> | The count representing the number of documents of type Article in the KnowledgeBase |  [optional] |
| **published** | <!----><!---->**Boolean**<!----> | Flag that indicates the knowledge base is published |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="CoreLanguageEnum"></a>

## Enum: CoreLanguageEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| EN_US | &quot;en-US&quot; |
| EN_UK | &quot;en-UK&quot; |
| EN_AU | &quot;en-AU&quot; |
| DE_DE | &quot;de-DE&quot; |
{: class="table table-striped"}



