---
title: KnowledgeDocumentFeedbackResponse
---
## KnowledgeDocumentFeedbackResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **documentVariation** | <!----><!---->[**EntityReference**](EntityReference.html)<!----> | The variation of the document on which feedback was given. |  |
| **rating** | [**RatingEnum**](#RatingEnum)<!----> | Feedback rating. |  |
| **reason** | [**ReasonEnum**](#ReasonEnum)<!----> | Feedback reason. |  [optional] |
| **comment** | <!----><!---->**String**<!----> | Free-text comment of the feedback. Maximum length: 2000 characters. |  [optional] |
| **search** | <!----><!---->[**EntityReference**](EntityReference.html)<!----> | The search that surfaced the document on which feedback was given. |  [optional] |
| **sessionId** | <!----><!---->**String**<!----> | Knowledge guest session ID. |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | The date and time of the feedback. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **queryType** | [**QueryTypeEnum**](#QueryTypeEnum)<!----> | The type of the query that surfaced the document on which the feedback was given. |  [optional] |
| **surfacingMethod** | [**SurfacingMethodEnum**](#SurfacingMethodEnum)<!----> | The method how knowledge was surfaced. Article: Full article was shown. Snippet: A snippet from the article was shown. Highlight: A highlighted answer in a snippet was shown. |  [optional] |
| **state** | [**StateEnum**](#StateEnum)<!----> | The state of the feedback. |  [optional] |
| **document** | <!----><!---->[**KnowledgeDocumentVersionReference**](KnowledgeDocumentVersionReference.html)<!----> | The document on which feedback was given. |  [optional] |
| **application** | <!----><!---->[**KnowledgeSearchClientApplication**](KnowledgeSearchClientApplication.html)<!----> | The client application from which feedback was given. |  [optional] |
| **conversationContext** | <!----><!---->[**KnowledgeConversationContextResponse**](KnowledgeConversationContextResponse.html)<!----> | Conversation context information if the feedback is given in the context of a conversation. |  [optional] |
| **user** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.html)<!----> | The user who created the feedback. |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="RatingEnum"></a>

## Enum: RatingEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NEGATIVE | &quot;Negative&quot; | 
| POSITIVE | &quot;Positive&quot; | 
{: class="table table-striped"}


<a name="ReasonEnum"></a>

## Enum: ReasonEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DOCUMENTCONTENT | &quot;DocumentContent&quot; | 
| SEARCHRESULTS | &quot;SearchResults&quot; | 
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


<a name="StateEnum"></a>

## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DRAFT | &quot;Draft&quot; | 
| FINAL | &quot;Final&quot; | 
{: class="table table-striped"}



