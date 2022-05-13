---
title: ScimConfigResourceType
---
## ScimConfigResourceType


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The ID of the SCIM resource. Set by the service provider. \"caseExact\" is set to \"true\". \"mutability\" is set to \"readOnly\". \"returned\" is set to \"always\". |  [optional] |
| **schemas** | <!----><!---->**List&lt;String&gt;**<!----> | The list of supported schemas. |  [optional] |
| **name** | <!----><!---->**String**<!----> | The name of the resource type. |  [optional] |
| **description** | <!----><!---->**String**<!----> | The description of the resource type. |  [optional] |
| **schema** | <!----><!---->**String**<!----> | The URI of the primary or base schema for the resource type. |  [optional] |
| **schemaExtensions** | <!----><!---->[**List&lt;ScimConfigResourceTypeSchemaExtension&gt;**](ScimConfigResourceTypeSchemaExtension.html)<!----> | The list of schema extensions for the resource type. |  [optional] |
| **endpoint** | <!----><!---->**String**<!----> | The HTTP-addressable endpoint of the resource type. Appears after the base URL. |  [optional] |
| **meta** | <!----><!---->[**ScimMetadata**](ScimMetadata.html)<!----> | The metadata of the SCIM resource. Only \"location\" and \"resourceType\" are set for \"ResourceType\" resources. |  [optional] |
{: class="table table-striped"}



