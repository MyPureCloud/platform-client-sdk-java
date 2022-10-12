---
title: DocumentQueryClause
---
## DocumentQueryClause


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **operator** | [**OperatorEnum**](#OperatorEnum)<!----> | Specifies how the predicates will be applied together. |  |
| **predicates** | <!----><!---->[**List&lt;DocumentQueryPredicate&gt;**](DocumentQueryPredicate.html)<!----> | To apply multiple conditions. Limit of 10 predicates across all clauses. |  |
{: class="table table-striped"}


<a name="OperatorEnum"></a>

## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| OR | &quot;Or&quot; | 
| AND | &quot;And&quot; | 
{: class="table table-striped"}



