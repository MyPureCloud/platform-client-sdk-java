# FlowEndDetailEventTopicFlowEndEvent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **eventTime** | **Long** |  |  [optional] |
| **conversationId** | **String** |  |  [optional] |
| **participantId** | **String** |  |  [optional] |
| **sessionId** | **String** |  |  [optional] |
| **disconnectType** | [**DisconnectTypeEnum**](#Enum--DisconnectTypeEnum) |  |  [optional] |
| **mediaType** | [**MediaTypeEnum**](#Enum--MediaTypeEnum) |  |  [optional] |
| **provider** | **String** |  |  [optional] |
| **direction** | [**DirectionEnum**](#Enum--DirectionEnum) |  |  [optional] |
| **ani** | **String** |  |  [optional] |
| **dnis** | **String** |  |  [optional] |
| **addressTo** | **String** |  |  [optional] |
| **addressFrom** | **String** |  |  [optional] |
| **subject** | **String** |  |  [optional] |
| **messageType** | [**MessageTypeEnum**](#Enum--MessageTypeEnum) |  |  [optional] |
| **flowType** | [**FlowTypeEnum**](#Enum--FlowTypeEnum) |  |  [optional] |
| **flowId** | **String** |  |  [optional] |
| **divisionId** | **String** |  |  [optional] |
| **flowVersion** | **String** |  |  [optional] |
| **connectedDurationMs** | **Long** |  |  [optional] |
| **conversationExternalContactIds** | **List&lt;String&gt;** |  |  [optional] |
| **conversationExternalOrganizationIds** | **List&lt;String&gt;** |  |  [optional] |
| **exitReason** | [**ExitReasonEnum**](#Enum--ExitReasonEnum) |  |  [optional] |
| **transferType** | [**TransferTypeEnum**](#Enum--TransferTypeEnum) |  |  [optional] |


## Enum: DisconnectTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;UNKNOWN&quot; | 
| ENDPOINT | &quot;ENDPOINT&quot; | 
| CLIENT | &quot;CLIENT&quot; | 
| SYSTEM | &quot;SYSTEM&quot; | 
| TRANSFER | &quot;TRANSFER&quot; | 
| ERROR | &quot;ERROR&quot; | 
| PEER | &quot;PEER&quot; | 
| OTHER | &quot;OTHER&quot; | 
| SPAM | &quot;SPAM&quot; | 
| TIMEOUT | &quot;TIMEOUT&quot; | 
| TRANSPORT_FAILURE | &quot;TRANSPORT_FAILURE&quot; | 
| CONFERENCE_TRANSFER | &quot;CONFERENCE_TRANSFER&quot; | 
| CONSULT_TRANSFER | &quot;CONSULT_TRANSFER&quot; | 
| FORWARD_TRANSFER | &quot;FORWARD_TRANSFER&quot; | 
| NO_ANSWER_TRANSFER | &quot;NO_ANSWER_TRANSFER&quot; | 
| NOT_AVAILABLE_TRANSFER | &quot;NOT_AVAILABLE_TRANSFER&quot; | 
| UNCALLABLE | &quot;UNCALLABLE&quot; | 
| DND_ENDPOINT | &quot;DND_ENDPOINT&quot; | 
| DND_TRANSFER | &quot;DND_TRANSFER&quot; | 
| INACTIVITY | &quot;INACTIVITY&quot; | 


## Enum: MediaTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;UNKNOWN&quot; | 
| VOICE | &quot;VOICE&quot; | 
| CHAT | &quot;CHAT&quot; | 
| EMAIL | &quot;EMAIL&quot; | 
| CALLBACK | &quot;CALLBACK&quot; | 
| COBROWSE | &quot;COBROWSE&quot; | 
| VIDEO | &quot;VIDEO&quot; | 
| SCREENSHARE | &quot;SCREENSHARE&quot; | 
| MESSAGE | &quot;MESSAGE&quot; | 
| INTERNALMESSAGE | &quot;INTERNALMESSAGE&quot; | 


## Enum: DirectionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;UNKNOWN&quot; | 
| INBOUND | &quot;INBOUND&quot; | 
| OUTBOUND | &quot;OUTBOUND&quot; | 


## Enum: MessageTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;UNKNOWN&quot; | 
| SMS | &quot;SMS&quot; | 
| TWITTER | &quot;TWITTER&quot; | 
| FACEBOOK | &quot;FACEBOOK&quot; | 
| LINE | &quot;LINE&quot; | 
| WHATSAPP | &quot;WHATSAPP&quot; | 
| WEBMESSAGING | &quot;WEBMESSAGING&quot; | 
| OPEN | &quot;OPEN&quot; | 
| INSTAGRAM | &quot;INSTAGRAM&quot; | 
| APPLE | &quot;APPLE&quot; | 


## Enum: FlowTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;UNKNOWN&quot; | 
| INBOUNDCALL | &quot;INBOUNDCALL&quot; | 
| OUTBOUNDCALL | &quot;OUTBOUNDCALL&quot; | 
| INQUEUECALL | &quot;INQUEUECALL&quot; | 
| SECURECALL | &quot;SECURECALL&quot; | 
| INBOUNDEMAIL | &quot;INBOUNDEMAIL&quot; | 
| SURVEYINVITE | &quot;SURVEYINVITE&quot; | 
| INBOUNDSHORTMESSAGE | &quot;INBOUNDSHORTMESSAGE&quot; | 
| INBOUNDCHAT | &quot;INBOUNDCHAT&quot; | 
| WORKFLOW | &quot;WORKFLOW&quot; | 
| BOT | &quot;BOT&quot; | 
| DIGITALBOT | &quot;DIGITALBOT&quot; | 
| COMMONMODULE | &quot;COMMONMODULE&quot; | 
| INQUEUEEMAIL | &quot;INQUEUEEMAIL&quot; | 
| INQUEUESHORTMESSAGE | &quot;INQUEUESHORTMESSAGE&quot; | 
| VOICE | &quot;VOICE&quot; | 
| VOICEMAIL | &quot;VOICEMAIL&quot; | 
| WORKITEM | &quot;WORKITEM&quot; | 
| VOICESURVEY | &quot;VOICESURVEY&quot; | 


## Enum: ExitReasonEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;UNKNOWN&quot; | 
| DISCONNECT | &quot;DISCONNECT&quot; | 
| FLOW_DISCONNECT | &quot;FLOW_DISCONNECT&quot; | 
| FLOW_ERROR_DISCONNECT | &quot;FLOW_ERROR_DISCONNECT&quot; | 
| TRANSFER | &quot;TRANSFER&quot; | 
| SESSION_EXPIRE_DISCONNECT | &quot;SESSION_EXPIRE_DISCONNECT&quot; | 
| RECOGNITION_FAILURE_DISCONNECT | &quot;RECOGNITION_FAILURE_DISCONNECT&quot; | 
| RECOGNITION_FAILURE_EXIT | &quot;RECOGNITION_FAILURE_EXIT&quot; | 
| USER_EXIT | &quot;USER_EXIT&quot; | 
| FLOW_EXIT | &quot;FLOW_EXIT&quot; | 
| FLOW_ERROR_EXIT | &quot;FLOW_ERROR_EXIT&quot; | 


## Enum: TransferTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;UNKNOWN&quot; | 
| ACD | &quot;ACD&quot; | 
| USER | &quot;USER&quot; | 
| NUMBER | &quot;NUMBER&quot; | 
| ACD_VOICEMAIL | &quot;ACD_VOICEMAIL&quot; | 
| USER_VOICEMAIL | &quot;USER_VOICEMAIL&quot; | 
| GROUP_VOICEMAIL | &quot;GROUP_VOICEMAIL&quot; | 
| GROUP | &quot;GROUP&quot; | 
| FLOW | &quot;FLOW&quot; | 
| SECURE_FLOW | &quot;SECURE_FLOW&quot; | 
| RETURN_TO_AGENT | &quot;RETURN_TO_AGENT&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
