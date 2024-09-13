# LearningModulePreviewUpdateStep


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The id of the step |  [optional] |
| **successStatus** | [**SuccessStatusEnum**](#Enum--SuccessStatusEnum) | The success status of the step |  [optional] |
| **completionStatus** | [**CompletionStatusEnum**](#Enum--CompletionStatusEnum) | The completion status of the step |  [optional] |
| **completionPercentage** | **Float** | The completion percentage of the step |  [optional] |
| **percentageScore** | **Float** | Percentage Score |  [optional] |
| **structure** | [**List&lt;LearningModulePreviewUpdateScoStructure&gt;**](LearningModulePreviewUpdateScoStructure) | The structure for any SCO associated with this step |  [optional] |


## Enum: SuccessStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PASSED | &quot;Passed&quot; | 
| FAILED | &quot;Failed&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 


## Enum: CompletionStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| COMPLETED | &quot;Completed&quot; | 
| INCOMPLETE | &quot;Incomplete&quot; | 
| NOTATTEMPTED | &quot;NotAttempted&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:209.0.1_
