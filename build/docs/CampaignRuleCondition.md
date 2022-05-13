---
title: CampaignRuleCondition
---
## CampaignRuleCondition


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> |  |  [optional] |
| **parameters** | <!----><!---->[**CampaignRuleParameters**](CampaignRuleParameters.html)<!----> | The parameters for the CampaignRuleCondition. |  |
| **conditionType** | [**ConditionTypeEnum**](#ConditionTypeEnum)<!----> | The type of condition to evaluate. |  |
{: class="table table-striped"}


<a name="ConditionTypeEnum"></a>

## Enum: ConditionTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CAMPAIGNPROGRESS | &quot;campaignProgress&quot; | 
| CAMPAIGNAGENTS | &quot;campaignAgents&quot; | 
{: class="table table-striped"}



