---
title: Flow
---
## Flow


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The flow identifier |  [optional] |
| **name** | <!----><!---->**String**<!----> | The flow name |  |
| **division** | <!----><!---->[**WritableDivision**](WritableDivision.html)<!----> | The division to which this entity belongs. |  [optional] |
| **description** | <!----><!---->**String**<!----> |  |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum)<!----> |  |  [optional] |
| **lockedUser** | <!----><!---->[**User**](User.html)<!----> | User that has the flow locked. |  [optional] |
| **lockedClient** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | OAuth client that has the flow locked. |  [optional] |
| **active** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **system** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **deleted** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **publishedVersion** | <!----><!---->[**FlowVersion**](FlowVersion.html)<!----> |  |  [optional] |
| **savedVersion** | <!----><!---->[**FlowVersion**](FlowVersion.html)<!----> |  |  [optional] |
| **inputSchema** | <!----><!---->**Object**<!----> | json schema describing the inputs for the flow |  [optional] |
| **outputSchema** | <!----><!---->**Object**<!----> | json schema describing the outputs for the flow |  [optional] |
| **checkedInVersion** | <!----><!---->[**FlowVersion**](FlowVersion.html)<!----> |  |  [optional] |
| **debugVersion** | <!----><!---->[**FlowVersion**](FlowVersion.html)<!----> |  |  [optional] |
| **publishedBy** | <!----><!---->[**User**](User.html)<!----> |  |  [optional] |
| **currentOperation** | <!----><!---->[**Operation**](Operation.html)<!----> |  |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| COMMONMODULE | &quot;COMMONMODULE&quot; |
| INBOUNDCALL | &quot;INBOUNDCALL&quot; |
| INBOUNDCHAT | &quot;INBOUNDCHAT&quot; |
| INBOUNDEMAIL | &quot;INBOUNDEMAIL&quot; |
| INBOUNDSHORTMESSAGE | &quot;INBOUNDSHORTMESSAGE&quot; |
| INQUEUECALL | &quot;INQUEUECALL&quot; |
| OUTBOUNDCALL | &quot;OUTBOUNDCALL&quot; |
| SECURECALL | &quot;SECURECALL&quot; |
| SPEECH | &quot;SPEECH&quot; |
| SURVEYINVITE | &quot;SURVEYINVITE&quot; |
| WORKFLOW | &quot;WORKFLOW&quot; |
{: class="table table-striped"}



