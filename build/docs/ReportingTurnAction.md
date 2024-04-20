---
title: ReportingTurnAction
---
## ReportingTurnAction


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **actionId** | <!----><!---->**String**<!----> | The ID of the action in the bot flow. |  [optional] |
| **actionName** | <!----><!---->**String**<!----> | The name of the action in the bot flow. |  [optional] |
| **actionNumber** | <!----><!---->**Integer**<!----> | The number of the action in the bot flow. |  [optional] |
| **actionType** | [**ActionTypeEnum**](#ActionTypeEnum)<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="ActionTypeEnum"></a>

## Enum: ActionTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ADDFLOWMILESTONEACTION | &quot;AddFlowMilestoneAction&quot; | 
| ASKFORNLUINTENTACTION | &quot;AskForNLUIntentAction&quot; | 
| ASKFORBOOLEANACTION | &quot;AskForBooleanAction&quot; | 
| ASKFORSLOTACTION | &quot;AskForSlotAction&quot; | 
| ASKSURVEYQUESTIONACTION | &quot;AskSurveyQuestionAction&quot; | 
| ASKFORNLUNEXTINTENTACTION | &quot;AskForNLUNextIntentAction&quot; | 
| BOTSTATE | &quot;BotState&quot; | 
| CALLTASKACTION | &quot;CallTaskAction&quot; | 
| CLEARSLOTACTION | &quot;ClearSlotAction&quot; | 
| CLEARUTILIZATIONLABELACTION | &quot;ClearUtilizationLabelAction&quot; | 
| DISCONNECTACTION | &quot;DisconnectAction&quot; | 
| ENDTASKACTION | &quot;EndTaskAction&quot; | 
| EXITBOTFLOWACTION | &quot;ExitBotFlowAction&quot; | 
| UPDATEVARIABLEACTION | &quot;UpdateVariableAction&quot; | 
| COMMUNICATEACTION | &quot;CommunicateAction&quot; | 
| DECISIONACTION | &quot;DecisionAction&quot; | 
| FINDEMERGENCYGROUPACTION | &quot;FindEmergencyGroupAction&quot; | 
| FINDGRAMMARACTION | &quot;FindGrammarAction&quot; | 
| FINDGRAMMARBYIDACTION | &quot;FindGrammarByIdAction&quot; | 
| FINDGROUPACTION | &quot;FindGroupAction&quot; | 
| FINDLANGUAGESKILLACTION | &quot;FindLanguageSkillAction&quot; | 
| FINDQUEUEACTION | &quot;FindQueueAction&quot; | 
| FINDQUEUEBYIDACTION | &quot;FindQueueByIdAction&quot; | 
| FINDSCHEDULEACTION | &quot;FindScheduleAction&quot; | 
| FINDSCHEDULEGROUPACTION | &quot;FindScheduleGroupAction&quot; | 
| FINDSKILLACTION | &quot;FindSkillAction&quot; | 
| FINDSYSTEMPROMPTACTION | &quot;FindSystemPromptAction&quot; | 
| FINDUSERACTION | &quot;FindUserAction&quot; | 
| FINDUSERBYIDACTION | &quot;FindUserByIdAction&quot; | 
| FINDUSERSBYIDACTION | &quot;FindUsersByIdAction&quot; | 
| FINDUSERPROMPTACTION | &quot;FindUserPromptAction&quot; | 
| FINDUTILIZATIONLABELACTION | &quot;FindUtilizationLabelAction&quot; | 
| SWITCHACTION | &quot;SwitchAction&quot; | 
| DATAACTION | &quot;DataAction&quot; | 
| DATATABLELOOKUPACTION | &quot;DataTableLookupAction&quot; | 
| GETEXTERNALCONTACTACTION | &quot;GetExternalContactAction&quot; | 
| GETEXTERNALORGANIZATIONACTION | &quot;GetExternalOrganizationAction&quot; | 
| LOOPACTION | &quot;LoopAction&quot; | 
| EXITLOOPACTION | &quot;ExitLoopAction&quot; | 
| NEXTLOOPACTION | &quot;NextLoopAction&quot; | 
| LOOPUNTILACTION | &quot;LoopUntilAction&quot; | 
| SETACTIVEINTENTACTION | &quot;SetActiveIntentAction&quot; | 
| SETFLOWOUTCOMEACTION | &quot;SetFlowOutcomeAction&quot; | 
| INITIALIZEFLOWOUTCOMEACTION | &quot;InitializeFlowOutcomeAction&quot; | 
| ASKFORSTRINGACTION | &quot;AskForStringAction&quot; | 
| SENDRESPONSEACTION | &quot;SendResponseAction&quot; | 
| GETRESPONSEACTION | &quot;GetResponseAction&quot; | 
| EXTRACTSECUREDATAACTION | &quot;ExtractSecureDataAction&quot; | 
| SECUREACTION | &quot;SecureAction&quot; | 
| TRANSFERTASKACTION | &quot;TransferTaskAction&quot; | 
| DIGITALMENUACTION | &quot;DigitalMenuAction&quot; | 
| WAITFORINPUTACTION | &quot;WaitForInputAction&quot; | 
| EVALUATESCHEDULEACTION | &quot;EvaluateScheduleAction&quot; | 
| EVALUATESCHEDULEGROUPACTION | &quot;EvaluateScheduleGroupAction&quot; | 
| SHOWKNOWLEDGEARTICLEACTION | &quot;ShowKnowledgeArticleAction&quot; | 
| SENDKNOWLEDGEFEEDBACKACTION | &quot;SendKnowledgeFeedbackAction&quot; | 
| SETLOCALEACTION | &quot;SetLocaleAction&quot; | 
| SCREENPOPACTION | &quot;ScreenPopAction&quot; | 
| SETUTILIZATIONLABELACTION | &quot;SetUtilizationLabelAction&quot; | 
| TRANSFERPUREMATCHACTION | &quot;TransferPureMatchAction&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
{: class="table table-striped"}



