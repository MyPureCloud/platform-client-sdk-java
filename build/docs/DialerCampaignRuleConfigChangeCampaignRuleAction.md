# DialerCampaignRuleConfigChangeCampaignRuleAction


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the action |  [optional] |
| **parameters** | **Map&lt;String, String&gt;** | The parameters to match this action |  [optional] |
| **actionType** | [**ActionTypeEnum**](#Enum--ActionTypeEnum) | The type of this action |  [optional] |
| **campaignRuleActionEntities** | [**DialerCampaignRuleConfigChangeCampaignRuleActionEntities**](DialerCampaignRuleConfigChangeCampaignRuleActionEntities) |  |  [optional] |
| **additionalProperties** | **Map&lt;String, Object&gt;** |  |  [optional] |
| **getAdditionalProperties** | **Map&lt;String, Object&gt;** |  |  [optional] |


## Enum: ActionTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| TURNONCAMPAIGN | &quot;turnOnCampaign&quot; | 
| TURNOFFCAMPAIGN | &quot;turnOffCampaign&quot; | 
| TURNONSEQUENCE | &quot;turnOnSequence&quot; | 
| TURNOFFSEQUENCE | &quot;turnOffSequence&quot; | 
| SETCAMPAIGNPRIORITY | &quot;setCampaignPriority&quot; | 
| RECYCLECAMPAIGN | &quot;recycleCampaign&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:236.0.0_
