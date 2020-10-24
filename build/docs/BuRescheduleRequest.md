---
title: BuRescheduleRequest
---
## BuRescheduleRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **startDate** | <!----><!---->[**Date**](Date.html)<!----> | The start of the range to reschedule.  Defaults to the beginning of the schedule. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **endDate** | <!----><!---->[**Date**](Date.html)<!----> | The end of the range to reschedule.  Defaults the the end of the schedule. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **agentIds** | <!----><!---->**List&lt;String&gt;**<!----> | The IDs of the agents to consider for rescheduling.  Omit to consider all agents in the specified management units.Agents not in the specified management units will be ignored |  [optional] |
| **activityCodeIds** | <!----><!---->**List&lt;String&gt;**<!----> | The IDs of the activity codes to consider for rescheduling.  Omit to consider all activity codes |  [optional] |
| **managementUnitIds** | <!----><!---->**List&lt;String&gt;**<!----> | The IDs of the management units to reschedule |  |
| **doNotChangeWeeklyPaidTime** | <!----><!---->**Boolean**<!----> | Instructs the scheduler whether it is allowed to change weekly paid time |  |
| **doNotChangeDailyPaidTime** | <!----><!---->**Boolean**<!----> | Instructs the scheduler whether it is allowed to change daily paid time |  |
| **doNotChangeShiftStartTimes** | <!----><!---->**Boolean**<!----> | Instructs the scheduler whether it is allowed to change shift start times |  |
| **doNotChangeManuallyEditedShifts** | <!----><!---->**Boolean**<!----> | Instructs the scheduler whether it is allowed to change manually edited shifts |  |
{: class="table table-striped"}



