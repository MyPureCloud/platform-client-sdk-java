# CallbackMediaSettings


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **enableAutoAnswer** | **Boolean** | Indicates if auto-answer is enabled for the given media type or subtype (default is false).  Subtype settings take precedence over media type settings. |  [optional] |
| **alertingTimeoutSeconds** | **Integer** | The alerting timeout for the media type, in seconds |  [optional] |
| **serviceLevel** | [**ServiceLevel**](ServiceLevel) | The targeted service level for the media type |  [optional] |
| **autoAnswerAlertToneSeconds** | **Double** | How long to play the alerting tone for an auto-answer interaction |  [optional] |
| **manualAnswerAlertToneSeconds** | **Double** | How long to play the alerting tone for a manual-answer interaction |  [optional] |
| **subTypeSettings** | [**Map&lt;String, BaseMediaSettings&gt;**](BaseMediaSettings) | Map of media subtype to media subtype specific settings. |  [optional] |
| **mode** | [**ModeEnum**](#Enum--ModeEnum) | The mode callbacks will use on this queue. |  [optional] |
| **enableAutoDialAndEnd** | **Boolean** | Flag to enable Auto-Dial and Auto-End automation for callbacks on this queue. |  [optional] |
| **autoDialDelaySeconds** | **Integer** | Time in seconds after agent connects to callback before outgoing call is auto-dialed. Allowable values in range 0 - 1200 seconds. Defaults to 300 seconds. |  [optional] |
| **autoEndDelaySeconds** | **Integer** | Time in seconds after agent disconnects from the outgoing call before the encasing callback is auto-ended. Allowable values in range 0 - 1200 seconds. Defaults to 300 seconds. |  [optional] |
| **pacingModifier** | **Double** | Controls the maximum number of outbound calls at one time when mode is CustomerFirst. |  [optional] |
| **liveVoiceReactionType** | [**LiveVoiceReactionTypeEnum**](#Enum--LiveVoiceReactionTypeEnum) | The action to take if a live voice is detected during the outbound call of a customer first callback. |  [optional] |
| **liveVoiceFlow** | [**DomainEntityRef**](DomainEntityRef) | The inbound flow to transfer to if a live voice is detected during the outbound call of a customer first callback. |  [optional] |
| **answeringMachineReactionType** | [**AnsweringMachineReactionTypeEnum**](#Enum--AnsweringMachineReactionTypeEnum) | The action to take if an answering machine is detected during the outbound call of a customer first callback. |  [optional] |
| **answeringMachineFlow** | [**DomainEntityRef**](DomainEntityRef) | The inbound flow to transfer to if an answering machine is detected during the outbound call of a customer first callback when answeringMachineReactionType is set to TransferToFlow. |  [optional] |


## Enum: ModeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AGENTFIRST | &quot;AgentFirst&quot; | 
| CUSTOMERFIRST | &quot;CustomerFirst&quot; | 


## Enum: LiveVoiceReactionTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| HANGUP | &quot;HangUp&quot; | 
| TRANSFERTOQUEUE | &quot;TransferToQueue&quot; | 
| TRANSFERTOFLOW | &quot;TransferToFlow&quot; | 


## Enum: AnsweringMachineReactionTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| HANGUP | &quot;HangUp&quot; | 
| TRANSFERTOQUEUE | &quot;TransferToQueue&quot; | 
| TRANSFERTOFLOW | &quot;TransferToFlow&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:213.0.0_
