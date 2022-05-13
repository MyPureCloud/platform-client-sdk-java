---
title: Campaign
---
## Campaign


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> | The name of the Campaign. |  |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | Creation time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | Last modified time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **version** | <!----><!---->**Integer**<!----> | Required for updates, must match the version number of the most recent update |  [optional] |
| **contactList** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | The ContactList for this Campaign to dial. |  |
| **queue** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | The Queue for this Campaign to route calls to. Required for all dialing modes except agentless. |  [optional] |
| **dialingMode** | [**DialingModeEnum**](#DialingModeEnum)<!----> | The strategy this Campaign will use for dialing. |  |
| **script** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | The Script to be displayed to agents that are handling outbound calls. Required for all dialing modes except agentless. |  [optional] |
| **edgeGroup** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | The EdgeGroup that will place the calls. Required for all dialing modes except preview. |  [optional] |
| **site** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | The identifier of the site to be used for dialing; can be set in place of an edge group. |  [optional] |
| **campaignStatus** | [**CampaignStatusEnum**](#CampaignStatusEnum)<!----> | The current status of the Campaign. A Campaign may be turned 'on' or 'off'. Required for updates. |  [optional] |
| **phoneColumns** | <!----><!---->[**List&lt;PhoneColumn&gt;**](PhoneColumn.html)<!----> | The ContactPhoneNumberColumns on the ContactList that this Campaign should dial. |  |
| **abandonRate** | <!----><!---->**Double**<!----> | The targeted abandon rate percentage. Required for progressive, power, and predictive campaigns. |  [optional] |
| **dncLists** | <!----><!---->[**List&lt;DomainEntityRef&gt;**](DomainEntityRef.html)<!----> | DncLists for this Campaign to check before placing a call. |  [optional] |
| **callableTimeSet** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | The callable time set for this campaign to check before placing a call. |  [optional] |
| **callAnalysisResponseSet** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | The call analysis response set to handle call analysis results from the edge. Required for all dialing modes except preview. |  [optional] |
| **errors** | <!----><!---->[**List&lt;RestErrorDetail&gt;**](RestErrorDetail.html)<!----> | A list of current error conditions associated with the campaign. |  [optional] |
| **callerName** | <!----><!---->**String**<!----> | The caller id name to be displayed on the outbound call. |  |
| **callerAddress** | <!----><!---->**String**<!----> | The caller id phone number to be displayed on the outbound call. |  |
| **outboundLineCount** | <!----><!---->**Integer**<!----> | The number of outbound lines to be concurrently dialed. Only applicable to non-preview campaigns; only required for agentless. |  [optional] |
| **ruleSets** | <!----><!---->[**List&lt;DomainEntityRef&gt;**](DomainEntityRef.html)<!----> | Rule sets to be applied while this campaign is dialing. |  [optional] |
| **skipPreviewDisabled** | <!----><!---->**Boolean**<!----> | Whether or not agents can skip previews without placing a call. Only applicable for preview campaigns. |  [optional] |
| **previewTimeOutSeconds** | <!----><!---->**Long**<!----> | The number of seconds before a call will be automatically placed on a preview. A value of 0 indicates no automatic placement of calls. Only applicable to preview campaigns. |  [optional] |
| **alwaysRunning** | <!----><!---->**Boolean**<!----> | Indicates (when true) that the campaign will remain on after contacts are depleted, allowing additional contacts to be appended/added to the contact list and processed by the still-running campaign. The campaign can still be turned off manually. |  [optional] |
| **contactSort** | <!----><!---->[**ContactSort**](ContactSort.html)<!----> | The order in which to sort contacts for dialing, based on a column. |  [optional] |
| **contactSorts** | <!----><!---->[**List&lt;ContactSort&gt;**](ContactSort.html)<!----> | The order in which to sort contacts for dialing, based on up to four columns. |  [optional] |
| **noAnswerTimeout** | <!----><!---->**Integer**<!----> | How long to wait before dispositioning a call as 'no-answer'. Default 30 seconds. Only applicable to non-preview campaigns. |  [optional] |
| **callAnalysisLanguage** | <!----><!---->**String**<!----> | The language the edge will use to analyze the call. |  [optional] |
| **priority** | <!----><!---->**Integer**<!----> | The priority of this campaign relative to other campaigns that are running on the same queue. 5 is the highest priority, 1 the lowest. |  [optional] |
| **contactListFilters** | <!----><!---->[**List&lt;DomainEntityRef&gt;**](DomainEntityRef.html)<!----> | Filter to apply to the contact list before dialing. Currently a campaign can only have one filter applied. |  [optional] |
| **division** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | The division this campaign belongs to. |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="DialingModeEnum"></a>

## Enum: DialingModeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AGENTLESS | &quot;agentless&quot; | 
| PREVIEW | &quot;preview&quot; | 
| POWER | &quot;power&quot; | 
| PREDICTIVE | &quot;predictive&quot; | 
| PROGRESSIVE | &quot;progressive&quot; | 
| EXTERNAL | &quot;external&quot; | 
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
| FORCED_OFF | &quot;forced_off&quot; | 
| FORCED_STOPPING | &quot;forced_stopping&quot; | 
{: class="table table-striped"}



