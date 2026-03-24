# ConversationDataSchema


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the schema. |  [optional] |
| **version** | **Integer** | The schema's version, a positive integer. |  [optional] |
| **enabled** | **Boolean** | The schema's enabled/disabled status. A disabled schema cannot be assigned to any other entities, but the data on those entities from the schema still exists. |  [optional] |
| **dateCreated** | [**Date**](Date) | The date and time this schema version was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **createdBy** | [**DomainEntityRef**](DomainEntityRef) | The URI of the user that created this schema. |  [optional] |
| **jsonSchema** | [**ConversationJsonSchemaDocument**](ConversationJsonSchemaDocument) | A JSON schema defining the extension to the built-in entity type. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:250.0.0_
