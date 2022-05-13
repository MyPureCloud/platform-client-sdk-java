---
title: AnalyticsQueryAggregation
---
## AnalyticsQueryAggregation


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | Optional type, can usually be inferred |  [optional] |
| **dimension** | <!----><!---->**String**<!----> | For use with termFrequency aggregations |  [optional] |
| **metric** | <!----><!---->**String**<!----> | For use with numericRange aggregations |  [optional] |
| **size** | <!----><!---->**Integer**<!----> | For use with termFrequency aggregations |  [optional] |
| **ranges** | <!----><!---->[**List&lt;AggregationRange&gt;**](AggregationRange.html)<!----> | For use with numericRange aggregations |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| TERMFREQUENCY | &quot;termFrequency&quot; | 
| NUMERICRANGE | &quot;numericRange&quot; | 
{: class="table table-striped"}



