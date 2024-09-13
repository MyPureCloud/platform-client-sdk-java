# FlowAggregationQuery


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **interval** | **String** | Behaves like one clause in a SQL WHERE. Specifies the date and time range of data being queried. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss |  |
| **granularity** | **String** | Granularity aggregates metrics into subpartitions within the time interval specified. The default granularity is the same duration as the interval. Periods are represented as an ISO-8601 string. For example: P1D or P1DT12H |  [optional] |
| **timeZone** | **String** | Time zone context used to calculate response intervals (this allows resolving DST changes). The interval offset is used even when timeZone is specified. Default is UTC. Time zones are represented as a string of the zone name as found in the IANA time zone database. For example: UTC, Etc/UTC, or Europe/London |  [optional] |
| **groupBy** | [**List<GroupByEnum>**](#Enum--GroupByEnum) | Behaves like a SQL GROUPBY. Allows for multiple levels of grouping as a list of dimensions. Partitions resulting aggregate computations into distinct named subgroups rather than across the entire result set as if it were one group. |  [optional] |
| **filter** | [**FlowAggregateQueryFilter**](FlowAggregateQueryFilter) | Behaves like a SQL WHERE clause. This is ANDed with the interval parameter. Expresses boolean logical predicates as well as dimensional filters |  [optional] |
| **metrics** | [**List<MetricsEnum>**](#Enum--MetricsEnum) | Behaves like a SQL SELECT clause. Only named metrics will be retrieved. |  |
| **flattenMultivaluedDimensions** | **Boolean** | Flattens any multivalued dimensions used in response groups (e.g. ['a','b','c']->'a,b,c') |  [optional] |
| **views** | [**List&lt;FlowAggregationView&gt;**](FlowAggregationView) | Custom derived metric views |  [optional] |
| **alternateTimeDimension** | [**AlternateTimeDimensionEnum**](#Enum--AlternateTimeDimensionEnum) | Dimension to use as the alternative timestamp for data in the aggregate.  Choosing \"eventTime\" uses the actual time of the data event. |  [optional] |


## Enum: GroupByEnum

| Name | Value |
| ---- | ----- |
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
| ENDINGLANGUAGE | &quot;endingLanguage&quot; |
| ENTRYREASON | &quot;entryReason&quot; |
| ENTRYTYPE | &quot;entryType&quot; |
| ERRORCODE | &quot;errorCode&quot; |
| EXITREASON | &quot;exitReason&quot; |
| EXTENDEDDELIVERYSTATUS | &quot;extendedDeliveryStatus&quot; |
| EXTERNALCONTACTID | &quot;externalContactId&quot; |
| EXTERNALMEDIACOUNT | &quot;externalMediaCount&quot; |
| EXTERNALORGANIZATIONID | &quot;externalOrganizationId&quot; |
| EXTERNALTAG | &quot;externalTag&quot; |
| FIRSTQUEUE | &quot;firstQueue&quot; |
| FLAGGEDREASON | &quot;flaggedReason&quot; |
| FLOWID | &quot;flowId&quot; |
| FLOWINTYPE | &quot;flowInType&quot; |
| FLOWMILESTONEID | &quot;flowMilestoneId&quot; |
| FLOWNAME | &quot;flowName&quot; |
| FLOWOUTTYPE | &quot;flowOutType&quot; |
| FLOWOUTCOME | &quot;flowOutcome&quot; |
| FLOWOUTCOMEID | &quot;flowOutcomeId&quot; |
| FLOWOUTCOMEVALUE | &quot;flowOutcomeValue&quot; |
| FLOWSUBTYPE | &quot;flowSubType&quot; |
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
| RECOGNITIONFAILUREREASON | &quot;recognitionFailureReason&quot; |
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
| STARTINGLANGUAGE | &quot;startingLanguage&quot; |
| STATIONID | &quot;stationId&quot; |
| TEAMID | &quot;teamId&quot; |
| TRANSFERTARGETADDRESS | &quot;transferTargetAddress&quot; |
| TRANSFERTARGETNAME | &quot;transferTargetName&quot; |
| TRANSFERTYPE | &quot;transferType&quot; |
| USEDROUTING | &quot;usedRouting&quot; |
| USERID | &quot;userId&quot; |
| VIDEOPRESENT | &quot;videoPresent&quot; |
| WAITINGINTERACTIONCOUNT | &quot;waitingInteractionCount&quot; |
| WRAPUPCODE | &quot;wrapUpCode&quot; |


## Enum: MetricsEnum

| Name | Value |
| ---- | ----- |
| NFLOW | &quot;nFlow&quot; |
| NFLOWMILESTONE | &quot;nFlowMilestone&quot; |
| NFLOWOUTCOME | &quot;nFlowOutcome&quot; |
| NFLOWOUTCOMEFAILED | &quot;nFlowOutcomeFailed&quot; |
| OFLOWMILESTONE | &quot;oFlowMilestone&quot; |
| TFLOW | &quot;tFlow&quot; |
| TFLOWDISCONNECT | &quot;tFlowDisconnect&quot; |
| TFLOWEXIT | &quot;tFlowExit&quot; |
| TFLOWOUTCOME | &quot;tFlowOutcome&quot; |


## Enum: AlternateTimeDimensionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EVENTTIME | &quot;eventTime&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:209.0.1_
