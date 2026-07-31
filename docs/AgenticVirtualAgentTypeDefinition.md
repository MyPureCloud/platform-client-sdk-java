# AgenticVirtualAgentTypeDefinition


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | Type name. |  |
| **description** | **String** | Additional context that helps the virtual agent understand what this type is used for. |  [optional] |
| **direction** | [**DirectionEnum**](#Enum--DirectionEnum) | Intended direction of use for this type. |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | Type value. The applicable fields depend on this value and related fields. |  [optional] |
| **userUtteranceSubstring** | **Boolean** | Whether values of this string type must be copied as a contiguous substring from recent user messages. |  [optional] |
| **undisclosed** | **Boolean** | Whether values of this string type are hidden from the virtual agent and represented as opaque identifiers. Only valid when type is string. |  [optional] |
| **properties** | [**List&lt;AgenticVirtualAgentPropertyDefinition&gt;**](AgenticVirtualAgentPropertyDefinition) | Properties of this object type. Applies when type is object. |  [optional] |
| **items** | **String** | Type of items in this array type. Applies when type is array. |  [optional] |
| **statusCodes** | **List&lt;Integer&gt;** | HTTP 4xx or 5xx status codes this error type can handle. Applies when type is DataActionHttpError. |  [optional] |
| **defaultInstruction** | **String** | Default instruction for how the virtual agent should handle this error type when a tool references it without its own error instruction. Applies when type is DataActionHttpError. |  [optional] |
| **_enum** | **List&lt;String&gt;** | Allowed enum values. Applies to enum types. |  [optional] |


## Enum: DirectionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INPUT | &quot;Input&quot; | 
| OUTPUT | &quot;Output&quot; | 
| AGENTINPUT | &quot;AgentInput&quot; | 
| AGENTOUTPUT | &quot;AgentOutput&quot; | 


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| STRING | &quot;string&quot; | 
| INTEGER | &quot;integer&quot; | 
| NUMBER | &quot;number&quot; | 
| BOOLEAN | &quot;boolean&quot; | 
| NULL | &quot;null&quot; | 
| OBJECT | &quot;object&quot; | 
| ARRAY | &quot;array&quot; | 
| DATAACTIONHTTPERROR | &quot;DataActionHttpError&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:258.0.0_
