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
| **queryType** | [**QueryTypeEnum**](#QueryTypeEnum)<!----> | The type of the query that initiates the search. |  [optional] |
| **includeDraftDocuments** | <!----><!---->**Boolean**<!----> | Indicates whether the search results would also include draft documents. |  [optional] |
| **interval** | <!----><!---->[**DocumentQueryInterval**](DocumentQueryInterval.html)<!----> | Retrieves the documents created/modified/published in specified date and time range. |  [optional] |
| **filter** | <!----><!---->[**DocumentQuery**](DocumentQuery.html)<!----> | Filter for the document search. |  [optional] |
| **sortOrder** | [**SortOrderEnum**](#SortOrderEnum)<!----> | The sort order for search results. |  [optional] |
| **sortBy** | [**SortByEnum**](#SortByEnum)<!----> | The field in the documents that you want to sort the search results by. |  [optional] |
| **application** | <!----><!---->[**KnowledgeSearchClientApplication**](KnowledgeSearchClientApplication.html)<!----> | The client application details from which search request was sent. |  [optional] |
| **conversationContext** | <!----><!---->[**KnowledgeConversationContext**](KnowledgeConversationContext.html)<!----> | Conversation context information if the search is initiated in the context of a conversation. |  [optional] |
| **confidenceThreshold** | <!----><!---->**Float**<!----> | The confidence threshold for the search results. If applied, the returned results will have an equal or higher confidence than the threshold. The value should be between 0 to 1. |  [optional] |
| **answerHighlightTopResults** | <!----><!---->**Integer**<!----> | The number of articles to be sent for answer-highlighting. Can range from 1-5. |  [optional] |
{: class="table table-striped"}


<a name="QueryTypeEnum"></a>

## Enum: QueryTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AUTOSEARCH | &quot;AutoSearch&quot; | 
| MANUALSEARCH | &quot;ManualSearch&quot; | 
| SUGGESTION | &quot;Suggestion&quot; | 
{: class="table table-striped"}


<a name="SortOrderEnum"></a>

## Enum: SortOrderEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ASC | &quot;Asc&quot; | 
| DESC | &quot;Desc&quot; | 
{: class="table table-striped"}


<a name="SortByEnum"></a>

## Enum: SortByEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CONFIDENCESCORE | &quot;ConfidenceScore&quot; | 
| DATECREATED | &quot;DateCreated&quot; | 
| DATEMODIFIED | &quot;DateModified&quot; | 
| CATEGORYNAME | &quot;CategoryName&quot; | 
| LABELNAME | &quot;LabelName&quot; | 
{: class="table table-striped"}



