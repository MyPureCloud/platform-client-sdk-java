# WorkdayValuesMetricItem


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **metric** | [**AddressableEntityRef**](AddressableEntityRef) | Gamification metric for the average and the trend |  [optional] |
| **metricDefinition** | [**DomainEntityRef**](DomainEntityRef) | Gamification metric definition for the average and the trend |  [optional] |
| **average** | **Double** | The average value of the metric |  [optional] |
| **unitType** | [**UnitTypeEnum**](#Enum--UnitTypeEnum) | The unit type of the metric value |  [optional] |
| **trend** | [**List&lt;WorkdayValuesTrendItem&gt;**](WorkdayValuesTrendItem) | The metric value trend |  [optional] |


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




_com.mypurecloud.sdk.v2:platform-client-v2:209.0.1_
