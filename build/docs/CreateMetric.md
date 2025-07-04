# CreateMetric


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **metricDefinitionId** | **String** | The id of associated metric definition |  [optional] |
| **externalMetricDefinitionId** | **String** | The id of associated external metric definition |  [optional] |
| **objective** | [**CreateObjective**](CreateObjective) | Associated objective for this metric |  [optional] |
| **performanceProfileId** | **String** | Performance profile id of this metric |  [optional] |
| **name** | **String** | The name of this metric |  |
| **precision** | **Integer** | The precision of the metric, must be between 0 and 5 |  [optional] |
| **timeDisplayUnit** | [**TimeDisplayUnitEnum**](#Enum--TimeDisplayUnitEnum) | The time unit in which the metric should be displayed -- this parameter is ignored when displaying non-time values |  [optional] |


## Enum: TimeDisplayUnitEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NONE | &quot;None&quot; | 
| SECONDS | &quot;Seconds&quot; | 
| MINUTES | &quot;Minutes&quot; | 
| HOURS | &quot;Hours&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
