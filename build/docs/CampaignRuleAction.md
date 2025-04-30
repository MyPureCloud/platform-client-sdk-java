# CampaignRuleAction


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **parameters** | [**CampaignRuleParameters**](CampaignRuleParameters) | The parameters for the CampaignRuleAction. Required for certain actionTypes. |  [optional] |
| **actionType** | [**ActionTypeEnum**](#Enum--ActionTypeEnum) | The action to take on the campaignRuleActionEntities. |  |
| **campaignRuleActionEntities** | [**CampaignRuleActionEntities**](CampaignRuleActionEntities) | The list of entities that this action will apply to. |  |


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
| SETCAMPAIGNDIALINGMODE | &quot;setCampaignDialingMode&quot; | 
| SETCAMPAIGNABANDONRATE | &quot;setCampaignAbandonRate&quot; | 
| SETCAMPAIGNNUMBEROFLINES | &quot;setCampaignNumberOfLines&quot; | 
| SETCAMPAIGNWEIGHT | &quot;setCampaignWeight&quot; | 
| SETCAMPAIGNMAXCALLSPERAGENT | &quot;setCampaignMaxCallsPerAgent&quot; | 
| SETCAMPAIGNMESSAGESPERMINUTE | &quot;setCampaignMessagesPerMinute&quot; | 
| CHANGECAMPAIGNQUEUE | &quot;changeCampaignQueue&quot; | 
| CHANGECAMPAIGNTEMPLATE | &quot;changeCampaignTemplate&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:224.0.0_
