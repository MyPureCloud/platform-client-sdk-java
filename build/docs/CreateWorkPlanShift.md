---
title: CreateWorkPlanShift
---
## CreateWorkPlanShift


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | Name of the shift |  |
| **days** | [**SetWrapperDayOfWeek**](SetWrapperDayOfWeek.html) | Days of the week applicable for this shift |  [optional] |
| **flexibleStartTime** | **Boolean** | Whether the start time of the shift is flexible |  [optional] |
| **exactStartTimeMinutesFromMidnight** | **Integer** | Exact start time of the shift defined as offset minutes from midnight. Used if flexibleStartTime == false |  [optional] |
| **earliestStartTimeMinutesFromMidnight** | **Integer** | Earliest start time of the shift defined as offset minutes from midnight. Used if flexibleStartTime == true |  [optional] |
| **latestStartTimeMinutesFromMidnight** | **Integer** | Latest start time of the shift defined as offset minutes from midnight. Used if flexibleStartTime == true |  [optional] |
| **constrainStopTime** | **Boolean** | Whether the latest stop time constraint for the shift is enabled |  [optional] |
| **latestStopTimeMinutesFromMidnight** | **Integer** | Latest stop time of the shift defined as offset minutes from midnight. Used if constrainStopTime == true |  [optional] |
| **startIncrementMinutes** | **Integer** | Increment in offset minutes that would contribute to different possible start times for the shift. Used if flexibleStartTime == true |  [optional] |
| **flexiblePaidTime** | **Boolean** | Whether the paid time setting for the shift is flexible |  [optional] |
| **exactPaidTimeMinutes** | **Integer** | Exact paid time in minutes configured for the shift. Used if flexiblePaidTime == false |  [optional] |
| **minimumPaidTimeMinutes** | **Integer** | Minimum paid time in minutes configured for the shift. Used if flexiblePaidTime == true |  [optional] |
| **maximumPaidTimeMinutes** | **Integer** | Maximum paid time in minutes configured for the shift. Used if flexiblePaidTime == true |  [optional] |
| **constrainContiguousWorkTime** | **Boolean** | Whether the contiguous time constraint for the shift is enabled |  [optional] |
| **minimumContiguousWorkTimeMinutes** | **Integer** | Minimum contiguous time in minutes configured for the shift. Used if constrainContiguousWorkTime == true |  [optional] |
| **maximumContiguousWorkTimeMinutes** | **Integer** | Maximum contiguous time in minutes configured for the shift. Used if constrainContiguousWorkTime == true |  [optional] |
| **activities** | [**List&lt;CreateWorkPlanActivity&gt;**](CreateWorkPlanActivity.html) | Activities configured for this shift |  [optional] |
{: class="table table-striped"}



