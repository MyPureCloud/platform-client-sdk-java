---
title: ConversationDetailQueryPredicate
---
## ConversationDetailQueryPredicate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | Optional type, can usually be inferred |  [optional] |
| **dimension** | [**DimensionEnum**](#DimensionEnum)<!----> | Left hand side for dimension predicates |  [optional] |
| **metric** | [**MetricEnum**](#MetricEnum)<!----> | Left hand side for metric predicates |  [optional] |
| **operator** | [**OperatorEnum**](#OperatorEnum)<!----> | Optional operator, default is matches |  [optional] |
| **value** | <!----><!---->**String**<!----> | Right hand side for dimension or metric predicates |  [optional] |
| **range** | <!----><!---->[**NumericRange**](NumericRange.html)<!----> | Right hand side for dimension or metric predicates |  [optional] |
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
| CONVERSATIONEND | &quot;conversationEnd&quot; |
| CONVERSATIONID | &quot;conversationId&quot; |
| CONVERSATIONINITIATOR | &quot;conversationInitiator&quot; |
| CONVERSATIONSTART | &quot;conversationStart&quot; |
| CUSTOMERPARTICIPATION | &quot;customerParticipation&quot; |
| DIVISIONID | &quot;divisionId&quot; |
| EXTERNALTAG | &quot;externalTag&quot; |
| MEDIASTATSMINCONVERSATIONMOS | &quot;mediaStatsMinConversationMos&quot; |
| ORIGINATINGDIRECTION | &quot;originatingDirection&quot; |
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
| NFLOW | &quot;nFlow&quot; |
| NFLOWMILESTONE | &quot;nFlowMilestone&quot; |
| NFLOWOUTCOME | &quot;nFlowOutcome&quot; |
| NFLOWOUTCOMEFAILED | &quot;nFlowOutcomeFailed&quot; |
| NOFFERED | &quot;nOffered&quot; |
| NOUTBOUND | &quot;nOutbound&quot; |
| NOUTBOUNDABANDONED | &quot;nOutboundAbandoned&quot; |
| NOUTBOUNDATTEMPTED | &quot;nOutboundAttempted&quot; |
| NOUTBOUNDCONNECTED | &quot;nOutboundConnected&quot; |
| NOVERSLA | &quot;nOverSla&quot; |
| NSTATETRANSITIONERROR | &quot;nStateTransitionError&quot; |
| NTRANSFERRED | &quot;nTransferred&quot; |
| OEXTERNALMEDIACOUNT | &quot;oExternalMediaCount&quot; |
| OFLOWMILESTONE | &quot;oFlowMilestone&quot; |
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
| TCONVERSATIONDURATION | &quot;tConversationDuration&quot; |
| TDIALING | &quot;tDialing&quot; |
| TFLOW | &quot;tFlow&quot; |
| TFLOWDISCONNECT | &quot;tFlowDisconnect&quot; |
| TFLOWEXIT | &quot;tFlowExit&quot; |
| TFLOWOUT | &quot;tFlowOut&quot; |
| TFLOWOUTCOME | &quot;tFlowOutcome&quot; |
| THANDLE | &quot;tHandle&quot; |
| THELD | &quot;tHeld&quot; |
| THELDCOMPLETE | &quot;tHeldComplete&quot; |
| TIVR | &quot;tIvr&quot; |
| TMONITORING | &quot;tMonitoring&quot; |
| TMONITORINGCOMPLETE | &quot;tMonitoringComplete&quot; |
| TNOTRESPONDING | &quot;tNotResponding&quot; |
| TSHORTABANDON | &quot;tShortAbandon&quot; |
| TTALK | &quot;tTalk&quot; |
| TTALKCOMPLETE | &quot;tTalkComplete&quot; |
| TUSERRESPONSETIME | &quot;tUserResponseTime&quot; |
| TVOICEMAIL | &quot;tVoicemail&quot; |
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



