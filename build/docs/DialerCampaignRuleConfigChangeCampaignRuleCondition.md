---
title: DialerCampaignRuleConfigChangeCampaignRuleCondition
---
## DialerCampaignRuleConfigChangeCampaignRuleCondition


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the condition |  [optional] |
| **parameters** | <!----><!---->**Map&lt;String, String&gt;**<!----> | The parameters to match this condition |  [optional] |
| **conditionType** | [**ConditionTypeEnum**](#ConditionTypeEnum)<!----> | The type of this condition |  [optional] |
{: class="table table-striped"}


<a name="ConditionTypeEnum"></a>

## Enum: ConditionTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CAMPAIGNPROGRESS | &quot;campaignProgress&quot; | 
| CAMPAIGNAGENTS | &quot;campaignAgents&quot; | 
{: class="table table-striped"}



