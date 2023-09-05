---
title: WfmHistoricalAdherenceBulkUserResult
---
## WfmHistoricalAdherenceBulkUserResult


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **userId** | <!----><!---->**String**<!----> | The ID of the user for whom the adherence is queried |  [optional] |
| **adherencePercentage** | <!----><!---->**Double**<!----> | Adherence percentage for this user, in the scale of 0 - 100 |  [optional] |
| **conformancePercentage** | <!----><!---->**Double**<!----> | Conformance percentage for this user, in the scale of 0 - 100. Conformance percentage can be greater than 100 when the actual on queue time is greater than the scheduled on queue time for the same period. |  [optional] |
| **impact** | [**ImpactEnum**](#ImpactEnum)<!----> | The impact of the current adherence state for this user |  [optional] |
| **exceptionInfo** | <!----><!---->[**List&lt;HistoricalAdherenceExceptionInfo&gt;**](HistoricalAdherenceExceptionInfo.html)<!----> | List of adherence exceptions for this user |  [optional] |
| **actuals** | <!----><!---->[**List&lt;HistoricalAdherenceActuals&gt;**](HistoricalAdherenceActuals.html)<!----> | List of adherence actuals for this user |  [optional] |
| **dayMetrics** | <!----><!---->[**List&lt;WfmHistoricalAdherenceBulkUserDayMetrics&gt;**](WfmHistoricalAdherenceBulkUserDayMetrics.html)<!----> | Adherence and conformance metrics for days in query range |  [optional] |
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



