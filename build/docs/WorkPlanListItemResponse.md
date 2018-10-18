---
title: WorkPlanListItemResponse
---
## WorkPlanListItemResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **enabled** | **Boolean** | Whether the work plan is enabled for scheduling |  [optional] |
| **constrainWeeklyPaidTime** | **Boolean** | Whether the weekly paid time constraint is enabled for this work plan |  [optional] |
| **flexibleWeeklyPaidTime** | **Boolean** | Whether the weekly paid time constraint is flexible for this work plan |  [optional] |
| **weeklyExactPaidMinutes** | **Integer** | Exact weekly paid time in minutes for this work plan. Used if flexibleWeeklyPaidTime == false |  [optional] |
| **weeklyMinimumPaidMinutes** | **Integer** | Minimum weekly paid time in minutes for this work plan. Used if flexibleWeeklyPaidTime == true |  [optional] |
| **weeklyMaximumPaidMinutes** | **Integer** | Maximum weekly paid time in minutes for this work plan. Used if flexibleWeeklyPaidTime == true |  [optional] |
| **constrainPaidTimeGranularity** | **Boolean** | Whether paid time granularity is constrained for this workplan |  [optional] |
| **paidTimeGranularityMinutes** | **Integer** | Granularity in minutes allowed for shift paid time in this work plan. Used if constrainPaidTimeGranularity == true |  [optional] |
| **constrainMinimumTimeBetweenShifts** | **Boolean** | Whether the minimum time between shifts constraint is enabled for this work plan |  [optional] |
| **minimumTimeBetweenShiftsMinutes** | **Integer** | Minimum time between shifts in minutes defined in this work plan. Used if constrainMinimumTimeBetweenShifts == true |  [optional] |
| **maximumDays** | **Integer** | Maximum number days in a week allowed to be scheduled for this work plan |  [optional] |
| **optionalDays** | [**SetWrapperDayOfWeek**](SetWrapperDayOfWeek.html) | Optional days to schedule for this work plan. Populate with expand=details |  [optional] |
| **shiftStartVariances** | [**ListWrapperShiftStartVariance**](ListWrapperShiftStartVariance.html) | Variance in minutes among start times of shifts in this work plan. Populate with expand=details |  [optional] |
| **shifts** | [**List&lt;WorkPlanShift&gt;**](WorkPlanShift.html) | Shifts in this work plan. Populate with expand=details (defaults to empty list) |  [optional] |
| **agents** | [**List&lt;DeletableUserReference&gt;**](DeletableUserReference.html) | Agents in this work plan. Populate with expand=details (defaults to empty list) |  [optional] |
| **metadata** | [**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata.html) | Version metadata for this work plan |  |
| **agentCount** | **Integer** | Number of agents in this work plan.  Populate with expand=agentCount |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
{: class="table table-striped"}



