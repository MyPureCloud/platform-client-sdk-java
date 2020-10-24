---
title: ScimV2SchemaDefinition
---
## ScimV2SchemaDefinition


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The ID of the SCIM resource. Set by the service provider. \&quot;caseExact\&quot; is set to \&quot;true\&quot;. \&quot;mutability\&quot; is set to \&quot;readOnly\&quot;. \&quot;returned\&quot; is set to \&quot;always\&quot;. |  [optional] |
| **name** | <!----><!---->**String**<!----> | The name of the schema. |  [optional] |
| **description** | <!----><!---->**String**<!----> | The description of the schema. |  [optional] |
| **attributes** | <!----><!---->[**List&lt;ScimV2SchemaAttribute&gt;**](ScimV2SchemaAttribute.html)<!----> | The list of service provider attributes. |  [optional] |
| **meta** | <!----><!---->[**ScimMetadata**](ScimMetadata.html)<!----> | The metadata of the SCIM resource. Only \&quot;location\&quot; and \&quot;resourceType\&quot; are set for \&quot;Schema\&quot; resources. |  [optional] |
{: class="table table-striped"}



