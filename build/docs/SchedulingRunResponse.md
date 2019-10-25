---
title: SchedulingRunResponse
---
## SchedulingRunResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **runId** | <!----><!---->**String**<!----> | ID of the schedule run |  [optional] |
| **schedulerRunId** | <!----><!---->**String**<!----> | The runId from scheduler service.  Useful for debugging schedule errors |  [optional] |
| **intradayRescheduling** | <!----><!---->**Boolean**<!----> | Whether this is the result of a rescheduling request |  [optional] |
| **state** | [**StateEnum**](#StateEnum)<!----> | Status of the schedule run |  [optional] |
| **percentComplete** | <!----><!---->**Double**<!----> | Completion percentage of the schedule run |  [optional] |
| **targetWeek** | <!----><!---->**String**<!----> | The start date of the week for which the scheduling is done in yyyy-MM-dd format |  [optional] |
| **scheduleId** | <!----><!---->**String**<!----> | ID of the schedule. Does not apply to reschedule, see reschedulingOptions.existingScheduleId |  [optional] |
| **scheduleDescription** | <!----><!---->**String**<!----> | Description of the schedule |  [optional] |
| **schedulingStartTime** | <!----><!---->[**Date**](Date.html)<!----> | Start time of the schedule run. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **schedulingStartedBy** | <!----><!---->[**UserReference**](UserReference.html)<!----> | User that started the schedule run |  [optional] |
| **schedulingCanceledBy** | <!----><!---->[**UserReference**](UserReference.html)<!----> | User that canceled the schedule run |  [optional] |
| **schedulingCompletedTime** | <!----><!---->[**Date**](Date.html)<!----> | Time at which the scheduling run was completed. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **reschedulingOptions** | <!----><!---->[**ReschedulingOptionsResponse**](ReschedulingOptionsResponse.html)<!----> | The selected options for the reschedule request. Will always be null if intradayRescheduling is false |  [optional] |
| **reschedulingResultExpiration** | <!----><!---->[**Date**](Date.html)<!----> | When the rescheduling result data will expire. Results are kept temporarily as they should be applied as soon as possible after the run finishes.  Will always be null if intradayRescheduling is false. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **applied** | <!----><!---->**Boolean**<!----> | Whether the rescheduling run has been marked applied |  [optional] |
| **unscheduledAgents** | <!----><!---->[**List&lt;UnscheduledAgentWarning&gt;**](UnscheduledAgentWarning.html)<!----> | Agents that were not scheduled in the rescheduling operation. Will always be null if intradayRescheduling is false |  [optional] |
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



