---
title: ManagementUnit
---
## ManagementUnit


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **startDayOfWeek** | [**StartDayOfWeekEnum**](#StartDayOfWeekEnum) | Start day of week for workforce management planning purposes |  [optional] |
| **timezone** | **String** | The time zone for the management unit in standard Olson Format (See https://en.wikipedia.org/wiki/Tz_database) |  [optional] |
| **version** | **Integer** | The version of the underlying ManagementUnit object. Useful for handling eventual consistency issues.  User must submit the current version they of the ManagementUnit in any write requests |  |
| **dateModified** | [**Date**](Date.html) | The date and time at which this management unit was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="StartDayOfWeekEnum"></a>

## Enum: StartDayOfWeekEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| MONDAY | &quot;Monday&quot; |
| TUESDAY | &quot;Tuesday&quot; |
| WEDNESDAY | &quot;Wednesday&quot; |
| THURSDAY | &quot;Thursday&quot; |
| FRIDAY | &quot;Friday&quot; |
| SATURDAY | &quot;Saturday&quot; |
| SUNDAY | &quot;Sunday&quot; |
{: class="table table-striped"}


