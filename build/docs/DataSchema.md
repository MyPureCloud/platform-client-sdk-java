---
title: DataSchema
---
## DataSchema


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **version** | **Integer** | The schema&#39;s version. Required for updates. |  |
| **appliesTo** | **List&lt;String&gt;** | The PureCloud data this schema extends. |  [optional] |
| **enabled** | **Boolean** | The schema&#39;s current enabled/disabled status. A disabled schema cannot be assigned to any other objects, but the data on those objects from the schemas still exists |  [optional] |
| **deleted** | **Boolean** | The schema&#39;s deleted status. A deleted schema can not be used by any records or updated. All records using a deleted schema will eventually have their schema-based data removed. |  [optional] |
| **createdBy** | [**UriReference**](UriReference.html) | The user that created this schema. |  [optional] |
| **dateCreated** | [**Date**](Date.html) | The date and time this schema was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **jsonSchema** | [**JsonSchemaDocument**](JsonSchemaDocument.html) | The JSON schema defining the data extension. |  |
| **selfUri** | **String** | The URI for this object |  [optional] |
{: class="table table-striped"}



