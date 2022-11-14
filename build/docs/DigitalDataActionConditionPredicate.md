---
title: DigitalDataActionConditionPredicate
---
## DigitalDataActionConditionPredicate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **outputField** | <!----><!---->**String**<!----> | The name of an output field from the data action's output to use for this condition |  |
| **outputOperator** | [**OutputOperatorEnum**](#OutputOperatorEnum)<!----> | The operation with which to evaluate this condition |  |
| **comparisonValue** | <!----><!---->**String**<!----> | The value to compare against for this condition |  |
| **inverted** | <!----><!---->**Boolean**<!----> | If true, inverts the result of evaluating this Predicate. Default is false. |  |
| **outputFieldMissingResolution** | <!----><!---->**Boolean**<!----> | The result of this predicate if the requested output field is missing from the data action's result |  |
| **valueType** | [**ValueTypeEnum**](#ValueTypeEnum)<!----> | The data type the value should be treated as. |  |
{: class="table table-striped"}


<a name="OutputOperatorEnum"></a>

## Enum: OutputOperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EQUALS | &quot;Equals&quot; | 
| LESSTHAN | &quot;LessThan&quot; | 
| LESSTHANEQUALS | &quot;LessThanEquals&quot; | 
| GREATERTHAN | &quot;GreaterThan&quot; | 
| GREATERTHANEQUALS | &quot;GreaterThanEquals&quot; | 
| CONTAINS | &quot;Contains&quot; | 
| BEGINSWITH | &quot;BeginsWith&quot; | 
| ENDSWITH | &quot;EndsWith&quot; | 
| BEFORE | &quot;Before&quot; | 
| AFTER | &quot;After&quot; | 
{: class="table table-striped"}


<a name="ValueTypeEnum"></a>

## Enum: ValueTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DATETIME | &quot;DateTime&quot; | 
| NUMERIC | &quot;Numeric&quot; | 
| PERIOD | &quot;Period&quot; | 
| STRING | &quot;String&quot; | 
{: class="table table-striped"}



