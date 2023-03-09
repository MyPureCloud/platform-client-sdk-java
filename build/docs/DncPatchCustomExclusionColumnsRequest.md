---
title: DncPatchCustomExclusionColumnsRequest
---
## DncPatchCustomExclusionColumnsRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **action** | [**ActionEnum**](#ActionEnum)<!----> | The action to perform |  [optional] |
| **customExclusionColumnEntries** | <!----><!---->**List&lt;String&gt;**<!----> | The list of custom exclusion column entries to Add to / Remove from the DNC list  |  [optional] |
| **expirationDateTime** | <!----><!---->**String**<!----> | Expiration date for DNC customExclusionColumnEntries in yyyy-MM-ddTHH:mmZ format |  [optional] |
{: class="table table-striped"}


<a name="ActionEnum"></a>

## Enum: ActionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ADD | &quot;Add&quot; | 
| REMOVE | &quot;Remove&quot; | 
{: class="table table-striped"}



