---
title: SegmentDetailQueryPredicate
---
## SegmentDetailQueryPredicate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | Optional type, can usually be inferred |  [optional] |
| **dimension** | [**DimensionEnum**](#DimensionEnum)<!----> | Left hand side for dimension predicates |  [optional] |
| **propertyType** | [**PropertyTypeEnum**](#PropertyTypeEnum)<!----> | Left hand side for property predicates |  [optional] |
| **property** | <!----><!---->**String**<!----> | Left hand side for property predicates |  [optional] |
| **metric** | [**MetricEnum**](#MetricEnum)<!----> | Left hand side for metric predicates |  [optional] |
| **operator** | [**OperatorEnum**](#OperatorEnum)<!----> | Optional operator, default is matches |  [optional] |
| **value** | <!----><!---->**String**<!----> | Right hand side for dimension, metric, or property predicates |  [optional] |
| **range** | <!----><!---->[**NumericRange**](NumericRange.html)<!----> | Right hand side for dimension, metric, or property predicates |  [optional] |
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
| ADDRESSFROM | &quot;addressFrom&quot; |
| ADDRESSOTHER | &quot;addressOther&quot; |
| ADDRESSSELF | &quot;addressSelf&quot; |
| ADDRESSTO | &quot;addressTo&quot; |
| AGENTSCORE | &quot;agentScore&quot; |
| ANI | &quot;ani&quot; |
| AUDIOMUTED | &quot;audioMuted&quot; |
| CALLBACKNUMBER | &quot;callbackNumber&quot; |
| CALLBACKSCHEDULEDTIME | &quot;callbackScheduledTime&quot; |
| CALLBACKUSERNAME | &quot;callbackUserName&quot; |
| COBROWSEROLE | &quot;cobrowseRole&quot; |
| COBROWSEROOMID | &quot;cobrowseRoomId&quot; |
| CONFERENCE | &quot;conference&quot; |
| DESTINATIONCONVERSATIONID | &quot;destinationConversationId&quot; |
| DESTINATIONSESSIONID | &quot;destinationSessionId&quot; |
| DIRECTION | &quot;direction&quot; |
| DISCONNECTTYPE | &quot;disconnectType&quot; |
| DISPOSITIONANALYZER | &quot;dispositionAnalyzer&quot; |
| DISPOSITIONNAME | &quot;dispositionName&quot; |
| DNIS | &quot;dnis&quot; |
| EDGEID | &quot;edgeId&quot; |
| ENDINGLANGUAGE | &quot;endingLanguage&quot; |
| ENTRYREASON | &quot;entryReason&quot; |
| ENTRYTYPE | &quot;entryType&quot; |
| ERRORCODE | &quot;errorCode&quot; |
| EXITREASON | &quot;exitReason&quot; |
| EXTERNALCONTACTID | &quot;externalContactId&quot; |
| EXTERNALORGANIZATIONID | &quot;externalOrganizationId&quot; |
| FLAGGEDREASON | &quot;flaggedReason&quot; |
| FLOWID | &quot;flowId&quot; |
| FLOWNAME | &quot;flowName&quot; |
| FLOWOUTCOME | &quot;flowOutcome&quot; |
| FLOWOUTCOMEENDTIMESTAMP | &quot;flowOutcomeEndTimestamp&quot; |
| FLOWOUTCOMEID | &quot;flowOutcomeId&quot; |
| FLOWOUTCOMESTARTTIMESTAMP | &quot;flowOutcomeStartTimestamp&quot; |
| FLOWOUTCOMEVALUE | &quot;flowOutcomeValue&quot; |
| FLOWTYPE | &quot;flowType&quot; |
| FLOWVERSION | &quot;flowVersion&quot; |
| GROUPID | &quot;groupId&quot; |
| ISSUEDCALLBACK | &quot;issuedCallback&quot; |
| JOURNEYACTIONID | &quot;journeyActionId&quot; |
| JOURNEYACTIONMAPID | &quot;journeyActionMapId&quot; |
| JOURNEYACTIONMAPVERSION | &quot;journeyActionMapVersion&quot; |
| JOURNEYCUSTOMERID | &quot;journeyCustomerId&quot; |
| JOURNEYCUSTOMERIDTYPE | &quot;journeyCustomerIdType&quot; |
| JOURNEYCUSTOMERSESSIONID | &quot;journeyCustomerSessionId&quot; |
| JOURNEYCUSTOMERSESSIONIDTYPE | &quot;journeyCustomerSessionIdType&quot; |
| MEDIABRIDGEID | &quot;mediaBridgeId&quot; |
| MEDIACOUNT | &quot;mediaCount&quot; |
| MEDIATYPE | &quot;mediaType&quot; |
| MESSAGETYPE | &quot;messageType&quot; |
| MONITOREDPARTICIPANTID | &quot;monitoredParticipantId&quot; |
| OUTBOUNDCAMPAIGNID | &quot;outboundCampaignId&quot; |
| OUTBOUNDCONTACTID | &quot;outboundContactId&quot; |
| OUTBOUNDCONTACTLISTID | &quot;outboundContactListId&quot; |
| PARTICIPANTID | &quot;participantId&quot; |
| PARTICIPANTNAME | &quot;participantName&quot; |
| PEERID | &quot;peerId&quot; |
| PROTOCOLCALLID | &quot;protocolCallId&quot; |
| PROVIDER | &quot;provider&quot; |
| PURPOSE | &quot;purpose&quot; |
| Q850RESPONSECODE | &quot;q850ResponseCode&quot; |
| QUEUEID | &quot;queueId&quot; |
| RECORDING | &quot;recording&quot; |
| REMOTE | &quot;remote&quot; |
| REMOTENAMEDISPLAYABLE | &quot;remoteNameDisplayable&quot; |
| REQUESTEDLANGUAGEID | &quot;requestedLanguageId&quot; |
| REQUESTEDROUTINGSKILLID | &quot;requestedRoutingSkillId&quot; |
| REQUESTEDROUTINGUSERID | &quot;requestedRoutingUserId&quot; |
| ROOMID | &quot;roomId&quot; |
| SCOREDAGENTID | &quot;scoredAgentId&quot; |
| SCREENSHAREADDRESSSELF | &quot;screenShareAddressSelf&quot; |
| SCREENSHAREROOMID | &quot;screenShareRoomId&quot; |
| SCRIPTID | &quot;scriptId&quot; |
| SEGMENTEND | &quot;segmentEnd&quot; |
| SEGMENTTYPE | &quot;segmentType&quot; |
| SESSIONDNIS | &quot;sessionDnis&quot; |
| SESSIONID | &quot;sessionId&quot; |
| SHARINGSCREEN | &quot;sharingScreen&quot; |
| SIPRESPONSECODE | &quot;sipResponseCode&quot; |
| SKIPENABLED | &quot;skipEnabled&quot; |
| SOURCECONVERSATIONID | &quot;sourceConversationId&quot; |
| SOURCESESSIONID | &quot;sourceSessionId&quot; |
| STARTINGLANGUAGE | &quot;startingLanguage&quot; |
| SUBJECT | &quot;subject&quot; |
| TEAMID | &quot;teamId&quot; |
| TIMEOUTSECONDS | &quot;timeoutSeconds&quot; |
| TRANSFERTARGETADDRESS | &quot;transferTargetAddress&quot; |
| TRANSFERTARGETNAME | &quot;transferTargetName&quot; |
| TRANSFERTYPE | &quot;transferType&quot; |
| USERID | &quot;userId&quot; |
| VIDEOADDRESSSELF | &quot;videoAddressSelf&quot; |
| VIDEOMUTED | &quot;videoMuted&quot; |
| VIDEOROOMID | &quot;videoRoomId&quot; |
| WRAPUPCODE | &quot;wrapUpCode&quot; |
| WRAPUPNOTE | &quot;wrapUpNote&quot; |
| WRAPUPTAG | &quot;wrapUpTag&quot; |
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



