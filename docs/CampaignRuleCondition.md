# CampaignRuleCondition


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **parameters** | [**CampaignRuleParameters**](CampaignRuleParameters) | The parameters for the CampaignRuleCondition. |  |
| **conditionType** | [**ConditionTypeEnum**](#Enum--ConditionTypeEnum) | The type of condition to evaluate. |  |
{: class="table table-striped"}


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




_com.mypurecloud.sdk.v2:platform-client-v2:207.0.0_
