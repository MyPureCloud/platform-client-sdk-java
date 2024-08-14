---
title: LearningModulePreviewUpdateResponseAssignment
---
## LearningModulePreviewUpdateResponseAssignment


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **state** | [**StateEnum**](#StateEnum)<!----> | The Learning Assignment state |  [optional] |
| **percentageScore** | <!----><!---->**Float**<!----> | The user's percentage score for this assignment |  [optional] |
| **completionPercentage** | <!----><!---->**Float**<!----> | The overall completion percentage of assignment |  [optional] |
| **assessmentPercentageScore** | <!----><!---->**Float**<!----> | The user's percentage score for this assignment's assessment |  [optional] |
| **assessmentCompletionPercentage** | <!----><!---->**Float**<!----> | The assessment completion percentage of assignment |  [optional] |
| **isPassed** | <!----><!---->**Boolean**<!----> | True if the assessment was passed |  [optional] |
| **currentStep** | <!----><!---->[**LearningModulePreviewUpdateResponseCurrentStep**](LearningModulePreviewUpdateResponseCurrentStep.html)<!----> | The next assignment step |  [optional] |
| **steps** | <!----><!---->[**List&lt;LearningModulePreviewUpdateStep&gt;**](LearningModulePreviewUpdateStep.html)<!----> | List of assignment steps |  [optional] |
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



