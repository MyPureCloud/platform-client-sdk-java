# TextBotFlowTurnRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **previousTurn** | [**TextBotTurnReference**](TextBotTurnReference) | The reference to a previous turn if appropriate, used to avoid race conditions. |  [optional] |
| **inputEventType** | [**InputEventTypeEnum**](#Enum--InputEventTypeEnum) | Indicates the type of input event being requested. If appropriate, fill out the matching user input object details on this request. |  |
| **inputEventUserInput** | [**TextBotUserInputEvent**](TextBotUserInputEvent) | The data for the input event of this turn if it is a user input event. Only one inputEvent may be set. |  [optional] |
| **inputEventError** | [**TextBotErrorInputEvent**](TextBotErrorInputEvent) | The data for the input event of this turn if it is an error event. Only one inputEvent may be set. |  [optional] |


## Enum: InputEventTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NOOP | &quot;NoOp&quot; | 
| USERINPUT | &quot;UserInput&quot; | 
| RICHMEDIAINPUT | &quot;RichMediaInput&quot; | 
| ERROR | &quot;Error&quot; | 
| NOMATCH | &quot;NoMatch&quot; | 
| NOINPUT | &quot;NoInput&quot; | 
| USERDISCONNECT | &quot;UserDisconnect&quot; | 
| CLIENTSESSIONEXPIRED | &quot;ClientSessionExpired&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:236.0.0_
