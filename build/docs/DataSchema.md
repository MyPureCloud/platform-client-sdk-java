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
| **createdBy** | [**UriReference**](UriReference.html) | The user that created this schema. |  [optional] |
| **dateCreated** | [**Date**](Date.html) | The date and time this schema was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **jsonSchema** | [**JsonSchemaDocument**](JsonSchemaDocument.html) | The JSON schema defining the data extension. |  |
| **selfUri** | **String** | The URI for this object |  [optional] |
{: class="table table-striped"}



