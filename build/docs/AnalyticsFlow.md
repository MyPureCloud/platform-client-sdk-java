---
title: AnalyticsFlow
---
## AnalyticsFlow


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **endingLanguage** | <!----><!---->**String**<!----> | Flow ending language, e.g. en-us |  [optional] |
| **entryReason** | <!----><!---->**String**<!----> | The particular entry reason for this flow, e.g. an address, userId, or flowId |  [optional] |
| **entryType** | [**EntryTypeEnum**](#EntryTypeEnum)<!----> | The entry type for this flow, e.g. dnis, dialer, agent, flow, or direct |  [optional] |
| **exitReason** | <!----><!---->**String**<!----> | The exit reason for this flow, e.g. DISCONNECT |  [optional] |
| **flowId** | <!----><!---->**String**<!----> | The unique identifier of this flow |  [optional] |
| **flowName** | <!----><!---->**String**<!----> | The name of this flow at the time of flow execution |  [optional] |
| **flowType** | [**FlowTypeEnum**](#FlowTypeEnum)<!----> | The type of this flow |  [optional] |
| **flowVersion** | <!----><!---->**String**<!----> | The version of this flow |  [optional] |
| **issuedCallback** | <!----><!---->**Boolean**<!----> | Flag indicating whether the flow issued a callback |  [optional] |
| **recognitionFailureReason** | <!----><!---->**String**<!----> | The recognition failure reason causing to exit/disconnect |  [optional] |
| **startingLanguage** | <!----><!---->**String**<!----> | Flow starting language, e.g. en-us |  [optional] |
| **transferTargetAddress** | <!----><!---->**String**<!----> | The address of a flow transfer target, e.g. a phone number, an email address, or a queueId |  [optional] |
| **transferTargetName** | <!----><!---->**String**<!----> | The name of a flow transfer target |  [optional] |
| **transferType** | <!----><!---->**String**<!----> | The type of transfer for flows that ended with a transfer |  [optional] |
| **outcomes** | <!----><!---->[**List&lt;AnalyticsFlowOutcome&gt;**](AnalyticsFlowOutcome.html)<!----> | Flow outcomes |  [optional] |
{: class="table table-striped"}


<a name="EntryTypeEnum"></a>

## Enum: EntryTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| AGENT | &quot;agent&quot; |
| DIRECT | &quot;direct&quot; |
| DNIS | &quot;dnis&quot; |
| FLOW | &quot;flow&quot; |
| OUTBOUND | &quot;outbound&quot; |
{: class="table table-striped"}


<a name="FlowTypeEnum"></a>

## Enum: FlowTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| BOT | &quot;BOT&quot; |
| COMMONMODULE | &quot;COMMONMODULE&quot; |
| DIGITALBOT | &quot;DIGITALBOT&quot; |
| INBOUNDCALL | &quot;INBOUNDCALL&quot; |
| INBOUNDCHAT | &quot;INBOUNDCHAT&quot; |
| INBOUNDEMAIL | &quot;INBOUNDEMAIL&quot; |
| INBOUNDSHORTMESSAGE | &quot;INBOUNDSHORTMESSAGE&quot; |
| INQUEUECALL | &quot;INQUEUECALL&quot; |
| INQUEUEEMAIL | &quot;INQUEUEEMAIL&quot; |
| INQUEUESHORTMESSAGE | &quot;INQUEUESHORTMESSAGE&quot; |
| OUTBOUNDCALL | &quot;OUTBOUNDCALL&quot; |
| SECURECALL | &quot;SECURECALL&quot; |
| SPEECH | &quot;SPEECH&quot; |
| SURVEYINVITE | &quot;SURVEYINVITE&quot; |
| VOICEMAIL | &quot;VOICEMAIL&quot; |
| WORKFLOW | &quot;WORKFLOW&quot; |
| WORKITEM | &quot;WORKITEM&quot; |
{: class="table table-striped"}



