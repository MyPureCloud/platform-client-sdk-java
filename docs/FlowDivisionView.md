# FlowDivisionView


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The flow identifier |  [optional] |
| **name** | **String** | The flow name |  |
| **division** | [**WritableDivision**](WritableDivision) | The division to which this entity belongs. |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) |  |  [optional] |
| **description** | **String** | the flow description |  [optional] |
| **inputSchema** | [**JsonSchemaDocument**](JsonSchemaDocument) | json schema describing the inputs for the flow |  [optional] |
| **outputSchema** | [**JsonSchemaDocument**](JsonSchemaDocument) | json schema describing the outputs for the flow |  [optional] |
| **supportedLanguages** | [**List&lt;SupportedLanguage&gt;**](SupportedLanguage) | List of supported languages for the published version of the flow. |  [optional] |
| **publishedVersion** | [**FlowVersion**](FlowVersion) | published version information if there is a published version |  [optional] |
| **debugVersion** | [**FlowVersion**](FlowVersion) | debug version information if there is a debug version |  [optional] |
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




_com.mypurecloud.sdk.v2:platform-client-v2:215.0.0_
