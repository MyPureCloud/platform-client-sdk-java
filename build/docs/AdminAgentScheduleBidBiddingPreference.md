# AdminAgentScheduleBidBiddingPreference


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **agent** | [**UserReference**](UserReference) | The agent to whom this schedule bid preference applies |  |
| **submitted** | **Boolean** | Indicates whether the preference has been submitted |  |
| **assignedScheduleSetId** | **String** | The schedule set assigned to the agent by the bid process. This will be set after bid is processed |  [optional] |
| **overriddenScheduleSetId** | **String** | The schedule set that overrides the assigned schedule set for the agent |  [optional] |
| **overrideReason** | [**OverrideReasonEnum**](#Enum--OverrideReasonEnum) | The reason the assigned schedule set has been overridden. This must be null if no override schedule is set |  [optional] |
| **agentScheduleBidPreferencePriorities** | [**List&lt;AgentScheduleBiddingPreferencePriority&gt;**](AgentScheduleBiddingPreferencePriority) | The agent schedule set preferences |  |
| **endDate** | [**LocalDate**](LocalDate) | The end date of this scheduling set preference relative to the business unit time zone in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |


## Enum: OverrideReasonEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNABLETOBID | &quot;UnableToBid&quot; | 
| CHANGEOFCIRCUMSTANCE | &quot;ChangeOfCircumstance&quot; | 
| NEWHIRE | &quot;NewHire&quot; | 
| EMPLOYEEMOVE | &quot;EmployeeMove&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:261.0.0_
