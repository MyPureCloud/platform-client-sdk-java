---
title: LearningModulePreviewUpdateRequest
---
## LearningModulePreviewUpdateRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **state** | [**StateEnum**](#StateEnum)<!----> | The assignment State |  [optional] |
| **currentStep** | <!----><!---->[**LearningModulePreviewUpdateRequestCurrentStep**](LearningModulePreviewUpdateRequestCurrentStep.html)<!----> | The assignment current step |  [optional] |
| **steps** | <!----><!---->[**List&lt;LearningModulePreviewUpdateStep&gt;**](LearningModulePreviewUpdateStep.html)<!----> | The assignment Steps |  [optional] |
| **assessment** | <!----><!---->[**LearningAssessment**](LearningAssessment.html)<!----> | The assessment for learning module |  [optional] |
| **assessmentForm** | <!----><!---->[**AssessmentForm**](AssessmentForm.html)<!----> | The assessment form for learning module |  [optional] |
{: class="table table-striped"}


<a name="StateEnum"></a>

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
{: class="table table-striped"}



