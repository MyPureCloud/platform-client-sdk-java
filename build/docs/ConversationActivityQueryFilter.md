---
title: ConversationActivityQueryFilter
---
## ConversationActivityQueryFilter


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | Boolean operation to apply to the provided predicates and clauses |  |
| **clauses** | <!----><!---->[**List&lt;ConversationActivityQueryClause&gt;**](ConversationActivityQueryClause.html)<!----> | Boolean 'and/or' logic with up to two-levels of nesting |  [optional] |
| **predicates** | <!----><!---->[**List&lt;ConversationActivityQueryPredicate&gt;**](ConversationActivityQueryPredicate.html)<!----> | Like a three-word sentence: (attribute-name) (operator) (target-value). |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AND | &quot;and&quot; | 
| OR | &quot;or&quot; | 
{: class="table table-striped"}



