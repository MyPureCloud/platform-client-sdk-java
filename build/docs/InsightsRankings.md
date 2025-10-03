# InsightsRankings


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **performanceProfile** | [**AddressableEntityRef**](AddressableEntityRef) | The performance profile |  [optional] |
| **division** | [**DivisionReference**](DivisionReference) | The division |  [optional] |
| **granularity** | [**GranularityEnum**](#Enum--GranularityEnum) | Granularity |  [optional] |
| **comparativePeriod** | [**WorkdayPeriod**](WorkdayPeriod) | The comparative period work day date range |  [optional] |
| **primaryPeriod** | [**WorkdayPeriod**](WorkdayPeriod) | The primary period work day date range |  [optional] |
| **leaders** | [**List&lt;InsightsSummaryUserItem&gt;**](InsightsSummaryUserItem) | The leaders users |  [optional] |
| **trailers** | [**List&lt;InsightsSummaryUserItem&gt;**](InsightsSummaryUserItem) | The trailing users |  [optional] |


## Enum: GranularityEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DAILY | &quot;Daily&quot; | 
| WEEKLY | &quot;Weekly&quot; | 
| MONTHLY | &quot;Monthly&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:234.0.0_
