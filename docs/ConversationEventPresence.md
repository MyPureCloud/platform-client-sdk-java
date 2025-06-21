# ConversationEventPresence


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | Describes the type of Presence event. |  |
| **receivedMessage** | [**ConversationContentReceivedReplyMessage**](ConversationContentReceivedReplyMessage) | A sign in prompt message for when the authenticate event is received. |  [optional] |
| **replyMessage** | [**ConversationContentReceivedReplyMessage**](ConversationContentReceivedReplyMessage) | A reply message on authentication success. |  [optional] |


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
| AUTHENTICATEFAILURE | &quot;AuthenticateFailure&quot; | 
| AUTHENTICATECANCEL | &quot;AuthenticateCancel&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:227.0.0_
