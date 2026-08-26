# QueryReformulationContext


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **knowledgeClassification** | [**KnowledgeClassificationEnum**](#Enum--KnowledgeClassificationEnum) | The knowledge classification result indicating whether the query is appropriate for knowledge retrieval. |  [optional] |
| **reformulatedQuery** | **String** | The reformulated standalone query optimized for retrieval, if query reformulation was enabled and produced a result. |  [optional] |


## Enum: KnowledgeClassificationEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| YES | &quot;Yes&quot; | 
| NO | &quot;No&quot; | 
| MAYBE | &quot;Maybe&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:261.0.0_
