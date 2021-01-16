---
title: BuAgentScheduleHistoryDroppedChange
---
## BuAgentScheduleHistoryDroppedChange


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **metadata** | <!----><!---->[**BuAgentScheduleHistoryChangeMetadata**](BuAgentScheduleHistoryChangeMetadata.html)<!----> | The metadata of the change, including who and when the change was made |  [optional] |
| **shiftIds** | <!----><!---->**List&lt;String&gt;**<!----> | The IDs of deleted shifts |  [optional] |
| **fullDayTimeOffMarkerDates** | <!----><!---->[**List&lt;LocalDate&gt;**](LocalDate.html)<!----> | The dates of any deleted full day time off markers |  [optional] |
| **deletes** | <!----><!---->[**BuAgentScheduleHistoryDeletedChange**](BuAgentScheduleHistoryDeletedChange.html)<!----> | The deleted shifts, full day time off markers, or the entire agent schedule |  [optional] |
{: class="table table-striped"}



