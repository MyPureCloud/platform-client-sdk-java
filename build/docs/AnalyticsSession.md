---
title: AnalyticsSession
---
## AnalyticsSession


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **activeSkillIds** | <!----><!---->**List&lt;String&gt;**<!----> | ID(s) of Skill(s) that are active on the conversation |  [optional] |
| **acwSkipped** | <!----><!---->**Boolean**<!----> | Marker for an agent that skipped after call work |  [optional] |
| **addressFrom** | <!----><!---->**String**<!----> | The address that initiated an action |  [optional] |
| **addressOther** | <!----><!---->**String**<!----> | The email address for the participant on the other side of the email conversation |  [optional] |
| **addressSelf** | <!----><!---->**String**<!----> | The email address for the participant on this side of the email conversation |  [optional] |
| **addressTo** | <!----><!---->**String**<!----> | The address receiving an action |  [optional] |
| **agentAssistantId** | <!----><!---->**String**<!----> | Unique identifier of the active virtual agent assistant |  [optional] |
| **agentBullseyeRing** | <!----><!---->**Integer**<!----> | Bullseye ring of the targeted agent |  [optional] |
| **agentOwned** | <!----><!---->**Boolean**<!----> | Flag indicating an agent-owned callback |  [optional] |
| **ani** | <!----><!---->**String**<!----> | Automatic Number Identification (caller&#39;s number) |  [optional] |
| **assignerId** | <!----><!---->**String**<!----> | ID of the user that manually assigned a conversation |  [optional] |
| **authenticated** | <!----><!---->**Boolean**<!----> | Flag that indicates that the identity of the customer has been asserted as verified by the provider. |  [optional] |
| **callbackNumbers** | <!----><!---->**List&lt;String&gt;**<!----> | Callback phone number(s) |  [optional] |
| **callbackScheduledTime** | <!----><!---->[**Date**](Date.html)<!----> | Scheduled callback date/time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **callbackUserName** | <!----><!---->**String**<!----> | The name of the user requesting a call back |  [optional] |
| **coachedParticipantId** | <!----><!---->**String**<!----> | The participantId being coached (if someone (e.g. an agent) is being coached, this would correspond to one of the other participantIds present in the conversation) |  [optional] |
| **cobrowseRole** | <!----><!---->**String**<!----> | Describes side of the cobrowse (sharer or viewer) |  [optional] |
| **cobrowseRoomId** | <!----><!---->**String**<!----> | A unique identifier for a PureCloud cobrowse room |  [optional] |
| **deliveryStatus** | [**DeliveryStatusEnum**](#DeliveryStatusEnum)<!----> | The email or SMS delivery status |  [optional] |
| **deliveryStatusChangeDate** | <!----><!---->[**Date**](Date.html)<!----> | Date and time of the most recent delivery status change. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **destinationAddresses** | <!----><!---->**List&lt;String&gt;**<!----> | Destination address(es) of transfers or consults |  [optional] |
| **direction** | [**DirectionEnum**](#DirectionEnum)<!----> | The direction of the communication |  [optional] |
| **dispositionAnalyzer** | <!----><!---->**String**<!----> | (Dialer) Analyzer (for example speech.person) |  [optional] |
| **dispositionName** | <!----><!---->**String**<!----> | (Dialer) Result of the analysis (for example disposition.classification.callable.machine) |  [optional] |
| **dnis** | <!----><!---->**String**<!----> | Dialed number identification service (number dialed by the calling party) |  [optional] |
| **edgeId** | <!----><!---->**String**<!----> | Unique identifier of the edge device |  [optional] |
| **eligibleAgentCounts** | <!----><!---->**List&lt;Integer&gt;**<!----> | Number of eligible agents for each predictive routing attempt |  [optional] |
| **extendedDeliveryStatus** | <!----><!---->**String**<!----> | Extended email delivery status |  [optional] |
| **flowInType** | <!----><!---->**String**<!----> | Type of flow in that occurred when entering ACD. |  [optional] |
| **flowOutType** | <!----><!---->**String**<!----> | Type of flow out that occurred when emitting tFlowOut. |  [optional] |
| **journeyActionId** | <!----><!---->**String**<!----> | Identifier of the journey action. |  [optional] |
| **journeyActionMapId** | <!----><!---->**String**<!----> | Identifier of the journey action map that triggered the action. |  [optional] |
| **journeyActionMapVersion** | <!----><!---->**Integer**<!----> | Version of the journey action map that triggered the action. |  [optional] |
| **journeyCustomerId** | <!----><!---->**String**<!----> | Primary identifier of the journey customer in the source where the activities originate from. |  [optional] |
| **journeyCustomerIdType** | <!----><!---->**String**<!----> | Type of primary identifier of the journey customer (e.g. cookie). |  [optional] |
| **journeyCustomerSessionId** | <!----><!---->**String**<!----> | Unique identifier of the journey session. |  [optional] |
| **journeyCustomerSessionIdType** | <!----><!---->**String**<!----> | Type or category of journey sessions (e.g. web, ticket, delivery, atm). |  [optional] |
| **mediaBridgeId** | <!----><!---->**String**<!----> | Media bridge ID for the conference session consistent across all participants |  [optional] |
| **mediaCount** | <!----><!---->**Integer**<!----> | Count of any media (images, files, etc) included in this session |  [optional] |
| **mediaType** | [**MediaTypeEnum**](#MediaTypeEnum)<!----> | The session media type |  [optional] |
| **messageType** | <!----><!---->**String**<!----> | Message type for messaging services. E.g.: sms, facebook, twitter, line |  [optional] |
| **monitoredParticipantId** | <!----><!---->**String**<!----> | The participantId being monitored (if someone (e.g. an agent) is being monitored, this would correspond to one of the other participantIds present in the conversation) |  [optional] |
| **outboundCampaignId** | <!----><!---->**String**<!----> | (Dialer) Unique identifier of the outbound campaign |  [optional] |
| **outboundContactId** | <!----><!---->**String**<!----> | (Dialer) Unique identifier of the contact |  [optional] |
| **outboundContactListId** | <!----><!---->**String**<!----> | (Dialer) Unique identifier of the contact list that this contact belongs to |  [optional] |
| **peerId** | <!----><!---->**String**<!----> | This identifies pairs of related sessions on a conversation. E.g. an external session’s peerId will be the session that the call originally connected to, e.g. if an IVR was dialed, the IVR session, which will also have the external session’s ID as its peer. After that point, any transfers of that session to other internal components (acd, agent, etc.) will all spawn new sessions whose peerIds point back to that original external session. |  [optional] |
| **protocolCallId** | <!----><!---->**String**<!----> | The original voice protocol call ID, e.g. a SIP call ID |  [optional] |
| **provider** | <!----><!---->**String**<!----> | The source provider for the communication. |  [optional] |
| **recording** | <!----><!---->**Boolean**<!----> | Flag determining if an audio recording was started or not |  [optional] |
| **remote** | <!----><!---->**String**<!----> | Name, phone number, or email address of the remote party. |  [optional] |
| **remoteNameDisplayable** | <!----><!---->**String**<!----> | Unique identifier for the remote party |  [optional] |
| **removedSkillIds** | <!----><!---->**List&lt;String&gt;**<!----> | ID(s) of Skill(s) that have been removed by bullseye routing |  [optional] |
| **requestedRoutings** | <!---->[**List&lt;RequestedRoutingsEnum&gt;**](#RequestedRoutingsEnum)<!----> | Routing type(s) for requested/attempted routing methods. |  [optional] |
| **roomId** | <!----><!---->**String**<!----> | Unique identifier for the room |  [optional] |
| **routingRing** | <!----><!---->**Integer**<!----> | Routing ring for bullseye or preferred agent routing |  [optional] |
| **screenShareAddressSelf** | <!----><!---->**String**<!----> | Direct ScreenShare address |  [optional] |
| **screenShareRoomId** | <!----><!---->**String**<!----> | A unique identifier for a PureCloud ScreenShare room |  [optional] |
| **scriptId** | <!----><!---->**String**<!----> | A unique identifier for a script |  [optional] |
| **selectedAgentId** | <!----><!---->**String**<!----> | Selected agent ID |  [optional] |
| **selectedAgentRank** | <!----><!---->**Integer**<!----> | Selected agent GPR rank |  [optional] |
| **sessionDnis** | <!----><!---->**String**<!----> | Dialed number for the current session; this can be different from dnis, e.g. if the call was transferred |  [optional] |
| **sessionId** | <!----><!---->**String**<!----> | The unique identifier of this session |  [optional] |
| **sharingScreen** | <!----><!---->**Boolean**<!----> | Flag determining if screenShare is started or not (true/false) |  [optional] |
| **skipEnabled** | <!----><!---->**Boolean**<!----> | (Dialer) Whether the agent can skip the dialer contact |  [optional] |
| **timeoutSeconds** | <!----><!---->**Integer**<!----> | The number of seconds before PureCloud begins the call for a call back (0 disables automatic calling) |  [optional] |
| **usedRouting** | [**UsedRoutingEnum**](#UsedRoutingEnum)<!----> | Complete routing method |  [optional] |
| **videoAddressSelf** | <!----><!---->**String**<!----> | Direct Video address |  [optional] |
| **videoRoomId** | <!----><!---->**String**<!----> | A unique identifier for a PureCloud video room |  [optional] |
| **waitingInteractionCounts** | <!----><!---->**List&lt;Integer&gt;**<!----> | Number of waiting interactions for each predictive routing attempt |  [optional] |
| **proposedAgents** | <!----><!---->[**List&lt;AnalyticsProposedAgent&gt;**](AnalyticsProposedAgent.html)<!----> | Proposed agents |  [optional] |
| **mediaEndpointStats** | <!----><!---->[**List&lt;AnalyticsMediaEndpointStat&gt;**](AnalyticsMediaEndpointStat.html)<!----> | MediaEndpointStats associated with this session |  [optional] |
| **flow** | <!----><!---->[**AnalyticsFlow**](AnalyticsFlow.html)<!----> | IVR flow execution associated with this session |  [optional] |
| **metrics** | <!----><!---->[**List&lt;AnalyticsSessionMetric&gt;**](AnalyticsSessionMetric.html)<!----> | List of metrics for this session |  [optional] |
| **segments** | <!----><!---->[**List&lt;AnalyticsConversationSegment&gt;**](AnalyticsConversationSegment.html)<!----> | List of segments for this session |  [optional] |
{: class="table table-striped"}


<a name="DeliveryStatusEnum"></a>

## Enum: DeliveryStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| DELIVERYFAILED | &quot;DeliveryFailed&quot; |
| DELIVERYSUCCESS | &quot;DeliverySuccess&quot; |
| FAILED | &quot;Failed&quot; |
| QUEUED | &quot;Queued&quot; |
| READ | &quot;Read&quot; |
| RECEIVED | &quot;Received&quot; |
| SENT | &quot;Sent&quot; |
{: class="table table-striped"}


<a name="DirectionEnum"></a>

## Enum: DirectionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| INBOUND | &quot;inbound&quot; |
| OUTBOUND | &quot;outbound&quot; |
{: class="table table-striped"}


<a name="MediaTypeEnum"></a>

## Enum: MediaTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| CALLBACK | &quot;callback&quot; |
| CHAT | &quot;chat&quot; |
| COBROWSE | &quot;cobrowse&quot; |
| EMAIL | &quot;email&quot; |
| MESSAGE | &quot;message&quot; |
| SCREENSHARE | &quot;screenshare&quot; |
| UNKNOWN | &quot;unknown&quot; |
| VIDEO | &quot;video&quot; |
| VOICE | &quot;voice&quot; |
{: class="table table-striped"}


<a name="RequestedRoutingsEnum"></a>

## Enum: RequestedRoutingsEnum

| Name | Value |
| ---- | ----- |
| BULLSEYE | &quot;Bullseye&quot; |
| CONDITIONAL | &quot;Conditional&quot; |
| LAST | &quot;Last&quot; |
| MANUAL | &quot;Manual&quot; |
| PREDICTIVE | &quot;Predictive&quot; |
| PREFERRED | &quot;Preferred&quot; |
| STANDARD | &quot;Standard&quot; |
{: class="table table-striped"}


<a name="UsedRoutingEnum"></a>

## Enum: UsedRoutingEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| BULLSEYE | &quot;Bullseye&quot; |
| CONDITIONAL | &quot;Conditional&quot; |
| LAST | &quot;Last&quot; |
| MANUAL | &quot;Manual&quot; |
| PREDICTIVE | &quot;Predictive&quot; |
| PREFERRED | &quot;Preferred&quot; |
| STANDARD | &quot;Standard&quot; |
{: class="table table-striped"}



