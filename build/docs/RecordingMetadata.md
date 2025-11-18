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
| **maxAllowedRestorationsForOrg** | **Integer** | How many archive restorations the organization is allowed to have. Deprecated - Always returns 10000 since the restoration limit is no longer enforced. |  [optional] |
| **remainingRestorationsAllowedForOrg** | **Integer** | The remaining archive restorations the organization has. Deprecated - Always returns 10000 since the restoration limit is no longer enforced. |  [optional] |
| **sessionId** | **String** | The session id represents an external resource id, such as email, call, chat, etc |  [optional] |
| **region** | [**RegionEnum**](#Enum--RegionEnum) | The region the source recording is stored in |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: MediaSubtypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| TRUNK | &quot;Trunk&quot; | 
| STATION | &quot;Station&quot; | 
| CONSULT | &quot;Consult&quot; | 
| SCREEN | &quot;Screen&quot; | 
| SNIPPET | &quot;Snippet&quot; | 


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


## Enum: RegionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AF_SOUTH_1 | &quot;af-south-1&quot; | 
| AP_EAST_1 | &quot;ap-east-1&quot; | 
| AP_NORTHEAST_1 | &quot;ap-northeast-1&quot; | 
| AP_NORTHEAST_2 | &quot;ap-northeast-2&quot; | 
| AP_NORTHEAST_3 | &quot;ap-northeast-3&quot; | 
| AP_SOUTH_1 | &quot;ap-south-1&quot; | 
| AP_SOUTHEAST_1 | &quot;ap-southeast-1&quot; | 
| AP_SOUTHEAST_2 | &quot;ap-southeast-2&quot; | 
| AP_SOUTHEAST_3 | &quot;ap-southeast-3&quot; | 
| CA_CENTRAL_1 | &quot;ca-central-1&quot; | 
| EU_CENTRAL_1 | &quot;eu-central-1&quot; | 
| EU_CENTRAL_2 | &quot;eu-central-2&quot; | 
| EU_WEST_1 | &quot;eu-west-1&quot; | 
| EU_WEST_2 | &quot;eu-west-2&quot; | 
| EU_WEST_3 | &quot;eu-west-3&quot; | 
| ME_CENTRAL_1 | &quot;me-central-1&quot; | 
| MX_CENTRAL_1 | &quot;mx-central-1&quot; | 
| SA_EAST_1 | &quot;sa-east-1&quot; | 
| US_EAST_1 | &quot;us-east-1&quot; | 
| US_WEST_2 | &quot;us-west-2&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:237.0.0_
