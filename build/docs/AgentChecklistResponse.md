# AgentChecklistResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | ID of the checklist. |  |
| **name** | **String** | Name of the checklist. |  |
| **checklistItems** | [**List&lt;ChecklistItem&gt;**](ChecklistItem) | List of individual Checklist Items. |  |
| **activationTriggers** | [**List&lt;ActivationTrigger&gt;**](ActivationTrigger) | List of triggers that activated this checklist. |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The evaluation status of the checklist. |  |
| **exitReason** | **String** | Exit reason provided at the time of finalizing the checklist. |  [optional] |
| **language** | **String** | Language associated with the checklist. |  |
| **agentId** | **String** | Agent ID. |  [optional] |
| **participantId** | **String** | Participant ID. |  [optional] |
| **queueId** | **String** | Queue ID. |  [optional] |
| **assistantId** | **String** | Assistant ID. |  [optional] |
| **mediaType** | [**MediaTypeEnum**](#Enum--MediaTypeEnum) | Media type. |  [optional] |
| **direction** | [**DirectionEnum**](#Enum--DirectionEnum) | Direction of the conversation. |  [optional] |
| **evaluationStartDate** | [**Date**](Date) | Date when the checklist evaluation began. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **evaluationLastModifiedDate** | [**Date**](Date) | Date when the checklist was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **evaluationFinalizedDate** | [**Date**](Date) | Date when the checklist was finalized. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **evaluationFinalizedWithAcwDate** | [**Date**](Date) | Date when the checklist was finalized with ACW. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EVALUATIONSTARTED | &quot;EvaluationStarted&quot; | 
| EVALUATIONINPROGRESS | &quot;EvaluationInProgress&quot; | 
| EVALUATIONFINALIZED | &quot;EvaluationFinalized&quot; | 
| EVALUATIONFINALIZEDWITHACW | &quot;EvaluationFinalizedWithAcw&quot; | 


## Enum: MediaTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| VOICE | &quot;Voice&quot; | 
| MESSAGE | &quot;Message&quot; | 
| EMAIL | &quot;Email&quot; | 


## Enum: DirectionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INBOUND | &quot;Inbound&quot; | 
| OUTBOUND | &quot;Outbound&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:244.0.0_
