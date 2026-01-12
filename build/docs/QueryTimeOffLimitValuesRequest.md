# QueryTimeOffLimitValuesRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **timeOffLimitId** | **String** | The time off limit object id to retrieve values for. Required if activityCodeId is not specified |  [optional] |
| **activityCodeId** | **String** | The ID of the activity code by which to filter the affected limit objects. Required if timeOffLimitId is not specified |  [optional] |
| **dateRanges** | [**List&lt;LocalDateRange&gt;**](LocalDateRange) | The list of the date ranges to return time off limit, allocated and waitlisted minutes. The valid number of date ranges is between 1 and 30. Maximum total number of days in all ranges in 366. |  |




_com.mypurecloud.sdk.v2:platform-client-v2:243.0.0_
