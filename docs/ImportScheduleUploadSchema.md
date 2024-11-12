# ImportScheduleUploadSchema


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **description** | **String** | The description for the imported schedule |  |
| **weekCount** | **Integer** | The number of weeks the imported schedule will cover |  |
| **published** | **Boolean** | Whether the imported schedule should be immediately published |  [optional] |
| **shortTermForecast** | [**BuShortTermForecastReference**](BuShortTermForecastReference) | The short term forecast to associate with the imported schedule |  [optional] |
| **headcountForecast** | [**BuHeadcountForecast**](BuHeadcountForecast) | The headcount forecast to associate with the imported schedule |  [optional] |
| **agentSchedules** | [**List&lt;BuImportAgentScheduleUploadSchema&gt;**](BuImportAgentScheduleUploadSchema) | Individual agent schedules |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:214.0.0_
