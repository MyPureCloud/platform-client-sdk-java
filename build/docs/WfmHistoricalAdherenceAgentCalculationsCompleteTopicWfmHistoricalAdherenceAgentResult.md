# WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentResult


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **user** | [**WfmHistoricalAdherenceAgentCalculationsCompleteTopicUserReference**](WfmHistoricalAdherenceAgentCalculationsCompleteTopicUserReference) |  |  [optional] |
| **startDate** | [**Date**](Date) |  |  [optional] |
| **endDate** | [**Date**](Date) |  |  [optional] |
| **calculationsCompletedDate** | [**Date**](Date) |  |  [optional] |
| **targetAdherencePercentage** | [**BigDecimal**](BigDecimal) |  |  [optional] |
| **adherencePercentage** | [**BigDecimal**](BigDecimal) |  |  [optional] |
| **conformancePercentage** | [**BigDecimal**](BigDecimal) |  |  [optional] |
| **impact** | [**ImpactEnum**](#Enum--ImpactEnum) |  |  [optional] |
| **exceptionInfo** | [**List&lt;WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceExceptionInfo&gt;**](WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceExceptionInfo) |  |  [optional] |
| **dayMetrics** | [**List&lt;WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentDayMetrics&gt;**](WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentDayMetrics) |  |  [optional] |
| **actuals** | [**List&lt;WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceActuals&gt;**](WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceActuals) |  |  [optional] |
| **scheduledActivities** | [**List&lt;WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceScheduledActivity&gt;**](WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceScheduledActivity) |  |  [optional] |
| **secondaryPresenceLookupItems** | [**List&lt;WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmSecondaryPresenceLookupItem&gt;**](WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmSecondaryPresenceLookupItem) |  |  [optional] |


## Enum: ImpactEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| POSITIVE | &quot;Positive&quot; | 
| NEGATIVE | &quot;Negative&quot; | 
| NEUTRAL | &quot;Neutral&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:241.0.0_
