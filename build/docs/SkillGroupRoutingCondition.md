---
title: SkillGroupRoutingCondition
---
## SkillGroupRoutingCondition


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **routingSkill** | <!----><!---->**String**<!----> | The routing skill to be used in the skill condition query |  |
| **comparator** | [**ComparatorEnum**](#ComparatorEnum)<!----> | Comparator that will be applied to the proficiency |  |
| **proficiency** | <!----><!---->**Integer**<!----> | The skill proficiency that will be used for the routing skill. Integer range 0-5 |  |
| **childConditions** | <!----><!---->[**List&lt;SkillGroupCondition&gt;**](SkillGroupCondition.html)<!----> | Nested conditions to be applied to this skill condition |  [optional] |
{: class="table table-striped"}


<a name="ComparatorEnum"></a>

## Enum: ComparatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EQUALTO | &quot;EqualTo&quot; | 
| NOTEQUALTO | &quot;NotEqualTo&quot; | 
| LESSTHAN | &quot;LessThan&quot; | 
| GREATERTHAN | &quot;GreaterThan&quot; | 
| GREATERTHANOREQUALTO | &quot;GreaterThanOrEqualTo&quot; | 
| LESSTHANOREQUALTO | &quot;LessThanOrEqualTo&quot; | 
{: class="table table-striped"}



