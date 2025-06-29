# InsightsDetails


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **performanceProfile** | [**AddressableEntityRef**](AddressableEntityRef) | The performance profile |  [optional] |
| **division** | [**DivisionReference**](DivisionReference) | The division |  [optional] |
| **granularity** | [**GranularityEnum**](#Enum--GranularityEnum) | Granularity |  [optional] |
| **comparativePeriod** | [**WorkdayPeriod**](WorkdayPeriod) | The comparative period work day date range |  [optional] |
| **primaryPeriod** | [**WorkdayPeriod**](WorkdayPeriod) | The primary period work day date range |  [optional] |
| **user** | [**UserReference**](UserReference) | The query user |  [optional] |
| **metricData** | [**List&lt;InsightsDetailsMetricItem&gt;**](InsightsDetailsMetricItem) | The list of insights data for each metric of the user |  [optional] |
| **overallData** | [**InsightsDetailsOverallItem**](InsightsDetailsOverallItem) | Overall insights data of the user |  [optional] |


## Enum: GranularityEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DAILY | &quot;Daily&quot; | 
| WEEKLY | &quot;Weekly&quot; | 
| MONTHLY | &quot;Monthly&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
