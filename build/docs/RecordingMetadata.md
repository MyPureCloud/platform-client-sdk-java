# RecordingMetadata


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **conversationId** | **String** |  |  [optional] |
| **path** | **String** |  |  [optional] |
| **startTime** | **String** | The start time of the recording for screen recordings. Null for other types. |  [optional] |
| **endTime** | **String** |  |  [optional] |
| **media** | **String** | The type of media that the recording is. At the moment that could be audio, chat, email, or message. |  [optional] |
| **mediaSubtype** | [**MediaSubtypeEnum**](#Enum--MediaSubtypeEnum) | The recording media subtype. |  [optional] |
| **mediaSubject** | **String** | The recording media subject. |  [optional] |
| **annotations** | [**List&lt;Annotation&gt;**](Annotation) | Annotations that belong to the recording. Populated when recording filestate is AVAILABLE. |  [optional] |
| **fileState** | [**FileStateEnum**](#Enum--FileStateEnum) | Represents the current file state for a recording. Examples: Uploading, Archived, etc |  [optional] |
| **restoreExpirationTime** | [**Date**](Date) | The amount of time a restored recording will remain restored before being archived again. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **archiveDate** | [**Date**](Date) | The date the recording will be archived. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **archiveMedium** | [**ArchiveMediumEnum**](#Enum--ArchiveMediumEnum) | The type of archive medium used. Example: CloudArchive |  [optional] |
| **deleteDate** | [**Date**](Date) | The date the recording will be deleted. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **exportDate** | [**Date**](Date) | The date the recording will be exported. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **exportedDate** | [**Date**](Date) | The date the recording was exported. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **maxAllowedRestorationsForOrg** | **Integer** | How many archive restorations the organization is allowed to have. |  [optional] |
| **remainingRestorationsAllowedForOrg** | **Integer** | The remaining archive restorations the organization has. |  [optional] |
| **sessionId** | **String** | The session id represents an external resource id, such as email, call, chat, etc |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: MediaSubtypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| TRUNK | &quot;Trunk&quot; | 
| STATION | &quot;Station&quot; | 
| CONSULT | &quot;Consult&quot; | 
| SCREEN | &quot;Screen&quot; | 


## Enum: FileStateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ARCHIVED | &quot;ARCHIVED&quot; | 
| AVAILABLE | &quot;AVAILABLE&quot; | 
| DELETED | &quot;DELETED&quot; | 
| RESTORED | &quot;RESTORED&quot; | 
| RESTORING | &quot;RESTORING&quot; | 
| UPLOADING | &quot;UPLOADING&quot; | 
| ERROR | &quot;ERROR&quot; | 


## Enum: ArchiveMediumEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CLOUDARCHIVE | &quot;CLOUDARCHIVE&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:223.1.0_
