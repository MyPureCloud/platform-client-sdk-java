# TextBotFlowTurnResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The ID of the bot flow turn. If additional turns are needed, supply this ID as the previous turn in your next turn request. |  |
| **previousTurn** | [**TextBotTurnReference**](TextBotTurnReference) | The reference to a previous turn, if applicable. |  [optional] |
| **prompts** | [**TextBotOutputPrompts**](TextBotOutputPrompts) | The output prompts for this turn. |  [optional] |
| **nextActionType** | [**NextActionTypeEnum**](#Enum--NextActionTypeEnum) | Indicates the suggested next action. If appropriate, the matching output event object includes additional information. |  |
| **nextActionDisconnect** | [**TextBotDisconnectAction**](TextBotDisconnectAction) | The next action directive for this turn if it is a Disconnect type. |  [optional] |
| **nextActionWaitForInput** | [**TextBotWaitForInputAction**](TextBotWaitForInputAction) | The next action directive for this turn if it is a WaitForInput type. |  [optional] |
| **nextActionExit** | [**TextBotExitAction**](TextBotExitAction) | The next action directive for this turn if it is an Exit type. |  [optional] |


## Enum: NextActionTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NOOP | &quot;NoOp&quot; | 
| DISCONNECT | &quot;Disconnect&quot; | 
| WAITFORINPUT | &quot;WaitForInput&quot; | 
| EXIT | &quot;Exit&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:221.0.0_
