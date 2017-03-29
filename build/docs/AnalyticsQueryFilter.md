---
title: AnalyticsQueryFilter
---

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum) | Boolean operation to apply to the provided predicates and clauses |  |
| **clauses** | [**List&lt;AnalyticsQueryClause&gt;**](AnalyticsQueryClause.html) | Boolean &#39;and/or&#39; logic with up to two-levels of nesting |  [optional] |
| **predicates** | [**List&lt;AnalyticsQueryPredicate&gt;**](AnalyticsQueryPredicate.html) | Like a three-word sentence: (attribute-name) (operator) (target-value). These can be one of three types: dimension, property, metric. |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| AND | &quot;and&quot; |
| OR | &quot;or&quot; |
{: class="table table-striped"}


