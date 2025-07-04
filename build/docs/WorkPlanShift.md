# WorkPlanShift


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | Name of the shift |  |
| **days** | [**SetWrapperDayOfWeek**](SetWrapperDayOfWeek) | Days of the week applicable for this shift |  [optional] |
| **flexibleStartTime** | **Boolean** | Whether the start time of the shift is flexible |  [optional] |
| **exactStartTimeMinutesFromMidnight** | **Integer** | Exact start time of the shift defined as offset minutes from midnight. Used if flexibleStartTime == false |  [optional] |
| **earliestStartTimeMinutesFromMidnight** | **Integer** | Earliest start time of the shift defined as offset minutes from midnight. Used if flexibleStartTime == true |  [optional] |
| **latestStartTimeMinutesFromMidnight** | **Integer** | Latest start time of the shift defined as offset minutes from midnight. Used if flexibleStartTime == true |  [optional] |
| **constrainStopTime** | **Boolean** | Whether the latest stop time constraint for the shift is enabled.  Deprecated, use constrainLatestStopTime instead |  [optional] |
| **constrainLatestStopTime** | **Boolean** | Whether the latest stop time constraint for the shift is enabled |  [optional] |
| **latestStopTimeMinutesFromMidnight** | **Integer** | Latest stop time of the shift defined as offset minutes from midnight. Used if constrainStopTime == true |  [optional] |
| **constrainEarliestStopTime** | **Boolean** | Whether the earliest stop time constraint for the shift is enabled |  [optional] |
| **earliestStopTimeMinutesFromMidnight** | **Integer** | This is the earliest time a shift can end |  [optional] |
| **startIncrementMinutes** | **Integer** | Increment in offset minutes that would contribute to different possible start times for the shift. Used if flexibleStartTime == true |  [optional] |
| **flexiblePaidTime** | **Boolean** | Whether the paid time setting for the shift is flexible |  [optional] |
| **exactPaidTimeMinutes** | **Integer** | Exact paid time in minutes configured for the shift. Used if flexiblePaidTime == false |  [optional] |
| **minimumPaidTimeMinutes** | **Integer** | Minimum paid time in minutes configured for the shift. Used if flexiblePaidTime == true |  [optional] |
| **maximumPaidTimeMinutes** | **Integer** | Maximum paid time in minutes configured for the shift. Used if flexiblePaidTime == true |  [optional] |
| **constrainContiguousWorkTime** | **Boolean** | Whether the contiguous time constraint for the shift is enabled |  [optional] |
| **minimumContiguousWorkTimeMinutes** | **Integer** | Minimum contiguous time in minutes configured for the shift. Used if constrainContiguousWorkTime == true |  [optional] |
| **maximumContiguousWorkTimeMinutes** | **Integer** | Maximum contiguous time in minutes configured for the shift. Used if constrainContiguousWorkTime == true |  [optional] |
| **constrainDayOff** | **Boolean** | Whether day off rule is enabled |  [optional] |
| **dayOffRule** | [**DayOffRuleEnum**](#Enum--DayOffRuleEnum) | The day off rule for agents to have next day off or previous day off. used if constrainDayOff = true |  [optional] |
| **activities** | [**List&lt;WorkPlanActivity&gt;**](WorkPlanActivity) | Activities configured for this shift |  [optional] |
| **id** | **String** | ID of the shift. This is required only for the case of updating an existing shift |  [optional] |
| **delete** | **Boolean** | If marked true for updating an existing shift, the shift will be permanently deleted |  [optional] |
| **validationId** | **String** | ID of shift in the context of work plan validation |  [optional] |


## Enum: DayOffRuleEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NEXTDAYOFF | &quot;NextDayOff&quot; | 
| PREVIOUSDAYOFF | &quot;PreviousDayOff&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
