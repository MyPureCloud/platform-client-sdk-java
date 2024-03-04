---
title: ConversationAggregationView
---
## ConversationAggregationView


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **target** | [**TargetEnum**](#TargetEnum)<!----> | Target metric name |  |
| **name** | <!----><!---->**String**<!----> | A unique name for this view. Must be distinct from other views and built-in metric names. |  |
| **function** | [**FunctionEnum**](#FunctionEnum)<!----> | Type of view you wish to create |  |
| **range** | <!----><!---->[**AggregationRange**](AggregationRange.html)<!----> | Range of numbers for slicing up data |  [optional] |
{: class="table table-striped"}


<a name="TargetEnum"></a>

## Enum: TargetEnum

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
| NSTATETRANSITIONERROR | &quot;nStateTransitionError&quot; | 
| NTRANSFERRED | &quot;nTransferred&quot; | 
| OEXTERNALMEDIACOUNT | &quot;oExternalMediaCount&quot; | 
| OMEDIACOUNT | &quot;oMediaCount&quot; | 
| OMESSAGETURN | &quot;oMessageTurn&quot; | 
| OSERVICELEVEL | &quot;oServiceLevel&quot; | 
| OSERVICETARGET | &quot;oServiceTarget&quot; | 
| TABANDON | &quot;tAbandon&quot; | 
| TACD | &quot;tAcd&quot; | 
| TACTIVECALLBACK | &quot;tActiveCallback&quot; | 
| TACTIVECALLBACKCOMPLETE | &quot;tActiveCallbackComplete&quot; | 
| TACW | &quot;tAcw&quot; | 
| TAGENTRESPONSETIME | &quot;tAgentResponseTime&quot; | 
| TALERT | &quot;tAlert&quot; | 
| TANSWERED | &quot;tAnswered&quot; | 
| TBARGING | &quot;tBarging&quot; | 
| TCOACHING | &quot;tCoaching&quot; | 
| TCOACHINGCOMPLETE | &quot;tCoachingComplete&quot; | 
| TCONNECTED | &quot;tConnected&quot; | 
| TCONTACTING | &quot;tContacting&quot; | 
| TDIALING | &quot;tDialing&quot; | 
| TFIRSTCONNECT | &quot;tFirstConnect&quot; | 
| TFIRSTDIAL | &quot;tFirstDial&quot; | 
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
| TSHORTABANDON | &quot;tShortAbandon&quot; | 
| TTALK | &quot;tTalk&quot; | 
| TTALKCOMPLETE | &quot;tTalkComplete&quot; | 
| TUSERRESPONSETIME | &quot;tUserResponseTime&quot; | 
| TVOICEMAIL | &quot;tVoicemail&quot; | 
| TWAIT | &quot;tWait&quot; | 
{: class="table table-striped"}


<a name="FunctionEnum"></a>

## Enum: FunctionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| RANGEBOUND | &quot;rangeBound&quot; | 
{: class="table table-striped"}



