---
title: DataActionConditionPredicate
---
## DataActionConditionPredicate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **outputField** | <!----><!---->**String**<!----> | The name of an output field from the data action&#39;s output to use for this condition |  |
| **outputOperator** | [**OutputOperatorEnum**](#OutputOperatorEnum)<!----> | The operation with which to evaluate this condition |  |
| **comparisonValue** | <!----><!---->**String**<!----> | The value to compare against for this condition |  |
| **inverted** | <!----><!---->**Boolean**<!----> | If true, inverts the result of evaluating this Predicate. Default is false. |  |
| **outputFieldMissingResolution** | <!----><!---->**Boolean**<!----> | The result of this predicate if the requested output field is missing from the data action&#39;s result |  |
{: class="table table-striped"}


<a name="OutputOperatorEnum"></a>

## Enum: OutputOperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| EQUALS | &quot;EQUALS&quot; |
| LESS_THAN | &quot;LESS_THAN&quot; |
| LESS_THAN_EQUALS | &quot;LESS_THAN_EQUALS&quot; |
| GREATER_THAN | &quot;GREATER_THAN&quot; |
| GREATER_THAN_EQUALS | &quot;GREATER_THAN_EQUALS&quot; |
| CONTAINS | &quot;CONTAINS&quot; |
| BEGINS_WITH | &quot;BEGINS_WITH&quot; |
| ENDS_WITH | &quot;ENDS_WITH&quot; |
| BEFORE | &quot;BEFORE&quot; |
| AFTER | &quot;AFTER&quot; |
{: class="table table-striped"}



