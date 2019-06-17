---
title: ScimV2CreateUser
---
## ScimV2CreateUser


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **displayName** | **String** | Display Name |  |
| **schemas** | **List&lt;String&gt;** | schemas supported |  [optional] |
| **active** | **Boolean** | Active flag |  [optional] |
| **userName** | **String** | User Name (Must be Unique) maps to PureCloud e-mail address |  |
| **password** | **String** | Password (updateOnly) |  [optional] |
| **title** | **String** | Title |  [optional] |
| **phoneNumbers** | [**List&lt;ScimPhoneNumber&gt;**](ScimPhoneNumber.html) | Phone numbers |  [optional] |
| **emails** | [**List&lt;ScimEmail&gt;**](ScimEmail.html) | Emails |  [optional] |
| **photos** | [**List&lt;Photo&gt;**](Photo.html) | Photos |  [optional] |
| **groups** | [**List&lt;ScimV2GroupReference&gt;**](ScimV2GroupReference.html) | Group References |  [optional] |
| **meta** | [**ScimMetadata**](ScimMetadata.html) | Resource SCIM meta |  [optional] |
| **urnietfparamsscimschemasextensionenterprise20User** | [**ScimV2EnterpriseUser**](ScimV2EnterpriseUser.html) |  |  [optional] |
{: class="table table-striped"}



