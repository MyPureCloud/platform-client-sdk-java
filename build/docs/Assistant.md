# Assistant


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The name of the assistant that will assist the agent. |  |
| **dateCreated** | [**Date**](Date) | Date when the assistant was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | Date when the assistant was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **createdBy** | [**UserReference**](UserReference) | The user who created the assistant. |  [optional] |
| **modifiedBy** | [**UserReference**](UserReference) | The user who last modified the assistant. |  [optional] |
| **googleDialogflowConfig** | [**GoogleDialogflowConfig**](GoogleDialogflowConfig) | (Deprecated: use the 'knowledgeSuggestionConfig' for genesys knowledge suggestions) Configuration of Dialogflow used to assist the agent with transcriptions and knowledge suggestions. |  [optional] |
| **transcriptionConfig** | [**TranscriptionConfig**](TranscriptionConfig) | Configuration for speech transcription used to assist the agent. |  |
| **knowledgeSuggestionConfig** | [**KnowledgeSuggestionConfig**](KnowledgeSuggestionConfig) | Configuration that defines how to produce knowledge suggestions. |  |
| **state** | [**StateEnum**](#Enum--StateEnum) | State of the assistant. |  [optional] |
| **copilot** | [**Copilot**](Copilot) | Agent copilot configuration. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACTIVE | &quot;Active&quot; | 
| INACTIVE | &quot;Inactive&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:238.0.0_
