---
title: DialerSequenceConfigChangeCampaignSequence
---
## DialerSequenceConfigChangeCampaignSequence


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **campaigns** | <!----><!---->[**List&lt;DialerSequenceConfigChangeUriReference&gt;**](DialerSequenceConfigChangeUriReference.html)<!----> | the ordered list of campaign identifiers |  [optional] |
| **currentCampaign** | <!----><!---->**Integer**<!----> | the zero-based index of the current campaign in the campaigns list |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> |  |  [optional] |
| **stopMessage** | <!----><!---->**String**<!----> | if a sequence has unexpectedly stopped, this message provides the reason |  [optional] |
| **repeat** | <!----><!---->**Boolean**<!----> | indicates if a sequence is to repeat from the beginning after the last campaign completes; default is false |  [optional] |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> | The UI-visible name of the object |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | Creation time of the entity |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | Last modified time of the entity |  [optional] |
| **version** | <!----><!---->**Integer**<!----> | Required for updates, must match the version number of the most recent update |  [optional] |
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



