# BusinessUnitSettingsResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **startDayOfWeek** | [**StartDayOfWeekEnum**](#Enum--StartDayOfWeekEnum) | The start day of week for this business unit |  |
| **timeZone** | **String** | The time zone for this business unit, using the Olsen tz database format |  |
| **shortTermForecasting** | [**BuShortTermForecastingSettings**](BuShortTermForecastingSettings) | Short term forecasting settings |  [optional] |
| **scheduling** | [**BuSchedulingSettingsResponse**](BuSchedulingSettingsResponse) | Scheduling settings |  [optional] |
| **notifications** | [**BuNotificationSettingsResponse**](BuNotificationSettingsResponse) | Notification settings |  [optional] |
| **metadata** | [**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata) | Version metadata for this business unit |  |


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




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
