# ConversationAggregateQueryPredicate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | Optional type, can usually be inferred |  [optional] |
| **dimension** | [**DimensionEnum**](#Enum--DimensionEnum) | Left hand side for dimension predicates |  [optional] |
| **operator** | [**OperatorEnum**](#Enum--OperatorEnum) | Optional operator, default is matches |  [optional] |
| **value** | **String** | Right hand side for dimension predicates |  [optional] |
| **range** | [**NumericRange**](NumericRange) | Right hand side for dimension predicates |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DIMENSION | &quot;dimension&quot; | 
| PROPERTY | &quot;property&quot; | 
| METRIC | &quot;metric&quot; | 


## Enum: DimensionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACTIVEROUTING | &quot;activeRouting&quot; | 
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
| CANONICALEXTERNALCONTACTID | &quot;canonicalExternalContactId&quot; | 
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
| ERRORCODE | &quot;errorCode&quot; | 
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
| ORIGINATINGSOCIALMEDIAPUBLIC | &quot;originatingSocialMediaPublic&quot; | 
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
| REQUESTEDLANGUAGEID | &quot;requestedLanguageId&quot; | 
| REQUESTEDROUTING | &quot;requestedRouting&quot; | 
| REQUESTEDROUTINGSKILLID | &quot;requestedRoutingSkillId&quot; | 
| ROOMID | &quot;roomId&quot; | 
| ROUTINGPRIORITY | &quot;routingPriority&quot; | 
| ROUTINGRING | &quot;routingRing&quot; | 
| ROUTINGRULE | &quot;routingRule&quot; | 
| ROUTINGRULETYPE | &quot;routingRuleType&quot; | 
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
| VIDEOPRESENT | &quot;videoPresent&quot; | 
| WAITINGINTERACTIONCOUNT | &quot;waitingInteractionCount&quot; | 
| WRAPUPCODE | &quot;wrapUpCode&quot; | 


## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| MATCHES | &quot;matches&quot; | 
| EXISTS | &quot;exists&quot; | 
| NOTEXISTS | &quot;notExists&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
