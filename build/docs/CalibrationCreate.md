# CalibrationCreate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **calibrator** | [**User**](User) |  |  [optional] |
| **agent** | [**User**](User) |  |  [optional] |
| **conversation** | [**ConversationReference**](ConversationReference) | The conversation to use for the calibration. |  |
| **evaluationForm** | [**EvaluationForm**](EvaluationForm) |  |  [optional] |
| **contextId** | **String** |  |  [optional] |
| **averageScore** | **Integer** |  |  [optional] |
| **highScore** | **Integer** |  |  [optional] |
| **lowScore** | **Integer** |  |  [optional] |
| **createdDate** | [**Date**](Date) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **evaluations** | [**List&lt;Evaluation&gt;**](Evaluation) |  |  [optional] |
| **evaluators** | [**List&lt;User&gt;**](User) |  |  [optional] |
| **scoringIndex** | [**Evaluation**](Evaluation) |  |  [optional] |
| **expertEvaluator** | [**User**](User) |  |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:223.0.0_
