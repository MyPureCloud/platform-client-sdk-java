---
title: WfmBuShortTermForecastUpdateCompleteTopicBuForecastModification
---
## WfmBuShortTermForecastUpdateCompleteTopicBuForecastModification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum)<!----> |  |  [optional] |
| **startIntervalIndex** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **endIntervalIndex** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **metric** | [**MetricEnum**](#MetricEnum)<!----> |  |  [optional] |
| **legacyMetric** | [**LegacyMetricEnum**](#LegacyMetricEnum)<!----> |  |  [optional] |
| **value** | <!----><!---->[**BigDecimal**](BigDecimal.html)<!----> |  |  [optional] |
| **values** | <!----><!---->[**List&lt;WfmBuShortTermForecastUpdateCompleteTopicModificationIntervalOffsetValue&gt;**](WfmBuShortTermForecastUpdateCompleteTopicModificationIntervalOffsetValue.html)<!----> |  |  [optional] |
| **enabled** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **granularity** | <!----><!---->**String**<!----> |  |  [optional] |
| **displayGranularity** | <!----><!---->**String**<!----> |  |  [optional] |
| **planningGroupIds** | <!----><!---->**List&lt;String&gt;**<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

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
{: class="table table-striped"}


<a name="MetricEnum"></a>

## Enum: MetricEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| OFFERED | &quot;Offered&quot; | 
| AVERAGEHANDLETIMESECONDS | &quot;AverageHandleTimeSeconds&quot; | 
{: class="table table-striped"}


<a name="LegacyMetricEnum"></a>

## Enum: LegacyMetricEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AVERAGEAFTERCALLWORKTIMESECONDS | &quot;AverageAfterCallWorkTimeSeconds&quot; | 
| AVERAGEHANDLETIMESECONDS | &quot;AverageHandleTimeSeconds&quot; | 
| AVERAGETALKTIMESECONDS | &quot;AverageTalkTimeSeconds&quot; | 
| OFFERED | &quot;Offered&quot; | 
{: class="table table-striped"}



