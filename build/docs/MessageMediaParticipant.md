# MessageMediaParticipant


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The unique participant ID. |  [optional] |
| **name** | **String** | The display friendly name of the participant. |  [optional] |
| **address** | **String** | The participant address. |  [optional] |
| **startTime** | [**Date**](Date) | The time when this participant first joined the conversation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **startAlertingTime** | [**Date**](Date) | The timestamp when it is first put into an alerting state. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **connectedTime** | [**Date**](Date) | The time when this participant went connected for this media (eg: video connected time). Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **endTime** | [**Date**](Date) | The time when this participant went disconnected for this media (eg: video disconnected time). Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **startHoldTime** | [**Date**](Date) | The time when this participant's hold started. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **purpose** | **String** | The participant's purpose.  Values can be: 'agent', 'user', 'customer', 'external', 'acd', 'ivr |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) | The participant's state.  Values can be: 'alerting', 'connected', 'disconnected', 'dialing', 'contacting |  [optional] |
| **direction** | [**DirectionEnum**](#Enum--DirectionEnum) | The participant's direction.  Values can be: 'inbound' or 'outbound' |  [optional] |
| **disconnectType** | [**DisconnectTypeEnum**](#Enum--DisconnectTypeEnum) | The reason the participant was disconnected from the conversation. |  [optional] |
| **held** | **Boolean** | Value is true when the participant is on hold. |  [optional] |
| **wrapupRequired** | **Boolean** | Value is true when the participant requires wrap-up. |  [optional] |
| **wrapupPrompt** | **String** | The wrap-up prompt indicating the type of wrap-up to be performed. |  [optional] |
| **mediaRoles** | **List&lt;String&gt;** | List of roles this participant's media has had on the conversation, ie monitor, coach, etc |  [optional] |
| **user** | [**DomainEntityRef**](DomainEntityRef) | The PureCloud user for this participant. |  [optional] |
| **queue** | [**DomainEntityRef**](DomainEntityRef) | The PureCloud queue for this participant. |  [optional] |
| **team** | [**DomainEntityRef**](DomainEntityRef) | The PureCloud team for this participant. |  [optional] |
| **attributes** | **Map&lt;String, String&gt;** | A list of ad-hoc attributes for the participant. |  [optional] |
| **errorInfo** | [**ErrorInfo**](ErrorInfo) | If the conversation ends in error, contains additional error details. |  [optional] |
| **script** | [**DomainEntityRef**](DomainEntityRef) | The Engage script that should be used by this participant. |  [optional] |
| **wrapupTimeoutMs** | **Integer** | The amount of time the participant has to complete wrap-up. |  [optional] |
| **wrapupSkipped** | **Boolean** | Value is true when the participant has skipped wrap-up. |  [optional] |
| **alertingTimeoutMs** | **Integer** | Specifies how long the agent has to answer an interaction before being marked as not responding. |  [optional] |
| **provider** | **String** | The source provider for the communication. |  [optional] |
| **externalContact** | [**DomainEntityRef**](DomainEntityRef) | If this participant represents an external contact, then this will be the reference for the external contact. |  [optional] |
| **externalContactInitialDivisionId** | **String** | If this participant represents an external contact, then this will be the initial division for the external contact. This value will not be updated if the external contact is reassigned. |  [optional] |
| **externalOrganization** | [**DomainEntityRef**](DomainEntityRef) | If this participant represents an external org, then this will be the reference for the external org. |  [optional] |
| **wrapup** | [**Wrapup**](Wrapup) | Wrapup for this participant, if it has been applied. |  [optional] |
| **peer** | **String** | The peer communication corresponding to a matching leg for this communication. |  [optional] |
| **flaggedReason** | [**FlaggedReasonEnum**](#Enum--FlaggedReasonEnum) | The reason specifying why participant flagged the conversation. |  [optional] |
| **journeyContext** | [**JourneyContext**](JourneyContext) | Journey System data/context that is applicable to this communication.  When used for historical purposes, the context should be immutable.  When null, there is no applicable Journey System context. |  [optional] |
| **conversationRoutingData** | [**ConversationRoutingData**](ConversationRoutingData) | Information on how a communication should be routed to an agent. |  [optional] |
| **startAcwTime** | [**Date**](Date) | The timestamp when this participant started after-call work. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **endAcwTime** | [**Date**](Date) | The timestamp when this participant ended after-call work. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **parkTime** | [**Date**](Date) | The time when this participant's communication was last parked.  Does not reset on resume. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **resumeTime** | [**Date**](Date) | The time when this participant's communications will resume. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **toAddress** | [**Address**](Address) | Address for the participant on receiving side of the message conversation. If the address is a phone number, E.164 format is recommended. |  [optional] |
| **fromAddress** | [**Address**](Address) | Address for the participant on the sending side of the message conversation. If the address is a phone number, E.164 format is recommended. |  [optional] |
| **messages** | [**List&lt;MessageDetails&gt;**](MessageDetails) | Message instance details on the communication. |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | Indicates the type of message platform from which the message originated. |  [optional] |
| **recipientCountry** | **String** | Indicates the country where the recipient is associated in ISO 3166-1 alpha-2 format. |  [optional] |
| **recipientType** | **String** | The type of the recipient. Eg: Provisioned phoneNumber is the recipient for sms message type. |  [optional] |
| **authenticated** | **Boolean** | If true, the participant member is authenticated. |  [optional] |
| **monitoredParticipantId** | **String** | The ID of the participant being monitored when performing a message monitor. |  [optional] |
| **monitoredParticipant** | [**AddressableEntityRef**](AddressableEntityRef) | The participant being monitored when performing a message monitor. |  [optional] |


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ALERTING | &quot;alerting&quot; | 
| DIALING | &quot;dialing&quot; | 
| CONTACTING | &quot;contacting&quot; | 
| OFFERING | &quot;offering&quot; | 
| CONNECTED | &quot;connected&quot; | 
| DISCONNECTED | &quot;disconnected&quot; | 
| TERMINATED | &quot;terminated&quot; | 
| CONVERTING | &quot;converting&quot; | 
| UPLOADING | &quot;uploading&quot; | 
| TRANSMITTING | &quot;transmitting&quot; | 
| PARKED | &quot;parked&quot; | 
| NONE | &quot;none&quot; | 


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
| ENDPOINT_DONOTDISTURB | &quot;endpoint.donotdisturb&quot; | 
| CLIENT | &quot;client&quot; | 
| SYSTEM | &quot;system&quot; | 
| TRANSFER | &quot;transfer&quot; | 
| TRANSFER_CONFERENCE | &quot;transfer.conference&quot; | 
| TRANSFER_CONSULT | &quot;transfer.consult&quot; | 
| TRANSFER_DONOTDISTURB | &quot;transfer.donotdisturb&quot; | 
| TRANSFER_FORWARD | &quot;transfer.forward&quot; | 
| TRANSFER_NOANSWER | &quot;transfer.noanswer&quot; | 
| TRANSFER_NOTAVAILABLE | &quot;transfer.notavailable&quot; | 
| TRANSPORT_FAILURE | &quot;transport.failure&quot; | 
| ERROR | &quot;error&quot; | 
| PEER | &quot;peer&quot; | 
| OTHER | &quot;other&quot; | 
| SPAM | &quot;spam&quot; | 
| INACTIVITY | &quot;inactivity&quot; | 


## Enum: FlaggedReasonEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| GENERAL | &quot;general&quot; | 


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




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
