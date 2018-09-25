---
title: ReschedulingOptionsResponse
---
## ReschedulingOptionsResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **startDate** | [**Date**](Date.html) | The start date of the range to reschedule in ISO-8601 format |  |
| **endDate** | [**Date**](Date.html) | The end date of the range to reschedule in ISO-8601 format |  |
| **agentIds** | **List&lt;String&gt;** | The IDs of the agents to reschedule.  Null or empty means all agents on the schedule |  [optional] |
| **activityCodeIds** | **List&lt;String&gt;** | The IDs of the activity codes to reschedule. Null or empty means all activity codes will be considered |  [optional] |
| **doNotChangeWeeklyPaidTime** | **Boolean** | Whether to prevent changes to weekly paid time |  |
| **doNotChangeDailyPaidTime** | **Boolean** | Whether to prevent changes to daily paid time |  |
| **doNotChangeShiftStartTimes** | **Boolean** | Whether to prevent changes to shift start times |  |
| **doNotChangeManuallyEditedShifts** | **Boolean** | Whether to prevent changes to manually edited shifts |  |
| **existingScheduleId** | **String** | The schedule ID of the schedule to which the results will be applied |  [optional] |
| **existingScheduleVersion** | **Integer** | The version of the schedule at the time the rescheduling was initiated |  [optional] |
{: class="table table-striped"}



