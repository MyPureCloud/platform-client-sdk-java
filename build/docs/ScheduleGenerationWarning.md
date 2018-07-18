---
title: ScheduleGenerationWarning
---
## ScheduleGenerationWarning


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **userId** | **String** | ID of the user in the warning |  [optional] |
| **userNotLicensed** | **Boolean** | Whether the user does not have the appropriate license to be scheduled |  [optional] |
| **unableToMeetMaxDays** | **Boolean** | Whether the number of scheduled days exceeded the maximum days to schedule defined in the agent work plan |  [optional] |
| **unableToScheduleRequiredDays** | **List&lt;String&gt;** | Days indicated as required to work in agent work plan where no viable shift was found to schedule |  [optional] |
| **unableToMeetMinPaidForTheWeek** | **Boolean** | Whether the schedule did not meet the minimum paid time for the week defined in the agent work plan |  [optional] |
| **unableToMeetMaxPaidForTheWeek** | **Boolean** | Whether the schedule exceeded the maximum paid time for the week defined in the agent work plan |  [optional] |
| **noNeedDays** | **List&lt;String&gt;** | Days agent was scheduled but there was no need to meet. The scheduled days have no effect on service levels |  [optional] |
| **shiftsTooCloseTogether** | **Boolean** | Whether the schedule did not meet the minimum time between shifts defined in the agent work plan |  [optional] |
{: class="table table-striped"}
{: class="table table-striped"}


