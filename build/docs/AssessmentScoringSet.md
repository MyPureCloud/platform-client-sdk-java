---
title: AssessmentScoringSet
---
## AssessmentScoringSet


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **totalScore** | <!----><!---->**Float**<!----> | The total score of the answers |  [optional] |
| **totalCriticalScore** | <!----><!---->**Float**<!----> | The total score for the critical questions |  [optional] |
| **totalNonCriticalScore** | <!----><!---->**Float**<!----> | The total score for the non-critical questions |  [optional] |
| **questionGroupScores** | <!----><!---->[**List&lt;AssessmentQuestionGroupScore&gt;**](AssessmentQuestionGroupScore.html)<!----> | The individual scores for each question group |  |
| **failureReasons** | <!---->[**List&lt;FailureReasonsEnum&gt;**](#FailureReasonsEnum)<!----> | If the assessment was not passed, the reasons for failure. |  [optional] |
| **comments** | <!----><!---->**String**<!----> | Comments provided for these answers. |  [optional] |
| **agentComments** | <!----><!---->**String**<!----> | Comments provided by agent. |  [optional] |
| **isPassed** | <!----><!---->**Boolean**<!----> | True if the assessment was passed |  [optional] |
{: class="table table-striped"}


<a name="FailureReasonsEnum"></a>

## Enum: FailureReasonsEnum

| Name | Value |
| ---- | ----- |
| SCORE | &quot;Score&quot; |
| CRITICALSCORE | &quot;CriticalScore&quot; |
| KILLQUESTION | &quot;KillQuestion&quot; |
{: class="table table-striped"}



