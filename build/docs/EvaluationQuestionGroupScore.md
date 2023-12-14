---
title: EvaluationQuestionGroupScore
---
## EvaluationQuestionGroupScore


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **questionGroupId** | <!----><!---->**String**<!----> |  |  [optional] |
| **totalScore** | <!----><!---->**Float**<!----> | Score of all questions in the group |  [optional] |
| **maxTotalScore** | <!----><!---->**Float**<!----> | Maximum possible score of all questions in the group |  [optional] |
| **markedNA** | <!----><!---->**Boolean**<!----> | True when the evaluation is submitted with a question group that does not have any answers. Only allowed when naEnabled is true or if set by the system |  [optional] |
| **systemMarkedNA** | <!----><!---->**Boolean**<!----> | If markedNA is true, systemMarkedNA indicates whether it was marked by a user or by the system due to visibility conditions. Always false if markedNA is false. |  [optional] |
| **totalCriticalScore** | <!----><!---->**Float**<!----> | Score of only the critical questions in the group |  [optional] |
| **maxTotalCriticalScore** | <!----><!---->**Float**<!----> | Maximum possible score of only the critical questions in the group |  [optional] |
| **totalNonCriticalScore** | <!----><!---->**Float**<!----> | Score of only the non critical questions in the group |  [optional] |
| **maxTotalNonCriticalScore** | <!----><!---->**Float**<!----> | Maximum possible score of only the non critical questions in the group |  [optional] |
| **totalScoreUnweighted** | <!----><!---->**Float**<!----> | Unweighted score of all questions in the group |  [optional] |
| **maxTotalScoreUnweighted** | <!----><!---->**Float**<!----> | Maximum possible unweighted score of all questions in the group |  [optional] |
| **totalCriticalScoreUnweighted** | <!----><!---->**Float**<!----> | Unweighted score of only the critical questions in the group |  [optional] |
| **maxTotalCriticalScoreUnweighted** | <!----><!---->**Float**<!----> | Maximum possible unweighted score of only the critical questions in the group |  [optional] |
| **totalNonCriticalScoreUnweighted** | <!----><!---->**Float**<!----> | Unweighted score of only the non critical questions in the group |  [optional] |
| **maxTotalNonCriticalScoreUnweighted** | <!----><!---->**Float**<!----> | Maximum possible unweighted score of only the non critical questions in the group |  [optional] |
| **questionScores** | <!----><!---->[**List&lt;EvaluationQuestionScore&gt;**](EvaluationQuestionScore.html)<!----> |  |  [optional] |
{: class="table table-striped"}



