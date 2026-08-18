# ConversationJsonSchemaRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **schema** | **String** | The JSON Schema specification link. The only value currently supported is \"http://json-schema.org/draft-04/schema#\". |  |
| **title** | **String** | The title of the schema. Must be unique across all enabled Custom Attributes schemas. |  |
| **description** | **String** | The schema description. |  [optional] |
| **required** | **List&lt;String&gt;** | The list of required schema properties. All fields are optional unless listed. New fields added after initial schema creation must be optional before being able to update to required. |  [optional] |
| **properties** | **Map&lt;String, Object&gt;** | The map of schema properties and their limits. |  |




_com.mypurecloud.sdk.v2:platform-client-v2:260.0.0_
