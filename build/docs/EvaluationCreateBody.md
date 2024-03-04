---
title: EvaluationCreateBody
---
## EvaluationCreateBody


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **evaluationForm** | <!----><!---->[**EvaluationCreateEvalForm**](EvaluationCreateEvalForm.html)<!----> | Evaluation form used for evaluation (must be included for a successful request) |  [optional] |
| **evaluator** | <!----><!---->[**EvaluationCreateUser**](EvaluationCreateUser.html)<!----> | User ID of the evaluator (must be included for a successful request) |  [optional] |
| **agent** | <!----><!---->[**EvaluationCreateUser**](EvaluationCreateUser.html)<!----> | User ID of the agent (must be included for a successful request) |  [optional] |
| **agentHasRead** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **answers** | <!----><!---->[**EvaluationScoringSet**](EvaluationScoringSet.html)<!----> |  |  [optional] |
| **calibration** | <!----><!---->[**EvaluationCreateCalibration**](EvaluationCreateCalibration.html)<!----> |  |  [optional] |
| **evaluationContextId** | <!----><!---->**String**<!----> |  |  [optional] |
| **conversation** | <!----><!---->[**EvaluationCreateConversation**](EvaluationCreateConversation.html)<!----> |  |  [optional] |
| **resourceType** | [**ResourceTypeEnum**](#ResourceTypeEnum)<!----> |  |  [optional] |
| **evaluationSource** | <!----><!---->[**EvaluationSource**](EvaluationSource.html)<!----> |  |  [optional] |
| **rescore** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **queue** | <!----><!---->[**EvaluationCreateQueue**](EvaluationCreateQueue.html)<!----> |  |  [optional] |
| **releaseDate** | <!----><!---->[**Date**](Date.html)<!----> | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> |  |  [optional] |
| **neverRelease** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **dateAssigneeChanged** | <!----><!---->[**Date**](Date.html)<!----> | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **assignee** | <!----><!---->[**EvaluationCreateUser**](EvaluationCreateUser.html)<!----> |  |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="ResourceTypeEnum"></a>

## Enum: ResourceTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EMAIL | &quot;EMAIL&quot; | 
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PENDING | &quot;PENDING&quot; | 
| INPROGRESS | &quot;INPROGRESS&quot; | 
| FINISHED | &quot;FINISHED&quot; | 
| INREVIEW | &quot;INREVIEW&quot; | 
| RETRACTED | &quot;RETRACTED&quot; | 
{: class="table table-striped"}



