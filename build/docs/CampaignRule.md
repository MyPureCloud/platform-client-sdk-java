---
title: CampaignRule
---
## CampaignRule


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **dateCreated** | [**Date**](Date.html) | Creation time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **dateModified** | [**Date**](Date.html) | Last modified time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **version** | **Integer** | Required for updates, must match the version number of the most recent update |  [optional] |
| **campaignRuleEntities** | [**CampaignRuleEntities**](CampaignRuleEntities.html) | the list of entities the rule monitors |  |
| **campaignRuleConditions** | [**List&lt;CampaignRuleCondition&gt;**](CampaignRuleCondition.html) | the list of conditions the are evaluated |  |
| **campaignRuleActions** | [**List&lt;CampaignRuleAction&gt;**](CampaignRuleAction.html) | the list of actions that are executed if the conditions are satisfied |  |
| **matchAnyConditions** | **Boolean** |  |  [optional] |
| **enabled** | **Boolean** |  |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
{: class="table table-striped"}
{: class="table table-striped"}


