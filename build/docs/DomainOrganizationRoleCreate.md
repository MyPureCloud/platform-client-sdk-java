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
| **baseLicense** | **String** |  |  [optional] |
| **addonLicenses** | **List&lt;String&gt;** |  |  [optional] |
| **dateLicenseLastUpdated** | [**Date**](Date) | The time that this role licenses were most recently updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **base** | **Boolean** |  |  [optional] |
| **_default** | **Boolean** |  |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:237.0.0_
