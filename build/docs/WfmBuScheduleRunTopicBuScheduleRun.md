# WfmBuScheduleRunTopicBuScheduleRun


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **percentComplete** | [**BigDecimal**](BigDecimal) |  |  [optional] |
| **intradayRescheduling** | **Boolean** |  |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) |  |  [optional] |
| **weekCount** | **Long** |  |  [optional] |
| **schedule** | [**WfmBuScheduleRunTopicBuScheduleReference**](WfmBuScheduleRunTopicBuScheduleReference) |  |  [optional] |
| **schedulingCanceledBy** | [**WfmBuScheduleRunTopicUserReference**](WfmBuScheduleRunTopicUserReference) |  |  [optional] |
| **schedulingCompletedTime** | **String** |  |  [optional] |
| **messageCount** | **Long** |  |  [optional] |
| **messageSeverityCounts** | [**List&lt;WfmBuScheduleRunTopicSchedulerMessageSeverityCount&gt;**](WfmBuScheduleRunTopicSchedulerMessageSeverityCount) |  |  [optional] |


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NONE | &quot;None&quot; | 
| QUEUED | &quot;Queued&quot; | 
| SCHEDULING | &quot;Scheduling&quot; | 
| CANCELED | &quot;Canceled&quot; | 
| FAILED | &quot;Failed&quot; | 
| COMPLETE | &quot;Complete&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:223.0.0_
