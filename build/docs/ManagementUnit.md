---
title: ManagementUnit
---
## ManagementUnit


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **startDayOfWeek** | [**StartDayOfWeekEnum**](#StartDayOfWeekEnum) | Start day of week for scheduling and forecasting purposes |  [optional] |
| **timeZone** | **String** | The time zone for the management unit in standard Olson Format (See https://en.wikipedia.org/wiki/Tz_database) |  [optional] |
| **settings** | [**ManagementUnitSettings**](ManagementUnitSettings.html) | The configuration settings for this management unit |  [optional] |
| **version** | **Integer** | The version of the underlying entity |  |
| **dateModified** | [**Date**](Date.html) | The date and time at which this entity was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **modifiedBy** | [**User**](User.html) | The user who last modified this entity |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
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


