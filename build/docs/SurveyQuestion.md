---
title: SurveyQuestion
---
## SurveyQuestion


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> |  |  [optional] |
| **text** | <!----><!---->**String**<!----> |  |  [optional] |
| **helpText** | <!----><!---->**String**<!----> |  |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum)<!----> |  |  [optional] |
| **naEnabled** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **visibilityCondition** | <!----><!---->[**VisibilityCondition**](VisibilityCondition.html)<!----> |  |  [optional] |
| **answerOptions** | <!----><!---->[**List&lt;AnswerOption&gt;**](AnswerOption.html)<!----> | Options from which to choose an answer for this question. Only used by Multiple Choice type questions. |  [optional] |
| **maxResponseCharacters** | <!----><!---->**Integer**<!----> | How many characters are allowed in the text response to this question. Used by NPS and Free Text question types. |  [optional] |
| **explanationPrompt** | <!----><!---->**String**<!----> | Prompt for details explaining the chosen NPS score. Used by NPS questions. |  [optional] |
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



