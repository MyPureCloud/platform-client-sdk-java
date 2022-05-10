---
title: DomainOrganizationRole
---
## DomainOrganizationRole


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **description** | <!----><!---->**String**<!----> |  |  [optional] |
| **defaultRoleId** | <!----><!---->**String**<!----> |  |  [optional] |
| **permissions** | <!----><!---->**List&lt;String&gt;**<!----> |  |  [optional] |
| **unusedPermissions** | <!----><!---->**List&lt;String&gt;**<!----> | A collection of the permissions the role is not using |  [optional] |
| **permissionPolicies** | <!----><!---->[**List&lt;DomainPermissionPolicy&gt;**](DomainPermissionPolicy.html)<!----> |  |  [optional] |
| **userCount** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **roleNeedsUpdate** | <!----><!---->**Boolean**<!----> | Optional unless patch operation. |  [optional] |
| **base** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **_default** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}



