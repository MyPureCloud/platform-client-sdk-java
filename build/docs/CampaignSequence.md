---
title: CampaignSequence
---
## CampaignSequence


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | Creation time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | Last modified time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **version** | <!----><!---->**Integer**<!----> | Required for updates, must match the version number of the most recent update |  [optional] |
| **campaigns** | <!----><!---->[**List&lt;DomainEntityRef&gt;**](DomainEntityRef.html)<!----> | The ordered list of Campaigns that this CampaignSequence will run. |  |
| **currentCampaign** | <!----><!---->**Integer**<!----> | A zero-based index indicating which Campaign this CampaignSequence is currently on. |  |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | The current status of the CampaignSequence. A CampaignSequence can be turned 'on' or 'off'. |  |
| **stopMessage** | <!----><!---->**String**<!----> | A message indicating if and why a CampaignSequence has stopped unexpectedly. |  [optional] |
| **repeat** | <!----><!---->**Boolean**<!----> | Indicates if a sequence should repeat from the beginning after the last campaign completes. Default is false. |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ON | &quot;on&quot; | 
| OFF | &quot;off&quot; | 
| COMPLETE | &quot;complete&quot; | 
{: class="table table-striped"}



