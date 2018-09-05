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
| **agentUpdateFilter** | [**AgentUpdateFilterEnum**](#AgentUpdateFilterEnum) | The condition to notify agents about schedule updates. Applicable to only published schedule |  [optional] |
{: class="table table-striped"}


<a name="AgentUpdateFilterEnum"></a>

## Enum: AgentUpdateFilterEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ALL | &quot;All&quot; |
| SHIFTTIMECHANGE | &quot;ShiftTimeChange&quot; |
| NONE | &quot;None&quot; |
{: class="table table-striped"}



