---
title: DialerCampaignConfigChangeCampaign
---
## DialerCampaignConfigChangeCampaign


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> |  |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **version** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **contactList** | <!----><!---->[**DialerCampaignConfigChangeUriReference**](DialerCampaignConfigChangeUriReference.html)<!----> |  |  [optional] |
| **queue** | <!----><!---->[**DialerCampaignConfigChangeUriReference**](DialerCampaignConfigChangeUriReference.html)<!----> |  |  [optional] |
| **dialingMode** | [**DialingModeEnum**](#DialingModeEnum)<!----> |  |  [optional] |
| **script** | <!----><!---->[**DialerCampaignConfigChangeUriReference**](DialerCampaignConfigChangeUriReference.html)<!----> |  |  [optional] |
| **edgeGroup** | <!----><!---->[**DialerCampaignConfigChangeUriReference**](DialerCampaignConfigChangeUriReference.html)<!----> |  |  [optional] |
| **site** | <!----><!---->[**DialerCampaignConfigChangeUriReference**](DialerCampaignConfigChangeUriReference.html)<!----> |  |  [optional] |
| **campaignStatus** | [**CampaignStatusEnum**](#CampaignStatusEnum)<!----> |  |  [optional] |
| **phoneColumns** | <!----><!---->[**List&lt;DialerCampaignConfigChangePhoneColumn&gt;**](DialerCampaignConfigChangePhoneColumn.html)<!----> |  |  [optional] |
| **abandonRate** | <!----><!---->[**BigDecimal**](BigDecimal.html)<!----> |  |  [optional] |
| **dncLists** | <!----><!---->[**List&lt;DialerCampaignConfigChangeUriReference&gt;**](DialerCampaignConfigChangeUriReference.html)<!----> |  |  [optional] |
| **callableTimeSet** | <!----><!---->[**DialerCampaignConfigChangeUriReference**](DialerCampaignConfigChangeUriReference.html)<!----> |  |  [optional] |
| **callAnalysisResponseSet** | <!----><!---->[**DialerCampaignConfigChangeUriReference**](DialerCampaignConfigChangeUriReference.html)<!----> |  |  [optional] |
| **callerName** | <!----><!---->**String**<!----> |  |  [optional] |
| **callerAddress** | <!----><!---->**String**<!----> |  |  [optional] |
| **outboundLineCount** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **errors** | <!----><!---->[**List&lt;DialerCampaignConfigChangeRestErrorDetail&gt;**](DialerCampaignConfigChangeRestErrorDetail.html)<!----> |  |  [optional] |
| **ruleSets** | <!----><!---->[**List&lt;DialerCampaignConfigChangeUriReference&gt;**](DialerCampaignConfigChangeUriReference.html)<!----> |  |  [optional] |
| **skipPreviewDisabled** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **previewTimeOutSeconds** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **singleNumberPreview** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **contactSort** | <!----><!---->[**DialerCampaignConfigChangeContactSort**](DialerCampaignConfigChangeContactSort.html)<!----> |  |  [optional] |
| **contactSorts** | <!----><!---->[**List&lt;DialerCampaignConfigChangeContactSort&gt;**](DialerCampaignConfigChangeContactSort.html)<!----> |  |  [optional] |
| **noAnswerTimeout** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **callAnalysisLanguage** | <!----><!---->**String**<!----> |  |  [optional] |
| **priority** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **contactListFilters** | <!----><!---->[**List&lt;DialerCampaignConfigChangeUriReference&gt;**](DialerCampaignConfigChangeUriReference.html)<!----> |  |  [optional] |
| **division** | <!----><!---->[**DialerCampaignConfigChangeUriReference**](DialerCampaignConfigChangeUriReference.html)<!----> |  |  [optional] |
| **agentOwnedColumn** | <!----><!---->**String**<!----> |  |  [optional] |
| **additionalProperties** | <!----><!---->**Object**<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="DialingModeEnum"></a>

## Enum: DialingModeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| AGENTLESS | &quot;AGENTLESS&quot; |
| EXTERNAL | &quot;EXTERNAL&quot; |
| PREVIEW | &quot;PREVIEW&quot; |
| POWER | &quot;POWER&quot; |
| PREDICTIVE | &quot;PREDICTIVE&quot; |
| PROGRESSIVE | &quot;PROGRESSIVE&quot; |
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



