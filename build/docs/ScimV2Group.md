---
title: ScimV2Group
---
## ScimV2Group


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The ID of the SCIM resource. Set by the service provider. \"caseExact\" is set to \"true\". \"mutability\" is set to \"readOnly\". \"returned\" is set to \"always\". |  [optional] |
| **schemas** | <!----><!---->**List&lt;String&gt;**<!----> | The list of supported schemas. |  [optional] |
| **displayName** | <!----><!---->**String**<!----> | The display name of the group. |  |
| **externalId** | <!----><!---->**String**<!----> | The external ID of the group. Set by the provisioning client. \"caseExact\" is set to \"true\". \"mutability\" is set to \"readWrite\". |  [optional] |
| **members** | <!----><!---->[**List&lt;ScimV2MemberReference&gt;**](ScimV2MemberReference.html)<!----> | The list of members in the group. |  [optional] |
| **meta** | <!----><!---->[**ScimMetadata**](ScimMetadata.html)<!----> | The metadata of the SCIM resource. |  [optional] |
{: class="table table-striped"}



