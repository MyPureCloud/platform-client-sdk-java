# AgentCopilotAggregationView


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **target** | [**TargetEnum**](#Enum--TargetEnum) | Target metric name |  |
| **name** | **String** | A unique name for this view. Must be distinct from other views and built-in metric names. |  |
| **function** | [**FunctionEnum**](#Enum--FunctionEnum) | Type of view you wish to create |  |
| **range** | [**AggregationRange**](AggregationRange) | Range of numbers for slicing up data |  [optional] |


## Enum: TargetEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NCANNEDRESPONSESUGGESTIONS | &quot;nCannedResponseSuggestions&quot; | 
| NDISTINCTSUGGESTIONS | &quot;nDistinctSuggestions&quot; | 
| NKNOWLEDGEARTICLESUGGESTIONS | &quot;nKnowledgeArticleSuggestions&quot; | 
| NKNOWLEDGESEARCHSUGGESTIONS | &quot;nKnowledgeSearchSuggestions&quot; | 
| NSCRIPTSUGGESTIONS | &quot;nScriptSuggestions&quot; | 


## Enum: FunctionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| RANGEBOUND | &quot;rangeBound&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:234.0.0_
