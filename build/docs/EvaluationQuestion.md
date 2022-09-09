---
title: EvaluationQuestion
---
## EvaluationQuestion


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> |  |  [optional] |
| **text** | <!----><!---->**String**<!----> |  |  [optional] |
| **helpText** | <!----><!---->**String**<!----> |  |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum)<!----> |  |  [optional] |
| **naEnabled** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **commentsRequired** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **visibilityCondition** | <!----><!---->[**VisibilityCondition**](VisibilityCondition.html)<!----> |  |  [optional] |
| **answerOptions** | <!----><!---->[**List&lt;AnswerOption&gt;**](AnswerOption.html)<!----> | Options from which to choose an answer for this question. Only used by Multiple Choice type questions. |  [optional] |
| **isKill** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **isCritical** | <!----><!---->**Boolean**<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| MULTIPLECHOICEQUESTION | &quot;multipleChoiceQuestion&quot; | 
| FREETEXTQUESTION | &quot;freeTextQuestion&quot; | 
| NPSQUESTION | &quot;npsQuestion&quot; | 
| READONLYTEXTBLOCKQUESTION | &quot;readOnlyTextBlockQuestion&quot; | 
{: class="table table-striped"}



