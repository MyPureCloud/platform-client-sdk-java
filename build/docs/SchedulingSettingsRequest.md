---
title: SchedulingSettingsRequest
---
## SchedulingSettingsRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **maxOccupancyPercentForDeferredWork** | <!----><!---->**Integer**<!----> | Max occupancy percent for deferred work |  [optional] |
| **defaultShrinkagePercent** | <!----><!---->**Double**<!----> | Default shrinkage percent for scheduling |  [optional] |
| **shrinkageOverrides** | <!----><!---->[**ShrinkageOverrides**](ShrinkageOverrides.html)<!----> | Shrinkage overrides for scheduling |  [optional] |
| **planningPeriod** | <!----><!---->[**ValueWrapperPlanningPeriodSettings**](ValueWrapperPlanningPeriodSettings.html)<!----> | Planning period settings for scheduling |  [optional] |
| **startDayOfWeekend** | [**StartDayOfWeekendEnum**](#StartDayOfWeekendEnum)<!----> | Start day of weekend for scheduling |  [optional] |
{: class="table table-striped"}


<a name="StartDayOfWeekendEnum"></a>

## Enum: StartDayOfWeekendEnum

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



