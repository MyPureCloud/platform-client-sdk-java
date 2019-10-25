---
title: WfmForecastModification
---
## WfmForecastModification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | The type of the modification |  |
| **startIntervalIndex** | <!----><!---->**Integer**<!----> | The number of 15 minute intervals past referenceStartDate representing the first interval to which to apply this modification. Must be null if values is populated |  [optional] |
| **endIntervalIndex** | <!----><!---->**Integer**<!----> | The number of 15 minute intervals past referenceStartDate representing the last interval to which to apply this modification.  Must be null if values is populated |  [optional] |
| **metric** | [**MetricEnum**](#MetricEnum)<!----> | The metric to which this modification applies |  |
| **value** | <!----><!---->**Double**<!----> | The value of the modification.  Must be null if \&quot;values\&quot; is populated |  [optional] |
| **values** | <!----><!---->[**List&lt;WfmForecastModificationIntervalOffsetValue&gt;**](WfmForecastModificationIntervalOffsetValue.html)<!----> | The list of values to update.  Only applicable for grid-type modifications. Must be null if \&quot;value\&quot; is populated |  [optional] |
| **enabled** | <!----><!---->**Boolean**<!----> | Whether the modification is enabled for the forecast |  |
| **attributes** | <!----><!---->[**WfmForecastModificationAttributes**](WfmForecastModificationAttributes.html)<!----> | The attributes defining how this modification applies to the forecast |  |
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
| AVERAGETALKTIMESECONDS | &quot;AverageTalkTimeSeconds&quot; |
| AVERAGEAFTERCALLWORKTIMESECONDS | &quot;AverageAfterCallWorkTimeSeconds&quot; |
| AVERAGEHANDLETIMESECONDS | &quot;AverageHandleTimeSeconds&quot; |
{: class="table table-striped"}



