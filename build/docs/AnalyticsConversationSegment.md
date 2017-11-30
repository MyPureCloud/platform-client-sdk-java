---
title: AnalyticsConversationSegment
---
## AnalyticsConversationSegment


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **segmentStart** | [**Date**](Date.html) | The timestamp when this segment began. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **segmentEnd** | [**Date**](Date.html) | The timestamp when this segment ended. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **queueId** | **String** | Queue identifier |  [optional] |
| **wrapUpCode** | **String** | Wrapup Code id |  [optional] |
| **wrapUpNote** | **String** | Note entered by an agent during after-call work |  [optional] |
| **wrapUpTags** | **List&lt;String&gt;** |  |  [optional] |
| **errorCode** | **String** |  |  [optional] |
| **disconnectType** | [**DisconnectTypeEnum**](#DisconnectTypeEnum) | A description of the event that disconnected the segment |  [optional] |
| **segmentType** | [**SegmentTypeEnum**](#SegmentTypeEnum) | The activity taking place for the participant in the segment |  [optional] |
| **requestedRoutingUserIds** | **List&lt;String&gt;** |  |  [optional] |
| **requestedRoutingSkillIds** | **List&lt;String&gt;** |  |  [optional] |
| **requestedLanguageId** | **String** | A unique identifier for the language requested for an interaction. |  [optional] |
| **properties** | [**List&lt;AnalyticsProperty&gt;**](AnalyticsProperty.html) |  |  [optional] |
| **sourceConversationId** | **String** |  |  [optional] |
| **destinationConversationId** | **String** |  |  [optional] |
| **sourceSessionId** | **String** |  |  [optional] |
| **destinationSessionId** | **String** |  |  [optional] |
| **sipResponseCodes** | **List&lt;Long&gt;** |  |  [optional] |
| **q850ResponseCodes** | **List&lt;Long&gt;** |  |  [optional] |
| **conference** | **Boolean** | Indicates whether the segment was a conference |  [optional] |
| **groupId** | **String** |  |  [optional] |
| **subject** | **String** |  |  [optional] |
| **audioMuted** | **Boolean** |  |  [optional] |
| **videoMuted** | **Boolean** |  |  [optional] |
{: class="table table-striped"}


<a name="DisconnectTypeEnum"></a>

## Enum: DisconnectTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ENDPOINT | &quot;endpoint&quot; |
| CLIENT | &quot;client&quot; |
| SYSTEM | &quot;system&quot; |
| TRANSFER | &quot;transfer&quot; |
| ERROR | &quot;error&quot; |
| PEER | &quot;peer&quot; |
| OTHER | &quot;other&quot; |
| SPAM | &quot;spam&quot; |
| TRANSPORTFAILURE | &quot;transportFailure&quot; |
| CONFERENCETRANSFER | &quot;conferenceTransfer&quot; |
| CONSULTTRANSFER | &quot;consultTransfer&quot; |
| FORWARDTRANSFER | &quot;forwardTransfer&quot; |
| TIMEOUT | &quot;timeout&quot; |
| NOANSWERTRANSFER | &quot;noAnswerTransfer&quot; |
| NOTAVAILABLETRANSFER | &quot;notAvailableTransfer&quot; |
| UNCALLABLE | &quot;uncallable&quot; |


<a name="SegmentTypeEnum"></a>

## Enum: SegmentTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| UNKNOWN | &quot;unknown&quot; |
| ALERT | &quot;alert&quot; |
| SYSTEM | &quot;system&quot; |
| DELAY | &quot;delay&quot; |
| HOLD | &quot;hold&quot; |
| INTERACT | &quot;interact&quot; |
| IVR | &quot;ivr&quot; |
| DIALING | &quot;dialing&quot; |
| WRAPUP | &quot;wrapup&quot; |
| VOICEMAIL | &quot;voicemail&quot; |
| SCHEDULED | &quot;scheduled&quot; |
| CONTACTING | &quot;contacting&quot; |
| TRANSMITTING | &quot;transmitting&quot; |
| CONVERTING | &quot;converting&quot; |
| UPLOADING | &quot;uploading&quot; |
| SHARING | &quot;sharing&quot; |
{: class="table table-striped"}


