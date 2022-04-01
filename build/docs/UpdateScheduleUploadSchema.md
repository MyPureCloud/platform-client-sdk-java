---
title: UpdateScheduleUploadSchema
---
## UpdateScheduleUploadSchema


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **description** | <!----><!---->**String**<!----> | The description to set for the schedule |  [optional] |
| **published** | <!----><!---->**Boolean**<!----> | Whether to publish the schedule. Note: a schedule cannot be un-published unless another schedule is published over it |  [optional] |
| **shortTermForecast** | <!----><!---->[**BuShortTermForecastReference**](BuShortTermForecastReference.html)<!----> | The short term forecast to associate with the schedule |  [optional] |
| **headcountForecast** | <!----><!---->[**BuHeadcountForecast**](BuHeadcountForecast.html)<!----> | The headcount forecast to associate with the schedule |  [optional] |
| **agentSchedules** | <!----><!---->[**List&lt;BuUpdateAgentScheduleUploadSchema&gt;**](BuUpdateAgentScheduleUploadSchema.html)<!----> | Individual agent schedules |  [optional] |
| **metadata** | <!----><!---->[**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata.html)<!----> | Version metadata for this schedule |  |
{: class="table table-striped"}



