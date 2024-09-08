---
title: Copilot
---
## Copilot


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **enabled** | <!----><!---->**Boolean**<!----> | Copilot is enabled. |  [optional] |
| **liveOnQueue** | <!----><!---->**Boolean**<!----> | Copilot is live on selected queue. |  |
| **defaultLanguage** | <!----><!---->**String**<!----> | Copilot default language, e.g. [en-US, es-US, es-ES]. Once set, it can not be modified. |  |
| **knowledgeAnswerConfig** | <!----><!---->[**KnowledgeAnswerConfig**](KnowledgeAnswerConfig.html)<!----> | Knowledge answer configuration. |  [optional] |
| **summaryGenerationConfig** | <!----><!---->[**SummaryGenerationConfig**](SummaryGenerationConfig.html)<!----> | Copilot generated summary configuration. |  [optional] |
| **wrapupCodePredictionConfig** | <!----><!---->[**WrapupCodePredictionConfig**](WrapupCodePredictionConfig.html)<!----> | Copilot generated wrapup code prediction configuration. |  [optional] |
| **answerGenerationConfig** | <!----><!---->[**AnswerGenerationConfig**](AnswerGenerationConfig.html)<!----> | Answer generation configuration. |  [optional] |
| **nluEngineType** | [**NluEngineTypeEnum**](#NluEngineTypeEnum)<!----> | Language understanding engine type. |  [optional] |
| **nluConfig** | <!----><!---->[**NluConfig**](NluConfig.html)<!----> | NLU configuration. |  [optional] |
| **ruleEngineConfig** | <!----><!---->[**RuleEngineConfig**](RuleEngineConfig.html)<!----> | Rule engine configuration. |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="NluEngineTypeEnum"></a>

## Enum: NluEngineTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NLUV3 | &quot;NluV3&quot; | 
{: class="table table-striped"}



