---
title: DialerCampaignRuleConfigChangeCampaignRuleAction
---
## DialerCampaignRuleConfigChangeCampaignRuleAction


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the action |  [optional] |
| **parameters** | <!----><!---->**Map&lt;String, String&gt;**<!----> | The parameters to match this action |  [optional] |
| **actionType** | [**ActionTypeEnum**](#ActionTypeEnum)<!----> | The type of this action |  [optional] |
| **campaignRuleActionEntities** | <!----><!---->[**DialerCampaignRuleConfigChangeCampaignRuleActionEntities**](DialerCampaignRuleConfigChangeCampaignRuleActionEntities.html)<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="ActionTypeEnum"></a>

## Enum: ActionTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| TURNONCAMPAIGN | &quot;turnOnCampaign&quot; | 
| TURNOFFCAMPAIGN | &quot;turnOffCampaign&quot; | 
| TURNONSEQUENCE | &quot;turnOnSequence&quot; | 
| TURNOFFSEQUENCE | &quot;turnOffSequence&quot; | 
| SETCAMPAIGNPRIORITY | &quot;setCampaignPriority&quot; | 
| RECYCLECAMPAIGN | &quot;recycleCampaign&quot; | 
{: class="table table-striped"}



