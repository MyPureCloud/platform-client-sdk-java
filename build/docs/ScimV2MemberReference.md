---
title: ScimV2MemberReference
---
## ScimV2MemberReference


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum) | The SCIM resource type. Can be user or group. |  [optional] |
| **value** | **String** | The ID of the group member. Can be userId or groupId. |  [optional] |
| **ref** | **String** | The reference URI of the SCIM resource. |  [optional] |
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



