---
title: ForecastSourceDayPointer
---
## ForecastSourceDayPointer


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **dayOfWeek** | [**DayOfWeekEnum**](#DayOfWeekEnum)<!----> | The forecast day of week for this source data |  [optional] |
| **weight** | <!----><!---->**Integer**<!----> | The relative weight to apply to this source data item for weighted averages |  [optional] |
| **date** | <!----><!---->**String**<!----> | The date this source data represents, in yyyy-MM-dd format |  [optional] |
| **fileName** | <!----><!---->**String**<!----> | The name of the source file this data came from if it originated from a data import |  [optional] |
| **dataKey** | <!----><!---->**String**<!----> | The key to look up the forecast source data for this source day |  [optional] |
{: class="table table-striped"}


<a name="DayOfWeekEnum"></a>

## Enum: DayOfWeekEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SUNDAY | &quot;Sunday&quot; | 
| MONDAY | &quot;Monday&quot; | 
| TUESDAY | &quot;Tuesday&quot; | 
| WEDNESDAY | &quot;Wednesday&quot; | 
| THURSDAY | &quot;Thursday&quot; | 
| FRIDAY | &quot;Friday&quot; | 
| SATURDAY | &quot;Saturday&quot; | 
| EIGHTHDAY | &quot;EighthDay&quot; | 
{: class="table table-striped"}



