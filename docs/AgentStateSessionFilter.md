# AgentStateSessionFilter


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | Boolean operation to apply to the provided predicates and clauses |  |
| **clauses** | [**List&lt;AgentStateSessionQueryClause&gt;**](AgentStateSessionQueryClause) | Boolean 'and/or' logic with up to two-levels of nesting |  [optional] |
| **predicates** | [**List&lt;AgentStateSessionQueryPredicate&gt;**](AgentStateSessionQueryPredicate) | Describes a <dimension> = <value> filter used to perform matching |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AND | &quot;and&quot; | 
| OR | &quot;or&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:233.0.0_
