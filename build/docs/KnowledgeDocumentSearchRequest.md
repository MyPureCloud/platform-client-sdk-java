---
title: KnowledgeDocumentSearchRequest
---
## KnowledgeDocumentSearchRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **query** | <!----><!---->**String**<!----> | Query to search content in the knowledge base. Maximum of 30 records per query can be fetched. |  |
| **pageSize** | <!----><!---->**Integer**<!----> | Page size of the returned results. |  [optional] |
| **pageNumber** | <!----><!---->**Integer**<!----> | Page number of the returned results. |  [optional] |
| **searchId** | <!----><!---->**String**<!----> | The globally unique identifier for the search. |  [optional] |
| **total** | <!----><!---->**Integer**<!----> | The total number of documents matching the query. |  [optional] |
| **pageCount** | <!----><!---->**Integer**<!----> | Number of pages returned in the result calculated according to the pageSize and the total |  [optional] |
| **includeDraftDocuments** | <!----><!---->**Boolean**<!----> | Indicates whether the search results would also include draft documents. |  [optional] |
| **interval** | <!----><!---->[**DocumentQueryInterval**](DocumentQueryInterval.html)<!----> | Retrieves the documents created/modified/published in specified date and time range. |  [optional] |
| **filter** | <!----><!---->[**DocumentQuery**](DocumentQuery.html)<!----> | Filter for the document search. |  [optional] |
| **sortOrder** | [**SortOrderEnum**](#SortOrderEnum)<!----> | The sort order for search results. |  [optional] |
| **sortBy** | [**SortByEnum**](#SortByEnum)<!----> | The field in the documents that you want to sort the search results by. |  [optional] |
| **application** | <!----><!---->[**KnowledgeSearchClientApplication**](KnowledgeSearchClientApplication.html)<!----> | The client application details from which search request was sent. |  [optional] |
{: class="table table-striped"}


<a name="SortOrderEnum"></a>

## Enum: SortOrderEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ASC | &quot;ASC&quot; | 
| DESC | &quot;DESC&quot; | 
| SCORE | &quot;SCORE&quot; | 
{: class="table table-striped"}


<a name="SortByEnum"></a>

## Enum: SortByEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CONFIDENCESCORE | &quot;ConfidenceScore&quot; | 
| DATECREATED | &quot;DateCreated&quot; | 
| DATEMODIFIED | &quot;DateModified&quot; | 
| CATEGORYID | &quot;CategoryId&quot; | 
| CATEGORYNAME | &quot;CategoryName&quot; | 
| CONTEXTID | &quot;ContextId&quot; | 
| CONTEXTNAME | &quot;ContextName&quot; | 
| CONTEXTVALUEID | &quot;ContextValueId&quot; | 
| CONTEXTVALUENAME | &quot;ContextValueName&quot; | 
| LABELID | &quot;LabelId&quot; | 
| LABELNAME | &quot;LabelName&quot; | 
{: class="table table-striped"}



