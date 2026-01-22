# WorkPlanConstraintViolationMessage


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | Type of the work plan constraint in this message. |  |
| **arguments** | [**List&lt;UnavailableTimesViolationMessageArgument&gt;**](UnavailableTimesViolationMessageArgument) | Arguments of the message that provide information about the constraint that is being conflicted with such as the value of the constraint. |  |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| MINIMUMWEEKLYWORKDAYS | &quot;MinimumWeeklyWorkDays&quot; | 
| MINIMUMWEEKLYPAIDTIME | &quot;MinimumWeeklyPaidTime&quot; | 
| REQUIREDSHIFT | &quot;RequiredShift&quot; | 
| MAXIMUMDAYSOFFPERPLANNINGPERIOD | &quot;MaximumDaysOffPerPlanningPeriod&quot; | 
| MINIMUMPAIDTIMEPERPLANNINGPERIOD | &quot;MinimumPaidTimePerPlanningPeriod&quot; | 
| MINIMUMSHIFTCOUNTPERPLANNINGPERIOD | &quot;MinimumShiftCountPerPlanningPeriod&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:245.0.0_
