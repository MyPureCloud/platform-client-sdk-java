---
title: WfmIntradayDataUpdateTopicIntradayDataGroup
---
## WfmIntradayDataUpdateTopicIntradayDataGroup


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **mediaType** | [**MediaTypeEnum**](#MediaTypeEnum)<!----> |  |  [optional] |
| **forecastDataPerInterval** | <!----><!---->[**List&lt;WfmIntradayDataUpdateTopicIntradayForecastData&gt;**](WfmIntradayDataUpdateTopicIntradayForecastData.html)<!----> |  |  [optional] |
| **scheduleDataPerInterval** | <!----><!---->[**List&lt;WfmIntradayDataUpdateTopicIntradayScheduleData&gt;**](WfmIntradayDataUpdateTopicIntradayScheduleData.html)<!----> |  |  [optional] |
| **historicalAgentDataPerInterval** | <!----><!---->[**List&lt;WfmIntradayDataUpdateTopicIntradayHistoricalAgentData&gt;**](WfmIntradayDataUpdateTopicIntradayHistoricalAgentData.html)<!----> |  |  [optional] |
| **historicalQueueDataPerInterval** | <!----><!---->[**List&lt;WfmIntradayDataUpdateTopicIntradayHistoricalQueueData&gt;**](WfmIntradayDataUpdateTopicIntradayHistoricalQueueData.html)<!----> |  |  [optional] |
| **performancePredictionAgentDataPerInterval** | <!----><!---->[**List&lt;WfmIntradayDataUpdateTopicIntradayPerformancePredictionAgentData&gt;**](WfmIntradayDataUpdateTopicIntradayPerformancePredictionAgentData.html)<!----> |  |  [optional] |
| **performancePredictionQueueDataPerInterval** | <!----><!---->[**List&lt;WfmIntradayDataUpdateTopicIntradayPerformancePredictionQueueData&gt;**](WfmIntradayDataUpdateTopicIntradayPerformancePredictionQueueData.html)<!----> |  |  [optional] |
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



