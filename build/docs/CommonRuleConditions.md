---
title: CommonRuleConditions
---
## CommonRuleConditions


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **clauses** | <!----><!---->[**List&lt;CommonRuleConditions&gt;**](CommonRuleConditions.html)<!----> | The list of predicates groups to be evaluated |  [optional] |
| **predicates** | <!----><!---->[**List&lt;CommonRulePredicate&gt;**](CommonRulePredicate.html)<!----> | The list of rule metric predicates to be evaluated. |  |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | the logic operator performed. |  |
| **id** | <!----><!---->**String**<!----> | The id. |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AND | &quot;And&quot; | 
| OR | &quot;Or&quot; | 
| NOT | &quot;Not&quot; | 
{: class="table table-striped"}



