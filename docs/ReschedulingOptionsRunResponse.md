# ReschedulingOptionsRunResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **existingSchedule** | [**BuScheduleReference**](BuScheduleReference) | The existing schedule to which this reschedule run applies |  [optional] |
| **startDate** | [**Date**](Date) | The start date of the period to reschedule. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **endDate** | [**Date**](Date) | The end date of the period to reschedule. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **managementUnits** | [**List&lt;ReschedulingManagementUnitResponse&gt;**](ReschedulingManagementUnitResponse) | Per-management unit rescheduling options |  [optional] |
| **agentCount** | **Integer** | The number of agents to be considered in the reschedule |  [optional] |
| **activityCodeIds** | **List&lt;String&gt;** | The IDs of the activity codes being considered for reschedule |  [optional] |
| **doNotChangeWeeklyPaidTime** | **Boolean** | Whether weekly paid time is allowed to be changed |  |
| **doNotChangeDailyPaidTime** | **Boolean** | Whether daily paid time is allowed to be changed |  |
| **doNotChangeShiftStartTimes** | **Boolean** | Whether shift start times are allowed to be changed |  |
| **doNotChangeManuallyEditedShifts** | **Boolean** | Whether manually edited shifts are allowed to be changed |  |
| **activitySmoothingType** | [**ActivitySmoothingTypeEnum**](#Enum--ActivitySmoothingTypeEnum) | The activity smoothing type used for this reschedule run |  |
| **induceScheduleVariability** | **Boolean** | Whether schedule variability was induced for this reschedule run |  |
| **useUnavailableTimesSnapshot** | **Boolean** | Whether original unavailable times from schedule generation were used instead of the latest saved unavailable times |  |


## Enum: ActivitySmoothingTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| REDUCECONCURRENTACTIVITIESACROSSBU | &quot;ReduceConcurrentActivitiesAcrossBu&quot; | 
| REDUCECONCURRENTACTIVITIESACROSSMU | &quot;ReduceConcurrentActivitiesAcrossMu&quot; | 
| CONSISTENTSERVICELEVEL | &quot;ConsistentServiceLevel&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:267.0.0_
