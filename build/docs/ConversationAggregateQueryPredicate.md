---
title: ConversationAggregateQueryPredicate
---
## ConversationAggregateQueryPredicate


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
| ACTIVESKILLID | &quot;activeSkillId&quot; |
| ADDRESSFROM | &quot;addressFrom&quot; |
| ADDRESSTO | &quot;addressTo&quot; |
| AGENTASSISTANTID | &quot;agentAssistantId&quot; |
| AGENTBULLSEYERING | &quot;agentBullseyeRing&quot; |
| AGENTOWNED | &quot;agentOwned&quot; |
| AGENTRANK | &quot;agentRank&quot; |
| AGENTSCORE | &quot;agentScore&quot; |
| ANI | &quot;ani&quot; |
| ASSIGNERID | &quot;assignerId&quot; |
| AUTHENTICATED | &quot;authenticated&quot; |
| CONVERSATIONID | &quot;conversationId&quot; |
| CONVERSATIONINITIATOR | &quot;conversationInitiator&quot; |
| CONVERTEDFROM | &quot;convertedFrom&quot; |
| CONVERTEDTO | &quot;convertedTo&quot; |
| CUSTOMERPARTICIPATION | &quot;customerParticipation&quot; |
| DELIVERYSTATUS | &quot;deliveryStatus&quot; |
| DESTINATIONADDRESS | &quot;destinationAddress&quot; |
| DIRECTION | &quot;direction&quot; |
| DISCONNECTTYPE | &quot;disconnectType&quot; |
| DIVISIONID | &quot;divisionId&quot; |
| DNIS | &quot;dnis&quot; |
| EDGEID | &quot;edgeId&quot; |
| ELIGIBLEAGENTCOUNT | &quot;eligibleAgentCount&quot; |
| EXTENDEDDELIVERYSTATUS | &quot;extendedDeliveryStatus&quot; |
| EXTERNALCONTACTID | &quot;externalContactId&quot; |
| EXTERNALMEDIACOUNT | &quot;externalMediaCount&quot; |
| EXTERNALORGANIZATIONID | &quot;externalOrganizationId&quot; |
| EXTERNALTAG | &quot;externalTag&quot; |
| FIRSTQUEUE | &quot;firstQueue&quot; |
| FLAGGEDREASON | &quot;flaggedReason&quot; |
| FLOWINTYPE | &quot;flowInType&quot; |
| FLOWOUTTYPE | &quot;flowOutType&quot; |
| GROUPID | &quot;groupId&quot; |
| INTERACTIONTYPE | &quot;interactionType&quot; |
| JOURNEYACTIONID | &quot;journeyActionId&quot; |
| JOURNEYACTIONMAPID | &quot;journeyActionMapId&quot; |
| JOURNEYACTIONMAPVERSION | &quot;journeyActionMapVersion&quot; |
| JOURNEYCUSTOMERID | &quot;journeyCustomerId&quot; |
| JOURNEYCUSTOMERIDTYPE | &quot;journeyCustomerIdType&quot; |
| JOURNEYCUSTOMERSESSIONID | &quot;journeyCustomerSessionId&quot; |
| JOURNEYCUSTOMERSESSIONIDTYPE | &quot;journeyCustomerSessionIdType&quot; |
| KNOWLEDGEBASEID | &quot;knowledgeBaseId&quot; |
| MEDIACOUNT | &quot;mediaCount&quot; |
| MEDIATYPE | &quot;mediaType&quot; |
| MESSAGETYPE | &quot;messageType&quot; |
| ORIGINATINGDIRECTION | &quot;originatingDirection&quot; |
| OUTBOUNDCAMPAIGNID | &quot;outboundCampaignId&quot; |
| OUTBOUNDCONTACTID | &quot;outboundContactId&quot; |
| OUTBOUNDCONTACTLISTID | &quot;outboundContactListId&quot; |
| PARTICIPANTNAME | &quot;participantName&quot; |
| PEERID | &quot;peerId&quot; |
| PROPOSEDAGENTID | &quot;proposedAgentId&quot; |
| PROVIDER | &quot;provider&quot; |
| PURPOSE | &quot;purpose&quot; |
| QUEUEID | &quot;queueId&quot; |
| REMOTE | &quot;remote&quot; |
| REMOVEDSKILLID | &quot;removedSkillId&quot; |
| REOFFERED | &quot;reoffered&quot; |
| REQUESTEDLANGUAGEID | &quot;requestedLanguageId&quot; |
| REQUESTEDROUTING | &quot;requestedRouting&quot; |
| REQUESTEDROUTINGSKILLID | &quot;requestedRoutingSkillId&quot; |
| ROOMID | &quot;roomId&quot; |
| ROUTINGPRIORITY | &quot;routingPriority&quot; |
| ROUTINGRING | &quot;routingRing&quot; |
| SCOREDAGENTID | &quot;scoredAgentId&quot; |
| SELECTEDAGENTID | &quot;selectedAgentId&quot; |
| SELECTEDAGENTRANK | &quot;selectedAgentRank&quot; |
| SELFSERVED | &quot;selfServed&quot; |
| SESSIONDNIS | &quot;sessionDnis&quot; |
| SESSIONID | &quot;sessionId&quot; |
| STATIONID | &quot;stationId&quot; |
| TEAMID | &quot;teamId&quot; |
| USEDROUTING | &quot;usedRouting&quot; |
| USERID | &quot;userId&quot; |
| WAITINGINTERACTIONCOUNT | &quot;waitingInteractionCount&quot; |
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



