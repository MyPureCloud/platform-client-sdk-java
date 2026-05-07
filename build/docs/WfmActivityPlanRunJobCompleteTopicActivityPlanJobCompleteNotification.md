# WfmActivityPlanRunJobCompleteTopicActivityPlanJobCompleteNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) |  |  [optional] |
| **activityPlan** | [**WfmActivityPlanRunJobCompleteTopicActivityPlanReference**](WfmActivityPlanRunJobCompleteTopicActivityPlanReference) |  |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) |  |  [optional] |
| **exceptions** | [**List&lt;WfmActivityPlanRunJobCompleteTopicActivityPlanJobException&gt;**](WfmActivityPlanRunJobCompleteTopicActivityPlanJobException) |  |  [optional] |
| **error** | [**WfmActivityPlanRunJobCompleteTopicErrorBody**](WfmActivityPlanRunJobCompleteTopicErrorBody) |  |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| RUNPLAN | &quot;RunPlan&quot; | 
| DELETEOCCURRENCE | &quot;DeleteOccurrence&quot; | 
| DELETEACTIVITYPLAN | &quot;DeleteActivityPlan&quot; | 
| DELETEOCCURRENCES | &quot;DeleteOccurrences&quot; | 
| DELETESESSIONS | &quot;DeleteSessions&quot; | 
| DELETESESSIONUSERS | &quot;DeleteSessionUsers&quot; | 


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PROCESSING | &quot;Processing&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| ERROR | &quot;Error&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:253.0.0_
