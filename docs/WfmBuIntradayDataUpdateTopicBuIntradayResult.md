# WfmBuIntradayDataUpdateTopicBuIntradayResult


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **startDate** | [**Date**](Date) |  |  [optional] |
| **endDate** | [**Date**](Date) |  |  [optional] |
| **intervalLengthMinutes** | **Long** |  |  [optional] |
| **intradayDataGroupings** | [**List&lt;WfmBuIntradayDataUpdateTopicBuIntradayDataGroup&gt;**](WfmBuIntradayDataUpdateTopicBuIntradayDataGroup) |  |  [optional] |
| **categories** | [**List<CategoriesEnum>**](#Enum--CategoriesEnum) |  |  [optional] |
| **noDataReason** | **String** |  |  [optional] |
| **schedule** | [**WfmBuIntradayDataUpdateTopicBuScheduleReference**](WfmBuIntradayDataUpdateTopicBuScheduleReference) |  |  [optional] |
| **shortTermForecast** | [**WfmBuIntradayDataUpdateTopicBuShortTermForecastReference**](WfmBuIntradayDataUpdateTopicBuShortTermForecastReference) |  |  [optional] |


## Enum: CategoriesEnum

| Name | Value |
| ---- | ----- |
| FORECASTDATA | &quot;ForecastData&quot; |
| SCHEDULEDATA | &quot;ScheduleData&quot; |
| PERFORMANCEPREDICTIONDATA | &quot;PerformancePredictionData&quot; |




_com.mypurecloud.sdk.v2:platform-client-v2:223.0.0_
