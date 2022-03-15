---
title: FlowMetricsTopicConversationMetricRecord
---
## FlowMetricsTopicConversationMetricRecord


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **metric** | [**MetricEnum**](#MetricEnum)<!----> | Metric name |  [optional] |
| **metricDate** | <!----><!---->[**Date**](Date.html)<!----> | The date and time of metric creation |  [optional] |
| **value** | <!----><!---->**Integer**<!----> | Metric value |  [optional] |
| **recordId** | <!----><!---->**String**<!----> | Record identifier |  [optional] |
| **activeSkillIds** | <!----><!---->**List&lt;String&gt;**<!----> | ID(s) of Skill(s) that are active on the conversation |  [optional] |
| **addressFrom** | <!----><!---->**String**<!----> | The address that initiated an action |  [optional] |
| **addressTo** | <!----><!---->**String**<!----> | The address receiving an action |  [optional] |
| **agentAssistantId** | <!----><!---->**String**<!----> | Unique identifier of the active virtual agent assistant |  [optional] |
| **agentBullseyeRing** | <!----><!---->**Integer**<!----> | Bullseye ring of the targeted agent |  [optional] |
| **agentOwned** | <!----><!---->**Boolean**<!----> | Flag indicating an agent-owned callback |  [optional] |
| **ani** | <!----><!---->**String**<!----> | Automatic Number Identification (caller&#39;s number) |  [optional] |
| **assignerId** | <!----><!---->**String**<!----> | ID of the user that manually assigned a conversation |  [optional] |
| **authenticated** | <!----><!---->**Boolean**<!----> | Flag that indicates that the identity of the customer has been asserted as verified by the provider. |  [optional] |
| **conversationId** | <!----><!---->**String**<!----> | Unique identifier for the conversation |  [optional] |
| **conversationInitiator** | [**ConversationInitiatorEnum**](#ConversationInitiatorEnum)<!----> | Indicates the participant purpose of the participant initiating a message conversation |  [optional] |
| **convertedFrom** | <!----><!---->**String**<!----> | Session media type that was converted from in case of a media type conversion |  [optional] |
| **convertedTo** | <!----><!---->**String**<!----> | Session media type that was converted to in case of a media type conversion |  [optional] |
| **customerParticipation** | <!----><!---->**Boolean**<!----> | Indicates a messaging conversation in which the customer participated by sending at least one message |  [optional] |
| **deliveryStatus** | [**DeliveryStatusEnum**](#DeliveryStatusEnum)<!----> | The email or SMS delivery status |  [optional] |
| **destinationAddresses** | <!----><!---->**List&lt;String&gt;**<!----> | Destination address(es) of transfers or consults |  [optional] |
| **direction** | [**DirectionEnum**](#DirectionEnum)<!----> | The direction of the communication |  [optional] |
| **disconnectType** | [**DisconnectTypeEnum**](#DisconnectTypeEnum)<!----> | The session disconnect type |  [optional] |
| **divisionIds** | <!----><!---->**List&lt;String&gt;**<!----> | Identifier(s) of division(s) associated with a conversation |  [optional] |
| **dnis** | <!----><!---->**String**<!----> | Dialed number identification service (number dialed by the calling party) |  [optional] |
| **edgeId** | <!----><!---->**String**<!----> | Unique identifier of the edge device |  [optional] |
| **eligibleAgentCounts** | <!----><!---->**List&lt;Integer&gt;**<!----> | Number of eligible agents for each predictive routing attempt |  [optional] |
| **extendedDeliveryStatus** | <!----><!---->**String**<!----> | Extended email delivery status |  [optional] |
| **externalContactId** | <!----><!---->**String**<!----> | External contact identifier |  [optional] |
| **externalMediaCount** | <!----><!---->**Integer**<!----> | Count of any media (images, files, etc) included on the external session |  [optional] |
| **externalOrganizationId** | <!----><!---->**String**<!----> | External organization identifier |  [optional] |
| **externalTag** | <!----><!---->**String**<!----> | External tag for the conversation |  [optional] |
| **firstQueue** | <!----><!---->**Boolean**<!----> | Marker that is set if the current queue is the first queue in a conversation |  [optional] |
| **flaggedReason** | [**FlaggedReasonEnum**](#FlaggedReasonEnum)<!----> | Reason for which participant flagged conversation |  [optional] |
| **flowInType** | <!----><!---->**String**<!----> | Type of flow in that occurred when entering ACD. |  [optional] |
| **flowOutType** | <!----><!---->**String**<!----> | Type of flow out that occurred when emitting tFlowOut. |  [optional] |
| **groupId** | <!----><!---->**String**<!----> | Unique identifier for a PureCloud group |  [optional] |
| **interactionType** | <!----><!---->**String**<!----> | The interaction type (enterprise or contactCenter) |  [optional] |
| **journeyActionId** | <!----><!---->**String**<!----> | Identifier of the journey action. |  [optional] |
| **journeyActionMapId** | <!----><!---->**String**<!----> | Identifier of the journey action map that triggered the action. |  [optional] |
| **journeyActionMapVersion** | <!----><!---->**Integer**<!----> | Version of the journey action map that triggered the action. |  [optional] |
| **journeyCustomerId** | <!----><!---->**String**<!----> | Primary identifier of the journey customer in the source where the activities originate from. |  [optional] |
| **journeyCustomerIdType** | <!----><!---->**String**<!----> | Type of primary identifier of the journey customer (e.g. cookie). |  [optional] |
| **journeyCustomerSessionId** | <!----><!---->**String**<!----> | Unique identifier of the journey session. |  [optional] |
| **journeyCustomerSessionIdType** | <!----><!---->**String**<!----> | Type or category of journey sessions (e.g. web, ticket, delivery, atm). |  [optional] |
| **knowledgeBaseIds** | <!----><!---->**List&lt;String&gt;**<!----> | The unique identifier(s) of the knowledge base(s) used |  [optional] |
| **mediaCount** | <!----><!---->**Integer**<!----> | Count of any media (images, files, etc) included in this session |  [optional] |
| **mediaType** | [**MediaTypeEnum**](#MediaTypeEnum)<!----> | The session media type |  [optional] |
| **messageType** | <!----><!---->**String**<!----> | Message type for messaging services. E.g.: sms, facebook, twitter, line |  [optional] |
| **originatingDirection** | [**OriginatingDirectionEnum**](#OriginatingDirectionEnum)<!----> | The original direction of the conversation |  [optional] |
| **outboundCampaignId** | <!----><!---->**String**<!----> | (Dialer) Unique identifier of the outbound campaign |  [optional] |
| **outboundContactId** | <!----><!---->**String**<!----> | (Dialer) Unique identifier of the contact |  [optional] |
| **outboundContactListId** | <!----><!---->**String**<!----> | (Dialer) Unique identifier of the contact list that this contact belongs to |  [optional] |
| **participantName** | <!----><!---->**String**<!----> | A human readable name identifying the participant |  [optional] |
| **peerId** | <!----><!---->**String**<!----> | This identifies pairs of related sessions on a conversation. E.g. an external session’s peerId will be the session that the call originally connected to, e.g. if an IVR was dialed, the IVR session, which will also have the external session’s ID as its peer. After that point, any transfers of that session to other internal components (acd, agent, etc.) will all spawn new sessions whose peerIds point back to that original external session. |  [optional] |
| **provider** | <!----><!---->**String**<!----> | The source provider for the communication. |  [optional] |
| **purpose** | [**PurposeEnum**](#PurposeEnum)<!----> | The participant&#39;s purpose |  [optional] |
| **queueId** | <!----><!---->**String**<!----> | Queue identifier |  [optional] |
| **remote** | <!----><!---->**String**<!----> | Name, phone number, or email address of the remote party. |  [optional] |
| **removedSkillIds** | <!----><!---->**List&lt;String&gt;**<!----> | ID(s) of Skill(s) that have been removed by bullseye routing |  [optional] |
| **reoffered** | <!----><!---->**Boolean**<!----> | Marker for an interaction that got reoffered to the same queue by an in-queue flow |  [optional] |
| **requestedLanguageId** | <!----><!---->**String**<!----> | Unique identifier for the language requested for an interaction |  [optional] |
| **requestedRoutingSkillIds** | <!----><!---->**List&lt;String&gt;**<!----> | Unique identifier(s) for skill(s) requested for an interaction |  [optional] |
| **requestedRoutings** | <!---->[**List&lt;RequestedRoutingsEnum&gt;**](#RequestedRoutingsEnum)<!----> | Routing type(s) for requested/attempted routing methods. |  [optional] |
| **roomId** | <!----><!---->**String**<!----> | Unique identifier for the room |  [optional] |
| **routingPriority** | <!----><!---->**Integer**<!----> | Routing priority for the current interaction |  [optional] |
| **routingRing** | <!----><!---->**Integer**<!----> | Routing ring for bullseye or preferred agent routing |  [optional] |
| **selectedAgentId** | <!----><!---->**String**<!----> | Selected agent ID |  [optional] |
| **selectedAgentRank** | <!----><!---->**Integer**<!----> | Selected agent GPR rank |  [optional] |
| **selfServed** | <!----><!---->**Boolean**<!----> | Indicates whether all flow sessions were self serviced |  [optional] |
| **sessionDnis** | <!----><!---->**String**<!----> | Dialed number for the current session; this can be different from dnis, e.g. if the call was transferred |  [optional] |
| **sessionId** | <!----><!---->**String**<!----> | The unique identifier of this session |  [optional] |
| **stationId** | <!----><!---->**String**<!----> | Unique identifier for a phone |  [optional] |
| **teamId** | <!----><!---->**String**<!----> | The team ID the user is a member of |  [optional] |
| **usedRouting** | [**UsedRoutingEnum**](#UsedRoutingEnum)<!----> | Complete routing method |  [optional] |
| **userId** | <!----><!---->**String**<!----> | Unique identifier for the user |  [optional] |
| **waitingInteractionCounts** | <!----><!---->**List&lt;Integer&gt;**<!----> | Number of waiting interactions for each predictive routing attempt |  [optional] |
| **wrapUpCode** | <!----><!---->**String**<!----> | Wrap up code |  [optional] |
| **proposedAgents** | <!----><!---->[**List&lt;FlowMetricsTopicConversationProposedAgent&gt;**](FlowMetricsTopicConversationProposedAgent.html)<!----> | Proposed agents |  [optional] |
| **scoredAgents** | <!----><!---->[**List&lt;FlowMetricsTopicConversationScoredAgent&gt;**](FlowMetricsTopicConversationScoredAgent.html)<!----> | Scored agents |  [optional] |
{: class="table table-striped"}


<a name="MetricEnum"></a>

## Enum: MetricEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| NBLINDTRANSFERRED | &quot;nBlindTransferred&quot; |
| NCOBROWSESESSIONS | &quot;nCobrowseSessions&quot; |
| NCONNECTED | &quot;nConnected&quot; |
| NCONSULT | &quot;nConsult&quot; |
| NCONSULTTRANSFERRED | &quot;nConsultTransferred&quot; |
| NERROR | &quot;nError&quot; |
| NOFFERED | &quot;nOffered&quot; |
| NOUTBOUND | &quot;nOutbound&quot; |
| NOUTBOUNDABANDONED | &quot;nOutboundAbandoned&quot; |
| NOUTBOUNDATTEMPTED | &quot;nOutboundAttempted&quot; |
| NOUTBOUNDCONNECTED | &quot;nOutboundConnected&quot; |
| NOVERSLA | &quot;nOverSla&quot; |
| NTRANSFERRED | &quot;nTransferred&quot; |
| OEXTERNALMEDIACOUNT | &quot;oExternalMediaCount&quot; |
| OMEDIACOUNT | &quot;oMediaCount&quot; |
| OMESSAGETURN | &quot;oMessageTurn&quot; |
| TABANDON | &quot;tAbandon&quot; |
| TACD | &quot;tAcd&quot; |
| TACW | &quot;tAcw&quot; |
| TAGENTRESPONSETIME | &quot;tAgentResponseTime&quot; |
| TALERT | &quot;tAlert&quot; |
| TANSWERED | &quot;tAnswered&quot; |
| TCALLBACK | &quot;tCallback&quot; |
| TCALLBACKCOMPLETE | &quot;tCallbackComplete&quot; |
| TCOACHING | &quot;tCoaching&quot; |
| TCOACHINGCOMPLETE | &quot;tCoachingComplete&quot; |
| TCONNECTED | &quot;tConnected&quot; |
| TCONTACTING | &quot;tContacting&quot; |
| TDIALING | &quot;tDialing&quot; |
| TFLOWOUT | &quot;tFlowOut&quot; |
| THANDLE | &quot;tHandle&quot; |
| THELD | &quot;tHeld&quot; |
| THELDCOMPLETE | &quot;tHeldComplete&quot; |
| TIVR | &quot;tIvr&quot; |
| TMONITORING | &quot;tMonitoring&quot; |
| TMONITORINGCOMPLETE | &quot;tMonitoringComplete&quot; |
| TNOTRESPONDING | &quot;tNotResponding&quot; |
| TTALK | &quot;tTalk&quot; |
| TTALKCOMPLETE | &quot;tTalkComplete&quot; |
| TUSERRESPONSETIME | &quot;tUserResponseTime&quot; |
| TVOICEMAIL | &quot;tVoicemail&quot; |
{: class="table table-striped"}


<a name="ConversationInitiatorEnum"></a>

## Enum: ConversationInitiatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ACD | &quot;acd&quot; |
| AGENT | &quot;agent&quot; |
| API | &quot;api&quot; |
| BOTFLOW | &quot;botflow&quot; |
| CAMPAIGN | &quot;campaign&quot; |
| CUSTOMER | &quot;customer&quot; |
| DIALER | &quot;dialer&quot; |
| EXTERNAL | &quot;external&quot; |
| FAX | &quot;fax&quot; |
| GROUP | &quot;group&quot; |
| INBOUND | &quot;inbound&quot; |
| IVR | &quot;ivr&quot; |
| MANUAL | &quot;manual&quot; |
| OUTBOUND | &quot;outbound&quot; |
| STATION | &quot;station&quot; |
| USER | &quot;user&quot; |
| VOICEMAIL | &quot;voicemail&quot; |
| WORKFLOW | &quot;workflow&quot; |
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


<a name="FlaggedReasonEnum"></a>

## Enum: FlaggedReasonEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| GENERAL | &quot;general&quot; |
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


<a name="OriginatingDirectionEnum"></a>

## Enum: OriginatingDirectionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| INBOUND | &quot;inbound&quot; |
| OUTBOUND | &quot;outbound&quot; |
{: class="table table-striped"}


<a name="PurposeEnum"></a>

## Enum: PurposeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ACD | &quot;acd&quot; |
| AGENT | &quot;agent&quot; |
| API | &quot;api&quot; |
| BOTFLOW | &quot;botflow&quot; |
| CAMPAIGN | &quot;campaign&quot; |
| CUSTOMER | &quot;customer&quot; |
| DIALER | &quot;dialer&quot; |
| EXTERNAL | &quot;external&quot; |
| FAX | &quot;fax&quot; |
| GROUP | &quot;group&quot; |
| INBOUND | &quot;inbound&quot; |
| IVR | &quot;ivr&quot; |
| MANUAL | &quot;manual&quot; |
| OUTBOUND | &quot;outbound&quot; |
| STATION | &quot;station&quot; |
| USER | &quot;user&quot; |
| VOICEMAIL | &quot;voicemail&quot; |
| WORKFLOW | &quot;workflow&quot; |
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



