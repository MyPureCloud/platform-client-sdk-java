# TextBotExitAction


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **reason** | [**ReasonEnum**](#Enum--ReasonEnum) | The reason for the exit. |  |
| **reasonExtendedInfo** | **String** | Extended information related to the reason, if available. |  [optional] |
| **activeIntent** | **String** | The active intent at the time of the exit. |  [optional] |
| **flowLocation** | [**TextBotFlowLocation**](TextBotFlowLocation) | Describes where in the Bot Flow the user was when the exit occurred. |  [optional] |
| **outputData** | [**TextBotInputOutputData**](TextBotInputOutputData) | The output data for the bot flow. |  [optional] |
| **flowOutcomes** | [**List&lt;TextBotFlowOutcome&gt;**](TextBotFlowOutcome) | The list of Flow Outcomes for the bot flow and their details. |  [optional] |


## Enum: ReasonEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| TRIGGEREDBYUSER | &quot;TriggeredByUser&quot; | 
| AGENTREQUESTEDBYUSER | &quot;AgentRequestedByUser&quot; | 
| TRIGGEREDBYFLOW | &quot;TriggeredByFlow&quot; | 
| ERROR | &quot;Error&quot; | 
| RECOGNITIONFAILURE | &quot;RecognitionFailure&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:244.0.0_
