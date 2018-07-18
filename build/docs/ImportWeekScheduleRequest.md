---
title: ImportWeekScheduleRequest
---
## ImportWeekScheduleRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **description** | **String** | Description for the schedule |  |
| **userSchedules** | [**Map&lt;String, UserSchedule&gt;**](UserSchedule.html) | User schedules |  [optional] |
| **published** | **Boolean** | Whether the schedule is published |  [optional] |
| **shortTermForecastId** | **String** | Short term forecast that should be associated with this schedule |  [optional] |
| **partialUploadIds** | **List&lt;String&gt;** | IDs of partial uploads of user schedules to import week schedule. It is applicable only for large schedules where activity count in schedule is greater than 17500 |  [optional] |
{: class="table table-striped"}
{: class="table table-striped"}


