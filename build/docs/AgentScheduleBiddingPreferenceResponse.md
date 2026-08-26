# AgentScheduleBiddingPreferenceResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **submitted** | **Boolean** | Whether the preference is submitted |  |
| **assignedScheduleSetId** | **String** | The schedule set assigned to the agent by the bid process. Will be set after bid is processed |  [optional] |
| **overriddenScheduleSetId** | **String** | The schedule set that overrides the assigned schedule set for the agent |  [optional] |
| **overrideReason** | [**OverrideReasonEnum**](#Enum--OverrideReasonEnum) | The reason why the assigned schedule set has been overridden. This must be null without an override schedule set |  [optional] |
| **agentScheduleBidPreferences** | [**List&lt;AgentScheduleBiddingPreferencePriority&gt;**](AgentScheduleBiddingPreferencePriority) | The schedule bidding preferences |  |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: OverrideReasonEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNABLETOBID | &quot;UnableToBid&quot; | 
| CHANGEOFCIRCUMSTANCE | &quot;ChangeOfCircumstance&quot; | 
| NEWHIRE | &quot;NewHire&quot; | 
| EMPLOYEEMOVE | &quot;EmployeeMove&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:261.0.0_
