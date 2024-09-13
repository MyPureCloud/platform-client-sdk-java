# AgentWorkPlan


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **constrainWeeklyPaidTime** | **Boolean** | Whether the weekly paid time constraint is enabled for this work plan |  |
| **flexibleWeeklyPaidTime** | **Boolean** | Whether the weekly paid time constraint is flexible for this work plan |  |
| **weeklyExactPaidMinutes** | **Integer** | Exact weekly paid time in minutes for this work plan. Used if flexibleWeeklyPaidTime == false |  |
| **weeklyMinimumPaidMinutes** | **Integer** | Minimum weekly paid time in minutes for this work plan. Used if flexibleWeeklyPaidTime == true |  |
| **weeklyMaximumPaidMinutes** | **Integer** | Maximum weekly paid time in minutes for this work plan. Used if flexibleWeeklyPaidTime == true |  |
| **optionalDays** | [**SetWrapperDayOfWeek**](SetWrapperDayOfWeek) | Optional days to schedule for this work plan |  [optional] |
| **shifts** | [**List&lt;AgentWorkPlanShift&gt;**](AgentWorkPlanShift) | Shifts in this work plan |  |
| **selfUri** | **String** | The URI for this object |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:209.0.1_
