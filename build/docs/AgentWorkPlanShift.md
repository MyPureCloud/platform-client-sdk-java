# AgentWorkPlanShift


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **days** | [**SetWrapperDayOfWeek**](SetWrapperDayOfWeek) | Days of the week applicable for this shift |  |
| **flexibleStartTime** | **Boolean** | Whether the start time of the shift is flexible |  |
| **exactStartTimeMinutesFromMidnight** | **Integer** | Exact start time of the shift defined as offset minutes from midnight. Used if flexibleStartTime == false |  |
| **earliestStartTimeMinutesFromMidnight** | **Integer** | Earliest start time of the shift defined as offset minutes from midnight. Used if flexibleStartTime == true |  |
| **latestStartTimeMinutesFromMidnight** | **Integer** | Latest start time of the shift defined as offset minutes from midnight. Used if flexibleStartTime == true |  |
| **earliestStopTimeMinutesFromMidnight** | **Integer** | This is the earliest time a shift can end |  |
| **constrainLatestStopTime** | **Boolean** | Whether the latest stop time constraint for the shift is enabled |  |
| **latestStopTimeMinutesFromMidnight** | **Integer** | Latest stop time of the shift defined as offset minutes from midnight. Used if constrainStopTime == true |  |
| **flexiblePaidTime** | **Boolean** | Whether the paid time setting for the shift is flexible |  |
| **exactPaidTimeMinutes** | **Integer** | Exact paid time in minutes configured for the shift. Used if flexiblePaidTime == false |  |
| **minimumPaidTimeMinutes** | **Integer** | Minimum paid time in minutes configured for the shift. Used if flexiblePaidTime == true |  |
| **maximumPaidTimeMinutes** | **Integer** | Maximum paid time in minutes configured for the shift. Used if flexiblePaidTime == true |  |
| **activities** | [**List&lt;AgentWorkPlanActivity&gt;**](AgentWorkPlanActivity) | Activities configured for this shift |  |




_com.mypurecloud.sdk.v2:platform-client-v2:209.1.0_
