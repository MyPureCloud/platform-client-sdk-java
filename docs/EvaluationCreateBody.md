# EvaluationCreateBody


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **evaluationForm** | [**EvaluationCreateEvalForm**](EvaluationCreateEvalForm) | Evaluation form used for evaluation (must be included for a successful request) |  [optional] |
| **evaluator** | [**EvaluationCreateUser**](EvaluationCreateUser) | User ID of the evaluator (must be included for a successful request) |  [optional] |
| **agent** | [**EvaluationCreateUser**](EvaluationCreateUser) | User ID of the agent (must be included for a successful request) |  [optional] |
| **agentHasRead** | **Boolean** |  |  [optional] |
| **answers** | [**EvaluationScoringSet**](EvaluationScoringSet) |  |  [optional] |
| **calibration** | [**EvaluationCreateCalibration**](EvaluationCreateCalibration) |  |  [optional] |
| **evaluationContextId** | **String** |  |  [optional] |
| **conversation** | [**EvaluationCreateConversation**](EvaluationCreateConversation) |  |  [optional] |
| **resourceType** | [**ResourceTypeEnum**](#Enum--ResourceTypeEnum) |  |  [optional] |
| **evaluationSource** | [**EvaluationSource**](EvaluationSource) |  |  [optional] |
| **rescore** | **Boolean** |  |  [optional] |
| **queue** | [**EvaluationCreateQueue**](EvaluationCreateQueue) |  |  [optional] |
| **releaseDate** | [**Date**](Date) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) |  |  [optional] |
| **neverRelease** | **Boolean** |  |  [optional] |
| **dateAssigneeChanged** | [**Date**](Date) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **assignee** | [**EvaluationCreateUser**](EvaluationCreateUser) |  |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: ResourceTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EMAIL | &quot;EMAIL&quot; | 


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PENDING | &quot;PENDING&quot; | 
| INPROGRESS | &quot;INPROGRESS&quot; | 
| FINISHED | &quot;FINISHED&quot; | 
| INREVIEW | &quot;INREVIEW&quot; | 
| RETRACTED | &quot;RETRACTED&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:238.0.0_
