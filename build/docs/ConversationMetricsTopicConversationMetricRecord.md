# ConversationMetricsTopicConversationMetricRecord


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **metric** | [**MetricEnum**](#Enum--MetricEnum) | Metric name |  [optional] |
| **metricDate** | [**Date**](Date) | The date and time of metric creation |  [optional] |
| **value** | **Long** | Metric value |  [optional] |
| **recordId** | **String** | Record identifier |  [optional] |
| **activeRouting** | [**ActiveRoutingEnum**](#Enum--ActiveRoutingEnum) | Active routing method |  [optional] |
| **activeSkillIds** | **List&lt;String&gt;** | ID(s) of Skill(s) that are active on the conversation |  [optional] |
| **addressFrom** | **String** | The address that initiated an action |  [optional] |
| **addressTo** | **String** | The address receiving an action |  [optional] |
| **agentAssistantId** | **String** | Unique identifier of the active virtual agent assistant |  [optional] |
| **agentBullseyeRing** | **Long** | Bullseye ring of the targeted agent |  [optional] |
| **agentOwned** | **Boolean** | Flag indicating an agent-owned callback |  [optional] |
| **ani** | **String** | Automatic Number Identification (caller's number) |  [optional] |
| **assignerId** | **String** | ID of the user that manually assigned a conversation |  [optional] |
| **authenticated** | **Boolean** | Flag that indicates that the identity of the customer has been asserted as verified by the provider. |  [optional] |
| **conversationId** | **String** | Unique identifier for the conversation |  [optional] |
| **conversationInitiator** | [**ConversationInitiatorEnum**](#Enum--ConversationInitiatorEnum) | Indicates the participant purpose of the participant initiating a message conversation |  [optional] |
| **convertedFrom** | **String** | Session media type that was converted from in case of a media type conversion |  [optional] |
| **convertedTo** | **String** | Session media type that was converted to in case of a media type conversion |  [optional] |
| **customerParticipation** | **Boolean** | Indicates a messaging conversation in which the customer participated by sending at least one message |  [optional] |
| **deliveryStatus** | [**DeliveryStatusEnum**](#Enum--DeliveryStatusEnum) | The email or SMS delivery status |  [optional] |
| **destinationAddresses** | **List&lt;String&gt;** | Destination address(es) of transfers or consults |  [optional] |
| **direction** | [**DirectionEnum**](#Enum--DirectionEnum) | The direction of the communication |  [optional] |
| **disconnectType** | [**DisconnectTypeEnum**](#Enum--DisconnectTypeEnum) | The session disconnect type |  [optional] |
| **divisionIds** | **List&lt;String&gt;** | Identifier(s) of division(s) associated with a conversation |  [optional] |
| **dnis** | **String** | Dialed number identification service (number dialed by the calling party) |  [optional] |
| **edgeId** | **String** | Unique identifier of the edge device |  [optional] |
| **eligibleAgentCounts** | **List&lt;Long&gt;** | Number of eligible agents for each predictive routing attempt |  [optional] |
| **errorCode** | **String** | A code corresponding to the error that occurred |  [optional] |
| **extendedDeliveryStatus** | **String** | Extended delivery status |  [optional] |
| **externalContactId** | **String** | External contact identifier |  [optional] |
| **externalMediaCount** | **Long** | Count of any media (images, files, etc) included on the external session |  [optional] |
| **externalOrganizationId** | **String** | External organization identifier |  [optional] |
| **externalTag** | **String** | External tag for the conversation |  [optional] |
| **firstQueue** | **Boolean** | Marker that is set if the current queue is the first queue in a conversation |  [optional] |
| **flaggedReason** | [**FlaggedReasonEnum**](#Enum--FlaggedReasonEnum) | Reason for which participant flagged conversation |  [optional] |
| **flowInType** | **String** | Type of flow in that occurred when entering ACD. |  [optional] |
| **flowOutType** | **String** | Type of flow out that occurred when emitting tFlowOut. |  [optional] |
| **groupId** | **String** | Unique identifier for a Genesys Cloud group |  [optional] |
| **interactionType** | **String** | The interaction type (enterprise or contactCenter) |  [optional] |
| **journeyActionId** | **String** | Identifier of the journey action. |  [optional] |
| **journeyActionMapId** | **String** | Identifier of the journey action map that triggered the action. |  [optional] |
| **journeyActionMapVersion** | **Long** | Version of the journey action map that triggered the action. |  [optional] |
| **journeyCustomerId** | **String** | Primary identifier of the journey customer in the source where the activities originate from. |  [optional] |
| **journeyCustomerIdType** | **String** | Type of primary identifier of the journey customer (e.g. cookie). |  [optional] |
| **journeyCustomerSessionId** | **String** | Unique identifier of the journey session. |  [optional] |
| **journeyCustomerSessionIdType** | **String** | Type or category of journey sessions (e.g. web, ticket, delivery, atm). |  [optional] |
| **knowledgeBaseIds** | **List&lt;String&gt;** | The unique identifier(s) of the knowledge base(s) used |  [optional] |
| **mediaCount** | **Long** | Count of any media (images, files, etc) included in this session |  [optional] |
| **mediaType** | [**MediaTypeEnum**](#Enum--MediaTypeEnum) | The session media type |  [optional] |
| **messageType** | **String** | Message type for messaging services. E.g.: sms, facebook, twitter, line |  [optional] |
| **originatingDirection** | [**OriginatingDirectionEnum**](#Enum--OriginatingDirectionEnum) | The original direction of the conversation |  [optional] |
| **originatingSocialMediaPublic** | **Boolean** | Indicates that the conversation originated from a public message on social media |  [optional] |
| **outboundCampaignId** | **String** | (Dialer) Unique identifier of the outbound campaign |  [optional] |
| **outboundContactId** | **String** | (Dialer) Unique identifier of the contact |  [optional] |
| **outboundContactListId** | **String** | (Dialer) Unique identifier of the contact list that this contact belongs to |  [optional] |
| **participantName** | **String** | A human readable name identifying the participant |  [optional] |
| **peerId** | **String** | This identifies pairs of related sessions on a conversation. E.g. an external session’s peerId will be the session that the call originally connected to, e.g. if an IVR was dialed, the IVR session, which will also have the external session’s ID as its peer. After that point, any transfers of that session to other internal components (acd, agent, etc.) will all spawn new sessions whose peerIds point back to that original external session. |  [optional] |
| **provider** | **String** | The source provider for the communication. |  [optional] |
| **purpose** | [**PurposeEnum**](#Enum--PurposeEnum) | The participant's purpose |  [optional] |
| **queueId** | **String** | Queue identifier |  [optional] |
| **remote** | **String** | Name, phone number, or email address of the remote party. |  [optional] |
| **removedSkillIds** | **List&lt;String&gt;** | ID(s) of Skill(s) that have been removed by bullseye routing |  [optional] |
| **requestedLanguageId** | **String** | Unique identifier for the language requested for an interaction |  [optional] |
| **requestedRoutingSkillIds** | **List&lt;String&gt;** | Unique identifier(s) for skill(s) requested for an interaction |  [optional] |
| **requestedRoutings** | [**List<RequestedRoutingsEnum>**](#Enum--RequestedRoutingsEnum) | Routing type(s) for requested/attempted routing methods. |  [optional] |
| **roomId** | **String** | Unique identifier for the room |  [optional] |
| **routingPriority** | **Long** | Routing priority for the current interaction |  [optional] |
| **routingRing** | **Long** | Routing ring for bullseye or preferred agent routing |  [optional] |
| **routingRule** | **String** | Routing rule for preferred, conditional and predictive routing type |  [optional] |
| **routingRuleType** | [**RoutingRuleTypeEnum**](#Enum--RoutingRuleTypeEnum) | Routing rule type |  [optional] |
| **selectedAgentId** | **String** | Selected agent ID |  [optional] |
| **selectedAgentRank** | **Long** | Selected agent GPR rank |  [optional] |
| **selfServed** | **Boolean** | Indicates whether all flow sessions were self serviced |  [optional] |
| **sessionDnis** | **String** | Dialed number for the current session; this can be different from dnis, e.g. if the call was transferred |  [optional] |
| **sessionId** | **String** | The unique identifier of this session |  [optional] |
| **stationId** | **String** | Unique identifier for a phone |  [optional] |
| **teamId** | **String** | The team ID the user is a member of |  [optional] |
| **usedRouting** | [**UsedRoutingEnum**](#Enum--UsedRoutingEnum) | Complete routing method |  [optional] |
| **userId** | **String** | Unique identifier for the user |  [optional] |
| **videoPresent** | **Boolean** | Flag indicating if video is present |  [optional] |
| **waitingInteractionCounts** | **List&lt;Long&gt;** | Number of waiting interactions for each predictive routing attempt |  [optional] |
| **wrapUpCode** | **String** | Wrap up code |  [optional] |
| **proposedAgents** | [**List&lt;ConversationMetricsTopicConversationProposedAgent&gt;**](ConversationMetricsTopicConversationProposedAgent) | Proposed agents |  [optional] |
| **scoredAgents** | [**List&lt;ConversationMetricsTopicConversationScoredAgent&gt;**](ConversationMetricsTopicConversationScoredAgent) | Scored agents |  [optional] |


## Enum: MetricEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NBLINDTRANSFERRED | &quot;nBlindTransferred&quot; | 
| NBOTINTERACTIONS | &quot;nBotInteractions&quot; | 
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
| OAUDIOMESSAGECOUNT | &quot;oAudioMessageCount&quot; | 
| OEXTERNALAUDIOMESSAGECOUNT | &quot;oExternalAudioMessageCount&quot; | 
| OEXTERNALMEDIACOUNT | &quot;oExternalMediaCount&quot; | 
| OMEDIACOUNT | &quot;oMediaCount&quot; | 
| OMESSAGECOUNT | &quot;oMessageCount&quot; | 
| OMESSAGESEGMENTCOUNT | &quot;oMessageSegmentCount&quot; | 
| OMESSAGETURN | &quot;oMessageTurn&quot; | 
| TABANDON | &quot;tAbandon&quot; | 
| TACD | &quot;tAcd&quot; | 
| TACTIVECALLBACK | &quot;tActiveCallback&quot; | 
| TACTIVECALLBACKCOMPLETE | &quot;tActiveCallbackComplete&quot; | 
| TACW | &quot;tAcw&quot; | 
| TAGENTRESPONSETIME | &quot;tAgentResponseTime&quot; | 
| TALERT | &quot;tAlert&quot; | 
| TANSWERED | &quot;tAnswered&quot; | 
| TAVERAGEAGENTRESPONSETIME | &quot;tAverageAgentResponseTime&quot; | 
| TAVERAGECUSTOMERRESPONSETIME | &quot;tAverageCustomerResponseTime&quot; | 
| TBARGING | &quot;tBarging&quot; | 
| TCOACHING | &quot;tCoaching&quot; | 
| TCOACHINGCOMPLETE | &quot;tCoachingComplete&quot; | 
| TCONNECTED | &quot;tConnected&quot; | 
| TCONTACTING | &quot;tContacting&quot; | 
| TDIALING | &quot;tDialing&quot; | 
| TFIRSTCONNECT | &quot;tFirstConnect&quot; | 
| TFIRSTDIAL | &quot;tFirstDial&quot; | 
| TFIRSTENGAGEMENT | &quot;tFirstEngagement&quot; | 
| TFIRSTRESPONSE | &quot;tFirstResponse&quot; | 
| TFLOWOUT | &quot;tFlowOut&quot; | 
| THANDLE | &quot;tHandle&quot; | 
| THELD | &quot;tHeld&quot; | 
| THELDCOMPLETE | &quot;tHeldComplete&quot; | 
| TIVR | &quot;tIvr&quot; | 
| TMONITORING | &quot;tMonitoring&quot; | 
| TMONITORINGCOMPLETE | &quot;tMonitoringComplete&quot; | 
| TNOTRESPONDING | &quot;tNotResponding&quot; | 
| TPARK | &quot;tPark&quot; | 
| TPARKCOMPLETE | &quot;tParkComplete&quot; | 
| TTALK | &quot;tTalk&quot; | 
| TTALKCOMPLETE | &quot;tTalkComplete&quot; | 
| TUSERRESPONSETIME | &quot;tUserResponseTime&quot; | 
| TVOICEMAIL | &quot;tVoicemail&quot; | 


## Enum: ActiveRoutingEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| BULLSEYE | &quot;Bullseye&quot; | 
| CONDITIONAL | &quot;Conditional&quot; | 
| DIRECT | &quot;Direct&quot; | 
| LAST | &quot;Last&quot; | 
| MANUAL | &quot;Manual&quot; | 
| PREDICTIVE | &quot;Predictive&quot; | 
| PREFERRED | &quot;Preferred&quot; | 
| STANDARD | &quot;Standard&quot; | 
| VIP | &quot;Vip&quot; | 


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
| VOICESURVEYFLOW | &quot;voicesurveyflow&quot; | 
| WORKFLOW | &quot;workflow&quot; | 


## Enum: DeliveryStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DELIVERYFAILED | &quot;DeliveryFailed&quot; | 
| DELIVERYPUSHED | &quot;DeliveryPushed&quot; | 
| DELIVERYSUCCESS | &quot;DeliverySuccess&quot; | 
| FAILED | &quot;Failed&quot; | 
| PUBLISHED | &quot;Published&quot; | 
| QUEUED | &quot;Queued&quot; | 
| READ | &quot;Read&quot; | 
| RECEIVED | &quot;Received&quot; | 
| SENT | &quot;Sent&quot; | 


## Enum: DirectionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INBOUND | &quot;inbound&quot; | 
| OUTBOUND | &quot;outbound&quot; | 


## Enum: DisconnectTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CLIENT | &quot;client&quot; | 
| CONFERENCETRANSFER | &quot;conferenceTransfer&quot; | 
| CONSULTTRANSFER | &quot;consultTransfer&quot; | 
| ENDPOINT | &quot;endpoint&quot; | 
| ENDPOINTDND | &quot;endpointDnd&quot; | 
| ERROR | &quot;error&quot; | 
| FORWARDTRANSFER | &quot;forwardTransfer&quot; | 
| INACTIVITY | &quot;inactivity&quot; | 
| NOANSWERTRANSFER | &quot;noAnswerTransfer&quot; | 
| NOTAVAILABLETRANSFER | &quot;notAvailableTransfer&quot; | 
| OTHER | &quot;other&quot; | 
| PEER | &quot;peer&quot; | 
| SPAM | &quot;spam&quot; | 
| SYSTEM | &quot;system&quot; | 
| TIMEOUT | &quot;timeout&quot; | 
| TRANSFER | &quot;transfer&quot; | 
| TRANSFERDND | &quot;transferDnd&quot; | 
| TRANSPORTFAILURE | &quot;transportFailure&quot; | 
| UNCALLABLE | &quot;uncallable&quot; | 


## Enum: FlaggedReasonEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| GENERAL | &quot;general&quot; | 


## Enum: MediaTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CALLBACK | &quot;callback&quot; | 
| CHAT | &quot;chat&quot; | 
| COBROWSE | &quot;cobrowse&quot; | 
| EMAIL | &quot;email&quot; | 
| INTERNALMESSAGE | &quot;internalmessage&quot; | 
| MESSAGE | &quot;message&quot; | 
| SCREENSHARE | &quot;screenshare&quot; | 
| UNKNOWN | &quot;unknown&quot; | 
| VIDEO | &quot;video&quot; | 
| VOICE | &quot;voice&quot; | 


## Enum: OriginatingDirectionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INBOUND | &quot;inbound&quot; | 
| OUTBOUND | &quot;outbound&quot; | 


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
| VOICESURVEYFLOW | &quot;voicesurveyflow&quot; | 
| WORKFLOW | &quot;workflow&quot; | 


## Enum: RequestedRoutingsEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| BULLSEYE | &quot;Bullseye&quot; |
| CONDITIONAL | &quot;Conditional&quot; |
| DIRECT | &quot;Direct&quot; |
| LAST | &quot;Last&quot; |
| MANUAL | &quot;Manual&quot; |
| PREDICTIVE | &quot;Predictive&quot; |
| PREFERRED | &quot;Preferred&quot; |
| STANDARD | &quot;Standard&quot; |
| VIP | &quot;Vip&quot; |


## Enum: RoutingRuleTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| BULLSEYE | &quot;Bullseye&quot; | 
| CONDITIONAL | &quot;Conditional&quot; | 
| PREDICTIVE | &quot;Predictive&quot; | 
| PREFERRED | &quot;Preferred&quot; | 


## Enum: UsedRoutingEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| BULLSEYE | &quot;Bullseye&quot; | 
| CONDITIONAL | &quot;Conditional&quot; | 
| DIRECT | &quot;Direct&quot; | 
| LAST | &quot;Last&quot; | 
| MANUAL | &quot;Manual&quot; | 
| PREDICTIVE | &quot;Predictive&quot; | 
| PREFERRED | &quot;Preferred&quot; | 
| STANDARD | &quot;Standard&quot; | 
| VIP | &quot;Vip&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
