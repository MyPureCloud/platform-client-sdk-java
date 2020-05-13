---
title: ScheduleGenerationMessage
---
## ScheduleGenerationMessage


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | The type of the message |  [optional] |
| **arguments** | <!----><!---->[**List&lt;SchedulerMessageArgument&gt;**](SchedulerMessageArgument.html)<!----> | The arguments describing the message |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| AGENTNOTFOUND | &quot;AgentNotFound&quot; |
| AGENTNOTINSELECTEDMANAGEMENTUNIT | &quot;AgentNotInSelectedManagementUnit&quot; |
| AGENTNOTLICENSED | &quot;AgentNotLicensed&quot; |
| AGENTWITHOUTWORKPLAN | &quot;AgentWithoutWorkPlan&quot; |
| WORKPLANNOTENABLED | &quot;WorkPlanNotEnabled&quot; |
| WORKPLANNOTFOUND | &quot;WorkPlanNotFound&quot; |
| AGENTWITHOUTCAPABILITY | &quot;AgentWithoutCapability&quot; |
| NONEEDDAYS | &quot;NoNeedDays&quot; |
| UNABLETOSCHEDULEMAXCONSECUTIVEWORKINGDAYS | &quot;UnableToScheduleMaxConsecutiveWorkingDays&quot; |
| UNABLETOSCHEDULEMAXCONSECUTIVEWORKINGWEEKENDS | &quot;UnableToScheduleMaxConsecutiveWorkingWeekends&quot; |
| UNABLETOSCHEDULEMAXWEEKLYPAIDTIME | &quot;UnableToScheduleMaxWeeklyPaidTime&quot; |
| UNABLETOSCHEDULEMAXWEEKLYWORKDAYS | &quot;UnableToScheduleMaxWeeklyWorkDays&quot; |
| UNABLETOSCHEDULEMAXWORKDAYPAIDTIME | &quot;UnableToScheduleMaxWorkDayPaidTime&quot; |
| UNABLETOSCHEDULEMINCONSECUTIVENONWORKINGTIMEPERWEEK | &quot;UnableToScheduleMinConsecutiveNonWorkingTimePerWeek&quot; |
| UNABLETOSCHEDULEMININTERSHIFTTIME | &quot;UnableToScheduleMinIntershiftTime&quot; |
| UNABLETOSCHEDULEMINSHIFTSTARTDISTANCE | &quot;UnableToScheduleMinShiftStartDistance&quot; |
| UNABLETOSCHEDULEMINWEEKLYPAIDTIME | &quot;UnableToScheduleMinWeeklyPaidTime&quot; |
| UNABLETOSCHEDULEMINWEEKLYWORKDAYS | &quot;UnableToScheduleMinWeeklyWorkDays&quot; |
| UNABLETOSCHEDULEMINWORKDAYPAIDTIME | &quot;UnableToScheduleMinWorkDayPaidTime&quot; |
| UNABLETOSCHEDULEPLANNINGPERIODMAXDAYSOFF | &quot;UnableToSchedulePlanningPeriodMaxDaysOff&quot; |
| UNABLETOSCHEDULEPLANNINGPERIODMAXPAIDTIME | &quot;UnableToSchedulePlanningPeriodMaxPaidTime&quot; |
| UNABLETOSCHEDULEPLANNINGPERIODMINDAYSOFF | &quot;UnableToSchedulePlanningPeriodMinDaysOff&quot; |
| UNABLETOSCHEDULEPLANNINGPERIODMINPAIDTIME | &quot;UnableToSchedulePlanningPeriodMinPaidTime&quot; |
| UNABLETOSCHEDULESHIFTVARIANCE | &quot;UnableToScheduleShiftVariance&quot; |
| UNABLETOSCHEDULEWORKDAY | &quot;UnableToScheduleWorkDay&quot; |
{: class="table table-striped"}



