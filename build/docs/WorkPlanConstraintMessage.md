---
title: WorkPlanConstraintMessage
---
## WorkPlanConstraintMessage


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | Type of the work plan constraint in this message |  [optional] |
| **arguments** | <!----><!---->[**List&lt;WorkPlanValidationMessageArgument&gt;**](WorkPlanValidationMessageArgument.html)<!----> | Arguments of the message that provide information about the constraint that is being conflicted with, such as the value of the constraint |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACTIVITYEARLIESTSTARTTIMEMINUTESFROMMIDNIGHT | &quot;ActivityEarliestStartTimeMinutesFromMidnight&quot; | 
| ACTIVITYEARLIESTSTARTTIMEMINUTESFROMSHIFTSTART | &quot;ActivityEarliestStartTimeMinutesFromShiftStart&quot; | 
| ACTIVITYLATESTSTARTTIMEMINUTESFROMMIDNIGHT | &quot;ActivityLatestStartTimeMinutesFromMidnight&quot; | 
| ACTIVITYLATESTSTARTTIMEMINUTESFROMSHIFTSTART | &quot;ActivityLatestStartTimeMinutesFromShiftStart&quot; | 
| ACTIVITYMINIMUMLENGTHFROMSHIFTENDMINUTES | &quot;ActivityMinimumLengthFromShiftEndMinutes&quot; | 
| ACTIVITYMINIMUMLENGTHFROMSHIFTSTARTMINUTES | &quot;ActivityMinimumLengthFromShiftStartMinutes&quot; | 
| ACTIVITYSTARTTIMEINCREMENTINMINUTES | &quot;ActivityStartTimeIncrementInMinutes&quot; | 
| PLANNINGPERIODMAXIMUMDAYSOFF | &quot;PlanningPeriodMaximumDaysOff&quot; | 
| PLANNINGPERIODMAXIMUMPAIDTIMEMINUTES | &quot;PlanningPeriodMaximumPaidTimeMinutes&quot; | 
| PLANNINGPERIODMINIMUMDAYSOFF | &quot;PlanningPeriodMinimumDaysOff&quot; | 
| PLANNINGPERIODMINIMUMPAIDTIMEMINUTES | &quot;PlanningPeriodMinimumPaidTimeMinutes&quot; | 
| SHIFTDAYOFFRULE | &quot;ShiftDayOffRule&quot; | 
| SHIFTEARLIESTSTARTTIMEMINUTESFROMMIDNIGHT | &quot;ShiftEarliestStartTimeMinutesFromMidnight&quot; | 
| SHIFTEARLIESTSTOPTIMEMINUTESFROMMIDNIGHT | &quot;ShiftEarliestStopTimeMinutesFromMidnight&quot; | 
| SHIFTLATESTSTARTTIMEMINUTESFROMMIDNIGHT | &quot;ShiftLatestStartTimeMinutesFromMidnight&quot; | 
| SHIFTLATESTSTOPTIMEMINUTESFROMMIDNIGHT | &quot;ShiftLatestStopTimeMinutesFromMidnight&quot; | 
| SHIFTMAXIMUMCONTIGUOUSTIMEMINUTES | &quot;ShiftMaximumContiguousTimeMinutes&quot; | 
| SHIFTMAXIMUMPAIDTIMEMINUTES | &quot;ShiftMaximumPaidTimeMinutes&quot; | 
| SHIFTMINIMUMCONTIGUOUSTIMEMINUTES | &quot;ShiftMinimumContiguousTimeMinutes&quot; | 
| SHIFTMINIMUMPAIDTIMEMINUTES | &quot;ShiftMinimumPaidTimeMinutes&quot; | 
| SHIFTSTARTTIMEINCREMENTINMINUTES | &quot;ShiftStartTimeIncrementInMinutes&quot; | 
| SHIFTSTARTVARIANCEMAXIMUMVARIANCEMINUTES | &quot;ShiftStartVarianceMaximumVarianceMinutes&quot; | 
| SHIFTSTARTVARIANCEPAIDDURATION | &quot;ShiftStartVariancePaidDuration&quot; | 
| WORKPLANMAXIMUMCONSECUTIVEWORKINGDAYS | &quot;WorkPlanMaximumConsecutiveWorkingDays&quot; | 
| WORKPLANMAXIMUMCONSECUTIVEWORKINGWEEKENDS | &quot;WorkPlanMaximumConsecutiveWorkingWeekends&quot; | 
| WORKPLANMAXIMUMWEEKLYPAIDTIMEMINUTES | &quot;WorkPlanMaximumWeeklyPaidTimeMinutes&quot; | 
| WORKPLANMAXIMUMWORKINGDAYSPERWEEK | &quot;WorkPlanMaximumWorkingDaysPerWeek&quot; | 
| WORKPLANMINIMUMCONSECUTIVENONWORKINGTIMEPERWEEKMINUTES | &quot;WorkPlanMinimumConsecutiveNonWorkingTimePerWeekMinutes&quot; | 
| WORKPLANMINIMUMINTERSHIFTTIMEMINUTES | &quot;WorkPlanMinimumInterShiftTimeMinutes&quot; | 
| WORKPLANMINIMUMSHIFTSTARTDISTANCEMINUTES | &quot;WorkPlanMinimumShiftStartDistanceMinutes&quot; | 
| WORKPLANMINIMUMWEEKLYPAIDTIMEMINUTES | &quot;WorkPlanMinimumWeeklyPaidTimeMinutes&quot; | 
| WORKPLANMINIMUMWORKINGDAYSPERWEEK | &quot;WorkPlanMinimumWorkingDaysPerWeek&quot; | 
| WORKPLANOPTIONALDAYS | &quot;WorkPlanOptionalDays&quot; | 
| WORKPLANPAIDTIMEGRANULARITYMINUTES | &quot;WorkPlanPaidTimeGranularityMinutes&quot; | 
{: class="table table-striped"}



