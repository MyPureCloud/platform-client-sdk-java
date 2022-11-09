---
title: SkillGroupCondition
---
## SkillGroupCondition


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **routingSkillConditions** | <!----><!---->[**List&lt;SkillGroupRoutingCondition&gt;**](SkillGroupRoutingCondition.html)<!----> | Routing skill conditions that will be used for building the query |  |
| **languageSkillConditions** | <!----><!---->[**List&lt;SkillGroupLanguageCondition&gt;**](SkillGroupLanguageCondition.html)<!----> | Routing skill conditions that will be used for building the query |  |
| **operation** | [**OperationEnum**](#OperationEnum)<!----> | Operator that will be applied to the conditions |  |
{: class="table table-striped"}


<a name="OperationEnum"></a>

## Enum: OperationEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AND | &quot;And&quot; | 
| NOT | &quot;Not&quot; | 
| OR | &quot;Or&quot; | 
{: class="table table-striped"}



