# AdminAgentWorkPlanBiddingPreference


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **agent** | [**UserReference**](UserReference) | The agent to whom this work plan bidding preference applies |  |
| **submitted** | **Boolean** | Whether the preference is submitted |  |
| **assignedWorkPlan** | [**WorkPlanReference**](WorkPlanReference) | The work plan assigned to the agent by the bid process |  [optional] |
| **overriddenWorkPlan** | [**WorkPlanReference**](WorkPlanReference) | The work plan that overrides the assigned work plan for the agent |  [optional] |
| **overrideReason** | [**OverrideReasonEnum**](#Enum--OverrideReasonEnum) | The reason why the assigned work plan has been overridden. This must be null without an override work plan |  [optional] |
| **priorities** | **List&lt;Integer&gt;** | The agent priorities for the list of work plans. The index of the priorities should match with the list of work plans that belong to bid group. It contains null if priority is not set for the work plan |  [optional] |


## Enum: OverrideReasonEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNABLETOBID | &quot;UnableToBid&quot; | 
| CHANGEOFCIRCUMSTANCE | &quot;ChangeOfCircumstance&quot; | 
| NEWHIRE | &quot;NewHire&quot; | 
| EMPLOYEEMOVE | &quot;EmployeeMove&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:211.0.0_
