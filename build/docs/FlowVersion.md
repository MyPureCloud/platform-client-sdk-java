---
title: FlowVersion
---
## FlowVersion


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The flow version identifier |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **commitVersion** | <!----><!---->**String**<!----> |  |  [optional] |
| **configurationVersion** | <!----><!---->**String**<!----> |  |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum)<!----> |  |  [optional] |
| **secure** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **debug** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **createdBy** | <!----><!---->[**User**](User.html)<!----> |  |  [optional] |
| **createdByClient** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> |  |  [optional] |
| **configurationUri** | <!----><!---->**String**<!----> |  |  [optional] |
| **dateCreated** | <!----><!---->**Long**<!----> |  |  [optional] |
| **generationId** | <!----><!---->**String**<!----> |  |  [optional] |
| **publishResultUri** | <!----><!---->**String**<!----> |  |  [optional] |
| **inputSchema** | <!----><!---->[**JsonSchemaDocument**](JsonSchemaDocument.html)<!----> |  |  [optional] |
| **outputSchema** | <!----><!---->[**JsonSchemaDocument**](JsonSchemaDocument.html)<!----> |  |  [optional] |
| **nluInfo** | <!----><!---->[**NluInfo**](NluInfo.html)<!----> | Information about the natural language understanding configuration for the flow version |  [optional] |
| **supportedLanguages** | <!----><!---->[**List&lt;SupportedLanguage&gt;**](SupportedLanguage.html)<!----> | List of supported languages for this version of the flow |  [optional] |
| **compatibleFlowTypes** | <!---->[**List&lt;CompatibleFlowTypesEnum&gt;**](#CompatibleFlowTypesEnum)<!----> | Compatible flow types designate which flow types are allowed to embed a flow’s configuration within their own flow configuration.  Currently the only flows that can be embedded are Common Module flows and the embedding flow can invoke them using the Call Common Module action. |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| PUBLISH | &quot;PUBLISH&quot; |
| CHECKIN | &quot;CHECKIN&quot; |
| SAVE | &quot;SAVE&quot; |
{: class="table table-striped"}


<a name="CompatibleFlowTypesEnum"></a>

## Enum: CompatibleFlowTypesEnum

| Name | Value |
| ---- | ----- |
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



