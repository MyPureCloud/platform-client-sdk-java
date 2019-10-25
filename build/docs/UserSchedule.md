---
title: UserSchedule
---
## UserSchedule


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **shifts** | <!----><!---->[**List&lt;UserScheduleShift&gt;**](UserScheduleShift.html)<!----> | The shifts that belong to this schedule |  [optional] |
| **fullDayTimeOffMarkers** | <!----><!---->[**List&lt;UserScheduleFullDayTimeOffMarker&gt;**](UserScheduleFullDayTimeOffMarker.html)<!----> | Markers to indicate a full day time off request, relative to the management unit time zone |  [optional] |
| **delete** | <!----><!---->**Boolean**<!----> | If marked true for updating an existing user schedule, it will be deleted |  [optional] |
| **metadata** | <!----><!---->[**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata.html)<!----> | Version metadata for this schedule |  |
| **workPlanId** | <!----><!---->**String**<!----> | ID of the work plan associated with the user during schedule creation |  [optional] |
{: class="table table-striped"}



