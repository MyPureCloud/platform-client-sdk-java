# WorkspaceMember


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **workspace** | [**DomainEntityRef**](DomainEntityRef) |  |  [optional] |
| **memberType** | [**MemberTypeEnum**](#Enum--MemberTypeEnum) | The workspace member type. |  |
| **member** | [**DomainEntityRef**](DomainEntityRef) |  |  [optional] |
| **user** | [**User**](User) |  |  [optional] |
| **group** | [**Group**](Group) |  |  [optional] |
| **securityProfile** | [**SecurityProfile**](SecurityProfile) |  |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
{: class="table table-striped"}


## Enum: MemberTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| USER | &quot;USER&quot; | 
| GROUP | &quot;GROUP&quot; | 
{: class="table table-striped"}



