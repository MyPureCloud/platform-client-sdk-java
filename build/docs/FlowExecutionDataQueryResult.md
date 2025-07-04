# FlowExecutionDataQueryResult


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **startDateTime** | [**Date**](Date) | The start time for the execution of this flow. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **endDateTime** | [**Date**](Date) | The end time for the execution of this flow. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **flowId** | **String** | The id of the flow that was executed. |  [optional] |
| **flowVersion** | **String** | The version of the flow that was executed. |  [optional] |
| **conversationId** | **String** | The id of the conversation that executed this flow. |  [optional] |
| **workitemId** | **String** | The id of the workitem that executed this flow. |  [optional] |
| **flowType** | [**FlowTypeEnum**](#Enum--FlowTypeEnum) | The type of flow. |  [optional] |
| **flowErrorReason** | **String** | If the flow errored out this is the reason. |  [optional] |
| **flowWarningReason** | **String** | If the flow had a warning, this is the reason. |  [optional] |
| **flowName** | **String** | The name of the flow. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: FlowTypeEnum

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
