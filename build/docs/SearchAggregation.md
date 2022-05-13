---
title: SearchAggregation
---
## SearchAggregation


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **field** | <!----><!---->**String**<!----> | The field used for aggregation |  [optional] |
| **name** | <!----><!---->**String**<!----> | The name of the aggregation. The response aggregation uses this name. |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | The type of aggregation to perform |  [optional] |
| **value** | <!----><!---->**String**<!----> | A value to use for aggregation |  [optional] |
| **size** | <!----><!---->**Integer**<!----> | The number aggregations results to return out of the entire result set |  [optional] |
| **order** | <!---->[**List&lt;OrderEnum&gt;**](#OrderEnum)<!----> | The order in which aggregation results are sorted |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| COUNT | &quot;COUNT&quot; | 
| SUM | &quot;SUM&quot; | 
| AVERAGE | &quot;AVERAGE&quot; | 
| TERM | &quot;TERM&quot; | 
| CONTAINS | &quot;CONTAINS&quot; | 
| STARTS_WITH | &quot;STARTS_WITH&quot; | 
| ENDS_WITH | &quot;ENDS_WITH&quot; | 
{: class="table table-striped"}


<a name="OrderEnum"></a>

## Enum: OrderEnum

| Name | Value |
| ---- | ----- |
| VALUE_DESC | &quot;VALUE_DESC&quot; |
| VALUE_ASC | &quot;VALUE_ASC&quot; |
| COUNT_DESC | &quot;COUNT_DESC&quot; |
| COUNT_ASC | &quot;COUNT_ASC&quot; |
{: class="table table-striped"}



