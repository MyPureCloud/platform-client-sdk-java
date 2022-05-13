---
title: QueueObservationQueryFilter
---
## QueueObservationQueryFilter


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | Boolean operation to apply to the provided predicates and clauses |  |
| **clauses** | <!----><!---->[**List&lt;QueueObservationQueryClause&gt;**](QueueObservationQueryClause.html)<!----> | Boolean 'and/or' logic with up to two-levels of nesting |  [optional] |
| **predicates** | <!----><!---->[**List&lt;QueueObservationQueryPredicate&gt;**](QueueObservationQueryPredicate.html)<!----> | Like a three-word sentence: (attribute-name) (operator) (target-value). |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AND | &quot;and&quot; | 
| OR | &quot;or&quot; | 
{: class="table table-striped"}



