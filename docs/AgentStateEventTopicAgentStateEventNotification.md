# AgentStateEventTopicAgentStateEventNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **conversationId** | **String** |  |  [optional] |
| **sessionId** | **String** |  |  [optional] |
| **sessionStart** | **Long** |  |  [optional] |
| **currentStateStart** | **Long** |  |  [optional] |
| **currentState** | [**CurrentStateEnum**](#Enum--CurrentStateEnum) |  |  [optional] |
| **userId** | **String** |  |  [optional] |
| **originatingDirection** | [**OriginatingDirectionEnum**](#Enum--OriginatingDirectionEnum) |  |  [optional] |
| **mediaType** | [**MediaTypeEnum**](#Enum--MediaTypeEnum) |  |  [optional] |
| **queueId** | **String** |  |  [optional] |
| **requestedLanguageId** | **String** |  |  [optional] |
| **requestedSkillIds** | **List&lt;String&gt;** |  |  [optional] |


## Enum: CurrentStateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;UNKNOWN&quot; | 
| ALERT | &quot;ALERT&quot; | 
| INTERACT | &quot;INTERACT&quot; | 
| WRAPUP | &quot;WRAPUP&quot; | 
| BARGING | &quot;BARGING&quot; | 
| CALLBACK | &quot;CALLBACK&quot; | 
| COACHING | &quot;COACHING&quot; | 
| CONTACTING | &quot;CONTACTING&quot; | 
| CONVERTING | &quot;CONVERTING&quot; | 
| DELAY | &quot;DELAY&quot; | 
| DIALING | &quot;DIALING&quot; | 
| HOLD | &quot;HOLD&quot; | 
| IVR | &quot;IVR&quot; | 
| MONITORING | &quot;MONITORING&quot; | 
| PARKED | &quot;PARKED&quot; | 
| SCHEDULED | &quot;SCHEDULED&quot; | 
| SHARING | &quot;SHARING&quot; | 
| SYSTEM | &quot;SYSTEM&quot; | 
| TRANSMITTING | &quot;TRANSMITTING&quot; | 
| UPLOADING | &quot;UPLOADING&quot; | 
| VOICEMAIL | &quot;VOICEMAIL&quot; | 
| TERMINATED | &quot;TERMINATED&quot; | 


## Enum: OriginatingDirectionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;UNKNOWN&quot; | 
| INBOUND | &quot;INBOUND&quot; | 
| OUTBOUND | &quot;OUTBOUND&quot; | 


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
| SCREENMONITORING | &quot;SCREENMONITORING&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:245.0.0_
