# AssessmentForm


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **dateModified** | [**Date**](Date) | Last modified date of the assessment form. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **contextId** | **String** | The unique Id for all versions of this assessment form |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
| **published** | **Boolean** | If true, assessment form is published |  [optional] |
| **passPercent** | **Integer** | The pass percent for the assessment form |  |
| **questionGroups** | [**List&lt;AssessmentFormQuestionGroup&gt;**](AssessmentFormQuestionGroup) | A list of question groups |  |




_com.mypurecloud.sdk.v2:platform-client-v2:241.0.0_
