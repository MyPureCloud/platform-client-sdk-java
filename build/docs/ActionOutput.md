# ActionOutput


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **successSchema** | [**JsonSchemaDocument**](JsonSchemaDocument) | JSON schema that defines the transformed, successful result that will be sent back to the caller. If the 'flatten' query parameter is omitted or false, this field will be returned. Either successSchema or successSchemaFlattened will be returned, not both. |  [optional] |
| **successSchemaUri** | **String** | URI to retrieve success schema |  [optional] |
| **errorSchema** | [**JsonSchemaDocument**](JsonSchemaDocument) | JSON schema that defines the body of response when request is not successful. If the 'flatten' query parameter is omitted or false, this field will be returned. Either errorSchema or errorSchemaFlattened will be returned, not both. |  [optional] |
| **errorSchemaUri** | **String** | URI to retrieve error schema |  [optional] |
| **successSchemaFlattened** | [**FlattenedJsonSchemaDocument**](FlattenedJsonSchemaDocument) | JSON schema that defines the transformed, successful result that will be sent back to the caller. The schema is transformed based on Architect's flattened format. If the 'flatten' query parameter is supplied as true, this field will be returned. Either successSchema or successSchemaFlattened will be returned, not both. |  [optional] |
| **errorSchemaFlattened** | [**FlattenedJsonSchemaDocument**](FlattenedJsonSchemaDocument) | JSON schema that defines the body of response when request is not successful. The schema is transformed based on Architect's flattened format. If the 'flatten' query parameter is supplied as true, this field will be returned. Either errorSchema or errorSchemaFlattened will be returned, not both. |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
