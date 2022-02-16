---
title: MessagingCampaign
---
## MessagingCampaign


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | Creation time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | Last modified time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **version** | <!----><!---->**Integer**<!----> | Required for updates, must match the version number of the most recent update |  [optional] |
| **division** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | The division this entity belongs to. |  [optional] |
| **campaignStatus** | [**CampaignStatusEnum**](#CampaignStatusEnum)<!----> | The current status of the messaging campaign. A messaging campaign may be turned &#39;on&#39; or &#39;off&#39;. |  [optional] |
| **callableTimeSet** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | The callable time set for this messaging campaign. |  [optional] |
| **contactList** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | The contact list that this messaging campaign will send messages for. |  |
| **dncLists** | <!----><!---->[**List&lt;DomainEntityRef&gt;**](DomainEntityRef.html)<!----> | The dnc lists to check before sending a message for this messaging campaign. |  [optional] |
| **alwaysRunning** | <!----><!---->**Boolean**<!----> | Whether this messaging campaign is always running |  [optional] |
| **contactSorts** | <!----><!---->[**List&lt;ContactSort&gt;**](ContactSort.html)<!----> | The order in which to sort contacts for dialing, based on up to four columns. |  [optional] |
| **messagesPerMinute** | <!----><!---->**Integer**<!----> | How many messages this messaging campaign will send per minute. |  |
| **contactListFilters** | <!----><!---->[**List&lt;DomainEntityRef&gt;**](DomainEntityRef.html)<!----> | The contact list filter to check before sending a message for this messaging campaign. |  [optional] |
| **errors** | <!----><!---->[**List&lt;RestErrorDetail&gt;**](RestErrorDetail.html)<!----> | A list of current error conditions associated with this messaging campaign. |  [optional] |
| **smsConfig** | <!----><!---->[**SmsConfig**](SmsConfig.html)<!----> | Configuration for this messaging campaign to send SMS messages. |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="CampaignStatusEnum"></a>

## Enum: CampaignStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ON | &quot;on&quot; |
| STOPPING | &quot;stopping&quot; |
| OFF | &quot;off&quot; |
| COMPLETE | &quot;complete&quot; |
| INVALID | &quot;invalid&quot; |
{: class="table table-striped"}



