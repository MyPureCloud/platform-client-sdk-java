# Topic


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **description** | **String** |  |  [optional] |
| **published** | **Boolean** |  |  [optional] |
| **strictness** | [**StrictnessEnum**](#Enum--StrictnessEnum) |  |  [optional] |
| **programs** | [**List&lt;BaseProgramEntity&gt;**](BaseProgramEntity) |  |  [optional] |
| **tags** | **List&lt;String&gt;** |  |  [optional] |
| **dialect** | **String** |  |  [optional] |
| **participants** | [**ParticipantsEnum**](#Enum--ParticipantsEnum) |  |  [optional] |
| **phrases** | [**List&lt;Phrase&gt;**](Phrase) |  |  [optional] |
| **modifiedBy** | [**AddressableEntityRef**](AddressableEntityRef) |  |  [optional] |
| **dateModified** | [**Date**](Date) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **publishedBy** | [**AddressableEntityRef**](AddressableEntityRef) |  |  [optional] |
| **datePublished** | [**Date**](Date) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StrictnessEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| _1 | &quot;1&quot; | 
| _55 | &quot;55&quot; | 
| _65 | &quot;65&quot; | 
| _72 | &quot;72&quot; | 
| _85 | &quot;85&quot; | 
| _90 | &quot;90&quot; | 


## Enum: ParticipantsEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EXTERNAL | &quot;External&quot; | 
| INTERNAL | &quot;Internal&quot; | 
| ALL | &quot;All&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
