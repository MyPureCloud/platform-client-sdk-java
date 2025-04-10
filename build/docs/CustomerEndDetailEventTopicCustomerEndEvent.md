# CustomerEndDetailEventTopicCustomerEndEvent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **eventTime** | **Long** |  |  [optional] |
| **conversationId** | **String** |  |  [optional] |
| **participantId** | **String** |  |  [optional] |
| **sessionId** | **String** |  |  [optional] |
| **disconnectType** | [**DisconnectTypeEnum**](#Enum--DisconnectTypeEnum) |  |  [optional] |
| **mediaType** | [**MediaTypeEnum**](#Enum--MediaTypeEnum) |  |  [optional] |
| **externalOrganizationId** | **String** |  |  [optional] |
| **externalContactId** | **String** |  |  [optional] |
| **provider** | **String** |  |  [optional] |
| **direction** | [**DirectionEnum**](#Enum--DirectionEnum) |  |  [optional] |
| **ani** | **String** |  |  [optional] |
| **dnis** | **String** |  |  [optional] |
| **addressTo** | **String** |  |  [optional] |
| **addressFrom** | **String** |  |  [optional] |
| **callbackUserName** | **String** |  |  [optional] |
| **callbackNumbers** | **List&lt;String&gt;** |  |  [optional] |
| **callbackScheduledTime** | **Long** |  |  [optional] |
| **subject** | **String** |  |  [optional] |
| **messageType** | [**MessageTypeEnum**](#Enum--MessageTypeEnum) |  |  [optional] |
| **interactingDurationMs** | **Long** |  |  [optional] |
| **conversationExternalContactIds** | **List&lt;String&gt;** |  |  [optional] |
| **conversationExternalOrganizationIds** | **List&lt;String&gt;** |  |  [optional] |
| **divisionId** | **String** |  |  [optional] |


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




_com.mypurecloud.sdk.v2:platform-client-v2:223.0.0_
