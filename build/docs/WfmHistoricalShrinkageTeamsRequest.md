---
title: WfmHistoricalShrinkageTeamsRequest
---
## WfmHistoricalShrinkageTeamsRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **startDate** | <!----><!---->[**Date**](Date.html)<!----> | Beginning of the date range to query in ISO-8601 format |  |
| **endDate** | <!----><!---->[**Date**](Date.html)<!----> | End of the date range to query in ISO-8601 format. If it is not set, end date will be set to current time |  [optional] |
| **timeZone** | <!----><!---->**String**<!----> | The time zone, in olson format, to use in defining days when computing shrinkage for requested granularity. The results will be returned as UTC timestamps regardless of the time zone input. |  |
| **granularity** | [**GranularityEnum**](#GranularityEnum)<!----> | Shrinkage aggregation interval granularity |  [optional] |
{: class="table table-striped"}


<a name="GranularityEnum"></a>

## Enum: GranularityEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DAILY | &quot;Daily&quot; | 
| WEEKLY | &quot;Weekly&quot; | 
{: class="table table-striped"}



