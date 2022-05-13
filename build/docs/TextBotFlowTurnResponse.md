---
title: TextBotFlowTurnResponse
---
## TextBotFlowTurnResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The ID of the bot flow turn. If additional turns are needed, supply this ID as the previous turn in your next turn request. |  |
| **previousTurn** | <!----><!---->[**TextBotTurnReference**](TextBotTurnReference.html)<!----> | The reference to a previous turn, if applicable. |  [optional] |
| **prompts** | <!----><!---->[**TextBotOutputPrompts**](TextBotOutputPrompts.html)<!----> | The output prompts for this turn. |  [optional] |
| **nextActionType** | [**NextActionTypeEnum**](#NextActionTypeEnum)<!----> | Indicates the suggested next action. If appropriate, the matching output event object includes additional information. |  |
| **nextActionDisconnect** | <!----><!---->[**TextBotDisconnectAction**](TextBotDisconnectAction.html)<!----> | The next action directive for this turn if it is a Disconnect type. |  [optional] |
| **nextActionWaitForInput** | <!----><!---->[**TextBotWaitForInputAction**](TextBotWaitForInputAction.html)<!----> | The next action directive for this turn if it is a WaitForInput type. |  [optional] |
| **nextActionExit** | <!----><!---->[**TextBotExitAction**](TextBotExitAction.html)<!----> | The next action directive for this turn if it is an Exit type. |  [optional] |
{: class="table table-striped"}


<a name="NextActionTypeEnum"></a>

## Enum: NextActionTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NOOP | &quot;NoOp&quot; | 
| DISCONNECT | &quot;Disconnect&quot; | 
| WAITFORINPUT | &quot;WaitForInput&quot; | 
| EXIT | &quot;Exit&quot; | 
{: class="table table-striped"}



