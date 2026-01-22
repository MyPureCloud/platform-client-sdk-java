# Copilot


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **enabled** | **Boolean** | Copilot is enabled. |  [optional] |
| **liveOnQueue** | **Boolean** | Copilot is live on selected queue. |  |
| **defaultLanguage** | **String** | Copilot default language, e.g. [en-US, es-US, es-ES]. Once set, it can not be modified. |  |
| **knowledgeAnswerConfig** | [**KnowledgeAnswerConfig**](KnowledgeAnswerConfig) | Knowledge answer configuration. |  [optional] |
| **summaryGenerationConfig** | [**SummaryGenerationConfig**](SummaryGenerationConfig) | Copilot generated summary configuration. |  [optional] |
| **wrapupCodePredictionConfig** | [**WrapupCodePredictionConfig**](WrapupCodePredictionConfig) | Copilot generated wrapup code prediction configuration. |  [optional] |
| **answerGenerationConfig** | [**AnswerGenerationConfig**](AnswerGenerationConfig) | Answer generation configuration. |  [optional] |
| **nluEngineType** | [**NluEngineTypeEnum**](#Enum--NluEngineTypeEnum) | Language understanding engine type. |  [optional] |
| **nluConfig** | [**NluConfig**](NluConfig) | NLU configuration. |  [optional] |
| **ruleEngineConfig** | [**RuleEngineConfig**](RuleEngineConfig) | Rule engine configuration. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: NluEngineTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NLUV3 | &quot;NluV3&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:245.0.0_
