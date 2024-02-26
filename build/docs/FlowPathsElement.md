---
title: FlowPathsElement
---
## FlowPathsElement


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **parentId** | <!----><!---->**String**<!----> | Unique identifier of the parent element. Will be null for the root element. |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | Type of the element. |  |
| **count** | <!----><!---->**Integer**<!----> | Count of all journeys that include this element. |  |
| **flows** | <!----><!---->[**List&lt;FlowPathsFlowDetails&gt;**](FlowPathsFlowDetails.html)<!----> | Details of flows involved in journeys that include this element. |  |
| **flowOutcomeValue** | [**FlowOutcomeValueEnum**](#FlowOutcomeValueEnum)<!----> | The value of the flow outcome, if the element type is Outcome. |  [optional] |
| **flowMilestone** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.html)<!----> | The flow milestone, set if the element type is Milestone. |  [optional] |
| **flowOutcome** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.html)<!----> | The flow outcome, set if the element type is Outcome or Milestone. |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ABANDONED | &quot;Abandoned&quot; | 
| AGENTESCALATION | &quot;AgentEscalation&quot; | 
| DISCONNECT | &quot;Disconnect&quot; | 
| ERROR | &quot;Error&quot; | 
| EXIT | &quot;Exit&quot; | 
| MILESTONE | &quot;Milestone&quot; | 
| OUTCOME | &quot;Outcome&quot; | 
| RECOGNITIONFAILURE | &quot;RecognitionFailure&quot; | 
| ROOT | &quot;Root&quot; | 
| TRANSFERTOACD | &quot;TransferToAcd&quot; | 
{: class="table table-striped"}


<a name="FlowOutcomeValueEnum"></a>

## Enum: FlowOutcomeValueEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| FAILURE | &quot;FAILURE&quot; | 
| SUCCESS | &quot;SUCCESS&quot; | 
| UNKNOWN | &quot;UNKNOWN&quot; | 
{: class="table table-striped"}



