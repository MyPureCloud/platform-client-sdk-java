---
title: CreateBusinessUnitSettings
---
## CreateBusinessUnitSettings


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **startDayOfWeek** | [**StartDayOfWeekEnum**](#StartDayOfWeekEnum)<!----> | The start day of week for this business unit |  |
| **timeZone** | <!----><!---->**String**<!----> | The time zone for this business unit, using the Olsen tz database format |  |
| **shortTermForecasting** | <!----><!---->[**BuShortTermForecastingSettings**](BuShortTermForecastingSettings.html)<!----> | Short term forecasting settings |  [optional] |
| **scheduling** | <!----><!---->[**BuSchedulingSettings**](BuSchedulingSettings.html)<!----> | Scheduling settings |  [optional] |
{: class="table table-striped"}


<a name="StartDayOfWeekEnum"></a>

## Enum: StartDayOfWeekEnum

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
{: class="table table-striped"}



