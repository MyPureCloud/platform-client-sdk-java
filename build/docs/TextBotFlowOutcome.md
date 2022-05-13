---
title: TextBotFlowOutcome
---
## TextBotFlowOutcome


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **outcomeId** | <!----><!---->**String**<!----> | The Flow Outcome ID. |  [optional] |
| **outcomeValue** | [**OutcomeValueEnum**](#OutcomeValueEnum)<!----> | The value of the FlowOutcome. |  [optional] |
| **dateStart** | <!----><!---->[**Date**](Date.html)<!----> | The timestamp for when the Flow Outcome began. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateEnd** | <!----><!---->[**Date**](Date.html)<!----> | The timestamp for when the Flow Outcome finished. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **milestones** | <!----><!---->[**List&lt;TextBotFlowMilestone&gt;**](TextBotFlowMilestone.html)<!----> | The Flow Milestones for the Flow Outcome. |  [optional] |
{: class="table table-striped"}


<a name="OutcomeValueEnum"></a>

## Enum: OutcomeValueEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SUCCESS | &quot;SUCCESS&quot; | 
| FAILURE | &quot;FAILURE&quot; | 
{: class="table table-striped"}



