# WfmActivityPlanJobCompleteTopicActivityPlanJobCompleteNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) |  |  [optional] |
| **activityPlan** | [**WfmActivityPlanJobCompleteTopicActivityPlanReference**](WfmActivityPlanJobCompleteTopicActivityPlanReference) |  |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) |  |  [optional] |
| **exceptions** | [**List&lt;WfmActivityPlanJobCompleteTopicActivityPlanJobException&gt;**](WfmActivityPlanJobCompleteTopicActivityPlanJobException) |  |  [optional] |
| **error** | [**WfmActivityPlanJobCompleteTopicErrorBody**](WfmActivityPlanJobCompleteTopicErrorBody) |  |  [optional] |


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
| MAXIMIZEOCCURRENCE | &quot;MaximizeOccurrence&quot; | 
| CREATESESSION | &quot;CreateSession&quot; | 
| EDITSESSION | &quot;EditSession&quot; | 


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PROCESSING | &quot;Processing&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| ERROR | &quot;Error&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:261.0.0_
