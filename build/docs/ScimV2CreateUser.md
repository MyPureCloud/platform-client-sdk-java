---
title: ScimV2CreateUser
---
## ScimV2CreateUser


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **schemas** | **List&lt;String&gt;** | The list of supported schemas. |  [optional] |
| **active** | **Boolean** | Indicates whether the user&#39;s administrative status is active. |  [optional] |
| **userName** | **String** | The user&#39;s PureCloud email address. Must be unique. |  |
| **displayName** | **String** | The display name for the user. |  |
| **password** | **String** | A new password for a PureCloud user. Does not return an existing password. |  [optional] |
| **title** | **String** | The user&#39;s title. |  [optional] |
| **phoneNumbers** | [**List&lt;ScimPhoneNumber&gt;**](ScimPhoneNumber.html) | A list of the user&#39;s phone numbers. |  [optional] |
| **emails** | [**List&lt;ScimEmail&gt;**](ScimEmail.html) | A list of the user&#39;s email addresses. |  [optional] |
| **photos** | [**List&lt;Photo&gt;**](Photo.html) | A list of the user&#39;s photos. |  [optional] |
| **externalId** | **String** | The external ID of the user. Set by the provisioning client. caseExact is set to true. mutability is set to readWrite. |  [optional] |
| **groups** | [**List&lt;ScimV2GroupReference&gt;**](ScimV2GroupReference.html) | A list of groups that the user is a member of. |  [optional] |
| **roles** | **List&lt;String&gt;** | A list of roles assigned to the user. |  [optional] |
| **urnietfparamsscimschemasextensionenterprise20User** | [**ScimV2EnterpriseUser**](ScimV2EnterpriseUser.html) |  |  [optional] |
{: class="table table-striped"}



