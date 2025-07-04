# SchedulerMessageTypeSeverity


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The type of the message |  [optional] |
| **severity** | [**SeverityEnum**](#Enum--SeverityEnum) | The severity of the message |  [optional] |


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
| UNABLETOPRODUCEAGENTSCHEDULE | &quot;UnableToProduceAgentSchedule&quot; | 
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
| UNABLETOSCHEDULEMAXCONSECUTIVEWORKINGDAYSFROMAGENTHISTORY | &quot;UnableToScheduleMaxConsecutiveWorkingDaysFromAgentHistory&quot; | 
| UNABLETOSCHEDULEMAXCONSECUTIVEWORKINGWEEKENDSFROMAGENTHISTORY | &quot;UnableToScheduleMaxConsecutiveWorkingWeekendsFromAgentHistory&quot; | 
| UNABLETOSCHEDULEMAXWEEKLYPAIDTIMEFROMTIMEOFF | &quot;UnableToScheduleMaxWeeklyPaidTimeFromTimeOff&quot; | 
| UNABLETOSCHEDULEMAXWORKDAYPAIDTIMEFROMTIMEOFF | &quot;UnableToScheduleMaxWorkDayPaidTimeFromTimeOff&quot; | 
| UNABLETOSCHEDULEMININTERSHIFTTIMEFROMAGENTHISTORY | &quot;UnableToScheduleMinIntershiftTimeFromAgentHistory&quot; | 
| UNABLETOSCHEDULEMININTERSHIFTTIMEFROMDST | &quot;UnableToScheduleMinIntershiftTimeFromDst&quot; | 
| UNABLETOSCHEDULEMINSHIFTSTARTDISTANCEFROMAGENTHISTORY | &quot;UnableToScheduleMinShiftStartDistanceFromAgentHistory&quot; | 
| UNABLETOSCHEDULEMINSHIFTSTARTDISTANCEFROMDST | &quot;UnableToScheduleMinShiftStartDistanceFromDst&quot; | 
| UNABLETOSCHEDULEMINWEEKLYPAIDTIMEFROMTIMEOFF | &quot;UnableToScheduleMinWeeklyPaidTimeFromTimeOff&quot; | 
| UNABLETOSCHEDULEMINWEEKLYWORKDAYSFROMTIMEOFF | &quot;UnableToScheduleMinWeeklyWorkDaysFromTimeOff&quot; | 
| UNABLETOSCHEDULEMINWORKDAYPAIDTIMEFROMTIMEOFF | &quot;UnableToScheduleMinWorkDayPaidTimeFromTimeOff&quot; | 
| UNABLETOSCHEDULEPLANNINGPERIODMAXDAYSOFFFROMAGENTHISTORY | &quot;UnableToSchedulePlanningPeriodMaxDaysOffFromAgentHistory&quot; | 
| UNABLETOSCHEDULEPLANNINGPERIODMAXDAYSOFFFROMTIMEOFF | &quot;UnableToSchedulePlanningPeriodMaxDaysOffFromTimeOff&quot; | 
| UNABLETOSCHEDULEPLANNINGPERIODMAXPAIDTIMEFROMAGENTHISTORY | &quot;UnableToSchedulePlanningPeriodMaxPaidTimeFromAgentHistory&quot; | 
| UNABLETOSCHEDULEPLANNINGPERIODMAXPAIDTIMEFROMTIMEOFF | &quot;UnableToSchedulePlanningPeriodMaxPaidTimeFromTimeOff&quot; | 
| UNABLETOSCHEDULEPLANNINGPERIODMINDAYSOFFFROMAGENTHISTORY | &quot;UnableToSchedulePlanningPeriodMinDaysOffFromAgentHistory&quot; | 
| UNABLETOSCHEDULEPLANNINGPERIODMINPAIDTIMEFROMAGENTHISTORY | &quot;UnableToSchedulePlanningPeriodMinPaidTimeFromAgentHistory&quot; | 
| UNABLETOSCHEDULEPLANNINGPERIODMINPAIDTIMEFROMTIMEOFF | &quot;UnableToSchedulePlanningPeriodMinPaidTimeFromTimeOff&quot; | 
| UNABLETOSCHEDULEWORKDAYFROMTIMEOFF | &quot;UnableToScheduleWorkDayFromTimeOff&quot; | 
| AGENTWITHOUTCAPABILITYTOHANDLEACTIVITYONQUEUEWORK | &quot;AgentWithoutCapabilityToHandleActivityOnQueueWork&quot; | 
| UNABLETOPRODUCEAGENTSCHEDULEDUETOUNAVAILABLETIMES | &quot;UnableToProduceAgentScheduleDueToUnavailableTimes&quot; | 
| UNABLETOSCHEDULEPLANNINGPERIODMAXSHIFTSTARTTIMEVARIANCEFROMAGENTHISTORY | &quot;UnableToSchedulePlanningPeriodMaxShiftStartTimeVarianceFromAgentHistory&quot; | 
| UNABLETOSCHEDULEPLANNINGPERIODMAXWORKINGWEEKENDSFROMAGENTHISTORY | &quot;UnableToSchedulePlanningPeriodMaxWorkingWeekendsFromAgentHistory&quot; | 
| UNABLETOSCHEDULEPLANNINGPERIODSHIFTMAXCOUNTFROMAGENTHISTORY | &quot;UnableToSchedulePlanningPeriodShiftMaxCountFromAgentHistory&quot; | 
| UNABLETOSCHEDULEPLANNINGPERIODSHIFTMINCOUNTFROMAGENTHISTORY | &quot;UnableToSchedulePlanningPeriodShiftMinCountFromAgentHistory&quot; | 


## Enum: SeverityEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| IGNORE | &quot;Ignore&quot; | 
| INFORMATION | &quot;Information&quot; | 
| WARNING | &quot;Warning&quot; | 
| ERROR | &quot;Error&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
