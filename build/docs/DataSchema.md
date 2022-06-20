---
title: DataSchema
---
## DataSchema


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the schema.  Only required if a schema is used for custom fields during external entity creation or updates. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **version** | <!----><!---->**Integer**<!----> | The schema's version, a positive integer. Required for updates. |  |
| **appliesTo** | <!---->[**List&lt;AppliesToEnum&gt;**](#AppliesToEnum)<!----> | One of \"CONTACT\" or \"EXTERNAL_ORGANIZATION\".  Indicates the built-in entity type to which this schema applies. |  [optional] |
| **enabled** | <!----><!---->**Boolean**<!----> | The schema's enabled/disabled status. A disabled schema cannot be assigned to any other entities, but the data on those entities from the schema still exists. |  [optional] |
| **createdBy** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | The URI of the user that created this schema. |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | The date and time this schema was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **jsonSchema** | <!----><!---->[**JsonSchemaDocument**](JsonSchemaDocument.html)<!----> | A JSON schema defining the extension to the built-in entity type. |  |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="AppliesToEnum"></a>

## Enum: AppliesToEnum

| Name | Value |
| ---- | ----- |
| CONTACT | &quot;CONTACT&quot; |
| EXTERNAL_ORGANIZATION | &quot;EXTERNAL_ORGANIZATION&quot; |
| OPEN_ACTION | &quot;OPEN_ACTION&quot; |
| WORKITEM | &quot;WORKITEM&quot; |
{: class="table table-striped"}



