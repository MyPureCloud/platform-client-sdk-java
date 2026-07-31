# ReportingTurnKnowledgeMetadata


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **knowledgeId** | **String** | The ID of the knowledge setting or knowledge base |  [optional] |
| **knowledgeName** | **String** | The name of the knowledge setting or knowledge base |  [optional] |
| **searchId** | **String** | SearchID used in the attempted search |  [optional] |
| **query** | **String** | The query used in the knowledge query |  [optional] |
| **retrievalStatus** | [**RetrievalStatusEnum**](#Enum--RetrievalStatusEnum) | The result of the knowledge search |  [optional] |
| **answerGenerationStatus** | [**AnswerGenerationStatusEnum**](#Enum--AnswerGenerationStatusEnum) | The result of the knowledge generation |  [optional] |
| **generatedAnswer** | **String** | The generated answer |  [optional] |
| **failureReason** | [**FailureReasonEnum**](#Enum--FailureReasonEnum) | Failure reason if knowledge query failed |  [optional] |
| **topConfidence** | **Double** | Highest confidence score of returned knowledgeSources |  [optional] |
| **retrievedSources** | [**List&lt;KnowledgeSource&gt;**](KnowledgeSource) | List of the sources retrieved by the knowledge search |  [optional] |


## Enum: RetrievalStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SUCCESS | &quot;Success&quot; | 
| FAILURE | &quot;Failure&quot; | 
| NORESULTS | &quot;NoResults&quot; | 
| TIMEOUT | &quot;Timeout&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 


## Enum: AnswerGenerationStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SUCCESS | &quot;Success&quot; | 
| FAILURE | &quot;Failure&quot; | 
| NOTATTEMPTED | &quot;NotAttempted&quot; | 
| NOANSWERGENERATED | &quot;NoAnswerGenerated&quot; | 
| TIMEOUT | &quot;Timeout&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 


## Enum: FailureReasonEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INTERNALERROR | &quot;InternalError&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:259.0.0_
