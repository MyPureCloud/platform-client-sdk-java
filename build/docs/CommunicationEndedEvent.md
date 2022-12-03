---
title: CommunicationEndedEvent
---
## CommunicationEndedEvent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **eventId** | <!----><!---->**String**<!----> | A unique (V4 UUID) eventId for this event |  |
| **eventDateTime** | <!----><!---->[**Date**](Date.html)<!----> | A Date Time representing the time this event occurred. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **conversationId** | <!----><!---->**String**<!----> | A unique Id (V4 UUID) identifying this conversation |  |
| **communicationId** | <!----><!---->**String**<!----> | A unique Id (V4 UUID) identifying this communication |  |
| **disconnectType** | [**DisconnectTypeEnum**](#DisconnectTypeEnum)<!----> | Indicates how this communication was ended. |  |
| **destinationConversationId** | <!----><!---->**String**<!----> | The id (V4 UUID) of the conversation that the communication is being moved to when conversations are merged. |  [optional] |
{: class="table table-striped"}


<a name="DisconnectTypeEnum"></a>

## Enum: DisconnectTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ERROR | &quot;Error&quot; | 
| PEER | &quot;Peer&quot; | 
| SELF | &quot;Self&quot; | 
| SYSTEM | &quot;System&quot; | 
| TRANSFER | &quot;Transfer&quot; | 
| TRANSFERACD | &quot;TransferACD&quot; | 
| TRANSFERCONFERENCE | &quot;TransferConference&quot; | 
| TRANSFERCONSULT | &quot;TransferConsult&quot; | 
| TRANSFERUSER | &quot;TransferUser&quot; | 
{: class="table table-striped"}



