---
title: UnscheduledAgentWarning
---
## UnscheduledAgentWarning


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **agent** | [**UserReference**](UserReference.html) | The agent for which this warning applies |  [optional] |
| **unscheduledReason** | [**UnscheduledReasonEnum**](#UnscheduledReasonEnum) | The reason this agent was not scheduled |  [optional] |
{: class="table table-striped"}


<a name="UnscheduledReasonEnum"></a>

## Enum: UnscheduledReasonEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| NOWORKPLAN | &quot;NoWorkPlan&quot; |
| WORKPLANNOTFOUND | &quot;WorkPlanNotFound&quot; |
| UNABLETOPRODUCESCHEDULE | &quot;UnableToProduceSchedule&quot; |
{: class="table table-striped"}



