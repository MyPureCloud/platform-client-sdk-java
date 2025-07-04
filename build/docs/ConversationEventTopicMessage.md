# ConversationEventTopicMessage


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | A globally unique identifier for this communication. |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) |  |  [optional] |
| **initialState** | [**InitialStateEnum**](#Enum--InitialStateEnum) |  |  [optional] |
| **direction** | [**DirectionEnum**](#Enum--DirectionEnum) | Whether a message is inbound or outbound. |  [optional] |
| **held** | **Boolean** | True if this call is held and the person on this side hears silence. |  [optional] |
| **errorInfo** | [**ConversationEventTopicErrorDetails**](ConversationEventTopicErrorDetails) | Detailed information about an error response. |  [optional] |
| **provider** | **String** | The source provider of the email. |  [optional] |
| **scriptId** | **String** | The UUID of the script to use. |  [optional] |
| **peerId** | **String** | The id of the peer communication corresponding to a matching leg for this communication. |  [optional] |
| **disconnectType** | [**DisconnectTypeEnum**](#Enum--DisconnectTypeEnum) | System defined string indicating what caused the communication to disconnect. Will be null until the communication disconnects. |  [optional] |
| **startHoldTime** | [**Date**](Date) | The timestamp the email was placed on hold in the cloud clock if the email is currently on hold. |  [optional] |
| **connectedTime** | [**Date**](Date) | The timestamp when this communication was connected in the cloud clock. |  [optional] |
| **disconnectedTime** | [**Date**](Date) | The timestamp when this communication disconnected from the conversation in the provider clock. |  [optional] |
| **toAddress** | [**ConversationEventTopicAddress**](ConversationEventTopicAddress) | Address and name data for a call endpoint. |  [optional] |
| **fromAddress** | [**ConversationEventTopicAddress**](ConversationEventTopicAddress) | Address and name data for a call endpoint. |  [optional] |
| **messages** | [**List&lt;ConversationEventTopicMessageDetails&gt;**](ConversationEventTopicMessageDetails) | The messages sent on this communication channel. |  [optional] |
| **messagesTranscriptUri** | **String** | the messages transcript file uri. |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | Indicates the type of message platform from which the message originated. |  [optional] |
| **recipientCountry** | **String** | Indicates the country where the recipient is associated in ISO 3166-1 alpha-2 format. |  [optional] |
| **recipientType** | **String** | The type of the recipient. Eg: Provisioned phoneNumber is the recipient for sms message type. |  [optional] |
| **journeyContext** | [**ConversationEventTopicJourneyContext**](ConversationEventTopicJourneyContext) | A subset of the Journey System's data relevant to a part of a conversation (for external linkage and internal usage/context). |  [optional] |
| **wrapup** | [**ConversationEventTopicWrapup**](ConversationEventTopicWrapup) | Call wrap up or disposition data. |  [optional] |
| **afterCallWork** | [**ConversationEventTopicAfterCallWork**](ConversationEventTopicAfterCallWork) | A communication's after-call work data. |  [optional] |
| **afterCallWorkRequired** | **Boolean** | Indicates if after-call is required for a communication. Only used when the ACW Setting is Agent Requested. |  [optional] |
| **agentAssistantId** | **String** | UUID of virtual agent assistant that provide suggestions to the agent participant during the conversation. |  [optional] |
| **byoSmsIntegrationId** | **String** |  |  [optional] |
| **queueMediaSettings** | [**ConversationEventTopicQueueMediaSettings**](ConversationEventTopicQueueMediaSettings) | Represents the queue setting for this media. |  [optional] |


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ALERTING | &quot;alerting&quot; | 
| CONNECTED | &quot;connected&quot; | 
| DISCONNECTED | &quot;disconnected&quot; | 


## Enum: InitialStateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ALERTING | &quot;alerting&quot; | 
| CONNECTED | &quot;connected&quot; | 
| DISCONNECTED | &quot;disconnected&quot; | 


## Enum: DirectionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| OUTBOUND | &quot;outbound&quot; | 
| INBOUND | &quot;inbound&quot; | 


## Enum: DisconnectTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ENDPOINT | &quot;endpoint&quot; | 
| ENDPOINT_DND | &quot;endpoint.dnd&quot; | 
| CLIENT | &quot;client&quot; | 
| SYSTEM | &quot;system&quot; | 
| TIMEOUT | &quot;timeout&quot; | 
| TRANSFER | &quot;transfer&quot; | 
| TRANSFER_CONFERENCE | &quot;transfer.conference&quot; | 
| TRANSFER_CONSULT | &quot;transfer.consult&quot; | 
| TRANSFER_FORWARD | &quot;transfer.forward&quot; | 
| TRANSFER_NOANSWER | &quot;transfer.noanswer&quot; | 
| TRANSFER_NOTAVAILABLE | &quot;transfer.notavailable&quot; | 
| TRANSFER_DND | &quot;transfer.dnd&quot; | 
| TRANSPORT_FAILURE | &quot;transport.failure&quot; | 
| ERROR | &quot;error&quot; | 
| PEER | &quot;peer&quot; | 
| OTHER | &quot;other&quot; | 
| SPAM | &quot;spam&quot; | 
| UNCALLABLE | &quot;uncallable&quot; | 
| INACTIVITY | &quot;inactivity&quot; | 


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;unknown&quot; | 
| SMS | &quot;sms&quot; | 
| TWITTER | &quot;twitter&quot; | 
| FACEBOOK | &quot;facebook&quot; | 
| LINE | &quot;line&quot; | 
| VIBER | &quot;viber&quot; | 
| WECHAT | &quot;wechat&quot; | 
| WHATSAPP | &quot;whatsapp&quot; | 
| TELEGRAM | &quot;telegram&quot; | 
| KAKAO | &quot;kakao&quot; | 
| WEBMESSAGING | &quot;webmessaging&quot; | 
| OPEN | &quot;open&quot; | 
| INSTAGRAM | &quot;instagram&quot; | 
| APPLE | &quot;apple&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
