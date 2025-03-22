# BuRescheduleRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **startDate** | [**Date**](Date) | The start of the range to reschedule.  Defaults to the beginning of the schedule. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **endDate** | [**Date**](Date) | The end of the range to reschedule.  Defaults the the end of the schedule. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **agentIds** | **List&lt;String&gt;** | The IDs of the agents to consider for rescheduling.  Omit to consider all agents in the specified management units.Agents not in the specified management units will be ignored |  [optional] |
| **activityCodeIds** | **List&lt;String&gt;** | The IDs of the activity codes to consider for rescheduling.  Omit to consider all activity codes |  [optional] |
| **managementUnitIds** | **List&lt;String&gt;** | The IDs of the management units to reschedule |  |
| **doNotChangeWeeklyPaidTime** | **Boolean** | Instructs the scheduler whether it is allowed to change weekly paid time |  |
| **doNotChangeDailyPaidTime** | **Boolean** | Instructs the scheduler whether it is allowed to change daily paid time |  |
| **doNotChangeShiftStartTimes** | **Boolean** | Instructs the scheduler whether it is allowed to change shift start times |  |
| **doNotChangeManuallyEditedShifts** | **Boolean** | Instructs the scheduler whether it is allowed to change manually edited shifts |  |
| **activitySmoothingType** | [**ActivitySmoothingTypeEnum**](#Enum--ActivitySmoothingTypeEnum) | Overrides the default BU level activity smoothing type for this reschedule run |  [optional] |
| **induceScheduleVariability** | **Boolean** | Overrides the default BU level induce schedule variability setting for this reschedule run |  [optional] |


## Enum: ActivitySmoothingTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| REDUCECONCURRENTACTIVITIESACROSSBU | &quot;ReduceConcurrentActivitiesAcrossBu&quot; | 
| REDUCECONCURRENTACTIVITIESACROSSMU | &quot;ReduceConcurrentActivitiesAcrossMu&quot; | 
| CONSISTENTSERVICELEVEL | &quot;ConsistentServiceLevel&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:222.0.0_
