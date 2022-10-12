---
title: KnowledgeDocumentSuggestionRequest
---
## KnowledgeDocumentSuggestionRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **query** | <!----><!---->**String**<!----> | Query to get autocomplete suggestions for the matching knowledge documents. |  |
| **pageSize** | <!----><!---->**Integer**<!----> | Page size of the returned results. |  [optional] |
| **includeDraftDocuments** | <!----><!---->**Boolean**<!----> | Indicates whether the suggestion results would also include draft documents. |  [optional] |
| **interval** | <!----><!---->[**DocumentQueryInterval**](DocumentQueryInterval.html)<!----> | Retrieves the documents created/modified/published in specified date and time range. |  [optional] |
| **filter** | <!----><!---->[**DocumentQuery**](DocumentQuery.html)<!----> | Filter for the document suggestions. |  [optional] |
{: class="table table-striped"}



