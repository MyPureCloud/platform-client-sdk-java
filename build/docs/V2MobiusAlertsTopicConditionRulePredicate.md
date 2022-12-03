---
title: V2MobiusAlertsTopicConditionRulePredicate
---
## V2MobiusAlertsTopicConditionRulePredicate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **entity** | <!----><!---->[**V2MobiusAlertsTopicEntityProperties**](V2MobiusAlertsTopicEntityProperties.html)<!----> |  |  [optional] |
| **metric** | <!----><!---->**String**<!----> |  |  [optional] |
| **metricType** | [**MetricTypeEnum**](#MetricTypeEnum)<!----> |  |  [optional] |
| **metricValueType** | [**MetricValueTypeEnum**](#MetricValueTypeEnum)<!----> |  |  [optional] |
| **value** | <!----><!---->[**BigDecimal**](BigDecimal.html)<!----> |  |  [optional] |
| **comparisonOperator** | [**ComparisonOperatorEnum**](#ComparisonOperatorEnum)<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="MetricTypeEnum"></a>

## Enum: MetricTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INTERVAL | &quot;Interval&quot; | 
| INSTANCE | &quot;Instance&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
{: class="table table-striped"}


<a name="MetricValueTypeEnum"></a>

## Enum: MetricValueTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| COUNT | &quot;Count&quot; | 
| PERCENTAGE | &quot;Percentage&quot; | 
| AVERAGE | &quot;Average&quot; | 
| TIMER | &quot;Timer&quot; | 
| OBSERVATION | &quot;Observation&quot; | 
| MIN | &quot;Min&quot; | 
| MAX | &quot;Max&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
{: class="table table-striped"}


<a name="ComparisonOperatorEnum"></a>

## Enum: ComparisonOperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| GT | &quot;Gt&quot; | 
| GTE | &quot;Gte&quot; | 
| LT | &quot;Lt&quot; | 
| LTE | &quot;Lte&quot; | 
| EQ | &quot;Eq&quot; | 
| NE | &quot;Ne&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
{: class="table table-striped"}



