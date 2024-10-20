# OutboundMessagingCampaignPostContactEmailEventTopicOutboundMessagingCampaignPostContactEmailEvent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **eventTime** | **Integer** |  |  [optional] |
| **conversationId** | **String** |  |  [optional] |
| **outboundCampaignType** | [**OutboundCampaignTypeEnum**](#Enum--OutboundCampaignTypeEnum) |  |  [optional] |
| **emailAttributes** | [**OutboundMessagingCampaignPostContactEmailEventTopicEmailAttributes**](OutboundMessagingCampaignPostContactEmailEventTopicEmailAttributes) |  |  [optional] |
| **wrapupCode** | [**WrapupCodeEnum**](#Enum--WrapupCodeEnum) |  |  [optional] |
| **outboundCampaignId** | **String** |  |  [optional] |
| **divisionId** | **String** |  |  [optional] |
| **contentTemplateId** | **String** |  |  [optional] |
| **outboundContactListId** | **String** |  |  [optional] |
| **outboundContactId** | **String** |  |  [optional] |
| **isCampaignAlwaysRunning** | **Boolean** |  |  [optional] |


## Enum: OutboundCampaignTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;UNKNOWN&quot; | 
| EMAIL | &quot;EMAIL&quot; | 
| SMS | &quot;SMS&quot; | 


## Enum: WrapupCodeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;UNKNOWN&quot; | 
| OUTBOUND_MESSAGE_SENT | &quot;OUTBOUND_MESSAGE_SENT&quot; | 
| OUTBOUND_MESSAGE_FAILED | &quot;OUTBOUND_MESSAGE_FAILED&quot; | 
| OUTBOUND_MESSAGE_THROTTLED | &quot;OUTBOUND_MESSAGE_THROTTLED&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:212.0.0_
