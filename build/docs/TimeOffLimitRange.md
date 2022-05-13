---
title: TimeOffLimitRange
---
## TimeOffLimitRange


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **startDate** | <!----><!---->[**LocalDate**](LocalDate.html)<!----> | Start date of the range. The end date is determined by 'granularity' and the size of 'limitMinutesPerInterval'. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  |
| **granularity** | [**GranularityEnum**](#GranularityEnum)<!----> | Granularity choice for the time off limit |  |
| **limitMinutesPerInterval** | <!----><!---->**List&lt;Integer&gt;**<!----> | The list of time off limit values in minutes per granularity interval. If 'null' is specified, then interval specific value is cleared. Such interval will have 'defaultLimitMinutes' value |  |
{: class="table table-striped"}


<a name="GranularityEnum"></a>

## Enum: GranularityEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DAILY | &quot;Daily&quot; | 
{: class="table table-striped"}



