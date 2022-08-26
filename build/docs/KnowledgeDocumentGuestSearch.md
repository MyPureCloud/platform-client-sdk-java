---
title: KnowledgeDocumentGuestSearch
---
## KnowledgeDocumentGuestSearch


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **query** | <!----><!---->**String**<!----> | Query to search content in the knowledge base. Maximum of 30 records per query can be fetched. |  |
| **pageSize** | <!----><!---->**Integer**<!----> | Page size of the returned results. |  [optional] |
| **pageNumber** | <!----><!---->**Integer**<!----> | Page number of the returned results. |  [optional] |
| **searchId** | <!----><!---->**String**<!----> | The globally unique identifier for the search. |  [optional] |
| **total** | <!----><!---->**Integer**<!----> | The total number of documents matching the query. |  [optional] |
| **pageCount** | <!----><!---->**Integer**<!----> | Number of pages returned in the result calculated according to the pageSize and the total |  [optional] |
| **sessionId** | <!----><!---->**String**<!----> | Session ID of the search. |  [optional] |
| **results** | <!----><!---->[**List&lt;KnowledgeDocumentGuestSearchResult&gt;**](KnowledgeDocumentGuestSearchResult.html)<!----> | Documents that matched the search query. |  [optional] |
{: class="table table-striped"}



