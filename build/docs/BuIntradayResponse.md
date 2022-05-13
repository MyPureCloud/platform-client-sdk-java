---
title: BuIntradayResponse
---
## BuIntradayResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **startDate** | <!----><!---->[**Date**](Date.html)<!----> | The start of the date range for which this data applies.  This is also the start reference point for the intervals represented in the various arrays. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **endDate** | <!----><!---->[**Date**](Date.html)<!----> | The end of the date range for which this data applies. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **intervalLengthMinutes** | <!----><!---->**Integer**<!----> | The aggregation period in minutes, which determines the interval duration of the returned data |  [optional] |
| **noDataReason** | [**NoDataReasonEnum**](#NoDataReasonEnum)<!----> | If not null, the reason there was no data for the request |  [optional] |
| **categories** | <!---->[**List&lt;CategoriesEnum&gt;**](#CategoriesEnum)<!----> | The categories to which this data corresponds |  [optional] |
| **shortTermForecast** | <!----><!---->[**BuShortTermForecastReference**](BuShortTermForecastReference.html)<!----> | Short term forecast reference |  [optional] |
| **schedule** | <!----><!---->[**BuScheduleReference**](BuScheduleReference.html)<!----> | Schedule reference |  [optional] |
| **intradayDataGroupings** | <!----><!---->[**List&lt;BuIntradayDataGroup&gt;**](BuIntradayDataGroup.html)<!----> | Intraday data grouped by a single media type and set of planning group IDs |  [optional] |
{: class="table table-striped"}


<a name="NoDataReasonEnum"></a>

## Enum: NoDataReasonEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NOPUBLISHEDSCHEDULE | &quot;NoPublishedSchedule&quot; | 
| NOSOURCEFORECAST | &quot;NoSourceForecast&quot; | 
{: class="table table-striped"}


<a name="CategoriesEnum"></a>

## Enum: CategoriesEnum

| Name | Value |
| ---- | ----- |
| FORECASTDATA | &quot;ForecastData&quot; |
| SCHEDULEDATA | &quot;ScheduleData&quot; |
| PERFORMANCEPREDICTIONDATA | &quot;PerformancePredictionData&quot; |
{: class="table table-striped"}



