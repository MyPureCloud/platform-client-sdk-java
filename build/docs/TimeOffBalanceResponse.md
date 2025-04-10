# TimeOffBalanceResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **activityCodeId** | **String** | The ID for activity code associated with time off balance |  |
| **hrisTimeOffTypeId** | **String** | The ID of the time off type configured in HRIS integration |  |
| **hrisTimeOffTypeSecondaryId** | **String** | The secondary ID of the time off type configured in HRIS integration |  [optional] |
| **startDate** | [**LocalDate**](LocalDate) | The Start date of the requested date range. The end date is determined by the size of interval list. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **balanceMinutesPerDay** | **List&lt;Integer&gt;** | The list of available time off balance values in minutes for each day |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:223.1.0_
