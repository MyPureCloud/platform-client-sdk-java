---
title: DynamicGroupSkillCondition
---
## DynamicGroupSkillCondition


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **routingSkillConditions** | <!----><!---->[**List&lt;DynamicGroupRoutingSkillCondition&gt;**](DynamicGroupRoutingSkillCondition.html)<!----> | Routing skill conditions that will be used for building the query |  |
| **languageSkillConditions** | <!----><!---->[**List&lt;DynamicGroupLanguageSkillCondition&gt;**](DynamicGroupLanguageSkillCondition.html)<!----> | Routing skill conditions that will be used for building the query |  |
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



