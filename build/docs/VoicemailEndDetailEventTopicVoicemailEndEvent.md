---
title: VoicemailEndDetailEventTopicVoicemailEndEvent
---
## VoicemailEndDetailEventTopicVoicemailEndEvent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **eventTime** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **conversationId** | <!----><!---->**String**<!----> |  |  [optional] |
| **participantId** | <!----><!---->**String**<!----> |  |  [optional] |
| **sessionId** | <!----><!---->**String**<!----> |  |  [optional] |
| **disconnectType** | [**DisconnectTypeEnum**](#DisconnectTypeEnum)<!----> |  |  [optional] |
| **mediaType** | [**MediaTypeEnum**](#MediaTypeEnum)<!----> |  |  [optional] |
| **provider** | <!----><!---->**String**<!----> |  |  [optional] |
| **direction** | [**DirectionEnum**](#DirectionEnum)<!----> |  |  [optional] |
| **ani** | <!----><!---->**String**<!----> |  |  [optional] |
| **dnis** | <!----><!---->**String**<!----> |  |  [optional] |
| **userId** | <!----><!---->**String**<!----> |  |  [optional] |
| **queueId** | <!----><!---->**String**<!----> |  |  [optional] |
| **divisionId** | <!----><!---->**String**<!----> |  |  [optional] |
| **voicemailDurationMs** | <!----><!---->**Integer**<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="DisconnectTypeEnum"></a>

## Enum: DisconnectTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;UNKNOWN&quot; | 
| ENDPOINT | &quot;ENDPOINT&quot; | 
| CLIENT | &quot;CLIENT&quot; | 
| SYSTEM | &quot;SYSTEM&quot; | 
| TRANSFER | &quot;TRANSFER&quot; | 
| ERROR | &quot;ERROR&quot; | 
| PEER | &quot;PEER&quot; | 
| OTHER | &quot;OTHER&quot; | 
| SPAM | &quot;SPAM&quot; | 
| TIMEOUT | &quot;TIMEOUT&quot; | 
| TRANSPORT_FAILURE | &quot;TRANSPORT_FAILURE&quot; | 
| CONFERENCE_TRANSFER | &quot;CONFERENCE_TRANSFER&quot; | 
| CONSULT_TRANSFER | &quot;CONSULT_TRANSFER&quot; | 
| FORWARD_TRANSFER | &quot;FORWARD_TRANSFER&quot; | 
| NO_ANSWER_TRANSFER | &quot;NO_ANSWER_TRANSFER&quot; | 
| NOT_AVAILABLE_TRANSFER | &quot;NOT_AVAILABLE_TRANSFER&quot; | 
| UNCALLABLE | &quot;UNCALLABLE&quot; | 
{: class="table table-striped"}


<a name="MediaTypeEnum"></a>

## Enum: MediaTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;UNKNOWN&quot; | 
| VOICE | &quot;VOICE&quot; | 
| CHAT | &quot;CHAT&quot; | 
| EMAIL | &quot;EMAIL&quot; | 
| CALLBACK | &quot;CALLBACK&quot; | 
| COBROWSE | &quot;COBROWSE&quot; | 
| VIDEO | &quot;VIDEO&quot; | 
| SCREENSHARE | &quot;SCREENSHARE&quot; | 
| MESSAGE | &quot;MESSAGE&quot; | 
{: class="table table-striped"}


<a name="DirectionEnum"></a>

## Enum: DirectionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;UNKNOWN&quot; | 
| INBOUND | &quot;INBOUND&quot; | 
| OUTBOUND | &quot;OUTBOUND&quot; | 
{: class="table table-striped"}



