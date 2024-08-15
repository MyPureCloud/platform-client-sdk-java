# DocumentQueryClause


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **operator** | [**OperatorEnum**](#Enum--OperatorEnum) | Specifies how the predicates will be applied together. |  |
| **predicates** | [**List&lt;DocumentQueryPredicate&gt;**](DocumentQueryPredicate) | To apply multiple conditions. Limit of 10 predicates across all clauses. |  |
{: class="table table-striped"}


## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| OR | &quot;Or&quot; | 
| AND | &quot;And&quot; | 
{: class="table table-striped"}



