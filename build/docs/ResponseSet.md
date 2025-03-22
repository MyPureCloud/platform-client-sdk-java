# ResponseSet


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The name of the ResponseSet. |  |
| **dateCreated** | [**Date**](Date) | Creation time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | Last modified time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **version** | **Integer** | Required for updates, must match the version number of the most recent update |  [optional] |
| **responses** | [**Map&lt;String, Reaction&gt;**](Reaction) | Map of disposition identifiers to reactions. For example: {\"disposition.classification.callable.person\": {\"reactionType\": \"transfer\"}}. |  |
| **beepDetectionEnabled** | **Boolean** | Whether to enable answering machine beep detection |  [optional] |
| **amdSpeechDistinguishEnabled** | **Boolean** | Whether to enable answering machine detection |  [optional] |
| **liveSpeakerDetectionMode** | [**LiveSpeakerDetectionModeEnum**](#Enum--LiveSpeakerDetectionModeEnum) | Setting level of live speaker detection based on ringbacks |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: LiveSpeakerDetectionModeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DISABLED | &quot;Disabled&quot; | 
| LOW | &quot;Low&quot; | 
| MEDIUM | &quot;Medium&quot; | 
| HIGH | &quot;High&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:222.0.0_
