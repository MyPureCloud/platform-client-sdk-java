# WfmBuIntradayDataUpdateTopicBuIntradayResult


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **startDate** | [**Date**](Date) |  |  [optional] |
| **endDate** | [**Date**](Date) |  |  [optional] |
| **intervalLengthMinutes** | **Integer** |  |  [optional] |
| **intradayDataGroupings** | [**List&lt;WfmBuIntradayDataUpdateTopicBuIntradayDataGroup&gt;**](WfmBuIntradayDataUpdateTopicBuIntradayDataGroup) |  |  [optional] |
| **categories** | [**List<CategoriesEnum>**](#Enum--CategoriesEnum) |  |  [optional] |
| **noDataReason** | **String** |  |  [optional] |
| **schedule** | [**WfmBuIntradayDataUpdateTopicBuScheduleReference**](WfmBuIntradayDataUpdateTopicBuScheduleReference) |  |  [optional] |
| **shortTermForecast** | [**WfmBuIntradayDataUpdateTopicBuShortTermForecastReference**](WfmBuIntradayDataUpdateTopicBuShortTermForecastReference) |  |  [optional] |
{: class="table table-striped"}


## Enum: CategoriesEnum

| Name | Value |
| ---- | ----- |
| FORECASTDATA | &quot;ForecastData&quot; |
| SCHEDULEDATA | &quot;ScheduleData&quot; |
| PERFORMANCEPREDICTIONDATA | &quot;PerformancePredictionData&quot; |
{: class="table table-striped"}



