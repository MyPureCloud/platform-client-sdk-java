# EvaluationQualityV2TopicEvaluationV2


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **conversationId** | **String** |  |  [optional] |
| **agent** | [**EvaluationQualityV2TopicUser**](EvaluationQualityV2TopicUser) |  |  [optional] |
| **evaluator** | [**EvaluationQualityV2TopicUser**](EvaluationQualityV2TopicUser) |  |  [optional] |
| **eventTime** | [**Date**](Date) |  |  [optional] |
| **evaluationFormId** | **String** |  |  [optional] |
| **formName** | **String** |  |  [optional] |
| **scoringSet** | [**EvaluationQualityV2TopicEvaluationScoringSet**](EvaluationQualityV2TopicEvaluationScoringSet) |  |  [optional] |
| **contextId** | **String** |  |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) |  |  [optional] |
| **agentHasRead** | **Boolean** |  |  [optional] |
| **releaseDate** | [**Date**](Date) |  |  [optional] |
| **assignedDate** | [**Date**](Date) |  |  [optional] |
| **changedDate** | [**Date**](Date) |  |  [optional] |
| **eventType** | **String** |  |  [optional] |
| **resourceId** | **String** |  |  [optional] |
| **resourceType** | **String** |  |  [optional] |
| **divisionIds** | **List&lt;String&gt;** |  |  [optional] |
| **rescore** | **Boolean** |  |  [optional] |
| **conversationDate** | [**Date**](Date) |  |  [optional] |
| **mediaType** | **List&lt;String&gt;** |  |  [optional] |
| **calibration** | [**EvaluationQualityV2TopicCalibration**](EvaluationQualityV2TopicCalibration) |  |  [optional] |
| **evaluationSource** | [**EvaluationQualityV2TopicEvaluationSource**](EvaluationQualityV2TopicEvaluationSource) |  |  [optional] |
| **assigneeUserId** | **String** |  |  [optional] |
| **previousAssigneeUserId** | **String** |  |  [optional] |
| **assigneeApplicable** | **Boolean** |  |  [optional] |
| **evaluationContextId** | **String** |  |  [optional] |
| **disputeCount** | **Integer** |  |  [optional] |
| **version** | **Integer** |  |  [optional] |
| **previousStatus** | [**PreviousStatusEnum**](#Enum--PreviousStatusEnum) |  |  [optional] |
| **declinedReview** | **Boolean** |  |  [optional] |
| **retractedEvaluation** | [**EvaluationQualityV2TopicEvaluationReference**](EvaluationQualityV2TopicEvaluationReference) |  |  [optional] |
| **rescoreCount** | **Integer** |  |  [optional] |
| **evaluatorCommentHasUpdated** | **Boolean** |  |  [optional] |
| **agentCommentHasUpdated** | **Boolean** |  |  [optional] |
| **previousRescoreCount** | **Integer** |  |  [optional] |
| **previousEvaluatorUserId** | **String** |  |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PENDING | &quot;Pending&quot; | 
| INPROGRESS | &quot;InProgress&quot; | 
| FINISHED | &quot;Finished&quot; | 
| INREVIEW | &quot;InReview&quot; | 
| RETRACTED | &quot;Retracted&quot; | 


## Enum: PreviousStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PENDING | &quot;Pending&quot; | 
| INPROGRESS | &quot;InProgress&quot; | 
| FINISHED | &quot;Finished&quot; | 
| INREVIEW | &quot;InReview&quot; | 
| RETRACTED | &quot;Retracted&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:211.0.0_
