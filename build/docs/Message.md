---
title: Message
---
## Message


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **state** | [**StateEnum**](#StateEnum) | The connection state of this communication. |  [optional] |
| **id** | **String** | A globally unique identifier for this communication. |  [optional] |
| **held** | **Boolean** | True if this call is held and the person on this side hears silence. |  [optional] |
| **segments** | [**List&lt;Segment&gt;**](Segment.html) | The time line of the participant&#39;s message, divided into activity segments. |  [optional] |
| **direction** | [**DirectionEnum**](#DirectionEnum) | The direction of the message. |  [optional] |
| **recordingId** | **String** | A globally unique identifier for the recording associated with this message. |  [optional] |
| **errorInfo** | [**ErrorBody**](ErrorBody.html) |  |  [optional] |
| **disconnectType** | [**DisconnectTypeEnum**](#DisconnectTypeEnum) | System defined string indicating what caused the communication to disconnect. Will be null until the communication disconnects. |  [optional] |
| **startHoldTime** | [**Date**](Date.html) | The timestamp the message was placed on hold in the cloud clock if the message is currently on hold. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **startAlertingTime** | [**Date**](Date.html) | The timestamp the communication has when it is first put into an alerting state. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **connectedTime** | [**Date**](Date.html) | The timestamp when this communication was connected in the cloud clock. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **disconnectedTime** | [**Date**](Date.html) | The timestamp when this communication disconnected from the conversation in the provider clock. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **provider** | **String** | The source provider for the message. |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum) | Indicates the type of message platform from which the message originated. |  [optional] |
| **recipientCountry** | **String** | Indicates the country where the recipient is associated in ISO 3166-1 alpha-2 format. |  [optional] |
| **recipientType** | **String** | The type of the recipient. Eg: Provisioned phoneNumber is the recipient for sms message type. |  [optional] |
| **scriptId** | **String** | The UUID of the script to use. |  [optional] |
| **peerId** | **String** | The id of the peer communication corresponding to a matching leg for this communication. |  [optional] |
| **toAddress** | [**Address**](Address.html) | Address and name data for a call endpoint. |  [optional] |
| **fromAddress** | [**Address**](Address.html) | Address and name data for a call endpoint. |  [optional] |
| **messages** | [**List&lt;MessageDetails&gt;**](MessageDetails.html) | The messages sent on this communication channel. |  [optional] |
{: class="table table-striped"}


<a name="StateEnum"></a>

## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ALERTING | &quot;alerting&quot; |
| CONNECTED | &quot;connected&quot; |
| DISCONNECTED | &quot;disconnected&quot; |
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
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| SMS | &quot;sms&quot; |
| TWITTER | &quot;twitter&quot; |
| FACEBOOK | &quot;facebook&quot; |
| LINE | &quot;line&quot; |
| WHATSAPP | &quot;whatsapp&quot; |
| TELEGRAM | &quot;telegram&quot; |
| KAKAO | &quot;kakao&quot; |
{: class="table table-striped"}



