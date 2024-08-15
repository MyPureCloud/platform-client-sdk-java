# WfmBuShortTermForecastCopyCompleteTopicBuForecastModification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) |  |  [optional] |
| **startIntervalIndex** | **Integer** |  |  [optional] |
| **endIntervalIndex** | **Integer** |  |  [optional] |
| **metric** | [**MetricEnum**](#Enum--MetricEnum) |  |  [optional] |
| **legacyMetric** | [**LegacyMetricEnum**](#Enum--LegacyMetricEnum) |  |  [optional] |
| **value** | [**BigDecimal**](BigDecimal) |  |  [optional] |
| **values** | [**List&lt;WfmBuShortTermForecastCopyCompleteTopicModificationIntervalOffsetValue&gt;**](WfmBuShortTermForecastCopyCompleteTopicModificationIntervalOffsetValue) |  |  [optional] |
| **secondaryValues** | [**List&lt;WfmBuShortTermForecastCopyCompleteTopicModificationIntervalOffsetValue&gt;**](WfmBuShortTermForecastCopyCompleteTopicModificationIntervalOffsetValue) |  |  [optional] |
| **enabled** | **Boolean** |  |  [optional] |
| **granularity** | **String** |  |  [optional] |
| **secondaryGranularity** | **String** |  |  [optional] |
| **displayGranularity** | **String** |  |  [optional] |
| **planningGroupIds** | **List&lt;String&gt;** |  |  [optional] |
{: class="table table-striped"}


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
{: class="table table-striped"}


## Enum: MetricEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| OFFERED | &quot;Offered&quot; | 
| AVERAGEHANDLETIMESECONDS | &quot;AverageHandleTimeSeconds&quot; | 
{: class="table table-striped"}


## Enum: LegacyMetricEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AVERAGEAFTERCALLWORKTIMESECONDS | &quot;AverageAfterCallWorkTimeSeconds&quot; | 
| AVERAGEHANDLETIMESECONDS | &quot;AverageHandleTimeSeconds&quot; | 
| AVERAGETALKTIMESECONDS | &quot;AverageTalkTimeSeconds&quot; | 
| OFFERED | &quot;Offered&quot; | 
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:207.0.0_
