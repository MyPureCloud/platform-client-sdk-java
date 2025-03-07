# LearningModulePreviewUpdateScoStructure


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The id of this SCO in the course manifest |  [optional] |
| **name** | **String** | The name of this SCO in the course manifest |  [optional] |
| **successStatus** | [**SuccessStatusEnum**](#Enum--SuccessStatusEnum) | The success status of this SCO |  [optional] |
| **completionStatus** | [**CompletionStatusEnum**](#Enum--CompletionStatusEnum) | The completion status of this SCO |  [optional] |
| **percentageScore** | **Float** | Percentage Score |  [optional] |
| **children** | [**List&lt;LearningModulePreviewUpdateScoStructure&gt;**](LearningModulePreviewUpdateScoStructure) | Child items belonging to this SCO in the course manifest |  [optional] |


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




_com.mypurecloud.sdk.v2:platform-client-v2:221.0.0_
