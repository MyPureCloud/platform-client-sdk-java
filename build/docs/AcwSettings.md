# AcwSettings


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **wrapupPrompt** | [**WrapupPromptEnum**](#Enum--WrapupPromptEnum) | This field controls how the UI prompts the agent for a wrapup. |  [optional] |
| **timeoutMs** | **Integer** | The amount of time the agent can stay in ACW (Min: 1 sec, Max: 60 min).  Can only be used when ACW is AGENT_REQUESTED, MANDATORY_TIMEOUT or MANDATORY_FORCED_TIMEOUT. |  [optional] |


## Enum: WrapupPromptEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| MANDATORY | &quot;MANDATORY&quot; | 
| OPTIONAL | &quot;OPTIONAL&quot; | 
| MANDATORY_TIMEOUT | &quot;MANDATORY_TIMEOUT&quot; | 
| MANDATORY_FORCED_TIMEOUT | &quot;MANDATORY_FORCED_TIMEOUT&quot; | 
| AGENT_REQUESTED | &quot;AGENT_REQUESTED&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:214.0.0_
