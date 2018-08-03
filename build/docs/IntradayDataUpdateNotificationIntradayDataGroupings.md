---
title: IntradayDataUpdateNotificationIntradayDataGroupings
---
## IntradayDataUpdateNotificationIntradayDataGroupings


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **mediaType** | [**MediaTypeEnum**](#MediaTypeEnum) |  |  [optional] |
| **forecastDataPerInterval** | [**List&lt;IntradayDataUpdateNotificationForecastDataPerInterval&gt;**](IntradayDataUpdateNotificationForecastDataPerInterval.html) |  |  [optional] |
| **scheduleDataPerInterval** | [**List&lt;IntradayDataUpdateNotificationScheduleDataPerInterval&gt;**](IntradayDataUpdateNotificationScheduleDataPerInterval.html) |  |  [optional] |
| **historicalAgentDataPerInterval** | [**List&lt;IntradayDataUpdateNotificationHistoricalAgentDataPerInterval&gt;**](IntradayDataUpdateNotificationHistoricalAgentDataPerInterval.html) |  |  [optional] |
| **historicalQueueDataPerInterval** | [**List&lt;IntradayDataUpdateNotificationHistoricalQueueDataPerInterval&gt;**](IntradayDataUpdateNotificationHistoricalQueueDataPerInterval.html) |  |  [optional] |
| **performancePredictionAgentDataPerInterval** | [**List&lt;IntradayDataUpdateNotificationPerformancePredictionAgentDataPerInterval&gt;**](IntradayDataUpdateNotificationPerformancePredictionAgentDataPerInterval.html) |  |  [optional] |
| **performancePredictionQueueDataPerInterval** | [**List&lt;IntradayDataUpdateNotificationPerformancePredictionQueueDataPerInterval&gt;**](IntradayDataUpdateNotificationPerformancePredictionQueueDataPerInterval.html) |  |  [optional] |
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
| MESSAGE | &quot;Message&quot; |
{: class="table table-striped"}



