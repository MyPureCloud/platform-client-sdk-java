# EvaluationSettings


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **revisionsEnabled** | **Boolean** | Whether revisions are allowed for evaluations. When enabled, rescoring creates a new version of the evaluation and retracts the existing evaluation version. Does not apply for calibration evaluations. |  [optional] |
| **disputesEnabled** | **Boolean** | Whether disputes are allowed for evaluations. Does not apply for calibration evaluations. |  [optional] |
| **disputesAllowedPerEvaluation** | **Integer** | The maximum number of disputes allowed for an evaluation. |  [optional] |
| **disputesAssignees** | [**List&lt;EvaluationSettingsAssignee&gt;**](EvaluationSettingsAssignee) | A list of assignees responsible for handling each dispute. This list size needs to be equal to disputesAllowedPerEvaluation. |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:217.0.0_
