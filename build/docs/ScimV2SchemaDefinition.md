---
title: ScimV2SchemaDefinition
---
## ScimV2SchemaDefinition


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The ID of the SCIM resource. Set by the service provider. \"caseExact\" is set to \"true\". \"mutability\" is set to \"readOnly\". \"returned\" is set to \"always\". |  [optional] |
| **name** | <!----><!---->**String**<!----> | The name of the schema. |  [optional] |
| **description** | <!----><!---->**String**<!----> | The description of the schema. |  [optional] |
| **attributes** | <!----><!---->[**List&lt;ScimV2SchemaAttribute&gt;**](ScimV2SchemaAttribute.html)<!----> | The list of service provider attributes. |  [optional] |
| **meta** | <!----><!---->[**ScimMetadata**](ScimMetadata.html)<!----> | The metadata of the SCIM resource. Only \"location\" and \"resourceType\" are set for \"Schema\" resources. |  [optional] |
{: class="table table-striped"}



