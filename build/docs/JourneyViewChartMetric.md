---
title: JourneyViewChartMetric
---
## JourneyViewChartMetric


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The unique identifier of the metric within the chart |  |
| **elementId** | <!----><!---->**String**<!----> | The element in the list of elements which the metric is measuring |  |
| **aggregate** | [**AggregateEnum**](#AggregateEnum)<!----> | How to aggregate the given element, defaults to EventCount |  [optional] |
{: class="table table-striped"}


<a name="AggregateEnum"></a>

## Enum: AggregateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EVENTCOUNT | &quot;EventCount&quot; | 
| CUSTOMERCOUNT | &quot;CustomerCount&quot; | 
{: class="table table-striped"}



