---
title: WfmBuIntradayDataUpdateTopicBuIntradayDataGroup
---
## WfmBuIntradayDataUpdateTopicBuIntradayDataGroup


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **mediaType** | [**MediaTypeEnum**](#MediaTypeEnum)<!----> |  |  [optional] |
| **forecastDataSummary** | <!----><!---->[**WfmBuIntradayDataUpdateTopicBuIntradayForecastData**](WfmBuIntradayDataUpdateTopicBuIntradayForecastData.html)<!----> |  |  [optional] |
| **forecastDataPerInterval** | <!----><!---->[**List&lt;WfmBuIntradayDataUpdateTopicBuIntradayForecastData&gt;**](WfmBuIntradayDataUpdateTopicBuIntradayForecastData.html)<!----> |  |  [optional] |
| **scheduleDataSummary** | <!----><!---->[**WfmBuIntradayDataUpdateTopicBuIntradayScheduleData**](WfmBuIntradayDataUpdateTopicBuIntradayScheduleData.html)<!----> |  |  [optional] |
| **scheduleDataPerInterval** | <!----><!---->[**List&lt;WfmBuIntradayDataUpdateTopicBuIntradayScheduleData&gt;**](WfmBuIntradayDataUpdateTopicBuIntradayScheduleData.html)<!----> |  |  [optional] |
| **performancePredictionDataSummary** | <!----><!---->[**WfmBuIntradayDataUpdateTopicIntradayPerformancePredictionData**](WfmBuIntradayDataUpdateTopicIntradayPerformancePredictionData.html)<!----> |  |  [optional] |
| **performancePredictionDataPerInterval** | <!----><!---->[**List&lt;WfmBuIntradayDataUpdateTopicIntradayPerformancePredictionData&gt;**](WfmBuIntradayDataUpdateTopicIntradayPerformancePredictionData.html)<!----> |  |  [optional] |
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



