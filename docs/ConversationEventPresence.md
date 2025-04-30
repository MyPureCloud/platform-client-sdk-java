# ConversationEventPresence


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | Describes the type of Presence event. |  |
| **receivedMessage** | [**ConversationContentReceivedReplyMessage**](ConversationContentReceivedReplyMessage) | The message displayed in the received message bubble. |  [optional] |
| **replyMessage** | [**ConversationContentReceivedReplyMessage**](ConversationContentReceivedReplyMessage) | The message displayed in the reply message bubble. |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| JOIN | &quot;Join&quot; | 
| DISCONNECT | &quot;Disconnect&quot; | 
| CLEAR | &quot;Clear&quot; | 
| SIGNIN | &quot;SignIn&quot; | 
| SESSIONEXPIRED | &quot;SessionExpired&quot; | 
| AUTHENTICATE | &quot;Authenticate&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:224.0.0_
