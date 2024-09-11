# OutboundMessagingMessagingCampaignConfigChangeMessagingCampaign


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **campaignStatus** | [**CampaignStatusEnum**](#Enum--CampaignStatusEnum) |  |  [optional] |
| **callableTimeSet** | [**OutboundMessagingMessagingCampaignConfigChangeUriReference**](OutboundMessagingMessagingCampaignConfigChangeUriReference) |  |  [optional] |
| **contactList** | [**OutboundMessagingMessagingCampaignConfigChangeUriReference**](OutboundMessagingMessagingCampaignConfigChangeUriReference) | A UriReference for a resource |  [optional] |
| **dncLists** | [**List&lt;OutboundMessagingMessagingCampaignConfigChangeUriReference&gt;**](OutboundMessagingMessagingCampaignConfigChangeUriReference) | The dnc lists to check before sending a message for this messaging campaign. |  [optional] |
| **contactListFilters** | [**List&lt;OutboundMessagingMessagingCampaignConfigChangeUriReference&gt;**](OutboundMessagingMessagingCampaignConfigChangeUriReference) | The contact list filters to check before sending a message for this messaging campaign. |  [optional] |
| **alwaysRunning** | **Boolean** | Whether this messaging campaign is always running. |  [optional] |
| **contactSorts** | [**List&lt;OutboundMessagingMessagingCampaignConfigChangeContactSort&gt;**](OutboundMessagingMessagingCampaignConfigChangeContactSort) | The order in which to sort contacts for dialing, based on up to four columns. |  [optional] |
| **messagesPerMinute** | **Integer** | How many messages this messaging campaign will send per minute. |  [optional] |
| **ruleSets** | [**List&lt;OutboundMessagingMessagingCampaignConfigChangeUriReference&gt;**](OutboundMessagingMessagingCampaignConfigChangeUriReference) |  |  [optional] |
| **smsConfig** | [**OutboundMessagingMessagingCampaignConfigChangeSmsConfig**](OutboundMessagingMessagingCampaignConfigChangeSmsConfig) |  |  [optional] |
| **emailConfig** | [**OutboundMessagingMessagingCampaignConfigChangeEmailConfig**](OutboundMessagingMessagingCampaignConfigChangeEmailConfig) |  |  [optional] |
| **errors** | [**List&lt;OutboundMessagingMessagingCampaignConfigChangeErrorDetail&gt;**](OutboundMessagingMessagingCampaignConfigChangeErrorDetail) | A list of current error conditions associated with this messaging campaign |  [optional] |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The UI-visible name of the object |  [optional] |
| **dateCreated** | [**Date**](Date) | Creation time of the entity |  [optional] |
| **dateModified** | [**Date**](Date) | Last modified time of the entity |  [optional] |
| **version** | **Integer** | Required for updates, must match the version number of the most recent update |  [optional] |
| **division** | [**OutboundMessagingMessagingCampaignConfigChangeUriReference**](OutboundMessagingMessagingCampaignConfigChangeUriReference) | A UriReference for a resource |  [optional] |


## Enum: CampaignStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ON | &quot;on&quot; | 
| OFF | &quot;off&quot; | 
| COMPLETE | &quot;complete&quot; | 
| STOPPING | &quot;stopping&quot; | 
| INVALID | &quot;invalid&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:209.0.1_
