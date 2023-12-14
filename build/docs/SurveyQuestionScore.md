---
title: SurveyQuestionScore
---
## SurveyQuestionScore


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **questionId** | <!----><!---->**String**<!----> |  |  [optional] |
| **answerId** | <!----><!---->**String**<!----> |  |  [optional] |
| **score** | <!----><!---->**Integer**<!----> | Unweighted score of the question |  [optional] |
| **markedNA** | <!----><!---->**Boolean**<!----> | True when the evaluation is submitted with a question that does not have an answer. Only allowed when naEnabled is true or if set by the system |  [optional] |
| **systemMarkedNA** | <!----><!---->**Boolean**<!----> | If markedNA is true, systemMarkedNA indicates whether it was marked by a user or by the system due to visibility conditions. Always false if markedNA is false. |  [optional] |
| **assistedAnswerId** | <!----><!---->**String**<!----> | AnswerId found with evaluation assistance conditions |  [optional] |
| **npsScore** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **npsTextAnswer** | <!----><!---->**String**<!----> |  |  [optional] |
| **freeTextAnswer** | <!----><!---->**String**<!----> |  |  [optional] |
{: class="table table-striped"}



