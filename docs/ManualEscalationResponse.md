# ManualEscalationResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **socialMediaNormalizedMessageId** | **String** | The Id of the message that got escalated. |  [optional] |
| **conversationNormalizedMessageId** | **String** | The ID of the message in the conversation. |  [optional] |
| **escalationTarget** | [**EscalationTarget**](EscalationTarget) | The target integration configuration used for an social media message. |  [optional] |
| **escalationStatus** | [**EscalationStatusEnum**](#Enum--EscalationStatusEnum) | Escalation Status of the message. |  [optional] |


## Enum: EscalationStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| MANUAL | &quot;Manual&quot; | 
| THROTTLED | &quot;Throttled&quot; | 
| PREVIOUSLYESCALATED | &quot;PreviouslyEscalated&quot; | 
| NOTESCALATED | &quot;NotEscalated&quot; | 
| AUTOMATIC | &quot;Automatic&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:234.0.0_
