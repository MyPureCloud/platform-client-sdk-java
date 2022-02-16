---
title: WorkdayValuesMetricItem
---
## WorkdayValuesMetricItem


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **metric** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.html)<!----> | Gamification metric for the average and the trend |  [optional] |
| **metricDefinition** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | Gamification metric definition for the average and the trend |  [optional] |
| **average** | <!----><!---->**Double**<!----> | The average value of the metric |  [optional] |
| **unitType** | [**UnitTypeEnum**](#UnitTypeEnum)<!----> | The unit type of the metric value |  [optional] |
| **trend** | <!----><!---->[**List&lt;WorkdayValuesTrendItem&gt;**](WorkdayValuesTrendItem.html)<!----> | The metric value trend |  [optional] |
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



