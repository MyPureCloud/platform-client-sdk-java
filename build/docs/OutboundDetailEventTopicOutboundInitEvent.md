# OutboundDetailEventTopicOutboundInitEvent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **eventTime** | **Long** |  |  [optional] |
| **conversationId** | **String** |  |  [optional] |
| **participantId** | **String** |  |  [optional] |
| **sessionId** | **String** |  |  [optional] |
| **mediaType** | [**MediaTypeEnum**](#Enum--MediaTypeEnum) |  |  [optional] |
| **provider** | **String** |  |  [optional] |
| **direction** | [**DirectionEnum**](#Enum--DirectionEnum) |  |  [optional] |
| **ani** | **String** |  |  [optional] |
| **dnis** | **String** |  |  [optional] |
| **addressTo** | **String** |  |  [optional] |
| **addressFrom** | **String** |  |  [optional] |
| **subject** | **String** |  |  [optional] |
| **messageType** | [**MessageTypeEnum**](#Enum--MessageTypeEnum) |  |  [optional] |
| **outboundCampaignId** | **String** |  |  [optional] |
| **divisionId** | **String** |  |  [optional] |
| **outboundContactListId** | **String** |  |  [optional] |
| **outboundContactId** | **String** |  |  [optional] |
| **conversationExternalContactIds** | **List&lt;String&gt;** |  |  [optional] |
| **conversationExternalOrganizationIds** | **List&lt;String&gt;** |  |  [optional] |


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




_com.mypurecloud.sdk.v2:platform-client-v2:229.1.0_
