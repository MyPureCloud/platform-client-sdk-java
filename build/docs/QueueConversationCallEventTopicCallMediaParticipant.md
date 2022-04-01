---
title: QueueConversationCallEventTopicCallMediaParticipant
---
## QueueConversationCallEventTopicCallMediaParticipant


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> |  |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **address** | <!----><!---->**String**<!----> |  |  [optional] |
| **startTime** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **connectedTime** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **endTime** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **startHoldTime** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **purpose** | <!----><!---->**String**<!----> |  |  [optional] |
| **state** | [**StateEnum**](#StateEnum)<!----> |  |  [optional] |
| **direction** | [**DirectionEnum**](#DirectionEnum)<!----> |  |  [optional] |
| **disconnectType** | [**DisconnectTypeEnum**](#DisconnectTypeEnum)<!----> |  |  [optional] |
| **held** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **wrapupRequired** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **wrapupPrompt** | <!----><!---->**String**<!----> |  |  [optional] |
| **user** | <!----><!---->[**QueueConversationCallEventTopicUriReference**](QueueConversationCallEventTopicUriReference.html)<!----> |  |  [optional] |
| **queue** | <!----><!---->[**QueueConversationCallEventTopicUriReference**](QueueConversationCallEventTopicUriReference.html)<!----> |  |  [optional] |
| **team** | <!----><!---->[**QueueConversationCallEventTopicUriReference**](QueueConversationCallEventTopicUriReference.html)<!----> |  |  [optional] |
| **attributes** | <!----><!---->**Map&lt;String, String&gt;**<!----> |  |  [optional] |
| **errorInfo** | <!----><!---->[**QueueConversationCallEventTopicErrorBody**](QueueConversationCallEventTopicErrorBody.html)<!----> |  |  [optional] |
| **script** | <!----><!---->[**QueueConversationCallEventTopicUriReference**](QueueConversationCallEventTopicUriReference.html)<!----> |  |  [optional] |
| **wrapupTimeoutMs** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **wrapupSkipped** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **alertingTimeoutMs** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **provider** | <!----><!---->**String**<!----> |  |  [optional] |
| **externalContact** | <!----><!---->[**QueueConversationCallEventTopicUriReference**](QueueConversationCallEventTopicUriReference.html)<!----> |  |  [optional] |
| **externalOrganization** | <!----><!---->[**QueueConversationCallEventTopicUriReference**](QueueConversationCallEventTopicUriReference.html)<!----> |  |  [optional] |
| **wrapup** | <!----><!---->[**QueueConversationCallEventTopicWrapup**](QueueConversationCallEventTopicWrapup.html)<!----> |  |  [optional] |
| **conversationRoutingData** | <!----><!---->[**QueueConversationCallEventTopicConversationRoutingData**](QueueConversationCallEventTopicConversationRoutingData.html)<!----> |  |  [optional] |
| **peer** | <!----><!---->**String**<!----> |  |  [optional] |
| **screenRecordingState** | <!----><!---->**String**<!----> |  |  [optional] |
| **flaggedReason** | [**FlaggedReasonEnum**](#FlaggedReasonEnum)<!----> |  |  [optional] |
| **journeyContext** | <!----><!---->[**QueueConversationCallEventTopicJourneyContext**](QueueConversationCallEventTopicJourneyContext.html)<!----> |  |  [optional] |
| **startAcwTime** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **endAcwTime** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **muted** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **confined** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **recording** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **recordingState** | [**RecordingStateEnum**](#RecordingStateEnum)<!----> |  |  [optional] |
| **group** | <!----><!---->[**QueueConversationCallEventTopicUriReference**](QueueConversationCallEventTopicUriReference.html)<!----> |  |  [optional] |
| **ani** | <!----><!---->**String**<!----> |  |  [optional] |
| **dnis** | <!----><!---->**String**<!----> |  |  [optional] |
| **documentId** | <!----><!---->**String**<!----> |  |  [optional] |
| **monitoredParticipantId** | <!----><!---->**String**<!----> |  |  [optional] |
| **coachedParticipantId** | <!----><!---->**String**<!----> |  |  [optional] |
| **bargedParticipantId** | <!----><!---->**String**<!----> |  |  [optional] |
| **bargedTime** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **consultParticipantId** | <!----><!---->**String**<!----> |  |  [optional] |
| **faxStatus** | <!----><!---->[**QueueConversationCallEventTopicFaxStatus**](QueueConversationCallEventTopicFaxStatus.html)<!----> |  |  [optional] |
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
| SCHEDULED | &quot;scheduled&quot; |
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
| TIMEOUT | &quot;timeout&quot; |
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


<a name="FlaggedReasonEnum"></a>

## Enum: FlaggedReasonEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| GENERAL | &quot;general&quot; |
{: class="table table-striped"}


<a name="RecordingStateEnum"></a>

## Enum: RecordingStateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| NONE | &quot;none&quot; |
| ACTIVE | &quot;active&quot; |
| PAUSED | &quot;paused&quot; |
{: class="table table-striped"}



