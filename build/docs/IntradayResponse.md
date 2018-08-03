---
title: IntradayResponse
---
## IntradayResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **startDate** | [**Date**](Date.html) | The start of the date range for which this data applies.  This is also the start reference point for the intervals represented in the various arrays. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **endDate** | [**Date**](Date.html) | The end of the date range for which this data applies. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **intervalLengthMinutes** | **Integer** | The aggregation period in minutes, which determines the interval duration of the returned data |  [optional] |
| **numberOfIntervals** | **Integer** | The total number of time intervals represented by this data |  [optional] |
| **metrics** | [**List&lt;IntradayMetric&gt;**](IntradayMetric.html) | The metrics to which this data corresponds |  [optional] |
| **noDataReason** | [**NoDataReasonEnum**](#NoDataReasonEnum) | If not null, the reason there was no data for the request |  [optional] |
| **queueIds** | **List&lt;String&gt;** | The IDs of the queues this data corresponds to |  [optional] |
| **intradayDataGroupings** | [**List&lt;IntradayDataGroup&gt;**](IntradayDataGroup.html) | Intraday data grouped by a single media type and set of queue IDs |  [optional] |
{: class="table table-striped"}


<a name="NoDataReasonEnum"></a>

## Enum: NoDataReasonEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| NOWEEKDATA | &quot;NoWeekData&quot; |
| NOPUBLISHEDSCHEDULE | &quot;NoPublishedSchedule&quot; |
| NOSOURCEFORECAST | &quot;NoSourceForecast&quot; |
{: class="table table-striped"}



