---
title: LearningAssignmentTopicLearningAssignmentNotification
---
## LearningAssignmentTopicLearningAssignmentNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> |  |  [optional] |
| **user** | <!----><!---->[**LearningAssignmentTopicUserReference**](LearningAssignmentTopicUserReference.html)<!----> |  |  [optional] |
| **module** | <!----><!---->[**LearningAssignmentTopicLearningModuleReference**](LearningAssignmentTopicLearningModuleReference.html)<!----> |  |  [optional] |
| **version** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **state** | [**StateEnum**](#StateEnum)<!----> |  |  [optional] |
| **dateRecommendedForCompletion** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **createdBy** | <!----><!---->[**LearningAssignmentTopicUserReference**](LearningAssignmentTopicUserReference.html)<!----> |  |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **modifiedBy** | <!----><!---->[**LearningAssignmentTopicUserReference**](LearningAssignmentTopicUserReference.html)<!----> |  |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **isOverdue** | <!----><!---->**Boolean**<!----> |  |  [optional] |
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
{: class="table table-striped"}



