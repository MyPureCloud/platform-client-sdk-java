# DialerCampaignRuleConfigChangeCampaignRule


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **campaignRuleEntities** | [**DialerCampaignRuleConfigChangeCampaignRuleEntities**](DialerCampaignRuleConfigChangeCampaignRuleEntities) |  |  [optional] |
| **campaignRuleConditions** | [**List&lt;DialerCampaignRuleConfigChangeCampaignRuleCondition&gt;**](DialerCampaignRuleConfigChangeCampaignRuleCondition) | The list of conditions that will trigger this Campaign Rule |  [optional] |
| **campaignRuleActions** | [**List&lt;DialerCampaignRuleConfigChangeCampaignRuleAction&gt;**](DialerCampaignRuleConfigChangeCampaignRuleAction) | The list of actions that will be taken when this Campaign Rule's conditions are met |  [optional] |
| **matchAnyConditions** | **Boolean** | Whether this Campaign Rule should match any conditions (inclusive OR) or match all conditions (ALL) |  [optional] |
| **enabled** | **Boolean** | Whether this campaign rule is enabled |  [optional] |
| **additionalProperties** | **Map&lt;String, Object&gt;** |  |  [optional] |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The UI-visible name of the object |  [optional] |
| **dateCreated** | [**Date**](Date) | Creation time of the entity |  [optional] |
| **dateModified** | [**Date**](Date) | Last modified time of the entity |  [optional] |
| **version** | **Long** | Required for updates, must match the version number of the most recent update |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
