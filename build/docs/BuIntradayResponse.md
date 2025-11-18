# BuIntradayResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **startDate** | [**Date**](Date) | The start of the date range for which this data applies.  This is also the start reference point for the intervals represented in the various arrays. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **endDate** | [**Date**](Date) | The end of the date range for which this data applies. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **intervalLengthMinutes** | **Integer** | The aggregation period in minutes, which determines the interval duration of the returned data |  [optional] |
| **noDataReason** | [**NoDataReasonEnum**](#Enum--NoDataReasonEnum) | If not null, the reason there was no data for the request |  [optional] |
| **categories** | [**List<CategoriesEnum>**](#Enum--CategoriesEnum) | The categories to which this data corresponds |  [optional] |
| **shortTermForecast** | [**BuShortTermForecastReference**](BuShortTermForecastReference) | Short term forecast reference |  [optional] |
| **schedule** | [**BuScheduleReference**](BuScheduleReference) | Schedule reference |  [optional] |
| **intradayDataGroupings** | [**List&lt;BuIntradayDataGroup&gt;**](BuIntradayDataGroup) | Intraday data grouped by a single media type and set of planning group IDs |  [optional] |


## Enum: NoDataReasonEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NOPUBLISHEDSCHEDULE | &quot;NoPublishedSchedule&quot; | 
| NOSOURCEFORECAST | &quot;NoSourceForecast&quot; | 


## Enum: CategoriesEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| FORECASTDATA | &quot;ForecastData&quot; |
| SCHEDULEDATA | &quot;ScheduleData&quot; |
| PERFORMANCEPREDICTIONDATA | &quot;PerformancePredictionData&quot; |




_com.mypurecloud.sdk.v2:platform-client-v2:237.0.0_
