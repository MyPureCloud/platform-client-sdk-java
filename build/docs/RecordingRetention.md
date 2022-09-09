---
title: RecordingRetention
---
## RecordingRetention


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **conversationId** | <!----><!---->**String**<!----> |  |  [optional] |
| **recordingId** | <!----><!---->**String**<!----> |  |  [optional] |
| **archiveDate** | <!----><!---->[**Date**](Date.html)<!----> | The date the recording will be archived. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **archiveMedium** | [**ArchiveMediumEnum**](#ArchiveMediumEnum)<!----> | The type of archive medium used. Example: CloudArchive |  [optional] |
| **deleteDate** | <!----><!---->[**Date**](Date.html)<!----> | The date the recording will be deleted. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **exportDate** | <!----><!---->[**Date**](Date.html)<!----> | The date the recording will be exported. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **exportedDate** | <!----><!---->[**Date**](Date.html)<!----> | The date the recording was exported. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **creationTime** | <!----><!---->[**Date**](Date.html)<!----> | The creation time of the recording. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
{: class="table table-striped"}


<a name="ArchiveMediumEnum"></a>

## Enum: ArchiveMediumEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CLOUDARCHIVE | &quot;CLOUDARCHIVE&quot; | 
{: class="table table-striped"}



