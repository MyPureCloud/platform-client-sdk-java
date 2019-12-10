---
title: ScimV2User
---
## ScimV2User


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The ID of the SCIM resource. Set by the service provider. \&quot;caseExact\&quot; is set to \&quot;true\&quot;. \&quot;Mutability\&quot; is set to \&quot;readOnly\&quot;. \&quot;Returned\&quot; is set to \&quot;always\&quot;. |  [optional] |
| **schemas** | <!----><!---->**List&lt;String&gt;**<!----> | The list of supported schemas. |  [optional] |
| **active** | <!----><!---->**Boolean**<!----> | Indicates whether the user&#39;s administrative status is active. |  [optional] |
| **userName** | <!----><!---->**String**<!----> | The user&#39;s PureCloud email address. Must be unique. |  [optional] |
| **displayName** | <!----><!---->**String**<!----> | The display name of the user. |  [optional] |
| **password** | <!----><!---->**String**<!----> | The new password for the PureCloud user. Does not return an existing password. |  [optional] |
| **title** | <!----><!---->**String**<!----> | The user&#39;s title. |  [optional] |
| **phoneNumbers** | <!----><!---->[**List&lt;ScimPhoneNumber&gt;**](ScimPhoneNumber.html)<!----> | The list of the user&#39;s phone numbers. |  [optional] |
| **emails** | <!----><!---->[**List&lt;ScimEmail&gt;**](ScimEmail.html)<!----> | The list of the user&#39;s email addresses. |  [optional] |
| **photos** | <!----><!---->[**List&lt;Photo&gt;**](Photo.html)<!----> | The list of the user&#39;s photos. |  [optional] |
| **externalId** | <!----><!---->**String**<!----> | The external ID of the user. Set by the provisioning client. \&quot;caseExact\&quot; is set to \&quot;true\&quot;. \&quot;mutability\&quot; is set to \&quot;readWrite\&quot;. |  [optional] |
| **groups** | <!----><!---->[**List&lt;ScimV2GroupReference&gt;**](ScimV2GroupReference.html)<!----> | The list of groups that the user is a member of. |  [optional] |
| **roles** | <!----><!---->**List&lt;String&gt;**<!----> | The list of roles assigned to the user. |  [optional] |
| **urnietfparamsscimschemasextensionenterprise20User** | <!----><!---->[**ScimV2EnterpriseUser**](ScimV2EnterpriseUser.html)<!----> | The URI of the schema for the enterprise user. |  [optional] |
| **meta** | <!----><!---->[**ScimMetadata**](ScimMetadata.html)<!----> | The metadata of the SCIM resource. |  [optional] |
{: class="table table-striped"}



