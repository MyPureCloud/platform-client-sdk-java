---
title: InsightsSummary
---
## InsightsSummary


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **entities** | <!----><!---->[**List&lt;InsightsSummaryUserItem&gt;**](InsightsSummaryUserItem.html)<!----> |  |  [optional] |
| **pageSize** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **pageNumber** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **total** | <!----><!---->**Long**<!----> |  |  [optional] |
| **performanceProfile** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.html)<!----> | The performance profile |  [optional] |
| **division** | <!----><!---->[**DivisionReference**](DivisionReference.html)<!----> | The division |  [optional] |
| **granularity** | [**GranularityEnum**](#GranularityEnum)<!----> | Granularity |  [optional] |
| **comparativePeriod** | <!----><!---->[**WorkdayPeriod**](WorkdayPeriod.html)<!----> | The comparative period work day date range |  [optional] |
| **primaryPeriod** | <!----><!---->[**WorkdayPeriod**](WorkdayPeriod.html)<!----> | The primary period work day date range |  [optional] |
| **pageCount** | <!----><!---->**Integer**<!----> |  |  [optional] |
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



