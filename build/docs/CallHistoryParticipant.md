---
title: CallHistoryParticipant
---
## CallHistoryParticipant


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The unique participant ID. |  [optional] |
| **name** | <!----><!---->**String**<!----> | The display friendly name of the participant. |  [optional] |
| **address** | <!----><!---->**String**<!----> | The participant address. |  [optional] |
| **startTime** | <!----><!---->[**Date**](Date.html)<!----> | The time when this participant first joined the conversation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **endTime** | <!----><!---->[**Date**](Date.html)<!----> | The time when this participant went disconnected for this media (eg: video disconnected time). Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **purpose** | <!----><!---->**String**<!----> | The participant's purpose.  Values can be: 'agent', 'user', 'customer', 'external', 'acd', 'ivr |  [optional] |
| **direction** | [**DirectionEnum**](#DirectionEnum)<!----> | The participant's direction.  Values can be: 'inbound' or 'outbound' |  [optional] |
| **ani** | <!----><!---->**String**<!----> | The call ANI. |  [optional] |
| **dnis** | <!----><!---->**String**<!----> | The call DNIS. |  [optional] |
| **user** | <!----><!---->[**User**](User.html)<!----> | The PureCloud user for this participant. |  [optional] |
| **queue** | <!----><!---->[**Queue**](Queue.html)<!----> | The PureCloud queue for this participant. |  [optional] |
| **group** | <!----><!---->[**Group**](Group.html)<!----> | The group involved in the group ring call. |  [optional] |
| **disconnectType** | [**DisconnectTypeEnum**](#DisconnectTypeEnum)<!----> | The reason the participant was disconnected from the conversation. |  [optional] |
| **externalContact** | <!----><!---->[**ExternalContact**](ExternalContact.html)<!----> | The PureCloud external contact |  [optional] |
| **externalOrganization** | <!----><!---->[**ExternalOrganization**](ExternalOrganization.html)<!----> | The PureCloud external organization |  [optional] |
| **didInteract** | <!----><!---->**Boolean**<!----> | Indicates whether the contact ever connected |  [optional] |
| **sipResponseCodes** | <!----><!---->**List&lt;Long&gt;**<!----> | Indicates SIP Response codes associated with the participant |  [optional] |
| **flaggedReason** | [**FlaggedReasonEnum**](#FlaggedReasonEnum)<!----> | The reason specifying why participant flagged the conversation. |  [optional] |
| **outboundCampaign** | <!----><!---->[**Campaign**](Campaign.html)<!----> | The outbound campaign associated with the participant |  [optional] |
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



