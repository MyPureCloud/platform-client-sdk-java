# WfmBuShortTermForecastGenerateProgressTopicBuForecastModification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) |  |  [optional] |
| **startIntervalIndex** | **Long** |  |  [optional] |
| **endIntervalIndex** | **Long** |  |  [optional] |
| **metric** | [**MetricEnum**](#Enum--MetricEnum) |  |  [optional] |
| **legacyMetric** | [**LegacyMetricEnum**](#Enum--LegacyMetricEnum) |  |  [optional] |
| **value** | [**BigDecimal**](BigDecimal) |  |  [optional] |
| **values** | [**List&lt;WfmBuShortTermForecastGenerateProgressTopicModificationIntervalOffsetValue&gt;**](WfmBuShortTermForecastGenerateProgressTopicModificationIntervalOffsetValue) |  |  [optional] |
| **secondaryValues** | [**List&lt;WfmBuShortTermForecastGenerateProgressTopicModificationIntervalOffsetValue&gt;**](WfmBuShortTermForecastGenerateProgressTopicModificationIntervalOffsetValue) |  |  [optional] |
| **enabled** | **Boolean** |  |  [optional] |
| **granularity** | **String** |  |  [optional] |
| **secondaryGranularity** | **String** |  |  [optional] |
| **displayGranularity** | **String** |  |  [optional] |
| **planningGroupIds** | **List&lt;String&gt;** |  |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| MINIMUMPERINTERVAL | &quot;MinimumPerInterval&quot; | 
| MAXIMUMPERINTERVAL | &quot;MaximumPerInterval&quot; | 
| SETVALUEPERINTERVAL | &quot;SetValuePerInterval&quot; | 
| CHANGEVALUEPERINTERVAL | &quot;ChangeValuePerInterval&quot; | 
| CHANGEPERCENTPERINTERVAL | &quot;ChangePercentPerInterval&quot; | 
| SETVALUEOVERRANGE | &quot;SetValueOverRange&quot; | 
| CHANGEVALUEOVERRANGE | &quot;ChangeValueOverRange&quot; | 
| SETVALUESFORINTERVALSET | &quot;SetValuesForIntervalSet&quot; | 
| SETMULTIGRANULARITYVALUESFORINTERVALSET | &quot;SetMultiGranularityValuesForIntervalSet&quot; | 


## Enum: MetricEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| OFFERED | &quot;Offered&quot; | 
| AVERAGEHANDLETIMESECONDS | &quot;AverageHandleTimeSeconds&quot; | 


## Enum: LegacyMetricEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AVERAGEAFTERCALLWORKTIMESECONDS | &quot;AverageAfterCallWorkTimeSeconds&quot; | 
| AVERAGEHANDLETIMESECONDS | &quot;AverageHandleTimeSeconds&quot; | 
| AVERAGETALKTIMESECONDS | &quot;AverageTalkTimeSeconds&quot; | 
| OFFERED | &quot;Offered&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:240.0.0_
