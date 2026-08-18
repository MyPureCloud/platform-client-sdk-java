# ArchitectJobMessageDetail


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The kind of information carried by this entry, which determines which of the other properties are set. |  [optional] |
| **url** | **String** | The URL of the request. |  [optional] |
| **method** | **String** | The HTTP method of the request. |  [optional] |
| **requestBody** | **String** | The body of the request, reported as sent and without redaction. Omitted when the request had no body, so it is absent for ordinary GET lookups and present for calls such as POST searches. Truncated to 4096 characters with a `...<truncated N chars>` suffix when longer. |  [optional] |
| **statusCode** | **Integer** | The HTTP status code of the response. Set only when a response was received, and never alongside errorCode. |  [optional] |
| **statusMessage** | **String** | The HTTP status message of the response. Set only when a response was received, and never alongside errorMessage. |  [optional] |
| **correlationId** | **String** | The Genesys Cloud correlation id of the response, to quote when escalating to Genesys Cloud support. Set only when a response was received. |  [optional] |
| **responseBody** | **String** | The body of the response, reported as received and without redaction. Because entries are captured for requests that succeeded as well, this can carry data returned by a lookup that was unrelated to the failure. Omitted when the response had no body. Truncated to 4096 characters with a `...<truncated N chars>` suffix when longer. |  [optional] |
| **errorCode** | **String** | The transport error code, such as ECONNRESET. Set only when the request failed before any HTTP response was received, and never alongside statusCode. |  [optional] |
| **errorMessage** | **String** | The transport error message. Set only when the request failed before any HTTP response was received, and never alongside statusMessage. |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NETWORKDIAGNOSTIC | &quot;NetworkDiagnostic&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:260.0.0_
