---
title: BuAgentScheduleHistoryChange
---
## BuAgentScheduleHistoryChange


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **metadata** | <!----><!---->[**BuAgentScheduleHistoryChangeMetadata**](BuAgentScheduleHistoryChangeMetadata.html)<!----> | The metadata of the change, including who and when the change was made |  [optional] |
| **shifts** | <!----><!---->[**List&lt;BuAgentScheduleShift&gt;**](BuAgentScheduleShift.html)<!----> | The list of changed shifts |  [optional] |
| **fullDayTimeOffMarkers** | <!----><!---->[**List&lt;BuFullDayTimeOffMarker&gt;**](BuFullDayTimeOffMarker.html)<!----> | The list of changed full day time off markers |  [optional] |
| **deletes** | <!----><!---->[**BuAgentScheduleHistoryDeletedChange**](BuAgentScheduleHistoryDeletedChange.html)<!----> | The deleted shifts, full day time off markers, or the entire agent schedule |  [optional] |
{: class="table table-striped"}



