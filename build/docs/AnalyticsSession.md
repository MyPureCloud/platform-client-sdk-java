---
title: AnalyticsSession
---
## AnalyticsSession


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **mediaType** | [**MediaTypeEnum**](#MediaTypeEnum) | The session media type |  [optional] |
| **sessionId** | **String** | The unique identifier of this session |  [optional] |
| **addressOther** | **String** |  |  [optional] |
| **addressSelf** | **String** |  |  [optional] |
| **addressFrom** | **String** |  |  [optional] |
| **addressTo** | **String** |  |  [optional] |
| **messageType** | [**MessageTypeEnum**](#MessageTypeEnum) | Message type for messaging services such as sms |  [optional] |
| **ani** | **String** | Automatic Number Identification (caller&#39;s number) |  [optional] |
| **direction** | [**DirectionEnum**](#DirectionEnum) | Direction |  [optional] |
| **dnis** | **String** | Automatic Number Identification (caller&#39;s number) |  [optional] |
| **outboundCampaignId** | **String** | (Dialer) Unique identifier of the outbound campaign |  [optional] |
| **outboundContactId** | **String** | (Dialer) Unique identifier of the contact |  [optional] |
| **outboundContactListId** | **String** | (Dialer) Unique identifier of the contact list that this contact belongs to |  [optional] |
| **dispositionAnalyzer** | **String** | (Dialer) Unique identifier of the contact list that this contact belongs to |  [optional] |
| **dispositionName** | **String** | (Dialer) Result of the analysis |  [optional] |
| **edgeId** | **String** | Unique identifier of the edge device |  [optional] |
| **remoteNameDisplayable** | **String** |  |  [optional] |
| **roomId** | **String** | Unique identifier for the room |  [optional] |
| **monitoredSessionId** | **String** | The sessionID being monitored |  [optional] |
| **monitoredParticipantId** | **String** |  |  [optional] |
| **callbackUserName** | **String** | The name of the user requesting a call back |  [optional] |
| **callbackNumbers** | **List&lt;String&gt;** | List of numbers to callback |  [optional] |
| **callbackScheduledTime** | [**Date**](Date.html) | Scheduled callback date/time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **scriptId** | **String** | Scheduled callback date/time, Date time is represented as an ISO-8601 string.  |  [optional] |
| **peerId** | **String** | A unique identifier for a peer |  [optional] |
| **skipEnabled** | **Boolean** | (Dialer) Whether the agent can skip the dialer contact |  [optional] |
| **timeoutSeconds** | **Integer** | The number of seconds before PureCloud begins the call for a call back. 0 disables automatic calling |  [optional] |
| **cobrowseRole** | **String** | Describe side of the cobrowse (sharer or viewer) |  [optional] |
| **cobrowseRoomId** | **String** | A unique identifier for a PureCloud Cobrowse room. |  [optional] |
| **mediaBridgeId** | **String** |  |  [optional] |
| **screenShareAddressSelf** | **String** | Direct ScreenShare address |  [optional] |
| **sharingScreen** | **Boolean** | Flag determining if screenShare is started or not (true/false) |  [optional] |
| **screenShareRoomId** | **String** | A unique identifier for a PureCloud ScreenShare room. |  [optional] |
| **videoRoomId** | **String** | A unique identifier for a PureCloud video room. |  [optional] |
| **videoAddressSelf** | **String** | Direct Video address |  [optional] |
| **segments** | [**List&lt;AnalyticsConversationSegment&gt;**](AnalyticsConversationSegment.html) | List of segments for this session |  [optional] |
| **metrics** | [**List&lt;AnalyticsSessionMetric&gt;**](AnalyticsSessionMetric.html) | List of metrics for this session |  [optional] |
| **flow** | [**AnalyticsFlow**](AnalyticsFlow.html) | IVR flow execution associated with this session |  [optional] |
| **recording** | **Boolean** | Flag determining if an audio recording was started or not |  [optional] |
{: class="table table-striped"}


<a name="MediaTypeEnum"></a>

## Enum: MediaTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| VOICE | &quot;voice&quot; |
| CHAT | &quot;chat&quot; |
| EMAIL | &quot;email&quot; |
| CALLBACK | &quot;callback&quot; |
| COBROWSE | &quot;cobrowse&quot; |
| VIDEO | &quot;video&quot; |
| SCREENSHARE | &quot;screenshare&quot; |
| MESSAGE | &quot;message&quot; |
{: class="table table-striped"}


<a name="MessageTypeEnum"></a>

## Enum: MessageTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| SMS | &quot;sms&quot; |
| FACEBOOK | &quot;facebook&quot; |
| TWITTER | &quot;twitter&quot; |
| LINE | &quot;line&quot; |
{: class="table table-striped"}


<a name="DirectionEnum"></a>

## Enum: DirectionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| INBOUND | &quot;inbound&quot; |
| OUTBOUND | &quot;outbound&quot; |
{: class="table table-striped"}



