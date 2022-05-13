---
title: BuCreateBlankScheduleRequest
---
## BuCreateBlankScheduleRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **description** | <!----><!---->**String**<!----> | The description for the schedule |  |
| **shortTermForecast** | <!----><!---->[**BuShortTermForecastReference**](BuShortTermForecastReference.html)<!----> | The forecast to use when generating the schedule.  Note that the forecast must fully encompass the schedule's start week + week count |  [optional] |
| **weekCount** | <!----><!---->**Integer**<!----> | The number of weeks in the schedule. One extra day is added at the end |  |
{: class="table table-striped"}



