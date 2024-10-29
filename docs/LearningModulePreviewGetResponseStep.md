# LearningModulePreviewGetResponseStep


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The id of the step |  [optional] |
| **moduleStep** | [**LearningModuleInformStep**](LearningModuleInformStep) | The module step data for this step |  [optional] |
| **structure** | [**List&lt;LearningModulePreviewGetScoStructure&gt;**](LearningModulePreviewGetScoStructure) | The structure for any SCO associated with this step |  [optional] |
| **successStatus** | [**SuccessStatusEnum**](#Enum--SuccessStatusEnum) | The success status of this step |  [optional] |
| **completionStatus** | [**CompletionStatusEnum**](#Enum--CompletionStatusEnum) | The completion status of the assignment step |  [optional] |
| **completionPercentage** | **Float** | The completion percentage for this step |  [optional] |
| **percentageScore** | **Float** | The percentage score for this step |  [optional] |
| **signedCookie** | [**LearningAssignmentStepSignedCookie**](LearningAssignmentStepSignedCookie) | The signed cookie information needed to access the content of this step (if required) |  [optional] |


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




_com.mypurecloud.sdk.v2:platform-client-v2:213.0.0_
