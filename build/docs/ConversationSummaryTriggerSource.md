# ConversationSummaryTriggerSource


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **sourceType** | [**SourceTypeEnum**](#Enum--SourceTypeEnum) | The configuration entity for which summarization is triggered. |  [optional] |
| **sourceId** | **String** | The id value for the source type. |  [optional] |
| **sourceOutcome** | [**SourceOutcomeEnum**](#Enum--SourceOutcomeEnum) | The reason a trigger source finished processing. Only applies to Flow trigger source types. |  [optional] |


## Enum: SourceTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| AGENTASSISTANT | &quot;AgentAssistant&quot; | 
| PROGRAM | &quot;Program&quot; | 
| FLOW | &quot;Flow&quot; | 
| COPILOT | &quot;Copilot&quot; | 


## Enum: SourceOutcomeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| CONTAINED | &quot;Contained&quot; | 
| TRANSFER | &quot;Transfer&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:256.1.0_
