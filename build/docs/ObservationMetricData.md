---
title: ObservationMetricData
---
## ObservationMetricData


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **metric** | [**MetricEnum**](#MetricEnum) |  |  [optional] |
| **qualifier** | **String** |  |  [optional] |
| **stats** | [**StatisticalSummary**](StatisticalSummary.html) |  |  [optional] |
| **truncated** | **Boolean** | Flag for a truncated list of observations. If truncated, the first half of the list of observations will contain the oldest observations and the second half the newest observations. |  [optional] |
| **observations** | [**List&lt;ObservationValue&gt;**](ObservationValue.html) | List of observations sorted by timestamp in ascending order. This list may be truncated. |  [optional] |
{: class="table table-striped"}


<a name="MetricEnum"></a>

## Enum: MetricEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| TSEGMENTDURATION | &quot;tSegmentDuration&quot; |
| TCONVERSATIONDURATION | &quot;tConversationDuration&quot; |
| OTOTALCRITICALSCORE | &quot;oTotalCriticalScore&quot; |
| OTOTALSCORE | &quot;oTotalScore&quot; |
| NEVALUATIONS | &quot;nEvaluations&quot; |
| TABANDON | &quot;tAbandon&quot; |
| TIVR | &quot;tIvr&quot; |
| TANSWERED | &quot;tAnswered&quot; |
| TFLOWOUT | &quot;tFlowOut&quot; |
| TACD | &quot;tAcd&quot; |
| TTALK | &quot;tTalk&quot; |
| THELD | &quot;tHeld&quot; |
| TTALKCOMPLETE | &quot;tTalkComplete&quot; |
| THELDCOMPLETE | &quot;tHeldComplete&quot; |
| TACW | &quot;tAcw&quot; |
| THANDLE | &quot;tHandle&quot; |
| TCONTACTING | &quot;tContacting&quot; |
| TDIALING | &quot;tDialing&quot; |
| TWAIT | &quot;tWait&quot; |
| TAGENTROUTINGSTATUS | &quot;tAgentRoutingStatus&quot; |
| TORGANIZATIONPRESENCE | &quot;tOrganizationPresence&quot; |
| TSYSTEMPRESENCE | &quot;tSystemPresence&quot; |
| TUSERRESPONSETIME | &quot;tUserResponseTime&quot; |
| TAGENTRESPONSETIME | &quot;tAgentResponseTime&quot; |
| TVOICEMAIL | &quot;tVoicemail&quot; |
| NSTATETRANSITIONERROR | &quot;nStateTransitionError&quot; |
| NOFFERED | &quot;nOffered&quot; |
| NOVERSLA | &quot;nOverSla&quot; |
| NTRANSFERRED | &quot;nTransferred&quot; |
| NBLINDTRANSFERRED | &quot;nBlindTransferred&quot; |
| NCONSULTTRANSFERRED | &quot;nConsultTransferred&quot; |
| NCONSULT | &quot;nConsult&quot; |
| NCONNECTED | &quot;nConnected&quot; |
| TALERT | &quot;tAlert&quot; |
| TNOTRESPONDING | &quot;tNotResponding&quot; |
| NOUTBOUND | &quot;nOutbound&quot; |
| NOUTBOUNDATTEMPTED | &quot;nOutboundAttempted&quot; |
| NOUTBOUNDCONNECTED | &quot;nOutboundConnected&quot; |
| NOUTBOUNDABANDONED | &quot;nOutboundAbandoned&quot; |
| NERROR | &quot;nError&quot; |
| OSERVICETARGET | &quot;oServiceTarget&quot; |
| OSERVICELEVEL | &quot;oServiceLevel&quot; |
| TACTIVE | &quot;tActive&quot; |
| TINACTIVE | &quot;tInactive&quot; |
| OACTIVEUSERS | &quot;oActiveUsers&quot; |
| OMEMBERUSERS | &quot;oMemberUsers&quot; |
| OACTIVEQUEUES | &quot;oActiveQueues&quot; |
| OMEMBERQUEUES | &quot;oMemberQueues&quot; |
| OINTERACTING | &quot;oInteracting&quot; |
| OWAITING | &quot;oWaiting&quot; |
| OONQUEUEUSERS | &quot;oOnQueueUsers&quot; |
| OOFFQUEUEUSERS | &quot;oOffQueueUsers&quot; |
| OUSERPRESENCES | &quot;oUserPresences&quot; |
| OUSERROUTINGSTATUSES | &quot;oUserRoutingStatuses&quot; |
| NSURVEYSSENT | &quot;nSurveysSent&quot; |
| NSURVEYSSTARTED | &quot;nSurveysStarted&quot; |
| NSURVEYSABANDONED | &quot;nSurveysAbandoned&quot; |
| NSURVEYSEXPIRED | &quot;nSurveysExpired&quot; |
| NSURVEYERRORS | &quot;nSurveyErrors&quot; |
| NSURVEYRESPONSES | &quot;nSurveyResponses&quot; |
| NSURVEYANSWERRESPONSES | &quot;nSurveyAnswerResponses&quot; |
| OSURVEYTOTALSCORE | &quot;oSurveyTotalScore&quot; |
| OSURVEYQUESTIONGROUPSCORE | &quot;oSurveyQuestionGroupScore&quot; |
| NSURVEYQUESTIONGROUPRESPONSES | &quot;nSurveyQuestionGroupResponses&quot; |
| OSURVEYQUESTIONSCORE | &quot;oSurveyQuestionScore&quot; |
| NSURVEYQUESTIONRESPONSES | &quot;nSurveyQuestionResponses&quot; |
| NSURVEYNPSRESPONSES | &quot;nSurveyNpsResponses&quot; |
| NSURVEYNPSPROMOTERS | &quot;nSurveyNpsPromoters&quot; |
| NSURVEYNPSDETRACTORS | &quot;nSurveyNpsDetractors&quot; |
| NFLOW | &quot;nFlow&quot; |
| TFLOWDISCONNECT | &quot;tFlowDisconnect&quot; |
| TFLOWEXIT | &quot;tFlowExit&quot; |
| TFLOW | &quot;tFlow&quot; |
| OFLOW | &quot;oFlow&quot; |
| TFLOWOUTCOME | &quot;tFlowOutcome&quot; |
| NFLOWOUTCOME | &quot;nFlowOutcome&quot; |
| NFLOWOUTCOMEFAILED | &quot;nFlowOutcomeFailed&quot; |
{: class="table table-striped"}



