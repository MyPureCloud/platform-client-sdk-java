---
title: TextBotExitAction
---
## TextBotExitAction


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **reason** | [**ReasonEnum**](#ReasonEnum)<!----> | The reason for the exit. |  |
| **reasonExtendedInfo** | <!----><!---->**String**<!----> | Extended information related to the reason, if available. |  [optional] |
| **activeIntent** | <!----><!---->**String**<!----> | The active intent at the time of the exit. |  [optional] |
| **flowLocation** | <!----><!---->[**TextBotFlowLocation**](TextBotFlowLocation.html)<!----> | Describes where in the Bot Flow the user was when the exit occurred. |  [optional] |
| **outputData** | <!----><!---->[**TextBotInputOutputData**](TextBotInputOutputData.html)<!----> | The output data for the bot flow. |  [optional] |
| **flowOutcomes** | <!----><!---->[**List&lt;TextBotFlowOutcome&gt;**](TextBotFlowOutcome.html)<!----> | The list of Flow Outcomes for the bot flow and their details. |  [optional] |
{: class="table table-striped"}


<a name="ReasonEnum"></a>

## Enum: ReasonEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| TRIGGEREDBYUSER | &quot;TriggeredByUser&quot; | 
| AGENTREQUESTEDBYUSER | &quot;AgentRequestedByUser&quot; | 
| TRIGGEREDBYFLOW | &quot;TriggeredByFlow&quot; | 
| ERROR | &quot;Error&quot; | 
| RECOGNITIONFAILURE | &quot;RecognitionFailure&quot; | 
{: class="table table-striped"}



