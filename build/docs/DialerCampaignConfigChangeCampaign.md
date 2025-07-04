# DialerCampaignConfigChangeCampaign


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **contactList** | [**DialerCampaignConfigChangeUriReference**](DialerCampaignConfigChangeUriReference) |  |  [optional] |
| **queue** | [**DialerCampaignConfigChangeUriReference**](DialerCampaignConfigChangeUriReference) | A UriReference for a resource |  [optional] |
| **dialingMode** | [**DialingModeEnum**](#Enum--DialingModeEnum) | dialing mode of the campaign |  [optional] |
| **script** | [**DialerCampaignConfigChangeUriReference**](DialerCampaignConfigChangeUriReference) | A UriReference for a resource |  [optional] |
| **edgeGroup** | [**DialerCampaignConfigChangeUriReference**](DialerCampaignConfigChangeUriReference) | A UriReference for a resource |  [optional] |
| **site** | [**DialerCampaignConfigChangeUriReference**](DialerCampaignConfigChangeUriReference) | A UriReference for a resource |  [optional] |
| **campaignStatus** | [**CampaignStatusEnum**](#Enum--CampaignStatusEnum) |  |  [optional] |
| **phoneColumns** | [**List&lt;DialerCampaignConfigChangePhoneColumn&gt;**](DialerCampaignConfigChangePhoneColumn) | the contact list phone columns to be called for the campaign |  [optional] |
| **abandonRate** | [**BigDecimal**](BigDecimal) | the targeted abandon rate percentage |  [optional] |
| **dncLists** | [**List&lt;DialerCampaignConfigChangeUriReference&gt;**](DialerCampaignConfigChangeUriReference) | identifiers of the do not call lists |  [optional] |
| **callableTimeSet** | [**DialerCampaignConfigChangeUriReference**](DialerCampaignConfigChangeUriReference) | A UriReference for a resource |  [optional] |
| **callAnalysisResponseSet** | [**DialerCampaignConfigChangeUriReference**](DialerCampaignConfigChangeUriReference) | A UriReference for a resource |  [optional] |
| **callerName** | **String** | caller id name to be displayed on the outbound call |  [optional] |
| **callerAddress** | **String** | caller id phone number to be displayed on the outbound call |  [optional] |
| **outboundLineCount** | **Long** | for agentless campaigns, the number of outbound lines to be concurrently dialed |  [optional] |
| **errors** | [**List&lt;DialerCampaignConfigChangeRestErrorDetail&gt;**](DialerCampaignConfigChangeRestErrorDetail) | a list of current error conditions associated with the campaign |  [optional] |
| **ruleSets** | [**List&lt;DialerCampaignConfigChangeUriReference&gt;**](DialerCampaignConfigChangeUriReference) | identifiers of the rule sets |  [optional] |
| **skipPreviewDisabled** | **Boolean** | for preview campaigns, indicator of whether the agent can skip a preview without placing a call |  [optional] |
| **previewTimeOutSeconds** | **Long** | for preview campaigns, number of seconds before a call will be automatically placed. A value of 0 indicates no automatic placement of calls |  [optional] |
| **singleNumberPreview** | **Boolean** | for preview campaigns with multiple phone columns, indicator if one (true) or multiple (false) phone numbers will be available to call for each preview |  [optional] |
| **contactSort** | [**DialerCampaignConfigChangeContactSort**](DialerCampaignConfigChangeContactSort) |  |  [optional] |
| **contactSorts** | [**List&lt;DialerCampaignConfigChangeContactSort&gt;**](DialerCampaignConfigChangeContactSort) | List of contact sort objects. |  [optional] |
| **noAnswerTimeout** | **Long** | for non-preview campaigns, how long to wait before dispositioning as 'no-answer', default 30 seconds |  [optional] |
| **callAnalysisLanguage** | **String** | The language the edge will use to analyze the call |  [optional] |
| **priority** | **Long** | The priority of this campaign relative to other campaigns |  [optional] |
| **contactListFilters** | [**List&lt;DialerCampaignConfigChangeUriReference&gt;**](DialerCampaignConfigChangeUriReference) | List of contact filters |  [optional] |
| **division** | [**DialerCampaignConfigChangeUriReference**](DialerCampaignConfigChangeUriReference) | A UriReference for a resource |  [optional] |
| **agentOwnedColumn** | **String** | For Preview Campaigns. Name of the contact column in the contact list containing the userIds of agents to assign specific contact records to. |  [optional] |
| **additionalProperties** | **Map&lt;String, Object&gt;** |  |  [optional] |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The UI-visible name of the object |  [optional] |
| **dateCreated** | [**Date**](Date) | Creation time of the entity |  [optional] |
| **dateModified** | [**Date**](Date) | Last modified time of the entity |  [optional] |
| **version** | **Long** | Required for updates, must match the version number of the most recent update |  [optional] |


## Enum: DialingModeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AGENTLESS | &quot;agentless&quot; | 
| EXTERNAL | &quot;external&quot; | 
| PREVIEW | &quot;preview&quot; | 
| POWER | &quot;power&quot; | 
| PREDICTIVE | &quot;predictive&quot; | 
| PROGRESSIVE | &quot;progressive&quot; | 


## Enum: CampaignStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ON | &quot;on&quot; | 
| OFF | &quot;off&quot; | 
| COMPLETE | &quot;complete&quot; | 
| STOPPING | &quot;stopping&quot; | 
| INVALID | &quot;invalid&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
