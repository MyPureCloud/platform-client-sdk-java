---
title: CreateWorkPlan
---
## CreateWorkPlan


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | <!----><!---->**String**<!----> | Name of this work plan |  |
| **enabled** | <!----><!---->**Boolean**<!----> | Whether the work plan is enabled for scheduling |  [optional] |
| **constrainWeeklyPaidTime** | <!----><!---->**Boolean**<!----> | Whether the weekly paid time constraint is enabled for this work plan |  [optional] |
| **flexibleWeeklyPaidTime** | <!----><!---->**Boolean**<!----> | Whether the weekly paid time constraint is flexible for this work plan |  [optional] |
| **weeklyExactPaidMinutes** | <!----><!---->**Integer**<!----> | Exact weekly paid time in minutes for this work plan. Used if flexibleWeeklyPaidTime == false |  [optional] |
| **weeklyMinimumPaidMinutes** | <!----><!---->**Integer**<!----> | Minimum weekly paid time in minutes for this work plan. Used if flexibleWeeklyPaidTime == true |  [optional] |
| **weeklyMaximumPaidMinutes** | <!----><!---->**Integer**<!----> | Maximum weekly paid time in minutes for this work plan. Used if flexibleWeeklyPaidTime == true |  [optional] |
| **constrainPaidTimeGranularity** | <!----><!---->**Boolean**<!----> | Whether paid time granularity should be constrained for this workplan |  [optional] |
| **paidTimeGranularityMinutes** | <!----><!---->**Integer**<!----> | Granularity in minutes allowed for shift paid time in this work plan. Used if constrainPaidTimeGranularity == true |  [optional] |
| **constrainMinimumTimeBetweenShifts** | <!----><!---->**Boolean**<!----> | Whether the minimum time between shifts constraint is enabled for this work plan |  [optional] |
| **minimumTimeBetweenShiftsMinutes** | <!----><!---->**Integer**<!----> | Minimum time between shifts in minutes defined in this work plan. Used if constrainMinimumTimeBetweenShifts == true |  [optional] |
| **maximumDays** | <!----><!---->**Integer**<!----> | Maximum number days in a week allowed to be scheduled for this work plan |  [optional] |
| **minimumWorkingDaysPerWeek** | <!----><!---->**Integer**<!----> | The minimum number of days that agents assigned to a work plan must work per week |  [optional] |
| **optionalDays** | <!----><!---->[**SetWrapperDayOfWeek**](SetWrapperDayOfWeek.html)<!----> | Optional days to schedule for this work plan |  [optional] |
| **shiftStartVariances** | <!----><!---->[**ListWrapperShiftStartVariance**](ListWrapperShiftStartVariance.html)<!----> | Variance in minutes among start times of shifts in this work plan |  [optional] |
| **shifts** | <!----><!---->[**List&lt;CreateWorkPlanShift&gt;**](CreateWorkPlanShift.html)<!----> | Shifts in this work plan |  [optional] |
| **agents** | <!----><!---->[**List&lt;UserReference&gt;**](UserReference.html)<!----> | Agents in this work plan |  [optional] |
{: class="table table-striped"}



