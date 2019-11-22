---
title: ConversationAggregationQuery
---
## ConversationAggregationQuery


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **interval** | <!----><!---->**String**<!----> | Behaves like one clause in a SQL WHERE. Specifies the date and time range of data being queried. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss |  [optional] |
| **granularity** | <!----><!---->**String**<!----> | Granularity aggregates metrics into subpartitions within the time interval specified. The default granularity is the same duration as the interval. Periods are represented as an ISO-8601 string. For example: P1D or P1DT12H |  [optional] |
| **timeZone** | <!----><!---->**String**<!----> | Sets the time zone for the query interval, defaults to UTC. Time zones are represented as a string of the zone name as found in the IANA time zone database. For example: UTC, Etc/UTC, or Europe/London |  [optional] |
| **groupBy** | <!---->[**List&lt;GroupByEnum&gt;**](#GroupByEnum)<!----> | Behaves like a SQL GROUPBY. Allows for multiple levels of grouping as a list of dimensions. Partitions resulting aggregate computations into distinct named subgroups rather than across the entire result set as if it were one group. |  [optional] |
| **filter** | <!----><!---->[**ConversationAggregateQueryFilter**](ConversationAggregateQueryFilter.html)<!----> | Behaves like a SQL WHERE clause. This is ANDed with the interval parameter. Expresses boolean logical predicates as well as dimensional filters |  [optional] |
| **metrics** | <!---->[**List&lt;MetricsEnum&gt;**](#MetricsEnum)<!----> | Behaves like a SQL SELECT clause. Enables retrieving only named metrics. If omitted, all metrics that are available will be returned (like SELECT *). |  [optional] |
| **flattenMultivaluedDimensions** | <!----><!---->**Boolean**<!----> | Flattens any multivalued dimensions used in response groups (e.g. [&#39;a&#39;,&#39;b&#39;,&#39;c&#39;]-&gt;&#39;a,b,c&#39;) |  [optional] |
| **views** | <!----><!---->[**List&lt;ConversationAggregationView&gt;**](ConversationAggregationView.html)<!----> | Custom derived metric views |  [optional] |
| **alternateTimeDimension** | [**AlternateTimeDimensionEnum**](#AlternateTimeDimensionEnum)<!----> | Dimension to use as the alternative timestamp for data in the aggregate.  Choosing \&quot;eventTime\&quot; uses the actual time of the data event. |  [optional] |
{: class="table table-striped"}


<a name="GroupByEnum"></a>

## Enum: GroupByEnum

| Name | Value |
| ---- | ----- |
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
| EXTERNALORGANIZATIONID | &quot;externalOrganizationId&quot; |
| FLAGGEDREASON | &quot;flaggedReason&quot; |
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
| REQUESTEDLANGUAGEID | &quot;requestedLanguageId&quot; |
| REQUESTEDROUTINGSKILLID | &quot;requestedRoutingSkillId&quot; |
| ROOMID | &quot;roomId&quot; |
| ROUTINGPRIORITY | &quot;routingPriority&quot; |
| SCOREDAGENTID | &quot;scoredAgentId&quot; |
| SESSIONDNIS | &quot;sessionDnis&quot; |
| SESSIONID | &quot;sessionId&quot; |
| STATIONID | &quot;stationId&quot; |
| USERID | &quot;userId&quot; |
| WRAPUPCODE | &quot;wrapUpCode&quot; |
{: class="table table-striped"}


<a name="MetricsEnum"></a>

## Enum: MetricsEnum

| Name | Value |
| ---- | ----- |
| NBLINDTRANSFERRED | &quot;nBlindTransferred&quot; |
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
| NSTATETRANSITIONERROR | &quot;nStateTransitionError&quot; |
| NTRANSFERRED | &quot;nTransferred&quot; |
| OINTERACTING | &quot;oInteracting&quot; |
| OSERVICELEVEL | &quot;oServiceLevel&quot; |
| OSERVICETARGET | &quot;oServiceTarget&quot; |
| OWAITING | &quot;oWaiting&quot; |
| TABANDON | &quot;tAbandon&quot; |
| TACD | &quot;tAcd&quot; |
| TACW | &quot;tAcw&quot; |
| TAGENTRESPONSETIME | &quot;tAgentResponseTime&quot; |
| TALERT | &quot;tAlert&quot; |
| TANSWERED | &quot;tAnswered&quot; |
| TCONTACTING | &quot;tContacting&quot; |
| TDIALING | &quot;tDialing&quot; |
| TFLOWOUT | &quot;tFlowOut&quot; |
| THANDLE | &quot;tHandle&quot; |
| THELD | &quot;tHeld&quot; |
| THELDCOMPLETE | &quot;tHeldComplete&quot; |
| TIVR | &quot;tIvr&quot; |
| TNOTRESPONDING | &quot;tNotResponding&quot; |
| TSHORTABANDON | &quot;tShortAbandon&quot; |
| TTALK | &quot;tTalk&quot; |
| TTALKCOMPLETE | &quot;tTalkComplete&quot; |
| TUSERRESPONSETIME | &quot;tUserResponseTime&quot; |
| TVOICEMAIL | &quot;tVoicemail&quot; |
| TWAIT | &quot;tWait&quot; |
{: class="table table-striped"}


<a name="AlternateTimeDimensionEnum"></a>

## Enum: AlternateTimeDimensionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| EVENTTIME | &quot;eventTime&quot; |
{: class="table table-striped"}



