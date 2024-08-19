# BuIntradayDataGroup


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **mediaType** | [**MediaTypeEnum**](#Enum--MediaTypeEnum) | The media type associated with this intraday group |  [optional] |
| **forecastDataSummary** | [**BuIntradayForecastData**](BuIntradayForecastData) | Forecast data summary for this date range |  [optional] |
| **forecastDataPerInterval** | [**List&lt;BuIntradayForecastData&gt;**](BuIntradayForecastData) | Forecast data per interval for this date range |  [optional] |
| **scheduleDataSummary** | [**BuIntradayScheduleData**](BuIntradayScheduleData) | Schedule data summary for this date range |  [optional] |
| **scheduleDataPerInterval** | [**List&lt;BuIntradayScheduleData&gt;**](BuIntradayScheduleData) | Schedule data per interval for this date range |  [optional] |
| **performancePredictionDataSummary** | [**IntradayPerformancePredictionData**](IntradayPerformancePredictionData) | Performance prediction data summary for this date range |  [optional] |
| **performancePredictionDataPerInterval** | [**List&lt;IntradayPerformancePredictionData&gt;**](IntradayPerformancePredictionData) | Performance prediction data per interval for this date range |  [optional] |
{: class="table table-striped"}


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



