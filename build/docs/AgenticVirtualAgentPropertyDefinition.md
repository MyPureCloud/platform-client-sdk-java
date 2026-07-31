# AgenticVirtualAgentPropertyDefinition


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | Property name. |  |
| **type** | **String** | Property type name. The valid type depends on the containing type and related fields. |  |
| **required** | **Boolean** | Whether this property must be supplied. |  [optional] |
| **description** | **String** | Additional context that helps the virtual agent understand what this property means. |  [optional] |
| **items** | **String** | Type of items in this array property. Applies when type is array. |  [optional] |
| **mapping** | **List&lt;Object&gt;** | Path used to extract this output data property from a tool output. Only valid for output data properties. The path starts with a tool output type name, may contain only string property names or integer array indexes, and must resolve to a primitive value. |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:259.0.0_
