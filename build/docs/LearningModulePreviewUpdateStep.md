---
title: LearningModulePreviewUpdateStep
---
## LearningModulePreviewUpdateStep


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The id of the step |  [optional] |
| **successStatus** | [**SuccessStatusEnum**](#SuccessStatusEnum)<!----> | The success status of the step |  [optional] |
| **completionStatus** | [**CompletionStatusEnum**](#CompletionStatusEnum)<!----> | The completion status of the step |  [optional] |
| **completionPercentage** | <!----><!---->**Float**<!----> | The completion percentage of the step |  [optional] |
| **percentageScore** | <!----><!---->**Float**<!----> | Percentage Score |  [optional] |
| **structure** | <!----><!---->[**List&lt;LearningModulePreviewUpdateScoStructure&gt;**](LearningModulePreviewUpdateScoStructure.html)<!----> | The structure for any SCO associated with this step |  [optional] |
{: class="table table-striped"}


<a name="SuccessStatusEnum"></a>

## Enum: SuccessStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PASSED | &quot;Passed&quot; | 
| FAILED | &quot;Failed&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
{: class="table table-striped"}


<a name="CompletionStatusEnum"></a>

## Enum: CompletionStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| COMPLETED | &quot;Completed&quot; | 
| INCOMPLETE | &quot;Incomplete&quot; | 
| NOTATTEMPTED | &quot;NotAttempted&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
{: class="table table-striped"}



