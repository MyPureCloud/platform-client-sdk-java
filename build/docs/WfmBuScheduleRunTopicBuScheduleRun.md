---
title: WfmBuScheduleRunTopicBuScheduleRun
---
## WfmBuScheduleRunTopicBuScheduleRun


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> |  |  [optional] |
| **percentComplete** | <!----><!---->[**BigDecimal**](BigDecimal.html)<!----> |  |  [optional] |
| **intradayRescheduling** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **state** | [**StateEnum**](#StateEnum)<!----> |  |  [optional] |
| **weekCount** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **schedule** | <!----><!---->[**WfmBuScheduleRunTopicBuScheduleReference**](WfmBuScheduleRunTopicBuScheduleReference.html)<!----> |  |  [optional] |
| **schedulingCanceledBy** | <!----><!---->[**WfmBuScheduleRunTopicUserReference**](WfmBuScheduleRunTopicUserReference.html)<!----> |  |  [optional] |
| **schedulingCompletedTime** | <!----><!---->**String**<!----> |  |  [optional] |
| **messageCount** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **messageSeverityCounts** | <!----><!---->[**List&lt;WfmBuScheduleRunTopicSchedulerMessageSeverityCount&gt;**](WfmBuScheduleRunTopicSchedulerMessageSeverityCount.html)<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="StateEnum"></a>

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
{: class="table table-striped"}



