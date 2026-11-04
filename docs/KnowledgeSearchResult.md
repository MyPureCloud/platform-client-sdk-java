# KnowledgeSearchResult


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **generatedAnswer** | **String** | The generated answer for search query. |  [optional] |
| **retrievedReferences** | [**List&lt;KnowledgeRetrievedReference&gt;**](KnowledgeRetrievedReference) | The retrieved references for the search query. |  [optional] |
| **failureReason** | [**FailureReasonEnum**](#Enum--FailureReasonEnum) | Reason the search request did not produce an answer or relevant content. |  [optional] |
| **message** | **String** | A detailed error message describing the failureReason. |  [optional] |


## Enum: FailureReasonEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EMPTY | &quot;&quot; | 
| UNKNOWN | &quot;unknown&quot; | 
| INVALIDQUERY | &quot;invalidQuery&quot; | 
| RATELIMITEXCEEDED | &quot;rateLimitExceeded&quot; | 
| MODELTIMEOUT | &quot;modelTimeout&quot; | 
| PROMPTINJECTION | &quot;promptInjection&quot; | 
| NOCITATIONS | &quot;noCitations&quot; | 
| INVALIDANSWERFORMAT | &quot;invalidAnswerFormat&quot; | 
| UNANSWERABLE | &quot;unanswerable&quot; | 
| POSTPROCESSINGREJECTED | &quot;postProcessingRejected&quot; | 
| SIMILARTOCONVERSATION | &quot;similarToConversation&quot; | 
| IGNORABLEPHRASE | &quot;ignorablePhrase&quot; | 
| MODELERROR | &quot;modelError&quot; | 
| NOCHUNKSFOUND | &quot;noChunksFound&quot; | 
| ANSWERGENERATIONTIMEOUT | &quot;answerGenerationTimeout&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:267.0.0_
