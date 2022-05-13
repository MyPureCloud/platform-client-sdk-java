---
title: Recording
---
## Recording


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **conversationId** | <!----><!---->**String**<!----> |  |  [optional] |
| **path** | <!----><!---->**String**<!----> |  |  [optional] |
| **startTime** | <!----><!---->**String**<!----> | The start time of the recording. Null when there is no playable media. |  [optional] |
| **endTime** | <!----><!---->**String**<!----> | The end time of the recording. Null when there is no playable media. |  [optional] |
| **media** | <!----><!---->**String**<!----> | The type of media that the recording is. At the moment that could be audio, chat, or email. |  [optional] |
| **annotations** | <!----><!---->[**List&lt;Annotation&gt;**](Annotation.html)<!----> | Annotations that belong to the recording. |  [optional] |
| **transcript** | <!----><!---->[**List&lt;ChatMessage&gt;**](ChatMessage.html)<!----> | Represents a chat transcript |  [optional] |
| **emailTranscript** | <!----><!---->[**List&lt;RecordingEmailMessage&gt;**](RecordingEmailMessage.html)<!----> | Represents an email transcript |  [optional] |
| **messagingTranscript** | <!----><!---->[**List&lt;RecordingMessagingMessage&gt;**](RecordingMessagingMessage.html)<!----> | Represents a messaging transcript |  [optional] |
| **fileState** | [**FileStateEnum**](#FileStateEnum)<!----> | Represents the current file state for a recording. Examples: Uploading, Archived, etc |  [optional] |
| **restoreExpirationTime** | <!----><!---->[**Date**](Date.html)<!----> | The amount of time a restored recording will remain restored before being archived again. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **mediaUris** | <!----><!---->[**Map&lt;String, MediaResult&gt;**](MediaResult.html)<!----> | The different mediaUris for the recording. Null when there is no playable media. |  [optional] |
| **estimatedTranscodeTimeMs** | <!----><!---->**Long**<!----> |  |  [optional] |
| **actualTranscodeTimeMs** | <!----><!---->**Long**<!----> |  |  [optional] |
| **archiveDate** | <!----><!---->[**Date**](Date.html)<!----> | The date the recording will be archived. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **archiveMedium** | [**ArchiveMediumEnum**](#ArchiveMediumEnum)<!----> | The type of archive medium used. Example: CloudArchive |  [optional] |
| **deleteDate** | <!----><!---->[**Date**](Date.html)<!----> | The date the recording will be deleted. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **exportDate** | <!----><!---->[**Date**](Date.html)<!----> | The date the recording will be exported. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **exportedDate** | <!----><!---->[**Date**](Date.html)<!----> | The date the recording was exported. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **outputDurationMs** | <!----><!---->**Integer**<!----> | Duration of transcoded media in milliseconds |  [optional] |
| **outputSizeInBytes** | <!----><!---->**Integer**<!----> | Size of transcoded media in bytes. 0 if there is no transcoded media. |  [optional] |
| **maxAllowedRestorationsForOrg** | <!----><!---->**Integer**<!----> | How many archive restorations the organization is allowed to have. |  [optional] |
| **remainingRestorationsAllowedForOrg** | <!----><!---->**Integer**<!----> | The remaining archive restorations the organization has. |  [optional] |
| **sessionId** | <!----><!---->**String**<!----> | The session id represents an external resource id, such as email, call, chat, etc |  [optional] |
| **users** | <!----><!---->[**List&lt;User&gt;**](User.html)<!----> | The users participating in the conversation |  [optional] |
| **recordingFileRole** | [**RecordingFileRoleEnum**](#RecordingFileRoleEnum)<!----> | Role of the file recording. It can be either customer_experience or adhoc. |  [optional] |
| **recordingErrorStatus** | [**RecordingErrorStatusEnum**](#RecordingErrorStatusEnum)<!----> | Status of a recording that cannot be returned because of an error |  [optional] |
| **originalRecordingStartTime** | <!----><!---->[**Date**](Date.html)<!----> | The start time of the full recording, before any segment access restrictions are applied. Null when there is no playable media. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **creationTime** | <!----><!---->[**Date**](Date.html)<!----> | The creation time of the recording. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="FileStateEnum"></a>

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
{: class="table table-striped"}


<a name="ArchiveMediumEnum"></a>

## Enum: ArchiveMediumEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CLOUDARCHIVE | &quot;CLOUDARCHIVE&quot; | 
{: class="table table-striped"}


<a name="RecordingFileRoleEnum"></a>

## Enum: RecordingFileRoleEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CUSTOMER_EXPERIENCE | &quot;CUSTOMER_EXPERIENCE&quot; | 
| ADHOC | &quot;ADHOC&quot; | 
{: class="table table-striped"}


<a name="RecordingErrorStatusEnum"></a>

## Enum: RecordingErrorStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EMAIL_TRANSCRIPT_TOO_LARGE | &quot;EMAIL_TRANSCRIPT_TOO_LARGE&quot; | 
{: class="table table-striped"}



