# ConversationEventTopicDisconnectReason


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | Disconnect reason protocol type. |  [optional] |
| **code** | **Long** | Protocol specific reason code. See the Q.850 and SIP specs. |  [optional] |
| **phrase** | **String** | Human readable English description of the disconnect reason. |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| Q850 | &quot;q850&quot; | 
| SIP | &quot;sip&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:224.0.0_
