---
title: DocumentQuery
---
## DocumentQuery


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **clauses** | <!----><!---->[**List&lt;DocumentQueryClause&gt;**](DocumentQueryClause.html)<!----> | Documents filter clauses/criteria. Limit of 20 clauses. |  |
| **operator** | [**OperatorEnum**](#OperatorEnum)<!----> | Specifies how the filter clauses will be applied together. |  |
{: class="table table-striped"}


<a name="OperatorEnum"></a>

## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| OR | &quot;Or&quot; | 
| AND | &quot;And&quot; | 
{: class="table table-striped"}



