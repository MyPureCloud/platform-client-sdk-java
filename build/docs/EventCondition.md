---
title: EventCondition
---
## EventCondition


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **key** | **String** | The event key. |  |
| **values** | **List&lt;String&gt;** | The event values. |  |
| **operator** | [**OperatorEnum**](#OperatorEnum) | The comparison operator. |  [optional] |
{: class="table table-striped"}


<a name="OperatorEnum"></a>

## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| EQUAL | &quot;equal&quot; |
| NOTEQUAL | &quot;notEqual&quot; |
| LIKE | &quot;like&quot; |
| NOTLIKE | &quot;notLike&quot; |
| GREATERTHAN | &quot;greaterThan&quot; |
| GREATERTHANOREQUAL | &quot;greaterThanOrEqual&quot; |
| LESSTHAN | &quot;lessThan&quot; |
| LESSTHANOREQUAL | &quot;lessThanOrEqual&quot; |
{: class="table table-striped"}



