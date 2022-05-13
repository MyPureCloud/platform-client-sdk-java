---
title: QueueConversationEventTopicDisconnectReason
---
## QueueConversationEventTopicDisconnectReason


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | Disconnect reason protocol type. |  [optional] |
| **code** | <!----><!---->**Integer**<!----> | Protocol specific reason code. See the Q.850 and SIP specs. |  [optional] |
| **phrase** | <!----><!---->**String**<!----> | Human readable English description of the disconnect reason. |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| Q850 | &quot;q850&quot; | 
| SIP | &quot;sip&quot; | 
{: class="table table-striped"}



