# WfmHistoricalAdherenceBulkUserResult


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **userId** | **String** | The ID of the user for whom the adherence is queried |  [optional] |
| **adherencePercentage** | **Double** | Adherence percentage for this user, in the scale of 0 - 100 |  [optional] |
| **conformancePercentage** | **Double** | Conformance percentage for this user, in the scale of 0 - 100. Conformance percentage can be greater than 100 when the actual on-queue time is greater than the scheduled on-queue time for the same period. |  [optional] |
| **impact** | [**ImpactEnum**](#Enum--ImpactEnum) | The impact of the current adherence state for this user |  [optional] |
| **exceptionInfo** | [**List&lt;HistoricalAdherenceExceptionInfo&gt;**](HistoricalAdherenceExceptionInfo) | List of adherence exceptions for this user |  [optional] |
| **actuals** | [**List&lt;HistoricalAdherenceActuals&gt;**](HistoricalAdherenceActuals) | List of adherence actuals for this user |  [optional] |
| **dayMetrics** | [**List&lt;WfmHistoricalAdherenceBulkUserDayMetrics&gt;**](WfmHistoricalAdherenceBulkUserDayMetrics) | Adherence and conformance metrics for days in query range |  [optional] |


## Enum: ImpactEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| POSITIVE | &quot;Positive&quot; | 
| NEGATIVE | &quot;Negative&quot; | 
| NEUTRAL | &quot;Neutral&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:227.0.0_
