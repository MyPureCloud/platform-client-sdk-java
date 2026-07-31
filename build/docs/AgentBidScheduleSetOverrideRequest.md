# AgentBidScheduleSetOverrideRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **agentId** | **String** | The ID of the agent |  |
| **overrideScheduleSetId** | **String** | If provided, the schedule set overrides the agent's assigned schedule set |  [optional] |
| **overrideReason** | [**OverrideReasonEnum**](#Enum--OverrideReasonEnum) | The reason the assigned schedule set has been overridden. This must be null if no override schedule is set |  [optional] |


## Enum: OverrideReasonEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNABLETOBID | &quot;UnableToBid&quot; | 
| CHANGEOFCIRCUMSTANCE | &quot;ChangeOfCircumstance&quot; | 
| NEWHIRE | &quot;NewHire&quot; | 
| EMPLOYEEMOVE | &quot;EmployeeMove&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:259.0.0_
