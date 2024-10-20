# Flow


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The flow identifier |  [optional] |
| **name** | **String** | The flow name |  |
| **division** | [**WritableDivision**](WritableDivision) | The division to which this entity belongs. |  [optional] |
| **description** | **String** |  |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) |  |  [optional] |
| **lockedUser** | [**User**](User) | User that has the flow locked. |  [optional] |
| **lockedClient** | [**DomainEntityRef**](DomainEntityRef) | OAuth client that has the flow locked. |  [optional] |
| **active** | **Boolean** |  |  [optional] |
| **system** | **Boolean** |  |  [optional] |
| **deleted** | **Boolean** |  |  [optional] |
| **publishedVersion** | [**FlowVersion**](FlowVersion) |  |  [optional] |
| **savedVersion** | [**FlowVersion**](FlowVersion) |  |  [optional] |
| **inputSchema** | **Object** | json schema describing the inputs for the flow |  [optional] |
| **outputSchema** | **Object** | json schema describing the outputs for the flow |  [optional] |
| **checkedInVersion** | [**FlowVersion**](FlowVersion) |  |  [optional] |
| **debugVersion** | [**FlowVersion**](FlowVersion) |  |  [optional] |
| **publishedBy** | [**User**](User) |  |  [optional] |
| **currentOperation** | [**Operation**](Operation) |  |  [optional] |
| **nluInfo** | [**NluInfo**](NluInfo) | Information about the natural language understanding configuration for the published version of the flow |  [optional] |
| **supportedLanguages** | [**List&lt;SupportedLanguage&gt;**](SupportedLanguage) | List of supported languages for the published version of the flow. |  [optional] |
| **compatibleFlowTypes** | [**List<CompatibleFlowTypesEnum>**](#Enum--CompatibleFlowTypesEnum) | Compatible flow types designate which flow types are allowed to embed a flow’s configuration within their own flow configuration.  Currently the only flows that can be embedded are Common Module flows and the embedding flow can invoke them using the Call Common Module action. |  [optional] |
| **worktypeId** | **String** |  |  [optional] |
| **virtualAgentEnabled** | **Boolean** |  |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: TypeEnum

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
| VOICE | &quot;VOICE&quot; |
| VOICEMAIL | &quot;VOICEMAIL&quot; |
| VOICESURVEY | &quot;VOICESURVEY&quot; |
| WORKFLOW | &quot;WORKFLOW&quot; |
| WORKITEM | &quot;WORKITEM&quot; |




_com.mypurecloud.sdk.v2:platform-client-v2:212.0.0_
