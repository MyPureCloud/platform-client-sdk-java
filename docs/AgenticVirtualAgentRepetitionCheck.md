# AgenticVirtualAgentRepetitionCheck


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | Whether this check looks for repetition in user messages or agent responses. |  |
| **messages** | **Integer** | The number of prior messages of the specified type to compare for repetition. |  |
| **similarity** | [**SimilarityEnum**](#Enum--SimilarityEnum) | The similarity category compared to the Levenshtein result that triggers this check's instruction. |  |
| **instruction** | **String** | The instruction added to the virtual agent's turn when message similarity matches the configured category. |  |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| USER | &quot;User&quot; | 
| AGENT | &quot;Agent&quot; | 


## Enum: SimilarityEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| LOOSE | &quot;Loose&quot; | 
| MODERATE | &quot;Moderate&quot; | 
| STRICT | &quot;Strict&quot; | 
| VERYSTRICT | &quot;VeryStrict&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:260.1.0_
