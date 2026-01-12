# ChecklistInferenceJobResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | ID of the inference job. |  |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | Status of the checklist inference job. |  |
| **error** | [**ErrorInfo**](ErrorInfo) | Error information associated with a job in case of any errors. |  [optional] |
| **agentChecklistInfo** | [**AgentChecklistInfo**](AgentChecklistInfo) | Agent checklist info. |  [optional] |
| **jobStartTime** | [**Date**](Date) | Date when the inference job started. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **jobEndTime** | [**Date**](Date) | Date when the inference job finished. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **language** | **String** | Language associated with the checklist. |  [optional] |
| **agentId** | **String** | Agent ID. |  [optional] |
| **participantId** | **String** | Participant ID. |  [optional] |
| **queueId** | **String** | Queue ID. |  [optional] |
| **assistantId** | **String** | Assistant ID. |  [optional] |
| **mediaType** | [**MediaTypeEnum**](#Enum--MediaTypeEnum) | Media type. |  [optional] |
| **direction** | [**DirectionEnum**](#Enum--DirectionEnum) | Direction of the conversation. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PROCESSING | &quot;Processing&quot; | 
| ERROR | &quot;Error&quot; | 
| COMPLETE | &quot;Complete&quot; | 


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




_com.mypurecloud.sdk.v2:platform-client-v2:243.0.0_
