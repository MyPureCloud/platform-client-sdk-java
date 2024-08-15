# QueueConversationVideoEventTopicDisconnectReason


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | Disconnect reason protocol type. |  [optional] |
| **code** | **Integer** | Protocol specific reason code. See the Q.850 and SIP specs. |  [optional] |
| **phrase** | **String** | Human readable English description of the disconnect reason. |  [optional] |
{: class="table table-striped"}


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| Q850 | &quot;q850&quot; | 
| SIP | &quot;sip&quot; | 
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:207.0.0_
