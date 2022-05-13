---
title: AggregationResult
---
## AggregationResult


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum)<!----> |  |  [optional] |
| **dimension** | <!----><!---->**String**<!----> | For termFrequency aggregations |  [optional] |
| **metric** | <!----><!---->**String**<!----> | For numericRange aggregations |  [optional] |
| **count** | <!----><!---->**Long**<!----> |  |  [optional] |
| **results** | <!----><!---->[**List&lt;AggregationResultEntry&gt;**](AggregationResultEntry.html)<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| TERMFREQUENCY | &quot;termFrequency&quot; | 
| NUMERICRANGE | &quot;numericRange&quot; | 
{: class="table table-striped"}



