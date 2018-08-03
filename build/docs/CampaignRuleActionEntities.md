---
title: CampaignRuleActionEntities
---
## CampaignRuleActionEntities


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **campaigns** | [**List&lt;UriReference&gt;**](UriReference.html) | The list of campaigns for a CampaignRule to monitor. Required if the CampaignRule has any conditions that run on a campaign. |  [optional] |
| **sequences** | [**List&lt;UriReference&gt;**](UriReference.html) | The list of sequences for a CampaignRule to monitor. Required if the CampaignRule has any conditions that run on a sequence. |  [optional] |
| **useTriggeringEntity** | **Boolean** | If true, the CampaignRuleAction will apply to the same entity that triggered the CampaignRuleCondition. |  [optional] |
{: class="table table-striped"}



