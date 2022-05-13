---
title: TimeOffLimitValueRange
---
## TimeOffLimitValueRange


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **timeOffLimit** | <!----><!---->[**TimeOffLimitReference**](TimeOffLimitReference.html)<!----> | The ID of the time off limit |  [optional] |
| **startDate** | <!----><!---->[**LocalDate**](LocalDate.html)<!----> | Start date of the requested date range, in ISO-8601 format. The end date is determined by the size of interval lists |  |
| **granularity** | [**GranularityEnum**](#GranularityEnum)<!----> | Granularity choice for time off limit |  |
| **limitMinutesPerInterval** | <!----><!---->**List&lt;Integer&gt;**<!----> | A list of time off limit values in minutes per granularity interval |  [optional] |
| **allocatedMinutesPerInterval** | <!----><!---->**List&lt;Integer&gt;**<!----> | A list of allocated time off minutes per granularity interval |  [optional] |
| **waitlistedMinutesPerInterval** | <!----><!---->**List&lt;Integer&gt;**<!----> | A list of waitlisted time off minutes per granularity interval |  [optional] |
| **waitlistedRequestsPerInterval** | <!----><!---->**List&lt;Integer&gt;**<!----> | The current number of waitlisted time off requests for every interval per granularity |  [optional] |
| **metadata** | <!----><!---->[**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata.html)<!----> | Version metadata for the time off limit |  [optional] |
{: class="table table-striped"}


<a name="GranularityEnum"></a>

## Enum: GranularityEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DAILY | &quot;Daily&quot; | 
{: class="table table-striped"}



