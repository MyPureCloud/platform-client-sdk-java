# EvaluationFormResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The evaluation form name |  |
| **modifiedDate** | [**Date**](Date) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **published** | **Boolean** |  |  [optional] |
| **contextId** | **String** |  |  [optional] |
| **questionGroups** | [**List&lt;EvaluationQuestionGroup&gt;**](EvaluationQuestionGroup) | A list of question groups |  [optional] |
| **weightMode** | [**WeightModeEnum**](#Enum--WeightModeEnum) | Mode for evaluation form weight |  [optional] |
| **evaluationSettings** | [**EvaluationSettings**](EvaluationSettings) | Settings for evaluations associated with this form |  [optional] |
| **publishedVersions** | [**DomainEntityListingEvaluationForm**](DomainEntityListingEvaluationForm) | A list of the published versions of this form. Not populated by default, its availability depends on the endpoint. Use the 'expand=publishHistory' query parameter to retrieve this data where applicable (refer to the endpoint description to see if it is applicable). |  [optional] |
| **aiScoring** | [**AiScoringSettings**](AiScoringSettings) | AI scoring settings for the evaluation form. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: WeightModeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SCALED | &quot;SCALED&quot; | 
| OFF | &quot;OFF&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:240.0.0_
