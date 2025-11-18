# GroupUpdate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The group name. |  [optional] |
| **description** | **String** |  |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) | State of the group. |  [optional] |
| **version** | **Integer** | Current version for this resource. |  |
| **images** | [**List&lt;Image&gt;**](Image) |  |  [optional] |
| **addresses** | [**List&lt;GroupContact&gt;**](GroupContact) |  |  [optional] |
| **rulesVisible** | **Boolean** | Are membership rules visible to the person requesting to view the group |  [optional] |
| **visibility** | [**VisibilityEnum**](#Enum--VisibilityEnum) | Who can view this group |  [optional] |
| **rolesEnabled** | **Boolean** | Allow roles to be assigned to this group |  [optional] |
| **includeOwners** | **Boolean** | Allow owners to be included as members of the group |  [optional] |
| **callsEnabled** | **Boolean** | Allow calls to be placed to this group. |  [optional] |
| **ownerIds** | **List&lt;String&gt;** | Owners of the group |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACTIVE | &quot;active&quot; | 
| INACTIVE | &quot;inactive&quot; | 
| DELETED | &quot;deleted&quot; | 


## Enum: VisibilityEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PUBLIC | &quot;public&quot; | 
| OWNERIDS | &quot;ownerIds&quot; | 
| MEMBERS | &quot;members&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:237.0.0_
