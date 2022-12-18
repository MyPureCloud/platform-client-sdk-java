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
| ASKFORNLUNEXTINTENTACTION | &quot;AskForNLUNextIntentAction&quot; | 
| BOTSTATE | &quot;BotState&quot; | 
| CALLTASKACTION | &quot;CallTaskAction&quot; | 
| CLEARSLOTACTION | &quot;ClearSlotAction&quot; | 
| DISCONNECTACTION | &quot;DisconnectAction&quot; | 
| ENDTASKACTION | &quot;EndTaskAction&quot; | 
| EXITBOTFLOWACTION | &quot;ExitBotFlowAction&quot; | 
| UPDATEVARIABLEACTION | &quot;UpdateVariableAction&quot; | 
| COMMUNICATEACTION | &quot;CommunicateAction&quot; | 
| DECISIONACTION | &quot;DecisionAction&quot; | 
| FINDGROUPACTION | &quot;FindGroupAction&quot; | 
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
| SHOWKNOWLEDGEARTICLEACTION | &quot;ShowKnowledgeArticleAction&quot; | 
| FINDSYSTEMPROMPTACTION | &quot;FindSystemPromptAction&quot; | 
| FINDUSERPROMPTACTION | &quot;FindUserPromptAction&quot; | 
| TRANSFERPUREMATCHACTION | &quot;TransferPureMatchAction&quot; | 
| FINDQUEUEACTION | &quot;FindQueueAction&quot; | 
| FINDQUEUEBYIDACTION | &quot;FindQueueByIdAction&quot; | 
| SETLOCALEACTION | &quot;SetLocaleAction&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
{: class="table table-striped"}



