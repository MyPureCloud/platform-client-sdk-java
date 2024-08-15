# BuRescheduleResult


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **generationResults** | [**ScheduleGenerationResult**](ScheduleGenerationResult) | The generation results.  Note the result will always be delivered via the generationResultsDownloadUrl; however the schema is included for documentation |  [optional] |
| **generationResultsDownloadUrl** | **String** | The download URL from which to fetch the generation results for the rescheduling run |  [optional] |
| **headcountForecast** | [**BuHeadcountForecast**](BuHeadcountForecast) | The headcount forecast.  Note the result will always be delivered via the headcountForecastDownloadUrl; however the schema is included for documentation |  [optional] |
| **headcountForecastDownloadUrl** | **String** | The download URL from which to fetch the headcount forecast for the rescheduling run |  [optional] |
| **agentSchedules** | [**List&lt;BuRescheduleAgentScheduleResult&gt;**](BuRescheduleAgentScheduleResult) | List of download links for agent schedules produced by the rescheduling run |  [optional] |
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:207.0.0_
