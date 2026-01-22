# ConversationAggregationView


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **target** | [**TargetEnum**](#Enum--TargetEnum) | Target metric name |  |
| **name** | **String** | A unique name for this view. Must be distinct from other views and built-in metric names. |  |
| **function** | [**FunctionEnum**](#Enum--FunctionEnum) | Type of view you wish to create |  |
| **range** | [**AggregationRange**](AggregationRange) | Range of numbers for slicing up data |  [optional] |


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
| NCONVERSATIONS | &quot;nConversations&quot; | 
| NERROR | &quot;nError&quot; | 
| NOFFERED | &quot;nOffered&quot; | 
| NOUTBOUND | &quot;nOutbound&quot; | 
| NOUTBOUNDABANDONED | &quot;nOutboundAbandoned&quot; | 
| NOUTBOUNDATTEMPTED | &quot;nOutboundAttempted&quot; | 
| NOUTBOUNDCONNECTED | &quot;nOutboundConnected&quot; | 
| NOVERSLA | &quot;nOverSla&quot; | 
| NSTATETRANSITIONERROR | &quot;nStateTransitionError&quot; | 
| NTRANSFERRED | &quot;nTransferred&quot; | 
| OAUDIOMESSAGECOUNT | &quot;oAudioMessageCount&quot; | 
| OEXTERNALAUDIOMESSAGECOUNT | &quot;oExternalAudioMessageCount&quot; | 
| OEXTERNALMEDIACOUNT | &quot;oExternalMediaCount&quot; | 
| OMEDIACOUNT | &quot;oMediaCount&quot; | 
| OMESSAGECOUNT | &quot;oMessageCount&quot; | 
| OMESSAGESEGMENTCOUNT | &quot;oMessageSegmentCount&quot; | 
| OMESSAGETURN | &quot;oMessageTurn&quot; | 
| OSERVICELEVEL | &quot;oServiceLevel&quot; | 
| OSERVICETARGET | &quot;oServiceTarget&quot; | 
| TABANDON | &quot;tAbandon&quot; | 
| TACD | &quot;tAcd&quot; | 
| TACTIVECALLBACK | &quot;tActiveCallback&quot; | 
| TACTIVECALLBACKCOMPLETE | &quot;tActiveCallbackComplete&quot; | 
| TACW | &quot;tAcw&quot; | 
| TAGENTRESPONSETIME | &quot;tAgentResponseTime&quot; | 
| TAGENTVIDEOCONNECTED | &quot;tAgentVideoConnected&quot; | 
| TALERT | &quot;tAlert&quot; | 
| TANSWERED | &quot;tAnswered&quot; | 
| TAVERAGEAGENTRESPONSETIME | &quot;tAverageAgentResponseTime&quot; | 
| TAVERAGECUSTOMERRESPONSETIME | &quot;tAverageCustomerResponseTime&quot; | 
| TBARGING | &quot;tBarging&quot; | 
| TCOACHING | &quot;tCoaching&quot; | 
| TCOACHINGCOMPLETE | &quot;tCoachingComplete&quot; | 
| TCONNECTED | &quot;tConnected&quot; | 
| TCONTACTING | &quot;tContacting&quot; | 
| TDIALING | &quot;tDialing&quot; | 
| TFIRSTCONNECT | &quot;tFirstConnect&quot; | 
| TFIRSTDIAL | &quot;tFirstDial&quot; | 
| TFIRSTENGAGEMENT | &quot;tFirstEngagement&quot; | 
| TFIRSTRESPONSE | &quot;tFirstResponse&quot; | 
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
| TSCREENMONITORING | &quot;tScreenMonitoring&quot; | 
| TSHORTABANDON | &quot;tShortAbandon&quot; | 
| TSNIPPETRECORD | &quot;tSnippetRecord&quot; | 
| TTALK | &quot;tTalk&quot; | 
| TTALKCOMPLETE | &quot;tTalkComplete&quot; | 
| TUSERRESPONSETIME | &quot;tUserResponseTime&quot; | 
| TVOICEMAIL | &quot;tVoicemail&quot; | 
| TWAIT | &quot;tWait&quot; | 


## Enum: FunctionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| RANGEBOUND | &quot;rangeBound&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:245.0.0_
