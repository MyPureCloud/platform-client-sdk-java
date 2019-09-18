---
title: ScimConfigResourceType
---
## ScimConfigResourceType


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The ID of the SCIM resource. Set by the service provider. caseExact is set to true. Mutability is set to readOnly. Returned is set to always. |  [optional] |
| **schemas** | **List&lt;String&gt;** | schemas supported |  [optional] |
| **name** | **String** | Resource name. |  [optional] |
| **description** | **String** | Resource description. |  [optional] |
| **schema** | **String** | The resource type&#39;s primary/base schema URI. |  [optional] |
| **schemaExtensions** | [**List&lt;ScimConfigResourceTypeSchemaExtension&gt;**](ScimConfigResourceTypeSchemaExtension.html) | Resource extension schemas |  [optional] |
| **endpoint** | **String** | Resource HTTP endpoint. |  [optional] |
| **meta** | [**ScimMetadata**](ScimMetadata.html) | Resource SCIM meta |  [optional] |
{: class="table table-striped"}



