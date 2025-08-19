# CampaignRuleParameters


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **operator** | [**OperatorEnum**](#Enum--OperatorEnum) | The operator for comparison. Required for a CampaignRuleCondition. |  [optional] |
| **value** | **String** | The value for comparison. Required for a CampaignRuleCondition. |  [optional] |
| **priority** | [**PriorityEnum**](#Enum--PriorityEnum) | The priority to set a campaign to. Required for the 'setCampaignPriority' action. |  [optional] |
| **dialingMode** | [**DialingModeEnum**](#Enum--DialingModeEnum) | The dialing mode to set a campaign to. Required for the 'setCampaignDialingMode' action. |  [optional] |
| **abandonRate** | [**BigDecimal**](BigDecimal) | The abandon rate to set a campaign to. Required for the 'setCampaignAbandonRate' action. |  [optional] |
| **outboundLineCount** | **Integer** | The  number of outbound lines to set a campaign to. Required for the 'setCampaignNumberOfLines' action. |  [optional] |
| **relativeWeight** | **Integer** | The relative weight to set a campaign to. Required for the 'setCampaignWeight' action. |  [optional] |
| **maxCallsPerAgent** | [**BigDecimal**](BigDecimal) | The maximum number of calls per agent to set a campaign to. Required for the 'setCampaignMaxCallsPerAgent' action. |  [optional] |
| **queue** | [**DomainEntityRef**](DomainEntityRef) | The queue a campaign to. Required for the 'changeCampaignQueue' action. |  [optional] |
| **messagesPerMinute** | **Integer** | The number of messages per minute to set a messaging campaign to. |  [optional] |
| **smsMessagesPerMinute** | **Integer** | The number of messages per minute to set a SMS messaging campaign to. |  [optional] |
| **emailMessagesPerMinute** | **Integer** | The number of messages per minute to set a Email messaging campaign to. |  [optional] |
| **smsContentTemplate** | [**DomainEntityRef**](DomainEntityRef) | The content template to set a SMS campaign to. |  [optional] |
| **emailContentTemplate** | [**DomainEntityRef**](DomainEntityRef) | The content template to set a Email campaign to. |  [optional] |


## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EQUALS | &quot;equals&quot; | 
| GREATERTHAN | &quot;greaterThan&quot; | 
| GREATERTHANEQUALTO | &quot;greaterThanEqualTo&quot; | 
| LESSTHAN | &quot;lessThan&quot; | 
| LESSTHANEQUALTO | &quot;lessThanEqualTo&quot; | 


## Enum: PriorityEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| _1 | &quot;1&quot; | 
| _2 | &quot;2&quot; | 
| _3 | &quot;3&quot; | 
| _4 | &quot;4&quot; | 
| _5 | &quot;5&quot; | 


## Enum: DialingModeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AGENTLESS | &quot;agentless&quot; | 
| PREVIEW | &quot;preview&quot; | 
| POWER | &quot;power&quot; | 
| PREDICTIVE | &quot;predictive&quot; | 
| PROGRESSIVE | &quot;progressive&quot; | 
| EXTERNAL | &quot;external&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:229.1.0_
