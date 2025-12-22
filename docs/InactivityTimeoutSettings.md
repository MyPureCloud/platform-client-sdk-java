# InactivityTimeoutSettings


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **timeoutSeconds** | **Integer** | Timeout in seconds for inactivity on the interaction |  [optional] |
| **actionType** | [**ActionTypeEnum**](#Enum--ActionTypeEnum) | Action to take when timeout occurs |  [optional] |
| **flowId** | [**DomainEntityRef**](DomainEntityRef) | Flow ID for architect flow action |  [optional] |


## Enum: ActionTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DISCONNECT | &quot;DISCONNECT&quot; | 
| SEND_TO_ARCHITECT_FLOW | &quot;SEND_TO_ARCHITECT_FLOW&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:241.0.0_
