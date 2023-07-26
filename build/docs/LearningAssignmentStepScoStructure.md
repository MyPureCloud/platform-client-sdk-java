---
title: LearningAssignmentStepScoStructure
---
## LearningAssignmentStepScoStructure


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The id of this SCO in the course manifest |  [optional] |
| **name** | <!----><!---->**String**<!----> | The name of this SCO in the course manifest |  [optional] |
| **successStatus** | [**SuccessStatusEnum**](#SuccessStatusEnum)<!----> | The success status of this SCO |  [optional] |
| **completionStatus** | [**CompletionStatusEnum**](#CompletionStatusEnum)<!----> | The completion status of this SCO |  [optional] |
| **children** | <!----><!---->[**List&lt;LearningAssignmentStepScoStructure&gt;**](LearningAssignmentStepScoStructure.html)<!----> | Child items belonging to this SCO in the course manifest |  [optional] |
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



