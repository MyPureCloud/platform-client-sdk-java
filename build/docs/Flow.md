---
title: Flow
---

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The flow name |  |
| **description** | **String** |  |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
| **lockedUser** | [**UriReference**](UriReference.html) |  |  [optional] |
| **active** | **Boolean** |  |  [optional] |
| **system** | **Boolean** |  |  [optional] |
| **deleted** | **Boolean** |  |  [optional] |
| **publishedVersion** | [**FlowVersion**](FlowVersion.html) |  |  [optional] |
| **savedVersion** | [**FlowVersion**](FlowVersion.html) |  |  [optional] |
| **inputSchema** | **Object** | json schema describing the inputs for the flow |  [optional] |
| **outputSchema** | **Object** | json schema describing the outputs for the flow |  [optional] |
| **checkedInVersion** | [**FlowVersion**](FlowVersion.html) |  |  [optional] |
| **publishedBy** | [**UriReference**](UriReference.html) |  |  [optional] |
| **currentOperation** | [**Operation**](Operation.html) |  |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| INBOUNDCALL | &quot;INBOUNDCALL&quot; |
| INBOUNDEMAIL | &quot;INBOUNDEMAIL&quot; |
| INQUEUECALL | &quot;INQUEUECALL&quot; |
| OUTBOUNDCALL | &quot;OUTBOUNDCALL&quot; |
| SECURECALL | &quot;SECURECALL&quot; |
| SPEECH | &quot;SPEECH&quot; |
| WORKFLOW | &quot;WORKFLOW&quot; |
{: class="table table-striped"}


