# CallHistoryParticipant


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The unique participant ID. |  [optional] |
| **name** | **String** | The display friendly name of the participant. |  [optional] |
| **address** | **String** | The participant address. |  [optional] |
| **startTime** | [**Date**](Date) | The time when this participant first joined the conversation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **endTime** | [**Date**](Date) | The time when this participant went disconnected for this media (eg: video disconnected time). Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **purpose** | **String** | The participant's purpose.  Values can be: 'agent', 'user', 'customer', 'external', 'acd', 'ivr |  [optional] |
| **direction** | [**DirectionEnum**](#Enum--DirectionEnum) | The participant's direction.  Values can be: 'inbound' or 'outbound' |  [optional] |
| **ani** | **String** | The call ANI. |  [optional] |
| **dnis** | **String** | The call DNIS. |  [optional] |
| **user** | [**User**](User) | The PureCloud user for this participant. |  [optional] |
| **queue** | [**Queue**](Queue) | The PureCloud queue for this participant. |  [optional] |
| **group** | [**Group**](Group) | The group involved in the group ring call. |  [optional] |
| **disconnectType** | [**DisconnectTypeEnum**](#Enum--DisconnectTypeEnum) | The reason the participant was disconnected from the conversation. |  [optional] |
| **externalContact** | [**ExternalContact**](ExternalContact) | The PureCloud external contact |  [optional] |
| **externalOrganization** | [**ExternalOrganization**](ExternalOrganization) | The PureCloud external organization |  [optional] |
| **didInteract** | **Boolean** | Indicates whether the contact ever connected |  [optional] |
| **sipResponseCodes** | **List&lt;Long&gt;** | Indicates SIP Response codes associated with the participant |  [optional] |
| **flaggedReason** | [**FlaggedReasonEnum**](#Enum--FlaggedReasonEnum) | The reason specifying why participant flagged the conversation. |  [optional] |
| **outboundCampaign** | [**Campaign**](Campaign) | The outbound campaign associated with the participant |  [optional] |
{: class="table table-striped"}


## Enum: DirectionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INBOUND | &quot;inbound&quot; | 
| OUTBOUND | &quot;outbound&quot; | 
{: class="table table-striped"}


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
{: class="table table-striped"}


## Enum: FlaggedReasonEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| GENERAL | &quot;general&quot; | 
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:207.0.0_
