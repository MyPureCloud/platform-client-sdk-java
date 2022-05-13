---
title: Metrics
---
## Metrics


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **order** | <!----><!---->**Integer**<!----> | The order of metric within a performance profile |  [optional] |
| **metricDefinitionName** | <!----><!---->**String**<!----> | The name of associated metric definition |  [optional] |
| **metricDefinitionId** | <!----><!---->**String**<!----> | The id of associated metric definition |  [optional] |
| **externalMetricDefinitionId** | <!----><!---->**String**<!----> | The id of associated external metric definition |  [optional] |
| **unitType** | [**UnitTypeEnum**](#UnitTypeEnum)<!----> | Corresponding unit type for this metric |  [optional] |
| **enabled** | <!----><!---->**Boolean**<!----> | A flag for whether this metric is enabled for a performance profile |  [optional] |
| **templateName** | <!----><!---->**String**<!----> | The name of associated objective template |  [optional] |
| **maxPoints** | <!----><!---->**Integer**<!----> | Achievable maximum points for this metric |  [optional] |
| **performanceProfileId** | <!----><!---->**String**<!----> | Performance profile id of this metric |  [optional] |
| **linkedMetric** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.html)<!----> | The linked metric entity reference |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | The created date of this metric. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateUnlinked** | <!----><!---->[**LocalDate**](LocalDate.html)<!----> | The unlinked workday for this metric if this metric was ever unlinked. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **sourcePerformanceProfile** | <!----><!---->[**PerformanceProfile**](PerformanceProfile.html)<!----> | The source performance profile when this metric is linked |  [optional] |
| **unitDefinition** | <!----><!---->**String**<!----> | Unit definition of linked external metric |  [optional] |
| **precision** | <!----><!---->**Integer**<!----> | Precision of linked external metric |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="UnitTypeEnum"></a>

## Enum: UnitTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NONE | &quot;None&quot; | 
| PERCENT | &quot;Percent&quot; | 
| CURRENCY | &quot;Currency&quot; | 
| SECONDS | &quot;Seconds&quot; | 
| NUMBER | &quot;Number&quot; | 
| ATTENDANCESTATUS | &quot;AttendanceStatus&quot; | 
| UNIT | &quot;Unit&quot; | 
{: class="table table-striped"}



