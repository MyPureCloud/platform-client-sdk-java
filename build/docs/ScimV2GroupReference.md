---
title: ScimV2GroupReference
---
## ScimV2GroupReference


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **meta** | [**ScimMetadata**](ScimMetadata.html) | Resource SCIM meta |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum) | SCIM Resource Type of member |  [optional] |
| **value** | **String** | The ID of the group member. Can be userId or groupId. |  [optional] |
| **ref** | **String** | Ref to entity |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| USER | &quot;User&quot; |
| GROUP | &quot;Group&quot; |
| SERVICEPROVIDERCONFIG | &quot;ServiceProviderConfig&quot; |
{: class="table table-striped"}



