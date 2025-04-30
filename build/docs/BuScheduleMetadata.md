# BuScheduleMetadata


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **weekDate** | [**LocalDate**](LocalDate) | The start week date for this schedule. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **weekCount** | **Integer** | The number of weeks spanned by this schedule |  [optional] |
| **description** | **String** | The description of this schedule |  [optional] |
| **published** | **Boolean** | Whether this schedule is published |  [optional] |
| **shortTermForecast** | [**BuShortTermForecastReference**](BuShortTermForecastReference) | The forecast used for this schedule, if applicable |  [optional] |
| **generationResults** | [**ScheduleGenerationResultSummary**](ScheduleGenerationResultSummary) | Generation result summary for this schedule, if applicable |  [optional] |
| **metadata** | [**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata) | Version metadata for this schedule |  [optional] |
| **managementUnits** | [**List&lt;BuManagementUnitScheduleSummary&gt;**](BuManagementUnitScheduleSummary) | High level per-management unit schedule metadata |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:224.0.0_
