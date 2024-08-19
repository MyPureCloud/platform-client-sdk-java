# AgentBidWorkPlanOverrideRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **agentId** | **String** | The ID of agent |  |
| **overrideWorkPlanId** | **String** | The ID of the work plan that overrides the assigned work plan for the agent |  [optional] |
| **overrideReason** | [**OverrideReasonEnum**](#Enum--OverrideReasonEnum) | The reason for overriding the assigned work plan. This must be null if overrideWorkPlanId is not specified |  [optional] |
{: class="table table-striped"}


## Enum: OverrideReasonEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNABLETOBID | &quot;UnableToBid&quot; | 
| CHANGEOFCIRCUMSTANCE | &quot;ChangeOfCircumstance&quot; | 
| NEWHIRE | &quot;NewHire&quot; | 
| EMPLOYEEMOVE | &quot;EmployeeMove&quot; | 
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:208.0.0_
