# KnowledgeGuestDocumentView


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **documentVariationId** | **String** | The variation of the viewed document. |  |
| **documentVersionId** | **String** | The version of the viewed document. |  |
| **searchId** | **String** | The search that surfaced the viewed document. |  [optional] |
| **queryType** | [**QueryTypeEnum**](#Enum--QueryTypeEnum) | The type of the query that surfaced the document. |  [optional] |
| **surfacingMethod** | [**SurfacingMethodEnum**](#Enum--SurfacingMethodEnum) | The method how knowledge was surfaced. Article: Full article was shown. Snippet: A snippet from the article was shown. Highlight: A highlighted answer in a snippet was shown.Generative: A generated answer in a snippet was shown. |  [optional] |


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




_com.mypurecloud.sdk.v2:platform-client-v2:229.0.0_
