---
title: AnalyticsQueryClause
---
## AnalyticsQueryClause


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum) | Boolean operation to apply to the provided predicates |  |
| **predicates** | [**List&lt;AnalyticsQueryPredicate&gt;**](AnalyticsQueryPredicate.html) | Like a three-word sentence: (attribute-name) (operator) (target-value). These can be one of three types: dimension, property, metric. |  |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| AND | &quot;and&quot; |
| OR | &quot;or&quot; |
{: class="table table-striped"}



