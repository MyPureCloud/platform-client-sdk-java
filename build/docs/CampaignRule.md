---
title: CampaignRule
---
## CampaignRule


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> | The name of the CampaignRule. |  |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | Creation time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | Last modified time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **version** | <!----><!---->**Integer**<!----> | Required for updates, must match the version number of the most recent update |  [optional] |
| **campaignRuleEntities** | <!----><!---->[**CampaignRuleEntities**](CampaignRuleEntities.html)<!----> | The list of entities that this CampaignRule monitors. |  |
| **campaignRuleConditions** | <!----><!---->[**List&lt;CampaignRuleCondition&gt;**](CampaignRuleCondition.html)<!----> | The list of conditions that are evaluated on the entities. |  |
| **campaignRuleActions** | <!----><!---->[**List&lt;CampaignRuleAction&gt;**](CampaignRuleAction.html)<!----> | The list of actions that are executed if the conditions are satisfied. |  |
| **matchAnyConditions** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **enabled** | <!----><!---->**Boolean**<!----> | Whether or not this CampaignRule is currently enabled. Required on updates. |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}



