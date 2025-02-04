# FlowPathsElement


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **parentId** | **String** | Unique identifier of the parent element. Will be null for the root element. |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | Type of the element. |  |
| **count** | **Integer** | Count of all journeys that include this element. |  |
| **flows** | [**List&lt;FlowPathsFlowDetails&gt;**](FlowPathsFlowDetails) | Details of flows involved in journeys that include this element. |  |
| **flowOutcomeValue** | [**FlowOutcomeValueEnum**](#Enum--FlowOutcomeValueEnum) | The value of the flow outcome, if the element type is Outcome. |  [optional] |
| **flowMilestone** | [**AddressableEntityRef**](AddressableEntityRef) | The flow milestone, set if the element type is Milestone. |  [optional] |
| **flowOutcome** | [**AddressableEntityRef**](AddressableEntityRef) | The flow outcome, set if the element type is Outcome or Milestone. |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ABANDONED | &quot;Abandoned&quot; | 
| AGENTESCALATION | &quot;AgentEscalation&quot; | 
| DISCONNECT | &quot;Disconnect&quot; | 
| ERROR | &quot;Error&quot; | 
| EXIT | &quot;Exit&quot; | 
| MILESTONE | &quot;Milestone&quot; | 
| OUTCOME | &quot;Outcome&quot; | 
| RECOGNITIONFAILURE | &quot;RecognitionFailure&quot; | 
| ROOT | &quot;Root&quot; | 
| TRANSFERRETURNTOAGENT | &quot;TransferReturnToAgent&quot; | 
| TRANSFERTOACD | &quot;TransferToAcd&quot; | 
| TRANSFERTOACDVOICEMAIL | &quot;TransferToAcdVoicemail&quot; | 
| TRANSFERTOFLOW | &quot;TransferToFlow&quot; | 
| TRANSFERTOGROUP | &quot;TransferToGroup&quot; | 
| TRANSFERTOGROUPVOICEMAIL | &quot;TransferToGroupVoicemail&quot; | 
| TRANSFERTONUMBER | &quot;TransferToNumber&quot; | 
| TRANSFERTOSECUREFLOW | &quot;TransferToSecureFlow&quot; | 
| TRANSFERTOUNKNOWN | &quot;TransferToUnknown&quot; | 
| TRANSFERTOUSER | &quot;TransferToUser&quot; | 
| TRANSFERTOUSERVOICEMAIL | &quot;TransferToUserVoicemail&quot; | 


## Enum: FlowOutcomeValueEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| FAILURE | &quot;FAILURE&quot; | 
| SUCCESS | &quot;SUCCESS&quot; | 
| UNKNOWN | &quot;UNKNOWN&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:219.0.0_
