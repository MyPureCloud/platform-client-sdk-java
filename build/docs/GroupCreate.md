# GroupCreate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The group name. |  |
| **description** | **String** |  |  [optional] |
| **dateModified** | [**Date**](Date) | Last modified date/time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **memberCount** | **Long** | Number of members. |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) | Active, inactive, or deleted state. |  [optional] |
| **version** | **Integer** | Current version for this resource. |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | Type of group. |  |
| **images** | [**List&lt;Image&gt;**](Image) |  |  [optional] |
| **addresses** | [**List&lt;GroupContact&gt;**](GroupContact) |  |  [optional] |
| **rulesVisible** | **Boolean** | Are membership rules visible to the person requesting to view the group |  |
| **visibility** | [**VisibilityEnum**](#Enum--VisibilityEnum) | Who can view this group |  |
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


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| OFFICIAL | &quot;official&quot; | 
| SOCIAL | &quot;social&quot; | 


## Enum: VisibilityEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PUBLIC | &quot;public&quot; | 
| OWNERS | &quot;owners&quot; | 
| MEMBERS | &quot;members&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:221.0.0_
