# AgenticVirtualAgentToolInput


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **targetName** | **String** | The unique name that identifies this input parameter within the tool |  |
| **type** | **String** | Input type name. The valid referenced type depends on the input source. |  |
| **source** | [**SourceEnum**](#Enum--SourceEnum) | Source of the input value. |  |
| **required** | **Boolean** | Whether this input must be supplied. |  [optional] |
| **fallbackToUser** | **Boolean** | Whether the virtual agent should ask the user for this input value when it is not available from the configured source. |  [optional] |
| **mapping** | **List&lt;Object&gt;** | Path used to extract this input from a previous tool output. Only valid when source is 'ToolOutput'. The path starts with a tool output type name, may contain only string property names or integer array indexes, and must resolve to a primitive value. |  [optional] |


## Enum: SourceEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| USER | &quot;User&quot; | 
| TOOLINPUT | &quot;ToolInput&quot; | 
| TOOLOUTPUT | &quot;ToolOutput&quot; | 
| EXTERNAL | &quot;External&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:264.0.0_
