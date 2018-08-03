---
title: CampaignRuleNotificationCampaignRuleAction
---
## CampaignRuleNotificationCampaignRuleAction


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **parameters** | **Map&lt;String, String&gt;** |  |  [optional] |
| **actionType** | [**ActionTypeEnum**](#ActionTypeEnum) |  |  [optional] |
| **campaignRuleActionEntities** | [**CampaignRuleNotificationCampaignRuleActionEntities**](CampaignRuleNotificationCampaignRuleActionEntities.html) |  |  [optional] |
| **additionalProperties** | **Object** |  |  [optional] |
{: class="table table-striped"}


<a name="ActionTypeEnum"></a>

## Enum: ActionTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| TURN_ON_CAMPAIGN | &quot;TURN_ON_CAMPAIGN&quot; |
| TURN_OFF_CAMPAIGN | &quot;TURN_OFF_CAMPAIGN&quot; |
| TURN_ON_SEQUENCE | &quot;TURN_ON_SEQUENCE&quot; |
| TURN_OFF_SEQUENCE | &quot;TURN_OFF_SEQUENCE&quot; |
| SET_CAMPAIGN_PRIORITY | &quot;SET_CAMPAIGN_PRIORITY&quot; |
| RECYCLE_CAMPAIGN | &quot;RECYCLE_CAMPAIGN&quot; |
{: class="table table-striped"}



