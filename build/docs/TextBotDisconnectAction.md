# TextBotDisconnectAction


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **reason** | [**ReasonEnum**](#Enum--ReasonEnum) | The reason for the disconnect. |  |
| **reasonExtendedInfo** | **String** | Extended information related to the reason, if available. |  [optional] |
| **flowLocation** | [**TextBotFlowLocation**](TextBotFlowLocation) | Describes where in the Bot Flow the user was when the disconnect occurred. |  [optional] |
| **flowOutcomes** | [**List&lt;TextBotFlowOutcome&gt;**](TextBotFlowOutcome) | The list of Flow Outcomes for the bot flow and their details. |  [optional] |


## Enum: ReasonEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| TRIGGEREDBYUSER | &quot;TriggeredByUser&quot; | 
| TRIGGEREDBYFLOW | &quot;TriggeredByFlow&quot; | 
| SESSIONEXPIRED | &quot;SessionExpired&quot; | 
| ERROR | &quot;Error&quot; | 
| RECOGNITIONFAILURE | &quot;RecognitionFailure&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:223.0.0_
