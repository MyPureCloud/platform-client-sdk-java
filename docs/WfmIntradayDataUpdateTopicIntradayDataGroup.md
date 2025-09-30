# WfmIntradayDataUpdateTopicIntradayDataGroup


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **mediaType** | [**MediaTypeEnum**](#Enum--MediaTypeEnum) |  |  [optional] |
| **forecastDataPerInterval** | [**List&lt;WfmIntradayDataUpdateTopicIntradayForecastData&gt;**](WfmIntradayDataUpdateTopicIntradayForecastData) |  |  [optional] |
| **scheduleDataPerInterval** | [**List&lt;WfmIntradayDataUpdateTopicIntradayScheduleData&gt;**](WfmIntradayDataUpdateTopicIntradayScheduleData) |  |  [optional] |
| **historicalAgentDataPerInterval** | [**List&lt;WfmIntradayDataUpdateTopicIntradayHistoricalAgentData&gt;**](WfmIntradayDataUpdateTopicIntradayHistoricalAgentData) |  |  [optional] |
| **historicalQueueDataPerInterval** | [**List&lt;WfmIntradayDataUpdateTopicIntradayHistoricalQueueData&gt;**](WfmIntradayDataUpdateTopicIntradayHistoricalQueueData) |  |  [optional] |
| **performancePredictionAgentDataPerInterval** | [**List&lt;WfmIntradayDataUpdateTopicIntradayPerformancePredictionAgentData&gt;**](WfmIntradayDataUpdateTopicIntradayPerformancePredictionAgentData) |  |  [optional] |
| **performancePredictionQueueDataPerInterval** | [**List&lt;WfmIntradayDataUpdateTopicIntradayPerformancePredictionQueueData&gt;**](WfmIntradayDataUpdateTopicIntradayPerformancePredictionQueueData) |  |  [optional] |


## Enum: MediaTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| VOICE | &quot;Voice&quot; | 
| CHAT | &quot;Chat&quot; | 
| EMAIL | &quot;Email&quot; | 
| CALLBACK | &quot;Callback&quot; | 
| MESSAGE | &quot;Message&quot; | 
| WORKITEM | &quot;Workitem&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:233.0.0_
