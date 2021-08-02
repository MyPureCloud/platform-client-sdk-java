---
title: OutboundMessagingMessagingCampaignConfigChangeMessagingCampaign
---
## OutboundMessagingMessagingCampaignConfigChangeMessagingCampaign


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> |  |  [optional] |
| **division** | <!----><!---->[**OutboundMessagingMessagingCampaignConfigChangeUriReference**](OutboundMessagingMessagingCampaignConfigChangeUriReference.html)<!----> |  |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **version** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **campaignStatus** | [**CampaignStatusEnum**](#CampaignStatusEnum)<!----> |  |  [optional] |
| **callableTimeSet** | <!----><!---->[**OutboundMessagingMessagingCampaignConfigChangeUriReference**](OutboundMessagingMessagingCampaignConfigChangeUriReference.html)<!----> |  |  [optional] |
| **contactList** | <!----><!---->[**OutboundMessagingMessagingCampaignConfigChangeUriReference**](OutboundMessagingMessagingCampaignConfigChangeUriReference.html)<!----> |  |  [optional] |
| **dncLists** | <!----><!---->[**List&lt;OutboundMessagingMessagingCampaignConfigChangeUriReference&gt;**](OutboundMessagingMessagingCampaignConfigChangeUriReference.html)<!----> |  |  [optional] |
| **contactListFilters** | <!----><!---->[**List&lt;OutboundMessagingMessagingCampaignConfigChangeUriReference&gt;**](OutboundMessagingMessagingCampaignConfigChangeUriReference.html)<!----> |  |  [optional] |
| **alwaysRunning** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **contactSorts** | <!----><!---->[**List&lt;OutboundMessagingMessagingCampaignConfigChangeContactSort&gt;**](OutboundMessagingMessagingCampaignConfigChangeContactSort.html)<!----> |  |  [optional] |
| **messagesPerMinute** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **smsConfig** | <!----><!---->[**OutboundMessagingMessagingCampaignConfigChangeSmsConfig**](OutboundMessagingMessagingCampaignConfigChangeSmsConfig.html)<!----> |  |  [optional] |
| **emailConfig** | <!----><!---->[**OutboundMessagingMessagingCampaignConfigChangeEmailConfig**](OutboundMessagingMessagingCampaignConfigChangeEmailConfig.html)<!----> |  |  [optional] |
| **errors** | <!----><!---->[**List&lt;OutboundMessagingMessagingCampaignConfigChangeErrorDetail&gt;**](OutboundMessagingMessagingCampaignConfigChangeErrorDetail.html)<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="CampaignStatusEnum"></a>

## Enum: CampaignStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ON | &quot;ON&quot; |
| OFF | &quot;OFF&quot; |
| COMPLETE | &quot;COMPLETE&quot; |
| STOPPING | &quot;STOPPING&quot; |
| INVALID | &quot;INVALID&quot; |
{: class="table table-striped"}



