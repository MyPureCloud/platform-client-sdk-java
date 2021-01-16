---
title: BuAgentScheduleHistoryResponse
---
## BuAgentScheduleHistoryResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **priorPublishedSchedules** | <!----><!---->[**List&lt;BuScheduleReference&gt;**](BuScheduleReference.html)<!----> | The list of previously published schedules |  [optional] |
| **basePublishedSchedule** | <!----><!---->[**BuAgentScheduleHistoryChange**](BuAgentScheduleHistoryChange.html)<!----> | The originally published agent schedules |  [optional] |
| **droppedChanges** | <!----><!---->[**List&lt;BuAgentScheduleHistoryDroppedChange&gt;**](BuAgentScheduleHistoryDroppedChange.html)<!----> | The changes dropped from the schedule history. This will happen if the schedule history is too large |  [optional] |
| **changes** | <!----><!---->[**List&lt;BuAgentScheduleHistoryChange&gt;**](BuAgentScheduleHistoryChange.html)<!----> | The list of changes for the schedule history |  [optional] |
{: class="table table-striped"}



