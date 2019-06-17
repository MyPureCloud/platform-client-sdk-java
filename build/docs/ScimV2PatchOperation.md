---
title: ScimV2PatchOperation
---
## ScimV2PatchOperation


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **op** | [**OpEnum**](#OpEnum) | Patch operation |  |
| **path** | **String** | Attribute path describing the target of the operation.  Required for &#39;remove&#39; operation. |  [optional] |
| **value** | [**JsonNode**](JsonNode.html) | Value to set in the specified path |  [optional] |
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



