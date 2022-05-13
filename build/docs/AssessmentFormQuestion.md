---
title: AssessmentFormQuestion
---
## AssessmentFormQuestion


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> |  |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum)<!----> |  |  [optional] |
| **text** | <!----><!---->**String**<!----> | The question text |  |
| **helpText** | <!----><!---->**String**<!----> |  |  [optional] |
| **naEnabled** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **commentsRequired** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **visibilityCondition** | <!----><!---->[**VisibilityCondition**](VisibilityCondition.html)<!----> |  |  [optional] |
| **answerOptions** | <!----><!---->[**List&lt;AnswerOption&gt;**](AnswerOption.html)<!----> | Options from which to choose an answer for this question. Only used by Multiple Choice type questions. |  [optional] |
| **maxResponseCharacters** | <!----><!---->**Integer**<!----> | How many characters are allowed in the text response to this question. Used by Free Text question types. |  [optional] |
| **isKill** | <!----><!---->**Boolean**<!----> | Does an incorrect answer to this question mark the form as having a failed kill question. Only used by Multiple Choice type questions. |  [optional] |
| **isCritical** | <!----><!---->**Boolean**<!----> | Does this question contribute to the critical score. Only used by Multiple Choice type questions. |  [optional] |
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



