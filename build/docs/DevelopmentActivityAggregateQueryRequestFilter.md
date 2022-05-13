---
title: DevelopmentActivityAggregateQueryRequestFilter
---
## DevelopmentActivityAggregateQueryRequestFilter


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | The logic used to combine the clauses |  |
| **clauses** | <!----><!---->[**List&lt;DevelopmentActivityAggregateQueryRequestClause&gt;**](DevelopmentActivityAggregateQueryRequestClause.html)<!----> | The list of clauses used to filter the data. Note that clauses must filter by attendeeId and a maximum of 100 user IDs are allowed |  |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AND | &quot;And&quot; | 
| OR | &quot;Or&quot; | 
{: class="table table-striped"}



