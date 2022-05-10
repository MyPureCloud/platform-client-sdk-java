---
title: CalibrationCreate
---
## CalibrationCreate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **calibrator** | <!----><!---->[**User**](User.html)<!----> |  |  [optional] |
| **agent** | <!----><!---->[**User**](User.html)<!----> |  |  [optional] |
| **conversation** | <!----><!---->[**ConversationReference**](ConversationReference.html)<!----> | The conversation to use for the calibration. |  |
| **evaluationForm** | <!----><!---->[**EvaluationForm**](EvaluationForm.html)<!----> |  |  [optional] |
| **contextId** | <!----><!---->**String**<!----> |  |  [optional] |
| **averageScore** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **highScore** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **lowScore** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **createdDate** | <!----><!---->[**Date**](Date.html)<!----> | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **evaluations** | <!----><!---->[**List&lt;Evaluation&gt;**](Evaluation.html)<!----> |  |  [optional] |
| **evaluators** | <!----><!---->[**List&lt;User&gt;**](User.html)<!----> |  |  [optional] |
| **scoringIndex** | <!----><!---->[**Evaluation**](Evaluation.html)<!----> |  |  [optional] |
| **expertEvaluator** | <!----><!---->[**User**](User.html)<!----> |  |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}



