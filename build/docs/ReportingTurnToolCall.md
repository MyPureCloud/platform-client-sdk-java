# ReportingTurnToolCall


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **toolId** | **String** | Represents the identifier of the tool called. |  [optional] |
| **toolName** | **String** | Represents the name of the tool used in the event. |  [optional] |
| **toolType** | [**ToolTypeEnum**](#Enum--ToolTypeEnum) | Represents the type of tool used in the event. |  [optional] |
| **targetId** | **String** | Represents the identifier of the target that the tool is using. |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | Represents whether the tool call was successful or not. |  [optional] |
| **errorText** | **String** | Represents the error returned by the tool in the event of a failure. |  [optional] |
| **dateInvoked** | [**Date**](Date) | Represents the starting time of the tool call. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **latencyMs** | **Integer** | Represents the time it took the tool call to execute. |  [optional] |
| **origin** | [**OriginEnum**](#Enum--OriginEnum) | Represents the origin of the tool call. |  [optional] |
| **knowledgeMetadata** | [**ReportingTurnKnowledgeMetadata**](ReportingTurnKnowledgeMetadata) | Represents various metadata of knowledge calls used by the tool if the tool is configured to use knowledge. |  [optional] |


## Enum: ToolTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| KNOWLEDGESETTING | &quot;KnowledgeSetting&quot; | 
| KNOWLEDGEBASE | &quot;KnowledgeBase&quot; | 
| DATAACTION | &quot;DataAction&quot; | 
| EXTERNALA2ASERVER | &quot;ExternalA2AServer&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SUCCESS | &quot;Success&quot; | 
| FAILURE | &quot;Failure&quot; | 
| TIMEOUT | &quot;Timeout&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 


## Enum: OriginEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AVATOOL | &quot;AvaTool&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:260.1.0_
