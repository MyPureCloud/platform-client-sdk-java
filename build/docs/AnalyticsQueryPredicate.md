---
title: AnalyticsQueryPredicate
---
## AnalyticsQueryPredicate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum) | Optional type, can usually be inferred |  [optional] |
| **dimension** | [**DimensionEnum**](#DimensionEnum) | Left hand side for dimension predicates |  [optional] |
| **propertyType** | [**PropertyTypeEnum**](#PropertyTypeEnum) | Left hand side for property predicates |  [optional] |
| **property** | **String** | Left hand side for property predicates |  [optional] |
| **metric** | [**MetricEnum**](#MetricEnum) | Left hand side for metric predicates |  [optional] |
| **operator** | [**OperatorEnum**](#OperatorEnum) | Optional operator, default is matches |  [optional] |
| **value** | **String** | Right hand side for dimension, property, or metric predicates |  [optional] |
| **range** | [**NumericRange**](NumericRange.html) | Right hand side for property or metric predicates |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| DIMENSION | &quot;dimension&quot; |
| PROPERTY | &quot;property&quot; |
| METRIC | &quot;metric&quot; |
{: class="table table-striped"}


<a name="DimensionEnum"></a>

## Enum: DimensionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| CONVERSATIONID | &quot;conversationId&quot; |
| SESSIONID | &quot;sessionId&quot; |
| MEDIATYPE | &quot;mediaType&quot; |
| QUEUEID | &quot;queueId&quot; |
| USERID | &quot;userId&quot; |
| PARTICIPANTID | &quot;participantId&quot; |
| PARTICIPANTNAME | &quot;participantName&quot; |
| DIRECTION | &quot;direction&quot; |
| ORIGINATINGDIRECTION | &quot;originatingDirection&quot; |
| WRAPUPCODE | &quot;wrapUpCode&quot; |
| WRAPUPNOTE | &quot;wrapUpNote&quot; |
| INTERACTIONTYPE | &quot;interactionType&quot; |
| REQUESTEDROUTINGSKILLID | &quot;requestedRoutingSkillId&quot; |
| REQUESTEDLANGUAGEID | &quot;requestedLanguageId&quot; |
| REQUESTEDROUTINGUSERIDS | &quot;requestedRoutingUserIds&quot; |
| ROUTINGPRIORITY | &quot;routingPriority&quot; |
| SCOREDAGENTID | &quot;scoredAgentId&quot; |
| AGENTSCORE | &quot;agentScore&quot; |
| PURPOSE | &quot;purpose&quot; |
| PARTICIPANTTYPE | &quot;participantType&quot; |
| SEGMENTTYPE | &quot;segmentType&quot; |
| DISCONNECTTYPE | &quot;disconnectType&quot; |
| ERRORCODE | &quot;errorCode&quot; |
| CONVERSATIONEND | &quot;conversationEnd&quot; |
| SEGMENTEND | &quot;segmentEnd&quot; |
| EXTERNALCONTACTID | &quot;externalContactId&quot; |
| EXTERNALORGANIZATIONID | &quot;externalOrganizationId&quot; |
| CONVERTEDFROM | &quot;convertedFrom&quot; |
| CONVERTEDTO | &quot;convertedTo&quot; |
| DIVISIONID | &quot;divisionId&quot; |
| FLAGGEDREASON | &quot;flaggedReason&quot; |
| PROVIDER | &quot;provider&quot; |
| STATIONID | &quot;stationId&quot; |
| EDGEID | &quot;edgeId&quot; |
| DNIS | &quot;dnis&quot; |
| ANI | &quot;ani&quot; |
| SESSIONDNIS | &quot;sessionDnis&quot; |
| OUTBOUNDCAMPAIGNID | &quot;outboundCampaignId&quot; |
| OUTBOUNDCONTACTID | &quot;outboundContactId&quot; |
| OUTBOUNDCONTACTLISTID | &quot;outboundContactListId&quot; |
| MONITOREDPARTICIPANTID | &quot;monitoredParticipantId&quot; |
| SOURCESESSIONID | &quot;sourceSessionId&quot; |
| DESTINATIONSESSIONID | &quot;destinationSessionId&quot; |
| SOURCECONVERSATIONID | &quot;sourceConversationId&quot; |
| DESTINATIONCONVERSATIONID | &quot;destinationConversationId&quot; |
| REMOTENAMEDISPLAYABLE | &quot;remoteNameDisplayable&quot; |
| SIPRESPONSECODE | &quot;sipResponseCode&quot; |
| Q850RESPONSECODE | &quot;q850ResponseCode&quot; |
| CONFERENCE | &quot;conference&quot; |
| GROUPID | &quot;groupId&quot; |
| PROTOCOLCALLID | &quot;protocolCallId&quot; |
| ROOMID | &quot;roomId&quot; |
| ADDRESSFROM | &quot;addressFrom&quot; |
| ADDRESSTO | &quot;addressTo&quot; |
| ADDRESSSELF | &quot;addressSelf&quot; |
| ADDRESSOTHER | &quot;addressOther&quot; |
| SUBJECT | &quot;subject&quot; |
| MESSAGETYPE | &quot;messageType&quot; |
| PEERID | &quot;peerId&quot; |
| SCRIPTID | &quot;scriptId&quot; |
| EVALUATIONID | &quot;evaluationId&quot; |
| EVALUATORID | &quot;evaluatorId&quot; |
| CONTEXTID | &quot;contextId&quot; |
| FORMID | &quot;formId&quot; |
| FORMNAME | &quot;formName&quot; |
| EVENTTIME | &quot;eventTime&quot; |
| CALIBRATIONID | &quot;calibrationId&quot; |
| SURVEYID | &quot;surveyId&quot; |
| SURVEYFORMCONTEXTID | &quot;surveyFormContextId&quot; |
| SURVEYFORMID | &quot;surveyFormId&quot; |
| SURVEYFORMNAME | &quot;surveyFormName&quot; |
| SURVEYANSWERID | &quot;surveyAnswerId&quot; |
| SURVEYQUESTIONID | &quot;surveyQuestionId&quot; |
| SURVEYQUESTIONGROUPID | &quot;surveyQuestionGroupId&quot; |
| SURVEYPROMOTERSCORE | &quot;surveyPromoterScore&quot; |
| SURVEYCOMPLETEDDATE | &quot;surveyCompletedDate&quot; |
| SURVEYERRORREASON | &quot;surveyErrorReason&quot; |
| SURVEYPREVIOUSSTATUS | &quot;surveyPreviousStatus&quot; |
| SURVEYSTATUS | &quot;surveyStatus&quot; |
| SYSTEMPRESENCE | &quot;systemPresence&quot; |
| ORGANIZATIONPRESENCEID | &quot;organizationPresenceId&quot; |
| ROUTINGSTATUS | &quot;routingStatus&quot; |
| FLOWID | &quot;flowId&quot; |
| FLOWNAME | &quot;flowName&quot; |
| FLOWVERSION | &quot;flowVersion&quot; |
| FLOWTYPE | &quot;flowType&quot; |
| EXITREASON | &quot;exitReason&quot; |
| ENTRYREASON | &quot;entryReason&quot; |
| ENTRYTYPE | &quot;entryType&quot; |
| TRANSFERTYPE | &quot;transferType&quot; |
| TRANSFERTARGETNAME | &quot;transferTargetName&quot; |
| TRANSFERTARGETADDRESS | &quot;transferTargetAddress&quot; |
| ISSUEDCALLBACK | &quot;issuedCallback&quot; |
| STARTINGLANGUAGE | &quot;startingLanguage&quot; |
| ENDINGLANGUAGE | &quot;endingLanguage&quot; |
| FLOWOUTCOMEID | &quot;flowOutcomeId&quot; |
| FLOWOUTCOMEVALUE | &quot;flowOutcomeValue&quot; |
| FLOWOUTCOME | &quot;flowOutcome&quot; |
| JOURNEYCUSTOMERID | &quot;journeyCustomerId&quot; |
| JOURNEYCUSTOMERIDTYPE | &quot;journeyCustomerIdType&quot; |
| JOURNEYCUSTOMERSESSIONID | &quot;journeyCustomerSessionId&quot; |
| JOURNEYCUSTOMERSESSIONIDTYPE | &quot;journeyCustomerSessionIdType&quot; |
| JOURNEYACTIONID | &quot;journeyActionId&quot; |
| JOURNEYACTIONMAPID | &quot;journeyActionMapId&quot; |
| JOURNEYACTIONMAPVERSION | &quot;journeyActionMapVersion&quot; |
| MINMOS | &quot;minMos&quot; |
| MEDIASTATSMINCONVERSATIONMOS | &quot;mediaStatsMinConversationMos&quot; |
| MINRFACTOR | &quot;minRFactor&quot; |
| MEDIASTATSMINCONVERSATIONRFACTOR | &quot;mediaStatsMinConversationRFactor&quot; |
{: class="table table-striped"}


<a name="PropertyTypeEnum"></a>

## Enum: PropertyTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| BOOL | &quot;bool&quot; |
| INTEGER | &quot;integer&quot; |
| REAL | &quot;real&quot; |
| DATE | &quot;date&quot; |
| STRING | &quot;string&quot; |
| UUID | &quot;uuid&quot; |
{: class="table table-striped"}


<a name="MetricEnum"></a>

## Enum: MetricEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| TSEGMENTDURATION | &quot;tSegmentDuration&quot; |
| TCONVERSATIONDURATION | &quot;tConversationDuration&quot; |
| OTOTALCRITICALSCORE | &quot;oTotalCriticalScore&quot; |
| OTOTALSCORE | &quot;oTotalScore&quot; |
| NEVALUATIONS | &quot;nEvaluations&quot; |
| TABANDON | &quot;tAbandon&quot; |
| TIVR | &quot;tIvr&quot; |
| TANSWERED | &quot;tAnswered&quot; |
| TFLOWOUT | &quot;tFlowOut&quot; |
| TACD | &quot;tAcd&quot; |
| TTALK | &quot;tTalk&quot; |
| THELD | &quot;tHeld&quot; |
| TTALKCOMPLETE | &quot;tTalkComplete&quot; |
| THELDCOMPLETE | &quot;tHeldComplete&quot; |
| TACW | &quot;tAcw&quot; |
| THANDLE | &quot;tHandle&quot; |
| TCONTACTING | &quot;tContacting&quot; |
| TDIALING | &quot;tDialing&quot; |
| TWAIT | &quot;tWait&quot; |
| TAGENTROUTINGSTATUS | &quot;tAgentRoutingStatus&quot; |
| TORGANIZATIONPRESENCE | &quot;tOrganizationPresence&quot; |
| TSYSTEMPRESENCE | &quot;tSystemPresence&quot; |
| TUSERRESPONSETIME | &quot;tUserResponseTime&quot; |
| TAGENTRESPONSETIME | &quot;tAgentResponseTime&quot; |
| TVOICEMAIL | &quot;tVoicemail&quot; |
| NSTATETRANSITIONERROR | &quot;nStateTransitionError&quot; |
| NOFFERED | &quot;nOffered&quot; |
| NOVERSLA | &quot;nOverSla&quot; |
| NTRANSFERRED | &quot;nTransferred&quot; |
| NBLINDTRANSFERRED | &quot;nBlindTransferred&quot; |
| NCONSULTTRANSFERRED | &quot;nConsultTransferred&quot; |
| NCONSULT | &quot;nConsult&quot; |
| NCONNECTED | &quot;nConnected&quot; |
| TALERT | &quot;tAlert&quot; |
| TNOTRESPONDING | &quot;tNotResponding&quot; |
| NOUTBOUND | &quot;nOutbound&quot; |
| NOUTBOUNDATTEMPTED | &quot;nOutboundAttempted&quot; |
| NOUTBOUNDCONNECTED | &quot;nOutboundConnected&quot; |
| NOUTBOUNDABANDONED | &quot;nOutboundAbandoned&quot; |
| NERROR | &quot;nError&quot; |
| OSERVICETARGET | &quot;oServiceTarget&quot; |
| OSERVICELEVEL | &quot;oServiceLevel&quot; |
| TACTIVE | &quot;tActive&quot; |
| TINACTIVE | &quot;tInactive&quot; |
| OACTIVEUSERS | &quot;oActiveUsers&quot; |
| OMEMBERUSERS | &quot;oMemberUsers&quot; |
| OACTIVEQUEUES | &quot;oActiveQueues&quot; |
| OMEMBERQUEUES | &quot;oMemberQueues&quot; |
| OINTERACTING | &quot;oInteracting&quot; |
| OWAITING | &quot;oWaiting&quot; |
| OONQUEUEUSERS | &quot;oOnQueueUsers&quot; |
| OOFFQUEUEUSERS | &quot;oOffQueueUsers&quot; |
| OUSERPRESENCES | &quot;oUserPresences&quot; |
| OUSERROUTINGSTATUSES | &quot;oUserRoutingStatuses&quot; |
| NSURVEYSSENT | &quot;nSurveysSent&quot; |
| NSURVEYSSTARTED | &quot;nSurveysStarted&quot; |
| NSURVEYSABANDONED | &quot;nSurveysAbandoned&quot; |
| NSURVEYSEXPIRED | &quot;nSurveysExpired&quot; |
| NSURVEYERRORS | &quot;nSurveyErrors&quot; |
| NSURVEYRESPONSES | &quot;nSurveyResponses&quot; |
| NSURVEYANSWERRESPONSES | &quot;nSurveyAnswerResponses&quot; |
| OSURVEYTOTALSCORE | &quot;oSurveyTotalScore&quot; |
| OSURVEYQUESTIONGROUPSCORE | &quot;oSurveyQuestionGroupScore&quot; |
| NSURVEYQUESTIONGROUPRESPONSES | &quot;nSurveyQuestionGroupResponses&quot; |
| OSURVEYQUESTIONSCORE | &quot;oSurveyQuestionScore&quot; |
| NSURVEYQUESTIONRESPONSES | &quot;nSurveyQuestionResponses&quot; |
| NSURVEYNPSRESPONSES | &quot;nSurveyNpsResponses&quot; |
| NSURVEYNPSPROMOTERS | &quot;nSurveyNpsPromoters&quot; |
| NSURVEYNPSDETRACTORS | &quot;nSurveyNpsDetractors&quot; |
| NFLOW | &quot;nFlow&quot; |
| TFLOWDISCONNECT | &quot;tFlowDisconnect&quot; |
| TFLOWEXIT | &quot;tFlowExit&quot; |
| TFLOW | &quot;tFlow&quot; |
| OFLOW | &quot;oFlow&quot; |
| TFLOWOUTCOME | &quot;tFlowOutcome&quot; |
| NFLOWOUTCOME | &quot;nFlowOutcome&quot; |
| NFLOWOUTCOMEFAILED | &quot;nFlowOutcomeFailed&quot; |
{: class="table table-striped"}


<a name="OperatorEnum"></a>

## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| MATCHES | &quot;matches&quot; |
| EXISTS | &quot;exists&quot; |
| NOTEXISTS | &quot;notExists&quot; |
{: class="table table-striped"}



