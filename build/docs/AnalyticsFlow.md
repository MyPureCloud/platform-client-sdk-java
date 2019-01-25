---
title: AnalyticsFlow
---
## AnalyticsFlow


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **flowId** | **String** | The unique identifier of this flow |  [optional] |
| **flowName** | **String** | The name of this flow |  [optional] |
| **flowVersion** | **String** | The version of this flow |  [optional] |
| **flowType** | [**FlowTypeEnum**](#FlowTypeEnum) | The type of this flow |  [optional] |
| **exitReason** | **String** | The exit reason for this flow, e.g. DISCONNECT |  [optional] |
| **entryReason** | **String** | The particular entry reason for this flow, e.g. an address, userId, or flowId |  [optional] |
| **entryType** | [**EntryTypeEnum**](#EntryTypeEnum) | The entry type for this flow |  [optional] |
| **transferType** | **String** | The type of transfer for flows that ended with a transfer |  [optional] |
| **transferTargetName** | **String** | The name of a transfer target |  [optional] |
| **transferTargetAddress** | **String** | The address of a transfer target |  [optional] |
| **issuedCallback** | **Boolean** | Flag indicating whether the flow issued a callback |  [optional] |
| **startingLanguage** | **String** | Flow starting language, e.g. en-us |  [optional] |
| **endingLanguage** | **String** | Flow ending language, e.g. en-us |  [optional] |
| **outcomes** | [**List&lt;AnalyticsFlowOutcome&gt;**](AnalyticsFlowOutcome.html) | Flow outcomes |  [optional] |
{: class="table table-striped"}


<a name="FlowTypeEnum"></a>

## Enum: FlowTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| INBOUNDCALL | &quot;INBOUNDCALL&quot; |
| INBOUNDEMAIL | &quot;INBOUNDEMAIL&quot; |
| INBOUNDSHORTMESSAGE | &quot;INBOUNDSHORTMESSAGE&quot; |
| INQUEUECALL | &quot;INQUEUECALL&quot; |
| OUTBOUNDCALL | &quot;OUTBOUNDCALL&quot; |
| SECURECALL | &quot;SECURECALL&quot; |
| SPEECH | &quot;SPEECH&quot; |
| SURVEYINVITE | &quot;SURVEYINVITE&quot; |
| WORKFLOW | &quot;WORKFLOW&quot; |
{: class="table table-striped"}


<a name="EntryTypeEnum"></a>

## Enum: EntryTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| DNIS | &quot;dnis&quot; |
| DIRECT | &quot;direct&quot; |
| FLOW | &quot;flow&quot; |
| AGENT | &quot;agent&quot; |
| OUTBOUND | &quot;outbound&quot; |
{: class="table table-striped"}



