---
title: DialerRulesetConfigChangeDataActionConditionPredicate
---
## DialerRulesetConfigChangeDataActionConditionPredicate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **outputField** | **String** |  |  [optional] |
| **outputOperator** | [**OutputOperatorEnum**](#OutputOperatorEnum) |  |  [optional] |
| **comparisonValue** | **String** |  |  [optional] |
| **outputFieldMissingResolution** | **Boolean** |  |  [optional] |
| **inverted** | **Boolean** |  |  [optional] |
| **additionalProperties** | **Object** |  |  [optional] |
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



