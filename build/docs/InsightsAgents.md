---
title: InsightsAgents
---
## InsightsAgents


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **performanceProfile** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.html)<!----> | The performance profile |  [optional] |
| **division** | <!----><!---->[**DivisionReference**](DivisionReference.html)<!----> | The division |  [optional] |
| **granularity** | [**GranularityEnum**](#GranularityEnum)<!----> | Granularity |  [optional] |
| **dateStartWorkday** | <!----><!---->[**LocalDate**](LocalDate.html)<!----> | Start workday used as the date range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **dateEndWorkday** | <!----><!---->[**LocalDate**](LocalDate.html)<!----> | End workday used as the date range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **entities** | <!----><!---->[**List&lt;InsightsAgentItem&gt;**](InsightsAgentItem.html)<!----> | The list of insights agents |  [optional] |
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



