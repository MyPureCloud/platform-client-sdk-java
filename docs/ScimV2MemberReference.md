# ScimV2MemberReference


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The type of SCIM resource. |  [optional] |
| **value** | **String** | The ID of the group member. Can be \"userId\" or \"groupId\". |  [optional] |
| **ref** | **String** | The reference URI of the SCIM resource. |  [optional] |
{: class="table table-striped"}


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| USER | &quot;User&quot; | 
| GROUP | &quot;Group&quot; | 
| SERVICEPROVIDERCONFIG | &quot;ServiceProviderConfig&quot; | 
| RESOURCETYPE | &quot;ResourceType&quot; | 
| SCHEMA | &quot;Schema&quot; | 
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:208.0.0_
