---
title: FlowsQueryCriteriaResponse
---
## FlowsQueryCriteriaResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **criteria** | <!----><!---->[**List&lt;QueryCriteria&gt;**](QueryCriteria.html)<!----> | The is a list of allowed criteria to query on. |  [optional] |
| **flowTypes** | <!---->[**List&lt;FlowTypesEnum&gt;**](#FlowTypesEnum)<!----> | The is a list of flow types the organization has access to. |  [optional] |
| **actionTypes** | <!---->[**List&lt;ActionTypesEnum&gt;**](#ActionTypesEnum)<!----> | The is a list of action types the organization has access to. |  [optional] |
| **errorCodes** | <!----><!---->**List&lt;String&gt;**<!----> | The is a list of potential error codes the organization may encounter. |  [optional] |
| **warningCodes** | <!----><!---->**List&lt;String&gt;**<!----> | The is a list of potential warning codes the organization may encounter. |  [optional] |
{: class="table table-striped"}


<a name="FlowTypesEnum"></a>

## Enum: FlowTypesEnum

| Name | Value |
| ---- | ----- |
| BOT | &quot;bot&quot; |
| COMMONMODULE | &quot;commonmodule&quot; |
| DIGITALBOT | &quot;digitalbot&quot; |
| INBOUNDCALL | &quot;inboundcall&quot; |
| INBOUNDCHAT | &quot;inboundchat&quot; |
| INBOUNDEMAIL | &quot;inboundemail&quot; |
| INBOUNDSHORTMESSAGE | &quot;inboundshortmessage&quot; |
| INQUEUECALL | &quot;inqueuecall&quot; |
| INQUEUESHORTMESSAGE | &quot;inqueueshortmessage&quot; |
| INQUEUEEMAIL | &quot;inqueueemail&quot; |
| OUTBOUNDCALL | &quot;outboundcall&quot; |
| SECURECALL | &quot;securecall&quot; |
| SURVEYINVITE | &quot;surveyinvite&quot; |
| VOICE | &quot;voice&quot; |
| VOICEMAIL | &quot;voicemail&quot; |
| VOICESURVEY | &quot;voicesurvey&quot; |
| WORKFLOW | &quot;workflow&quot; |
| WORKITEM | &quot;workitem&quot; |
{: class="table table-striped"}


<a name="ActionTypesEnum"></a>

## Enum: ActionTypesEnum

| Name | Value |
| ---- | ----- |
| ACTIONABORTSURVEYINVITE | &quot;actionAbortSurveyInvite&quot; |
| ACTIONADDFLOWMILESTONE | &quot;actionAddFlowMilestone&quot; |
| ACTIONASKFORBOOLEAN | &quot;actionAskForBoolean&quot; |
| ACTIONASKFORNLUINTENT | &quot;actionAskForNLUIntent&quot; |
| ACTIONASKFORNLUNEXTINTENT | &quot;actionAskForNLUNextIntent&quot; |
| ACTIONASKFORSLOT | &quot;actionAskForSlot&quot; |
| ACTIONCALLBOTCONNECTOR | &quot;actionCallBotConnector&quot; |
| ACTIONCALLBOTFLOW | &quot;actionCallBotFlow&quot; |
| ACTIONCALLCOMMONMODULE | &quot;actionCallCommonModule&quot; |
| ACTIONCALLDATA | &quot;actionCallData&quot; |
| ACTIONCALLDATASECURE | &quot;actionCallDataSecure&quot; |
| ACTIONCALLDIALOGENGINEBOT | &quot;actionCallDialogEngineBot&quot; |
| ACTIONCALLDIALOGFLOWBOT | &quot;actionCallDialogflowBot&quot; |
| ACTIONCALLDIALOGFLOWCXBOT | &quot;actionCallDialogflowCxBot&quot; |
| ACTIONCALLDIGITALBOTFLOW | &quot;actionCallDigitalBotFlow&quot; |
| ACTIONCALLLEXBOT | &quot;actionCallLexBot&quot; |
| ACTIONCALLLEXV2BOT | &quot;actionCallLexV2Bot&quot; |
| ACTIONCALLNUANCEMIXBOT | &quot;actionCallNuanceMixBot&quot; |
| ACTIONCALLTASK | &quot;actionCallTask&quot; |
| ACTIONCHANGESTATE | &quot;actionChangeState&quot; |
| ACTIONCLEARSLOT | &quot;actionClearSlot&quot; |
| ACTIONCLEARVOICEMAILSNIPPET | &quot;actionClearVoicemailSnippet&quot; |
| ACTIONCOLLECTINPUT | &quot;actionCollectInput&quot; |
| ACTIONCOMMUNICATE | &quot;actionCommunicate&quot; |
| ACTIONCOMPLETESURVEYINVITE | &quot;actionCompleteSurveyInvite&quot; |
| ACTIONCREATECALLBACK | &quot;actionCreateCallback&quot; |
| ACTIONDATATABLELOOKUP | &quot;actionDataTableLookup&quot; |
| ACTIONDECISION | &quot;actionDecision&quot; |
| ACTIONDECRYPTDATA | &quot;actionDecryptData&quot; |
| ACTIONDETECTSILENCE | &quot;actionDetectSilence&quot; |
| ACTIONDIALEXTENSION | &quot;actionDialExtension&quot; |
| ACTIONDIALNAME | &quot;actionDialName&quot; |
| ACTIONDIGITALMENU | &quot;actionDigitalMenu&quot; |
| ACTIONDISCONNECT | &quot;actionDisconnect&quot; |
| ACTIONENABLEPARTICIPANTRECORD | &quot;actionEnableParticipantRecord&quot; |
| ACTIONENCRYPTDATA | &quot;actionEncryptData&quot; |
| ACTIONENDSTATE | &quot;actionEndState&quot; |
| ACTIONENDTASK | &quot;actionEndTask&quot; |
| ACTIONENDWORKFLOW | &quot;actionEndWorkflow&quot; |
| ACTIONEVALUATESCHEDULE | &quot;actionEvaluateSchedule&quot; |
| ACTIONEVALUATESCHEDULEGROUP | &quot;actionEvaluateScheduleGroup&quot; |
| ACTIONEXITBOTFLOW | &quot;actionExitBotFlow&quot; |
| ACTIONEXITLOOP | &quot;actionExitLoop&quot; |
| ACTIONEXTRACTSECUREDATA | &quot;actionExtractSecureData&quot; |
| ACTIONFINDEMERGENCYGROUP | &quot;actionFindEmergencyGroup&quot; |
| ACTIONFINDGROUP | &quot;actionFindGroup&quot; |
| ACTIONFINDLANGUAGESKILL | &quot;actionFindLanguageSkill&quot; |
| ACTIONFINDQUEUE | &quot;actionFindQueue&quot; |
| ACTIONFINDQUEUEBYID | &quot;actionFindQueueById&quot; |
| ACTIONFINDSCHEDULE | &quot;actionFindSchedule&quot; |
| ACTIONFINDSCHEDULEGROUP | &quot;actionFindScheduleGroup&quot; |
| ACTIONFINDSKILL | &quot;actionFindSkill&quot; |
| ACTIONFINDSYSTEMPROMPT | &quot;actionFindSystemPrompt&quot; |
| ACTIONFINDUSER | &quot;actionFindUser&quot; |
| ACTIONFINDUSERBYID | &quot;actionFindUserById&quot; |
| ACTIONFINDUSERPROMPT | &quot;actionFindUserPrompt&quot; |
| ACTIONFINDUSERSBYID | &quot;actionFindUsersById&quot; |
| ACTIONFLUSHAUDIO | &quot;actionFlushAudio&quot; |
| ACTIONGETCONVERSATIONDATA | &quot;actionGetConversationData&quot; |
| ACTIONGETEXTERNALCONTACT | &quot;actionGetExternalContact&quot; |
| ACTIONGETEXTERNALORGANIZATION | &quot;actionGetExternalOrganization&quot; |
| ACTIONGETJOURNEYOUTCOME | &quot;actionGetJourneyOutcome&quot; |
| ACTIONGETJOURNEYOUTCOMESCORESBYSESSION | &quot;actionGetJourneyOutcomeScoresBySession&quot; |
| ACTIONGETJOURNEYSEGMENT | &quot;actionGetJourneySegment&quot; |
| ACTIONGETJOURNEYSESSION | &quot;actionGetJourneySession&quot; |
| ACTIONGETJOURNEYSESSIONSBYCUSTOMER | &quot;actionGetJourneySessionsByCustomer&quot; |
| ACTIONGETJOURNEYSESSIONSBYEXTERNALCONTACT | &quot;actionGetJourneySessionsByExternalContact&quot; |
| ACTIONGETPARTICIPANTDATA | &quot;actionGetParticipantData&quot; |
| ACTIONGETRESPONSE | &quot;actionGetResponse&quot; |
| ACTIONGETSECUREDDATA | &quot;actionGetSecuredData&quot; |
| ACTIONHOLDMUSIC | &quot;actionHoldMusic&quot; |
| ACTIONINITIALIZEFLOWOUTCOME | &quot;actionInitializeFlowOutcome&quot; |
| ACTIONJUMPTOMENU | &quot;actionJumpToMenu&quot; |
| ACTIONJUMPTOTASK | &quot;actionJumpToTask&quot; |
| ACTIONLOOP | &quot;actionLoop&quot; |
| ACTIONLOOPUNTIL | &quot;actionLoopUntil&quot; |
| ACTIONNEXTLOOP | &quot;actionNextLoop&quot; |
| ACTIONPLAYAUDIO | &quot;actionPlayAudio&quot; |
| ACTIONPLAYAUDIOONSILENCE | &quot;actionPlayAudioOnSilence&quot; |
| ACTIONPLAYESTIMATEDWAITTIME | &quot;actionPlayEstimatedWaitTime&quot; |
| ACTIONPLAYPOSITIONINQUEUE | &quot;actionPlayPositionInQueue&quot; |
| ACTIONPLAYUSERGREETING | &quot;actionPlayUserGreeting&quot; |
| ACTIONPLAYUSERNAME | &quot;actionPlayUserName&quot; |
| ACTIONPREVIOUSMENU | &quot;actionPreviousMenu&quot; |
| ACTIONPROCESSVOICEMAILINPUT | &quot;actionProcessVoicemailInput&quot; |
| ACTIONREPEATMENU | &quot;actionRepeatMenu&quot; |
| ACTIONRETURNTOAGENT | &quot;actionReturnToAgent&quot; |
| ACTIONSAVEWORKITEM | &quot;actionSaveWorkitem&quot; |
| ACTIONSCREENPOP | &quot;actionScreenPop&quot; |
| ACTIONSEARCHEXTERNALCONTACTS | &quot;actionSearchExternalContacts&quot; |
| ACTIONSENDAUTOREPLY | &quot;actionSendAutoReply&quot; |
| ACTIONSENDRESPONSE | &quot;actionSendResponse&quot; |
| ACTIONSETACTIVEINTENT | &quot;actionSetActiveIntent&quot; |
| ACTIONSETCONVERSATIONDATA | &quot;actionSetConversationData&quot; |
| ACTIONSETEXTERNALTAG | &quot;actionSetExternalTag&quot; |
| ACTIONSETFLOWOUTCOME | &quot;actionSetFlowOutcome&quot; |
| ACTIONSETLOCALE | &quot;actionSetLocale&quot; |
| ACTIONSETPARTICIPANTDATA | &quot;actionSetParticipantData&quot; |
| ACTIONSETPRIORITY | &quot;actionSetPriority&quot; |
| ACTIONSETSECUREDDATA | &quot;actionSetSecuredData&quot; |
| ACTIONSETSKILLS | &quot;actionSetSkills&quot; |
| ACTIONSETUUIDATA | &quot;actionSetUUIData&quot; |
| ACTIONSETWHISPERAUDIO | &quot;actionSetWhisperAudio&quot; |
| ACTIONSETWRAPUPCODE | &quot;actionSetWrapupCode&quot; |
| ACTIONSHOWKNOWLEDGEARTICLE | &quot;actionShowKnowledgeArticle&quot; |
| ACTIONSUBMITVOICEMAILSNIPPET | &quot;actionSubmitVoicemailSnippet&quot; |
| ACTIONSWITCH | &quot;actionSwitch&quot; |
| ACTIONTRANSCRIPTION | &quot;actionTranscription&quot; |
| ACTIONTRANSFEREXTERNAL | &quot;actionTransferExternal&quot; |
| ACTIONTRANSFERFLOW | &quot;actionTransferFlow&quot; |
| ACTIONTRANSFERFLOWSECURE | &quot;actionTransferFlowSecure&quot; |
| ACTIONTRANSFERGROUP | &quot;actionTransferGroup&quot; |
| ACTIONTRANSFERTOACD | &quot;actionTransferToAcd&quot; |
| ACTIONTRANSFERUSER | &quot;actionTransferUser&quot; |
| ACTIONTRANSFERVOICEMAIL | &quot;actionTransferVoicemail&quot; |
| ACTIONUPDATEDATA | &quot;actionUpdateData&quot; |
| ACTIONWAIT | &quot;actionWait&quot; |
| ACTIONWAITFORINPUT | &quot;actionWaitForInput&quot; |
| MENUDIALEXTENSION | &quot;menuDialExtension&quot; |
| MENUDIALNAME | &quot;menuDialName&quot; |
| MENUDISCONNECT | &quot;menuDisconnect&quot; |
| MENUJUMPTOMENU | &quot;menuJumpToMenu&quot; |
| MENUJUMPTOTASK | &quot;menuJumpToTask&quot; |
| MENUMENU | &quot;menuMenu&quot; |
| MENUPREVIOUSMENU | &quot;menuPreviousMenu&quot; |
| MENUREPEATMENU | &quot;menuRepeatMenu&quot; |
| MENUSHOWKNOWLEDGEARTICLE | &quot;menuShowKnowledgeArticle&quot; |
| MENUTASK | &quot;menuTask&quot; |
| MENUTRANSFERTOACD | &quot;menuTransferToAcd&quot; |
| MENUTRANSFERFLOW | &quot;menuTransferFlow&quot; |
| MENUTRANSFERGROUP | &quot;menuTransferGroup&quot; |
| MENUTRANSFEREXTERNAL | &quot;menuTransferExternal&quot; |
| MENUTRANSFERFLOWSECURE | &quot;menuTransferFlowSecure&quot; |
| MENUTRANSFERUSER | &quot;menuTransferUser&quot; |
| MENUTRANSFERVOICEMAIL | &quot;menuTransferVoicemail&quot; |
{: class="table table-striped"}



