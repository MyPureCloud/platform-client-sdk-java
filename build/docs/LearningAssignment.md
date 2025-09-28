# LearningAssignment


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **assessment** | [**LearningAssessment**](LearningAssessment) | The assessment associated with this assignment |  [optional] |
| **createdBy** | [**UserReference**](UserReference) | The user who created the assignment |  [optional] |
| **dateCreated** | [**Date**](Date) | The date when the assignment was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **modifiedBy** | [**UserReference**](UserReference) | The user who modified the assignment |  [optional] |
| **dateModified** | [**Date**](Date) | The date when the assignment was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **isOverdue** | **Boolean** | True if the assignment is overdue |  [optional] |
| **percentageScore** | **Float** | The user's percentage score for this assignment |  [optional] |
| **assessmentPercentageScore** | **Float** | The user's percentage score for this assignment's assessment |  [optional] |
| **isRule** | **Boolean** | True if this assignment was created by a Rule |  [optional] |
| **isManual** | **Boolean** | True if this assignment was created manually |  [optional] |
| **isPassed** | **Boolean** | True if the assessment was passed |  [optional] |
| **isLatest** | **Boolean** | True if the assignment is based on latest module |  [optional] |
| **assessmentCompletionPercentage** | **Float** | The assessment completion percentage of assignment |  [optional] |
| **completionPercentage** | **Float** | The overall completion percentage of assignment |  [optional] |
| **steps** | [**List&lt;LearningAssignmentStep&gt;**](LearningAssignmentStep) | List of assignment steps |  [optional] |
| **nextStep** | [**LearningAssignmentStep**](LearningAssignmentStep) | The next assignment step |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) | The Learning Assignment state |  [optional] |
| **dateRecommendedForCompletion** | [**Date**](Date) | The recommended completion date of the assignment. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **version** | **Integer** | The version of Learning module assigned |  [optional] |
| **module** | [**LearningModule**](LearningModule) | The Learning module object associated with this assignment |  [optional] |
| **user** | [**UserReference**](UserReference) | The user to whom the assignment is assigned |  [optional] |
| **assessmentForm** | [**AssessmentForm**](AssessmentForm) | The assessment form associated with this assignment |  [optional] |
| **lengthInMinutes** | **Integer** | The length in minutes of the assignment |  [optional] |


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ASSIGNED | &quot;Assigned&quot; | 
| INPROGRESS | &quot;InProgress&quot; | 
| COMPLETED | &quot;Completed&quot; | 
| DELETED | &quot;Deleted&quot; | 
| NOTCOMPLETED | &quot;NotCompleted&quot; | 
| INVALIDSCHEDULE | &quot;InvalidSchedule&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:232.0.0_
