---
title: ScimV2GroupReference
---
## ScimV2GroupReference


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **displayName** | **String** | Display Name |  [optional] |
| **meta** | [**ScimMetadata**](ScimMetadata.html) |  |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum) | SCIM Resource Type of member |  [optional] |
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



