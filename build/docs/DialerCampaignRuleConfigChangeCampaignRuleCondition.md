# DialerCampaignRuleConfigChangeCampaignRuleCondition


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the condition |  [optional] |
| **parameters** | **Map&lt;String, String&gt;** | The parameters to match this condition |  [optional] |
| **conditionType** | [**ConditionTypeEnum**](#Enum--ConditionTypeEnum) | The type of this condition |  [optional] |
| **additionalProperties** | **Map&lt;String, Object&gt;** |  |  [optional] |
| **getAdditionalProperties** | **Map&lt;String, Object&gt;** |  |  [optional] |


## Enum: ConditionTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CAMPAIGNPROGRESS | &quot;campaignProgress&quot; | 
| CAMPAIGNAGENTS | &quot;campaignAgents&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:241.0.0_
