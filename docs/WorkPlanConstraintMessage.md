# WorkPlanConstraintMessage


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | Type of the work plan constraint in this message |  [optional] |
| **arguments** | [**List&lt;WorkPlanValidationMessageArgument&gt;**](WorkPlanValidationMessageArgument) | Arguments of the message that provide information about the constraint that is being conflicted with, such as the value of the constraint |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACTIVITYEARLIESTSTARTTIMEMINUTESFROMMIDNIGHT | &quot;ActivityEarliestStartTimeMinutesFromMidnight&quot; | 
| ACTIVITYEARLIESTSTARTTIMEMINUTESFROMSHIFTSTART | &quot;ActivityEarliestStartTimeMinutesFromShiftStart&quot; | 
| ACTIVITYLATESTSTARTTIMEMINUTESFROMMIDNIGHT | &quot;ActivityLatestStartTimeMinutesFromMidnight&quot; | 
| ACTIVITYLATESTSTARTTIMEMINUTESFROMSHIFTSTART | &quot;ActivityLatestStartTimeMinutesFromShiftStart&quot; | 
| ACTIVITYMAXIMUMLENGTHFROMSHIFTENDMINUTES | &quot;ActivityMaximumLengthFromShiftEndMinutes&quot; | 
| ACTIVITYMINIMUMLENGTHFROMSHIFTENDMINUTES | &quot;ActivityMinimumLengthFromShiftEndMinutes&quot; | 
| ACTIVITYMINIMUMLENGTHFROMSHIFTSTARTMINUTES | &quot;ActivityMinimumLengthFromShiftStartMinutes&quot; | 
| ACTIVITYSTARTTIMEINCREMENTINMINUTES | &quot;ActivityStartTimeIncrementInMinutes&quot; | 
| PLANNINGPERIODMAXIMUMDAYSOFF | &quot;PlanningPeriodMaximumDaysOff&quot; | 
| PLANNINGPERIODMAXIMUMPAIDTIMEMINUTES | &quot;PlanningPeriodMaximumPaidTimeMinutes&quot; | 
| PLANNINGPERIODMAXIMUMWORKINGWEEKENDS | &quot;PlanningPeriodMaximumWorkingWeekends&quot; | 
| PLANNINGPERIODMINIMUMDAYSOFF | &quot;PlanningPeriodMinimumDaysOff&quot; | 
| PLANNINGPERIODMINIMUMPAIDTIMEMINUTES | &quot;PlanningPeriodMinimumPaidTimeMinutes&quot; | 
| SHIFTDAYOFFRULE | &quot;ShiftDayOffRule&quot; | 
| SHIFTEARLIESTSTARTTIMEMINUTESFROMMIDNIGHT | &quot;ShiftEarliestStartTimeMinutesFromMidnight&quot; | 
| SHIFTEARLIESTSTOPTIMEMINUTESFROMMIDNIGHT | &quot;ShiftEarliestStopTimeMinutesFromMidnight&quot; | 
| SHIFTLATESTSTARTTIMEMINUTESFROMMIDNIGHT | &quot;ShiftLatestStartTimeMinutesFromMidnight&quot; | 
| SHIFTLATESTSTOPTIMEMINUTESFROMMIDNIGHT | &quot;ShiftLatestStopTimeMinutesFromMidnight&quot; | 
| SHIFTMAXIMUMCONTIGUOUSTIMEMINUTES | &quot;ShiftMaximumContiguousTimeMinutes&quot; | 
| SHIFTMAXIMUMCOUNTPERPLANNINGPERIOD | &quot;ShiftMaximumCountPerPlanningPeriod&quot; | 
| SHIFTMAXIMUMPAIDTIMEMINUTES | &quot;ShiftMaximumPaidTimeMinutes&quot; | 
| SHIFTMINIMUMCONTIGUOUSTIMEMINUTES | &quot;ShiftMinimumContiguousTimeMinutes&quot; | 
| SHIFTMINIMUMCOUNTPERPLANNINGPERIOD | &quot;ShiftMinimumCountPerPlanningPeriod&quot; | 
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




_com.mypurecloud.sdk.v2:platform-client-v2:234.0.0_
