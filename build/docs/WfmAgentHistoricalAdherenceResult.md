# WfmAgentHistoricalAdherenceResult


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **user** | [**UserReference**](UserReference) | The user who submitted the agent historical adherence query |  [optional] |
| **startDate** | [**Date**](Date) | Beginning of the date range that was queried, in ISO-8601 format |  |
| **endDate** | [**Date**](Date) | End of the date range that was queried, in ISO-8601 format. If it was not set, end date will be set to the queried time |  |
| **calculationsCompletedDate** | [**Date**](Date) | Completed date of calculations that was queried, in ISO-8601 format. |  |
| **targetAdherencePercentage** | **Double** | Target percentage for this user, in the scale of 0 - 100 |  |
| **adherencePercentage** | **Double** | Adherence percentage for this user, in the scale of 0 - 100 |  [optional] |
| **conformancePercentage** | **Double** | Conformance percentage for this user, in the scale of 0 - 100. Conformance percentage can be greater than 100 when the actual on queue time is greater than the scheduled on queue time for the same period. |  [optional] |
| **impact** | [**ImpactEnum**](#Enum--ImpactEnum) | The impact of the current adherence state for this user |  |
| **exceptionInfo** | [**List&lt;HistoricalAdherenceExceptionInfo&gt;**](HistoricalAdherenceExceptionInfo) | List of adherence exceptions for this user |  [optional] |
| **dayMetrics** | [**List&lt;AgentAdherenceDayMetrics&gt;**](AgentAdherenceDayMetrics) | Adherence and conformance metrics for days in query range |  |
| **actuals** | [**List&lt;HistoricalAdherenceActuals&gt;**](HistoricalAdherenceActuals) | List of actual activity with offset for this user |  [optional] |
| **scheduledActivities** | [**List&lt;AgentAdherenceScheduledActivity&gt;**](AgentAdherenceScheduledActivity) | List of scheduled activities for this user |  [optional] |
| **secondaryPresenceLookupItems** | [**List&lt;SecondaryPresenceLookupItem&gt;**](SecondaryPresenceLookupItem) | List of secondary presence lookup ID to corresponding secondary presence ID item |  |


## Enum: ImpactEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| POSITIVE | &quot;Positive&quot; | 
| NEGATIVE | &quot;Negative&quot; | 
| NEUTRAL | &quot;Neutral&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:243.0.0_
