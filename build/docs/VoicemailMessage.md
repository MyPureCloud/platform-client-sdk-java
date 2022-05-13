---
title: VoicemailMessage
---
## VoicemailMessage


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **conversation** | <!----><!---->[**Conversation**](Conversation.html)<!----> | The conversation that the voicemail message is associated with |  [optional] |
| **read** | <!----><!---->**Boolean**<!----> | Whether the voicemail message is marked as read |  [optional] |
| **audioRecordingDurationSeconds** | <!----><!---->**Integer**<!----> | The voicemail message's audio recording duration in seconds |  [optional] |
| **audioRecordingSizeBytes** | <!----><!---->**Long**<!----> | The voicemail message's audio recording size in bytes |  [optional] |
| **createdDate** | <!----><!---->[**Date**](Date.html)<!----> | The date the voicemail message was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **modifiedDate** | <!----><!---->[**Date**](Date.html)<!----> | The date the voicemail message was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **deletedDate** | <!----><!---->[**Date**](Date.html)<!----> | The date the voicemail message deleted property was set to true. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **callerAddress** | <!----><!---->**String**<!----> | The caller address |  [optional] |
| **callerName** | <!----><!---->**String**<!----> | Optionally the name of the caller that left the voicemail message if the caller was a known user |  [optional] |
| **callerUser** | <!----><!---->[**User**](User.html)<!----> | Optionally the user that left the voicemail message if the caller was a known user |  [optional] |
| **deleted** | <!----><!---->**Boolean**<!----> | Whether the voicemail message has been marked as deleted |  [optional] |
| **note** | <!----><!---->**String**<!----> | An optional note |  [optional] |
| **user** | <!----><!---->[**User**](User.html)<!----> | The user that the voicemail message belongs to or null which means the voicemail message belongs to a group or queue |  [optional] |
| **group** | <!----><!---->[**Group**](Group.html)<!----> | The group that the voicemail message belongs to or null which means the voicemail message belongs to a user or queue |  [optional] |
| **queue** | <!----><!---->[**Queue**](Queue.html)<!----> | The queue that the voicemail message belongs to or null which means the voicemail message belongs to a user or group |  [optional] |
| **copiedFrom** | <!----><!---->[**VoicemailCopyRecord**](VoicemailCopyRecord.html)<!----> | Represents where this voicemail message was copied from |  [optional] |
| **copiedTo** | <!----><!---->[**List&lt;VoicemailCopyRecord&gt;**](VoicemailCopyRecord.html)<!----> | Represents where this voicemail has been copied to |  [optional] |
| **deleteRetentionPolicy** | <!----><!---->[**VoicemailRetentionPolicy**](VoicemailRetentionPolicy.html)<!----> | The retention policy for this voicemail when deleted is set to true |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}



