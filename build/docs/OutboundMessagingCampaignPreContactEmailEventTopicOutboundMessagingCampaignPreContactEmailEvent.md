---
title: OutboundMessagingCampaignPreContactEmailEventTopicOutboundMessagingCampaignPreContactEmailEvent
---
## OutboundMessagingCampaignPreContactEmailEventTopicOutboundMessagingCampaignPreContactEmailEvent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **eventTime** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **outboundCampaignType** | [**OutboundCampaignTypeEnum**](#OutboundCampaignTypeEnum)<!----> |  |  [optional] |
| **emailAttributes** | <!----><!---->[**OutboundMessagingCampaignPreContactEmailEventTopicEmailAttributes**](OutboundMessagingCampaignPreContactEmailEventTopicEmailAttributes.html)<!----> |  |  [optional] |
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
| OUTBOUND_EMAILS_INVALID_SKIPPED | &quot;OUTBOUND_EMAILS_INVALID_SKIPPED&quot; | 
| OUTBOUND_INVALID_EMAIL_ADDRESS | &quot;OUTBOUND_INVALID_EMAIL_ADDRESS&quot; | 
| OUTBOUND_MAX_EMAIL_SUBJECT_LENGTH_EXCEEDED | &quot;OUTBOUND_MAX_EMAIL_SUBJECT_LENGTH_EXCEEDED&quot; | 
| OUTBOUND_MAX_EMAIL_BODY_LENGTH_EXCEEDED | &quot;OUTBOUND_MAX_EMAIL_BODY_LENGTH_EXCEEDED&quot; | 
| OUTBOUND_RULE_ERROR_SKIPPED | &quot;OUTBOUND_RULE_ERROR_SKIPPED&quot; | 
| OUTBOUND_RULE_SKIPPED | &quot;OUTBOUND_RULE_SKIPPED&quot; | 
| OUTBOUND_CONTACT_UNCONTACTABLE_SKIPPED | &quot;OUTBOUND_CONTACT_UNCONTACTABLE_SKIPPED&quot; | 
| OUTBOUND_NUMBER_UNCONTACTABLE_SKIPPED | &quot;OUTBOUND_NUMBER_UNCONTACTABLE_SKIPPED&quot; | 
| OUTBOUND_CONTACT_ADDRESS_UNCONTACTABLE_SKIPPED | &quot;OUTBOUND_CONTACT_ADDRESS_UNCONTACTABLE_SKIPPED&quot; | 
| ININ_OUTBOUND_ZONE_BLOCKED_SKIPPED | &quot;ININ_OUTBOUND_ZONE_BLOCKED_SKIPPED&quot; | 
| ININ_OUTBOUND_DNC_SKIPPED | &quot;ININ_OUTBOUND_DNC_SKIPPED&quot; | 
| ININ_OUTBOUND_INTERNAL_ERROR_SKIPPED | &quot;ININ_OUTBOUND_INTERNAL_ERROR_SKIPPED&quot; | 
| ININ_OUTBOUND_ON_DO_NOT_CALL_LIST | &quot;ININ_OUTBOUND_ON_DO_NOT_CALL_LIST&quot; | 
| ININ_OUTBOUND_NOT_CALLABLE_TIME | &quot;ININ_OUTBOUND_NOT_CALLABLE_TIME&quot; | 
{: class="table table-striped"}



