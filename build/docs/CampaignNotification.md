---
title: CampaignNotification
---

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **name** | **String** |  |  [optional] |
| **dateCreated** | [**Date**](Date.html) |  |  [optional] |
| **dateModified** | [**Date**](Date.html) |  |  [optional] |
| **version** | **Integer** |  |  [optional] |
| **contactList** | [**DocumentDataV2NotificationCreatedBy**](DocumentDataV2NotificationCreatedBy.html) |  |  [optional] |
| **queue** | [**CampaignNotificationUriReference**](CampaignNotificationUriReference.html) |  |  [optional] |
| **dialingMode** | [**DialingModeEnum**](#DialingModeEnum) |  |  [optional] |
| **script** | [**CampaignNotificationUriReference**](CampaignNotificationUriReference.html) |  |  [optional] |
| **edgeGroup** | [**CampaignNotificationUriReference**](CampaignNotificationUriReference.html) |  |  [optional] |
| **campaignStatus** | [**CampaignStatusEnum**](#CampaignStatusEnum) |  |  [optional] |
| **phoneColumns** | [**List&lt;CampaignNotificationPhoneColumns&gt;**](CampaignNotificationPhoneColumns.html) |  |  [optional] |
| **abandonRate** | [**BigDecimal**](BigDecimal.html) |  |  [optional] |
| **dncLists** | [**List&lt;CampaignNotificationUriReference&gt;**](CampaignNotificationUriReference.html) |  |  [optional] |
| **callableTimeSet** | [**CampaignNotificationUriReference**](CampaignNotificationUriReference.html) |  |  [optional] |
| **callAnalysisResponseSet** | [**CampaignNotificationUriReference**](CampaignNotificationUriReference.html) |  |  [optional] |
| **callerName** | **String** |  |  [optional] |
| **callerAddress** | **String** |  |  [optional] |
| **outboundLineCount** | **Integer** |  |  [optional] |
| **errors** | [**List&lt;CampaignNotificationErrors&gt;**](CampaignNotificationErrors.html) |  |  [optional] |
| **ruleSets** | [**List&lt;CampaignNotificationUriReference&gt;**](CampaignNotificationUriReference.html) |  |  [optional] |
| **skipPreviewDisabled** | **Boolean** |  |  [optional] |
| **previewTimeOutSeconds** | **Integer** |  |  [optional] |
| **singleNumberPreview** | **Boolean** |  |  [optional] |
| **contactSort** | [**CampaignNotificationContactSort**](CampaignNotificationContactSort.html) |  |  [optional] |
| **contactSorts** | [**List&lt;CampaignNotificationContactSort&gt;**](CampaignNotificationContactSort.html) |  |  [optional] |
| **noAnswerTimeout** | **Integer** |  |  [optional] |
| **callAnalysisLanguage** | **String** |  |  [optional] |
| **priority** | **Integer** |  |  [optional] |
| **contactListFilters** | [**List&lt;CampaignNotificationUriReference&gt;**](CampaignNotificationUriReference.html) |  |  [optional] |
| **additionalProperties** | **Object** |  |  [optional] |
{: class="table table-striped"}


<a name="DialingModeEnum"></a>

## Enum: DialingModeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| AGENTLESS | &quot;AGENTLESS&quot; |
| PREVIEW | &quot;PREVIEW&quot; |
| POWER | &quot;POWER&quot; |
| PREDICTIVE | &quot;PREDICTIVE&quot; |
| PROGRESSIVE | &quot;PROGRESSIVE&quot; |


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


