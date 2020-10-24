---
title: ReschedulingOptionsRunResponse
---
## ReschedulingOptionsRunResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **existingSchedule** | <!----><!---->[**BuScheduleReference**](BuScheduleReference.html)<!----> | The existing schedule to which this reschedule run applies |  [optional] |
| **startDate** | <!----><!---->[**Date**](Date.html)<!----> | The start date of the period to reschedule. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **endDate** | <!----><!---->[**Date**](Date.html)<!----> | The end date of the period to reschedule. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **managementUnits** | <!----><!---->[**List&lt;ReschedulingManagementUnitResponse&gt;**](ReschedulingManagementUnitResponse.html)<!----> | Per-management unit rescheduling options |  [optional] |
| **agentCount** | <!----><!---->**Integer**<!----> | The number of agents to be considered in the reschedule |  [optional] |
| **activityCodeIds** | <!----><!---->**List&lt;String&gt;**<!----> | The IDs of the activity codes being considered for reschedule |  [optional] |
| **doNotChangeWeeklyPaidTime** | <!----><!---->**Boolean**<!----> | Whether weekly paid time is allowed to be changed |  [optional] |
| **doNotChangeDailyPaidTime** | <!----><!---->**Boolean**<!----> | Whether daily paid time is allowed to be changed |  [optional] |
| **doNotChangeShiftStartTimes** | <!----><!---->**Boolean**<!----> | Whether shift start times are allowed to be changed |  [optional] |
| **doNotChangeManuallyEditedShifts** | <!----><!---->**Boolean**<!----> | Whether manually edited shifts are allowed to be changed |  [optional] |
{: class="table table-striped"}



