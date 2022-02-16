---
title: BuScheduleRun
---
## BuScheduleRun


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **schedulerRunId** | <!----><!---->**String**<!----> | The scheduler run ID.  Reference this value for support |  [optional] |
| **intradayRescheduling** | <!----><!---->**Boolean**<!----> | Whether this is an intraday rescheduling run |  [optional] |
| **state** | [**StateEnum**](#StateEnum)<!----> | The state of the generation run |  [optional] |
| **weekCount** | <!----><!---->**Integer**<!----> | The number of weeks spanned by the schedule |  [optional] |
| **percentComplete** | <!----><!---->**Double**<!----> | Percent completion of the schedule run |  [optional] |
| **targetWeek** | <!----><!---->[**LocalDate**](LocalDate.html)<!----> | The start date of the target week. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **schedule** | <!----><!---->[**BuScheduleReference**](BuScheduleReference.html)<!----> | The generated schedule.  Null unless the schedule run is complete |  [optional] |
| **scheduleDescription** | <!----><!---->**String**<!----> | The description of the generated schedule |  [optional] |
| **schedulingStartTime** | <!----><!---->[**Date**](Date.html)<!----> | When the schedule generation run started. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **schedulingStartedBy** | <!----><!---->[**UserReference**](UserReference.html)<!----> | The user who started the scheduling run |  [optional] |
| **schedulingCanceledBy** | <!----><!---->[**UserReference**](UserReference.html)<!----> | The user who canceled the scheduling run, if applicable |  [optional] |
| **schedulingCompletedTime** | <!----><!---->[**Date**](Date.html)<!----> | When the scheduling run was completed, if applicable. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **messageCount** | <!----><!---->**Integer**<!----> | The number of schedule generation messages for this schedule generation run |  [optional] |
| **messageSeverityCounts** | <!----><!---->[**List&lt;SchedulerMessageSeverityCount&gt;**](SchedulerMessageSeverityCount.html)<!----> | The list of schedule generation message counts by severity for this schedule generation run |  [optional] |
| **reschedulingOptions** | <!----><!---->[**ReschedulingOptionsRunResponse**](ReschedulingOptionsRunResponse.html)<!----> | Rescheduling options for this run.  Null unless intradayRescheduling is true |  [optional] |
| **reschedulingResultExpiration** | <!----><!---->[**Date**](Date.html)<!----> | When the reschedule result will expire.  Null unless intradayRescheduling is true. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
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



