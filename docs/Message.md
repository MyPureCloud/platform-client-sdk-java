# Message


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **state** | [**StateEnum**](#Enum--StateEnum) | The connection state of this communication. |  [optional] |
| **initialState** | [**InitialStateEnum**](#Enum--InitialStateEnum) | The initial connection state of this communication. |  [optional] |
| **id** | **String** | A globally unique identifier for this communication. |  [optional] |
| **held** | **Boolean** | True if this call is held and the person on this side hears silence. |  [optional] |
| **segments** | [**List&lt;Segment&gt;**](Segment) | The time line of the participant's message, divided into activity segments. |  [optional] |
| **direction** | [**DirectionEnum**](#Enum--DirectionEnum) | The direction of the message. |  [optional] |
| **recordingId** | **String** | A globally unique identifier for the recording associated with this message. |  [optional] |
| **errorInfo** | [**ErrorBody**](ErrorBody) |  |  [optional] |
| **disconnectType** | [**DisconnectTypeEnum**](#Enum--DisconnectTypeEnum) | System defined string indicating what caused the communication to disconnect. Will be null until the communication disconnects. |  [optional] |
| **startHoldTime** | [**Date**](Date) | The timestamp the message was placed on hold in the cloud clock if the message is currently on hold. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **startAlertingTime** | [**Date**](Date) | The timestamp the communication has when it is first put into an alerting state. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **connectedTime** | [**Date**](Date) | The timestamp when this communication was connected in the cloud clock. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **disconnectedTime** | [**Date**](Date) | The timestamp when this communication disconnected from the conversation in the provider clock. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **provider** | **String** | The source provider for the message. |  [optional] |
| **authenticated** | **Boolean** | If true, the participant member is authenticated. |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | Indicates the type of message platform from which the message originated. |  [optional] |
| **recipientCountry** | **String** | Indicates the country where the recipient is associated in ISO 3166-1 alpha-2 format. |  [optional] |
| **recipientType** | **String** | The type of the recipient. Eg: Provisioned phoneNumber is the recipient for sms message type. |  [optional] |
| **scriptId** | **String** | The UUID of the script to use. |  [optional] |
| **peerId** | **String** | The id of the peer communication corresponding to a matching leg for this communication. |  [optional] |
| **toAddress** | [**Address**](Address) | Address and name data for a call endpoint. |  [optional] |
| **fromAddress** | [**Address**](Address) | Address and name data for a call endpoint. |  [optional] |
| **messages** | [**List&lt;MessageDetails&gt;**](MessageDetails) | The messages sent on this communication channel. |  [optional] |
| **journeyContext** | [**JourneyContext**](JourneyContext) | A subset of the Journey System's data relevant to a part of a conversation (for external linkage and internal usage/context). |  [optional] |
| **wrapup** | [**Wrapup**](Wrapup) | Call wrap up or disposition data. |  [optional] |
| **afterCallWork** | [**AfterCallWork**](AfterCallWork) | After-call work for the communication. |  [optional] |
| **afterCallWorkRequired** | **Boolean** | Indicates if after-call work is required for a communication. Only used when the ACW Setting is Agent Requested. |  [optional] |
| **agentAssistantId** | **String** | UUID of virtual agent assistant that provide suggestions to the agent participant during the conversation. |  [optional] |
| **byoSmsIntegrationId** | **String** | The internal id representing the customer supplied sms integration message. |  [optional] |
| **queueMediaSettings** | [**ConversationQueueMediaSettings**](ConversationQueueMediaSettings) | Represents the queue settings for this media type. |  [optional] |
| **engagementSource** | [**EngagementSourceEnum**](#Enum--EngagementSourceEnum) |  |  [optional] |


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ALERTING | &quot;alerting&quot; | 
| CONNECTED | &quot;connected&quot; | 
| PARKED | &quot;parked&quot; | 
| DISCONNECTED | &quot;disconnected&quot; | 


## Enum: InitialStateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ALERTING | &quot;alerting&quot; | 
| CONNECTED | &quot;connected&quot; | 
| PARKED | &quot;parked&quot; | 
| DISCONNECTED | &quot;disconnected&quot; | 


## Enum: DirectionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INBOUND | &quot;inbound&quot; | 
| OUTBOUND | &quot;outbound&quot; | 


## Enum: DisconnectTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ENDPOINT | &quot;endpoint&quot; | 
| CLIENT | &quot;client&quot; | 
| SYSTEM | &quot;system&quot; | 
| TIMEOUT | &quot;timeout&quot; | 
| TRANSFER | &quot;transfer&quot; | 
| TRANSFER_CONFERENCE | &quot;transfer.conference&quot; | 
| TRANSFER_CONSULT | &quot;transfer.consult&quot; | 
| TRANSFER_FORWARD | &quot;transfer.forward&quot; | 
| TRANSFER_NOANSWER | &quot;transfer.noanswer&quot; | 
| TRANSFER_NOTAVAILABLE | &quot;transfer.notavailable&quot; | 
| TRANSPORT_FAILURE | &quot;transport.failure&quot; | 
| ERROR | &quot;error&quot; | 
| PEER | &quot;peer&quot; | 
| OTHER | &quot;other&quot; | 
| SPAM | &quot;spam&quot; | 
| UNCALLABLE | &quot;uncallable&quot; | 
| INACTIVITY | &quot;inactivity&quot; | 
| SESSION_EXPIRED | &quot;session.expired&quot; | 


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| APPLE | &quot;apple&quot; | 
| FACEBOOK | &quot;facebook&quot; | 
| INSTAGRAM | &quot;instagram&quot; | 
| KAKAO | &quot;kakao&quot; | 
| LINE | &quot;line&quot; | 
| OPEN | &quot;open&quot; | 
| SMS | &quot;sms&quot; | 
| TELEGRAM | &quot;telegram&quot; | 
| TWITTER | &quot;twitter&quot; | 
| WEBMESSAGING | &quot;webmessaging&quot; | 
| WHATSAPP | &quot;whatsapp&quot; | 
| UNKNOWN | &quot;unknown&quot; | 


## Enum: EngagementSourceEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| APPLEMESSAGESFORBUSINESS | &quot;AppleMessagesForBusiness&quot; | 
| DISCORD | &quot;Discord&quot; | 
| EMAIL | &quot;Email&quot; | 
| FACEBOOK | &quot;Facebook&quot; | 
| FACEBOOKMESSENGER | &quot;FacebookMessenger&quot; | 
| GLASSDOOR | &quot;Glassdoor&quot; | 
| GOOGLEBUSINESSPROFILE | &quot;GoogleBusinessProfile&quot; | 
| INSTAGRAM | &quot;Instagram&quot; | 
| KAKAOTALK | &quot;KakaoTalk&quot; | 
| LINE | &quot;Line&quot; | 
| LINKEDIN | &quot;LinkedIn&quot; | 
| MICROSOFTTEAMS | &quot;MicrosoftTeams&quot; | 
| MOBILECHAT | &quot;MobileChat&quot; | 
| OTHER | &quot;Other&quot; | 
| QQ | &quot;QQ&quot; | 
| REDDIT | &quot;Reddit&quot; | 
| SERVICENOW | &quot;ServiceNow&quot; | 
| SFDC | &quot;SFDC&quot; | 
| SMS | &quot;SMS&quot; | 
| SNAPCHAT | &quot;Snapchat&quot; | 
| TELEGRAM | &quot;Telegram&quot; | 
| THREADS | &quot;Threads&quot; | 
| TRUSTPILOT | &quot;Trustpilot&quot; | 
| UNSPECIFIED | &quot;Unspecified&quot; | 
| VIBER | &quot;Viber&quot; | 
| WEBCHAT | &quot;WebChat&quot; | 
| WECHAT | &quot;WeChat&quot; | 
| WEIBO | &quot;Weibo&quot; | 
| WHATSAPP | &quot;WhatsApp&quot; | 
| X | &quot;X&quot; | 
| YELP | &quot;Yelp&quot; | 
| YOUTUBE | &quot;YouTube&quot; | 
| ZENDESK | &quot;Zendesk&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:236.0.0_
