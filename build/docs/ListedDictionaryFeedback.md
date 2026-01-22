# ListedDictionaryFeedback


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **term** | **String** | The dictionary term which needs to be added to dictionary feedback system |  |
| **dialect** | **String** | The dialect for the given term, dialect format is {language}-{country} where language follows ISO 639-1 standard and country follows ISO 3166-1 alpha 2 standard |  |
| **boostValue** | **Float** | A weighted value assigned to a phrase. The higher the value, the higher the likelihood that the system will choose the word or phrase from the possible alternatives. Boost range is from 1.0 to 10.0. Default is 2.0 |  [optional] |
| **source** | [**SourceEnum**](#Enum--SourceEnum) | The source of the given dictionary feedback |  [optional] |
| **dateCreated** | [**Date**](Date) | The Timestamp when dictionary feedback created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **createdBy** | [**UserReference**](UserReference) | The Id of the user who created the dictionary feedback |  [optional] |
| **dateModified** | [**Date**](Date) | The Timestamp when dictionary feedback modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **modifiedBy** | [**UserReference**](UserReference) | The Id of the user who modified the dictionary feedback |  [optional] |
| **transcriptionEngine** | [**TranscriptionEngineEnum**](#Enum--TranscriptionEngineEnum) | The transcription engine for the dictionary feedback. Only returned when GenesysExtended feature is enabled. |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The status of the dictionary feedback. Only returned when GenesysExtended feature is enabled. |  [optional] |
| **displayAs** | **String** | The display name for the dictionary feedback. Only returned when GenesysExtended feature is enabled. This field is only valid for Extended Services transcription engine. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: SourceEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| MANUAL | &quot;Manual&quot; | 


## Enum: TranscriptionEngineEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| GENESYS | &quot;Genesys&quot; | 
| GENESYSEXTENDED | &quot;GenesysExtended&quot; | 


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACTIVE | &quot;Active&quot; | 
| PENDING | &quot;Pending&quot; | 
| FAILED | &quot;Failed&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:245.0.0_
