---
title: CampaignRuleParameters
---
## CampaignRuleParameters


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **operator** | [**OperatorEnum**](#OperatorEnum)<!----> | The operator for comparison. Required for a CampaignRuleCondition. |  [optional] |
| **value** | <!----><!---->**String**<!----> | The value for comparison. Required for a CampaignRuleCondition. |  [optional] |
| **priority** | [**PriorityEnum**](#PriorityEnum)<!----> | The priority to set a campaign to. Required for the 'setCampaignPriority' action. |  [optional] |
| **dialingMode** | [**DialingModeEnum**](#DialingModeEnum)<!----> | The dialing mode to set a campaign to. Required for the 'setCampaignDialingMode' action. |  [optional] |
{: class="table table-striped"}


<a name="OperatorEnum"></a>

## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EQUALS | &quot;equals&quot; | 
| GREATERTHAN | &quot;greaterThan&quot; | 
| GREATERTHANEQUALTO | &quot;greaterThanEqualTo&quot; | 
| LESSTHAN | &quot;lessThan&quot; | 
| LESSTHANEQUALTO | &quot;lessThanEqualTo&quot; | 
{: class="table table-striped"}


<a name="PriorityEnum"></a>

## Enum: PriorityEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| _1 | &quot;1&quot; | 
| _2 | &quot;2&quot; | 
| _3 | &quot;3&quot; | 
| _4 | &quot;4&quot; | 
| _5 | &quot;5&quot; | 
{: class="table table-striped"}


<a name="DialingModeEnum"></a>

## Enum: DialingModeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AGENTLESS | &quot;agentless&quot; | 
| PREVIEW | &quot;preview&quot; | 
| POWER | &quot;power&quot; | 
| PREDICTIVE | &quot;predictive&quot; | 
| PROGRESSIVE | &quot;progressive&quot; | 
| EXTERNAL | &quot;external&quot; | 
{: class="table table-striped"}



