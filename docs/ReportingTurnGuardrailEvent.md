# ReportingTurnGuardrailEvent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The type of guardrail violation |  [optional] |
| **instruction** | **String** | The attached instruction to the guardrail |  [optional] |
| **violationsThreshold** | **Integer** | The number of violations allowed before an exit occurs. |  [optional] |
| **violationsTriggered** | **Integer** | The current amount of violations that have been triggered in the current action. |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CUSTOM | &quot;Custom&quot; | 
| JAILBREAK | &quot;Jailbreak&quot; | 
| HARMFUL | &quot;Harmful&quot; | 
| INAPPROPRIATE | &quot;Inappropriate&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:259.0.0_
