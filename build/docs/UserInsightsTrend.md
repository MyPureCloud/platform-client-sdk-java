---
title: UserInsightsTrend
---
## UserInsightsTrend


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **performanceProfile** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.html)<!----> | The performance profile |  [optional] |
| **division** | <!----><!---->[**DivisionReference**](DivisionReference.html)<!----> | The division |  [optional] |
| **granularity** | [**GranularityEnum**](#GranularityEnum)<!----> | Granularity |  [optional] |
| **comparativePeriod** | <!----><!---->[**WorkdayPeriod**](WorkdayPeriod.html)<!----> | The comparative period work day date range |  [optional] |
| **primaryPeriod** | <!----><!---->[**WorkdayPeriod**](WorkdayPeriod.html)<!----> | The primary period work day date range |  [optional] |
| **user** | <!----><!---->[**UserReference**](UserReference.html)<!----> | The query user |  [optional] |
| **entities** | <!----><!---->[**List&lt;UserInsightsTrendMetricItem&gt;**](UserInsightsTrendMetricItem.html)<!----> | The list of insights trend for each metric |  [optional] |
| **total** | <!----><!---->[**UserInsightsTrendTotalItem**](UserInsightsTrendTotalItem.html)<!----> | The insights trend in total |  [optional] |
{: class="table table-striped"}


<a name="GranularityEnum"></a>

## Enum: GranularityEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DAILY | &quot;Daily&quot; | 
| WEEKLY | &quot;Weekly&quot; | 
| MONTHLY | &quot;Monthly&quot; | 
{: class="table table-striped"}



