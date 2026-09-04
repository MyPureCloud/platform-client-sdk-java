# BuTimeOffLimitRange


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **startDate** | [**LocalDate**](LocalDate) | Start date of the range. The end date is determined by the size of 'limitMinutesPerDay'. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  |
| **limitMinutesPerFifteenMinutes** | **List&lt;Integer&gt;** | The list of time-off limit values in minutes per fifteen minute interval. It must be set if 'granularity' on time-off limit is fifteen minutes. If count of limit minutes array exceeds a day for given 'startDate', the slots overflowing into next day, should not be duplicated in another range entry with next day as 'startDate'.For example startDate 03/01/2026 - limitMinutesPerFifteenMinutes with 120 intervals, 03/02/2026 - limitMinutesPerFifteenMinutes with 20 intervals has overlap and not allowed |  [optional] |
| **limitMinutesPerDay** | **List&lt;Integer&gt;** | The list of time-off limit values in minutes per day. If 'null' is specified, then the day-specific value is cleared. Such a day will have a value of 0 |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:262.0.0_
