# BusinessRulesSchemaUpdateRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **version** | **Integer** | The schema's version, a positive integer. Required for updates. |  |
| **enabled** | **Boolean** | The schema's enabled/disabled status. A disabled schema cannot be assigned to any other entities, but the data on those entities from the schema still exists. |  [optional] |
| **jsonSchema** | [**JsonSchemaWithDefinitions**](JsonSchemaWithDefinitions) | A JSON schema defining the extension to the built-in entity type. |  |




_com.mypurecloud.sdk.v2:platform-client-v2:236.0.0_
