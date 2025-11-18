# DialerSequenceConfigChangeCampaignSequence


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **campaigns** | [**List&lt;DialerSequenceConfigChangeUriReference&gt;**](DialerSequenceConfigChangeUriReference) | the ordered list of campaign identifiers |  [optional] |
| **currentCampaign** | **Long** | the zero-based index of the current campaign in the campaigns list |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) |  |  [optional] |
| **stopMessage** | **String** | if a sequence has unexpectedly stopped, this message provides the reason |  [optional] |
| **repeat** | **Boolean** | indicates if a sequence is to repeat from the beginning after the last campaign completes; default is false |  [optional] |
| **additionalProperties** | **Map&lt;String, Object&gt;** |  |  [optional] |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The UI-visible name of the object |  [optional] |
| **dateCreated** | [**Date**](Date) | Creation time of the entity |  [optional] |
| **dateModified** | [**Date**](Date) | Last modified time of the entity |  [optional] |
| **version** | **Long** | Required for updates, must match the version number of the most recent update |  [optional] |
| **getAdditionalProperties** | **Map&lt;String, Object&gt;** |  |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ON | &quot;on&quot; | 
| OFF | &quot;off&quot; | 
| COMPLETE | &quot;complete&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:237.0.0_
