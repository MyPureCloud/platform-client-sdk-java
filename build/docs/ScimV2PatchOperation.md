# ScimV2PatchOperation


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **op** | [**OpEnum**](#Enum--OpEnum) | The PATCH operation to perform. |  |
| **path** | **String** | The attribute path that describes the target of the operation. Required for a \"remove\" operation. |  [optional] |
| **value** | [**JsonNode**](JsonNode) | The value to set in the path. |  [optional] |


## Enum: OpEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ADD | &quot;add&quot; | 
| REPLACE | &quot;replace&quot; | 
| REMOVE | &quot;remove&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:223.1.0_
