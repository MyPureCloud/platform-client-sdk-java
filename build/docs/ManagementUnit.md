---
title: ManagementUnit
---
## ManagementUnit


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **businessUnit** | <!----><!---->[**BusinessUnitReference**](BusinessUnitReference.html)<!----> | The business unit to which this management unit belongs |  [optional] |
| **startDayOfWeek** | [**StartDayOfWeekEnum**](#StartDayOfWeekEnum)<!----> | Start day of week for scheduling and forecasting purposes. Moving to Business Unit |  [optional] |
| **timeZone** | <!----><!---->**String**<!----> | The time zone for the management unit in standard Olson format.  Moving to Business Unit |  [optional] |
| **settings** | <!----><!---->[**ManagementUnitSettingsResponse**](ManagementUnitSettingsResponse.html)<!----> | The configuration settings for this management unit |  [optional] |
| **metadata** | <!----><!---->[**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata.html)<!----> | Version info metadata for this management unit. Deprecated, use settings.metadata |  [optional] |
| **division** | <!----><!---->[**DivisionReference**](DivisionReference.html)<!----> | The division to which this entity belongs. |  [optional] |
| **version** | <!----><!---->**Integer**<!----> | The version of the underlying entity.  Deprecated, use field from settings.metadata instead |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | The date and time at which this entity was last modified.  Deprecated, use field from settings.metadata instead. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **modifiedBy** | <!----><!---->[**UserReference**](UserReference.html)<!----> | The user who last modified this entity.  Deprecated, use field from settings.metadata instead |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
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



