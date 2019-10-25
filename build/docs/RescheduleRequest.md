---
title: RescheduleRequest
---
## RescheduleRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **startDate** | <!----><!---->[**Date**](Date.html)<!----> | The start date of the range to reschedule in ISO-8601 format |  |
| **endDate** | <!----><!---->[**Date**](Date.html)<!----> | The end date of the range to reschedule in ISO-8601 format |  |
| **agentIds** | <!----><!---->**List&lt;String&gt;**<!----> | The IDs of the agents to reschedule.  Null or empty means all agents on the schedule |  [optional] |
| **activityCodeIds** | <!----><!---->**List&lt;String&gt;**<!----> | The IDs of the activity codes to reschedule. Null or empty means all activity codes will be considered |  [optional] |
| **doNotChangeWeeklyPaidTime** | <!----><!---->**Boolean**<!----> | Whether to prevent changes to weekly paid time |  |
| **doNotChangeDailyPaidTime** | <!----><!---->**Boolean**<!----> | Whether to prevent changes to daily paid time |  |
| **doNotChangeShiftStartTimes** | <!----><!---->**Boolean**<!----> | Whether to prevent changes to shift start times |  |
| **doNotChangeManuallyEditedShifts** | <!----><!---->**Boolean**<!----> | Whether to prevent changes to manually edited shifts |  |
{: class="table table-striped"}



