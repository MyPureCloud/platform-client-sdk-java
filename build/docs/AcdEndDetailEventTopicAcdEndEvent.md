# AcdEndDetailEventTopicAcdEndEvent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **eventTime** | **Integer** |  |  [optional] |
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
| **callbackUserName** | **String** |  |  [optional] |
| **callbackNumbers** | **List&lt;String&gt;** |  |  [optional] |
| **callbackScheduledTime** | **Integer** |  |  [optional] |
| **subject** | **String** |  |  [optional] |
| **messageType** | [**MessageTypeEnum**](#Enum--MessageTypeEnum) |  |  [optional] |
| **queueId** | **String** |  |  [optional] |
| **divisionId** | **String** |  |  [optional] |
| **acdOutcome** | [**AcdOutcomeEnum**](#Enum--AcdOutcomeEnum) |  |  [optional] |
| **answeredUserId** | **String** |  |  [optional] |
| **requestedRoutings** | [**List<RequestedRoutingsEnum>**](#Enum--RequestedRoutingsEnum) |  |  [optional] |
| **usedRouting** | [**UsedRoutingEnum**](#Enum--UsedRoutingEnum) |  |  [optional] |
| **requestedRoutingSkillIds** | **List&lt;String&gt;** |  |  [optional] |
| **requestedLanguageId** | **String** |  |  [optional] |
| **requestedRoutingUserIds** | **List&lt;String&gt;** |  |  [optional] |
| **routingPriority** | **Integer** |  |  [optional] |
| **connectedDurationMs** | **Integer** |  |  [optional] |
| **conversationExternalContactIds** | **List&lt;String&gt;** |  |  [optional] |
| **conversationExternalOrganizationIds** | **List&lt;String&gt;** |  |  [optional] |
| **utilizationLabel** | **String** |  |  [optional] |
| **flowType** | **String** |  |  [optional] |


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


## Enum: AcdOutcomeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;UNKNOWN&quot; | 
| ABANDON | &quot;ABANDON&quot; | 
| ANSWERED | &quot;ANSWERED&quot; | 
| FLOW_OUT | &quot;FLOW_OUT&quot; | 


## Enum: RequestedRoutingsEnum

| Name | Value |
| ---- | ----- |
| UNKNOWN | &quot;UNKNOWN&quot; |
| MANUAL | &quot;MANUAL&quot; |
| PREDICTIVE | &quot;PREDICTIVE&quot; |
| PREFERRED | &quot;PREFERRED&quot; |
| LAST | &quot;LAST&quot; |
| BULLSEYE | &quot;BULLSEYE&quot; |
| STANDARD | &quot;STANDARD&quot; |
| OTHER | &quot;OTHER&quot; |
| CONDITIONAL | &quot;CONDITIONAL&quot; |
| VIP | &quot;VIP&quot; |


## Enum: UsedRoutingEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;UNKNOWN&quot; | 
| MANUAL | &quot;MANUAL&quot; | 
| PREDICTIVE | &quot;PREDICTIVE&quot; | 
| PREFERRED | &quot;PREFERRED&quot; | 
| LAST | &quot;LAST&quot; | 
| BULLSEYE | &quot;BULLSEYE&quot; | 
| STANDARD | &quot;STANDARD&quot; | 
| OTHER | &quot;OTHER&quot; | 
| CONDITIONAL | &quot;CONDITIONAL&quot; | 
| VIP | &quot;VIP&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:209.1.0_
