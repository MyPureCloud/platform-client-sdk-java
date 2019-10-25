---
title: ScheduleGenerationWarning
---
## ScheduleGenerationWarning


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **userId** | <!----><!---->**String**<!----> | ID of the user in the warning |  [optional] |
| **userNotLicensed** | <!----><!---->**Boolean**<!----> | Whether the user does not have the appropriate license to be scheduled |  [optional] |
| **unableToMeetMaxDays** | <!----><!---->**Boolean**<!----> | Whether the number of scheduled days exceeded the maximum days to schedule defined in the agent work plan |  [optional] |
| **unableToScheduleRequiredDays** | <!---->[**List&lt;UnableToScheduleRequiredDaysEnum&gt;**](#UnableToScheduleRequiredDaysEnum)<!----> | Days indicated as required to work in agent work plan where no viable shift was found to schedule |  [optional] |
| **unableToMeetMinPaidForTheWeek** | <!----><!---->**Boolean**<!----> | Whether the schedule did not meet the minimum paid time for the week defined in the agent work plan |  [optional] |
| **unableToMeetMaxPaidForTheWeek** | <!----><!---->**Boolean**<!----> | Whether the schedule exceeded the maximum paid time for the week defined in the agent work plan |  [optional] |
| **noNeedDays** | <!---->[**List&lt;NoNeedDaysEnum&gt;**](#NoNeedDaysEnum)<!----> | Days agent was scheduled but there was no need to meet. The scheduled days have no effect on service levels |  [optional] |
| **shiftsTooCloseTogether** | <!----><!---->**Boolean**<!----> | Whether the schedule did not meet the minimum time between shifts defined in the agent work plan |  [optional] |
{: class="table table-striped"}


<a name="UnableToScheduleRequiredDaysEnum"></a>

## Enum: UnableToScheduleRequiredDaysEnum

| Name | Value |
| ---- | ----- |
| SUNDAY | &quot;Sunday&quot; |
| MONDAY | &quot;Monday&quot; |
| TUESDAY | &quot;Tuesday&quot; |
| WEDNESDAY | &quot;Wednesday&quot; |
| THURSDAY | &quot;Thursday&quot; |
| FRIDAY | &quot;Friday&quot; |
| SATURDAY | &quot;Saturday&quot; |
{: class="table table-striped"}


<a name="NoNeedDaysEnum"></a>

## Enum: NoNeedDaysEnum

| Name | Value |
| ---- | ----- |
| SUNDAY | &quot;Sunday&quot; |
| MONDAY | &quot;Monday&quot; |
| TUESDAY | &quot;Tuesday&quot; |
| WEDNESDAY | &quot;Wednesday&quot; |
| THURSDAY | &quot;Thursday&quot; |
| FRIDAY | &quot;Friday&quot; |
| SATURDAY | &quot;Saturday&quot; |
{: class="table table-striped"}



