# LearningModulePreviewGetResponseAssignment


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **state** | [**StateEnum**](#Enum--StateEnum) | The Learning Assignment state |  [optional] |
| **percentageScore** | **Float** | The user's percentage score for this assignment |  [optional] |
| **assessmentPercentageScore** | **Float** | The user's percentage score for this assignment's assessment |  [optional] |
| **isPassed** | **Boolean** | True if the assessment was passed |  [optional] |
| **assessmentCompletionPercentage** | **Float** | The assessment completion percentage of assignment |  [optional] |
| **completionPercentage** | **Float** | The overall completion percentage of assignment |  [optional] |
| **steps** | [**List&lt;LearningModulePreviewGetResponseStep&gt;**](LearningModulePreviewGetResponseStep) | List of assignment steps |  [optional] |


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




_com.mypurecloud.sdk.v2:platform-client-v2:213.0.0_
