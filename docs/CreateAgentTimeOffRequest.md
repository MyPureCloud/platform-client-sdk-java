# CreateAgentTimeOffRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **activityCodeId** | **String** | The ID of the activity code associated with this time off request. Activity code must be of the TimeOff category |  |
| **notes** | **String** | Notes about the time off request |  [optional] |
| **fullDayManagementUnitDates** | **List&lt;String&gt;** | A set of dates in yyyy-MM-dd format.  Should be interpreted in the management unit's configured time zone |  [optional] |
| **fullDayEarliestStartOffsetMinutes** | **List&lt;Integer&gt;** | Earliest start offset in minutes for each full-day request date. Values may be null when time-off estimation is disabled or no estimate is available |  [optional] |
| **fullDayLatestEndOffsetMinutes** | **List&lt;Integer&gt;** | Latest end offset in minutes for each full-day request date. Values may be null when time-off estimation is disabled or no estimate is available |  [optional] |
| **partialDayStartDateTimes** | [**List&lt;Date&gt;**](Date) | A set of start date-times in ISO-8601 format for partial day requests |  [optional] |
| **dailyDurationMinutes** | **Integer** | Daily duration in minutes applied to all days of this time off request. Ignored if durationMinutes is specified. At least one of dailyDurationMinutes or durationMinutes is required |  [optional] |
| **durationMinutes** | **List&lt;Integer&gt;** | Duration in minutes for each day of this time off request. Must match the size of fullDayManagementUnitDates or partialDayStartDateTimes. At least one of dailyDurationMinutes or durationMinutes is required |  [optional] |
| **payableMinutes** | **List&lt;Integer&gt;** | Payable minutes for each day of this time off request, representing scheduled paid time displaced by this request. Defaults to dailyDurationMinutes if not specified |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:261.0.0_
