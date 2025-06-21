# KnowledgeDocumentFeedbackResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **documentVariation** | [**EntityReference**](EntityReference) | The variation of the document on which feedback was given. |  |
| **rating** | [**RatingEnum**](#Enum--RatingEnum) | Feedback rating. |  |
| **reason** | [**ReasonEnum**](#Enum--ReasonEnum) | Feedback reason. |  [optional] |
| **comment** | **String** | Free-text comment of the feedback. Maximum length: 2000 characters. |  [optional] |
| **search** | [**EntityReference**](EntityReference) | The search that surfaced the document on which feedback was given. |  [optional] |
| **sessionId** | **String** | Knowledge guest session ID. |  [optional] |
| **dateCreated** | [**Date**](Date) | The date and time of the feedback. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **queryType** | [**QueryTypeEnum**](#Enum--QueryTypeEnum) | The type of the query that surfaced the document on which the feedback was given. |  [optional] |
| **surfacingMethod** | [**SurfacingMethodEnum**](#Enum--SurfacingMethodEnum) | The method how knowledge was surfaced. Article: Full article was shown. Snippet: A snippet from the article was shown. Highlight: A highlighted answer in a snippet was shown.Generative: A generated answer in a snippet was shown. |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) | The state of the feedback. |  [optional] |
| **document** | [**KnowledgeDocumentVersionReference**](KnowledgeDocumentVersionReference) | The document on which feedback was given. |  [optional] |
| **application** | [**KnowledgeSearchClientApplication**](KnowledgeSearchClientApplication) | The client application from which feedback was given. |  [optional] |
| **conversationContext** | [**KnowledgeConversationContextResponse**](KnowledgeConversationContextResponse) | Conversation context information if the feedback is given in the context of a conversation. |  [optional] |
| **user** | [**AddressableEntityRef**](AddressableEntityRef) | The user who created the feedback. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: RatingEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NEGATIVE | &quot;Negative&quot; | 
| POSITIVE | &quot;Positive&quot; | 


## Enum: ReasonEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DOCUMENTCONTENT | &quot;DocumentContent&quot; | 
| SEARCHRESULTS | &quot;SearchResults&quot; | 


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
| EXPANDEDARTICLE | &quot;ExpandedArticle&quot; | 


## Enum: SurfacingMethodEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| ARTICLE | &quot;Article&quot; | 
| SNIPPET | &quot;Snippet&quot; | 
| HIGHLIGHT | &quot;Highlight&quot; | 
| GENERATIVE | &quot;Generative&quot; | 


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DRAFT | &quot;Draft&quot; | 
| FINAL | &quot;Final&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:227.0.0_
