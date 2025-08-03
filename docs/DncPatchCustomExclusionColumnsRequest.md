# DncPatchCustomExclusionColumnsRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **action** | [**ActionEnum**](#Enum--ActionEnum) | The action to perform |  [optional] |
| **customExclusionColumnEntries** | **List&lt;String&gt;** | The list of custom exclusion column entries to Add to / Remove from the DNC list  |  [optional] |
| **expirationDateTime** | **String** | Expiration date for DNC customExclusionColumnEntries in yyyy-MM-ddTHH:mmZ format |  [optional] |


## Enum: ActionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ADD | &quot;Add&quot; | 
| REMOVE | &quot;Remove&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:229.0.0_
