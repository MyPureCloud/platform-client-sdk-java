---
title: ScimV2Group
---
## ScimV2Group


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The ID of the SCIM resource. Set by the service provider. caseExact is set to true. Mutability is set to readOnly. Returned is set to always. |  [optional] |
| **schemas** | **List&lt;String&gt;** | The list of supported schemas. |  [optional] |
| **displayName** | **String** | The display name for the group. |  [optional] |
| **members** | [**List&lt;ScimV2MemberReference&gt;**](ScimV2MemberReference.html) | A list of members in a SCIM group. |  [optional] |
| **meta** | [**ScimMetadata**](ScimMetadata.html) | Resource SCIM meta |  [optional] |
{: class="table table-striped"}



