# AvailableTimeOffRange


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **timeOffLimit** | [**TimeOffLimitReference**](TimeOffLimitReference) | The time off limit |  [optional] |
| **startDate** | [**LocalDate**](LocalDate) | Start date of the requested date range. The end date is determined by the size of interval list. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **granularity** | [**GranularityEnum**](#Enum--GranularityEnum) | Granularity choice for time off limit |  [optional] |
| **availableMinutesPerInterval** | **List&lt;Integer&gt;** | The list of available time off values in minutes per granularity interval |  [optional] |
| **waitlistedRequestsPerInterval** | **List&lt;Integer&gt;** | The current number of waitlisted time off requests for every interval per granularity |  [optional] |
| **waitlistEnabled** | **Boolean** | Whether the time off request can be waitlisted |  [optional] |


## Enum: GranularityEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DAILY | &quot;Daily&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:229.0.0_
