---
title: AnalyticsConversationSegment
---
## AnalyticsConversationSegment


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **audioMuted** | <!----><!---->**Boolean**<!----> | Flag indicating if audio is muted or not (true/false) |  [optional] |
| **conference** | <!----><!---->**Boolean**<!----> | Indicates whether the segment was a conference |  [optional] |
| **destinationConversationId** | <!----><!---->**String**<!----> | The unique identifier of a new conversation when a conversation is ended for a conference |  [optional] |
| **destinationSessionId** | <!----><!---->**String**<!----> | The unique identifier of a new session when a session is ended for a conference |  [optional] |
| **disconnectType** | [**DisconnectTypeEnum**](#DisconnectTypeEnum)<!----> | The session disconnect type |  [optional] |
| **errorCode** | <!----><!---->**String**<!----> | A code corresponding to the error that occurred |  [optional] |
| **groupId** | <!----><!---->**String**<!----> | Unique identifier for a PureCloud group |  [optional] |
| **q850ResponseCodes** | <!----><!---->**List&lt;Long&gt;**<!----> | Q.850 response code(s) |  [optional] |
| **queueId** | <!----><!---->**String**<!----> | Queue identifier |  [optional] |
| **requestedLanguageId** | <!----><!---->**String**<!----> | Unique identifier for the language requested for an interaction |  [optional] |
| **requestedRoutingSkillIds** | <!----><!---->**List&lt;String&gt;**<!----> | Unique identifier(s) for skill(s) requested for an interaction |  [optional] |
| **requestedRoutingUserIds** | <!----><!---->**List&lt;String&gt;**<!----> | Unique identifier(s) for agent(s) requested for an interaction |  [optional] |
| **segmentEnd** | <!----><!---->[**Date**](Date.html)<!----> | The end time of a segment. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **segmentStart** | <!----><!---->[**Date**](Date.html)<!----> | The start time of a segment. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **segmentType** | [**SegmentTypeEnum**](#SegmentTypeEnum)<!----> | The activity that takes place in the segment, such as hold or interact |  [optional] |
| **sipResponseCodes** | <!----><!---->**List&lt;Long&gt;**<!----> | SIP response code(s) |  [optional] |
| **sourceConversationId** | <!----><!---->**String**<!----> | The unique identifier of the previous conversation when a new conversation is created for a conference |  [optional] |
| **sourceSessionId** | <!----><!---->**String**<!----> | The unique identifier of the previous session when a new session is created for a conference |  [optional] |
| **subject** | <!----><!---->**String**<!----> | The subject for the initial email that started this conversation |  [optional] |
| **videoMuted** | <!----><!---->**Boolean**<!----> | Flag indicating if video is muted/paused or not (true/false) |  [optional] |
| **wrapUpCode** | <!----><!---->**String**<!----> | Wrap up code |  [optional] |
| **wrapUpNote** | <!----><!---->**String**<!----> | Note entered by an agent during after-call work |  [optional] |
| **wrapUpTags** | <!----><!---->**List&lt;String&gt;**<!----> | Tag(s) assigned during after-call work |  [optional] |
| **scoredAgents** | <!----><!---->[**List&lt;AnalyticsScoredAgent&gt;**](AnalyticsScoredAgent.html)<!----> | Scored agents |  [optional] |
| **properties** | <!----><!---->[**List&lt;AnalyticsProperty&gt;**](AnalyticsProperty.html)<!----> | Additional segment properties |  [optional] |
{: class="table table-striped"}


<a name="DisconnectTypeEnum"></a>

## Enum: DisconnectTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CLIENT | &quot;client&quot; | 
| CONFERENCETRANSFER | &quot;conferenceTransfer&quot; | 
| CONSULTTRANSFER | &quot;consultTransfer&quot; | 
| ENDPOINT | &quot;endpoint&quot; | 
| ERROR | &quot;error&quot; | 
| FORWARDTRANSFER | &quot;forwardTransfer&quot; | 
| NOANSWERTRANSFER | &quot;noAnswerTransfer&quot; | 
| NOTAVAILABLETRANSFER | &quot;notAvailableTransfer&quot; | 
| OTHER | &quot;other&quot; | 
| PEER | &quot;peer&quot; | 
| SPAM | &quot;spam&quot; | 
| SYSTEM | &quot;system&quot; | 
| TIMEOUT | &quot;timeout&quot; | 
| TRANSFER | &quot;transfer&quot; | 
| TRANSPORTFAILURE | &quot;transportFailure&quot; | 
| UNCALLABLE | &quot;uncallable&quot; | 
{: class="table table-striped"}


<a name="SegmentTypeEnum"></a>

## Enum: SegmentTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ALERT | &quot;alert&quot; | 
| BARGING | &quot;barging&quot; | 
| CALLBACK | &quot;callback&quot; | 
| COACHING | &quot;coaching&quot; | 
| CONTACTING | &quot;contacting&quot; | 
| CONVERTING | &quot;converting&quot; | 
| DELAY | &quot;delay&quot; | 
| DIALING | &quot;dialing&quot; | 
| HOLD | &quot;hold&quot; | 
| INTERACT | &quot;interact&quot; | 
| IVR | &quot;ivr&quot; | 
| MONITORING | &quot;monitoring&quot; | 
| SCHEDULED | &quot;scheduled&quot; | 
| SHARING | &quot;sharing&quot; | 
| SYSTEM | &quot;system&quot; | 
| TRANSMITTING | &quot;transmitting&quot; | 
| UNKNOWN | &quot;unknown&quot; | 
| UPLOADING | &quot;uploading&quot; | 
| VOICEMAIL | &quot;voicemail&quot; | 
| WRAPUP | &quot;wrapup&quot; | 
{: class="table table-striped"}



