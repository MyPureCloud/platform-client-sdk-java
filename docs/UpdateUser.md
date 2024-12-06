# UpdateUser


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **chat** | [**Chat**](Chat) |  |  [optional] |
| **department** | **String** |  |  [optional] |
| **email** | **String** |  |  [optional] |
| **primaryContactInfo** | [**List&lt;Contact&gt;**](Contact) | The address(s) used for primary contact. Updates to the corresponding address in the addresses list will be reflected here. |  [optional] |
| **addresses** | [**List&lt;Contact&gt;**](Contact) | Email address, phone number, and/or extension for this user. One entry is allowed per media type |  [optional] |
| **title** | **String** |  |  [optional] |
| **username** | **String** |  |  [optional] |
| **preferredName** | **String** | Preferred full name of agent |  [optional] |
| **manager** | **String** |  |  [optional] |
| **images** | [**List&lt;Image&gt;**](Image) |  |  [optional] |
| **version** | **Integer** | This value should be the current version of the user. The current version can be obtained with a GET on the user before doing a PATCH. |  |
| **profileSkills** | **List&lt;String&gt;** | Profile skills possessed by the user |  [optional] |
| **locations** | [**List&lt;Location&gt;**](Location) | The user placement at each site location. |  [optional] |
| **groups** | [**List&lt;Group&gt;**](Group) | The groups the user is a member of |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) | The state of the user. This property can be used to restore a deleted user or transition between active and inactive. If specified, it is the only modifiable field. |  [optional] |
| **acdAutoAnswer** | **Boolean** | The value that denotes if acdAutoAnswer is set on the user |  [optional] |
| **certifications** | **List&lt;String&gt;** |  |  [optional] |
| **biography** | [**Biography**](Biography) |  |  [optional] |
| **employerInfo** | [**EmployerInfo**](EmployerInfo) |  |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACTIVE | &quot;active&quot; | 
| INACTIVE | &quot;inactive&quot; | 
| DELETED | &quot;deleted&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:215.0.0_
