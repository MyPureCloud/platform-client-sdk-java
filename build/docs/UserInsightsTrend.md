# UserInsightsTrend


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **performanceProfile** | [**AddressableEntityRef**](AddressableEntityRef) | The performance profile |  [optional] |
| **division** | [**DivisionReference**](DivisionReference) | The division |  [optional] |
| **granularity** | [**GranularityEnum**](#Enum--GranularityEnum) | Granularity |  [optional] |
| **comparativePeriod** | [**WorkdayPeriod**](WorkdayPeriod) | The comparative period work day date range |  [optional] |
| **primaryPeriod** | [**WorkdayPeriod**](WorkdayPeriod) | The primary period work day date range |  [optional] |
| **user** | [**UserReference**](UserReference) | The query user |  [optional] |
| **entities** | [**List&lt;UserInsightsTrendMetricItem&gt;**](UserInsightsTrendMetricItem) | The list of insights trend for each metric |  [optional] |
| **total** | [**UserInsightsTrendTotalItem**](UserInsightsTrendTotalItem) | The insights trend in total |  [optional] |


## Enum: GranularityEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DAILY | &quot;Daily&quot; | 
| WEEKLY | &quot;Weekly&quot; | 
| MONTHLY | &quot;Monthly&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:225.0.0_
