# DomainOrganizationRoleCreate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | role id |  [optional] |
| **name** | **String** | The role name |  |
| **description** | **String** |  |  [optional] |
| **defaultRoleId** | **String** |  |  [optional] |
| **permissions** | **List&lt;String&gt;** |  |  [optional] |
| **unusedPermissions** | **List&lt;String&gt;** | A collection of the permissions the role is not using |  [optional] |
| **permissionPolicies** | [**List&lt;DomainPermissionPolicy&gt;**](DomainPermissionPolicy) |  |  [optional] |
| **userCount** | **Integer** |  |  [optional] |
| **roleNeedsUpdate** | **Boolean** | Optional unless patch operation. |  [optional] |
| **base** | **Boolean** |  |  [optional] |
| **_default** | **Boolean** |  |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
