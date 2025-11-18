# CampaignRule


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The name of the CampaignRule. |  |
| **dateCreated** | [**Date**](Date) | Creation time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | Last modified time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **version** | **Integer** | Required for updates, must match the version number of the most recent update |  [optional] |
| **campaignRuleEntities** | [**CampaignRuleEntities**](CampaignRuleEntities) | The list of entities that this CampaignRule monitors. |  |
| **campaignRuleConditions** | [**List&lt;CampaignRuleCondition&gt;**](CampaignRuleCondition) | The list of conditions that are evaluated on the entities. |  |
| **campaignRuleActions** | [**List&lt;CampaignRuleAction&gt;**](CampaignRuleAction) | The list of actions that are executed if the conditions are satisfied. |  |
| **matchAnyConditions** | **Boolean** |  |  [optional] |
| **enabled** | **Boolean** | Whether or not this CampaignRule is currently enabled. Required on updates. |  [optional] |
| **campaignRuleProcessing** | [**CampaignRuleProcessingEnum**](#Enum--CampaignRuleProcessingEnum) | CampaignRule processing algorithm |  [optional] |
| **conditionGroups** | [**List&lt;CampaignRuleConditionGroup&gt;**](CampaignRuleConditionGroup) | List of condition groups that are evaluated, used only with campaignRuleProcessing=\"v2\" |  [optional] |
| **executionSettings** | [**CampaignRuleExecutionSettings**](CampaignRuleExecutionSettings) | CampaignRule execution settings |  [optional] |
| **warnings** | [**List&lt;CampaignRuleWarning&gt;**](CampaignRuleWarning) | A list of current warning conditions associated with the campaign rule. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: CampaignRuleProcessingEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| V2 | &quot;v2&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:237.0.0_
