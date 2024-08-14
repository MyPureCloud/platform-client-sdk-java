---
title: AgentBidWorkPlanOverrideRequest
---
## AgentBidWorkPlanOverrideRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **agentId** | <!----><!---->**String**<!----> | The ID of agent |  |
| **overrideWorkPlanId** | <!----><!---->**String**<!----> | The ID of the work plan that overrides the assigned work plan for the agent |  [optional] |
| **overrideReason** | [**OverrideReasonEnum**](#OverrideReasonEnum)<!----> | The reason for overriding the assigned work plan. This must be null if overrideWorkPlanId is not specified |  [optional] |
{: class="table table-striped"}


<a name="OverrideReasonEnum"></a>

## Enum: OverrideReasonEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNABLETOBID | &quot;UnableToBid&quot; | 
| CHANGEOFCIRCUMSTANCE | &quot;ChangeOfCircumstance&quot; | 
| NEWHIRE | &quot;NewHire&quot; | 
| EMPLOYEEMOVE | &quot;EmployeeMove&quot; | 
{: class="table table-striped"}



