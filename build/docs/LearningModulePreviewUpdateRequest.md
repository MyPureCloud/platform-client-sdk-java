# LearningModulePreviewUpdateRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **state** | [**StateEnum**](#Enum--StateEnum) | The assignment State |  [optional] |
| **currentStep** | [**LearningModulePreviewUpdateRequestCurrentStep**](LearningModulePreviewUpdateRequestCurrentStep) | The assignment current step |  [optional] |
| **steps** | [**List&lt;LearningModulePreviewUpdateStep&gt;**](LearningModulePreviewUpdateStep) | The assignment Steps |  [optional] |
| **assessment** | [**LearningAssessment**](LearningAssessment) | The assessment for learning module |  [optional] |
| **assessmentForm** | [**AssessmentForm**](AssessmentForm) | The assessment form for learning module |  [optional] |


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




_com.mypurecloud.sdk.v2:platform-client-v2:231.0.0_
