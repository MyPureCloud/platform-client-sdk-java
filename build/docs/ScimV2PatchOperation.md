---
title: ScimV2PatchOperation
---
## ScimV2PatchOperation


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **op** | [**OpEnum**](#OpEnum)<!----> | The PATCH operation to perform. |  |
| **path** | <!----><!---->**String**<!----> | The attribute path that describes the target of the operation. Required for a \"remove\" operation. |  [optional] |
| **value** | <!----><!---->[**JsonNode**](JsonNode.html)<!----> | The value to set in the path. |  [optional] |
{: class="table table-striped"}


<a name="OpEnum"></a>

## Enum: OpEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ADD | &quot;add&quot; | 
| REPLACE | &quot;replace&quot; | 
| REMOVE | &quot;remove&quot; | 
{: class="table table-striped"}



