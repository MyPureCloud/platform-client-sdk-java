---
title: BuForecastModificationResponse
---
## BuForecastModificationResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | The type of the modification |  |
| **startIntervalIndex** | <!----><!---->**Integer**<!----> | The number of intervals past referenceStartDate representing the first interval to which this modification applies |  [optional] |
| **endIntervalIndex** | <!----><!---->**Integer**<!----> | The number of intervals past referenceStartDate representing the last interval to which this modification applies |  [optional] |
| **metric** | [**MetricEnum**](#MetricEnum)<!----> | The metric to which this modification applies |  |
| **legacyMetric** | [**LegacyMetricEnum**](#LegacyMetricEnum)<!----> | The legacy metric to which this modification applies if applicable |  [optional] |
| **value** | <!----><!---->**Double**<!----> | The value of the modification |  [optional] |
| **values** | <!----><!---->[**List&lt;WfmForecastModificationIntervalOffsetValue&gt;**](WfmForecastModificationIntervalOffsetValue.html)<!----> | The list of modification values. Only applicable for grid-type modifications |  |
| **secondaryValues** | <!----><!---->[**List&lt;WfmForecastModificationIntervalOffsetValue&gt;**](WfmForecastModificationIntervalOffsetValue.html)<!----> | The list of modification secondary values. Only applicable for multi granularity modifications |  [optional] |
| **displayGranularity** | <!----><!---->**String**<!----> | The client side display granularity of the modification, expressed in the ISO-8601 duration format. Periods are represented as an ISO-8601 string. For example: P1D or P1DT12H |  |
| **granularity** | <!----><!---->**String**<!----> | The actual granularity of the modification as stored behind the scenes, expressed in the ISO-8601 duration format. Periods are represented as an ISO-8601 string. For example: P1D or P1DT12H |  |
| **secondaryGranularity** | <!----><!---->**String**<!----> | The granularity of the 'secondaryValues' modification as stored behind the scenes, expressed in the ISO-8601 duration format. Periods are represented as an ISO-8601 string. For example: P1D or P1DT12H |  [optional] |
| **enabled** | <!----><!---->**Boolean**<!----> | Whether the modification is enabled for the forecast |  |
| **planningGroupIds** | <!----><!---->**List&lt;String&gt;**<!----> | The IDs of the planning groups to which this forecast modification applies |  |
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
| SETMULTIGRANULARITYVALUESFORINTERVALSET | &quot;SetMultiGranularityValuesForIntervalSet&quot; | 
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



