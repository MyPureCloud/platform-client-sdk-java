# WfmActivityPlanJobCompleteTopicActivityPlanOccurrenceDeletionJobCompleteNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) |  |  [optional] |
| **activityPlan** | [**WfmActivityPlanJobCompleteTopicActivityPlanReference**](WfmActivityPlanJobCompleteTopicActivityPlanReference) |  |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) |  |  [optional] |
| **exceptions** | [**List&lt;WfmActivityPlanJobCompleteTopicActivityPlanJobException&gt;**](WfmActivityPlanJobCompleteTopicActivityPlanJobException) |  |  [optional] |
| **error** | [**WfmActivityPlanJobCompleteTopicErrorBody**](WfmActivityPlanJobCompleteTopicErrorBody) |  |  [optional] |
| **occurrence** | [**WfmActivityPlanJobCompleteTopicActivityPlanOccurrenceReference**](WfmActivityPlanJobCompleteTopicActivityPlanOccurrenceReference) |  |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| RUNPLAN | &quot;RunPlan&quot; | 
| DELETEOCCURRENCE | &quot;DeleteOccurrence&quot; | 


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PROCESSING | &quot;Processing&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| ERROR | &quot;Error&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:226.0.0_
