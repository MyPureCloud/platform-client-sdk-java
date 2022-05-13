---
title: WfmIntradayPlanningGroupListing
---
## WfmIntradayPlanningGroupListing


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **entities** | <!----><!---->[**List&lt;ForecastPlanningGroupResponse&gt;**](ForecastPlanningGroupResponse.html)<!----> |  |  [optional] |
| **noDataReason** | [**NoDataReasonEnum**](#NoDataReasonEnum)<!----> | The reason there was no data for the request |  [optional] |
{: class="table table-striped"}


<a name="NoDataReasonEnum"></a>

## Enum: NoDataReasonEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NOPUBLISHEDSCHEDULE | &quot;NoPublishedSchedule&quot; | 
| NOSOURCEFORECAST | &quot;NoSourceForecast&quot; | 
{: class="table table-striped"}



