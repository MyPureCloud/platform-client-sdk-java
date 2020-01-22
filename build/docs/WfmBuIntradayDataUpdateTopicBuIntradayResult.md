---
title: WfmBuIntradayDataUpdateTopicBuIntradayResult
---
## WfmBuIntradayDataUpdateTopicBuIntradayResult


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **startDate** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **endDate** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **intervalLengthMinutes** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **intradayDataGroupings** | <!----><!---->[**List&lt;WfmBuIntradayDataUpdateTopicBuIntradayDataGroup&gt;**](WfmBuIntradayDataUpdateTopicBuIntradayDataGroup.html)<!----> |  |  [optional] |
| **categories** | <!---->[**List&lt;CategoriesEnum&gt;**](#CategoriesEnum)<!----> |  |  [optional] |
| **noDataReason** | <!----><!---->**String**<!----> |  |  [optional] |
| **schedule** | <!----><!---->[**WfmBuIntradayDataUpdateTopicBuScheduleReference**](WfmBuIntradayDataUpdateTopicBuScheduleReference.html)<!----> |  |  [optional] |
| **shortTermForecast** | <!----><!---->[**WfmBuIntradayDataUpdateTopicBuShortTermForecastReference**](WfmBuIntradayDataUpdateTopicBuShortTermForecastReference.html)<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="CategoriesEnum"></a>

## Enum: CategoriesEnum

| Name | Value |
| ---- | ----- |
| FORECASTDATA | &quot;ForecastData&quot; |
| SCHEDULEDATA | &quot;ScheduleData&quot; |
| PERFORMANCEPREDICTIONDATA | &quot;PerformancePredictionData&quot; |
{: class="table table-striped"}



