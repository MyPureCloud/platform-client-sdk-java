---
title: CampaignRuleCondition
---
## CampaignRuleCondition


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> |  |  [optional] |
| **parameters** | <!----><!---->[**CampaignRuleParameters**](CampaignRuleParameters.html)<!----> | The parameters for the CampaignRuleCondition. |  |
| **conditionType** | [**ConditionTypeEnum**](#ConditionTypeEnum)<!----> | The type of condition to evaluate. |  |
{: class="table table-striped"}


<a name="ConditionTypeEnum"></a>

## Enum: ConditionTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CAMPAIGNPROGRESS | &quot;campaignProgress&quot; | 
| CAMPAIGNAGENTS | &quot;campaignAgents&quot; | 
| CAMPAIGNRECORDSATTEMPTED | &quot;campaignRecordsAttempted&quot; | 
| CAMPAIGNBUSINESSSUCCESS | &quot;campaignBusinessSuccess&quot; | 
| CAMPAIGNBUSINESSFAILURE | &quot;campaignBusinessFailure&quot; | 
| CAMPAIGNBUSINESSNEUTRAL | &quot;campaignBusinessNeutral&quot; | 
| CAMPAIGNVALIDATTEMPTS | &quot;campaignValidAttempts&quot; | 
| CAMPAIGNRIGHTPARTYCONTACTS | &quot;campaignRightPartyContacts&quot; | 
{: class="table table-striped"}



