# Share


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **sharedEntityType** | [**SharedEntityTypeEnum**](#Enum--SharedEntityTypeEnum) |  |  [optional] |
| **sharedEntity** | [**DomainEntityRef**](DomainEntityRef) |  |  [optional] |
| **memberType** | [**MemberTypeEnum**](#Enum--MemberTypeEnum) |  |  [optional] |
| **member** | [**DomainEntityRef**](DomainEntityRef) |  |  [optional] |
| **sharedBy** | [**DomainEntityRef**](DomainEntityRef) |  |  [optional] |
| **workspace** | [**DomainEntityRef**](DomainEntityRef) |  |  [optional] |
| **user** | [**User**](User) |  |  [optional] |
| **group** | [**Group**](Group) |  |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
{: class="table table-striped"}


## Enum: SharedEntityTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DOCUMENT | &quot;DOCUMENT&quot; | 
{: class="table table-striped"}


## Enum: MemberTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| USER | &quot;USER&quot; | 
| GROUP | &quot;GROUP&quot; | 
| PUBLIC | &quot;PUBLIC&quot; | 
{: class="table table-striped"}



