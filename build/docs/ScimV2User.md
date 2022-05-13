---
title: ScimV2User
---
## ScimV2User


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The ID of the SCIM resource. Set by the service provider. \"caseExact\" is set to \"true\". \"mutability\" is set to \"readOnly\". \"returned\" is set to \"always\". |  [optional] |
| **schemas** | <!----><!---->**List&lt;String&gt;**<!----> | The list of supported schemas. |  [optional] |
| **active** | <!----><!---->**Boolean**<!----> | Indicates whether the user's administrative status is active. |  [optional] |
| **userName** | <!----><!---->**String**<!----> | The user's Genesys Cloud email address. Must be unique. |  [optional] |
| **displayName** | <!----><!---->**String**<!----> | The display name of the user. |  [optional] |
| **password** | <!----><!---->**String**<!----> | The new password for the Genesys Cloud user. Does not return an existing password. When creating a user, if a password is not supplied, then a password will be randomly generated that is 40 characters in length and contains five characters from each of the password policy groups. |  [optional] |
| **title** | <!----><!---->**String**<!----> | The user's title. |  [optional] |
| **phoneNumbers** | <!----><!---->[**List&lt;ScimPhoneNumber&gt;**](ScimPhoneNumber.html)<!----> | The list of the user's phone numbers. |  [optional] |
| **emails** | <!----><!---->[**List&lt;ScimEmail&gt;**](ScimEmail.html)<!----> | The list of the user's email addresses. |  [optional] |
| **externalId** | <!----><!---->**String**<!----> | The external ID of the user. Set by the provisioning client. \"caseExact\" is set to \"true\". \"mutability\" is set to \"readWrite\". |  [optional] |
| **groups** | <!----><!---->[**List&lt;ScimV2GroupReference&gt;**](ScimV2GroupReference.html)<!----> | The list of groups that the user is a member of. |  [optional] |
| **roles** | <!----><!---->[**List&lt;ScimUserRole&gt;**](ScimUserRole.html)<!----> | The list of roles assigned to the user. |  [optional] |
| **urnietfparamsscimschemasextensionenterprise20User** | <!----><!---->[**ScimV2EnterpriseUser**](ScimV2EnterpriseUser.html)<!----> | The URI of the schema for the enterprise user. |  [optional] |
| **urnietfparamsscimschemasextensiongenesyspurecloud20User** | <!----><!---->[**ScimUserExtensions**](ScimUserExtensions.html)<!----> | The URI of the schema for the Genesys Cloud user. |  [optional] |
| **meta** | <!----><!---->[**ScimMetadata**](ScimMetadata.html)<!----> | The metadata of the SCIM resource. |  [optional] |
{: class="table table-striped"}



