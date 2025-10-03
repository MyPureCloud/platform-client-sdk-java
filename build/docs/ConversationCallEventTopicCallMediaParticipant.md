# ConversationCallEventTopicCallMediaParticipant


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **name** | **String** |  |  [optional] |
| **address** | **String** |  |  [optional] |
| **startTime** | [**Date**](Date) |  |  [optional] |
| **connectedTime** | [**Date**](Date) |  |  [optional] |
| **endTime** | [**Date**](Date) |  |  [optional] |
| **startHoldTime** | [**Date**](Date) |  |  [optional] |
| **purpose** | **String** |  |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) |  |  [optional] |
| **initialState** | [**InitialStateEnum**](#Enum--InitialStateEnum) |  |  [optional] |
| **direction** | [**DirectionEnum**](#Enum--DirectionEnum) |  |  [optional] |
| **disconnectType** | [**DisconnectTypeEnum**](#Enum--DisconnectTypeEnum) |  |  [optional] |
| **held** | **Boolean** |  |  [optional] |
| **wrapupRequired** | **Boolean** |  |  [optional] |
| **wrapupPrompt** | **String** |  |  [optional] |
| **user** | [**ConversationCallEventTopicUriReference**](ConversationCallEventTopicUriReference) |  |  [optional] |
| **queue** | [**ConversationCallEventTopicUriReference**](ConversationCallEventTopicUriReference) |  |  [optional] |
| **team** | [**ConversationCallEventTopicUriReference**](ConversationCallEventTopicUriReference) |  |  [optional] |
| **attributes** | **Map&lt;String, String&gt;** |  |  [optional] |
| **errorInfo** | [**ConversationCallEventTopicErrorBody**](ConversationCallEventTopicErrorBody) |  |  [optional] |
| **script** | [**ConversationCallEventTopicUriReference**](ConversationCallEventTopicUriReference) |  |  [optional] |
| **wrapupTimeoutMs** | **Long** |  |  [optional] |
| **wrapupSkipped** | **Boolean** |  |  [optional] |
| **alertingTimeoutMs** | **Long** |  |  [optional] |
| **provider** | **String** |  |  [optional] |
| **externalContact** | [**ConversationCallEventTopicUriReference**](ConversationCallEventTopicUriReference) |  |  [optional] |
| **externalContactInitialDivisionId** | **String** |  |  [optional] |
| **externalOrganization** | [**ConversationCallEventTopicUriReference**](ConversationCallEventTopicUriReference) |  |  [optional] |
| **wrapup** | [**ConversationCallEventTopicWrapup**](ConversationCallEventTopicWrapup) |  |  [optional] |
| **conversationRoutingData** | [**ConversationCallEventTopicConversationRoutingData**](ConversationCallEventTopicConversationRoutingData) |  |  [optional] |
| **peer** | **String** |  |  [optional] |
| **screenRecordingState** | **String** |  |  [optional] |
| **flaggedReason** | [**FlaggedReasonEnum**](#Enum--FlaggedReasonEnum) |  |  [optional] |
| **journeyContext** | [**ConversationCallEventTopicJourneyContext**](ConversationCallEventTopicJourneyContext) |  |  [optional] |
| **startAcwTime** | [**Date**](Date) |  |  [optional] |
| **endAcwTime** | [**Date**](Date) |  |  [optional] |
| **resumeTime** | [**Date**](Date) |  |  [optional] |
| **parkTime** | [**Date**](Date) |  |  [optional] |
| **mediaRoles** | **List&lt;String&gt;** |  |  [optional] |
| **queueMediaSettings** | [**ConversationCallEventTopicQueueMediaSettings**](ConversationCallEventTopicQueueMediaSettings) |  |  [optional] |
| **muted** | **Boolean** |  |  [optional] |
| **confined** | **Boolean** |  |  [optional] |
| **recording** | **Boolean** |  |  [optional] |
| **recordingState** | [**RecordingStateEnum**](#Enum--RecordingStateEnum) |  |  [optional] |
| **recordersState** | [**ConversationCallEventTopicRecordersState**](ConversationCallEventTopicRecordersState) |  |  [optional] |
| **disposition** | [**ConversationCallEventTopicDisposition**](ConversationCallEventTopicDisposition) |  |  [optional] |
| **securePause** | **Boolean** |  |  [optional] |
| **group** | [**ConversationCallEventTopicUriReference**](ConversationCallEventTopicUriReference) |  |  [optional] |
| **ani** | **String** |  |  [optional] |
| **dnis** | **String** |  |  [optional] |
| **documentId** | **String** |  |  [optional] |
| **monitoredParticipantId** | **String** |  |  [optional] |
| **coachedParticipantId** | **String** |  |  [optional] |
| **bargedParticipantId** | **String** |  |  [optional] |
| **bargedTime** | [**Date**](Date) |  |  [optional] |
| **consultParticipantId** | **String** |  |  [optional] |
| **faxStatus** | [**ConversationCallEventTopicFaxStatus**](ConversationCallEventTopicFaxStatus) |  |  [optional] |


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
| SCHEDULED | &quot;scheduled&quot; | 
| PARKED | &quot;parked&quot; | 
| NONE | &quot;none&quot; | 


## Enum: InitialStateEnum

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
| SCHEDULED | &quot;scheduled&quot; | 
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
| ENDPOINT_DND | &quot;endpoint.dnd&quot; | 
| CLIENT | &quot;client&quot; | 
| SYSTEM | &quot;system&quot; | 
| TRANSFER | &quot;transfer&quot; | 
| TIMEOUT | &quot;timeout&quot; | 
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
| SESSION_EXPIRED | &quot;session.expired&quot; | 


## Enum: FlaggedReasonEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| GENERAL | &quot;general&quot; | 


## Enum: RecordingStateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NONE | &quot;none&quot; | 
| ACTIVE | &quot;active&quot; | 
| PAUSED | &quot;paused&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:234.0.0_
