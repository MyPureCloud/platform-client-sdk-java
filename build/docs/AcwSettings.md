---
title: AcwSettings
---
## AcwSettings


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **wrapupPrompt** | [**WrapupPromptEnum**](#WrapupPromptEnum)<!----> | This field controls how the UI prompts the agent for a wrapup. |  [optional] |
| **timeoutMs** | <!----><!---->**Integer**<!----> | The amount of time the agent can stay in ACW (Min: 1 sec, Max: 1 day).  Can only be used when ACW is MANDATORY_TIMEOUT or MANDATORY_FORCED_TIMEOUT. |  [optional] |
{: class="table table-striped"}


<a name="WrapupPromptEnum"></a>

## Enum: WrapupPromptEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| MANDATORY | &quot;MANDATORY&quot; | 
| OPTIONAL | &quot;OPTIONAL&quot; | 
| MANDATORY_TIMEOUT | &quot;MANDATORY_TIMEOUT&quot; | 
| MANDATORY_FORCED_TIMEOUT | &quot;MANDATORY_FORCED_TIMEOUT&quot; | 
| AGENT_REQUESTED | &quot;AGENT_REQUESTED&quot; | 
{: class="table table-striped"}



