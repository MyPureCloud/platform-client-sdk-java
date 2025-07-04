# FlowSettingsResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The Flow Type |  [optional] |
| **modifiedBy** | [**UserReference**](UserReference) | User that last changed the log level setting. |  [optional] |
| **modifiedByClient** | [**DomainEntityRef**](DomainEntityRef) | OAuth client that last changed the log level setting. |  [optional] |
| **dateModified** | [**Date**](Date) | The time this log level was set. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **logLevelCharacteristics** | [**FlowLogLevel**](FlowLogLevel) | The log level set for this flow |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| BOT | &quot;bot&quot; | 
| COMMONMODULE | &quot;commonmodule&quot; | 
| DIGITALBOT | &quot;digitalbot&quot; | 
| INBOUNDCALL | &quot;inboundcall&quot; | 
| INBOUNDCHAT | &quot;inboundchat&quot; | 
| INBOUNDEMAIL | &quot;inboundemail&quot; | 
| INBOUNDSHORTMESSAGE | &quot;inboundshortmessage&quot; | 
| INQUEUECALL | &quot;inqueuecall&quot; | 
| INQUEUESHORTMESSAGE | &quot;inqueueshortmessage&quot; | 
| INQUEUEEMAIL | &quot;inqueueemail&quot; | 
| OUTBOUNDCALL | &quot;outboundcall&quot; | 
| SECURECALL | &quot;securecall&quot; | 
| SURVEYINVITE | &quot;surveyinvite&quot; | 
| VOICE | &quot;voice&quot; | 
| VOICEMAIL | &quot;voicemail&quot; | 
| VOICESURVEY | &quot;voicesurvey&quot; | 
| WORKFLOW | &quot;workflow&quot; | 
| WORKITEM | &quot;workitem&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
