# IntradayPlanningGroupRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **businessUnitDate** | [**LocalDate**](LocalDate) | Requested date in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  |
| **categories** | [**List<CategoriesEnum>**](#Enum--CategoriesEnum) | The metric categories |  |
| **planningGroupIds** | **List&lt;String&gt;** | The IDs of the planning groups for which to fetch data.  Omitting or passing an empty list will return all available planning groups |  [optional] |
| **intervalLengthMinutes** | **Integer** | The period/interval in minutes for which to aggregate the data. Required, defaults to 15 |  [optional] |


## Enum: CategoriesEnum

| Name | Value |
| ---- | ----- |
| FORECASTDATA | &quot;ForecastData&quot; |
| SCHEDULEDATA | &quot;ScheduleData&quot; |
| PERFORMANCEPREDICTIONDATA | &quot;PerformancePredictionData&quot; |




_com.mypurecloud.sdk.v2:platform-client-v2:220.0.0_
