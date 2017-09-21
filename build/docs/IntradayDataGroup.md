---
title: IntradayDataGroup
---
## IntradayDataGroup


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **mediaType** | [**MediaTypeEnum**](#MediaTypeEnum) | The media type associated with this intraday group |  [optional] |
| **forecastDataPerInterval** | [**List&lt;IntradayForecastData&gt;**](IntradayForecastData.html) | Forecast data for this date range |  [optional] |
| **scheduleDataPerInterval** | [**List&lt;IntradayScheduleData&gt;**](IntradayScheduleData.html) | Schedule data for this date range |  [optional] |
| **historicalAgentDataPerInterval** | [**List&lt;IntradayHistoricalAgentData&gt;**](IntradayHistoricalAgentData.html) | Historical agent data for this date range |  [optional] |
| **historicalQueueDataPerInterval** | [**List&lt;IntradayHistoricalQueueData&gt;**](IntradayHistoricalQueueData.html) | Historical queue data for this date range |  [optional] |
| **performancePredictionAgentDataPerInterval** | [**List&lt;IntradayPerformancePredictionAgentData&gt;**](IntradayPerformancePredictionAgentData.html) | Performance prediction data for this date range |  [optional] |
| **performancePredictionQueueDataPerInterval** | [**List&lt;IntradayPerformancePredictionQueueData&gt;**](IntradayPerformancePredictionQueueData.html) | Performance prediction data for this date range |  [optional] |
{: class="table table-striped"}


<a name="MediaTypeEnum"></a>

## Enum: MediaTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| VOICE | &quot;Voice&quot; |
| CHAT | &quot;Chat&quot; |
| EMAIL | &quot;Email&quot; |
| CALLBACK | &quot;Callback&quot; |
{: class="table table-striped"}


