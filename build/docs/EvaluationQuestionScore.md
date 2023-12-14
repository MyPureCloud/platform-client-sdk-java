---
title: EvaluationQuestionScore
---
## EvaluationQuestionScore


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **questionId** | <!----><!---->**String**<!----> |  |  [optional] |
| **answerId** | <!----><!---->**String**<!----> |  |  [optional] |
| **score** | <!----><!---->**Integer**<!----> | Unweighted score of the question |  [optional] |
| **markedNA** | <!----><!---->**Boolean**<!----> | True when the evaluation is submitted with a question that does not have an answer. Only allowed when naEnabled is true or if set by the system |  [optional] |
| **systemMarkedNA** | <!----><!---->**Boolean**<!----> | If markedNA is true, systemMarkedNA indicates whether it was marked by a user or by the system due to visibility conditions. Always false if markedNA is false. |  [optional] |
| **assistedAnswerId** | <!----><!---->**String**<!----> | AnswerId found with evaluation assistance conditions |  [optional] |
| **failedKillQuestion** | <!----><!---->**Boolean**<!----> | Applicable only on fatal questions. Indicates that the answer selected was not the highest score available for the question |  [optional] |
| **comments** | <!----><!---->**String**<!----> | Comments from the evaluator specific to this question |  [optional] |
{: class="table table-striped"}



