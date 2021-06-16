---
title: WorkPlanActivity
---
## WorkPlanActivity


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **activityCodeId** | <!----><!---->**String**<!----> | ID of the activity code associated with this activity |  [optional] |
| **description** | <!----><!---->**String**<!----> | Description of the activity |  [optional] |
| **lengthMinutes** | <!----><!---->**Integer**<!----> | Length of the activity in minutes |  [optional] |
| **startTimeIsRelativeToShiftStart** | <!----><!---->**Boolean**<!----> | Whether the start time of the activity is relative to the start time of the shift it belongs to |  [optional] |
| **flexibleStartTime** | <!----><!---->**Boolean**<!----> | Whether the start time of the activity is flexible |  [optional] |
| **earliestStartTimeMinutes** | <!----><!---->**Integer**<!----> | Earliest activity start in offset minutes relative to shift start time if startTimeIsRelativeToShiftStart == true else its based on midnight. Used if flexibleStartTime == true |  [optional] |
| **latestStartTimeMinutes** | <!----><!---->**Integer**<!----> | Latest activity start in offset minutes relative to shift start time if startTimeIsRelativeToShiftStart == true else its based on midnight. Used if flexibleStartTime == true |  [optional] |
| **exactStartTimeMinutes** | <!----><!---->**Integer**<!----> | Exact activity start in offset minutes relative to shift start time if startTimeIsRelativeToShiftStart == true else its based on midnight. Used if flexibleStartTime == false |  [optional] |
| **startTimeIncrementMinutes** | <!----><!---->**Integer**<!----> | Increment in offset minutes that would contribute to different possible start times for the activity |  [optional] |
| **countsAsPaidTime** | <!----><!---->**Boolean**<!----> | Whether the activity is paid |  [optional] |
| **countsAsContiguousWorkTime** | <!----><!---->**Boolean**<!----> | Whether the activity duration is counted towards contiguous work time |  [optional] |
| **minimumLengthFromShiftStartMinutes** | <!----><!---->**Integer**<!----> | The minimum duration between shift start and shift item (e.g., break or meal) start in minutes |  [optional] |
| **minimumLengthFromShiftEndMinutes** | <!----><!---->**Integer**<!----> | The minimum duration between shift item (e.g., break or meal) end and shift end in minutes |  [optional] |
| **id** | <!----><!---->**String**<!----> | ID of the activity. This is required only for the case of updating an existing activity |  [optional] |
| **delete** | <!----><!---->**Boolean**<!----> | If marked true for updating an existing activity, the activity will be permanently deleted |  [optional] |
| **validationId** | <!----><!---->**String**<!----> | ID of the activity in the context of work plan validation |  [optional] |
{: class="table table-striped"}



