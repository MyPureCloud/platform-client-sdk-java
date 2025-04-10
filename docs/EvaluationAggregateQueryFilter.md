# EvaluationAggregateQueryFilter


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | Boolean operation to apply to the provided predicates and clauses |  |
| **clauses** | [**List&lt;EvaluationAggregateQueryClause&gt;**](EvaluationAggregateQueryClause) | Boolean 'and/or' logic with up to two-levels of nesting |  [optional] |
| **predicates** | [**List&lt;EvaluationAggregateQueryPredicate&gt;**](EvaluationAggregateQueryPredicate) | Like a three-word sentence: (attribute-name) (operator) (target-value). |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AND | &quot;and&quot; | 
| OR | &quot;or&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:223.0.0_
