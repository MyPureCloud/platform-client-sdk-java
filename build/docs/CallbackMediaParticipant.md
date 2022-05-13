---
title: CallbackMediaParticipant
---
## CallbackMediaParticipant


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The unique participant ID. |  [optional] |
| **name** | <!----><!---->**String**<!----> | The display friendly name of the participant. |  [optional] |
| **address** | <!----><!---->**String**<!----> | The participant address. |  [optional] |
| **startTime** | <!----><!---->[**Date**](Date.html)<!----> | The time when this participant first joined the conversation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **connectedTime** | <!----><!---->[**Date**](Date.html)<!----> | The time when this participant went connected for this media (eg: video connected time). Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **endTime** | <!----><!---->[**Date**](Date.html)<!----> | The time when this participant went disconnected for this media (eg: video disconnected time). Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **startHoldTime** | <!----><!---->[**Date**](Date.html)<!----> | The time when this participant's hold started. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **purpose** | <!----><!---->**String**<!----> | The participant's purpose.  Values can be: 'agent', 'user', 'customer', 'external', 'acd', 'ivr |  [optional] |
| **state** | [**StateEnum**](#StateEnum)<!----> | The participant's state.  Values can be: 'alerting', 'connected', 'disconnected', 'dialing', 'contacting |  [optional] |
| **direction** | [**DirectionEnum**](#DirectionEnum)<!----> | The participant's direction.  Values can be: 'inbound' or 'outbound' |  [optional] |
| **disconnectType** | [**DisconnectTypeEnum**](#DisconnectTypeEnum)<!----> | The reason the participant was disconnected from the conversation. |  [optional] |
| **held** | <!----><!---->**Boolean**<!----> | Value is true when the participant is on hold. |  [optional] |
| **wrapupRequired** | <!----><!---->**Boolean**<!----> | Value is true when the participant requires wrap-up. |  [optional] |
| **wrapupPrompt** | <!----><!---->**String**<!----> | The wrap-up prompt indicating the type of wrap-up to be performed. |  [optional] |
| **user** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | The PureCloud user for this participant. |  [optional] |
| **queue** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | The PureCloud queue for this participant. |  [optional] |
| **team** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | The PureCloud team for this participant. |  [optional] |
| **attributes** | <!----><!---->**Map&lt;String, String&gt;**<!----> | A list of ad-hoc attributes for the participant. |  [optional] |
| **errorInfo** | <!----><!---->[**ErrorInfo**](ErrorInfo.html)<!----> | If the conversation ends in error, contains additional error details. |  [optional] |
| **script** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | The Engage script that should be used by this participant. |  [optional] |
| **wrapupTimeoutMs** | <!----><!---->**Integer**<!----> | The amount of time the participant has to complete wrap-up. |  [optional] |
| **wrapupSkipped** | <!----><!---->**Boolean**<!----> | Value is true when the participant has skipped wrap-up. |  [optional] |
| **alertingTimeoutMs** | <!----><!---->**Integer**<!----> | Specifies how long the agent has to answer an interaction before being marked as not responding. |  [optional] |
| **provider** | <!----><!---->**String**<!----> | The source provider for the communication. |  [optional] |
| **externalContact** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | If this participant represents an external contact, then this will be the reference for the external contact. |  [optional] |
| **externalOrganization** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | If this participant represents an external org, then this will be the reference for the external org. |  [optional] |
| **wrapup** | <!----><!---->[**Wrapup**](Wrapup.html)<!----> | Wrapup for this participant, if it has been applied. |  [optional] |
| **peer** | <!----><!---->**String**<!----> | The peer communication corresponding to a matching leg for this communication. |  [optional] |
| **flaggedReason** | [**FlaggedReasonEnum**](#FlaggedReasonEnum)<!----> | The reason specifying why participant flagged the conversation. |  [optional] |
| **journeyContext** | <!----><!---->[**JourneyContext**](JourneyContext.html)<!----> | Journey System data/context that is applicable to this communication.  When used for historical purposes, the context should be immutable.  When null, there is no applicable Journey System context. |  [optional] |
| **conversationRoutingData** | <!----><!---->[**ConversationRoutingData**](ConversationRoutingData.html)<!----> | Information on how a communication should be routed to an agent. |  [optional] |
| **startAcwTime** | <!----><!---->[**Date**](Date.html)<!----> | The timestamp when this participant started after-call work. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **endAcwTime** | <!----><!---->[**Date**](Date.html)<!----> | The timestamp when this participant ended after-call work. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **outboundPreview** | <!----><!---->[**DialerPreview**](DialerPreview.html)<!----> | The outbound preview associated with this callback. |  [optional] |
| **voicemail** | <!----><!---->[**Voicemail**](Voicemail.html)<!----> | The voicemail associated with this callback. |  [optional] |
| **callbackNumbers** | <!----><!---->**List&lt;String&gt;**<!----> | The list of phone number to use for this callback. |  [optional] |
| **callbackUserName** | <!----><!---->**String**<!----> | The name of the callback target. |  [optional] |
| **externalCampaign** | <!----><!---->**Boolean**<!----> | True if the call for the callback uses external dialing. |  [optional] |
| **skipEnabled** | <!----><!---->**Boolean**<!----> | If true, the callback can be skipped. |  [optional] |
| **timeoutSeconds** | <!----><!---->**Integer**<!----> | Duration in seconds before the callback will be auto-dialed. |  [optional] |
| **automatedCallbackConfigId** | <!----><!---->**String**<!----> | The id of the config for automatically placing the callback (and handling the disposition). If absent, the callback will not be placed automatically but routed to an agent as per normal. |  [optional] |
| **callbackScheduledTime** | <!----><!---->[**Date**](Date.html)<!----> | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
{: class="table table-striped"}


<a name="StateEnum"></a>

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
| NONE | &quot;none&quot; | 
{: class="table table-striped"}


<a name="DirectionEnum"></a>

## Enum: DirectionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INBOUND | &quot;inbound&quot; | 
| OUTBOUND | &quot;outbound&quot; | 
{: class="table table-striped"}


<a name="DisconnectTypeEnum"></a>

## Enum: DisconnectTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ENDPOINT | &quot;endpoint&quot; | 
| CLIENT | &quot;client&quot; | 
| SYSTEM | &quot;system&quot; | 
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
{: class="table table-striped"}


<a name="FlaggedReasonEnum"></a>

## Enum: FlaggedReasonEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| GENERAL | &quot;general&quot; | 
{: class="table table-striped"}



