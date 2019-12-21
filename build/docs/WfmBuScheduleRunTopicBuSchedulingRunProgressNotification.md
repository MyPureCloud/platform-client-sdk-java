---
title: WfmBuScheduleRunTopicBuSchedulingRunProgressNotification
---
## WfmBuScheduleRunTopicBuSchedulingRunProgressNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **operationId** | <!----><!---->**String**<!----> |  |  [optional] |
| **state** | [**StateEnum**](#StateEnum)<!----> |  |  [optional] |
| **percentComplete** | <!----><!---->[**BigDecimal**](BigDecimal.html)<!----> |  |  [optional] |
| **intradayRescheduling** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **run** | <!----><!---->[**WfmBuScheduleRunTopicBuScheduleRun**](WfmBuScheduleRunTopicBuScheduleRun.html)<!----> |  |  [optional] |
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



