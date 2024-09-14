# Metrics


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **order** | **Integer** | The order of metric within a performance profile |  [optional] |
| **metricDefinitionName** | **String** | The name of associated metric definition |  [optional] |
| **metricDefinitionId** | **String** | The id of associated metric definition |  [optional] |
| **externalMetricDefinitionId** | **String** | The id of associated external metric definition |  [optional] |
| **unitType** | [**UnitTypeEnum**](#Enum--UnitTypeEnum) | Corresponding unit type for this metric |  [optional] |
| **enabled** | **Boolean** | A flag for whether this metric is enabled for a performance profile |  [optional] |
| **templateName** | **String** | The name of associated objective template |  [optional] |
| **maxPoints** | **Integer** | Achievable maximum points for this metric |  [optional] |
| **performanceProfileId** | **String** | Performance profile id of this metric |  [optional] |
| **linkedMetric** | [**AddressableEntityRef**](AddressableEntityRef) | The linked metric entity reference |  [optional] |
| **dateCreated** | [**Date**](Date) | The created date of this metric. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateUnlinked** | [**LocalDate**](LocalDate) | The unlinked workday for this metric if this metric was ever unlinked. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **sourcePerformanceProfile** | [**PerformanceProfile**](PerformanceProfile) | The source performance profile when this metric is linked |  [optional] |
| **unitDefinition** | **String** | Unit definition of linked external metric |  [optional] |
| **precision** | **Integer** | Precision of linked external metric |  [optional] |
| **timeDisplayUnit** | [**TimeDisplayUnitEnum**](#Enum--TimeDisplayUnitEnum) | The time unit in which the metric should be displayed -- this parameter is ignored when displaying non-time values |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


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


## Enum: TimeDisplayUnitEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NONE | &quot;None&quot; | 
| SECONDS | &quot;Seconds&quot; | 
| MINUTES | &quot;Minutes&quot; | 
| HOURS | &quot;Hours&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:209.1.0_
