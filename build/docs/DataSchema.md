---
title: DataSchema
---
## DataSchema


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **version** | **Integer** | The schema&#39;s version, a positive integer. Required for updates. |  |
| **appliesTo** | **List&lt;String&gt;** | One of \&quot;CONTACT\&quot; or \&quot;EXTERNAL_ORGANIZATION\&quot;.  Indicates the built-in entity type to which this schema applies. |  [optional] |
| **enabled** | **Boolean** | The schema&#39;s current enabled/disabled status. A disabled schema cannot be assigned to any other entities, but the data on those entities from the schema still exists |  [optional] |
| **createdBy** | [**DomainEntityRef**](DomainEntityRef.html) | The URI of the user that created this schema. |  [optional] |
| **dateCreated** | [**Date**](Date.html) | The date and time this schema was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **jsonSchema** | [**JsonSchemaDocument**](JsonSchemaDocument.html) | A JSON schema defining the extension to the built-in entity type. |  |
| **selfUri** | **String** | The URI for this object |  [optional] |
{: class="table table-striped"}



