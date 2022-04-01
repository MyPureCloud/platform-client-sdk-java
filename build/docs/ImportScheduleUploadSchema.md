---
title: ImportScheduleUploadSchema
---
## ImportScheduleUploadSchema


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **description** | <!----><!---->**String**<!----> | The description for the imported schedule |  |
| **weekCount** | <!----><!---->**Integer**<!----> | The number of weeks the imported schedule will cover |  |
| **published** | <!----><!---->**Boolean**<!----> | Whether the imported schedule should be immediately published |  [optional] |
| **shortTermForecast** | <!----><!---->[**BuShortTermForecastReference**](BuShortTermForecastReference.html)<!----> | The short term forecast to associate with the imported schedule |  [optional] |
| **headcountForecast** | <!----><!---->[**BuHeadcountForecast**](BuHeadcountForecast.html)<!----> | The headcount forecast to associate with the imported schedule |  [optional] |
| **agentSchedules** | <!----><!---->[**List&lt;BuImportAgentScheduleUploadSchema&gt;**](BuImportAgentScheduleUploadSchema.html)<!----> | Individual agent schedules |  [optional] |
{: class="table table-striped"}



