# SchedulingSettingsRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **maxOccupancyPercentForDeferredWork** | **Integer** | Max occupancy percent for deferred work |  [optional] |
| **defaultShrinkagePercent** | **Double** | Default shrinkage percent for scheduling |  [optional] |
| **shrinkageOverrides** | [**ShrinkageOverrides**](ShrinkageOverrides) | Shrinkage overrides for scheduling |  [optional] |
| **planningPeriod** | [**ValueWrapperPlanningPeriodSettings**](ValueWrapperPlanningPeriodSettings) | Planning period settings for scheduling. Only one of planningPeriod or monthlyPlanningPeriod may be defined |  [optional] |
| **monthlyPlanningPeriod** | [**ValueWrapperMonthlyPlanningPeriodSettings**](ValueWrapperMonthlyPlanningPeriodSettings) | Monthly planning period setting for scheduling. Only one of planningPeriod or monthlyPlanningPeriod may be defined |  [optional] |
| **startDayOfWeekend** | [**StartDayOfWeekendEnum**](#Enum--StartDayOfWeekendEnum) | Start day of weekend for scheduling |  [optional] |


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




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
