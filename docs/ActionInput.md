# ActionInput


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **inputSchema** | [**JsonSchemaDocument**](JsonSchemaDocument) | JSON Schema that defines the body of the request that the client (edge/architect/postman) is sending to the service, on the /execute path. If the 'flatten' query parameter is omitted or false, this field will be returned. Either inputSchema or inputSchemaFlattened will be returned, not both. |  [optional] |
| **inputSchemaFlattened** | [**JsonSchemaDocument**](JsonSchemaDocument) | JSON Schema that defines the body of the request that the client (edge/architect/postman) is sending to the service, on the /execute path. The schema is transformed based on Architect's flattened format. If the 'flatten' query parameter is supplied as true, this field will be returned. Either inputSchema or inputSchemaFlattened will be returned, not both. |  [optional] |
| **inputSchemaUri** | **String** | The URI of the input schema |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:217.0.0_
