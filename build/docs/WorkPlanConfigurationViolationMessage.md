# WorkPlanConfigurationViolationMessage


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | Type of configuration violation message for this work plan |  [optional] |
| **arguments** | [**List&lt;WorkPlanValidationMessageArgument&gt;**](WorkPlanValidationMessageArgument) | Arguments of the message that provide information about the misconfigured value or the threshold that is exceeded by the misconfigured value |  [optional] |
| **severity** | [**SeverityEnum**](#Enum--SeverityEnum) | Severity of the message. A message with Error severity indicates the scheduler won't be able to produce schedules and thus the work plan is invalid. |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACTIVITIESOVERLAP | &quot;ActivitiesOverlap&quot; | 
| ACTIVITYENDGREATERTHANSHIFTSTOP | &quot;ActivityEndGreaterThanShiftStop&quot; | 
| ACTIVITYPAIDTIMEGREATERTHANSHIFTPAIDTIME | &quot;ActivityPaidTimeGreaterThanShiftPaidTime&quot; | 
| ACTIVITYSTARTBEFORESHIFTSTART | &quot;ActivityStartBeforeShiftStart&quot; | 
| ACTIVITYSTARTGREATERTHANEQUALTOSHIFTSTOP | &quot;ActivityStartGreaterThanEqualToShiftStop&quot; | 
| ACTIVITYSTARTINCREMENTMINUTESNOTDIVISIBLEBYSCHEDULEINTERVALMINUTES | &quot;ActivityStartIncrementMinutesNotDivisibleByScheduleIntervalMinutes&quot; | 
| DAILYEXACTPAIDMINUTES | &quot;DailyExactPaidMinutes&quot; | 
| DAILYMAXTOTALLESSTHANWEEKLYMIN | &quot;DailyMaxTotalLessThanWeeklyMin&quot; | 
| DAILYMAXTOTALLESSTHANWEEKLYMINWITHOPTIONAL | &quot;DailyMaxTotalLessThanWeeklyMinWithOptional&quot; | 
| DAILYMAXTOTALLESSTHANWEEKLYMINWITHOUTOPTIONAL | &quot;DailyMaxTotalLessThanWeeklyMinWithoutOptional&quot; | 
| DAILYMINTOTALGREATERTHANWEEKLYMAX | &quot;DailyMinTotalGreaterThanWeeklyMax&quot; | 
| DAILYMINTOTALGREATERTHANWEEKLYMAXWITHOPTIONAL | &quot;DailyMinTotalGreaterThanWeeklyMaxWithOptional&quot; | 
| DAILYMINTOTALGREATERTHANWEEKLYMAXWITHOUTOPTIONAL | &quot;DailyMinTotalGreaterThanWeeklyMaxWithoutOptional&quot; | 
| DAILYREQUIREDDAYSGREATERTHANWEEKLYMAXDAYS | &quot;DailyRequiredDaysGreaterThanWeeklyMaxDays&quot; | 
| DAILYSHIFTHASNODAYSSELECTED | &quot;DailyShiftHasNoDaysSelected&quot; | 
| DAILYSHIFTMAXPOSSIBILITIESVIOLATED | &quot;DailyShiftMaxPossibilitiesViolated&quot; | 
| EARLIESTSHIFTSTOPISTOOLATE | &quot;EarliestShiftStopIsTooLate&quot; | 
| EXACTPAIDTIMENOTDIVISIBLEBYGRANULARITY | &quot;ExactPaidTimeNotDivisibleByGranularity&quot; | 
| MAXCONSECUTIVEWORKINGDAYSNOMORETHANDOUBLEMAXWORKINGDAYSPERWEEK | &quot;MaxConsecutiveWorkingDaysNoMoreThanDoubleMaxWorkingDaysPerWeek&quot; | 
| MAXDAYSOFFPERPLANNINGPERIODNOTCORRECT | &quot;MaxDaysOffPerPlanningPeriodNotCorrect&quot; | 
| MAXPAIDTIMEISMORETHANSHIFTLENGTH | &quot;MaxPaidTimeIsMoreThanShiftLength&quot; | 
| MAXPAIDTIMENOTDIVISIBLEBYGRANULARITY | &quot;MaxPaidTimeNotDivisibleByGranularity&quot; | 
| MAXPAIDTIMEPERMONTHLYPLANNINGPERIOD | &quot;MaxPaidTimePerMonthlyPlanningPeriod&quot; | 
| MAXPAIDTIMEPERPLANNINGPERIOD | &quot;MaxPaidTimePerPlanningPeriod&quot; | 
| MAXSHIFTS | &quot;MaxShifts&quot; | 
| MINPAIDTIMENOTDIVISIBLEBYGRANULARITY | &quot;MinPaidTimeNotDivisibleByGranularity&quot; | 
| MINPAIDTIMEPERMONTHLYPLANNINGPERIOD | &quot;MinPaidTimePerMonthlyPlanningPeriod&quot; | 
| MINPAIDTIMEPERPLANNINGPERIOD | &quot;MinPaidTimePerPlanningPeriod&quot; | 
| NOSHIFTS | &quot;NoShifts&quot; | 
| PAIDTIMEGREATERTHANMAXWORKTIME | &quot;PaidTimeGreaterThanMaxWorkTime&quot; | 
| PAIDTIMELESSTHANMINWORKTIME | &quot;PaidTimeLessThanMinWorkTime&quot; | 
| PAIDTIMENOTMETBYSHIFTSTARTSTOP | &quot;PaidTimeNotMetByShiftStartStop&quot; | 
| PLANNINGPERIODMAXWORKINGWEEKENDSCANNOTBEMET | &quot;PlanningPeriodMaxWorkingWeekendsCannotBeMet&quot; | 
| SHIFTDAYSSELECTMORETHANMINWORKINGDAYS | &quot;ShiftDaysSelectMoreThanMinWorkingDays&quot; | 
| SHIFTSTOPEARLIERTHANSTART | &quot;ShiftStopEarlierThanStart&quot; | 
| SHIFTMAXCOUNTPERPLANNINGPERIODCANNOTBEMET | &quot;ShiftMaxCountPerPlanningPeriodCannotBeMet&quot; | 
| SHIFTMINCOUNTPERPLANNINGPERIODCANNOTBEMET | &quot;ShiftMinCountPerPlanningPeriodCannotBeMet&quot; | 
| SHIFTVARIANCECANNOTBEMET | &quot;ShiftVarianceCannotBeMet&quot; | 
| WEEKLYEXACTPAIDMINUTES | &quot;WeeklyExactPaidMinutes&quot; | 


## Enum: SeverityEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INFORMATION | &quot;Information&quot; | 
| WARNING | &quot;Warning&quot; | 
| ERROR | &quot;Error&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
