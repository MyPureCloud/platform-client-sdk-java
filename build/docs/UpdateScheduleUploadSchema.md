# UpdateScheduleUploadSchema


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **description** | **String** | The description to set for the schedule |  [optional] |
| **published** | **Boolean** | Whether to publish the schedule. Note: a schedule cannot be un-published unless another schedule is published over it |  [optional] |
| **shortTermForecast** | [**BuShortTermForecastReference**](BuShortTermForecastReference) | The short term forecast to associate with the schedule |  [optional] |
| **headcountForecast** | [**BuHeadcountForecast**](BuHeadcountForecast) | The headcount forecast to associate with the schedule |  [optional] |
| **agentSchedules** | [**List&lt;BuUpdateAgentScheduleUploadSchema&gt;**](BuUpdateAgentScheduleUploadSchema) | Individual agent schedules |  [optional] |
| **metadata** | [**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata) | Version metadata for this schedule |  |




_com.mypurecloud.sdk.v2:platform-client-v2:218.0.0_
