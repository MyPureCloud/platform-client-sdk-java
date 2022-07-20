---
title: HistoricalAdherenceQueryResult
---
## HistoricalAdherenceQueryResult


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **userId** | <!----><!---->**String**<!----> | The ID of the user for whom the adherence is queried |  [optional] |
| **startDate** | <!----><!---->[**Date**](Date.html)<!----> | Beginning of the date range that was queried, in ISO-8601 format |  [optional] |
| **endDate** | <!----><!---->[**Date**](Date.html)<!----> | End of the date range that was queried, in ISO-8601 format. If it was not set, end date will be set to the queried time |  [optional] |
| **adherencePercentage** | <!----><!---->**Double**<!----> | Adherence percentage for this user, in the scale of 0 - 100 |  [optional] |
| **conformancePercentage** | <!----><!---->**Double**<!----> | Conformance percentage for this user, in the scale of 0 - 100. Conformance percentage can be greater than 100 when the actual on queue time is greater than the scheduled on queue time for the same period. |  [optional] |
| **impact** | [**ImpactEnum**](#ImpactEnum)<!----> | The impact of the current adherence state for this user |  [optional] |
| **exceptionInfo** | <!----><!---->[**List&lt;HistoricalAdherenceExceptionInfo&gt;**](HistoricalAdherenceExceptionInfo.html)<!----> | List of adherence exceptions for this user |  [optional] |
| **dayMetrics** | <!----><!---->[**List&lt;HistoricalAdherenceDayMetrics&gt;**](HistoricalAdherenceDayMetrics.html)<!----> | Adherence and conformance metrics for days in query range |  [optional] |
| **actualsEndDate** | <!----><!---->[**Date**](Date.html)<!----> | The end date of the actual activities in ISO-8601 format. |  [optional] |
| **actuals** | <!----><!---->[**List&lt;HistoricalAdherenceActuals&gt;**](HistoricalAdherenceActuals.html)<!----> | List of actual activity with offset for this user |  [optional] |
{: class="table table-striped"}


<a name="ImpactEnum"></a>

## Enum: ImpactEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| POSITIVE | &quot;Positive&quot; | 
| NEGATIVE | &quot;Negative&quot; | 
| NEUTRAL | &quot;Neutral&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
{: class="table table-striped"}



