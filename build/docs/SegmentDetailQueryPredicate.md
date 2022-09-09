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
| ADDRESSTO | &quot;addressTo&quot; | 
| AGENTASSISTANTID | &quot;agentAssistantId&quot; | 
| AGENTOWNED | &quot;agentOwned&quot; | 
| ANI | &quot;ani&quot; | 
| AUTHENTICATED | &quot;authenticated&quot; | 
| BARGEDPARTICIPANTID | &quot;bargedParticipantId&quot; | 
| CALLBACKNUMBER | &quot;callbackNumber&quot; | 
| CALLBACKSCHEDULEDTIME | &quot;callbackScheduledTime&quot; | 
| COACHEDPARTICIPANTID | &quot;coachedParticipantId&quot; | 
| CONFERENCE | &quot;conference&quot; | 
| DELIVERYSTATUS | &quot;deliveryStatus&quot; | 
| DESTINATIONADDRESS | &quot;destinationAddress&quot; | 
| DESTINATIONCONVERSATIONID | &quot;destinationConversationId&quot; | 
| DIRECTION | &quot;direction&quot; | 
| DISCONNECTTYPE | &quot;disconnectType&quot; | 
| DNIS | &quot;dnis&quot; | 
| EDGEID | &quot;edgeId&quot; | 
| ERRORCODE | &quot;errorCode&quot; | 
| EXITREASON | &quot;exitReason&quot; | 
| EXTENDEDDELIVERYSTATUS | &quot;extendedDeliveryStatus&quot; | 
| EXTERNALCONTACTID | &quot;externalContactId&quot; | 
| EXTERNALORGANIZATIONID | &quot;externalOrganizationId&quot; | 
| FLAGGEDREASON | &quot;flaggedReason&quot; | 
| FLOWID | &quot;flowId&quot; | 
| FLOWNAME | &quot;flowName&quot; | 
| FLOWOUTTYPE | &quot;flowOutType&quot; | 
| FLOWOUTCOME | &quot;flowOutcome&quot; | 
| FLOWOUTCOMEID | &quot;flowOutcomeId&quot; | 
| FLOWOUTCOMEVALUE | &quot;flowOutcomeValue&quot; | 
| FLOWVERSION | &quot;flowVersion&quot; | 
| GROUPID | &quot;groupId&quot; | 
| JOURNEYACTIONID | &quot;journeyActionId&quot; | 
| JOURNEYACTIONMAPID | &quot;journeyActionMapId&quot; | 
| JOURNEYCUSTOMERID | &quot;journeyCustomerId&quot; | 
| JOURNEYCUSTOMERIDTYPE | &quot;journeyCustomerIdType&quot; | 
| JOURNEYCUSTOMERSESSIONID | &quot;journeyCustomerSessionId&quot; | 
| MEDIACOUNT | &quot;mediaCount&quot; | 
| MEDIATYPE | &quot;mediaType&quot; | 
| MESSAGETYPE | &quot;messageType&quot; | 
| MONITOREDPARTICIPANTID | &quot;monitoredParticipantId&quot; | 
| OUTBOUNDCAMPAIGNID | &quot;outboundCampaignId&quot; | 
| OUTBOUNDCONTACTID | &quot;outboundContactId&quot; | 
| OUTBOUNDCONTACTLISTID | &quot;outboundContactListId&quot; | 
| PARTICIPANTNAME | &quot;participantName&quot; | 
| PROTOCOLCALLID | &quot;protocolCallId&quot; | 
| PROVIDER | &quot;provider&quot; | 
| PURPOSE | &quot;purpose&quot; | 
| QUEUEID | &quot;queueId&quot; | 
| RECORDING | &quot;recording&quot; | 
| REMOTE | &quot;remote&quot; | 
| REMOTENAMEDISPLAYABLE | &quot;remoteNameDisplayable&quot; | 
| REQUESTEDLANGUAGEID | &quot;requestedLanguageId&quot; | 
| REQUESTEDROUTING | &quot;requestedRouting&quot; | 
| REQUESTEDROUTINGSKILLID | &quot;requestedRoutingSkillId&quot; | 
| SCOREDAGENTID | &quot;scoredAgentId&quot; | 
| SCRIPTID | &quot;scriptId&quot; | 
| SEGMENTEND | &quot;segmentEnd&quot; | 
| SEGMENTTYPE | &quot;segmentType&quot; | 
| SESSIONDNIS | &quot;sessionDnis&quot; | 
| SIPRESPONSECODE | &quot;sipResponseCode&quot; | 
| SUBJECT | &quot;subject&quot; | 
| TEAMID | &quot;teamId&quot; | 
| TRANSFERTARGETADDRESS | &quot;transferTargetAddress&quot; | 
| TRANSFERTARGETNAME | &quot;transferTargetName&quot; | 
| TRANSFERTYPE | &quot;transferType&quot; | 
| USEDROUTING | &quot;usedRouting&quot; | 
| USERID | &quot;userId&quot; | 
| WRAPUPCODE | &quot;wrapUpCode&quot; | 
| WRAPUPNOTE | &quot;wrapUpNote&quot; | 
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



