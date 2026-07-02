# JourneyJsonSchemaDocument


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **schema** | **String** | The JSON Schema specification link. The only value currently supported is \"http://json-schema.org/draft-04/schema#\". |  |
| **title** | **String** | The title of the schema. Must be unique across all enabled External Event schemas. |  |
| **description** | **String** | The schema description. |  [optional] |
| **required** | **List&lt;String&gt;** | The list of required schema properties. All fields are optional unless listed. Optional fields can't be changed to required after the schema is saved. |  [optional] |
| **properties** | **Map&lt;String, Object&gt;** | The map of schema properties and their limits. |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:257.1.0_
