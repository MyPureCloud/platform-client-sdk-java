# BuCreateBlankScheduleRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **description** | **String** | The description for the schedule |  |
| **shortTermForecast** | [**BuShortTermForecastReference**](BuShortTermForecastReference) | The forecast to use when generating the schedule.  Note that the forecast must fully encompass the schedule's start week + week count |  [optional] |
| **weekCount** | **Integer** | The number of weeks in the schedule. One extra day is added at the end |  |




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
