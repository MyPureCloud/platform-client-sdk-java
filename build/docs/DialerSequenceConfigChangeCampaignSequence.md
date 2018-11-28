---
title: DialerSequenceConfigChangeCampaignSequence
---
## DialerSequenceConfigChangeCampaignSequence


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **name** | **String** |  |  [optional] |
| **dateCreated** | [**Date**](Date.html) |  |  [optional] |
| **dateModified** | [**Date**](Date.html) |  |  [optional] |
| **version** | **Integer** |  |  [optional] |
| **campaigns** | [**List&lt;DialerSequenceConfigChangeUriReference&gt;**](DialerSequenceConfigChangeUriReference.html) |  |  [optional] |
| **currentCampaign** | **Integer** |  |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
| **stopMessage** | **String** |  |  [optional] |
| **repeat** | **Boolean** |  |  [optional] |
| **additionalProperties** | **Object** |  |  [optional] |
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ON | &quot;ON&quot; |
| OFF | &quot;OFF&quot; |
| COMPLETE | &quot;COMPLETE&quot; |
{: class="table table-striped"}



