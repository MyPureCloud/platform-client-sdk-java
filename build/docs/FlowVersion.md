# FlowVersion


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The flow version identifier |  [optional] |
| **name** | **String** |  |  [optional] |
| **commitVersion** | **String** |  |  [optional] |
| **configurationVersion** | **String** |  |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) |  |  [optional] |
| **secure** | **Boolean** |  |  [optional] |
| **debug** | **Boolean** |  |  [optional] |
| **createdBy** | [**User**](User) |  |  [optional] |
| **createdByClient** | [**DomainEntityRef**](DomainEntityRef) |  |  [optional] |
| **configurationUri** | **String** |  |  [optional] |
| **dateCreated** | **Long** |  |  [optional] |
| **dateCheckedIn** | **Long** |  |  [optional] |
| **dateSaved** | **Long** |  |  [optional] |
| **generationId** | **String** |  |  [optional] |
| **publishResultUri** | **String** |  |  [optional] |
| **inputSchema** | [**JsonSchemaDocument**](JsonSchemaDocument) |  |  [optional] |
| **outputSchema** | [**JsonSchemaDocument**](JsonSchemaDocument) |  |  [optional] |
| **virtualAgentEnabled** | **Boolean** |  |  [optional] |
| **agenticVirtualAgentEnabled** | **Boolean** |  |  [optional] |
| **datePublished** | [**Date**](Date) | The date this version became the published version of the flow. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **datePublishedEnd** | [**Date**](Date) | The date this version was no longer the published version of the flow. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **nluInfo** | [**NluInfo**](NluInfo) | Information about the natural language understanding configuration for the flow version |  [optional] |
| **supportedLanguages** | [**List&lt;SupportedLanguage&gt;**](SupportedLanguage) | List of supported languages for this version of the flow |  [optional] |
| **compatibleFlowTypes** | [**List<CompatibleFlowTypesEnum>**](#Enum--CompatibleFlowTypesEnum) | Compatible flow types designate which flow types are allowed to embed a flow’s configuration within their own flow configuration.  Currently the only flows that can be embedded are Common Module flows and the embedding flow can invoke them using the Call Common Module action. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PUBLISH | &quot;PUBLISH&quot; | 
| CHECKIN | &quot;CHECKIN&quot; | 
| SAVE | &quot;SAVE&quot; | 


## Enum: CompatibleFlowTypesEnum

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
| VOICE | &quot;VOICE&quot; |
| VOICEMAIL | &quot;VOICEMAIL&quot; |
| VOICESURVEY | &quot;VOICESURVEY&quot; |
| WORKFLOW | &quot;WORKFLOW&quot; |
| WORKITEM | &quot;WORKITEM&quot; |




_com.mypurecloud.sdk.v2:platform-client-v2:237.0.0_
