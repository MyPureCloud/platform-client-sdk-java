---
title: ConversationEventTopicVideo
---
## ConversationEventTopicVideo


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **state** | [**StateEnum**](#StateEnum)<!----> |  |  [optional] |
| **self** | <!----><!---->[**ConversationEventTopicAddress**](ConversationEventTopicAddress.html)<!----> |  |  [optional] |
| **id** | <!----><!---->**String**<!----> |  |  [optional] |
| **context** | <!----><!---->**String**<!----> |  |  [optional] |
| **audioMuted** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **videoMuted** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **sharingScreen** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **provider** | <!----><!---->**String**<!----> |  |  [optional] |
| **scriptId** | <!----><!---->**String**<!----> |  |  [optional] |
| **peerId** | <!----><!---->**String**<!----> |  |  [optional] |
| **disconnectType** | [**DisconnectTypeEnum**](#DisconnectTypeEnum)<!----> |  |  [optional] |
| **connectedTime** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **disconnectedTime** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **msids** | <!----><!---->**List&lt;String&gt;**<!----> |  |  [optional] |
| **additionalProperties** | <!----><!---->**Object**<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="StateEnum"></a>

## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ALERTING | &quot;ALERTING&quot; |
| DIALING | &quot;DIALING&quot; |
| CONTACTING | &quot;CONTACTING&quot; |
| OFFERING | &quot;OFFERING&quot; |
| CONNECTED | &quot;CONNECTED&quot; |
| DISCONNECTED | &quot;DISCONNECTED&quot; |
| TERMINATED | &quot;TERMINATED&quot; |
| NONE | &quot;NONE&quot; |
{: class="table table-striped"}


<a name="DisconnectTypeEnum"></a>

## Enum: DisconnectTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ENDPOINT | &quot;ENDPOINT&quot; |
| CLIENT | &quot;CLIENT&quot; |
| SYSTEM | &quot;SYSTEM&quot; |
| TIMEOUT | &quot;TIMEOUT&quot; |
| TRANSFER | &quot;TRANSFER&quot; |
| TRANSFER_CONFERENCE | &quot;TRANSFER_CONFERENCE&quot; |
| TRANSFER_CONSULT | &quot;TRANSFER_CONSULT&quot; |
| TRANSFER_FORWARD | &quot;TRANSFER_FORWARD&quot; |
| TRANSFER_NOANSWER | &quot;TRANSFER_NOANSWER&quot; |
| TRANSFER_NOTAVAILABLE | &quot;TRANSFER_NOTAVAILABLE&quot; |
| TRANSPORT_FAILURE | &quot;TRANSPORT_FAILURE&quot; |
| ERROR | &quot;ERROR&quot; |
| PEER | &quot;PEER&quot; |
| OTHER | &quot;OTHER&quot; |
| SPAM | &quot;SPAM&quot; |
| UNCALLABLE | &quot;UNCALLABLE&quot; |
{: class="table table-striped"}



