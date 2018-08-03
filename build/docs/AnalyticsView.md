---
title: AnalyticsView
---
## AnalyticsView


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **target** | **String** | CallTarget metric name |  |
| **name** | **String** | A unique name for this view. Must be distinct from other views and built-in metric names. |  |
| **function** | [**FunctionEnum**](#FunctionEnum) | Type of view you wish to create |  |
| **range** | [**AggregationRange**](AggregationRange.html) | Range of numbers for slicing up data |  [optional] |
{: class="table table-striped"}


<a name="FunctionEnum"></a>

## Enum: FunctionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| RANGEBOUND | &quot;rangeBound&quot; |
{: class="table table-striped"}



