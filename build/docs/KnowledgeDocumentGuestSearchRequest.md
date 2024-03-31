---
title: KnowledgeDocumentGuestSearchRequest
---
## KnowledgeDocumentGuestSearchRequest


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
| **sessionId** | <!----><!---->**String**<!----> | Session ID of the search. |  [optional] |
| **answerHighlightTopResults** | <!----><!---->**Integer**<!----> | The number of articles to be sent for answer-highlighting. Can range from 1-5. |  [optional] |
| **includeDraftDocuments** | <!----><!---->**Boolean**<!----> | Indicates whether the search results would also include draft documents. |  [optional] |
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



