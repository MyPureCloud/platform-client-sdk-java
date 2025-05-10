# AgentWorkPlanBiddingPreferenceResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **submitted** | **Boolean** | Whether the preference is submitted |  |
| **assignedWorkPlan** | [**WorkPlanReference**](WorkPlanReference) | The work plan assigned to the agent by the bid process |  [optional] |
| **overriddenWorkPlan** | [**WorkPlanReference**](WorkPlanReference) | The work plan that overrides the assigned work plan for the agent |  [optional] |
| **overrideReason** | [**OverrideReasonEnum**](#Enum--OverrideReasonEnum) | The reason why the assigned work plan has been overridden. This must be null without an override work plan |  [optional] |
| **agentWorkPlanBidPreferences** | [**List&lt;AgentWorkPlanBiddingPreference&gt;**](AgentWorkPlanBiddingPreference) | The list of work plan bidding preferences |  |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: OverrideReasonEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNABLETOBID | &quot;UnableToBid&quot; | 
| CHANGEOFCIRCUMSTANCE | &quot;ChangeOfCircumstance&quot; | 
| NEWHIRE | &quot;NewHire&quot; | 
| EMPLOYEEMOVE | &quot;EmployeeMove&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:225.0.0_
