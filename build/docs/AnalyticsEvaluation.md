# AnalyticsEvaluation


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **assigneeApplicable** | **Boolean** | Indicates whether an assignee is applicable for the evaluation. Set to false when assignee is not applicable |  [optional] |
| **assigneeId** | **String** | UserId of the assignee |  [optional] |
| **calibrationId** | **String** | The calibration ID used for the purpose of training evaluators |  [optional] |
| **contextId** | **String** | A unique identifier for an evaluation form, regardless of version |  [optional] |
| **deleted** | **Boolean** | Whether the evaluation has been deleted |  [optional] |
| **evaluationId** | **String** | Unique identifier for the evaluation |  [optional] |
| **evaluationStatus** | [**EvaluationStatusEnum**](#Enum--EvaluationStatusEnum) | Status of evaluation |  [optional] |
| **evaluatorId** | **String** | A unique identifier of the user who evaluated the interaction |  [optional] |
| **eventTime** | [**Date**](Date) | Specifies when an evaluation occurred. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **formId** | **String** | ID of the evaluation form used |  [optional] |
| **formName** | **String** | Name of the evaluation form used |  [optional] |
| **queueId** | **String** | The ID of the associated queue |  [optional] |
| **released** | **Boolean** | Whether the evaluation has been released |  [optional] |
| **rescored** | **Boolean** | Whether the evaluation has been rescored at least once |  [optional] |
| **systemSubmitted** | **Boolean** | Whether the evaluation was auto submitted by the system |  [optional] |
| **userId** | **String** | ID of the agent the evaluation was performed against |  [optional] |
| **oTotalCriticalScore** | **Long** |  |  [optional] |
| **oTotalScore** | **Long** |  |  [optional] |


## Enum: EvaluationStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| FINISHED | &quot;Finished&quot; | 
| INPROGRESS | &quot;InProgress&quot; | 
| INREVIEW | &quot;InReview&quot; | 
| PENDING | &quot;Pending&quot; | 
| RETRACTED | &quot;Retracted&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
