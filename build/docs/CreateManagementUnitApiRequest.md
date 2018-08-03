---
title: CreateManagementUnitApiRequest
---
## CreateManagementUnitApiRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | The name of the management unit |  |
| **timeZone** | **String** | The default time zone to use for this management unit |  |
| **startDayOfWeek** | [**StartDayOfWeekEnum**](#StartDayOfWeekEnum) | The configured first day of the week for scheduling and forecasting purposes |  |
| **settings** | [**CreateManagementUnitSettings**](CreateManagementUnitSettings.html) | The configuration for the management unit.  If omitted, reasonable defaults will be assigned |  [optional] |
| **divisionId** | **String** | The division to which this management unit belongs.  Defaults to home division ID |  [optional] |
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



