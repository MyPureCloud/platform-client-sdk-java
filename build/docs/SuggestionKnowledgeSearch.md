---
title: SuggestionKnowledgeSearch
---
## SuggestionKnowledgeSearch


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **title** | <!----><!---->**String**<!----> | The article title. |  [optional] |
| **snippets** | <!----><!---->**List&lt;String&gt;**<!----> | Snippets of text from the article matching the query. |  [optional] |
| **confidence** | <!----><!---->**Float**<!----> | Value between 0 and 1. 1 corresponds to very confident, 0 to not confident at all. |  [optional] |
| **searchId** | <!----><!---->**String**<!----> | The search id. |  [optional] |
| **document** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.html)<!----> | The article matching the query. |  [optional] |
| **version** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.html)<!----> | The version of the article. |  [optional] |
| **knowledgeAnswer** | <!----><!---->[**SuggestionKnowledgeAnswer**](SuggestionKnowledgeAnswer.html)<!----> | The most relevant answer within a searched article for the searched query |  [optional] |
| **variations** | <!----><!---->[**List&lt;AddressableEntityRef&gt;**](AddressableEntityRef.html)<!----> | Variations of the article. |  [optional] |
{: class="table table-striped"}



