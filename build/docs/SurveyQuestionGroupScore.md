# SurveyQuestionGroupScore


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **questionGroupId** | **String** |  |  [optional] |
| **totalScore** | **Float** | Score of all questions in the group |  [optional] |
| **maxTotalScore** | **Float** | Maximum possible score of all questions in the group |  [optional] |
| **markedNA** | **Boolean** | True when the evaluation is submitted with a question group that does not have any answers. Only allowed when naEnabled is true or if set by the system |  [optional] |
| **systemMarkedNA** | **Boolean** | If markedNA is true, systemMarkedNA indicates whether it was marked by a user or by the system due to visibility conditions. Always false if markedNA is false. |  [optional] |
| **questionScores** | [**List&lt;SurveyQuestionScore&gt;**](SurveyQuestionScore) |  |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:235.0.0_
