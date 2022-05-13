---
title: TextBotDisconnectAction
---
## TextBotDisconnectAction


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **reason** | [**ReasonEnum**](#ReasonEnum)<!----> | The reason for the disconnect. |  |
| **reasonExtendedInfo** | <!----><!---->**String**<!----> | Extended information related to the reason, if available. |  [optional] |
| **flowLocation** | <!----><!---->[**TextBotFlowLocation**](TextBotFlowLocation.html)<!----> | Describes where in the Bot Flow the user was when the disconnect occurred. |  [optional] |
| **flowOutcomes** | <!----><!---->[**List&lt;TextBotFlowOutcome&gt;**](TextBotFlowOutcome.html)<!----> | The list of Flow Outcomes for the bot flow and their details. |  [optional] |
{: class="table table-striped"}


<a name="ReasonEnum"></a>

## Enum: ReasonEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| TRIGGEREDBYUSER | &quot;TriggeredByUser&quot; | 
| TRIGGEREDBYFLOW | &quot;TriggeredByFlow&quot; | 
| SESSIONEXPIRED | &quot;SessionExpired&quot; | 
| ERROR | &quot;Error&quot; | 
| RECOGNITIONFAILURE | &quot;RecognitionFailure&quot; | 
{: class="table table-striped"}



