---
title: UpdateWeekScheduleRequest
---
## UpdateWeekScheduleRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **description** | **String** | Description of the week schedule |  [optional] |
| **published** | **Boolean** | Whether the week schedule is published |  [optional] |
| **userSchedules** | [**Map&lt;String, UserSchedule&gt;**](UserSchedule.html) | User schedules in the week |  [optional] |
| **partialUploadIds** | **List&lt;String&gt;** | IDs of partial uploads to include in this imported schedule. It is applicable only for large schedules where activity count in schedule is greater than 17500 |  [optional] |
| **metadata** | [**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata.html) | Version metadata for this work plan |  |
| **agentSchedulesVersion** | **Integer** | Version of agent schedules in the week schedule |  |
{: class="table table-striped"}
{: class="table table-striped"}


