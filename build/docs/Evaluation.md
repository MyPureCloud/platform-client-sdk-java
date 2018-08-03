---
title: Evaluation
---
## Evaluation


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **conversation** | [**Conversation**](Conversation.html) |  |  [optional] |
| **evaluationForm** | [**EvaluationForm**](EvaluationForm.html) | Evaluation form used for evaluation. |  [optional] |
| **evaluator** | [**User**](User.html) |  |  [optional] |
| **agent** | [**User**](User.html) |  |  [optional] |
| **calibration** | [**Calibration**](Calibration.html) |  |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
| **answers** | [**EvaluationScoringSet**](EvaluationScoringSet.html) |  |  [optional] |
| **agentHasRead** | **Boolean** |  |  [optional] |
| **releaseDate** | [**Date**](Date.html) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **assignedDate** | [**Date**](Date.html) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **changedDate** | [**Date**](Date.html) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **queue** | [**Queue**](Queue.html) |  |  [optional] |
| **neverRelease** | **Boolean** | Signifies if the evaluation is never to be released. This cannot be set true if release date is also set. |  [optional] |
| **resourceId** | **String** | Only used for email evaluations. Will be null for all other evaluations. |  [optional] |
| **resourceType** | [**ResourceTypeEnum**](#ResourceTypeEnum) | The type of resource. Only used for email evaluations. Will be null for evaluations on all other resources. |  [optional] |
| **redacted** | **Boolean** | Is only true when the user making the request does not have sufficient permissions to see evaluation |  [optional] |
| **isScoringIndex** | **Boolean** |  |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| PENDING | &quot;PENDING&quot; |
| INPROGRESS | &quot;INPROGRESS&quot; |
| FINISHED | &quot;FINISHED&quot; |
{: class="table table-striped"}


<a name="ResourceTypeEnum"></a>

## Enum: ResourceTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| EMAIL | &quot;EMAIL&quot; |
{: class="table table-striped"}



