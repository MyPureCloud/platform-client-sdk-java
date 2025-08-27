# CampaignRuleActionEntities


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **campaigns** | [**List&lt;DomainEntityRef&gt;**](DomainEntityRef) | The list of campaigns for a CampaignRule to monitor. Required if the CampaignRule has any conditions that run on a campaign. |  [optional] |
| **sequences** | [**List&lt;DomainEntityRef&gt;**](DomainEntityRef) | The list of sequences for a CampaignRule to monitor. Required if the CampaignRule has any conditions that run on a sequence. |  [optional] |
| **emailCampaigns** | [**List&lt;DomainEntityRef&gt;**](DomainEntityRef) | The list of Email campaigns for a CampaignRule to monitor. Required if the CampaignRule has any conditions that run on a Email campaign. |  [optional] |
| **smsCampaigns** | [**List&lt;DomainEntityRef&gt;**](DomainEntityRef) | The list of SMS campaigns for a CampaignRule to monitor. Required if the CampaignRule has any conditions that run on a SMS campaign. |  [optional] |
| **useTriggeringEntity** | **Boolean** | If true, the CampaignRuleAction will apply to the same entity that triggered the CampaignRuleCondition. |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:230.0.0_
