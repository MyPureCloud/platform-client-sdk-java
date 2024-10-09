# RecordingRetention


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **conversationId** | **String** |  |  [optional] |
| **recordingId** | **String** |  |  [optional] |
| **archiveDate** | [**Date**](Date) | The date the recording will be archived. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **archiveMedium** | [**ArchiveMediumEnum**](#Enum--ArchiveMediumEnum) | The type of archive medium used. Example: CloudArchive |  [optional] |
| **deleteDate** | [**Date**](Date) | The date the recording will be deleted. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **exportDate** | [**Date**](Date) | The date the recording will be exported. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **exportedDate** | [**Date**](Date) | The date the recording was exported. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **creationTime** | [**Date**](Date) | The creation time of the recording. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |


## Enum: ArchiveMediumEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CLOUDARCHIVE | &quot;CLOUDARCHIVE&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:210.0.0_
