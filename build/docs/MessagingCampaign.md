# MessagingCampaign


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **dateCreated** | [**Date**](Date) | Creation time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | Last modified time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **version** | **Integer** | Required for updates, must match the version number of the most recent update |  [optional] |
| **division** | [**DomainEntityRef**](DomainEntityRef) | The division this entity belongs to. |  [optional] |
| **campaignStatus** | [**CampaignStatusEnum**](#Enum--CampaignStatusEnum) | The current status of the messaging campaign. A messaging campaign may be turned 'on' or 'off'. |  [optional] |
| **callableTimeSet** | [**DomainEntityRef**](DomainEntityRef) | The callable time set for this messaging campaign. |  [optional] |
| **contactList** | [**DomainEntityRef**](DomainEntityRef) | The contact list that this messaging campaign will send messages for. |  |
| **dncLists** | [**List&lt;DomainEntityRef&gt;**](DomainEntityRef) | The dnc lists to check before sending a message for this messaging campaign. |  [optional] |
| **alwaysRunning** | **Boolean** | Whether this messaging campaign is always running |  [optional] |
| **contactSorts** | [**List&lt;ContactSort&gt;**](ContactSort) | The order in which to sort contacts for dialing, based on up to four columns. |  [optional] |
| **messagesPerMinute** | **Integer** | How many messages this messaging campaign will send per minute. |  |
| **ruleSets** | [**List&lt;DomainEntityRef&gt;**](DomainEntityRef) | Rule Sets to be applied while this campaign is sending messages |  [optional] |
| **contactListFilters** | [**List&lt;DomainEntityRef&gt;**](DomainEntityRef) | The contact list filter to check before sending a message for this messaging campaign. |  [optional] |
| **errors** | [**List&lt;RestErrorDetail&gt;**](RestErrorDetail) | A list of current error conditions associated with this messaging campaign. |  [optional] |
| **dynamicContactQueueingSettings** | [**DynamicContactQueueingSettings**](DynamicContactQueueingSettings) | Indicates (when true) that the campaign supports dynamic queueing of the contact list at the time of a request for contacts. |  [optional] |
| **emailConfig** | [**EmailConfig**](EmailConfig) | Configuration for this messaging campaign to send Email messages. |  [optional] |
| **smsConfig** | [**SmsConfig**](SmsConfig) | Configuration for this messaging campaign to send SMS messages. |  [optional] |
| **whatsAppConfig** | [**WhatsAppConfig**](WhatsAppConfig) | Configuration for this messaging campaign to send WhatsApp messages. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: CampaignStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ON | &quot;on&quot; | 
| STOPPING | &quot;stopping&quot; | 
| OFF | &quot;off&quot; | 
| COMPLETE | &quot;complete&quot; | 
| INVALID | &quot;invalid&quot; | 
| FORCED_OFF | &quot;forced_off&quot; | 
| FORCED_STOPPING | &quot;forced_stopping&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
