---
title: EvaluationQualityV2TopicEvaluationV2
---
## EvaluationQualityV2TopicEvaluationV2


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> |  |  [optional] |
| **conversationId** | <!----><!---->**String**<!----> |  |  [optional] |
| **agent** | <!----><!---->[**EvaluationQualityV2TopicUser**](EvaluationQualityV2TopicUser.html)<!----> |  |  [optional] |
| **evaluator** | <!----><!---->[**EvaluationQualityV2TopicUser**](EvaluationQualityV2TopicUser.html)<!----> |  |  [optional] |
| **eventTime** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **evaluationFormId** | <!----><!---->**String**<!----> |  |  [optional] |
| **formName** | <!----><!---->**String**<!----> |  |  [optional] |
| **scoringSet** | <!----><!---->[**EvaluationQualityV2TopicEvaluationScoringSet**](EvaluationQualityV2TopicEvaluationScoringSet.html)<!----> |  |  [optional] |
| **contextId** | <!----><!---->**String**<!----> |  |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> |  |  [optional] |
| **agentHasRead** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **releaseDate** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **assignedDate** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **changedDate** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **eventType** | <!----><!---->**String**<!----> |  |  [optional] |
| **resourceId** | <!----><!---->**String**<!----> |  |  [optional] |
| **resourceType** | <!----><!---->**String**<!----> |  |  [optional] |
| **divisionIds** | <!----><!---->**List&lt;String&gt;**<!----> |  |  [optional] |
| **rescore** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **conversationDate** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **mediaType** | <!----><!---->**List&lt;String&gt;**<!----> |  |  [optional] |
| **calibration** | <!----><!---->[**EvaluationQualityV2TopicCalibration**](EvaluationQualityV2TopicCalibration.html)<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PENDING | &quot;Pending&quot; | 
| INPROGRESS | &quot;InProgress&quot; | 
| FINISHED | &quot;Finished&quot; | 
{: class="table table-striped"}



