# LearningAssignmentTopicLearningAssignmentNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **user** | [**LearningAssignmentTopicUserReference**](LearningAssignmentTopicUserReference) |  |  [optional] |
| **module** | [**LearningAssignmentTopicLearningModuleReference**](LearningAssignmentTopicLearningModuleReference) |  |  [optional] |
| **version** | **Long** |  |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) |  |  [optional] |
| **dateRecommendedForCompletion** | [**Date**](Date) |  |  [optional] |
| **createdBy** | [**LearningAssignmentTopicUserReference**](LearningAssignmentTopicUserReference) |  |  [optional] |
| **dateCreated** | [**Date**](Date) |  |  [optional] |
| **modifiedBy** | [**LearningAssignmentTopicUserReference**](LearningAssignmentTopicUserReference) |  |  [optional] |
| **dateModified** | [**Date**](Date) |  |  [optional] |
| **isOverdue** | **Boolean** |  |  [optional] |
| **lengthInMinutes** | **Long** |  |  [optional] |
| **percentageScore** | [**BigDecimal**](BigDecimal) |  |  [optional] |
| **isPassed** | **Boolean** |  |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) |  |  [optional] |


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


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| NATIVE | &quot;Native&quot; | 
| EXTERNAL | &quot;External&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:237.0.0_
