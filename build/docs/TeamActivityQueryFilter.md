# TeamActivityQueryFilter


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | Boolean operation to apply to the provided predicates and clauses |  |
| **clauses** | [**List&lt;TeamActivityQueryClause&gt;**](TeamActivityQueryClause) | Boolean 'and/or' logic with up to two-levels of nesting |  [optional] |
| **predicates** | [**List&lt;TeamActivityQueryPredicate&gt;**](TeamActivityQueryPredicate) | Like a three-word sentence: (attribute-name) (operator) (target-value). |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AND | &quot;and&quot; | 
| OR | &quot;or&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
