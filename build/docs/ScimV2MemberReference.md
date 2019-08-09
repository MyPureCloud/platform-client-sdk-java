---
title: ScimV2MemberReference
---
## ScimV2MemberReference


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum) | SCIM Resource Type of member |  [optional] |
| **meta** | [**ScimMetadata**](ScimMetadata.html) | Resource SCIM meta |  [optional] |
| **value** | **String** | Value of ID of group member. May be User or Group id |  [optional] |
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



