# CommunicationEndedEvent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **eventId** | **String** | A unique (V4 UUID) eventId for this event |  |
| **eventDateTime** | [**Date**](Date) | A Date Time representing the time this event occurred. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **conversationId** | **String** | A unique Id (V4 UUID) identifying this conversation |  |
| **communicationId** | **String** | A unique Id (V4 UUID) identifying this communication |  |
| **disconnectType** | [**DisconnectTypeEnum**](#Enum--DisconnectTypeEnum) | Indicates how this communication was ended. |  |
| **destinationConversationId** | **String** | The id (V4 UUID) of the conversation that the communication is being moved to when conversations are merged. |  [optional] |


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




_com.mypurecloud.sdk.v2:platform-client-v2:223.1.0_
