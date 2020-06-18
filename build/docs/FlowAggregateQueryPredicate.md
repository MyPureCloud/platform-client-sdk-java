---
title: FlowAggregateQueryPredicate
---
## FlowAggregateQueryPredicate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | Optional type, can usually be inferred |  [optional] |
| **dimension** | [**DimensionEnum**](#DimensionEnum)<!----> | Left hand side for dimension predicates |  [optional] |
| **operator** | [**OperatorEnum**](#OperatorEnum)<!----> | Optional operator, default is matches |  [optional] |
| **value** | <!----><!---->**String**<!----> | Right hand side for dimension predicates |  [optional] |
| **range** | <!----><!---->[**NumericRange**](NumericRange.html)<!----> | Right hand side for dimension predicates |  [optional] |
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
| AGENTSCORE | &quot;agentScore&quot; |
| ANI | &quot;ani&quot; |
| CONVERSATIONID | &quot;conversationId&quot; |
| CONVERTEDFROM | &quot;convertedFrom&quot; |
| CONVERTEDTO | &quot;convertedTo&quot; |
| DIRECTION | &quot;direction&quot; |
| DISCONNECTTYPE | &quot;disconnectType&quot; |
| DIVISIONID | &quot;divisionId&quot; |
| DNIS | &quot;dnis&quot; |
| EDGEID | &quot;edgeId&quot; |
| ENDINGLANGUAGE | &quot;endingLanguage&quot; |
| ENTRYREASON | &quot;entryReason&quot; |
| ENTRYTYPE | &quot;entryType&quot; |
| EXITREASON | &quot;exitReason&quot; |
| EXTERNALCONTACTID | &quot;externalContactId&quot; |
| EXTERNALMEDIACOUNT | &quot;externalMediaCount&quot; |
| EXTERNALORGANIZATIONID | &quot;externalOrganizationId&quot; |
| FLAGGEDREASON | &quot;flaggedReason&quot; |
| FLOWID | &quot;flowId&quot; |
| FLOWNAME | &quot;flowName&quot; |
| FLOWOUTTYPE | &quot;flowOutType&quot; |
| FLOWOUTCOME | &quot;flowOutcome&quot; |
| FLOWOUTCOMEID | &quot;flowOutcomeId&quot; |
| FLOWOUTCOMEVALUE | &quot;flowOutcomeValue&quot; |
| FLOWTYPE | &quot;flowType&quot; |
| FLOWVERSION | &quot;flowVersion&quot; |
| GROUPID | &quot;groupId&quot; |
| INTERACTIONTYPE | &quot;interactionType&quot; |
| JOURNEYACTIONID | &quot;journeyActionId&quot; |
| JOURNEYACTIONMAPID | &quot;journeyActionMapId&quot; |
| JOURNEYACTIONMAPVERSION | &quot;journeyActionMapVersion&quot; |
| JOURNEYCUSTOMERID | &quot;journeyCustomerId&quot; |
| JOURNEYCUSTOMERIDTYPE | &quot;journeyCustomerIdType&quot; |
| JOURNEYCUSTOMERSESSIONID | &quot;journeyCustomerSessionId&quot; |
| JOURNEYCUSTOMERSESSIONIDTYPE | &quot;journeyCustomerSessionIdType&quot; |
| MEDIACOUNT | &quot;mediaCount&quot; |
| MEDIATYPE | &quot;mediaType&quot; |
| MESSAGETYPE | &quot;messageType&quot; |
| ORIGINATINGDIRECTION | &quot;originatingDirection&quot; |
| OUTBOUNDCAMPAIGNID | &quot;outboundCampaignId&quot; |
| OUTBOUNDCONTACTID | &quot;outboundContactId&quot; |
| OUTBOUNDCONTACTLISTID | &quot;outboundContactListId&quot; |
| PARTICIPANTNAME | &quot;participantName&quot; |
| PEERID | &quot;peerId&quot; |
| PROVIDER | &quot;provider&quot; |
| PURPOSE | &quot;purpose&quot; |
| QUEUEID | &quot;queueId&quot; |
| REMOTE | &quot;remote&quot; |
| REQUESTEDLANGUAGEID | &quot;requestedLanguageId&quot; |
| REQUESTEDROUTINGSKILLID | &quot;requestedRoutingSkillId&quot; |
| ROOMID | &quot;roomId&quot; |
| ROUTINGPRIORITY | &quot;routingPriority&quot; |
| SCOREDAGENTID | &quot;scoredAgentId&quot; |
| SESSIONDNIS | &quot;sessionDnis&quot; |
| SESSIONID | &quot;sessionId&quot; |
| STARTINGLANGUAGE | &quot;startingLanguage&quot; |
| STATIONID | &quot;stationId&quot; |
| TEAMID | &quot;teamId&quot; |
| TRANSFERTARGETADDRESS | &quot;transferTargetAddress&quot; |
| TRANSFERTARGETNAME | &quot;transferTargetName&quot; |
| TRANSFERTYPE | &quot;transferType&quot; |
| USERID | &quot;userId&quot; |
| WRAPUPCODE | &quot;wrapUpCode&quot; |
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



