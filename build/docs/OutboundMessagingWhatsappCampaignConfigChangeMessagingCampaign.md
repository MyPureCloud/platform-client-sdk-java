# OutboundMessagingWhatsappCampaignConfigChangeMessagingCampaign


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **campaignStatus** | [**CampaignStatusEnum**](#Enum--CampaignStatusEnum) |  |  [optional] |
| **callableTimeSet** | [**OutboundMessagingWhatsappCampaignConfigChangeUriReference**](OutboundMessagingWhatsappCampaignConfigChangeUriReference) |  |  [optional] |
| **contactList** | [**OutboundMessagingWhatsappCampaignConfigChangeUriReference**](OutboundMessagingWhatsappCampaignConfigChangeUriReference) | A UriReference for a resource |  [optional] |
| **dncLists** | [**List&lt;OutboundMessagingWhatsappCampaignConfigChangeUriReference&gt;**](OutboundMessagingWhatsappCampaignConfigChangeUriReference) | The dnc lists to check before sending a message for this messaging campaign. |  [optional] |
| **contactListFilters** | [**List&lt;OutboundMessagingWhatsappCampaignConfigChangeUriReference&gt;**](OutboundMessagingWhatsappCampaignConfigChangeUriReference) | The contact list filters to check before sending a message for this messaging campaign. |  [optional] |
| **alwaysRunning** | **Boolean** | Whether this messaging campaign is always running. |  [optional] |
| **contactSorts** | [**List&lt;OutboundMessagingWhatsappCampaignConfigChangeContactSort&gt;**](OutboundMessagingWhatsappCampaignConfigChangeContactSort) | The order in which to sort contacts for dialing, based on up to four columns. |  [optional] |
| **messagesPerMinute** | **Long** | How many messages this messaging campaign will send per minute. |  [optional] |
| **ruleSets** | [**List&lt;OutboundMessagingWhatsappCampaignConfigChangeUriReference&gt;**](OutboundMessagingWhatsappCampaignConfigChangeUriReference) |  |  [optional] |
| **smsConfig** | [**OutboundMessagingWhatsappCampaignConfigChangeSmsConfig**](OutboundMessagingWhatsappCampaignConfigChangeSmsConfig) |  |  [optional] |
| **emailConfig** | [**OutboundMessagingWhatsappCampaignConfigChangeEmailConfig**](OutboundMessagingWhatsappCampaignConfigChangeEmailConfig) |  |  [optional] |
| **whatsAppConfig** | [**OutboundMessagingWhatsappCampaignConfigChangeWhatsAppConfig**](OutboundMessagingWhatsappCampaignConfigChangeWhatsAppConfig) |  |  [optional] |
| **errors** | [**List&lt;OutboundMessagingWhatsappCampaignConfigChangeErrorDetail&gt;**](OutboundMessagingWhatsappCampaignConfigChangeErrorDetail) | A list of current error conditions associated with this messaging campaign |  [optional] |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The UI-visible name of the object |  [optional] |
| **dateCreated** | [**Date**](Date) | Creation time of the entity |  [optional] |
| **dateModified** | [**Date**](Date) | Last modified time of the entity |  [optional] |
| **version** | **Long** | Required for updates, must match the version number of the most recent update |  [optional] |
| **division** | [**OutboundMessagingWhatsappCampaignConfigChangeUriReference**](OutboundMessagingWhatsappCampaignConfigChangeUriReference) | A UriReference for a resource |  [optional] |


## Enum: CampaignStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ON | &quot;on&quot; | 
| OFF | &quot;off&quot; | 
| COMPLETE | &quot;complete&quot; | 
| STOPPING | &quot;stopping&quot; | 
| INVALID | &quot;invalid&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:223.1.0_
