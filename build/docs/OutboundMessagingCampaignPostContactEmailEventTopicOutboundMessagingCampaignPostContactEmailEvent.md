---
title: OutboundMessagingCampaignPostContactEmailEventTopicOutboundMessagingCampaignPostContactEmailEvent
---
## OutboundMessagingCampaignPostContactEmailEventTopicOutboundMessagingCampaignPostContactEmailEvent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **eventTime** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **conversationId** | <!----><!---->**String**<!----> |  |  [optional] |
| **outboundCampaignType** | [**OutboundCampaignTypeEnum**](#OutboundCampaignTypeEnum)<!----> |  |  [optional] |
| **emailAttributes** | <!----><!---->[**OutboundMessagingCampaignPostContactEmailEventTopicEmailAttributes**](OutboundMessagingCampaignPostContactEmailEventTopicEmailAttributes.html)<!----> |  |  [optional] |
| **wrapupCode** | [**WrapupCodeEnum**](#WrapupCodeEnum)<!----> |  |  [optional] |
| **outboundCampaignId** | <!----><!---->**String**<!----> |  |  [optional] |
| **divisionId** | <!----><!---->**String**<!----> |  |  [optional] |
| **contentTemplateId** | <!----><!---->**String**<!----> |  |  [optional] |
| **outboundContactListId** | <!----><!---->**String**<!----> |  |  [optional] |
| **outboundContactId** | <!----><!---->**String**<!----> |  |  [optional] |
| **isCampaignAlwaysRunning** | <!----><!---->**Boolean**<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="OutboundCampaignTypeEnum"></a>

## Enum: OutboundCampaignTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;UNKNOWN&quot; | 
| EMAIL | &quot;EMAIL&quot; | 
| SMS | &quot;SMS&quot; | 
{: class="table table-striped"}


<a name="WrapupCodeEnum"></a>

## Enum: WrapupCodeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;UNKNOWN&quot; | 
| OUTBOUND_MESSAGE_SENT | &quot;OUTBOUND_MESSAGE_SENT&quot; | 
| OUTBOUND_MESSAGE_FAILED | &quot;OUTBOUND_MESSAGE_FAILED&quot; | 
| OUTBOUND_MESSAGE_THROTTLED | &quot;OUTBOUND_MESSAGE_THROTTLED&quot; | 
{: class="table table-striped"}



